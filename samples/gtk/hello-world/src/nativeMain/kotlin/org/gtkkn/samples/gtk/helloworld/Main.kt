package org.gtkkn.samples.gtk.helloworld

import bindings.adw.AboutWindow
import bindings.gdk.Gdk
import bindings.gio.ApplicationFlags
import bindings.glib.Glib
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Button
import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level

private val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }

    val app = Application("org.gtkkn.samples.gtk.helloworld", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        logger.info { "Application activate" }

        val window = ApplicationWindow(app)
        window.setTitle("Hello gtk-kn")

        var counter = 0

        val button = Button("Click me")
        button.connectClicked {
            button.setLabel("Clicked: ${counter++}")
        }

        window.setChild(button)
        window.show()

        println("###### max value of Int: ${Int.MAX_VALUE}")
        println("###### min value of Int: ${Int.MIN_VALUE}")
        println("###### max value of UInt: ${UInt.MAX_VALUE}")
        println("###### min value of UInt: ${UInt.MIN_VALUE}")
        println("###### max value of Long: ${Long.MAX_VALUE}")
        println("###### min value of Long: ${Long.MIN_VALUE}")
        println("###### max value of ULong: ${ULong.MAX_VALUE}")
        println("###### min value of ULong: ${ULong.MIN_VALUE}")
    }
    app.run(0, emptyList())
}
