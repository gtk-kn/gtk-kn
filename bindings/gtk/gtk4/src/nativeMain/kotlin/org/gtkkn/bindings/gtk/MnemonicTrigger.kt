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
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkMnemonicTrigger
import org.gtkkn.native.gtk.gtk_mnemonic_trigger_get_keyval
import org.gtkkn.native.gtk.gtk_mnemonic_trigger_get_type
import org.gtkkn.native.gtk.gtk_mnemonic_trigger_new

/**
 * A `GtkShortcutTrigger` that triggers when a specific mnemonic is pressed.
 *
 * Mnemonics require a *mnemonic modifier* (typically <kbd>Alt</kbd>) to be
 * pressed together with the mnemonic key.
 */
public open class MnemonicTrigger(public val gtkMnemonicTriggerPointer: CPointer<GtkMnemonicTrigger>) :
    ShortcutTrigger(gtkMnemonicTriggerPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The key value for the trigger.
     */
    public open val keyval: guint
        /**
         * Gets the keyval that must be pressed to succeed triggering @self.
         *
         * @return the keyval
         */
        get() = gtk_mnemonic_trigger_get_keyval(gtkMnemonicTriggerPointer)

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever the key with
     * the given @keyval is pressed and mnemonics have been activated.
     *
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     *
     * @param keyval The keyval to trigger for
     * @return A new `GtkShortcutTrigger`
     */
    public constructor(keyval: guint) : this(gtk_mnemonic_trigger_new(keyval)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<MnemonicTrigger> {
        override val type: GeneratedClassKGType<MnemonicTrigger> =
            GeneratedClassKGType(getTypeOrNull()!!) { MnemonicTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MnemonicTrigger
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_mnemonic_trigger_get_type()

        /**
         * Gets the GType of from the symbol `gtk_mnemonic_trigger_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_mnemonic_trigger_get_type")
    }
}
