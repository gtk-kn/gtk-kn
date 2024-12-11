/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.compose.gtk

import androidx.compose.runtime.Applier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ControlledComposition
import androidx.compose.runtime.DefaultMonotonicFrameClock
import androidx.compose.runtime.DisposableEffectScope
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.Recomposer
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import co.touchlab.kermit.Logger
import co.touchlab.kermit.Severity
import co.touchlab.kermit.loggerConfigInit
import co.touchlab.kermit.platformLogWriter
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKStringFromUtf8
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi
import org.gtkkn.compose.gtk.internal.GtkNodeApplier
import org.gtkkn.compose.gtk.node.ContainerScope
import org.gtkkn.compose.gtk.node.ContentBuilder
import org.gtkkn.compose.gtk.node.GtkContainerNode
import org.gtkkn.compose.gtk.platform.GlobalSnapshotManager
import org.gtkkn.compose.gtk.platform.LocalApplication
import org.gtkkn.compose.gtk.platform.LocalLogger
import org.gtkkn.compose.gtk.platform.MainUiDispatcher
import org.gtkkn.compose.gtk.platform.MainUiThread
import org.gtkkn.compose.gtk.platform.loadPlatformSideEffects
import org.gtkkn.compose.gtk.util.AnsiLogFormatter
import platform.posix.getenv
import kotlin.system.exitProcess


/**
 * Use this method to mount the composition at the certain [root]
 *
 * @param root - the [Widget] that will be the root of the GTK tree managed by Compose
 * @param content - the Composable lambda that defines the composition content
 *
 * @return the instance of the [Composition]
 */
@GtkComposeInternalApi
public fun <TWidget : Widget> renderComposable(
    root: GtkContainerNode<TWidget>,
    monotonicFrameClock: MonotonicFrameClock = DefaultMonotonicFrameClock,
    content: ContentBuilder<TWidget>,
): Composition {
    Logger.d("Bootstrapping GTK Composer")
    GlobalSnapshotManager.ensureStarted()
    val context = monotonicFrameClock + Dispatchers.Default
    val recomposer = Recomposer(context)

    CoroutineScope(context).launch(start = CoroutineStart.UNDISPATCHED) {
        recomposer.runRecomposeAndApplyChanges()
    }

    val composition = ControlledComposition(
        applier = GtkNodeApplier(root, Logger),
        parent = recomposer,
    )
    val scope = object : ContainerScope<TWidget> {
        override val DisposableEffectScope.scopeElement: TWidget
            get() = root.widget
    }
    Logger.d("Mounting compose tree onto $root")
    composition.setContent @Composable {
        content(scope)
    }
    Logger.d("Finished bootstrapping GTK Composer")
    return composition
}

/**
 * Scope used by [application], [awaitApplication], [launchApplication]
 */
@Stable
public interface ApplicationScope {
    /**
     * Close all windows created inside the application and cancel all launched effects
     * (they launch via [LaunchedEffect] adn [rememberCoroutineScope].
     */
    public fun exitApplication()
}

public fun application(
    applicationId: String,
    flags: ApplicationFlags = ApplicationFlags.DEFAULT_FLAGS,
    args: List<String> = listOf(),
    exitProcessOnExit: Boolean = true,
    content: @Composable ApplicationScope.() -> Unit
) {
    val code = runBlocking {
        awaitApplication(
            applicationId = applicationId,
            flags = flags,
            args = args,
            content = content,
        )
    }
    if (exitProcessOnExit) {
        exitProcess(code)
    }
}

public fun CoroutineScope.launchApplication(
    applicationId: String,
    flags: ApplicationFlags = ApplicationFlags.DEFAULT_FLAGS,
    args: List<String> = listOf(),
    content: @Composable ApplicationScope.() -> Unit
): Deferred<Int> {
    return async {
        awaitApplication(
            applicationId = applicationId,
            flags = flags,
            args = args,
            content = content,
        )
    }
}

