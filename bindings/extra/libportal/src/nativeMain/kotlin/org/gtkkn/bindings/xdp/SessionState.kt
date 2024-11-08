// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpSessionState

/**
 * The state of a session.
 */
public enum class SessionState(
    public val nativeValue: XdpSessionState,
) {
    /**
     * the session has not been started.
     */
    INITIAL(XdpSessionState.XDP_SESSION_INITIAL),

    /**
     * the session is active.
     */
    ACTIVE(XdpSessionState.XDP_SESSION_ACTIVE),

    /**
     * the session is no longer active.
     */
    CLOSED(XdpSessionState.XDP_SESSION_CLOSED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpSessionState): SessionState =
            when (nativeValue) {
                XdpSessionState.XDP_SESSION_INITIAL -> INITIAL
                XdpSessionState.XDP_SESSION_ACTIVE -> ACTIVE
                XdpSessionState.XDP_SESSION_CLOSED -> CLOSED
                else -> error("invalid nativeValue")
            }
    }
}
