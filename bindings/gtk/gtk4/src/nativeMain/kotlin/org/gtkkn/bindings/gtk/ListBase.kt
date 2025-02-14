// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkListBase
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_list_base_get_type

/**
 * `GtkListBase` is the abstract base class for GTK's list widgets.
 *
 * # Shortcuts and Gestures
 *
 * `GtkListBase` supports the following keyboard shortcuts:
 *
 * - <kbd>Ctrl</kbd>+<kbd>A</kbd> or <kbd>Ctrl</kbd>+<kbd>`&sol;`</kbd>
 *   selects all items.
 * - <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>A</kbd> or
 *   <kbd>Ctrl</kbd>+<kbd>`&bsol;`</kbd> unselects all items.
 *
 * The focused item is controlled by the navigation keys below, combined
 * with the <kbd>Ctrl</kbd> modifier to prevent moving the selection,
 * and the <kbd>Shift</kbd> modifier to extend the current selection.
 *
 * - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd> move the focus
 *   on the next item in the designed direction.
 * - <kbd>Home</kbd> and <kbd>End</kbd> focus the first or last item.
 * - <kbd>PgUp</kbd> and <kbd>PgDn</kbd> move the focus one page up or down.
 *
 * List item widgets support the following keyboard shortcuts:
 *
 * - <kbd>Enter</kbd> activates the item.
 * - <kbd>␣</kbd> selects the item, with the same <kbd>Ctrl</kbd> and
 *   <kbd>Shift</kbd> modifiers combinations as the navigation keys.
 *
 * # Actions
 *
 * `GtkListBase` defines a set of built-in actions:
 *
 * - `list.scroll-to-item` moves the visible area to the item at given position
 *   with the minimum amount of scrolling required. If the item is already
 *   visible, nothing happens.
 * - `list.select-item` changes the selection.
 * - `list.select-all` selects all items in the model, if the selection model
 *   supports it.
 * - `list.unselect-all` unselects all items in the model, if the selection
 *   model supports it.
 *
 * List item widgets install the following actions:
 *
 * - `listitem.select` changes selection if the item is selectable.
 * - `listitem.scroll-to` moves the visible area of the list to this item with
 *   the minimum amount of scrolling required.
 *
 * ## Skipped during bindings generation
 *
 * - method `orientation`: Property has no getter nor setter
 */
public abstract class ListBase(public val gtkListBasePointer: CPointer<GtkListBase>) :
    Widget(gtkListBasePointer.reinterpret()),
    Orientable,
    Scrollable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The ListBaseImpl type represents a native instance of the abstract ListBase class.
     *
     * @constructor Creates a new instance of ListBase for the provided [CPointer].
     */
    public class ListBaseImpl(pointer: CPointer<GtkListBase>) : ListBase(pointer)

    public companion object : TypeCompanion<ListBase> {
        override val type: GeneratedClassKGType<ListBase> =
            GeneratedClassKGType(getTypeOrNull()!!) { ListBaseImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListBase
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_base_get_type()

        /**
         * Gets the GType of from the symbol `gtk_list_base_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_list_base_get_type")
    }
}
