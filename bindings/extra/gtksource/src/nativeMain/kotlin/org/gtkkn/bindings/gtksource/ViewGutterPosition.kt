// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GTK_SOURCE_VIEW_GUTTER_POSITION_LINES
import org.gtkkn.native.gtksource.GTK_SOURCE_VIEW_GUTTER_POSITION_MARKS
import org.gtkkn.native.gtksource.GtkSourceViewGutterPosition
import org.gtkkn.native.gtksource.gtk_source_view_gutter_position_get_type

public enum class ViewGutterPosition(public val nativeValue: GtkSourceViewGutterPosition) {
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
        public fun fromNativeValue(nativeValue: GtkSourceViewGutterPosition): ViewGutterPosition = when (nativeValue) {
            GTK_SOURCE_VIEW_GUTTER_POSITION_LINES -> LINES
            GTK_SOURCE_VIEW_GUTTER_POSITION_MARKS -> MARKS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ViewGutterPosition
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_view_gutter_position_get_type()
    }
}
