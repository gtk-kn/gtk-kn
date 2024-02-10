// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkTouchpadGesturePhase
import org.gtkkn.native.gdk.GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_BEGIN
import org.gtkkn.native.gdk.GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_CANCEL
import org.gtkkn.native.gdk.GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_END
import org.gtkkn.native.gdk.GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_UPDATE

/**
 * Specifies the current state of a touchpad gesture.
 *
 * All gestures are guaranteed to begin with an event with phase
 * %GDK_TOUCHPAD_GESTURE_PHASE_BEGIN, followed by 0 or several events
 * with phase %GDK_TOUCHPAD_GESTURE_PHASE_UPDATE.
 *
 * A finished gesture may have 2 possible outcomes, an event with phase
 * %GDK_TOUCHPAD_GESTURE_PHASE_END will be emitted when the gesture is
 * considered successful, this should be used as the hint to perform any
 * permanent changes.
 *
 * Cancelled gestures may be so for a variety of reasons, due to hardware
 * or the compositor, or due to the gesture recognition layers hinting the
 * gesture did not finish resolutely (eg. a 3rd finger being added during
 * a pinch gesture). In these cases, the last event will report the phase
 * %GDK_TOUCHPAD_GESTURE_PHASE_CANCEL, this should be used as a hint
 * to undo any visible/permanent changes that were done throughout the
 * progress of the gesture.
 */
public enum class TouchpadGesturePhase(
    public val nativeValue: GdkTouchpadGesturePhase,
) {
    /**
     * The gesture has begun.
     */
    BEGIN(GDK_TOUCHPAD_GESTURE_PHASE_BEGIN),

    /**
     * The gesture has been updated.
     */
    UPDATE(GDK_TOUCHPAD_GESTURE_PHASE_UPDATE),

    /**
     * The gesture was finished, changes
     *   should be permanently applied.
     */
    END(GDK_TOUCHPAD_GESTURE_PHASE_END),

    /**
     * The gesture was cancelled, all
     *   changes should be undone.
     */
    CANCEL(GDK_TOUCHPAD_GESTURE_PHASE_CANCEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkTouchpadGesturePhase): TouchpadGesturePhase =
            when (nativeValue) {
                GDK_TOUCHPAD_GESTURE_PHASE_BEGIN -> BEGIN
                GDK_TOUCHPAD_GESTURE_PHASE_UPDATE -> UPDATE
                GDK_TOUCHPAD_GESTURE_PHASE_END -> END
                GDK_TOUCHPAD_GESTURE_PHASE_CANCEL -> CANCEL
                else -> error("invalid nativeValue")
            }
    }
}
