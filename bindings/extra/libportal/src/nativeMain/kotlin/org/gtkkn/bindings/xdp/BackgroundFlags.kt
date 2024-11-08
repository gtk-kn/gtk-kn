// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_BACKGROUND_FLAG_ACTIVATABLE
import org.gtkkn.native.xdp.XDP_BACKGROUND_FLAG_AUTOSTART
import org.gtkkn.native.xdp.XDP_BACKGROUND_FLAG_NONE
import org.gtkkn.native.xdp.XdpBackgroundFlags

/**
 * Options to use when requesting background.
 */
public class BackgroundFlags(
    public val mask: XdpBackgroundFlags,
) : Bitfield<BackgroundFlags> {
    override infix fun or(other: BackgroundFlags): BackgroundFlags = BackgroundFlags(mask or other.mask)

    public companion object {
        /**
         * No options
         */
        public val NONE: BackgroundFlags = BackgroundFlags(XDP_BACKGROUND_FLAG_NONE)

        /**
         * Request autostart as well
         */
        public val AUTOSTART: BackgroundFlags = BackgroundFlags(XDP_BACKGROUND_FLAG_AUTOSTART)

        /**
         * Whether the application is D-Bus-activatable
         */
        public val ACTIVATABLE: BackgroundFlags = BackgroundFlags(XDP_BACKGROUND_FLAG_ACTIVATABLE)
    }
}
