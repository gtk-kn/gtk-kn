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
import org.gtkkn.native.gtk.GtkNeverTrigger
import org.gtkkn.native.gtk.gtk_never_trigger_get
import org.gtkkn.native.gtk.gtk_never_trigger_get_type

/**
 * A `GtkShortcutTrigger` that never triggers.
 */
public open class NeverTrigger(public val gtkNeverTriggerPointer: CPointer<GtkNeverTrigger>) :
    ShortcutTrigger(gtkNeverTriggerPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<NeverTrigger> {
        override val type: GeneratedClassKGType<NeverTrigger> =
            GeneratedClassKGType(getTypeOrNull()!!) { NeverTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the never trigger.
         *
         * This is a singleton for a trigger that never triggers.
         * Use this trigger instead of null because it implements
         * all virtual functions.
         *
         * @return The never trigger
         */
        public fun `get`(): NeverTrigger = gtk_never_trigger_get()!!.run {
            InstanceCache.get(reinterpret(), true) { NeverTrigger(reinterpret()) }!!
        }

        /**
         * Get the GType of NeverTrigger
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_never_trigger_get_type()

        /**
         * Gets the GType of from the symbol `gtk_never_trigger_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_never_trigger_get_type")
    }
}
