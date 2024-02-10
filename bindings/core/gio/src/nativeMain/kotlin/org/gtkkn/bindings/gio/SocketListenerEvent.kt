// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GSocketListenerEvent
import org.gtkkn.native.gio.GSocketListenerEvent.G_SOCKET_LISTENER_BINDING
import org.gtkkn.native.gio.GSocketListenerEvent.G_SOCKET_LISTENER_BOUND
import org.gtkkn.native.gio.GSocketListenerEvent.G_SOCKET_LISTENER_LISTENED
import org.gtkkn.native.gio.GSocketListenerEvent.G_SOCKET_LISTENER_LISTENING

/**
 * Describes an event occurring on a #GSocketListener. See the
 * #GSocketListener::event signal for more details.
 *
 * Additional values may be added to this type in the future.
 * @since 2.46
 */
public enum class SocketListenerEvent(
    public val nativeValue: GSocketListenerEvent,
) {
    /**
     * The listener is about to bind a socket.
     */
    BINDING(G_SOCKET_LISTENER_BINDING),

    /**
     * The listener has bound a socket.
     */
    BOUND(G_SOCKET_LISTENER_BOUND),

    /**
     * The listener is about to start
     *    listening on this socket.
     */
    LISTENING(G_SOCKET_LISTENER_LISTENING),

    /**
     * The listener is now listening on
     *   this socket.
     */
    LISTENED(G_SOCKET_LISTENER_LISTENED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketListenerEvent): SocketListenerEvent =
            when (nativeValue) {
                G_SOCKET_LISTENER_BINDING -> BINDING
                G_SOCKET_LISTENER_BOUND -> BOUND
                G_SOCKET_LISTENER_LISTENING -> LISTENING
                G_SOCKET_LISTENER_LISTENED -> LISTENED
                else -> error("invalid nativeValue")
            }
    }
}
