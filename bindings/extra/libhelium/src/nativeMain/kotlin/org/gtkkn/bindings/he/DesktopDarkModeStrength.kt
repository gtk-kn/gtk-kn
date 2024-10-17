// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeDesktopDarkModeStrength
import org.gtkkn.native.he.HeDesktopDarkModeStrength.HE_DESKTOP_DARK_MODE_STRENGTH_HARSH
import org.gtkkn.native.he.HeDesktopDarkModeStrength.HE_DESKTOP_DARK_MODE_STRENGTH_MEDIUM
import org.gtkkn.native.he.HeDesktopDarkModeStrength.HE_DESKTOP_DARK_MODE_STRENGTH_SOFT

public enum class DesktopDarkModeStrength(
    public val nativeValue: HeDesktopDarkModeStrength,
) {
    MEDIUM(HE_DESKTOP_DARK_MODE_STRENGTH_MEDIUM),
    HARSH(HE_DESKTOP_DARK_MODE_STRENGTH_HARSH),
    SOFT(HE_DESKTOP_DARK_MODE_STRENGTH_SOFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeDesktopDarkModeStrength): DesktopDarkModeStrength =
            when (nativeValue) {
                HE_DESKTOP_DARK_MODE_STRENGTH_MEDIUM -> MEDIUM
                HE_DESKTOP_DARK_MODE_STRENGTH_HARSH -> HARSH
                HE_DESKTOP_DARK_MODE_STRENGTH_SOFT -> SOFT
                else -> error("invalid nativeValue")
            }
    }
}
