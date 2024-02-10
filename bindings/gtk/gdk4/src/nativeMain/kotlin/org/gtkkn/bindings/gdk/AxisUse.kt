// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkAxisUse
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_DELTA_X
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_DELTA_Y
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_DISTANCE
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_IGNORE
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_LAST
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_PRESSURE
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_ROTATION
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_SLIDER
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_WHEEL
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_X
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_XTILT
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_Y
import org.gtkkn.native.gdk.GdkAxisUse.GDK_AXIS_YTILT

/**
 * Defines how device axes are interpreted by GTK.
 *
 * Note that the X and Y axes are not really needed; pointer devices
 * report their location via the x/y members of events regardless. Whether
 * X and Y are present as axes depends on the GDK backend.
 */
public enum class AxisUse(
    public val nativeValue: GdkAxisUse,
) {
    /**
     * the axis is ignored.
     */
    IGNORE(GDK_AXIS_IGNORE),

    /**
     * the axis is used as the x axis.
     */
    X(GDK_AXIS_X),

    /**
     * the axis is used as the y axis.
     */
    Y(GDK_AXIS_Y),

    /**
     * the axis is used as the scroll x delta
     */
    DELTA_X(GDK_AXIS_DELTA_X),

    /**
     * the axis is used as the scroll y delta
     */
    DELTA_Y(GDK_AXIS_DELTA_Y),

    /**
     * the axis is used for pressure information.
     */
    PRESSURE(GDK_AXIS_PRESSURE),

    /**
     * the axis is used for x tilt information.
     */
    XTILT(GDK_AXIS_XTILT),

    /**
     * the axis is used for y tilt information.
     */
    YTILT(GDK_AXIS_YTILT),

    /**
     * the axis is used for wheel information.
     */
    WHEEL(GDK_AXIS_WHEEL),

    /**
     * the axis is used for pen/tablet distance information
     */
    DISTANCE(GDK_AXIS_DISTANCE),

    /**
     * the axis is used for pen rotation information
     */
    ROTATION(GDK_AXIS_ROTATION),

    /**
     * the axis is used for pen slider information
     */
    SLIDER(GDK_AXIS_SLIDER),

    /**
     * a constant equal to the numerically highest axis value.
     */
    LAST(GDK_AXIS_LAST),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkAxisUse): AxisUse =
            when (nativeValue) {
                GDK_AXIS_IGNORE -> IGNORE
                GDK_AXIS_X -> X
                GDK_AXIS_Y -> Y
                GDK_AXIS_DELTA_X -> DELTA_X
                GDK_AXIS_DELTA_Y -> DELTA_Y
                GDK_AXIS_PRESSURE -> PRESSURE
                GDK_AXIS_XTILT -> XTILT
                GDK_AXIS_YTILT -> YTILT
                GDK_AXIS_WHEEL -> WHEEL
                GDK_AXIS_DISTANCE -> DISTANCE
                GDK_AXIS_ROTATION -> ROTATION
                GDK_AXIS_SLIDER -> SLIDER
                GDK_AXIS_LAST -> LAST
                else -> error("invalid nativeValue")
            }
    }
}
