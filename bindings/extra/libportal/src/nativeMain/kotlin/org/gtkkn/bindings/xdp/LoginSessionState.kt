// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpLoginSessionState

/**
 * The values of this enum are returned in the [signal@Portal::session-state-changed] signal
 * to indicate the current state of the user session.
 */
public enum class LoginSessionState(
    public val nativeValue: XdpLoginSessionState,
) {
    /**
     * the session is running
     */
    RUNNING(XdpLoginSessionState.XDP_LOGIN_SESSION_RUNNING),

    /**
     * the session is in the query end phase,
     *     during which applications can save their state or inhibit the
     *     session from ending
     */
    QUERY_END(XdpLoginSessionState.XDP_LOGIN_SESSION_QUERY_END),

    /**
     * the session is about to end
     */
    ENDING(XdpLoginSessionState.XDP_LOGIN_SESSION_ENDING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpLoginSessionState): LoginSessionState =
            when (nativeValue) {
                XdpLoginSessionState.XDP_LOGIN_SESSION_RUNNING -> RUNNING
                XdpLoginSessionState.XDP_LOGIN_SESSION_QUERY_END -> QUERY_END
                XdpLoginSessionState.XDP_LOGIN_SESSION_ENDING -> ENDING
                else -> error("invalid nativeValue")
            }
    }
}
