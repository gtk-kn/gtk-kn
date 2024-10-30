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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusConnection
import org.gtkkn.native.gio.GDBusServer
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_dbus_server_get_client_address
import org.gtkkn.native.gio.g_dbus_server_get_flags
import org.gtkkn.native.gio.g_dbus_server_get_guid
import org.gtkkn.native.gio.g_dbus_server_get_type
import org.gtkkn.native.gio.g_dbus_server_is_active
import org.gtkkn.native.gio.g_dbus_server_new_sync
import org.gtkkn.native.gio.g_dbus_server_start
import org.gtkkn.native.gio.g_dbus_server_stop
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit

/**
 * `GDBusServer` is a helper for listening to and accepting D-Bus
 * connections. This can be used to create a new D-Bus server, allowing two
 * peers to use the D-Bus protocol for their own specialized communication.
 * A server instance provided in this way will not perform message routing or
 * implement the
 * [`org.freedesktop.DBus` interface](https://dbus.freedesktop.org/doc/dbus-specification.html#message-bus-messages).
 *
 * To just export an object on a well-known name on a message bus, such as the
 * session or system bus, you should instead use [func@Gio.bus_own_name].
 *
 * An example of peer-to-peer communication with GDBus can be found
 * in [gdbus-example-peer.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-peer.c).
 *
 * Note that a minimal `GDBusServer` will accept connections from any
 * peer. In many use-cases it will be necessary to add a
 * [class@Gio.DBusAuthObserver] that only accepts connections that have
 * successfully authenticated as the same user that is running the
 * `GDBusServer`. Since GLib 2.68 this can be achieved more simply by passing
 * the `G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER` flag to the
 * server.
 *
 * ## Skipped during bindings generation
 *
 * - method `active`: Property has no getter nor setter
 * - method `address`: Property has no getter nor setter
 * - method `authentication-observer`: Property has no getter nor setter
 *
 * @since 2.26
 */
