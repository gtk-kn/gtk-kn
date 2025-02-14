// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCallbackAction
import org.gtkkn.native.gtk.gtk_callback_action_get_type
import org.gtkkn.native.gtk.gtk_callback_action_new

/**
 * A `GtkShortcutAction` that invokes a callback.
 */
public open class CallbackAction(public val gtkCallbackActionPointer: CPointer<GtkCallbackAction>) :
    ShortcutAction(gtkCallbackActionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Create a custom action that calls the given @callback when
     * activated.
     *
     * @param callback the callback
     *   to call when the action is activated
     * @return A new shortcut action
     */
    public constructor(
        callback: ShortcutFunc,
    ) : this(
        gtk_callback_action_new(
            ShortcutFuncFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CallbackAction> {
        override val type: GeneratedClassKGType<CallbackAction> =
            GeneratedClassKGType(getTypeOrNull()!!) { CallbackAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CallbackAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_callback_action_get_type()

        /**
         * Gets the GType of from the symbol `gtk_callback_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_callback_action_get_type")
    }
}
