// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskFillRule
import org.gtkkn.native.gsk.gsk_fill_rule_get_type

/**
 * `GskFillRule` is used to select how paths are filled.
 *
 * Whether or not a point is included in the fill is determined by taking
 * a ray from that point to infinity and looking at intersections with the
 * path. The ray can be in any direction, as long as it doesn't pass through
 * the end point of a segment or have a tricky intersection such as
 * intersecting tangent to the path.
 *
 * (Note that filling is not actually implemented in this way. This
 * is just a description of the rule that is applied.)
 *
 * New entries may be added in future versions.
 * @since 4.14
 */
@GskVersion4_14
public enum class FillRule(public val nativeValue: GskFillRule) {
    /**
     * If the path crosses the ray from
     *   left-to-right, counts +1. If the path crosses the ray
     *   from right to left, counts -1. (Left and right are determined
     *   from the perspective of looking along the ray from the starting
     *   point.) If the total count is non-zero, the point will be filled.
     */
    WINDING(GskFillRule.GSK_FILL_RULE_WINDING),

    /**
     * Counts the total number of
     *   intersections, without regard to the orientation of the contour. If
     *   the total number of intersections is odd, the point will be
     *   filled.
     */
    EVEN_ODD(GskFillRule.GSK_FILL_RULE_EVEN_ODD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskFillRule): FillRule = when (nativeValue) {
            GskFillRule.GSK_FILL_RULE_WINDING -> WINDING
            GskFillRule.GSK_FILL_RULE_EVEN_ODD -> EVEN_ODD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FillRule
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_fill_rule_get_type()
    }
}
