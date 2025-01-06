/*
 * Copyright (c) 2025 gtk-kn
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

package org.gtkkn.integrationtests

import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.bindings.gtk.Adjustment
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.CheckButton
import org.gtkkn.bindings.gtk.Entry
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.ProgressBar
import org.gtkkn.bindings.gtk.Scale
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.extensions.glib.util.log
import org.gtkkn.extensions.glib.util.loglogger.LogcatStyleLogger
import org.gtkkn.native.glib.G_PRIORITY_DEFAULT

fun main() {
    LogcatStyleLogger.install()
    val app = Application("org.gtkkn.integrationtests", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        log("App") { "App Activate" }

        // Main window
        val window = ApplicationWindow(app).apply {
            title = "gtk-kn Integration Tests"
            setSizeRequest(800, 600)
        }

        // A vertical layout box to hold all the widgets.
        val layout = Box(Orientation.VERTICAL, 8).apply {
            marginTop = 12
            marginBottom = 12
            marginStart = 12
            marginEnd = 12
        }

        // --------------------------------------------------------------------
        // Existing widgets
        // --------------------------------------------------------------------

        // Simple button (not programmatically clicked because bindings currently don’t support it).
        val button = Button.newWithLabel("Press Me").apply {
            connectClicked {
                log("Button") { "Button pressed" }
            }
        }

        // Check button
        val checkButton = CheckButton("Check Me").apply {
            connectToggled {
                log("CheckButton") { "CheckButton toggled: active=$active" }
            }
        }

        // Text entry
        val entry = Entry().apply {
            placeholderText = "Type something…"
            connectChanged {
                log("Entry") { "Entry changed: text='$text'" }
            }
        }

        // --------------------------------------------------------------------
        // New test widgets
        // --------------------------------------------------------------------

        // Label
        val label = Label("Initial label text")

        // Scale (adjustment range: 0–100)
        val scaleAdjustment = Adjustment(
            value = 0.0,
            lower = 0.0,
            upper = 100.0,
            stepIncrement = 5.0,
            pageIncrement = 10.0,
            pageSize = 0.0,
        )
        val scale = Scale(Orientation.HORIZONTAL, scaleAdjustment).apply {
            connectValueChanged {
                log("Scale") { "Scale value changed: ${getValue()}" }
            }
        }

        // Progress bar
        val progressBar = ProgressBar().apply {
            // Just a starting fraction
            fraction = 0.0
        }

        // Add widgets to the layout in a vertical stack
        layout.append(button)
        layout.append(checkButton)
        layout.append(entry)
        layout.append(label)
        layout.append(scale)
        layout.append(progressBar)

        // Set layout as the window's child and show it
        window.child = layout
        window.present()

        // --------------------------------------------------------------------
        // Automation: quick successive actions to verify bindings
        // --------------------------------------------------------------------

        // 1) Toggle check button at ~250 ms
        GLib.timeoutAdd(G_PRIORITY_DEFAULT, 250u) {
            log("Automation") { "Toggling check button programmatically." }
            checkButton.active = true
            false
        }

        // 2) Update the entry text at ~500 ms
        GLib.timeoutAdd(G_PRIORITY_DEFAULT, 500u) {
            log("Automation") { "Updating entry text programmatically." }
            entry.text = "Hello from integration tests!"
            false
        }

        // 3) Update label text at ~750 ms
        GLib.timeoutAdd(G_PRIORITY_DEFAULT, 750u) {
            log("Automation") { "Updating label text programmatically." }
            label.label = "Label updated!"
            false
        }

        // 4) Move scale to ~75% at ~1000 ms
        GLib.timeoutAdd(G_PRIORITY_DEFAULT, 1000u) {
            log("Automation") { "Setting scale to ~75." }
            scale.setValue(75.0)
            false
        }

        // 5) Progress bar to ~50% at ~1250 ms
        GLib.timeoutAdd(G_PRIORITY_DEFAULT, 1250u) {
            log("Automation") { "Updating progress bar to 50%." }
            progressBar.fraction = 0.5
            false
        }

        // 6) Close the window at ~1500 ms
        GLib.timeoutAdd(G_PRIORITY_DEFAULT, 1500u) {
            log("Automation") { "Closing application." }
            window.close()
            false
        }
    }

    // Run the application (blocks until closed)
    app.runApplication()
}
