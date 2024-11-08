// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_SCREENSHOT_FLAG_INTERACTIVE
import org.gtkkn.native.xdp.XDP_SCREENSHOT_FLAG_NONE
import org.gtkkn.native.xdp.XdpScreenshotFlags

public class ScreenshotFlags(
    public val mask: XdpScreenshotFlags,
) : Bitfield<ScreenshotFlags> {
    override infix fun or(other: ScreenshotFlags): ScreenshotFlags = ScreenshotFlags(mask or other.mask)

    public companion object {
        public val NONE: ScreenshotFlags = ScreenshotFlags(XDP_SCREENSHOT_FLAG_NONE)

        public val INTERACTIVE: ScreenshotFlags = ScreenshotFlags(XDP_SCREENSHOT_FLAG_INTERACTIVE)
    }
}
