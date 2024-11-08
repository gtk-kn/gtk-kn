// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpPrintFlags

public enum class PrintFlags(
    public val nativeValue: XdpPrintFlags,
) {
    NONE(XdpPrintFlags.XDP_PRINT_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpPrintFlags): PrintFlags =
            when (nativeValue) {
                XdpPrintFlags.XDP_PRINT_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
