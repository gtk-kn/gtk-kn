// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSelectionMode
import org.gtkkn.native.gtk.gtk_selection_mode_get_type

/**
 * Used to control what selections users are allowed to make.
 */
public enum class SelectionMode(public val nativeValue: GtkSelectionMode) {
    /**
     * No selection is possible.
     */
    NONE(GtkSelectionMode.GTK_SELECTION_NONE),

    /**
     * Zero or one element may be selected.
     */
    SINGLE(GtkSelectionMode.GTK_SELECTION_SINGLE),

    /**
     * Exactly one element is selected.
     *   In some circumstances, such as initially or during a search
     *   operation, it’s possible for no element to be selected with
     *   %GTK_SELECTION_BROWSE. What is really enforced is that the user
     *   can’t deselect a currently selected element except by selecting
     *   another element.
     */
    BROWSE(GtkSelectionMode.GTK_SELECTION_BROWSE),

    /**
     * Any number of elements may be selected.
     *   The Ctrl key may be used to enlarge the selection, and Shift
     *   key to select between the focus and the child pointed to.
     *   Some widgets may also allow Click-drag to select a range of elements.
     */
    MULTIPLE(GtkSelectionMode.GTK_SELECTION_MULTIPLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSelectionMode): SelectionMode = when (nativeValue) {
            GtkSelectionMode.GTK_SELECTION_NONE -> NONE
            GtkSelectionMode.GTK_SELECTION_SINGLE -> SINGLE
            GtkSelectionMode.GTK_SELECTION_BROWSE -> BROWSE
            GtkSelectionMode.GTK_SELECTION_MULTIPLE -> MULTIPLE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SelectionMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_selection_mode_get_type()
    }
}
