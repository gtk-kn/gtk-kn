package org.gtkkn.samples.playground

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.extensions.gio.runApplication

val logger = KotlinLogging.logger("main")

@Suppress("FunctionName")
fun Application(builder: ApplicationWindow.() -> Unit) {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }
    val app = Application("org.gtkkn.samples.playground", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        logger.info { "Application activate" }

        val window = ApplicationWindow(app)
        window.builder()
        window.present()
    }
    app.runApplication()
}
