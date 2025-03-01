// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.GDBusObject
import org.gtkkn.native.gio.g_dbus_object_get_interface
import org.gtkkn.native.gio.g_dbus_object_get_interfaces
import org.gtkkn.native.gio.g_dbus_object_get_object_path
import org.gtkkn.native.gio.g_dbus_object_get_type
import org.gtkkn.native.gobject.GType
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
public interface DBusObject :
    Proxy,
    KGTyped {
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
    @GioVersion2_30
    public fun getInterface(interfaceName: String): DBusInterface? =
        g_dbus_object_get_interface(gioDBusObjectPointer, interfaceName)?.run {
            DBusInterface.DBusInterfaceImpl(reinterpret())
        }

    /**
     * Gets the D-Bus interfaces associated with @object.
     *
     * @return A list of #GDBusInterface instances.
     *   The returned list must be freed by g_list_free() after each element has been freed
     *   with g_object_unref().
     * @since 2.30
     */
    @GioVersion2_30
    public fun getInterfaces(): List = g_dbus_object_get_interfaces(gioDBusObjectPointer)!!.run {
        List(this)
    }

    /**
     * Gets the object path for @object.
     *
     * @return A string owned by @object. Do not free.
     * @since 2.30
     */
    @GioVersion2_30
    public fun getObjectPath(): String =
        g_dbus_object_get_object_path(gioDBusObjectPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Emitted when @interface is added to @object.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `interface` The #GDBusInterface that was added.
     * @since 2.30
     */
    @GioVersion2_30
    public fun onInterfaceAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`interface`: DBusInterface) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectPointer,
        "interface-added",
        onInterfaceAddedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when @interface is removed from @object.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `interface` The #GDBusInterface that was removed.
     * @since 2.30
     */
    @GioVersion2_30
    public fun onInterfaceRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`interface`: DBusInterface) -> Unit,
    ): ULong = g_signal_connect_data(
        gioDBusObjectPointer,
        "interface-removed",
        onInterfaceRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The DBusObjectImpl type represents a native instance of the DBusObject interface.
     *
     * @constructor Creates a new instance of DBusObject for the provided [CPointer].
     */
    public class DBusObjectImpl(gioDBusObjectPointer: CPointer<GDBusObject>) :
        Object(gioDBusObjectPointer.reinterpret()),
        DBusObject {
        init {
            Gio
        }

        override val gioDBusObjectPointer: CPointer<GDBusObject> = gioDBusObjectPointer
    }

    public companion object : TypeCompanion<DBusObject> {
        override val type: GeneratedInterfaceKGType<DBusObject> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { DBusObjectImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DBusObject
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_get_type()

        /**
         * Gets the GType of from the symbol `g_dbus_object_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dbus_object_get_type")
    }
}

private val onInterfaceAddedFunc: CPointer<CFunction<(CPointer<GDBusInterface>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `interface`: CPointer<GDBusInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`interface`: DBusInterface) -> Unit>().get().invoke(
            `interface`!!.run {
                DBusInterface.DBusInterfaceImpl(reinterpret())
            }
        )
    }
        .reinterpret()

private val onInterfaceRemovedFunc: CPointer<CFunction<(CPointer<GDBusInterface>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `interface`: CPointer<GDBusInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`interface`: DBusInterface) -> Unit>().get().invoke(
            `interface`!!.run {
                DBusInterface.DBusInterfaceImpl(reinterpret())
            }
        )
    }
        .reinterpret()
