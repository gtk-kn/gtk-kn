/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.compose.gtk4.internal

import org.gtkkn.bindings.gtk.Widget

@ComposeGtkKnInternalApi
public class GtkNodeWrapper(public val widget: Widget) {
    private val children = buildList {
        var next: Widget? = widget.getFirstChild()
        while (next != null) {
            add(next)
            next = next.getNextSibling()
        }
    }.toMutableList()

    public fun insert(index: Int, gtkNodeWrapper: GtkNodeWrapper) {
        val length = children.size
        if (index < length) {
            val before = children[index]
            gtkNodeWrapper.widget.insertBefore(widget, before)
            children.add(index, gtkNodeWrapper.widget)
        } else {
            gtkNodeWrapper.widget.insertAfter(widget, children.lastOrNull())
            children.add(gtkNodeWrapper.widget)
        }
    }

    public fun remove(index: Int, count: Int) {
        repeat(count) {
            children.removeAt(index).unparent()
        }
    }

    public fun move(from: Int, to: Int, count: Int) {
        if (from == to) {
            return // nothing to do
        }

        for (i in 0 until count) {
            // if "from" is after "to," the from index moves because we're inserting before it
            val fromIndex = if (from > to) from + i else from
            val toIndex = if (from > to) to + i else to + count - 2

            val child = children.removeAt(fromIndex)
            child.insertBefore(widget, children.getOrNull(toIndex))
            children.add(toIndex, child)
        }
    }

    public fun clear() {
        children.forEach {
//            it.unparent()
        }
        children.clear()
    }

//    private var currentListeners = emptyList<NamedEventListener>()

    public fun updateEventListeners(
//    list: List<NamedEventListener>
    ) {
//        currentListeners.forEach {
//            widget.removeEventListener(it.name, it)
//        }
//
//        currentListeners = list
//
//        currentListeners.forEach {
//            widget.addEventListener(it.name, it)
//        }
    }

    public fun updateProperties(applicators: List<Pair<(Widget, Any) -> Unit, Any>>) {
        applicators.forEach { (applicator, item) ->
            applicator(widget, item)
        }
    }

    public fun updateAttrs(
//        attrs: Map<String, String>
    ) {
//        widget.getAttributeNames().forEach { name ->
//            when (name) {
//                "style", "class" -> {
//                    // skip style and class here, they're managed in corresponding methods
//                }
//
//                else -> widget.removeAttribute(name)
//            }
//        }
//
//        attrs.forEach {
//            widget.setAttribute(it.key, it.value)
//        }
    }
}
