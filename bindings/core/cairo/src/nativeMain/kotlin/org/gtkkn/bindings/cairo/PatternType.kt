// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_pattern_type_get_type
import org.gtkkn.native.cairo.cairo_pattern_type_t
import org.gtkkn.native.gobject.GType

public enum class PatternType(public val nativeValue: cairo_pattern_type_t) {
    SOLID(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SOLID),
    SURFACE(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SURFACE),
    LINEAR(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_LINEAR),
    RADIAL(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RADIAL),
    MESH(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_MESH),
    RASTER_SOURCE(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RASTER_SOURCE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_pattern_type_t): PatternType = when (nativeValue) {
            cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SOLID -> SOLID
            cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SURFACE -> SURFACE
            cairo_pattern_type_t.CAIRO_PATTERN_TYPE_LINEAR -> LINEAR
            cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RADIAL -> RADIAL
            cairo_pattern_type_t.CAIRO_PATTERN_TYPE_MESH -> MESH
            cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RASTER_SOURCE -> RASTER_SOURCE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PatternType
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_pattern_type_get_type()
    }
}
