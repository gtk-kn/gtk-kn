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

package org.gtkkn.compose.gtk.foundation

import androidx.compose.runtime.Composable
import org.gtkkn.bindings.gtk.BaselinePosition
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi
import org.gtkkn.compose.gtk.node.ContentBuilder
import org.gtkkn.compose.gtk.node.GtkContainerNode
import org.gtkkn.compose.gtk.node.GtkNode
import org.gtkkn.compose.gtk.props.PropsBuilder
import org.gtkkn.compose.gtk.props.PropsScope
import org.gtkkn.compose.gtk.props.getValue
import org.gtkkn.compose.gtk.props.setValue

@GtkComposeInternalApi
private class BoxNode(override val widget: Box) : GtkContainerNode<Box>() {
    private val children = mutableListOf<GtkNode<Widget>>()

    override fun insert(index: Int, instance: GtkNode<Widget>) {
        val length = children.size
        if (index == 0) {
            widget.prepend(child = instance.widget)
        } else if (index < length) {
            val after = children[index - 1]
            widget.insertChildAfter(child = instance.widget, sibling = after.widget)
        } else {
            widget.append(child = instance.widget)
        }
        children.add(index = index, element = instance)
    }

    override fun remove(index: Int, count: Int) {
        repeat(count) {
            widget.remove(child = children.removeAt(index).widget)
        }
    }
}

// region properties
/**
 * @see Box.baselineChild
 */
public var PropsScope<out Box>.baselineChild: Int by Box::baselineChild

/**
 * @see Box.baselinePosition
 */
public var PropsScope<out Box>.baselinePosition: BaselinePosition by Box::baselinePosition

/**
 * @see Box.homogeneous
 */
public var PropsScope<out Box>.homogeneous: Boolean by Box::homogeneous

/**
 * @see Box.spacing
 */
public var PropsScope<out Box>.spacing: Int by Box::spacing
// endregion

@OptIn(GtkComposeInternalApi::class)
@Composable
private fun Box(
    orientation: Orientation,
    props: PropsBuilder<Box>,
    content: ContentBuilder<Box>
) {
    GtkNode(
        props = props,
        content = content,
    ) {
        val widget = Box(orientation, 0)
        BoxNode(widget)
    }
}

/**
 * A container that spreads its children vertically
 * @see Box
 * @see Orientation.VERTICAL
 */
@Composable
public fun VBox(
    props: PropsBuilder<Box>,
    content: ContentBuilder<Box>,
) {
    Box(
        orientation = Orientation.VERTICAL,
        props = props,
        content = content,
    )
}

/**
 * A container that spreads its children horizontally
 * @see Box
 * @see Orientation.HORIZONTAL
 */
@Composable
public fun HBox(
    props: PropsBuilder<Box>,
    content: ContentBuilder<Box>,
) {
    Box(
        orientation = Orientation.HORIZONTAL,
        props = props,
        content = content,
    )
}
