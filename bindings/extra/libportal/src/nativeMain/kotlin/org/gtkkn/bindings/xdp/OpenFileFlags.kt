// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_OPEN_FILE_FLAG_MULTIPLE
import org.gtkkn.native.xdp.XDP_OPEN_FILE_FLAG_NONE
import org.gtkkn.native.xdp.XdpOpenFileFlags

/**
 * Options for opening files.
 */
public class OpenFileFlags(
    public val mask: XdpOpenFileFlags,
) : Bitfield<OpenFileFlags> {
    override infix fun or(other: OpenFileFlags): OpenFileFlags = OpenFileFlags(mask or other.mask)

    public companion object {
        /**
         * No options
         */
        public val NONE: OpenFileFlags = OpenFileFlags(XDP_OPEN_FILE_FLAG_NONE)

        /**
         * Allow selecting multiple files
         */
        public val MULTIPLE: OpenFileFlags = OpenFileFlags(XDP_OPEN_FILE_FLAG_MULTIPLE)
    }
}
