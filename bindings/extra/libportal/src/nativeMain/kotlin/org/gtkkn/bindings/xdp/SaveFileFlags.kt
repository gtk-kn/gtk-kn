// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpSaveFileFlags

public enum class SaveFileFlags(
    public val nativeValue: XdpSaveFileFlags,
) {
    NONE(XdpSaveFileFlags.XDP_SAVE_FILE_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpSaveFileFlags): SaveFileFlags =
            when (nativeValue) {
                XdpSaveFileFlags.XDP_SAVE_FILE_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
