// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpUserInformationFlags

public enum class UserInformationFlags(
    public val nativeValue: XdpUserInformationFlags,
) {
    NONE(XdpUserInformationFlags.XDP_USER_INFORMATION_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpUserInformationFlags): UserInformationFlags =
            when (nativeValue) {
                XdpUserInformationFlags.XDP_USER_INFORMATION_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
