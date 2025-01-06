// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketConnection
import org.gtkkn.native.gio.GSocketService
import org.gtkkn.native.gio.g_socket_service_get_type
import org.gtkkn.native.gio.g_socket_service_is_active
import org.gtkkn.native.gio.g_socket_service_new
import org.gtkkn.native.gio.g_socket_service_start
import org.gtkkn.native.gio.g_socket_service_stop
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A `GSocketService` is an object that represents a service that
 * is provided to the network or over local sockets.  When a new
 * connection is made to the service the [signal@Gio.SocketService::incoming]
 * signal is emitted.
 *
 * A `GSocketService` is a subclass of [class@Gio.SocketListener] and you need
 * to add the addresses you want to accept connections on with the
 * [class@Gio.SocketListener] APIs.
 *
 * There are two options for implementing a network service based on
 * `GSocketService`. The first is to create the service using
 * [ctor@Gio.SocketService.new] and to connect to the
 * [signal@Gio.SocketService::incoming] signal. The second is to subclass
 * `GSocketService` and override the default signal handler implementation.
 *
 * In either case, the handler must immediately return, or else it
 * will block additional incoming connections from being serviced.
 * If you are interested in writing connection handlers that contain
 * blocking code then see [class@Gio.ThreadedSocketService].
 *
 * The socket service runs on the main loop of the
 * thread-default context (see
 * [method@GLib.MainContext.push_thread_default]) of the thread it is
 * created in, and is not threadsafe in general. However, the calls to start and
 * stop the service are thread-safe so these can be used from threads that
 * handle incoming clients.
 *
 * ## Skipped during bindings generation
 *
 * - method `active`: Property has no getter nor setter
 *
 * @since 2.22
 */
@GioVersion2_22
public open class SocketService(pointer: CPointer<GSocketService>) :
    SocketListener(pointer.reinterpret()),
    KGTyped {
    public val gioSocketServicePointer: CPointer<GSocketService>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GSocketService with no sockets to listen for.
     * New listeners can be added with e.g. g_socket_listener_add_address()
     * or g_socket_listener_add_inet_port().
     *
     * New services are created active, there is no need to call
     * g_socket_service_start(), unless g_socket_service_stop() has been
     * called before.
     *
     * @return a new #GSocketService.
     * @since 2.22
     */
    public constructor() : this(g_socket_service_new()!!.reinterpret())

    /**
     * Check whether the service is active or not. An active
     * service will accept new clients that connect, while
     * a non-active service will let connecting clients queue
     * up until the service is started.
     *
     * @return true if the service is active, false otherwise
     * @since 2.22
     */
    @GioVersion2_22
    public open fun isActive(): Boolean = g_socket_service_is_active(gioSocketServicePointer.reinterpret()).asBoolean()

    /**
     * Restarts the service, i.e. start accepting connections
     * from the added sockets when the mainloop runs. This only needs
     * to be called after the service has been stopped from
     * g_socket_service_stop().
     *
     * This call is thread-safe, so it may be called from a thread
     * handling an incoming client request.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open fun start(): Unit = g_socket_service_start(gioSocketServicePointer.reinterpret())

    /**
     * Stops the service, i.e. stops accepting connections
     * from the added sockets when the mainloop runs.
     *
     * This call is thread-safe, so it may be called from a thread
     * handling an incoming client request.
     *
     * Note that this only stops accepting new connections; it does not
     * close the listening sockets, and you can call
     * g_socket_service_start() again later to begin listening again. To
     * close the listening sockets, call g_socket_listener_close(). (This
     * will happen automatically when the #GSocketService is finalized.)
     *
     * This must be called before calling g_socket_listener_close() as
     * the socket service will start accepting connections immediately
     * when a new socket is added.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open fun stop(): Unit = g_socket_service_stop(gioSocketServicePointer.reinterpret())

    /**
     * The ::incoming signal is emitted when a new incoming connection
     * to @service needs to be handled. The handler must initiate the
     * handling of @connection, but may not block; in essence,
     * asynchronous operations must be used.
     *
     * @connection will be unreffed once the signal handler returns,
     * so you need to ref it yourself if you are planning to use it.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `connection` a new #GSocketConnection object; `sourceObject` the source_object passed to
     *     g_socket_listener_add_address(). Returns true to stop other handlers from being called
     * @since 2.22
     */
    @GioVersion2_22
    public fun connectIncoming(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (connection: SocketConnection, sourceObject: Object?) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "incoming",
        connectIncomingFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<SocketService> {
        override val type: GeneratedClassKGType<SocketService> =
            GeneratedClassKGType(g_socket_service_get_type()) { SocketService(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SocketService
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_service_get_type()
    }
}

private val connectIncomingFunc:
    CPointer<CFunction<(CPointer<GSocketConnection>, CPointer<GObject>?) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            connection: CPointer<GSocketConnection>?,
            sourceObject: CPointer<GObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                connection: SocketConnection,
                sourceObject: Object?,
            ) -> Boolean
            >().get().invoke(
            connection!!.run {
                SocketConnection(reinterpret())
            },
            sourceObject?.run {
                Object(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()
