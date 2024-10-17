// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.native.he.he_color_alpha_from_rgba_int
import org.gtkkn.native.he.he_color_argb_from_rgb_int
import org.gtkkn.native.he.he_color_blue_from_rgba_int
import org.gtkkn.native.he.he_color_critical_plane_above
import org.gtkkn.native.he.he_color_critical_plane_below
import org.gtkkn.native.he.he_color_find_result_by_j
import org.gtkkn.native.he.he_color_green_from_rgba_int
import org.gtkkn.native.he.he_color_hct_to_argb
import org.gtkkn.native.he.he_color_hct_to_hex
import org.gtkkn.native.he.he_color_hexcode
import org.gtkkn.native.he.he_color_hexcode_argb
import org.gtkkn.native.he.he_color_red_from_rgba_int
import org.gtkkn.native.he.he_color_rgb_from_linrgb
import org.gtkkn.native.he.he_color_rgb_value_to_xyz
import org.gtkkn.native.he.he_color_xyz_value_to_lab
import org.gtkkn.native.he.he_math_utils_abs
import org.gtkkn.native.he.he_math_utils_adapt
import org.gtkkn.native.he.he_math_utils_are_in_cyclic_order
import org.gtkkn.native.he.he_math_utils_argb_from_lstar
import org.gtkkn.native.he.he_math_utils_chromatic_adaptation
import org.gtkkn.native.he.he_math_utils_clamp_double
import org.gtkkn.native.he.he_math_utils_convert
import org.gtkkn.native.he.he_math_utils_delinearized
import org.gtkkn.native.he.he_math_utils_difference_degrees
import org.gtkkn.native.he.he_math_utils_double_delinearized
import org.gtkkn.native.he.he_math_utils_intercept
import org.gtkkn.native.he.he_math_utils_inverse_chromatic_adaptation
import org.gtkkn.native.he.he_math_utils_is_bounded_rgb
import org.gtkkn.native.he.he_math_utils_lab_fovea
import org.gtkkn.native.he.he_math_utils_lab_inverse_fovea
import org.gtkkn.native.he.he_math_utils_lerp
import org.gtkkn.native.he.he_math_utils_linearized
import org.gtkkn.native.he.he_math_utils_lstar_from_argb
import org.gtkkn.native.he.he_math_utils_max
import org.gtkkn.native.he.he_math_utils_min
import org.gtkkn.native.he.he_math_utils_rotate_direction
import org.gtkkn.native.he.he_math_utils_sanitize_degrees
import org.gtkkn.native.he.he_math_utils_sanitize_degrees_int
import org.gtkkn.native.he.he_math_utils_sanitize_radians
import org.gtkkn.native.he.he_math_utils_signum
import org.gtkkn.native.he.he_math_utils_y_from_lstar
import org.gtkkn.native.he.he_misc_accel_label
import org.gtkkn.native.he.he_misc_accel_string
import org.gtkkn.native.he.he_misc_contrast_ratio
import org.gtkkn.native.he.he_modifier_badge_alignment_from_gtk_align
import org.gtkkn.native.he.he_overlay_button_alignment_from_gtk_align
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - parameter `color`: He.HeRGBColor
 * - parameter `lab`: He.HeLABColor
 * - parameter `xyz`: He.HeXYZColor
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - parameter `color`: He.HeXYZColor
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `color`: He.HeRGBColor
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `hct`: He.HeHCTColor
 * - parameter `hct`: He.HeHCTColor
 * - parameter `a`: He.HeHCTColor
 * - parameter `hues`: Array parameter of type gdouble is not supported
 * - parameter `linrgb`: Array parameter of type gdouble is not supported
 * - parameter `color`: He.HeXYZColor
 * - parameter `color`: He.HeLCHColor
 * - parameter `color`: He.HeRGBColor
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `color`: He.HeRGBColor
 * - parameter `color`: He.HeLABColor
 * - parameter `color`: He.HeHCTColor
 * - parameter `color`: He.HeXYZColor
 * - parameter `color`: He.HeLABColor
 * - parameter `color`: He.HeLCHColor
 * - parameter `color`: Gdk.RGBA
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `result`: result: Out parameter is not supported
 * - parameter `color`: He.HeRGBColor
 * - parameter `color`: He.HeCAM16Color
 * - parameter `color`: He.HeLABColor
 * - parameter `pixels`: guint8
 * - function `ensor_accent_from_pixels_finish`: Array parameter of type gint is not supported
 * - parameter `source`: Array parameter of type gdouble is not supported
 * - parameter `row`: Array parameter of type gdouble is not supported
 * - parameter `a`: Array parameter of type gdouble is not supported
 * - parameter `linrgb`: Array parameter of type gdouble is not supported
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - parameter `source`: Array parameter of type gdouble is not supported
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - parameter `t_dup_func`: GObject.BoxedCopyFunc
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - function `colors_to_css_class`: Function with instance parameter is not supported yet
 * - function `colors_to_string`: Function with instance parameter is not supported yet
 * - function `about_window_licenses_get_url`: Function with instance parameter is not supported yet
 * - function `about_window_licenses_get_name`: Function with instance parameter is not supported
 * yet
 * - function `content_block_image_cluster_image_position_get_column`: Function with instance
 * parameter is not supported yet
 * - function `content_block_image_cluster_image_position_get_row`: Function with instance parameter
 * is not supported yet
 * - function `modifier_badge_alignment_to_gtk_align`: Function with instance parameter is not
 * supported yet
 * - function `overlay_button_size_to_css_class`: Function with instance parameter is not supported
 * yet
 * - function `overlay_button_type_button_to_css_class`: Function with instance parameter is not
 * supported yet
 * - function `overlay_button_alignment_to_gtk_align`: Function with instance parameter is not
 * supported yet
 * - record `SchemesContentClass`: glib type struct are ignored
 * - record `SchemesContentPrivate`: Disguised records are ignored
 * - record `SchemesDefaultClass`: glib type struct are ignored
 * - record `SchemesDefaultPrivate`: Disguised records are ignored
 * - record `SchemesMonochromeClass`: glib type struct are ignored
 * - record `SchemesMonochromePrivate`: Disguised records are ignored
 * - record `SchemesMutedClass`: glib type struct are ignored
 * - record `SchemesMutedPrivate`: Disguised records are ignored
 * - record `SchemesVibrantClass`: glib type struct are ignored
 * - record `SchemesVibrantPrivate`: Disguised records are ignored
 * - record `ApplicationClass`: glib type struct are ignored
 * - record `ApplicationPrivate`: Disguised records are ignored
 * - record `BinClass`: glib type struct are ignored
 * - record `BinPrivate`: Disguised records are ignored
 * - record `ButtonClass`: glib type struct are ignored
 * - record `ButtonPrivate`: Disguised records are ignored
 * - record `ButtonContentClass`: glib type struct are ignored
 * - record `ButtonContentPrivate`: Disguised records are ignored
 * - record `SchemeClass`: glib type struct are ignored
 * - record `SchemePrivate`: Disguised records are ignored
 * - record `ViewClass`: glib type struct are ignored
 * - record `ViewPrivate`: Disguised records are ignored
 * - record `WindowClass`: glib type struct are ignored
 * - record `WindowPrivate`: Disguised records are ignored
 * - record `DesktopClass`: glib type struct are ignored
 * - record `DesktopPrivate`: Disguised records are ignored
 * - record `QuantizerClass`: glib type struct are ignored
 * - record `QuantizerPrivate`: Disguised records are ignored
 * - record `QuantizerCelebiClass`: glib type struct are ignored
 * - record `QuantizerCelebiPrivate`: Disguised records are ignored
 * - record `QuantizerMapClass`: glib type struct are ignored
 * - record `QuantizerMapPrivate`: Disguised records are ignored
 * - record `QuantizerResultClass`: glib type struct are ignored
 * - record `QuantizerResultPrivate`: Disguised records are ignored
 * - record `QuantizerWsmeansClass`: glib type struct are ignored
 * - record `QuantizerWsmeansPrivate`: Disguised records are ignored
 * - record `QuantizerWuClass`: glib type struct are ignored
 * - record `QuantizerWuPrivate`: Disguised records are ignored
 * - record `ScoreClass`: glib type struct are ignored
 * - record `ScorePrivate`: Disguised records are ignored
 * - record `ScoreAnnotatedColorClass`: glib type struct are ignored
 * - record `ScoreAnnotatedColorPrivate`: Disguised records are ignored
 * - record `ViewingConditionsClass`: glib type struct are ignored
 * - record `ViewingConditionsPrivate`: Disguised records are ignored
 * - record `AboutWindowClass`: glib type struct are ignored
 * - record `AboutWindowPrivate`: Disguised records are ignored
 * - record `AppBarClass`: glib type struct are ignored
 * - record `AppBarPrivate`: Disguised records are ignored
 * - record `ApplicationWindowClass`: glib type struct are ignored
 * - record `ApplicationWindowPrivate`: Disguised records are ignored
 * - record `AvatarClass`: glib type struct are ignored
 * - record `AvatarPrivate`: Disguised records are ignored
 * - record `BadgeClass`: glib type struct are ignored
 * - record `BadgePrivate`: Disguised records are ignored
 * - record `BannerClass`: glib type struct are ignored
 * - record `BannerPrivate`: Disguised records are ignored
 * - record `BottomBarClass`: glib type struct are ignored
 * - record `BottomBarPrivate`: Disguised records are ignored
 * - record `ChipClass`: glib type struct are ignored
 * - record `ChipPrivate`: Disguised records are ignored
 * - record `ChipGroupClass`: glib type struct are ignored
 * - record `ChipGroupPrivate`: Disguised records are ignored
 * - record `ContentBlockClass`: glib type struct are ignored
 * - record `ContentBlockPrivate`: Disguised records are ignored
 * - record `ContentBlockImageClass`: glib type struct are ignored
 * - record `ContentBlockImagePrivate`: Disguised records are ignored
 * - record `ContentBlockImageClusterClass`: glib type struct are ignored
 * - record `ContentBlockImageClusterPrivate`: Disguised records are ignored
 * - record `ContentListClass`: glib type struct are ignored
 * - record `ContentListPrivate`: Disguised records are ignored
 * - record `DatePickerClass`: glib type struct are ignored
 * - record `DatePickerPrivate`: Disguised records are ignored
 * - record `DialogClass`: glib type struct are ignored
 * - record `DialogPrivate`: Disguised records are ignored
 * - record `DisclosureButtonClass`: glib type struct are ignored
 * - record `DisclosureButtonPrivate`: Disguised records are ignored
 * - record `EmptyPageClass`: glib type struct are ignored
 * - record `EmptyPagePrivate`: Disguised records are ignored
 * - record `FillButtonClass`: glib type struct are ignored
 * - record `FillButtonPrivate`: Disguised records are ignored
 * - record `IconicButtonClass`: glib type struct are ignored
 * - record `IconicButtonPrivate`: Disguised records are ignored
 * - record `MiniContentBlockClass`: glib type struct are ignored
 * - record `MiniContentBlockPrivate`: Disguised records are ignored
 * - record `ModifierBadgeClass`: glib type struct are ignored
 * - record `ModifierBadgePrivate`: Disguised records are ignored
 * - record `NavigationRailClass`: glib type struct are ignored
 * - record `NavigationRailPrivate`: Disguised records are ignored
 * - record `OutlineButtonClass`: glib type struct are ignored
 * - record `OutlineButtonPrivate`: Disguised records are ignored
 * - record `OverlayButtonClass`: glib type struct are ignored
 * - record `OverlayButtonPrivate`: Disguised records are ignored
 * - record `PillButtonClass`: glib type struct are ignored
 * - record `PillButtonPrivate`: Disguised records are ignored
 * - record `SegmentedButtonClass`: glib type struct are ignored
 * - record `SegmentedButtonPrivate`: Disguised records are ignored
 * - record `SettingsListClass`: glib type struct are ignored
 * - record `SettingsListPrivate`: Disguised records are ignored
 * - record `SettingsPageClass`: glib type struct are ignored
 * - record `SettingsPagePrivate`: Disguised records are ignored
 * - record `SettingsRowClass`: glib type struct are ignored
 * - record `SettingsRowPrivate`: Disguised records are ignored
 * - record `SettingsWindowClass`: glib type struct are ignored
 * - record `SettingsWindowPrivate`: Disguised records are ignored
 * - record `SideBarClass`: glib type struct are ignored
 * - record `SideBarPrivate`: Disguised records are ignored
 * - record `SwitchBarClass`: glib type struct are ignored
 * - record `SwitchBarPrivate`: Disguised records are ignored
 * - record `TabClass`: glib type struct are ignored
 * - record `TabPrivate`: Disguised records are ignored
 * - record `TabPageClass`: glib type struct are ignored
 * - record `TabPagePrivate`: Disguised records are ignored
 * - record `TabSwitcherClass`: glib type struct are ignored
 * - record `TabSwitcherPrivate`: Disguised records are ignored
 * - record `TextButtonClass`: glib type struct are ignored
 * - record `TextButtonPrivate`: Disguised records are ignored
 * - record `TextFieldClass`: glib type struct are ignored
 * - record `TextFieldPrivate`: Disguised records are ignored
 * - record `TimePickerClass`: glib type struct are ignored
 * - record `TimePickerPrivate`: Disguised records are ignored
 * - record `TintButtonClass`: glib type struct are ignored
 * - record `TintButtonPrivate`: Disguised records are ignored
 * - record `ToastClass`: glib type struct are ignored
 * - record `ToastPrivate`: Disguised records are ignored
 * - record `ViewAuxClass`: glib type struct are ignored
 * - record `ViewAuxPrivate`: Disguised records are ignored
 * - record `ViewChooserClass`: glib type struct are ignored
 * - record `ViewChooserPrivate`: Disguised records are ignored
 * - record `ViewDualClass`: glib type struct are ignored
 * - record `ViewDualPrivate`: Disguised records are ignored
 * - record `ViewMonoClass`: glib type struct are ignored
 * - record `ViewMonoPrivate`: Disguised records are ignored
 * - record `ViewSubTitleClass`: glib type struct are ignored
 * - record `ViewSubTitlePrivate`: Disguised records are ignored
 * - record `ViewSwitcherClass`: glib type struct are ignored
 * - record `ViewSwitcherPrivate`: Disguised records are ignored
 * - record `ViewTitleClass`: glib type struct are ignored
 * - record `ViewTitlePrivate`: Disguised records are ignored
 * - record `WelcomeScreenClass`: glib type struct are ignored
 * - record `WelcomeScreenPrivate`: Disguised records are ignored
 */
