// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_18
import org.gtkkn.native.cairo.cairo_color_mode_t

/**
 *
 * @since 1.18
 */
@CairoVersion1_18
public enum class ColorMode(public val nativeValue: cairo_color_mode_t) {
    DEFAULT(cairo_color_mode_t.CAIRO_COLOR_MODE_DEFAULT),
    NO_COLOR(cairo_color_mode_t.CAIRO_COLOR_MODE_NO_COLOR),
    COLOR(cairo_color_mode_t.CAIRO_COLOR_MODE_COLOR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_color_mode_t): ColorMode = when (nativeValue) {
            cairo_color_mode_t.CAIRO_COLOR_MODE_DEFAULT -> DEFAULT
            cairo_color_mode_t.CAIRO_COLOR_MODE_NO_COLOR -> NO_COLOR
            cairo_color_mode_t.CAIRO_COLOR_MODE_COLOR -> COLOR
            else -> error("invalid nativeValue")
        }
    }
}
