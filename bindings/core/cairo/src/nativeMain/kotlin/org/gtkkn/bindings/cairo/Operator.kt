// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_gobject_operator_get_type
import org.gtkkn.native.cairo.cairo_operator_t
import org.gtkkn.native.gobject.GType

public enum class Operator(public val nativeValue: cairo_operator_t) {
    CLEAR(cairo_operator_t.CAIRO_OPERATOR_CLEAR),
    SOURCE(cairo_operator_t.CAIRO_OPERATOR_SOURCE),
    OVER(cairo_operator_t.CAIRO_OPERATOR_OVER),
    IN(cairo_operator_t.CAIRO_OPERATOR_IN),
    OUT(cairo_operator_t.CAIRO_OPERATOR_OUT),
    ATOP(cairo_operator_t.CAIRO_OPERATOR_ATOP),
    DEST(cairo_operator_t.CAIRO_OPERATOR_DEST),
    DEST_OVER(cairo_operator_t.CAIRO_OPERATOR_DEST_OVER),
    DEST_IN(cairo_operator_t.CAIRO_OPERATOR_DEST_IN),
    DEST_OUT(cairo_operator_t.CAIRO_OPERATOR_DEST_OUT),
    DEST_ATOP(cairo_operator_t.CAIRO_OPERATOR_DEST_ATOP),
    XOR(cairo_operator_t.CAIRO_OPERATOR_XOR),
    ADD(cairo_operator_t.CAIRO_OPERATOR_ADD),
    SATURATE(cairo_operator_t.CAIRO_OPERATOR_SATURATE),
    MULTIPLY(cairo_operator_t.CAIRO_OPERATOR_MULTIPLY),
    SCREEN(cairo_operator_t.CAIRO_OPERATOR_SCREEN),
    OVERLAY(cairo_operator_t.CAIRO_OPERATOR_OVERLAY),
    DARKEN(cairo_operator_t.CAIRO_OPERATOR_DARKEN),
    LIGHTEN(cairo_operator_t.CAIRO_OPERATOR_LIGHTEN),
    COLOR_DODGE(cairo_operator_t.CAIRO_OPERATOR_COLOR_DODGE),
    COLOR_BURN(cairo_operator_t.CAIRO_OPERATOR_COLOR_BURN),
    HARD_LIGHT(cairo_operator_t.CAIRO_OPERATOR_HARD_LIGHT),
    SOFT_LIGHT(cairo_operator_t.CAIRO_OPERATOR_SOFT_LIGHT),
    DIFFERENCE(cairo_operator_t.CAIRO_OPERATOR_DIFFERENCE),
    EXCLUSION(cairo_operator_t.CAIRO_OPERATOR_EXCLUSION),
    HSL_HUE(cairo_operator_t.CAIRO_OPERATOR_HSL_HUE),
    HSL_SATURATION(cairo_operator_t.CAIRO_OPERATOR_HSL_SATURATION),
    HSL_COLOR(cairo_operator_t.CAIRO_OPERATOR_HSL_COLOR),
    HSL_LUMINOSITY(cairo_operator_t.CAIRO_OPERATOR_HSL_LUMINOSITY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_operator_t): Operator = when (nativeValue) {
            cairo_operator_t.CAIRO_OPERATOR_CLEAR -> CLEAR
            cairo_operator_t.CAIRO_OPERATOR_SOURCE -> SOURCE
            cairo_operator_t.CAIRO_OPERATOR_OVER -> OVER
            cairo_operator_t.CAIRO_OPERATOR_IN -> IN
            cairo_operator_t.CAIRO_OPERATOR_OUT -> OUT
            cairo_operator_t.CAIRO_OPERATOR_ATOP -> ATOP
            cairo_operator_t.CAIRO_OPERATOR_DEST -> DEST
            cairo_operator_t.CAIRO_OPERATOR_DEST_OVER -> DEST_OVER
            cairo_operator_t.CAIRO_OPERATOR_DEST_IN -> DEST_IN
            cairo_operator_t.CAIRO_OPERATOR_DEST_OUT -> DEST_OUT
            cairo_operator_t.CAIRO_OPERATOR_DEST_ATOP -> DEST_ATOP
            cairo_operator_t.CAIRO_OPERATOR_XOR -> XOR
            cairo_operator_t.CAIRO_OPERATOR_ADD -> ADD
            cairo_operator_t.CAIRO_OPERATOR_SATURATE -> SATURATE
            cairo_operator_t.CAIRO_OPERATOR_MULTIPLY -> MULTIPLY
            cairo_operator_t.CAIRO_OPERATOR_SCREEN -> SCREEN
            cairo_operator_t.CAIRO_OPERATOR_OVERLAY -> OVERLAY
            cairo_operator_t.CAIRO_OPERATOR_DARKEN -> DARKEN
            cairo_operator_t.CAIRO_OPERATOR_LIGHTEN -> LIGHTEN
            cairo_operator_t.CAIRO_OPERATOR_COLOR_DODGE -> COLOR_DODGE
            cairo_operator_t.CAIRO_OPERATOR_COLOR_BURN -> COLOR_BURN
            cairo_operator_t.CAIRO_OPERATOR_HARD_LIGHT -> HARD_LIGHT
            cairo_operator_t.CAIRO_OPERATOR_SOFT_LIGHT -> SOFT_LIGHT
            cairo_operator_t.CAIRO_OPERATOR_DIFFERENCE -> DIFFERENCE
            cairo_operator_t.CAIRO_OPERATOR_EXCLUSION -> EXCLUSION
            cairo_operator_t.CAIRO_OPERATOR_HSL_HUE -> HSL_HUE
            cairo_operator_t.CAIRO_OPERATOR_HSL_SATURATION -> HSL_SATURATION
            cairo_operator_t.CAIRO_OPERATOR_HSL_COLOR -> HSL_COLOR
            cairo_operator_t.CAIRO_OPERATOR_HSL_LUMINOSITY -> HSL_LUMINOSITY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Operator
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_operator_get_type()
    }
}
