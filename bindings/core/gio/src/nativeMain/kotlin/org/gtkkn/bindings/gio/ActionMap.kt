// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.gio.g_action_map_add_action
import org.gtkkn.native.gio.g_action_map_get_type
import org.gtkkn.native.gio.g_action_map_lookup_action
import org.gtkkn.native.gio.g_action_map_remove_action
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * `GActionMap` is an interface for action containers.
 *
 * The `GActionMap` interface is implemented by [iface@Gio.ActionGroup]
 * implementations that operate by containing a number of named
 * [iface@Gio.Action] instances, such as [class@Gio.SimpleActionGroup].
 *
 * One useful application of this interface is to map the
 * names of actions from various action groups to unique,
 * prefixed names (e.g. by prepending "app." or "win.").
 * This is the motivation for the 'Map' part of the interface
 * name.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: Array parameter of type ActionEntry is not supported
 * - parameter `entries`: Array parameter of type ActionEntry is not supported
 *
 * @since 2.32
 */
@GioVersion2_32
public interface ActionMap :
    Proxy,
    KGTyped {
    public val gioActionMapPointer: CPointer<GActionMap>

    /**
     * Adds an action to the @action_map.
     *
     * If the action map already contains an action with the same name
     * as @action then the old action is dropped from the action map.
     *
     * The action map takes its own reference on @action.
     *
     * @param action a #GAction
     * @since 2.32
     */
    @GioVersion2_32
    public fun addAction(action: Action): Unit = g_action_map_add_action(gioActionMapPointer, action.gioActionPointer)

    /**
     * Looks up the action with the name @action_name in @action_map.
     *
     * If no such action exists, returns null.
     *
     * @param actionName the name of an action
     * @return a #GAction, or null
     * @since 2.32
     */
    @GioVersion2_32
    public fun lookupAction(actionName: String): Action? =
        g_action_map_lookup_action(gioActionMapPointer, actionName)?.run {
            Action.ActionImpl(reinterpret())
        }

    /**
     * Removes the named action from the action map.
     *
     * If no action of this name is in the map then nothing happens.
     *
     * @param actionName the name of the action
     * @since 2.32
     */
    @GioVersion2_32
    public fun removeAction(actionName: String): Unit = g_action_map_remove_action(gioActionMapPointer, actionName)

    /**
     * The ActionMapImpl type represents a native instance of the ActionMap interface.
     *
     * @constructor Creates a new instance of ActionMap for the provided [CPointer].
     */
    public data class ActionMapImpl(override val gioActionMapPointer: CPointer<GActionMap>) :
        Object(gioActionMapPointer.reinterpret()),
        ActionMap

    public companion object : TypeCompanion<ActionMap> {
        override val type: GeneratedInterfaceKGType<ActionMap> =
            GeneratedInterfaceKGType(g_action_map_get_type()) { ActionMapImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ActionMap
         *
         * @return the GType
         */
        public fun getType(): GType = g_action_map_get_type()
    }
}
