// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.native.cairo.cairo_operator_t
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_ADD
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_ATOP
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_CLEAR
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_COLOR_BURN
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_COLOR_DODGE
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DARKEN
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DEST
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DEST_ATOP
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DEST_IN
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DEST_OUT
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DEST_OVER
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_DIFFERENCE
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_EXCLUSION
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_HARD_LIGHT
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_HSL_COLOR
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_HSL_HUE
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_HSL_LUMINOSITY
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_HSL_SATURATION
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_IN
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_LIGHTEN
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_MULTIPLY
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_OUT
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_OVER
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_OVERLAY
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_SATURATE
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_SCREEN
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_SOFT_LIGHT
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_SOURCE
import org.gtkkn.native.cairo.cairo_operator_t.CAIRO_OPERATOR_XOR

public enum class Operator(
    public val nativeValue: cairo_operator_t,
) {
    CLEAR(CAIRO_OPERATOR_CLEAR),
    SOURCE(CAIRO_OPERATOR_SOURCE),
    OVER(CAIRO_OPERATOR_OVER),
    IN(CAIRO_OPERATOR_IN),
    OUT(CAIRO_OPERATOR_OUT),
    ATOP(CAIRO_OPERATOR_ATOP),
    DEST(CAIRO_OPERATOR_DEST),
    DEST_OVER(CAIRO_OPERATOR_DEST_OVER),
    DEST_IN(CAIRO_OPERATOR_DEST_IN),
    DEST_OUT(CAIRO_OPERATOR_DEST_OUT),
    DEST_ATOP(CAIRO_OPERATOR_DEST_ATOP),
    XOR(CAIRO_OPERATOR_XOR),
    ADD(CAIRO_OPERATOR_ADD),
    SATURATE(CAIRO_OPERATOR_SATURATE),
    MULTIPLY(CAIRO_OPERATOR_MULTIPLY),
    SCREEN(CAIRO_OPERATOR_SCREEN),
    OVERLAY(CAIRO_OPERATOR_OVERLAY),
    DARKEN(CAIRO_OPERATOR_DARKEN),
    LIGHTEN(CAIRO_OPERATOR_LIGHTEN),
    COLOR_DODGE(CAIRO_OPERATOR_COLOR_DODGE),
    COLOR_BURN(CAIRO_OPERATOR_COLOR_BURN),
    HARD_LIGHT(CAIRO_OPERATOR_HARD_LIGHT),
    SOFT_LIGHT(CAIRO_OPERATOR_SOFT_LIGHT),
    DIFFERENCE(CAIRO_OPERATOR_DIFFERENCE),
    EXCLUSION(CAIRO_OPERATOR_EXCLUSION),
    HSL_HUE(CAIRO_OPERATOR_HSL_HUE),
    HSL_SATURATION(CAIRO_OPERATOR_HSL_SATURATION),
    HSL_COLOR(CAIRO_OPERATOR_HSL_COLOR),
    HSL_LUMINOSITY(CAIRO_OPERATOR_HSL_LUMINOSITY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_operator_t): Operator =
            when (nativeValue) {
                CAIRO_OPERATOR_CLEAR -> CLEAR
                CAIRO_OPERATOR_SOURCE -> SOURCE
                CAIRO_OPERATOR_OVER -> OVER
                CAIRO_OPERATOR_IN -> IN
                CAIRO_OPERATOR_OUT -> OUT
                CAIRO_OPERATOR_ATOP -> ATOP
                CAIRO_OPERATOR_DEST -> DEST
                CAIRO_OPERATOR_DEST_OVER -> DEST_OVER
                CAIRO_OPERATOR_DEST_IN -> DEST_IN
                CAIRO_OPERATOR_DEST_OUT -> DEST_OUT
                CAIRO_OPERATOR_DEST_ATOP -> DEST_ATOP
                CAIRO_OPERATOR_XOR -> XOR
                CAIRO_OPERATOR_ADD -> ADD
                CAIRO_OPERATOR_SATURATE -> SATURATE
                CAIRO_OPERATOR_MULTIPLY -> MULTIPLY
                CAIRO_OPERATOR_SCREEN -> SCREEN
                CAIRO_OPERATOR_OVERLAY -> OVERLAY
                CAIRO_OPERATOR_DARKEN -> DARKEN
                CAIRO_OPERATOR_LIGHTEN -> LIGHTEN
                CAIRO_OPERATOR_COLOR_DODGE -> COLOR_DODGE
                CAIRO_OPERATOR_COLOR_BURN -> COLOR_BURN
                CAIRO_OPERATOR_HARD_LIGHT -> HARD_LIGHT
                CAIRO_OPERATOR_SOFT_LIGHT -> SOFT_LIGHT
                CAIRO_OPERATOR_DIFFERENCE -> DIFFERENCE
                CAIRO_OPERATOR_EXCLUSION -> EXCLUSION
                CAIRO_OPERATOR_HSL_HUE -> HSL_HUE
                CAIRO_OPERATOR_HSL_SATURATION -> HSL_SATURATION
                CAIRO_OPERATOR_HSL_COLOR -> HSL_COLOR
                CAIRO_OPERATOR_HSL_LUMINOSITY -> HSL_LUMINOSITY
                else -> error("invalid nativeValue")
            }
    }
}
