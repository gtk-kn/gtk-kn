// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwColorScheme
import org.gtkkn.native.adw.AdwColorScheme.ADW_COLOR_SCHEME_DEFAULT
import org.gtkkn.native.adw.AdwColorScheme.ADW_COLOR_SCHEME_FORCE_DARK
import org.gtkkn.native.adw.AdwColorScheme.ADW_COLOR_SCHEME_FORCE_LIGHT
import org.gtkkn.native.adw.AdwColorScheme.ADW_COLOR_SCHEME_PREFER_DARK
import org.gtkkn.native.adw.AdwColorScheme.ADW_COLOR_SCHEME_PREFER_LIGHT

/**
 * Application color schemes for [property@StyleManager:color-scheme].
 */
public enum class ColorScheme(
    public val nativeValue: AdwColorScheme,
) {
    /**
     * Inherit the parent color-scheme. When set on the
     *   `AdwStyleManager` returned by [func@StyleManager.get_default], it's
     *   equivalent to `ADW_COLOR_SCHEME_PREFER_LIGHT`.
     */
    DEFAULT(ADW_COLOR_SCHEME_DEFAULT),

    /**
     * Always use light appearance.
     */
    FORCE_LIGHT(ADW_COLOR_SCHEME_FORCE_LIGHT),

    /**
     * Use light appearance unless the system
     *   prefers dark colors.
     */
    PREFER_LIGHT(ADW_COLOR_SCHEME_PREFER_LIGHT),

    /**
     * Use dark appearance unless the system prefers
     *   prefers light colors.
     */
    PREFER_DARK(ADW_COLOR_SCHEME_PREFER_DARK),

    /**
     * Always use dark appearance.
     */
    FORCE_DARK(ADW_COLOR_SCHEME_FORCE_DARK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwColorScheme): ColorScheme =
            when (nativeValue) {
                ADW_COLOR_SCHEME_DEFAULT -> DEFAULT
                ADW_COLOR_SCHEME_FORCE_LIGHT -> FORCE_LIGHT
                ADW_COLOR_SCHEME_PREFER_LIGHT -> PREFER_LIGHT
                ADW_COLOR_SCHEME_PREFER_DARK -> PREFER_DARK
                ADW_COLOR_SCHEME_FORCE_DARK -> FORCE_DARK
                else -> error("invalid nativeValue")
            }
    }
}
