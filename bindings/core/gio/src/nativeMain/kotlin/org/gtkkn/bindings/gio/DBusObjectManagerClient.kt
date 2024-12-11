// This is a generated file. Do not modify.
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
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import kotlinx.cinterop.`value`
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAsyncInitable
import org.gtkkn.native.gio.GDBusObjectManager
import org.gtkkn.native.gio.GDBusObjectManagerClient
import org.gtkkn.native.gio.GDBusObjectProxy
import org.gtkkn.native.gio.GDBusProxy
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_dbus_object_manager_client_get_connection
import org.gtkkn.native.gio.g_dbus_object_manager_client_get_flags
import org.gtkkn.native.gio.g_dbus_object_manager_client_get_name
import org.gtkkn.native.gio.g_dbus_object_manager_client_get_name_owner
import org.gtkkn.native.gio.g_dbus_object_manager_client_get_type
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_finish
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_for_bus_finish
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_for_bus_sync
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_sync
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GDBusObjectManagerClient` is used to create, monitor and delete object
 * proxies for remote objects exported by a [class@Gio.DBusObjectManagerServer]
 * (or any code implementing the
 * [org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface).
 *
 * Once an instance of this type has been created, you can connect to
 * the [signal@Gio.DBusObjectManager::object-added] and
 * [signal@Gio.DBusObjectManager::object-removed signals] and inspect the
 * [class@Gio.DBusObjectProxy] objects returned by
 * [method@Gio.DBusObjectManager.get_objects].
 *
 * If the name for a `GDBusObjectManagerClient` is not owned by anyone at
 * object construction time, the default behavior is to request the
 * message bus to launch an owner for the name. This behavior can be
 * disabled using the `G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START`
 * flag. It’s also worth noting that this only works if the name of
 * interest is activatable in the first place. E.g. in some cases it
 * is not possible to launch an owner for the requested name. In this
 * case, `GDBusObjectManagerClient` object construction still succeeds but
 * there will be no object proxies
 * (e.g. [method@Gio.DBusObjectManager.get_objects] returns the empty list) and
 * the [property@Gio.DBusObjectManagerClient:name-owner] property is `NULL`.
 *
 * The owner of the requested name can come and go (for example
 * consider a system service being restarted) – `GDBusObjectManagerClient`
 * handles this case too; simply connect to the [signal@GObject.Object::notify]
 * signal to watch for changes on the
 * [property@Gio.DBusObjectManagerClient:name-owner] property. When the name
 * owner vanishes, the behavior is that
 * [property@Gio.DBusObjectManagerClient:name-owner] is set to `NULL` (this
 * includes emission of the [signal@GObject.Object::notify] signal) and then
 * [signal@Gio.DBusObjectManager::object-removed] signals are synthesized
 * for all currently existing object proxies. Since
 * [property@Gio.DBusObjectManagerClient:name-owner] is `NULL` when this
 * happens, you can use this information to disambiguate a synthesized signal
 * from a genuine signal caused by object removal on the remote
 * [iface@Gio.DBusObjectManager]. Similarly, when a new name owner appears,
 * [signal@Gio.DBusObjectManager::object-added] signals are synthesized
 * while [property@Gio.DBusObjectManagerClient:name-owner] is still `NULL`. Only
 * when all object proxies have been added, the
 * [property@Gio.DBusObjectManagerClient:name-owner] is set to the new name
 * owner (this includes emission of the [signal@GObject.Object::notify] signal).
 * Furthermore, you are guaranteed that
 * [property@Gio.DBusObjectManagerClient:name-owner] will alternate between a
 * name owner (e.g. `:1.42`) and `NULL` even in the case where
 * the name of interest is atomically replaced
 *
 * Ultimately, `GDBusObjectManagerClient` is used to obtain
 * [class@Gio.DBusProxy] instances. All signals (including the
 * `org.freedesktop.DBus.Properties::PropertiesChanged` signal)
 * delivered to [class@Gio.DBusProxy] instances are guaranteed to originate
 * from the name owner. This guarantee along with the behavior
 * described above, means that certain race conditions including the
 * “half the proxy is from the old owner and the other half is from
 * the new owner” problem cannot happen.
 *
 * To avoid having the application connect to signals on the returned
 * [class@Gio.DBusObjectProxy] and [class@Gio.DBusProxy] objects, the
 * [signal@Gio.DBusObject::interface-added],
 * [signal@Gio.DBusObject::interface-removed],
 * [signal@Gio.DBusProxy::g-properties-changed] and
 * [signal@Gio.DBusProxy::g-signal] signals
 * are also emitted on the `GDBusObjectManagerClient` instance managing these
 * objects. The signals emitted are
 * [signal@Gio.DBusObjectManager::interface-added],
 * [signal@Gio.DBusObjectManager::interface-removed],
 * [signal@Gio.DBusObjectManagerClient::interface-proxy-properties-changed] and
 * [signal@Gio.DBusObjectManagerClient::interface-proxy-signal].
 *
 * Note that all callbacks and signals are emitted in the
 * thread-default main context (see
 * [method@GLib.MainContext.push_thread_default]) that the
 * `GDBusObjectManagerClient` object was constructed in. Additionally, the
 * [class@Gio.DBusObjectProxy] and [class@Gio.DBusProxy] objects
 * originating from the `GDBusObjectManagerClient` object will be created in
 * the same context and, consequently, will deliver signals in the
 * same main loop.
 *
 * ## Skipped during bindings generation
 *
 * - method `bus-type`: Property has no getter nor setter
 * - method `get-proxy-type-destroy-notify`: Property has no getter nor setter
 * - method `get-proxy-type-func`: Property has no getter nor setter
 * - method `get-proxy-type-user-data`: Property has no getter nor setter
 * - method `object-path`: Property has no getter nor setter
 * - parameter `callback`: AsyncReadyCallback
 * - parameter `callback`: AsyncReadyCallback
 *
 * @since 2.30
 */
@GioVersion2_30
public open class DBusObjectManagerClient(pointer: CPointer<GDBusObjectManagerClient>) :
    Object(pointer.reinterpret()),
    AsyncInitable,
    DBusObjectManager,
    Initable,
    KGTyped {
    public val gioDBusObjectManagerClientPointer: CPointer<GDBusObjectManagerClient>
        get() = gPointer.reinterpret()

    override val gioAsyncInitablePointer: CPointer<GAsyncInitable>
        get() = gPointer.reinterpret()

    override val gioDBusObjectManagerPointer: CPointer<GDBusObjectManager>
        get() = gPointer.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = gPointer.reinterpret()

    /**
     * The #GDBusConnection to use.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open val connection: DBusConnection
        /**
         * Gets the #GDBusConnection used by @manager.
         *
         * @return A #GDBusConnection object. Do not free,
         *   the object belongs to @manager.
         * @since 2.30
         */
        get() = g_dbus_object_manager_client_get_connection(gioDBusObjectManagerClientPointer.reinterpret())!!.run {
            DBusConnection(reinterpret())
        }

    /**
     * Flags from the #GDBusObjectManagerClientFlags enumeration.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open val flags: DBusObjectManagerClientFlags
        /**
         * Gets the flags that @manager was constructed with.
         *
         * @return Zero of more flags from the #GDBusObjectManagerClientFlags
         * enumeration.
         * @since 2.30
         */
        get() = g_dbus_object_manager_client_get_flags(gioDBusObjectManagerClientPointer.reinterpret()).run {
            DBusObjectManagerClientFlags(this)
        }

    /**
     * The well-known name or unique name that the manager is for.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open val name: String
        /**
         * Gets the name that @manager is for, or null if not a message bus
         * connection.
         *
         * @return A unique or well-known name. Do not free, the string
         * belongs to @manager.
         * @since 2.30
         */
        get() = g_dbus_object_manager_client_get_name(gioDBusObjectManagerClientPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * The unique name that owns #GDBusObjectManagerClient:name or null if
     * no-one is currently owning the name. Connect to the
     * #GObject::notify signal to track changes to this property.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open val nameOwner: String?
        /**
         * The unique name that owns the name that @manager is for or null if
         * no-one currently owns that name. You can connect to the
         * #GObject::notify signal to track changes to the
         * #GDBusObjectManagerClient:name-owner property.
         *
         * @return The name owner or null if no name owner
         * exists. Free with g_free().
         * @since 2.30
         */
        get() = g_dbus_object_manager_client_get_name_owner(
            gioDBusObjectManagerClientPointer.reinterpret()
        )?.toKString()

    /**
     * Finishes an operation started with g_dbus_object_manager_client_new().
     *
     * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback passed to g_dbus_object_manager_client_new().
     * @return A
     *   #GDBusObjectManagerClient object or null if @error is set. Free
     *   with g_object_unref().
     * @since 2.30
     */
    @Throws(GLibException::class)
    public constructor(res: AsyncResult) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dbus_object_manager_client_new_finish(res.gioAsyncResultPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Like g_dbus_object_manager_client_new_sync() but takes a #GBusType instead
     * of a #GDBusConnection.
     *
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new_for_bus()
     * for the asynchronous version.
     *
     * @param busType A #GBusType.
     * @param flags Zero or more flags from the #GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param objectPath The object path of the control object.
     * @param getProxyTypeFunc A #GDBusProxyTypeFunc function or null to always construct #GDBusProxy proxies.
     * @param cancellable A #GCancellable or null
     * @return A
     *   #GDBusObjectManagerClient object or null if @error is set. Free
     *   with g_object_unref().
     * @since 2.30
     */
    @Throws(GLibException::class)
    public constructor(
        busType: BusType,
        flags: DBusObjectManagerClientFlags,
        name: String,
        objectPath: String,
        getProxyTypeFunc: DBusProxyTypeFunc,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_object_manager_client_new_for_bus_sync(
                    busType.nativeValue, flags.mask, name, objectPath, DBusProxyTypeFuncFunc.reinterpret(),
                    StableRef.create(
                        getProxyTypeFunc
                    ).asCPointer(),
                    staticStableRefDestroy.reinterpret(), cancellable?.gioCancellablePointer?.reinterpret(), gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a new #GDBusObjectManagerClient object.
     *
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new()
     * for the asynchronous version.
     *
     * @param connection A #GDBusConnection.
     * @param flags Zero or more flags from the #GDBusObjectManagerClientFlags enumeration.
     * @param name The owner of the control object (unique or well-known name), or null when not using a message bus connection.
     * @param objectPath The object path of the control object.
     * @param getProxyTypeFunc A #GDBusProxyTypeFunc function or null to always construct #GDBusProxy proxies.
     * @param cancellable A #GCancellable or null
     * @return A
     *   #GDBusObjectManagerClient object or null if @error is set. Free
     *   with g_object_unref().
     * @since 2.30
     */
    @Throws(GLibException::class)
    public constructor(
        connection: DBusConnection,
        flags: DBusObjectManagerClientFlags,
        name: String? = null,
        objectPath: String,
        getProxyTypeFunc: DBusProxyTypeFunc,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_object_manager_client_new_sync(
                    connection.gioDBusConnectionPointer.reinterpret(), flags.mask, name, objectPath, DBusProxyTypeFuncFunc.reinterpret(),
                    StableRef.create(
                        getProxyTypeFunc
                    ).asCPointer(),
                    staticStableRefDestroy.reinterpret(), cancellable?.gioCancellablePointer?.reinterpret(), gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Emitted when one or more D-Bus properties on proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both @changed_properties and @invalidated_properties are
     * guaranteed to never be null (either may be empty though).
     *
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by @manager.
     *
     * This signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * that @manager was constructed in.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `objectProxy` The #GDBusObjectProxy on which an interface has properties that are changing.; `interfaceProxy` The #GDBusProxy that has properties that are changing.; `changedProperties` A #GVariant containing the properties that changed (type: `a{sv}`).; `invalidatedProperties` A null terminated
     *   array of properties that were invalidated.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectInterfaceProxyPropertiesChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            objectProxy: DBusObjectProxy,
            interfaceProxy: DBusProxy,
            changedProperties: Variant,
            invalidatedProperties: List<String>,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "interface-proxy-properties-changed",
        connectInterfaceProxyPropertiesChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a D-Bus signal is received on @interface_proxy.
     *
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by @manager.
     *
     * This signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * that @manager was constructed in.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `objectProxy` The #GDBusObjectProxy on which an interface is emitting a D-Bus signal.; `interfaceProxy` The #GDBusProxy that is emitting a D-Bus signal.; `senderName` The sender of the signal or NULL if the connection is not a bus connection.; `signalName` The signal name.; `parameters` A #GVariant tuple with parameters for the signal.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectInterfaceProxySignal(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            objectProxy: DBusObjectProxy,
            interfaceProxy: DBusProxy,
            senderName: String,
            signalName: String,
            parameters: Variant,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "interface-proxy-signal",
        connectInterfaceProxySignalFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<DBusObjectManagerClient> {
        override val type: GeneratedClassKGType<DBusObjectManagerClient> =
            GeneratedClassKGType(g_dbus_object_manager_client_get_type()) {
                DBusObjectManagerClient(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Finishes an operation started with g_dbus_object_manager_client_new().
         *
         * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback passed to g_dbus_object_manager_client_new().
         * @return A
         *   #GDBusObjectManagerClient object or null if @error is set. Free
         *   with g_object_unref().
         * @since 2.30
         */
        public fun newFinish(res: AsyncResult): Result<DBusObjectManagerClient> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_object_manager_client_new_finish(res.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(DBusObjectManagerClient(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Finishes an operation started with g_dbus_object_manager_client_new_for_bus().
         *
         * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback passed to g_dbus_object_manager_client_new_for_bus().
         * @return A
         *   #GDBusObjectManagerClient object or null if @error is set. Free
         *   with g_object_unref().
         * @since 2.30
         */
        public fun newForBusFinish(res: AsyncResult): Result<DBusObjectManagerClient> = memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult = g_dbus_object_manager_client_new_for_bus_finish(res.gioAsyncResultPointer, gError.ptr)
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(DBusObjectManagerClient(checkNotNull(gResult).reinterpret()))
            }
        }

        /**
         * Get the GType of DBusObjectManagerClient
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_manager_client_get_type()
    }
}

private val connectInterfaceProxyPropertiesChangedFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusObjectProxy>,
            CPointer<GDBusProxy>,
            CPointer<GVariant>,
            CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        objectProxy: CPointer<GDBusObjectProxy>?,
        interfaceProxy: CPointer<GDBusProxy>?,
        changedProperties: CPointer<GVariant>?,
        invalidatedProperties: CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>?,
        userData: COpaquePointer,
    ->
    memScoped {
        userData.asStableRef<
            (
                objectProxy: DBusObjectProxy,
                interfaceProxy: DBusProxy,
                changedProperties: Variant,
                invalidatedProperties: List<String>,
            ) -> Unit
            >().get().invoke(
            objectProxy!!.run {
                DBusObjectProxy(reinterpret())
            },
            interfaceProxy!!.run {
                DBusProxy(reinterpret())
            },
            changedProperties!!.run {
                Variant(reinterpret())
            },
            invalidatedProperties?.toKStringList() ?: error("Expected not null string array")
        )
    }
}
    .reinterpret()

private val connectInterfaceProxySignalFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusObjectProxy>,
            CPointer<GDBusProxy>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<GVariant>,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        objectProxy: CPointer<GDBusObjectProxy>?,
        interfaceProxy: CPointer<GDBusProxy>?,
        senderName: CPointer<ByteVar>?,
        signalName: CPointer<ByteVar>?,
        parameters: CPointer<GVariant>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            objectProxy: DBusObjectProxy,
            interfaceProxy: DBusProxy,
            senderName: String,
            signalName: String,
            parameters: Variant,
        ) -> Unit
        >().get().invoke(
        objectProxy!!.run {
            DBusObjectProxy(reinterpret())
        },
        interfaceProxy!!.run {
            DBusProxy(reinterpret())
        },
        senderName?.toKString() ?: error("Expected not null string"),
        signalName?.toKString() ?: error("Expected not null string"),
        parameters!!.run {
            Variant(reinterpret())
        }
    )
}
    .reinterpret()
