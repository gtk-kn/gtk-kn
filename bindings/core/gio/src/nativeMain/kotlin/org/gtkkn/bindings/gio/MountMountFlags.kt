// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GMountMountFlags
import org.gtkkn.native.gio.G_MOUNT_MOUNT_NONE

/**
 * Flags used when mounting a mount.
 */
public class MountMountFlags(
    public val mask: GMountMountFlags,
) : Bitfield<MountMountFlags> {
    override infix fun or(other: MountMountFlags): MountMountFlags = MountMountFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: MountMountFlags = MountMountFlags(G_MOUNT_MOUNT_NONE)
    }
}
