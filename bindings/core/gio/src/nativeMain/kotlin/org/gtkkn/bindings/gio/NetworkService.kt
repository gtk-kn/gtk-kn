// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GNetworkService
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_network_service_get_domain
import org.gtkkn.native.gio.g_network_service_get_protocol
import org.gtkkn.native.gio.g_network_service_get_scheme
import org.gtkkn.native.gio.g_network_service_get_service
import org.gtkkn.native.gio.g_network_service_get_type
import org.gtkkn.native.gio.g_network_service_new
import org.gtkkn.native.gio.g_network_service_set_scheme
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * Like [class@Gio.NetworkAddress] does with hostnames, `GNetworkService`
 * provides an easy way to resolve a SRV record, and then attempt to
 * connect to one of the hosts that implements that service, handling
 * service priority/weighting, multiple IP addresses, and multiple
 * address families.
 *
 * See [struct@Gio.SrvTarget] for more information about SRV records, and see
 * [iface@Gio.SocketConnectable] for an example of using the connectable
 * interface.
 */
public open class NetworkService(public val gioNetworkServicePointer: CPointer<GNetworkService>) :
    Object(gioNetworkServicePointer.reinterpret()),
    SocketConnectable,
    KGTyped {
    init {
        Gio
    }

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = handle.reinterpret()

    /**
     * Network domain, for example `example.com`.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val domain: String
        /**
         * Gets the domain that @srv serves. This might be either UTF-8 or
         * ASCII-encoded, depending on what @srv was created with.
         *
         * @return @srv's domain name
         * @since 2.22
         */
        get() = g_network_service_get_domain(gioNetworkServicePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Network protocol, for example `tcp`.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val protocol: String
        /**
         * Gets @srv's protocol name (eg, "tcp").
         *
         * @return @srv's protocol name
         * @since 2.22
         */
        get() = g_network_service_get_protocol(gioNetworkServicePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Network scheme (default is to use service).
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open var scheme: String
        /**
         * Gets the URI scheme used to resolve proxies. By default, the service name
         * is used as scheme.
         *
         * @return @srv's scheme name
         * @since 2.26
         */
        get() = g_network_service_get_scheme(gioNetworkServicePointer)?.toKString() ?: error("Expected not null string")

        /**
         * Set's the URI scheme used to resolve proxies. By default, the service name
         * is used as scheme.
         *
         * @param scheme a URI scheme
         * @since 2.26
         */
        @GioVersion2_26
        set(scheme) = g_network_service_set_scheme(gioNetworkServicePointer, scheme)

    /**
     * Service name, for example `ldap`.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val service: String
        /**
         * Gets @srv's service name (eg, "ldap").
         *
         * @return @srv's service name
         * @since 2.22
         */
        get() = g_network_service_get_service(gioNetworkServicePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Creates a new #GNetworkService representing the given @service,
     * @protocol, and @domain. This will initially be unresolved; use the
     * #GSocketConnectable interface to resolve it.
     *
     * @param service the service type to look up (eg, "ldap")
     * @param protocol the networking protocol to use for @service (eg, "tcp")
     * @param domain the DNS domain to look up the service in
     * @return a new #GNetworkService
     * @since 2.22
     */
    public constructor(
        service: String,
        protocol: String,
        domain: String,
    ) : this(g_network_service_new(service, protocol, domain)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<NetworkService> {
        override val type: GeneratedClassKGType<NetworkService> =
            GeneratedClassKGType(getTypeOrNull()!!) { NetworkService(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of NetworkService
         *
         * @return the GType
         */
        public fun getType(): GType = g_network_service_get_type()

        /**
         * Gets the GType of from the symbol `g_network_service_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_network_service_get_type")
    }
}
