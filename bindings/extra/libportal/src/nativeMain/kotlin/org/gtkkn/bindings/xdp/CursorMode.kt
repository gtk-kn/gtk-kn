// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_CURSOR_MODE_EMBEDDED
import org.gtkkn.native.xdp.XDP_CURSOR_MODE_HIDDEN
import org.gtkkn.native.xdp.XDP_CURSOR_MODE_METADATA
import org.gtkkn.native.xdp.XdpCursorMode

/**
 * Options for how the cursor is handled.
 */
public class CursorMode(
    public val mask: XdpCursorMode,
) : Bitfield<CursorMode> {
    override infix fun or(other: CursorMode): CursorMode = CursorMode(mask or other.mask)

    public companion object {
        /**
         * no cursor
         */
        public val HIDDEN: CursorMode = CursorMode(XDP_CURSOR_MODE_HIDDEN)

        /**
         * cursor is embedded on the stream
         */
        public val EMBEDDED: CursorMode = CursorMode(XDP_CURSOR_MODE_EMBEDDED)

        /**
         * cursor is sent as metadata of the stream
         */
        public val METADATA: CursorMode = CursorMode(XDP_CURSOR_MODE_METADATA)
    }
}
