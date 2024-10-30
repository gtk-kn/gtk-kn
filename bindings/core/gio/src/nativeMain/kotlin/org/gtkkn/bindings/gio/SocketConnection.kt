// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketConnection
import org.gtkkn.native.gio.g_socket_connection_connect
import org.gtkkn.native.gio.g_socket_connection_connect_async
import org.gtkkn.native.gio.g_socket_connection_connect_finish
import org.gtkkn.native.gio.g_socket_connection_factory_lookup_type
import org.gtkkn.native.gio.g_socket_connection_factory_register_type
import org.gtkkn.native.gio.g_socket_connection_get_local_address
import org.gtkkn.native.gio.g_socket_connection_get_remote_address
import org.gtkkn.native.gio.g_socket_connection_get_socket
import org.gtkkn.native.gio.g_socket_connection_get_type
import org.gtkkn.native.gio.g_socket_connection_is_connected
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.ULong
import kotlin.Unit

/**
 * `GSocketConnection` is a [class@Gio.IOStream] for a connected socket. They
 * can be created either by [class@Gio.SocketClient] when connecting to a host,
 * or by [class@Gio.SocketListener] when accepting a new client.
 *
 * The type of the `GSocketConnection` object returned from these calls
 * depends on the type of the underlying socket that is in use. For
 * instance, for a TCP/IP connection it will be a [class@Gio.TcpConnection].
 *
 * Choosing what type of object to construct is done with the socket
 * connection factory, and it is possible for third parties to register
 * custom socket connection types for specific combination of socket
 * family/type/protocol using [func@Gio.SocketConnection.factory_register_type].
 *
 * To close a `GSocketConnection`, use [method@Gio.IOStream.close]. Closing both
 * substreams of the [class@Gio.IOStream] separately will not close the
 * underlying [class@Gio.Socket].
 * @since 2.22
 */
public open class SocketConnection(
    pointer: CPointer<GSocketConnection>,
) : IOStream(pointer.reinterpret()),
    KGTyped {
    public val gioSocketConnectionPointer: CPointer<GSocketConnection>
        get() = gPointer.reinterpret()

    /**
     * The underlying [class@Gio.Socket].
     *
     * @since 2.22
     */
    public open val socket: Socket
        /**
         * Gets the underlying #GSocket object of the connection.
         * This can be useful if you want to do something unusual on it
         * not supported by the #GSocketConnection APIs.
         *
         * @return a #GSocket or null on error.
         * @since 2.22
         */
        get() =
            g_socket_connection_get_socket(gioSocketConnectionPointer.reinterpret())!!.run {
                Socket(reinterpret())
            }

    /**
     * Connect @connection to the specified remote address.
     *
     * @param address a #GSocketAddress specifying the remote address.
     * @param cancellable a %GCancellable or null
     * @return true if the connection succeeded, false on error
     * @since 2.32
     */
    public open fun connect(
        address: SocketAddress,
        cancellable: Cancellable? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_connection_connect(
                    gioSocketConnectionPointer.reinterpret(),
                    address.gioSocketAddressPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asynchronously connect @connection to the specified remote address.
     *
     * This clears the #GSocket:blocking flag on @connection's underlying
     * socket if it is currently set.
     *
     * If #GSocket:timeout is set, the operation will time out and return
     * %G_IO_ERROR_TIMED_OUT after that period. Otherwise, it will continue
     * indefinitely until operating system timeouts (if any) are hit.
     *
     * Use g_socket_connection_connect_finish() to retrieve the result.
     *
     * @param address a #GSocketAddress specifying the remote address.
     * @param cancellable a %GCancellable or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.32
     */
    public open fun connectAsync(
        address: SocketAddress,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_connection_connect_async(
            gioSocketConnectionPointer.reinterpret(),
            address.gioSocketAddressPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Gets the result of a g_socket_connection_connect_async() call.
     *
     * @param result the #GAsyncResult
     * @return true if the connection succeeded, false on error
     * @since 2.32
     */
    public open fun connectFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_connection_connect_finish(
                    gioSocketConnectionPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Try to get the local address of a socket connection.
     *
     * @return a #GSocketAddress or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    public open fun getLocalAddress(): Result<SocketAddress> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_connection_get_local_address(gioSocketConnectionPointer.reinterpret(), gError.ptr)?.run {
                    SocketAddress(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Try to get the remote address of a socket connection.
     *
     * Since GLib 2.40, when used with g_socket_client_connect() or
     * g_socket_client_connect_async(), during emission of
     * %G_SOCKET_CLIENT_CONNECTING, this function will return the remote
     * address that will be used for the connection.  This allows
     * applications to print e.g. "Connecting to example.com
     * (10.42.77.3)...".
     *
     * @return a #GSocketAddress or null on error.
     *     Free the returned object with g_object_unref().
     * @since 2.22
     */
    public open fun getRemoteAddress(): Result<SocketAddress> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_connection_get_remote_address(gioSocketConnectionPointer.reinterpret(), gError.ptr)?.run {
                    SocketAddress(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Gets the underlying #GSocket object of the connection.
     * This can be useful if you want to do something unusual on it
     * not supported by the #GSocketConnection APIs.
     *
     * @return a #GSocket or null on error.
     * @since 2.22
     */
    public open fun getSocket(): Socket =
        g_socket_connection_get_socket(gioSocketConnectionPointer.reinterpret())!!.run {
            Socket(reinterpret())
        }

    /**
     * Checks if @connection is connected. This is equivalent to calling
     * g_socket_is_connected() on @connection's underlying #GSocket.
     *
     * @return whether @connection is connected
     * @since 2.32
     */
    public open fun isConnected(): Boolean =
        g_socket_connection_is_connected(gioSocketConnectionPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<SocketConnection> {
        override val type: GeneratedClassKGType<SocketConnection> =
            GeneratedClassKGType(g_socket_connection_get_type()) { SocketConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Looks up the #GType to be used when creating socket connections on
         * sockets with the specified @family, @type and @protocol_id.
         *
         * If no type is registered, the #GSocketConnection base type is returned.
         *
         * @param family a #GSocketFamily
         * @param type a #GSocketType
         * @param protocolId a protocol id
         * @return a #GType
         * @since 2.22
         */
        public fun factoryLookupType(
            family: SocketFamily,
            type: SocketType,
            protocolId: Int,
        ): ULong = g_socket_connection_factory_lookup_type(family.nativeValue, type.nativeValue, protocolId)

        /**
         * Looks up the #GType to be used when creating socket connections on
         * sockets with the specified @family, @type and @protocol.
         *
         * If no type is registered, the #GSocketConnection base type is returned.
         *
         * @param gType a #GType, inheriting from %G_TYPE_SOCKET_CONNECTION
         * @param family a #GSocketFamily
         * @param type a #GSocketType
         * @param protocol a protocol id
         * @since 2.22
         */
        public fun factoryRegisterType(
            gType: ULong,
            family: SocketFamily,
            type: SocketType,
            protocol: Int,
        ): Unit = g_socket_connection_factory_register_type(gType, family.nativeValue, type.nativeValue, protocol)
    }
}
