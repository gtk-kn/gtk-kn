// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInetAddress
import org.gtkkn.native.gio.g_inet_address_equal
import org.gtkkn.native.gio.g_inet_address_get_family
import org.gtkkn.native.gio.g_inet_address_get_is_any
import org.gtkkn.native.gio.g_inet_address_get_is_link_local
import org.gtkkn.native.gio.g_inet_address_get_is_loopback
import org.gtkkn.native.gio.g_inet_address_get_is_mc_global
import org.gtkkn.native.gio.g_inet_address_get_is_mc_link_local
import org.gtkkn.native.gio.g_inet_address_get_is_mc_node_local
import org.gtkkn.native.gio.g_inet_address_get_is_mc_org_local
import org.gtkkn.native.gio.g_inet_address_get_is_mc_site_local
import org.gtkkn.native.gio.g_inet_address_get_is_multicast
import org.gtkkn.native.gio.g_inet_address_get_is_site_local
import org.gtkkn.native.gio.g_inet_address_get_native_size
import org.gtkkn.native.gio.g_inet_address_get_type
import org.gtkkn.native.gio.g_inet_address_new_any
import org.gtkkn.native.gio.g_inet_address_new_from_string
import org.gtkkn.native.gio.g_inet_address_new_loopback
import org.gtkkn.native.gio.g_inet_address_to_string
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * `GInetAddress` represents an IPv4 or IPv6 internet address. Use
 * [method@Gio.Resolver.lookup_by_name] or
 * [method@Gio.Resolver.lookup_by_name_async] to look up the `GInetAddress` for
 * a hostname. Use [method@Gio.Resolver.lookup_by_address] or
 * [method@Gio.Resolver.lookup_by_address_async] to look up the hostname for a
 * `GInetAddress`.
 *
 * To actually connect to a remote host, you will need a
 * [class@Gio.InetSocketAddress] (which includes a `GInetAddress` as well as a
 * port number).
 *
 * ## Skipped during bindings generation
 *
 * - method `to_bytes`: Return type guint8 is not supported
 * - method `bytes`: Property has no getter nor setter
 * - parameter `bytes`: Array parameter of type guint8 is not supported
 */
