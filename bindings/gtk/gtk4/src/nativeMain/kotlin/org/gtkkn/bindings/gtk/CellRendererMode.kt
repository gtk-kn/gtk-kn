// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCellRendererMode
import org.gtkkn.native.gtk.gtk_cell_renderer_mode_get_type

/**
 * Identifies how the user can interact with a particular cell.
 */
public enum class CellRendererMode(public val nativeValue: GtkCellRendererMode) {
    /**
     * The cell is just for display
     *  and cannot be interacted with.  Note that this doesn’t mean that eg. the
     *  row being drawn can’t be selected -- just that a particular element of
     *  it cannot be individually modified.
     */
    INERT(GtkCellRendererMode.GTK_CELL_RENDERER_MODE_INERT),

    /**
     * The cell can be clicked.
     */
    ACTIVATABLE(GtkCellRendererMode.GTK_CELL_RENDERER_MODE_ACTIVATABLE),

    /**
     * The cell can be edited or otherwise modified.
     */
    EDITABLE(GtkCellRendererMode.GTK_CELL_RENDERER_MODE_EDITABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCellRendererMode): CellRendererMode = when (nativeValue) {
            GtkCellRendererMode.GTK_CELL_RENDERER_MODE_INERT -> INERT
            GtkCellRendererMode.GTK_CELL_RENDERER_MODE_ACTIVATABLE -> ACTIVATABLE
            GtkCellRendererMode.GTK_CELL_RENDERER_MODE_EDITABLE -> EDITABLE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CellRendererMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_mode_get_type()
    }
}
