// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeOverlayButtonAlignment
import org.gtkkn.native.he.HeOverlayButtonAlignment.HE_OVERLAY_BUTTON_ALIGNMENT_CENTER
import org.gtkkn.native.he.HeOverlayButtonAlignment.HE_OVERLAY_BUTTON_ALIGNMENT_LEFT
import org.gtkkn.native.he.HeOverlayButtonAlignment.HE_OVERLAY_BUTTON_ALIGNMENT_RIGHT

public enum class OverlayButtonAlignment(
    public val nativeValue: HeOverlayButtonAlignment,
) {
    LEFT(HE_OVERLAY_BUTTON_ALIGNMENT_LEFT),
    CENTER(HE_OVERLAY_BUTTON_ALIGNMENT_CENTER),
    RIGHT(HE_OVERLAY_BUTTON_ALIGNMENT_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeOverlayButtonAlignment): OverlayButtonAlignment =
            when (nativeValue) {
                HE_OVERLAY_BUTTON_ALIGNMENT_LEFT -> LEFT
                HE_OVERLAY_BUTTON_ALIGNMENT_CENTER -> CENTER
                HE_OVERLAY_BUTTON_ALIGNMENT_RIGHT -> RIGHT
                else -> error("invalid nativeValue")
            }
    }
}
