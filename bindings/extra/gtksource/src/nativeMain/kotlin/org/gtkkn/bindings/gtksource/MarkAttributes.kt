// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Pixbuf
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtksource.GtkSourceMark
import org.gtkkn.native.gtksource.GtkSourceMarkAttributes
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_background
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_gicon
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_icon_name
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_pixbuf
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_tooltip_markup
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_tooltip_text
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_get_type
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_new
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_render_icon
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_set_background
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_set_gicon
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_set_icon_name
import org.gtkkn.native.gtksource.gtk_source_mark_attributes_set_pixbuf
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The source mark attributes object.
 *
 * `GtkSourceMarkAttributes` is an object specifying attributes used by
 * a [class@View] to visually show lines marked with [class@Mark]s
 * of a specific category. It allows you to define a background color of a line,
 * an icon shown in gutter and tooltips.
 *
 * The background color is used as a background of a line where a mark is placed
 * and it can be set with [method@MarkAttributes.set_background]. To check
 * if any custom background color was defined and what color it is, use
 * [method@MarkAttributes.get_background].
 *
 * An icon is a graphic element which is shown in the gutter of a view. An
 * example use is showing a red filled circle in a debugger to show that a
 * breakpoint was set in certain line. To get an icon that will be placed in
 * a gutter, first a base for it must be specified and then
 * [method@MarkAttributes.render_icon] must be called.
 * There are several ways to specify a base for an icon:
 *
 * - [method@MarkAttributes.set_icon_name]
 * - [method@MarkAttributes.set_gicon]
 * - [method@MarkAttributes.set_pixbuf]
 *
 * Using any of the above functions overrides the one used earlier. But note
 * that a getter counterpart of earlier used function can still return some
 * value, but it is just not used when rendering the proper icon.
 *
 * To provide meaningful tooltips for a given mark of a category, you should
 * connect to [signal@MarkAttributes::query-tooltip-text] or
 * [signal@MarkAttributes::query-tooltip-markup] where the latter
 * takes precedence.
 *
 * ## Skipped during bindings generation
 *
 * - method `background`: Property has no getter
 */
