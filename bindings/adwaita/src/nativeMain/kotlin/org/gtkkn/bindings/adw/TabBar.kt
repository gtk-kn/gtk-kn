// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabBar
import org.gtkkn.native.adw.AdwTabPage
import org.gtkkn.native.adw.adw_tab_bar_get_autohide
import org.gtkkn.native.adw.adw_tab_bar_get_end_action_widget
import org.gtkkn.native.adw.adw_tab_bar_get_expand_tabs
import org.gtkkn.native.adw.adw_tab_bar_get_extra_drag_preferred_action
import org.gtkkn.native.adw.adw_tab_bar_get_extra_drag_preload
import org.gtkkn.native.adw.adw_tab_bar_get_inverted
import org.gtkkn.native.adw.adw_tab_bar_get_is_overflowing
import org.gtkkn.native.adw.adw_tab_bar_get_start_action_widget
import org.gtkkn.native.adw.adw_tab_bar_get_tabs_revealed
import org.gtkkn.native.adw.adw_tab_bar_get_type
import org.gtkkn.native.adw.adw_tab_bar_get_view
import org.gtkkn.native.adw.adw_tab_bar_new
import org.gtkkn.native.adw.adw_tab_bar_set_autohide
import org.gtkkn.native.adw.adw_tab_bar_set_end_action_widget
import org.gtkkn.native.adw.adw_tab_bar_set_expand_tabs
import org.gtkkn.native.adw.adw_tab_bar_set_extra_drag_preload
import org.gtkkn.native.adw.adw_tab_bar_set_inverted
import org.gtkkn.native.adw.adw_tab_bar_set_start_action_widget
import org.gtkkn.native.adw.adw_tab_bar_set_view
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
 * A tab bar for [class@TabView].
 *
 * <picture>
 *   <source srcset="tab-bar-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="tab-bar.png" alt="tab-bar">
 * </picture>
 *
 * The `AdwTabBar` widget is a tab bar that can be used with conjunction with
 * `AdwTabView`. It is typically used as a top bar within [class@ToolbarView].
 *
 * `AdwTabBar` can autohide and can optionally contain action widgets on both
 * sides of the tabs.
 *
 * When there's not enough space to show all the tabs, `AdwTabBar` will scroll
 * them. Pinned tabs always stay visible and aren't a part of the scrollable
 * area.
 *
 * ## CSS nodes
 *
 * `AdwTabBar` has a single CSS node with name `tabbar`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `types`: Array parameter of type GType is not supported
 */
