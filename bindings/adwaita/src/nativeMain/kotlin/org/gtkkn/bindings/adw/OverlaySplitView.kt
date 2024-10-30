// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.PackType
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwOverlaySplitView
import org.gtkkn.native.adw.AdwSwipeable
import org.gtkkn.native.adw.adw_overlay_split_view_get_collapsed
import org.gtkkn.native.adw.adw_overlay_split_view_get_content
import org.gtkkn.native.adw.adw_overlay_split_view_get_enable_hide_gesture
import org.gtkkn.native.adw.adw_overlay_split_view_get_enable_show_gesture
import org.gtkkn.native.adw.adw_overlay_split_view_get_max_sidebar_width
import org.gtkkn.native.adw.adw_overlay_split_view_get_min_sidebar_width
import org.gtkkn.native.adw.adw_overlay_split_view_get_pin_sidebar
import org.gtkkn.native.adw.adw_overlay_split_view_get_show_sidebar
import org.gtkkn.native.adw.adw_overlay_split_view_get_sidebar
import org.gtkkn.native.adw.adw_overlay_split_view_get_sidebar_position
import org.gtkkn.native.adw.adw_overlay_split_view_get_sidebar_width_fraction
import org.gtkkn.native.adw.adw_overlay_split_view_get_sidebar_width_unit
import org.gtkkn.native.adw.adw_overlay_split_view_get_type
import org.gtkkn.native.adw.adw_overlay_split_view_new
import org.gtkkn.native.adw.adw_overlay_split_view_set_collapsed
import org.gtkkn.native.adw.adw_overlay_split_view_set_content
import org.gtkkn.native.adw.adw_overlay_split_view_set_enable_hide_gesture
import org.gtkkn.native.adw.adw_overlay_split_view_set_enable_show_gesture
import org.gtkkn.native.adw.adw_overlay_split_view_set_max_sidebar_width
import org.gtkkn.native.adw.adw_overlay_split_view_set_min_sidebar_width
import org.gtkkn.native.adw.adw_overlay_split_view_set_pin_sidebar
import org.gtkkn.native.adw.adw_overlay_split_view_set_show_sidebar
import org.gtkkn.native.adw.adw_overlay_split_view_set_sidebar
import org.gtkkn.native.adw.adw_overlay_split_view_set_sidebar_position
import org.gtkkn.native.adw.adw_overlay_split_view_set_sidebar_width_fraction
import org.gtkkn.native.adw.adw_overlay_split_view_set_sidebar_width_unit
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.Double
import kotlin.Unit

