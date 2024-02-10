// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_direction_t
import org.gtkkn.native.harfbuzz.hb_direction_t.HB_DIRECTION_BTT
import org.gtkkn.native.harfbuzz.hb_direction_t.HB_DIRECTION_INVALID
import org.gtkkn.native.harfbuzz.hb_direction_t.HB_DIRECTION_LTR
import org.gtkkn.native.harfbuzz.hb_direction_t.HB_DIRECTION_RTL
import org.gtkkn.native.harfbuzz.hb_direction_t.HB_DIRECTION_TTB

/**
 * The direction of a text segment or buffer.
 *
 * A segment can also be tested for horizontal or vertical
 * orientation (irrespective of specific direction) with
 * HB_DIRECTION_IS_HORIZONTAL() or HB_DIRECTION_IS_VERTICAL().
 */
public enum class Direction(
    public val nativeValue: hb_direction_t,
) {
    /**
     * Initial, unset direction.
     */
    INVALID(HB_DIRECTION_INVALID),

    /**
     * Text is set horizontally from left to right.
     */
    LTR(HB_DIRECTION_LTR),

    /**
     * Text is set horizontally from right to left.
     */
    RTL(HB_DIRECTION_RTL),

    /**
     * Text is set vertically from top to bottom.
     */
    TTB(HB_DIRECTION_TTB),

    /**
     * Text is set vertically from bottom to top.
     */
    BTT(HB_DIRECTION_BTT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_direction_t): Direction =
            when (nativeValue) {
                HB_DIRECTION_INVALID -> INVALID
                HB_DIRECTION_LTR -> LTR
                HB_DIRECTION_RTL -> RTL
                HB_DIRECTION_TTB -> TTB
                HB_DIRECTION_BTT -> BTT
                else -> error("invalid nativeValue")
            }
    }
}
