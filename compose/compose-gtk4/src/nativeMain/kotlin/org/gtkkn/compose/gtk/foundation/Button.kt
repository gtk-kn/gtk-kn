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
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi
import org.gtkkn.compose.gtk.node.ContentBuilder
import org.gtkkn.compose.gtk.node.GtkNode
import org.gtkkn.compose.gtk.node.GtkParentNode
import org.gtkkn.compose.gtk.props.PropsBuilder
import org.gtkkn.compose.gtk.props.PropsScope
import org.gtkkn.compose.gtk.props.SyntheticProperty
import org.gtkkn.compose.gtk.props.getValue
import org.gtkkn.compose.gtk.props.setValue
import org.gtkkn.compose.gtk.props.signal

@GtkComposeInternalApi
private class ButtonNode(override val widget: Button) : GtkParentNode<Button>() {
    override fun add(child: Widget) {
        widget.child = child
    }

    override fun clear() {
        widget.child = null
    }
}

// region properties
/**
 * @see Button.canShrink
 */
public var PropsScope<out Button>.canShrink: Boolean by Button::canShrink

/**
 * @see Button.child
 */
public var PropsScope<out Button>.child: Widget? by Button::child

/**
 * @see Button.hasFrame
 */
public var PropsScope<out Button>.hasFrame: Boolean by Button::hasFrame

/**
 * @see Button.getIconName
 * @see Button.setIconName
 */
public var PropsScope<out Button>.iconName: String by SyntheticProperty(
    get = { getIconName() ?: "" },
    set = Button::setIconName,
)

/**
 * @see Button.getLabel
 * @see Button.setLabel
 */
public var PropsScope<out Button>.label: String by SyntheticProperty(
    get = { getLabel() ?: "" },
    set = Button::setLabel,
)

/**
 * @see Button.useUnderline
 */
public var PropsScope<out Button>.useUnderline: Boolean by Button::useUnderline
//endregion

// region signals
/**
 * @see Button.onClicked
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Button>.onClick: () -> Unit by signal { widget.onClicked(handler = it) }

/**
 * @see Button.onActivate
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Button>.onActivate: () -> Unit by signal { widget.onActivate(handler = it) }
// endregion

@OptIn(GtkComposeInternalApi::class)
@Composable
public fun Button(
    props: PropsBuilder<Button>,
    child: ContentBuilder<Button>
) {
    GtkNode(
        props = props,
        content = child,
    ) {
        ButtonNode(Button())
    }
}
