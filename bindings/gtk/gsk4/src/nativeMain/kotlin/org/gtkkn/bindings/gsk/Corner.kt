// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskCorner

/**
 * The corner indices used by `GskRoundedRect`.
 */
public enum class Corner(
    public val nativeValue: GskCorner,
) {
    /**
     * The top left corner
     */
    TOP_LEFT(GskCorner.GSK_CORNER_TOP_LEFT),

    /**
     * The top right corner
     */
    TOP_RIGHT(GskCorner.GSK_CORNER_TOP_RIGHT),

    /**
     * The bottom right corner
     */
    BOTTOM_RIGHT(GskCorner.GSK_CORNER_BOTTOM_RIGHT),

    /**
     * The bottom left corner
     */
    BOTTOM_LEFT(GskCorner.GSK_CORNER_BOTTOM_LEFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskCorner): Corner =
            when (nativeValue) {
                GskCorner.GSK_CORNER_TOP_LEFT -> TOP_LEFT
                GskCorner.GSK_CORNER_TOP_RIGHT -> TOP_RIGHT
                GskCorner.GSK_CORNER_BOTTOM_RIGHT -> BOTTOM_RIGHT
                GskCorner.GSK_CORNER_BOTTOM_LEFT -> BOTTOM_LEFT
                else -> error("invalid nativeValue")
            }
    }
}
