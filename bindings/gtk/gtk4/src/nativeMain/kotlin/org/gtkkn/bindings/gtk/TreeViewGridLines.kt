// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTreeViewGridLines

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public enum class TreeViewGridLines(
    public val nativeValue: GtkTreeViewGridLines,
) {
    /**
     * No grid lines.
     */
    NONE(GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_NONE),

    /**
     * Horizontal grid lines.
     */
    HORIZONTAL(GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_HORIZONTAL),

    /**
     * Vertical grid lines.
     */
    VERTICAL(GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_VERTICAL),

    /**
     * Horizontal and vertical grid lines.
     */
    BOTH(GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTreeViewGridLines): TreeViewGridLines =
            when (nativeValue) {
                GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_NONE -> NONE
                GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_HORIZONTAL -> HORIZONTAL
                GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_VERTICAL -> VERTICAL
                GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_BOTH -> BOTH
                else -> error("invalid nativeValue")
            }
    }
}
