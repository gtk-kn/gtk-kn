// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFilterChange
import org.gtkkn.native.gtk.gtk_filter_change_get_type

/**
 * Describes changes in a filter in more detail and allows objects
 * using the filter to optimize refiltering items.
 *
 * If you are writing an implementation and are not sure which
 * value to pass, %GTK_FILTER_CHANGE_DIFFERENT is always a correct
 * choice.
 */
public enum class FilterChange(public val nativeValue: GtkFilterChange) {
    /**
     * The filter change cannot be
     *   described with any of the other enumeration values.
     */
    DIFFERENT(GtkFilterChange.GTK_FILTER_CHANGE_DIFFERENT),

    /**
     * The filter is less strict than
     *   it was before: All items that it used to return true for
     *   still return true, others now may, too.
     */
    LESS_STRICT(GtkFilterChange.GTK_FILTER_CHANGE_LESS_STRICT),

    /**
     * The filter is more strict than
     *   it was before: All items that it used to return false for
     *   still return false, others now may, too.
     */
    MORE_STRICT(GtkFilterChange.GTK_FILTER_CHANGE_MORE_STRICT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkFilterChange): FilterChange = when (nativeValue) {
            GtkFilterChange.GTK_FILTER_CHANGE_DIFFERENT -> DIFFERENT
            GtkFilterChange.GTK_FILTER_CHANGE_LESS_STRICT -> LESS_STRICT
            GtkFilterChange.GTK_FILTER_CHANGE_MORE_STRICT -> MORE_STRICT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FilterChange
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_filter_change_get_type()
    }
}
