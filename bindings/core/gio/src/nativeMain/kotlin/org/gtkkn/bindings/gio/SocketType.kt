// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.native.gio.GSocketType
import org.gtkkn.native.gio.GSocketType.G_SOCKET_TYPE_DATAGRAM
import org.gtkkn.native.gio.GSocketType.G_SOCKET_TYPE_INVALID
import org.gtkkn.native.gio.GSocketType.G_SOCKET_TYPE_SEQPACKET
import org.gtkkn.native.gio.GSocketType.G_SOCKET_TYPE_STREAM

/**
 * Flags used when creating a #GSocket. Some protocols may not implement
 * all the socket types.
 * @since 2.22
 */
@GioVersion2_22
public enum class SocketType(
    public val nativeValue: GSocketType,
) {
    /**
     * Type unknown or wrong
     */
    INVALID(G_SOCKET_TYPE_INVALID),

    /**
     * Reliable connection-based byte streams (e.g. TCP).
     */
    STREAM(G_SOCKET_TYPE_STREAM),

    /**
     * Connectionless, unreliable datagram passing.
     *     (e.g. UDP)
     */
    DATAGRAM(G_SOCKET_TYPE_DATAGRAM),

    /**
     * Reliable connection-based passing of datagrams
     *     of fixed maximum length (e.g. SCTP).
     */
    SEQPACKET(G_SOCKET_TYPE_SEQPACKET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketType): SocketType =
            when (nativeValue) {
                G_SOCKET_TYPE_INVALID -> INVALID
                G_SOCKET_TYPE_STREAM -> STREAM
                G_SOCKET_TYPE_DATAGRAM -> DATAGRAM
                G_SOCKET_TYPE_SEQPACKET -> SEQPACKET
                else -> error("invalid nativeValue")
            }
    }
}
