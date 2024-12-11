// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GMountMountFlags
import org.gtkkn.native.gio.G_MOUNT_MOUNT_NONE
import org.gtkkn.native.gio.g_mount_mount_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when mounting a mount.
 */
public class MountMountFlags(public val mask: GMountMountFlags) : Bitfield<MountMountFlags> {
    override infix fun or(other: MountMountFlags): MountMountFlags = MountMountFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: MountMountFlags = MountMountFlags(G_MOUNT_MOUNT_NONE)

        /**
         * Get the GType of MountMountFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_mount_mount_flags_get_type()
    }
}
