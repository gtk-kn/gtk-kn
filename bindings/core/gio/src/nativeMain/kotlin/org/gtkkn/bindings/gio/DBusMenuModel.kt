// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusMenuModel
import org.gtkkn.native.gio.g_dbus_menu_model_get
import org.gtkkn.native.gio.g_dbus_menu_model_get_type
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * `GDBusMenuModel` is an implementation of [class@Gio.MenuModel] that can be
 * used as a proxy for a menu model that is exported over D-Bus with
 * [method@Gio.DBusConnection.export_menu_model].
 */
public open class DBusMenuModel(pointer: CPointer<GDBusMenuModel>) :
    MenuModel(pointer.reinterpret()),
    KGTyped {
    public val gioDBusMenuModelPointer: CPointer<GDBusMenuModel>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<DBusMenuModel> {
        override val type: GeneratedClassKGType<DBusMenuModel> =
            GeneratedClassKGType(g_dbus_menu_model_get_type()) { DBusMenuModel(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Obtains a #GDBusMenuModel for the menu model which is exported
         * at the given @bus_name and @object_path.
         *
         * The thread default main context is taken at the time of this call.
         * All signals on the menu model (and any linked models) are reported
         * with respect to this context.  All calls on the returned menu model
         * (and linked models) must also originate from this same context, with
         * the thread default main context unchanged.
         *
         * @param connection a #GDBusConnection
         * @param busName the bus name which exports the menu model
         *     or null if @connection is not a message bus connection
         * @param objectPath the object path at which the menu model is exported
         * @return a #GDBusMenuModel object. Free with
         *     g_object_unref().
         * @since 2.32
         */
        @GioVersion2_32
        public fun `get`(connection: DBusConnection, busName: String? = null, objectPath: String): DBusMenuModel =
            g_dbus_menu_model_get(connection.gioDBusConnectionPointer.reinterpret(), busName, objectPath)!!.run {
                DBusMenuModel(reinterpret())
            }

        /**
         * Get the GType of DBusMenuModel
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_menu_model_get_type()
    }
}