public open class MarkAttributes(public val gtksourceMarkAttributesPointer: CPointer<GtkSourceMarkAttributes>) :
    Object(gtksourceMarkAttributesPointer.reinterpret()),
    KGTyped {
    /**
     * A #GIcon that may be a base of a rendered icon.
     */
    public open var gicon: Icon
        /**
         * Gets a [iface@Gio.Icon] to be used as a base for rendered icon.
         *
         * Note that the icon can be null if it wasn't set earlier.
         *
         * @return An icon. The icon belongs to @attributes and should
         * not be unreffed.
         */
        get() = gtk_source_mark_attributes_get_gicon(gtksourceMarkAttributesPointer)!!.run {
            Icon.IconImpl(reinterpret())
        }

        /**
         * Sets an icon to be used as a base for rendered icon.
         *
         * @param gicon a #GIcon to be used.
         */
        set(gicon) = gtk_source_mark_attributes_set_gicon(gtksourceMarkAttributesPointer, gicon.gioIconPointer)

    /**
     * An icon name that may be a base of a rendered icon.
     */
    public open var iconName: String
        /**
         * Gets a name of an icon to be used as a base for rendered icon.
         *
         * Note that the icon name can be null if it wasn't set earlier.
         *
         * @return An icon name. The string belongs to @attributes and
         * should not be freed.
         */
        get() = gtk_source_mark_attributes_get_icon_name(gtksourceMarkAttributesPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets a name of an icon to be used as a base for rendered icon.
         *
         * @param iconName name of an icon to be used.
         */
        set(iconName) = gtk_source_mark_attributes_set_icon_name(gtksourceMarkAttributesPointer, iconName)

    /**
     * A #GdkPixbuf that may be a base of a rendered icon.
     */
    public open var pixbuf: Pixbuf
        /**
         * Gets a [class@GdkPixbuf.Pixbuf] to be used as a base for rendered icon.
         *
         * Note that the pixbuf can be null if it wasn't set earlier.
         *
         * @return A pixbuf. The pixbuf belongs to @attributes and
         * should not be unreffed.
         */
        get() = gtk_source_mark_attributes_get_pixbuf(gtksourceMarkAttributesPointer)!!.run {
            Pixbuf(this)
        }

        /**
         * Sets a pixbuf to be used as a base for rendered icon.
         *
         * @param pixbuf a #GdkPixbuf to be used.
         */
        set(pixbuf) = gtk_source_mark_attributes_set_pixbuf(gtksourceMarkAttributesPointer, pixbuf.gdkPixbufPointer)

    /**
     * Creates a new source mark attributes.
     *
     * @return a new source mark attributes.
     */
    public constructor() : this(gtk_source_mark_attributes_new()!!.reinterpret())

    /**
     * Stores background color in @background.
     *
     * @param background a #GdkRGBA.
     * @return whether background color for @attributes was set.
     */
    public open fun getBackground(background: Rgba): Boolean =
        gtk_source_mark_attributes_get_background(gtksourceMarkAttributesPointer, background.gdkRgbaPointer).asBoolean()

    /**
     * Queries for a tooltip by emitting a [signal@MarkAttributes::query-tooltip-markup] signal.
     *
     * The tooltip may contain a markup.
     *
     * @param mark a #GtkSourceMark.
     * @return A tooltip. The returned string should be freed by
     * using g_free() when done with it.
     */
    public open fun getTooltipMarkup(mark: Mark): String = gtk_source_mark_attributes_get_tooltip_markup(
        gtksourceMarkAttributesPointer,
        mark.gtksourceMarkPointer
    )?.toKString()
        ?: error("Expected not null string")

    /**
     * Queries for a tooltip by emitting a [signal@MarkAttributes::query-tooltip-text] signal.
     *
     * The tooltip is a plain text.
     *
     * @param mark a #GtkSourceMark.
     * @return A tooltip. The returned string should be freed by
     * using g_free() when done with it.
     */
    public open fun getTooltipText(mark: Mark): String = gtk_source_mark_attributes_get_tooltip_text(
        gtksourceMarkAttributesPointer,
        mark.gtksourceMarkPointer
    )?.toKString()
        ?: error("Expected not null string")

    /**
     * Renders an icon of given size.
     *
     * The base of the icon is set by the last call to one of:
     *
     * - [method@MarkAttributes.set_pixbuf]
     * - [method@MarkAttributes.set_gicon]
     * - [method@MarkAttributes.set_icon_name]
     *
     * @size cannot be lower than 1.
     *
     * @param widget widget of which style settings may be used.
     * @param size size of the rendered icon.
     * @return A #GdkPaintable. The paintable belongs to @attributes
     * and should not be unreffed.
     */
    public open fun renderIcon(widget: Widget, size: gint): Paintable =
        gtk_source_mark_attributes_render_icon(gtksourceMarkAttributesPointer, widget.gtkWidgetPointer, size)!!.run {
            Paintable.PaintableImpl(reinterpret())
        }

    /**
     * Sets background color to the one given in @background.
     *
     * @param background a #GdkRGBA.
     */
    public open fun setBackground(background: Rgba): Unit =
        gtk_source_mark_attributes_set_background(gtksourceMarkAttributesPointer, background.gdkRgbaPointer)

    /**
     * The code should connect to this signal to provide a tooltip for given
     * @mark. The tooltip can contain a markup.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mark` The #GtkSourceMark.. Returns A tooltip. The string should be freed with
     * g_free() when done with it.
     */
    public fun onQueryTooltipMarkup(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mark: Mark) -> String,
    ): ULong = g_signal_connect_data(
        gtksourceMarkAttributesPointer,
        "query-tooltip-markup",
        onQueryTooltipMarkupFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The code should connect to this signal to provide a tooltip for given
     * @mark. The tooltip should be just a plain text.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mark` The #GtkSourceMark.. Returns A tooltip. The string should be freed with
     * g_free() when done with it.
     */
    public fun onQueryTooltipText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mark: Mark) -> String,
    ): ULong = g_signal_connect_data(
        gtksourceMarkAttributesPointer,
        "query-tooltip-text",
        onQueryTooltipTextFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<MarkAttributes> {
        override val type: GeneratedClassKGType<MarkAttributes> =
            GeneratedClassKGType(gtk_source_mark_attributes_get_type()) { MarkAttributes(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of MarkAttributes
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_mark_attributes_get_type()
    }
}

private val onQueryTooltipMarkupFunc:
    CPointer<CFunction<(CPointer<GtkSourceMark>) -> CPointer<ByteVar>>> = staticCFunction {
            _: COpaquePointer,
            mark: CPointer<GtkSourceMark>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mark: Mark) -> String>().get().invoke(
            mark!!.run {
                Mark(this)
            }
        ).let { g_strdup(it) }
    }
        .reinterpret()

private val onQueryTooltipTextFunc:
    CPointer<CFunction<(CPointer<GtkSourceMark>) -> CPointer<ByteVar>>> = staticCFunction {
            _: COpaquePointer,
            mark: CPointer<GtkSourceMark>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mark: Mark) -> String>().get().invoke(
            mark!!.run {
                Mark(this)
            }
        ).let { g_strdup(it) }
    }
        .reinterpret()
