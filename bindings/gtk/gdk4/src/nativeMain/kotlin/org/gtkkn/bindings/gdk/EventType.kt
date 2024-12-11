// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkEventType
import org.gtkkn.native.gdk.gdk_event_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Specifies the type of the event.
 */
public enum class EventType(public val nativeValue: GdkEventType) {
    /**
     * the window manager has requested that the toplevel surface be
     *   hidden or destroyed, usually when the user clicks on a special icon in the
     *   title bar.
     */
    DELETE(GdkEventType.GDK_DELETE),

    /**
     * the pointer (usually a mouse) has moved.
     */
    MOTION_NOTIFY(GdkEventType.GDK_MOTION_NOTIFY),

    /**
     * a mouse button has been pressed.
     */
    BUTTON_PRESS(GdkEventType.GDK_BUTTON_PRESS),

    /**
     * a mouse button has been released.
     */
    BUTTON_RELEASE(GdkEventType.GDK_BUTTON_RELEASE),

    /**
     * a key has been pressed.
     */
    KEY_PRESS(GdkEventType.GDK_KEY_PRESS),

    /**
     * a key has been released.
     */
    KEY_RELEASE(GdkEventType.GDK_KEY_RELEASE),

    /**
     * the pointer has entered the surface.
     */
    ENTER_NOTIFY(GdkEventType.GDK_ENTER_NOTIFY),

    /**
     * the pointer has left the surface.
     */
    LEAVE_NOTIFY(GdkEventType.GDK_LEAVE_NOTIFY),

    /**
     * the keyboard focus has entered or left the surface.
     */
    FOCUS_CHANGE(GdkEventType.GDK_FOCUS_CHANGE),

    /**
     * an input device has moved into contact with a sensing
     *   surface (e.g. a touchscreen or graphics tablet).
     */
    PROXIMITY_IN(GdkEventType.GDK_PROXIMITY_IN),

    /**
     * an input device has moved out of contact with a sensing
     *   surface.
     */
    PROXIMITY_OUT(GdkEventType.GDK_PROXIMITY_OUT),

    /**
     * the mouse has entered the surface while a drag is in progress.
     */
    DRAG_ENTER(GdkEventType.GDK_DRAG_ENTER),

    /**
     * the mouse has left the surface while a drag is in progress.
     */
    DRAG_LEAVE(GdkEventType.GDK_DRAG_LEAVE),

    /**
     * the mouse has moved in the surface while a drag is in
     *   progress.
     */
    DRAG_MOTION(GdkEventType.GDK_DRAG_MOTION),

    /**
     * a drop operation onto the surface has started.
     */
    DROP_START(GdkEventType.GDK_DROP_START),

    /**
     * the scroll wheel was turned
     */
    SCROLL(GdkEventType.GDK_SCROLL),

    /**
     * a pointer or keyboard grab was broken.
     */
    GRAB_BROKEN(GdkEventType.GDK_GRAB_BROKEN),

    /**
     * A new touch event sequence has just started.
     */
    TOUCH_BEGIN(GdkEventType.GDK_TOUCH_BEGIN),

    /**
     * A touch event sequence has been updated.
     */
    TOUCH_UPDATE(GdkEventType.GDK_TOUCH_UPDATE),

    /**
     * A touch event sequence has finished.
     */
    TOUCH_END(GdkEventType.GDK_TOUCH_END),

    /**
     * A touch event sequence has been canceled.
     */
    TOUCH_CANCEL(GdkEventType.GDK_TOUCH_CANCEL),

    /**
     * A touchpad swipe gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_SWIPE(GdkEventType.GDK_TOUCHPAD_SWIPE),

    /**
     * A touchpad pinch gesture event, the current state
     *   is determined by its phase field.
     */
    TOUCHPAD_PINCH(GdkEventType.GDK_TOUCHPAD_PINCH),

    /**
     * A tablet pad button press event.
     */
    PAD_BUTTON_PRESS(GdkEventType.GDK_PAD_BUTTON_PRESS),

    /**
     * A tablet pad button release event.
     */
    PAD_BUTTON_RELEASE(GdkEventType.GDK_PAD_BUTTON_RELEASE),

    /**
     * A tablet pad axis event from a "ring".
     */
    PAD_RING(GdkEventType.GDK_PAD_RING),

    /**
     * A tablet pad axis event from a "strip".
     */
    PAD_STRIP(GdkEventType.GDK_PAD_STRIP),

    /**
     * A tablet pad group mode change.
     */
    PAD_GROUP_MODE(GdkEventType.GDK_PAD_GROUP_MODE),

    /**
     * A touchpad hold gesture event, the current state is determined by its phase
     * field.
     * @since 4.6
     */
    TOUCHPAD_HOLD(GdkEventType.GDK_TOUCHPAD_HOLD),

    /**
     * marks the end of the GdkEventType enumeration.
     */
    EVENT_LAST(GdkEventType.GDK_EVENT_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkEventType): EventType = when (nativeValue) {
            GdkEventType.GDK_DELETE -> DELETE
            GdkEventType.GDK_MOTION_NOTIFY -> MOTION_NOTIFY
            GdkEventType.GDK_BUTTON_PRESS -> BUTTON_PRESS
            GdkEventType.GDK_BUTTON_RELEASE -> BUTTON_RELEASE
            GdkEventType.GDK_KEY_PRESS -> KEY_PRESS
            GdkEventType.GDK_KEY_RELEASE -> KEY_RELEASE
            GdkEventType.GDK_ENTER_NOTIFY -> ENTER_NOTIFY
            GdkEventType.GDK_LEAVE_NOTIFY -> LEAVE_NOTIFY
            GdkEventType.GDK_FOCUS_CHANGE -> FOCUS_CHANGE
            GdkEventType.GDK_PROXIMITY_IN -> PROXIMITY_IN
            GdkEventType.GDK_PROXIMITY_OUT -> PROXIMITY_OUT
            GdkEventType.GDK_DRAG_ENTER -> DRAG_ENTER
            GdkEventType.GDK_DRAG_LEAVE -> DRAG_LEAVE
            GdkEventType.GDK_DRAG_MOTION -> DRAG_MOTION
            GdkEventType.GDK_DROP_START -> DROP_START
            GdkEventType.GDK_SCROLL -> SCROLL
            GdkEventType.GDK_GRAB_BROKEN -> GRAB_BROKEN
            GdkEventType.GDK_TOUCH_BEGIN -> TOUCH_BEGIN
            GdkEventType.GDK_TOUCH_UPDATE -> TOUCH_UPDATE
            GdkEventType.GDK_TOUCH_END -> TOUCH_END
            GdkEventType.GDK_TOUCH_CANCEL -> TOUCH_CANCEL
            GdkEventType.GDK_TOUCHPAD_SWIPE -> TOUCHPAD_SWIPE
            GdkEventType.GDK_TOUCHPAD_PINCH -> TOUCHPAD_PINCH
            GdkEventType.GDK_PAD_BUTTON_PRESS -> PAD_BUTTON_PRESS
            GdkEventType.GDK_PAD_BUTTON_RELEASE -> PAD_BUTTON_RELEASE
            GdkEventType.GDK_PAD_RING -> PAD_RING
            GdkEventType.GDK_PAD_STRIP -> PAD_STRIP
            GdkEventType.GDK_PAD_GROUP_MODE -> PAD_GROUP_MODE
            GdkEventType.GDK_TOUCHPAD_HOLD -> TOUCHPAD_HOLD
            GdkEventType.GDK_EVENT_LAST -> EVENT_LAST
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of EventType
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_event_type_get_type()
    }
}
