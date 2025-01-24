// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwColorScheme
import org.gtkkn.native.adw.adw_color_scheme_get_type
import org.gtkkn.native.gobject.GType

/**
 * Application color schemes for [property@StyleManager:color-scheme].
 */
public enum class ColorScheme(public val nativeValue: AdwColorScheme) {
    /**
     * Inherit the parent color-scheme. When set on the
     *   `AdwStyleManager` returned by [func@StyleManager.get_default], it's
     *   equivalent to `ADW_COLOR_SCHEME_PREFER_LIGHT`.
     */
    DEFAULT(AdwColorScheme.ADW_COLOR_SCHEME_DEFAULT),

    /**
     * Always use light appearance.
     */
    FORCE_LIGHT(AdwColorScheme.ADW_COLOR_SCHEME_FORCE_LIGHT),

    /**
     * Use light appearance unless the system
     *   prefers dark colors.
     */
    PREFER_LIGHT(AdwColorScheme.ADW_COLOR_SCHEME_PREFER_LIGHT),

    /**
     * Use dark appearance unless the system prefers
     *   prefers light colors.
     */
    PREFER_DARK(AdwColorScheme.ADW_COLOR_SCHEME_PREFER_DARK),

    /**
     * Always use dark appearance.
     */
    FORCE_DARK(AdwColorScheme.ADW_COLOR_SCHEME_FORCE_DARK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwColorScheme): ColorScheme = when (nativeValue) {
            AdwColorScheme.ADW_COLOR_SCHEME_DEFAULT -> DEFAULT
            AdwColorScheme.ADW_COLOR_SCHEME_FORCE_LIGHT -> FORCE_LIGHT
            AdwColorScheme.ADW_COLOR_SCHEME_PREFER_LIGHT -> PREFER_LIGHT
            AdwColorScheme.ADW_COLOR_SCHEME_PREFER_DARK -> PREFER_DARK
            AdwColorScheme.ADW_COLOR_SCHEME_FORCE_DARK -> FORCE_DARK
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ColorScheme
         *
         * @return the GType
         */
        public fun getType(): GType = adw_color_scheme_get_type()
    }
}
