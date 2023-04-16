/*
 * Copyright (c) 2023 gtk-kt
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.samples.gtk.playground

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.FilterListModel
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.ListItem
import org.gtkkn.bindings.gtk.ListView
import org.gtkkn.bindings.gtk.SignalListItemFactory
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.bindings.gtk.StringList
import org.gtkkn.bindings.gtk.StringObject
import org.gtkkn.extensions.glib.allocateHeap
import org.gtkkn.extensions.glib.allocateScoped
import org.gtkkn.native.gobject.G_TYPE_STRING

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

        logger.info { "#### Record test" }

        /*
         * Heap allocation with use
         */
        val value1Ref = Value.allocateHeap()
        value1Ref.use { v ->
            v.init(G_TYPE_STRING)
            v.setString("Hello Value")
            val result = v.getString()
            logger.info { "Result is: $result" }
        }
        // value1Ref is automatically freed after use()

        /*
         * Heap allocation with manual free
         */
        val value2Ref = Value.allocateHeap()
        val value2 = value2Ref.get()
        value2.init(G_TYPE_STRING)
        value2.setString("Hello Value2")
        val result2 = value2.getString()
        logger.info { "Result2 is $result2" }
        // have to free manually
        value2Ref.free()

        /*
         * Allocation within MemScope
         */
        memScoped {
            val value3 = Value.allocateScoped(this)
            value3.init(G_TYPE_STRING)
            value3.setString("Hello Value3")
            val result3 = value3.getString()
            logger.info { "Result3 is $result3" }
        }
        // value3 is automatically freed after memScoped block
    }
    app.run(0, emptyList())
}
