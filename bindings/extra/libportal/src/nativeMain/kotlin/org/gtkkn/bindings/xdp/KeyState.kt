// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpKeyState

/**
 * The `XdpKeyState` enumeration is used to describe
 * the state of keys.
 */
public enum class KeyState(
    public val nativeValue: XdpKeyState,
) {
    /**
     * the key is down
     */
    RELEASED(XdpKeyState.XDP_KEY_RELEASED),

    /**
     * the key is up
     */
    PRESSED(XdpKeyState.XDP_KEY_PRESSED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpKeyState): KeyState =
            when (nativeValue) {
                XdpKeyState.XDP_KEY_RELEASED -> RELEASED
                XdpKeyState.XDP_KEY_PRESSED -> PRESSED
                else -> error("invalid nativeValue")
            }
    }
}
