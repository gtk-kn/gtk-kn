package org.gtkkn.samples.playground

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.ListStore
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.ListItem
import org.gtkkn.bindings.gtk.ListView
import org.gtkkn.bindings.gtk.SignalListItemFactory
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.extensions.gobject.ObjectSubclassCompanion
import org.gtkkn.extensions.gobject.downcast

val logger = KotlinLogging.logger("main")
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

