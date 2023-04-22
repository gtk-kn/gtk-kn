/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.samples.playground

import org.gtkkn.bindings.gio.ListStore
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.ListItem
import org.gtkkn.bindings.gtk.ListView
import org.gtkkn.bindings.gtk.SignalListItemFactory
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.extensions.gobject.ObjectType
import org.gtkkn.extensions.gobject.asType

fun listView() = Application {
    val listStore = ListStore(MyPerson.gType)

    listStore.append(MyPerson("Steven", 35))
    listStore.append(MyPerson("Lore", 9))
    listStore.append(MyPerson("Erika", 36))

    val factory = SignalListItemFactory()
    factory.connectBind { o ->
        val listItem: ListItem = o.asType<ListItem>()

        val person = checkNotNull(listItem.getItem()).asType<MyPerson>()

        val label = Label("${person.name} : ${person.age}")
        listItem.setChild(label)
    }
    val listView = ListView(SingleSelection(listStore), factory)
    setChild(listView)
}

class MyPerson(
    name: String,
    age: Int,
) : Object(newInstancePointer()) {

    var name by Type.name
    var age by Type.age

    init {
        this.name = name
        this.age = age
    }

    companion object Type : ObjectType<MyPerson>(MyPerson::class, Object.type) {
        val name by stringProperty()
        val age by intProperty()
    }
}
