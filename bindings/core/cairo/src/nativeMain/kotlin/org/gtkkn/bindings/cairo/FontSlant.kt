// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_slant_t
import org.gtkkn.native.cairo.cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC
import org.gtkkn.native.cairo.cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL
import org.gtkkn.native.cairo.cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE

public enum class FontSlant(
    public val nativeValue: cairo_font_slant_t,
) {
    NORMAL(CAIRO_FONT_SLANT_NORMAL),
    ITALIC(CAIRO_FONT_SLANT_ITALIC),
    OBLIQUE(CAIRO_FONT_SLANT_OBLIQUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_slant_t): FontSlant =
            when (nativeValue) {
                CAIRO_FONT_SLANT_NORMAL -> NORMAL
                CAIRO_FONT_SLANT_ITALIC -> ITALIC
                CAIRO_FONT_SLANT_OBLIQUE -> OBLIQUE
                else -> error("invalid nativeValue")
            }
    }
}
