// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwToolbarView
import org.gtkkn.native.adw.adw_toolbar_view_add_bottom_bar
import org.gtkkn.native.adw.adw_toolbar_view_add_top_bar
import org.gtkkn.native.adw.adw_toolbar_view_get_bottom_bar_height
import org.gtkkn.native.adw.adw_toolbar_view_get_bottom_bar_style
import org.gtkkn.native.adw.adw_toolbar_view_get_content
import org.gtkkn.native.adw.adw_toolbar_view_get_extend_content_to_bottom_edge
import org.gtkkn.native.adw.adw_toolbar_view_get_extend_content_to_top_edge
import org.gtkkn.native.adw.adw_toolbar_view_get_reveal_bottom_bars
import org.gtkkn.native.adw.adw_toolbar_view_get_reveal_top_bars
import org.gtkkn.native.adw.adw_toolbar_view_get_top_bar_height
import org.gtkkn.native.adw.adw_toolbar_view_get_top_bar_style
import org.gtkkn.native.adw.adw_toolbar_view_get_type
import org.gtkkn.native.adw.adw_toolbar_view_new
import org.gtkkn.native.adw.adw_toolbar_view_remove
import org.gtkkn.native.adw.adw_toolbar_view_set_bottom_bar_style
import org.gtkkn.native.adw.adw_toolbar_view_set_content
import org.gtkkn.native.adw.adw_toolbar_view_set_extend_content_to_bottom_edge
import org.gtkkn.native.adw.adw_toolbar_view_set_extend_content_to_top_edge
import org.gtkkn.native.adw.adw_toolbar_view_set_reveal_bottom_bars
import org.gtkkn.native.adw.adw_toolbar_view_set_reveal_top_bars
import org.gtkkn.native.adw.adw_toolbar_view_set_top_bar_style
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.Unit

/**
 * A widget containing a page, as well as top and/or bottom bars.
 *
 * <picture>
 *   <source srcset="toolbar-view-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view.png" alt="toolbar-view">
 * </picture>
 *
 * `AdwToolbarView` has a single content widget and one or multiple top and
 * bottom bars, shown at the top and bottom sides respectively.
 *
 * Example of an `AdwToolbarView` UI definition:
 * ```xml
 * <object class="AdwToolbarView">
 *   <child type="top">
 *     <object class="AdwHeaderBar"/>
 *   </child>
 *   <property name="content">
 *     <object class="AdwPreferencesPage">
 *       <!-- ... -->
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * The following kinds of top and bottom bars are supported:
 *
 * - [class@HeaderBar]
 * - [class@TabBar]
 * - [class@ViewSwitcherBar]
 * - [class@Gtk.ActionBar]
 * - [class@Gtk.HeaderBar]
 * - [class@Gtk.PopoverMenuBar]
 * - [class@Gtk.SearchBar]
 * - Any [class@Gtk.Box] or a similar widget with the
 *   [`.toolbar`](style-classes.html#toolbars) style class
 *
 * By default, top and bottom bars are flat and scrolling content has a subtle
 * undershoot shadow, same as when using the
 * [`.undershoot-top`](style-classes.html#undershoot-indicators) and
 * [`.undershoot-bottom`](style-classes.html#undershoot-indicators) style
 * classes. This works well in most cases, e.g. with [class@StatusPage] or
 * [class@PreferencesPage], where the background at the top and bottom parts of
 * the page is uniform. Additionally, windows with sidebars should always use
 * this style.
 *
 * [property@ToolbarView:top-bar-style] and
 * [property@ToolbarView:bottom-bar-style] properties can be used add an opaque
 * background and a persistent shadow to top and bottom bars, this can be useful
 * for content such as [utility panes](https://developer.gnome.org/hig/patterns/containers/utility-panes.html),
 * where some elements are adjacent to the top/bottom bars, or [class@TabView],
 * where each page can have a different background.
 *
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-flat-1-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-flat-1.png" alt="toolbar-view-flat-1">
 * </picture>
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-flat-2-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-flat-2.png" alt="toolbar-view-flat-2">
 * </picture>
 * <picture style="min-width: 33%; display: inline-block;">
 *   <source srcset="toolbar-view-raised-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-raised.png" alt="toolbar-view-raised">
 * </picture>
 *
 * `AdwToolbarView` ensures the top and bottom bars have consistent backdrop
 * styles and vertical spacing. For comparison:
 *
 * <picture style="min-width: 40%; display: inline-block;">
 *   <source srcset="toolbar-view-spacing-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-spacing.png" alt="toolbar-view-spacing">
 * </picture>
 * <picture style="min-width: 40%; display: inline-block;">
 *   <source srcset="toolbar-view-spacing-box-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="toolbar-view-spacing-box.png" alt="toolbar-view-spacing-box">
 * </picture>
 *
 * Any top and bottom bars can also be dragged to move the window, equivalent
 * to putting them into a [class@Gtk.WindowHandle].
 *
 * Content is typically place between top and bottom bars, but can also extend
 * behind them. This is controlled with the
 * [property@ToolbarView:extend-content-to-top-edge] and
 * [property@ToolbarView:extend-content-to-bottom-edge] properties.
 *
 * Top and bottom bars can be hidden and revealed with an animation using the
 * [property@ToolbarView:reveal-top-bars] and
 * [property@ToolbarView:reveal-bottom-bars] properties.
 *
 * ## `AdwToolbarView` as `GtkBuildable`
 *
 * The `AdwToolbarView` implementation of the [iface@Gtk.Buildable] interface
 * supports adding a top bar by specifying “top” as the “type” attribute of a
 * `<child>` element, or adding a bottom bar by specifying “bottom”.
 *
 * ## Accessibility
 *
 * `AdwToolbarView` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * @since 1.4
 */
