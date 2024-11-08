// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpButtonState

/**
 * The XdpButtonState enumeration is used to describe
 * the state of buttons.
 */
public enum class ButtonState(
    public val nativeValue: XdpButtonState,
) {
    /**
     * the button is down
     */
    RELEASED(XdpButtonState.XDP_BUTTON_RELEASED),

    /**
     * the button is up
     */
    PRESSED(XdpButtonState.XDP_BUTTON_PRESSED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpButtonState): ButtonState =
            when (nativeValue) {
                XdpButtonState.XDP_BUTTON_RELEASED -> RELEASED
                XdpButtonState.XDP_BUTTON_PRESSED -> PRESSED
                else -> error("invalid nativeValue")
            }
    }
}
