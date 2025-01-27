// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gdk.DragAction
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabOverview
import org.gtkkn.native.adw.AdwTabPage
import org.gtkkn.native.adw.adw_tab_overview_get_child
import org.gtkkn.native.adw.adw_tab_overview_get_enable_new_tab
import org.gtkkn.native.adw.adw_tab_overview_get_enable_search
import org.gtkkn.native.adw.adw_tab_overview_get_extra_drag_preferred_action
import org.gtkkn.native.adw.adw_tab_overview_get_extra_drag_preload
import org.gtkkn.native.adw.adw_tab_overview_get_inverted
import org.gtkkn.native.adw.adw_tab_overview_get_open
import org.gtkkn.native.adw.adw_tab_overview_get_search_active
import org.gtkkn.native.adw.adw_tab_overview_get_secondary_menu
import org.gtkkn.native.adw.adw_tab_overview_get_show_end_title_buttons
import org.gtkkn.native.adw.adw_tab_overview_get_show_start_title_buttons
import org.gtkkn.native.adw.adw_tab_overview_get_type
import org.gtkkn.native.adw.adw_tab_overview_get_view
import org.gtkkn.native.adw.adw_tab_overview_new
import org.gtkkn.native.adw.adw_tab_overview_set_child
import org.gtkkn.native.adw.adw_tab_overview_set_enable_new_tab
import org.gtkkn.native.adw.adw_tab_overview_set_enable_search
import org.gtkkn.native.adw.adw_tab_overview_set_extra_drag_preload
import org.gtkkn.native.adw.adw_tab_overview_set_inverted
import org.gtkkn.native.adw.adw_tab_overview_set_open
import org.gtkkn.native.adw.adw_tab_overview_set_secondary_menu
import org.gtkkn.native.adw.adw_tab_overview_set_show_end_title_buttons
import org.gtkkn.native.adw.adw_tab_overview_set_show_start_title_buttons
import org.gtkkn.native.adw.adw_tab_overview_set_view
import org.gtkkn.native.gdk.GdkDragAction
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.ULong

/**
 * A tab overview for [class@TabView].
 *
 * <picture>
 *   <source srcset="tab-overview-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="tab-overview.png" alt="tab-overview">
 * </picture>
 *
 * `AdwTabOverview` is a widget that can display tabs from an `AdwTabView` in a
 * grid.
 *
 * `AdwTabOverview` shows a thumbnail for each tab. By default thumbnails are
 * static for all pages except the selected one. They can be made always live
 * by setting [property@TabPage:live-thumbnail] to `TRUE`, or refreshed with
 * [method@TabPage.invalidate_thumbnail] or
 * [method@TabView.invalidate_thumbnails] otherwise.
 *
 * If the pages are too tall or too wide, the thumbnails will be cropped; use
 * [property@TabPage:thumbnail-xalign] and [property@TabPage:thumbnail-yalign] to
 * control which part of the page should be visible in this case.
 *
 * Pinned tabs are shown as smaller cards without thumbnails above the other
 * tabs. Unlike in [class@TabBar], they still have titles, as well as an unpin
 * button.
 *
 * `AdwTabOverview` provides search in open tabs. It searches in tab titles and
 * tooltips, as well as [property@TabPage:keyword].
 *
 * If [property@TabOverview:enable-new-tab] is set to `TRUE`, a new tab button
 * will be shown. Connect to the [signal@TabOverview::create-tab] signal to use
 * it.
 *
 * [property@TabOverview:secondary-menu] can be used to provide a secondary menu
 * for the overview. Use it to add extra actions, e.g. to open a new window or
 * undo closed tab.
 *
 * `AdwTabOverview` is intended to be used as the direct child of the window,
 * with the rest of the window contents set as the [property@TabOverview:child].
 * The child is expected to contain an [class@TabView].
 *
 * `AdwTabOverview` shows window buttons by default. They can be disabled by
 * setting [property@TabOverview:show-start-title-buttons] and/or
 * [property@TabOverview:show-start-title-buttons] and/or
 * [property@TabOverview:show-end-title-buttons] to `FALSE`.
 *
 * If search and window buttons are disabled, and secondary menu is not set, the
 * header bar will be hidden.
 *
 * ## Actions
 *
 * `AdwTabOverview` defines the `overview.open` and `overview.close` actions for
 * opening and closing itself. They can be convenient when used together with
 * [class@TabButton].
 *
 * ## CSS nodes
 *
 * `AdwTabOverview` has a single CSS node with name `taboverview`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `types`: Array parameter of type GType is not supported
 *
 * @since 1.3
 */
