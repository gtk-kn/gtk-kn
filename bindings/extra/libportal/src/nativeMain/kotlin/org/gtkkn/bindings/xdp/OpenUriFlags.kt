// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_OPEN_URI_FLAG_ASK
import org.gtkkn.native.xdp.XDP_OPEN_URI_FLAG_NONE
import org.gtkkn.native.xdp.XDP_OPEN_URI_FLAG_WRITABLE
import org.gtkkn.native.xdp.XdpOpenUriFlags

/**
 * Options for opening uris.
 */
public class OpenUriFlags(
    public val mask: XdpOpenUriFlags,
) : Bitfield<OpenUriFlags> {
    override infix fun or(other: OpenUriFlags): OpenUriFlags = OpenUriFlags(mask or other.mask)

    public companion object {
        /**
         * No options
         */
        public val NONE: OpenUriFlags = OpenUriFlags(XDP_OPEN_URI_FLAG_NONE)

        /**
         * Use an application chooser for the given uri
         */
        public val ASK: OpenUriFlags = OpenUriFlags(XDP_OPEN_URI_FLAG_ASK)

        /**
         * Allow writing to file (if uri points to a local file that is exported in the document portal and app is sandboxed itself)
         */
        public val WRITABLE: OpenUriFlags = OpenUriFlags(XDP_OPEN_URI_FLAG_WRITABLE)
    }
}
