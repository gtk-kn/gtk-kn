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
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.GDBusObject
import org.gtkkn.native.gio.g_dbus_object_get_interface
import org.gtkkn.native.gio.g_dbus_object_get_interfaces
import org.gtkkn.native.gio.g_dbus_object_get_object_path
import org.gtkkn.native.gio.g_dbus_object_get_type
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GDBusObject` type is the base type for D-Bus objects on both
 * the service side (see [class@Gio.DBusObjectSkeleton]) and the client side
 * (see [class@Gio.DBusObjectProxy]). It is essentially just a container of
 * interfaces.
 */
public interface DBusObject : Interface, KGTyped {
    public val gioDBusObjectPointer: CPointer<GDBusObject>

    /**
     * Gets the D-Bus interface with name @interface_name associated with
     * @object, if any.
     *
     * @param interfaceName A D-Bus interface name.
     * @return null if not found, otherwise a
     *   #GDBusInterface that must be freed with g_object_unref().
     * @since 2.30
     */
    public fun getInterface(interfaceName: String): DBusInterface? =
        g_dbus_object_get_interface(gioDBusObjectPointer.reinterpret(), interfaceName)?.run {
            DBusInterface.wrap(reinterpret())
        }

    /**
     * Gets the D-Bus interfaces associated with @object.
     *
     * @return A list of #GDBusInterface instances.
     *   The returned list must be freed by g_list_free() after each element has been freed
     *   with g_object_unref().
     * @since 2.30
     */
    public fun getInterfaces(): List =
        g_dbus_object_get_interfaces(gioDBusObjectPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Gets the object path for @object.
     *
     * @return A string owned by @object. Do not free.
     * @since 2.30
     */
    public fun getObjectPath(): String =
        g_dbus_object_get_object_path(gioDBusObjectPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Emitted when @interface is added to @object.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `interface` The #GDBusInterface that was
     * added.
     * @since 2.30
     */
    public fun connectInterfaceAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`interface`: DBusInterface) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gioDBusObjectPointer.reinterpret(),
            "interface-added",
            connectInterfaceAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when @interface is removed from @object.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `interface` The #GDBusInterface that was
     * removed.
     * @since 2.30
     */
    public fun connectInterfaceRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`interface`: DBusInterface) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gioDBusObjectPointer.reinterpret(),
            "interface-removed",
            connectInterfaceRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GDBusObject>,
    ) : DBusObject {
        override val gioDBusObjectPointer: CPointer<GDBusObject> = pointer
    }

    public companion object : TypeCompanion<DBusObject> {
        override val type: GeneratedInterfaceKGType<DBusObject> =
            GeneratedInterfaceKGType(g_dbus_object_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDBusObject>): DBusObject = Wrapper(pointer)
    }
}

private val connectInterfaceAddedFunc: CPointer<CFunction<(CPointer<GDBusInterface>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `interface`: CPointer<GDBusInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`interface`: DBusInterface) -> Unit>().get().invoke(
            `interface`!!.run {
                DBusInterface.wrap(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectInterfaceRemovedFunc: CPointer<CFunction<(CPointer<GDBusInterface>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `interface`: CPointer<GDBusInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`interface`: DBusInterface) -> Unit>().get().invoke(
            `interface`!!.run {
                DBusInterface.wrap(reinterpret())
            }
        )
    }
        .reinterpret()
