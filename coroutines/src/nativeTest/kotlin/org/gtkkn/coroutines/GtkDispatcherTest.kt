/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Delay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.bindings.glib.MainContext
import org.gtkkn.bindings.glib.MainLoop
import org.gtkkn.native.glib.G_PRIORITY_DEFAULT
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds

class GtkDispatcherTest {
    @Test
    fun `test dispatcher dispatches on GTK thread`() = runTest {
        Dispatchers.setMain(Dispatchers.Gtk)
        val dispatcher = Dispatchers.Main
        var isOnGtkThread = false

        dispatcher.dispatch(
            EmptyCoroutineContext,
            Runnable { isOnGtkThread = MainContext.default().isOwner() },
        )

        // Process pending events in the GTK main loop
        while (MainContext.default().pending()) {
            MainContext.default().iteration(false)
        }

        assertTrue(isOnGtkThread, "The task should run on the GTK main thread.")
    }

    @Test
    fun `test delayed resume after delay`() = runTest {
        val mainLoop = MainLoop.new(null, false)
        var resumed = false

        // Launch coroutine with a delay using the GTK dispatcher
        CoroutineScope(Dispatchers.Gtk).launch {
            delay(100.milliseconds)
            resumed = true
            // Quit the main loop after the coroutine resumes
            mainLoop.quit()
        }

        // Run the GTK main loop until the coroutine completes
        mainLoop.run()

        assertTrue(resumed, "The coroutine should resume after the delay.")
    }

    @Test
    fun `test invoke on timeout cancellation`() = runTest {
        val mainLoop = MainLoop.new(null, false)
        val delay: Delay = Dispatchers.Gtk as Delay
        var executed = false

        // Set a timeout callback
        val handle = delay.invokeOnTimeout(
            100.milliseconds.inWholeMilliseconds,
            Runnable {
                executed = true
                // Quit the main loop from the timeout callback
                mainLoop.quit()
            },
            EmptyCoroutineContext,
        )

        // Cancel the timeout callback before it executes
        handle.dispose()

        // Schedule another timeout to quit the main loop after 200ms
        GLib.timeoutAdd(
            priority = G_PRIORITY_DEFAULT,
            interval = 200.milliseconds.inWholeMilliseconds.toUInt(),
        ) {
            mainLoop.quit()
            false
        }

        // Run the GTK main loop until it is explicitly quit
        mainLoop.run()

        assertFalse(executed, "The runnable should not execute after cancellation.")
    }

    @Test
    fun `test is dispatch needed`() {
        val dispatcher = GtkDispatcher
        val context = EmptyCoroutineContext

        // Simulate being on the GTK main thread
        MainContext.default().pushThreadDefault()

        val isNeeded = dispatcher.isDispatchNeeded(context)

        MainContext.default().popThreadDefault()

        assertFalse(isNeeded, "Dispatch should not be needed when already on GTK main thread.")
    }

    @Test
    fun `test launch GTK structured concurrency`() = runTest {
        val scope = CoroutineScope(Dispatchers.Default)
        var isOnGtkThread = false

        // Launch a coroutine using the GTK dispatcher
        scope.launch(Dispatchers.Gtk) {
            isOnGtkThread = MainContext.default().isOwner()
        }

        // Process pending events in the GTK main loop
        while (MainContext.default().pending()) {
            MainContext.default().iteration(false)
        }

        assertTrue(isOnGtkThread, "The coroutine should run on the GTK main thread.")
        scope.cancel()
    }
}
