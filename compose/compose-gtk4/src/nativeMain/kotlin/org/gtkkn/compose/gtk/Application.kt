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
import org.gtkkn.compose.gtk.platform.MainUiThread
import org.gtkkn.compose.gtk.platform.loadPlatformSideEffects
import org.gtkkn.coroutines.Gtk
import org.gtkkn.extensions.glib.util.LogPriority.CRITICAL
import org.gtkkn.extensions.glib.util.LogPriority.INFO
import org.gtkkn.extensions.glib.util.asLog
import org.gtkkn.extensions.glib.util.log
import kotlin.system.exitProcess

internal const val LOG_DOMAIN = "compose-gtk4"

/**
 * Use this method to mount the composition at the certain [root]
 *
 * @param TWidget The type of widget.
 * @param root the [Widget] that will be the root of the GTK tree managed by Compose
 * @param monotonicFrameClock
 * @param content the Composable lambda that defines the composition content
 *
 * @return the instance of the [Composition]
 */
@GtkComposeInternalApi
public fun <TWidget : Widget> renderComposable(
    root: GtkContainerNode<TWidget>,
    monotonicFrameClock: MonotonicFrameClock = DefaultMonotonicFrameClock,
    content: ContentBuilder<TWidget>,
): Composition {
    log(LOG_DOMAIN, INFO) { "Bootstrapping GTK Composer" }
    GlobalSnapshotManager.ensureStarted()
    val context = monotonicFrameClock + Dispatchers.Default
    val recomposer = Recomposer(context)

    CoroutineScope(context).launch(start = CoroutineStart.UNDISPATCHED) {
        recomposer.runRecomposeAndApplyChanges()
    }

    val composition = ControlledComposition(
        applier = GtkNodeApplier(root),
        parent = recomposer,
    )
    val scope = object : ContainerScope<TWidget> {
        override val DisposableEffectScope.scopeElement: TWidget
            get() = root.widget
    }
    log(LOG_DOMAIN, INFO) { "Mounting compose tree onto $root" }
    composition.setContent @Composable {
        content(scope)
    }
    log(LOG_DOMAIN, INFO) { "Finished bootstrapping GTK Composer" }
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
): Deferred<Int> = async {
    awaitApplication(
        applicationId = applicationId,
        flags = flags,
        args = args,
        content = content,
    )
}

@Suppress("TooGenericExceptionCaught", "LongMethod")
public suspend fun awaitApplication(
    applicationId: String,
    flags: ApplicationFlags = ApplicationFlags.DEFAULT_FLAGS,
    args: List<String> = listOf(),
    content: @Composable ApplicationScope.() -> Unit
): Int = withContext(MainUiThread) {
    loadPlatformSideEffects()

    val application = Application(applicationId, flags)
    log(LOG_DOMAIN, INFO) { "Bootstrapping GTK Composer" }
    log(LOG_DOMAIN) { "Connecting activate signal" }
    application.onActivate {
        log(
            LOG_DOMAIN,
            INFO,
        ) { "Application(id=$applicationId) activated, proceeding with compose mounting" }
        CoroutineScope(Dispatchers.Gtk).launch(start = CoroutineStart.UNDISPATCHED) {
            log(LOG_DOMAIN) { "Starting GlobalSnapshotManager" }
            GlobalSnapshotManager.ensureStarted()

            val context = DefaultMonotonicFrameClock + Dispatchers.Gtk
            val recomposer = Recomposer(context)

            log(LOG_DOMAIN) { "Launching recomposer" }
            CoroutineScope(context).launch(start = CoroutineStart.UNDISPATCHED) {
                log(LOG_DOMAIN) { "Recomposing" }
                recomposer.runRecomposeAndApplyChanges()
            }

            log(LOG_DOMAIN) { "Creating composition" }
            val composition = Composition(
                applier = ApplicationApplier,
                parent = recomposer,
            )

            var isOpen by mutableStateOf(true)
            val scope = object : ApplicationScope {
                override fun exitApplication() {
                    log(LOG_DOMAIN, INFO) { "Exiting application" }
                    isOpen = false
                }
            }

            log(LOG_DOMAIN) { "Setting initial composition content" }
            try {
                composition.setContent @Composable {
                    if (isOpen) {
                        log(LOG_DOMAIN) { "Mounting compose tree onto Application(id=$applicationId)" }
                        CompositionLocalProvider(
                            LocalApplication provides application,
                        ) {
                            scope.content()
                        }
                    } else {
                        log(LOG_DOMAIN) { "Unounting compose tree from Application(id=$applicationId)" }
                    }
                }
            } catch (e: Throwable) {
                log(LOG_DOMAIN, CRITICAL) { "Composition failed" + e.asLog() }
            }

            log(LOG_DOMAIN) { "Scheduling recomposer cleanup job" }
            CoroutineScope(context).launch(start = CoroutineStart.DEFAULT) {
                try {
                    log(LOG_DOMAIN) { "Closing recomposer" }
                    recomposer.close()
                    log(LOG_DOMAIN) { "Joining recomposer" }
                    recomposer.join()
                } catch (e: Throwable) {
                    log(LOG_DOMAIN, CRITICAL) { "Closing recomposer failed" + e.asLog() }
                }
                log(LOG_DOMAIN) { "Disposing composition" }
                composition.dispose()
                log(LOG_DOMAIN, INFO) { "Recomposer closed, quitting application" }
                application.quit()
            }
            log(LOG_DOMAIN) { "Finished activating Application($applicationId)" }
        }
    }

    log(LOG_DOMAIN) { "Connecting shutdown signal" }
    application.onShutdown {
        log(LOG_DOMAIN, INFO) { "Processing GTK shutdown request" }
        log(LOG_DOMAIN) { "Cancelling MainUiDispatcher" }
        Dispatchers.Gtk.cancel()
        MainUiThread.cancel()
    }

    log(LOG_DOMAIN, INFO) { "Starting GTK Application(id=$applicationId)" }
    return@withContext application.run(args.size, args.toList()).also {
        log(LOG_DOMAIN, INFO) { "GTK Application(id=$applicationId) exited with $it" }
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
