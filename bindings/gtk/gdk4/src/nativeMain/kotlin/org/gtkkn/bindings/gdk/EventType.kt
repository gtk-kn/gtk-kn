// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkEventType
import org.gtkkn.native.gdk.GdkEventType.GDK_BUTTON_PRESS
import org.gtkkn.native.gdk.GdkEventType.GDK_BUTTON_RELEASE
import org.gtkkn.native.gdk.GdkEventType.GDK_DELETE
import org.gtkkn.native.gdk.GdkEventType.GDK_DRAG_ENTER
import org.gtkkn.native.gdk.GdkEventType.GDK_DRAG_LEAVE
import org.gtkkn.native.gdk.GdkEventType.GDK_DRAG_MOTION
import org.gtkkn.native.gdk.GdkEventType.GDK_DROP_START
import org.gtkkn.native.gdk.GdkEventType.GDK_ENTER_NOTIFY
import org.gtkkn.native.gdk.GdkEventType.GDK_EVENT_LAST
import org.gtkkn.native.gdk.GdkEventType.GDK_FOCUS_CHANGE
import org.gtkkn.native.gdk.GdkEventType.GDK_GRAB_BROKEN
import org.gtkkn.native.gdk.GdkEventType.GDK_KEY_PRESS
import org.gtkkn.native.gdk.GdkEventType.GDK_KEY_RELEASE
import org.gtkkn.native.gdk.GdkEventType.GDK_LEAVE_NOTIFY
import org.gtkkn.native.gdk.GdkEventType.GDK_MOTION_NOTIFY
import org.gtkkn.native.gdk.GdkEventType.GDK_PAD_BUTTON_PRESS
import org.gtkkn.native.gdk.GdkEventType.GDK_PAD_BUTTON_RELEASE
import org.gtkkn.native.gdk.GdkEventType.GDK_PAD_GROUP_MODE
import org.gtkkn.native.gdk.GdkEventType.GDK_PAD_RING
import org.gtkkn.native.gdk.GdkEventType.GDK_PAD_STRIP
import org.gtkkn.native.gdk.GdkEventType.GDK_PROXIMITY_IN
import org.gtkkn.native.gdk.GdkEventType.GDK_PROXIMITY_OUT
import org.gtkkn.native.gdk.GdkEventType.GDK_SCROLL
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCHPAD_HOLD
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCHPAD_PINCH
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCHPAD_SWIPE
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCH_BEGIN
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCH_CANCEL
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCH_END
import org.gtkkn.native.gdk.GdkEventType.GDK_TOUCH_UPDATE

/**
 * Specifies the type of the event.
 */
