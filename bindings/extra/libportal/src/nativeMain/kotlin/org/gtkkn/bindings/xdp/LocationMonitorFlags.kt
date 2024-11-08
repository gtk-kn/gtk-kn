// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpLocationMonitorFlags

public enum class LocationMonitorFlags(
    public val nativeValue: XdpLocationMonitorFlags,
) {
    NONE(XdpLocationMonitorFlags.XDP_LOCATION_MONITOR_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpLocationMonitorFlags): LocationMonitorFlags =
            when (nativeValue) {
                XdpLocationMonitorFlags.XDP_LOCATION_MONITOR_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
