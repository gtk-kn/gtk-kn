// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GDBusActionGroup
import org.gtkkn.native.gio.GRemoteActionGroup
import org.gtkkn.native.gio.g_dbus_action_group_get
import org.gtkkn.native.gio.g_dbus_action_group_get_type
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * `GDBusActionGroup` is an implementation of the [iface@Gio.ActionGroup]
 * interface.
 *
 * `GDBusActionGroup` can be used as a proxy for an action group
 * that is exported over D-Bus with [method@Gio.DBusConnection.export_action_group].
 */
public open class DBusActionGroup(public val gioDBusActionGroupPointer: CPointer<GDBusActionGroup>) :
    Object(gioDBusActionGroupPointer.reinterpret()),
    ActionGroup,
    RemoteActionGroup,
    KGTyped {
    init {
        Gio
    }

    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = handle.reinterpret()

    override val gioRemoteActionGroupPointer: CPointer<GRemoteActionGroup>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<DBusActionGroup> {
        override val type: GeneratedClassKGType<DBusActionGroup> =
            GeneratedClassKGType(getTypeOrNull()!!) { DBusActionGroup(it.reinterpret()) }

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
        public fun `get`(connection: DBusConnection, busName: String? = null, objectPath: String): DBusActionGroup =
            g_dbus_action_group_get(connection.gioDBusConnectionPointer, busName, objectPath)!!.run {
                InstanceCache.get(this, true) { DBusActionGroup(reinterpret()) }!!
            }

        /**
         * Get the GType of DBusActionGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_dbus_action_group_get_type()

        /**
         * Gets the GType of from the symbol `g_dbus_action_group_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dbus_action_group_get_type")
    }
}