public object He {
    /**
     *
     *
     * @param red
     * @param green
     * @param blue
     */
    public fun colorArgbFromRgbInt(
        red: Int,
        green: Int,
        blue: Int,
    ): Int = he_color_argb_from_rgb_int(red, green, blue)

    /**
     *
     *
     * @param argb
     */
    public fun colorAlphaFromRgbaInt(argb: Int): Int = he_color_alpha_from_rgba_int(argb)

    /**
     *
     *
     * @param argb
     */
    public fun colorRedFromRgbaInt(argb: Int): Int = he_color_red_from_rgba_int(argb)

    /**
     *
     *
     * @param argb
     */
    public fun colorGreenFromRgbaInt(argb: Int): Int = he_color_green_from_rgba_int(argb)

    /**
     *
     *
     * @param argb
     */
    public fun colorBlueFromRgbaInt(argb: Int): Int = he_color_blue_from_rgba_int(argb)

    /**
     *
     *
     * @param x
     */
    public fun colorCriticalPlaneBelow(x: Double): Int = he_color_critical_plane_below(x)

    /**
     *
     *
     * @param x
     */
    public fun colorCriticalPlaneAbove(x: Double): Int = he_color_critical_plane_above(x)

    /**
     *
     *
     * @param hue
     * @param chroma
     * @param lstar
     */
    public fun colorHctToHex(
        hue: Double,
        chroma: Double,
        lstar: Double,
    ): String =
        he_color_hct_to_hex(hue, chroma, lstar)?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param hue
     * @param chroma
     * @param lstar
     */
    public fun colorHctToArgb(
        hue: Double,
        chroma: Double,
        lstar: Double,
    ): Int = he_color_hct_to_argb(hue, chroma, lstar)

