// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_socket_address_get_family
import org.gtkkn.native.gio.g_socket_address_get_native_size
import org.gtkkn.native.gio.g_socket_address_get_type
import org.gtkkn.native.gio.g_socket_address_new_from_native
import org.gtkkn.native.gio.g_socket_address_to_native
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gsize
import kotlin.Boolean
import kotlin.Long
import kotlin.Result

/**
 * `GSocketAddress` is the equivalent of
 * [`struct sockaddr`](man:sockaddr(3type)) and its subtypes in the BSD sockets
 * API. This is an abstract class; use [class@Gio.InetSocketAddress] for
 * internet sockets, or [class@Gio.UnixSocketAddress] for UNIX domain sockets.
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
     * Creates a #GSocketAddress subclass corresponding to the native
     * struct sockaddr @native.
     *
     * @param native a pointer to a struct sockaddr
     * @param len the size of the memory location pointed to by @native
     * @return a new #GSocketAddress if @native could successfully
     *     be converted, otherwise null
     * @since 2.22
     */
    public constructor(
        native: gpointer,
        len: gsize,
    ) : this(g_socket_address_new_from_native(native, len)!!.reinterpret())

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

    /**
     * Converts a #GSocketAddress to a native struct sockaddr, which can
     * be passed to low-level functions like connect() or bind().
     *
     * If not enough space is available, a %G_IO_ERROR_NO_SPACE error
     * is returned. If the address type is not known on the system
     * then a %G_IO_ERROR_NOT_SUPPORTED error is returned.
     *
     * @param dest a pointer to a memory location that will contain the native
     * struct sockaddr
     * @param destlen the size of @dest. Must be at least as large as
     *     g_socket_address_get_native_size()
     * @return true if @dest was filled in, false on error
     * @since 2.22
     */
    @GioVersion2_22
    public open fun toNative(dest: gpointer? = null, destlen: gsize): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_socket_address_to_native(
            gioSocketAddressPointer.reinterpret(),
            dest,
            destlen,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

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
