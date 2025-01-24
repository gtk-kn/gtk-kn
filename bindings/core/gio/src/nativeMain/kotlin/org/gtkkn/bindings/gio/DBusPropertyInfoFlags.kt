// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusPropertyInfoFlags
import org.gtkkn.native.gio.G_DBUS_PROPERTY_INFO_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_PROPERTY_INFO_FLAGS_READABLE
import org.gtkkn.native.gio.G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE
import org.gtkkn.native.gio.g_dbus_property_info_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags describing the access control of a D-Bus property.
 * @since 2.26
 */
public class DBusPropertyInfoFlags(public val mask: GDBusPropertyInfoFlags) : Bitfield<DBusPropertyInfoFlags> {
    override infix fun or(other: DBusPropertyInfoFlags): DBusPropertyInfoFlags = DBusPropertyInfoFlags(
        mask or other.mask
    )

    @GioVersion2_26
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

        /**
         * Get the GType of DBusPropertyInfoFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_property_info_flags_get_type()
    }
}
