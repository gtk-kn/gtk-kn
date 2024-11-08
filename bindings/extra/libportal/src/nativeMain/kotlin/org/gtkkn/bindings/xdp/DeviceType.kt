// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_DEVICE_KEYBOARD
import org.gtkkn.native.xdp.XDP_DEVICE_NONE
import org.gtkkn.native.xdp.XDP_DEVICE_POINTER
import org.gtkkn.native.xdp.XDP_DEVICE_TOUCHSCREEN
import org.gtkkn.native.xdp.XdpDeviceType

/**
 * Flags to specify what input devices to control for a remote desktop session.
 */
public class DeviceType(
    public val mask: XdpDeviceType,
) : Bitfield<DeviceType> {
    override infix fun or(other: DeviceType): DeviceType = DeviceType(mask or other.mask)

    public companion object {
        /**
         * no device
         */
        public val NONE: DeviceType = DeviceType(XDP_DEVICE_NONE)

        /**
         * control the keyboard.
         */
        public val KEYBOARD: DeviceType = DeviceType(XDP_DEVICE_KEYBOARD)

        /**
         * control the pointer.
         */
        public val POINTER: DeviceType = DeviceType(XDP_DEVICE_POINTER)

        /**
         * control the touchscreen.
         */
        public val TOUCHSCREEN: DeviceType = DeviceType(XDP_DEVICE_TOUCHSCREEN)
    }
}
