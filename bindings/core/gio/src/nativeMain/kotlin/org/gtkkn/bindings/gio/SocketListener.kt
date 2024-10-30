// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocket
import org.gtkkn.native.gio.GSocketListener
import org.gtkkn.native.gio.GSocketListenerEvent
import org.gtkkn.native.gio.g_socket_listener_accept_async
import org.gtkkn.native.gio.g_socket_listener_accept_socket_async
import org.gtkkn.native.gio.g_socket_listener_add_any_inet_port
import org.gtkkn.native.gio.g_socket_listener_add_inet_port
import org.gtkkn.native.gio.g_socket_listener_add_socket
import org.gtkkn.native.gio.g_socket_listener_close
import org.gtkkn.native.gio.g_socket_listener_get_type
import org.gtkkn.native.gio.g_socket_listener_new
import org.gtkkn.native.gio.g_socket_listener_set_backlog
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit

/**
 * A `GSocketListener` is an object that keeps track of a set
 * of server sockets and helps you accept sockets from any of the
 * socket, either sync or async.
 *
 * Add addresses and ports to listen on using
 * [method@Gio.SocketListener.add_address] and
 * [method@Gio.SocketListener.add_inet_port]. These will be listened on until
 * [method@Gio.SocketListener.close] is called. Dropping your final reference to
 * the `GSocketListener` will not cause [method@Gio.SocketListener.close] to be
 * called implicitly, as some references to the `GSocketListener` may be held
 * internally.
 *
 * If you want to implement a network server, also look at
 * [class@Gio.SocketService] and [class@Gio.ThreadedSocketService] which are
 * subclasses of `GSocketListener` that make this even easier.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `source_object`: source_object: Out parameter is not supported
 * - parameter `source_object`: source_object: Out parameter is not supported
 * - parameter `source_object`: source_object: Out parameter is not supported
 * - parameter `source_object`: source_object: Out parameter is not supported
 * - parameter `effective_address`: effective_address: Out parameter is not supported
 * - method `listen-backlog`: Property has no getter nor setter
 *
 * @since 2.22
 */
public open class SocketListener(
    pointer: CPointer<GSocketListener>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioSocketListenerPointer: CPointer<GSocketListener>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GSocketListener with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     *
     * @return a new #GSocketListener.
     * @since 2.22
     */
    public constructor() : this(g_socket_listener_new()!!.reinterpret())

    /**
     * This is the asynchronous version of g_socket_listener_accept().
     *
     * When the operation is finished @callback will be
     * called. You can then call g_socket_listener_accept_finish()
     * to get the result of the operation.
     *
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.22
     */
    public open fun acceptAsync(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_listener_accept_async(
            gioSocketListenerPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * This is the asynchronous version of g_socket_listener_accept_socket().
     *
     * When the operation is finished @callback will be
     * called. You can then call g_socket_listener_accept_socket_finish()
     * to get the result of the operation.
     *
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback
     * @since 2.22
     */
    public open fun acceptSocketAsync(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_socket_listener_accept_socket_async(
            gioSocketListenerPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Listens for TCP connections on any available port number for both
     * IPv6 and IPv4 (if each is available).
     *
     * This is useful if you need to have a socket for incoming connections
     * but don't care about the specific port number.
     *
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     *
     * @param sourceObject Optional #GObject identifying this source
     * @return the port number, or 0 in case of failure.
     * @since 2.24
     */
    public open fun addAnyInetPort(sourceObject: Object? = null): Result<UShort> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_listener_add_any_inet_port(
                    gioSocketListenerPointer.reinterpret(),
                    sourceObject?.gPointer?.reinterpret(),
                    gError.ptr
                )
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Helper function for g_socket_listener_add_address() that
     * creates a TCP/IP socket listening on IPv4 and IPv6 (if
     * supported) on the specified port on all interfaces.
     *
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     *
     * Call g_socket_listener_close() to stop listening on @port; this will not
     * be done automatically when you drop your final reference to @listener, as
     * references may be held internally.
     *
     * @param port an IP port number (non-zero)
     * @param sourceObject Optional #GObject identifying this source
     * @return true on success, false on error.
     * @since 2.22
     */
    public open fun addInetPort(
        port: UShort,
        sourceObject: Object? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_listener_add_inet_port(
                    gioSocketListenerPointer.reinterpret(),
                    port,
                    sourceObject?.gPointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Adds @socket to the set of sockets that we try to accept
     * new clients from. The socket must be bound to a local
     * address and listened to.
     *
     * @source_object will be passed out in the various calls
     * to accept to identify this particular source, which is
     * useful if you're listening on multiple addresses and do
     * different things depending on what address is connected to.
     *
     * The @socket will not be automatically closed when the @listener is finalized
     * unless the listener held the final reference to the socket. Before GLib 2.42,
     * the @socket was automatically closed on finalization of the @listener, even
     * if references to it were held elsewhere.
     *
     * @param socket a listening #GSocket
     * @param sourceObject Optional #GObject identifying this source
     * @return true on success, false on error.
     * @since 2.22
     */
    public open fun addSocket(
        socket: Socket,
        sourceObject: Object? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_socket_listener_add_socket(
                    gioSocketListenerPointer.reinterpret(),
                    socket.gioSocketPointer.reinterpret(),
                    sourceObject?.gPointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Closes all the sockets in the listener.
     *
     * @since 2.22
     */
    public open fun close(): Unit = g_socket_listener_close(gioSocketListenerPointer.reinterpret())

    /**
     * Sets the listen backlog on the sockets in the listener. This must be called
     * before adding any sockets, addresses or ports to the #GSocketListener (for
     * example, by calling g_socket_listener_add_inet_port()) to be effective.
     *
     * See g_socket_set_listen_backlog() for details
     *
     * @param listenBacklog an integer
     * @since 2.22
     */
    public open fun setBacklog(listenBacklog: Int): Unit =
        g_socket_listener_set_backlog(gioSocketListenerPointer.reinterpret(), listenBacklog)

    /**
     * Emitted when @listener's activity on @socket changes state.
     * Note that when @listener is used to listen on both IPv4 and
     * IPv6, a separate set of signals will be emitted for each, and
     * the order they happen in is undefined.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` the event that is occurring; `socket` the #GSocket the event is occurring on
     * @since 2.46
     */
    public fun connectEvent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (event: SocketListenerEvent, socket: Socket) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "event",
            connectEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SocketListener> {
        override val type: GeneratedClassKGType<SocketListener> =
            GeneratedClassKGType(g_socket_listener_get_type()) { SocketListener(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectEventFunc: CPointer<CFunction<(GSocketListenerEvent, CPointer<GSocket>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            event: GSocketListenerEvent,
            socket: CPointer<GSocket>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(event: SocketListenerEvent, socket: Socket) -> Unit>().get().invoke(
            event.run {
                SocketListenerEvent.fromNativeValue(this)
            },
            socket!!.run {
                Socket(reinterpret())
            }
        )
    }.reinterpret()
