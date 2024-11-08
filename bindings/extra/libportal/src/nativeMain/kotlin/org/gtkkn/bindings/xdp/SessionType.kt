// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpSessionType

/**
 * The type of a session.
 */
public enum class SessionType(
    public val nativeValue: XdpSessionType,
) {
    /**
     * a screencast session.
     */
    SCREENCAST(XdpSessionType.XDP_SESSION_SCREENCAST),

    /**
     * a remote desktop session.
     */
    REMOTE_DESKTOP(XdpSessionType.XDP_SESSION_REMOTE_DESKTOP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpSessionType): SessionType =
            when (nativeValue) {
                XdpSessionType.XDP_SESSION_SCREENCAST -> SCREENCAST
                XdpSessionType.XDP_SESSION_REMOTE_DESKTOP -> REMOTE_DESKTOP
                else -> error("invalid nativeValue")
            }
    }
}
