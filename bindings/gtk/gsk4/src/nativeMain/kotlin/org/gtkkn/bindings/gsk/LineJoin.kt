// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gsk.GskLineJoin
import org.gtkkn.native.gsk.GskLineJoin.GSK_LINE_JOIN_BEVEL
import org.gtkkn.native.gsk.GskLineJoin.GSK_LINE_JOIN_MITER
import org.gtkkn.native.gsk.GskLineJoin.GSK_LINE_JOIN_ROUND

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
public enum class LineJoin(
    public val nativeValue: GskLineJoin,
) {
    /**
     * Use a sharp angled corner
     */
    MITER(GSK_LINE_JOIN_MITER),

    /**
     * Use a round join, the center of the circle is
     *   the join point
     */
    ROUND(GSK_LINE_JOIN_ROUND),

    /**
     * use a cut-off join, the join is cut off at half
     *   the line width from the joint point
     */
    BEVEL(GSK_LINE_JOIN_BEVEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskLineJoin): LineJoin =
            when (nativeValue) {
                GSK_LINE_JOIN_MITER -> MITER
                GSK_LINE_JOIN_ROUND -> ROUND
                GSK_LINE_JOIN_BEVEL -> BEVEL
                else -> error("invalid nativeValue")
            }
    }
}
