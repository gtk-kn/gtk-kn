// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_path_data_type_get_type
import org.gtkkn.native.cairo.cairo_path_data_type_t
import org.gtkkn.native.gobject.GType

public enum class PathDataType(public val nativeValue: cairo_path_data_type_t) {
    MOVE_TO(cairo_path_data_type_t.CAIRO_PATH_MOVE_TO),
    LINE_TO(cairo_path_data_type_t.CAIRO_PATH_LINE_TO),
    CURVE_TO(cairo_path_data_type_t.CAIRO_PATH_CURVE_TO),
    CLOSE_PATH(cairo_path_data_type_t.CAIRO_PATH_CLOSE_PATH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_path_data_type_t): PathDataType = when (nativeValue) {
            cairo_path_data_type_t.CAIRO_PATH_MOVE_TO -> MOVE_TO
            cairo_path_data_type_t.CAIRO_PATH_LINE_TO -> LINE_TO
            cairo_path_data_type_t.CAIRO_PATH_CURVE_TO -> CURVE_TO
            cairo_path_data_type_t.CAIRO_PATH_CLOSE_PATH -> CLOSE_PATH
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PathDataType
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_path_data_type_get_type()
    }
}
