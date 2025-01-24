// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_line_join_get_type
import org.gtkkn.native.cairo.cairo_line_join_t
import org.gtkkn.native.gobject.GType

public enum class LineJoin(public val nativeValue: cairo_line_join_t) {
    MITER(cairo_line_join_t.CAIRO_LINE_JOIN_MITER),
    ROUND(cairo_line_join_t.CAIRO_LINE_JOIN_ROUND),
    BEVEL(cairo_line_join_t.CAIRO_LINE_JOIN_BEVEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_line_join_t): LineJoin = when (nativeValue) {
            cairo_line_join_t.CAIRO_LINE_JOIN_MITER -> MITER
            cairo_line_join_t.CAIRO_LINE_JOIN_ROUND -> ROUND
            cairo_line_join_t.CAIRO_LINE_JOIN_BEVEL -> BEVEL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LineJoin
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_line_join_get_type()
    }
}
