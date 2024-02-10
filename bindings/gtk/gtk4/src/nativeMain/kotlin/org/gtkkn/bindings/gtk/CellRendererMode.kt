// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkCellRendererMode
import org.gtkkn.native.gtk.GtkCellRendererMode.GTK_CELL_RENDERER_MODE_ACTIVATABLE
import org.gtkkn.native.gtk.GtkCellRendererMode.GTK_CELL_RENDERER_MODE_EDITABLE
import org.gtkkn.native.gtk.GtkCellRendererMode.GTK_CELL_RENDERER_MODE_INERT

/**
 * Identifies how the user can interact with a particular cell.
 */
public enum class CellRendererMode(
    public val nativeValue: GtkCellRendererMode,
) {
    /**
     * The cell is just for display
     *  and cannot be interacted with.  Note that this doesn’t mean that eg. the
     *  row being drawn can’t be selected -- just that a particular element of
     *  it cannot be individually modified.
     */
    INERT(GTK_CELL_RENDERER_MODE_INERT),

    /**
     * The cell can be clicked.
     */
    ACTIVATABLE(GTK_CELL_RENDERER_MODE_ACTIVATABLE),

    /**
     * The cell can be edited or otherwise modified.
     */
    EDITABLE(GTK_CELL_RENDERER_MODE_EDITABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCellRendererMode): CellRendererMode =
            when (nativeValue) {
                GTK_CELL_RENDERER_MODE_INERT -> INERT
                GTK_CELL_RENDERER_MODE_ACTIVATABLE -> ACTIVATABLE
                GTK_CELL_RENDERER_MODE_EDITABLE -> EDITABLE
                else -> error("invalid nativeValue")
            }
    }
}
