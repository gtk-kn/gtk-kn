// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusSubtreeFlags
import org.gtkkn.native.gio.G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES
import org.gtkkn.native.gio.G_DBUS_SUBTREE_FLAGS_NONE
import org.gtkkn.native.gio.g_dbus_subtree_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags passed to g_dbus_connection_register_subtree().
 * @since 2.26
 */
public class DBusSubtreeFlags(public val mask: GDBusSubtreeFlags) : Bitfield<DBusSubtreeFlags> {
    override infix fun or(other: DBusSubtreeFlags): DBusSubtreeFlags = DBusSubtreeFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusSubtreeFlags = DBusSubtreeFlags(G_DBUS_SUBTREE_FLAGS_NONE)

        /**
         * Method calls to objects not in the enumerated range
         *                                                       will still be dispatched. This is useful if you want
         *                                                       to dynamically spawn objects in the subtree.
         */
        public val DISPATCH_TO_UNENUMERATED_NODES: DBusSubtreeFlags =
            DBusSubtreeFlags(G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES)

        /**
         * Get the GType of DBusSubtreeFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_subtree_flags_get_type()
    }
}
