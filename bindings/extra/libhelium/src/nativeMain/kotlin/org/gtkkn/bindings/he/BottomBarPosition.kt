// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeBottomBarPosition
import org.gtkkn.native.he.HeBottomBarPosition.HE_BOTTOM_BAR_POSITION_LEFT
import org.gtkkn.native.he.HeBottomBarPosition.HE_BOTTOM_BAR_POSITION_RIGHT

public enum class BottomBarPosition(
    public val nativeValue: HeBottomBarPosition,
) {
    LEFT(HE_BOTTOM_BAR_POSITION_LEFT),
    RIGHT(HE_BOTTOM_BAR_POSITION_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeBottomBarPosition): BottomBarPosition =
            when (nativeValue) {
                HE_BOTTOM_BAR_POSITION_LEFT -> LEFT
                HE_BOTTOM_BAR_POSITION_RIGHT -> RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
