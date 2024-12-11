// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_DELTA_X
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_DELTA_Y
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_DISTANCE
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_PRESSURE
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_ROTATION
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_SLIDER
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_WHEEL
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_X
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_XTILT
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_Y
import org.gtkkn.native.gdk.GDK_AXIS_FLAG_YTILT
import org.gtkkn.native.gdk.GdkAxisFlags
import org.gtkkn.native.gdk.gdk_axis_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags describing the current capabilities of a device/tool.
 */
public class AxisFlags(public val mask: GdkAxisFlags) : Bitfield<AxisFlags> {
    override infix fun or(other: AxisFlags): AxisFlags = AxisFlags(mask or other.mask)

    public companion object {
        /**
         * X axis is present
         */
        public val X: AxisFlags = AxisFlags(GDK_AXIS_FLAG_X)

        /**
         * Y axis is present
         */
        public val Y: AxisFlags = AxisFlags(GDK_AXIS_FLAG_Y)

        /**
         * Scroll X delta axis is present
         */
        public val DELTA_X: AxisFlags = AxisFlags(GDK_AXIS_FLAG_DELTA_X)

        /**
         * Scroll Y delta axis is present
         */
        public val DELTA_Y: AxisFlags = AxisFlags(GDK_AXIS_FLAG_DELTA_Y)

        /**
         * Pressure axis is present
         */
        public val PRESSURE: AxisFlags = AxisFlags(GDK_AXIS_FLAG_PRESSURE)

        /**
         * X tilt axis is present
         */
        public val XTILT: AxisFlags = AxisFlags(GDK_AXIS_FLAG_XTILT)

        /**
         * Y tilt axis is present
         */
        public val YTILT: AxisFlags = AxisFlags(GDK_AXIS_FLAG_YTILT)

        /**
         * Wheel axis is present
         */
        public val WHEEL: AxisFlags = AxisFlags(GDK_AXIS_FLAG_WHEEL)

        /**
         * Distance axis is present
         */
        public val DISTANCE: AxisFlags = AxisFlags(GDK_AXIS_FLAG_DISTANCE)

        /**
         * Z-axis rotation is present
         */
        public val ROTATION: AxisFlags = AxisFlags(GDK_AXIS_FLAG_ROTATION)

        /**
         * Slider axis is present
         */
        public val SLIDER: AxisFlags = AxisFlags(GDK_AXIS_FLAG_SLIDER)

        /**
         * Get the GType of AxisFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_axis_flags_get_type()
    }
}
