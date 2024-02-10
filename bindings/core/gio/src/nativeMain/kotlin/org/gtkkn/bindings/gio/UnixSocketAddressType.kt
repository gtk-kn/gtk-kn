// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GUnixSocketAddressType
import org.gtkkn.native.gio.GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT
import org.gtkkn.native.gio.GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED
import org.gtkkn.native.gio.GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ANONYMOUS
import org.gtkkn.native.gio.GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_INVALID
import org.gtkkn.native.gio.GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_PATH

/**
 * The type of name used by a #GUnixSocketAddress.
 * %G_UNIX_SOCKET_ADDRESS_PATH indicates a traditional unix domain
 * socket bound to a filesystem path. %G_UNIX_SOCKET_ADDRESS_ANONYMOUS
 * indicates a socket not bound to any name (eg, a client-side socket,
 * or a socket created with socketpair()).
 *
 * For abstract sockets, there are two incompatible ways of naming
 * them; the man pages suggest using the entire `struct sockaddr_un`
 * as the name, padding the unused parts of the %sun_path field with
 * zeroes; this corresponds to %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED.
 * However, many programs instead just use a portion of %sun_path, and
 * pass an appropriate smaller length to bind() or connect(). This is
 * %G_UNIX_SOCKET_ADDRESS_ABSTRACT.
 * @since 2.26
 */
public enum class UnixSocketAddressType(
    public val nativeValue: GUnixSocketAddressType,
) {
    /**
     * invalid
     */
    INVALID(G_UNIX_SOCKET_ADDRESS_INVALID),

    /**
     * anonymous
     */
    ANONYMOUS(G_UNIX_SOCKET_ADDRESS_ANONYMOUS),

    /**
     * a filesystem path
     */
    PATH(G_UNIX_SOCKET_ADDRESS_PATH),

    /**
     * an abstract name
     */
    ABSTRACT(G_UNIX_SOCKET_ADDRESS_ABSTRACT),

    /**
     * an abstract name, 0-padded
     *   to the full length of a unix socket name
     */
    ABSTRACT_PADDED(G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnixSocketAddressType): UnixSocketAddressType =
            when (nativeValue) {
                G_UNIX_SOCKET_ADDRESS_INVALID -> INVALID
                G_UNIX_SOCKET_ADDRESS_ANONYMOUS -> ANONYMOUS
                G_UNIX_SOCKET_ADDRESS_PATH -> PATH
                G_UNIX_SOCKET_ADDRESS_ABSTRACT -> ABSTRACT
                G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED -> ABSTRACT_PADDED
                else -> error("invalid nativeValue")
            }
    }
}
