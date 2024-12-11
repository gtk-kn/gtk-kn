// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeViewDropPosition
import org.gtkkn.native.gtk.gtk_tree_view_drop_position_get_type

/**
 * An enum for determining where a dropped row goes.
 */
public enum class TreeViewDropPosition(public val nativeValue: GtkTreeViewDropPosition) {
    /**
     * dropped row is inserted before
     */
    BEFORE(GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_BEFORE),

    /**
     * dropped row is inserted after
     */
    AFTER(GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_AFTER),

    /**
     * dropped row becomes a child or is inserted before
     */
    INTO_OR_BEFORE(GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_BEFORE),

    /**
     * dropped row becomes a child or is inserted after
     */
    INTO_OR_AFTER(GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_AFTER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTreeViewDropPosition): TreeViewDropPosition = when (nativeValue) {
            GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_BEFORE -> BEFORE
            GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_AFTER -> AFTER
            GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_BEFORE -> INTO_OR_BEFORE
            GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_AFTER -> INTO_OR_AFTER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TreeViewDropPosition
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_view_drop_position_get_type()
    }
}
