// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_line_cap_get_type
import org.gtkkn.native.cairo.cairo_line_cap_t
import org.gtkkn.native.gobject.GType

public enum class LineCap(public val nativeValue: cairo_line_cap_t) {
    BUTT(cairo_line_cap_t.CAIRO_LINE_CAP_BUTT),
    ROUND(cairo_line_cap_t.CAIRO_LINE_CAP_ROUND),
    SQUARE(cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_line_cap_t): LineCap = when (nativeValue) {
            cairo_line_cap_t.CAIRO_LINE_CAP_BUTT -> BUTT
            cairo_line_cap_t.CAIRO_LINE_CAP_ROUND -> ROUND
            cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE -> SQUARE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LineCap
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_line_cap_get_type()
    }
}
