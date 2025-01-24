// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GDBusProxyFlags
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_NONE
import org.gtkkn.native.gio.G_DBUS_PROXY_FLAGS_NO_MATCH_RULE
import org.gtkkn.native.gio.g_dbus_proxy_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used when constructing an instance of a #GDBusProxy derived class.
 * @since 2.26
 */
public class DBusProxyFlags(public val mask: GDBusProxyFlags) : Bitfield<DBusProxyFlags> {
    override infix fun or(other: DBusProxyFlags): DBusProxyFlags = DBusProxyFlags(mask or other.mask)

    @GioVersion2_26
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: DBusProxyFlags = DBusProxyFlags(G_DBUS_PROXY_FLAGS_NONE)

        /**
         * Don't load properties.
         */
        public val DO_NOT_LOAD_PROPERTIES: DBusProxyFlags =
            DBusProxyFlags(G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES)

        /**
         * Don't connect to signals on the remote object.
         */
        public val DO_NOT_CONNECT_SIGNALS: DBusProxyFlags =
            DBusProxyFlags(G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS)

        /**
         * If the proxy is for a well-known name,
         * do not ask the bus to launch an owner during proxy initialization or a method call.
         * This flag is only meaningful in proxies for well-known names.
         */
        public val DO_NOT_AUTO_START: DBusProxyFlags =
            DBusProxyFlags(G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START)

        /**
         * If set, the property value for any __invalidated property__ will be (asynchronously) retrieved upon receiving the [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties) D-Bus signal and the property will not cause emission of the #GDBusProxy::g-properties-changed signal. When the value is received the #GDBusProxy::g-properties-changed signal is emitted for the property along with the retrieved value. Since 2.32.
         */
        public val GET_INVALIDATED_PROPERTIES: DBusProxyFlags =
            DBusProxyFlags(G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES)

        /**
         * If the proxy is for a well-known name,
         * do not ask the bus to launch an owner during proxy initialization, but allow it to be
         * autostarted by a method call. This flag is only meaningful in proxies for well-known names,
         * and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also specified.
         */
        public val DO_NOT_AUTO_START_AT_CONSTRUCTION: DBusProxyFlags =
            DBusProxyFlags(G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION)

        /**
         * Don't actually send the AddMatch D-Bus
         *    call for this signal subscription. This gives you more control
         *    over which match rules you add (but you must add them manually). (Since: 2.72)
         */
        public val NO_MATCH_RULE: DBusProxyFlags = DBusProxyFlags(G_DBUS_PROXY_FLAGS_NO_MATCH_RULE)

        /**
         * Get the GType of DBusProxyFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_proxy_flags_get_type()
    }
}
