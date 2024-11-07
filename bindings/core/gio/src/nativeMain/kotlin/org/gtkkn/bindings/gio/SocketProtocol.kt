// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.native.gio.GSocketProtocol

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
    UNKNOWN(GSocketProtocol.G_SOCKET_PROTOCOL_UNKNOWN),

    /**
     * The default protocol for the family/type
     */
    DEFAULT(GSocketProtocol.G_SOCKET_PROTOCOL_DEFAULT),

    /**
     * TCP over IP
     */
    TCP(GSocketProtocol.G_SOCKET_PROTOCOL_TCP),

    /**
     * UDP over IP
     */
    UDP(GSocketProtocol.G_SOCKET_PROTOCOL_UDP),

    /**
     * SCTP over IP
     */
    SCTP(GSocketProtocol.G_SOCKET_PROTOCOL_SCTP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketProtocol): SocketProtocol =
            when (nativeValue) {
                GSocketProtocol.G_SOCKET_PROTOCOL_UNKNOWN -> UNKNOWN
                GSocketProtocol.G_SOCKET_PROTOCOL_DEFAULT -> DEFAULT
                GSocketProtocol.G_SOCKET_PROTOCOL_TCP -> TCP
                GSocketProtocol.G_SOCKET_PROTOCOL_UDP -> UDP
                GSocketProtocol.G_SOCKET_PROTOCOL_SCTP -> SCTP
                else -> error("invalid nativeValue")
            }
    }
}
