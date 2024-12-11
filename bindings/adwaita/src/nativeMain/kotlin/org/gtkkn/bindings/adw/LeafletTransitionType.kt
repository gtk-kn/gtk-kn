// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwLeafletTransitionType
import org.gtkkn.native.adw.adw_leaflet_transition_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the possible transitions in a [class@Leaflet] widget.
 *
 * New values may be added to this enumeration over time.
 */
public enum class LeafletTransitionType(public val nativeValue: AdwLeafletTransitionType) {
    /**
     * Cover the old page or uncover the new page, sliding from or towards the end according to orientation, text direction and children order
     */
    OVER(AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_OVER),

    /**
     * Uncover the new page or cover the old page, sliding from or towards the start according to orientation, text direction and children order
     */
    UNDER(AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_UNDER),

    /**
     * Slide from left, right, up or down according to the orientation, text direction and the children order
     */
    SLIDE(AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_SLIDE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwLeafletTransitionType): LeafletTransitionType = when (nativeValue) {
            AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_OVER -> OVER
            AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_UNDER -> UNDER
            AdwLeafletTransitionType.ADW_LEAFLET_TRANSITION_TYPE_SLIDE -> SLIDE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LeafletTransitionType
         *
         * @return the GType
         */
        public fun getType(): GType = adw_leaflet_transition_type_get_type()
    }
}
