// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkCrossingMode
import org.gtkkn.native.gdk.gdk_crossing_mode_get_type
import org.gtkkn.native.gobject.GType

/**
 * Specifies the crossing mode for enter and leave events.
 */
public enum class CrossingMode(public val nativeValue: GdkCrossingMode) {
    /**
     * crossing because of pointer motion.
     */
    NORMAL(GdkCrossingMode.GDK_CROSSING_NORMAL),

    /**
     * crossing because a grab is activated.
     */
    GRAB(GdkCrossingMode.GDK_CROSSING_GRAB),

    /**
     * crossing because a grab is deactivated.
     */
    UNGRAB(GdkCrossingMode.GDK_CROSSING_UNGRAB),

    /**
     * crossing because a GTK grab is activated.
     */
    GTK_GRAB(GdkCrossingMode.GDK_CROSSING_GTK_GRAB),

    /**
     * crossing because a GTK grab is deactivated.
     */
    GTK_UNGRAB(GdkCrossingMode.GDK_CROSSING_GTK_UNGRAB),

    /**
     * crossing because a GTK widget changed
     *   state (e.g. sensitivity).
     */
    STATE_CHANGED(GdkCrossingMode.GDK_CROSSING_STATE_CHANGED),

    /**
     * crossing because a touch sequence has begun,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_BEGIN(GdkCrossingMode.GDK_CROSSING_TOUCH_BEGIN),

    /**
     * crossing because a touch sequence has ended,
     *   this event is synthetic as the pointer might have not left the surface.
     */
    TOUCH_END(GdkCrossingMode.GDK_CROSSING_TOUCH_END),

    /**
     * crossing because of a device switch (i.e.
     *   a mouse taking control of the pointer after a touch device), this event
     *   is synthetic as the pointer didn’t leave the surface.
     */
    DEVICE_SWITCH(GdkCrossingMode.GDK_CROSSING_DEVICE_SWITCH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkCrossingMode): CrossingMode = when (nativeValue) {
            GdkCrossingMode.GDK_CROSSING_NORMAL -> NORMAL
            GdkCrossingMode.GDK_CROSSING_GRAB -> GRAB
            GdkCrossingMode.GDK_CROSSING_UNGRAB -> UNGRAB
            GdkCrossingMode.GDK_CROSSING_GTK_GRAB -> GTK_GRAB
            GdkCrossingMode.GDK_CROSSING_GTK_UNGRAB -> GTK_UNGRAB
            GdkCrossingMode.GDK_CROSSING_STATE_CHANGED -> STATE_CHANGED
            GdkCrossingMode.GDK_CROSSING_TOUCH_BEGIN -> TOUCH_BEGIN
            GdkCrossingMode.GDK_CROSSING_TOUCH_END -> TOUCH_END
            GdkCrossingMode.GDK_CROSSING_DEVICE_SWITCH -> DEVICE_SWITCH
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CrossingMode
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_crossing_mode_get_type()
    }
}
