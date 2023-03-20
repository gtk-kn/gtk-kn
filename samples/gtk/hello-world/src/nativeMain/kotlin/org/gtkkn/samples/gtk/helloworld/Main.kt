package org.gtkkn.samples.gtk.helloworld

import bindings.gio.ApplicationFlags
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Box
import bindings.gtk.Button
import bindings.gtk.Entry
import bindings.gtk.EntryBuffer
import bindings.gtk.Label
import bindings.gtk.Orientation
import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import native.gio.g_application_run

private val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }

    val app = Application("org.gtkkn.samples.gtk.helloworld", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        logger.info { "Application activate" }

        val window = ApplicationWindow(app)
        window.setTitle("Signals")

        var counter = 0

        val button = Button("Click me")
        button.connectClicked {
            button.setLabel("Clicked: ${counter++}")
        }

        // TODO add and test ComboBox with move-active signal

        val entryBuffer = EntryBuffer(null, 0)
        val entry = Entry(entryBuffer)

        entryBuffer.connectInsertedText { position, chars, nChars ->
            logger.info { "Inserted text at position: $position, nChars: $nChars, text: $chars" }
        }

        entry.connectHide { }

        val label = Label("")
        label.setMarkup("label with link: <a href=\"https://gtk-kn.org\">https://gtk-kn.org</a>")
        label.connectActivateLink {link ->
            logger.info { "activating link: $link" }
            true
        }

        val box = Box(Orientation.VERTICAL, 10)

        box.append(button)
        box.append(entry)
        box.append(label)

        window.setChild(box)

        window.show()
    }
    app.run()
}

fun Application.run() {
    g_application_run(gioApplicationPointer, 0, null)
}
