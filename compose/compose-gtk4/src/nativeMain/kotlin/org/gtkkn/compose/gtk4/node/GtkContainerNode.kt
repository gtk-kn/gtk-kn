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

package org.gtkkn.compose.gtk4.node

import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionContext
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk4.internal.ComposeGtkKnInternalApi
import org.gtkkn.compose.gtk4.internal.GtkNodeApplier

@ComposeGtkKnInternalApi
public typealias AnyGtkContainerNode = GtkContainerNode<Widget>

/**
 * A [GtkNode] that can have other [GtkNode]s as children
 */
@ComposeGtkKnInternalApi
public abstract class GtkContainerNode<out TWidget : Widget> : GtkNode<TWidget>() {
    private val children = mutableListOf<AnyGtkNode>()

    public abstract fun insert(index: Int, instance: AnyGtkNode)

    public abstract fun remove(index: Int, count: Int)

    public open fun move(from: Int, to: Int, count: Int) {
        if (from == to) {
            return // nothing to do
        }

        for (i in 0 until count) {
            // if "from" is after "to," the from index moves because we're inserting before it
            val fromIndex = if (from > to) from + i else from
            val toIndex = if (from > to) to + i else to + count - 2

            val child = children[fromIndex]
            remove(fromIndex, 1)
            insert(toIndex, child)
        }
    }

    public open fun clear() {
        remove(0, children.size)
    }
}

/**
 * Mounts this [GtkContainerNode] as a sub-composition of the [parentComposition]
 */
@ComposeGtkKnInternalApi
public fun <TWidget : Widget> GtkContainerNode<TWidget>.setContent(
    parentComposition: CompositionContext,
    content: ContentBuilder<TWidget>
): Composition {
    val applier = GtkNodeApplier(this)
    val scope = StaticNodeScope(this)
    val composition = Composition(applier, parentComposition)
    composition.setContent {
        scope.content()
    }
    return composition
}
