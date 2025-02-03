// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GRemoteActionGroup
import org.gtkkn.native.gio.g_remote_action_group_activate_action_full
import org.gtkkn.native.gio.g_remote_action_group_change_action_state_full
import org.gtkkn.native.gio.g_remote_action_group_get_type
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * The `GRemoteActionGroup` interface is implemented by [iface@Gio.ActionGroup]
 * instances that either transmit action invocations to other processes
 * or receive action invocations in the local process from other
 * processes.
 *
 * The interface has `_full` variants of the two
 * methods on [iface@Gio.ActionGroup] used to activate actions:
 * [method@Gio.ActionGroup.activate_action] and
 * [method@Gio.ActionGroup.change_action_state]. These variants allow a
 * ‘platform data’ [struct@GLib.Variant] to be specified: a dictionary providing
 * context for the action invocation (for example: timestamps, startup
 * notification IDs, etc).
 *
 * [class@Gio.DBusActionGroup] implements `GRemoteActionGroup`.  This provides a
 * mechanism to send platform data for action invocations over D-Bus.
 *
 * Additionally, [method@Gio.DBusConnection.export_action_group] will check if
 * the exported [iface@Gio.ActionGroup] implements `GRemoteActionGroup` and use
 * the `_full` variants of the calls if available.  This
 * provides a mechanism by which to receive platform data for action
 * invocations that arrive by way of D-Bus.
 * @since 2.32
 */
@GioVersion2_32
public interface RemoteActionGroup :
    Proxy,
    ActionGroup,
    KGTyped {
    public val gioRemoteActionGroupPointer: CPointer<GRemoteActionGroup>

    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = gioRemoteActionGroupPointer.reinterpret()

    /**
     * Activates the remote action.
     *
     * This is the same as g_action_group_activate_action() except that it
     * allows for provision of "platform data" to be sent along with the
     * activation request.  This typically contains details such as the user
     * interaction timestamp or startup notification information.
     *
     * @platform_data must be non-null and must have the type
     * %G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     *
     * @param actionName the name of the action to activate
     * @param parameter the optional parameter to the activation
     * @param platformData the platform data to send
     * @since 2.32
     */
    @GioVersion2_32
    public fun activateActionFull(actionName: String, parameter: Variant? = null, platformData: Variant): Unit =
        g_remote_action_group_activate_action_full(
            gioRemoteActionGroupPointer,
            actionName,
            parameter?.glibVariantPointer,
            platformData.glibVariantPointer
        )

    /**
     * Changes the state of a remote action.
     *
     * This is the same as g_action_group_change_action_state() except that
     * it allows for provision of "platform data" to be sent along with the
     * state change request.  This typically contains details such as the
     * user interaction timestamp or startup notification information.
     *
     * @platform_data must be non-null and must have the type
     * %G_VARIANT_TYPE_VARDICT.  If it is floating, it will be consumed.
     *
     * @param actionName the name of the action to change the state of
     * @param value the new requested value for the state
     * @param platformData the platform data to send
     * @since 2.32
     */
    @GioVersion2_32
    public fun changeActionStateFull(actionName: String, `value`: Variant, platformData: Variant): Unit =
        g_remote_action_group_change_action_state_full(
            gioRemoteActionGroupPointer,
            actionName,
            `value`.glibVariantPointer,
            platformData.glibVariantPointer
        )

    /**
     * The RemoteActionGroupImpl type represents a native instance of the RemoteActionGroup interface.
     *
     * @constructor Creates a new instance of RemoteActionGroup for the provided [CPointer].
     */
    public class RemoteActionGroupImpl(gioRemoteActionGroupPointer: CPointer<GRemoteActionGroup>) :
        Object(gioRemoteActionGroupPointer.reinterpret()),
        RemoteActionGroup {
        init {
            Gio
        }

        override val gioRemoteActionGroupPointer: CPointer<GRemoteActionGroup> =
            gioRemoteActionGroupPointer
    }

    public companion object : TypeCompanion<RemoteActionGroup> {
        override val type: GeneratedInterfaceKGType<RemoteActionGroup> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { RemoteActionGroupImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of RemoteActionGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_remote_action_group_get_type()

        /**
         * Gets the GType of from the symbol `g_remote_action_group_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_remote_action_group_get_type")
    }
}
