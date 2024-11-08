// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_REMOTE_DESKTOP_FLAG_MULTIPLE
import org.gtkkn.native.xdp.XDP_REMOTE_DESKTOP_FLAG_NONE
import org.gtkkn.native.xdp.XdpRemoteDesktopFlags

/**
 * Options for starting remote desktop sessions.
 */
public class RemoteDesktopFlags(
    public val mask: XdpRemoteDesktopFlags,
) : Bitfield<RemoteDesktopFlags> {
    override infix fun or(other: RemoteDesktopFlags): RemoteDesktopFlags = RemoteDesktopFlags(mask or other.mask)

    public companion object {
        /**
         * No options
         */
        public val NONE: RemoteDesktopFlags = RemoteDesktopFlags(XDP_REMOTE_DESKTOP_FLAG_NONE)

        /**
         * allow opening multiple streams
         */
        public val MULTIPLE: RemoteDesktopFlags =
            RemoteDesktopFlags(XDP_REMOTE_DESKTOP_FLAG_MULTIPLE)
    }
}
