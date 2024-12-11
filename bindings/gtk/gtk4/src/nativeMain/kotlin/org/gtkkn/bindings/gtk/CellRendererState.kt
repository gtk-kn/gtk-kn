// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_EXPANDABLE
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_EXPANDED
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_FOCUSED
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_INSENSITIVE
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_PRELIT
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_SELECTED
import org.gtkkn.native.gtk.GTK_CELL_RENDERER_SORTED
import org.gtkkn.native.gtk.GtkCellRendererState
import org.gtkkn.native.gtk.gtk_cell_renderer_state_get_type

/**
 * Tells how a cell is to be rendered.
 */
public class CellRendererState(public val mask: GtkCellRendererState) : Bitfield<CellRendererState> {
    override infix fun or(other: CellRendererState): CellRendererState = CellRendererState(mask or other.mask)

    public companion object {
        /**
         * The cell is currently selected, and
         *  probably has a selection colored background to render to.
         */
        public val SELECTED: CellRendererState = CellRendererState(GTK_CELL_RENDERER_SELECTED)

        /**
         * The mouse is hovering over the cell.
         */
        public val PRELIT: CellRendererState = CellRendererState(GTK_CELL_RENDERER_PRELIT)

        /**
         * The cell is drawn in an insensitive manner
         */
        public val INSENSITIVE: CellRendererState = CellRendererState(GTK_CELL_RENDERER_INSENSITIVE)

        /**
         * The cell is in a sorted row
         */
        public val SORTED: CellRendererState = CellRendererState(GTK_CELL_RENDERER_SORTED)

        /**
         * The cell is in the focus row.
         */
        public val FOCUSED: CellRendererState = CellRendererState(GTK_CELL_RENDERER_FOCUSED)

        /**
         * The cell is in a row that can be expanded
         */
        public val EXPANDABLE: CellRendererState = CellRendererState(GTK_CELL_RENDERER_EXPANDABLE)

        /**
         * The cell is in a row that is expanded
         */
        public val EXPANDED: CellRendererState = CellRendererState(GTK_CELL_RENDERER_EXPANDED)

        /**
         * Get the GType of CellRendererState
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_state_get_type()
    }
}
