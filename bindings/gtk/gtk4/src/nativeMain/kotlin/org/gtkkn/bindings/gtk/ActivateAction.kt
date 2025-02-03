// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkActivateAction
import org.gtkkn.native.gtk.gtk_activate_action_get
import org.gtkkn.native.gtk.gtk_activate_action_get_type

/**
 * A `GtkShortcutAction` that calls gtk_widget_activate().
 */
public open class ActivateAction(public val gtkActivateActionPointer: CPointer<GtkActivateAction>) :
    ShortcutAction(gtkActivateActionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<ActivateAction> {
        override val type: GeneratedClassKGType<ActivateAction> =
            GeneratedClassKGType(getTypeOrNull()!!) { ActivateAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the activate action.
         *
         * This is an action that calls gtk_widget_activate()
         * on the given widget upon activation.
         *
         * @return The activate action
         */
        public fun `get`(): ActivateAction = gtk_activate_action_get()!!.run {
            InstanceCache.get(reinterpret(), true) { ActivateAction(reinterpret()) }!!
        }

        /**
         * Get the GType of ActivateAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_activate_action_get_type()

        /**
         * Gets the GType of from the symbol `gtk_activate_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_activate_action_get_type")
    }
}
