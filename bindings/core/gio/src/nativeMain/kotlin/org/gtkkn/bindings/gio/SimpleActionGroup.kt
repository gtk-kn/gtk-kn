// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.gio.GSimpleActionGroup
import org.gtkkn.native.gio.g_simple_action_group_get_type
import org.gtkkn.native.gio.g_simple_action_group_insert
import org.gtkkn.native.gio.g_simple_action_group_lookup
import org.gtkkn.native.gio.g_simple_action_group_new
import org.gtkkn.native.gio.g_simple_action_group_remove
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * `GSimpleActionGroup` is a hash table filled with [iface@Gio.Action] objects,
 * implementing the [iface@Gio.ActionGroup] and [iface@Gio.ActionMap]
 * interfaces.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: Array parameter of type ActionEntry is not supported
 *
 * @since 2.28
 */
@GioVersion2_28
public open class SimpleActionGroup(public val gioSimpleActionGroupPointer: CPointer<GSimpleActionGroup>) :
    Object(gioSimpleActionGroupPointer.reinterpret()),
    ActionGroup,
    ActionMap,
    KGTyped {
    init {
        Gio
    }

    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = handle.reinterpret()

    override val gioActionMapPointer: CPointer<GActionMap>
        get() = handle.reinterpret()

    /**
     * Creates a new, empty, #GSimpleActionGroup.
     *
     * @return a new #GSimpleActionGroup
     * @since 2.28
     */
    public constructor() : this(g_simple_action_group_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.38.
     *
     * Use g_action_map_add_action()
     * ---
     *
     * Adds an action to the action group.
     *
     * If the action group already contains an action with the same name as
     * @action then the old action is dropped from the group.
     *
     * The action group takes its own reference on @action.
     *
     * @param action a #GAction
     * @since 2.28
     */
    @GioVersion2_28
    public open fun insert(action: Action): Unit =
        g_simple_action_group_insert(gioSimpleActionGroupPointer, action.gioActionPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.38.
     *
     * Use g_action_map_lookup_action()
     * ---
     *
     * Looks up the action with the name @action_name in the group.
     *
     * If no such action exists, returns null.
     *
     * @param actionName the name of an action
     * @return a #GAction, or null
     * @since 2.28
     */
    @GioVersion2_28
    public open fun lookup(actionName: String): Action =
        g_simple_action_group_lookup(gioSimpleActionGroupPointer, actionName)!!.run {
            Action.ActionImpl(reinterpret())
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.38.
     *
     * Use g_action_map_remove_action()
     * ---
     *
     * Removes the named action from the action group.
     *
     * If no action of this name is in the group then nothing happens.
     *
     * @param actionName the name of the action
     * @since 2.28
     */
    @GioVersion2_28
    public open fun remove(actionName: String): Unit =
        g_simple_action_group_remove(gioSimpleActionGroupPointer, actionName)

    public companion object : TypeCompanion<SimpleActionGroup> {
        override val type: GeneratedClassKGType<SimpleActionGroup> =
            GeneratedClassKGType(getTypeOrNull()!!) { SimpleActionGroup(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SimpleActionGroup
         *
         * @return the GType
         */
        public fun getType(): GType = g_simple_action_group_get_type()

        /**
         * Gets the GType of from the symbol `g_simple_action_group_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_simple_action_group_get_type")
    }
}
