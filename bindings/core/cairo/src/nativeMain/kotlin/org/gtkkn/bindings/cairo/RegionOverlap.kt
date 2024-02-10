// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_region_overlap_t
import org.gtkkn.native.cairo.cairo_region_overlap_t.CAIRO_REGION_OVERLAP_IN
import org.gtkkn.native.cairo.cairo_region_overlap_t.CAIRO_REGION_OVERLAP_OUT
import org.gtkkn.native.cairo.cairo_region_overlap_t.CAIRO_REGION_OVERLAP_PART

public enum class RegionOverlap(
    public val nativeValue: cairo_region_overlap_t,
) {
    IN(CAIRO_REGION_OVERLAP_IN),
    OUT(CAIRO_REGION_OVERLAP_OUT),
    PART(CAIRO_REGION_OVERLAP_PART),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_region_overlap_t): RegionOverlap =
            when (nativeValue) {
                CAIRO_REGION_OVERLAP_IN -> IN
                CAIRO_REGION_OVERLAP_OUT -> OUT
                CAIRO_REGION_OVERLAP_PART -> PART
                else -> error("invalid nativeValue")
            }
    }
}
