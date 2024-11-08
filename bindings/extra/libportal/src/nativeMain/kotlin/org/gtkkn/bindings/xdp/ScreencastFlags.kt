// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_SCREENCAST_FLAG_MULTIPLE
import org.gtkkn.native.xdp.XDP_SCREENCAST_FLAG_NONE
import org.gtkkn.native.xdp.XdpScreencastFlags

/**
 * Options for starting screen casts.
 */
public class ScreencastFlags(
    public val mask: XdpScreencastFlags,
) : Bitfield<ScreencastFlags> {
    override infix fun or(other: ScreencastFlags): ScreencastFlags = ScreencastFlags(mask or other.mask)

    public companion object {
        /**
         * No options
         */
        public val NONE: ScreencastFlags = ScreencastFlags(XDP_SCREENCAST_FLAG_NONE)

        /**
         * allow opening multiple streams
         */
        public val MULTIPLE: ScreencastFlags = ScreencastFlags(XDP_SCREENCAST_FLAG_MULTIPLE)
    }
}
