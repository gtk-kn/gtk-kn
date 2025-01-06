// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

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
import org.gtkkn.bindings.gio.IoStream
import org.gtkkn.bindings.gio.Socket
import org.gtkkn.bindings.gio.SocketAddress
import org.gtkkn.bindings.gio.TlsAuthenticationMode
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.gio.TlsDatabase
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.Soup.resolveException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.soup.SoupServer
import org.gtkkn.native.soup.SoupServerMessage
import org.gtkkn.native.soup.soup_server_accept_iostream
import org.gtkkn.native.soup.soup_server_add_auth_domain
import org.gtkkn.native.soup.soup_server_add_early_handler
import org.gtkkn.native.soup.soup_server_add_handler
import org.gtkkn.native.soup.soup_server_add_websocket_extension
import org.gtkkn.native.soup.soup_server_add_websocket_handler
import org.gtkkn.native.soup.soup_server_disconnect
import org.gtkkn.native.soup.soup_server_get_listeners
import org.gtkkn.native.soup.soup_server_get_tls_auth_mode
import org.gtkkn.native.soup.soup_server_get_tls_certificate
import org.gtkkn.native.soup.soup_server_get_tls_database
import org.gtkkn.native.soup.soup_server_get_type
import org.gtkkn.native.soup.soup_server_get_uris
import org.gtkkn.native.soup.soup_server_is_https
import org.gtkkn.native.soup.soup_server_listen
import org.gtkkn.native.soup.soup_server_listen_all
import org.gtkkn.native.soup.soup_server_listen_local
import org.gtkkn.native.soup.soup_server_listen_socket
import org.gtkkn.native.soup.soup_server_pause_message
import org.gtkkn.native.soup.soup_server_remove_auth_domain
import org.gtkkn.native.soup.soup_server_remove_handler
import org.gtkkn.native.soup.soup_server_remove_websocket_extension
import org.gtkkn.native.soup.soup_server_set_tls_auth_mode
import org.gtkkn.native.soup.soup_server_set_tls_certificate
import org.gtkkn.native.soup.soup_server_set_tls_database
import org.gtkkn.native.soup.soup_server_unpause_message
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * A HTTP server.
 *
 * #SoupServer implements a simple HTTP server.
 *
 * To begin, create a server using [ctor@Server.new]. Add at least one
 * handler by calling [method@Server.add_handler] or
 * [method@Server.add_early_handler]; the handler will be called to
 * process any requests underneath the path you pass. (If you want all
 * requests to go to the same handler, just pass "/" (or null) for
 * the path.)
 *
 * When a new connection is accepted (or a new request is started on
 * an existing persistent connection), the #SoupServer will emit
 * [signal@Server::request-started] and then begin processing the request
 * as described below, but note that once the message is assigned a
 * status-code, then callbacks after that point will be
 * skipped. Note also that it is not defined when the callbacks happen
 * relative to various [class@ServerMessage] signals.
 *
 * Once the headers have been read, #SoupServer will check if there is
 * a [class@AuthDomain] `(qv)` covering the Request-URI; if so, and if the
 * message does not contain suitable authorization, then the
 * [class@AuthDomain] will set a status of %SOUP_STATUS_UNAUTHORIZED on
 * the message.
 *
 * After checking for authorization, #SoupServer will look for "early"
 * handlers (added with [method@Server.add_early_handler]) matching the
 * Request-URI. If one is found, it will be run; in particular, this
 * can be used to connect to signals to do a streaming read of the
 * request body.
 *
 * (At this point, if the request headers contain `Expect:
 * 100-continue`, and a status code has been set, then
 * #SoupServer will skip the remaining steps and return the response.
 * If the request headers contain `Expect:
 * 100-continue` and no status code has been set,
 * #SoupServer will return a %SOUP_STATUS_CONTINUE status before
 * continuing.)
 *
 * The server will then read in the response body (if present). At
 * this point, if there are no handlers at all defined for the
 * Request-URI, then the server will return %SOUP_STATUS_NOT_FOUND to
 * the client.
 *
 * Otherwise (assuming no previous step assigned a status to the
 * message) any "normal" handlers (added with
 * [method@Server.add_handler]) for the message's Request-URI will be
 * run.
 *
 * Then, if the path has a WebSocket handler registered (and has
 * not yet been assigned a status), #SoupServer will attempt to
 * validate the WebSocket handshake, filling in the response and
 * setting a status of %SOUP_STATUS_SWITCHING_PROTOCOLS or
 * %SOUP_STATUS_BAD_REQUEST accordingly.
 *
 * If the message still has no status code at this point (and has not
 * been paused with [method@ServerMessage.pause]), then it will be
 * given a status of %SOUP_STATUS_INTERNAL_SERVER_ERROR (because at
 * least one handler ran, but returned without assigning a status).
 *
 * Finally, the server will emit [signal@Server::request-finished] (or
 * [signal@Server::request-aborted] if an I/O error occurred before
 * handling was completed).
 *
 * If you want to handle the special "*" URI (eg, "OPTIONS *"), you
 * must explicitly register a handler for "*"; the default handler
 * will not be used for that case.
 *
 * If you want to process https connections in addition to (or instead
 * of) http connections, you can set the [property@Server:tls-certificate]
 * property.
 *
 * Once the server is set up, make one or more calls to
 * [method@Server.listen], [method@Server.listen_local], or
 * [method@Server.listen_all] to tell it where to listen for
 * connections. (All ports on a #SoupServer use the same handlers; if
 * you need to handle some ports differently, such as returning
 * different data for http and https, you'll need to create multiple
 * `SoupServer`s, or else check the passed-in URI in the handler
 * function.).
 *
 * #SoupServer will begin processing connections as soon as you return
 * to (or start) the main loop for the current thread-default
 * [struct@GLib.MainContext].
 *
 * ## Skipped during bindings generation
 *
 * - method `raw-paths`: Property has no getter nor setter
 * - method `server-header`: Property has no getter nor setter
 * - method `tls-certificate`: Property TypeInfo of getter and setter do not match
 * - method `tls-database`: Property TypeInfo of getter and setter do not match
 * - constructor `new`: Varargs parameter is not supported
 */
