// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_socket_address_get_family
import org.gtkkn.native.gio.g_socket_address_get_native_size
import org.gtkkn.native.gio.g_socket_address_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Long

/**
 * `GSocketAddress` is the equivalent of
 * [`struct sockaddr`](man:sockaddr(3type)) and its subtypes in the BSD sockets
 * API. This is an abstract class; use [class@Gio.InetSocketAddress] for
 * internet sockets, or [class@Gio.UnixSocketAddress] for UNIX domain sockets.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `dest`: gpointer
 * - parameter `native`: gpointer
 */
public open class SocketAddress(pointer: CPointer<GSocketAddress>) :
    Object(pointer.reinterpret()),
    SocketConnectable,
    KGTyped {
    public val gioSocketAddressPointer: CPointer<GSocketAddress>
        get() = gPointer.reinterpret()

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = gPointer.reinterpret()

    /**
     * The family of the socket address.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val family: SocketFamily
        /**
         * Gets the socket family type of @address.
         *
         * @return the socket family type of @address
         * @since 2.22
         */
        get() = g_socket_address_get_family(gioSocketAddressPointer.reinterpret()).run {
            SocketFamily.fromNativeValue(this)
        }

    /**
     * Gets the size of @address's native struct sockaddr.
     * You can use this to allocate memory to pass to
     * g_socket_address_to_native().
     *
     * @return the size of the native struct sockaddr that
     *     @address represents
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getNativeSize(): Long = g_socket_address_get_native_size(gioSocketAddressPointer.reinterpret())

    public companion object : TypeCompanion<SocketAddress> {
        override val type: GeneratedClassKGType<SocketAddress> =
            GeneratedClassKGType(g_socket_address_get_type()) { SocketAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SocketAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_address_get_type()
    }
}
