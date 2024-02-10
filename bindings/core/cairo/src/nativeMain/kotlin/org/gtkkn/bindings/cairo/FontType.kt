// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_type_t
import org.gtkkn.native.cairo.cairo_font_type_t.CAIRO_FONT_TYPE_FT
import org.gtkkn.native.cairo.cairo_font_type_t.CAIRO_FONT_TYPE_QUARTZ
import org.gtkkn.native.cairo.cairo_font_type_t.CAIRO_FONT_TYPE_TOY
import org.gtkkn.native.cairo.cairo_font_type_t.CAIRO_FONT_TYPE_USER
import org.gtkkn.native.cairo.cairo_font_type_t.CAIRO_FONT_TYPE_WIN32

public enum class FontType(
    public val nativeValue: cairo_font_type_t,
) {
    TOY(CAIRO_FONT_TYPE_TOY),
    FT(CAIRO_FONT_TYPE_FT),
    WIN32(CAIRO_FONT_TYPE_WIN32),
    QUARTZ(CAIRO_FONT_TYPE_QUARTZ),
    USER(CAIRO_FONT_TYPE_USER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_type_t): FontType =
            when (nativeValue) {
                CAIRO_FONT_TYPE_TOY -> TOY
                CAIRO_FONT_TYPE_FT -> FT
                CAIRO_FONT_TYPE_WIN32 -> WIN32
                CAIRO_FONT_TYPE_QUARTZ -> QUARTZ
                CAIRO_FONT_TYPE_USER -> USER
                else -> error("invalid nativeValue")
            }
    }
}
