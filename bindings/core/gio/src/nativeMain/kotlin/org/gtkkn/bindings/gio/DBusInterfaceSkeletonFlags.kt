// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusInterfaceSkeletonFlags
import org.gtkkn.native.gio.G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD
import org.gtkkn.native.gio.G_DBUS_INTERFACE_SKELETON_FLAGS_NONE

/**
 * Flags describing the behavior of a #GDBusInterfaceSkeleton instance.
 * @since 2.30
 */
public class DBusInterfaceSkeletonFlags(
    public val mask: GDBusInterfaceSkeletonFlags,
) : Bitfield<DBusInterfaceSkeletonFlags> {
    override infix fun or(other: DBusInterfaceSkeletonFlags): DBusInterfaceSkeletonFlags =
        DBusInterfaceSkeletonFlags(
            mask or other.mask
        )

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
    }
}
