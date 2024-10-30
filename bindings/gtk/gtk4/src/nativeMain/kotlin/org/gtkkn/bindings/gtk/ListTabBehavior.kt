// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkListTabBehavior
import org.gtkkn.native.gtk.GtkListTabBehavior.GTK_LIST_TAB_ALL
import org.gtkkn.native.gtk.GtkListTabBehavior.GTK_LIST_TAB_CELL
import org.gtkkn.native.gtk.GtkListTabBehavior.GTK_LIST_TAB_ITEM

/**
 * Used to configure the focus behavior in the `GTK_DIR_TAB_FORWARD`
 * and `GTK_DIR_TAB_BACKWARD` direction, like the <kbd>Tab</kbd> key
 * in a [class@Gtk.ListView].
 * @since 4.12
 */
public enum class ListTabBehavior(
    public val nativeValue: GtkListTabBehavior,
) {
    /**
     * Cycle through all focusable items of the list
     */
    ALL(GTK_LIST_TAB_ALL),

    /**
     * Cycle through a single list element, then move
     *   focus out of the list. Moving focus between items needs to be
     *   done with the arrow keys.
     */
    ITEM(GTK_LIST_TAB_ITEM),

    /**
     * Cycle only through a single cell, then
     *   move focus out of the list. Moving focus between cells needs to
     *   be done with the arrow keys. This is only relevant for
     *   cell-based widgets like #GtkColumnView, otherwise it behaves
     *   like `GTK_LIST_TAB_ITEM`.
     */
    CELL(GTK_LIST_TAB_CELL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkListTabBehavior): ListTabBehavior =
            when (nativeValue) {
                GTK_LIST_TAB_ALL -> ALL
                GTK_LIST_TAB_ITEM -> ITEM
                GTK_LIST_TAB_CELL -> CELL
                else -> error("invalid nativeValue")
            }
    }
}