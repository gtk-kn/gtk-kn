// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceGutterRendererAlignmentMode
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_alignment_mode_get_type

/**
 * The alignment mode of the renderer, when a cell spans multiple lines (due to
 * text wrapping).
 */
public enum class GutterRendererAlignmentMode(public val nativeValue: GtkSourceGutterRendererAlignmentMode) {
    /**
     * The full cell.
     */
    CELL(GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_CELL),

    /**
     * The first line.
     */
    FIRST(GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_FIRST),

    /**
     * The last line.
     */
    LAST(GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceGutterRendererAlignmentMode): GutterRendererAlignmentMode =
            when (nativeValue) {
                GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_CELL -> CELL
                GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_FIRST -> FIRST
                GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_LAST -> LAST
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of GutterRendererAlignmentMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_gutter_renderer_alignment_mode_get_type()
    }
}
