// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDeviceToolType
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_AIRBRUSH
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_BRUSH
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_ERASER
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_LENS
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_MOUSE
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PEN
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PENCIL
import org.gtkkn.native.gdk.GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_UNKNOWN

/**
 * Indicates the specific type of tool being used being a tablet. Such as an
 * airbrush, pencil, etc.
 */
public enum class DeviceToolType(
    public val nativeValue: GdkDeviceToolType,
) {
    /**
     * Tool is of an unknown type.
     */
    UNKNOWN(GDK_DEVICE_TOOL_TYPE_UNKNOWN),

    /**
     * Tool is a standard tablet stylus.
     */
    PEN(GDK_DEVICE_TOOL_TYPE_PEN),

    /**
     * Tool is standard tablet eraser.
     */
    ERASER(GDK_DEVICE_TOOL_TYPE_ERASER),

    /**
     * Tool is a brush stylus.
     */
    BRUSH(GDK_DEVICE_TOOL_TYPE_BRUSH),

    /**
     * Tool is a pencil stylus.
     */
    PENCIL(GDK_DEVICE_TOOL_TYPE_PENCIL),

    /**
     * Tool is an airbrush stylus.
     */
    AIRBRUSH(GDK_DEVICE_TOOL_TYPE_AIRBRUSH),

    /**
     * Tool is a mouse.
     */
    MOUSE(GDK_DEVICE_TOOL_TYPE_MOUSE),

    /**
     * Tool is a lens cursor.
     */
    LENS(GDK_DEVICE_TOOL_TYPE_LENS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDeviceToolType): DeviceToolType =
            when (nativeValue) {
                GDK_DEVICE_TOOL_TYPE_UNKNOWN -> UNKNOWN
                GDK_DEVICE_TOOL_TYPE_PEN -> PEN
                GDK_DEVICE_TOOL_TYPE_ERASER -> ERASER
                GDK_DEVICE_TOOL_TYPE_BRUSH -> BRUSH
                GDK_DEVICE_TOOL_TYPE_PENCIL -> PENCIL
                GDK_DEVICE_TOOL_TYPE_AIRBRUSH -> AIRBRUSH
                GDK_DEVICE_TOOL_TYPE_MOUSE -> MOUSE
                GDK_DEVICE_TOOL_TYPE_LENS -> LENS
                else -> error("invalid nativeValue")
            }
    }
}
