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
import org.gtkkn.extensions.gobject.TypeCache
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
    init {
        registerTypes()
    }

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

    private fun registerTypes() {
        AboutDialog.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AboutDialog::class, gtype) { AboutDialog(it.reinterpret()) }
        }
        AboutWindow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AboutWindow::class, gtype) { AboutWindow(it.reinterpret()) }
        }
        ActionRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ActionRow::class, gtype) { ActionRow(it.reinterpret()) }
        }
        AlertDialog.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AlertDialog::class, gtype) { AlertDialog(it.reinterpret()) }
        }
        Animation.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Animation::class, gtype) { Animation.AnimationImpl(it.reinterpret()) }
        }
        AnimationTarget.getTypeOrNull()?.let { gtype ->
            TypeCache.register(AnimationTarget::class, gtype) { AnimationTarget.AnimationTargetImpl(it.reinterpret()) }
        }
        Application.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Application::class, gtype) { Application(it.reinterpret()) }
        }
        ApplicationWindow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ApplicationWindow::class, gtype) { ApplicationWindow(it.reinterpret()) }
        }
        Avatar.getTypeOrNull()?.let { gtype -> TypeCache.register(Avatar::class, gtype) { Avatar(it.reinterpret()) } }
        Banner.getTypeOrNull()?.let { gtype -> TypeCache.register(Banner::class, gtype) { Banner(it.reinterpret()) } }
        Bin.getTypeOrNull()?.let { gtype -> TypeCache.register(Bin::class, gtype) { Bin(it.reinterpret()) } }
        Breakpoint.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Breakpoint::class, gtype) { Breakpoint(it.reinterpret()) }
        }
        BreakpointBin.getTypeOrNull()?.let { gtype ->
            TypeCache.register(BreakpointBin::class, gtype) { BreakpointBin(it.reinterpret()) }
        }
        ButtonContent.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ButtonContent::class, gtype) { ButtonContent(it.reinterpret()) }
        }
        CallbackAnimationTarget.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CallbackAnimationTarget::class, gtype) { CallbackAnimationTarget(it.reinterpret()) }
        }
        Carousel.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Carousel::class, gtype) { Carousel(it.reinterpret()) }
        }
        CarouselIndicatorDots.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CarouselIndicatorDots::class, gtype) { CarouselIndicatorDots(it.reinterpret()) }
        }
        CarouselIndicatorLines.getTypeOrNull()?.let { gtype ->
            TypeCache.register(CarouselIndicatorLines::class, gtype) { CarouselIndicatorLines(it.reinterpret()) }
        }
        Clamp.getTypeOrNull()?.let { gtype -> TypeCache.register(Clamp::class, gtype) { Clamp(it.reinterpret()) } }
        ClampLayout.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ClampLayout::class, gtype) { ClampLayout(it.reinterpret()) }
        }
        ClampScrollable.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ClampScrollable::class, gtype) { ClampScrollable(it.reinterpret()) }
        }
        ComboRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ComboRow::class, gtype) { ComboRow(it.reinterpret()) }
        }
        Dialog.getTypeOrNull()?.let { gtype -> TypeCache.register(Dialog::class, gtype) { Dialog(it.reinterpret()) } }
        EntryRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(EntryRow::class, gtype) { EntryRow(it.reinterpret()) }
        }
        EnumListItem.getTypeOrNull()?.let { gtype ->
            TypeCache.register(EnumListItem::class, gtype) { EnumListItem(it.reinterpret()) }
        }
        EnumListModel.getTypeOrNull()?.let { gtype ->
            TypeCache.register(EnumListModel::class, gtype) { EnumListModel(it.reinterpret()) }
        }
        ExpanderRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ExpanderRow::class, gtype) { ExpanderRow(it.reinterpret()) }
        }
        Flap.getTypeOrNull()?.let { gtype -> TypeCache.register(Flap::class, gtype) { Flap(it.reinterpret()) } }
        HeaderBar.getTypeOrNull()?.let { gtype ->
            TypeCache.register(HeaderBar::class, gtype) { HeaderBar(it.reinterpret()) }
        }
        Leaflet.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Leaflet::class, gtype) { Leaflet(it.reinterpret()) }
        }
        LeafletPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(LeafletPage::class, gtype) { LeafletPage(it.reinterpret()) }
        }
        MessageDialog.getTypeOrNull()?.let { gtype ->
            TypeCache.register(MessageDialog::class, gtype) { MessageDialog(it.reinterpret()) }
        }
        NavigationPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NavigationPage::class, gtype) { NavigationPage(it.reinterpret()) }
        }
        NavigationSplitView.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NavigationSplitView::class, gtype) { NavigationSplitView(it.reinterpret()) }
        }
        NavigationView.getTypeOrNull()?.let { gtype ->
            TypeCache.register(NavigationView::class, gtype) { NavigationView(it.reinterpret()) }
        }
        OverlaySplitView.getTypeOrNull()?.let { gtype ->
            TypeCache.register(OverlaySplitView::class, gtype) { OverlaySplitView(it.reinterpret()) }
        }
        PasswordEntryRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PasswordEntryRow::class, gtype) { PasswordEntryRow(it.reinterpret()) }
        }
        PreferencesDialog.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PreferencesDialog::class, gtype) { PreferencesDialog(it.reinterpret()) }
        }
        PreferencesGroup.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PreferencesGroup::class, gtype) { PreferencesGroup(it.reinterpret()) }
        }
        PreferencesPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PreferencesPage::class, gtype) { PreferencesPage(it.reinterpret()) }
        }
        PreferencesRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PreferencesRow::class, gtype) { PreferencesRow(it.reinterpret()) }
        }
        PreferencesWindow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PreferencesWindow::class, gtype) { PreferencesWindow(it.reinterpret()) }
        }
        PropertyAnimationTarget.getTypeOrNull()?.let { gtype ->
            TypeCache.register(PropertyAnimationTarget::class, gtype) { PropertyAnimationTarget(it.reinterpret()) }
        }
        SpinRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SpinRow::class, gtype) { SpinRow(it.reinterpret()) }
        }
        SplitButton.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SplitButton::class, gtype) { SplitButton(it.reinterpret()) }
        }
        SpringAnimation.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SpringAnimation::class, gtype) { SpringAnimation(it.reinterpret()) }
        }
        Squeezer.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Squeezer::class, gtype) { Squeezer(it.reinterpret()) }
        }
        SqueezerPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SqueezerPage::class, gtype) { SqueezerPage(it.reinterpret()) }
        }
        StatusPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StatusPage::class, gtype) { StatusPage(it.reinterpret()) }
        }
        StyleManager.getTypeOrNull()?.let { gtype ->
            TypeCache.register(StyleManager::class, gtype) { StyleManager(it.reinterpret()) }
        }
        SwipeTracker.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SwipeTracker::class, gtype) { SwipeTracker(it.reinterpret()) }
        }
        SwitchRow.getTypeOrNull()?.let { gtype ->
            TypeCache.register(SwitchRow::class, gtype) { SwitchRow(it.reinterpret()) }
        }
        TabBar.getTypeOrNull()?.let { gtype -> TypeCache.register(TabBar::class, gtype) { TabBar(it.reinterpret()) } }
        TabButton.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TabButton::class, gtype) { TabButton(it.reinterpret()) }
        }
        TabOverview.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TabOverview::class, gtype) { TabOverview(it.reinterpret()) }
        }
        TabPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TabPage::class, gtype) { TabPage(it.reinterpret()) }
        }
        TabView.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TabView::class, gtype) { TabView(it.reinterpret()) }
        }
        TimedAnimation.getTypeOrNull()?.let { gtype ->
            TypeCache.register(TimedAnimation::class, gtype) { TimedAnimation(it.reinterpret()) }
        }
        Toast.getTypeOrNull()?.let { gtype -> TypeCache.register(Toast::class, gtype) { Toast(it.reinterpret()) } }
        ToastOverlay.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ToastOverlay::class, gtype) { ToastOverlay(it.reinterpret()) }
        }
        ToolbarView.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ToolbarView::class, gtype) { ToolbarView(it.reinterpret()) }
        }
        ViewStack.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ViewStack::class, gtype) { ViewStack(it.reinterpret()) }
        }
        ViewStackPage.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ViewStackPage::class, gtype) { ViewStackPage(it.reinterpret()) }
        }
        ViewStackPages.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ViewStackPages::class, gtype) { ViewStackPages(it.reinterpret()) }
        }
        ViewSwitcher.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ViewSwitcher::class, gtype) { ViewSwitcher(it.reinterpret()) }
        }
        ViewSwitcherBar.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ViewSwitcherBar::class, gtype) { ViewSwitcherBar(it.reinterpret()) }
        }
        ViewSwitcherTitle.getTypeOrNull()?.let { gtype ->
            TypeCache.register(ViewSwitcherTitle::class, gtype) { ViewSwitcherTitle(it.reinterpret()) }
        }
        Window.getTypeOrNull()?.let { gtype -> TypeCache.register(Window::class, gtype) { Window(it.reinterpret()) } }
        WindowTitle.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WindowTitle::class, gtype) { WindowTitle(it.reinterpret()) }
        }
        Swipeable.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Swipeable::class, gtype) { Swipeable.SwipeableImpl(it.reinterpret()) }
        }
    }
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
