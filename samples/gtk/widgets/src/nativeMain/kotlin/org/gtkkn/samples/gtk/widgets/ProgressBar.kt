package org.gtkkn.samples.gtk.widgets

import bindings.gio.ApplicationFlags
import bindings.glib.Glib
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Box
import bindings.gtk.CheckButton
import bindings.gtk.Orientation
import bindings.gtk.ProgressBar

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
