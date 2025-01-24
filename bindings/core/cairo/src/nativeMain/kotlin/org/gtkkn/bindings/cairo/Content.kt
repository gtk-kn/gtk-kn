// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.CAIRO_CONTENT_ALPHA
import org.gtkkn.native.cairo.CAIRO_CONTENT_COLOR
import org.gtkkn.native.cairo.CAIRO_CONTENT_COLOR_ALPHA
import org.gtkkn.native.cairo.cairo_content_t
import org.gtkkn.native.cairo.cairo_gobject_content_get_type
import org.gtkkn.native.gobject.GType

public enum class Content(public val nativeValue: cairo_content_t) {
    COLOR(CAIRO_CONTENT_COLOR),
    ALPHA(CAIRO_CONTENT_ALPHA),
    COLOR_ALPHA(CAIRO_CONTENT_COLOR_ALPHA),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_content_t): Content = when (nativeValue) {
            CAIRO_CONTENT_COLOR -> COLOR
            CAIRO_CONTENT_ALPHA -> ALPHA
            CAIRO_CONTENT_COLOR_ALPHA -> COLOR_ALPHA
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Content
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_content_get_type()
    }
}
