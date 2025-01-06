// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GProxyAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_proxy_address_get_destination_hostname
import org.gtkkn.native.gio.g_proxy_address_get_destination_port
import org.gtkkn.native.gio.g_proxy_address_get_destination_protocol
import org.gtkkn.native.gio.g_proxy_address_get_password
import org.gtkkn.native.gio.g_proxy_address_get_protocol
import org.gtkkn.native.gio.g_proxy_address_get_type
import org.gtkkn.native.gio.g_proxy_address_get_uri
import org.gtkkn.native.gio.g_proxy_address_get_username
import org.gtkkn.native.gio.g_proxy_address_new
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * A [class@Gio.InetSocketAddress] representing a connection via a proxy server.
 * @since 2.26
 */
@GioVersion2_26
public open class ProxyAddress(pointer: CPointer<GProxyAddress>) :
    InetSocketAddress(pointer.reinterpret()),
    KGTyped {
    public val gioProxyAddressPointer: CPointer<GProxyAddress>
        get() = gPointer.reinterpret()

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = gPointer.reinterpret()

    /**
     * The proxy destination hostname.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val destinationHostname: String
        /**
         * Gets @proxy's destination hostname; that is, the name of the host
         * that will be connected to via the proxy, not the name of the proxy
         * itself.
         *
         * @return the @proxy's destination hostname
         * @since 2.26
         */
        get() = g_proxy_address_get_destination_hostname(gioProxyAddressPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The proxy destination port.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val destinationPort: guint16
        /**
         * Gets @proxy's destination port; that is, the port on the
         * destination host that will be connected to via the proxy, not the
         * port number of the proxy itself.
         *
         * @return the @proxy's destination port
         * @since 2.26
         */
        get() = g_proxy_address_get_destination_port(gioProxyAddressPointer.reinterpret())

    /**
     * The protocol being spoke to the destination host, or null if
     * the #GProxyAddress doesn't know.
     *
     * @since 2.34
     */
    @GioVersion2_34
    public open val destinationProtocol: String
        /**
         * Gets the protocol that is being spoken to the destination
         * server; eg, "http" or "ftp".
         *
         * @return the @proxy's destination protocol
         * @since 2.34
         */
        get() = g_proxy_address_get_destination_protocol(gioProxyAddressPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The proxy password.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val password: String?
        /**
         * Gets @proxy's password.
         *
         * @return the @proxy's password
         * @since 2.26
         */
        get() = g_proxy_address_get_password(gioProxyAddressPointer.reinterpret())?.toKString()

    /**
     * The proxy protocol.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val protocol: String
        /**
         * Gets @proxy's protocol. eg, "socks" or "http"
         *
         * @return the @proxy's protocol
         * @since 2.26
         */
        get() = g_proxy_address_get_protocol(gioProxyAddressPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The URI string that the proxy was constructed from (or null
     * if the creator didn't specify this).
     *
     * @since 2.34
     */
    @GioVersion2_34
    public open val uri: String?
        /**
         * Gets the proxy URI that @proxy was constructed from.
         *
         * @return the @proxy's URI, or null if unknown
         * @since 2.34
         */
        get() = g_proxy_address_get_uri(gioProxyAddressPointer.reinterpret())?.toKString()

    /**
     * The proxy username.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val username: String?
        /**
         * Gets @proxy's username.
         *
         * @return the @proxy's username
         * @since 2.26
         */
        get() = g_proxy_address_get_username(gioProxyAddressPointer.reinterpret())?.toKString()

    /**
     * Creates a new #GProxyAddress for @inetaddr with @protocol that should
     * tunnel through @dest_hostname and @dest_port.
     *
     * (Note that this method doesn't set the #GProxyAddress:uri or
     * #GProxyAddress:destination-protocol fields; use g_object_new()
     * directly if you want to set those.)
     *
     * @param inetaddr The proxy server #GInetAddress.
     * @param port The proxy server port.
     * @param protocol The proxy protocol to support, in lower case (e.g. socks, http).
     * @param destHostname The destination hostname the proxy should tunnel to.
     * @param destPort The destination port to tunnel to.
     * @param username The username to authenticate to the proxy server
     *     (or null).
     * @param password The password to authenticate to the proxy server
     *     (or null).
     * @return a new #GProxyAddress
     * @since 2.26
     */
    public constructor(
        inetaddr: InetAddress,
        port: guint16,
        protocol: String,
        destHostname: String,
        destPort: guint16,
        username: String? = null,
        password: String? = null,
    ) : this(
        g_proxy_address_new(
            inetaddr.gioInetAddressPointer.reinterpret(),
            port,
            protocol,
            destHostname,
            destPort,
            username,
            password
        )!!.reinterpret()
    )

    public companion object : TypeCompanion<ProxyAddress> {
        override val type: GeneratedClassKGType<ProxyAddress> =
            GeneratedClassKGType(g_proxy_address_get_type()) { ProxyAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ProxyAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_proxy_address_get_type()
    }
}