    /**
     *
     *
     * @param red
     * @param green
     * @param blue
     */
    public fun colorRgbFromLinrgb(
        red: Int,
        green: Int,
        blue: Int,
    ): Int = he_color_rgb_from_linrgb(red, green, blue)

    /**
     *
     *
     * @param hr
     * @param c
     * @param y
     */
    public fun colorFindResultByJ(
        hr: Double,
        c: Double,
        y: Double,
    ): Int = he_color_find_result_by_j(hr, c, y)

    /**
     *
     *
     * @param r
     * @param g
     * @param b
     */
    public fun colorHexcode(
        r: Double,
        g: Double,
        b: Double,
    ): String = he_color_hexcode(r, g, b)?.toKString() ?: error("Expected not null string")

    /**
     *
     *
     * @param color
     */
    public fun colorHexcodeArgb(color: Int): String =
        he_color_hexcode_argb(color)?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param v
     */
    public fun colorXyzValueToLab(v: Double): Double = he_color_xyz_value_to_lab(v)

    /**
     *
     *
     * @param v
     */
    public fun colorRgbValueToXyz(v: Double): Double = he_color_rgb_value_to_xyz(v)

    /**
     *
     *
     * @param min
     * @param max
     * @param input
     */
    public fun mathUtilsClampDouble(
        min: Double,
        max: Double,
        input: Double,
    ): Double = he_math_utils_clamp_double(min, max, input)

