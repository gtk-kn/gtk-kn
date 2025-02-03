/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: MIT
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

package org.gtkkn.samples.gtk.widgets

import kotlinx.cinterop.ExperimentalForeignApi
import org.gtkkn.bindings.gio.ListStore
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.ListItem
import org.gtkkn.bindings.gtk.ListView
import org.gtkkn.bindings.gtk.SignalListItemFactory
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.bindings.gtk.StringList
import org.gtkkn.bindings.gtk.StringObject
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.legacy.ObjectType
import org.gtkkn.extensions.gobject.legacy.asType

fun listViewStrings(): Widget {
    // listModel contains our list items
    val listModel = StringList(listOf("Kotlin", "C", "Vala"))

    // selection wraps the list model
    val selection = SingleSelection(listModel)

    // the item factory is used to constructor widgets for each item
    val factory = SignalListItemFactory()

    // bind signal is emitted every time a list item should be prepared for display
    factory.onBind { obj ->
        // cast the obj argument to ListItem
        val listItem = obj.asType<ListItem>()

        // get the item from our list model
        val item = listItem.item
            ?.asType<StringObject>() // cast as StringObject because we are using StringList
            ?: error("Unknown item")

        // extract the string from the StringObject
        val selectedItemString = item.string

        // create a Label widget with the string
        val label = Label(selectedItemString)

        // set label widget as the widget for this list item
        listItem.child = label
    }

    return ListView(selection, factory)
}

@ExperimentalForeignApi
fun listViewObjects(): Widget {
    // create a ListStore that contains instances of the Person class
    val listStore = ListStore(Person.gType)

    // populate the list store with items
    listStore.append(Person("Eleven", 15))
    listStore.append(Person("Mike", 15))
    listStore.append(Person("Max", 15))
    listStore.append(Person("Will", 15))
    listStore.append(Person("Nancy", 18))
    listStore.append(Person("Jonathan", 18))

    // wrap the list store in a selection
    val selection = SingleSelection(listStore)

    // the item factory is used to constructor widgets for each item
    val factory = SignalListItemFactory()

    // bind signal is emitted every time a list item should be prepared for display
    factory.onBind { obj ->
        val listItem = obj.asType<ListItem>()

        // get the item from our list model
        val person = listItem.item
            ?.asType<Person>() // cast as Person
            ?: error("Unknown person")

        // create a label widget with person details
        val label = Label("name: ${person.name}, age: ${person.age}")

        // set label widget as the widget for this list item
        listItem.child = label
    }

    return ListView(selection, factory)
}

/**
 * A Person type that extends from GObject, so we can use it in a list store.
 */
@OptIn(ExperimentalForeignApi::class)
private class Person(val name: String, val age: Int) : Object(newInstancePointer()) {
    companion object Type : ObjectType<Person>(Person::class, Object.type)
}
