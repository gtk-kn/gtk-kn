// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_slant_t

public enum class FontSlant(
    public val nativeValue: cairo_font_slant_t,
) {
    NORMAL(cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL),
    ITALIC(cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC),
    OBLIQUE(cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_slant_t): FontSlant =
            when (nativeValue) {
                cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL -> NORMAL
                cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC -> ITALIC
                cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE -> OBLIQUE
                else -> error("invalid nativeValue")
            }
    }
}
