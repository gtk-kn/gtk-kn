// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCellRendererAccelMode
import org.gtkkn.native.gtk.gtk_cell_renderer_accel_mode_get_type

/**
 * The available modes for [property@Gtk.CellRendererAccel:accel-mode].
 */
public enum class CellRendererAccelMode(public val nativeValue: GtkCellRendererAccelMode) {
    /**
     * GTK accelerators mode
     */
    GTK(GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_GTK),

    /**
     * Other accelerator mode
     */
    OTHER(GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_OTHER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCellRendererAccelMode): CellRendererAccelMode = when (nativeValue) {
            GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_GTK -> GTK
            GtkCellRendererAccelMode.GTK_CELL_RENDERER_ACCEL_MODE_OTHER -> OTHER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CellRendererAccelMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_renderer_accel_mode_get_type()
    }
}
