// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwStyleManager
import org.gtkkn.native.adw.adw_style_manager_get_accent_color
import org.gtkkn.native.adw.adw_style_manager_get_accent_color_rgba
import org.gtkkn.native.adw.adw_style_manager_get_color_scheme
import org.gtkkn.native.adw.adw_style_manager_get_dark
import org.gtkkn.native.adw.adw_style_manager_get_default
import org.gtkkn.native.adw.adw_style_manager_get_display
import org.gtkkn.native.adw.adw_style_manager_get_for_display
import org.gtkkn.native.adw.adw_style_manager_get_high_contrast
import org.gtkkn.native.adw.adw_style_manager_get_system_supports_accent_colors
import org.gtkkn.native.adw.adw_style_manager_get_system_supports_color_schemes
import org.gtkkn.native.adw.adw_style_manager_get_type
import org.gtkkn.native.adw.adw_style_manager_set_color_scheme
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * A class for managing application-wide styling.
 *
 * `AdwStyleManager` provides a way to query and influence the application
 * styles, such as whether to use dark style, the system accent color or high
 * contrast appearance.
 *
 * It allows to set the color scheme via the
 * [property@StyleManager:color-scheme] property, and to query the current
 * appearance, as well as whether a system-wide color scheme and accent color
 * preferences exists.
 */
