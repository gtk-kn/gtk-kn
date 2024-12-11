// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_slant_t
import org.gtkkn.native.cairo.cairo_gobject_font_slant_get_type
import org.gtkkn.native.gobject.GType

public enum class FontSlant(public val nativeValue: cairo_font_slant_t) {
    NORMAL(cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL),
    ITALIC(cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC),
    OBLIQUE(cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_slant_t): FontSlant = when (nativeValue) {
            cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL -> NORMAL
            cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC -> ITALIC
            cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE -> OBLIQUE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FontSlant
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_font_slant_get_type()
    }
}
