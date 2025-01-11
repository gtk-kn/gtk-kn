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
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.Closure
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAsyncInitable
import org.gtkkn.native.gio.GDBusConnection
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_dbus_connection_add_filter
import org.gtkkn.native.gio.g_dbus_connection_call
import org.gtkkn.native.gio.g_dbus_connection_call_finish
import org.gtkkn.native.gio.g_dbus_connection_call_sync
import org.gtkkn.native.gio.g_dbus_connection_call_with_unix_fd_list
import org.gtkkn.native.gio.g_dbus_connection_close
import org.gtkkn.native.gio.g_dbus_connection_close_finish
import org.gtkkn.native.gio.g_dbus_connection_close_sync
import org.gtkkn.native.gio.g_dbus_connection_emit_signal
import org.gtkkn.native.gio.g_dbus_connection_export_action_group
import org.gtkkn.native.gio.g_dbus_connection_export_menu_model
import org.gtkkn.native.gio.g_dbus_connection_flush
import org.gtkkn.native.gio.g_dbus_connection_flush_finish
import org.gtkkn.native.gio.g_dbus_connection_flush_sync
import org.gtkkn.native.gio.g_dbus_connection_get_capabilities
import org.gtkkn.native.gio.g_dbus_connection_get_exit_on_close
import org.gtkkn.native.gio.g_dbus_connection_get_flags
import org.gtkkn.native.gio.g_dbus_connection_get_guid
import org.gtkkn.native.gio.g_dbus_connection_get_last_serial
import org.gtkkn.native.gio.g_dbus_connection_get_peer_credentials
import org.gtkkn.native.gio.g_dbus_connection_get_stream
import org.gtkkn.native.gio.g_dbus_connection_get_type
import org.gtkkn.native.gio.g_dbus_connection_get_unique_name
import org.gtkkn.native.gio.g_dbus_connection_is_closed
import org.gtkkn.native.gio.g_dbus_connection_new
import org.gtkkn.native.gio.g_dbus_connection_new_finish
import org.gtkkn.native.gio.g_dbus_connection_new_for_address
import org.gtkkn.native.gio.g_dbus_connection_new_for_address_finish
import org.gtkkn.native.gio.g_dbus_connection_new_for_address_sync
import org.gtkkn.native.gio.g_dbus_connection_new_sync
import org.gtkkn.native.gio.g_dbus_connection_register_object_with_closures
import org.gtkkn.native.gio.g_dbus_connection_remove_filter
import org.gtkkn.native.gio.g_dbus_connection_send_message_with_reply_finish
import org.gtkkn.native.gio.g_dbus_connection_set_exit_on_close
import org.gtkkn.native.gio.g_dbus_connection_signal_subscribe
import org.gtkkn.native.gio.g_dbus_connection_signal_unsubscribe
import org.gtkkn.native.gio.g_dbus_connection_start_message_processing
import org.gtkkn.native.gio.g_dbus_connection_unexport_action_group
import org.gtkkn.native.gio.g_dbus_connection_unexport_menu_model
import org.gtkkn.native.gio.g_dbus_connection_unregister_object
import org.gtkkn.native.gio.g_dbus_connection_unregister_subtree
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit

/**
 * The `GDBusConnection` type is used for D-Bus connections to remote
 * peers such as a message buses.
 *
 * It is a low-level API that offers a lot of flexibility. For instance,
 * it lets you establish a connection over any transport that can by represented
 * as a [class@Gio.IOStream].
 *
 * This class is rarely used directly in D-Bus clients. If you are writing
 * a D-Bus client, it is often easier to use the [func@Gio.bus_own_name],
 * [func@Gio.bus_watch_name] or [func@Gio.DBusProxy.new_for_bus] APIs.
 *
 * As an exception to the usual GLib rule that a particular object must not
 * be used by two threads at the same time, `GDBusConnection`s methods may be
 * called from any thread. This is so that [func@Gio.bus_get] and
 * [func@Gio.bus_get_sync] can safely return the same `GDBusConnection` when
 * called from any thread.
 *
 * Most of the ways to obtain a `GDBusConnection` automatically initialize it
 * (i.e. connect to D-Bus): for instance, [func@Gio.DBusConnection.new] and
 * [func@Gio.bus_get], and the synchronous versions of those methods, give you
 * an initialized connection. Language bindings for GIO should use
 * [func@Gio.Initable.new] or [func@Gio.AsyncInitable.new_async], which also
 * initialize the connection.
 *
 * If you construct an uninitialized `GDBusConnection`, such as via
 * [ctor@GObject.Object.new], you must initialize it via [method@Gio.Initable.init] or
 * [method@Gio.AsyncInitable.init_async] before using its methods or properties.
 * Calling methods or accessing properties on a `GDBusConnection` that has not
 * completed initialization successfully is considered to be invalid, and leads
 * to undefined behaviour. In particular, if initialization fails with a
 * `GError`, the only valid thing you can do with that `GDBusConnection` is to
 * free it with [method@GObject.Object.unref].
 *
 * ## An example D-Bus server
 *
 * Here is an example for a D-Bus server:
 * [gdbus-example-server.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-server.c)
 *
 * ## An example for exporting a subtree
 *
 * Here is an example for exporting a subtree:
 * [gdbus-example-subtree.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-subtree.c)
 *
 * ## An example for file descriptor passing
 *
 * Here is an example for passing UNIX file descriptors:
 * [gdbus-unix-fd-client.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-unix-fd-client.c)
 *
 * ## An example for exporting a GObject
 *
 * Here is an example for exporting a #GObject:
 * [gdbus-example-export.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-export.c)
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_fd_list`: out_fd_list: Out parameter is not supported
 * - parameter `out_fd_list`: out_fd_list: Out parameter is not supported
 * - parameter `user_data_free_func`: GLib.DestroyNotify
 * - parameter `out_serial`: out_serial: Out parameter is not supported
 * - parameter `out_serial`: out_serial: Out parameter is not supported
 * - parameter `out_serial`: out_serial: Out parameter is not supported
 * - method `address`: Property has no getter nor setter
 * - method `authentication-observer`: Property has no getter nor setter
 * - method `closed`: Property has no getter nor setter
 *
 * @since 2.26
 */