public enum class EventType(
    public val nativeValue: GdkEventType,
) {
    /**
     * the window manager has requested that the toplevel surface be
     *   hidden or destroyed, usually when the user clicks on a special icon in the
     *   title bar.
     */
    DELETE(GDK_DELETE),

    /**
     * the pointer (usually a mouse) has moved.
     */
    MOTION_NOTIFY(GDK_MOTION_NOTIFY),

    /**
     * a mouse button has been pressed.
     */
    BUTTON_PRESS(GDK_BUTTON_PRESS),

    /**
     * a mouse button has been released.
     */
    BUTTON_RELEASE(GDK_BUTTON_RELEASE),

    /**
     * a key has been pressed.
     */
    KEY_PRESS(GDK_KEY_PRESS),

    /**
     * a key has been released.
     */
    KEY_RELEASE(GDK_KEY_RELEASE),

    /**
     * the pointer has entered the surface.
     */
    ENTER_NOTIFY(GDK_ENTER_NOTIFY),

    /**
     * the pointer has left the surface.
     */
    LEAVE_NOTIFY(GDK_LEAVE_NOTIFY),

    /**
     * the keyboard focus has entered or left the surface.
     */
    FOCUS_CHANGE(GDK_FOCUS_CHANGE),

    /**
     * an input device has moved into contact with a sensing
     *   surface (e.g. a touchscreen or graphics tablet).
     */
    PROXIMITY_IN(GDK_PROXIMITY_IN),

    /**
     * an input device has moved out of contact with a sensing
     *   surface.
     */
    PROXIMITY_OUT(GDK_PROXIMITY_OUT),

    /**
     * the mouse has entered the surface while a drag is in progress.
     */
    DRAG_ENTER(GDK_DRAG_ENTER),

    /**
     * the mouse has left the surface while a drag is in progress.
     */
    DRAG_LEAVE(GDK_DRAG_LEAVE),

    /**
     * the mouse has moved in the surface while a drag is in
     *   progress.
     */
    DRAG_MOTION(GDK_DRAG_MOTION),

    /**
     * a drop operation onto the surface has started.
     */
    DROP_START(GDK_DROP_START),

    /**
     * the scroll wheel was turned
     */
    SCROLL(GDK_SCROLL),

    /**
     * a pointer or keyboard grab was broken.
     */
    GRAB_BROKEN(GDK_GRAB_BROKEN),

    /**
     * A new touch event sequence has just started.
     */
    TOUCH_BEGIN(GDK_TOUCH_BEGIN),

    /**
     * A touch event sequence has been updated.
     */
    TOUCH_UPDATE(GDK_TOUCH_UPDATE),

    /**
     * A touch event sequence has finished.
     */
    TOUCH_END(GDK_TOUCH_END),

    /**
     * A touch event sequence has been canceled.
     */
    TOUCH_CANCEL(GDK_TOUCH_CANCEL),

    /**
     * A touchpad swipe gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_SWIPE(GDK_TOUCHPAD_SWIPE),

    /**
     * A touchpad pinch gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_PINCH(GDK_TOUCHPAD_PINCH),

    /**
     * A tablet pad button press event.
     */
    PAD_BUTTON_PRESS(GDK_PAD_BUTTON_PRESS),

    /**
     * A tablet pad button release event.
     */
    PAD_BUTTON_RELEASE(GDK_PAD_BUTTON_RELEASE),

    /**
     * A tablet pad axis event from a "ring".
     */
    PAD_RING(GDK_PAD_RING),

    /**
     * A tablet pad axis event from a "strip".
     */
    PAD_STRIP(GDK_PAD_STRIP),

    /**
     * A tablet pad group mode change.
     */
    PAD_GROUP_MODE(GDK_PAD_GROUP_MODE),

    /**
     * A touchpad hold gesture event, the current state
     *   is determined by its phase field. Since: 4.6
     */
    TOUCHPAD_HOLD(GDK_TOUCHPAD_HOLD),

    /**
     * marks the end of the GdkEventType enumeration.
     */
    EVENT_LAST(GDK_EVENT_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkEventType): EventType =
            when (nativeValue) {
                GDK_DELETE -> DELETE
                GDK_MOTION_NOTIFY -> MOTION_NOTIFY
                GDK_BUTTON_PRESS -> BUTTON_PRESS
                GDK_BUTTON_RELEASE -> BUTTON_RELEASE
                GDK_KEY_PRESS -> KEY_PRESS
                GDK_KEY_RELEASE -> KEY_RELEASE
                GDK_ENTER_NOTIFY -> ENTER_NOTIFY
                GDK_LEAVE_NOTIFY -> LEAVE_NOTIFY
                GDK_FOCUS_CHANGE -> FOCUS_CHANGE
                GDK_PROXIMITY_IN -> PROXIMITY_IN
                GDK_PROXIMITY_OUT -> PROXIMITY_OUT
                GDK_DRAG_ENTER -> DRAG_ENTER
                GDK_DRAG_LEAVE -> DRAG_LEAVE
                GDK_DRAG_MOTION -> DRAG_MOTION
                GDK_DROP_START -> DROP_START
                GDK_SCROLL -> SCROLL
                GDK_GRAB_BROKEN -> GRAB_BROKEN
                GDK_TOUCH_BEGIN -> TOUCH_BEGIN
                GDK_TOUCH_UPDATE -> TOUCH_UPDATE
                GDK_TOUCH_END -> TOUCH_END
                GDK_TOUCH_CANCEL -> TOUCH_CANCEL
                GDK_TOUCHPAD_SWIPE -> TOUCHPAD_SWIPE
                GDK_TOUCHPAD_PINCH -> TOUCHPAD_PINCH
                GDK_PAD_BUTTON_PRESS -> PAD_BUTTON_PRESS
                GDK_PAD_BUTTON_RELEASE -> PAD_BUTTON_RELEASE
                GDK_PAD_RING -> PAD_RING
                GDK_PAD_STRIP -> PAD_STRIP
                GDK_PAD_GROUP_MODE -> PAD_GROUP_MODE
                GDK_TOUCHPAD_HOLD -> TOUCHPAD_HOLD
                GDK_EVENT_LAST -> EVENT_LAST
                else -> error("invalid nativeValue")
            }
    }
}
