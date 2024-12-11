// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwNavigationSplitView
import org.gtkkn.native.adw.adw_navigation_split_view_get_collapsed
import org.gtkkn.native.adw.adw_navigation_split_view_get_content
import org.gtkkn.native.adw.adw_navigation_split_view_get_max_sidebar_width
import org.gtkkn.native.adw.adw_navigation_split_view_get_min_sidebar_width
import org.gtkkn.native.adw.adw_navigation_split_view_get_show_content
import org.gtkkn.native.adw.adw_navigation_split_view_get_sidebar
import org.gtkkn.native.adw.adw_navigation_split_view_get_sidebar_width_fraction
import org.gtkkn.native.adw.adw_navigation_split_view_get_sidebar_width_unit
import org.gtkkn.native.adw.adw_navigation_split_view_get_type
import org.gtkkn.native.adw.adw_navigation_split_view_new
import org.gtkkn.native.adw.adw_navigation_split_view_set_collapsed
import org.gtkkn.native.adw.adw_navigation_split_view_set_content
import org.gtkkn.native.adw.adw_navigation_split_view_set_max_sidebar_width
import org.gtkkn.native.adw.adw_navigation_split_view_set_min_sidebar_width
import org.gtkkn.native.adw.adw_navigation_split_view_set_show_content
import org.gtkkn.native.adw.adw_navigation_split_view_set_sidebar
import org.gtkkn.native.adw.adw_navigation_split_view_set_sidebar_width_fraction
import org.gtkkn.native.adw.adw_navigation_split_view_set_sidebar_width_unit
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean

/**
 * A widget presenting sidebar and content side by side or as a navigation view.
 *
 * <picture>
 *   <source srcset="navigation-split-view-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="navigation-split-view.png" alt="navigation-split-view">
 * </picture>
 * <picture>
 *   <source srcset="navigation-split-view-collapsed-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="navigation-split-view-collapsed.png" alt="navigation-split-view-collapsed">
 * </picture>
 *
 * `AdwNavigationSplitView` has two [class@NavigationPage] children: sidebar and
 * content, and displays them side by side.
 *
 * When [property@NavigationSplitView:collapsed] is set to `TRUE`, it instead
 * puts both children inside an [class@NavigationView]. The
 * [property@NavigationSplitView:show-content] controls which child is visible
 * while collapsed.
 *
 * See also [class@OverlaySplitView].
 *
 * `AdwNavigationSplitView` is typically used together with an [class@Breakpoint]
 * setting the `collapsed` property to `TRUE` on small widths, as follows:
 *
 * ```xml
 * <object class="AdwWindow">
 *   <property name="width-request">280</property>
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
 *     <object class="AdwNavigationSplitView" id="split_view">
 *       <property name="sidebar">
 *         <object class="AdwNavigationPage">
 *           <property name="title" translatable="yes">Sidebar</property>
 *           <property name="child">
 *             <!-- ... -->
 *           </property>
 *         </object>
 *       </property>
 *       <property name="content">
 *         <object class="AdwNavigationPage">
 *           <property name="title" translatable="yes">Content</property>
 *           <property name="child">
 *             <!-- ... -->
 *           </property>
 *         </object>
 *       </property>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * ## Sizing
 *
 * When not collapsed, `AdwNavigationSplitView` changes the sidebar width
 * depending on its own width.
 *
 * If possible, it tries to allocate a fraction of the total width, controlled
 * with the [property@NavigationSplitView:sidebar-width-fraction] property.
 *
 * The sidebar also has minimum and maximum sizes, controlled with the
 * [property@NavigationSplitView:min-sidebar-width] and
 * [property@NavigationSplitView:max-sidebar-width] properties.
 *
 * The minimum and maximum sizes are using the length unit specified with the
 * [property@NavigationSplitView:sidebar-width-unit].
 *
 * By default, sidebar is using 25% of the total width, with 180sp as the
 * minimum size and 280sp as the maximum size.
 *
 * ## Header Bar Integration
 *
 * When used inside `AdwNavigationSplitView`, [class@HeaderBar] will
 * automatically hide the window buttons in the middle.
 *
 * When collapsed, it also displays a back button for the content widget, as
 * well as the page titles. See [class@NavigationView] documentation for details.
 *
 * ## Actions
 *
 * `AdwNavigationSplitView` defines the same actions as `AdwNavigationView`, but
 * they can be used even when the split view is not collapsed:
 *
 * - `navigation.push` takes a string parameter specifying the tag of the page
 * to push. If it matches the tag of the content widget, it sets
 * [property@NavigationSplitView:show-content] to `TRUE`.
 *
 * - `navigation.pop` doesn't take any parameters and sets
 * [property@NavigationSplitView:show-content] to `FALSE`.
 *
 * ## `AdwNavigationSplitView` as `GtkBuildable`
 *
 * The `AdwNavigationSplitView` implementation of the [iface@Gtk.Buildable]
 * interface supports setting the sidebar widget by specifying “sidebar” as the
 * “type” attribute of a `<child>` element, Specifying “content” child type or
 * omitting it results in setting the content widget.
 *
 * ## CSS nodes
 *
 * `AdwNavigationSplitView` has a single CSS node with the name
 * `navigation-split-view`.
 *
 * When collapsed, it contains a child node with the name `navigation-view`
 * containing both children.
 *
 * ```
 * navigation-split-view
 * ╰── navigation-view
 *     ├── [sidebar child]
 *     ╰── [content child]
 * ```
 *
 * When not collapsed, it contains two nodes with the name `widget`, one with
 * the `.sidebar-pane` style class, the other one with `.content-view` style
 * class, containing the sidebar and content children respectively.
 *
 * ```
 * navigation-split-view
 * ├── widget.sidebar-pane
 * │   ╰── [sidebar child]
 * ╰── widget.content-pane
 *     ╰── [content child]
 * ```
 *
 * ## Accessibility
 *
 * `AdwNavigationSplitView` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * @since 1.4
 */
