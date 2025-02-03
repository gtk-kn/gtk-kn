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
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
import org.gtkkn.native.gio.g_dbus_object_manager_client_new
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_finish
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_for_bus
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_for_bus_finish
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_for_bus_sync
import org.gtkkn.native.gio.g_dbus_object_manager_client_new_sync
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GVariant
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
 *
 * @since 2.30
 */
@GioVersion2_30
public open class DBusObjectManagerClient(
    public val gioDBusObjectManagerClientPointer: CPointer<GDBusObjectManagerClient>,
) : Object(gioDBusObjectManagerClientPointer.reinterpret()),
    AsyncInitable,
    DBusObjectManager,
    Initable,
    KGTyped {
    init {
        Gio
    }

    override val gioAsyncInitablePointer: CPointer<GAsyncInitable>
        get() = handle.reinterpret()

    override val gioDBusObjectManagerPointer: CPointer<GDBusObjectManager>
        get() = handle.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = handle.reinterpret()

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
        get() = g_dbus_object_manager_client_get_connection(gioDBusObjectManagerClientPointer)!!.run {
            InstanceCache.get(this, true) { DBusConnection(reinterpret()) }!!
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
        get() = g_dbus_object_manager_client_get_flags(gioDBusObjectManagerClientPointer).run {
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
        get() = g_dbus_object_manager_client_get_name(gioDBusObjectManagerClientPointer)?.toKString()
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
        get() = g_dbus_object_manager_client_get_name_owner(gioDBusObjectManagerClientPointer)?.toKString()

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
            gError.`value` = null
            val gResult = g_dbus_object_manager_client_new_finish(res.gioAsyncResultPointer, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

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
        getProxyTypeFunc: DBusProxyTypeFunc?,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult =
                g_dbus_object_manager_client_new_for_bus_sync(
                    busType.nativeValue, flags.mask, name, objectPath,
                    getProxyTypeFunc?.let {
                        DBusProxyTypeFuncFunc.reinterpret()
                    },
                    getProxyTypeFunc?.let {
                        StableRef.create(getProxyTypeFunc).asCPointer()
                    },
                    getProxyTypeFunc?.let {
                        staticStableRefDestroy.reinterpret()
                    },
                    cancellable?.gioCancellablePointer, gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

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
        getProxyTypeFunc: DBusProxyTypeFunc?,
        cancellable: Cancellable? = null,
    ) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            gError.`value` = null
            val gResult =
                g_dbus_object_manager_client_new_sync(
                    connection.gioDBusConnectionPointer, flags.mask, name, objectPath,
                    getProxyTypeFunc?.let {
                        DBusProxyTypeFuncFunc.reinterpret()
                    },
                    getProxyTypeFunc?.let {
                        StableRef.create(getProxyTypeFunc).asCPointer()
                    },
                    getProxyTypeFunc?.let {
                        staticStableRefDestroy.reinterpret()
                    },
                    cancellable?.gioCancellablePointer, gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    ) {
        InstanceCache.put(this)
    }

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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `objectProxy` The #GDBusObjectProxy on which an interface has properties that are changing.; `interfaceProxy` The #GDBusProxy that has properties that are changing.; `changedProperties` A #GVariant containing the properties that changed (type: `a{sv}`).; `invalidatedProperties` A null terminated
     *   array of properties that were invalidated.
     * @since 2.30
     */
    @GioVersion2_30
    public fun onInterfaceProxyPropertiesChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            objectProxy: DBusObjectProxy,
            interfaceProxy: DBusProxy,
            changedProperties: Variant,
            invalidatedProperties: List<String>,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectManagerClientPointer,
        "interface-proxy-properties-changed",
        onInterfaceProxyPropertiesChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "interface-proxy-properties-changed" signal. See [onInterfaceProxyPropertiesChanged].
     *
     * @param objectProxy The #GDBusObjectProxy on which an interface has properties that are changing.
     * @param interfaceProxy The #GDBusProxy that has properties that are changing.
     * @param changedProperties A #GVariant containing the properties that changed (type: `a{sv}`).
     * @param invalidatedProperties A null terminated
     *   array of properties that were invalidated.
     * @since 2.30
     */
    @GioVersion2_30
    public fun emitInterfaceProxyPropertiesChanged(
        objectProxy: DBusObjectProxy,
        interfaceProxy: DBusProxy,
        changedProperties: Variant,
        invalidatedProperties: List<String>,
    ): Unit = memScoped {
        g_signal_emit_by_name(
            gioDBusObjectManagerClientPointer.reinterpret(),
            "interface-proxy-properties-changed",
            objectProxy.gioDBusObjectProxyPointer,
            interfaceProxy.gioDBusProxyPointer,
            changedProperties.glibVariantPointer,
            invalidatedProperties.toCStringList(this)
        )
    }

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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `objectProxy` The #GDBusObjectProxy on which an interface is emitting a D-Bus signal.; `interfaceProxy` The #GDBusProxy that is emitting a D-Bus signal.; `senderName` The sender of the signal or NULL if the connection is not a bus connection.; `signalName` The signal name.; `parameters` A #GVariant tuple with parameters for the signal.
     * @since 2.30
     */
    @GioVersion2_30
    public fun onInterfaceProxySignal(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            objectProxy: DBusObjectProxy,
            interfaceProxy: DBusProxy,
            senderName: String,
            signalName: String,
            parameters: Variant,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectManagerClientPointer,
        "interface-proxy-signal",
        onInterfaceProxySignalFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "interface-proxy-signal" signal. See [onInterfaceProxySignal].
     *
     * @param objectProxy The #GDBusObjectProxy on which an interface is emitting a D-Bus signal.
     * @param interfaceProxy The #GDBusProxy that is emitting a D-Bus signal.
     * @param senderName The sender of the signal or NULL if the connection is not a bus connection.
     * @param signalName The signal name.
     * @param parameters A #GVariant tuple with parameters for the signal.
     * @since 2.30
     */
    @GioVersion2_30
    public fun emitInterfaceProxySignal(
        objectProxy: DBusObjectProxy,
        interfaceProxy: DBusProxy,
        senderName: String,
        signalName: String,
        parameters: Variant,
    ) {
        g_signal_emit_by_name(
            gioDBusObjectManagerClientPointer.reinterpret(),
            "interface-proxy-signal",
            objectProxy.gioDBusObjectProxyPointer,
            interfaceProxy.gioDBusProxyPointer,
            senderName.cstr,
            signalName.cstr,
            parameters.glibVariantPointer
        )
    }

    public companion object : TypeCompanion<DBusObjectManagerClient> {
        override val type: GeneratedClassKGType<DBusObjectManagerClient> =
            GeneratedClassKGType(getTypeOrNull()!!) { DBusObjectManagerClient(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Asynchronously creates a new #GDBusObjectManagerClient object.
         *
         * This is an asynchronous failable constructor. When the result is
         * ready, @callback will be invoked in the
         * [thread-default main context][g-main-context-push-thread-default]
         * of the thread you are calling this method from. You can
         * then call g_dbus_object_manager_client_new_finish() to get the result. See
         * g_dbus_object_manager_client_new_sync() for the synchronous version.
         *
         * @param connection A #GDBusConnection.
         * @param flags Zero or more flags from the #GDBusObjectManagerClientFlags enumeration.
         * @param name The owner of the control object (unique or well-known name).
         * @param objectPath The object path of the control object.
         * @param getProxyTypeFunc A #GDBusProxyTypeFunc function or null to always construct #GDBusProxy proxies.
         * @param cancellable A #GCancellable or null
         * @param callback A #GAsyncReadyCallback to call when the request is satisfied.
         * @since 2.30
         */
        @GioVersion2_30
        public fun new(
            connection: DBusConnection,
            flags: DBusObjectManagerClientFlags,
            name: String,
            objectPath: String,
            getProxyTypeFunc: DBusProxyTypeFunc?,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = g_dbus_object_manager_client_new(
            connection.gioDBusConnectionPointer, flags.mask, name, objectPath,
            getProxyTypeFunc?.let {
                DBusProxyTypeFuncFunc.reinterpret()
            },
            getProxyTypeFunc?.let {
                StableRef.create(getProxyTypeFunc).asCPointer()
            },
            getProxyTypeFunc?.let {
                staticStableRefDestroy.reinterpret()
            },
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Like g_dbus_object_manager_client_new() but takes a #GBusType instead of a
         * #GDBusConnection.
         *
         * This is an asynchronous failable constructor. When the result is
         * ready, @callback will be invoked in the
         * [thread-default main loop][g-main-context-push-thread-default]
         * of the thread you are calling this method from. You can
         * then call g_dbus_object_manager_client_new_for_bus_finish() to get the result. See
         * g_dbus_object_manager_client_new_for_bus_sync() for the synchronous version.
         *
         * @param busType A #GBusType.
         * @param flags Zero or more flags from the #GDBusObjectManagerClientFlags enumeration.
         * @param name The owner of the control object (unique or well-known name).
         * @param objectPath The object path of the control object.
         * @param getProxyTypeFunc A #GDBusProxyTypeFunc function or null to always construct #GDBusProxy proxies.
         * @param cancellable A #GCancellable or null
         * @param callback A #GAsyncReadyCallback to call when the request is satisfied.
         * @since 2.30
         */
        @GioVersion2_30
        public fun newForBus(
            busType: BusType,
            flags: DBusObjectManagerClientFlags,
            name: String,
            objectPath: String,
            getProxyTypeFunc: DBusProxyTypeFunc?,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback?,
        ): Unit = g_dbus_object_manager_client_new_for_bus(
            busType.nativeValue, flags.mask, name, objectPath,
            getProxyTypeFunc?.let {
                DBusProxyTypeFuncFunc.reinterpret()
            },
            getProxyTypeFunc?.let {
                StableRef.create(getProxyTypeFunc).asCPointer()
            },
            getProxyTypeFunc?.let {
                staticStableRefDestroy.reinterpret()
            },
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

        /**
         * Get the GType of DBusObjectManagerClient
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_manager_client_get_type()

        /**
         * Gets the GType of from the symbol `g_dbus_object_manager_client_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dbus_object_manager_client_get_type")

        /**
         * Finishes an operation started with g_dbus_object_manager_client_new_for_bus().
         *
         * @param res A #GAsyncResult obtained from the #GAsyncReadyCallback passed to g_dbus_object_manager_client_new_for_bus().
         * @return A
         *   #GDBusObjectManagerClient object or null if @error is set. Free
         *   with g_object_unref().
         * @since 2.30
         */
        public fun forBusFinish(res: AsyncResult): Result<DBusObjectManagerClient> {
            memScoped {
                val gError = allocPointerTo<GError>()
                gError.`value` = null
                val gResult = g_dbus_object_manager_client_new_for_bus_finish(res.gioAsyncResultPointer, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    val instance = DBusObjectManagerClient(checkNotNull(gResult).reinterpret())
                    InstanceCache.put(instance)
                    Result.success(instance)
                }
            }
        }
    }
}

private val onInterfaceProxyPropertiesChangedFunc: CPointer<
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
                InstanceCache.get(this, false) { DBusObjectProxy(reinterpret()) }!!
            },
            interfaceProxy!!.run {
                InstanceCache.get(this, false) { DBusProxy(reinterpret()) }!!
            },
            changedProperties!!.run {
                Variant(this)
            },
            invalidatedProperties?.toKStringList() ?: error("Expected not null string array")
        )
    }
}
    .reinterpret()

private val onInterfaceProxySignalFunc: CPointer<
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
            InstanceCache.get(this, false) { DBusObjectProxy(reinterpret()) }!!
        },
        interfaceProxy!!.run {
            InstanceCache.get(this, false) { DBusProxy(reinterpret()) }!!
        },
        senderName?.toKString() ?: error("Expected not null string"),
        signalName?.toKString() ?: error("Expected not null string"),
        parameters!!.run {
            Variant(this)
        }
    )
}
    .reinterpret()
