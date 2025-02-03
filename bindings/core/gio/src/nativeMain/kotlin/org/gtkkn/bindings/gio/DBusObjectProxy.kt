// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDBusObject
import org.gtkkn.native.gio.GDBusObjectProxy
import org.gtkkn.native.gio.g_dbus_object_proxy_get_connection
import org.gtkkn.native.gio.g_dbus_object_proxy_get_type
import org.gtkkn.native.gio.g_dbus_object_proxy_new
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * A `GDBusObjectProxy` is an object used to represent a remote object
 * with one or more D-Bus interfaces. Normally, you don’t instantiate
 * a `GDBusObjectProxy` yourself — typically [class@Gio.DBusObjectManagerClient]
 * is used to obtain it.
 *
 * ## Skipped during bindings generation
 *
 * - method `g-connection`: Property has no getter nor setter
 * - method `g-object-path`: Property has no getter nor setter
 *
 * @since 2.30
 */
@GioVersion2_30
public open class DBusObjectProxy(public val gioDBusObjectProxyPointer: CPointer<GDBusObjectProxy>) :
    Object(gioDBusObjectProxyPointer.reinterpret()),
    DBusObject,
    KGTyped {
    init {
        Gio
    }

    override val gioDBusObjectPointer: CPointer<GDBusObject>
        get() = handle.reinterpret()

    /**
     * Creates a new #GDBusObjectProxy for the given connection and
     * object path.
     *
     * @param connection a #GDBusConnection
     * @param objectPath the object path
     * @return a new #GDBusObjectProxy
     * @since 2.30
     */
    public constructor(
        connection: DBusConnection,
        objectPath: String,
    ) : this(g_dbus_object_proxy_new(connection.gioDBusConnectionPointer, objectPath)!!) {
        InstanceCache.put(this)
    }

    /**
     * Gets the connection that @proxy is for.
     *
     * @return A #GDBusConnection. Do not free, the
     *   object is owned by @proxy.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun getConnection(): DBusConnection =
        g_dbus_object_proxy_get_connection(gioDBusObjectProxyPointer)!!.run {
            InstanceCache.get(this, true) { DBusConnection(reinterpret()) }!!
        }

    public companion object : TypeCompanion<DBusObjectProxy> {
        override val type: GeneratedClassKGType<DBusObjectProxy> =
            GeneratedClassKGType(getTypeOrNull()!!) { DBusObjectProxy(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DBusObjectProxy
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_proxy_get_type()

        /**
         * Gets the GType of from the symbol `g_dbus_object_proxy_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dbus_object_proxy_get_type")
    }
}
