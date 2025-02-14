// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.adw.AdwAccentColor
import org.gtkkn.native.adw.adw_accent_color_get_type
import org.gtkkn.native.adw.adw_accent_color_to_rgba
import org.gtkkn.native.adw.adw_accent_color_to_standalone_rgba
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * Describes the available system accent colors.
 * @since 1.6
 */
@AdwVersion1_6
public enum class AccentColor(public val nativeValue: AdwAccentColor) {
    /**
     * Use a blue color (`#3584e4`). This is the default value.
     */
    BLUE(AdwAccentColor.ADW_ACCENT_COLOR_BLUE),

    /**
     * Use a teal color (`#2190a4`).
     */
    TEAL(AdwAccentColor.ADW_ACCENT_COLOR_TEAL),

    /**
     * Use a green color (`#3a944a`).
     */
    GREEN(AdwAccentColor.ADW_ACCENT_COLOR_GREEN),

    /**
     * Use a yellow color (`#c88800`).
     */
    YELLOW(AdwAccentColor.ADW_ACCENT_COLOR_YELLOW),

    /**
     * Use a orange color (`#ed5b00`).
     */
    ORANGE(AdwAccentColor.ADW_ACCENT_COLOR_ORANGE),

    /**
     * Use a red color (`#e62d42`).
     */
    RED(AdwAccentColor.ADW_ACCENT_COLOR_RED),

    /**
     * Use a pink color (`#d56199`).
     */
    PINK(AdwAccentColor.ADW_ACCENT_COLOR_PINK),

    /**
     * Use a purple color (`#9141ac`).
     */
    PURPLE(AdwAccentColor.ADW_ACCENT_COLOR_PURPLE),

    /**
     * Use a slate color (`#6f8396`).
     */
    SLATE(AdwAccentColor.ADW_ACCENT_COLOR_SLATE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwAccentColor): AccentColor = when (nativeValue) {
            AdwAccentColor.ADW_ACCENT_COLOR_BLUE -> BLUE
            AdwAccentColor.ADW_ACCENT_COLOR_TEAL -> TEAL
            AdwAccentColor.ADW_ACCENT_COLOR_GREEN -> GREEN
            AdwAccentColor.ADW_ACCENT_COLOR_YELLOW -> YELLOW
            AdwAccentColor.ADW_ACCENT_COLOR_ORANGE -> ORANGE
            AdwAccentColor.ADW_ACCENT_COLOR_RED -> RED
            AdwAccentColor.ADW_ACCENT_COLOR_PINK -> PINK
            AdwAccentColor.ADW_ACCENT_COLOR_PURPLE -> PURPLE
            AdwAccentColor.ADW_ACCENT_COLOR_SLATE -> SLATE
            else -> error("invalid nativeValue")
        }

        /**
         * Converts @self to a `GdkRGBA` representing its background color.
         *
         * The matching foreground color is white.
         *
         * @param self an accent color
         * @param rgba return location for the color
         * @since 1.6
         */
        @AdwVersion1_6
        public fun toRgba(self: AccentColor, rgba: Rgba): Unit =
            adw_accent_color_to_rgba(self.nativeValue, rgba.gdkRgbaPointer)

        /**
         * Converts @self to a `GdkRGBA` representing its standalone color.
         *
         * It will typically be darker for light background, and lighter for dark
         * background, ensuring contrast.
         *
         * @param self an accent color
         * @param dark Whether to calculate standalone color for light or dark background
         * @param rgba return location for the color
         * @since 1.6
         */
        @AdwVersion1_6
        public fun toStandaloneRgba(self: AccentColor, dark: Boolean, rgba: Rgba): Unit =
            adw_accent_color_to_standalone_rgba(self.nativeValue, dark.asGBoolean(), rgba.gdkRgbaPointer)

        /**
         * Get the GType of AccentColor
         *
         * @return the GType
         */
        public fun getType(): GType = adw_accent_color_get_type()
    }
}
