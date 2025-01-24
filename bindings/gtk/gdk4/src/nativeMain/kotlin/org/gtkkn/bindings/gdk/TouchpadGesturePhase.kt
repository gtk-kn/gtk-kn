// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkTouchpadGesturePhase
import org.gtkkn.native.gdk.gdk_touchpad_gesture_phase_get_type
import org.gtkkn.native.gobject.GType

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
public enum class TouchpadGesturePhase(public val nativeValue: GdkTouchpadGesturePhase) {
    /**
     * The gesture has begun.
     */
    BEGIN(GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_BEGIN),

    /**
     * The gesture has been updated.
     */
    UPDATE(GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_UPDATE),

    /**
     * The gesture was finished, changes
     *   should be permanently applied.
     */
    END(GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_END),

    /**
     * The gesture was cancelled, all
     *   changes should be undone.
     */
    CANCEL(GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_CANCEL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkTouchpadGesturePhase): TouchpadGesturePhase = when (nativeValue) {
            GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_BEGIN -> BEGIN
            GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_UPDATE -> UPDATE
            GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_END -> END
            GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_CANCEL -> CANCEL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TouchpadGesturePhase
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_touchpad_gesture_phase_get_type()
    }
}
