// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GIOStream
import org.gtkkn.native.gio.GSocketClient
import org.gtkkn.native.gio.GSocketClientEvent
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_socket_client_add_application_proxy
import org.gtkkn.native.gio.g_socket_client_connect
import org.gtkkn.native.gio.g_socket_client_connect_async
import org.gtkkn.native.gio.g_socket_client_connect_finish
import org.gtkkn.native.gio.g_socket_client_connect_to_host
import org.gtkkn.native.gio.g_socket_client_connect_to_host_async
import org.gtkkn.native.gio.g_socket_client_connect_to_host_finish
import org.gtkkn.native.gio.g_socket_client_connect_to_service
import org.gtkkn.native.gio.g_socket_client_connect_to_service_async
import org.gtkkn.native.gio.g_socket_client_connect_to_service_finish
import org.gtkkn.native.gio.g_socket_client_connect_to_uri
import org.gtkkn.native.gio.g_socket_client_connect_to_uri_async
import org.gtkkn.native.gio.g_socket_client_connect_to_uri_finish
import org.gtkkn.native.gio.g_socket_client_get_enable_proxy
import org.gtkkn.native.gio.g_socket_client_get_family
import org.gtkkn.native.gio.g_socket_client_get_local_address
import org.gtkkn.native.gio.g_socket_client_get_protocol
import org.gtkkn.native.gio.g_socket_client_get_proxy_resolver
import org.gtkkn.native.gio.g_socket_client_get_socket_type
import org.gtkkn.native.gio.g_socket_client_get_timeout
import org.gtkkn.native.gio.g_socket_client_get_tls
import org.gtkkn.native.gio.g_socket_client_get_tls_validation_flags
import org.gtkkn.native.gio.g_socket_client_get_type
import org.gtkkn.native.gio.g_socket_client_new
import org.gtkkn.native.gio.g_socket_client_set_enable_proxy
import org.gtkkn.native.gio.g_socket_client_set_family
import org.gtkkn.native.gio.g_socket_client_set_local_address
import org.gtkkn.native.gio.g_socket_client_set_protocol
import org.gtkkn.native.gio.g_socket_client_set_proxy_resolver
import org.gtkkn.native.gio.g_socket_client_set_socket_type
import org.gtkkn.native.gio.g_socket_client_set_timeout
import org.gtkkn.native.gio.g_socket_client_set_tls
import org.gtkkn.native.gio.g_socket_client_set_tls_validation_flags
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit

/**
 * `GSocketClient` is a lightweight high-level utility class for connecting to
 * a network host using a connection oriented socket type.
 *
 * You create a `GSocketClient` object, set any options you want, and then
 * call a sync or async connect operation, which returns a
 * [class@Gio.SocketConnection] subclass on success.
 *
 * The type of the [class@Gio.SocketConnection] object returned depends on the
 * type of the underlying socket that is in use. For instance, for a TCP/IP
 * connection it will be a [class@Gio.TcpConnection].
 *
 * As `GSocketClient` is a lightweight object, you don't need to cache it. You
 * can just create a new one any time you need one.
 *
 * ## Skipped during bindings generation
 *
 * - method `proxy-resolver`: Property TypeInfo of getter and setter do not match
 * - method `type`: Property has no getter nor setter
 *
 * @since 2.22
 */
