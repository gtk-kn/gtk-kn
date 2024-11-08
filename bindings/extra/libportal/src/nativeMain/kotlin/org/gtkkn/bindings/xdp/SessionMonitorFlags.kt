// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpSessionMonitorFlags

public enum class SessionMonitorFlags(
    public val nativeValue: XdpSessionMonitorFlags,
) {
    NONE(XdpSessionMonitorFlags.XDP_SESSION_MONITOR_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpSessionMonitorFlags): SessionMonitorFlags =
            when (nativeValue) {
                XdpSessionMonitorFlags.XDP_SESSION_MONITOR_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
