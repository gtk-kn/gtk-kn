// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusServerFlags
import org.gtkkn.native.gio.G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS
import org.gtkkn.native.gio.G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER
import org.gtkkn.native.gio.G_DBUS_SERVER_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_SERVER_FLAGS_RUN_IN_THREAD

/**
 * Flags used when creating a #GDBusServer.
 * @since 2.26
 */
public class DBusServerFlags(
    public val mask: GDBusServerFlags,
) : Bitfield<DBusServerFlags> {
    override infix fun or(other: DBusServerFlags): DBusServerFlags = DBusServerFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusServerFlags = DBusServerFlags(G_DBUS_SERVER_FLAGS_NONE)

        /**
         * All #GDBusServer::new-connection
         * signals will run in separated dedicated threads (see signal for
         * details).
         */
        public val RUN_IN_THREAD: DBusServerFlags =
            DBusServerFlags(G_DBUS_SERVER_FLAGS_RUN_IN_THREAD)

        /**
         * Allow the anonymous
         * authentication method.
         */
        public val AUTHENTICATION_ALLOW_ANONYMOUS: DBusServerFlags =
            DBusServerFlags(G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS)

        /**
         * Require the UID of the
         * peer to be the same as the UID of the server when authenticating. (Since: 2.68)
         */
        public val AUTHENTICATION_REQUIRE_SAME_USER: DBusServerFlags =
            DBusServerFlags(G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER)
    }
}