    /**
     *
     *
     * @param x
     */
    public fun mathUtilsSignum(x: Double): Int = he_math_utils_signum(x)

    /**
     *
     *
     * @param component
     */
    public fun mathUtilsChromaticAdaptation(component: Double): Double = he_math_utils_chromatic_adaptation(component)

    /**
     *
     *
     * @param adapted
     */
    public fun mathUtilsInverseChromaticAdaptation(adapted: Double): Double =
        he_math_utils_inverse_chromatic_adaptation(adapted)

    /**
     *
     *
     * @param a
     * @param b
     * @param t
     */
    public fun mathUtilsLerp(
        a: Double,
        b: Double,
        t: Double,
    ): Double = he_math_utils_lerp(a, b, t)

    /**
     *
     *
     * @param angle
     */
    public fun mathUtilsSanitizeRadians(angle: Double): Double = he_math_utils_sanitize_radians(angle)

    /**
     *
     *
     * @param x
     */
    public fun mathUtilsIsBoundedRgb(x: Double): Boolean = he_math_utils_is_bounded_rgb(x).asBoolean()

    /**
     *
     *
     * @param colorChannel
     */
    public fun mathUtilsAdapt(colorChannel: Double): Double = he_math_utils_adapt(colorChannel)

    /**
     *
     *
     * @param ft
     */
    public fun mathUtilsLabInverseFovea(ft: Double): Double = he_math_utils_lab_inverse_fovea(ft)

