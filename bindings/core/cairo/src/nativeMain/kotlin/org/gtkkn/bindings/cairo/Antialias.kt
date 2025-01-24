// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_antialias_t
import org.gtkkn.native.cairo.cairo_gobject_antialias_get_type
import org.gtkkn.native.gobject.GType

public enum class Antialias(public val nativeValue: cairo_antialias_t) {
    DEFAULT(cairo_antialias_t.CAIRO_ANTIALIAS_DEFAULT),
    NONE(cairo_antialias_t.CAIRO_ANTIALIAS_NONE),
    GRAY(cairo_antialias_t.CAIRO_ANTIALIAS_GRAY),
    SUBPIXEL(cairo_antialias_t.CAIRO_ANTIALIAS_SUBPIXEL),
    FAST(cairo_antialias_t.CAIRO_ANTIALIAS_FAST),
    GOOD(cairo_antialias_t.CAIRO_ANTIALIAS_GOOD),
    BEST(cairo_antialias_t.CAIRO_ANTIALIAS_BEST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_antialias_t): Antialias = when (nativeValue) {
            cairo_antialias_t.CAIRO_ANTIALIAS_DEFAULT -> DEFAULT
            cairo_antialias_t.CAIRO_ANTIALIAS_NONE -> NONE
            cairo_antialias_t.CAIRO_ANTIALIAS_GRAY -> GRAY
            cairo_antialias_t.CAIRO_ANTIALIAS_SUBPIXEL -> SUBPIXEL
            cairo_antialias_t.CAIRO_ANTIALIAS_FAST -> FAST
            cairo_antialias_t.CAIRO_ANTIALIAS_GOOD -> GOOD
            cairo_antialias_t.CAIRO_ANTIALIAS_BEST -> BEST
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Antialias
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_antialias_get_type()
    }
}
