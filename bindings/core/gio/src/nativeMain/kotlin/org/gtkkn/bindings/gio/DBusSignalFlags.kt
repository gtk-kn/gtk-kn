// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusSignalFlags
import org.gtkkn.native.gio.G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE
import org.gtkkn.native.gio.G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH
import org.gtkkn.native.gio.G_DBUS_SIGNAL_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE

/**
 * Flags used when subscribing to signals via g_dbus_connection_signal_subscribe().
 * @since 2.26
 */
public class DBusSignalFlags(
    public val mask: GDBusSignalFlags,
) : Bitfield<DBusSignalFlags> {
    override infix fun or(other: DBusSignalFlags): DBusSignalFlags = DBusSignalFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusSignalFlags = DBusSignalFlags(G_DBUS_SIGNAL_FLAGS_NONE)

        /**
         * Don't actually send the AddMatch
         * D-Bus call for this signal subscription.  This gives you more control
         * over which match rules you add (but you must add them manually).
         */
        public val NO_MATCH_RULE: DBusSignalFlags =
            DBusSignalFlags(G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE)

        /**
         * Match first arguments that
         * contain a bus or interface name with the given namespace.
         */
        public val MATCH_ARG0_NAMESPACE: DBusSignalFlags =
            DBusSignalFlags(G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE)

        /**
         * Match first arguments that
         * contain an object path that is either equivalent to the given path,
         * or one of the paths is a subpath of the other.
         */
        public val MATCH_ARG0_PATH: DBusSignalFlags =
            DBusSignalFlags(G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH)
    }
}
