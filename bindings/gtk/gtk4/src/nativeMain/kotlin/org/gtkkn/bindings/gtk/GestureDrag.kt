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
public open class GestureDrag(pointer: CPointer<GtkGestureDrag>) :
    GestureSingle(pointer.reinterpret()),
    KGTyped {
    public val gtkGestureDragPointer: CPointer<GtkGestureDrag>
        get() = gPointer.reinterpret()

    /**
     * Returns a newly created `GtkGesture` that recognizes drags.
     *
     * @return a newly created `GtkGestureDrag`
     */
    public constructor() : this(gtk_gesture_drag_new()!!.reinterpret())

    /**
     * Emitted whenever dragging starts.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `startX` X coordinate, relative to the widget allocation; `startY` Y coordinate, relative to the widget allocation
     */
    public fun connectDragBegin(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (startX: gdouble, startY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "drag-begin",
        connectDragBeginFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted whenever the dragging is finished.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offsetX` X offset, relative to the start point; `offsetY` Y offset, relative to the start point
     */
    public fun connectDragEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offsetX: gdouble, offsetY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "drag-end",
        connectDragEndFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted whenever the dragging point moves.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `offsetX` X offset, relative to the start point; `offsetY` Y offset, relative to the start point
     */
    public fun connectDragUpdate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (offsetX: gdouble, offsetY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "drag-update",
        connectDragUpdateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

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

private val connectDragBeginFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            startX: gdouble,
            startY: gdouble,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(startX: gdouble, startY: gdouble) -> Unit>().get().invoke(startX, startY)
    }
        .reinterpret()

private val connectDragEndFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        offsetX: gdouble,
        offsetY: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(offsetX: gdouble, offsetY: gdouble) -> Unit>().get().invoke(offsetX, offsetY)
}
    .reinterpret()

private val connectDragUpdateFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            offsetX: gdouble,
            offsetY: gdouble,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(offsetX: gdouble, offsetY: gdouble) -> Unit>().get().invoke(offsetX, offsetY)
    }
        .reinterpret()
