// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_path_data_type_t

public enum class PathDataType(
    public val nativeValue: cairo_path_data_type_t,
) {
    MOVE_TO(cairo_path_data_type_t.CAIRO_PATH_MOVE_TO),
    LINE_TO(cairo_path_data_type_t.CAIRO_PATH_LINE_TO),
    CURVE_TO(cairo_path_data_type_t.CAIRO_PATH_CURVE_TO),
    CLOSE_PATH(cairo_path_data_type_t.CAIRO_PATH_CLOSE_PATH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_path_data_type_t): PathDataType =
            when (nativeValue) {
                cairo_path_data_type_t.CAIRO_PATH_MOVE_TO -> MOVE_TO
                cairo_path_data_type_t.CAIRO_PATH_LINE_TO -> LINE_TO
                cairo_path_data_type_t.CAIRO_PATH_CURVE_TO -> CURVE_TO
                cairo_path_data_type_t.CAIRO_PATH_CLOSE_PATH -> CLOSE_PATH
                else -> error("invalid nativeValue")
            }
    }
}
