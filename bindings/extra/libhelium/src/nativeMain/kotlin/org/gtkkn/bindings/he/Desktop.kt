// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeDesktop
import org.gtkkn.native.he.he_desktop_get_dark_mode_strength
import org.gtkkn.native.he.he_desktop_get_ensor_scheme
import org.gtkkn.native.he.he_desktop_get_font_weight
import org.gtkkn.native.he.he_desktop_get_prefers_color_scheme
import org.gtkkn.native.he.he_desktop_get_type
import org.gtkkn.native.he.he_desktop_new
import org.gtkkn.native.he.he_desktop_set_font_weight
import org.gtkkn.native.he.he_desktop_set_prefers_color_scheme
import kotlin.Double
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `get_accent_color`: Return type He.HeRGBColor is unsupported
 * - parameter `value`: He.HeRGBColor
 * - method `prefers-color-scheme`: Property has no getter nor setter
 * - method `dark-mode-strength`: Property has no getter nor setter
 * - method `ensor-scheme`: Property has no getter nor setter
 * - method `accent-color`: Property has no getter nor setter
 * - method `font-weight`: Property has no getter nor setter
 */
public open class Desktop(
    pointer: CPointer<HeDesktop>,
) : Object(pointer.reinterpret()), KGTyped {
    public val heDesktopPointer: CPointer<HeDesktop>
        get() = gPointer.reinterpret()

    public constructor() : this(he_desktop_new()!!.reinterpret())

    public open fun getPrefersColorScheme(): DesktopColorScheme =
        he_desktop_get_prefers_color_scheme(heDesktopPointer.reinterpret()).run {
            DesktopColorScheme.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setPrefersColorScheme(`value`: DesktopColorScheme): Unit =
        he_desktop_set_prefers_color_scheme(heDesktopPointer.reinterpret(), `value`.nativeValue)

    public open fun getDarkModeStrength(): DesktopDarkModeStrength =
        he_desktop_get_dark_mode_strength(heDesktopPointer.reinterpret()).run {
            DesktopDarkModeStrength.fromNativeValue(this)
        }

    public open fun getEnsorScheme(): DesktopEnsorScheme =
        he_desktop_get_ensor_scheme(heDesktopPointer.reinterpret()).run {
            DesktopEnsorScheme.fromNativeValue(this)
        }

    public open fun getFontWeight(): Double = he_desktop_get_font_weight(heDesktopPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setFontWeight(`value`: Double): Unit =
        he_desktop_set_font_weight(heDesktopPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<Desktop> {
        override val type: GeneratedClassKGType<Desktop> =
            GeneratedClassKGType(he_desktop_get_type()) { Desktop(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}