public open class InetAddress(public val gioInetAddressPointer: CPointer<GInetAddress>) :
    Object(gioInetAddressPointer.reinterpret()),
    KGTyped {
    /**
     * The address family (IPv4 or IPv6).
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val family: SocketFamily
        /**
         * Gets @address's family
         *
         * @return @address's family
         * @since 2.22
         */
        get() = g_inet_address_get_family(gioInetAddressPointer).run {
            SocketFamily.fromNativeValue(this)
        }

    /**
     * Whether this is the "any" address for its family.
     * See g_inet_address_get_is_any().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isAny: Boolean
        /**
         * Tests whether @address is the "any" address for its family.
         *
         * @return true if @address is the "any" address for its family.
         * @since 2.22
         */
        get() = g_inet_address_get_is_any(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a link-local address.
     * See g_inet_address_get_is_link_local().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isLinkLocal: Boolean
        /**
         * Tests whether @address is a link-local address (that is, if it
         * identifies a host on a local network that is not connected to the
         * Internet).
         *
         * @return true if @address is a link-local address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_link_local(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is the loopback address for its family.
     * See g_inet_address_get_is_loopback().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isLoopback: Boolean
        /**
         * Tests whether @address is the loopback address for its family.
         *
         * @return true if @address is the loopback address for its family.
         * @since 2.22
         */
        get() = g_inet_address_get_is_loopback(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a global multicast address.
     * See g_inet_address_get_is_mc_global().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isMcGlobal: Boolean
        /**
         * Tests whether @address is a global multicast address.
         *
         * @return true if @address is a global multicast address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_mc_global(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a link-local multicast address.
     * See g_inet_address_get_is_mc_link_local().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isMcLinkLocal: Boolean
        /**
         * Tests whether @address is a link-local multicast address.
         *
         * @return true if @address is a link-local multicast address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_mc_link_local(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a node-local multicast address.
     * See g_inet_address_get_is_mc_node_local().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isMcNodeLocal: Boolean
        /**
         * Tests whether @address is a node-local multicast address.
         *
         * @return true if @address is a node-local multicast address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_mc_node_local(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is an organization-local multicast address.
     * See g_inet_address_get_is_mc_org_local().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isMcOrgLocal: Boolean
        /**
         * Tests whether @address is an organization-local multicast address.
         *
         * @return true if @address is an organization-local multicast address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_mc_org_local(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a site-local multicast address.
     * See g_inet_address_get_is_mc_site_local().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isMcSiteLocal: Boolean
        /**
         * Tests whether @address is a site-local multicast address.
         *
         * @return true if @address is a site-local multicast address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_mc_site_local(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a multicast address.
     * See g_inet_address_get_is_multicast().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isMulticast: Boolean
        /**
         * Tests whether @address is a multicast address.
         *
         * @return true if @address is a multicast address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_multicast(gioInetAddressPointer).asBoolean()

    /**
     * Whether this is a site-local address.
     * See g_inet_address_get_is_loopback().
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val isSiteLocal: Boolean
        /**
         * Tests whether @address is a site-local address such as 10.0.0.1
         * (that is, the address identifies a host on a local network that can
         * not be reached directly from the Internet, but which may have
         * outgoing Internet connectivity via a NAT or firewall).
         *
         * @return true if @address is a site-local address.
         * @since 2.22
         */
        get() = g_inet_address_get_is_site_local(gioInetAddressPointer).asBoolean()

    /**
     * Creates a #GInetAddress for the "any" address (unassigned/"don't
     * care") for @family.
     *
     * @param family the address family
     * @return a new #GInetAddress corresponding to the "any" address
     * for @family.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    public constructor(family: SocketFamily) : this(g_inet_address_new_any(family.nativeValue)!!.reinterpret())

    /**
     * Parses @string as an IP address and creates a new #GInetAddress.
     *
     * @param string a string representation of an IP address
     * @return a new #GInetAddress corresponding
     * to @string, or null if @string could not be parsed.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    public constructor(string: String) : this(g_inet_address_new_from_string(string)!!.reinterpret())

    /**
     * Checks if two #GInetAddress instances are equal, e.g. the same address.
     *
     * @param otherAddress Another #GInetAddress.
     * @return true if @address and @other_address are equal, false otherwise.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun equal(otherAddress: InetAddress): Boolean =
        g_inet_address_equal(gioInetAddressPointer, otherAddress.gioInetAddressPointer).asBoolean()

    /**
     * Gets the size of the native raw binary address for @address. This
     * is the size of the data that you get from g_inet_address_to_bytes().
     *
     * @return the number of bytes used for the native version of @address.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getNativeSize(): gsize = g_inet_address_get_native_size(gioInetAddressPointer)

    /**
     * Converts @address to string form.
     *
     * @return a representation of @address as a string, which should be
     * freed after use.
     * @since 2.22
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @GioVersion2_22
    override fun toString(): String =
        g_inet_address_to_string(gioInetAddressPointer)?.toKString() ?: error("Expected not null string")

    public companion object : TypeCompanion<InetAddress> {
        override val type: GeneratedClassKGType<InetAddress> =
            GeneratedClassKGType(g_inet_address_get_type()) { InetAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a #GInetAddress for the "any" address (unassigned/"don't
         * care") for @family.
         *
         * @param family the address family
         * @return a new #GInetAddress corresponding to the "any" address
         * for @family.
         *     Free the returned object with g_object_unref().
         * @since 2.22
         */
        public fun newAny(family: SocketFamily): InetAddress =
            InetAddress(g_inet_address_new_any(family.nativeValue)!!.reinterpret())

        /**
         * Creates a #GInetAddress for the loopback address for @family.
         *
         * @param family the address family
         * @return a new #GInetAddress corresponding to the loopback address
         * for @family.
         *     Free the returned object with g_object_unref().
         * @since 2.22
         */
        public fun newLoopback(family: SocketFamily): InetAddress =
            InetAddress(g_inet_address_new_loopback(family.nativeValue)!!.reinterpret())

        /**
         * Get the GType of InetAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_inet_address_get_type()
    }
}
