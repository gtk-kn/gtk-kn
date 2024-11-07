// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.bindings.atk.annotations.AtkVersion2_30
import org.gtkkn.native.atk.AtkScrollType

/**
 * Specifies where an object should be placed on the screen when using scroll_to.
 * @since 2.30
 */
@AtkVersion2_30
public enum class ScrollType(
    public val nativeValue: AtkScrollType,
) {
    /**
     * Scroll the object vertically and horizontally to bring
     *   its top left corner to the top left corner of the window.
     */
    TOP_LEFT(AtkScrollType.ATK_SCROLL_TOP_LEFT),

    /**
     * Scroll the object vertically and horizontally to
     *   bring its bottom right corner to the bottom right corner of the window.
     */
    BOTTOM_RIGHT(AtkScrollType.ATK_SCROLL_BOTTOM_RIGHT),

    /**
     * Scroll the object vertically to bring its top edge to
     *   the top edge of the window.
     */
    TOP_EDGE(AtkScrollType.ATK_SCROLL_TOP_EDGE),

    /**
     * Scroll the object vertically to bring its bottom
     *   edge to the bottom edge of the window.
     */
    BOTTOM_EDGE(AtkScrollType.ATK_SCROLL_BOTTOM_EDGE),

    /**
     * Scroll the object vertically and horizontally to bring
     *   its left edge to the left edge of the window.
     */
    LEFT_EDGE(AtkScrollType.ATK_SCROLL_LEFT_EDGE),

    /**
     * Scroll the object vertically and horizontally to
     *   bring its right edge to the right edge of the window.
     */
    RIGHT_EDGE(AtkScrollType.ATK_SCROLL_RIGHT_EDGE),

    /**
     * Scroll the object vertically and horizontally so that
     *   as much as possible of the object becomes visible. The exact placement is
     *   determined by the application.
     */
    ANYWHERE(AtkScrollType.ATK_SCROLL_ANYWHERE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkScrollType): ScrollType =
            when (nativeValue) {
                AtkScrollType.ATK_SCROLL_TOP_LEFT -> TOP_LEFT
                AtkScrollType.ATK_SCROLL_BOTTOM_RIGHT -> BOTTOM_RIGHT
                AtkScrollType.ATK_SCROLL_TOP_EDGE -> TOP_EDGE
                AtkScrollType.ATK_SCROLL_BOTTOM_EDGE -> BOTTOM_EDGE
                AtkScrollType.ATK_SCROLL_LEFT_EDGE -> LEFT_EDGE
                AtkScrollType.ATK_SCROLL_RIGHT_EDGE -> RIGHT_EDGE
                AtkScrollType.ATK_SCROLL_ANYWHERE -> ANYWHERE
                else -> error("invalid nativeValue")
            }
    }
}
