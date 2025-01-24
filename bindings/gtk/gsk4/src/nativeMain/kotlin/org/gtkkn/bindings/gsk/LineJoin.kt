// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskLineJoin
import org.gtkkn.native.gsk.gsk_line_join_get_type

/**
 * Specifies how to render the junction of two lines when stroking.
 *
 * The default line join style is `GSK_LINE_JOIN_MITER`.
 *
 * New entries may be added in future versions.
 *
 * <figure>
 *   <picture>
 *     <source srcset="join-dark.png" media="(prefers-color-scheme: dark)">
 *     <img alt="Line Join Styles" src="join-light.png">
 *   </picture>
 *   <figcaption>GSK_LINE_JOINT_MITER, GSK_LINE_JOINT_ROUND, GSK_LINE_JOIN_BEVEL</figcaption>
 * </figure>
 * @since 4.14
 */
@GskVersion4_14
public enum class LineJoin(public val nativeValue: GskLineJoin) {
    /**
     * Use a sharp angled corner
     */
    MITER(GskLineJoin.GSK_LINE_JOIN_MITER),

    /**
     * Use a round join, the center of the circle is
     *   the join point
     */
    ROUND(GskLineJoin.GSK_LINE_JOIN_ROUND),

    /**
     * use a cut-off join, the join is cut off at half
     *   the line width from the joint point
     */
    BEVEL(GskLineJoin.GSK_LINE_JOIN_BEVEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskLineJoin): LineJoin = when (nativeValue) {
            GskLineJoin.GSK_LINE_JOIN_MITER -> MITER
            GskLineJoin.GSK_LINE_JOIN_ROUND -> ROUND
            GskLineJoin.GSK_LINE_JOIN_BEVEL -> BEVEL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LineJoin
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_line_join_get_type()
    }
}
