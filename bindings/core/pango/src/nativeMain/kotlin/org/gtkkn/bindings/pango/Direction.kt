// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoDirection
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_LTR
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_NEUTRAL
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_RTL
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_TTB_LTR
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_TTB_RTL
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_WEAK_LTR
import org.gtkkn.native.pango.PangoDirection.PANGO_DIRECTION_WEAK_RTL

/**
 * `PangoDirection` represents a direction in the Unicode bidirectional
 * algorithm.
 *
 * Not every value in this enumeration makes sense for every usage of
 * `PangoDirection`; for example, the return value of [func@unichar_direction]
 * and [func@find_base_dir] cannot be `PANGO_DIRECTION_WEAK_LTR` or
 * `PANGO_DIRECTION_WEAK_RTL`, since every character is either neutral
 * or has a strong direction; on the other hand `PANGO_DIRECTION_NEUTRAL`
 * doesn't make sense to pass to [func@itemize_with_base_dir].
 *
 * The `PANGO_DIRECTION_TTB_LTR`, `PANGO_DIRECTION_TTB_RTL` values come from
 * an earlier interpretation of this enumeration as the writing direction
 * of a block of text and are no longer used. See `PangoGravity` for how
 * vertical text is handled in Pango.
 *
 * If you are interested in text direction, you should really use fribidi
 * directly. `PangoDirection` is only retained because it is used in some
 * public apis.
 */
public enum class Direction(
    public val nativeValue: PangoDirection,
) {
    /**
     * A strong left-to-right direction
     */
    LTR(PANGO_DIRECTION_LTR),

    /**
     * A strong right-to-left direction
     */
    RTL(PANGO_DIRECTION_RTL),

    /**
     * Deprecated value; treated the
     *   same as `PANGO_DIRECTION_RTL`.
     */
    TTB_LTR(PANGO_DIRECTION_TTB_LTR),

    /**
     * Deprecated value; treated the
     *   same as `PANGO_DIRECTION_LTR`
     */
    TTB_RTL(PANGO_DIRECTION_TTB_RTL),

    /**
     * A weak left-to-right direction
     */
    WEAK_LTR(PANGO_DIRECTION_WEAK_LTR),

    /**
     * A weak right-to-left direction
     */
    WEAK_RTL(PANGO_DIRECTION_WEAK_RTL),

    /**
     * No direction specified
     */
    NEUTRAL(PANGO_DIRECTION_NEUTRAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoDirection): Direction =
            when (nativeValue) {
                PANGO_DIRECTION_LTR -> LTR
                PANGO_DIRECTION_RTL -> RTL
                PANGO_DIRECTION_TTB_LTR -> TTB_LTR
                PANGO_DIRECTION_TTB_RTL -> TTB_RTL
                PANGO_DIRECTION_WEAK_LTR -> WEAK_LTR
                PANGO_DIRECTION_WEAK_RTL -> WEAK_RTL
                PANGO_DIRECTION_NEUTRAL -> NEUTRAL
                else -> error("invalid nativeValue")
            }
    }
}
