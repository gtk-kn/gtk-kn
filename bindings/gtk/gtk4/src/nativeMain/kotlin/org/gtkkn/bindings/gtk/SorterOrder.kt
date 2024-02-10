// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSorterOrder
import org.gtkkn.native.gtk.GtkSorterOrder.GTK_SORTER_ORDER_NONE
import org.gtkkn.native.gtk.GtkSorterOrder.GTK_SORTER_ORDER_PARTIAL
import org.gtkkn.native.gtk.GtkSorterOrder.GTK_SORTER_ORDER_TOTAL

/**
 * Describes the type of order that a `GtkSorter` may produce.
 */
public enum class SorterOrder(
    public val nativeValue: GtkSorterOrder,
) {
    /**
     * A partial order. Any `GtkOrdering` is possible.
     */
    PARTIAL(GTK_SORTER_ORDER_PARTIAL),

    /**
     * No order, all elements are considered equal.
     *   gtk_sorter_compare() will only return %GTK_ORDERING_EQUAL.
     */
    NONE(GTK_SORTER_ORDER_NONE),

    /**
     * A total order. gtk_sorter_compare() will only
     *   return %GTK_ORDERING_EQUAL if an item is compared with itself. Two
     *   different items will never cause this value to be returned.
     */
    TOTAL(GTK_SORTER_ORDER_TOTAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSorterOrder): SorterOrder =
            when (nativeValue) {
                GTK_SORTER_ORDER_PARTIAL -> PARTIAL
                GTK_SORTER_ORDER_NONE -> NONE
                GTK_SORTER_ORDER_TOTAL -> TOTAL
                else -> error("invalid nativeValue")
            }
    }
}
