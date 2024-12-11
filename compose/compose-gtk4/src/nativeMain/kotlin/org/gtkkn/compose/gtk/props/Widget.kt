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

package org.gtkkn.compose.gtk.props

import org.gtkkn.bindings.gdk.Cursor
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.DirectionType
import org.gtkkn.bindings.gtk.LayoutManager
import org.gtkkn.bindings.gtk.Overflow
import org.gtkkn.bindings.gtk.StateFlags
import org.gtkkn.bindings.gtk.TextDirection
import org.gtkkn.bindings.gtk.Tooltip
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi

// region properties
/**
 * @see Widget.canFocus
 */
public var PropsScope<out Widget>.canFocus: Boolean by Widget::canFocus

/**
 * @see Widget.canTarget
 */
public var PropsScope<out Widget>.canTarget: Boolean by Widget::canTarget

/**
 * @see Widget.cssClasses
 */
public var PropsScope<out Widget>.cssClasses: List<String> by Widget::cssClasses

/**
 * @see Widget.cursor
 */
public var PropsScope<out Widget>.cursor: Cursor? by Widget::cursor

/**
 * @see Widget.focusOnClick
 */
public var PropsScope<out Widget>.focusOnClick: Boolean by Widget::focusOnClick

/**
 * @see Widget.focusable
 */
public var PropsScope<out Widget>.focusable: Boolean by Widget::focusable

/**
 * @see Widget.halign
 */
public var PropsScope<out Widget>.halign: Align by Widget::halign

/**
 * @see Widget.hasTooltip
 */
public var PropsScope<out Widget>.hasTooltip: Boolean by Widget::hasTooltip

/**
 * @see Widget.hexpand
 */
public var PropsScope<out Widget>.hexpand: Boolean by Widget::hexpand

/**
 * @see Widget.hexpandSet
 */
public var PropsScope<out Widget>.hexpandSet: Boolean by Widget::hexpandSet

/**
 * @see Widget.layoutManager
 */
public var PropsScope<out Widget>.layoutManager: LayoutManager? by Widget::layoutManager

/**
 * @see Widget.marginBottom
 */
public var PropsScope<out Widget>.marginBottom: Int by Widget::marginBottom

/**
 * @see Widget.marginEnd
 */
public var PropsScope<out Widget>.marginEnd: Int by Widget::marginEnd

/**
 * @see Widget.marginStart
 */
public var PropsScope<out Widget>.marginStart: Int by Widget::marginStart

/**
 * @see Widget.marginTop
 */
public var PropsScope<out Widget>.marginTop: Int by Widget::marginTop

/**
 * @see Widget.name
 */
public var PropsScope<out Widget>.name: String by Widget::name

/**
 * @see Widget.opacity
 */
public var PropsScope<out Widget>.opacity: Double by Widget::opacity

/**
 * @see Widget.overflow
 */
public var PropsScope<out Widget>.overflow: Overflow by Widget::overflow

/**
 * @see Widget.receivesDefault
 */
public var PropsScope<out Widget>.receivesDefault: Boolean by Widget::receivesDefault

///**
// * @see Widget.sensitive
// */
//public var PropsScope<out Widget>.sensitive: Boolean by Widget::sensitive

/**
 * @see Widget.tooltipMarkup
 */
public var PropsScope<out Widget>.tooltipMarkup: String? by Widget::tooltipMarkup

/**
 * @see Widget.tooltipText
 */
public var PropsScope<out Widget>.tooltipText: String? by Widget::tooltipText

/**
 * @see Widget.valign
 */
public var PropsScope<out Widget>.valign: Align by Widget::valign

/**
 * @see Widget.vexpand
 */
public var PropsScope<out Widget>.vexpand: Boolean by Widget::vexpand

/**
 * @see Widget.vexpandSet
 */
public var PropsScope<out Widget>.vexpandSet: Boolean by Widget::vexpandSet

///**
// * @see Widget.visible
// */
//public var PropsScope<out Widget>.visible: Boolean by Widget::visible
// endregion

// region signals
/**
 * @see Widget.onDestroy
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onClick: () -> Unit by signal { widget.onDestroy(handler = it) }

/**
 * @see Widget.onDirectionChanged
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onDirectionChanged: (previousDirection: TextDirection) -> Unit by signal {
    widget.onDirectionChanged(handler = it)
}

/**
 * @see Widget.onHide
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onHide: () -> Unit by signal { widget.onHide(handler = it) }

/**
 * @see Widget.onKeynavFailed
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onKeynavFailed: (direction: DirectionType) -> Boolean by signal {
    widget.onKeynavFailed(handler = it)
}

/**
 * @see Widget.onMap
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onMap: () -> Unit by signal { widget.onMap(handler = it) }

/**
 * @see Widget.onMnemonicActivate
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onMnemonicActivate: (groupCycling: Boolean) -> Boolean by signal {
    widget.onMnemonicActivate(handler = it)
}

/**
 * @see Widget.onMoveFocus
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onMoveFocus: (direction: DirectionType) -> Unit by signal {
    widget.onMoveFocus(handler = it)
}

/**
 * @see Widget.onQueryTooltip
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onQueryTooltip: (
    x: Int,
    y: Int,
    keyboardMode: Boolean,
    tooltip: Tooltip,
) -> Boolean by signal { widget.onQueryTooltip(handler = it) }

/**
 * @see Widget.onRealize
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onRealize: () -> Unit by signal { widget.onRealize(handler = it) }

/**
 * @see Widget.onShow
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onShow: () -> Unit by signal { widget.onShow(handler = it) }

/**
 * @see Widget.onStateFlagsChanged
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onStateFlagsChanged: (flags: StateFlags) -> Unit by signal {
    widget.onStateFlagsChanged(handler = it)
}

/**
 * @see Widget.onUnmap
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onUnmap: () -> Unit by signal { widget.onUnmap(handler = it) }

/**
 * @see Widget.onUnrealize
 */
@OptIn(GtkComposeInternalApi::class)
public var PropsScope<out Widget>.onUnrealize: () -> Unit by signal { widget.onUnrealize(handler = it) }
// endregion
