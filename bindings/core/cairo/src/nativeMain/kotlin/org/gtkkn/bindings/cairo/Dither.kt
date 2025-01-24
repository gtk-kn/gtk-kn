// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.native.cairo.cairo_dither_t

/**
 *
 * @since 1.18
 */
@CairoVersion1_18
public enum class Dither(public val nativeValue: cairo_dither_t) {
    NONE(cairo_dither_t.CAIRO_DITHER_NONE),
    DEFAULT(cairo_dither_t.CAIRO_DITHER_DEFAULT),
    FAST(cairo_dither_t.CAIRO_DITHER_FAST),
    GOOD(cairo_dither_t.CAIRO_DITHER_GOOD),
    BEST(cairo_dither_t.CAIRO_DITHER_BEST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_dither_t): Dither = when (nativeValue) {
            cairo_dither_t.CAIRO_DITHER_NONE -> NONE
            cairo_dither_t.CAIRO_DITHER_DEFAULT -> DEFAULT
            cairo_dither_t.CAIRO_DITHER_FAST -> FAST
            cairo_dither_t.CAIRO_DITHER_GOOD -> GOOD
            cairo_dither_t.CAIRO_DITHER_BEST -> BEST
            else -> error("invalid nativeValue")
        }
    }
}
