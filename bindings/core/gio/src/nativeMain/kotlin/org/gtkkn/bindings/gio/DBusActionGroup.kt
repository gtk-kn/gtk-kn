// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GDBusActionGroup
import org.gtkkn.native.gio.GRemoteActionGroup
import org.gtkkn.native.gio.g_dbus_action_group_get
import org.gtkkn.native.gio.g_dbus_action_group_get_type
import kotlin.String

/**
 * `GDBusActionGroup` is an implementation of the [iface@Gio.ActionGroup]
 * interface.
 *
 * `GDBusActionGroup` can be used as a proxy for an action group
 * that is exported over D-Bus with [method@Gio.DBusConnection.export_action_group].
 */
public open class DBusActionGroup(
    pointer: CPointer<GDBusActionGroup>,
) : Object(pointer.reinterpret()),
    ActionGroup,
    RemoteActionGroup,
    KGTyped {
    public val gioDBusActionGroupPointer: CPointer<GDBusActionGroup>
        get() = gPointer.reinterpret()

    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = gPointer.reinterpret()

    override val gioRemoteActionGroupPointer: CPointer<GRemoteActionGroup>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<DBusActionGroup> {
        override val type: GeneratedClassKGType<DBusActionGroup> =
            GeneratedClassKGType(g_dbus_action_group_get_type()) { DBusActionGroup(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Obtains a #GDBusActionGroup for the action group which is exported at
         * the given @bus_name and @object_path.
         *
         * The thread default main context is taken at the time of this call.
         * All signals on the menu model (and any linked models) are reported
         * with respect to this context.  All calls on the returned menu model
         * (and linked models) must also originate from this same context, with
         * the thread default main context unchanged.
         *
         * This call is non-blocking.  The returned action group may or may not
         * already be filled in.  The correct thing to do is connect the signals
         * for the action group to monitor for changes and then to call
         * g_action_group_list_actions() to get the initial list.
         *
         * @param connection A #GDBusConnection
         * @param busName the bus name which exports the action
         *     group or null if @connection is not a message bus connection
         * @param objectPath the object path at which the action group is exported
         * @return a #GDBusActionGroup
         * @since 2.32
         */
        @GioVersion2_32
        public fun `get`(
            connection: DBusConnection,
            busName: String? = null,
            objectPath: String,
        ): DBusActionGroup =
            g_dbus_action_group_get(connection.gioDBusConnectionPointer.reinterpret(), busName, objectPath)!!.run {
                DBusActionGroup(reinterpret())
            }
    }
}