public class TabBar(pointer: CPointer<AdwTabBar>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwTabBarPointer: CPointer<AdwTabBar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the tabs automatically hide.
     *
     * If set to `TRUE`, the tab bar disappears when [property@TabBar:view] has 0
     * or 1 tab, no pinned tabs, and no tab is being transferred.
     *
     * See [property@TabBar:tabs-revealed].
     */
    public var autohide: Boolean
        /**
         * Gets whether the tabs automatically hide.
         *
         * @return whether the tabs automatically hide
         */
        get() = adw_tab_bar_get_autohide(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the tabs automatically hide.
         *
         * If set to `TRUE`, the tab bar disappears when [property@TabBar:view] has 0
         * or 1 tab, no pinned tabs, and no tab is being transferred.
         *
         * See [property@TabBar:tabs-revealed].
         *
         * @param autohide whether the tabs automatically hide
         */
        set(autohide) = adw_tab_bar_set_autohide(adwTabBarPointer.reinterpret(), autohide.asGBoolean())

    /**
     * The widget shown after the tabs.
     */
    public var endActionWidget: Widget?
        /**
         * Gets the widget shown after the tabs.
         *
         * @return the widget shown after the tabs
         */
        get() = adw_tab_bar_get_end_action_widget(adwTabBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the widget to show after the tabs.
         *
         * @param widget the widget to show after the tabs
         */
        set(
            widget
        ) = adw_tab_bar_set_end_action_widget(adwTabBarPointer.reinterpret(), widget?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether tabs expand to full width.
     *
     * If set to `TRUE`, the tabs will always vary width filling the whole width
     * when possible, otherwise tabs will always have the minimum possible size.
     */
    public var expandTabs: Boolean
        /**
         * Gets whether tabs expand to full width.
         *
         * @return whether tabs expand to full width.
         */
        get() = adw_tab_bar_get_expand_tabs(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether tabs expand to full width.
         *
         * If set to `TRUE`, the tabs will always vary width filling the whole width
         * when possible, otherwise tabs will always have the minimum possible size.
         *
         * @param expandTabs whether to expand tabs
         */
        set(expandTabs) = adw_tab_bar_set_expand_tabs(adwTabBarPointer.reinterpret(), expandTabs.asGBoolean())

    /**
     * The unique action on the `current-drop` of the
     * [signal@TabBar::extra-drag-drop].
     *
     * This property should only be used during a [signal@TabBar::extra-drag-drop]
     * and is always a subset of what was originally passed to
     * [method@TabBar.setup_extra_drop_target].
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
        get() = adw_tab_bar_get_extra_drag_preferred_action(adwTabBarPointer.reinterpret()).run {
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
        get() = adw_tab_bar_get_extra_drag_preload(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether drop data should be preloaded on hover.
         *
         * See [property@Gtk.DropTarget:preload].
         *
         * @param preload whether to preload drop data
         * @since 1.3
         */
        @AdwVersion1_3
        set(preload) = adw_tab_bar_set_extra_drag_preload(adwTabBarPointer.reinterpret(), preload.asGBoolean())

    /**
     * Whether tabs use inverted layout.
     *
     * If set to `TRUE`, non-pinned tabs will have the close button at the
     * beginning and the indicator at the end rather than the opposite.
     */
    public var inverted: Boolean
        /**
         * Gets whether tabs use inverted layout.
         *
         * @return whether tabs use inverted layout
         */
        get() = adw_tab_bar_get_inverted(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether tabs tabs use inverted layout.
         *
         * If set to `TRUE`, non-pinned tabs will have the close button at the beginning
         * and the indicator at the end rather than the opposite.
         *
         * @param inverted whether tabs use inverted layout
         */
        set(inverted) = adw_tab_bar_set_inverted(adwTabBarPointer.reinterpret(), inverted.asGBoolean())

    /**
     * Whether the tab bar is overflowing.
     *
     * If `TRUE`, all tabs cannot be displayed at once and require scrolling.
     */
    public val isOverflowing: Boolean
        /**
         * Gets whether @self is overflowing.
         *
         * If `TRUE`, all tabs cannot be displayed at once and require scrolling.
         *
         * @return whether @self is overflowing
         */
        get() = adw_tab_bar_get_is_overflowing(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * The widget shown before the tabs.
     */
    public var startActionWidget: Widget?
        /**
         * Gets the widget shown before the tabs.
         *
         * @return the widget shown before the tabs
         */
        get() = adw_tab_bar_get_start_action_widget(adwTabBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the widget to show before the tabs.
         *
         * @param widget the widget to show before the tabs
         */
        set(
            widget
        ) = adw_tab_bar_set_start_action_widget(adwTabBarPointer.reinterpret(), widget?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether the tabs are currently revealed.
     *
     * See [property@TabBar:autohide].
     */
    public val tabsRevealed: Boolean
        /**
         * Gets whether the tabs are currently revealed.
         *
         * See [property@TabBar:autohide].
         *
         * @return whether the tabs are currently revealed
         */
        get() = adw_tab_bar_get_tabs_revealed(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * The tab view the tab bar controls.
     */
    public var view: TabView?
        /**
         * Gets the tab view @self controls.
         *
         * @return the view @self controls
         */
        get() = adw_tab_bar_get_view(adwTabBarPointer.reinterpret())?.run {
            TabView(reinterpret())
        }

        /**
         * Sets the tab view @self controls.
         *
         * @param view a tab view
         */
        set(view) = adw_tab_bar_set_view(adwTabBarPointer.reinterpret(), view?.adwTabViewPointer?.reinterpret())

    /**
     * Creates a new `AdwTabBar`.
     *
     * @return the newly created `AdwTabBar`
     */
    public constructor() : this(adw_tab_bar_new()!!.reinterpret())

    /**
     * This signal is emitted when content is dropped onto a tab.
     *
     * The content must be of one of the types set up via
     * [method@TabBar.setup_extra_drop_target].
     *
     * See [signal@Gtk.DropTarget::drop].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the page matching the tab the content was dropped onto; `value` the `GValue` being dropped. Returns whether the drop was accepted for @page
     */
    public fun connectExtraDragDrop(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, `value`: Value) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "extra-drag-drop",
        connectExtraDragDropFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the dropped content is preloaded.
     *
     * In order for data to be preloaded, [property@TabBar:extra-drag-preload]
     * must be set to `TRUE`.
     *
     * The content must be of one of the types set up via
     * [method@TabBar.setup_extra_drop_target].
     *
     * See [property@Gtk.DropTarget:value].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the page matching the tab the content was dropped onto; `value` the `GValue` being dropped. Returns the preferred action for the drop on @page
     * @since 1.3
     */
    @AdwVersion1_3
    public fun connectExtraDragValue(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, `value`: Value) -> DragAction,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "extra-drag-value",
        connectExtraDragValueFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<TabBar> {
        override val type: GeneratedClassKGType<TabBar> =
            GeneratedClassKGType(adw_tab_bar_get_type()) { TabBar(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of TabBar
         *
         * @return the GType
         */
        public fun getType(): GType = adw_tab_bar_get_type()
    }
}

private val connectExtraDragDropFunc:
    CPointer<CFunction<(CPointer<AdwTabPage>, CPointer<GValue>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            `value`: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, `value`: Value) -> Boolean>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            },
            `value`!!.run {
                Value(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectExtraDragValueFunc:
    CPointer<CFunction<(CPointer<AdwTabPage>, CPointer<GValue>) -> GdkDragAction>> =
    staticCFunction {
            _: COpaquePointer,
            page: CPointer<AdwTabPage>?,
            `value`: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(page: TabPage, `value`: Value) -> DragAction>().get().invoke(
            page!!.run {
                TabPage(reinterpret())
            },
            `value`!!.run {
                Value(reinterpret())
            }
        ).mask
    }
        .reinterpret()
