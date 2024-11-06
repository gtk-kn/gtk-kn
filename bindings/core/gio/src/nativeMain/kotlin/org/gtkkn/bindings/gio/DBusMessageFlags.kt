// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusMessageFlags
import org.gtkkn.native.gio.G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION
import org.gtkkn.native.gio.G_DBUS_MESSAGE_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_MESSAGE_FLAGS_NO_AUTO_START
import org.gtkkn.native.gio.G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED

/**
 * Message flags used in #GDBusMessage.
 * @since 2.26
 */
public class DBusMessageFlags(
    public val mask: GDBusMessageFlags,
) : Bitfield<DBusMessageFlags> {
    override infix fun or(other: DBusMessageFlags): DBusMessageFlags = DBusMessageFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusMessageFlags = DBusMessageFlags(G_DBUS_MESSAGE_FLAGS_NONE)

        /**
         * A reply is not expected.
         */
        public val NO_REPLY_EXPECTED: DBusMessageFlags =
            DBusMessageFlags(G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED)

        /**
         * The bus must not launch an
         * owner for the destination name in response to this message.
         */
        public val NO_AUTO_START: DBusMessageFlags =
            DBusMessageFlags(G_DBUS_MESSAGE_FLAGS_NO_AUTO_START)

        /**
         * If set on a method
         * call, this flag means that the caller is prepared to wait for interactive
         * authorization. Since 2.46.
         */
        public val ALLOW_INTERACTIVE_AUTHORIZATION: DBusMessageFlags =
            DBusMessageFlags(G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)
    }
}
