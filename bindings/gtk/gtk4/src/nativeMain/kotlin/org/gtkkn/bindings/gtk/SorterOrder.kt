// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSorterOrder
import org.gtkkn.native.gtk.gtk_sorter_order_get_type

/**
 * Describes the type of order that a `GtkSorter` may produce.
 */
public enum class SorterOrder(public val nativeValue: GtkSorterOrder) {
    /**
     * A partial order. Any `GtkOrdering` is possible.
     */
    PARTIAL(GtkSorterOrder.GTK_SORTER_ORDER_PARTIAL),

    /**
     * No order, all elements are considered equal.
     *   gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL.
     */
    NONE(GtkSorterOrder.GTK_SORTER_ORDER_NONE),

    /**
     * A total order. gtk_sorter_compare() will only
     *   return %GTK_ORDERING_EQUAL if an item is compared with itself. Two
     *   different items will never cause this value to be returned.
     */
    TOTAL(GtkSorterOrder.GTK_SORTER_ORDER_TOTAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSorterOrder): SorterOrder = when (nativeValue) {
            GtkSorterOrder.GTK_SORTER_ORDER_PARTIAL -> PARTIAL
            GtkSorterOrder.GTK_SORTER_ORDER_NONE -> NONE
            GtkSorterOrder.GTK_SORTER_ORDER_TOTAL -> TOTAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SorterOrder
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_sorter_order_get_type()
    }
}
