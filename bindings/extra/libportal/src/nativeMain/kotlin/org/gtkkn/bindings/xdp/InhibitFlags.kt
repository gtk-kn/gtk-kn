// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_INHIBIT_FLAG_IDLE
import org.gtkkn.native.xdp.XDP_INHIBIT_FLAG_LOGOUT
import org.gtkkn.native.xdp.XDP_INHIBIT_FLAG_SUSPEND
import org.gtkkn.native.xdp.XDP_INHIBIT_FLAG_USER_SWITCH
import org.gtkkn.native.xdp.XdpInhibitFlags

/**
 * Flags that determine what session status changes are inhibited.
 */
public class InhibitFlags(
    public val mask: XdpInhibitFlags,
) : Bitfield<InhibitFlags> {
    override infix fun or(other: InhibitFlags): InhibitFlags = InhibitFlags(mask or other.mask)

    public companion object {
        /**
         * Inhibit logout
         */
        public val LOGOUT: InhibitFlags = InhibitFlags(XDP_INHIBIT_FLAG_LOGOUT)

        /**
         * Inhibit user switching
         */
        public val USER_SWITCH: InhibitFlags = InhibitFlags(XDP_INHIBIT_FLAG_USER_SWITCH)

        /**
         * Inhibit suspend
         */
        public val SUSPEND: InhibitFlags = InhibitFlags(XDP_INHIBIT_FLAG_SUSPEND)

        /**
         * Inhibit the session going idle
         */
        public val IDLE: InhibitFlags = InhibitFlags(XDP_INHIBIT_FLAG_IDLE)
    }
}
