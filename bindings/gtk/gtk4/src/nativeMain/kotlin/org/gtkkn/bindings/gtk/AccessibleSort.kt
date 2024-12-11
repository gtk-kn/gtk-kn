// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleSort
import org.gtkkn.native.gtk.gtk_accessible_sort_get_type

/**
 * The possible values for the %GTK_ACCESSIBLE_PROPERTY_SORT
 * accessible property.
 */
public enum class AccessibleSort(public val nativeValue: GtkAccessibleSort) {
    /**
     * There is no defined sort applied to the column.
     */
    NONE(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_NONE),

    /**
     * Items are sorted in ascending order by this column.
     */
    ASCENDING(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_ASCENDING),

    /**
     * Items are sorted in descending order by this column.
     */
    DESCENDING(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_DESCENDING),

    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    OTHER(GtkAccessibleSort.GTK_ACCESSIBLE_SORT_OTHER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleSort): AccessibleSort = when (nativeValue) {
            GtkAccessibleSort.GTK_ACCESSIBLE_SORT_NONE -> NONE
            GtkAccessibleSort.GTK_ACCESSIBLE_SORT_ASCENDING -> ASCENDING
            GtkAccessibleSort.GTK_ACCESSIBLE_SORT_DESCENDING -> DESCENDING
            GtkAccessibleSort.GTK_ACCESSIBLE_SORT_OTHER -> OTHER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of AccessibleSort
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_sort_get_type()
    }
}
