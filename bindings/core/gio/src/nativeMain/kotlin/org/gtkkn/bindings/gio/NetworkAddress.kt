// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNetworkAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_network_address_get_hostname
import org.gtkkn.native.gio.g_network_address_get_port
import org.gtkkn.native.gio.g_network_address_get_scheme
import org.gtkkn.native.gio.g_network_address_get_type
import org.gtkkn.native.gio.g_network_address_new
import org.gtkkn.native.gio.g_network_address_new_loopback
import org.gtkkn.native.gio.g_network_address_parse
import org.gtkkn.native.gio.g_network_address_parse_uri
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.String

/**
 * `GNetworkAddress` provides an easy way to resolve a hostname and
 * then attempt to connect to that host, handling the possibility of
 * multiple IP addresses and multiple address families.
 *
 * The enumeration results of resolved addresses *may* be cached as long
 * as this object is kept alive which may have unexpected results if
 * alive for too long.
 *
 * See [iface@Gio.SocketConnectable] for an example of using the connectable
 * interface.
 */
public open class NetworkAddress(pointer: CPointer<GNetworkAddress>) :
    Object(pointer.reinterpret()),
    SocketConnectable,
    KGTyped {
    public val gioNetworkAddressPointer: CPointer<GNetworkAddress>
        get() = gPointer.reinterpret()

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = gPointer.reinterpret()

    /**
     * Hostname to resolve.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val hostname: String
        /**
         * Gets @addr's hostname. This might be either UTF-8 or ASCII-encoded,
         * depending on what @addr was created with.
         *
         * @return @addr's hostname
         * @since 2.22
         */
        get() = g_network_address_get_hostname(gioNetworkAddressPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Network port.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val port: guint16
        /**
         * Gets @addr's port number
         *
         * @return @addr's port (which may be 0)
         * @since 2.22
         */
        get() = g_network_address_get_port(gioNetworkAddressPointer)

    /**
     * URI scheme.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val scheme: String?
        /**
         * Gets @addr's scheme
         *
         * @return @addr's scheme (null if not built from URI)
         * @since 2.26
         */
        get() = g_network_address_get_scheme(gioNetworkAddressPointer)?.toKString()

    /**
     * Creates a new #GSocketConnectable for connecting to the given
     * @hostname and @port.
     *
     * Note that depending on the configuration of the machine, a
     * @hostname of `localhost` may refer to the IPv4 loopback address
     * only, or to both IPv4 and IPv6; use
     * g_network_address_new_loopback() to create a #GNetworkAddress that
     * is guaranteed to resolve to both addresses.
     *
     * @param hostname the hostname
     * @param port the port
     * @return the new #GNetworkAddress
     * @since 2.22
     */
    public constructor(hostname: String, port: guint16) : this(g_network_address_new(hostname, port)!!.reinterpret())

    /**
     * Creates a new #GSocketConnectable for connecting to the local host
     * over a loopback connection to the given @port. This is intended for
     * use in connecting to local services which may be running on IPv4 or
     * IPv6.
     *
     * The connectable will return IPv4 and IPv6 loopback addresses,
     * regardless of how the host resolves `localhost`. By contrast,
     * g_network_address_new() will often only return an IPv4 address when
     * resolving `localhost`, and an IPv6 address for `localhost6`.
     *
     * g_network_address_get_hostname() will always return `localhost` for
     * a #GNetworkAddress created with this constructor.
     *
     * @param port the port
     * @return the new #GNetworkAddress
     * @since 2.44
     */
    public constructor(port: guint16) : this(g_network_address_new_loopback(port)!!.reinterpret())

    public companion object : TypeCompanion<NetworkAddress> {
        override val type: GeneratedClassKGType<NetworkAddress> =
            GeneratedClassKGType(g_network_address_get_type()) { NetworkAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GSocketConnectable for connecting to the given
         * @hostname and @port. May fail and return null in case
         * parsing @host_and_port fails.
         *
         * @host_and_port may be in any of a number of recognised formats; an IPv6
         * address, an IPv4 address, or a domain name (in which case a DNS
         * lookup is performed). Quoting with [] is supported for all address
         * types. A port override may be specified in the usual way with a
         * colon.
         *
         * If no port is specified in @host_and_port then @default_port will be
         * used as the port number to connect to.
         *
         * In general, @host_and_port is expected to be provided by the user
         * (allowing them to give the hostname, and a port override if necessary)
         * and @default_port is expected to be provided by the application.
         *
         * (The port component of @host_and_port can also be specified as a
         * service name rather than as a numeric port, but this functionality
         * is deprecated, because it depends on the contents of /etc/services,
         * which is generally quite sparse on platforms other than Linux.)
         *
         * @param hostAndPort the hostname and optionally a port
         * @param defaultPort the default port if not in @host_and_port
         * @return the new
         *   #GNetworkAddress, or null on error
         * @since 2.22
         */
        @GioVersion2_22
        public fun parse(hostAndPort: String, defaultPort: guint16): Result<NetworkAddress> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_network_address_parse(hostAndPort, defaultPort, gError.ptr)?.run {
                NetworkAddress(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Creates a new #GSocketConnectable for connecting to the given
         * @uri. May fail and return null in case parsing @uri fails.
         *
         * Using this rather than g_network_address_new() or
         * g_network_address_parse() allows #GSocketClient to determine
         * when to use application-specific proxy protocols.
         *
         * @param uri the hostname and optionally a port
         * @param defaultPort The default port if none is found in the URI
         * @return the new
         *   #GNetworkAddress, or null on error
         * @since 2.26
         */
        @GioVersion2_26
        public fun parseUri(uri: String, defaultPort: guint16): Result<NetworkAddress> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_network_address_parse_uri(uri, defaultPort, gError.ptr)?.run {
                NetworkAddress(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Get the GType of NetworkAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_network_address_get_type()
    }
}
