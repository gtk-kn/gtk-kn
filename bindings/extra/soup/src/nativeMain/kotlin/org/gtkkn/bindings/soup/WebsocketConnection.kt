// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GBytes
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.glib.gushort
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.soup.SoupWebsocketConnection
import org.gtkkn.native.soup.soup_websocket_connection_close
import org.gtkkn.native.soup.soup_websocket_connection_get_close_code
import org.gtkkn.native.soup.soup_websocket_connection_get_close_data
import org.gtkkn.native.soup.soup_websocket_connection_get_connection_type
import org.gtkkn.native.soup.soup_websocket_connection_get_extensions
import org.gtkkn.native.soup.soup_websocket_connection_get_io_stream
import org.gtkkn.native.soup.soup_websocket_connection_get_keepalive_interval
import org.gtkkn.native.soup.soup_websocket_connection_get_max_incoming_payload_size
import org.gtkkn.native.soup.soup_websocket_connection_get_origin
import org.gtkkn.native.soup.soup_websocket_connection_get_protocol
import org.gtkkn.native.soup.soup_websocket_connection_get_state
import org.gtkkn.native.soup.soup_websocket_connection_get_type
import org.gtkkn.native.soup.soup_websocket_connection_get_uri
import org.gtkkn.native.soup.soup_websocket_connection_new
import org.gtkkn.native.soup.soup_websocket_connection_send_message
import org.gtkkn.native.soup.soup_websocket_connection_send_text
import org.gtkkn.native.soup.soup_websocket_connection_set_keepalive_interval
import org.gtkkn.native.soup.soup_websocket_connection_set_max_incoming_payload_size
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The WebSocket Protocol
 *
 * Provides support for the [WebSocket](http://tools.ietf.org/html/rfc6455)
 * protocol.
 *
 * To connect to a WebSocket server, create a [class@Session] and call
 * [method@Session.websocket_connect_async]. To accept WebSocket
 * connections, create a [class@Server] and add a handler to it with
 * [method@Server.add_websocket_handler].
 *
 * (Lower-level support is available via
 * [func@websocket_client_prepare_handshake] and
 * [func@websocket_client_verify_handshake], for handling the client side of the
 * WebSocket handshake, and [func@websocket_server_process_handshake] for
 * handling the server side.)
 *
 * #SoupWebsocketConnection handles the details of WebSocket communication. You
 * can use [method@WebsocketConnection.send_text] and
 * [method@WebsocketConnection.send_binary] to send data, and the
 * [signal@WebsocketConnection::message] signal to receive data.
 * (#SoupWebsocketConnection currently only supports asynchronous I/O.)
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Array parameter of type guint8 is not supported
 */
public class WebsocketConnection(public val soupWebsocketConnectionPointer: CPointer<SoupWebsocketConnection>) :
    Object(soupWebsocketConnectionPointer.reinterpret()),
    KGTyped {
    /**
     * The type of connection (client/server).
     */
    public val connectionType: WebsocketConnectionType
        /**
         * Get the connection type (client/server) of the connection.
         *
         * @return the connection type
         */
        get() = soup_websocket_connection_get_connection_type(soupWebsocketConnectionPointer).run {
            WebsocketConnectionType.fromNativeValue(this)
        }

    /**
     * List of [class@WebsocketExtension] objects that are active in the connection.
     */
    public val extensions: List
        /**
         * Get the extensions chosen via negotiation with the peer.
         *
         * @return a #GList of #SoupWebsocketExtension objects
         */
        get() = soup_websocket_connection_get_extensions(soupWebsocketConnectionPointer)!!.run {
            List(this)
        }

    /**
     * The underlying IO stream the WebSocket is communicating
     * over.
     *
     * The input and output streams must be pollable streams.
     */
    public val ioStream: IoStream
        /**
         * Get the I/O stream the WebSocket is communicating over.
         *
         * @return the WebSocket's I/O stream.
         */
        get() = soup_websocket_connection_get_io_stream(soupWebsocketConnectionPointer)!!.run {
            IoStream.IoStreamImpl(this)
        }

    /**
     * Interval in seconds on when to send a ping message which will
     * serve as a keepalive message.
     *
     * If set to 0 the keepalive message is disabled.
     */
    public var keepaliveInterval: guint
        /**
         * Gets the keepalive interval in seconds or 0 if disabled.
         *
         * @return the keepalive interval.
         */
        get() = soup_websocket_connection_get_keepalive_interval(soupWebsocketConnectionPointer)

        /**
         * Sets the interval in seconds on when to send a ping message which will serve
         * as a keepalive message.
         *
         * If set to 0 the keepalive message is disabled.
         *
         * @param interval the interval to send a ping message or 0 to disable it
         */
        set(interval) = soup_websocket_connection_set_keepalive_interval(soupWebsocketConnectionPointer, interval)

    /**
     * The maximum payload size for incoming packets.
     *
     * The protocol expects or 0 to not limit it.
     */
    public var maxIncomingPayloadSize: guint64
        /**
         * Gets the maximum payload size allowed for incoming packets.
         *
         * @return the maximum payload size.
         */
        get() = soup_websocket_connection_get_max_incoming_payload_size(soupWebsocketConnectionPointer)

        /**
         * Sets the maximum payload size allowed for incoming packets.
         *
         * It does not limit the outgoing packet size.
         *
         * @param maxIncomingPayloadSize the maximum payload size
         */
        set(
            maxIncomingPayloadSize
        ) = soup_websocket_connection_set_max_incoming_payload_size(
            soupWebsocketConnectionPointer,
            maxIncomingPayloadSize
        )

    /**
     * The client's Origin.
     */
    public val origin: String?
        /**
         * Get the origin of the WebSocket.
         *
         * @return the origin
         */
        get() = soup_websocket_connection_get_origin(soupWebsocketConnectionPointer)?.toKString()

    /**
     * The chosen protocol, or null if a protocol was not agreed
     * upon.
     */
    public val protocol: String?
        /**
         * Get the protocol chosen via negotiation with the peer.
         *
         * @return the chosen protocol
         */
        get() = soup_websocket_connection_get_protocol(soupWebsocketConnectionPointer)?.toKString()

    /**
     * The current state of the WebSocket.
     */
    public val state: WebsocketState
        /**
         * Get the current state of the WebSocket.
         *
         * @return the state
         */
        get() = soup_websocket_connection_get_state(soupWebsocketConnectionPointer).run {
            WebsocketState.fromNativeValue(this)
        }

    /**
     * The URI of the WebSocket.
     *
     * For servers this represents the address of the WebSocket,
     * and for clients it is the address connected to.
     */
    public val uri: Uri
        /**
         * Get the URI of the WebSocket.
         *
         * For servers this represents the address of the WebSocket, and
         * for clients it is the address connected to.
         *
         * @return the URI
         */
        get() = soup_websocket_connection_get_uri(soupWebsocketConnectionPointer)!!.run {
            Uri(this)
        }

    /**
     * Creates a #SoupWebsocketConnection on @stream with the given active @extensions.
     *
     * This should be called after completing the handshake to begin using the WebSocket
     * protocol.
     *
     * @param stream a #GIOStream connected to the WebSocket server
     * @param uri the URI of the connection
     * @param type the type of connection (client/side)
     * @param origin the Origin of the client
     * @param protocol the subprotocol in use
     * @param extensions a #GList of #SoupWebsocketExtension objects
     * @return a new #SoupWebsocketConnection
     */
    public constructor(
        stream: IoStream,
        uri: Uri,
        type: WebsocketConnectionType,
        origin: String? = null,
        protocol: String? = null,
        extensions: List,
    ) : this(
        soup_websocket_connection_new(
            stream.gioIoStreamPointer,
            uri.glibUriPointer,
            type.nativeValue,
            origin,
            protocol,
            extensions.glibListPointer
        )!!.reinterpret()
    )

    /**
     * Close the connection in an orderly fashion.
     *
     * Note that until the [signal@WebsocketConnection::closed] signal fires, the connection
     * is not yet completely closed. The close message is not even sent until the
     * main loop runs.
     *
     * The @code and @data are sent to the peer along with the close request.
     * If @code is %SOUP_WEBSOCKET_CLOSE_NO_STATUS a close message with no body
     * (without code and data) is sent.
     * Note that the @data must be UTF-8 valid.
     *
     * @param code close code
     * @param data close data
     */
    public fun close(code: gushort, `data`: String? = null): Unit =
        soup_websocket_connection_close(soupWebsocketConnectionPointer, code, `data`)

    /**
     * Get the close code received from the WebSocket peer.
     *
     * This only becomes valid once the WebSocket is in the
     * %SOUP_WEBSOCKET_STATE_CLOSED state. The value will often be in the
     * [enum@WebsocketCloseCode] enumeration, but may also be an application
     * defined close code.
     *
     * @return the close code or zero.
     */
    public fun getCloseCode(): gushort = soup_websocket_connection_get_close_code(soupWebsocketConnectionPointer)

    /**
     * Get the close data received from the WebSocket peer.
     *
     * This only becomes valid once the WebSocket is in the
     * %SOUP_WEBSOCKET_STATE_CLOSED state. The data may be freed once
     * the main loop is run, so copy it if you need to keep it around.
     *
     * @return the close data or null
     */
    public fun getCloseData(): String =
        soup_websocket_connection_get_close_data(soupWebsocketConnectionPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Send a message of the given @type to the peer. Note that this method,
     * allows to send text messages containing null characters.
     *
     * The message is queued to be sent and will be sent when the main loop
     * is run.
     *
     * @param type the type of message contents
     * @param message the message data as #GBytes
     */
    public fun sendMessage(type: WebsocketDataType, message: Bytes): Unit = soup_websocket_connection_send_message(
        soupWebsocketConnectionPointer,
        type.nativeValue,
        message.glibBytesPointer
    )

    /**
     * Send a null-terminated text (UTF-8) message to the peer.
     *
     * If you need to send text messages containing null characters use
     * [method@WebsocketConnection.send_message] instead.
     *
     * The message is queued to be sent and will be sent when the main loop
     * is run.
     *
     * @param text the message contents
     */
    public fun sendText(text: String): Unit = soup_websocket_connection_send_text(soupWebsocketConnectionPointer, text)

    /**
     * Emitted when the connection has completely closed.
     *
     * This happens either due to an orderly close from the peer, one
     * initiated via [method@WebsocketConnection.close] or a fatal error
     * condition that caused a close.
     *
     * This signal will be emitted once.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClosed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            soupWebsocketConnectionPointer,
            "closed",
            onClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "closed" signal. See [onClosed].
     */
    public fun emitClosed() {
        g_signal_emit_by_name(soupWebsocketConnectionPointer.reinterpret(), "closed")
    }

    /**
     * This signal will be emitted during an orderly close.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClosing(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            soupWebsocketConnectionPointer,
            "closing",
            onClosingFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "closing" signal. See [onClosing].
     */
    public fun emitClosing() {
        g_signal_emit_by_name(soupWebsocketConnectionPointer.reinterpret(), "closing")
    }

    /**
     * Emitted when an error occurred on the WebSocket.
     *
     * This may be fired multiple times. Fatal errors will be followed by
     * the [signal@WebsocketConnection::closed] signal being emitted.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `error` the error that occured
     */
    public fun onError(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (error: Error) -> Unit): ULong =
        g_signal_connect_data(
            soupWebsocketConnectionPointer,
            "error",
            onErrorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "error" signal. See [onError].
     *
     * @param error the error that occured
     */
    public fun emitError(error: Error) {
        g_signal_emit_by_name(soupWebsocketConnectionPointer.reinterpret(), "error", error.glibErrorPointer)
    }

    /**
     * Emitted when we receive a message from the peer.
     *
     * As a convenience, the @message data will always be
     * null-terminated, but the NUL byte will not be included in
     * the length count.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `type` the type of message contents; `message` the message data
     */
    public fun onMessage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (type: gint, message: Bytes) -> Unit,
    ): ULong = g_signal_connect_data(
        soupWebsocketConnectionPointer,
        "message",
        onMessageFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "message" signal. See [onMessage].
     *
     * @param type the type of message contents
     * @param message the message data
     */
    public fun emitMessage(type: gint, message: Bytes) {
        g_signal_emit_by_name(soupWebsocketConnectionPointer.reinterpret(), "message", type, message.glibBytesPointer)
    }

    /**
     * Emitted when we receive a Pong frame (solicited or
     * unsolicited) from the peer.
     *
     * As a convenience, the @message data will always be
     * null-terminated, but the NUL byte will not be included in
     * the length count.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the application data (if any)
     */
    public fun onPong(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (message: Bytes) -> Unit): ULong =
        g_signal_connect_data(
            soupWebsocketConnectionPointer,
            "pong",
            onPongFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "pong" signal. See [onPong].
     *
     * @param message the application data (if any)
     */
    public fun emitPong(message: Bytes) {
        g_signal_emit_by_name(soupWebsocketConnectionPointer.reinterpret(), "pong", message.glibBytesPointer)
    }

    public companion object : TypeCompanion<WebsocketConnection> {
        override val type: GeneratedClassKGType<WebsocketConnection> =
            GeneratedClassKGType(soup_websocket_connection_get_type()) { WebsocketConnection(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of WebsocketConnection
         *
         * @return the GType
         */
        public fun getType(): GType = soup_websocket_connection_get_type()
    }
}

private val onClosedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onClosingFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onErrorFunc: CPointer<CFunction<(CPointer<GError>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        error: CPointer<GError>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(error: Error) -> Unit>().get().invoke(
        error!!.run {
            Error(this)
        }
    )
}
    .reinterpret()

private val onMessageFunc: CPointer<CFunction<(gint, CPointer<GBytes>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        type: gint,
        message: CPointer<GBytes>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(type: gint, message: Bytes) -> Unit>().get().invoke(
        type,
        message!!.run {
            Bytes(this)
        }
    )
}
    .reinterpret()

private val onPongFunc: CPointer<CFunction<(CPointer<GBytes>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        message: CPointer<GBytes>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(message: Bytes) -> Unit>().get().invoke(
        message!!.run {
            Bytes(this)
        }
    )
}
    .reinterpret()
