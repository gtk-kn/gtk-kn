// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusInterfaceSkeletonFlags
import org.gtkkn.native.gio.G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD
import org.gtkkn.native.gio.G_DBUS_INTERFACE_SKELETON_FLAGS_NONE
import org.gtkkn.native.gio.g_dbus_interface_skeleton_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags describing the behavior of a #GDBusInterfaceSkeleton instance.
 * @since 2.30
 */
public class DBusInterfaceSkeletonFlags(public val mask: GDBusInterfaceSkeletonFlags) :
    Bitfield<DBusInterfaceSkeletonFlags> {
    override infix fun or(other: DBusInterfaceSkeletonFlags): DBusInterfaceSkeletonFlags = DBusInterfaceSkeletonFlags(
        mask or other.mask
    )

    @GioVersion2_30
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusInterfaceSkeletonFlags =
            DBusInterfaceSkeletonFlags(G_DBUS_INTERFACE_SKELETON_FLAGS_NONE)

        /**
         * Each method invocation is handled in
         *   a thread dedicated to the invocation. This means that the method implementation can use blocking IO
         *   without blocking any other part of the process. It also means that the method implementation must
         *   use locking to access data structures used by other threads.
         */
        public val HANDLE_METHOD_INVOCATIONS_IN_THREAD: DBusInterfaceSkeletonFlags =
            DBusInterfaceSkeletonFlags(G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD)

        /**
         * Get the GType of DBusInterfaceSkeletonFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_interface_skeleton_flags_get_type()
    }
}
