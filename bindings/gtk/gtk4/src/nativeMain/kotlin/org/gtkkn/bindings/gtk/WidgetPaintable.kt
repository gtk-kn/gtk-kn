// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gtk.GtkWidgetPaintable
import org.gtkkn.native.gtk.gtk_widget_paintable_get_type
import org.gtkkn.native.gtk.gtk_widget_paintable_get_widget
import org.gtkkn.native.gtk.gtk_widget_paintable_new
import org.gtkkn.native.gtk.gtk_widget_paintable_set_widget
import kotlin.Unit

/**
 * `GtkWidgetPaintable` is a `GdkPaintable` that displays the contents
 * of a widget.
 *
 * `GtkWidgetPaintable` will also take care of the widget not being in a
 * state where it can be drawn (like when it isn't shown) and just draw
 * nothing or where it does not have a size (like when it is hidden) and
 * report no size in that case.
 *
 * Of course, `GtkWidgetPaintable` allows you to monitor widgets for size
 * changes by emitting the [signal@Gdk.Paintable::invalidate-size] signal
 * whenever the size of the widget changes as well as for visual changes by
 * emitting the [signal@Gdk.Paintable::invalidate-contents] signal whenever
 * the widget changes.
 *
 * You can use a `GtkWidgetPaintable` everywhere a `GdkPaintable` is allowed,
 * including using it on a `GtkPicture` (or one of its parents) that it was
 * set on itself via gtk_picture_set_paintable(). The paintable will take care
 * of recursion when this happens. If you do this however, ensure that the
 * [property@Gtk.Picture:can-shrink] property is set to true or you might
 * end up with an infinitely growing widget.
 */
public open class WidgetPaintable(
    pointer: CPointer<GtkWidgetPaintable>,
) : Object(pointer.reinterpret()), Paintable, KGTyped {
    public val gtkWidgetPaintablePointer: CPointer<GtkWidgetPaintable>
        get() = gPointer.reinterpret()

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = gPointer.reinterpret()

    /**
     * The observed widget or null if none.
     */
    public open var widget: Widget?
        /**
         * Returns the widget that is observed or null if none.
         *
         * @return the observed widget.
         */
        get() =
            gtk_widget_paintable_get_widget(gtkWidgetPaintablePointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the widget that should be observed.
         *
         * @param widget the widget to observe
         */
        set(widget) =
            gtk_widget_paintable_set_widget(
                gtkWidgetPaintablePointer.reinterpret(),
                widget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new widget paintable observing the given widget.
     *
     * @param widget a `GtkWidget`
     * @return a new `GtkWidgetPaintable`
     */
    public constructor(widget: Widget? = null) :
        this(gtk_widget_paintable_new(widget?.gtkWidgetPointer?.reinterpret())!!.reinterpret())

    /**
     * Returns the widget that is observed or null if none.
     *
     * @return the observed widget.
     */
    public open fun getWidget(): Widget? =
        gtk_widget_paintable_get_widget(gtkWidgetPaintablePointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the widget that should be observed.
     *
     * @param widget the widget to observe
     */
    public open fun setWidget(widget: Widget? = null): Unit =
        gtk_widget_paintable_set_widget(
            gtkWidgetPaintablePointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<WidgetPaintable> {
        override val type: GeneratedClassKGType<WidgetPaintable> =
            GeneratedClassKGType(gtk_widget_paintable_get_type()) {
                WidgetPaintable(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
