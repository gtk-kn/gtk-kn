// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDeviceToolType
import org.gtkkn.native.gdk.gdk_device_tool_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Indicates the specific type of tool being used being a tablet. Such as an
 * airbrush, pencil, etc.
 */
public enum class DeviceToolType(public val nativeValue: GdkDeviceToolType) {
    /**
     * Tool is of an unknown type.
     */
    UNKNOWN(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_UNKNOWN),

    /**
     * Tool is a standard tablet stylus.
     */
    PEN(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PEN),

    /**
     * Tool is standard tablet eraser.
     */
    ERASER(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_ERASER),

    /**
     * Tool is a brush stylus.
     */
    BRUSH(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_BRUSH),

    /**
     * Tool is a pencil stylus.
     */
    PENCIL(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PENCIL),

    /**
     * Tool is an airbrush stylus.
     */
    AIRBRUSH(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_AIRBRUSH),

    /**
     * Tool is a mouse.
     */
    MOUSE(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_MOUSE),

    /**
     * Tool is a lens cursor.
     */
    LENS(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_LENS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDeviceToolType): DeviceToolType = when (nativeValue) {
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_UNKNOWN -> UNKNOWN
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PEN -> PEN
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_ERASER -> ERASER
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_BRUSH -> BRUSH
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PENCIL -> PENCIL
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_AIRBRUSH -> AIRBRUSH
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_MOUSE -> MOUSE
            GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_LENS -> LENS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DeviceToolType
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_device_tool_type_get_type()
    }
}
