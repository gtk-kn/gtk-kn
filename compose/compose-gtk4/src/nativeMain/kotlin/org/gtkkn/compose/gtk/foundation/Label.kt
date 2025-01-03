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
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gtk.Justification
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.MovementStep
import org.gtkkn.bindings.gtk.NaturalWrapMode
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.pango.AttrList
import org.gtkkn.bindings.pango.TabArray
import org.gtkkn.bindings.pango.WrapMode
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi
import org.gtkkn.compose.gtk.node.GtkElementNode
import org.gtkkn.compose.gtk.node.GtkNode
import org.gtkkn.compose.gtk.props.PropsBuilder
import org.gtkkn.compose.gtk.props.PropsScope
import org.gtkkn.compose.gtk.props.getValue
import org.gtkkn.compose.gtk.props.setValue
import org.gtkkn.compose.gtk.props.signal

@GtkComposeInternalApi
private class LabelNode(override val widget: Label) : GtkElementNode<Label>()

// region properties
/**
 * @see Label.attributes
 */
public var PropsScope<out Label>.attributes: AttrList? by Label::attributes

/**
 * @see Label.extraMenu
 */
public var PropsScope<out Label>.extraMenu: MenuModel? by Label::extraMenu

/**
 * @see Label.justify
 */
public var PropsScope<out Label>.justify: Justification by Label::justify

/**
 * @see Label.label
 */
public var PropsScope<out Label>.label: String by Label::label

/**
 * @see Label.lines
 */
public var PropsScope<out Label>.lines: Int by Label::lines

/**
 * @see Label.maxWidthChars
 */
public var PropsScope<out Label>.maxWidthChars: Int by Label::maxWidthChars

/**
 * @see Label.mnemonicWidget
 */
public var PropsScope<out Label>.mnemonicWidget: Widget? by Label::mnemonicWidget

/**
 * @see Label.naturalWrapMode
 */
public var PropsScope<out Label>.naturalWrapMode: NaturalWrapMode by Label::naturalWrapMode

/**
 * @see Label.selectable
 */
public var PropsScope<out Label>.selectable: Boolean by Label::selectable

/**
 * @see Label.singleLineMode
 */
public var PropsScope<out Label>.singleLineMode: Boolean by Label::singleLineMode

/**
 * @see Label.tabs
 */
public var PropsScope<out Label>.tabs: TabArray? by Label::tabs

/**
 * @see Label.useMarkup
 */
public var PropsScope<out Label>.useMarkup: Boolean by Label::useMarkup

/**
 * @see Label.useUnderline
 */
public var PropsScope<out Label>.useUnderline: Boolean by Label::useUnderline

/**
 * @see Label.widthChars
 */
public var PropsScope<out Label>.widthChars: Int by Label::widthChars

/**
 * @see Label.wrap
 */
public var PropsScope<out Label>.wrap: Boolean by Label::wrap

/**
 * @see Label.wrapMode
 */
public var PropsScope<out Label>.wrapMode: WrapMode by Label::wrapMode

/**
 * @see Label.xalign
 */
public var PropsScope<out Label>.xalign: Float by Label::xalign

/**
 * @see Label.yalign
 */
public var PropsScope<out Label>.yalign: Float by Label::yalign
// endregion

// region signals
/**
 * @see Label.connectActivateCurrentLink
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Label>.onActivateCurrentLink: () -> Unit by signal {
    widget.connectActivateCurrentLink(handler = it)
}

/**
 * @see Label.connectActivateLink
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Label>.onActivateLink: (uri: String) -> Boolean by signal {
    widget.connectActivateLink(handler = it)
}

/**
 * @see Label.connectCopyClipboard
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Label>.onCopyClipboard: () -> Unit by signal { widget.connectCopyClipboard(handler = it) }

/**
 * @see Label.connectMoveCursor
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Label>.onMoveCursor: (
    step: MovementStep,
    count: Int,
    extendSelection: Boolean
) -> Unit by signal {
    widget.connectMoveCursor(handler = it)
}
//endregion

@OptIn(GtkComposeInternalApi::class)
@Composable
public fun Label(
    props: PropsBuilder<Label>,
) {
    GtkNode(
        props = props,
    ) { LabelNode(Label(null)) }
}

@Composable
public fun Label(
    text: String,
) {
    Label(
        props = {
            label = text
        },
    )
}
