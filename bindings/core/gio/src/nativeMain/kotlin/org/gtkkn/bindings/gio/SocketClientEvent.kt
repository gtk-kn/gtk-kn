// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.native.gio.GSocketClientEvent
import org.gtkkn.native.gio.g_socket_client_event_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes an event occurring on a #GSocketClient. See the
 * #GSocketClient::event signal for more details.
 *
 * Additional values may be added to this type in the future.
 * @since 2.32
 */
@GioVersion2_32
public enum class SocketClientEvent(public val nativeValue: GSocketClientEvent) {
    /**
     * The client is doing a DNS lookup.
     */
    RESOLVING(GSocketClientEvent.G_SOCKET_CLIENT_RESOLVING),

    /**
     * The client has completed a DNS lookup.
     */
    RESOLVED(GSocketClientEvent.G_SOCKET_CLIENT_RESOLVED),

    /**
     * The client is connecting to a remote
     *   host (either a proxy or the destination server).
     */
    CONNECTING(GSocketClientEvent.G_SOCKET_CLIENT_CONNECTING),

    /**
     * The client has connected to a remote
     *   host.
     */
    CONNECTED(GSocketClientEvent.G_SOCKET_CLIENT_CONNECTED),

    /**
     * The client is negotiating
     *   with a proxy to connect to the destination server.
     */
    PROXY_NEGOTIATING(GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATING),

    /**
     * The client has negotiated
     *   with the proxy server.
     */
    PROXY_NEGOTIATED(GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATED),

    /**
     * The client is performing a
     *   TLS handshake.
     */
    TLS_HANDSHAKING(GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKING),

    /**
     * The client has performed a
     *   TLS handshake.
     */
    TLS_HANDSHAKED(GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKED),

    /**
     * The client is done with a particular
     *   #GSocketConnectable.
     */
    COMPLETE(GSocketClientEvent.G_SOCKET_CLIENT_COMPLETE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketClientEvent): SocketClientEvent = when (nativeValue) {
            GSocketClientEvent.G_SOCKET_CLIENT_RESOLVING -> RESOLVING
            GSocketClientEvent.G_SOCKET_CLIENT_RESOLVED -> RESOLVED
            GSocketClientEvent.G_SOCKET_CLIENT_CONNECTING -> CONNECTING
            GSocketClientEvent.G_SOCKET_CLIENT_CONNECTED -> CONNECTED
            GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATING -> PROXY_NEGOTIATING
            GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATED -> PROXY_NEGOTIATED
            GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKING -> TLS_HANDSHAKING
            GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKED -> TLS_HANDSHAKED
            GSocketClientEvent.G_SOCKET_CLIENT_COMPLETE -> COMPLETE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of SocketClientEvent
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_client_event_get_type()
    }
}
