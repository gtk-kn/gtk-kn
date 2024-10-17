// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeDesktopEnsorScheme
import org.gtkkn.native.he.HeDesktopEnsorScheme.HE_DESKTOP_ENSOR_SCHEME_DEFAULT
import org.gtkkn.native.he.HeDesktopEnsorScheme.HE_DESKTOP_ENSOR_SCHEME_MONOCHROMATIC
import org.gtkkn.native.he.HeDesktopEnsorScheme.HE_DESKTOP_ENSOR_SCHEME_MUTED
import org.gtkkn.native.he.HeDesktopEnsorScheme.HE_DESKTOP_ENSOR_SCHEME_VIBRANT

public enum class DesktopEnsorScheme(
    public val nativeValue: HeDesktopEnsorScheme,
) {
    DEFAULT(HE_DESKTOP_ENSOR_SCHEME_DEFAULT),
    VIBRANT(HE_DESKTOP_ENSOR_SCHEME_VIBRANT),
    MUTED(HE_DESKTOP_ENSOR_SCHEME_MUTED),
    MONOCHROMATIC(HE_DESKTOP_ENSOR_SCHEME_MONOCHROMATIC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeDesktopEnsorScheme): DesktopEnsorScheme =
            when (nativeValue) {
                HE_DESKTOP_ENSOR_SCHEME_DEFAULT -> DEFAULT
                HE_DESKTOP_ENSOR_SCHEME_VIBRANT -> VIBRANT
                HE_DESKTOP_ENSOR_SCHEME_MUTED -> MUTED
                HE_DESKTOP_ENSOR_SCHEME_MONOCHROMATIC -> MONOCHROMATIC
                else -> error("invalid nativeValue")
            }
    }
}
