// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInetSocketAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_inet_socket_address_get_address
import org.gtkkn.native.gio.g_inet_socket_address_get_flowinfo
import org.gtkkn.native.gio.g_inet_socket_address_get_port
import org.gtkkn.native.gio.g_inet_socket_address_get_scope_id
import org.gtkkn.native.gio.g_inet_socket_address_get_type
import org.gtkkn.native.gio.g_inet_socket_address_new
import org.gtkkn.native.gio.g_inet_socket_address_new_from_string
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * An IPv4 or IPv6 socket address. That is, the combination of a
 * [class@Gio.InetAddress] and a port number.
 *
 * In UNIX terms, `GInetSocketAddress` corresponds to a
 * [`struct sockaddr_in` or `struct sockaddr_in6`](man:sockaddr(3type)).
 */
public open class InetSocketAddress(public val gioInetSocketAddressPointer: CPointer<GInetSocketAddress>) :
    SocketAddress(gioInetSocketAddressPointer.reinterpret()),
    KGTyped {
    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = handle.reinterpret()

    /**
     * The address.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val address: InetAddress
        /**
         * Gets @address's #GInetAddress.
         *
         * @return the #GInetAddress for @address, which must be
         * g_object_ref()'d if it will be stored
         * @since 2.22
         */
        get() = g_inet_socket_address_get_address(gioInetSocketAddressPointer)!!.run {
            InetAddress(this)
        }

    /**
     * The `sin6_flowinfo` field, for IPv6 addresses.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open val flowinfo: guint
        /**
         * Gets the `sin6_flowinfo` field from @address,
         * which must be an IPv6 address.
         *
         * @return the flowinfo field
         * @since 2.32
         */
        get() = g_inet_socket_address_get_flowinfo(gioInetSocketAddressPointer)

    /**
     * The port.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val port: guint16
        /**
         * Gets @address's port.
         *
         * @return the port for @address
         * @since 2.22
         */
        get() = g_inet_socket_address_get_port(gioInetSocketAddressPointer)

    /**
     * The `sin6_scope_id` field, for IPv6 addresses.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open val scopeId: guint
        /**
         * Gets the `sin6_scope_id` field from @address,
         * which must be an IPv6 address.
         *
         * @return the scope id field
         * @since 2.32
         */
        get() = g_inet_socket_address_get_scope_id(gioInetSocketAddressPointer)

    /**
     * Creates a new #GInetSocketAddress for @address and @port.
     *
     * @param address a #GInetAddress
     * @param port a port number
     * @return a new #GInetSocketAddress
     * @since 2.22
     */
    public constructor(
        address: InetAddress,
        port: guint16,
    ) : this(g_inet_socket_address_new(address.gioInetAddressPointer, port)!!.reinterpret())

    /**
     * Creates a new #GInetSocketAddress for @address and @port.
     *
     * If @address is an IPv6 address, it can also contain a scope ID
     * (separated from the address by a `%`).
     *
     * @param address the string form of an IP address
     * @param port a port number
     * @return a new #GInetSocketAddress,
     * or null if @address cannot be parsed.
     * @since 2.40
     */
    public constructor(
        address: String,
        port: guint,
    ) : this(g_inet_socket_address_new_from_string(address, port)!!.reinterpret())

    public companion object : TypeCompanion<InetSocketAddress> {
        override val type: GeneratedClassKGType<InetSocketAddress> =
            GeneratedClassKGType(g_inet_socket_address_get_type()) { InetSocketAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of InetSocketAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_inet_socket_address_get_type()
    }
}
