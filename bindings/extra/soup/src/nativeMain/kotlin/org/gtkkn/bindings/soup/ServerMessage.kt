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
import org.gtkkn.bindings.gio.IoStream
import org.gtkkn.bindings.gio.Socket
import org.gtkkn.bindings.gio.SocketAddress
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.gio.TlsCertificateFlags
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.annotations.SoupVersion3_2
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.glib.GBytes
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
        get() = soup_server_message_get_tls_peer_certificate(soupServerMessagePointer)?.run {
            TlsCertificate(this)
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
        get() = soup_server_message_get_tls_peer_certificate_errors(soupServerMessagePointer).run {
            TlsCertificateFlags(this)
        }

    /**
     * Get the HTTP version of @msg.
     *
     * @return a #SoupHTTPVersion.
     */
    public fun getHttpVersion(): HttpVersion = soup_server_message_get_http_version(soupServerMessagePointer).run {
        HttpVersion.fromNativeValue(this)
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
        soup_server_message_get_local_address(soupServerMessagePointer)?.run {
            SocketAddress(this)
        }

    /**
     * Get the HTTP method of @msg.
     *
     * @return the HTTP method.
     */
    public fun getMethod(): String =
        soup_server_message_get_method(soupServerMessagePointer)?.toKString() ?: error("Expected not null string")

    /**
     * Get the HTTP reason phrase of @msg.
     *
     * @return the reason phrase.
     */
    public fun getReasonPhrase(): String? = soup_server_message_get_reason_phrase(soupServerMessagePointer)?.toKString()

    /**
     * Retrieves the [class@Gio.SocketAddress] associated with the remote end
     * of a connection.
     *
     * @return the #GSocketAddress
     *   associated with the remote end of a connection, it may be
     *   null if you used [class@Server.accept_iostream].
     */
    public fun getRemoteAddress(): SocketAddress? =
        soup_server_message_get_remote_address(soupServerMessagePointer)?.run {
            SocketAddress(this)
        }

    /**
     * Retrieves the IP address associated with the remote end of a
     * connection.
     *
     * @return the IP address associated with the remote
     *   end of a connection, it may be null if you used
     *   [method@Server.accept_iostream].
     */
    public fun getRemoteHost(): String? = soup_server_message_get_remote_host(soupServerMessagePointer)?.toKString()

    /**
     * Get the request body of @msg.
     *
     * @return a #SoupMessageBody.
     */
    public fun getRequestBody(): MessageBody = soup_server_message_get_request_body(soupServerMessagePointer)!!.run {
        MessageBody(this)
    }

    /**
     * Get the request headers of @msg.
     *
     * @return a #SoupMessageHeaders with the request headers.
     */
    public fun getRequestHeaders(): MessageHeaders =
        soup_server_message_get_request_headers(soupServerMessagePointer)!!.run {
            MessageHeaders(this)
        }

    /**
     * Get the response body of @msg.
     *
     * @return a #SoupMessageBody.
     */
    public fun getResponseBody(): MessageBody = soup_server_message_get_response_body(soupServerMessagePointer)!!.run {
        MessageBody(this)
    }

    /**
     * Get the response headers of @msg.
     *
     * @return a #SoupMessageHeaders with the response headers.
     */
    public fun getResponseHeaders(): MessageHeaders =
        soup_server_message_get_response_headers(soupServerMessagePointer)!!.run {
            MessageHeaders(this)
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
    public fun getSocket(): Socket? = soup_server_message_get_socket(soupServerMessagePointer)?.run {
        Socket(this)
    }

    /**
     * Get the HTTP status code of @msg.
     *
     * @return the HTTP status code.
     */
    public fun getStatus(): guint = soup_server_message_get_status(soupServerMessagePointer)

    /**
     * Get @msg's URI.
     *
     * @return a #GUri
     */
    public fun getUri(): Uri = soup_server_message_get_uri(soupServerMessagePointer)!!.run {
        Uri(this)
    }

    /**
     * Gets if @msg represents an OPTIONS message with the path `*`.
     *
     * @return true if is an OPTIONS ping
     */
    public fun isOptionsPing(): Boolean = soup_server_message_is_options_ping(soupServerMessagePointer).asBoolean()

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
    public fun pause(): Unit = soup_server_message_pause(soupServerMessagePointer)

    /**
     * Set the HTTP version of @msg.
     *
     * @param version a #SoupHTTPVersion
     */
    public fun setHttpVersion(version: HttpVersion): Unit =
        soup_server_message_set_http_version(soupServerMessagePointer, version.nativeValue)

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
        soup_server_message_set_redirect(soupServerMessagePointer, statusCode, redirectUri)

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
        soup_server_message_set_status(soupServerMessagePointer, statusCode, reasonPhrase)

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
    public fun stealConnection(): IoStream = soup_server_message_steal_connection(soupServerMessagePointer)!!.run {
        IoStream(this)
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
    public fun unpause(): Unit = soup_server_message_unpause(soupServerMessagePointer)

    /**
     * Emitted during the @msg's connection TLS handshake
     * after client TLS certificate has been received.
     * You can return true to accept @tls_certificate despite
     * @tls_errors.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tlsPeerCertificate` the peer's #GTlsCertificate; `tlsPeerErrors` the tls errors of @tls_certificate. Returns true to accept the TLS certificate and stop other
     *   handlers from being invoked, or false to propagate the
     *   event further.
     */
    public fun onAcceptCertificate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tlsPeerCertificate: TlsCertificate, tlsPeerErrors: TlsCertificateFlags) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "accept-certificate",
        onAcceptCertificateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the @msg's socket is connected and the TLS handshake completed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onConnected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "connected",
            onConnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "connected" signal. See [onConnected].
     */
    public fun emitConnected() {
        g_signal_emit_by_name(gPointer.reinterpret(), "connected")
    }

    /**
     * Emitted when the @msg's socket is disconnected.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDisconnected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "disconnected",
            onDisconnectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "disconnected" signal. See [onDisconnected].
     */
    public fun emitDisconnected() {
        g_signal_emit_by_name(gPointer.reinterpret(), "disconnected")
    }

    /**
     * Emitted when all HTTP processing is finished for a message.
     * (After [signal@ServerMessage::wrote-body]).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onFinished(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "finished",
            onFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "finished" signal. See [onFinished].
     */
    public fun emitFinished() {
        g_signal_emit_by_name(gPointer.reinterpret(), "finished")
    }

    /**
     * Emitted after receiving the complete request body.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onGotBody(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "got-body",
            onGotBodyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "got-body" signal. See [onGotBody].
     */
    public fun emitGotBody() {
        g_signal_emit_by_name(gPointer.reinterpret(), "got-body")
    }

    /**
     * Emitted after receiving a chunk of a message body.
     *
     * Note that "chunk" in this context means any subpiece of the body, not
     * necessarily the specific HTTP 1.1 chunks sent by the other side.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `chunk` the just-read chunk
     */
    public fun onGotChunk(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (chunk: Bytes) -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "got-chunk",
            onGotChunkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "got-chunk" signal. See [onGotChunk].
     *
     * @param chunk the just-read chunk
     */
    public fun emitGotChunk(chunk: Bytes) {
        g_signal_emit_by_name(gPointer.reinterpret(), "got-chunk", chunk.gPointer)
    }

    /**
     * Emitted after receiving the Request-Line and request headers.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onGotHeaders(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "got-headers",
            onGotHeadersFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "got-headers" signal. See [onGotHeaders].
     */
    public fun emitGotHeaders() {
        g_signal_emit_by_name(gPointer.reinterpret(), "got-headers")
    }

    /**
     * Emitted immediately after writing the complete response body for a
     * message.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onWroteBody(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "wrote-body",
            onWroteBodyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "wrote-body" signal. See [onWroteBody].
     */
    public fun emitWroteBody() {
        g_signal_emit_by_name(gPointer.reinterpret(), "wrote-body")
    }

    /**
     * Emitted immediately after writing a portion of the message
     * body to the network.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `chunkSize` the number of bytes written
     */
    public fun onWroteBodyData(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (chunkSize: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "wrote-body-data",
        onWroteBodyDataFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "wrote-body-data" signal. See [onWroteBodyData].
     *
     * @param chunkSize the number of bytes written
     */
    public fun emitWroteBodyData(chunkSize: guint) {
        g_signal_emit_by_name(gPointer.reinterpret(), "wrote-body-data", chunkSize)
    }

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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onWroteChunk(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "wrote-chunk",
            onWroteChunkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "wrote-chunk" signal. See [onWroteChunk].
     */
    public fun emitWroteChunk() {
        g_signal_emit_by_name(gPointer.reinterpret(), "wrote-chunk")
    }

    /**
     * Emitted immediately after writing the response headers for a
     * message.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onWroteHeaders(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "wrote-headers",
            onWroteHeadersFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "wrote-headers" signal. See [onWroteHeaders].
     */
    public fun emitWroteHeaders() {
        g_signal_emit_by_name(gPointer.reinterpret(), "wrote-headers")
    }

    /**
     * Emitted immediately after writing a 1xx (Informational) response.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onWroteInformational(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "wrote-informational",
            onWroteInformationalFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "wrote-informational" signal. See [onWroteInformational].
     */
    public fun emitWroteInformational() {
        g_signal_emit_by_name(gPointer.reinterpret(), "wrote-informational")
    }

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

private val onAcceptCertificateFunc:
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
                TlsCertificate(this)
            },
            tlsPeerErrors.run {
                TlsCertificateFlags(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val onConnectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDisconnectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onFinishedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onGotBodyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onGotChunkFunc: CPointer<CFunction<(CPointer<GBytes>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        chunk: CPointer<GBytes>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(chunk: Bytes) -> Unit>().get().invoke(
        chunk!!.run {
            Bytes(this)
        }
    )
}
    .reinterpret()

private val onGotHeadersFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onWroteBodyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onWroteBodyDataFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        chunkSize: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(chunkSize: guint) -> Unit>().get().invoke(chunkSize)
}
    .reinterpret()

private val onWroteChunkFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onWroteHeadersFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onWroteInformationalFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
