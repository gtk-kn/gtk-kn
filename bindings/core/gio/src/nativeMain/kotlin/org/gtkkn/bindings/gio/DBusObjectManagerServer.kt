// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusObjectManager
import org.gtkkn.native.gio.GDBusObjectManagerServer
import org.gtkkn.native.gio.g_dbus_object_manager_server_export
import org.gtkkn.native.gio.g_dbus_object_manager_server_export_uniquely
import org.gtkkn.native.gio.g_dbus_object_manager_server_get_connection
import org.gtkkn.native.gio.g_dbus_object_manager_server_get_type
import org.gtkkn.native.gio.g_dbus_object_manager_server_is_exported
import org.gtkkn.native.gio.g_dbus_object_manager_server_new
import org.gtkkn.native.gio.g_dbus_object_manager_server_set_connection
import org.gtkkn.native.gio.g_dbus_object_manager_server_unexport
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GDBusObjectManagerServer` is used to export [iface@Gio.DBusObject] instances
 * using the standardized
 * [`org.freedesktop.DBus.ObjectManager`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface. For example, remote D-Bus clients can get all objects
 * and properties in a single call. Additionally, any change in the
 * object hierarchy is broadcast using signals. This means that D-Bus
 * clients can keep caches up to date by only listening to D-Bus
 * signals.
 *
 * The recommended path to export an object manager at is the path form of the
 * well-known name of a D-Bus service, or below. For example, if a D-Bus service
 * is available at the well-known name `net.example.ExampleService1`, the object
 * manager should typically be exported at `/net/example/ExampleService1`, or
 * below (to allow for multiple object managers in a service).
 *
 * It is supported, but not recommended, to export an object manager at the root
 * path, `/`.
 *
 * See [class@Gio.DBusObjectManagerClient] for the client-side code that is
 * intended to be used with `GDBusObjectManagerServer` or any D-Bus
 * object implementing the `org.freedesktop.DBus.ObjectManager` interface.
 *
 * ## Skipped during bindings generation
 *
 * - method `object-path`: Property has no getter nor setter
 *
 * @since 2.30
 */
@GioVersion2_30
public open class DBusObjectManagerServer(
    public val gioDBusObjectManagerServerPointer: CPointer<GDBusObjectManagerServer>,
) : Object(gioDBusObjectManagerServerPointer.reinterpret()),
    DBusObjectManager,
    KGTyped {
    override val gioDBusObjectManagerPointer: CPointer<GDBusObjectManager>
        get() = handle.reinterpret()

    /**
     * The #GDBusConnection to export objects on.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open var connection: DBusConnection?
        /**
         * Gets the #GDBusConnection used by @manager.
         *
         * @return A #GDBusConnection object or null if
         *   @manager isn't exported on a connection. The returned object should
         *   be freed with g_object_unref().
         * @since 2.30
         */
        get() = g_dbus_object_manager_server_get_connection(gioDBusObjectManagerServerPointer)?.run {
            DBusConnection(this)
        }

        /**
         * Exports all objects managed by @manager on @connection. If
         * @connection is null, stops exporting objects.
         *
         * @param connection A #GDBusConnection or null.
         */
        set(
            connection
        ) = g_dbus_object_manager_server_set_connection(
            gioDBusObjectManagerServerPointer,
            connection?.gioDBusConnectionPointer
        )

    /**
     * Creates a new #GDBusObjectManagerServer object.
     *
     * The returned server isn't yet exported on any connection. To do so,
     * use g_dbus_object_manager_server_set_connection(). Normally you
     * want to export all of your objects before doing so to avoid
     * [InterfacesAdded](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
     * signals being emitted.
     *
     * @param objectPath The object path to export the manager object at.
     * @return A #GDBusObjectManagerServer object. Free with g_object_unref().
     * @since 2.30
     */
    public constructor(objectPath: String) : this(g_dbus_object_manager_server_new(objectPath)!!.reinterpret())

    /**
     * Exports @object on @manager.
     *
     * If there is already a #GDBusObject exported at the object path,
     * then the old object is removed.
     *
     * The object path for @object must be in the hierarchy rooted by the
     * object path for @manager.
     *
     * Note that @manager will take a reference on @object for as long as
     * it is exported.
     *
     * @param object A #GDBusObjectSkeleton.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun export(`object`: DBusObjectSkeleton): Unit =
        g_dbus_object_manager_server_export(gioDBusObjectManagerServerPointer, `object`.gioDBusObjectSkeletonPointer)

    /**
     * Like g_dbus_object_manager_server_export() but appends a string of
     * the form _N (with N being a natural number) to @object's object path
     * if an object with the given path already exists. As such, the
     * #GDBusObjectProxy:g-object-path property of @object may be modified.
     *
     * @param object An object.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun exportUniquely(`object`: DBusObjectSkeleton): Unit = g_dbus_object_manager_server_export_uniquely(
        gioDBusObjectManagerServerPointer,
        `object`.gioDBusObjectSkeletonPointer
    )

    /**
     * Returns whether @object is currently exported on @manager.
     *
     * @param object An object.
     * @return true if @object is exported
     * @since 2.34
     */
    @GioVersion2_34
    public open fun isExported(`object`: DBusObjectSkeleton): Boolean = g_dbus_object_manager_server_is_exported(
        gioDBusObjectManagerServerPointer,
        `object`.gioDBusObjectSkeletonPointer
    ).asBoolean()

    /**
     * If @manager has an object at @path, removes the object. Otherwise
     * does nothing.
     *
     * Note that @object_path must be in the hierarchy rooted by the
     * object path for @manager.
     *
     * @param objectPath An object path.
     * @return true if object at @object_path was removed, false otherwise.
     * @since 2.30
     */
    @GioVersion2_30
    public open fun unexport(objectPath: String): Boolean =
        g_dbus_object_manager_server_unexport(gioDBusObjectManagerServerPointer, objectPath).asBoolean()

    public companion object : TypeCompanion<DBusObjectManagerServer> {
        override val type: GeneratedClassKGType<DBusObjectManagerServer> =
            GeneratedClassKGType(g_dbus_object_manager_server_get_type()) {
                DBusObjectManagerServer(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DBusObjectManagerServer
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_object_manager_server_get_type()
    }
}
