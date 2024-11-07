// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.native.gsk.GskLineCap

/**
 * Specifies how to render the start and end points of contours or
 * dashes when stroking.
 *
 * The default line cap style is `GSK_LINE_CAP_BUTT`.
 *
 * New entries may be added in future versions.
 *
 * <figure>
 *   <picture>
 *     <source srcset="caps-dark.png" media="(prefers-color-scheme: dark)">
 *     <img alt="Line Cap Styles" src="caps-light.png">
 *   </picture>
 *   <figcaption>GSK_LINE_CAP_BUTT, GSK_LINE_CAP_ROUND, GSK_LINE_CAP_SQUARE</figcaption>
 * </figure>
 * @since 4.14
 */
@GskVersion4_14
public enum class LineCap(
    public val nativeValue: GskLineCap,
) {
    /**
     * Start and stop the line exactly at the start
     *   and end point
     */
    BUTT(GskLineCap.GSK_LINE_CAP_BUTT),

    /**
     * Use a round ending, the center of the circle
     *   is the start or end point
     */
    ROUND(GskLineCap.GSK_LINE_CAP_ROUND),

    /**
     * use squared ending, the center of the square
     *   is the start or end point
     */
    SQUARE(GskLineCap.GSK_LINE_CAP_SQUARE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskLineCap): LineCap =
            when (nativeValue) {
                GskLineCap.GSK_LINE_CAP_BUTT -> BUTT
                GskLineCap.GSK_LINE_CAP_ROUND -> ROUND
                GskLineCap.GSK_LINE_CAP_SQUARE -> SQUARE
                else -> error("invalid nativeValue")
            }
    }
}
