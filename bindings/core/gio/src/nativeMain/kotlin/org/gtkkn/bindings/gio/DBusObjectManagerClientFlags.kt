// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusObjectManagerClientFlags
import org.gtkkn.native.gio.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START
import org.gtkkn.native.gio.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE
import org.gtkkn.native.gio.g_dbus_object_manager_client_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when constructing a #GDBusObjectManagerClient.
 * @since 2.30
 */
public class DBusObjectManagerClientFlags(public val mask: GDBusObjectManagerClientFlags) :
    Bitfield<DBusObjectManagerClientFlags> {
    override infix fun or(other: DBusObjectManagerClientFlags): DBusObjectManagerClientFlags =
        DBusObjectManagerClientFlags(
            mask or other.mask
        )

    @GioVersion2_30
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusObjectManagerClientFlags =
            DBusObjectManagerClientFlags(G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE)

        /**
         * If not set and the
         *   manager is for a well-known name, then request the bus to launch
         *   an owner for the name if no-one owns the name. This flag can only
         *   be used in managers for well-known names.
         */
        public val DO_NOT_AUTO_START: DBusObjectManagerClientFlags =
            DBusObjectManagerClientFlags(G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START)

        /**
         * Get the GType of DBusObjectManagerClientFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_manager_client_flags_get_type()
    }
}