/**
 * A widget presenting sidebar and content side by side or as an overlay.
 *
 * <picture>
 *   <source srcset="overlay-split-view-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="overlay-split-view.png" alt="overlay-split-view">
 * </picture>
 * <picture>
 *   <source srcset="overlay-split-view-collapsed-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="overlay-split-view-collapsed.png" alt="overlay-split-view-collapsed">
 * </picture>
 *
 * `AdwOverlaySplitView` has two children: sidebar and content, and displays
 * them side by side.
 *
 * When [property@OverlaySplitView:collapsed] is set to `TRUE`, the sidebar is
 * instead shown as an overlay above the content widget.
 *
 * The sidebar can be hidden or shown using the
 * [property@OverlaySplitView:show-sidebar] property.
 *
 * Sidebar can be displayed before or after the content, this can be controlled
 * with the [property@OverlaySplitView:sidebar-position] property.
 *
 * Collapsing the split view automatically hides the sidebar widget, and
 * uncollapsing it shows the sidebar. If this behavior is not desired, the
 * [property@OverlaySplitView:pin-sidebar] property can be used to override it.
 *
 * `AdwOverlaySplitView` supports an edge swipe gesture for showing the sidebar,
 * and a swipe from the sidebar for hiding it. Gestures are only supported on
 * touchscreen, but not touchpad. Gestures can be controlled with the
 * [property@OverlaySplitView:enable-show-gesture] and
 * [property@OverlaySplitView:enable-hide-gesture] properties.
 *
 * See also [class@NavigationSplitView].
 *
 * `AdwOverlaySplitView` is typically used together with an [class@Breakpoint]
 * setting the `collapsed` property to `TRUE` on small widths, as follows:
 *
 * ```xml
 * <object class="AdwWindow">
 *   <property name="width-request">360</property>
 *   <property name="height-request">200</property>
 *   <property name="default-width">800</property>
 *   <property name="default-height">800</property>
 *   <child>
 *     <object class="AdwBreakpoint">
 *       <condition>max-width: 400sp</condition>
 *       <setter object="split_view" property="collapsed">True</setter>
 *     </object>
 *   </child>
 *   <property name="content">
 *     <object class="AdwOverlaySplitView" id="split_view">
 *       <property name="sidebar">
 *         <!-- ... -->
 *       </property>
 *       <property name="content">
 *         <!-- ... -->
 *       </property>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * `AdwOverlaySplitView` is often used for implementing the
 * [utility pane](https://developer.gnome.org/hig/patterns/containers/utility-panes.html)
 * pattern.
 *
 * ## Sizing
 *
 * When not collapsed, `AdwOverlaySplitView` changes the sidebar width
 * depending on its own width.
 *
 * If possible, it tries to allocate a fraction of the total width, controlled
 * with the [property@OverlaySplitView:sidebar-width-fraction] property.
 *
 * The sidebar also has minimum and maximum sizes, controlled with the
 * [property@OverlaySplitView:min-sidebar-width] and
 * [property@OverlaySplitView:max-sidebar-width] properties.
 *
 * The minimum and maximum sizes are using the length unit specified with the
 * [property@OverlaySplitView:sidebar-width-unit].
 *
 * By default, sidebar is using 25% of the total width, with 180sp as the
 * minimum size and 280sp as the maximum size.
 *
 * When collapsed, the preferred width fraction is ignored and the sidebar uses
 * [property@OverlaySplitView:max-sidebar-width] when possible.
 *
 * ## Header Bar Integration
 *
 * When used inside `AdwOverlaySplitView`, [class@HeaderBar] will automatically
 * hide the window buttons in the middle.
 *
 * ## `AdwOverlaySplitView` as `GtkBuildable`
 *
 * The `AdwOverlaySplitView` implementation of the [iface@Gtk.Buildable]
 * interface supports setting the sidebar widget by specifying “sidebar” as the
 * “type” attribute of a `<child>` element, Specifying “content” child type or
 * omitting it results in setting the content widget.
 *
 * ## CSS nodes
 *
 * `AdwOverlaySplitView` has a single CSS node with the name
 * `overlay-split-view`.
 *
 * It contains two nodes with the name `widget`, containing the sidebar and
 * content children.
 *
 * When not collapsed, they have the `.sidebar-view` and `.content-view` style
 * classes respectively.
 *
 * ```
 * overlay-split-view
 * ├── widget.sidebar-pane
 * │   ╰── [sidebar child]
 * ╰── widget.content-pane
 *     ╰── [content child]
 * ```
 *
 * When collapsed, the one containing the sidebar child has the `.background`
 * style class and the other one has no style classes.
 *
 * ```
 * overlay-split-view
 * ├── widget.background
 * │   ╰── [sidebar child]
 * ╰── widget
 *     ╰── [content child]
 * ```
 *
 * ## Accessibility
 *
 * `AdwOverlaySplitView` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * @since 1.4
 */