@AdwVersion1_3
public class TabOverview(public val adwTabOverviewPointer: CPointer<AdwTabOverview>) :
    Widget(adwTabOverviewPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.3
         */
        get() = adw_tab_overview_get_child(adwTabOverviewPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.3
         */
        @AdwVersion1_3
        set(child) = adw_tab_overview_set_child(adwTabOverviewPointer, child?.gtkWidgetPointer)

    /**
     * Whether to enable new tab button.
     *
     * Connect to the [signal@TabOverview::create-tab] signal to use it.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var enableNewTab: Boolean
        /**
         * Gets whether to new tab button is enabled for @self.
         *
         * @return whether new tab button is enabled
         * @since 1.3
         */
        get() = adw_tab_overview_get_enable_new_tab(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether to enable new tab button for @self.
         *
         * Connect to the [signal@TabOverview::create-tab] signal to use it.
         *
         * @param enableNewTab whether to enable new tab button
         * @since 1.3
         */
        @AdwVersion1_3
        set(enableNewTab) = adw_tab_overview_set_enable_new_tab(adwTabOverviewPointer, enableNewTab.asGBoolean())

    /**
     * Whether to enable search in tabs.
     *
     * Search matches tab titles and tooltips, as well as keywords, set via
     * [property@TabPage:keyword]. Use keywords to search in e.g. page URLs in a
     * web browser.
     *
     * During search, tab reordering and drag-n-drop are disabled.
     *
     * Use [property@TabOverview:search-active] to check out if search is
     * currently active.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var enableSearch: Boolean
        /**
         * Gets whether search in tabs is enabled for @self.
         *
         * @return whether search is enabled
         * @since 1.3
         */
        get() = adw_tab_overview_get_enable_search(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether to enable search in tabs for @self.
         *
         * Search matches tab titles and tooltips, as well as keywords, set via
         * [property@TabPage:keyword]. Use keywords to search in e.g. page URLs in a web
         * browser.
         *
         * During search, tab reordering and drag-n-drop are disabled.
         *
         * Use [property@TabOverview:search-active] to check out if search is currently
         * active.
         *
         * @param enableSearch whether to enable search
         * @since 1.3
         */
        @AdwVersion1_3
        set(enableSearch) = adw_tab_overview_set_enable_search(adwTabOverviewPointer, enableSearch.asGBoolean())

    /**
     * The unique action on the `current-drop` of the
     * [signal@TabOverview::extra-drag-drop].
     *
     * This property should only be used during a
     * [signal@TabOverview::extra-drag-drop] and is always a subset of what was
     * originally passed to [method@TabOverview.setup_extra_drop_target].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public val extraDragPreferredAction: DragAction
        /**
         * Gets the current action during a drop on the extra_drop_target.
         *
         * @return the drag action of the current drop.
         * @since 1.4
         */
        get() = adw_tab_overview_get_extra_drag_preferred_action(adwTabOverviewPointer).run {
            DragAction(this)
        }

    /**
     * Whether the drop data should be preloaded on hover.
     *
     * See [property@Gtk.DropTarget:preload].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var extraDragPreload: Boolean
        /**
         * Gets whether drop data should be preloaded on hover.
         *
         * @return whether drop data should be preloaded on hover
         * @since 1.3
         */
        get() = adw_tab_overview_get_extra_drag_preload(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether drop data should be preloaded on hover.
         *
         * See [property@Gtk.DropTarget:preload].
         *
         * @param preload whether to preload drop data
         * @since 1.3
         */
        @AdwVersion1_3
        set(preload) = adw_tab_overview_set_extra_drag_preload(adwTabOverviewPointer, preload.asGBoolean())

    /**
     * Whether thumbnails use inverted layout.
     *
     * If set to `TRUE`, thumbnails will have the close or unpin buttons at the
     * beginning and the indicator at the end rather than the other way around.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var inverted: Boolean
        /**
         * Gets whether thumbnails use inverted layout.
         *
         * @return whether thumbnails use inverted layout
         * @since 1.3
         */
        get() = adw_tab_overview_get_inverted(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether thumbnails use inverted layout.
         *
         * If set to `TRUE`, thumbnails will have the close or unpin button at the
         * beginning and the indicator at the end rather than the other way around.
         *
         * @param inverted whether thumbnails use inverted layout
         * @since 1.3
         */
        @AdwVersion1_3
        set(inverted) = adw_tab_overview_set_inverted(adwTabOverviewPointer, inverted.asGBoolean())

    /**
     * Whether the overview is open.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var `open`: Boolean
        /**
         * Gets whether @self is open.
         *
         * @return whether the overview is open
         * @since 1.3
         */
        get() = adw_tab_overview_get_open(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether the to open @self.
         *
         * @param open whether the overview is open
         * @since 1.3
         */
        @AdwVersion1_3
        set(`open`) = adw_tab_overview_set_open(adwTabOverviewPointer, `open`.asGBoolean())

    /**
     * Whether search is currently active.
     *
     * See [property@TabOverview:enable-search].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public val searchActive: Boolean
        /**
         * Gets whether search is currently active for @self.
         *
         * See [property@TabOverview:enable-search].
         *
         * @return whether search is active
         * @since 1.3
         */
        get() = adw_tab_overview_get_search_active(adwTabOverviewPointer).asBoolean()

    /**
     * The secondary menu model.
     *
     * Use it to add extra actions, e.g. to open a new window or undo closed tab.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var secondaryMenu: MenuModel?
        /**
         * Gets the secondary menu model for @self.
         *
         * @return the secondary menu model
         * @since 1.3
         */
        get() = adw_tab_overview_get_secondary_menu(adwTabOverviewPointer)?.run {
            MenuModel.MenuModelImpl(this)
        }

        /**
         * Sets the secondary menu model for @self.
         *
         * Use it to add extra actions, e.g. to open a new window or undo closed tab.
         *
         * @param secondaryMenu a menu model
         * @since 1.3
         */
        @AdwVersion1_3
        set(
            secondaryMenu
        ) = adw_tab_overview_set_secondary_menu(adwTabOverviewPointer, secondaryMenu?.gioMenuModelPointer)

    /**
     * Whether to show end title buttons in the overview's header bar.
     *
     * See [property@HeaderBar:show-start-title-buttons] for the other side.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var showEndTitleButtons: Boolean
        /**
         * Gets whether end title buttons are shown in @self's header bar.
         *
         * @return whether end title buttons are shown
         * @since 1.3
         */
        get() = adw_tab_overview_get_show_end_title_buttons(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether to show end title buttons in @self's header bar.
         *
         * See [property@HeaderBar:show-start-title-buttons] for the other side.
         *
         * @param showEndTitleButtons whether to show end title buttons
         * @since 1.3
         */
        @AdwVersion1_3
        set(
            showEndTitleButtons
        ) = adw_tab_overview_set_show_end_title_buttons(adwTabOverviewPointer, showEndTitleButtons.asGBoolean())

    /**
     * Whether to show start title buttons in the overview's header bar.
     *
     * See [property@HeaderBar:show-end-title-buttons] for the other side.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var showStartTitleButtons: Boolean
        /**
         * Gets whether start title buttons are shown in @self's header bar.
         *
         * @return whether start title buttons are shown
         * @since 1.3
         */
        get() = adw_tab_overview_get_show_start_title_buttons(adwTabOverviewPointer).asBoolean()

        /**
         * Sets whether to show start title buttons in @self's header bar.
         *
         * See [property@HeaderBar:show-end-title-buttons] for the other side.
         *
         * @param showStartTitleButtons whether to show start title buttons
         * @since 1.3
         */
        @AdwVersion1_3
        set(
            showStartTitleButtons
        ) = adw_tab_overview_set_show_start_title_buttons(adwTabOverviewPointer, showStartTitleButtons.asGBoolean())

    /**
     * The tab view the overview controls.
     *
     * The view must be inside the tab overview, see [property@TabOverview:child].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var view: TabView?
        /**
         * Gets the tab view @self controls.
         *
         * @return the tab view
         * @since 1.3
         */
        get() = adw_tab_overview_get_view(adwTabOverviewPointer)?.run {
            TabView(this)
        }

        /**
         * Sets the tab view to control.
         *
         * The view must be inside @self, see [property@TabOverview:child].
         *
         * @param view a tab view
         * @since 1.3
         */
        @AdwVersion1_3
        set(view) = adw_tab_overview_set_view(adwTabOverviewPointer, view?.adwTabViewPointer)

    /**
     * Creates a new `AdwTabOverview`.
     *
     * @return the newly created `AdwTabOverview`
     * @since 1.3
     */
    public constructor() : this(adw_tab_overview_new()!!.reinterpret())

    /**
     * Emitted when a tab needs to be created;
     *
     * This can happen after the new tab button has been pressed, see
     * [property@TabOverview:enable-new-tab].
     *
     * The signal handler is expected to create a new page in the corresponding
     * [class@TabView] and return it.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns the newly created page
     * @since 1.3
     */
    @AdwVersion1_3
    public fun onCreateTab(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> TabPage): ULong =
        g_signal_connect_data(
            adwTabOverviewPointer,
            "create-tab",
            onCreateTabFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when content is dropped onto a tab.
     *
     * The content must be of one of the types set up via
     * [method@TabOverview.setup_extra_drop_target].
     *
     * See [signal@Gtk.DropTarget::drop].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the page matching the tab the content was dropped onto; `value` the `GValue` being dropped. Returns whether the drop was accepted for @page
     * @since 1.3
     */
    @AdwVersion1_3
    public fun onExtraDragDrop(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, `value`: Value) -> Boolean,
    ): ULong = g_signal_connect_data(
        adwTabOverviewPointer,
        "extra-drag-drop",
        onExtraDragDropFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the dropped content is preloaded.
     *
     * In order for data to be preloaded, [property@TabOverview:extra-drag-preload]
     * must be set to `TRUE`.
     *
     * The content must be of one of the types set up via
     * [method@TabOverview.setup_extra_drop_target].
     *
     * See [property@Gtk.DropTarget:value].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the page matching the tab the content was dropped onto; `value` the `GValue` being dropped. Returns the preferred action for the drop on @page
     * @since 1.3
     */
    @AdwVersion1_3
    public fun onExtraDragValue(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, `value`: Value) -> DragAction,
    ): ULong = g_signal_connect_data(
        adwTabOverviewPointer,
        "extra-drag-value",
        onExtraDragValueFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<TabOverview> {
        override val type: GeneratedClassKGType<TabOverview> =
            GeneratedClassKGType(getTypeOrNull("adw_tab_overview_get_type")!!) { TabOverview(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of TabOverview
         *
         * @return the GType
         */
        public fun getType(): GType = adw_tab_overview_get_type()
    }
}

private val onCreateTabFunc: CPointer<CFunction<() -> CPointer<AdwTabPage>>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> TabPage>().get().invoke().adwTabPagePointer
}
    .reinterpret()

private val onExtraDragDropFunc:
    CPointer<CFunction<(CPointer<AdwTabPage>, CPointer<GValue>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            `value`: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, `value`: Value) -> Boolean>().get().invoke(
            page!!.run {
                TabPage(this)
            },
            `value`!!.run {
                Value(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val onExtraDragValueFunc:
    CPointer<CFunction<(CPointer<AdwTabPage>, CPointer<GValue>) -> GdkDragAction>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            `value`: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, `value`: Value) -> DragAction>().get().invoke(
            page!!.run {
                TabPage(this)
            },
            `value`!!.run {
                Value(this)
            }
        ).mask
    }
        .reinterpret()
