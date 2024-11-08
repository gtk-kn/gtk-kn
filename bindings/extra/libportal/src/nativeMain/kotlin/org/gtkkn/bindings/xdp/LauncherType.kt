// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_LAUNCHER_APPLICATION
import org.gtkkn.native.xdp.XDP_LAUNCHER_WEBAPP
import org.gtkkn.native.xdp.XdpLauncherType

/**
 * The type of a launcher.
 */
public class LauncherType(
    public val mask: XdpLauncherType,
) : Bitfield<LauncherType> {
    override infix fun or(other: LauncherType): LauncherType = LauncherType(mask or other.mask)

    public companion object {
        /**
         * a launcher for a regular application
         */
        public val APPLICATION: LauncherType = LauncherType(XDP_LAUNCHER_APPLICATION)

        /**
         * a launcher for a web app
         */
        public val WEBAPP: LauncherType = LauncherType(XDP_LAUNCHER_WEBAPP)
    }
}
