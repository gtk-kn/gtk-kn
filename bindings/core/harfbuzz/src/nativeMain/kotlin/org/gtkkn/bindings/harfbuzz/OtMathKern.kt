// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_ot_math_kern_t
import org.gtkkn.native.harfbuzz.hb_ot_math_kern_t.HB_OT_MATH_KERN_BOTTOM_LEFT
import org.gtkkn.native.harfbuzz.hb_ot_math_kern_t.HB_OT_MATH_KERN_BOTTOM_RIGHT
import org.gtkkn.native.harfbuzz.hb_ot_math_kern_t.HB_OT_MATH_KERN_TOP_LEFT
import org.gtkkn.native.harfbuzz.hb_ot_math_kern_t.HB_OT_MATH_KERN_TOP_RIGHT

/**
 * The math kerning-table types defined for the four corners
 * of a glyph.
 * @since 1.3.3
 */
public enum class OtMathKern(
    public val nativeValue: hb_ot_math_kern_t,
) {
    TOP_RIGHT(HB_OT_MATH_KERN_TOP_RIGHT),
    TOP_LEFT(HB_OT_MATH_KERN_TOP_LEFT),
    BOTTOM_RIGHT(HB_OT_MATH_KERN_BOTTOM_RIGHT),
    BOTTOM_LEFT(HB_OT_MATH_KERN_BOTTOM_LEFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_ot_math_kern_t): OtMathKern =
            when (nativeValue) {
                HB_OT_MATH_KERN_TOP_RIGHT -> TOP_RIGHT
                HB_OT_MATH_KERN_TOP_LEFT -> TOP_LEFT
                HB_OT_MATH_KERN_BOTTOM_RIGHT -> BOTTOM_RIGHT
                HB_OT_MATH_KERN_BOTTOM_LEFT -> BOTTOM_LEFT
                else -> error("invalid nativeValue")
            }
    }
}