@GioVersion2_26
public open class DBusConnection(public val gioDBusConnectionPointer: CPointer<GDBusConnection>) :
    Object(gioDBusConnectionPointer.reinterpret()),
    AsyncInitable,
    Initable,
    KGTyped {
    override val gioAsyncInitablePointer: CPointer<GAsyncInitable>
        get() = handle.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

    /**
     * Flags from the #GDBusCapabilityFlags enumeration
     * representing connection features negotiated with the other peer.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val capabilities: DBusCapabilityFlags
        /**
         * Gets the capabilities negotiated with the remote peer
         *
         * @return zero or more flags from the #GDBusCapabilityFlags enumeration
         * @since 2.26
         */
        get() = g_dbus_connection_get_capabilities(gioDBusConnectionPointer).run {
            DBusCapabilityFlags(this)
        }

    /**
     * A boolean specifying whether the process will be terminated (by
     * calling `raise(SIGTERM)`) if the connection is closed by the
     * remote peer.
     *
     * Note that #GDBusConnection objects returned by g_bus_get_finish()
     * and g_bus_get_sync() will (usually) have this property set to true.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open var exitOnClose: Boolean
        /**
         * Gets whether the process is terminated when @connection is
         * closed by the remote peer. See
         * #GDBusConnection:exit-on-close for more details.
         *
         * @return whether the process is terminated when @connection is
         *     closed by the remote peer
         * @since 2.26
         */
        get() = g_dbus_connection_get_exit_on_close(gioDBusConnectionPointer).asBoolean()

        /**
         * Sets whether the process should be terminated when @connection is
         * closed by the remote peer. See #GDBusConnection:exit-on-close for
         * more details.
         *
         * Note that this function should be used with care. Most modern UNIX
         * desktops tie the notion of a user session with the session bus, and expect
         * all of a user's applications to quit when their bus connection goes away.
         * If you are setting @exit_on_close to false for the shared session
         * bus connection, you should make sure that your application exits
         * when the user session ends.
         *
         * @param exitOnClose whether the process should be terminated
         *     when @connection is closed by the remote peer
         * @since 2.26
         */
        @GioVersion2_26
        set(exitOnClose) = g_dbus_connection_set_exit_on_close(gioDBusConnectionPointer, exitOnClose.asGBoolean())

    /**
     * Flags from the #GDBusConnectionFlags enumeration.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val flags: DBusConnectionFlags
        /**
         * Gets the flags used to construct this connection
         *
         * @return zero or more flags from the #GDBusConnectionFlags enumeration
         * @since 2.60
         */
        get() = g_dbus_connection_get_flags(gioDBusConnectionPointer).run {
            DBusConnectionFlags(this)
        }

    /**
     * The GUID of the peer performing the role of server when
     * authenticating.
     *
     * If you are constructing a #GDBusConnection and pass
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER in the
     * #GDBusConnection:flags property then you **must** also set this
     * property to a valid guid.
     *
     * If you are constructing a #GDBusConnection and pass
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT in the
     * #GDBusConnection:flags property you will be able to read the GUID
     * of the other peer here after the connection has been successfully
     * initialized.
     *
     * Note that the
     * [D-Bus specification](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses)
     * uses the term ‘UUID’ to refer to this, whereas GLib consistently uses the
     * term ‘GUID’ for historical reasons.
     *
     * Despite its name, the format of #GDBusConnection:guid does not follow
     * [RFC 4122](https://datatracker.ietf.org/doc/html/rfc4122) or the Microsoft
     * GUID format.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val guid: String
        /**
         * The GUID of the peer performing the role of server when
         * authenticating. See #GDBusConnection:guid for more details.
         *
         * @return The GUID. Do not free this string, it is owned by
         *     @connection.
         * @since 2.26
         */
        get() = g_dbus_connection_get_guid(gioDBusConnectionPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The underlying #GIOStream used for I/O.
     *
     * If this is passed on construction and is a #GSocketConnection,
     * then the corresponding #GSocket will be put into non-blocking mode.
     *
     * While the #GDBusConnection is active, it will interact with this
     * stream from a worker thread, so it is not safe to interact with
     * the stream directly.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val stream: IoStream
        /**
         * Gets the underlying stream used for IO.
         *
         * While the #GDBusConnection is active, it will interact with this
         * stream from a worker thread, so it is not safe to interact with
         * the stream directly.
         *
         * @return the stream used for IO
         * @since 2.26
         */
        get() = g_dbus_connection_get_stream(gioDBusConnectionPointer)!!.run {
            IoStream.IoStreamImpl(this)
        }

    /**
     * The unique name as assigned by the message bus or null if the
     * connection is not open or not a message bus connection.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open val uniqueName: String?
        /**
         * Gets the unique name of @connection as assigned by the message
         * bus. This can also be used to figure out if @connection is a
         * message bus connection.
         *
         * @return the unique name or null if @connection is not a message
         *     bus connection. Do not free this string, it is owned by
         *     @connection.
         * @since 2.26
         */
        get() = g_dbus_connection_get_unique_name(gioDBusConnectionPointer)?.toKString()

    /**
     * Finishes an operation started with g_dbus_connection_new().
     *
     * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback
     *     passed to g_dbus_connection_new().
     * @return a #GDBusConnection or null if @error is set. Free
     *     with g_object_unref().
     * @since 2.26
     */
    @Throws(GLibException::class)
    public constructor(res: AsyncResult) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dbus_connection_new_finish(res.gioAsyncResultPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Synchronously connects and sets up a D-Bus client connection for
     * exchanging D-Bus messages with an endpoint specified by @address
     * which must be in the
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     *
     * This constructor can only be used to initiate client-side
     * connections - use g_dbus_connection_new_sync() if you need to act
     * as the server. In particular, @flags cannot contain the
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
     * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
     *
     * This is a synchronous failable constructor. See
     * g_dbus_connection_new_for_address() for the asynchronous version.
     *
     * If @observer is not null it may be used to control the
     * authentication process.
     *
     * @param address a D-Bus address
     * @param flags flags describing how to make the connection
     * @param observer a #GDBusAuthObserver or null
     * @param cancellable a #GCancellable or null
     * @return a #GDBusConnection or null if @error is set.
     *     Free with g_object_unref().
     * @since 2.26
     */
    @Throws(GLibException::class)
    public constructor(
        address: String,
        flags: DBusConnectionFlags,
        observer: DBusAuthObserver? = null,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_connection_new_for_address_sync(
                    address,
                    flags.mask,
                    observer?.gioDBusAuthObserverPointer,
                    cancellable?.gioCancellablePointer,
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Synchronously sets up a D-Bus connection for exchanging D-Bus messages
     * with the end represented by @stream.
     *
     * If @stream is a #GSocketConnection, then the corresponding #GSocket
     * will be put into non-blocking mode.
     *
     * The D-Bus connection will interact with @stream from a worker thread.
     * As a result, the caller should not interact with @stream after this
     * method has been called, except by calling g_object_unref() on it.
     *
     * If @observer is not null it may be used to control the
     * authentication process.
     *
     * This is a synchronous failable constructor. See
     * g_dbus_connection_new() for the asynchronous version.
     *
     * @param stream a #GIOStream
     * @param guid the GUID to use if authenticating as a server or null
     * @param flags flags describing how to make the connection
     * @param observer a #GDBusAuthObserver or null
     * @param cancellable a #GCancellable or null
     * @return a #GDBusConnection or null if @error is set.
     *     Free with g_object_unref().
     * @since 2.26
     */
    @Throws(GLibException::class)
    public constructor(
        stream: IoStream,
        guid: String? = null,
        flags: DBusConnectionFlags,
        observer: DBusAuthObserver? = null,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_connection_new_sync(
                    stream.gioIoStreamPointer,
                    guid,
                    flags.mask,
                    observer?.gioDBusAuthObserverPointer,
                    cancellable?.gioCancellablePointer,
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Adds a message filter. Filters are handlers that are run on all
     * incoming and outgoing messages, prior to standard dispatch. Filters
     * are run in the order that they were added.  The same handler can be
     * added as a filter more than once, in which case it will be run more
     * than once.  Filters added during a filter callback won't be run on
     * the message being processed. Filter functions are allowed to modify
     * and even drop messages.
     *
     * Note that filters are run in a dedicated message handling thread so
     * they can't block and, generally, can't do anything but signal a
     * worker thread. Also note that filters are rarely needed - use API
     * such as g_dbus_connection_send_message_with_reply(),
     * g_dbus_connection_signal_subscribe() or g_dbus_connection_call() instead.
     *
     * If a filter consumes an incoming message the message is not
     * dispatched anywhere else - not even the standard dispatch machinery
     * (that API such as g_dbus_connection_signal_subscribe() and
     * g_dbus_connection_send_message_with_reply() relies on) will see the
     * message. Similarly, if a filter consumes an outgoing message, the
     * message will not be sent to the other peer.
     *
     * If @user_data_free_func is non-null, it will be called (in the
     * thread-default main context of the thread you are calling this
     * method from) at some point after @user_data is no longer
     * needed. (It is not guaranteed to be called synchronously when the
     * filter is removed, and may be called after @connection has been
     * destroyed.)
     *
     * @param filterFunction a filter function
     * @return a filter identifier that can be used with
     *     g_dbus_connection_remove_filter()
     * @since 2.26
     */
    @GioVersion2_26
    public open fun addFilter(filterFunction: DBusMessageFilterFunction): guint = g_dbus_connection_add_filter(
        gioDBusConnectionPointer,
        DBusMessageFilterFunctionFunc.reinterpret(),
        StableRef.create(filterFunction).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Asynchronously invokes the @method_name method on the
     * @interface_name D-Bus interface on the remote object at
     * @object_path owned by @bus_name.
     *
     * If @connection is closed then the operation will fail with
     * %G_IO_ERROR_CLOSED. If @cancellable is canceled, the operation will
     * fail with %G_IO_ERROR_CANCELLED. If @parameters contains a value
     * not compatible with the D-Bus protocol, the operation fails with
     * %G_IO_ERROR_INVALID_ARGUMENT.
     *
     * If @reply_type is non-null then the reply will be checked for having this type and an
     * error will be raised if it does not match.  Said another way, if you give a @reply_type
     * then any non-null return value will be of this type. Unless it’s
     * %G_VARIANT_TYPE_UNIT, the @reply_type will be a tuple containing one or more
     * values.
     *
     * If the @parameters #GVariant is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * |[<!-- language="C" -->
     *  g_dbus_connection_call (connection,
     *                          "org.freedesktop.StringThings",
     *                          "/org/freedesktop/StringThings",
     *                          "org.freedesktop.StringThings",
     *                          "TwoStrings",
     *                          g_variant_new ("(ss)",
     *                                         "Thing One",
     *                                         "Thing Two"),
     *                          NULL,
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          (GAsyncReadyCallback) two_strings_done,
     *                          NULL);
     * ]|
     *
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can then call
     * g_dbus_connection_call_finish() to get the result of the operation.
     * See g_dbus_connection_call_sync() for the synchronous version of this
     * function.
     *
     * If @callback is null then the D-Bus method call message will be sent with
     * the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
     *
     * @param busName a unique or well-known bus name or null if
     *     @connection is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a #GVariant tuple with parameters for the method
     *     or null if not passing parameters
     * @param replyType the expected type of the reply (which will be a
     *     tuple), or null
     * @param flags flags from the #GDBusCallFlags enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or %G_MAXINT for no timeout
     * @param cancellable a #GCancellable or null
     * @param callback a #GAsyncReadyCallback to call when the request
     *     is satisfied or null if you don't care about the result of the
     *     method invocation
     * @since 2.26
     */
    @GioVersion2_26
    public open fun call(
        busName: String? = null,
        objectPath: String,
        interfaceName: String,
        methodName: String,
        parameters: Variant? = null,
        replyType: VariantType? = null,
        flags: DBusCallFlags,
        timeoutMsec: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dbus_connection_call(
        gioDBusConnectionPointer, busName, objectPath, interfaceName, methodName, parameters?.glibVariantPointer, replyType?.glibVariantTypePointer, flags.mask, timeoutMsec, cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an operation started with g_dbus_connection_call().
     *
     * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback passed to g_dbus_connection_call()
     * @return null if @error is set. Otherwise a non-floating
     *     #GVariant tuple with return values. Free with g_variant_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun callFinish(res: AsyncResult): Result<Variant> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_call_finish(
            gioDBusConnectionPointer,
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            Variant(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously invokes the @method_name method on the
     * @interface_name D-Bus interface on the remote object at
     * @object_path owned by @bus_name.
     *
     * If @connection is closed then the operation will fail with
     * %G_IO_ERROR_CLOSED. If @cancellable is canceled, the
     * operation will fail with %G_IO_ERROR_CANCELLED. If @parameters
     * contains a value not compatible with the D-Bus protocol, the operation
     * fails with %G_IO_ERROR_INVALID_ARGUMENT.
     *
     * If @reply_type is non-null then the reply will be checked for having
     * this type and an error will be raised if it does not match.  Said
     * another way, if you give a @reply_type then any non-null return
     * value will be of this type.
     *
     * If the @parameters #GVariant is floating, it is consumed.
     * This allows convenient 'inline' use of g_variant_new(), e.g.:
     * |[<!-- language="C" -->
     *  g_dbus_connection_call_sync (connection,
     *                               "org.freedesktop.StringThings",
     *                               "/org/freedesktop/StringThings",
     *                               "org.freedesktop.StringThings",
     *                               "TwoStrings",
     *                               g_variant_new ("(ss)",
     *                                              "Thing One",
     *                                              "Thing Two"),
     *                               NULL,
     *                               G_DBUS_CALL_FLAGS_NONE,
     *                               -1,
     *                               NULL,
     *                               &error);
     * ]|
     *
     * The calling thread is blocked until a reply is received. See
     * g_dbus_connection_call() for the asynchronous version of
     * this method.
     *
     * @param busName a unique or well-known bus name or null if
     *     @connection is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a #GVariant tuple with parameters for the method
     *     or null if not passing parameters
     * @param replyType the expected type of the reply, or null
     * @param flags flags from the #GDBusCallFlags enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or %G_MAXINT for no timeout
     * @param cancellable a #GCancellable or null
     * @return null if @error is set. Otherwise a non-floating
     *     #GVariant tuple with return values. Free with g_variant_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun callSync(
        busName: String? = null,
        objectPath: String,
        interfaceName: String,
        methodName: String,
        parameters: Variant? = null,
        replyType: VariantType? = null,
        flags: DBusCallFlags,
        timeoutMsec: gint,
        cancellable: Cancellable? = null,
    ): Result<Variant> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_call_sync(gioDBusConnectionPointer, busName, objectPath, interfaceName, methodName, parameters?.glibVariantPointer, replyType?.glibVariantTypePointer, flags.mask, timeoutMsec, cancellable?.gioCancellablePointer, gError.ptr)?.run {
            Variant(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Like g_dbus_connection_call() but also takes a #GUnixFDList object.
     *
     * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * values in the body of the message. For example, if a message contains
     * two file descriptors, @fd_list would have length 2, and
     * `g_variant_new_handle (0)` and `g_variant_new_handle (1)` would appear
     * somewhere in the body of the message (not necessarily in that order!)
     * to represent the file descriptors at indexes 0 and 1 respectively.
     *
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced in this way by a
     * value of type %G_VARIANT_TYPE_HANDLE in the body of the message.
     *
     * This method is only available on UNIX.
     *
     * @param busName a unique or well-known bus name or null if
     *     @connection is not a message bus connection
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to invoke method on
     * @param methodName the name of the method to invoke
     * @param parameters a #GVariant tuple with parameters for the method
     *     or null if not passing parameters
     * @param replyType the expected type of the reply, or null
     * @param flags flags from the #GDBusCallFlags enumeration
     * @param timeoutMsec the timeout in milliseconds, -1 to use the default
     *     timeout or %G_MAXINT for no timeout
     * @param fdList a #GUnixFDList or null
     * @param cancellable a #GCancellable or null
     * @param callback a #GAsyncReadyCallback to call when the request is
     *     satisfied or null if you don't * care about the result of the
     *     method invocation
     * @since 2.30
     */
    @GioVersion2_30
    public open fun callWithUnixFdList(
        busName: String? = null,
        objectPath: String,
        interfaceName: String,
        methodName: String,
        parameters: Variant? = null,
        replyType: VariantType? = null,
        flags: DBusCallFlags,
        timeoutMsec: gint,
        fdList: UnixFdList? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dbus_connection_call_with_unix_fd_list(
        gioDBusConnectionPointer, busName, objectPath, interfaceName, methodName, parameters?.glibVariantPointer, replyType?.glibVariantTypePointer, flags.mask, timeoutMsec, fdList?.gioUnixFdListPointer, cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Closes @connection. Note that this never causes the process to
     * exit (this might only happen if the other end of a shared message
     * bus connection disconnects, see #GDBusConnection:exit-on-close).
     *
     * Once the connection is closed, operations such as sending a message
     * will return with the error %G_IO_ERROR_CLOSED. Closing a connection
     * will not automatically flush the connection so queued messages may
     * be lost. Use g_dbus_connection_flush() if you need such guarantees.
     *
     * If @connection is already closed, this method fails with
     * %G_IO_ERROR_CLOSED.
     *
     * When @connection has been closed, the #GDBusConnection::closed
     * signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread that @connection was constructed in.
     *
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_connection_close_finish() to get the result of the
     * operation. See g_dbus_connection_close_sync() for the synchronous
     * version.
     *
     * @param cancellable a #GCancellable or null
     * @param callback a #GAsyncReadyCallback to call when the request is
     *     satisfied or null if you don't care about the result
     * @since 2.26
     */
    @GioVersion2_26
    public open fun close(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_dbus_connection_close(
            gioDBusConnectionPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an operation started with g_dbus_connection_close().
     *
     * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback passed
     *     to g_dbus_connection_close()
     * @return true if the operation succeeded, false if @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public open fun closeFinish(res: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_close_finish(
            gioDBusConnectionPointer,
            res.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Synchronously closes @connection. The calling thread is blocked
     * until this is done. See g_dbus_connection_close() for the
     * asynchronous version of this method and more details about what it
     * does.
     *
     * @param cancellable a #GCancellable or null
     * @return true if the operation succeeded, false if @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public open fun closeSync(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_close_sync(
            gioDBusConnectionPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Emits a signal.
     *
     * If the parameters GVariant is floating, it is consumed.
     *
     * This can only fail if @parameters is not compatible with the D-Bus protocol
     * (%G_IO_ERROR_INVALID_ARGUMENT), or if @connection has been closed
     * (%G_IO_ERROR_CLOSED).
     *
     * @param destinationBusName the unique bus name for the destination
     *     for the signal or null to emit to all listeners
     * @param objectPath path of remote object
     * @param interfaceName D-Bus interface to emit a signal on
     * @param signalName the name of the signal to emit
     * @param parameters a #GVariant tuple with parameters for the signal
     *              or null if not passing parameters
     * @return true unless @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public open fun emitSignal(
        destinationBusName: String? = null,
        objectPath: String,
        interfaceName: String,
        signalName: String,
        parameters: Variant? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_emit_signal(
            gioDBusConnectionPointer,
            destinationBusName,
            objectPath,
            interfaceName,
            signalName,
            parameters?.glibVariantPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Exports @action_group on @connection at @object_path.
     *
     * The implemented D-Bus API should be considered private.  It is
     * subject to change in the future.
     *
     * A given object path can only have one action group exported on it.
     * If this constraint is violated, the export will fail and 0 will be
     * returned (with @error set accordingly).
     *
     * You can unexport the action group using
     * g_dbus_connection_unexport_action_group() with the return value of
     * this function.
     *
     * The thread default main context is taken at the time of this call.
     * All incoming action activations and state change requests are
     * reported from this context.  Any changes on the action group that
     * cause it to emit signals must also come from this same context.
     * Since incoming action activations and state change requests are
     * rather likely to cause changes on the action group, this effectively
     * limits a given action group to being exported from only one main
     * context.
     *
     * @param objectPath a D-Bus object path
     * @param actionGroup a #GActionGroup
     * @return the ID of the export (never zero), or 0 in case of failure
     * @since 2.32
     */
    @GioVersion2_32
    public open fun exportActionGroup(objectPath: String, actionGroup: ActionGroup): Result<guint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_dbus_connection_export_action_group(
                gioDBusConnectionPointer,
                objectPath,
                actionGroup.gioActionGroupPointer,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Exports @menu on @connection at @object_path.
     *
     * The implemented D-Bus API should be considered private.
     * It is subject to change in the future.
     *
     * An object path can only have one menu model exported on it. If this
     * constraint is violated, the export will fail and 0 will be
     * returned (with @error set accordingly).
     *
     * Exporting menus with sections containing more than
     * %G_MENU_EXPORTER_MAX_SECTION_SIZE items is not supported and results in
     * undefined behavior.
     *
     * You can unexport the menu model using
     * g_dbus_connection_unexport_menu_model() with the return value of
     * this function.
     *
     * @param objectPath a D-Bus object path
     * @param menu a #GMenuModel
     * @return the ID of the export (never zero), or 0 in case of failure
     * @since 2.32
     */
    @GioVersion2_32
    public open fun exportMenuModel(objectPath: String, menu: MenuModel): Result<guint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_dbus_connection_export_menu_model(
                gioDBusConnectionPointer,
                objectPath,
                menu.gioMenuModelPointer,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously flushes @connection, that is, writes all queued
     * outgoing message to the transport and then flushes the transport
     * (using g_output_stream_flush_async()). This is useful in programs
     * that wants to emit a D-Bus signal and then exit immediately. Without
     * flushing the connection, there is no guaranteed that the message has
     * been sent to the networking buffers in the OS kernel.
     *
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_connection_flush_finish() to get the result of the
     * operation. See g_dbus_connection_flush_sync() for the synchronous
     * version.
     *
     * @param cancellable a #GCancellable or null
     * @param callback a #GAsyncReadyCallback to call when the
     *     request is satisfied or null if you don't care about the result
     * @since 2.26
     */
    @GioVersion2_26
    public open fun flush(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_dbus_connection_flush(
            gioDBusConnectionPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an operation started with g_dbus_connection_flush().
     *
     * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback passed
     *     to g_dbus_connection_flush()
     * @return true if the operation succeeded, false if @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public open fun flushFinish(res: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_flush_finish(
            gioDBusConnectionPointer,
            res.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Synchronously flushes @connection. The calling thread is blocked
     * until this is done. See g_dbus_connection_flush() for the
     * asynchronous version of this method and more details about what it
     * does.
     *
     * @param cancellable a #GCancellable or null
     * @return true if the operation succeeded, false if @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public open fun flushSync(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_flush_sync(
            gioDBusConnectionPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Retrieves the last serial number assigned to a #GDBusMessage on
     * the current thread. This includes messages sent via both low-level
     * API such as g_dbus_connection_send_message() as well as
     * high-level API such as g_dbus_connection_emit_signal(),
     * g_dbus_connection_call() or g_dbus_proxy_call().
     *
     * @return the last used serial or zero when no message has been sent
     *     within the current thread
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getLastSerial(): guint = g_dbus_connection_get_last_serial(gioDBusConnectionPointer)

    /**
     * Gets the credentials of the authenticated peer. This will always
     * return null unless @connection acted as a server
     * (e.g. %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER was passed)
     * when set up and the client passed credentials as part of the
     * authentication process.
     *
     * In a message bus setup, the message bus is always the server and
     * each application is a client. So this method will always return
     * null for message bus clients.
     *
     * @return a #GCredentials or null if not
     *     available. Do not free this object, it is owned by @connection.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getPeerCredentials(): Credentials? =
        g_dbus_connection_get_peer_credentials(gioDBusConnectionPointer)?.run {
            Credentials(this)
        }

    /**
     * Gets whether @connection is closed.
     *
     * @return true if the connection is closed, false otherwise
     * @since 2.26
     */
    @GioVersion2_26
    public open fun isClosed(): Boolean = g_dbus_connection_is_closed(gioDBusConnectionPointer).asBoolean()

    /**
     * Version of g_dbus_connection_register_object() using closures instead of a
     * #GDBusInterfaceVTable for easier binding in other languages.
     *
     * @param objectPath The object path to register at.
     * @param interfaceInfo Introspection data for the interface.
     * @param methodCallClosure #GClosure for handling incoming method calls.
     * @param getPropertyClosure #GClosure for getting a property.
     * @param setPropertyClosure #GClosure for setting a property.
     * @return 0 if @error is set, otherwise a registration ID (never 0)
     * that can be used with g_dbus_connection_unregister_object() .
     * @since 2.46
     */
    @GioVersion2_46
    public open fun registerObject(
        objectPath: String,
        interfaceInfo: DBusInterfaceInfo,
        methodCallClosure: Closure? = null,
        getPropertyClosure: Closure? = null,
        setPropertyClosure: Closure? = null,
    ): Result<guint> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult =
            g_dbus_connection_register_object_with_closures(
                gioDBusConnectionPointer,
                objectPath,
                interfaceInfo.gioDBusInterfaceInfoPointer,
                methodCallClosure?.gobjectClosurePointer,
                getPropertyClosure?.gobjectClosurePointer,
                setPropertyClosure?.gobjectClosurePointer,
                gError.ptr
            )
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Removes a filter.
     *
     * Note that since filters run in a different thread, there is a race
     * condition where it is possible that the filter will be running even
     * after calling g_dbus_connection_remove_filter(), so you cannot just
     * free data that the filter might be using. Instead, you should pass
     * a #GDestroyNotify to g_dbus_connection_add_filter(), which will be
     * called when it is guaranteed that the data is no longer needed.
     *
     * @param filterId an identifier obtained from g_dbus_connection_add_filter()
     * @since 2.26
     */
    @GioVersion2_26
    public open fun removeFilter(filterId: guint): Unit =
        g_dbus_connection_remove_filter(gioDBusConnectionPointer, filterId)

    /**
     * Finishes an operation started with g_dbus_connection_send_message_with_reply().
     *
     * Note that @error is only set if a local in-process error
     * occurred. That is to say that the returned #GDBusMessage object may
     * be of type %G_DBUS_MESSAGE_TYPE_ERROR. Use
     * g_dbus_message_to_gerror() to transcode this to a #GError.
     *
     * See this [server][gdbus-server] and [client][gdbus-unix-fd-client]
     * for an example of how to use this low-level API to send and receive
     * UNIX file descriptors.
     *
     * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback passed to
     *     g_dbus_connection_send_message_with_reply()
     * @return a locked #GDBusMessage or null if @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public open fun sendMessageWithReplyFinish(res: AsyncResult): Result<DBusMessage> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_connection_send_message_with_reply_finish(
            gioDBusConnectionPointer,
            res.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            DBusMessage(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Subscribes to signals on @connection and invokes @callback whenever
     * the signal is received. Note that @callback will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from.
     *
     * If @connection is not a message bus connection, @sender must be
     * null.
     *
     * If @sender is a well-known name note that @callback is invoked with
     * the unique name for the owner of @sender, not the well-known name
     * as one would expect. This is because the message bus rewrites the
     * name. As such, to avoid certain race conditions, users should be
     * tracking the name owner of the well-known name and use that when
     * processing the received signal.
     *
     * If one of %G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE or
     * %G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH are given, @arg0 is
     * interpreted as part of a namespace or path.  The first argument
     * of a signal is matched against that part as specified by D-Bus.
     *
     * If @user_data_free_func is non-null, it will be called (in the
     * thread-default main context of the thread you are calling this
     * method from) at some point after @user_data is no longer
     * needed. (It is not guaranteed to be called synchronously when the
     * signal is unsubscribed from, and may be called after @connection
     * has been destroyed.)
     *
     * As @callback is potentially invoked in a different thread from where it’s
     * emitted, it’s possible for this to happen after
     * g_dbus_connection_signal_unsubscribe() has been called in another thread.
     * Due to this, @user_data should have a strong reference which is freed with
     * @user_data_free_func, rather than pointing to data whose lifecycle is tied
     * to the signal subscription. For example, if a #GObject is used to store the
     * subscription ID from g_dbus_connection_signal_subscribe(), a strong reference
     * to that #GObject must be passed to @user_data, and g_object_unref() passed to
     * @user_data_free_func. You are responsible for breaking the resulting
     * reference count cycle by explicitly unsubscribing from the signal when
     * dropping the last external reference to the #GObject. Alternatively, a weak
     * reference may be used.
     *
     * It is guaranteed that if you unsubscribe from a signal using
     * g_dbus_connection_signal_unsubscribe() from the same thread which made the
     * corresponding g_dbus_connection_signal_subscribe() call, @callback will not
     * be invoked after g_dbus_connection_signal_unsubscribe() returns.
     *
     * The returned subscription identifier is an opaque value which is guaranteed
     * to never be zero.
     *
     * This function can never fail.
     *
     * @param sender sender name to match on (unique or well-known name)
     *     or null to listen from all senders
     * @param interfaceName D-Bus interface name to match on or null to
     *     match on all interfaces
     * @param member D-Bus signal name to match on or null to match on
     *     all signals
     * @param objectPath object path to match on or null to match on
     *     all object paths
     * @param arg0 contents of first string argument to match on or null
     *     to match on all kinds of arguments
     * @param flags #GDBusSignalFlags describing how arg0 is used in subscribing to the
     *     signal
     * @param callback callback to invoke when there is a signal matching the requested data
     * @return a subscription identifier that can be used with g_dbus_connection_signal_unsubscribe()
     * @since 2.26
     */
    @GioVersion2_26
    public open fun signalSubscribe(
        sender: String? = null,
        interfaceName: String? = null,
        member: String? = null,
        objectPath: String? = null,
        arg0: String? = null,
        flags: DBusSignalFlags,
        callback: DBusSignalCallback,
    ): guint = g_dbus_connection_signal_subscribe(
        gioDBusConnectionPointer, sender, interfaceName, member, objectPath, arg0, flags.mask, DBusSignalCallbackFunc.reinterpret(),
        StableRef.create(
            callback
        ).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Unsubscribes from signals.
     *
     * Note that there may still be D-Bus traffic to process (relating to this
     * signal subscription) in the current thread-default #GMainContext after this
     * function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to
     * g_dbus_connection_signal_subscribe() is called, in order to avoid memory
     * leaks through callbacks queued on the #GMainContext after it’s stopped being
     * iterated.
     * Alternatively, any idle source with a priority lower than %G_PRIORITY_DEFAULT
     * that was scheduled after unsubscription, also indicates that all resources
     * of this subscription are released.
     *
     * @param subscriptionId a subscription id obtained from
     *     g_dbus_connection_signal_subscribe()
     * @since 2.26
     */
    @GioVersion2_26
    public open fun signalUnsubscribe(subscriptionId: guint): Unit =
        g_dbus_connection_signal_unsubscribe(gioDBusConnectionPointer, subscriptionId)

    /**
     * If @connection was created with
     * %G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING, this method
     * starts processing messages. Does nothing on if @connection wasn't
     * created with this flag or if the method has already been called.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open fun startMessageProcessing(): Unit =
        g_dbus_connection_start_message_processing(gioDBusConnectionPointer)

    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_action_group().
     *
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_action_group() or to call it with the
     * same ID more than once.
     *
     * @param exportId the ID from g_dbus_connection_export_action_group()
     * @since 2.32
     */
    @GioVersion2_32
    public open fun unexportActionGroup(exportId: guint): Unit =
        g_dbus_connection_unexport_action_group(gioDBusConnectionPointer, exportId)

    /**
     * Reverses the effect of a previous call to
     * g_dbus_connection_export_menu_model().
     *
     * It is an error to call this function with an ID that wasn't returned
     * from g_dbus_connection_export_menu_model() or to call it with the
     * same ID more than once.
     *
     * @param exportId the ID from g_dbus_connection_export_menu_model()
     * @since 2.32
     */
    @GioVersion2_32
    public open fun unexportMenuModel(exportId: guint): Unit =
        g_dbus_connection_unexport_menu_model(gioDBusConnectionPointer, exportId)

    /**
     * Unregisters an object.
     *
     * @param registrationId a registration id obtained from
     *     g_dbus_connection_register_object()
     * @return true if the object was unregistered, false otherwise
     * @since 2.26
     */
    @GioVersion2_26
    public open fun unregisterObject(registrationId: guint): Boolean =
        g_dbus_connection_unregister_object(gioDBusConnectionPointer, registrationId).asBoolean()

    /**
     * Unregisters a subtree.
     *
     * @param registrationId a subtree registration id obtained from
     *     g_dbus_connection_register_subtree()
     * @return true if the subtree was unregistered, false otherwise
     * @since 2.26
     */
    @GioVersion2_26
    public open fun unregisterSubtree(registrationId: guint): Boolean =
        g_dbus_connection_unregister_subtree(gioDBusConnectionPointer, registrationId).asBoolean()

    /**
     * Emitted when the connection is closed.
     *
     * The cause of this event can be
     *
     * - If g_dbus_connection_close() is called. In this case
     *   @remote_peer_vanished is set to false and @error is null.
     *
     * - If the remote peer closes the connection. In this case
     *   @remote_peer_vanished is set to true and @error is set.
     *
     * - If the remote peer sends invalid or malformed data. In this
     *   case @remote_peer_vanished is set to false and @error is set.
     *
     * Upon receiving this signal, you should give up your reference to
     * @connection. You are guaranteed that this signal is emitted only
     * once.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `remotePeerVanished` true if @connection is closed because the
     *     remote peer closed its end of the connection; `error` a #GError with more details about the event or null
     * @since 2.26
     */
    @GioVersion2_26
    public fun onClosed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (remotePeerVanished: Boolean, error: Error?) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusConnectionPointer,
        "closed",
        onClosedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "closed" signal. See [onClosed].
     *
     * @param remotePeerVanished true if @connection is closed because the
     *     remote peer closed its end of the connection
     * @param error a #GError with more details about the event or null
     * @since 2.26
     */
    @GioVersion2_26
    public fun emitClosed(remotePeerVanished: Boolean, error: Error?) {
        g_signal_emit_by_name(
            gioDBusConnectionPointer.reinterpret(),
            "closed",
            remotePeerVanished.asGBoolean(),
            error?.glibErrorPointer
        )
    }

    public companion object : TypeCompanion<DBusConnection> {
        override val type: GeneratedClassKGType<DBusConnection> =
            GeneratedClassKGType(g_dbus_connection_get_type()) { DBusConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Finishes an operation started with g_dbus_connection_new().
         *
         * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback
         *     passed to g_dbus_connection_new().
         * @return a #GDBusConnection or null if @error is set. Free
         *     with g_object_unref().
         * @since 2.26
         */
        public fun newFinish(res: AsyncResult): Result<DBusConnection> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_connection_new_finish(res.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(DBusConnection(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Finishes an operation started with g_dbus_connection_new_for_address().
         *
         * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback passed
         *     to g_dbus_connection_new()
         * @return a #GDBusConnection or null if @error is set.
         *     Free with g_object_unref().
         * @since 2.26
         */
        public fun newForAddressFinish(res: AsyncResult): Result<DBusConnection> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_connection_new_for_address_finish(res.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(DBusConnection(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Asynchronously sets up a D-Bus connection for exchanging D-Bus messages
         * with the end represented by @stream.
         *
         * If @stream is a #GSocketConnection, then the corresponding #GSocket
         * will be put into non-blocking mode.
         *
         * The D-Bus connection will interact with @stream from a worker thread.
         * As a result, the caller should not interact with @stream after this
         * method has been called, except by calling g_object_unref() on it.
         *
         * If @observer is not null it may be used to control the
         * authentication process.
         *
         * When the operation is finished, @callback will be invoked. You can
         * then call g_dbus_connection_new_finish() to get the result of the
         * operation.
         *
         * This is an asynchronous failable constructor. See
         * g_dbus_connection_new_sync() for the synchronous
         * version.
         *
         * @param stream a #GIOStream
         * @param guid the GUID to use if authenticating as a server or null
         * @param flags flags describing how to make the connection
         * @param observer a #GDBusAuthObserver or null
         * @param cancellable a #GCancellable or null
         * @param callback a #GAsyncReadyCallback to call when the request is satisfied
         * @since 2.26
         */
        @GioVersion2_26
        public fun new(
            stream: IoStream,
            guid: String? = null,
            flags: DBusConnectionFlags,
            observer: DBusAuthObserver? = null,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = g_dbus_connection_new(
            stream.gioIoStreamPointer,
            guid,
            flags.mask,
            observer?.gioDBusAuthObserverPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Asynchronously connects and sets up a D-Bus client connection for
         * exchanging D-Bus messages with an endpoint specified by @address
         * which must be in the
         * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
         *
         * This constructor can only be used to initiate client-side
         * connections - use g_dbus_connection_new() if you need to act as the
         * server. In particular, @flags cannot contain the
         * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
         * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS or
         * %G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flags.
         *
         * When the operation is finished, @callback will be invoked. You can
         * then call g_dbus_connection_new_for_address_finish() to get the result of
         * the operation.
         *
         * If @observer is not null it may be used to control the
         * authentication process.
         *
         * This is an asynchronous failable constructor. See
         * g_dbus_connection_new_for_address_sync() for the synchronous
         * version.
         *
         * @param address a D-Bus address
         * @param flags flags describing how to make the connection
         * @param observer a #GDBusAuthObserver or null
         * @param cancellable a #GCancellable or null
         * @param callback a #GAsyncReadyCallback to call when the request is satisfied
         * @since 2.26
         */
        @GioVersion2_26
        public fun newForAddress(
            address: String,
            flags: DBusConnectionFlags,
            observer: DBusAuthObserver? = null,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = g_dbus_connection_new_for_address(
            address,
            flags.mask,
            observer?.gioDBusAuthObserverPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Get the GType of DBusConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_connection_get_type()
    }
}

private val onClosedFunc:
    CPointer<CFunction<(gboolean, CPointer<org.gtkkn.native.glib.GError>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            remotePeerVanished: gboolean,
            error: CPointer<org.gtkkn.native.glib.GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                remotePeerVanished: Boolean,
                error: Error?,
            ) -> Unit
            >().get().invoke(
            remotePeerVanished.asBoolean(),
            error?.run {
                Error(this)
            }
        )
    }
        .reinterpret()