public class StyleManager(public val adwStyleManagerPointer: CPointer<AdwStyleManager>) :
    Object(adwStyleManagerPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    /**
     * The current system accent color.
     *
     * See also [property@StyleManager:accent-color-rgba].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val accentColor: AccentColor
        /**
         * Gets the current system accent color.
         *
         * See also [property@StyleManager:accent-color-rgba].
         *
         * @return the current system accent color
         * @since 1.6
         */
        get() = adw_style_manager_get_accent_color(adwStyleManagerPointer).run {
            AccentColor.fromNativeValue(this)
        }

    /**
     * The current system accent color as a `GdkRGBA`.
     *
     * Equivalent to calling [func@AccentColor.to_rgba] on the value of
     * [property@StyleManager:accent-color].
     *
     * This is a background color. The matching foreground color is white.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val accentColorRgba: Rgba
        /**
         * Gets the current system accent color as a `GdkRGBA`.
         *
         * Equivalent to calling [func@AccentColor.to_rgba] on the value of
         * [property@StyleManager:accent-color].
         *
         * This is a background color. The matching foreground color is white.
         *
         * @return the current system accent color
         * @since 1.6
         */
        get() = adw_style_manager_get_accent_color_rgba(adwStyleManagerPointer)!!.run {
            Rgba(this)
        }

    /**
     * The requested application color scheme.
     *
     * The effective appearance will be decided based on the application color
     * scheme and the system preferred color scheme. The
     * [property@StyleManager:dark] property can be used to query the current
     * effective appearance.
     *
     * The `ADW_COLOR_SCHEME_PREFER_LIGHT` color scheme results in the application
     * using light appearance unless the system prefers dark colors. This is the
     * default value.
     *
     * The `ADW_COLOR_SCHEME_PREFER_DARK` color scheme results in the application
     * using dark appearance, but can still switch to the light appearance if the
     * system can prefers it, for example, when the high contrast preference is
     * enabled.
     *
     * The `ADW_COLOR_SCHEME_FORCE_LIGHT` and `ADW_COLOR_SCHEME_FORCE_DARK` values
     * ignore the system preference entirely. They are useful if the application
     * wants to match its UI to its content or to provide a separate color scheme
     * switcher.
     *
     * If a per-[class@Gdk.Display] style manager has its color scheme set to
     * `ADW_COLOR_SCHEME_DEFAULT`, it will inherit the color scheme from the
     * default style manager.
     *
     * For the default style manager, `ADW_COLOR_SCHEME_DEFAULT` is equivalent to
     * `ADW_COLOR_SCHEME_PREFER_LIGHT`.
     *
     * The [property@StyleManager:system-supports-color-schemes] property can be
     * used to check if the current environment provides a color scheme
     * preference.
     */
    public var colorScheme: ColorScheme
        /**
         * Gets the requested application color scheme.
         *
         * @return the color scheme
         */
        get() = adw_style_manager_get_color_scheme(adwStyleManagerPointer).run {
            ColorScheme.fromNativeValue(this)
        }

        /**
         * Sets the requested application color scheme.
         *
         * The effective appearance will be decided based on the application color
         * scheme and the system preferred color scheme. The
         * [property@StyleManager:dark] property can be used to query the current
         * effective appearance.
         *
         * The `ADW_COLOR_SCHEME_PREFER_LIGHT` color scheme results in the application
         * using light appearance unless the system prefers dark colors. This is the
         * default value.
         *
         * The `ADW_COLOR_SCHEME_PREFER_DARK` color scheme results in the application
         * using dark appearance, but can still switch to the light appearance if the
         * system can prefers it, for example, when the high contrast preference is
         * enabled.
         *
         * The `ADW_COLOR_SCHEME_FORCE_LIGHT` and `ADW_COLOR_SCHEME_FORCE_DARK` values
         * ignore the system preference entirely. They are useful if the application
         * wants to match its UI to its content or to provide a separate color scheme
         * switcher.
         *
         * If a per-[class@Gdk.Display] style manager has its color scheme set to
         * `ADW_COLOR_SCHEME_DEFAULT`, it will inherit the color scheme from the
         * default style manager.
         *
         * For the default style manager, `ADW_COLOR_SCHEME_DEFAULT` is equivalent to
         * `ADW_COLOR_SCHEME_PREFER_LIGHT`.
         *
         * The [property@StyleManager:system-supports-color-schemes] property can be
         * used to check if the current environment provides a color scheme
         * preference.
         *
         * @param colorScheme the color scheme
         */
        set(colorScheme) = adw_style_manager_set_color_scheme(adwStyleManagerPointer, colorScheme.nativeValue)

    /**
     * Whether the application is using dark appearance.
     *
     * This property can be used to query the current appearance, as requested via
     * [property@StyleManager:color-scheme].
     */
    public val dark: Boolean
        /**
         * Gets whether the application is using dark appearance.
         *
         * This can be used to query the current appearance, as requested via
         * [property@StyleManager:color-scheme].
         *
         * @return whether the application is using dark appearance
         */
        get() = adw_style_manager_get_dark(adwStyleManagerPointer).asBoolean()

    /**
     * The display the style manager is associated with.
     *
     * The display will be `NULL` for the style manager returned by
     * [func@StyleManager.get_default].
     */
    public val display: Display?
        /**
         * Gets the display the style manager is associated with.
         *
         * The display will be `NULL` for the style manager returned by
         * [func@StyleManager.get_default].
         *
         * @return the display
         */
        get() = adw_style_manager_get_display(adwStyleManagerPointer)?.run {
            InstanceCache.get(this, true) { Display(reinterpret()) }!!
        }

    /**
     * Whether the application is using high contrast appearance.
     *
     * This cannot be overridden by applications.
     */
    public val highContrast: Boolean
        /**
         * Gets whether the application is using high contrast appearance.
         *
         * This cannot be overridden by applications.
         *
         * @return whether the application is using high contrast appearance
         */
        get() = adw_style_manager_get_high_contrast(adwStyleManagerPointer).asBoolean()

    /**
     * Whether the system supports accent colors.
     *
     * This property can be used to check if the current environment provides an
     * accent color preference. For example, applications might want to show a
     * preference for choosing accent color if it's set to `FALSE`.
     *
     * See [property@StyleManager:accent-color].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val systemSupportsAccentColors: Boolean
        /**
         * Gets whether the system supports accent colors.
         *
         * This can be used to check if the current environment provides an accent color
         * preference. For example, applications might want to show a preference for
         * choosing accent color if it's set to `FALSE`.
         *
         * See [property@StyleManager:accent-color].
         *
         * @return whether the system supports accent colors
         * @since 1.6
         */
        get() = adw_style_manager_get_system_supports_accent_colors(adwStyleManagerPointer).asBoolean()

    /**
     * Whether the system supports color schemes.
     *
     * This property can be used to check if the current environment provides a
     * color scheme preference. For example, applications might want to show a
     * separate appearance switcher if it's set to `FALSE`.
     *
     * See [property@StyleManager:color-scheme].
     */
    public val systemSupportsColorSchemes: Boolean
        /**
         * Gets whether the system supports color schemes.
         *
         * This can be used to check if the current environment provides a color scheme
         * preference. For example, applications might want to show a separate
         * appearance switcher if it's set to `FALSE`.
         *
         * @return whether the system supports color schemes
         */
        get() = adw_style_manager_get_system_supports_color_schemes(adwStyleManagerPointer).asBoolean()

    public companion object : TypeCompanion<StyleManager> {
        override val type: GeneratedClassKGType<StyleManager> =
            GeneratedClassKGType(getTypeOrNull()!!) { StyleManager(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Gets the default `AdwStyleManager` instance.
         *
         * It manages all [class@Gdk.Display] instances unless the style manager for
         * that display has an override.
         *
         * See [func@StyleManager.get_for_display].
         *
         * @return the default style manager
         */
        public fun getDefault(): StyleManager = adw_style_manager_get_default()!!.run {
            InstanceCache.get(this, true) { StyleManager(reinterpret()) }!!
        }

        /**
         * Gets the `AdwStyleManager` instance managing @display.
         *
         * It can be used to override styles for that specific display instead of the
         * whole application.
         *
         * Most applications should use [func@StyleManager.get_default] instead.
         *
         * @param display a `GdkDisplay`
         * @return the style manager for @display
         */
        public fun getForDisplay(display: Display): StyleManager =
            adw_style_manager_get_for_display(display.gdkDisplayPointer)!!.run {
                InstanceCache.get(this, true) { StyleManager(reinterpret()) }!!
            }

        /**
         * Get the GType of StyleManager
         *
         * @return the GType
         */
        public fun getType(): GType = adw_style_manager_get_type()

        /**
         * Gets the GType of from the symbol `adw_style_manager_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_style_manager_get_type")
    }
}
