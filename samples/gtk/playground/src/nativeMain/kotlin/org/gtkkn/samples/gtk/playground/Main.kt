package org.gtkkn.samples.gtk.playground

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.FileIcon
import org.gtkkn.bindings.gio.Notification
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.FileDialog
import org.gtkkn.bindings.gtk.FilterListModel
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.ListItem
import org.gtkkn.bindings.gtk.ListView
import org.gtkkn.bindings.gtk.SignalListItemFactory
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.bindings.gtk.StringList
import org.gtkkn.bindings.gtk.StringObject
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gtk.gtk_file_dialog_open_finish

private val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.trace { "Hello World!" }

    val app = Application("org.gtkkn.samples.gtk.playground", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        logger.info { "Application activate" }

        val window = ApplicationWindow(app)
        window.setTitle("Hello gtk-kn")

        val listModel = StringList(listOf("item 1", "item 2", "item 3", "item 4"))

        val filterListModel = FilterListModel(listModel, null)

        val factory = SignalListItemFactory()
        factory.connectBind { o ->
            val listItem = ListItem(o.gPointer.reinterpret())

            val item = StringObject(listItem.getItem()!!.gPointer.reinterpret())

            val label = Label(item.getString())
            listItem.setChild(label)
        }
        val listView = ListView(SingleSelection(filterListModel), factory)
        window.setChild(listView)
        window.show()

        val dialog = FileDialog()
        dialog.open(window, null) { o, res, ->
            println("async ready callback")
            val result = dialog.openFinish(res)
            when {
                result.isFailure -> logger.info { "Error opening file: ${result.exceptionOrNull()!!.message}" }
                result.isSuccess -> logger.info { "Opening file: ${result.getOrThrow()!!.peekPath()}" }
            }
        }
    }
    app.run(0, emptyList())
}
