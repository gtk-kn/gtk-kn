// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTreeViewColumnSizing
import org.gtkkn.native.gtk.GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_AUTOSIZE
import org.gtkkn.native.gtk.GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_FIXED
import org.gtkkn.native.gtk.GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_GROW_ONLY

/**
 * The sizing method the column uses to determine its width.  Please note
 * that %GTK_TREE_VIEW_COLUMN_AUTOSIZE are inefficient for large views, and
 * can make columns appear choppy.
 */
public enum class TreeViewColumnSizing(
    public val nativeValue: GtkTreeViewColumnSizing,
) {
    /**
     * Columns only get bigger in reaction to changes in the model
     */
    GROW_ONLY(GTK_TREE_VIEW_COLUMN_GROW_ONLY),

    /**
     * Columns resize to be the optimal size every time the model changes.
     */
    AUTOSIZE(GTK_TREE_VIEW_COLUMN_AUTOSIZE),

    /**
     * Columns are a fixed numbers of pixels wide.
     */
    FIXED(GTK_TREE_VIEW_COLUMN_FIXED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTreeViewColumnSizing): TreeViewColumnSizing =
            when (nativeValue) {
                GTK_TREE_VIEW_COLUMN_GROW_ONLY -> GROW_ONLY
                GTK_TREE_VIEW_COLUMN_AUTOSIZE -> AUTOSIZE
                GTK_TREE_VIEW_COLUMN_FIXED -> FIXED
                else -> error("invalid nativeValue")
            }
    }
}
