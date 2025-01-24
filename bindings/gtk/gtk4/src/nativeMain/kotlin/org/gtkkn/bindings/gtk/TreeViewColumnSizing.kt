// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeViewColumnSizing
import org.gtkkn.native.gtk.gtk_tree_view_column_sizing_get_type

/**
 * The sizing method the column uses to determine its width.  Please note
 * that %GTK_TREE_VIEW_COLUMN_AUTOSIZE are inefficient for large views, and
 * can make columns appear choppy.
 */
public enum class TreeViewColumnSizing(public val nativeValue: GtkTreeViewColumnSizing) {
    /**
     * Columns only get bigger in reaction to changes in the model
     */
    GROW_ONLY(GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_GROW_ONLY),

    /**
     * Columns resize to be the optimal size every time the model changes.
     */
    AUTOSIZE(GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_AUTOSIZE),

    /**
     * Columns are a fixed numbers of pixels wide.
     */
    FIXED(GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_FIXED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTreeViewColumnSizing): TreeViewColumnSizing = when (nativeValue) {
            GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_GROW_ONLY -> GROW_ONLY
            GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_AUTOSIZE -> AUTOSIZE
            GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_FIXED -> FIXED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TreeViewColumnSizing
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_view_column_sizing_get_type()
    }
}
