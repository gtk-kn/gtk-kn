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

package org.gtkkn.compose.gtk.node

import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi

@GtkComposeInternalApi
public typealias AnyGtkParentNode = GtkParentNode<Widget>

/**
 * A specialised [GtkContainerNode] that only has a single child
 */
@GtkComposeInternalApi
public abstract class GtkParentNode<out TWidget : Widget> : GtkContainerNode<TWidget>() {
    private var child: AnyGtkNode? = null

    public abstract fun add(child: Widget)

    public final override fun insert(index: Int, instance: AnyGtkNode) {
        if (child != null) {
            clear()
        }
        add(instance.widget)
        child = instance
    }

    public final override fun remove(index: Int, count: Int) {
        if (index == 0 && child != null) {
            clear()
            child = null
        }
    }

    public final override fun move(from: Int, to: Int, count: Int) {
        // noop
    }
}
