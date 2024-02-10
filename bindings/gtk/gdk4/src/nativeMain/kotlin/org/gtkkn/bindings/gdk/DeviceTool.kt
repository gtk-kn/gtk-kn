// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDeviceTool
import org.gtkkn.native.gdk.gdk_device_tool_get_axes
import org.gtkkn.native.gdk.gdk_device_tool_get_hardware_id
import org.gtkkn.native.gdk.gdk_device_tool_get_serial
import org.gtkkn.native.gdk.gdk_device_tool_get_tool_type
import org.gtkkn.native.gdk.gdk_device_tool_get_type
import kotlin.ULong

/**
 * A physical tool associated to a `GdkDevice`.
 */
public open class DeviceTool(
    pointer: CPointer<GdkDeviceTool>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gdkDeviceToolPointer: CPointer<GdkDeviceTool>
        get() = gPointer.reinterpret()

    /**
     * The axes of the tool.
     */
    public open val axes: AxisFlags
        /**
         * Gets the axes of the tool.
         *
         * @return the axes of @tool
         */
        get() =
            gdk_device_tool_get_axes(gdkDeviceToolPointer.reinterpret()).run {
                AxisFlags(this)
            }

    /**
     * The hardware ID of the tool.
     */
    public open val hardwareId: ULong
        /**
         * Gets the hardware ID of this tool, or 0 if it's not known.
         *
         * When non-zero, the identificator is unique for the given tool model,
         * meaning that two identical tools will share the same @hardware_id,
         * but will have different serial numbers (see
         * [method@Gdk.DeviceTool.get_serial]).
         *
         * This is a more concrete (and device specific) method to identify
         * a `GdkDeviceTool` than [method@Gdk.DeviceTool.get_tool_type],
         * as a tablet may support multiple devices with the same
         * `GdkDeviceToolType`, but different hardware identificators.
         *
         * @return The hardware identificator of this tool.
         */
        get() = gdk_device_tool_get_hardware_id(gdkDeviceToolPointer.reinterpret())

    /**
     * The serial number of the tool.
     */
    public open val serial: ULong
        /**
         * Gets the serial number of this tool.
         *
         * This value can be used to identify a physical tool
         * (eg. a tablet pen) across program executions.
         *
         * @return The serial ID for this tool
         */
        get() = gdk_device_tool_get_serial(gdkDeviceToolPointer.reinterpret())

    /**
     * The type of the tool.
     */
    public open val toolType: DeviceToolType
        /**
         * Gets the `GdkDeviceToolType` of the tool.
         *
         * @return The physical type for this tool. This can be used to
         *   figure out what sort of pen is being used, such as an airbrush
         *   or a pencil.
         */
        get() =
            gdk_device_tool_get_tool_type(gdkDeviceToolPointer.reinterpret()).run {
                DeviceToolType.fromNativeValue(this)
            }

    /**
     * Gets the axes of the tool.
     *
     * @return the axes of @tool
     */
    public open fun getAxes(): AxisFlags =
        gdk_device_tool_get_axes(gdkDeviceToolPointer.reinterpret()).run {
            AxisFlags(this)
        }

    /**
     * Gets the hardware ID of this tool, or 0 if it's not known.
     *
     * When non-zero, the identificator is unique for the given tool model,
     * meaning that two identical tools will share the same @hardware_id,
     * but will have different serial numbers (see
     * [method@Gdk.DeviceTool.get_serial]).
     *
     * This is a more concrete (and device specific) method to identify
     * a `GdkDeviceTool` than [method@Gdk.DeviceTool.get_tool_type],
     * as a tablet may support multiple devices with the same
     * `GdkDeviceToolType`, but different hardware identificators.
     *
     * @return The hardware identificator of this tool.
     */
    public open fun getHardwareId(): ULong = gdk_device_tool_get_hardware_id(gdkDeviceToolPointer.reinterpret())

    /**
     * Gets the serial number of this tool.
     *
     * This value can be used to identify a physical tool
     * (eg. a tablet pen) across program executions.
     *
     * @return The serial ID for this tool
     */
    public open fun getSerial(): ULong = gdk_device_tool_get_serial(gdkDeviceToolPointer.reinterpret())

    /**
     * Gets the `GdkDeviceToolType` of the tool.
     *
     * @return The physical type for this tool. This can be used to
     *   figure out what sort of pen is being used, such as an airbrush
     *   or a pencil.
     */
    public open fun getToolType(): DeviceToolType =
        gdk_device_tool_get_tool_type(gdkDeviceToolPointer.reinterpret()).run {
            DeviceToolType.fromNativeValue(this)
        }

    public companion object : TypeCompanion<DeviceTool> {
        override val type: GeneratedClassKGType<DeviceTool> =
            GeneratedClassKGType(gdk_device_tool_get_type()) { DeviceTool(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}