    /**
     *
     *
     * @param t
     */
    public fun mathUtilsLabFovea(t: Double): Double = he_math_utils_lab_fovea(t)

    /**
     *
     *
     * @param degrees
     */
    public fun mathUtilsSanitizeDegrees(degrees: Double): Double = he_math_utils_sanitize_degrees(degrees)

    /**
     *
     *
     * @param degrees
     */
    public fun mathUtilsSanitizeDegreesInt(degrees: Int): Int = he_math_utils_sanitize_degrees_int(degrees)

    /**
     *
     *
     * @param from
     * @param to
     */
    public fun mathUtilsRotateDirection(
        from: Double,
        to: Double,
    ): Double = he_math_utils_rotate_direction(from, to)

    /**
     *
     *
     * @param a
     * @param b
     */
    public fun mathUtilsDifferenceDegrees(
        a: Double,
        b: Double,
    ): Double = he_math_utils_difference_degrees(a, b)

    /**
     *
     *
     * @param n
     */
    public fun mathUtilsAbs(n: Double): Double = he_math_utils_abs(n)

    /**
     *
     *
     * @param n
     * @param m
     */
    public fun mathUtilsMax(
        n: Double,
        m: Double,
    ): Double = he_math_utils_max(n, m)

    /**
     *
     *
     * @param n
     * @param m
     */
    public fun mathUtilsMin(
        n: Double,
        m: Double,
    ): Double = he_math_utils_min(n, m)

