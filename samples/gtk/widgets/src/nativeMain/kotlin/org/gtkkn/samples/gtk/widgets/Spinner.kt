package org.gtkkn.samples.gtk.widgets

import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Grid
import org.gtkkn.bindings.gtk.PositionType
import org.gtkkn.bindings.gtk.Spinner
import org.gtkkn.bindings.gtk.ToggleButton

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
