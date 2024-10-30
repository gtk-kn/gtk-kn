// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwLeafletTransitionType
import org.gtkkn.native.adw.AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_OVER
import org.gtkkn.native.adw.AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_SLIDE
import org.gtkkn.native.adw.AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_UNDER

/**
 * Describes the possible transitions in a [class@Leaflet] widget.
 *
 * New values may be added to this enumeration over time.
 */
public enum class LeafletTransitionType(
    public val nativeValue: AdwLeafletTransitionType,
) {
    /**
     * Cover the old page or uncover the new page, sliding from or towards the end according to orientation, text direction and children order
     */
    OVER(ADW_LEAFLET_TRANSITION_TYPE_OVER),

    /**
     * Uncover the new page or cover the old page, sliding from or towards the start according to orientation, text direction and children order
     */
    UNDER(ADW_LEAFLET_TRANSITION_TYPE_UNDER),

    /**
     * Slide from left, right, up or down according to the orientation, text direction and the children order
     */
    SLIDE(ADW_LEAFLET_TRANSITION_TYPE_SLIDE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwLeafletTransitionType): LeafletTransitionType =
            when (nativeValue) {
                ADW_LEAFLET_TRANSITION_TYPE_OVER -> OVER
                ADW_LEAFLET_TRANSITION_TYPE_UNDER -> UNDER
                ADW_LEAFLET_TRANSITION_TYPE_SLIDE -> SLIDE
                else -> error("invalid nativeValue")
            }
    }
}
