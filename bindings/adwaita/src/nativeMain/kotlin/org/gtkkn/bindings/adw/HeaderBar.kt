// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwHeaderBar
import org.gtkkn.native.adw.adw_header_bar_get_centering_policy
import org.gtkkn.native.adw.adw_header_bar_get_decoration_layout
import org.gtkkn.native.adw.adw_header_bar_get_show_back_button
import org.gtkkn.native.adw.adw_header_bar_get_show_end_title_buttons
import org.gtkkn.native.adw.adw_header_bar_get_show_start_title_buttons
import org.gtkkn.native.adw.adw_header_bar_get_show_title
import org.gtkkn.native.adw.adw_header_bar_get_title_widget
import org.gtkkn.native.adw.adw_header_bar_get_type
import org.gtkkn.native.adw.adw_header_bar_new
import org.gtkkn.native.adw.adw_header_bar_pack_end
import org.gtkkn.native.adw.adw_header_bar_pack_start
import org.gtkkn.native.adw.adw_header_bar_remove
import org.gtkkn.native.adw.adw_header_bar_set_centering_policy
import org.gtkkn.native.adw.adw_header_bar_set_decoration_layout
import org.gtkkn.native.adw.adw_header_bar_set_show_back_button
import org.gtkkn.native.adw.adw_header_bar_set_show_end_title_buttons
import org.gtkkn.native.adw.adw_header_bar_set_show_start_title_buttons
import org.gtkkn.native.adw.adw_header_bar_set_show_title
import org.gtkkn.native.adw.adw_header_bar_set_title_widget
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A title bar widget.
 *
 * <picture>
 *   <source srcset="header-bar-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="header-bar.png" alt="header-bar">
 * </picture>
 *
 * `AdwHeaderBar` is similar to [class@Gtk.HeaderBar], but provides additional
 * features compared to it. Refer to `GtkHeaderBar` for details. It is typically
 * used as a top bar within [class@ToolbarView].
 *
 * ## Dialog Integration
 *
 * When placed inside an [class@Dialog], `AdwHeaderBar` will display the dialog
 * title intead of window title. It will also adjust the decoration layout to
 * ensure it always has a close button and nothing else. Set
 * [property@HeaderBar:show-start-title-buttons] and
 * [property@HeaderBar:show-end-title-buttons] to `FALSE` to remove it if it's
 * unwanted.
 *
 * ## Navigation View Integration
 *
 * When placed inside an [class@NavigationPage], `AdwHeaderBar` will display the
 * page title instead of window title.
 *
 * When used together with [class@NavigationView] or [class@NavigationSplitView],
 * it will also display a back button that can be used to go back to the previous
 * page. The button also has a context menu, allowing to pop multiple pages at
 * once, potentially across multiple navigation views.
 *
 * Set [property@HeaderBar:show-back-button] to `FALSE` to disable this behavior
 * in rare scenarios where it's unwanted.
 *
 * ## Split View Integration
 *
 * When placed inside `AdwNavigationSplitView` or `AdwOverlaySplitView`,
 * `AdwHeaderBar` will automatically hide the title buttons other than at the
 * edges of the window.
 *
 * ## Centering Policy
 *
 * [property@HeaderBar:centering-policy] allows to enforce strict centering of
 * the title widget. This can be useful for entries inside [class@Clamp].
 *
 * ## Title Buttons
 *
 * Unlike `GtkHeaderBar`, `AdwHeaderBar` allows to toggle title button
 * visibility for each side individually, using the
 * [property@HeaderBar:show-start-title-buttons] and
 * [property@HeaderBar:show-end-title-buttons] properties.
 *
 * ## CSS nodes
 *
 * ```
 * headerbar
 * ╰── windowhandle
 *     ╰── box
 *         ├── widget
 *         │   ╰── box.start
 *         │       ├── windowcontrols.start
 *         │       ├── widget
 *         │       │   ╰── [button.back]
 *         │       ╰── [other children]
 *         ├── widget
 *         │   ╰── [Title Widget]
 *         ╰── widget
 *             ╰── box.end
 *                 ├── [other children]
 *                 ╰── windowcontrols.end
 * ```
 *
 * `AdwHeaderBar`'s CSS node is called `headerbar`. It contains a `windowhandle`
 * subnode, which contains a `box` subnode, which contains three `widget`
 * subnodes at the start, center and end of the header bar. The start and end
 * subnotes contain a `box` subnode with the `.start` and `.end` style classes
 * respectively, and the center node contains a node that represents the title.
 *
 * Each of the boxes contains a `windowcontrols` subnode, see
 * [class@Gtk.WindowControls] for details, as well as other children.
 *
 * When [property@HeaderBar:show-back-button] is `TRUE`, the start box also
 * contains a node with the name `widget` that contains a node with the name
 * `button` and `.back` style class.
 *
 * ## Accessibility
 *
 * `AdwHeaderBar` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 */
