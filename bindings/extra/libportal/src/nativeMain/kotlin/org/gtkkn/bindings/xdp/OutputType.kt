// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_OUTPUT_MONITOR
import org.gtkkn.native.xdp.XDP_OUTPUT_NONE
import org.gtkkn.native.xdp.XDP_OUTPUT_VIRTUAL
import org.gtkkn.native.xdp.XDP_OUTPUT_WINDOW
import org.gtkkn.native.xdp.XdpOutputType

/**
 * Flags to specify what kind of sources to offer for a screencast session.
 */
public class OutputType(
    public val mask: XdpOutputType,
) : Bitfield<OutputType> {
    override infix fun or(other: OutputType): OutputType = OutputType(mask or other.mask)

    public companion object {
        /**
         * do not select any output
         */
        public val NONE: OutputType = OutputType(XDP_OUTPUT_NONE)

        /**
         * allow selecting monitors
         */
        public val MONITOR: OutputType = OutputType(XDP_OUTPUT_MONITOR)

        /**
         * allow selecting individual application windows
         */
        public val WINDOW: OutputType = OutputType(XDP_OUTPUT_WINDOW)

        /**
         * allow creating new virtual displays
         */
        public val VIRTUAL: OutputType = OutputType(XDP_OUTPUT_VIRTUAL)
    }
}
