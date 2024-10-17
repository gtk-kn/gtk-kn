// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceGutterRendererAlignmentMode
import org.gtkkn.native.gtksource.GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_CELL
import org.gtkkn.native.gtksource.GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_FIRST
import org.gtkkn.native.gtksource.GtkSourceGutterRendererAlignmentMode.GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_LAST

/**
 * The alignment mode of the renderer, when a cell spans multiple lines (due to
 * text wrapping).
 */
public enum class GutterRendererAlignmentMode(
    public val nativeValue: GtkSourceGutterRendererAlignmentMode,
) {
    /**
     * The full cell.
     */
    CELL(GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_CELL),

    /**
     * The first line.
     */
    FIRST(GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_FIRST),

    /**
     * The last line.
     */
    LAST(GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceGutterRendererAlignmentMode): GutterRendererAlignmentMode =
            when (nativeValue) {
                GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_CELL -> CELL
                GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_FIRST -> FIRST
                GTK_SOURCE_GUTTER_RENDERER_ALIGNMENT_MODE_LAST -> LAST
                else -> error("invalid nativeValue")
            }
    }
}
