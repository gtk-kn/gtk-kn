// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoDirection
import org.gtkkn.native.pango.pango_direction_get_type

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
public enum class Direction(public val nativeValue: PangoDirection) {
    /**
     * A strong left-to-right direction
     */
    LTR(PangoDirection.PANGO_DIRECTION_LTR),

    /**
     * A strong right-to-left direction
     */
    RTL(PangoDirection.PANGO_DIRECTION_RTL),

    /**
     * Deprecated value; treated the
     *   same as `PANGO_DIRECTION_RTL`.
     */
    TTB_LTR(PangoDirection.PANGO_DIRECTION_TTB_LTR),

    /**
     * Deprecated value; treated the
     *   same as `PANGO_DIRECTION_LTR`
     */
    TTB_RTL(PangoDirection.PANGO_DIRECTION_TTB_RTL),

    /**
     * A weak left-to-right direction
     */
    WEAK_LTR(PangoDirection.PANGO_DIRECTION_WEAK_LTR),

    /**
     * A weak right-to-left direction
     */
    WEAK_RTL(PangoDirection.PANGO_DIRECTION_WEAK_RTL),

    /**
     * No direction specified
     */
    NEUTRAL(PangoDirection.PANGO_DIRECTION_NEUTRAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoDirection): Direction = when (nativeValue) {
            PangoDirection.PANGO_DIRECTION_LTR -> LTR
            PangoDirection.PANGO_DIRECTION_RTL -> RTL
            PangoDirection.PANGO_DIRECTION_TTB_LTR -> TTB_LTR
            PangoDirection.PANGO_DIRECTION_TTB_RTL -> TTB_RTL
            PangoDirection.PANGO_DIRECTION_WEAK_LTR -> WEAK_LTR
            PangoDirection.PANGO_DIRECTION_WEAK_RTL -> WEAK_RTL
            PangoDirection.PANGO_DIRECTION_NEUTRAL -> NEUTRAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Direction
         *
         * @return the GType
         */
        public fun getType(): GType = pango_direction_get_type()
    }
}
