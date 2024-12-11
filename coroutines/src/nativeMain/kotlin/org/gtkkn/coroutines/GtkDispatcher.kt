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

package org.gtkkn.coroutines

import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Delay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.MainCoroutineDispatcher
import kotlinx.coroutines.Runnable
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.bindings.glib.MainContext
import org.gtkkn.bindings.glib.Source
import org.gtkkn.native.glib.G_PRIORITY_HIGH_IDLE
import kotlin.coroutines.CoroutineContext

/**
 * Provides a dispatcher for GTK's main loop.
 *
 * Work dispatched via this dispatcher is guaranteed to be executed on GTK's main/UI thread.
 *
 * **Note:** To use `Dispatchers.Main` with GTK, you need to inject `GtkDispatcher` as the main dispatcher.
 * This can be done using internal APIs:
 *
 * ```kotlin
 * @Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
 * Dispatchers.setMain(GtkDispatcher)
 * ```
 *
 * A feature request for a stable API to set the main dispatcher is being tracked here:
 * [Kotlin Coroutines Issue #4286](https://github.com/Kotlin/kotlinx.coroutines/issues/4286).
 *
 * ## Bootstrapping Example
 *
 * When starting a GTK application, you need to initialize the GTK environment on a dedicated thread and set up
 * the main dispatcher. Here's a simplified example:
 *
 * ```kotlin
 * fun main() = runBlocking {
 *     // Bootstrap GTK on a dedicated thread
 *     val gtkMainThread = newSingleThreadContext("GTK-Main")
 *
 *     // Inject GtkDispatcher as the Main dispatcher
 *     @Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")
 *     Dispatchers.setMain(GtkDispatcher)
 *
 *     // Start the GTK application
 *     withContext(gtkMainThread) {
 *         // Initialize GTK application and start the main loop
 *         val application = Application("com.example.myapp", ApplicationFlags.DEFAULT_FLAGS)
 *         application.connectActivate {
 *             // Launch coroutines on the GTK main dispatcher
 *             CoroutineScope(Dispatchers.Main).launch {
 *                 // Your UI code here
 *             }
 *         }
 *         application.connectShutdown {
 *             GtkDispatcher.cancel()
 *             gtkMainThread.cancel()
 *     }
 *         application.run()
 *     }
 * }
 * ```
 *
 * In this example:
 * - We create a dedicated thread (`gtkMainThread`) for bootstrapping GTK.
 * - Inject `GtkDispatcher` as `Dispatchers.Main` to ensure coroutines use the GTK main loop.
 * - Use `withContext(gtkMainThread)` to initialize GTK on the dedicated thread.
 * - Launch coroutines using `Dispatchers.Main` for UI interactions.
 *
 * @see Dispatchers.Main
 */
public object GtkDispatcher : MainCoroutineDispatcher(), Delay {
    override val immediate: MainCoroutineDispatcher
        get() = this

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        GLib.idleAdd(
            priority = G_PRIORITY_HIGH_IDLE,
            function = {
                block.run()
                false // Remove the source after running
            },
        )
    }

    override fun scheduleResumeAfterDelay(
        timeMillis: Long,
        continuation: CancellableContinuation<Unit>,
    ) {
        val sourceId = GLib.timeoutAdd(
            priority = G_PRIORITY_HIGH_IDLE,
            interval = timeMillis.toUInt(),
            function = {
                continuation.resumeWith(Result.success(Unit))
                false
            },
        )
        continuation.invokeOnCancellation {
            Source.remove(sourceId)
        }
    }

    override fun invokeOnTimeout(
        timeMillis: Long,
        block: Runnable,
        context: CoroutineContext,
    ): DisposableHandle {
        val sourceId = GLib.timeoutAdd(
            priority = G_PRIORITY_HIGH_IDLE,
            interval = timeMillis.toUInt(),
            function = {
                block.run()
                false
            },
        )
        return DisposableHandle {
            Source.remove(sourceId)
        }
    }

    override fun isDispatchNeeded(context: CoroutineContext): Boolean =
        // Only dispatch if not already on the GTK main thread
        !MainContext.default().isOwner()

    override fun toString(): String = "GtkDispatcher"
}

/**
 * Extension property to access the GTK dispatcher via `Dispatchers.Gtk`.
 */
public val Dispatchers.Gtk: CoroutineDispatcher
    get() = GtkDispatcher
