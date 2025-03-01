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
import org.gtkkn.native.gtk.GtkMnemonicAction
import org.gtkkn.native.gtk.gtk_mnemonic_action_get
import org.gtkkn.native.gtk.gtk_mnemonic_action_get_type

/**
 * A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
 */
public open class MnemonicAction(public val gtkMnemonicActionPointer: CPointer<GtkMnemonicAction>) :
    ShortcutAction(gtkMnemonicActionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public companion object : TypeCompanion<MnemonicAction> {
        override val type: GeneratedClassKGType<MnemonicAction> =
            GeneratedClassKGType(getTypeOrNull()!!) { MnemonicAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Gets the mnemonic action.
         *
         * This is an action that calls gtk_widget_mnemonic_activate()
         * on the given widget upon activation.
         *
         * @return The mnemonic action
         */
        public fun `get`(): MnemonicAction = gtk_mnemonic_action_get()!!.run {
            InstanceCache.get(reinterpret(), true) { MnemonicAction(reinterpret()) }!!
        }

        /**
         * Get the GType of MnemonicAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_mnemonic_action_get_type()

        /**
         * Gets the GType of from the symbol `gtk_mnemonic_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_mnemonic_action_get_type")
    }
}
