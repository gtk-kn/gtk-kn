// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwNavigationDirection

/**
 * Describes the direction of a swipe navigation gesture.
 */
public enum class NavigationDirection(
    public val nativeValue: AdwNavigationDirection,
) {
    /**
     * Corresponds to start or top, depending on orientation and text direction
     */
    BACK(AdwNavigationDirection.ADW_NAVIGATION_DIRECTION_BACK),

    /**
     * Corresponds to end or bottom, depending on orientation and text direction
     */
    FORWARD(AdwNavigationDirection.ADW_NAVIGATION_DIRECTION_FORWARD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwNavigationDirection): NavigationDirection =
            when (nativeValue) {
                AdwNavigationDirection.ADW_NAVIGATION_DIRECTION_BACK -> BACK
                AdwNavigationDirection.ADW_NAVIGATION_DIRECTION_FORWARD -> FORWARD
                else -> error("invalid nativeValue")
            }
    }
}
