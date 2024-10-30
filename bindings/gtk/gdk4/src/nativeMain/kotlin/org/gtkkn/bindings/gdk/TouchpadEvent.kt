// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkTouchpadEvent
import org.gtkkn.native.gdk.gdk_touchpad_event_get_gesture_phase
import org.gtkkn.native.gdk.gdk_touchpad_event_get_n_fingers
import org.gtkkn.native.gdk.gdk_touchpad_event_get_pinch_angle_delta
import org.gtkkn.native.gdk.gdk_touchpad_event_get_pinch_scale
import org.gtkkn.native.gdk.gdk_touchpad_event_get_type
import kotlin.Double
import kotlin.UInt

/**
 * An event related to a gesture on a touchpad device.
 *
 * Unlike touchscreens, where the windowing system sends basic
 * sequences of begin, update, end events, and leaves gesture
 * recognition to the clients, touchpad gestures are typically
 * processed by the system, resulting in these events.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `dx`: dx: Out parameter is not supported
 */
public open class TouchpadEvent(
    pointer: CPointer<GdkTouchpadEvent>,
) : Event(pointer.reinterpret()),
    KGTyped {
    public val gdkTouchpadEventPointer: CPointer<GdkTouchpadEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts the touchpad gesture phase from a touchpad event.
     *
     * @return the gesture phase of @event
     */
    public open fun getGesturePhase(): TouchpadGesturePhase =
        gdk_touchpad_event_get_gesture_phase(gdkTouchpadEventPointer.reinterpret()).run {
            TouchpadGesturePhase.fromNativeValue(this)
        }

    /**
     * Extracts the number of fingers from a touchpad event.
     *
     * @return the number of fingers for @event
     */
    public open fun getNFingers(): UInt = gdk_touchpad_event_get_n_fingers(gdkTouchpadEventPointer.reinterpret())

    /**
     * Extracts the angle delta from a touchpad pinch event.
     *
     * @return the angle delta of @event
     */
    public open fun getPinchAngleDelta(): Double =
        gdk_touchpad_event_get_pinch_angle_delta(gdkTouchpadEventPointer.reinterpret())

    /**
     * Extracts the scale from a touchpad pinch event.
     *
     * @return the scale of @event
     */
    public open fun getPinchScale(): Double = gdk_touchpad_event_get_pinch_scale(gdkTouchpadEventPointer.reinterpret())

    public companion object : TypeCompanion<TouchpadEvent> {
        override val type: GeneratedClassKGType<TouchpadEvent> =
            GeneratedClassKGType(gdk_touchpad_event_get_type()) { TouchpadEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}