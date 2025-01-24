// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSorterChange
import org.gtkkn.native.gtk.gtk_sorter_change_get_type

/**
 * Describes changes in a sorter in more detail and allows users
 * to optimize resorting.
 */
public enum class SorterChange(public val nativeValue: GtkSorterChange) {
    /**
     * The sorter change cannot be described
     *   by any of the other enumeration values
     */
    DIFFERENT(GtkSorterChange.GTK_SORTER_CHANGE_DIFFERENT),

    /**
     * The sort order was inverted. Comparisons
     *   that returned %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER
     *   and vice versa. Other comparisons return the same values as before.
     */
    INVERTED(GtkSorterChange.GTK_SORTER_CHANGE_INVERTED),

    /**
     * The sorter is less strict: Comparisons
     *   may now return %GTK_ORDERING_EQUAL that did not do so before.
     */
    LESS_STRICT(GtkSorterChange.GTK_SORTER_CHANGE_LESS_STRICT),

    /**
     * The sorter is more strict: Comparisons
     *   that did return %GTK_ORDERING_EQUAL may not do so anymore.
     */
    MORE_STRICT(GtkSorterChange.GTK_SORTER_CHANGE_MORE_STRICT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSorterChange): SorterChange = when (nativeValue) {
            GtkSorterChange.GTK_SORTER_CHANGE_DIFFERENT -> DIFFERENT
            GtkSorterChange.GTK_SORTER_CHANGE_INVERTED -> INVERTED
            GtkSorterChange.GTK_SORTER_CHANGE_LESS_STRICT -> LESS_STRICT
            GtkSorterChange.GTK_SORTER_CHANGE_MORE_STRICT -> MORE_STRICT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SorterChange
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_sorter_change_get_type()
    }
}
