// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GSocketFamily
import org.gtkkn.native.gio.GSocketFamily.G_SOCKET_FAMILY_INVALID
import org.gtkkn.native.gio.GSocketFamily.G_SOCKET_FAMILY_IPV4
import org.gtkkn.native.gio.GSocketFamily.G_SOCKET_FAMILY_IPV6
import org.gtkkn.native.gio.GSocketFamily.G_SOCKET_FAMILY_UNIX

/**
 * The protocol family of a #GSocketAddress. (These values are
 * identical to the system defines %AF_INET, %AF_INET6 and %AF_UNIX,
 * if available.)
 * @since 2.22
 */
public enum class SocketFamily(
    public val nativeValue: GSocketFamily,
) {
    /**
     * no address family
     */
    INVALID(G_SOCKET_FAMILY_INVALID),

    /**
     * the UNIX domain family
     */
    UNIX(G_SOCKET_FAMILY_UNIX),

    /**
     * the IPv4 family
     */
    IPV4(G_SOCKET_FAMILY_IPV4),

    /**
     * the IPv6 family
     */
    IPV6(G_SOCKET_FAMILY_IPV6),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketFamily): SocketFamily =
            when (nativeValue) {
                G_SOCKET_FAMILY_INVALID -> INVALID
                G_SOCKET_FAMILY_UNIX -> UNIX
                G_SOCKET_FAMILY_IPV4 -> IPV4
                G_SOCKET_FAMILY_IPV6 -> IPV6
                else -> error("invalid nativeValue")
            }
    }
}
