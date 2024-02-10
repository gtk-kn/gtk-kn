// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwHeaderBar
import org.gtkkn.native.adw.adw_header_bar_get_centering_policy
import org.gtkkn.native.adw.adw_header_bar_get_decoration_layout
import org.gtkkn.native.adw.adw_header_bar_get_show_end_title_buttons
import org.gtkkn.native.adw.adw_header_bar_get_show_start_title_buttons
import org.gtkkn.native.adw.adw_header_bar_get_title_widget
import org.gtkkn.native.adw.adw_header_bar_get_type
import org.gtkkn.native.adw.adw_header_bar_new
import org.gtkkn.native.adw.adw_header_bar_pack_end
import org.gtkkn.native.adw.adw_header_bar_pack_start
import org.gtkkn.native.adw.adw_header_bar_remove
import org.gtkkn.native.adw.adw_header_bar_set_centering_policy
import org.gtkkn.native.adw.adw_header_bar_set_decoration_layout
import org.gtkkn.native.adw.adw_header_bar_set_show_end_title_buttons
import org.gtkkn.native.adw.adw_header_bar_set_show_start_title_buttons
import org.gtkkn.native.adw.adw_header_bar_set_title_widget
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
 * features compared to it. Refer to `GtkHeaderBar` for details.
 *
 * [property@HeaderBar:centering-policy] allows to enforce strict centering of
 * the title widget, this is useful for [class@ViewSwitcherTitle].
 *
 * [property@HeaderBar:show-start-title-buttons] and
 * [property@HeaderBar:show-end-title-buttons] allow to easily create split
 * header bar layouts using [class@Leaflet], as follows:
 *
 * ```xml
 * <object class="AdwLeaflet" id="leaflet">
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwHeaderBar">
 *           <binding name="show-end-title-buttons">
 *             <lookup name="folded">leaflet</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *       <!-- ... -->
 *     </object>
 *   </child>
 *   <!-- ... -->
 *   <child>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <property name="hexpand">True</property>
 *       <child>
 *         <object class="AdwHeaderBar">
 *           <binding name="show-start-title-buttons">
 *             <lookup name="folded">leaflet</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *       <!-- ... -->
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * <picture>
 *   <source srcset="header-bar-split-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="header-bar-split.png" alt="header-bar-split">
 * </picture>
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
 *         │       ╰── [other children]
 *         ├── [Title Widget]
 *         ╰── widget
 *             ╰── box.end
 *                 ├── [other children]
 *                 ╰── windowcontrols.end
 * ```
 *
 * `AdwHeaderBar`'s CSS node is called `headerbar`. It contains a `windowhandle`
 * subnode, which contains a `box` subnode, which contains two `widget` subnodes
 * at the start and end of the header bar, each of which contains a `box`
 * subnode with the `.start` and `.end` style classes respectively, as well as a
 * center node that represents the title.
 *
 * Each of the boxes contains a `windowcontrols` subnode, see
 * [class@Gtk.WindowControls] for details, as well as other children.
 *
 * ## Accessibility
 *
 * `AdwHeaderBar` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 * @since 1.0
 */
