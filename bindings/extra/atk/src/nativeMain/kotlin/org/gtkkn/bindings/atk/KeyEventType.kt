// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.native.atk.AtkKeyEventType

/**
 * Specifies the type of a keyboard evemt.
 */
public enum class KeyEventType(
    public val nativeValue: AtkKeyEventType,
) {
    /**
     * specifies a key press event
     */
    PRESS(AtkKeyEventType.ATK_KEY_EVENT_PRESS),

    /**
     * specifies a key release event
     */
    RELEASE(AtkKeyEventType.ATK_KEY_EVENT_RELEASE),

    /**
     * Not a valid value; specifies end of enumeration
     */
    LAST_DEFINED(AtkKeyEventType.ATK_KEY_EVENT_LAST_DEFINED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkKeyEventType): KeyEventType =
            when (nativeValue) {
                AtkKeyEventType.ATK_KEY_EVENT_PRESS -> PRESS
                AtkKeyEventType.ATK_KEY_EVENT_RELEASE -> RELEASE
                AtkKeyEventType.ATK_KEY_EVENT_LAST_DEFINED -> LAST_DEFINED
                else -> error("invalid nativeValue")
            }
    }
}
