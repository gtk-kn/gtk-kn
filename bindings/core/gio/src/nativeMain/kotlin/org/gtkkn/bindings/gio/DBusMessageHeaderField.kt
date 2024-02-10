// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDBusMessageHeaderField
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INVALID
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_MEMBER
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_PATH
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SENDER
import org.gtkkn.native.gio.GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE

/**
 * Header fields used in #GDBusMessage.
 * @since 2.26
 */
public enum class DBusMessageHeaderField(
    public val nativeValue: GDBusMessageHeaderField,
) {
    /**
     * Not a valid header field.
     */
    INVALID(G_DBUS_MESSAGE_HEADER_FIELD_INVALID),

    /**
     * The object path.
     */
    PATH(G_DBUS_MESSAGE_HEADER_FIELD_PATH),

    /**
     * The interface name.
     */
    INTERFACE(G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE),

    /**
     * The method or signal name.
     */
    MEMBER(G_DBUS_MESSAGE_HEADER_FIELD_MEMBER),

    /**
     * The name of the error that occurred.
     */
    ERROR_NAME(G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME),

    /**
     * The serial number the message is a reply to.
     */
    REPLY_SERIAL(G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL),

    /**
     * The name the message is intended for.
     */
    DESTINATION(G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION),

    /**
     * Unique name of the sender of the message (filled in by the bus).
     */
    SENDER(G_DBUS_MESSAGE_HEADER_FIELD_SENDER),

    /**
     * The signature of the message body.
     */
    SIGNATURE(G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE),

    /**
     * The number of UNIX file descriptors that accompany the message.
     */
    NUM_UNIX_FDS(G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusMessageHeaderField): DBusMessageHeaderField =
            when (nativeValue) {
                G_DBUS_MESSAGE_HEADER_FIELD_INVALID -> INVALID
                G_DBUS_MESSAGE_HEADER_FIELD_PATH -> PATH
                G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE -> INTERFACE
                G_DBUS_MESSAGE_HEADER_FIELD_MEMBER -> MEMBER
                G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME -> ERROR_NAME
                G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL -> REPLY_SERIAL
                G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION -> DESTINATION
                G_DBUS_MESSAGE_HEADER_FIELD_SENDER -> SENDER
                G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE -> SIGNATURE
                G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS -> NUM_UNIX_FDS
                else -> error("invalid nativeValue")
            }
    }
}
