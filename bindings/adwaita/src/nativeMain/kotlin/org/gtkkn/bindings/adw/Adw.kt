// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gtk.Settings
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.native.adw.adw_breakpoint_condition_parse
import org.gtkkn.native.adw.adw_easing_ease
import org.gtkkn.native.adw.adw_get_enable_animations
import org.gtkkn.native.adw.adw_get_major_version
import org.gtkkn.native.adw.adw_get_micro_version
import org.gtkkn.native.adw.adw_get_minor_version
import org.gtkkn.native.adw.adw_init
import org.gtkkn.native.adw.adw_is_initialized
import org.gtkkn.native.adw.adw_length_unit_from_px
import org.gtkkn.native.adw.adw_length_unit_to_px
import org.gtkkn.native.adw.adw_lerp
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - record `AboutDialogClass`: glib type struct are ignored
 * - record `AboutWindowClass`: glib type struct are ignored
 * - record `ActionRowClass`: glib type struct are ignored
 * - record `AlertDialogClass`: glib type struct are ignored
 * - record `AnimationClass`: glib type struct are ignored
 * - record `AnimationTargetClass`: glib type struct are ignored
 * - record `ApplicationClass`: glib type struct are ignored
 * - record `ApplicationWindowClass`: glib type struct are ignored
 * - record `AvatarClass`: glib type struct are ignored
 * - record `BannerClass`: glib type struct are ignored
 * - record `BinClass`: glib type struct are ignored
 * - record `BreakpointBinClass`: glib type struct are ignored
 * - record `BreakpointClass`: glib type struct are ignored
 * - record `ButtonContentClass`: glib type struct are ignored
 * - record `CallbackAnimationTargetClass`: glib type struct are ignored
 * - record `CarouselClass`: glib type struct are ignored
 * - record `CarouselIndicatorDotsClass`: glib type struct are ignored
 * - record `CarouselIndicatorLinesClass`: glib type struct are ignored
 * - record `ClampClass`: glib type struct are ignored
 * - record `ClampLayoutClass`: glib type struct are ignored
 * - record `ClampScrollableClass`: glib type struct are ignored
 * - record `ComboRowClass`: glib type struct are ignored
 * - record `DialogClass`: glib type struct are ignored
 * - record `EntryRowClass`: glib type struct are ignored
 * - record `EnumListItemClass`: glib type struct are ignored
 * - record `EnumListModelClass`: glib type struct are ignored
 * - record `ExpanderRowClass`: glib type struct are ignored
 * - record `FlapClass`: glib type struct are ignored
 * - record `HeaderBarClass`: glib type struct are ignored
 * - record `LeafletClass`: glib type struct are ignored
 * - record `LeafletPageClass`: glib type struct are ignored
 * - record `MessageDialogClass`: glib type struct are ignored
 * - record `NavigationPageClass`: glib type struct are ignored
 * - record `NavigationSplitViewClass`: glib type struct are ignored
 * - record `NavigationViewClass`: glib type struct are ignored
 * - record `OverlaySplitViewClass`: glib type struct are ignored
 * - record `PasswordEntryRowClass`: glib type struct are ignored
 * - record `PreferencesDialogClass`: glib type struct are ignored
 * - record `PreferencesGroupClass`: glib type struct are ignored
 * - record `PreferencesPageClass`: glib type struct are ignored
 * - record `PreferencesRowClass`: glib type struct are ignored
 * - record `PreferencesWindowClass`: glib type struct are ignored
 * - record `PropertyAnimationTargetClass`: glib type struct are ignored
 * - record `SpinRowClass`: glib type struct are ignored
 * - record `SplitButtonClass`: glib type struct are ignored
 * - record `SpringAnimationClass`: glib type struct are ignored
 * - record `SqueezerClass`: glib type struct are ignored
 * - record `SqueezerPageClass`: glib type struct are ignored
 * - record `StatusPageClass`: glib type struct are ignored
 * - record `StyleManagerClass`: glib type struct are ignored
 * - record `SwipeTrackerClass`: glib type struct are ignored
 * - record `SwipeableInterface`: glib type struct are ignored
 * - record `SwitchRowClass`: glib type struct are ignored
 * - record `TabBarClass`: glib type struct are ignored
 * - record `TabButtonClass`: glib type struct are ignored
 * - record `TabOverviewClass`: glib type struct are ignored
 * - record `TabPageClass`: glib type struct are ignored
 * - record `TabViewClass`: glib type struct are ignored
 * - record `TimedAnimationClass`: glib type struct are ignored
 * - record `ToastClass`: glib type struct are ignored
 * - record `ToastOverlayClass`: glib type struct are ignored
 * - record `ToolbarViewClass`: glib type struct are ignored
 * - record `ViewStackClass`: glib type struct are ignored
 * - record `ViewStackPageClass`: glib type struct are ignored
 * - record `ViewStackPagesClass`: glib type struct are ignored
 * - record `ViewSwitcherBarClass`: glib type struct are ignored
 * - record `ViewSwitcherClass`: glib type struct are ignored
 * - record `ViewSwitcherTitleClass`: glib type struct are ignored
 * - record `WindowClass`: glib type struct are ignored
 * - record `WindowTitleClass`: glib type struct are ignored
 */
