// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.native.gio.GDBusMessageType
import org.gtkkn.native.gio.g_dbus_message_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Message types used in #GDBusMessage.
 * @since 2.26
 */
@GioVersion2_26
public enum class DBusMessageType(public val nativeValue: GDBusMessageType) {
    /**
     * Message is of invalid type.
     */
    INVALID(GDBusMessageType.G_DBUS_MESSAGE_TYPE_INVALID),

    /**
     * Method call.
     */
    METHOD_CALL(GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_CALL),

    /**
     * Method reply.
     */
    METHOD_RETURN(GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_RETURN),

    /**
     * Error reply.
     */
    ERROR(GDBusMessageType.G_DBUS_MESSAGE_TYPE_ERROR),

    /**
     * Signal emission.
     */
    SIGNAL(GDBusMessageType.G_DBUS_MESSAGE_TYPE_SIGNAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusMessageType): DBusMessageType = when (nativeValue) {
            GDBusMessageType.G_DBUS_MESSAGE_TYPE_INVALID -> INVALID
            GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_CALL -> METHOD_CALL
            GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_RETURN -> METHOD_RETURN
            GDBusMessageType.G_DBUS_MESSAGE_TYPE_ERROR -> ERROR
            GDBusMessageType.G_DBUS_MESSAGE_TYPE_SIGNAL -> SIGNAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DBusMessageType
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_message_type_get_type()
    }
}
