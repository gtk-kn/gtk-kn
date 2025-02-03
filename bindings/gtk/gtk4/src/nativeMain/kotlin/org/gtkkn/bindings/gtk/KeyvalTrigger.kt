// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkKeyvalTrigger
import org.gtkkn.native.gtk.gtk_keyval_trigger_get_keyval
import org.gtkkn.native.gtk.gtk_keyval_trigger_get_modifiers
import org.gtkkn.native.gtk.gtk_keyval_trigger_get_type
import org.gtkkn.native.gtk.gtk_keyval_trigger_new

/**
 * A `GtkShortcutTrigger` that triggers when a specific keyval and modifiers are pressed.
 */
public open class KeyvalTrigger(public val gtkKeyvalTriggerPointer: CPointer<GtkKeyvalTrigger>) :
    ShortcutTrigger(gtkKeyvalTriggerPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The key value for the trigger.
     */
    public open val keyval: guint
        /**
         * Gets the keyval that must be pressed to succeed
         * triggering @self.
         *
         * @return the keyval
         */
        get() = gtk_keyval_trigger_get_keyval(gtkKeyvalTriggerPointer)

    /**
     * The key modifiers for the trigger.
     */
    public open val modifiers: ModifierType
        /**
         * Gets the modifiers that must be present to succeed
         * triggering @self.
         *
         * @return the modifiers
         */
        get() = gtk_keyval_trigger_get_modifiers(gtkKeyvalTriggerPointer).run {
            ModifierType(this)
        }

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * the key with the given @keyval and @modifiers is pressed.
     *
     * @param keyval The keyval to trigger for
     * @param modifiers the modifiers that need to be present
     * @return A new `GtkShortcutTrigger`
     */
    public constructor(
        keyval: guint,
        modifiers: ModifierType,
    ) : this(gtk_keyval_trigger_new(keyval, modifiers.mask)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<KeyvalTrigger> {
        override val type: GeneratedClassKGType<KeyvalTrigger> =
            GeneratedClassKGType(getTypeOrNull()!!) { KeyvalTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of KeyvalTrigger
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_keyval_trigger_get_type()

        /**
         * Gets the GType of from the symbol `gtk_keyval_trigger_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_keyval_trigger_get_type")
    }
}
