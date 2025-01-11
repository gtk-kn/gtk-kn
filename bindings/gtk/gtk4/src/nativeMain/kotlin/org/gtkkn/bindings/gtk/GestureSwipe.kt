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
import org.gtkkn.native.gtk.GtkGestureSwipe
import org.gtkkn.native.gtk.gtk_gesture_swipe_get_type
import org.gtkkn.native.gtk.gtk_gesture_swipe_new
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureSwipe` is a `GtkGesture` for swipe gestures.
 *
 * After a press/move/.../move/release sequence happens, the
 * [signal@Gtk.GestureSwipe::swipe] signal will be emitted,
 * providing the velocity and directionality of the sequence
 * at the time it was lifted.
 *
 * If the velocity is desired in intermediate points,
 * [method@Gtk.GestureSwipe.get_velocity] can be called in a
 * [signal@Gtk.Gesture::update] handler.
 *
 * All velocities are reported in pixels/sec units.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `velocity_x`: velocity_x: Out parameter is not supported
 */
public open class GestureSwipe(public val gtkGestureSwipePointer: CPointer<GtkGestureSwipe>) :
    GestureSingle(gtkGestureSwipePointer.reinterpret()),
    KGTyped {
    /**
     * Returns a newly created `GtkGesture` that recognizes swipes.
     *
     * @return a newly created `GtkGestureSwipe`
     */
    public constructor() : this(gtk_gesture_swipe_new()!!.reinterpret())

    /**
     * Emitted when the recognized gesture is finished.
     *
     * Velocity and direction are a product of previously recorded events.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `velocityX` velocity in the X axis, in pixels/sec; `velocityY` velocity in the Y axis, in pixels/sec
     */
    public fun onSwipe(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (velocityX: gdouble, velocityY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureSwipePointer,
        "swipe",
        onSwipeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "swipe" signal. See [onSwipe].
     *
     * @param velocityX velocity in the X axis, in pixels/sec
     * @param velocityY velocity in the Y axis, in pixels/sec
     */
    public fun emitSwipe(velocityX: gdouble, velocityY: gdouble) {
        g_signal_emit_by_name(gtkGestureSwipePointer.reinterpret(), "swipe", velocityX, velocityY)
    }

    public companion object : TypeCompanion<GestureSwipe> {
        override val type: GeneratedClassKGType<GestureSwipe> =
            GeneratedClassKGType(gtk_gesture_swipe_get_type()) { GestureSwipe(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureSwipe
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_swipe_get_type()
    }
}

private val onSwipeFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        velocityX: gdouble,
        velocityY: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(velocityX: gdouble, velocityY: gdouble) -> Unit>().get().invoke(velocityX, velocityY)
}
    .reinterpret()
