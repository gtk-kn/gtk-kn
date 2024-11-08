// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpLocationAccuracy

/**
 * The values of this enum indicate the desired level
 * of accuracy for location information.
 */
public enum class LocationAccuracy(
    public val nativeValue: XdpLocationAccuracy,
) {
    /**
     * No particular accuracy
     */
    NONE(XdpLocationAccuracy.XDP_LOCATION_ACCURACY_NONE),

    /**
     * Country-level accuracy
     */
    COUNTRY(XdpLocationAccuracy.XDP_LOCATION_ACCURACY_COUNTRY),

    /**
     * City-level accuracy
     */
    CITY(XdpLocationAccuracy.XDP_LOCATION_ACCURACY_CITY),

    /**
     * Neighborhood-level accuracy
     */
    NEIGHBORHOOD(XdpLocationAccuracy.XDP_LOCATION_ACCURACY_NEIGHBORHOOD),

    /**
     * Street-level accuracy
     */
    STREET(XdpLocationAccuracy.XDP_LOCATION_ACCURACY_STREET),

    /**
     * Maximum accuracy
     */
    EXACT(XdpLocationAccuracy.XDP_LOCATION_ACCURACY_EXACT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpLocationAccuracy): LocationAccuracy =
            when (nativeValue) {
                XdpLocationAccuracy.XDP_LOCATION_ACCURACY_NONE -> NONE
                XdpLocationAccuracy.XDP_LOCATION_ACCURACY_COUNTRY -> COUNTRY
                XdpLocationAccuracy.XDP_LOCATION_ACCURACY_CITY -> CITY
                XdpLocationAccuracy.XDP_LOCATION_ACCURACY_NEIGHBORHOOD -> NEIGHBORHOOD
                XdpLocationAccuracy.XDP_LOCATION_ACCURACY_STREET -> STREET
                XdpLocationAccuracy.XDP_LOCATION_ACCURACY_EXACT -> EXACT
                else -> error("invalid nativeValue")
            }
    }
}
