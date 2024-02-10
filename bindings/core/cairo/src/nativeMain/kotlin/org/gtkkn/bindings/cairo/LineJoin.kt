// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_line_join_t
import org.gtkkn.native.cairo.cairo_line_join_t.CAIRO_LINE_JOIN_BEVEL
import org.gtkkn.native.cairo.cairo_line_join_t.CAIRO_LINE_JOIN_MITER
import org.gtkkn.native.cairo.cairo_line_join_t.CAIRO_LINE_JOIN_ROUND

public enum class LineJoin(
    public val nativeValue: cairo_line_join_t,
) {
    MITER(CAIRO_LINE_JOIN_MITER),
    ROUND(CAIRO_LINE_JOIN_ROUND),
    BEVEL(CAIRO_LINE_JOIN_BEVEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_line_join_t): LineJoin =
            when (nativeValue) {
                CAIRO_LINE_JOIN_MITER -> MITER
                CAIRO_LINE_JOIN_ROUND -> ROUND
                CAIRO_LINE_JOIN_BEVEL -> BEVEL
                else -> error("invalid nativeValue")
            }
    }
}
