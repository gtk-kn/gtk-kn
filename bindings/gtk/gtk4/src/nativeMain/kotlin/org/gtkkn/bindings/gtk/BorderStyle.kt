// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkBorderStyle
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_DASHED
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_DOTTED
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_DOUBLE
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_GROOVE
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_HIDDEN
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_INSET
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_NONE
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_OUTSET
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_RIDGE
import org.gtkkn.native.gtk.GtkBorderStyle.GTK_BORDER_STYLE_SOLID

/**
 * Describes how the border of a UI element should be rendered.
 */
public enum class BorderStyle(
    public val nativeValue: GtkBorderStyle,
) {
    /**
     * No visible border
     */
    NONE(GTK_BORDER_STYLE_NONE),

    /**
     * Same as %GTK_BORDER_STYLE_NONE
     */
    HIDDEN(GTK_BORDER_STYLE_HIDDEN),

    /**
     * A single line segment
     */
    SOLID(GTK_BORDER_STYLE_SOLID),

    /**
     * Looks as if the content is sunken into the canvas
     */
    INSET(GTK_BORDER_STYLE_INSET),

    /**
     * Looks as if the content is coming out of the canvas
     */
    OUTSET(GTK_BORDER_STYLE_OUTSET),

    /**
     * A series of round dots
     */
    DOTTED(GTK_BORDER_STYLE_DOTTED),

    /**
     * A series of square-ended dashes
     */
    DASHED(GTK_BORDER_STYLE_DASHED),

    /**
     * Two parallel lines with some space between them
     */
    DOUBLE(GTK_BORDER_STYLE_DOUBLE),

    /**
     * Looks as if it were carved in the canvas
     */
    GROOVE(GTK_BORDER_STYLE_GROOVE),

    /**
     * Looks as if it were coming out of the canvas
     */
    RIDGE(GTK_BORDER_STYLE_RIDGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkBorderStyle): BorderStyle =
            when (nativeValue) {
                GTK_BORDER_STYLE_NONE -> NONE
                GTK_BORDER_STYLE_HIDDEN -> HIDDEN
                GTK_BORDER_STYLE_SOLID -> SOLID
                GTK_BORDER_STYLE_INSET -> INSET
                GTK_BORDER_STYLE_OUTSET -> OUTSET
                GTK_BORDER_STYLE_DOTTED -> DOTTED
                GTK_BORDER_STYLE_DASHED -> DASHED
                GTK_BORDER_STYLE_DOUBLE -> DOUBLE
                GTK_BORDER_STYLE_GROOVE -> GROOVE
                GTK_BORDER_STYLE_RIDGE -> RIDGE
                else -> error("invalid nativeValue")
            }
    }
}
