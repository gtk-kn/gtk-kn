// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_line_cap_t
import org.gtkkn.native.cairo.cairo_line_cap_t.CAIRO_LINE_CAP_BUTT
import org.gtkkn.native.cairo.cairo_line_cap_t.CAIRO_LINE_CAP_ROUND
import org.gtkkn.native.cairo.cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE

public enum class LineCap(
    public val nativeValue: cairo_line_cap_t,
) {
    BUTT(CAIRO_LINE_CAP_BUTT),
    ROUND(CAIRO_LINE_CAP_ROUND),
    SQUARE(CAIRO_LINE_CAP_SQUARE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_line_cap_t): LineCap =
            when (nativeValue) {
                CAIRO_LINE_CAP_BUTT -> BUTT
                CAIRO_LINE_CAP_ROUND -> ROUND
                CAIRO_LINE_CAP_SQUARE -> SQUARE
                else -> error("invalid nativeValue")
            }
    }
}
