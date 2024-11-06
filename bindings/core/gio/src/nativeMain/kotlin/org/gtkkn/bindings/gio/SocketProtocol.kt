// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.native.gio.GSocketProtocol
import org.gtkkn.native.gio.GSocketProtocol.G_SOCKET_PROTOCOL_DEFAULT
import org.gtkkn.native.gio.GSocketProtocol.G_SOCKET_PROTOCOL_SCTP
import org.gtkkn.native.gio.GSocketProtocol.G_SOCKET_PROTOCOL_TCP
import org.gtkkn.native.gio.GSocketProtocol.G_SOCKET_PROTOCOL_UDP
import org.gtkkn.native.gio.GSocketProtocol.G_SOCKET_PROTOCOL_UNKNOWN

/**
 * A protocol identifier is specified when creating a #GSocket, which is a
 * family/type specific identifier, where 0 means the default protocol for
 * the particular family/type.
 *
 * This enum contains a set of commonly available and used protocols. You
 * can also pass any other identifiers handled by the platform in order to
 * use protocols not listed here.
 * @since 2.22
 */
@GioVersion2_22
public enum class SocketProtocol(
    public val nativeValue: GSocketProtocol,
) {
    /**
     * The protocol type is unknown
     */
    UNKNOWN(G_SOCKET_PROTOCOL_UNKNOWN),

    /**
     * The default protocol for the family/type
     */
    DEFAULT(G_SOCKET_PROTOCOL_DEFAULT),

    /**
     * TCP over IP
     */
    TCP(G_SOCKET_PROTOCOL_TCP),

    /**
     * UDP over IP
     */
    UDP(G_SOCKET_PROTOCOL_UDP),

    /**
     * SCTP over IP
     */
    SCTP(G_SOCKET_PROTOCOL_SCTP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketProtocol): SocketProtocol =
            when (nativeValue) {
                G_SOCKET_PROTOCOL_UNKNOWN -> UNKNOWN
                G_SOCKET_PROTOCOL_DEFAULT -> DEFAULT
                G_SOCKET_PROTOCOL_TCP -> TCP
                G_SOCKET_PROTOCOL_UDP -> UDP
                G_SOCKET_PROTOCOL_SCTP -> SCTP
                else -> error("invalid nativeValue")
            }
    }
}
