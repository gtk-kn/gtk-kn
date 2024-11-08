// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpEmailFlags

public enum class EmailFlags(
    public val nativeValue: XdpEmailFlags,
) {
    NONE(XdpEmailFlags.XDP_EMAIL_FLAG_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpEmailFlags): EmailFlags =
            when (nativeValue) {
                XdpEmailFlags.XDP_EMAIL_FLAG_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
