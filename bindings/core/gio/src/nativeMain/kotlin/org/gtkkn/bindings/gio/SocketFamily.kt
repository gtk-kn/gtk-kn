// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.native.gio.GSocketFamily

/**
 * The protocol family of a #GSocketAddress. (These values are
 * identical to the system defines %AF_INET, %AF_INET6 and %AF_UNIX,
 * if available.)
 * @since 2.22
 */
@GioVersion2_22
public enum class SocketFamily(
    public val nativeValue: GSocketFamily,
) {
    /**
     * no address family
     */
    INVALID(GSocketFamily.G_SOCKET_FAMILY_INVALID),

    /**
     * the UNIX domain family
     */
    UNIX(GSocketFamily.G_SOCKET_FAMILY_UNIX),

    /**
     * the IPv4 family
     */
    IPV4(GSocketFamily.G_SOCKET_FAMILY_IPV4),

    /**
     * the IPv6 family
     */
    IPV6(GSocketFamily.G_SOCKET_FAMILY_IPV6),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSocketFamily): SocketFamily =
            when (nativeValue) {
                GSocketFamily.G_SOCKET_FAMILY_INVALID -> INVALID
                GSocketFamily.G_SOCKET_FAMILY_UNIX -> UNIX
                GSocketFamily.G_SOCKET_FAMILY_IPV4 -> IPV4
                GSocketFamily.G_SOCKET_FAMILY_IPV6 -> IPV6
                else -> error("invalid nativeValue")
            }
    }
}
