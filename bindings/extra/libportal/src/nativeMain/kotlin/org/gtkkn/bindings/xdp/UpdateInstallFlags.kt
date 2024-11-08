// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpUpdateInstallFlags

public enum class UpdateInstallFlags(
    public val nativeValue: XdpUpdateInstallFlags,
) {
    NONE(XdpUpdateInstallFlags.XDP_UPDATE_INSTALL_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpUpdateInstallFlags): UpdateInstallFlags =
            when (nativeValue) {
                XdpUpdateInstallFlags.XDP_UPDATE_INSTALL_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
