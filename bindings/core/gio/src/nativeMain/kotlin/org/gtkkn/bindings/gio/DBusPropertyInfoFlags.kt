// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusPropertyInfoFlags
import org.gtkkn.native.gio.G_DBUS_PROPERTY_INFO_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_PROPERTY_INFO_FLAGS_READABLE
import org.gtkkn.native.gio.G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE

/**
 * Flags describing the access control of a D-Bus property.
 * @since 2.26
 */
public class DBusPropertyInfoFlags(
    public val mask: GDBusPropertyInfoFlags,
) : Bitfield<DBusPropertyInfoFlags> {
    override infix fun or(other: DBusPropertyInfoFlags): DBusPropertyInfoFlags =
        DBusPropertyInfoFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusPropertyInfoFlags =
            DBusPropertyInfoFlags(G_DBUS_PROPERTY_INFO_FLAGS_NONE)

        /**
         * Property is readable.
         */
        public val READABLE: DBusPropertyInfoFlags =
            DBusPropertyInfoFlags(G_DBUS_PROPERTY_INFO_FLAGS_READABLE)

        /**
         * Property is writable.
         */
        public val WRITABLE: DBusPropertyInfoFlags =
            DBusPropertyInfoFlags(G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE)
    }
}