@OptIn(ExperimentalForeignApi::class)
private fun buildLogger(): Logger {
    return Logger(
        loggerConfigInit(
            minSeverity = (getenv("LOG_LEVEL")?.toKStringFromUtf8() ?: "INFO").let { env ->
                env.toIntOrNull()?.let { Severity.entries[it] } ?: Severity.valueOf(
                    env.lowercase().replaceFirstChar(Char::uppercase),
                )
            },
            logWriters = arrayOf(platformLogWriter(AnsiLogFormatter)),
        ),
        "gtk-compose",
    )
}

public suspend fun awaitApplication(
    applicationId: String,
    flags: ApplicationFlags = ApplicationFlags.DEFAULT_FLAGS,
    args: List<String> = listOf(),
    content: @Composable ApplicationScope.() -> Unit
): Int = withContext(MainUiThread) {
    val logger = buildLogger()
    loadPlatformSideEffects(logger)

    val application = Application(applicationId, flags)
    logger.d("Bootstrapping GTK Composer")
    logger.v { "Connecting activate signal" }
    application.onActivate {
        logger.d { "Application(id=${applicationId}) activated, proceeding with compose mounting" }
        CoroutineScope(MainUiDispatcher).launch(start = CoroutineStart.UNDISPATCHED) {
            logger.v { "Starting GlobalSnapshotManager" }
            GlobalSnapshotManager.ensureStarted()

            val context = DefaultMonotonicFrameClock + MainUiDispatcher
            val recomposer = Recomposer(context)

            logger.v { "Launching recomposer" }
            CoroutineScope(context).launch(start = CoroutineStart.UNDISPATCHED) {
                logger.v { "Recomposing" }
                recomposer.runRecomposeAndApplyChanges()
            }

            logger.v { "Creating composition" }
            val composition = Composition(
                applier = ApplicationApplier,
                parent = recomposer,
            )

            var isOpen by mutableStateOf(true)
            val scope = object : ApplicationScope {
                override fun exitApplication() {
                    logger.d { "Exiting application" }
                    isOpen = false
                }
            }

            logger.v { "Setting initial composition content" }
            try {
                composition.setContent @Composable {
                    if (isOpen) {
                        logger.v("Mounting compose tree onto Application(id=${applicationId})")
                        CompositionLocalProvider(
                            LocalApplication provides application,
                            LocalLogger provides logger,
                        ) {
                            scope.content()
                        }
                    } else {
                        logger.v("Unounting compose tree from Application(id=${applicationId})")
                    }
                }
            } catch (e: Throwable) {
                logger.e(e) { "Composition failed" }
            }

            logger.v { "Scheduling recomposer cleanup job" }
            CoroutineScope(context).launch(start = CoroutineStart.DEFAULT) {
                try {
                    logger.v { "Closing recomposer" }
                    recomposer.close()
                    logger.v { "Joining recomposer" }
                    recomposer.join()
                } catch (e: Throwable) {
                    logger.e(e) { "Closing recomposer failed" }
                }
                logger.v { "Disposing composition" }
                composition.dispose()
                logger.d { "Recomposer closed, quitting application" }
                application.quit()
            }
            logger.v { "Finished activating Application($applicationId)" }
        }
    }

    logger.v { "Connecting shutdown signal" }
    application.onShutdown {
        logger.d { "Processing GTK shutdown request" }
        logger.v { "Cancelling MainUiDispatcher" }
        MainUiDispatcher.cancel()
        MainUiThread.cancel()
    }

    logger.d { "Starting GTK Application(id=${applicationId})" }
    return@withContext application.run(args.size, args.toList()).also {
        logger.d { "GTK Application(id=${applicationId}) exited with $it" }
        logger.v { "VERBOSE" }
        logger.d { "DEBUG" }
        logger.i { "INFO" }
        logger.w { "WARNING" }
        logger.e { "ERROR" }
        logger.a { "ASSERT" }
    }
}

private object ApplicationApplier : Applier<Unit> {
    override val current: Unit = Unit
    override fun down(node: Unit) = Unit
    override fun up() = Unit
    override fun insertTopDown(index: Int, instance: Unit) = Unit
    override fun insertBottomUp(index: Int, instance: Unit) = Unit
    override fun remove(index: Int, count: Int) = Unit
    override fun move(from: Int, to: Int, count: Int) = Unit
    override fun clear() = Unit
    override fun onEndChanges() = Unit
}
