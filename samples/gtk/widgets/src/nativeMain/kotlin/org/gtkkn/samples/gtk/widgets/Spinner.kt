/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.samples.gtk.widgets

import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Grid
import org.gtkkn.bindings.gtk.PositionType
import org.gtkkn.bindings.gtk.Spinner
import org.gtkkn.bindings.gtk.ToggleButton
import org.gtkkn.extensions.gio.runApplication

fun spinner() {
    val app = Application("org.gtkkn.samples.gtk.widgets.label", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = ApplicationWindow(app).apply {
            title = "Spinner"
        }

        val spinner = Spinner()
        val toggleButton = ToggleButton(label = "Start Spinning").apply {
            hexpand = true
            active = false
        }

        toggleButton.connectToggled {
            if (toggleButton.getActive()) {
                spinner.start()
                toggleButton.setLabel("Stop Spinning")
            } else {
                spinner.stop()
                toggleButton.setLabel("Start Spinning")
            }
        }

        val grid = Grid().apply {
            attach(toggleButton, 0, 0, 1, 1)
            attachNextTo(spinner, toggleButton, PositionType.BOTTOM, 1, 2)
            rowHomogeneous = true
        }

        window.setChild(grid)
        window.show()
    }
    app.runApplication()
}
