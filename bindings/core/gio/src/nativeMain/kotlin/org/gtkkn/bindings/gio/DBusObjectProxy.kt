// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusObject
import org.gtkkn.native.gio.GDBusObjectProxy
import org.gtkkn.native.gio.g_dbus_object_proxy_get_connection
import org.gtkkn.native.gio.g_dbus_object_proxy_get_type
import org.gtkkn.native.gio.g_dbus_object_proxy_new
import kotlin.String

/**
 * A #GDBusObjectProxy is an object used to represent a remote object
 * with one or more D-Bus interfaces. Normally, you don't instantiate
 * a #GDBusObjectProxy yourself - typically #GDBusObjectManagerClient
 * is used to obtain it.
 *
 * ## Skipped during bindings generation
 *
 * - method `g-connection`: Property has no getter nor setter
 * - method `g-object-path`: Property has no getter nor setter
 *
 * @since 2.30
 */
public open class DBusObjectProxy(
    pointer: CPointer<GDBusObjectProxy>,
) : Object(pointer.reinterpret()), DBusObject, KGTyped {
    public val gioDBusObjectProxyPointer: CPointer<GDBusObjectProxy>
        get() = gPointer.reinterpret()

    override val gioDBusObjectPointer: CPointer<GDBusObject>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GDBusObjectProxy for the given connection and
     * object path.
     *
     * @param connection a #GDBusConnection
     * @param objectPath the object path
     * @return a new #GDBusObjectProxy
     * @since 2.30
     */
    public constructor(connection: DBusConnection, objectPath: String) :
        this(
            g_dbus_object_proxy_new(
                connection.gioDBusConnectionPointer.reinterpret(),
                objectPath
            )!!.reinterpret()
        )

    /**
     * Gets the connection that @proxy is for.
     *
     * @return A #GDBusConnection. Do not free, the
     *   object is owned by @proxy.
     * @since 2.30
     */
    public open fun getConnection(): DBusConnection =
        g_dbus_object_proxy_get_connection(gioDBusObjectProxyPointer.reinterpret())!!.run {
            DBusConnection(reinterpret())
        }

    public companion object : TypeCompanion<DBusObjectProxy> {
        override val type: GeneratedClassKGType<DBusObjectProxy> =
            GeneratedClassKGType(g_dbus_object_proxy_get_type()) {
                DBusObjectProxy(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
