// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkAxisUse
import org.gtkkn.native.gdk.gdk_axis_use_get_type
import org.gtkkn.native.gobject.GType

/**
 * Defines how device axes are interpreted by GTK.
 *
 * Note that the X and Y axes are not really needed; pointer devices
 * report their location via the x/y members of events regardless. Whether
 * X and Y are present as axes depends on the GDK backend.
 */
public enum class AxisUse(public val nativeValue: GdkAxisUse) {
    /**
     * the axis is ignored.
     */
    IGNORE(GdkAxisUse.GDK_AXIS_IGNORE),

    /**
     * the axis is used as the x axis.
     */
    X(GdkAxisUse.GDK_AXIS_X),

    /**
     * the axis is used as the y axis.
     */
    Y(GdkAxisUse.GDK_AXIS_Y),

    /**
     * the axis is used as the scroll x delta
     */
    DELTA_X(GdkAxisUse.GDK_AXIS_DELTA_X),

    /**
     * the axis is used as the scroll y delta
     */
    DELTA_Y(GdkAxisUse.GDK_AXIS_DELTA_Y),

    /**
     * the axis is used for pressure information.
     */
    PRESSURE(GdkAxisUse.GDK_AXIS_PRESSURE),

    /**
     * the axis is used for x tilt information.
     */
    XTILT(GdkAxisUse.GDK_AXIS_XTILT),

    /**
     * the axis is used for y tilt information.
     */
    YTILT(GdkAxisUse.GDK_AXIS_YTILT),

    /**
     * the axis is used for wheel information.
     */
    WHEEL(GdkAxisUse.GDK_AXIS_WHEEL),

    /**
     * the axis is used for pen/tablet distance information
     */
    DISTANCE(GdkAxisUse.GDK_AXIS_DISTANCE),

    /**
     * the axis is used for pen rotation information
     */
    ROTATION(GdkAxisUse.GDK_AXIS_ROTATION),

    /**
     * the axis is used for pen slider information
     */
    SLIDER(GdkAxisUse.GDK_AXIS_SLIDER),

    /**
     * a constant equal to the numerically highest axis value.
     */
    LAST(GdkAxisUse.GDK_AXIS_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkAxisUse): AxisUse = when (nativeValue) {
            GdkAxisUse.GDK_AXIS_IGNORE -> IGNORE
            GdkAxisUse.GDK_AXIS_X -> X
            GdkAxisUse.GDK_AXIS_Y -> Y
            GdkAxisUse.GDK_AXIS_DELTA_X -> DELTA_X
            GdkAxisUse.GDK_AXIS_DELTA_Y -> DELTA_Y
            GdkAxisUse.GDK_AXIS_PRESSURE -> PRESSURE
            GdkAxisUse.GDK_AXIS_XTILT -> XTILT
            GdkAxisUse.GDK_AXIS_YTILT -> YTILT
            GdkAxisUse.GDK_AXIS_WHEEL -> WHEEL
            GdkAxisUse.GDK_AXIS_DISTANCE -> DISTANCE
            GdkAxisUse.GDK_AXIS_ROTATION -> ROTATION
            GdkAxisUse.GDK_AXIS_SLIDER -> SLIDER
            GdkAxisUse.GDK_AXIS_LAST -> LAST
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of AxisUse
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_axis_use_get_type()
    }
}
