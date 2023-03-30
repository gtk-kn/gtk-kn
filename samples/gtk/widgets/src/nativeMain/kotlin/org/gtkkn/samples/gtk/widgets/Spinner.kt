package org.gtkkn.samples.gtk.widgets

import bindings.gio.ApplicationFlags
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Grid
import bindings.gtk.PositionType
import bindings.gtk.Spinner
import bindings.gtk.ToggleButton

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
    app.run(0, emptyList())
}