public open class SocketClient(
    pointer: CPointer<GSocketClient>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioSocketClientPointer: CPointer<GSocketClient>
        get() = gPointer.reinterpret()

    /**
     * Enable proxy support.
     *
     * @since 2.22
     */
    public open var enableProxy: Boolean
        /**
         * Gets the proxy enable state; see g_socket_client_set_enable_proxy()
         *
         * @return whether proxying is enabled
         * @since 2.26
         */
        get() = g_socket_client_get_enable_proxy(gioSocketClientPointer.reinterpret()).asBoolean()

        /**
         * Sets whether or not @client attempts to make connections via a
         * proxy server. When enabled (the default), #GSocketClient will use a
         * #GProxyResolver to determine if a proxy protocol such as SOCKS is
         * needed, and automatically do the necessary proxy negotiation.
         *
         * See also g_socket_client_set_proxy_resolver().
         *
         * @param enable whether to enable proxies
         * @since 2.26
         */
        set(enable) =
            g_socket_client_set_enable_proxy(
                gioSocketClientPointer.reinterpret(),
                enable.asGBoolean()
            )

    /**
     * The address family to use for socket construction.
     *
     * @since 2.22
     */
    public open var family: SocketFamily
        /**
         * Gets the socket family of the socket client.
         *
         * See g_socket_client_set_family() for details.
         *
         * @return a #GSocketFamily
         * @since 2.22
         */
        get() =
            g_socket_client_get_family(gioSocketClientPointer.reinterpret()).run {
                SocketFamily.fromNativeValue(this)
            }

        /**
         * Sets the socket family of the socket client.
         * If this is set to something other than %G_SOCKET_FAMILY_INVALID
         * then the sockets created by this object will be of the specified
         * family.
         *
         * This might be useful for instance if you want to force the local
         * connection to be an ipv4 socket, even though the address might
         * be an ipv6 mapped to ipv4 address.
         *
         * @param family a #GSocketFamily
         * @since 2.22
         */
        set(family) =
            g_socket_client_set_family(
                gioSocketClientPointer.reinterpret(),
                family.nativeValue
            )

    /**
     * The local address constructed sockets will be bound to.
     *
     * @since 2.22
     */
    public open var localAddress: SocketAddress?
        /**
         * Gets the local address of the socket client.
         *
         * See g_socket_client_set_local_address() for details.
         *
         * @return a #GSocketAddress or null. Do not free.
         * @since 2.22
         */
        get() =
            g_socket_client_get_local_address(gioSocketClientPointer.reinterpret())?.run {
                SocketAddress(reinterpret())
            }

        /**
         * Sets the local address of the socket client.
         * The sockets created by this object will bound to the
         * specified address (if not null) before connecting.
         *
         * This is useful if you want to ensure that the local
         * side of the connection is on a specific port, or on
         * a specific interface.
         *
         * @param address a #GSocketAddress, or null
         * @since 2.22
         */
        set(address) =
            g_socket_client_set_local_address(
                gioSocketClientPointer.reinterpret(),
                address?.gioSocketAddressPointer?.reinterpret()
            )

    /**
     * The protocol to use for socket construction, or `0` for default.
     *
     * @since 2.22
     */
    public open var protocol: SocketProtocol
        /**
         * Gets the protocol name type of the socket client.
         *
         * See g_socket_client_set_protocol() for details.
         *
         * @return a #GSocketProtocol
         * @since 2.22
         */
        get() =
            g_socket_client_get_protocol(gioSocketClientPointer.reinterpret()).run {
                SocketProtocol.fromNativeValue(this)
            }

        /**
         * Sets the protocol of the socket client.
         * The sockets created by this object will use of the specified
         * protocol.
         *
         * If @protocol is %G_SOCKET_PROTOCOL_DEFAULT that means to use the default
         * protocol for the socket family and type.
         *
         * @param protocol a #GSocketProtocol
         * @since 2.22
         */
        set(protocol) =
            g_socket_client_set_protocol(
                gioSocketClientPointer.reinterpret(),
                protocol.nativeValue
            )

    /**
     * The I/O timeout for sockets, in seconds, or `0` for none.
     *
     * @since 2.22
     */
    public open var timeout: UInt
        /**
         * Gets the I/O timeout time for sockets created by @client.
         *
         * See g_socket_client_set_timeout() for details.
         *
         * @return the timeout in seconds
         * @since 2.26
         */
        get() = g_socket_client_get_timeout(gioSocketClientPointer.reinterpret())

        /**
         * Sets the I/O timeout for sockets created by @client. @timeout is a
         * time in seconds, or 0 for no timeout (the default).
         *
         * The timeout value affects the initial connection attempt as well,
         * so setting this may cause calls to g_socket_client_connect(), etc,
         * to fail with %G_IO_ERROR_TIMED_OUT.
         *
         * @param timeout the timeout
         * @since 2.26
         */
        set(timeout) = g_socket_client_set_timeout(gioSocketClientPointer.reinterpret(), timeout)

    /**
     * Whether to create TLS connections.
     *
     * @since 2.22
     */
    public open var tls: Boolean
        /**
         * Gets whether @client creates TLS connections. See
         * g_socket_client_set_tls() for details.
         *
         * @return whether @client uses TLS
         * @since 2.28
         */
        get() = g_socket_client_get_tls(gioSocketClientPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @client creates TLS (aka SSL) connections. If @tls is
         * true, @client will wrap its connections in a #GTlsClientConnection
         * and perform a TLS handshake when connecting.
         *
         * Note that since #GSocketClient must return a #GSocketConnection,
         * but #GTlsClientConnection is not a #GSocketConnection, this
         * actually wraps the resulting #GTlsClientConnection in a
         * #GTcpWrapperConnection when returning it. You can use
         * g_tcp_wrapper_connection_get_base_io_stream() on the return value
         * to extract the #GTlsClientConnection.
         *
         * If you need to modify the behavior of the TLS handshake (eg, by
         * setting a client-side certificate to use, or connecting to the
         * #GTlsConnection::accept-certificate signal), you can connect to
         * @client's #GSocketClient::event signal and wait for it to be
         * emitted with %G_SOCKET_CLIENT_TLS_HANDSHAKING, which will give you
         * a chance to see the #GTlsClientConnection before the handshake
         * starts.
         *
         * @param tls whether to use TLS
         * @since 2.28
         */
        set(tls) = g_socket_client_set_tls(gioSocketClientPointer.reinterpret(), tls.asGBoolean())

    /**
     * The TLS validation flags used when creating TLS connections. The
     * default value is %G_TLS_CERTIFICATE_VALIDATE_ALL.
     *
     * GLib guarantees that if certificate verification fails, at least one
     * flag will be set, but it does not guarantee that all possible flags
     * will be set. Accordingly, you may not safely decide to ignore any
     * particular type of error. For example, it would be incorrect to mask
     * %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired certificates,
     * because this could potentially be the only error flag set even if
     * other problems exist with the certificate. Therefore, there is no
     * safe way to use this property. This is not a horrible problem,
     * though, because you should not be attempting to ignore validation
     * errors anyway. If you really must ignore TLS certificate errors,
     * connect to the #GSocketClient::event signal, wait for it to be
     * emitted with %G_SOCKET_CLIENT_TLS_HANDSHAKING, and use that to
     * connect to #GTlsConnection::accept-certificate.
     */
    public open var tlsValidationFlags: TlsCertificateFlags
        /**
         * Gets the TLS validation flags used creating TLS connections via
         * @client.
         *
         * This function does not work as originally designed and is impossible
         * to use correctly. See #GSocketClient:tls-validation-flags for more
         * information.
         *
         * @return the TLS validation flags
         * @since 2.28
         */
        get() =
            g_socket_client_get_tls_validation_flags(gioSocketClientPointer.reinterpret()).run {
                TlsCertificateFlags(this)
            }

        /**
         * Sets the TLS validation flags used when creating TLS connections
         * via @client. The default value is %G_TLS_CERTIFICATE_VALIDATE_ALL.
         *
         * This function does not work as originally designed and is impossible
         * to use correctly. See #GSocketClient:tls-validation-flags for more
         * information.
         *
         * @param flags the validation flags
         * @since 2.28
         */
        set(flags) =
            g_socket_client_set_tls_validation_flags(
                gioSocketClientPointer.reinterpret(),
                flags.mask
            )

    /**
     * Creates a new #GSocketClient with the default options.
     *
     * @return a #GSocketClient.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    public constructor() : this(g_socket_client_new()!!.reinterpret())

    /**
     * Enable proxy protocols to be handled by the application. When the
     * indicated proxy protocol is returned by the #GProxyResolver,
     * #GSocketClient will consider this protocol as supported but will
     * not try to find a #GProxy instance to handle handshaking. The
     * application must check for this case by calling
     * g_socket_connection_get_remote_address() on the returned
     * #GSocketConnection, and seeing if it's a #GProxyAddress of the
     * appropriate type, to determine whether or not it needs to handle
     * the proxy handshaking itself.
     *
     * This should be used for proxy protocols that are dialects of
     * another protocol such as HTTP proxy. It also allows cohabitation of
     * proxy protocols that are reused between protocols. A good example
     * is HTTP. It can be used to proxy HTTP, FTP and Gopher and can also
     * be use as generic socket proxy through the HTTP CONNECT method.
     *
     * When the proxy is detected as being an application proxy, TLS handshake
     * will be skipped. This is required to let the application do the proxy
     * specific handshake.
     *
     * @param protocol The proxy protocol
     */
    public open fun addApplicationProxy(protocol: String): Unit =
        g_socket_client_add_application_proxy(gioSocketClientPointer.reinterpret(), protocol)

    /**
     * Tries to resolve the @connectable and make a network connection to it.
     *
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     *
     * The type of the #GSocketConnection object returned depends on the type of
     * the underlying socket that is used. For instance, for a TCP/IP connection
     * it will be a #GTcpConnection.
     *
     * The socket created will be the same family as the address that the
     * @connectable resolves to, unless family is set with g_socket_client_set_family()
     * or indirectly via g_socket_client_set_local_address(). The socket type
     * defaults to %G_SOCKET_TYPE_STREAM but can be set with
     * g_socket_client_set_socket_type().
     *
     * If a local address is specified with g_socket_client_set_local_address() the
     * socket will be bound to this address before connecting.
     *
     * @param connectable a #GSocketConnectable specifying the remote address.
     * @param cancellable optional #GCancellable object, null to ignore.
     * @return a #GSocketConnection on success, null on error.
     * @since 2.22
     */
    public open fun connect(
        connectable: SocketConnectable,
        cancellable: Cancellable? = null,
    ): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect(
                    gioSocketClientPointer.reinterpret(),
                    connectable.gioSocketConnectablePointer,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This is the asynchronous version of g_socket_client_connect().
     *
     * You may wish to prefer the asynchronous version even in synchronous
     * command line programs because, since 2.60, it implements
     * [RFC 8305](https://tools.ietf.org/html/rfc8305) "Happy Eyeballs"
     * recommendations to work around long connection timeouts in networks
     * where IPv6 is broken by performing an IPv4 connection simultaneously
     * without waiting for IPv6 to time out, which is not supported by the
     * synchronous call. (This is not an API guarantee, and may change in
     * the future.)
     *
     * When the operation is finished @callback will be
     * called. You can then call g_socket_client_connect_finish() to get
     * the result of the operation.
     *
     * @param connectable a #GSocketConnectable specifying the remote address.
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.22
     */
    public open fun connectAsync(
        connectable: SocketConnectable,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_client_connect_async(
            gioSocketClientPointer.reinterpret(),
            connectable.gioSocketConnectablePointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an async connect operation. See g_socket_client_connect_async()
     *
     * @param result a #GAsyncResult.
     * @return a #GSocketConnection on success, null on error.
     * @since 2.22
     */
    public open fun connectFinish(result: AsyncResult): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_finish(
                    gioSocketClientPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This is a helper function for g_socket_client_connect().
     *
     * Attempts to create a TCP connection to the named host.
     *
     * @host_and_port may be in any of a number of recognized formats; an IPv6
     * address, an IPv4 address, or a domain name (in which case a DNS
     * lookup is performed).  Quoting with [] is supported for all address
     * types.  A port override may be specified in the usual way with a
     * colon.  Ports may be given as decimal numbers or symbolic names (in
     * which case an /etc/services lookup is performed).
     *
     * If no port override is given in @host_and_port then @default_port will be
     * used as the port number to connect to.
     *
     * In general, @host_and_port is expected to be provided by the user (allowing
     * them to give the hostname, and a port override if necessary) and
     * @default_port is expected to be provided by the application.
     *
     * In the case that an IP address is given, a single connection
     * attempt is made.  In the case that a name is given, multiple
     * connection attempts may be made, in turn and according to the
     * number of address records in DNS, until a connection succeeds.
     *
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     *
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) null is returned and @error (if non-null) is set
     * accordingly.
     *
     * @param hostAndPort the name and optionally port of the host to connect to
     * @param defaultPort the default port to connect to
     * @param cancellable a #GCancellable, or null
     * @return a #GSocketConnection on success, null on error.
     * @since 2.22
     */
    public open fun connectToHost(
        hostAndPort: String,
        defaultPort: UShort,
        cancellable: Cancellable? = null,
    ): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_to_host(
                    gioSocketClientPointer.reinterpret(),
                    hostAndPort,
                    defaultPort,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This is the asynchronous version of g_socket_client_connect_to_host().
     *
     * When the operation is finished @callback will be
     * called. You can then call g_socket_client_connect_to_host_finish() to get
     * the result of the operation.
     *
     * @param hostAndPort the name and optionally the port of the host to connect to
     * @param defaultPort the default port to connect to
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.22
     */
    public open fun connectToHostAsync(
        hostAndPort: String,
        defaultPort: UShort,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_client_connect_to_host_async(
            gioSocketClientPointer.reinterpret(),
            hostAndPort,
            defaultPort,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_host_async()
     *
     * @param result a #GAsyncResult.
     * @return a #GSocketConnection on success, null on error.
     * @since 2.22
     */
    public open fun connectToHostFinish(result: AsyncResult): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_to_host_finish(
                    gioSocketClientPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Attempts to create a TCP connection to a service.
     *
     * This call looks up the SRV record for @service at @domain for the
     * "tcp" protocol.  It then attempts to connect, in turn, to each of
     * the hosts providing the service until either a connection succeeds
     * or there are no hosts remaining.
     *
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     *
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) null is returned and @error (if non-null) is set
     * accordingly.
     *
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a #GCancellable, or null
     * @return a #GSocketConnection if successful, or null on error
     */
    public open fun connectToService(
        domain: String,
        service: String,
        cancellable: Cancellable? = null,
    ): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_to_service(
                    gioSocketClientPointer.reinterpret(),
                    domain,
                    service,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This is the asynchronous version of
     * g_socket_client_connect_to_service().
     *
     * @param domain a domain name
     * @param service the name of the service to connect to
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.22
     */
    public open fun connectToServiceAsync(
        domain: String,
        service: String,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_client_connect_to_service_async(
            gioSocketClientPointer.reinterpret(),
            domain,
            service,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_service_async()
     *
     * @param result a #GAsyncResult.
     * @return a #GSocketConnection on success, null on error.
     * @since 2.22
     */
    public open fun connectToServiceFinish(result: AsyncResult): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_to_service_finish(
                    gioSocketClientPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This is a helper function for g_socket_client_connect().
     *
     * Attempts to create a TCP connection with a network URI.
     *
     * @uri may be any valid URI containing an "authority" (hostname/port)
     * component. If a port is not specified in the URI, @default_port
     * will be used. TLS will be negotiated if #GSocketClient:tls is true.
     * (#GSocketClient does not know to automatically assume TLS for
     * certain URI schemes.)
     *
     * Using this rather than g_socket_client_connect() or
     * g_socket_client_connect_to_host() allows #GSocketClient to
     * determine when to use application-specific proxy protocols.
     *
     * Upon a successful connection, a new #GSocketConnection is constructed
     * and returned.  The caller owns this new object and must drop their
     * reference to it when finished with it.
     *
     * In the event of any failure (DNS error, service not found, no hosts
     * connectable) null is returned and @error (if non-null) is set
     * accordingly.
     *
     * @param uri A network URI
     * @param defaultPort the default port to connect to
     * @param cancellable a #GCancellable, or null
     * @return a #GSocketConnection on success, null on error.
     * @since 2.26
     */
    public open fun connectToUri(
        uri: String,
        defaultPort: UShort,
        cancellable: Cancellable? = null,
    ): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_to_uri(
                    gioSocketClientPointer.reinterpret(),
                    uri,
                    defaultPort,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * This is the asynchronous version of g_socket_client_connect_to_uri().
     *
     * When the operation is finished @callback will be
     * called. You can then call g_socket_client_connect_to_uri_finish() to get
     * the result of the operation.
     *
     * @param uri a network uri
     * @param defaultPort the default port to connect to
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.26
     */
    public open fun connectToUriAsync(
        uri: String,
        defaultPort: UShort,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_client_connect_to_uri_async(
            gioSocketClientPointer.reinterpret(),
            uri,
            defaultPort,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes an async connect operation. See g_socket_client_connect_to_uri_async()
     *
     * @param result a #GAsyncResult.
     * @return a #GSocketConnection on success, null on error.
     * @since 2.26
     */
    public open fun connectToUriFinish(result: AsyncResult): Result<SocketConnection> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_client_connect_to_uri_finish(
                    gioSocketClientPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    SocketConnection(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets the proxy enable state; see g_socket_client_set_enable_proxy()
     *
     * @return whether proxying is enabled
     * @since 2.26
     */
    public open fun getEnableProxy(): Boolean =
        g_socket_client_get_enable_proxy(gioSocketClientPointer.reinterpret()).asBoolean()

    /**
     * Gets the socket family of the socket client.
     *
     * See g_socket_client_set_family() for details.
     *
     * @return a #GSocketFamily
     * @since 2.22
     */
    public open fun getFamily(): SocketFamily =
        g_socket_client_get_family(gioSocketClientPointer.reinterpret()).run {
            SocketFamily.fromNativeValue(this)
        }

    /**
     * Gets the local address of the socket client.
     *
     * See g_socket_client_set_local_address() for details.
     *
     * @return a #GSocketAddress or null. Do not free.
     * @since 2.22
     */
    public open fun getLocalAddress(): SocketAddress? =
        g_socket_client_get_local_address(gioSocketClientPointer.reinterpret())?.run {
            SocketAddress(reinterpret())
        }

    /**
     * Gets the protocol name type of the socket client.
     *
     * See g_socket_client_set_protocol() for details.
     *
     * @return a #GSocketProtocol
     * @since 2.22
     */
    public open fun getProtocol(): SocketProtocol =
        g_socket_client_get_protocol(gioSocketClientPointer.reinterpret()).run {
            SocketProtocol.fromNativeValue(this)
        }

    /**
     * Gets the #GProxyResolver being used by @client. Normally, this will
     * be the resolver returned by g_proxy_resolver_get_default(), but you
     * can override it with g_socket_client_set_proxy_resolver().
     *
     * @return The #GProxyResolver being used by
     *   @client.
     * @since 2.36
     */
    public open fun getProxyResolver(): ProxyResolver =
        g_socket_client_get_proxy_resolver(gioSocketClientPointer.reinterpret())!!.run {
            ProxyResolver.wrap(reinterpret())
        }

    /**
     * Gets the socket type of the socket client.
     *
     * See g_socket_client_set_socket_type() for details.
     *
     * @return a #GSocketFamily
     * @since 2.22
     */
    public open fun getSocketType(): SocketType =
        g_socket_client_get_socket_type(gioSocketClientPointer.reinterpret()).run {
            SocketType.fromNativeValue(this)
        }

    /**
     * Gets the I/O timeout time for sockets created by @client.
     *
     * See g_socket_client_set_timeout() for details.
     *
     * @return the timeout in seconds
     * @since 2.26
     */
    public open fun getTimeout(): UInt = g_socket_client_get_timeout(gioSocketClientPointer.reinterpret())

    /**
     * Gets whether @client creates TLS connections. See
     * g_socket_client_set_tls() for details.
     *
     * @return whether @client uses TLS
     * @since 2.28
     */
    public open fun getTls(): Boolean = g_socket_client_get_tls(gioSocketClientPointer.reinterpret()).asBoolean()

    /**
     * Gets the TLS validation flags used creating TLS connections via
     * @client.
     *
     * This function does not work as originally designed and is impossible
     * to use correctly. See #GSocketClient:tls-validation-flags for more
     * information.
     *
     * @return the TLS validation flags
     * @since 2.28
     */
    public open fun getTlsValidationFlags(): TlsCertificateFlags =
        g_socket_client_get_tls_validation_flags(gioSocketClientPointer.reinterpret()).run {
            TlsCertificateFlags(this)
        }

    /**
     * Sets whether or not @client attempts to make connections via a
     * proxy server. When enabled (the default), #GSocketClient will use a
     * #GProxyResolver to determine if a proxy protocol such as SOCKS is
     * needed, and automatically do the necessary proxy negotiation.
     *
     * See also g_socket_client_set_proxy_resolver().
     *
     * @param enable whether to enable proxies
     * @since 2.26
     */
    public open fun setEnableProxy(enable: Boolean): Unit =
        g_socket_client_set_enable_proxy(
            gioSocketClientPointer.reinterpret(),
            enable.asGBoolean()
        )

    /**
     * Sets the socket family of the socket client.
     * If this is set to something other than %G_SOCKET_FAMILY_INVALID
     * then the sockets created by this object will be of the specified
     * family.
     *
     * This might be useful for instance if you want to force the local
     * connection to be an ipv4 socket, even though the address might
     * be an ipv6 mapped to ipv4 address.
     *
     * @param family a #GSocketFamily
     * @since 2.22
     */
    public open fun setFamily(family: SocketFamily): Unit =
        g_socket_client_set_family(gioSocketClientPointer.reinterpret(), family.nativeValue)

    /**
     * Sets the local address of the socket client.
     * The sockets created by this object will bound to the
     * specified address (if not null) before connecting.
     *
     * This is useful if you want to ensure that the local
     * side of the connection is on a specific port, or on
     * a specific interface.
     *
     * @param address a #GSocketAddress, or null
     * @since 2.22
     */
    public open fun setLocalAddress(address: SocketAddress? = null): Unit =
        g_socket_client_set_local_address(
            gioSocketClientPointer.reinterpret(),
            address?.gioSocketAddressPointer?.reinterpret()
        )

    /**
     * Sets the protocol of the socket client.
     * The sockets created by this object will use of the specified
     * protocol.
     *
     * If @protocol is %G_SOCKET_PROTOCOL_DEFAULT that means to use the default
     * protocol for the socket family and type.
     *
     * @param protocol a #GSocketProtocol
     * @since 2.22
     */
    public open fun setProtocol(protocol: SocketProtocol): Unit =
        g_socket_client_set_protocol(gioSocketClientPointer.reinterpret(), protocol.nativeValue)

    /**
     * Overrides the #GProxyResolver used by @client. You can call this if
     * you want to use specific proxies, rather than using the system
     * default proxy settings.
     *
     * Note that whether or not the proxy resolver is actually used
     * depends on the setting of #GSocketClient:enable-proxy, which is not
     * changed by this function (but which is true by default)
     *
     * @param proxyResolver a #GProxyResolver, or null for the
     *   default.
     * @since 2.36
     */
    public open fun setProxyResolver(proxyResolver: ProxyResolver? = null): Unit =
        g_socket_client_set_proxy_resolver(
            gioSocketClientPointer.reinterpret(),
            proxyResolver?.gioProxyResolverPointer
        )

    /**
     * Sets the socket type of the socket client.
     * The sockets created by this object will be of the specified
     * type.
     *
     * It doesn't make sense to specify a type of %G_SOCKET_TYPE_DATAGRAM,
     * as GSocketClient is used for connection oriented services.
     *
     * @param type a #GSocketType
     * @since 2.22
     */
    public open fun setSocketType(type: SocketType): Unit =
        g_socket_client_set_socket_type(gioSocketClientPointer.reinterpret(), type.nativeValue)

    /**
     * Sets the I/O timeout for sockets created by @client. @timeout is a
     * time in seconds, or 0 for no timeout (the default).
     *
     * The timeout value affects the initial connection attempt as well,
     * so setting this may cause calls to g_socket_client_connect(), etc,
     * to fail with %G_IO_ERROR_TIMED_OUT.
     *
     * @param timeout the timeout
     * @since 2.26
     */
    public open fun setTimeout(timeout: UInt): Unit =
        g_socket_client_set_timeout(gioSocketClientPointer.reinterpret(), timeout)

    /**
     * Sets whether @client creates TLS (aka SSL) connections. If @tls is
     * true, @client will wrap its connections in a #GTlsClientConnection
     * and perform a TLS handshake when connecting.
     *
     * Note that since #GSocketClient must return a #GSocketConnection,
     * but #GTlsClientConnection is not a #GSocketConnection, this
     * actually wraps the resulting #GTlsClientConnection in a
     * #GTcpWrapperConnection when returning it. You can use
     * g_tcp_wrapper_connection_get_base_io_stream() on the return value
     * to extract the #GTlsClientConnection.
     *
     * If you need to modify the behavior of the TLS handshake (eg, by
     * setting a client-side certificate to use, or connecting to the
     * #GTlsConnection::accept-certificate signal), you can connect to
     * @client's #GSocketClient::event signal and wait for it to be
     * emitted with %G_SOCKET_CLIENT_TLS_HANDSHAKING, which will give you
     * a chance to see the #GTlsClientConnection before the handshake
     * starts.
     *
     * @param tls whether to use TLS
     * @since 2.28
     */
    public open fun setTls(tls: Boolean): Unit =
        g_socket_client_set_tls(gioSocketClientPointer.reinterpret(), tls.asGBoolean())

    /**
     * Sets the TLS validation flags used when creating TLS connections
     * via @client. The default value is %G_TLS_CERTIFICATE_VALIDATE_ALL.
     *
     * This function does not work as originally designed and is impossible
     * to use correctly. See #GSocketClient:tls-validation-flags for more
     * information.
     *
     * @param flags the validation flags
     * @since 2.28
     */
    public open fun setTlsValidationFlags(flags: TlsCertificateFlags): Unit =
        g_socket_client_set_tls_validation_flags(
            gioSocketClientPointer.reinterpret(),
            flags.mask
        )

    /**
     * Emitted when @client's activity on @connectable changes state.
     * Among other things, this can be used to provide progress
     * information about a network connection in the UI. The meanings of
     * the different @event values are as follows:
     *
     * - %G_SOCKET_CLIENT_RESOLVING: @client is about to look up @connectable
     *   in DNS. @connection will be null.
     *
     * - %G_SOCKET_CLIENT_RESOLVED:  @client has successfully resolved
     *   @connectable in DNS. @connection will be null.
     *
     * - %G_SOCKET_CLIENT_CONNECTING: @client is about to make a connection
     *   to a remote host; either a proxy server or the destination server
     *   itself. @connection is the #GSocketConnection, which is not yet
     *   connected.  Since GLib 2.40, you can access the remote
     *   address via g_socket_connection_get_remote_address().
     *
     * - %G_SOCKET_CLIENT_CONNECTED: @client has successfully connected
     *   to a remote host. @connection is the connected #GSocketConnection.
     *
     * - %G_SOCKET_CLIENT_PROXY_NEGOTIATING: @client is about to negotiate
     *   with a proxy to get it to connect to @connectable. @connection is
     *   the #GSocketConnection to the proxy server.
     *
     * - %G_SOCKET_CLIENT_PROXY_NEGOTIATED: @client has negotiated a
     *   connection to @connectable through a proxy server. @connection is
     *   the stream returned from g_proxy_connect(), which may or may not
     *   be a #GSocketConnection.
     *
     * - %G_SOCKET_CLIENT_TLS_HANDSHAKING: @client is about to begin a TLS
     *   handshake. @connection is a #GTlsClientConnection.
     *
     * - %G_SOCKET_CLIENT_TLS_HANDSHAKED: @client has successfully completed
     *   the TLS handshake. @connection is a #GTlsClientConnection.
     *
     * - %G_SOCKET_CLIENT_COMPLETE: @client has either successfully connected
     *   to @connectable (in which case @connection is the #GSocketConnection
     *   that it will be returning to the caller) or has failed (in which
     *   case @connection is null and the client is about to return an error).
     *
     * Each event except %G_SOCKET_CLIENT_COMPLETE may be emitted
     * multiple times (or not at all) for a given connectable (in
     * particular, if @client ends up attempting to connect to more than
     * one address). However, if @client emits the #GSocketClient::event
     * signal at all for a given connectable, then it will always emit
     * it with %G_SOCKET_CLIENT_COMPLETE when it is done.
     *
     * Note that there may be additional #GSocketClientEvent values in
     * the future; unrecognized @event values should be ignored.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` the event that is occurring;
     * `connectable` the #GSocketConnectable that @event is occurring on; `connection` the current
     * representation of the connection
     * @since 2.32
     */
    public fun connectEvent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            event: SocketClientEvent,
            connectable: SocketConnectable,
            connection: IOStream?,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "event",
            connectEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SocketClient> {
        override val type: GeneratedClassKGType<SocketClient> =
            GeneratedClassKGType(g_socket_client_get_type()) { SocketClient(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectEventFunc: CPointer<
    CFunction<
        (
            GSocketClientEvent,
            CPointer<GSocketConnectable>,
            CPointer<GIOStream>?,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            event: GSocketClientEvent,
            connectable: CPointer<GSocketConnectable>?,
            connection: CPointer<GIOStream>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                event: SocketClientEvent,
                connectable: SocketConnectable,
                connection: IOStream?,
            ) -> Unit
        >().get().invoke(
            event.run {
                SocketClientEvent.fromNativeValue(this)
            },
            connectable!!.run {
                SocketConnectable.wrap(reinterpret())
            },
            connection?.run {
                IOStream(reinterpret())
            }
        )
    }
        .reinterpret()
