// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.native.gio.GSocketListenerEvent

/**
 * Describes an event occurring on a #GSocketListener. See the
 * #GSocketListener::event signal for more details.
 *
 * Additional values may be added to this type in the future.
 * @since 2.46
 */
@GioVersion2_46
public enum class SocketListenerEvent(
    public val nativeValue: GSocketListenerEvent,
) {
    /**
     * The listener is about to bind a socket.
     */
    BINDING(GSocketListenerEvent.G_SOCKET_LISTENER_BINDING),

    /**
     * The listener has bound a socket.
     */
    BOUND(GSocketListenerEvent.G_SOCKET_LISTENER_BOUND),

    /**
     * The listener is about to start
     *    listening on this socket.
     */
    LISTENING(GSocketListenerEvent.G_SOCKET_LISTENER_LISTENING),

    /**
     * The listener is now listening on
     *   this socket.
     */
    LISTENED(GSocketListenerEvent.G_SOCKET_LISTENER_LISTENED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketListenerEvent): SocketListenerEvent =
            when (nativeValue) {
                GSocketListenerEvent.G_SOCKET_LISTENER_BINDING -> BINDING
                GSocketListenerEvent.G_SOCKET_LISTENER_BOUND -> BOUND
                GSocketListenerEvent.G_SOCKET_LISTENER_LISTENING -> LISTENING
                GSocketListenerEvent.G_SOCKET_LISTENER_LISTENED -> LISTENED
                else -> error("invalid nativeValue")
            }
    }
}
