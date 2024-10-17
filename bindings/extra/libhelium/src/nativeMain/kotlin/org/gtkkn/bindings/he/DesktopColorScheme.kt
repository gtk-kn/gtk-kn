// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeDesktopColorScheme
import org.gtkkn.native.he.HeDesktopColorScheme.HE_DESKTOP_COLOR_SCHEME_DARK
import org.gtkkn.native.he.HeDesktopColorScheme.HE_DESKTOP_COLOR_SCHEME_LIGHT
import org.gtkkn.native.he.HeDesktopColorScheme.HE_DESKTOP_COLOR_SCHEME_NO_PREFERENCE

public enum class DesktopColorScheme(
    public val nativeValue: HeDesktopColorScheme,
) {
    NO_PREFERENCE(HE_DESKTOP_COLOR_SCHEME_NO_PREFERENCE),
    DARK(HE_DESKTOP_COLOR_SCHEME_DARK),
    LIGHT(HE_DESKTOP_COLOR_SCHEME_LIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeDesktopColorScheme): DesktopColorScheme =
            when (nativeValue) {
                HE_DESKTOP_COLOR_SCHEME_NO_PREFERENCE -> NO_PREFERENCE
                HE_DESKTOP_COLOR_SCHEME_DARK -> DARK
                HE_DESKTOP_COLOR_SCHEME_LIGHT -> LIGHT
                else -> error("invalid nativeValue")
            }
    }
}
