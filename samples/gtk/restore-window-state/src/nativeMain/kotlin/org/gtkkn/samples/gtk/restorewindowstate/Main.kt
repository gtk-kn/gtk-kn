/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.samples.gtk.restorewindowstate

import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.Settings
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.extensions.gio.runApplication

const val APP_ID = "org.gtkkn.samples.gtk.restorewindowstate"

fun main() {
    // create the application
    val app = Application(APP_ID, ApplicationFlags.FLAGS_NONE)

    // initialize the settings
    val settings = Settings(APP_ID)

    app.connectActivate {
        val window = ApplicationWindow(app)
        // load the previous window state on window startup
        window.loadWindowState(settings)

        window.connectCloseRequest {
            // save window state when the window closes
            window.saveWindowState(settings)
            false
        }

        window.child = Label("Resize window and then check it's persisted between restarts")
        // show the window
        window.show()
    }

    app.runApplication()
}

/**
 * Save the window state in the given [settings].
 */
fun ApplicationWindow.saveWindowState(settings: Settings) {
    settings.setInt("window-width", getWidth())
    settings.setInt("window-height", getHeight())
    settings.setBoolean("is-maximised", isMaximized())
}

/**
 * Load the window state from the given [settings].
 */
fun ApplicationWindow.loadWindowState(settings: Settings) {
    val width = settings.getInt("window-width")
    val height = settings.getInt("window-height")
    val maximised = settings.getBoolean("is-maximised")
    setDefaultSize(width = width, height = height)
    if (maximised) maximize()
}
