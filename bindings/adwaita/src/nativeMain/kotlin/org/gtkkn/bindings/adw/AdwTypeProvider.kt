// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object AdwTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("adw_about_dialog_get_type") != null) put(AboutDialog::class, AboutDialog.type)
        if (getTypeOrNull("adw_about_window_get_type") != null) put(AboutWindow::class, AboutWindow.type)
        if (getTypeOrNull("adw_action_row_get_type") != null) put(ActionRow::class, ActionRow.type)
        if (getTypeOrNull("adw_alert_dialog_get_type") != null) put(AlertDialog::class, AlertDialog.type)
        if (getTypeOrNull("adw_animation_get_type") != null) put(Animation::class, Animation.type)
        if (getTypeOrNull("adw_animation_target_get_type") != null) put(AnimationTarget::class, AnimationTarget.type)
        if (getTypeOrNull("adw_application_get_type") != null) put(Application::class, Application.type)
        if (getTypeOrNull("adw_application_window_get_type") !=
            null
        ) {
            put(ApplicationWindow::class, ApplicationWindow.type)
        }
        if (getTypeOrNull("adw_avatar_get_type") != null) put(Avatar::class, Avatar.type)
        if (getTypeOrNull("adw_banner_get_type") != null) put(Banner::class, Banner.type)
        if (getTypeOrNull("adw_bin_get_type") != null) put(Bin::class, Bin.type)
        if (getTypeOrNull("adw_breakpoint_get_type") != null) put(Breakpoint::class, Breakpoint.type)
        if (getTypeOrNull("adw_breakpoint_bin_get_type") != null) put(BreakpointBin::class, BreakpointBin.type)
        if (getTypeOrNull("adw_button_content_get_type") != null) put(ButtonContent::class, ButtonContent.type)
        if (getTypeOrNull("adw_callback_animation_target_get_type") !=
            null
        ) {
            put(CallbackAnimationTarget::class, CallbackAnimationTarget.type)
        }
        if (getTypeOrNull("adw_carousel_get_type") != null) put(Carousel::class, Carousel.type)
        if (getTypeOrNull("adw_carousel_indicator_dots_get_type") !=
            null
        ) {
            put(CarouselIndicatorDots::class, CarouselIndicatorDots.type)
        }
        if (getTypeOrNull("adw_carousel_indicator_lines_get_type") !=
            null
        ) {
            put(CarouselIndicatorLines::class, CarouselIndicatorLines.type)
        }
        if (getTypeOrNull("adw_clamp_get_type") != null) put(Clamp::class, Clamp.type)
        if (getTypeOrNull("adw_clamp_layout_get_type") != null) put(ClampLayout::class, ClampLayout.type)
        if (getTypeOrNull("adw_clamp_scrollable_get_type") != null) put(ClampScrollable::class, ClampScrollable.type)
        if (getTypeOrNull("adw_combo_row_get_type") != null) put(ComboRow::class, ComboRow.type)
        if (getTypeOrNull("adw_dialog_get_type") != null) put(Dialog::class, Dialog.type)
        if (getTypeOrNull("adw_entry_row_get_type") != null) put(EntryRow::class, EntryRow.type)
        if (getTypeOrNull("adw_enum_list_item_get_type") != null) put(EnumListItem::class, EnumListItem.type)
        if (getTypeOrNull("adw_enum_list_model_get_type") != null) put(EnumListModel::class, EnumListModel.type)
        if (getTypeOrNull("adw_expander_row_get_type") != null) put(ExpanderRow::class, ExpanderRow.type)
        if (getTypeOrNull("adw_flap_get_type") != null) put(Flap::class, Flap.type)
        if (getTypeOrNull("adw_header_bar_get_type") != null) put(HeaderBar::class, HeaderBar.type)
        if (getTypeOrNull("adw_leaflet_get_type") != null) put(Leaflet::class, Leaflet.type)
        if (getTypeOrNull("adw_leaflet_page_get_type") != null) put(LeafletPage::class, LeafletPage.type)
        if (getTypeOrNull("adw_message_dialog_get_type") != null) put(MessageDialog::class, MessageDialog.type)
        if (getTypeOrNull("adw_navigation_page_get_type") != null) put(NavigationPage::class, NavigationPage.type)
        if (getTypeOrNull("adw_navigation_split_view_get_type") !=
            null
        ) {
            put(NavigationSplitView::class, NavigationSplitView.type)
        }
        if (getTypeOrNull("adw_navigation_view_get_type") != null) put(NavigationView::class, NavigationView.type)
        if (getTypeOrNull("adw_overlay_split_view_get_type") !=
            null
        ) {
            put(OverlaySplitView::class, OverlaySplitView.type)
        }
        if (getTypeOrNull("adw_password_entry_row_get_type") !=
            null
        ) {
            put(PasswordEntryRow::class, PasswordEntryRow.type)
        }
        if (getTypeOrNull("adw_preferences_dialog_get_type") !=
            null
        ) {
            put(PreferencesDialog::class, PreferencesDialog.type)
        }
        if (getTypeOrNull("adw_preferences_group_get_type") != null) put(PreferencesGroup::class, PreferencesGroup.type)
        if (getTypeOrNull("adw_preferences_page_get_type") != null) put(PreferencesPage::class, PreferencesPage.type)
        if (getTypeOrNull("adw_preferences_row_get_type") != null) put(PreferencesRow::class, PreferencesRow.type)
        if (getTypeOrNull("adw_preferences_window_get_type") !=
            null
        ) {
            put(PreferencesWindow::class, PreferencesWindow.type)
        }
        if (getTypeOrNull("adw_property_animation_target_get_type") !=
            null
        ) {
            put(PropertyAnimationTarget::class, PropertyAnimationTarget.type)
        }
        if (getTypeOrNull("adw_spin_row_get_type") != null) put(SpinRow::class, SpinRow.type)
        if (getTypeOrNull("adw_split_button_get_type") != null) put(SplitButton::class, SplitButton.type)
        if (getTypeOrNull("adw_spring_animation_get_type") != null) put(SpringAnimation::class, SpringAnimation.type)
        if (getTypeOrNull("adw_squeezer_get_type") != null) put(Squeezer::class, Squeezer.type)
        if (getTypeOrNull("adw_squeezer_page_get_type") != null) put(SqueezerPage::class, SqueezerPage.type)
        if (getTypeOrNull("adw_status_page_get_type") != null) put(StatusPage::class, StatusPage.type)
        if (getTypeOrNull("adw_style_manager_get_type") != null) put(StyleManager::class, StyleManager.type)
        if (getTypeOrNull("adw_swipe_tracker_get_type") != null) put(SwipeTracker::class, SwipeTracker.type)
        if (getTypeOrNull("adw_switch_row_get_type") != null) put(SwitchRow::class, SwitchRow.type)
        if (getTypeOrNull("adw_tab_bar_get_type") != null) put(TabBar::class, TabBar.type)
        if (getTypeOrNull("adw_tab_button_get_type") != null) put(TabButton::class, TabButton.type)
        if (getTypeOrNull("adw_tab_overview_get_type") != null) put(TabOverview::class, TabOverview.type)
        if (getTypeOrNull("adw_tab_page_get_type") != null) put(TabPage::class, TabPage.type)
        if (getTypeOrNull("adw_tab_view_get_type") != null) put(TabView::class, TabView.type)
        if (getTypeOrNull("adw_timed_animation_get_type") != null) put(TimedAnimation::class, TimedAnimation.type)
        if (getTypeOrNull("adw_toast_get_type") != null) put(Toast::class, Toast.type)
        if (getTypeOrNull("adw_toast_overlay_get_type") != null) put(ToastOverlay::class, ToastOverlay.type)
        if (getTypeOrNull("adw_toolbar_view_get_type") != null) put(ToolbarView::class, ToolbarView.type)
        if (getTypeOrNull("adw_view_stack_get_type") != null) put(ViewStack::class, ViewStack.type)
        if (getTypeOrNull("adw_view_stack_page_get_type") != null) put(ViewStackPage::class, ViewStackPage.type)
        if (getTypeOrNull("adw_view_stack_pages_get_type") != null) put(ViewStackPages::class, ViewStackPages.type)
        if (getTypeOrNull("adw_view_switcher_get_type") != null) put(ViewSwitcher::class, ViewSwitcher.type)
        if (getTypeOrNull("adw_view_switcher_bar_get_type") != null) put(ViewSwitcherBar::class, ViewSwitcherBar.type)
        if (getTypeOrNull("adw_view_switcher_title_get_type") !=
            null
        ) {
            put(ViewSwitcherTitle::class, ViewSwitcherTitle.type)
        }
        if (getTypeOrNull("adw_window_get_type") != null) put(Window::class, Window.type)
        if (getTypeOrNull("adw_window_title_get_type") != null) put(WindowTitle::class, WindowTitle.type)
        if (getTypeOrNull("adw_swipeable_get_type") != null) put(Swipeable::class, Swipeable.type)
    }
}
