// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_SPAWN_FLAG_CLEARENV
import org.gtkkn.native.xdp.XDP_SPAWN_FLAG_LATEST
import org.gtkkn.native.xdp.XDP_SPAWN_FLAG_NONE
import org.gtkkn.native.xdp.XDP_SPAWN_FLAG_NO_NETWORK
import org.gtkkn.native.xdp.XDP_SPAWN_FLAG_SANDBOX
import org.gtkkn.native.xdp.XDP_SPAWN_FLAG_WATCH
import org.gtkkn.native.xdp.XdpSpawnFlags

/**
 * Flags influencing the spawn operation and how the
 * new sandbox is created.
 */
public class SpawnFlags(
    public val mask: XdpSpawnFlags,
) : Bitfield<SpawnFlags> {
    override infix fun or(other: SpawnFlags): SpawnFlags = SpawnFlags(mask or other.mask)

    public companion object {
        /**
         * No flags
         */
        public val NONE: SpawnFlags = SpawnFlags(XDP_SPAWN_FLAG_NONE)

        /**
         * Clear the environment
         */
        public val CLEARENV: SpawnFlags = SpawnFlags(XDP_SPAWN_FLAG_CLEARENV)

        /**
         * Spawn the latest version of the app
         */
        public val LATEST: SpawnFlags = SpawnFlags(XDP_SPAWN_FLAG_LATEST)

        /**
         * Spawn in a sandbox (equivalent to the --sandbox option of flatpak run)
         */
        public val SANDBOX: SpawnFlags = SpawnFlags(XDP_SPAWN_FLAG_SANDBOX)

        /**
         * Spawn without network (equivalent to the --unshare=network option of flatpak run)
         */
        public val NO_NETWORK: SpawnFlags = SpawnFlags(XDP_SPAWN_FLAG_NO_NETWORK)

        /**
         * Kill the sandbox when the caller disappears from the session bus
         */
        public val WATCH: SpawnFlags = SpawnFlags(XDP_SPAWN_FLAG_WATCH)
    }
}
