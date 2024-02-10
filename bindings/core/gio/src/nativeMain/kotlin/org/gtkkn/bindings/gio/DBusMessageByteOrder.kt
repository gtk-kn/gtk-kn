// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDBusMessageByteOrder
import org.gtkkn.native.gio.GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN
import org.gtkkn.native.gio.GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 * @since 2.26
 */
public enum class DBusMessageByteOrder(
    public val nativeValue: GDBusMessageByteOrder,
) {
    /**
     * The byte order is big endian.
     */
    BIG_ENDIAN(G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN),

    /**
     * The byte order is little endian.
     */
    LITTLE_ENDIAN(G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDBusMessageByteOrder): DBusMessageByteOrder =
            when (nativeValue) {
                G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN -> BIG_ENDIAN
                G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN -> LITTLE_ENDIAN
                else -> error("invalid nativeValue")
            }
    }
}
