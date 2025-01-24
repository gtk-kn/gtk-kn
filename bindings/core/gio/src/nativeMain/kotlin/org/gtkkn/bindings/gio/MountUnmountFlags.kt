// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GMountUnmountFlags
import org.gtkkn.native.gio.G_MOUNT_UNMOUNT_FORCE
import org.gtkkn.native.gio.G_MOUNT_UNMOUNT_NONE
import org.gtkkn.native.gio.g_mount_unmount_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags(public val mask: GMountUnmountFlags) : Bitfield<MountUnmountFlags> {
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

        /**
         * Get the GType of MountUnmountFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_mount_unmount_flags_get_type()
    }
}
