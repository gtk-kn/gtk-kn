// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskCorner
import org.gtkkn.native.gsk.GskCorner.GSK_CORNER_BOTTOM_LEFT
import org.gtkkn.native.gsk.GskCorner.GSK_CORNER_BOTTOM_RIGHT
import org.gtkkn.native.gsk.GskCorner.GSK_CORNER_TOP_LEFT
import org.gtkkn.native.gsk.GskCorner.GSK_CORNER_TOP_RIGHT

/**
 * The corner indices used by `GskRoundedRect`.
 */
public enum class Corner(
    public val nativeValue: GskCorner,
) {
    /**
     * The top left corner
     */
    TOP_LEFT(GSK_CORNER_TOP_LEFT),

    /**
     * The top right corner
     */
    TOP_RIGHT(GSK_CORNER_TOP_RIGHT),

    /**
     * The bottom right corner
     */
    BOTTOM_RIGHT(GSK_CORNER_BOTTOM_RIGHT),

    /**
     * The bottom left corner
     */
    BOTTOM_LEFT(GSK_CORNER_BOTTOM_LEFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskCorner): Corner =
            when (nativeValue) {
                GSK_CORNER_TOP_LEFT -> TOP_LEFT
                GSK_CORNER_TOP_RIGHT -> TOP_RIGHT
                GSK_CORNER_BOTTOM_RIGHT -> BOTTOM_RIGHT
                GSK_CORNER_BOTTOM_LEFT -> BOTTOM_LEFT
                else -> error("invalid nativeValue")
            }
    }
}