    /**
     *
     *
     * @param rgbComponent
     */
    public fun mathUtilsLinearized(rgbComponent: Int): Double = he_math_utils_linearized(rgbComponent)

    /**
     *
     *
     * @param rgbComponent
     */
    public fun mathUtilsDelinearized(rgbComponent: Double): Int = he_math_utils_delinearized(rgbComponent)

    /**
     *
     *
     * @param rgbComponent
     */
    public fun mathUtilsDoubleDelinearized(rgbComponent: Double): Double =
        he_math_utils_double_delinearized(rgbComponent)

    /**
     *
     *
     * @param source
     * @param mid
     * @param target
     */
    public fun mathUtilsIntercept(
        source: Double,
        mid: Double,
        target: Double,
    ): Double = he_math_utils_intercept(source, mid, target)

    /**
     *
     *
     * @param a
     * @param b
     * @param c
     */
    public fun mathUtilsAreInCyclicOrder(
        a: Double,
        b: Double,
        c: Double,
    ): Boolean = he_math_utils_are_in_cyclic_order(a, b, c).asBoolean()

    /**
     *
     *
     * @param value
     */
    public fun mathUtilsConvert(`value`: Double): Double = he_math_utils_convert(`value`)

    /**
     *
     *
     * @param lstar
     */
    public fun mathUtilsYFromLstar(lstar: Double): Double = he_math_utils_y_from_lstar(lstar)

    /**
     *
     *
     * @param lstar
     */
    public fun mathUtilsArgbFromLstar(lstar: Double): Int = he_math_utils_argb_from_lstar(lstar)

    /**
     *
     *
     * @param argb
     */
    public fun mathUtilsLstarFromArgb(argb: Int): Double = he_math_utils_lstar_from_argb(argb)

    /**
     *
     *
     * @param red
     * @param green
     * @param blue
     * @param red2
     * @param green2
     * @param blue2
     */
    public fun miscContrastRatio(
        red: Double,
        green: Double,
        blue: Double,
        red2: Double,
        green2: Double,
        blue2: Double,
    ): Double = he_misc_contrast_ratio(red, green, blue, red2, green2, blue2)

    /**
     *
     *
     * @param accel
     */
    public fun miscAccelLabel(accel: String?): String =
        he_misc_accel_label(accel)?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param accels
     * @param accelsLength1
     * @param description
     */
    public fun miscAccelString(
        accels: List<String>?,
        accelsLength1: Int,
        description: String?,
    ): String =
        memScoped {
            return he_misc_accel_string(
                accels?.toCStringList(this),
                accelsLength1,
                description
            )?.toKString() ?: error("Expected not null string")
        }

    /**
     *
     *
     * @param align
     */
    public fun modifierBadgeAlignmentFromGtkAlign(align: Align): ModifierBadgeAlignment =
        he_modifier_badge_alignment_from_gtk_align(align.nativeValue).run {
            ModifierBadgeAlignment.fromNativeValue(this)
        }

    /**
     *
     *
     * @param align
     */
    public fun overlayButtonAlignmentFromGtkAlign(align: Align): OverlayButtonAlignment =
        he_overlay_button_alignment_from_gtk_align(align.nativeValue).run {
            OverlayButtonAlignment.fromNativeValue(this)
        }
}
