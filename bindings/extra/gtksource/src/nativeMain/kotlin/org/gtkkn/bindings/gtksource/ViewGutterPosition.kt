// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GTK_SOURCE_VIEW_GUTTER_POSITION_LINES
import org.gtkkn.native.gtksource.GTK_SOURCE_VIEW_GUTTER_POSITION_MARKS
import org.gtkkn.native.gtksource.GtkSourceViewGutterPosition

public enum class ViewGutterPosition(
    public val nativeValue: GtkSourceViewGutterPosition,
) {
    /**
     * the gutter position of the lines
     * renderer
     */
    LINES(GTK_SOURCE_VIEW_GUTTER_POSITION_LINES),

    /**
     * the gutter position of the marks
     * renderer
     */
    MARKS(GTK_SOURCE_VIEW_GUTTER_POSITION_MARKS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceViewGutterPosition): ViewGutterPosition =
            when (nativeValue) {
                GTK_SOURCE_VIEW_GUTTER_POSITION_LINES -> LINES
                GTK_SOURCE_VIEW_GUTTER_POSITION_MARKS -> MARKS
                else -> error("invalid nativeValue")
            }
    }
}
