// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
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
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAsyncInitable
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.GDBusProxy
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_dbus_proxy_call
import org.gtkkn.native.gio.g_dbus_proxy_call_finish
import org.gtkkn.native.gio.g_dbus_proxy_call_sync
import org.gtkkn.native.gio.g_dbus_proxy_call_with_unix_fd_list
import org.gtkkn.native.gio.g_dbus_proxy_get_cached_property
import org.gtkkn.native.gio.g_dbus_proxy_get_cached_property_names
import org.gtkkn.native.gio.g_dbus_proxy_get_connection
import org.gtkkn.native.gio.g_dbus_proxy_get_default_timeout
import org.gtkkn.native.gio.g_dbus_proxy_get_flags
import org.gtkkn.native.gio.g_dbus_proxy_get_interface_info
import org.gtkkn.native.gio.g_dbus_proxy_get_interface_name
import org.gtkkn.native.gio.g_dbus_proxy_get_name
import org.gtkkn.native.gio.g_dbus_proxy_get_name_owner
import org.gtkkn.native.gio.g_dbus_proxy_get_object_path
import org.gtkkn.native.gio.g_dbus_proxy_get_type
import org.gtkkn.native.gio.g_dbus_proxy_new
import org.gtkkn.native.gio.g_dbus_proxy_new_finish
import org.gtkkn.native.gio.g_dbus_proxy_new_for_bus
import org.gtkkn.native.gio.g_dbus_proxy_new_for_bus_finish
import org.gtkkn.native.gio.g_dbus_proxy_new_for_bus_sync
import org.gtkkn.native.gio.g_dbus_proxy_new_sync
import org.gtkkn.native.gio.g_dbus_proxy_set_cached_property
import org.gtkkn.native.gio.g_dbus_proxy_set_default_timeout
import org.gtkkn.native.gio.g_dbus_proxy_set_interface_info
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GDBusProxy` is a base class used for proxies to access a D-Bus
 * interface on a remote object. A `GDBusProxy` can be constructed for
 * both well-known and unique names.
 *
 * By default, `GDBusProxy` will cache all properties (and listen to
 * changes) of the remote object, and proxy all signals that get
 * emitted. This behaviour can be changed by passing suitable
 * [flags@Gio.DBusProxyFlags] when the proxy is created. If the proxy is for a
 * well-known name, the property cache is flushed when the name owner
 * vanishes and reloaded when a name owner appears.
 *
 * The unique name owner of the proxy’s name is tracked and can be read from
 * [property@Gio.DBusProxy:g-name-owner]. Connect to the
 * [signal@GObject.Object::notify] signal to get notified of changes.
 * Additionally, only signals and property changes emitted from the current name
 * owner are considered and calls are always sent to the current name owner.
 * This avoids a number of race conditions when the name is lost by one owner
 * and claimed by another. However, if no name owner currently exists,
 * then calls will be sent to the well-known name which may result in
 * the message bus launching an owner (unless
 * `G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START` is set).
 *
 * If the proxy is for a stateless D-Bus service, where the name owner may
 * be started and stopped between calls, the
 * [property@Gio.DBusProxy:g-name-owner] tracking of `GDBusProxy` will cause the
 * proxy to drop signal and property changes from the service after it has
 * restarted for the first time. When interacting with a stateless D-Bus
 * service, do not use `GDBusProxy` — use direct D-Bus method calls and signal
 * connections.
 *
 * The generic [signal@Gio.DBusProxy::g-properties-changed] and
 * [signal@Gio.DBusProxy::g-signal] signals are not very convenient to work
 * with. Therefore, the recommended way of working with proxies is to subclass
 * `GDBusProxy`, and have more natural properties and signals in your derived
 * class. This [example](migrating-gdbus.html#using-gdbus-codegen) shows how
 * this can easily be done using the [`gdbus-codegen`](gdbus-codegen.html) tool.
 *
 * A `GDBusProxy` instance can be used from multiple threads but note
 * that all signals (e.g. [signal@Gio.DBusProxy::g-signal],
 * [signal@Gio.DBusProxy::g-properties-changed] and
 * [signal@GObject.Object::notify]) are emitted in the thread-default main
 * context (see [method@GLib.MainContext.push_thread_default]) of the thread
 * where the instance was constructed.
 *
 * An example using a proxy for a well-known name can be found in
 * [`gdbus-example-watch-proxy.c`](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-example-watch-proxy.c).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_fd_list`: out_fd_list: Out parameter is not supported
 * - parameter `out_fd_list`: out_fd_list: Out parameter is not supported
 * - method `g-bus-type`: Property has no getter nor setter
 * - method `g-connection`: Property has no getter nor setter
 * - method `g-default-timeout`: Property has no getter nor setter
 * - method `g-flags`: Property has no getter nor setter
 * - method `g-interface-info`: Property has no getter nor setter
 * - method `g-interface-name`: Property has no getter nor setter
 * - method `g-name`: Property has no getter nor setter
 * - method `g-name-owner`: Property has no getter nor setter
 * - method `g-object-path`: Property has no getter nor setter
 *
 * @since 2.26
 */
