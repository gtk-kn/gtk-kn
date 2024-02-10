// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_antialias_t
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_BEST
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_DEFAULT
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_FAST
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_GOOD
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_GRAY
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_NONE
import org.gtkkn.native.cairo.cairo_antialias_t.CAIRO_ANTIALIAS_SUBPIXEL

public enum class Antialias(
    public val nativeValue: cairo_antialias_t,
) {
    DEFAULT(CAIRO_ANTIALIAS_DEFAULT),
    NONE(CAIRO_ANTIALIAS_NONE),
    GRAY(CAIRO_ANTIALIAS_GRAY),
    SUBPIXEL(CAIRO_ANTIALIAS_SUBPIXEL),
    FAST(CAIRO_ANTIALIAS_FAST),
    GOOD(CAIRO_ANTIALIAS_GOOD),
    BEST(CAIRO_ANTIALIAS_BEST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_antialias_t): Antialias =
            when (nativeValue) {
                CAIRO_ANTIALIAS_DEFAULT -> DEFAULT
                CAIRO_ANTIALIAS_NONE -> NONE
                CAIRO_ANTIALIAS_GRAY -> GRAY
                CAIRO_ANTIALIAS_SUBPIXEL -> SUBPIXEL
                CAIRO_ANTIALIAS_FAST -> FAST
                CAIRO_ANTIALIAS_GOOD -> GOOD
                CAIRO_ANTIALIAS_BEST -> BEST
                else -> error("invalid nativeValue")
            }
    }
}
