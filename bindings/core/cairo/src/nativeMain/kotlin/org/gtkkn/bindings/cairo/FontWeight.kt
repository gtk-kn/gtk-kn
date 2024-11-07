// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_font_weight_t

public enum class FontWeight(
    public val nativeValue: cairo_font_weight_t,
) {
    NORMAL(cairo_font_weight_t.CAIRO_FONT_WEIGHT_NORMAL),
    BOLD(cairo_font_weight_t.CAIRO_FONT_WEIGHT_BOLD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_font_weight_t): FontWeight =
            when (nativeValue) {
                cairo_font_weight_t.CAIRO_FONT_WEIGHT_NORMAL -> NORMAL
                cairo_font_weight_t.CAIRO_FONT_WEIGHT_BOLD -> BOLD
                else -> error("invalid nativeValue")
            }
    }
}
