// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusConnectionFlags
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION
import org.gtkkn.native.gio.G_DBUS_CONNECTION_FLAGS_NONE

/**
 * Flags used when creating a new #GDBusConnection.
 * @since 2.26
 */
public class DBusConnectionFlags(
    public val mask: GDBusConnectionFlags,
) : Bitfield<DBusConnectionFlags> {
    override infix fun or(other: DBusConnectionFlags): DBusConnectionFlags = DBusConnectionFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusConnectionFlags = DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_NONE)

        /**
         * Perform authentication against server.
         */
        public val AUTHENTICATION_CLIENT: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT)

        /**
         * Perform authentication against client.
         */
        public val AUTHENTICATION_SERVER: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER)

        /**
         * When
         * authenticating as a server, allow the anonymous authentication
         * method.
         */
        public val AUTHENTICATION_ALLOW_ANONYMOUS: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS)

        /**
         * Pass this flag if connecting to a peer that is a
         * message bus. This means that the Hello() method will be invoked as part of the connection
         * setup.
         */
        public val MESSAGE_BUS_CONNECTION: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION)

        /**
         * If set, processing of D-Bus messages is
         * delayed until g_dbus_connection_start_message_processing() is called.
         */
        public val DELAY_MESSAGE_PROCESSING: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING)

        /**
         * When authenticating
         * as a server, require the UID of the peer to be the same as the UID of the server. (Since:
         * 2.68)
         */
        public val AUTHENTICATION_REQUIRE_SAME_USER: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER)

        /**
         * When authenticating, try to use
         *  protocols that work across a Linux user namespace boundary, even if this
         *  reduces interoperability with older D-Bus implementations. This currently
         *  affects client-side `EXTERNAL` authentication, for which this flag makes
         *  connections to a server in another user namespace succeed, but causes
         *  a deadlock when connecting to a GDBus server older than 2.73.3. Since: 2.74
         */
        public val CROSS_NAMESPACE: DBusConnectionFlags =
            DBusConnectionFlags(G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE)
    }
}
