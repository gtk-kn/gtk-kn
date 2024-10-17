// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwStyleManager
import org.gtkkn.native.adw.adw_style_manager_get_color_scheme
import org.gtkkn.native.adw.adw_style_manager_get_dark
import org.gtkkn.native.adw.adw_style_manager_get_default
import org.gtkkn.native.adw.adw_style_manager_get_display
import org.gtkkn.native.adw.adw_style_manager_get_for_display
import org.gtkkn.native.adw.adw_style_manager_get_high_contrast
import org.gtkkn.native.adw.adw_style_manager_get_system_supports_color_schemes
import org.gtkkn.native.adw.adw_style_manager_get_type
import org.gtkkn.native.adw.adw_style_manager_set_color_scheme
import kotlin.Boolean
import kotlin.Unit

/**
 * A class for managing application-wide styling.
 *
 * `AdwStyleManager` provides a way to query and influence the application
 * styles, such as whether to use dark or high contrast appearance.
 *
 * It allows to set the color scheme via the
 * [property@StyleManager:color-scheme] property, and to query the current
 * appearance, as well as whether a system-wide color scheme preference exists.
 *
 * ## Skipped during bindings generation
 *
 * - method `yaru-accent`: Property has no getter nor setter
 */
public class StyleManager(
    pointer: CPointer<AdwStyleManager>,
) : Object(pointer.reinterpret()), KGTyped {
    public val adwStyleManagerPointer: CPointer<AdwStyleManager>
        get() = gPointer.reinterpret()

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
        get() =
            adw_style_manager_get_color_scheme(adwStyleManagerPointer.reinterpret()).run {
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
        set(colorScheme) =
            adw_style_manager_set_color_scheme(
                adwStyleManagerPointer.reinterpret(),
                colorScheme.nativeValue
            )

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
        get() = adw_style_manager_get_dark(adwStyleManagerPointer.reinterpret()).asBoolean()

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
        get() =
            adw_style_manager_get_display(adwStyleManagerPointer.reinterpret())?.run {
                Display(reinterpret())
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
        get() =
            adw_style_manager_get_high_contrast(adwStyleManagerPointer.reinterpret()).asBoolean()

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
        get() =
            adw_style_manager_get_system_supports_color_schemes(adwStyleManagerPointer.reinterpret()).asBoolean()

    /**
     * Gets the requested application color scheme.
     *
     * @return the color scheme
     */
    public fun getColorScheme(): ColorScheme =
        adw_style_manager_get_color_scheme(adwStyleManagerPointer.reinterpret()).run {
            ColorScheme.fromNativeValue(this)
        }

    /**
     * Gets whether the application is using dark appearance.
     *
     * This can be used to query the current appearance, as requested via
     * [property@StyleManager:color-scheme].
     *
     * @return whether the application is using dark appearance
     */
    public fun getDark(): Boolean = adw_style_manager_get_dark(adwStyleManagerPointer.reinterpret()).asBoolean()

    /**
     * Gets the display the style manager is associated with.
     *
     * The display will be `NULL` for the style manager returned by
     * [func@StyleManager.get_default].
     *
     * @return the display
     */
    public fun getDisplay(): Display? =
        adw_style_manager_get_display(adwStyleManagerPointer.reinterpret())?.run {
            Display(reinterpret())
        }

    /**
     * Gets whether the application is using high contrast appearance.
     *
     * This cannot be overridden by applications.
     *
     * @return whether the application is using high contrast appearance
     */
    public fun getHighContrast(): Boolean =
        adw_style_manager_get_high_contrast(adwStyleManagerPointer.reinterpret()).asBoolean()

    /**
     * Gets whether the system supports color schemes.
     *
     * This can be used to check if the current environment provides a color scheme
     * preference. For example, applications might want to show a separate
     * appearance switcher if it's set to `FALSE`.
     *
     * @return whether the system supports color schemes
     */
    public fun getSystemSupportsColorSchemes(): Boolean =
        adw_style_manager_get_system_supports_color_schemes(adwStyleManagerPointer.reinterpret()).asBoolean()

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
    public fun setColorScheme(colorScheme: ColorScheme): Unit =
        adw_style_manager_set_color_scheme(
            adwStyleManagerPointer.reinterpret(),
            colorScheme.nativeValue
        )

    public companion object : TypeCompanion<StyleManager> {
        override val type: GeneratedClassKGType<StyleManager> =
            GeneratedClassKGType(adw_style_manager_get_type()) {
                StyleManager(it.reinterpret())
            }

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
        public fun getDefault(): StyleManager =
            adw_style_manager_get_default()!!.run {
                StyleManager(reinterpret())
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
            adw_style_manager_get_for_display(display.gdkDisplayPointer.reinterpret())!!.run {
                StyleManager(reinterpret())
            }
    }
}
