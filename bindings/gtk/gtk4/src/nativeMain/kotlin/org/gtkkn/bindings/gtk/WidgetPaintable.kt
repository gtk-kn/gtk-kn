// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkWidgetPaintable
import org.gtkkn.native.gtk.gtk_widget_paintable_get_type
import org.gtkkn.native.gtk.gtk_widget_paintable_get_widget
import org.gtkkn.native.gtk.gtk_widget_paintable_new
import org.gtkkn.native.gtk.gtk_widget_paintable_set_widget

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
public open class WidgetPaintable(public val gtkWidgetPaintablePointer: CPointer<GtkWidgetPaintable>) :
    Object(gtkWidgetPaintablePointer.reinterpret()),
    Paintable,
    KGTyped {
    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = handle.reinterpret()

    /**
     * The observed widget or null if none.
     */
    public open var widget: Widget?
        /**
         * Returns the widget that is observed or null if none.
         *
         * @return the observed widget.
         */
        get() = gtk_widget_paintable_get_widget(gtkWidgetPaintablePointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the widget that should be observed.
         *
         * @param widget the widget to observe
         */
        set(widget) = gtk_widget_paintable_set_widget(gtkWidgetPaintablePointer, widget?.gtkWidgetPointer)

    /**
     * Creates a new widget paintable observing the given widget.
     *
     * @param widget a `GtkWidget`
     * @return a new `GtkWidgetPaintable`
     */
    public constructor(
        widget: Widget? = null,
    ) : this(gtk_widget_paintable_new(widget?.gtkWidgetPointer)!!.reinterpret())

    public companion object : TypeCompanion<WidgetPaintable> {
        override val type: GeneratedClassKGType<WidgetPaintable> =
            GeneratedClassKGType(getTypeOrNull("gtk_widget_paintable_get_type")!!) {
                WidgetPaintable(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of WidgetPaintable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_widget_paintable_get_type()
    }
}