public open class DBusServer(
    pointer: CPointer<GDBusServer>,
) : Object(pointer.reinterpret()),
    Initable,
    KGTyped {
    public val gioDBusServerPointer: CPointer<GDBusServer>
        get() = gPointer.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = gPointer.reinterpret()

    /**
     * The D-Bus address that clients can use.
     *
     * @since 2.26
     */
    public open val clientAddress: String
        /**
         * Gets a
         * [D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses)
         * string that can be used by clients to connect to @server.
         *
         * This is valid and non-empty if initializing the #GDBusServer succeeded.
         *
         * @return A D-Bus address string. Do not free, the string is owned
         * by @server.
         * @since 2.26
         */
        get() =
            g_dbus_server_get_client_address(gioDBusServerPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Flags from the #GDBusServerFlags enumeration.
     *
     * @since 2.26
     */
    public open val flags: DBusServerFlags
        /**
         * Gets the flags for @server.
         *
         * @return A set of flags from the #GDBusServerFlags enumeration.
         * @since 2.26
         */
        get() =
            g_dbus_server_get_flags(gioDBusServerPointer.reinterpret()).run {
                DBusServerFlags(this)
            }

    /**
     * The GUID of the server.
     *
     * See #GDBusConnection:guid for more details.
     *
     * @since 2.26
     */
    public open val guid: String
        /**
         * Gets the GUID for @server, as provided to g_dbus_server_new_sync().
         *
         * @return A D-Bus GUID. Do not free this string, it is owned by @server.
         * @since 2.26
         */
        get() =
            g_dbus_server_get_guid(gioDBusServerPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Creates a new D-Bus server that listens on the first address in
     * @address that works.
     *
     * Once constructed, you can use g_dbus_server_get_client_address() to
     * get a D-Bus address string that clients can use to connect.
     *
     * To have control over the available authentication mechanisms and
     * the users that are authorized to connect, it is strongly recommended
     * to provide a non-null #GDBusAuthObserver.
     *
     * Connect to the #GDBusServer::new-connection signal to handle
     * incoming connections.
     *
     * The returned #GDBusServer isn't active - you have to start it with
     * g_dbus_server_start().
     *
     * #GDBusServer is used in this [example][gdbus-peer-to-peer].
     *
     * This is a synchronous failable constructor. There is currently no
     * asynchronous version.
     *
     * @param address A D-Bus address.
     * @param flags Flags from the #GDBusServerFlags enumeration.
     * @param guid A D-Bus GUID.
     * @param observer A #GDBusAuthObserver or null.
     * @param cancellable A #GCancellable or null.
     * @return A #GDBusServer or null if @error is set. Free with
     * g_object_unref().
     * @since 2.26
     */
    @Throws(GlibException::class)
    public constructor(
        address: String,
        flags: DBusServerFlags,
        guid: String,
        observer: DBusAuthObserver? = null,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_server_new_sync(
                    address,
                    flags.mask,
                    guid,
                    observer?.gioDBusAuthObserverPointer?.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Gets a
     * [D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses)
     * string that can be used by clients to connect to @server.
     *
     * This is valid and non-empty if initializing the #GDBusServer succeeded.
     *
     * @return A D-Bus address string. Do not free, the string is owned
     * by @server.
     * @since 2.26
     */
    public open fun getClientAddress(): String =
        g_dbus_server_get_client_address(gioDBusServerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the flags for @server.
     *
     * @return A set of flags from the #GDBusServerFlags enumeration.
     * @since 2.26
     */
    public open fun getFlags(): DBusServerFlags =
        g_dbus_server_get_flags(gioDBusServerPointer.reinterpret()).run {
            DBusServerFlags(this)
        }

    /**
     * Gets the GUID for @server, as provided to g_dbus_server_new_sync().
     *
     * @return A D-Bus GUID. Do not free this string, it is owned by @server.
     * @since 2.26
     */
    public open fun getGuid(): String =
        g_dbus_server_get_guid(gioDBusServerPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets whether @server is active.
     *
     * @return true if server is active, false otherwise.
     * @since 2.26
     */
    public open fun isActive(): Boolean = g_dbus_server_is_active(gioDBusServerPointer.reinterpret()).asBoolean()

    /**
     * Starts @server.
     *
     * @since 2.26
     */
    public open fun start(): Unit = g_dbus_server_start(gioDBusServerPointer.reinterpret())

    /**
     * Stops @server.
     *
     * @since 2.26
     */
    public open fun stop(): Unit = g_dbus_server_stop(gioDBusServerPointer.reinterpret())

    /**
     * Emitted when a new authenticated connection has been made. Use
     * g_dbus_connection_get_peer_credentials() to figure out what
     * identity (if any), was authenticated.
     *
     * If you want to accept the connection, take a reference to the
     * @connection object and return true. When you are done with the
     * connection call g_dbus_connection_close() and give up your
     * reference. Note that the other peer may disconnect at any time -
     * a typical thing to do when accepting a connection is to listen to
     * the #GDBusConnection::closed signal.
     *
     * If #GDBusServer:flags contains %G_DBUS_SERVER_FLAGS_RUN_IN_THREAD
     * then the signal is emitted in a new thread dedicated to the
     * connection. Otherwise the signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread that @server was constructed in.
     *
     * You are guaranteed that signal handlers for this signal runs
     * before incoming messages on @connection are processed. This means
     * that it's suitable to call g_dbus_connection_register_object() or
     * similar from the signal handler.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `connection` A #GDBusConnection for the new connection.. Returns true to claim @connection, false to let other handlers
     * run.
     * @since 2.26
     */
    public fun connectNewConnection(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (connection: DBusConnection) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "new-connection",
            connectNewConnectionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<DBusServer> {
        override val type: GeneratedClassKGType<DBusServer> =
            GeneratedClassKGType(g_dbus_server_get_type()) { DBusServer(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

private val connectNewConnectionFunc: CPointer<CFunction<(CPointer<GDBusConnection>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            connection: CPointer<GDBusConnection>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(connection: DBusConnection) -> Boolean>()
            .get()
            .invoke(
                connection!!.run {
                    DBusConnection(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()
