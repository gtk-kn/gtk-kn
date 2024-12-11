// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.IOStream
import org.gtkkn.bindings.gio.Socket
import org.gtkkn.bindings.gio.SocketAddress
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.gio.TlsCertificateFlags
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.annotations.SoupVersion3_2
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.glib.GBytes
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.soup.SoupServerMessage
import org.gtkkn.native.soup.soup_server_message_get_http_version
import org.gtkkn.native.soup.soup_server_message_get_local_address
import org.gtkkn.native.soup.soup_server_message_get_method
import org.gtkkn.native.soup.soup_server_message_get_reason_phrase
import org.gtkkn.native.soup.soup_server_message_get_remote_address
import org.gtkkn.native.soup.soup_server_message_get_remote_host
import org.gtkkn.native.soup.soup_server_message_get_request_body
import org.gtkkn.native.soup.soup_server_message_get_request_headers
import org.gtkkn.native.soup.soup_server_message_get_response_body
import org.gtkkn.native.soup.soup_server_message_get_response_headers
import org.gtkkn.native.soup.soup_server_message_get_socket
import org.gtkkn.native.soup.soup_server_message_get_status
import org.gtkkn.native.soup.soup_server_message_get_tls_peer_certificate
import org.gtkkn.native.soup.soup_server_message_get_tls_peer_certificate_errors
import org.gtkkn.native.soup.soup_server_message_get_type
import org.gtkkn.native.soup.soup_server_message_get_uri
import org.gtkkn.native.soup.soup_server_message_is_options_ping
import org.gtkkn.native.soup.soup_server_message_pause
import org.gtkkn.native.soup.soup_server_message_set_http_version
import org.gtkkn.native.soup.soup_server_message_set_redirect
import org.gtkkn.native.soup.soup_server_message_set_status
import org.gtkkn.native.soup.soup_server_message_steal_connection
import org.gtkkn.native.soup.soup_server_message_unpause
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * An HTTP server request and response pair.
 *
 * A SoupServerMessage represents an HTTP message that is being sent or
 * received on a [class@Server].
 *
 * [class@Server] will create `SoupServerMessage`s automatically for
 * incoming requests, which your application will receive via handlers.
 *
 * Note that libsoup's terminology here does not quite match the HTTP
 * specification: in RFC 2616, an "HTTP-message" is *either* a Request, *or* a
 * Response. In libsoup, a #SoupServerMessage combines both the request and the
 * response.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `resp_body`: Array parameter of type guint8 is not supported
 */
