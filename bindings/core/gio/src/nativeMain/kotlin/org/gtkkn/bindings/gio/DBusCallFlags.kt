// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusCallFlags
import org.gtkkn.native.gio.G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION
import org.gtkkn.native.gio.G_DBUS_CALL_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_CALL_FLAGS_NO_AUTO_START
import org.gtkkn.native.gio.g_dbus_call_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used in g_dbus_connection_call() and similar APIs.
 * @since 2.26
 */
public class DBusCallFlags(public val mask: GDBusCallFlags) : Bitfield<DBusCallFlags> {
    override infix fun or(other: DBusCallFlags): DBusCallFlags = DBusCallFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusCallFlags = DBusCallFlags(G_DBUS_CALL_FLAGS_NONE)

        /**
         * The bus must not launch
         * an owner for the destination name in response to this method
         * invocation.
         */
        public val NO_AUTO_START: DBusCallFlags = DBusCallFlags(G_DBUS_CALL_FLAGS_NO_AUTO_START)

        /**
         * the caller is prepared to
         * wait for interactive authorization. Since 2.46.
         */
        public val ALLOW_INTERACTIVE_AUTHORIZATION: DBusCallFlags =
            DBusCallFlags(G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION)

        /**
         * Get the GType of DBusCallFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_call_flags_get_type()
    }
}
