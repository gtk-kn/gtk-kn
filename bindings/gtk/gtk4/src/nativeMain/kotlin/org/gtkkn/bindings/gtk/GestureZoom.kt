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
import org.gtkkn.native.gtk.GtkGestureZoom
import org.gtkkn.native.gtk.gtk_gesture_zoom_get_scale_delta
import org.gtkkn.native.gtk.gtk_gesture_zoom_get_type
import org.gtkkn.native.gtk.gtk_gesture_zoom_new
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureZoom` is a `GtkGesture` for 2-finger pinch/zoom gestures.
 *
 * Whenever the distance between both tracked sequences changes, the
 * [signal@Gtk.GestureZoom::scale-changed] signal is emitted to report
 * the scale factor.
 */
public open class GestureZoom(public val gtkGestureZoomPointer: CPointer<GtkGestureZoom>) :
    Gesture(gtkGestureZoomPointer.reinterpret()),
    KGTyped {
    /**
     * Returns a newly created `GtkGesture` that recognizes
     * pinch/zoom gestures.
     *
     * @return a newly created `GtkGestureZoom`
     */
    public constructor() : this(gtk_gesture_zoom_new()!!.reinterpret())

    /**
     * Gets the scale delta.
     *
     * If @gesture is active, this function returns the zooming
     * difference since the gesture was recognized (hence the
     * starting point is considered 1:1). If @gesture is not
     * active, 1 is returned.
     *
     * @return the scale delta
     */
    public open fun getScaleDelta(): gdouble = gtk_gesture_zoom_get_scale_delta(gtkGestureZoomPointer)

    /**
     * Emitted whenever the distance between both tracked sequences changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `scale` Scale delta, taking the initial state as 1:1
     */
    public fun onScaleChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (scale: gdouble) -> Unit): ULong =
        g_signal_connect_data(
            gtkGestureZoomPointer,
            "scale-changed",
            onScaleChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "scale-changed" signal. See [onScaleChanged].
     *
     * @param scale Scale delta, taking the initial state as 1:1
     */
    public fun emitScaleChanged(scale: gdouble) {
        g_signal_emit_by_name(gtkGestureZoomPointer.reinterpret(), "scale-changed", scale)
    }

    public companion object : TypeCompanion<GestureZoom> {
        override val type: GeneratedClassKGType<GestureZoom> =
            GeneratedClassKGType(gtk_gesture_zoom_get_type()) { GestureZoom(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureZoom
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_zoom_get_type()
    }
}

private val onScaleChangedFunc: CPointer<CFunction<(gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        scale: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(scale: gdouble) -> Unit>().get().invoke(scale)
}
    .reinterpret()
