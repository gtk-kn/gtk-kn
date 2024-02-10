// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDBusMessageType
import org.gtkkn.native.gio.GDBusMessageType.G_DBUS_MESSAGE_TYPE_ERROR
import org.gtkkn.native.gio.GDBusMessageType.G_DBUS_MESSAGE_TYPE_INVALID
import org.gtkkn.native.gio.GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_CALL
import org.gtkkn.native.gio.GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_RETURN
import org.gtkkn.native.gio.GDBusMessageType.G_DBUS_MESSAGE_TYPE_SIGNAL

/**
 * Message types used in #GDBusMessage.
 * @since 2.26
 */
public enum class DBusMessageType(
    public val nativeValue: GDBusMessageType,
) {
    /**
     * Message is of invalid type.
     */
    INVALID(G_DBUS_MESSAGE_TYPE_INVALID),

    /**
     * Method call.
     */
    METHOD_CALL(G_DBUS_MESSAGE_TYPE_METHOD_CALL),

    /**
     * Method reply.
     */
    METHOD_RETURN(G_DBUS_MESSAGE_TYPE_METHOD_RETURN),

    /**
     * Error reply.
     */
    ERROR(G_DBUS_MESSAGE_TYPE_ERROR),

    /**
     * Signal emission.
     */
    SIGNAL(G_DBUS_MESSAGE_TYPE_SIGNAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusMessageType): DBusMessageType =
            when (nativeValue) {
                G_DBUS_MESSAGE_TYPE_INVALID -> INVALID
                G_DBUS_MESSAGE_TYPE_METHOD_CALL -> METHOD_CALL
                G_DBUS_MESSAGE_TYPE_METHOD_RETURN -> METHOD_RETURN
                G_DBUS_MESSAGE_TYPE_ERROR -> ERROR
                G_DBUS_MESSAGE_TYPE_SIGNAL -> SIGNAL
                else -> error("invalid nativeValue")
            }
    }
}
