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

package org.gtkkn.samples.gtk.widgets

import org.gtkkn.bindings.gio.ListStore
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.ListItem
import org.gtkkn.bindings.gtk.ListView
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.SignalListItemFactory
import org.gtkkn.bindings.gtk.SingleSelection
import org.gtkkn.bindings.gtk.TreeExpander
import org.gtkkn.bindings.gtk.TreeListModel
import org.gtkkn.bindings.gtk.TreeListRow
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.ObjectType
import org.gtkkn.extensions.gobject.asType

fun treeView(): Widget {
    // create a ListStore that contains instances of Comment
    val listStore = ListStore(Comment.gType)

    // add root comments to the list store
    exampleComments.forEach { listStore.append(it) }

    // create a TreeListModel with a lambda for determining children
    val treeListModel = TreeListModel(listStore, false, true) { obj ->
        // this lambda gets called for each item and needs to return a ListModel
        // for the items children, or null if the item does not have children
        val comment = obj.asType<Comment>()

        if (comment.childComments.isNotEmpty()) {
            // create a list store for this comments children
            ListStore(Comment.gType).apply {
                comment.childComments.forEach { append(it) }
            }
        } else {
            null
        }
    }

    val selection = SingleSelection(treeListModel)
    val factory = SignalListItemFactory()

    factory.connectBind { obj ->
        // cast obj as ListItem
        val listItem = obj.asType<ListItem>()

        // extract the TreeListRow from the ListItem item
        val treeListRow = listItem.item?.asType<TreeListRow>() ?: error("Unknown TreeListRow")

        // create an expander
        val expander = TreeExpander().apply {
            indentForIcon = true
            // associate the expander to the row
            listRow = treeListRow
        }

        // extract the comment from the TreeListRow item
        val comment = treeListRow.item
            ?.asType<Comment>()
            ?: error("Unknown comment")

        // create a label with comment text
        val label = Label(comment.text).apply {
            hexpand = true
            halign = Align.START
        }

        // wrap expander and label in a box
        val box = Box(Orientation.HORIZONTAL, 10).apply {
            append(expander)
            append(label)
        }

        // set the box as the child to render
        listItem.setChild(box)
    }

    return ListView(selection, factory)
}

/**
 * Example data: a nested hierarchy of Comments.
 */
private val exampleComments = buildList {
    add(
        Comment("Comment 1"),
    )
    add(
        Comment(
            "Comment 2",
            listOf(
                Comment("First child of #2"),
                Comment("Second child of #2"),
            ),
        ),
    )
    add(
        Comment(
            "Comment 3",
            listOf(
                Comment("First child of #3"),
                Comment("Second child of #3", listOf(Comment("Nested child"))),
            ),
        ),
    )
}

/**
 * A Comment type that extends from GObject, each item has a list of child comments.
 */
private class Comment(
    val text: String,
    val childComments: List<Comment> = emptyList()
) : Object(newInstancePointer()) {
    companion object Type : ObjectType<Comment>(Comment::class, Object.type)
}