public open class Server(pointer: CPointer<SoupServer>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val soupServerPointer: CPointer<SoupServer>
        get() = gPointer.reinterpret()

    /**
     * A [enum@Gio.TlsAuthenticationMode] for SSL/TLS client authentication.
     */
    public open var tlsAuthMode: TlsAuthenticationMode
        /**
         * Gets the @server SSL/TLS client authentication mode.
         *
         * @return a #GTlsAuthenticationMode
         */
        get() = soup_server_get_tls_auth_mode(soupServerPointer.reinterpret()).run {
            TlsAuthenticationMode.fromNativeValue(this)
        }

        /**
         * Sets @server's #GTlsAuthenticationMode to use for SSL/TLS client authentication.
         *
         * @param mode a #GTlsAuthenticationMode
         */
        set(mode) = soup_server_set_tls_auth_mode(soupServerPointer.reinterpret(), mode.nativeValue)

    /**
     * Adds a new client stream to the @server.
     *
     * @param stream a #GIOStream
     * @param localAddr the local #GSocketAddress associated with the
     *   @stream
     * @param remoteAddr the remote #GSocketAddress associated with the
     *   @stream
     * @return true on success, false if the stream could not be
     *   accepted or any other error occurred (in which case @error will be
     *   set).
     */
    public open fun acceptIostream(
        stream: IoStream,
        localAddr: SocketAddress? = null,
        remoteAddr: SocketAddress? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_server_accept_iostream(
            soupServerPointer.reinterpret(),
            stream.gioIoStreamPointer.reinterpret(),
            localAddr?.gioSocketAddressPointer?.reinterpret(),
            remoteAddr?.gioSocketAddressPointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Adds an authentication domain to @server.
     *
     * Each auth domain will have the chance to require authentication for each
     * request that comes in; normally auth domains will require authentication for
     * requests on certain paths that they have been set up to watch, or that meet
     * other criteria set by the caller. If an auth domain determines that a request
     * requires authentication (and the request doesn't contain authentication),
     * @server will automatically reject the request with an appropriate status (401
     * Unauthorized or 407 Proxy Authentication Required). If the request used the
     * SoupServer:100-continue Expectation, @server will reject it before the
     * request body is sent.
     *
     * @param authDomain a #SoupAuthDomain
     */
    public open fun addAuthDomain(authDomain: AuthDomain): Unit =
        soup_server_add_auth_domain(soupServerPointer.reinterpret(), authDomain.soupAuthDomainPointer.reinterpret())

    /**
     * Adds an "early" handler to @server for requests prefixed by @path.
     *
     * Note that "normal" and "early" handlers are matched up together, so if you
     * add a normal handler for "/foo" and an early handler for "/foo/bar", then a
     * request to "/foo/bar" (or any path below it) will run only the early handler.
     * (But if you add both handlers at the same path, then both will get run.)
     *
     * For requests under @path (that have not already been assigned a
     * status code by a [class@AuthDomain] or a signal handler), @callback
     * will be invoked after receiving the request headers, but before
     * receiving the request body; the message's method and
     * request-headers properties will be set.
     *
     * Early handlers are generally used for processing requests with request bodies
     * in a streaming fashion. If you determine that the request will contain a
     * message body, normally you would call [method@MessageBody.set_accumulate] on
     * the message's request-body to turn off request-body accumulation, and connect
     * to the message's [signal@ServerMessage::got-chunk] signal to process each
     * chunk as it comes in.
     *
     * To complete the message processing after the full message body has
     * been read, you can either also connect to [signal@ServerMessage::got-body],
     * or else you can register a non-early handler for @path as well. As
     * long as you have not set the status-code by the time
     * [signal@ServerMessage::got-body] is emitted, the non-early handler will be
     * run as well.
     *
     * @param path the toplevel path for the handler
     * @param callback callback to invoke for
     *   requests under @path
     */
    public open fun addEarlyHandler(path: String? = null, callback: ServerCallback): Unit =
        soup_server_add_early_handler(
            soupServerPointer.reinterpret(),
            path,
            ServerCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Adds a handler to @server for requests prefixed by @path.
     *
     * If @path is null or "/", then this will be the default handler for all
     * requests that don't have a more specific handler. (Note though that if you
     * want to handle requests to the special "*" URI, you must explicitly register
     * a handler for "*"; the default handler will not be used for that case.)
     *
     * For requests under @path (that have not already been assigned a
     * status code by a [class@AuthDomain], an early server handler, or a
     * signal handler), @callback will be invoked after receiving the
     * request body; the [class@ServerMessage]'s method, request-headers,
     * and request-body properties will be set.
     *
     * After determining what to do with the request, the callback must at a minimum
     * call [method@ServerMessage.set_status] on the message to set the response
     * status code. Additionally, it may set response headers and/or fill in the
     * response body.
     *
     * If the callback cannot fully fill in the response before returning
     * (eg, if it needs to wait for information from a database, or
     * another network server), it should call [method@ServerMessage.pause]
     * to tell @server to not send the response right away. When the
     * response is ready, call [method@ServerMessage.unpause] to cause it
     * to be sent.
     *
     * To send the response body a bit at a time using "chunked" encoding, first
     * call [method@MessageHeaders.set_encoding] to set %SOUP_ENCODING_CHUNKED on
     * the response-headers. Then call [method@MessageBody.append] (or
     * [method@MessageBody.append_bytes])) to append each chunk as it becomes ready,
     * and [method@ServerMessage.unpause] to make sure it's running. (The server
     * will automatically pause the message if it is using chunked encoding but no
     * more chunks are available.) When you are done, call
     * [method@MessageBody.complete] to indicate that no more chunks are coming.
     *
     * @param path the toplevel path for the handler
     * @param callback callback to invoke for
     *   requests under @path
     */
    public open fun addHandler(path: String? = null, callback: ServerCallback): Unit = soup_server_add_handler(
        soupServerPointer.reinterpret(),
        path,
        ServerCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Add support for a WebSocket extension of the given @extension_type.
     *
     * When a WebSocket client requests an extension of @extension_type,
     * a new [class@WebsocketExtension] of type @extension_type will be created
     * to handle the request.
     *
     * Note that [class@WebsocketExtensionDeflate] is supported by default, use
     * [method@Server.remove_websocket_extension] if you want to disable it.
     *
     * @param extensionType a #GType
     */
    public open fun addWebsocketExtension(extensionType: GType): Unit =
        soup_server_add_websocket_extension(soupServerPointer.reinterpret(), extensionType)

    /**
     * Adds a WebSocket handler to @server for requests prefixed by @path.
     *
     * If @path is null or "/", then this will be the default handler for all
     * requests that don't have a more specific handler.
     *
     * When a path has a WebSocket handler registered, @server will check
     * incoming requests for WebSocket handshakes after all other handlers
     * have run (unless some earlier handler has already set a status code
     * on the message), and update the request's status, response headers,
     * and response body accordingly.
     *
     * If @origin is non-null, then only requests containing a matching
     * "Origin" header will be accepted. If @protocols is non-null, then
     * only requests containing a compatible "Sec-WebSocket-Protocols"
     * header will be accepted. More complicated requirements can be
     * handled by adding a normal handler to @path, and having it perform
     * whatever checks are needed and
     * setting a failure status code if the handshake should be rejected.
     *
     * @param path the toplevel path for the handler
     * @param origin the origin of the connection
     * @param protocols the protocols
     *   supported by this handler
     * @param callback callback to invoke for
     *   successful WebSocket requests under @path
     */
    public open fun addWebsocketHandler(
        path: String? = null,
        origin: String? = null,
        protocols: List<String>? = null,
        callback: ServerWebsocketCallback,
    ): Unit = memScoped {
        return soup_server_add_websocket_handler(
            soupServerPointer.reinterpret(),
            path,
            origin,
            protocols?.toCStringList(this),
            ServerWebsocketCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )
    }

    /**
     * Closes and frees @server's listening sockets.
     *
     * Note that if there are currently requests in progress on @server, that they
     * will continue to be processed if @server's [struct@GLib.MainContext] is still
     * running.
     *
     * You can call [method@Server.listen], etc, after calling this function
     * if you want to start listening again.
     */
    public open fun disconnect(): Unit = soup_server_disconnect(soupServerPointer.reinterpret())

    /**
     * Gets @server's list of listening sockets.
     *
     * You should treat these sockets as read-only; writing to or
     * modifiying any of these sockets may cause @server to malfunction.
     *
     * @return a
     *   list of listening sockets.
     */
    public open fun getListeners(): SList = soup_server_get_listeners(soupServerPointer.reinterpret())!!.run {
        SList(reinterpret())
    }

    /**
     * Gets the @server SSL/TLS certificate.
     *
     * @return a #GTlsCertificate or null
     */
    public open fun getTlsCertificate(): TlsCertificate? =
        soup_server_get_tls_certificate(soupServerPointer.reinterpret())?.run {
            TlsCertificate(reinterpret())
        }

    /**
     * Gets the @server SSL/TLS database.
     *
     * @return a #GTlsDatabase
     */
    public open fun getTlsDatabase(): TlsDatabase? =
        soup_server_get_tls_database(soupServerPointer.reinterpret())?.run {
            TlsDatabase(reinterpret())
        }

    /**
     * Gets a list of URIs corresponding to the interfaces @server is
     * listening on.
     *
     * These will contain IP addresses, not hostnames, and will also indicate
     * whether the given listener is http or https.
     *
     * Note that if you used [method@Server.listen_all] the returned URIs will use
     * the addresses `0.0.0.0` and `::`, rather than actually returning separate
     * URIs for each interface on the system.
     *
     * @return a list of #GUris, which you
     *   must free when you are done with it.
     */
    public open fun getUris(): SList = soup_server_get_uris(soupServerPointer.reinterpret())!!.run {
        SList(reinterpret())
    }

    /**
     * Checks whether @server is capable of https.
     *
     * In order for a server to run https, you must call
     * [method@Server.set_tls_certificate], or set the
     * [property@Server:tls-certificate] property, to provide it with a
     * certificate to use.
     *
     * If you are using the deprecated single-listener APIs, then a return value of
     * true indicates that the #SoupServer serves https exclusively. If you are
     * using [method@Server.listen], etc, then a true return value merely indicates
     * that the server is *able* to do https, regardless of whether it actually
     * currently is or not. Use [method@Server.get_uris] to see if it currently has
     * any https listeners.
     *
     * @return true if @server is configured to serve https.
     */
    public open fun isHttps(): Boolean = soup_server_is_https(soupServerPointer.reinterpret()).asBoolean()

    /**
     * Attempts to set up @server to listen for connections on @address.
     *
     * If @options includes %SOUP_SERVER_LISTEN_HTTPS, and @server has
     * been configured for TLS, then @server will listen for https
     * connections on this port. Otherwise it will listen for plain http.
     *
     * You may call this method (along with the other "listen" methods)
     * any number of times on a server, if you want to listen on multiple
     * ports, or set up both http and https service.
     *
     * After calling this method, @server will begin accepting and processing
     * connections as soon as the appropriate [struct@GLib.MainContext] is run.
     *
     * Note that this API does not make use of dual IPv4/IPv6 sockets; if
     * @address is an IPv6 address, it will only accept IPv6 connections.
     * You must configure IPv4 listening separately.
     *
     * @param address the address of the interface to listen on
     * @param options listening options for this server
     * @return true on success, false if @address could not be
     *   bound or any other error occurred (in which case @error will be
     *   set).
     */
    public open fun listen(address: SocketAddress, options: ServerListenOptions): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_server_listen(
            soupServerPointer.reinterpret(),
            address.gioSocketAddressPointer.reinterpret(),
            options.mask,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Attempts to set up @server to listen for connections on all interfaces
     * on the system.
     *
     * That is, it listens on the addresses `0.0.0.0` and/or `::`, depending on
     * whether @options includes %SOUP_SERVER_LISTEN_IPV4_ONLY,
     * %SOUP_SERVER_LISTEN_IPV6_ONLY, or neither.) If @port is specified, @server
     * will listen on that port. If it is 0, @server will find an unused port to
     * listen on. (In that case, you can use [method@Server.get_uris] to find out
     * what port it ended up choosing.
     *
     * See [method@Server.listen] for more details.
     *
     * @param port the port to listen on, or 0
     * @param options listening options for this server
     * @return true on success, false if @port could not be bound
     *   or any other error occurred (in which case @error will be set).
     */
    public open fun listenAll(port: guint, options: ServerListenOptions): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_server_listen_all(
            soupServerPointer.reinterpret(),
            port,
            options.mask,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Attempts to set up @server to listen for connections on "localhost".
     *
     * That is, `127.0.0.1` and/or `::1`, depending on whether @options includes
     * %SOUP_SERVER_LISTEN_IPV4_ONLY, %SOUP_SERVER_LISTEN_IPV6_ONLY, or neither). If
     * @port is specified, @server will listen on that port. If it is 0, @server
     * will find an unused port to listen on. (In that case, you can use
     * [method@Server.get_uris] to find out what port it ended up choosing.
     *
     * See [method@Server.listen] for more details.
     *
     * @param port the port to listen on, or 0
     * @param options listening options for this server
     * @return true on success, false if @port could not be bound
     *   or any other error occurred (in which case @error will be set).
     */
    public open fun listenLocal(port: guint, options: ServerListenOptions): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_server_listen_local(
            soupServerPointer.reinterpret(),
            port,
            options.mask,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Attempts to set up @server to listen for connections on @socket.
     *
     * See [method@Server.listen] for more details.
     *
     * @param socket a listening #GSocket
     * @param options listening options for this server
     * @return true on success, false if an error occurred (in
     *   which case @error will be set).
     */
    public open fun listenSocket(socket: Socket, options: ServerListenOptions): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = soup_server_listen_socket(
            soupServerPointer.reinterpret(),
            socket.gioSocketPointer.reinterpret(),
            options.mask,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Pauses I/O on @msg.
     *
     * This can be used when you need to return from the server handler without
     * having the full response ready yet. Use [method@Server.unpause_message] to
     * resume I/O.
     *
     * This must only be called on a [class@ServerMessage] which was created by the
     * #SoupServer and are currently doing I/O, such as those passed into a
     * [callback@ServerCallback] or emitted in a [signal@Server::request-read]
     * signal.
     *
     * @param msg a #SoupServerMessage associated with @server.
     */
    public open fun pauseMessage(msg: ServerMessage): Unit =
        soup_server_pause_message(soupServerPointer.reinterpret(), msg.soupServerMessagePointer.reinterpret())

    /**
     * Removes @auth_domain from @server.
     *
     * @param authDomain a #SoupAuthDomain
     */
    public open fun removeAuthDomain(authDomain: AuthDomain): Unit =
        soup_server_remove_auth_domain(soupServerPointer.reinterpret(), authDomain.soupAuthDomainPointer.reinterpret())

    /**
     * Removes all handlers (early and normal) registered at @path.
     *
     * @param path the toplevel path for the handler
     */
    public open fun removeHandler(path: String): Unit =
        soup_server_remove_handler(soupServerPointer.reinterpret(), path)

    /**
     * Removes support for WebSocket extension of type @extension_type (or any subclass of
     * @extension_type) from @server.
     *
     * @param extensionType a #GType
     */
    public open fun removeWebsocketExtension(extensionType: GType): Unit =
        soup_server_remove_websocket_extension(soupServerPointer.reinterpret(), extensionType)

    /**
     * Sets @server up to do https, using the given SSL/TLS @certificate.
     *
     * @param certificate a #GTlsCertificate
     */
    public open fun setTlsCertificate(certificate: TlsCertificate): Unit = soup_server_set_tls_certificate(
        soupServerPointer.reinterpret(),
        certificate.gioTlsCertificatePointer.reinterpret()
    )

    /**
     * Sets @server's #GTlsDatabase to use for validating SSL/TLS client certificates.
     *
     * @param tlsDatabase a #GTlsDatabase
     */
    public open fun setTlsDatabase(tlsDatabase: TlsDatabase): Unit =
        soup_server_set_tls_database(soupServerPointer.reinterpret(), tlsDatabase.gioTlsDatabasePointer.reinterpret())

    /**
     * Resumes I/O on @msg.
     *
     * Use this to resume after calling [method@Server.pause_message], or after
     * adding a new chunk to a chunked response.
     *
     * I/O won't actually resume until you return to the main loop.
     *
     * This must only be called on a [class@ServerMessage] which was created by the
     * #SoupServer and are currently doing I/O, such as those passed into a
     * [callback@ServerCallback] or emitted in a [signal@Server::request-read]
     * signal.
     *
     * @param msg a #SoupServerMessage associated with @server.
     */
    public open fun unpauseMessage(msg: ServerMessage): Unit =
        soup_server_unpause_message(soupServerPointer.reinterpret(), msg.soupServerMessagePointer.reinterpret())

    /**
     * Emitted when processing has failed for a message.
     *
     * This could mean either that it could not be read (if
     * [signal@Server::request-read] has not been emitted for it yet), or that
     * the response could not be written back (if [signal@Server::request-read]
     * has been emitted but [signal@Server::request-finished] has not been).
     *
     * @message is in an undefined state when this signal is
     * emitted; the signal exists primarily to allow the server to
     * free any state that it may have allocated in
     * [signal@Server::request-started].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the message
     */
    public fun connectRequestAborted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: ServerMessage) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "request-aborted",
        connectRequestAbortedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the server has finished writing a response to
     * a request.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the message
     */
    public fun connectRequestFinished(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: ServerMessage) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "request-finished",
        connectRequestFinishedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the server has successfully read a request.
     *
     * @message will have all of its request-side information
     * filled in, and if the message was authenticated, @client
     * will have information about that. This signal is emitted
     * before any (non-early) handlers are called for the message,
     * and if it sets the message's #status_code, then normal
     * handler processing will be skipped.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the message
     */
    public fun connectRequestRead(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: ServerMessage) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "request-read",
        connectRequestReadFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the server has started reading a new request.
     *
     * @message will be completely blank; not even the
     * Request-Line will have been read yet. About the only thing
     * you can usefully do with it is connect to its signals.
     *
     * If the request is read successfully, this will eventually
     * be followed by a [signal@Server::request_read signal]. If a
     * response is then sent, the request processing will end with
     * a [signal@Server::request-finished] signal. If a network error
     * occurs, the processing will instead end with
     * [signal@Server::request-aborted].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the new message
     */
    public fun connectRequestStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: ServerMessage) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "request-started",
        connectRequestStartedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<Server> {
        override val type: GeneratedClassKGType<Server> =
            GeneratedClassKGType(soup_server_get_type()) { Server(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of Server
         *
         * @return the GType
         */
        public fun getType(): GType = soup_server_get_type()
    }
}

private val connectRequestAbortedFunc: CPointer<CFunction<(CPointer<SoupServerMessage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            message: CPointer<SoupServerMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(message: ServerMessage) -> Unit>().get().invoke(
            message!!.run {
                ServerMessage(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRequestFinishedFunc: CPointer<CFunction<(CPointer<SoupServerMessage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            message: CPointer<SoupServerMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(message: ServerMessage) -> Unit>().get().invoke(
            message!!.run {
                ServerMessage(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRequestReadFunc: CPointer<CFunction<(CPointer<SoupServerMessage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            message: CPointer<SoupServerMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(message: ServerMessage) -> Unit>().get().invoke(
            message!!.run {
                ServerMessage(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRequestStartedFunc: CPointer<CFunction<(CPointer<SoupServerMessage>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            message: CPointer<SoupServerMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(message: ServerMessage) -> Unit>().get().invoke(
            message!!.run {
                ServerMessage(reinterpret())
            }
        )
    }
        .reinterpret()
