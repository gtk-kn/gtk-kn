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
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkGestureSwipe
import org.gtkkn.native.gtk.gtk_gesture_swipe_get_type
import org.gtkkn.native.gtk.gtk_gesture_swipe_new
import kotlin.Double
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
public open class GestureSwipe(
    pointer: CPointer<GtkGestureSwipe>,
) : GestureSingle(pointer.reinterpret()),
    KGTyped {
    public val gtkGestureSwipePointer: CPointer<GtkGestureSwipe>
        get() = gPointer.reinterpret()

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `velocityX` velocity in the X axis, in pixels/sec; `velocityY` velocity in the Y axis, in pixels/sec
     */
    public fun connectSwipe(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (velocityX: Double, velocityY: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "swipe",
            connectSwipeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<GestureSwipe> {
        override val type: GeneratedClassKGType<GestureSwipe> =
            GeneratedClassKGType(gtk_gesture_swipe_get_type()) { GestureSwipe(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectSwipeFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            velocityX: Double,
            velocityY: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(velocityX: Double, velocityY: Double) -> Unit>().get().invoke(velocityX, velocityY)
    }.reinterpret()
