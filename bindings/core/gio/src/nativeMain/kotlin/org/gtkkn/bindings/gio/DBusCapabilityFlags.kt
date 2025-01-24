// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusCapabilityFlags
import org.gtkkn.native.gio.G_DBUS_CAPABILITY_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING
import org.gtkkn.native.gio.g_dbus_capability_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Capabilities negotiated with the remote peer.
 * @since 2.26
 */
public class DBusCapabilityFlags(public val mask: GDBusCapabilityFlags) : Bitfield<DBusCapabilityFlags> {
    override infix fun or(other: DBusCapabilityFlags): DBusCapabilityFlags = DBusCapabilityFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusCapabilityFlags = DBusCapabilityFlags(G_DBUS_CAPABILITY_FLAGS_NONE)

        /**
         * The connection
         * supports exchanging UNIX file descriptors with the remote peer.
         */
        public val UNIX_FD_PASSING: DBusCapabilityFlags =
            DBusCapabilityFlags(G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING)

        /**
         * Get the GType of DBusCapabilityFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_capability_flags_get_type()
    }
}
