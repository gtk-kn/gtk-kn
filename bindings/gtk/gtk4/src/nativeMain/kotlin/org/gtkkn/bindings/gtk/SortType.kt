// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSortType
import org.gtkkn.native.gtk.GtkSortType.GTK_SORT_ASCENDING
import org.gtkkn.native.gtk.GtkSortType.GTK_SORT_DESCENDING

/**
 * Determines the direction of a sort.
 */
public enum class SortType(
    public val nativeValue: GtkSortType,
) {
    /**
     * Sorting is in ascending order.
     */
    ASCENDING(GTK_SORT_ASCENDING),

    /**
     * Sorting is in descending order.
     */
    DESCENDING(GTK_SORT_DESCENDING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSortType): SortType =
            when (nativeValue) {
                GTK_SORT_ASCENDING -> ASCENDING
                GTK_SORT_DESCENDING -> DESCENDING
                else -> error("invalid nativeValue")
            }
    }
}
