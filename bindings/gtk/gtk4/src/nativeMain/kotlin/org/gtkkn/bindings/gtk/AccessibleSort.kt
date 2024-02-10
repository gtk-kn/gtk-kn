// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkAccessibleSort
import org.gtkkn.native.gtk.GtkAccessibleSort.GTK_ACCESSIBLE_SORT_ASCENDING
import org.gtkkn.native.gtk.GtkAccessibleSort.GTK_ACCESSIBLE_SORT_DESCENDING
import org.gtkkn.native.gtk.GtkAccessibleSort.GTK_ACCESSIBLE_SORT_NONE
import org.gtkkn.native.gtk.GtkAccessibleSort.GTK_ACCESSIBLE_SORT_OTHER

/**
 * The possible values for the %GTK_ACCESSIBLE_PROPERTY_SORT
 * accessible property.
 */
public enum class AccessibleSort(
    public val nativeValue: GtkAccessibleSort,
) {
    /**
     * There is no defined sort applied to the column.
     */
    NONE(GTK_ACCESSIBLE_SORT_NONE),

    /**
     * Items are sorted in ascending order by this column.
     */
    ASCENDING(GTK_ACCESSIBLE_SORT_ASCENDING),

    /**
     * Items are sorted in descending order by this column.
     */
    DESCENDING(GTK_ACCESSIBLE_SORT_DESCENDING),

    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    OTHER(GTK_ACCESSIBLE_SORT_OTHER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleSort): AccessibleSort =
            when (nativeValue) {
                GTK_ACCESSIBLE_SORT_NONE -> NONE
                GTK_ACCESSIBLE_SORT_ASCENDING -> ASCENDING
                GTK_ACCESSIBLE_SORT_DESCENDING -> DESCENDING
                GTK_ACCESSIBLE_SORT_OTHER -> OTHER
                else -> error("invalid nativeValue")
            }
    }
}
