// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GMountUnmountFlags
import org.gtkkn.native.gio.G_MOUNT_UNMOUNT_FORCE
import org.gtkkn.native.gio.G_MOUNT_UNMOUNT_NONE

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags(
    public val mask: GMountUnmountFlags,
) : Bitfield<MountUnmountFlags> {
    override infix fun or(other: MountUnmountFlags): MountUnmountFlags = MountUnmountFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: MountUnmountFlags = MountUnmountFlags(G_MOUNT_UNMOUNT_NONE)

        /**
         * Unmount even if there are outstanding
         *  file operations on the mount.
         */
        public val FORCE: MountUnmountFlags = MountUnmountFlags(G_MOUNT_UNMOUNT_FORCE)
    }
}
