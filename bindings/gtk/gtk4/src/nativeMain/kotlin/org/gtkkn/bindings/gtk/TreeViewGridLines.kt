// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTreeViewGridLines
import org.gtkkn.native.gtk.GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_BOTH
import org.gtkkn.native.gtk.GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_HORIZONTAL
import org.gtkkn.native.gtk.GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_NONE
import org.gtkkn.native.gtk.GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_VERTICAL

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public enum class TreeViewGridLines(
    public val nativeValue: GtkTreeViewGridLines,
) {
    /**
     * No grid lines.
     */
    NONE(GTK_TREE_VIEW_GRID_LINES_NONE),

    /**
     * Horizontal grid lines.
     */
    HORIZONTAL(GTK_TREE_VIEW_GRID_LINES_HORIZONTAL),

    /**
     * Vertical grid lines.
     */
    VERTICAL(GTK_TREE_VIEW_GRID_LINES_VERTICAL),

    /**
     * Horizontal and vertical grid lines.
     */
    BOTH(GTK_TREE_VIEW_GRID_LINES_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTreeViewGridLines): TreeViewGridLines =
            when (nativeValue) {
                GTK_TREE_VIEW_GRID_LINES_NONE -> NONE
                GTK_TREE_VIEW_GRID_LINES_HORIZONTAL -> HORIZONTAL
                GTK_TREE_VIEW_GRID_LINES_VERTICAL -> VERTICAL
                GTK_TREE_VIEW_GRID_LINES_BOTH -> BOTH
                else -> error("invalid nativeValue")
            }
    }
}
