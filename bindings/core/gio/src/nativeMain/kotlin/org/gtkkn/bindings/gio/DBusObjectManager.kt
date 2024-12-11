// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.GDBusObject
import org.gtkkn.native.gio.GDBusObjectManager
import org.gtkkn.native.gio.g_dbus_object_manager_get_interface
import org.gtkkn.native.gio.g_dbus_object_manager_get_object
import org.gtkkn.native.gio.g_dbus_object_manager_get_object_path
import org.gtkkn.native.gio.g_dbus_object_manager_get_objects
import org.gtkkn.native.gio.g_dbus_object_manager_get_type
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GDBusObjectManager` type is the base type for service- and
 * client-side implementations of the standardized
 * [`org.freedesktop.DBus.ObjectManager`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface.
 *
 * See [class@Gio.DBusObjectManagerClient] for the client-side implementation
 * and [class@Gio.DBusObjectManagerServer] for the service-side implementation.
 */
public interface DBusObjectManager :
    Interface,
    KGTyped {
    public val gioDBusObjectManagerPointer: CPointer<GDBusObjectManager>

    /**
     * Gets the interface proxy for @interface_name at @object_path, if
     * any.
     *
     * @param objectPath Object path to look up.
     * @param interfaceName D-Bus interface name to look up.
     * @return A #GDBusInterface instance or null. Free
     *   with g_object_unref().
     * @since 2.30
     */
    @GioVersion2_30
    public fun getInterface(objectPath: String, interfaceName: String): DBusInterface? =
        g_dbus_object_manager_get_interface(gioDBusObjectManagerPointer.reinterpret(), objectPath, interfaceName)?.run {
            DBusInterface.wrap(reinterpret())
        }

    /**
     * Gets the #GDBusObject at @object_path, if any.
     *
     * @param objectPath Object path to look up.
     * @return A #GDBusObject or null. Free with
     *   g_object_unref().
     * @since 2.30
     */
    @GioVersion2_30
    public fun getObject(objectPath: String): DBusObject? =
        g_dbus_object_manager_get_object(gioDBusObjectManagerPointer.reinterpret(), objectPath)?.run {
            DBusObject.wrap(reinterpret())
        }

    /**
     * Gets the object path that @manager is for.
     *
     * @return A string owned by @manager. Do not free.
     * @since 2.30
     */
    @GioVersion2_30
    public fun getObjectPath(): String =
        g_dbus_object_manager_get_object_path(gioDBusObjectManagerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets all #GDBusObject objects known to @manager.
     *
     * @return A list of
     *   #GDBusObject objects. The returned list should be freed with
     *   g_list_free() after each element has been freed with
     *   g_object_unref().
     * @since 2.30
     */
    @GioVersion2_30
    public fun getObjects(): List = g_dbus_object_manager_get_objects(gioDBusObjectManagerPointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Emitted when @interface is added to @object.
     *
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by @manager.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The #GDBusObject on which an interface was added.; `interface` The #GDBusInterface that was added.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectInterfaceAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: DBusObject, `interface`: DBusInterface) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectManagerPointer.reinterpret(),
        "interface-added",
        connectInterfaceAddedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when @interface has been removed from @object.
     *
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by @manager.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The #GDBusObject on which an interface was removed.; `interface` The #GDBusInterface that was removed.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectInterfaceRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: DBusObject, `interface`: DBusInterface) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectManagerPointer.reinterpret(),
        "interface-removed",
        connectInterfaceRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when @object is added to @manager.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The #GDBusObject that was added.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectObjectAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: DBusObject) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectManagerPointer.reinterpret(),
        "object-added",
        connectObjectAddedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when @object is removed from @manager.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` The #GDBusObject that was removed.
     * @since 2.30
     */
    @GioVersion2_30
    public fun connectObjectRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: DBusObject) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectManagerPointer.reinterpret(),
        "object-removed",
        connectObjectRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    private data class Wrapper(private val pointer: CPointer<GDBusObjectManager>) : DBusObjectManager {
        override val gioDBusObjectManagerPointer: CPointer<GDBusObjectManager> = pointer
    }

    public companion object : TypeCompanion<DBusObjectManager> {
        override val type: GeneratedInterfaceKGType<DBusObjectManager> =
            GeneratedInterfaceKGType(g_dbus_object_manager_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDBusObjectManager>): DBusObjectManager = Wrapper(pointer)

        /**
         * Get the GType of DBusObjectManager
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_manager_get_type()
    }
}

private val connectInterfaceAddedFunc:
    CPointer<CFunction<(CPointer<GDBusObject>, CPointer<GDBusInterface>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: CPointer<GDBusObject>?,
            `interface`: CPointer<GDBusInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: DBusObject, `interface`: DBusInterface) -> Unit>().get().invoke(
            `object`!!.run {
                DBusObject.wrap(reinterpret())
            },
            `interface`!!.run {
                DBusInterface.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectInterfaceRemovedFunc:
    CPointer<CFunction<(CPointer<GDBusObject>, CPointer<GDBusInterface>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: CPointer<GDBusObject>?,
            `interface`: CPointer<GDBusInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: DBusObject, `interface`: DBusInterface) -> Unit>().get().invoke(
            `object`!!.run {
                DBusObject.wrap(reinterpret())
            },
            `interface`!!.run {
                DBusInterface.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectObjectAddedFunc: CPointer<CFunction<(CPointer<GDBusObject>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: CPointer<GDBusObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: DBusObject) -> Unit>().get().invoke(
            `object`!!.run {
                DBusObject.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectObjectRemovedFunc: CPointer<CFunction<(CPointer<GDBusObject>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: CPointer<GDBusObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: DBusObject) -> Unit>().get().invoke(
            `object`!!.run {
                DBusObject.wrap(reinterpret())
            }
        )
    }
        .reinterpret()
