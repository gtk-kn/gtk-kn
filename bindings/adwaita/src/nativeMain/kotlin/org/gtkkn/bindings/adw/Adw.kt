// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.adw.adw_get_enable_animations
import org.gtkkn.native.adw.adw_get_major_version
import org.gtkkn.native.adw.adw_get_micro_version
import org.gtkkn.native.adw.adw_get_minor_version
import org.gtkkn.native.adw.adw_init
import org.gtkkn.native.adw.adw_is_initialized
import org.gtkkn.native.adw.adw_lerp
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint32
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - function `show_about_dialog`: Varargs parameter is not supported
 * - function `show_about_dialog_from_appdata`: Varargs parameter is not supported
 * - function `show_about_window`: Varargs parameter is not supported
 * - function `show_about_window_from_appdata`: Varargs parameter is not supported
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
    public const val DURATION_INFINITE: guint32 = UInt.MAX_VALUE

    /**
     * Adwaita major version component (e.g. 1 if the version is 1.2.3).
     */
    public const val MAJOR_VERSION: gint = 1

    /**
     * Adwaita micro version component (e.g. 3 if the version is 1.2.3).
     */
    public const val MICRO_VERSION: gint = 0

    /**
     * Adwaita minor version component (e.g. 2 if the version is 1.2.3).
     */
    public const val MINOR_VERSION: gint = 5

    /**
     * Adwaita version, encoded as a string, useful for printing and
     * concatenation.
     */
    public const val VERSION_S: String = "1.5.0"

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
        adw_get_enable_animations(widget.gtkWidgetPointer).asBoolean()

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
    public fun getMajorVersion(): guint = adw_get_major_version()

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
    public fun getMicroVersion(): guint = adw_get_micro_version()

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
    public fun getMinorVersion(): guint = adw_get_minor_version()

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
     * Computes the linear interpolation between @a and @b for @t.
     *
     * @param a the start
     * @param b the end
     * @param t the interpolation rate
     * @return the computed value
     */
    public fun lerp(a: gdouble, b: gdouble, t: gdouble): gdouble = adw_lerp(a, b, t)
}

public val AnimationTargetFuncFunc: CPointer<CFunction<(gdouble) -> Unit>> = staticCFunction {
        `value`: gdouble,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(`value`: gdouble) -> Unit>().get().invoke(`value`)
}
    .reinterpret()

/**
 * Prototype for animation targets based on user callbacks.
 *
 * - param `value` The animation value
 */
public typealias AnimationTargetFunc = (`value`: gdouble) -> Unit
