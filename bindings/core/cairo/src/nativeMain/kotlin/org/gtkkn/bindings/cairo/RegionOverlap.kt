// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_region_overlap_get_type
import org.gtkkn.native.cairo.cairo_region_overlap_t
import org.gtkkn.native.gobject.GType

public enum class RegionOverlap(public val nativeValue: cairo_region_overlap_t) {
    IN(cairo_region_overlap_t.CAIRO_REGION_OVERLAP_IN),
    OUT(cairo_region_overlap_t.CAIRO_REGION_OVERLAP_OUT),
    PART(cairo_region_overlap_t.CAIRO_REGION_OVERLAP_PART),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_region_overlap_t): RegionOverlap = when (nativeValue) {
            cairo_region_overlap_t.CAIRO_REGION_OVERLAP_IN -> IN
            cairo_region_overlap_t.CAIRO_REGION_OVERLAP_OUT -> OUT
            cairo_region_overlap_t.CAIRO_REGION_OVERLAP_PART -> PART
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of RegionOverlap
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_region_overlap_get_type()
    }
}