@GioVersion2_26
public open class DBusProxy(public val gioDBusProxyPointer: CPointer<GDBusProxy>) :
    Object(gioDBusProxyPointer.reinterpret()),
    AsyncInitable,
    DBusInterface,
    Initable,
    KGTyped {
    override val gioAsyncInitablePointer: CPointer<GAsyncInitable>
        get() = handle.reinterpret()

    override val gioDBusInterfacePointer: CPointer<GDBusInterface>
        get() = handle.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

    /**
     * Finishes creating a #GDBusProxy.
     *
     * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback function passed to g_dbus_proxy_new().
     * @return A #GDBusProxy or null if @error is set.
     *    Free with g_object_unref().
     * @since 2.26
     */
    @Throws(GLibException::class)
    public constructor(res: AsyncResult) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dbus_proxy_new_finish(res.gioAsyncResultPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Like g_dbus_proxy_new_sync() but takes a #GBusType instead of a #GDBusConnection.
     *
     * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     *
     * @param busType A #GBusType.
     * @param flags Flags used when constructing the proxy.
     * @param info A #GDBusInterfaceInfo specifying the minimal interface
     *        that @proxy conforms to or null.
     * @param name A bus name (well-known or unique).
     * @param objectPath An object path.
     * @param interfaceName A D-Bus interface name.
     * @param cancellable A #GCancellable or null.
     * @return A #GDBusProxy or null if error is set.
     *    Free with g_object_unref().
     * @since 2.26
     */
    @Throws(GLibException::class)
    public constructor(
        busType: BusType,
        flags: DBusProxyFlags,
        info: DBusInterfaceInfo? = null,
        name: String,
        objectPath: String,
        interfaceName: String,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_proxy_new_for_bus_sync(
                    busType.nativeValue,
                    flags.mask,
                    info?.gioDBusInterfaceInfoPointer,
                    name,
                    objectPath,
                    interfaceName,
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
     * Creates a proxy for accessing @interface_name on the remote object
     * at @object_path owned by @name at @connection and synchronously
     * loads D-Bus properties unless the
     * %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used.
     *
     * If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also sets up
     * match rules for signals. Connect to the #GDBusProxy::g-signal signal
     * to handle signals from the remote object.
     *
     * If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
     * %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
     * guaranteed to return immediately without blocking.
     *
     * If @name is a well-known name and the
     * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION
     * flags aren't set and no name owner currently exists, the message bus
     * will be requested to launch a name owner for the name.
     *
     * This is a synchronous failable constructor. See g_dbus_proxy_new()
     * and g_dbus_proxy_new_finish() for the asynchronous version.
     *
     * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
     *
     * @param connection A #GDBusConnection.
     * @param flags Flags used when constructing the proxy.
     * @param info A #GDBusInterfaceInfo specifying the minimal interface that @proxy conforms to or null.
     * @param name A bus name (well-known or unique) or null if @connection is not a message bus connection.
     * @param objectPath An object path.
     * @param interfaceName A D-Bus interface name.
     * @param cancellable A #GCancellable or null.
     * @return A #GDBusProxy or null if error is set.
     *    Free with g_object_unref().
     * @since 2.26
     */
    @Throws(GLibException::class)
    public constructor(
        connection: DBusConnection,
        flags: DBusProxyFlags,
        info: DBusInterfaceInfo? = null,
        name: String? = null,
        objectPath: String,
        interfaceName: String,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_proxy_new_sync(
                    connection.gioDBusConnectionPointer,
                    flags.mask,
                    info?.gioDBusInterfaceInfoPointer,
                    name,
                    objectPath,
                    interfaceName,
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
     * Asynchronously invokes the @method_name method on @proxy.
     *
     * If @method_name contains any dots, then @name is split into interface and
     * method name parts. This allows using @proxy for invoking methods on
     * other interfaces.
     *
     * If the #GDBusConnection associated with @proxy is closed then
     * the operation will fail with %G_IO_ERROR_CLOSED. If
     * @cancellable is canceled, the operation will fail with
     * %G_IO_ERROR_CANCELLED. If @parameters contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * %G_IO_ERROR_INVALID_ARGUMENT.
     *
     * If the @parameters #GVariant is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * |[<!-- language="C" -->
     *  g_dbus_proxy_call (proxy,
     *                     "TwoStrings",
     *                     g_variant_new ("(ss)",
     *                                    "Thing One",
     *                                    "Thing Two"),
     *                     G_DBUS_CALL_FLAGS_NONE,
     *                     -1,
     *                     NULL,
     *                     (GAsyncReadyCallback) two_strings_done,
     *                     &data);
     * ]|
     *
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @method_name is referenced by it,
     * then the return value is checked against the return type.
     *
     * This is an asynchronous method. When the operation is finished,
     * @callback will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from.
     * You can then call g_dbus_proxy_call_finish() to get the result of
     * the operation. See g_dbus_proxy_call_sync() for the synchronous
     * version of this method.
     *
     * If @callback is null then the D-Bus method call message will be sent with
     * the %G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED flag set.
     *
     * @param methodName Name of method to invoke.
     * @param parameters A #GVariant tuple with parameters for the signal or null if not passing parameters.
     * @param flags Flags from the #GDBusCallFlags enumeration.
     * @param timeoutMsec The timeout in milliseconds (with %G_MAXINT meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param cancellable A #GCancellable or null.
     * @param callback A #GAsyncReadyCallback to call when the request is satisfied or null if you don't
     * care about the result of the method invocation.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun call(
        methodName: String,
        parameters: Variant? = null,
        flags: DBusCallFlags,
        timeoutMsec: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dbus_proxy_call(
        gioDBusProxyPointer,
        methodName,
        parameters?.glibVariantPointer,
        flags.mask,
        timeoutMsec,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an operation started with g_dbus_proxy_call().
     *
     * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback passed to g_dbus_proxy_call().
     * @return null if @error is set. Otherwise a #GVariant tuple with
     * return values. Free with g_variant_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun callFinish(res: AsyncResult): Result<Variant> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_proxy_call_finish(gioDBusProxyPointer, res.gioAsyncResultPointer, gError.ptr)?.run {
            Variant(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously invokes the @method_name method on @proxy.
     *
     * If @method_name contains any dots, then @name is split into interface and
     * method name parts. This allows using @proxy for invoking methods on
     * other interfaces.
     *
     * If the #GDBusConnection associated with @proxy is disconnected then
     * the operation will fail with %G_IO_ERROR_CLOSED. If
     * @cancellable is canceled, the operation will fail with
     * %G_IO_ERROR_CANCELLED. If @parameters contains a value not
     * compatible with the D-Bus protocol, the operation fails with
     * %G_IO_ERROR_INVALID_ARGUMENT.
     *
     * If the @parameters #GVariant is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.:
     * |[<!-- language="C" -->
     *  g_dbus_proxy_call_sync (proxy,
     *                          "TwoStrings",
     *                          g_variant_new ("(ss)",
     *                                         "Thing One",
     *                                         "Thing Two"),
     *                          G_DBUS_CALL_FLAGS_NONE,
     *                          -1,
     *                          NULL,
     *                          &error);
     * ]|
     *
     * The calling thread is blocked until a reply is received. See
     * g_dbus_proxy_call() for the asynchronous version of this
     * method.
     *
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @method_name is referenced by it,
     * then the return value is checked against the return type.
     *
     * @param methodName Name of method to invoke.
     * @param parameters A #GVariant tuple with parameters for the signal
     *              or null if not passing parameters.
     * @param flags Flags from the #GDBusCallFlags enumeration.
     * @param timeoutMsec The timeout in milliseconds (with %G_MAXINT meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param cancellable A #GCancellable or null.
     * @return null if @error is set. Otherwise a #GVariant tuple with
     * return values. Free with g_variant_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun callSync(
        methodName: String,
        parameters: Variant? = null,
        flags: DBusCallFlags,
        timeoutMsec: gint,
        cancellable: Cancellable? = null,
    ): Result<Variant> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_proxy_call_sync(
            gioDBusProxyPointer,
            methodName,
            parameters?.glibVariantPointer,
            flags.mask,
            timeoutMsec,
            cancellable?.gioCancellablePointer,
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
     * Like g_dbus_proxy_call() but also takes a #GUnixFDList object.
     *
     * This method is only available on UNIX.
     *
     * @param methodName Name of method to invoke.
     * @param parameters A #GVariant tuple with parameters for the signal or null if not passing parameters.
     * @param flags Flags from the #GDBusCallFlags enumeration.
     * @param timeoutMsec The timeout in milliseconds (with %G_MAXINT meaning
     *                "infinite") or -1 to use the proxy default timeout.
     * @param fdList A #GUnixFDList or null.
     * @param cancellable A #GCancellable or null.
     * @param callback A #GAsyncReadyCallback to call when the request is satisfied or null if you don't
     * care about the result of the method invocation.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun callWithUnixFdList(
        methodName: String,
        parameters: Variant? = null,
        flags: DBusCallFlags,
        timeoutMsec: gint,
        fdList: UnixFdList? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dbus_proxy_call_with_unix_fd_list(
        gioDBusProxyPointer, methodName, parameters?.glibVariantPointer, flags.mask, timeoutMsec, fdList?.gioUnixFdListPointer, cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Looks up the value for a property from the cache. This call does no
     * blocking IO.
     *
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @property_name is referenced by
     * it, then @value is checked against the type of the property.
     *
     * @param propertyName Property name.
     * @return A reference to the #GVariant instance
     *    that holds the value for @property_name or null if the value is not in
     *    the cache. The returned reference must be freed with g_variant_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getCachedProperty(propertyName: String): Variant? =
        g_dbus_proxy_get_cached_property(gioDBusProxyPointer, propertyName)?.run {
            Variant(this)
        }

    /**
     * Gets the names of all cached properties on @proxy.
     *
     * @return A
     *          null-terminated array of strings or null if
     *          @proxy has no cached properties. Free the returned array with
     *          g_strfreev().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getCachedPropertyNames(): List<String>? =
        g_dbus_proxy_get_cached_property_names(gioDBusProxyPointer)?.toKStringList()

    /**
     * Gets the connection @proxy is for.
     *
     * @return A #GDBusConnection owned by @proxy. Do not free.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getConnection(): DBusConnection = g_dbus_proxy_get_connection(gioDBusProxyPointer)!!.run {
        DBusConnection(this)
    }

    /**
     * Gets the timeout to use if -1 (specifying default timeout) is
     * passed as @timeout_msec in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     *
     * See the #GDBusProxy:g-default-timeout property for more details.
     *
     * @return Timeout to use for @proxy.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getDefaultTimeout(): gint = g_dbus_proxy_get_default_timeout(gioDBusProxyPointer)

    /**
     * Gets the flags that @proxy was constructed with.
     *
     * @return Flags from the #GDBusProxyFlags enumeration.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getFlags(): DBusProxyFlags = g_dbus_proxy_get_flags(gioDBusProxyPointer).run {
        DBusProxyFlags(this)
    }

    /**
     * Returns the #GDBusInterfaceInfo, if any, specifying the interface
     * that @proxy conforms to. See the #GDBusProxy:g-interface-info
     * property for more details.
     *
     * @return A #GDBusInterfaceInfo or null.
     *    Do not unref the returned object, it is owned by @proxy.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getInterfaceInfo(): DBusInterfaceInfo? = g_dbus_proxy_get_interface_info(gioDBusProxyPointer)?.run {
        DBusInterfaceInfo(this)
    }

    /**
     * Gets the D-Bus interface name @proxy is for.
     *
     * @return A string owned by @proxy. Do not free.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getInterfaceName(): String =
        g_dbus_proxy_get_interface_name(gioDBusProxyPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the name that @proxy was constructed for.
     *
     * When connected to a message bus, this will usually be non-null.
     * However, it may be null for a proxy that communicates using a peer-to-peer
     * pattern.
     *
     * @return A string owned by @proxy. Do not free.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getName(): String? = g_dbus_proxy_get_name(gioDBusProxyPointer)?.toKString()

    /**
     * The unique name that owns the name that @proxy is for or null if
     * no-one currently owns that name. You may connect to the
     * #GObject::notify signal to track changes to the
     * #GDBusProxy:g-name-owner property.
     *
     * @return The name owner or null if no name
     *    owner exists. Free with g_free().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getNameOwner(): String? = g_dbus_proxy_get_name_owner(gioDBusProxyPointer)?.toKString()

    /**
     * Gets the object path @proxy is for.
     *
     * @return A string owned by @proxy. Do not free.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getObjectPath(): String =
        g_dbus_proxy_get_object_path(gioDBusProxyPointer)?.toKString() ?: error("Expected not null string")

    /**
     * If @value is not null, sets the cached value for the property with
     * name @property_name to the value in @value.
     *
     * If @value is null, then the cached value is removed from the
     * property cache.
     *
     * If @proxy has an expected interface (see
     * #GDBusProxy:g-interface-info) and @property_name is referenced by
     * it, then @value is checked against the type of the property.
     *
     * If the @value #GVariant is floating, it is consumed. This allows
     * convenient 'inline' use of g_variant_new(), e.g.
     * |[<!-- language="C" -->
     *  g_dbus_proxy_set_cached_property (proxy,
     *                                    "SomeProperty",
     *                                    g_variant_new ("(si)",
     *                                                  "A String",
     *                                                  42));
     * ]|
     *
     * Normally you will not need to use this method since @proxy
     * is tracking changes using the
     * `org.freedesktop.DBus.Properties.PropertiesChanged`
     * D-Bus signal. However, for performance reasons an object may
     * decide to not use this signal for some properties and instead
     * use a proprietary out-of-band mechanism to transmit changes.
     *
     * As a concrete example, consider an object with a property
     * `ChatroomParticipants` which is an array of strings. Instead of
     * transmitting the same (long) array every time the property changes,
     * it is more efficient to only transmit the delta using e.g. signals
     * `ChatroomParticipantJoined(String name)` and
     * `ChatroomParticipantParted(String name)`.
     *
     * @param propertyName Property name.
     * @param value Value for the property or null to remove it from the cache.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setCachedProperty(propertyName: String, `value`: Variant? = null): Unit =
        g_dbus_proxy_set_cached_property(gioDBusProxyPointer, propertyName, `value`?.glibVariantPointer)

    /**
     * Sets the timeout to use if -1 (specifying default timeout) is
     * passed as @timeout_msec in the g_dbus_proxy_call() and
     * g_dbus_proxy_call_sync() functions.
     *
     * See the #GDBusProxy:g-default-timeout property for more details.
     *
     * @param timeoutMsec Timeout in milliseconds.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setDefaultTimeout(timeoutMsec: gint): Unit =
        g_dbus_proxy_set_default_timeout(gioDBusProxyPointer, timeoutMsec)

    /**
     * Ensure that interactions with @proxy conform to the given
     * interface. See the #GDBusProxy:g-interface-info property for more
     * details.
     *
     * @param info Minimum interface this proxy conforms to
     *    or null to unset.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setInterfaceInfo(info: DBusInterfaceInfo? = null): Unit =
        g_dbus_proxy_set_interface_info(gioDBusProxyPointer, info?.gioDBusInterfaceInfoPointer)

    /**
     * Emitted when one or more D-Bus properties on @proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both @changed_properties and @invalidated_properties are
     * guaranteed to never be null (either may be empty though).
     *
     * If the proxy has the flag
     * %G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES set, then
     * @invalidated_properties will always be empty.
     *
     * This signal corresponds to the
     * `PropertiesChanged` D-Bus signal on the
     * `org.freedesktop.DBus.Properties` interface.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `changedProperties` A #GVariant containing the properties that changed (type: `a{sv}`); `invalidatedProperties` A null terminated array of properties that was invalidated
     * @since 2.26
     */
    @GioVersion2_26
    public fun onGPropertiesChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (changedProperties: Variant, invalidatedProperties: List<String>) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusProxyPointer,
        "g-properties-changed",
        onGPropertiesChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "g-properties-changed" signal. See [onGPropertiesChanged].
     *
     * @param changedProperties A #GVariant containing the properties that changed (type: `a{sv}`)
     * @param invalidatedProperties A null terminated array of properties that was invalidated
     * @since 2.26
     */
    @GioVersion2_26
    public fun emitGPropertiesChanged(changedProperties: Variant, invalidatedProperties: List<String>): Unit =
        memScoped {
            g_signal_emit_by_name(
                gioDBusProxyPointer.reinterpret(),
                "g-properties-changed",
                changedProperties.glibVariantPointer,
                invalidatedProperties.toCStringList(this)
            )
        }

    /**
     * Emitted when a signal from the remote object and interface that @proxy is for, has been received.
     *
     * Since 2.72 this signal supports detailed connections. You can connect to
     * the detailed signal `g-signal::x` in order to receive callbacks only when
     * signal `x` is received from the remote object.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param detail the signal detail
     * @param handler the Callback to connect. Params: `senderName` The sender of the signal or null if the connection is not a bus connection.; `signalName` The name of the signal.; `parameters` A #GVariant tuple with parameters for the signal.
     * @since 2.26
     */
    @GioVersion2_26
    public fun onGSignal(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        detail: String? = null,
        handler: (
            senderName: String?,
            signalName: String,
            parameters: Variant,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusProxyPointer,
        "g-signal" + (
            detail?.let {
                "::$it"
            } ?: ""
            ),
        onGSignalFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "g-signal" signal. See [onGSignal].
     *
     * @param detail the signal detail
     * @param senderName The sender of the signal or null if the connection is not a bus connection.
     * @param signalName The name of the signal.
     * @param parameters A #GVariant tuple with parameters for the signal.
     * @since 2.26
     */
    @GioVersion2_26
    public fun emitGSignal(detail: String? = null, senderName: String?, signalName: String, parameters: Variant) {
        g_signal_emit_by_name(
            gioDBusProxyPointer.reinterpret(),
            "g-signal" + (
                detail?.let {
                    "::$it"
                } ?: ""
                ),
            senderName?.cstr,
            signalName.cstr,
            parameters.glibVariantPointer
        )
    }

    public companion object : TypeCompanion<DBusProxy> {
        override val type: GeneratedClassKGType<DBusProxy> =
            GeneratedClassKGType(getTypeOrNull("g_dbus_proxy_get_type")!!) { DBusProxy(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Finishes creating a #GDBusProxy.
         *
         * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback function passed to g_dbus_proxy_new().
         * @return A #GDBusProxy or null if @error is set.
         *    Free with g_object_unref().
         * @since 2.26
         */
        public fun newFinish(res: AsyncResult): Result<DBusProxy> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_proxy_new_finish(res.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(DBusProxy(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Finishes creating a #GDBusProxy.
         *
         * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback function passed to g_dbus_proxy_new_for_bus().
         * @return A #GDBusProxy or null if @error is set.
         *    Free with g_object_unref().
         * @since 2.26
         */
        public fun newForBusFinish(res: AsyncResult): Result<DBusProxy> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_proxy_new_for_bus_finish(res.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(DBusProxy(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Creates a proxy for accessing @interface_name on the remote object
         * at @object_path owned by @name at @connection and asynchronously
         * loads D-Bus properties unless the
         * %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES flag is used. Connect to
         * the #GDBusProxy::g-properties-changed signal to get notified about
         * property changes.
         *
         * If the %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS flag is not set, also sets up
         * match rules for signals. Connect to the #GDBusProxy::g-signal signal
         * to handle signals from the remote object.
         *
         * If both %G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES and
         * %G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS are set, this constructor is
         * guaranteed to complete immediately without blocking.
         *
         * If @name is a well-known name and the
         * %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START and %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION
         * flags aren't set and no name owner currently exists, the message bus
         * will be requested to launch a name owner for the name.
         *
         * This is a failable asynchronous constructor - when the proxy is
         * ready, @callback will be invoked and you can use
         * g_dbus_proxy_new_finish() to get the result.
         *
         * See g_dbus_proxy_new_sync() and for a synchronous version of this constructor.
         *
         * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
         *
         * @param connection A #GDBusConnection.
         * @param flags Flags used when constructing the proxy.
         * @param info A #GDBusInterfaceInfo specifying the minimal interface that @proxy conforms to or null.
         * @param name A bus name (well-known or unique) or null if @connection is not a message bus connection.
         * @param objectPath An object path.
         * @param interfaceName A D-Bus interface name.
         * @param cancellable A #GCancellable or null.
         * @param callback Callback function to invoke when the proxy is ready.
         * @since 2.26
         */
        @GioVersion2_26
        public fun new(
            connection: DBusConnection,
            flags: DBusProxyFlags,
            info: DBusInterfaceInfo? = null,
            name: String? = null,
            objectPath: String,
            interfaceName: String,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = g_dbus_proxy_new(
            connection.gioDBusConnectionPointer, flags.mask, info?.gioDBusInterfaceInfoPointer, name, objectPath, interfaceName, cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Like g_dbus_proxy_new() but takes a #GBusType instead of a #GDBusConnection.
         *
         * #GDBusProxy is used in this [example][gdbus-wellknown-proxy].
         *
         * @param busType A #GBusType.
         * @param flags Flags used when constructing the proxy.
         * @param info A #GDBusInterfaceInfo specifying the minimal interface that @proxy conforms to or null.
         * @param name A bus name (well-known or unique).
         * @param objectPath An object path.
         * @param interfaceName A D-Bus interface name.
         * @param cancellable A #GCancellable or null.
         * @param callback Callback function to invoke when the proxy is ready.
         * @since 2.26
         */
        @GioVersion2_26
        public fun newForBus(
            busType: BusType,
            flags: DBusProxyFlags,
            info: DBusInterfaceInfo? = null,
            name: String,
            objectPath: String,
            interfaceName: String,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = g_dbus_proxy_new_for_bus(
            busType.nativeValue, flags.mask, info?.gioDBusInterfaceInfoPointer, name, objectPath, interfaceName, cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Get the GType of DBusProxy
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_proxy_get_type()
    }
}

private val onGPropertiesChangedFunc:
    CPointer<CFunction<(CPointer<GVariant>, CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            changedProperties: CPointer<GVariant>?,
            invalidatedProperties: CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>?,
            userData: COpaquePointer,
        ->
        memScoped {
            userData.asStableRef<
                (
                    changedProperties: Variant,
                    invalidatedProperties: List<String>,
                ) -> Unit
                >().get().invoke(
                changedProperties!!.run {
                    Variant(this)
                },
                invalidatedProperties?.toKStringList() ?: error("Expected not null string array")
            )
        }
    }
        .reinterpret()

private val onGSignalFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>?,
            CPointer<ByteVar>,
            CPointer<GVariant>,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        senderName: CPointer<ByteVar>?,
        signalName: CPointer<ByteVar>?,
        parameters: CPointer<GVariant>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            senderName: String?,
            signalName: String,
            parameters: Variant,
        ) -> Unit
        >().get().invoke(
        senderName?.toKString(),
        signalName?.toKString() ?: error("Expected not null string"),
        parameters!!.run {
            Variant(this)
        }
    )
}
    .reinterpret()