public object Adw {
    /**
     * Indicates an [class@Animation] with an infinite duration.
     *
     * This value is mostly used internally.
     */
    public const val DURATION_INFINITE: UInt = UInt.MAX_VALUE

    /**
     * Adwaita major version component (e.g. 1 if the version is 1.2.3).
     */
    public const val MAJOR_VERSION: Int = 1

    /**
     * Adwaita micro version component (e.g. 3 if the version is 1.2.3).
     */
    public const val MICRO_VERSION: Int = 0

    /**
     * Adwaita minor version component (e.g. 2 if the version is 1.2.3).
     */
    public const val MINOR_VERSION: Int = 5

    /**
     * Adwaita version, encoded as a string, useful for printing and
     * concatenation.
     */
    public const val VERSION_S: String = "1.5.0"

    /**
     * Parses a condition from a string.
     *
     * Length conditions are specified as `<type>: <value>[<unit>]`, where:
     *
     * - `<type>` can be `min-width`, `max-width`, `min-height` or `max-height`
     * - `<value>` is a fractional number
     * - `<unit>` can be `px`, `pt` or `sp`
     *
     * If the unit is omitted, `px` is assumed.
     *
     * See [ctor@BreakpointCondition.new_length].
     *
     * Examples:
     *
     * - `min-width: 500px`
     * - `min-height: 400pt`
     * - `max-width: 100sp`
     * - `max-height: 500`
     *
     * Ratio conditions are specified as `<type>: <width>[/<height>]`, where:
     *
     * - `<type>` can be `min-aspect-ratio` or `max-aspect-ratio`
     * - `<width>` and `<height>` are integer numbers
     *
     * See [ctor@BreakpointCondition.new_ratio].
     *
     * The ratio is represented as `<width>` divided by `<height>`.
     *
     * If `<height>` is omitted, it's assumed to be 1.
     *
     * Examples:
     *
     * - `min-aspect-ratio: 4/3`
     * - `max-aspect-ratio: 1`
     *
     * The logical operators `and`, `or` can be used to compose a complex condition
     * as follows:
     *
     * - `<condition> and <condition>`: the condition is true when both
     *   `<condition>`s are true, same as when using
     *   [ctor@BreakpointCondition.new_and]
     * - `<condition> or <condition>`: the condition is true when either of the
     *   `<condition>`s is true, same as when using
     *   [ctor@BreakpointCondition.new_or]
     *
     * Examples:
     *
     * - `min-width: 400px and max-aspect-ratio: 4/3`
     * - `max-width: 360sp or max-width: 360px`
     *
     * Conditions can be further nested using parentheses, for example:
     *
     * - `min-width: 400px and (max-aspect-ratio: 4/3 or max-height: 400px)`
     *
     * If parentheses are omitted, the first operator takes priority.
     *
     * @param str the string specifying the condition
     * @return the parsed condition
     * @since 1.4
     */
    public fun breakpointConditionParse(str: String): BreakpointCondition =
        adw_breakpoint_condition_parse(str)!!.run {
            BreakpointCondition(reinterpret())
        }

    /**
     * Computes easing with @easing for @value.
     *
     * @value should generally be in the [0, 1] range.
     *
     * @param self an easing value
     * @param value a value to ease
     * @return the easing for @value
     */
    public fun easingEase(
        self: Easing,
        `value`: Double,
    ): Double = adw_easing_ease(self.nativeValue, `value`)