public class HeaderBar(public val adwHeaderBarPointer: CPointer<AdwHeaderBar>) :
    Widget(adwHeaderBarPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The policy for aligning the center widget.
     */
    public var centeringPolicy: CenteringPolicy
        /**
         * Gets the policy for aligning the center widget.
         *
         * @return the centering policy
         */
        get() = adw_header_bar_get_centering_policy(adwHeaderBarPointer).run {
            CenteringPolicy.fromNativeValue(this)
        }

        /**
         * Sets the policy for aligning the center widget.
         *
         * @param centeringPolicy the centering policy
         */
        set(centeringPolicy) = adw_header_bar_set_centering_policy(adwHeaderBarPointer, centeringPolicy.nativeValue)

    /**
     * The decoration layout for buttons.
     *
     * If this property is not set, the
     * [property@Gtk.Settings:gtk-decoration-layout] setting is used.
     *
     * The format of the string is button names, separated by commas. A colon
     * separates the buttons that should appear at the start from those at the
     * end. Recognized button names are minimize, maximize, close and icon (the
     * window icon).
     *
     * For example, “icon:minimize,maximize,close” specifies an icon at the start,
     * and minimize, maximize and close buttons at the end.
     */
    public var decorationLayout: String?
        /**
         * Gets the decoration layout for @self.
         *
         * @return the decoration layout
         */
        get() = adw_header_bar_get_decoration_layout(adwHeaderBarPointer)?.toKString()

        /**
         * Sets the decoration layout for @self.
         *
         * If this property is not set, the
         * [property@Gtk.Settings:gtk-decoration-layout] setting is used.
         *
         * The format of the string is button names, separated by commas. A colon
         * separates the buttons that should appear at the start from those at the end.
         * Recognized button names are minimize, maximize, close and icon (the window
         * icon).
         *
         * For example, “icon:minimize,maximize,close” specifies an icon at the start,
         * and minimize, maximize and close buttons at the end.
         *
         * @param layout a decoration layout
         */
        set(layout) = adw_header_bar_set_decoration_layout(adwHeaderBarPointer, layout)

    /**
     * Whether the header bar can show the back button.
     *
     * The back button will never be shown unless the header bar is placed inside an
     * [class@NavigationView]. Usually, there is no reason to set this to `FALSE`.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var showBackButton: Boolean
        /**
         * Gets whether @self can show the back button.
         *
         * @return whether to show the back button
         * @since 1.4
         */
        get() = adw_header_bar_get_show_back_button(adwHeaderBarPointer).asBoolean()

        /**
         * Sets whether @self can show the back button.
         *
         * The back button will never be shown unless the header bar is placed inside an
         * [class@NavigationView]. Usually, there is no reason to set it to `FALSE`.
         *
         * @param showBackButton whether to show the back button
         * @since 1.4
         */
        @AdwVersion1_4
        set(showBackButton) = adw_header_bar_set_show_back_button(adwHeaderBarPointer, showBackButton.asGBoolean())

    /**
     * Whether to show title buttons at the end of the header bar.
     *
     * See [property@HeaderBar:show-start-title-buttons] for the other side.
     *
     * Which buttons are actually shown and where is determined by the
     * [property@HeaderBar:decoration-layout] property, and by the state of the
     * window (e.g. a close button will not be shown if the window can't be
     * closed).
     */
    public var showEndTitleButtons: Boolean
        /**
         * Gets whether to show title buttons at the end of @self.
         *
         * @return `TRUE` if title buttons at the end are shown
         */
        get() = adw_header_bar_get_show_end_title_buttons(adwHeaderBarPointer).asBoolean()

        /**
         * Sets whether to show title buttons at the end of @self.
         *
         * See [property@HeaderBar:show-start-title-buttons] for the other side.
         *
         * Which buttons are actually shown and where is determined by the
         * [property@HeaderBar:decoration-layout] property, and by the state of the
         * window (e.g. a close button will not be shown if the window can't be closed).
         *
         * @param setting `TRUE` to show standard title buttons
         */
        set(setting) = adw_header_bar_set_show_end_title_buttons(adwHeaderBarPointer, setting.asGBoolean())

    /**
     * Whether to show title buttons at the start of the header bar.
     *
     * See [property@HeaderBar:show-end-title-buttons] for the other side.
     *
     * Which buttons are actually shown and where is determined by the
     * [property@HeaderBar:decoration-layout] property, and by the state of the
     * window (e.g. a close button will not be shown if the window can't be
     * closed).
     */
    public var showStartTitleButtons: Boolean
        /**
         * Gets whether to show title buttons at the start of @self.
         *
         * @return `TRUE` if title buttons at the start are shown
         */
        get() = adw_header_bar_get_show_start_title_buttons(adwHeaderBarPointer).asBoolean()

        /**
         * Sets whether to show title buttons at the start of @self.
         *
         * See [property@HeaderBar:show-end-title-buttons] for the other side.
         *
         * Which buttons are actually shown and where is determined by the
         * [property@HeaderBar:decoration-layout] property, and by the state of the
         * window (e.g. a close button will not be shown if the window can't be closed).
         *
         * @param setting `TRUE` to show standard title buttons
         */
        set(setting) = adw_header_bar_set_show_start_title_buttons(adwHeaderBarPointer, setting.asGBoolean())

    /**
     * Whether the title widget should be shown.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var showTitle: Boolean
        /**
         * Gets whether the title widget should be shown.
         *
         * @return whether the title widget should be shown.
         * @since 1.4
         */
        get() = adw_header_bar_get_show_title(adwHeaderBarPointer).asBoolean()

        /**
         * Sets whether the title widget should be shown.
         *
         * @param showTitle whether the title widget is visible
         * @since 1.4
         */
        @AdwVersion1_4
        set(showTitle) = adw_header_bar_set_show_title(adwHeaderBarPointer, showTitle.asGBoolean())

    /**
     * The title widget to display.
     *
     * When set to `NULL`, the header bar will display the title of the window it
     * is contained in.
     *
     * To use a different title, use [class@WindowTitle]:
     *
     * ```xml
     * <object class="AdwHeaderBar">
     *   <property name="title-widget">
     *     <object class="AdwWindowTitle">
     *       <property name="title" translatable="yes">Title</property>
     *     </object>
     *   </property>
     * </object>
     * ```
     */
    public var titleWidget: Widget?
        /**
         * Gets the title widget widget of @self.
         *
         * @return the title widget
         */
        get() = adw_header_bar_get_title_widget(adwHeaderBarPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the title widget for @self.
         *
         * When set to `NULL`, the header bar will display the title of the window it
         * is contained in.
         *
         * To use a different title, use [class@WindowTitle]:
         *
         * ```xml
         * <object class="AdwHeaderBar">
         *   <property name="title-widget">
         *     <object class="AdwWindowTitle">
         *       <property name="title" translatable="yes">Title</property>
         *     </object>
         *   </property>
         * </object>
         * ```
         *
         * @param titleWidget a widget to use for a title
         */
        set(titleWidget) = adw_header_bar_set_title_widget(adwHeaderBarPointer, titleWidget?.gtkWidgetPointer)

    /**
     * Creates a new `AdwHeaderBar`.
     *
     * @return the newly created `AdwHeaderBar`.
     */
    public constructor() : this(adw_header_bar_new()!!.reinterpret())

    /**
     * Adds @child to @self, packed with reference to the end of @self.
     *
     * @param child the widget to be added to @self
     */
    public fun packEnd(child: Widget): Unit = adw_header_bar_pack_end(adwHeaderBarPointer, child.gtkWidgetPointer)

    /**
     * Adds @child to @self, packed with reference to the start of the @self.
     *
     * @param child the widget to be added to @self
     */
    public fun packStart(child: Widget): Unit = adw_header_bar_pack_start(adwHeaderBarPointer, child.gtkWidgetPointer)

    /**
     * Removes a child from @self.
     *
     * The child must have been added with [method@HeaderBar.pack_start],
     * [method@HeaderBar.pack_end] or [property@HeaderBar:title-widget].
     *
     * @param child the child to remove
     */
    public fun remove(child: Widget): Unit = adw_header_bar_remove(adwHeaderBarPointer, child.gtkWidgetPointer)

    public companion object : TypeCompanion<HeaderBar> {
        override val type: GeneratedClassKGType<HeaderBar> =
            GeneratedClassKGType(adw_header_bar_get_type()) { HeaderBar(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of HeaderBar
         *
         * @return the GType
         */
        public fun getType(): GType = adw_header_bar_get_type()
    }
}
