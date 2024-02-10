// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusSendMessageFlags
import org.gtkkn.native.gio.G_DBUS_SEND_MESSAGE_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL

/**
 * Flags used when sending #GDBusMessages on a #GDBusConnection.
 * @since 2.26
 */
public class DBusSendMessageFlags(
    public val mask: GDBusSendMessageFlags,
) : Bitfield<DBusSendMessageFlags> {
    override infix fun or(other: DBusSendMessageFlags): DBusSendMessageFlags = DBusSendMessageFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusSendMessageFlags = DBusSendMessageFlags(G_DBUS_SEND_MESSAGE_FLAGS_NONE)

        /**
         * Do not automatically
         * assign a serial number from the #GDBusConnection object when
         * sending a message.
         */
        public val PRESERVE_SERIAL: DBusSendMessageFlags =
            DBusSendMessageFlags(G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL)
    }
}
