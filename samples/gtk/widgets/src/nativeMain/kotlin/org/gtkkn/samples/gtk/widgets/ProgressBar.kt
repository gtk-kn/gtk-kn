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
import org.gtkkn.bindings.glib.Glib
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.CheckButton
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.ProgressBar

private var activityMode: Boolean = false

fun progressBar() {
    val app = Application("org.gtkkn.samples.gtk.widgets.progressbar", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = ApplicationWindow(app).apply {
            title = "ProgressBar Demo"
        }

        val vbox = Box(orientation = Orientation.VERTICAL, spacing = 6).apply {
            marginStart = 16
            marginTop = 16
            marginEnd = 16
            marginBottom = 16
        }

        val progressBar = ProgressBar().apply {
            vexpand = true
            hexpand = true
        }
        vbox.append(progressBar)

        val showTextButton = CheckButton(label = "Show text")
        showTextButton.connectToggled { onShowTextToggled(showTextButton, progressBar) }
        vbox.append(showTextButton)

        val activityModeButton = CheckButton(label = "Activity mode")
        activityModeButton.connectToggled { onActivityModeToggled(activityModeButton, progressBar) }
        vbox.append(activityModeButton)

        val rightToLeftButton = CheckButton(label = "Right to Left")
        rightToLeftButton.connectToggled { onRightToLeftToggled(rightToLeftButton, progressBar) }
        vbox.append(rightToLeftButton)

        Glib.timeoutAddFull(0, 50.toUInt()) {
            onTimeout(progressBar)
        }

        window.setChild(vbox)
        window.show()
    }
    app.run(0, emptyList())
}

private fun onShowTextToggled(button: CheckButton, progressBar: ProgressBar) {
    val showText = button.active
    val text = if (showText) "some text" else null
    progressBar.text = text
    progressBar.showText = showText
}

private fun onActivityModeToggled(button: CheckButton, progressBar: ProgressBar) {
    activityMode = button.active
    if (activityMode) {
        progressBar.pulse()
    } else {
        progressBar.fraction = 0.0
    }
}

private fun onRightToLeftToggled(button: CheckButton, progressBar: ProgressBar) {
    progressBar.inverted = button.active
}

private fun onTimeout(progressBar: ProgressBar): Boolean {
    if (activityMode) {
        progressBar.pulse()
    } else {
        var newValue = progressBar.fraction + 0.01
        if (newValue > 1) {
            newValue = 0.0
        }
        progressBar.fraction = newValue
    }
    return true
}
