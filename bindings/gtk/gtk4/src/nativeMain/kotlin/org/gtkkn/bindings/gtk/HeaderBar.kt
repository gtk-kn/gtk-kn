// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkHeaderBar
import org.gtkkn.native.gtk.gtk_header_bar_get_decoration_layout
import org.gtkkn.native.gtk.gtk_header_bar_get_show_title_buttons
import org.gtkkn.native.gtk.gtk_header_bar_get_title_widget
import org.gtkkn.native.gtk.gtk_header_bar_get_type
import org.gtkkn.native.gtk.gtk_header_bar_new
import org.gtkkn.native.gtk.gtk_header_bar_pack_end
import org.gtkkn.native.gtk.gtk_header_bar_pack_start
import org.gtkkn.native.gtk.gtk_header_bar_remove
import org.gtkkn.native.gtk.gtk_header_bar_set_decoration_layout
import org.gtkkn.native.gtk.gtk_header_bar_set_show_title_buttons
import org.gtkkn.native.gtk.gtk_header_bar_set_title_widget
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkHeaderBar` is a widget for creating custom title bars for windows.
 *
 * ![An example GtkHeaderBar](headerbar.png)
 *
 * `GtkHeaderBar` is similar to a horizontal `GtkCenterBox`. It allows
 * children to be placed at the start or the end. In addition, it allows
 * the window title to be displayed. The title will be centered with respect
 * to the width of the box, even if the children at either side take up
 * different amounts of space.
 *
 * `GtkHeaderBar` can add typical window frame controls, such as minimize,
 * maximize and close buttons, or the window icon.
 *
 * For these reasons, `GtkHeaderBar` is the natural choice for use as the
 * custom titlebar widget of a `GtkWindow` (see [method@Gtk.Window.set_titlebar]),
 * as it gives features typical of titlebars while allowing the addition of
 * child widgets.
 *
 * ## GtkHeaderBar as GtkBuildable
 *
 * The `GtkHeaderBar` implementation of the `GtkBuildable` interface supports
 * adding children at the start or end sides by specifying “start” or “end” as
 * the “type” attribute of a `<child>` element, or setting the title widget by
 * specifying “title” value.
 *
 * By default the `GtkHeaderBar` uses a `GtkLabel` displaying the title of the
 * window it is contained in as the title widget, equivalent to the following
 * UI definition:
 *
 * ```xml
 * <object class="GtkHeaderBar">
 *   <property name="title-widget">
 *     <object class="GtkLabel">
 *       <property name="label" translatable="yes">Label</property>
 *       <property name="single-line-mode">True</property>
 *       <property name="ellipsize">end</property>
 *       <property name="width-chars">5</property>
 *       <style>
 *         <class name="title"/>
 *       </style>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * # CSS nodes
 *
 * ```
 * headerbar
 * ╰── windowhandle
 *     ╰── box
 *         ├── box.start
 *         │   ├── windowcontrols.start
 *         │   ╰── [other children]
 *         ├── [Title Widget]
 *         ╰── box.end
 *             ├── [other children]
 *             ╰── windowcontrols.end
 * ```
 *
 * A `GtkHeaderBar`'s CSS node is called `headerbar`. It contains a `windowhandle`
 * subnode, which contains a `box` subnode, which contains two `box` subnodes at
 * the start and end of the header bar, as well as a center node that represents
 * the title.
 *
 * Each of the boxes contains a `windowcontrols` subnode, see
 * [class@Gtk.WindowControls] for details, as well as other children.
 *
 * # Accessibility
 *
 * `GtkHeaderBar` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public open class HeaderBar(public val gtkHeaderBarPointer: CPointer<GtkHeaderBar>) :
    Widget(gtkHeaderBarPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The decoration layout for buttons.
     *
     * If this property is not set, the
     * [property@Gtk.Settings:gtk-decoration-layout] setting is used.
     */
    public open var decorationLayout: String?
        /**
         * Gets the decoration layout of the `GtkHeaderBar`.
         *
         * @return the decoration layout
         */
        get() = gtk_header_bar_get_decoration_layout(gtkHeaderBarPointer)?.toKString()

        /**
         * Sets the decoration layout for this header bar.
         *
         * This property overrides the
         * [property@Gtk.Settings:gtk-decoration-layout] setting.
         *
         * There can be valid reasons for overriding the setting, such
         * as a header bar design that does not allow for buttons to take
         * room on the right, or only offers room for a single close button.
         * Split header bars are another example for overriding the setting.
         *
         * The format of the string is button names, separated by commas.
         * A colon separates the buttons that should appear on the left
         * from those on the right. Recognized button names are minimize,
         * maximize, close and icon (the window icon).
         *
         * For example, “icon:minimize,maximize,close” specifies an icon
         * on the left, and minimize, maximize and close buttons on the right.
         *
         * @param layout a decoration layout, or null to unset the layout
         */
        set(layout) = gtk_header_bar_set_decoration_layout(gtkHeaderBarPointer, layout)

    /**
     * Whether to show title buttons like close, minimize, maximize.
     *
     * Which buttons are actually shown and where is determined
     * by the [property@Gtk.HeaderBar:decoration-layout] property,
     * and by the state of the window (e.g. a close button will not
     * be shown if the window can't be closed).
     */
    public open var showTitleButtons: Boolean
        /**
         * Returns whether this header bar shows the standard window
         * title buttons.
         *
         * @return true if title buttons are shown
         */
        get() = gtk_header_bar_get_show_title_buttons(gtkHeaderBarPointer).asBoolean()

        /**
         * Sets whether this header bar shows the standard window
         * title buttons.
         *
         * @param setting true to show standard title buttons
         */
        set(setting) = gtk_header_bar_set_show_title_buttons(gtkHeaderBarPointer, setting.asGBoolean())

    public open var titleWidget: Widget?
        /**
         * Retrieves the title widget of the header.
         *
         * See [method@Gtk.HeaderBar.set_title_widget].
         *
         * @return the title widget of the header
         */
        get() = gtk_header_bar_get_title_widget(gtkHeaderBarPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the title for the `GtkHeaderBar`.
         *
         * When set to null, the headerbar will display the title of
         * the window it is contained in.
         *
         * The title should help a user identify the current view.
         * To achieve the same style as the builtin title, use the
         * “title” style class.
         *
         * You should set the title widget to null, for the window
         * title label to be visible again.
         *
         * @param titleWidget a widget to use for a title
         */
        set(titleWidget) = gtk_header_bar_set_title_widget(gtkHeaderBarPointer, titleWidget?.gtkWidgetPointer)

    /**
     * Creates a new `GtkHeaderBar` widget.
     *
     * @return a new `GtkHeaderBar`
     */
    public constructor() : this(gtk_header_bar_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds @child to @bar, packed with reference to the
     * end of the @bar.
     *
     * @param child the `GtkWidget` to be added to @bar
     */
    public open fun packEnd(child: Widget): Unit = gtk_header_bar_pack_end(gtkHeaderBarPointer, child.gtkWidgetPointer)

    /**
     * Adds @child to @bar, packed with reference to the
     * start of the @bar.
     *
     * @param child the `GtkWidget` to be added to @bar
     */
    public open fun packStart(child: Widget): Unit =
        gtk_header_bar_pack_start(gtkHeaderBarPointer, child.gtkWidgetPointer)

    /**
     * Removes a child from the `GtkHeaderBar`.
     *
     * The child must have been added with
     * [method@Gtk.HeaderBar.pack_start],
     * [method@Gtk.HeaderBar.pack_end] or
     * [method@Gtk.HeaderBar.set_title_widget].
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit = gtk_header_bar_remove(gtkHeaderBarPointer, child.gtkWidgetPointer)

    public companion object : TypeCompanion<HeaderBar> {
        override val type: GeneratedClassKGType<HeaderBar> =
            GeneratedClassKGType(getTypeOrNull()!!) { HeaderBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of HeaderBar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_header_bar_get_type()

        /**
         * Gets the GType of from the symbol `gtk_header_bar_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_header_bar_get_type")
    }
}
