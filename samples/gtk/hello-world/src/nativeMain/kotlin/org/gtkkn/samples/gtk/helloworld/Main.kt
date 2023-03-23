package org.gtkkn.samples.gtk.helloworld

import bindings.gio.ApplicationFlags
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
    }
    app.run(0, emptyList())
}
