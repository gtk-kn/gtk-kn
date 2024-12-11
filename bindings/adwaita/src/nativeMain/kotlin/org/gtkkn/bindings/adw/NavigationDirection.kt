// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwNavigationDirection
import org.gtkkn.native.adw.adw_navigation_direction_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the direction of a swipe navigation gesture.
 */
public enum class NavigationDirection(public val nativeValue: AdwNavigationDirection) {
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
        public fun fromNativeValue(nativeValue: AdwNavigationDirection): NavigationDirection = when (nativeValue) {
            AdwNavigationDirection.ADW_NAVIGATION_DIRECTION_BACK -> BACK
            AdwNavigationDirection.ADW_NAVIGATION_DIRECTION_FORWARD -> FORWARD
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NavigationDirection
         *
         * @return the GType
         */
        public fun getType(): GType = adw_navigation_direction_get_type()
    }
}
