// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSortType
import org.gtkkn.native.gtk.gtk_sort_type_get_type

/**
 * Determines the direction of a sort.
 */
public enum class SortType(public val nativeValue: GtkSortType) {
    /**
     * Sorting is in ascending order.
     */
    ASCENDING(GtkSortType.GTK_SORT_ASCENDING),

    /**
     * Sorting is in descending order.
     */
    DESCENDING(GtkSortType.GTK_SORT_DESCENDING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSortType): SortType = when (nativeValue) {
            GtkSortType.GTK_SORT_ASCENDING -> ASCENDING
            GtkSortType.GTK_SORT_DESCENDING -> DESCENDING
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SortType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_sort_type_get_type()
    }
}
