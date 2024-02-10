// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkCrossingMode
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_DEVICE_SWITCH
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_GRAB
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_GTK_GRAB
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_GTK_UNGRAB
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_NORMAL
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_STATE_CHANGED
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_TOUCH_BEGIN
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_TOUCH_END
import org.gtkkn.native.gdk.GdkCrossingMode.GDK_CROSSING_UNGRAB

/**
 * Specifies the crossing mode for enter and leave events.
 */
public enum class CrossingMode(
    public val nativeValue: GdkCrossingMode,
) {
    /**
     * crossing because of pointer motion.
     */
    NORMAL(GDK_CROSSING_NORMAL),

    /**
     * crossing because a grab is activated.
     */
    GRAB(GDK_CROSSING_GRAB),

    /**
     * crossing because a grab is deactivated.
     */
    UNGRAB(GDK_CROSSING_UNGRAB),

    /**
     * crossing because a GTK grab is activated.
     */
    GTK_GRAB(GDK_CROSSING_GTK_GRAB),

    /**
     * crossing because a GTK grab is deactivated.
     */
    GTK_UNGRAB(GDK_CROSSING_GTK_UNGRAB),

    /**
     * crossing because a GTK widget changed
     *   state (e.g. sensitivity).
     */
    STATE_CHANGED(GDK_CROSSING_STATE_CHANGED),

    /**
     * crossing because a touch sequence has begun,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_BEGIN(GDK_CROSSING_TOUCH_BEGIN),

    /**
     * crossing because a touch sequence has ended,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_END(GDK_CROSSING_TOUCH_END),

    /**
     * crossing because of a device switch (i.e.
     *   a mouse taking control of the pointer after a touch device), this event
     *   is synthetic as the pointer didn’t leave the surface.
     */
    DEVICE_SWITCH(GDK_CROSSING_DEVICE_SWITCH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkCrossingMode): CrossingMode =
            when (nativeValue) {
                GDK_CROSSING_NORMAL -> NORMAL
                GDK_CROSSING_GRAB -> GRAB
                GDK_CROSSING_UNGRAB -> UNGRAB
                GDK_CROSSING_GTK_GRAB -> GTK_GRAB
                GDK_CROSSING_GTK_UNGRAB -> GTK_UNGRAB
                GDK_CROSSING_STATE_CHANGED -> STATE_CHANGED
                GDK_CROSSING_TOUCH_BEGIN -> TOUCH_BEGIN
                GDK_CROSSING_TOUCH_END -> TOUCH_END
                GDK_CROSSING_DEVICE_SWITCH -> DEVICE_SWITCH
                else -> error("invalid nativeValue")
            }
    }
}
