// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabBar
import org.gtkkn.native.adw.AdwTabPage
import org.gtkkn.native.adw.adw_tab_bar_get_autohide
import org.gtkkn.native.adw.adw_tab_bar_get_end_action_widget
import org.gtkkn.native.adw.adw_tab_bar_get_expand_tabs
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
import org.gtkkn.native.adw.adw_tab_bar_set_inverted
import org.gtkkn.native.adw.adw_tab_bar_set_start_action_widget
import org.gtkkn.native.adw.adw_tab_bar_set_view
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * A tab bar for [class@TabView].
 *
 * <picture>
 *   <source srcset="tab-bar-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="tab-bar.png" alt="tab-bar">
 * </picture>
 *
 * The `AdwTabBar` widget is a tab bar that can be used with conjunction with
 * `AdwTabView`.
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
 *
 * @since 1.0
 */
public class TabBar(
    pointer: CPointer<AdwTabBar>,
) : Widget(pointer.reinterpret()), KGTyped {
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
     *
     * @since 1.0
     */
    public var autohide: Boolean
        /**
         * Gets whether the tabs automatically hide.
         *
         * @return whether the tabs automatically hide
         * @since 1.0
         */
        get() = adw_tab_bar_get_autohide(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the tabs automatically hide.
         *
         * @param autohide whether the tabs automatically hide
         * @since 1.0
         */
        set(autohide) =
            adw_tab_bar_set_autohide(
                adwTabBarPointer.reinterpret(),
                autohide.asGBoolean()
            )

    /**
     * The widget shown after the tabs.
     *
     * @since 1.0
     */
    public var endActionWidget: Widget?
        /**
         * Gets the widget shown after the tabs.
         *
         * @return the widget shown after the tabs
         * @since 1.0
         */
        get() =
            adw_tab_bar_get_end_action_widget(adwTabBarPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the widget to show after the tabs.
         *
         * @param widget the widget to show after the tabs
         * @since 1.0
         */
        set(widget) =
            adw_tab_bar_set_end_action_widget(
                adwTabBarPointer.reinterpret(),
                widget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether tabs expand to full width.
     *
     * If set to `TRUE`, the tabs will always vary width filling the whole width
     * when possible, otherwise tabs will always have the minimum possible size.
     *
     * @since 1.0
     */
    public var expandTabs: Boolean
        /**
         * Gets whether tabs expand to full width.
         *
         * @return whether tabs expand to full width.
         * @since 1.0
         */
        get() = adw_tab_bar_get_expand_tabs(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether tabs expand to full width.
         *
         * @param expandTabs whether to expand tabs
         * @since 1.0
         */
        set(expandTabs) =
            adw_tab_bar_set_expand_tabs(
                adwTabBarPointer.reinterpret(),
                expandTabs.asGBoolean()
            )

    /**
     * Whether tabs use inverted layout.
     *
     * If set to `TRUE`, non-pinned tabs will have the close button at the
     * beginning and the indicator at the end rather than the opposite.
     *
     * @since 1.0
     */
    public var inverted: Boolean
        /**
         * Gets whether tabs use inverted layout.
         *
         * @return whether tabs use inverted layout
         * @since 1.0
         */
        get() = adw_tab_bar_get_inverted(adwTabBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether tabs tabs use inverted layout.
         *
         * @param inverted whether tabs use inverted layout
         * @since 1.0
         */
        set(inverted) =
            adw_tab_bar_set_inverted(
                adwTabBarPointer.reinterpret(),
                inverted.asGBoolean()
            )

    /**
     * Whether the tab bar is overflowing.
     *
     * If `TRUE`, all tabs cannot be displayed at once and require scrolling.
     *
     * @since 1.0
     */
    public val isOverflowing: Boolean
        /**
         * Gets whether @self is overflowing.
         *
         * @return whether @self is overflowing
         * @since 1.0
         */
        get() = adw_tab_bar_get_is_overflowing(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * The widget shown before the tabs.
     *
     * @since 1.0
     */
    public var startActionWidget: Widget?
        /**
         * Gets the widget shown before the tabs.
         *
         * @return the widget shown before the tabs
         * @since 1.0
         */
        get() =
            adw_tab_bar_get_start_action_widget(adwTabBarPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the widget to show before the tabs.
         *
         * @param widget the widget to show before the tabs
         * @since 1.0
         */
        set(widget) =
            adw_tab_bar_set_start_action_widget(
                adwTabBarPointer.reinterpret(),
                widget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether the tabs are currently revealed.
     *
     * See [property@TabBar:autohide].
     *
     * @since 1.0
     */
    public val tabsRevealed: Boolean
        /**
         * Gets whether the tabs are currently revealed.
         *
         * @return whether the tabs are currently revealed
         * @since 1.0
         */
        get() = adw_tab_bar_get_tabs_revealed(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * The tab view the tab bar controls.
     *
     * @since 1.0
     */
    public var view: TabView?
        /**
         * Gets the tab view @self controls.
         *
         * @return the view @self controls
         * @since 1.0
         */
        get() =
            adw_tab_bar_get_view(adwTabBarPointer.reinterpret())?.run {
                TabView(reinterpret())
            }

        /**
         * Sets the tab view @self controls.
         *
         * @param view a tab view
         * @since 1.0
         */
        set(view) =
            adw_tab_bar_set_view(
                adwTabBarPointer.reinterpret(),
                view?.adwTabViewPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwTabBar`.
     *
     * @return the newly created `AdwTabBar`
     * @since 1.0
     */
    public constructor() : this(adw_tab_bar_new()!!.reinterpret())

    /**
     * Gets whether the tabs automatically hide.
     *
     * @return whether the tabs automatically hide
     * @since 1.0
     */
    public fun getAutohide(): Boolean = adw_tab_bar_get_autohide(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * Gets the widget shown after the tabs.
     *
     * @return the widget shown after the tabs
     * @since 1.0
     */
    public fun getEndActionWidget(): Widget? =
        adw_tab_bar_get_end_action_widget(adwTabBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether tabs expand to full width.
     *
     * @return whether tabs expand to full width.
     * @since 1.0
     */
    public fun getExpandTabs(): Boolean = adw_tab_bar_get_expand_tabs(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * Gets whether tabs use inverted layout.
     *
     * @return whether tabs use inverted layout
     * @since 1.0
     */
    public fun getInverted(): Boolean = adw_tab_bar_get_inverted(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self is overflowing.
     *
     * @return whether @self is overflowing
     * @since 1.0
     */
    public fun getIsOverflowing(): Boolean = adw_tab_bar_get_is_overflowing(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * Gets the widget shown before the tabs.
     *
     * @return the widget shown before the tabs
     * @since 1.0
     */
    public fun getStartActionWidget(): Widget? =
        adw_tab_bar_get_start_action_widget(adwTabBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether the tabs are currently revealed.
     *
     * @return whether the tabs are currently revealed
     * @since 1.0
     */
    public fun getTabsRevealed(): Boolean = adw_tab_bar_get_tabs_revealed(adwTabBarPointer.reinterpret()).asBoolean()

    /**
     * Gets the tab view @self controls.
     *
     * @return the view @self controls
     * @since 1.0
     */
    public fun getView(): TabView? =
        adw_tab_bar_get_view(adwTabBarPointer.reinterpret())?.run {
            TabView(reinterpret())
        }

    /**
     * Sets whether the tabs automatically hide.
     *
     * @param autohide whether the tabs automatically hide
     * @since 1.0
     */
    public fun setAutohide(autohide: Boolean): Unit =
        adw_tab_bar_set_autohide(adwTabBarPointer.reinterpret(), autohide.asGBoolean())

    /**
     * Sets the widget to show after the tabs.
     *
     * @param widget the widget to show after the tabs
     * @since 1.0
     */
    public fun setEndActionWidget(widget: Widget? = null): Unit =
        adw_tab_bar_set_end_action_widget(
            adwTabBarPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets whether tabs expand to full width.
     *
     * @param expandTabs whether to expand tabs
     * @since 1.0
     */
    public fun setExpandTabs(expandTabs: Boolean): Unit =
        adw_tab_bar_set_expand_tabs(adwTabBarPointer.reinterpret(), expandTabs.asGBoolean())

    /**
     * Sets whether tabs tabs use inverted layout.
     *
     * @param inverted whether tabs use inverted layout
     * @since 1.0
     */
    public fun setInverted(inverted: Boolean): Unit =
        adw_tab_bar_set_inverted(adwTabBarPointer.reinterpret(), inverted.asGBoolean())

    /**
     * Sets the widget to show before the tabs.
     *
     * @param widget the widget to show before the tabs
     * @since 1.0
     */
    public fun setStartActionWidget(widget: Widget? = null): Unit =
        adw_tab_bar_set_start_action_widget(
            adwTabBarPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the tab view @self controls.
     *
     * @param view a tab view
     * @since 1.0
     */
    public fun setView(view: TabView? = null): Unit =
        adw_tab_bar_set_view(
            adwTabBarPointer.reinterpret(),
            view?.adwTabViewPointer?.reinterpret()
        )

    /**
     * This signal is emitted when content is dropped onto a tab.
     *
     * The content must be of one of the types set up via
     * [method@TabBar.setup_extra_drop_target].
     *
     * See [signal@Gtk.DropTarget::drop].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the page matching the tab the content
     * was dropped onto; `value` the `GValue` being dropped. Returns whether the drop was accepted for
     * @page
     * @since 1.0
     */
    public fun connectExtraDragDrop(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (page: TabPage, `value`: Value) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "extra-drag-drop",
            connectExtraDragDropFunc.reinterpret(),
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
    }
}

private val connectExtraDragDropFunc: CPointer<
    CFunction<
        (
            CPointer<AdwTabPage>,
            CPointer<GValue>,
        ) -> Int
    >
> =
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
