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
import org.gtkkn.native.gtk.GtkGestureRotate
import org.gtkkn.native.gtk.gtk_gesture_rotate_get_angle_delta
import org.gtkkn.native.gtk.gtk_gesture_rotate_get_type
import org.gtkkn.native.gtk.gtk_gesture_rotate_new
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureRotate` is a `GtkGesture` for 2-finger rotations.
 *
 * Whenever the angle between both handled sequences changes, the
 * [signal@Gtk.GestureRotate::angle-changed] signal is emitted.
 */
public open class GestureRotate(
    pointer: CPointer<GtkGestureRotate>,
) : Gesture(pointer.reinterpret()),
    KGTyped {
    public val gtkGestureRotatePointer: CPointer<GtkGestureRotate>
        get() = gPointer.reinterpret()

    /**
     * Returns a newly created `GtkGesture` that recognizes 2-touch
     * rotation gestures.
     *
     * @return a newly created `GtkGestureRotate`
     */
    public constructor() : this(gtk_gesture_rotate_new()!!.reinterpret())

    /**
     * Gets the angle delta in radians.
     *
     * If @gesture is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If @gesture is
     * not active, 0 is returned.
     *
     * @return the angle delta in radians
     */
    public open fun getAngleDelta(): Double = gtk_gesture_rotate_get_angle_delta(gtkGestureRotatePointer.reinterpret())

    /**
     * Emitted when the angle between both tracked points changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `angle` Current angle in radians; `angleDelta` Difference with the starting angle, in radians
     */
    public fun connectAngleChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (angle: Double, angleDelta: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "angle-changed",
            connectAngleChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<GestureRotate> {
        override val type: GeneratedClassKGType<GestureRotate> =
            GeneratedClassKGType(gtk_gesture_rotate_get_type()) { GestureRotate(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectAngleChangedFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            angle: Double,
            angleDelta: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(angle: Double, angleDelta: Double) -> Unit>().get().invoke(angle, angleDelta)
    }.reinterpret()
