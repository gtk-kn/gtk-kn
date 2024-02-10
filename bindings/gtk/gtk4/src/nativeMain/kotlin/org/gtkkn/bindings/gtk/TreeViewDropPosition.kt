// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTreeViewDropPosition
import org.gtkkn.native.gtk.GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_AFTER
import org.gtkkn.native.gtk.GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_BEFORE
import org.gtkkn.native.gtk.GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_AFTER
import org.gtkkn.native.gtk.GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_BEFORE

/**
 * An enum for determining where a dropped row goes.
 */
public enum class TreeViewDropPosition(
    public val nativeValue: GtkTreeViewDropPosition,
) {
    /**
     * dropped row is inserted before
     */
    BEFORE(GTK_TREE_VIEW_DROP_BEFORE),

    /**
     * dropped row is inserted after
     */
    AFTER(GTK_TREE_VIEW_DROP_AFTER),

    /**
     * dropped row becomes a child or is inserted before
     */
    INTO_OR_BEFORE(GTK_TREE_VIEW_DROP_INTO_OR_BEFORE),

    /**
     * dropped row becomes a child or is inserted after
     */
    INTO_OR_AFTER(GTK_TREE_VIEW_DROP_INTO_OR_AFTER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTreeViewDropPosition): TreeViewDropPosition =
            when (nativeValue) {
                GTK_TREE_VIEW_DROP_BEFORE -> BEFORE
                GTK_TREE_VIEW_DROP_AFTER -> AFTER
                GTK_TREE_VIEW_DROP_INTO_OR_BEFORE -> INTO_OR_BEFORE
                GTK_TREE_VIEW_DROP_INTO_OR_AFTER -> INTO_OR_AFTER
                else -> error("invalid nativeValue")
            }
    }
}