    /**
     * Checks whether animations are enabled for @widget.
     *
     * This should be used when implementing an animated widget to know whether to
     * animate it or not.
     *
     * @param widget a `GtkWidget`
     * @return whether animations are enabled for @widget
     */
    public fun getEnableAnimations(widget: Widget): Boolean =
        adw_get_enable_animations(widget.gtkWidgetPointer.reinterpret()).asBoolean()

    /**
     * Returns the major version number of the Adwaita library.
     *
     * For example, in libadwaita version 1.2.3 this is 1.
     *
     * This function is in the library, so it represents the libadwaita library your
     * code is running against. Contrast with the [const@MAJOR_VERSION] constant,
     * which represents the major version of the libadwaita headers you have
     * included when compiling your code.
     *
     * @return the major version number of the Adwaita library
     */
    public fun getMajorVersion(): UInt = adw_get_major_version()

    /**
     * Returns the micro version number of the Adwaita library.
     *
     * For example, in libadwaita version 1.2.3 this is 3.
     *
     * This function is in the library, so it represents the libadwaita library your
     * code is running against. Contrast with the [const@MAJOR_VERSION] constant,
     * which represents the micro version of the libadwaita headers you have
     * included when compiling your code.
     *
     * @return the micro version number of the Adwaita library
     */
    public fun getMicroVersion(): UInt = adw_get_micro_version()

    /**
     * Returns the minor version number of the Adwaita library.
     *
     * For example, in libadwaita version 1.2.3 this is 2.
     *
     * This function is in the library, so it represents the libadwaita library your
     * code is running against. Contrast with the [const@MAJOR_VERSION] constant,
     * which represents the minor version of the libadwaita headers you have
     * included when compiling your code.
     *
     * @return the minor version number of the Adwaita library
     */
    public fun getMinorVersion(): UInt = adw_get_minor_version()

    /**
     * Initializes Libadwaita.
     *
     * This function can be used instead of [func@Gtk.init] as it initializes GTK
     * implicitly.
     *
     * There's no need to call this function if you're using [class@Application].
     *
     * If Libadwaita has already been initialized, the function will simply return.
     *
     * This makes sure translations, types, themes, and icons for the Adwaita
     * library are set up properly.
     */
    public fun `init`(): Unit = adw_init()

    /**
     * Use this function to check if libadwaita has been initialized with
     * [func@init].
     *
     * @return the initialization status
     */
    public fun isInitialized(): Boolean = adw_is_initialized().asBoolean()

    /**
     * Converts @value from pixels to @unit.
     *
     * @param unit a length unit
     * @param value a value in pixels
     * @param settings settings to use, or `NULL` for default settings
     * @return the length in @unit
     * @since 1.4
     */
    public fun lengthUnitFromPx(
        unit: LengthUnit,
        `value`: Double,
        settings: Settings? = null,
    ): Double = adw_length_unit_from_px(unit.nativeValue, `value`, settings?.gtkSettingsPointer?.reinterpret())

    /**
     * Converts @value from @unit to pixels.
     *
     * @param unit a length unit
     * @param value a value in @unit
     * @param settings settings to use, or `NULL` for default settings
     * @return the length in pixels
     * @since 1.4
     */
    public fun lengthUnitToPx(
        unit: LengthUnit,
        `value`: Double,
        settings: Settings? = null,
    ): Double = adw_length_unit_to_px(unit.nativeValue, `value`, settings?.gtkSettingsPointer?.reinterpret())

    /**
     * Computes the linear interpolation between @a and @b for @t.
     *
     * @param a the start
     * @param b the end
     * @param t the interpolation rate
     * @return the computed value
     */
    public fun lerp(
        a: Double,
        b: Double,
        t: Double,
    ): Double = adw_lerp(a, b, t)
}

public val AnimationTargetFuncFunc: CPointer<CFunction<(Double) -> Unit>> =
    staticCFunction {
            `value`: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Double) -> Unit>().get().invoke(`value`)
    }.reinterpret()

/**
 * Prototype for animation targets based on user callbacks.
 *
 * - param `value` The animation value
 */
public typealias AnimationTargetFunc = (`value`: Double) -> Unit
