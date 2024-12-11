// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBorderStyle
import org.gtkkn.native.gtk.gtk_border_style_get_type

/**
 * Describes how the border of a UI element should be rendered.
 */
public enum class BorderStyle(public val nativeValue: GtkBorderStyle) {
    /**
     * No visible border
     */
    NONE(GtkBorderStyle.GTK_BORDER_STYLE_NONE),

    /**
     * Same as %GTK_BORDER_STYLE_NONE
     */
    HIDDEN(GtkBorderStyle.GTK_BORDER_STYLE_HIDDEN),

    /**
     * A single line segment
     */
    SOLID(GtkBorderStyle.GTK_BORDER_STYLE_SOLID),

    /**
     * Looks as if the content is sunken into the canvas
     */
    INSET(GtkBorderStyle.GTK_BORDER_STYLE_INSET),

    /**
     * Looks as if the content is coming out of the canvas
     */
    OUTSET(GtkBorderStyle.GTK_BORDER_STYLE_OUTSET),

    /**
     * A series of round dots
     */
    DOTTED(GtkBorderStyle.GTK_BORDER_STYLE_DOTTED),

    /**
     * A series of square-ended dashes
     */
    DASHED(GtkBorderStyle.GTK_BORDER_STYLE_DASHED),

    /**
     * Two parallel lines with some space between them
     */
    DOUBLE(GtkBorderStyle.GTK_BORDER_STYLE_DOUBLE),

    /**
     * Looks as if it were carved in the canvas
     */
    GROOVE(GtkBorderStyle.GTK_BORDER_STYLE_GROOVE),

    /**
     * Looks as if it were coming out of the canvas
     */
    RIDGE(GtkBorderStyle.GTK_BORDER_STYLE_RIDGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkBorderStyle): BorderStyle = when (nativeValue) {
            GtkBorderStyle.GTK_BORDER_STYLE_NONE -> NONE
            GtkBorderStyle.GTK_BORDER_STYLE_HIDDEN -> HIDDEN
            GtkBorderStyle.GTK_BORDER_STYLE_SOLID -> SOLID
            GtkBorderStyle.GTK_BORDER_STYLE_INSET -> INSET
            GtkBorderStyle.GTK_BORDER_STYLE_OUTSET -> OUTSET
            GtkBorderStyle.GTK_BORDER_STYLE_DOTTED -> DOTTED
            GtkBorderStyle.GTK_BORDER_STYLE_DASHED -> DASHED
            GtkBorderStyle.GTK_BORDER_STYLE_DOUBLE -> DOUBLE
            GtkBorderStyle.GTK_BORDER_STYLE_GROOVE -> GROOVE
            GtkBorderStyle.GTK_BORDER_STYLE_RIDGE -> RIDGE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of BorderStyle
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_border_style_get_type()
    }
}
