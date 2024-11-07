// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_filter_t

public enum class Filter(
    public val nativeValue: cairo_filter_t,
) {
    FAST(cairo_filter_t.CAIRO_FILTER_FAST),
    GOOD(cairo_filter_t.CAIRO_FILTER_GOOD),
    BEST(cairo_filter_t.CAIRO_FILTER_BEST),
    NEAREST(cairo_filter_t.CAIRO_FILTER_NEAREST),
    BILINEAR(cairo_filter_t.CAIRO_FILTER_BILINEAR),
    GAUSSIAN(cairo_filter_t.CAIRO_FILTER_GAUSSIAN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_filter_t): Filter =
            when (nativeValue) {
                cairo_filter_t.CAIRO_FILTER_FAST -> FAST
                cairo_filter_t.CAIRO_FILTER_GOOD -> GOOD
                cairo_filter_t.CAIRO_FILTER_BEST -> BEST
                cairo_filter_t.CAIRO_FILTER_NEAREST -> NEAREST
                cairo_filter_t.CAIRO_FILTER_BILINEAR -> BILINEAR
                cairo_filter_t.CAIRO_FILTER_GAUSSIAN -> GAUSSIAN
                else -> error("invalid nativeValue")
            }
    }
}