public class OverlaySplitView(
    pointer: CPointer<AdwOverlaySplitView>,
) : Widget(pointer.reinterpret()),
    Swipeable,
    KGTyped {
    public val adwOverlaySplitViewPointer: CPointer<AdwOverlaySplitView>
        get() = gPointer.reinterpret()

    override val adwSwipeablePointer: CPointer<AdwSwipeable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Whether the split view is collapsed.
     *
     * When collapsed, the sidebar widget is presented as an overlay above the
     * content widget, otherwise they are displayed side by side.
     *
     * @since 1.4
     */
    public var collapsed: Boolean
        /**
         * Gets whether @self is collapsed.
         *
         * @return whether @self is collapsed
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_collapsed(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self view is collapsed.
         *
         * When collapsed, the sidebar widget is presented as an overlay above the
         * content widget, otherwise they are displayed side by side.
         *
         * @param collapsed whether @self is collapsed
         * @since 1.4
         */
        set(
            collapsed
        ) = adw_overlay_split_view_set_collapsed(adwOverlaySplitViewPointer.reinterpret(), collapsed.asGBoolean())

    /**
     * The content widget.
     *
     * @since 1.4
     */
    public var content: Widget?
        /**
         * Gets the content widget for @self.
         *
         * @return the content widget for @self
         * @since 1.4
         */
        get() =
            adw_overlay_split_view_get_content(adwOverlaySplitViewPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the content widget for @self.
         *
         * @param content the content widget
         * @since 1.4
         */
        set(
            content
        ) =
            adw_overlay_split_view_set_content(
                adwOverlaySplitViewPointer.reinterpret(),
                content?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether the sidebar can be closed with a swipe gesture.
     *
     * Only touchscreen swipes are supported.
     *
     * @since 1.4
     */
    public var enableHideGesture: Boolean
        /**
         * Gets whether @self can be closed with a swipe gesture.
         *
         * @return `TRUE` if @self can be closed with a swipe gesture
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_enable_hide_gesture(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be closed with a swipe gesture.
         *
         * Only touchscreen swipes are supported.
         *
         * @param enableHideGesture whether @self can be closed with a swipe gesture
         * @since 1.4
         */
        set(
            enableHideGesture
        ) =
            adw_overlay_split_view_set_enable_hide_gesture(
                adwOverlaySplitViewPointer.reinterpret(),
                enableHideGesture.asGBoolean()
            )

    /**
     * Whether the sidebar can be opened with an edge swipe gesture.
     *
     * Only touchscreen swipes are supported.
     *
     * @since 1.4
     */
    public var enableShowGesture: Boolean
        /**
         * Gets whether @self can be opened with an edge swipe gesture.
         *
         * @return `TRUE` if @self can be opened with a swipe gesture
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_enable_show_gesture(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be opened with an edge swipe gesture.
         *
         * Only touchscreen swipes are supported.
         *
         * @param enableShowGesture whether @self can be opened with a swipe gesture
         * @since 1.4
         */
        set(
            enableShowGesture
        ) =
            adw_overlay_split_view_set_enable_show_gesture(
                adwOverlaySplitViewPointer.reinterpret(),
                enableShowGesture.asGBoolean()
            )

    /**
     * The maximum sidebar width.
     *
     * Maximum width is affected by
     * [property@OverlaySplitView:sidebar-width-unit].
     *
     * The sidebar widget can still be allocated with larger width if its own
     * minimum width exceeds it.
     *
     * @since 1.4
     */
    public var maxSidebarWidth: Double
        /**
         * Gets the maximum sidebar width for @self.
         *
         * @return the maximum width
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_max_sidebar_width(adwOverlaySplitViewPointer.reinterpret())

        /**
         * Sets the maximum sidebar width for @self.
         *
         * Maximum width is affected by [property@OverlaySplitView:sidebar-width-unit].
         *
         * The sidebar widget can still be allocated with larger width if its own
         * minimum width exceeds it.
         *
         * @param width the maximum width
         * @since 1.4
         */
        set(width) = adw_overlay_split_view_set_max_sidebar_width(adwOverlaySplitViewPointer.reinterpret(), width)

    /**
     * The minimum sidebar width.
     *
     * Minimum width is affected by
     * [property@OverlaySplitView:sidebar-width-unit].
     *
     * The sidebar widget can still be allocated with larger width if its own
     * minimum width exceeds it.
     *
     * @since 1.4
     */
    public var minSidebarWidth: Double
        /**
         * Gets the minimum sidebar width for @self.
         *
         * @return the minimum width
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_min_sidebar_width(adwOverlaySplitViewPointer.reinterpret())

        /**
         * Sets the minimum sidebar width for @self.
         *
         * Minimum width is affected by [property@OverlaySplitView:sidebar-width-unit].
         *
         * The sidebar widget can still be allocated with larger width if its own
         * minimum width exceeds it.
         *
         * @param width the minimum width
         * @since 1.4
         */
        set(width) = adw_overlay_split_view_set_min_sidebar_width(adwOverlaySplitViewPointer.reinterpret(), width)

    /**
     * Whether the sidebar widget is pinned.
     *
     * By default, collapsing @self automatically hides the sidebar widget, and
     * uncollapsing it shows the sidebar. If set to `TRUE`, sidebar visibility
     * never changes on its own.
     *
     * @since 1.4
     */
    public var pinSidebar: Boolean
        /**
         * Gets whether the sidebar widget is pinned for @self.
         *
         * @return whether if the sidebar widget is pinned
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_pin_sidebar(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the sidebar widget is pinned for @self.
         *
         * By default, collapsing @self automatically hides the sidebar widget, and
         * uncollapsing it shows the sidebar. If set to `TRUE`, sidebar visibility never
         * changes on its own.
         *
         * @param pinSidebar whether to pin the sidebar widget
         * @since 1.4
         */
        set(
            pinSidebar
        ) = adw_overlay_split_view_set_pin_sidebar(adwOverlaySplitViewPointer.reinterpret(), pinSidebar.asGBoolean())

    /**
     * Whether the sidebar widget is shown.
     *
     * @since 1.4
     */
    public var showSidebar: Boolean
        /**
         * Gets whether the sidebar widget is shown for @self.
         *
         * @return `TRUE` if the sidebar widget is shown
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_show_sidebar(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the sidebar widget is shown for @self.
         *
         * @param showSidebar whether to show the sidebar widget
         * @since 1.4
         */
        set(
            showSidebar
        ) = adw_overlay_split_view_set_show_sidebar(adwOverlaySplitViewPointer.reinterpret(), showSidebar.asGBoolean())

    /**
     * The sidebar widget.
     *
     * @since 1.4
     */
    public var sidebar: Widget?
        /**
         * Gets the sidebar widget for @self.
         *
         * @return the sidebar widget for @self
         * @since 1.4
         */
        get() =
            adw_overlay_split_view_get_sidebar(adwOverlaySplitViewPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the sidebar widget for @self.
         *
         * @param sidebar the sidebar widget
         * @since 1.4
         */
        set(
            sidebar
        ) =
            adw_overlay_split_view_set_sidebar(
                adwOverlaySplitViewPointer.reinterpret(),
                sidebar?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The sidebar position.
     *
     * If it's set to `GTK_PACK_START`, the sidebar is displayed before the content,
     * if `GTK_PACK_END`, it's displayed after the content.
     *
     * @since 1.4
     */
    public var sidebarPosition: PackType
        /**
         * Gets the sidebar position for @self.
         *
         * @return the sidebar position for @self
         * @since 1.4
         */
        get() =
            adw_overlay_split_view_get_sidebar_position(adwOverlaySplitViewPointer.reinterpret()).run {
                PackType.fromNativeValue(this)
            }

        /**
         * Sets the sidebar position for @self.
         *
         * If it's set to `GTK_PACK_START`, the sidebar is displayed before the content,
         * if `GTK_PACK_END`, it's displayed after the content.
         *
         * @param position the new position
         * @since 1.4
         */
        set(
            position
        ) = adw_overlay_split_view_set_sidebar_position(adwOverlaySplitViewPointer.reinterpret(), position.nativeValue)

    /**
     * The preferred sidebar width as a fraction of the total width.
     *
     * The preferred width is additionally limited by
     * [property@OverlaySplitView:min-sidebar-width] and
     * [property@OverlaySplitView:max-sidebar-width].
     *
     * The sidebar widget can be allocated with larger width if its own minimum
     * width exceeds the preferred width.
     *
     * @since 1.4
     */
    public var sidebarWidthFraction: Double
        /**
         * Gets the preferred sidebar width fraction for @self.
         *
         * @return the preferred width fraction
         * @since 1.4
         */
        get() = adw_overlay_split_view_get_sidebar_width_fraction(adwOverlaySplitViewPointer.reinterpret())

        /**
         * Sets the preferred sidebar width as a fraction of the total width of @self.
         *
         * The preferred width is additionally limited by
         * [property@OverlaySplitView:min-sidebar-width] and
         * [property@OverlaySplitView:max-sidebar-width].
         *
         * The sidebar widget can be allocated with larger width if its own minimum
         * width exceeds the preferred width.
         *
         * @param fraction the preferred width fraction
         * @since 1.4
         */
        set(
            fraction
        ) = adw_overlay_split_view_set_sidebar_width_fraction(adwOverlaySplitViewPointer.reinterpret(), fraction)

    /**
     * The length unit for minimum and maximum sidebar widths.
     *
     * See [property@OverlaySplitView:min-sidebar-width] and
     * [property@OverlaySplitView:max-sidebar-width].
     *
     * @since 1.4
     */
    public var sidebarWidthUnit: LengthUnit
        /**
         * Gets the length unit for minimum and maximum sidebar widths.
         *
         * @return the length unit
         * @since 1.4
         */
        get() =
            adw_overlay_split_view_get_sidebar_width_unit(adwOverlaySplitViewPointer.reinterpret()).run {
                LengthUnit.fromNativeValue(this)
            }

        /**
         * Sets the length unit for minimum and maximum sidebar widths.
         *
         * See [property@OverlaySplitView:min-sidebar-width] and
         * [property@OverlaySplitView:max-sidebar-width].
         *
         * @param unit the length unit
         * @since 1.4
         */
        set(
            unit
        ) = adw_overlay_split_view_set_sidebar_width_unit(adwOverlaySplitViewPointer.reinterpret(), unit.nativeValue)

    /**
     * Creates a new `AdwOverlaySplitView`.
     *
     * @return the newly created `AdwOverlaySplitView`
     * @since 1.4
     */
    public constructor() : this(adw_overlay_split_view_new()!!.reinterpret())

    /**
     * Gets whether @self is collapsed.
     *
     * @return whether @self is collapsed
     * @since 1.4
     */
    public fun getCollapsed(): Boolean =
        adw_overlay_split_view_get_collapsed(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the content widget for @self.
     *
     * @return the content widget for @self
     * @since 1.4
     */
    public fun getContent(): Widget? =
        adw_overlay_split_view_get_content(adwOverlaySplitViewPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether @self can be closed with a swipe gesture.
     *
     * @return `TRUE` if @self can be closed with a swipe gesture
     * @since 1.4
     */
    public fun getEnableHideGesture(): Boolean =
        adw_overlay_split_view_get_enable_hide_gesture(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

    /**
     * Gets whether @self can be opened with an edge swipe gesture.
     *
     * @return `TRUE` if @self can be opened with a swipe gesture
     * @since 1.4
     */
    public fun getEnableShowGesture(): Boolean =
        adw_overlay_split_view_get_enable_show_gesture(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the maximum sidebar width for @self.
     *
     * @return the maximum width
     * @since 1.4
     */
    public fun getMaxSidebarWidth(): Double =
        adw_overlay_split_view_get_max_sidebar_width(adwOverlaySplitViewPointer.reinterpret())

    /**
     * Gets the minimum sidebar width for @self.
     *
     * @return the minimum width
     * @since 1.4
     */
    public fun getMinSidebarWidth(): Double =
        adw_overlay_split_view_get_min_sidebar_width(adwOverlaySplitViewPointer.reinterpret())

    /**
     * Gets whether the sidebar widget is pinned for @self.
     *
     * @return whether if the sidebar widget is pinned
     * @since 1.4
     */
    public fun getPinSidebar(): Boolean =
        adw_overlay_split_view_get_pin_sidebar(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

    /**
     * Gets whether the sidebar widget is shown for @self.
     *
     * @return `TRUE` if the sidebar widget is shown
     * @since 1.4
     */
    public fun getShowSidebar(): Boolean =
        adw_overlay_split_view_get_show_sidebar(adwOverlaySplitViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the sidebar widget for @self.
     *
     * @return the sidebar widget for @self
     * @since 1.4
     */
    public fun getSidebar(): Widget? =
        adw_overlay_split_view_get_sidebar(adwOverlaySplitViewPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the sidebar position for @self.
     *
     * @return the sidebar position for @self
     * @since 1.4
     */
    public fun getSidebarPosition(): PackType =
        adw_overlay_split_view_get_sidebar_position(adwOverlaySplitViewPointer.reinterpret()).run {
            PackType.fromNativeValue(this)
        }

    /**
     * Gets the preferred sidebar width fraction for @self.
     *
     * @return the preferred width fraction
     * @since 1.4
     */
    public fun getSidebarWidthFraction(): Double =
        adw_overlay_split_view_get_sidebar_width_fraction(adwOverlaySplitViewPointer.reinterpret())

    /**
     * Gets the length unit for minimum and maximum sidebar widths.
     *
     * @return the length unit
     * @since 1.4
     */
    public fun getSidebarWidthUnit(): LengthUnit =
        adw_overlay_split_view_get_sidebar_width_unit(adwOverlaySplitViewPointer.reinterpret()).run {
            LengthUnit.fromNativeValue(this)
        }

    /**
     * Sets whether @self view is collapsed.
     *
     * When collapsed, the sidebar widget is presented as an overlay above the
     * content widget, otherwise they are displayed side by side.
     *
     * @param collapsed whether @self is collapsed
     * @since 1.4
     */
    public fun setCollapsed(collapsed: Boolean): Unit =
        adw_overlay_split_view_set_collapsed(adwOverlaySplitViewPointer.reinterpret(), collapsed.asGBoolean())

    /**
     * Sets the content widget for @self.
     *
     * @param content the content widget
     * @since 1.4
     */
    public fun setContent(content: Widget? = null): Unit =
        adw_overlay_split_view_set_content(
            adwOverlaySplitViewPointer.reinterpret(),
            content?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets whether @self can be closed with a swipe gesture.
     *
     * Only touchscreen swipes are supported.
     *
     * @param enableHideGesture whether @self can be closed with a swipe gesture
     * @since 1.4
     */
    public fun setEnableHideGesture(enableHideGesture: Boolean): Unit =
        adw_overlay_split_view_set_enable_hide_gesture(
            adwOverlaySplitViewPointer.reinterpret(),
            enableHideGesture.asGBoolean()
        )

    /**
     * Sets whether @self can be opened with an edge swipe gesture.
     *
     * Only touchscreen swipes are supported.
     *
     * @param enableShowGesture whether @self can be opened with a swipe gesture
     * @since 1.4
     */
    public fun setEnableShowGesture(enableShowGesture: Boolean): Unit =
        adw_overlay_split_view_set_enable_show_gesture(
            adwOverlaySplitViewPointer.reinterpret(),
            enableShowGesture.asGBoolean()
        )

    /**
     * Sets the maximum sidebar width for @self.
     *
     * Maximum width is affected by [property@OverlaySplitView:sidebar-width-unit].
     *
     * The sidebar widget can still be allocated with larger width if its own
     * minimum width exceeds it.
     *
     * @param width the maximum width
     * @since 1.4
     */
    public fun setMaxSidebarWidth(width: Double): Unit =
        adw_overlay_split_view_set_max_sidebar_width(adwOverlaySplitViewPointer.reinterpret(), width)

    /**
     * Sets the minimum sidebar width for @self.
     *
     * Minimum width is affected by [property@OverlaySplitView:sidebar-width-unit].
     *
     * The sidebar widget can still be allocated with larger width if its own
     * minimum width exceeds it.
     *
     * @param width the minimum width
     * @since 1.4
     */
    public fun setMinSidebarWidth(width: Double): Unit =
        adw_overlay_split_view_set_min_sidebar_width(adwOverlaySplitViewPointer.reinterpret(), width)

    /**
     * Sets whether the sidebar widget is pinned for @self.
     *
     * By default, collapsing @self automatically hides the sidebar widget, and
     * uncollapsing it shows the sidebar. If set to `TRUE`, sidebar visibility never
     * changes on its own.
     *
     * @param pinSidebar whether to pin the sidebar widget
     * @since 1.4
     */
    public fun setPinSidebar(pinSidebar: Boolean): Unit =
        adw_overlay_split_view_set_pin_sidebar(adwOverlaySplitViewPointer.reinterpret(), pinSidebar.asGBoolean())

    /**
     * Sets whether the sidebar widget is shown for @self.
     *
     * @param showSidebar whether to show the sidebar widget
     * @since 1.4
     */
    public fun setShowSidebar(showSidebar: Boolean): Unit =
        adw_overlay_split_view_set_show_sidebar(adwOverlaySplitViewPointer.reinterpret(), showSidebar.asGBoolean())

    /**
     * Sets the sidebar widget for @self.
     *
     * @param sidebar the sidebar widget
     * @since 1.4
     */
    public fun setSidebar(sidebar: Widget? = null): Unit =
        adw_overlay_split_view_set_sidebar(
            adwOverlaySplitViewPointer.reinterpret(),
            sidebar?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the sidebar position for @self.
     *
     * If it's set to `GTK_PACK_START`, the sidebar is displayed before the content,
     * if `GTK_PACK_END`, it's displayed after the content.
     *
     * @param position the new position
     * @since 1.4
     */
    public fun setSidebarPosition(position: PackType): Unit =
        adw_overlay_split_view_set_sidebar_position(adwOverlaySplitViewPointer.reinterpret(), position.nativeValue)

    /**
     * Sets the preferred sidebar width as a fraction of the total width of @self.
     *
     * The preferred width is additionally limited by
     * [property@OverlaySplitView:min-sidebar-width] and
     * [property@OverlaySplitView:max-sidebar-width].
     *
     * The sidebar widget can be allocated with larger width if its own minimum
     * width exceeds the preferred width.
     *
     * @param fraction the preferred width fraction
     * @since 1.4
     */
    public fun setSidebarWidthFraction(fraction: Double): Unit =
        adw_overlay_split_view_set_sidebar_width_fraction(adwOverlaySplitViewPointer.reinterpret(), fraction)

    /**
     * Sets the length unit for minimum and maximum sidebar widths.
     *
     * See [property@OverlaySplitView:min-sidebar-width] and
     * [property@OverlaySplitView:max-sidebar-width].
     *
     * @param unit the length unit
     * @since 1.4
     */
    public fun setSidebarWidthUnit(unit: LengthUnit): Unit =
        adw_overlay_split_view_set_sidebar_width_unit(adwOverlaySplitViewPointer.reinterpret(), unit.nativeValue)

    public companion object : TypeCompanion<OverlaySplitView> {
        override val type: GeneratedClassKGType<OverlaySplitView> =
            GeneratedClassKGType(adw_overlay_split_view_get_type()) { OverlaySplitView(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
