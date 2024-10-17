// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeOverlayButtonTypeButton
import org.gtkkn.native.he.HeOverlayButtonTypeButton.HE_OVERLAY_BUTTON_TYPE_BUTTON_PRIMARY
import org.gtkkn.native.he.HeOverlayButtonTypeButton.HE_OVERLAY_BUTTON_TYPE_BUTTON_SECONDARY
import org.gtkkn.native.he.HeOverlayButtonTypeButton.HE_OVERLAY_BUTTON_TYPE_BUTTON_SURFACE
import org.gtkkn.native.he.HeOverlayButtonTypeButton.HE_OVERLAY_BUTTON_TYPE_BUTTON_TERTIARY

public enum class OverlayButtonTypeButton(
    public val nativeValue: HeOverlayButtonTypeButton,
) {
    SURFACE(HE_OVERLAY_BUTTON_TYPE_BUTTON_SURFACE),
    PRIMARY(HE_OVERLAY_BUTTON_TYPE_BUTTON_PRIMARY),
    SECONDARY(HE_OVERLAY_BUTTON_TYPE_BUTTON_SECONDARY),
    TERTIARY(HE_OVERLAY_BUTTON_TYPE_BUTTON_TERTIARY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeOverlayButtonTypeButton): OverlayButtonTypeButton =
            when (nativeValue) {
                HE_OVERLAY_BUTTON_TYPE_BUTTON_SURFACE -> SURFACE
                HE_OVERLAY_BUTTON_TYPE_BUTTON_PRIMARY -> PRIMARY
                HE_OVERLAY_BUTTON_TYPE_BUTTON_SECONDARY -> SECONDARY
                HE_OVERLAY_BUTTON_TYPE_BUTTON_TERTIARY -> TERTIARY
                else -> error("invalid nativeValue")
            }
    }
}
