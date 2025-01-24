// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDrawingArea
import org.gtkkn.native.gtk.gtk_drawing_area_get_content_height
import org.gtkkn.native.gtk.gtk_drawing_area_get_content_width
import org.gtkkn.native.gtk.gtk_drawing_area_get_type
import org.gtkkn.native.gtk.gtk_drawing_area_new
import org.gtkkn.native.gtk.gtk_drawing_area_set_content_height
import org.gtkkn.native.gtk.gtk_drawing_area_set_content_width
import org.gtkkn.native.gtk.gtk_drawing_area_set_draw_func
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkDrawingArea` is a widget that allows drawing with cairo.
 *
 * ![An example GtkDrawingArea](drawingarea.png)
 *
 * It’s essentially a blank widget; you can draw on it. After
 * creating a drawing area, the application may want to connect to:
 *
 * - The [signal@Gtk.Widget::realize] signal to take any necessary actions
 *   when the widget is instantiated on a particular display.
 *   (Create GDK resources in response to this signal.)
 *
 * - The [signal@Gtk.DrawingArea::resize] signal to take any necessary
 *   actions when the widget changes size.
 *
 * - Call [method@Gtk.DrawingArea.set_draw_func] to handle redrawing the
 *   contents of the widget.
 *
 * The following code portion demonstrates using a drawing
 * area to display a circle in the normal widget foreground
 * color.
 *
 * ## Simple GtkDrawingArea usage
 *
 * ```c
 * static void
 * draw_function (GtkDrawingArea *area,
 *                cairo_t        *cr,
 *                int             width,
 *                int             height,
 *                gpointer        data)
 * {
 *   GdkRGBA color;
 *
 *   cairo_arc (cr,
 *              width / 2.0, height / 2.0,
 *              MIN (width, height) / 2.0,
 *              0, 2 * G_PI);
 *
 *   gtk_widget_get_color (GTK_WIDGET (area),
 *                         &color);
 *   gdk_cairo_set_source_rgba (cr, &color);
 *
 *   cairo_fill (cr);
 * }
 *
 * int
 * main (int argc, char **argv)
 * {
 *   gtk_init ();
 *
 *   GtkWidget *area = gtk_drawing_area_new ();
 *   gtk_drawing_area_set_content_width (GTK_DRAWING_AREA (area), 100);
 *   gtk_drawing_area_set_content_height (GTK_DRAWING_AREA (area), 100);
 *   gtk_drawing_area_set_draw_func (GTK_DRAWING_AREA (area),
 *                                   draw_function,
 *                                   NULL, NULL);
 *   return 0;
 * }
 * ```
 *
 * The draw function is normally called when a drawing area first comes
 * onscreen, or when it’s covered by another window and then uncovered.
 * You can also force a redraw by adding to the “damage region” of the
 * drawing area’s window using [method@Gtk.Widget.queue_draw].
 * This will cause the drawing area to call the draw function again.
 *
 * The available routines for drawing are documented in the
 * [Cairo documentation](https://www.cairographics.org/manual/); GDK
 * offers additional API to integrate with Cairo, like [func@Gdk.cairo_set_source_rgba]
 * or [func@Gdk.cairo_set_source_pixbuf].
 *
 * To receive mouse events on a drawing area, you will need to use
 * event controllers. To receive keyboard events, you will need to set
 * the “can-focus” property on the drawing area, and you should probably
 * draw some user-visible indication that the drawing area is focused.
 *
 * If you need more complex control over your widget, you should consider
 * creating your own `GtkWidget` subclass.
 */
public open class DrawingArea(public val gtkDrawingAreaPointer: CPointer<GtkDrawingArea>) :
    Widget(gtkDrawingAreaPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The content height.
     */
    public open var contentHeight: gint
        /**
         * Retrieves the content height of the `GtkDrawingArea`.
         *
         * @return The height requested for content of the drawing area
         */
        get() = gtk_drawing_area_get_content_height(gtkDrawingAreaPointer)

        /**
         * Sets the desired height of the contents of the drawing area.
         *
         * Note that because widgets may be allocated larger sizes than they
         * requested, it is possible that the actual height passed to your draw
         * function is larger than the height set here. You can use
         * [method@Gtk.Widget.set_valign] to avoid that.
         *
         * If the height is set to 0 (the default), the drawing area may disappear.
         *
         * @param height the height of contents
         */
        set(height) = gtk_drawing_area_set_content_height(gtkDrawingAreaPointer, height)

    /**
     * The content width.
     */
    public open var contentWidth: gint
        /**
         * Retrieves the content width of the `GtkDrawingArea`.
         *
         * @return The width requested for content of the drawing area
         */
        get() = gtk_drawing_area_get_content_width(gtkDrawingAreaPointer)

        /**
         * Sets the desired width of the contents of the drawing area.
         *
         * Note that because widgets may be allocated larger sizes than they
         * requested, it is possible that the actual width passed to your draw
         * function is larger than the width set here. You can use
         * [method@Gtk.Widget.set_halign] to avoid that.
         *
         * If the width is set to 0 (the default), the drawing area may disappear.
         *
         * @param width the width of contents
         */
        set(width) = gtk_drawing_area_set_content_width(gtkDrawingAreaPointer, width)

    /**
     * Creates a new drawing area.
     *
     * @return a new `GtkDrawingArea`
     */
    public constructor() : this(gtk_drawing_area_new()!!.reinterpret())

    /**
     * Setting a draw function is the main thing you want to do when using
     * a drawing area.
     *
     * The draw function is called whenever GTK needs to draw the contents
     * of the drawing area to the screen.
     *
     * The draw function will be called during the drawing stage of GTK.
     * In the drawing stage it is not allowed to change properties of any
     * GTK widgets or call any functions that would cause any properties
     * to be changed. You should restrict yourself exclusively to drawing
     * your contents in the draw function.
     *
     * If what you are drawing does change, call [method@Gtk.Widget.queue_draw]
     * on the drawing area. This will cause a redraw and will call @draw_func again.
     *
     * @param drawFunc callback that lets you draw
     *   the drawing area's contents
     */
    public open fun setDrawFunc(drawFunc: DrawingAreaDrawFunc?): Unit = gtk_drawing_area_set_draw_func(
        gtkDrawingAreaPointer,
        drawFunc?.let {
            DrawingAreaDrawFuncFunc.reinterpret()
        },
        drawFunc?.let {
            StableRef.create(drawFunc).asCPointer()
        },
        drawFunc?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Emitted once when the widget is realized, and then each time the widget
     * is changed while realized.
     *
     * This is useful in order to keep state up to date with the widget size,
     * like for instance a backing surface.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `width` the width of the viewport; `height` the height of the viewport
     */
    public fun onResize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (width: gint, height: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkDrawingAreaPointer,
        "resize",
        onResizeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "resize" signal. See [onResize].
     *
     * @param width the width of the viewport
     * @param height the height of the viewport
     */
    public fun emitResize(width: gint, height: gint) {
        g_signal_emit_by_name(gtkDrawingAreaPointer.reinterpret(), "resize", width, height)
    }

    public companion object : TypeCompanion<DrawingArea> {
        override val type: GeneratedClassKGType<DrawingArea> =
            GeneratedClassKGType(gtk_drawing_area_get_type()) { DrawingArea(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of DrawingArea
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_drawing_area_get_type()
    }
}

private val onResizeFunc: CPointer<CFunction<(gint, gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        width: gint,
        height: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(width: gint, height: gint) -> Unit>().get().invoke(width, height)
}
    .reinterpret()
