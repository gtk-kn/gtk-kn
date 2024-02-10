// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_filter_t
import org.gtkkn.native.cairo.cairo_filter_t.CAIRO_FILTER_BEST
import org.gtkkn.native.cairo.cairo_filter_t.CAIRO_FILTER_BILINEAR
import org.gtkkn.native.cairo.cairo_filter_t.CAIRO_FILTER_FAST
import org.gtkkn.native.cairo.cairo_filter_t.CAIRO_FILTER_GAUSSIAN
import org.gtkkn.native.cairo.cairo_filter_t.CAIRO_FILTER_GOOD
import org.gtkkn.native.cairo.cairo_filter_t.CAIRO_FILTER_NEAREST

public enum class Filter(
    public val nativeValue: cairo_filter_t,
) {
    FAST(CAIRO_FILTER_FAST),
    GOOD(CAIRO_FILTER_GOOD),
    BEST(CAIRO_FILTER_BEST),
    NEAREST(CAIRO_FILTER_NEAREST),
    BILINEAR(CAIRO_FILTER_BILINEAR),
    GAUSSIAN(CAIRO_FILTER_GAUSSIAN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_filter_t): Filter =
            when (nativeValue) {
                CAIRO_FILTER_FAST -> FAST
                CAIRO_FILTER_GOOD -> GOOD
                CAIRO_FILTER_BEST -> BEST
                CAIRO_FILTER_NEAREST -> NEAREST
                CAIRO_FILTER_BILINEAR -> BILINEAR
                CAIRO_FILTER_GAUSSIAN -> GAUSSIAN
                else -> error("invalid nativeValue")
            }
    }
}
