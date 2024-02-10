// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GSocketClientEvent
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_COMPLETE
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_CONNECTED
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_CONNECTING
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATED
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATING
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_RESOLVED
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_RESOLVING
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKED
import org.gtkkn.native.gio.GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKING

/**
 * Describes an event occurring on a #GSocketClient. See the
 * #GSocketClient::event signal for more details.
 *
 * Additional values may be added to this type in the future.
 * @since 2.32
 */
public enum class SocketClientEvent(
    public val nativeValue: GSocketClientEvent,
) {
    /**
     * The client is doing a DNS lookup.
     */
    RESOLVING(G_SOCKET_CLIENT_RESOLVING),

    /**
     * The client has completed a DNS lookup.
     */
    RESOLVED(G_SOCKET_CLIENT_RESOLVED),

    /**
     * The client is connecting to a remote
     *   host (either a proxy or the destination server).
     */
    CONNECTING(G_SOCKET_CLIENT_CONNECTING),

    /**
     * The client has connected to a remote
     *   host.
     */
    CONNECTED(G_SOCKET_CLIENT_CONNECTED),

    /**
     * The client is negotiating
     *   with a proxy to connect to the destination server.
     */
    PROXY_NEGOTIATING(G_SOCKET_CLIENT_PROXY_NEGOTIATING),

    /**
     * The client has negotiated
     *   with the proxy server.
     */
    PROXY_NEGOTIATED(G_SOCKET_CLIENT_PROXY_NEGOTIATED),

    /**
     * The client is performing a
     *   TLS handshake.
     */
    TLS_HANDSHAKING(G_SOCKET_CLIENT_TLS_HANDSHAKING),

    /**
     * The client has performed a
     *   TLS handshake.
     */
    TLS_HANDSHAKED(G_SOCKET_CLIENT_TLS_HANDSHAKED),

    /**
     * The client is done with a particular
     *   #GSocketConnectable.
     */
    COMPLETE(G_SOCKET_CLIENT_COMPLETE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketClientEvent): SocketClientEvent =
            when (nativeValue) {
                G_SOCKET_CLIENT_RESOLVING -> RESOLVING
                G_SOCKET_CLIENT_RESOLVED -> RESOLVED
                G_SOCKET_CLIENT_CONNECTING -> CONNECTING
                G_SOCKET_CLIENT_CONNECTED -> CONNECTED
                G_SOCKET_CLIENT_PROXY_NEGOTIATING -> PROXY_NEGOTIATING
                G_SOCKET_CLIENT_PROXY_NEGOTIATED -> PROXY_NEGOTIATED
                G_SOCKET_CLIENT_TLS_HANDSHAKING -> TLS_HANDSHAKING
                G_SOCKET_CLIENT_TLS_HANDSHAKED -> TLS_HANDSHAKED
                G_SOCKET_CLIENT_COMPLETE -> COMPLETE
                else -> error("invalid nativeValue")
            }
    }
}
