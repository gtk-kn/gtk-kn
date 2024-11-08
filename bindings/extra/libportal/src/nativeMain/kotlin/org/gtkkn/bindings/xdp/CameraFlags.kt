// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpCameraFlags

public enum class CameraFlags(
    public val nativeValue: XdpCameraFlags,
) {
    NONE(XdpCameraFlags.XDP_CAMERA_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpCameraFlags): CameraFlags =
            when (nativeValue) {
                XdpCameraFlags.XDP_CAMERA_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
