// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDBusInterface
import org.gtkkn.native.gio.g_dbus_interface_dup_object
import org.gtkkn.native.gio.g_dbus_interface_get_info
import org.gtkkn.native.gio.g_dbus_interface_get_type
import org.gtkkn.native.gio.g_dbus_interface_set_object
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * Base type for D-Bus interfaces.
 *
 * The `GDBusInterface` type is the base type for D-Bus interfaces both
 * on the service side (see [class@Gio.DBusInterfaceSkeleton]) and client side
 * (see [class@Gio.DBusProxy]).
 * @since 2.30
 */
@GioVersion2_30
public interface DBusInterface :
    Proxy,
    KGTyped {
    public val gioDBusInterfacePointer: CPointer<GDBusInterface>

    /**
     * Gets the #GDBusObject that @interface_ belongs to, if any.
     *
     * @return A #GDBusObject or null. The returned
     * reference should be freed with g_object_unref().
     * @since 2.32
     */
    @GioVersion2_32
    public fun getObject(): DBusObject? = g_dbus_interface_dup_object(gioDBusInterfacePointer)?.run {
        DBusObject.DBusObjectImpl(reinterpret())
    }

    /**
     * Gets D-Bus introspection information for the D-Bus interface
     * implemented by @interface_.
     *
     * @return A #GDBusInterfaceInfo. Do not free.
     * @since 2.30
     */
    @GioVersion2_30
    public fun getInfo(): DBusInterfaceInfo = g_dbus_interface_get_info(gioDBusInterfacePointer)!!.run {
        DBusInterfaceInfo(this)
    }

    /**
     * Sets the #GDBusObject for @interface_ to @object.
     *
     * Note that @interface_ will hold a weak reference to @object.
     *
     * @param object A #GDBusObject or null.
     * @since 2.30
     */
    @GioVersion2_30
    public fun setObject(`object`: DBusObject? = null): Unit =
        g_dbus_interface_set_object(gioDBusInterfacePointer, `object`?.gioDBusObjectPointer)

    /**
     * The DBusInterfaceImpl type represents a native instance of the DBusInterface interface.
     *
     * @constructor Creates a new instance of DBusInterface for the provided [CPointer].
     */
    public class DBusInterfaceImpl(gioDBusInterfacePointer: CPointer<GDBusInterface>) :
        Object(gioDBusInterfacePointer.reinterpret()),
        DBusInterface {
        init {
            Gio
        }

        override val gioDBusInterfacePointer: CPointer<GDBusInterface> = gioDBusInterfacePointer
    }

    public companion object : TypeCompanion<DBusInterface> {
        override val type: GeneratedInterfaceKGType<DBusInterface> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { DBusInterfaceImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DBusInterface
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_interface_get_type()

        /**
         * Gets the GType of from the symbol `g_dbus_interface_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dbus_interface_get_type")
    }
}
