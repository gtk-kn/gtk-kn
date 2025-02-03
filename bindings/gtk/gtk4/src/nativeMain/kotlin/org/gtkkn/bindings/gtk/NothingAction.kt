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
import org.gtkkn.native.gtk.GtkNothingAction
import org.gtkkn.native.gtk.gtk_nothing_action_get
import org.gtkkn.native.gtk.gtk_nothing_action_get_type

/**
 * A `GtkShortcutAction` that does nothing.
 */
public open class NothingAction(public val gtkNothingActionPointer: CPointer<GtkNothingAction>) :
    ShortcutAction(gtkNothingActionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<NothingAction> {
        override val type: GeneratedClassKGType<NothingAction> =
            GeneratedClassKGType(getTypeOrNull()!!) { NothingAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the nothing action.
         *
         * This is an action that does nothing and where
         * activating it always fails.
         *
         * @return The nothing action
         */
        public fun `get`(): NothingAction = gtk_nothing_action_get()!!.run {
            InstanceCache.get(reinterpret(), true) { NothingAction(reinterpret()) }!!
        }

        /**
         * Get the GType of NothingAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_nothing_action_get_type()

        /**
         * Gets the GType of from the symbol `gtk_nothing_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_nothing_action_get_type")
    }
}
