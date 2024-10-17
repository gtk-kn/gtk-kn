// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeOverlayButtonSize
import org.gtkkn.native.he.HeOverlayButtonSize.HE_OVERLAY_BUTTON_SIZE_LARGE
import org.gtkkn.native.he.HeOverlayButtonSize.HE_OVERLAY_BUTTON_SIZE_MEDIUM
import org.gtkkn.native.he.HeOverlayButtonSize.HE_OVERLAY_BUTTON_SIZE_SMALL

public enum class OverlayButtonSize(
    public val nativeValue: HeOverlayButtonSize,
) {
    SMALL(HE_OVERLAY_BUTTON_SIZE_SMALL),
    MEDIUM(HE_OVERLAY_BUTTON_SIZE_MEDIUM),
    LARGE(HE_OVERLAY_BUTTON_SIZE_LARGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeOverlayButtonSize): OverlayButtonSize =
            when (nativeValue) {
                HE_OVERLAY_BUTTON_SIZE_SMALL -> SMALL
                HE_OVERLAY_BUTTON_SIZE_MEDIUM -> MEDIUM
                HE_OVERLAY_BUTTON_SIZE_LARGE -> LARGE
                else -> error("invalid nativeValue")
            }
    }
}
