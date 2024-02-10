// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSorterChange
import org.gtkkn.native.gtk.GtkSorterChange.GTK_SORTER_CHANGE_DIFFERENT
import org.gtkkn.native.gtk.GtkSorterChange.GTK_SORTER_CHANGE_INVERTED
import org.gtkkn.native.gtk.GtkSorterChange.GTK_SORTER_CHANGE_LESS_STRICT
import org.gtkkn.native.gtk.GtkSorterChange.GTK_SORTER_CHANGE_MORE_STRICT

/**
 * Describes changes in a sorter in more detail and allows users
 * to optimize resorting.
 */
public enum class SorterChange(
    public val nativeValue: GtkSorterChange,
) {
    /**
     * The sorter change cannot be described
     *   by any of the other enumeration values
     */
    DIFFERENT(GTK_SORTER_CHANGE_DIFFERENT),

    /**
     * The sort order was inverted. Comparisons
     *   that returned %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER
     *   and vice versa. Other comparisons return the same values as before.
     */
    INVERTED(GTK_SORTER_CHANGE_INVERTED),

    /**
     * The sorter is less strict: Comparisons
     *   may now return %GTK_ORDERING_EQUAL that did not do so before.
     */
    LESS_STRICT(GTK_SORTER_CHANGE_LESS_STRICT),

    /**
     * The sorter is more strict: Comparisons
     *   that did return %GTK_ORDERING_EQUAL may not do so anymore.
     */
    MORE_STRICT(GTK_SORTER_CHANGE_MORE_STRICT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSorterChange): SorterChange =
            when (nativeValue) {
                GTK_SORTER_CHANGE_DIFFERENT -> DIFFERENT
                GTK_SORTER_CHANGE_INVERTED -> INVERTED
                GTK_SORTER_CHANGE_LESS_STRICT -> LESS_STRICT
                GTK_SORTER_CHANGE_MORE_STRICT -> MORE_STRICT
                else -> error("invalid nativeValue")
            }
    }
}
