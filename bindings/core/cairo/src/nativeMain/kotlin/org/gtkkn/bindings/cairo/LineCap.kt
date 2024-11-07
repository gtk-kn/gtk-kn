// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_line_cap_t

public enum class LineCap(
    public val nativeValue: cairo_line_cap_t,
) {
    BUTT(cairo_line_cap_t.CAIRO_LINE_CAP_BUTT),
    ROUND(cairo_line_cap_t.CAIRO_LINE_CAP_ROUND),
    SQUARE(cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_line_cap_t): LineCap =
            when (nativeValue) {
                cairo_line_cap_t.CAIRO_LINE_CAP_BUTT -> BUTT
                cairo_line_cap_t.CAIRO_LINE_CAP_ROUND -> ROUND
                cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE -> SQUARE
                else -> error("invalid nativeValue")
            }
    }
}
