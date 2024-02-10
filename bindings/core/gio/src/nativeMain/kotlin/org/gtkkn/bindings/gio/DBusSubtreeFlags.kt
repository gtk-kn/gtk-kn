// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusSubtreeFlags
import org.gtkkn.native.gio.G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES
import org.gtkkn.native.gio.G_DBUS_SUBTREE_FLAGS_NONE

/**
 * Flags passed to g_dbus_connection_register_subtree().
 * @since 2.26
 */
public class DBusSubtreeFlags(
    public val mask: GDBusSubtreeFlags,
) : Bitfield<DBusSubtreeFlags> {
    override infix fun or(other: DBusSubtreeFlags): DBusSubtreeFlags = DBusSubtreeFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusSubtreeFlags = DBusSubtreeFlags(G_DBUS_SUBTREE_FLAGS_NONE)

        /**
         * Method calls to objects not in the enumerated range
         *                                                       will still be dispatched. This is
         * useful if you want
         *                                                       to dynamically spawn objects in the
         * subtree.
         */
        public val DISPATCH_TO_UNENUMERATED_NODES: DBusSubtreeFlags =
            DBusSubtreeFlags(G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES)
    }
}