public class ServerMessage(pointer: CPointer<SoupServerMessage>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val soupServerMessagePointer: CPointer<SoupServerMessage>
        get() = gPointer.reinterpret()

    /**
     * The peer's #GTlsCertificate associated with the message
     *
     * @since 3.2
     */
    @SoupVersion3_2
    public val tlsPeerCertificate: TlsCertificate?
        /**
         * Gets the peer's #GTlsCertificate associated with @msg's connection.
         * Note that this is not set yet during the emission of
         * SoupServerMessage::accept-certificate signal.
         *
         * @return @msg's TLS peer certificate,
         *    or null if @msg's connection is not SSL.
         * @since 3.2
         */
        get() = soup_server_message_get_tls_peer_certificate(soupServerMessagePointer.reinterpret())?.run {
            TlsCertificate(reinterpret())
        }

    /**
     * The verification errors on #SoupServerMessage:tls-peer-certificate
     *
     * @since 3.2
     */
    @SoupVersion3_2
    public val tlsPeerCertificateErrors: TlsCertificateFlags
        /**
         * Gets the errors associated with validating @msg's TLS peer certificate.
         * Note that this is not set yet during the emission of
         * SoupServerMessage::accept-certificate signal.
         *
         * @return a #GTlsCertificateFlags with @msg's TLS peer certificate errors.
         * @since 3.2
         */
        get() = soup_server_message_get_tls_peer_certificate_errors(soupServerMessagePointer.reinterpret()).run {
            TlsCertificateFlags(this)
        }

    /**
     * Get the HTTP version of @msg.
     *
     * @return a #SoupHTTPVersion.
     */
    public fun getHttpVersion(): HTTPVersion =
        soup_server_message_get_http_version(soupServerMessagePointer.reinterpret()).run {
            HTTPVersion.fromNativeValue(this)
        }

    /**
     * Retrieves the [class@Gio.SocketAddress] associated with the local end
     * of a connection.
     *
     * @return the #GSocketAddress
     *   associated with the local end of a connection, it may be
     *   null if you used [method@Server.accept_iostream].
     */
    public fun getLocalAddress(): SocketAddress? =
        soup_server_message_get_local_address(soupServerMessagePointer.reinterpret())?.run {
            SocketAddress(reinterpret())
        }

    /**
     * Get the HTTP method of @msg.
     *
     * @return the HTTP method.
     */
    public fun getMethod(): String = soup_server_message_get_method(soupServerMessagePointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Get the HTTP reason phrase of @msg.
     *
     * @return the reason phrase.
     */
    public fun getReasonPhrase(): String? =
        soup_server_message_get_reason_phrase(soupServerMessagePointer.reinterpret())?.toKString()

    /**
     * Retrieves the [class@Gio.SocketAddress] associated with the remote end
     * of a connection.
     *
     * @return the #GSocketAddress
     *   associated with the remote end of a connection, it may be
     *   null if you used [class@Server.accept_iostream].
     */
    public fun getRemoteAddress(): SocketAddress? =
        soup_server_message_get_remote_address(soupServerMessagePointer.reinterpret())?.run {
            SocketAddress(reinterpret())
        }

    /**
     * Retrieves the IP address associated with the remote end of a
     * connection.
     *
     * @return the IP address associated with the remote
     *   end of a connection, it may be null if you used
     *   [method@Server.accept_iostream].
     */
    public fun getRemoteHost(): String? =
        soup_server_message_get_remote_host(soupServerMessagePointer.reinterpret())?.toKString()

    /**
     * Get the request body of @msg.
     *
     * @return a #SoupMessageBody.
     */
    public fun getRequestBody(): MessageBody =
        soup_server_message_get_request_body(soupServerMessagePointer.reinterpret())!!.run {
            MessageBody(reinterpret())
        }

    /**
     * Get the request headers of @msg.
     *
     * @return a #SoupMessageHeaders with the request headers.
     */
    public fun getRequestHeaders(): MessageHeaders =
        soup_server_message_get_request_headers(soupServerMessagePointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
        }

    /**
     * Get the response body of @msg.
     *
     * @return a #SoupMessageBody.
     */
    public fun getResponseBody(): MessageBody =
        soup_server_message_get_response_body(soupServerMessagePointer.reinterpret())!!.run {
            MessageBody(reinterpret())
        }

    /**
     * Get the response headers of @msg.
     *
     * @return a #SoupMessageHeaders with the response headers.
     */
    public fun getResponseHeaders(): MessageHeaders =
        soup_server_message_get_response_headers(soupServerMessagePointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
        }

    /**
     * Retrieves the [class@Gio.Socket] that @msg is associated with.
     *
     * If you are using this method to observe when multiple requests are
     * made on the same persistent HTTP connection (eg, as the ntlm-test
     * test program does), you will need to pay attention to socket
     * destruction as well (eg, by using weak references), so that you do
     * not get fooled when the allocator reuses the memory address of a
     * previously-destroyed socket to represent a new socket.
     *
     * @return the #GSocket that @msg is
     *   associated with, null if you used [method@Server.accept_iostream].
     */
    public fun getSocket(): Socket? = soup_server_message_get_socket(soupServerMessagePointer.reinterpret())?.run {
        Socket(reinterpret())
    }

    /**
     * Get the HTTP status code of @msg.
     *
     * @return the HTTP status code.
     */
    public fun getStatus(): guint = soup_server_message_get_status(soupServerMessagePointer.reinterpret())

    /**
     * Get @msg's URI.
     *
     * @return a #GUri
     */
    public fun getUri(): Uri = soup_server_message_get_uri(soupServerMessagePointer.reinterpret())!!.run {
        Uri(reinterpret())
    }

    /**
     * Gets if @msg represents an OPTIONS message with the path `*`.
     *
     * @return true if is an OPTIONS ping
     */
    public fun isOptionsPing(): Boolean =
        soup_server_message_is_options_ping(soupServerMessagePointer.reinterpret()).asBoolean()

    /**
     * Pauses I/O on @msg.
     *
     * This can be used when you need to return from the server handler without
     * having the full response ready yet. Use [method@ServerMessage.unpause] to
     * resume I/O.
     *
     * @since 3.2
     */
    @SoupVersion3_2
    public fun pause(): Unit = soup_server_message_pause(soupServerMessagePointer.reinterpret())

    /**
     * Set the HTTP version of @msg.
     *
     * @param version a #SoupHTTPVersion
     */
    public fun setHttpVersion(version: HTTPVersion): Unit =
        soup_server_message_set_http_version(soupServerMessagePointer.reinterpret(), version.nativeValue)

    /**
     * Sets @msg's status_code to @status_code and adds a Location header
     * pointing to @redirect_uri. Use this from a [class@Server] when you
     * want to redirect the client to another URI.
     *
     * @redirect_uri can be a relative URI, in which case it is
     * interpreted relative to @msg's current URI. In particular, if
     * @redirect_uri is just a path, it will replace the path
     * *and query* of @msg's URI.
     *
     * @param statusCode a 3xx status code
     * @param redirectUri the URI to redirect @msg to
     */
    public fun setRedirect(statusCode: guint, redirectUri: String): Unit =
        soup_server_message_set_redirect(soupServerMessagePointer.reinterpret(), statusCode, redirectUri)

    /**
     * Sets @msg's status code to @status_code.
     *
     * If @status_code is a known value and @reason_phrase is null, the
     * reason_phrase will be set automatically.
     *
     * @param statusCode an HTTP status code
     * @param reasonPhrase a reason phrase
     */
    public fun setStatus(statusCode: guint, reasonPhrase: String? = null): Unit =
        soup_server_message_set_status(soupServerMessagePointer.reinterpret(), statusCode, reasonPhrase)

    /**
     * "Steals" the HTTP connection associated with @msg from its #SoupServer. This
     * happens immediately, regardless of the current state of the connection; if
     * the response to @msg has not yet finished being sent, then it will be
     * discarded; you can steal the connection from a
     * [signal@ServerMessage::wrote-informational] or
     * [signal@ServerMessage::wrote-body] signal handler if you need to wait for
     * part or all of the response to be sent.
     *
     * Note that when calling this function from C, @msg will most
     * likely be freed as a side effect.
     *
     * @return the #GIOStream formerly associated
     *   with @msg (or null if @msg was no longer associated with a
     *   connection). No guarantees are made about what kind of #GIOStream
     *   is returned.
     */
    public fun stealConnection(): IOStream =
        soup_server_message_steal_connection(soupServerMessagePointer.reinterpret())!!.run {
            IOStream(reinterpret())
        }

    /**
     * Resumes I/O on @msg.
     *
     * Use this to resume after calling [method@ServerMessage.pause], or after
     * adding a new chunk to a chunked response. I/O won't actually resume until you
     * return to the main loop.
     *
     * @since 3.2
     */
    @SoupVersion3_2
    public fun unpause(): Unit = soup_server_message_unpause(soupServerMessagePointer.reinterpret())

    /**
     * Emitted during the @msg's connection TLS handshake
     * after client TLS certificate has been received.
     * You can return true to accept @tls_certificate despite
     * @tls_errors.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tlsPeerCertificate` the peer's #GTlsCertificate; `tlsPeerErrors` the tls errors of @tls_certificate. Returns true to accept the TLS certificate and stop other
     *   handlers from being invoked, or false to propagate the
     *   event further.
     */
    public fun connectAcceptCertificate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tlsPeerCertificate: TlsCertificate, tlsPeerErrors: TlsCertificateFlags) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "accept-certificate",
        connectAcceptCertificateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the @msg's socket is connected and the TLS handshake completed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectConnected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "connected",
            connectConnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the @msg's socket is disconnected.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectDisconnected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "disconnected",
            connectDisconnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when all HTTP processing is finished for a message.
     * (After [signal@ServerMessage::wrote-body]).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "finished",
            connectFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after receiving the complete request body.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectGotBody(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "got-body",
            connectGotBodyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after receiving a chunk of a message body.
     *
     * Note that "chunk" in this context means any subpiece of the body, not
     * necessarily the specific HTTP 1.1 chunks sent by the other side.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `chunk` the just-read chunk
     */
    public fun connectGotChunk(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (chunk: Bytes) -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "got-chunk",
            connectGotChunkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after receiving the Request-Line and request headers.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectGotHeaders(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "got-headers",
            connectGotHeadersFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted immediately after writing the complete response body for a
     * message.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWroteBody(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrote-body",
            connectWroteBodyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted immediately after writing a portion of the message
     * body to the network.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `chunkSize` the number of bytes written
     */
    public fun connectWroteBodyData(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (chunkSize: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "wrote-body-data",
        connectWroteBodyDataFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted immediately after writing a body chunk for a message.
     *
     * Note that this signal is not parallel to
     * [signal@ServerMessage::got-chunk]; it is emitted only when a complete
     * chunk (added with [method@MessageBody.append] or
     * [method@MessageBody.append_bytes] has been written. To get
     * more useful continuous progress information, use
     * [signal@ServerMessage::wrote-body-data].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWroteChunk(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrote-chunk",
            connectWroteChunkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted immediately after writing the response headers for a
     * message.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWroteHeaders(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrote-headers",
            connectWroteHeadersFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted immediately after writing a 1xx (Informational) response.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWroteInformational(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrote-informational",
            connectWroteInformationalFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ServerMessage> {
        override val type: GeneratedClassKGType<ServerMessage> =
            GeneratedClassKGType(soup_server_message_get_type()) { ServerMessage(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of ServerMessage
         *
         * @return the GType
         */
        public fun getType(): GType = soup_server_message_get_type()
    }
}

private val connectAcceptCertificateFunc:
    CPointer<CFunction<(CPointer<GTlsCertificate>, GTlsCertificateFlags) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            tlsPeerCertificate: CPointer<GTlsCertificate>?,
            tlsPeerErrors: GTlsCertificateFlags,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                tlsPeerCertificate: TlsCertificate,
                tlsPeerErrors: TlsCertificateFlags,
            ) -> Boolean
            >().get().invoke(
            tlsPeerCertificate!!.run {
                TlsCertificate(reinterpret())
            },
            tlsPeerErrors.run {
                TlsCertificateFlags(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectConnectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectDisconnectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectGotBodyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectGotChunkFunc: CPointer<CFunction<(CPointer<GBytes>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        chunk: CPointer<GBytes>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(chunk: Bytes) -> Unit>().get().invoke(
        chunk!!.run {
            Bytes(reinterpret())
        }
    )
}
    .reinterpret()

private val connectGotHeadersFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectWroteBodyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectWroteBodyDataFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        chunkSize: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(chunkSize: guint) -> Unit>().get().invoke(chunkSize)
}
    .reinterpret()

private val connectWroteChunkFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectWroteHeadersFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectWroteInformationalFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