@AdwVersion1_4
public class NavigationSplitView(pointer: CPointer<AdwNavigationSplitView>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwNavigationSplitViewPointer: CPointer<AdwNavigationSplitView>
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
     * When collapsed, the children are put inside an [class@NavigationView],
     * otherwise they are displayed side by side.
     *
     * The [property@NavigationSplitView:show-content] controls which child is
     * visible while collapsed.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var collapsed: Boolean
        /**
         * Gets whether @self is collapsed.
         *
         * @return whether @self is collapsed
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_collapsed(adwNavigationSplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self is collapsed.
         *
         * When collapsed, the children are put inside an [class@NavigationView],
         * otherwise they are displayed side by side.
         *
         * The [property@NavigationSplitView:show-content] controls which child is
         * visible while collapsed.
         *
         * @param collapsed whether @self is collapsed
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            collapsed
        ) = adw_navigation_split_view_set_collapsed(adwNavigationSplitViewPointer.reinterpret(), collapsed.asGBoolean())

    /**
     * The content widget.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var content: NavigationPage?
        /**
         * Sets the content widget for @self.
         *
         * @return the content widget
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_content(adwNavigationSplitViewPointer.reinterpret())?.run {
            NavigationPage(reinterpret())
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
        ) = adw_navigation_split_view_set_content(
            adwNavigationSplitViewPointer.reinterpret(),
            content?.adwNavigationPagePointer?.reinterpret()
        )

    /**
     * The maximum sidebar width.
     *
     * Maximum width is affected by
     * [property@NavigationSplitView:sidebar-width-unit].
     *
     * The sidebar widget can still be allocated with larger width if its own
     * minimum width exceeds it.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var maxSidebarWidth: gdouble
        /**
         * Gets the maximum sidebar width for @self.
         *
         * @return the maximum width
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_max_sidebar_width(adwNavigationSplitViewPointer.reinterpret())

        /**
         * Sets the maximum sidebar width for @self.
         *
         * Maximum width is affected by
         * [property@NavigationSplitView:sidebar-width-unit].
         *
         * The sidebar widget can still be allocated with larger width if its own
         * minimum width exceeds it.
         *
         * @param width the maximum width
         * @since 1.4
         */
        @AdwVersion1_4
        set(width) = adw_navigation_split_view_set_max_sidebar_width(adwNavigationSplitViewPointer.reinterpret(), width)

    /**
     * The minimum sidebar width.
     *
     * Minimum width is affected by
     * [property@NavigationSplitView:sidebar-width-unit].
     *
     * The sidebar widget can still be allocated with larger width if its own
     * minimum width exceeds it.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var minSidebarWidth: gdouble
        /**
         * Gets the minimum sidebar width for @self.
         *
         * @return the minimum width
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_min_sidebar_width(adwNavigationSplitViewPointer.reinterpret())

        /**
         * Sets the minimum sidebar width for @self.
         *
         * Minimum width is affected by
         * [property@NavigationSplitView:sidebar-width-unit].
         *
         * The sidebar widget can still be allocated with larger width if its own
         * minimum width exceeds it.
         *
         * @param width the minimum width
         * @since 1.4
         */
        @AdwVersion1_4
        set(width) = adw_navigation_split_view_set_min_sidebar_width(adwNavigationSplitViewPointer.reinterpret(), width)

    /**
     * Determines the visible page when collapsed.
     *
     * If set to `TRUE`, the content widget will be the visible page when
     * [property@NavigationSplitView:collapsed] is `TRUE`; otherwise the sidebar
     * widget will be visible.
     *
     * If the split view is already collapsed, the visible page changes
     * immediately.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var showContent: Boolean
        /**
         * Gets which page is visible when @self is collapsed.
         *
         * @return whether to show content when collapsed
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_show_content(adwNavigationSplitViewPointer.reinterpret()).asBoolean()

        /**
         * Sets which page is visible when @self is collapsed.
         *
         * If set to `TRUE`, the content widget will be the visible page when
         * [property@NavigationSplitView:collapsed] is `TRUE`; otherwise the sidebar
         * widget will be visible.
         *
         * If the split view is already collapsed, the visible page changes immediately.
         *
         * @param showContent whether to show content when collapsed
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            showContent
        ) = adw_navigation_split_view_set_show_content(
            adwNavigationSplitViewPointer.reinterpret(),
            showContent.asGBoolean()
        )

    /**
     * The sidebar widget.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var sidebar: NavigationPage?
        /**
         * Gets the sidebar widget for @self.
         *
         * @return the sidebar widget
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_sidebar(adwNavigationSplitViewPointer.reinterpret())?.run {
            NavigationPage(reinterpret())
        }

        /**
         * Sets the sidebar widget for @self.
         *
         * @param sidebar the sidebar widget
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            sidebar
        ) = adw_navigation_split_view_set_sidebar(
            adwNavigationSplitViewPointer.reinterpret(),
            sidebar?.adwNavigationPagePointer?.reinterpret()
        )

    /**
     * The preferred sidebar width as a fraction of the total width.
     *
     * The preferred width is additionally limited by
     * [property@NavigationSplitView:min-sidebar-width] and
     * [property@NavigationSplitView:max-sidebar-width].
     *
     * The sidebar widget can be allocated with larger width if its own minimum
     * width exceeds the preferred width.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var sidebarWidthFraction: gdouble
        /**
         * Gets the preferred sidebar width fraction for @self.
         *
         * @return the preferred width fraction
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_sidebar_width_fraction(adwNavigationSplitViewPointer.reinterpret())

        /**
         * Sets the preferred sidebar width as a fraction of the total width of @self.
         *
         * The preferred width is additionally limited by
         * [property@NavigationSplitView:min-sidebar-width] and
         * [property@NavigationSplitView:max-sidebar-width].
         *
         * The sidebar widget can be allocated with larger width if its own minimum
         * width exceeds the preferred width.
         *
         * @param fraction the preferred width fraction
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            fraction
        ) = adw_navigation_split_view_set_sidebar_width_fraction(adwNavigationSplitViewPointer.reinterpret(), fraction)

    /**
     * The length unit for minimum and maximum sidebar widths.
     *
     * See [property@NavigationSplitView:min-sidebar-width] and
     * [property@NavigationSplitView:max-sidebar-width].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var sidebarWidthUnit: LengthUnit
        /**
         * Gets the length unit for minimum and maximum sidebar widths.
         *
         * @return the length unit
         * @since 1.4
         */
        get() = adw_navigation_split_view_get_sidebar_width_unit(adwNavigationSplitViewPointer.reinterpret()).run {
            LengthUnit.fromNativeValue(this)
        }

        /**
         * Sets the length unit for minimum and maximum sidebar widths.
         *
         * See [property@NavigationSplitView:min-sidebar-width] and
         * [property@NavigationSplitView:max-sidebar-width].
         *
         * @param unit the length unit
         * @since 1.4
         */
        @AdwVersion1_4
        set(
            unit
        ) = adw_navigation_split_view_set_sidebar_width_unit(
            adwNavigationSplitViewPointer.reinterpret(),
            unit.nativeValue
        )

    /**
     * Creates a new `AdwNavigationSplitView`.
     *
     * @return the newly created `AdwNavigationSplitView`
     * @since 1.4
     */
    public constructor() : this(adw_navigation_split_view_new()!!.reinterpret())

    public companion object : TypeCompanion<NavigationSplitView> {
        override val type: GeneratedClassKGType<NavigationSplitView> =
            GeneratedClassKGType(adw_navigation_split_view_get_type()) { NavigationSplitView(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of NavigationSplitView
         *
         * @return the GType
         */
        public fun getType(): GType = adw_navigation_split_view_get_type()
    }
}
