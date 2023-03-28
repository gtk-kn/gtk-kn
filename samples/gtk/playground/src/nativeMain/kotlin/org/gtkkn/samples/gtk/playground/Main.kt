package org.gtkkn.samples.gtk.playground

import bindings.gio.ApplicationFlags
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.FilterListModel
import bindings.gtk.Label
import bindings.gtk.ListItem
import bindings.gtk.ListView
import bindings.gtk.SignalListItemFactory
import bindings.gtk.SingleSelection
import bindings.gtk.StringList
import bindings.gtk.StringObject
import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import kotlinx.cinterop.reinterpret

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
    }
    app.run(0, emptyList())
}
