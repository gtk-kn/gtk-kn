// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.native.gio.GDBusMessageByteOrder
import org.gtkkn.native.gio.g_dbus_message_byte_order_get_type
import org.gtkkn.native.gobject.GType

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 * @since 2.26
 */
@GioVersion2_26
public enum class DBusMessageByteOrder(public val nativeValue: GDBusMessageByteOrder) {
    /**
     * The byte order is big endian.
     */
    BIG_ENDIAN(GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN),

    /**
     * The byte order is little endian.
     */
    LITTLE_ENDIAN(GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusMessageByteOrder): DBusMessageByteOrder = when (nativeValue) {
            GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN -> BIG_ENDIAN
            GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN -> LITTLE_ENDIAN
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DBusMessageByteOrder
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_message_byte_order_get_type()
    }
}