@AdwVersion1_4
public class ToolbarView(pointer: CPointer<AdwToolbarView>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwToolbarViewPointer: CPointer<AdwToolbarView>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The current bottom bar height.
     *
     * Bottom bar height does change depending on
     * [property@ToolbarView:reveal-bottom-bars], including during the transition.
     *
     * See [property@ToolbarView:top-bar-height].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public val bottomBarHeight: gint
        /**
         * Gets the current bottom bar height for @self.
         *
         * Bottom bar height does change depending on
         * [property@ToolbarView:reveal-bottom-bars], including during the transition.
         *
         * See [method@ToolbarView.get_top_bar_height].
         *
         * @return the current bottom bar height
         * @since 1.4
         */
        get() = adw_toolbar_view_get_bottom_bar_height(adwToolbarViewPointer.reinterpret())

    /**
     * Appearance of the bottom bars.
     *
     * If set to `ADW_TOOLBAR_FLAT`, bottom bars are flat and scrolling content
     * has a subtle undershoot shadow when touching them, same as the
     * [`.undershoot-bottom`](style-classes.html#undershoot-indicators)
     * style class. This works well for simple content, e.g. [class@StatusPage] or
     * [class@PreferencesPage], where the background at the bottom of the page is
     * uniform. Additionally, windows with sidebars should always use this style.
     *
     * Undershoot shadow is only present if a bottom bar is actually present and
     * visible. It is also never present if
     * [property@ToolbarView:extend-content-to-bottom-edge] is set to `TRUE`.
     *
     * If set to `ADW_TOOLBAR_RAISED`, bottom bars have an opaque background and a
     * persistent shadow, this is suitable for content such as
     * [utility panes](https://developer.gnome.org/hig/patterns/containers/utility-panes.html),
     * where some elements are directly adjacent to the bottom bars, or
     * [class@TabView], where each page can have a different background.
     *
     * `ADW_TOOLBAR_RAISED_BORDER` is similar to `ADW_TOOLBAR_RAISED`, but the
     * shadow is replaced with a more subtle border. This can be useful for
     * applications like image viewers.
     *
     * See also [property@ToolbarView:top-bar-style].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var bottomBarStyle: ToolbarStyle
        /**
         * Gets appearance of the botom bars for @self.
         *
         * @return bottom bar style
         * @since 1.4
         */
        get() = adw_toolbar_view_get_bottom_bar_style(adwToolbarViewPointer.reinterpret()).run {
            ToolbarStyle.fromNativeValue(this)
        }

        /**
         * Sets appearance of the bottom bars for @self.
         *
         * If set to `ADW_TOOLBAR_FLAT`, bottom bars are flat and scrolling content has
         * a subtle undershoot shadow when touching them, same as the
         * [`.undershoot-bottom`](style-classes.html#undershoot-indicators)
         * style class. This works well for simple content, e.g. [class@StatusPage] or
         * [class@PreferencesPage], where the background at the bottom of the page is
         * uniform. Additionally, windows with sidebars should always use this style.
         *
         * Undershoot shadow is only present if a bottom bar is actually present and
         * visible. It is also never present if
         * [property@ToolbarView:extend-content-to-bottom-edge] is set to `TRUE`.
         *
         * If set to `ADW_TOOLBAR_RAISED`, bottom bars have an opaque background and a
         * persistent shadow, this is suitable for content such as
         * [utility panes](https://developer.gnome.org/hig/patterns/containers/utility-panes.html),
         * where some elements are directly adjacent to the bottom bars, or
         * [class@TabView], where each page can have a different background.
         *
         * `ADW_TOOLBAR_RAISED_BORDER` is similar to `ADW_TOOLBAR_RAISED`, but the
         * shadow is replaced with a more subtle border. This can be useful for
         * applications like image viewers.
         *
         * See also [method@ToolbarView.set_top_bar_style].
         *
         * @param style bottom bar style
         * @since 1.4
         */
        @AdwVersion1_4
        set(style) = adw_toolbar_view_set_bottom_bar_style(adwToolbarViewPointer.reinterpret(), style.nativeValue)

    /**
     * The content widget.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var content: Widget?
        /**
         * Gets the content widget for @self.
         *
         * @return the content widget
         * @since 1.4
         */
        get() = adw_toolbar_view_get_content(adwToolbarViewPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the content widget for @self.
         *
         * @param content the content widget
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            content
        ) = adw_toolbar_view_set_content(adwToolbarViewPointer.reinterpret(), content?.gtkWidgetPointer?.reinterpret())

    /**
     * Whether the content widget can extend behind bottom bars.
     *
     * This can be used in combination with
     * [property@ToolbarView:reveal-bottom-bars] to show and hide toolbars in
     * fullscreen.
     *
     * See [property@ToolbarView:extend-content-to-top-edge].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var extendContentToBottomEdge: Boolean
        /**
         * Gets whether the content widget can extend behind bottom bars.
         *
         * @return whether content extends behind bottom bars
         * @since 1.4
         */
        get() = adw_toolbar_view_get_extend_content_to_bottom_edge(adwToolbarViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the content widget can extend behind bottom bars.
         *
         * This can be used in combination with [property@ToolbarView:reveal-bottom-bars]
         * to show and hide toolbars in fullscreen.
         *
         * See [method@ToolbarView.set_extend_content_to_top_edge].
         *
         * @param extend whether content extends behind bottom bars
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            extend
        ) = adw_toolbar_view_set_extend_content_to_bottom_edge(adwToolbarViewPointer.reinterpret(), extend.asGBoolean())

    /**
     * Whether the content widget can extend behind top bars.
     *
     * This can be used in combination with [property@ToolbarView:reveal-top-bars]
     * to show and hide toolbars in fullscreen.
     *
     * See [property@ToolbarView:extend-content-to-bottom-edge].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var extendContentToTopEdge: Boolean
        /**
         * Gets whether the content widget can extend behind top bars.
         *
         * @return whether content extends behind top bars
         * @since 1.4
         */
        get() = adw_toolbar_view_get_extend_content_to_top_edge(adwToolbarViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the content widget can extend behind top bars.
         *
         * This can be used in combination with [property@ToolbarView:reveal-top-bars]
         * to show and hide toolbars in fullscreen.
         *
         * See [method@ToolbarView.set_extend_content_to_bottom_edge].
         *
         * @param extend whether content extends behind top bars
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            extend
        ) = adw_toolbar_view_set_extend_content_to_top_edge(adwToolbarViewPointer.reinterpret(), extend.asGBoolean())

    /**
     * Whether bottom bars are visible.
     *
     * The transition will be animated.
     *
     * This can be used in combination with
     * [property@ToolbarView:extend-content-to-bottom-edge] to show and hide
     * toolbars in fullscreen.
     *
     * See [property@ToolbarView:reveal-top-bars].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var revealBottomBars: Boolean
        /**
         * Gets whether bottom bars are revealed for @self.
         *
         * @return whether bottom bars are revealed
         * @since 1.4
         */
        get() = adw_toolbar_view_get_reveal_bottom_bars(adwToolbarViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether bottom bars are revealed for @self.
         *
         * The transition will be animated.
         *
         * This can be used in combination with
         * [property@ToolbarView:extend-content-to-bottom-edge] to show and hide
         * toolbars in fullscreen.
         *
         * See [method@ToolbarView.set_reveal_top_bars].
         *
         * @param reveal whether to reveal bottom bars
         * @since 1.4
         */
        @AdwVersion1_4
        set(reveal) = adw_toolbar_view_set_reveal_bottom_bars(adwToolbarViewPointer.reinterpret(), reveal.asGBoolean())

    /**
     * Whether top bars are revealed.
     *
     * The transition will be animated.
     *
     * This can be used in combination with
     * [property@ToolbarView:extend-content-to-top-edge] to show and hide toolbars
     * in fullscreen.
     *
     * See [property@ToolbarView:reveal-bottom-bars].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var revealTopBars: Boolean
        /**
         * Gets whether top bars are revealed for @self.
         *
         * @return whether top bars are revealed
         * @since 1.4
         */
        get() = adw_toolbar_view_get_reveal_top_bars(adwToolbarViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether top bars are revealed for @self.
         *
         * The transition will be animated.
         *
         * This can be used in combination with
         * [property@ToolbarView:extend-content-to-top-edge] to show and hide toolbars
         * in fullscreen.
         *
         * See [method@ToolbarView.set_reveal_bottom_bars].
         *
         * @param reveal whether to reveal top bars
         * @since 1.4
         */
        @AdwVersion1_4
        set(reveal) = adw_toolbar_view_set_reveal_top_bars(adwToolbarViewPointer.reinterpret(), reveal.asGBoolean())

    /**
     * The current top bar height.
     *
     * Top bar height does change depending [property@ToolbarView:reveal-top-bars],
     * including during the transition.
     *
     * See [property@ToolbarView:bottom-bar-height].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public val topBarHeight: gint
        /**
         * Gets the current top bar height for @self.
         *
         * Top bar height does change depending on
         * [property@ToolbarView:reveal-top-bars], including during the transition.
         *
         * See [method@ToolbarView.get_bottom_bar_height].
         *
         * @return the current top bar height
         * @since 1.4
         */
        get() = adw_toolbar_view_get_top_bar_height(adwToolbarViewPointer.reinterpret())

    /**
     * Appearance of the top bars.
     *
     * If set to `ADW_TOOLBAR_FLAT`, top bars are flat and scrolling content has a
     * subtle undershoot shadow when touching them, same as the
     * [`.undershoot-top`](style-classes.html#undershoot-indicators)
     * style class. This works well for simple content, e.g. [class@StatusPage] or
     * [class@PreferencesPage], where the background at the top of the page is
     * uniform. Additionally, windows with sidebars should always use this style.
     *
     * Undershoot shadow is only present if a top bar is actually present and
     * visible. It is also never present if
     * [property@ToolbarView:extend-content-to-top-edge] is set to `TRUE`.
     *
     * If set to `ADW_TOOLBAR_RAISED`, top bars have an opaque background and a
     * persistent shadow, this is suitable for content such as
     * [utility panes](https://developer.gnome.org/hig/patterns/containers/utility-panes.html),
     * where some elements are directly adjacent to the top bars, or
     * [class@TabView], where each page can have a different background.
     *
     * `ADW_TOOLBAR_RAISED_BORDER` is similar to `ADW_TOOLBAR_RAISED`, but the
     * shadow is replaced with a more subtle border. This can be useful for
     * applications like image viewers.
     *
     * See also [property@ToolbarView:bottom-bar-style].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var topBarStyle: ToolbarStyle
        /**
         * Gets appearance of the top bars for @self.
         *
         * @return top bar style
         * @since 1.4
         */
        get() = adw_toolbar_view_get_top_bar_style(adwToolbarViewPointer.reinterpret()).run {
            ToolbarStyle.fromNativeValue(this)
        }

        /**
         * Sets appearance of the top bars for @self.
         *
         * If set to `ADW_TOOLBAR_FLAT`, top bars are flat and scrolling content has a
         * subtle undershoot shadow when touching them, same as the
         * [`.undershoot-top`](style-classes.html#undershoot-indicators)
         * style class. This works well for simple content, e.g. [class@StatusPage] or
         * [class@PreferencesPage], where the background at the top of the page is
         * uniform. Additionally, windows with sidebars should always use this style.
         *
         * Undershoot shadow is only present if a top bar is actually present and
         * visible. It is also never present if
         * [property@ToolbarView:extend-content-to-top-edge] is set to `TRUE`.
         *
         * If set to `ADW_TOOLBAR_RAISED`, top bars have an opaque background and a
         * persistent shadow, this is suitable for content such as
         * [utility panes](https://developer.gnome.org/hig/patterns/containers/utility-panes.html),
         * where some elements are directly adjacent to the top bars, or
         * [class@TabView], where each page can have a different background.
         *
         * `ADW_TOOLBAR_RAISED_BORDER` is similar to `ADW_TOOLBAR_RAISED`, but the
         * shadow is replaced with a more subtle border. This can be useful for
         * applications like image viewers.
         *
         * See also [method@ToolbarView.set_bottom_bar_style].
         *
         * @param style top bar style
         * @since 1.4
         */
        @AdwVersion1_4
        set(style) = adw_toolbar_view_set_top_bar_style(adwToolbarViewPointer.reinterpret(), style.nativeValue)

    /**
     * Creates a new `AdwToolbarView`.
     *
     * @return the newly created `AdwToolbarView`
     * @since 1.4
     */
    public constructor() : this(adw_toolbar_view_new()!!.reinterpret())

    /**
     * Adds a bottom bar to @self.
     *
     * @param widget a widget
     * @since 1.4
     */
    @AdwVersion1_4
    public fun addBottomBar(widget: Widget): Unit =
        adw_toolbar_view_add_bottom_bar(adwToolbarViewPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Adds a top bar to @self.
     *
     * @param widget a widget
     * @since 1.4
     */
    @AdwVersion1_4
    public fun addTopBar(widget: Widget): Unit =
        adw_toolbar_view_add_top_bar(adwToolbarViewPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    /**
     * Removes a child from @self.
     *
     * @param widget the child to be removed
     * @since 1.4
     */
    @AdwVersion1_4
    public fun remove(widget: Widget): Unit =
        adw_toolbar_view_remove(adwToolbarViewPointer.reinterpret(), widget.gtkWidgetPointer.reinterpret())

    public companion object : TypeCompanion<ToolbarView> {
        override val type: GeneratedClassKGType<ToolbarView> =
            GeneratedClassKGType(adw_toolbar_view_get_type()) { ToolbarView(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of ToolbarView
         *
         * @return the GType
         */
        public fun getType(): GType = adw_toolbar_view_get_type()
    }
}
