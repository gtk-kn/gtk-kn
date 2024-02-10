// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_pattern_type_t
import org.gtkkn.native.cairo.cairo_pattern_type_t.CAIRO_PATTERN_TYPE_LINEAR
import org.gtkkn.native.cairo.cairo_pattern_type_t.CAIRO_PATTERN_TYPE_MESH
import org.gtkkn.native.cairo.cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RADIAL
import org.gtkkn.native.cairo.cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RASTER_SOURCE
import org.gtkkn.native.cairo.cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SOLID
import org.gtkkn.native.cairo.cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SURFACE

public enum class PatternType(
    public val nativeValue: cairo_pattern_type_t,
) {
    SOLID(CAIRO_PATTERN_TYPE_SOLID),
    SURFACE(CAIRO_PATTERN_TYPE_SURFACE),
    LINEAR(CAIRO_PATTERN_TYPE_LINEAR),
    RADIAL(CAIRO_PATTERN_TYPE_RADIAL),
    MESH(CAIRO_PATTERN_TYPE_MESH),
    RASTER_SOURCE(CAIRO_PATTERN_TYPE_RASTER_SOURCE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_pattern_type_t): PatternType =
            when (nativeValue) {
                CAIRO_PATTERN_TYPE_SOLID -> SOLID
                CAIRO_PATTERN_TYPE_SURFACE -> SURFACE
                CAIRO_PATTERN_TYPE_LINEAR -> LINEAR
                CAIRO_PATTERN_TYPE_RADIAL -> RADIAL
                CAIRO_PATTERN_TYPE_MESH -> MESH
                CAIRO_PATTERN_TYPE_RASTER_SOURCE -> RASTER_SOURCE
                else -> error("invalid nativeValue")
            }
    }
}
