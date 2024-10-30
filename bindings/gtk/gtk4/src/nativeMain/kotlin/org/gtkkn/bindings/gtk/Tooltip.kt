// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkTooltip
import org.gtkkn.native.gtk.gtk_tooltip_get_type
import org.gtkkn.native.gtk.gtk_tooltip_set_custom
import org.gtkkn.native.gtk.gtk_tooltip_set_icon
import org.gtkkn.native.gtk.gtk_tooltip_set_icon_from_gicon
import org.gtkkn.native.gtk.gtk_tooltip_set_icon_from_icon_name
import org.gtkkn.native.gtk.gtk_tooltip_set_markup
import org.gtkkn.native.gtk.gtk_tooltip_set_text
import org.gtkkn.native.gtk.gtk_tooltip_set_tip_area
import kotlin.String
import kotlin.Unit

/**
 * `GtkTooltip` is an object representing a widget tooltip.
 *
 * Basic tooltips can be realized simply by using
 * [method@Gtk.Widget.set_tooltip_text] or
 * [method@Gtk.Widget.set_tooltip_markup] without
 * any explicit tooltip object.
 *
 * When you need a tooltip with a little more fancy contents,
 * like adding an image, or you want the tooltip to have different
 * contents per `GtkTreeView` row or cell, you will have to do a
 * little more work:
 *
 * - Set the [property@Gtk.Widget:has-tooltip] property to true.
 *   This will make GTK monitor the widget for motion and related events
 *   which are needed to determine when and where to show a tooltip.
 *
 * - Connect to the [signal@Gtk.Widget::query-tooltip] signal.
 *   This signal will be emitted when a tooltip is supposed to be shown.
 *   One of the arguments passed to the signal handler is a `GtkTooltip`
 *   object. This is the object that we are about to display as a tooltip,
 *   and can be manipulated in your callback using functions like
 *   [method@Gtk.Tooltip.set_icon]. There are functions for setting
 *   the tooltip’s markup, setting an image from a named icon, or even
 *   putting in a custom widget.
 *
 * - Return true from your ::query-tooltip handler. This causes the tooltip
 *   to be show. If you return false, it will not be shown.
 */
public open class Tooltip(
    pointer: CPointer<GtkTooltip>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkTooltipPointer: CPointer<GtkTooltip>
        get() = gPointer.reinterpret()

    /**
     * Replaces the widget packed into the tooltip with
     * @custom_widget. @custom_widget does not get destroyed when the tooltip goes
     * away.
     * By default a box with a `GtkImage` and `GtkLabel` is embedded in
     * the tooltip, which can be configured using gtk_tooltip_set_markup()
     * and gtk_tooltip_set_icon().
     *
     * @param customWidget a `GtkWidget`, or null to unset the old custom widget.
     */
    public open fun setCustom(customWidget: Widget? = null): Unit =
        gtk_tooltip_set_custom(gtkTooltipPointer.reinterpret(), customWidget?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * @paintable.  If @paintable is null, the image will be hidden.
     *
     * @param paintable a `GdkPaintable`
     */
    public open fun setIcon(paintable: Paintable? = null): Unit =
        gtk_tooltip_set_icon(gtkTooltipPointer.reinterpret(), paintable?.gdkPaintablePointer)

    /**
     * Sets the icon of the tooltip (which is in front of the text)
     * to be the icon indicated by @gicon with the size indicated
     * by @size. If @gicon is null, the image will be hidden.
     *
     * @param gicon a `GIcon` representing the icon
     */
    public open fun setIconFromGicon(gicon: Icon? = null): Unit =
        gtk_tooltip_set_icon_from_gicon(gtkTooltipPointer.reinterpret(), gicon?.gioIconPointer)

    /**
     * Sets the icon of the tooltip (which is in front of the text) to be
     * the icon indicated by @icon_name with the size indicated
     * by @size.  If @icon_name is null, the image will be hidden.
     *
     * @param iconName an icon name
     */
    public open fun setIconFromIconName(iconName: String? = null): Unit =
        gtk_tooltip_set_icon_from_icon_name(gtkTooltipPointer.reinterpret(), iconName)

    /**
     * Sets the text of the tooltip to be @markup.
     *
     * The string must be marked up with Pango markup.
     * If @markup is null, the label will be hidden.
     *
     * @param markup a string with Pango markup or %NLL
     */
    public open fun setMarkup(markup: String? = null): Unit =
        gtk_tooltip_set_markup(gtkTooltipPointer.reinterpret(), markup)

    /**
     * Sets the text of the tooltip to be @text.
     *
     * If @text is null, the label will be hidden.
     * See also [method@Gtk.Tooltip.set_markup].
     *
     * @param text a text string
     */
    public open fun setText(text: String? = null): Unit = gtk_tooltip_set_text(gtkTooltipPointer.reinterpret(), text)

    /**
     * Sets the area of the widget, where the contents of this tooltip apply,
     * to be @rect (in widget coordinates).  This is especially useful for
     * properly setting tooltips on `GtkTreeView` rows and cells, `GtkIconViews`,
     * etc.
     *
     * For setting tooltips on `GtkTreeView`, please refer to the convenience
     * functions for this: gtk_tree_view_set_tooltip_row() and
     * gtk_tree_view_set_tooltip_cell().
     *
     * @param rect a `GdkRectangle`
     */
    public open fun setTipArea(rect: Rectangle): Unit =
        gtk_tooltip_set_tip_area(gtkTooltipPointer.reinterpret(), rect.gdkRectanglePointer)

    public companion object : TypeCompanion<Tooltip> {
        override val type: GeneratedClassKGType<Tooltip> =
            GeneratedClassKGType(gtk_tooltip_get_type()) { Tooltip(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
