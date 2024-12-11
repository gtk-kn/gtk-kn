// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.native.gio.GDBusMessageHeaderField
import org.gtkkn.native.gio.g_dbus_message_header_field_get_type
import org.gtkkn.native.gobject.GType

/**
 * Header fields used in #GDBusMessage.
 * @since 2.26
 */
@GioVersion2_26
public enum class DBusMessageHeaderField(public val nativeValue: GDBusMessageHeaderField) {
    /**
     * Not a valid header field.
     */
    INVALID(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INVALID),

    /**
     * The object path.
     */
    PATH(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_PATH),

    /**
     * The interface name.
     */
    INTERFACE(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE),

    /**
     * The method or signal name.
     */
    MEMBER(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_MEMBER),

    /**
     * The name of the error that occurred.
     */
    ERROR_NAME(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME),

    /**
     * The serial number the message is a reply to.
     */
    REPLY_SERIAL(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL),

    /**
     * The name the message is intended for.
     */
    DESTINATION(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION),

    /**
     * Unique name of the sender of the message (filled in by the bus).
     */
    SENDER(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SENDER),

    /**
     * The signature of the message body.
     */
    SIGNATURE(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE),

    /**
     * The number of UNIX file descriptors that accompany the message.
     */
    NUM_UNIX_FDS(GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusMessageHeaderField): DBusMessageHeaderField = when (nativeValue) {
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INVALID -> INVALID
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_PATH -> PATH
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE -> INTERFACE
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_MEMBER -> MEMBER
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME -> ERROR_NAME
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL -> REPLY_SERIAL
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION -> DESTINATION
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SENDER -> SENDER
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE -> SIGNATURE
            GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS -> NUM_UNIX_FDS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DBusMessageHeaderField
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_message_header_field_get_type()
    }
}
