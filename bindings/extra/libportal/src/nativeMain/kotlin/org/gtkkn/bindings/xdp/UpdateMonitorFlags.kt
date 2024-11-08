// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpUpdateMonitorFlags

public enum class UpdateMonitorFlags(
    public val nativeValue: XdpUpdateMonitorFlags,
) {
    NONE(XdpUpdateMonitorFlags.XDP_UPDATE_MONITOR_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpUpdateMonitorFlags): UpdateMonitorFlags =
            when (nativeValue) {
                XdpUpdateMonitorFlags.XDP_UPDATE_MONITOR_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