public class HeaderBar(
    pointer: CPointer<AdwHeaderBar>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwHeaderBarPointer: CPointer<AdwHeaderBar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The policy for aligning the center widget.
     *
     * @since 1.0
     */
    public var centeringPolicy: CenteringPolicy
        /**
         * Gets the policy for aligning the center widget.
         *
         * @return the centering policy
         * @since 1.0
         */
        get() =
            adw_header_bar_get_centering_policy(adwHeaderBarPointer.reinterpret()).run {
                CenteringPolicy.fromNativeValue(this)
            }

        /**
         * Sets the policy for aligning the center widget.
         *
         * @param centeringPolicy the centering policy
         * @since 1.0
         */
        set(centeringPolicy) =
            adw_header_bar_set_centering_policy(
                adwHeaderBarPointer.reinterpret(),
                centeringPolicy.nativeValue
            )

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
     *
     * @since 1.0
     */
    public var decorationLayout: String?
        /**
         * Gets the decoration layout for @self.
         *
         * @return the decoration layout
         * @since 1.0
         */
        get() = adw_header_bar_get_decoration_layout(adwHeaderBarPointer.reinterpret())?.toKString()

        /**
         * Sets the decoration layout for @self.
         *
         * @param layout a decoration layout
         * @since 1.0
         */
        set(layout) =
            adw_header_bar_set_decoration_layout(
                adwHeaderBarPointer.reinterpret(),
                layout
            )

    /**
     * Whether to show title buttons at the end of the header bar.
     *
     * See [property@HeaderBar:show-start-title-buttons] for the other side.
     *
     * Which buttons are actually shown and where is determined by the
     * [property@HeaderBar:decoration-layout] property, and by the state of the
     * window (e.g. a close button will not be shown if the window can't be
     * closed).
     *
     * @since 1.0
     */
    public var showEndTitleButtons: Boolean
        /**
         * Gets whether to show title buttons at the end of @self.
         *
         * @return `TRUE` if title buttons at the end are shown
         * @since 1.0
         */
        get() =
            adw_header_bar_get_show_end_title_buttons(adwHeaderBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to show title buttons at the end of @self.
         *
         * @param setting `TRUE` to show standard title buttons
         * @since 1.0
         */
        set(setting) =
            adw_header_bar_set_show_end_title_buttons(
                adwHeaderBarPointer.reinterpret(),
                setting.asGBoolean()
            )

    /**
     * Whether to show title buttons at the start of the header bar.
     *
     * See [property@HeaderBar:show-end-title-buttons] for the other side.
     *
     * Which buttons are actually shown and where is determined by the
     * [property@HeaderBar:decoration-layout] property, and by the state of the
     * window (e.g. a close button will not be shown if the window can't be
     * closed).
     *
     * @since 1.0
     */
    public var showStartTitleButtons: Boolean
        /**
         * Gets whether to show title buttons at the start of @self.
         *
         * @return `TRUE` if title buttons at the start are shown
         * @since 1.0
         */
        get() =
            adw_header_bar_get_show_start_title_buttons(adwHeaderBarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to show title buttons at the start of @self.
         *
         * @param setting `TRUE` to show standard title buttons
         * @since 1.0
         */
        set(setting) =
            adw_header_bar_set_show_start_title_buttons(
                adwHeaderBarPointer.reinterpret(),
                setting.asGBoolean()
            )

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
     *
     * @since 1.0
     */
    public var titleWidget: Widget?
        /**
         * Gets the title widget widget of @self.
         *
         * @return the title widget
         * @since 1.0
         */
        get() =
            adw_header_bar_get_title_widget(adwHeaderBarPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the title widget for @self.
         *
         * @param titleWidget a widget to use for a title
         * @since 1.0
         */
        set(titleWidget) =
            adw_header_bar_set_title_widget(
                adwHeaderBarPointer.reinterpret(),
                titleWidget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwHeaderBar`.
     *
     * @return the newly created `AdwHeaderBar`.
     * @since 1.0
     */
    public constructor() : this(adw_header_bar_new()!!.reinterpret())

    /**
     * Gets the policy for aligning the center widget.
     *
     * @return the centering policy
     * @since 1.0
     */
    public fun getCenteringPolicy(): CenteringPolicy =
        adw_header_bar_get_centering_policy(adwHeaderBarPointer.reinterpret()).run {
            CenteringPolicy.fromNativeValue(this)
        }

    /**
     * Gets the decoration layout for @self.
     *
     * @return the decoration layout
     * @since 1.0
     */
    public fun getDecorationLayout(): String? =
        adw_header_bar_get_decoration_layout(adwHeaderBarPointer.reinterpret())?.toKString()

    /**
     * Gets whether to show title buttons at the end of @self.
     *
     * @return `TRUE` if title buttons at the end are shown
     * @since 1.0
     */
    public fun getShowEndTitleButtons(): Boolean =
        adw_header_bar_get_show_end_title_buttons(adwHeaderBarPointer.reinterpret()).asBoolean()

    /**
     * Gets whether to show title buttons at the start of @self.
     *
     * @return `TRUE` if title buttons at the start are shown
     * @since 1.0
     */
    public fun getShowStartTitleButtons(): Boolean =
        adw_header_bar_get_show_start_title_buttons(adwHeaderBarPointer.reinterpret()).asBoolean()

    /**
     * Gets the title widget widget of @self.
     *
     * @return the title widget
     * @since 1.0
     */
    public fun getTitleWidget(): Widget? =
        adw_header_bar_get_title_widget(adwHeaderBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Adds @child to @self, packed with reference to the end of @self.
     *
     * @param child the widget to be added to @self
     * @since 1.0
     */
    public fun packEnd(child: Widget): Unit =
        adw_header_bar_pack_end(
            adwHeaderBarPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Adds @child to @self, packed with reference to the start of the @self.
     *
     * @param child the widget to be added to @self
     * @since 1.0
     */
    public fun packStart(child: Widget): Unit =
        adw_header_bar_pack_start(
            adwHeaderBarPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Removes a child from @self.
     *
     * The child must have been added with [method@HeaderBar.pack_start],
     * [method@HeaderBar.pack_end] or [property@HeaderBar:title-widget].
     *
     * @param child the child to remove
     * @since 1.0
     */
    public fun remove(child: Widget): Unit =
        adw_header_bar_remove(
            adwHeaderBarPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Sets the policy for aligning the center widget.
     *
     * @param centeringPolicy the centering policy
     * @since 1.0
     */
    public fun setCenteringPolicy(centeringPolicy: CenteringPolicy): Unit =
        adw_header_bar_set_centering_policy(
            adwHeaderBarPointer.reinterpret(),
            centeringPolicy.nativeValue
        )

    /**
     * Sets the decoration layout for @self.
     *
     * @param layout a decoration layout
     * @since 1.0
     */
    public fun setDecorationLayout(layout: String? = null): Unit =
        adw_header_bar_set_decoration_layout(adwHeaderBarPointer.reinterpret(), layout)

    /**
     * Sets whether to show title buttons at the end of @self.
     *
     * @param setting `TRUE` to show standard title buttons
     * @since 1.0
     */
    public fun setShowEndTitleButtons(setting: Boolean): Unit =
        adw_header_bar_set_show_end_title_buttons(
            adwHeaderBarPointer.reinterpret(),
            setting.asGBoolean()
        )

    /**
     * Sets whether to show title buttons at the start of @self.
     *
     * @param setting `TRUE` to show standard title buttons
     * @since 1.0
     */
    public fun setShowStartTitleButtons(setting: Boolean): Unit =
        adw_header_bar_set_show_start_title_buttons(
            adwHeaderBarPointer.reinterpret(),
            setting.asGBoolean()
        )

    /**
     * Sets the title widget for @self.
     *
     * @param titleWidget a widget to use for a title
     * @since 1.0
     */
    public fun setTitleWidget(titleWidget: Widget? = null): Unit =
        adw_header_bar_set_title_widget(
            adwHeaderBarPointer.reinterpret(),
            titleWidget?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<HeaderBar> {
        override val type: GeneratedClassKGType<HeaderBar> =
            GeneratedClassKGType(adw_header_bar_get_type()) { HeaderBar(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}
