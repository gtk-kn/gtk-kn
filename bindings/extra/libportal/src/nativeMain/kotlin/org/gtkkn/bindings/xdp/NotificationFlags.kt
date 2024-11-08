// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpNotificationFlags

public enum class NotificationFlags(
    public val nativeValue: XdpNotificationFlags,
) {
    NONE(XdpNotificationFlags.XDP_NOTIFICATION_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpNotificationFlags): NotificationFlags =
            when (nativeValue) {
                XdpNotificationFlags.XDP_NOTIFICATION_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
