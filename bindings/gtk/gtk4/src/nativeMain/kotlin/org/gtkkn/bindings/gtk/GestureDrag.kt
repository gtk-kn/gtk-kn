// This is a generated file. Do not modify.
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
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkGestureDrag
import org.gtkkn.native.gtk.gtk_gesture_drag_get_type
import org.gtkkn.native.gtk.gtk_gesture_drag_new
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureDrag` is a `GtkGesture` implementation for drags.
 *
 * The drag operation itself can be tracked throughout the
 * [signal@Gtk.GestureDrag::drag-begin],
 * [signal@Gtk.GestureDrag::drag-update] and
 * [signal@Gtk.GestureDrag::drag-end] signals, and the relevant
 * coordinates can be extracted through
 * [method@Gtk.GestureDrag.get_offset] and
 * [method@Gtk.GestureDrag.get_start_point].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `x`: x: Out parameter is not supported
 */
public open class GestureDrag(public val gtkGestureDragPointer: CPointer<GtkGestureDrag>) :
    GestureSingle(gtkGestureDragPointer.reinterpret()),
    KGTyped {
    /**
     * Returns a newly created `GtkGesture` that recognizes drags.
     *
     * @return a newly created `GtkGestureDrag`
     */
    public constructor() : this(gtk_gesture_drag_new()!!.reinterpret())

    /**
     * Emitted whenever dragging starts.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `startX` X coordinate, relative to the widget allocation; `startY` Y coordinate, relative to the widget allocation
     */
    public fun onDragBegin(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (startX: gdouble, startY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureDragPointer,
        "drag-begin",
        onDragBeginFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "drag-begin" signal. See [onDragBegin].
     *
     * @param startX X coordinate, relative to the widget allocation
     * @param startY Y coordinate, relative to the widget allocation
     */
    public fun emitDragBegin(startX: gdouble, startY: gdouble) {
        g_signal_emit_by_name(gtkGestureDragPointer.reinterpret(), "drag-begin", startX, startY)
    }

    /**
     * Emitted whenever the dragging is finished.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offsetX` X offset, relative to the start point; `offsetY` Y offset, relative to the start point
     */
    public fun onDragEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offsetX: gdouble, offsetY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureDragPointer,
        "drag-end",
        onDragEndFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "drag-end" signal. See [onDragEnd].
     *
     * @param offsetX X offset, relative to the start point
     * @param offsetY Y offset, relative to the start point
     */
    public fun emitDragEnd(offsetX: gdouble, offsetY: gdouble) {
        g_signal_emit_by_name(gtkGestureDragPointer.reinterpret(), "drag-end", offsetX, offsetY)
    }

    /**
     * Emitted whenever the dragging point moves.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offsetX` X offset, relative to the start point; `offsetY` Y offset, relative to the start point
     */
    public fun onDragUpdate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offsetX: gdouble, offsetY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureDragPointer,
        "drag-update",
        onDragUpdateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "drag-update" signal. See [onDragUpdate].
     *
     * @param offsetX X offset, relative to the start point
     * @param offsetY Y offset, relative to the start point
     */
    public fun emitDragUpdate(offsetX: gdouble, offsetY: gdouble) {
        g_signal_emit_by_name(gtkGestureDragPointer.reinterpret(), "drag-update", offsetX, offsetY)
    }

    public companion object : TypeCompanion<GestureDrag> {
        override val type: GeneratedClassKGType<GestureDrag> =
            GeneratedClassKGType(gtk_gesture_drag_get_type()) { GestureDrag(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureDrag
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_drag_get_type()
    }
}

private val onDragBeginFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        startX: gdouble,
        startY: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(startX: gdouble, startY: gdouble) -> Unit>().get().invoke(startX, startY)
}
    .reinterpret()

private val onDragEndFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        offsetX: gdouble,
        offsetY: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(offsetX: gdouble, offsetY: gdouble) -> Unit>().get().invoke(offsetX, offsetY)
}
    .reinterpret()

private val onDragUpdateFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        offsetX: gdouble,
        offsetY: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(offsetX: gdouble, offsetY: gdouble) -> Unit>().get().invoke(offsetX, offsetY)
}
    .reinterpret()
