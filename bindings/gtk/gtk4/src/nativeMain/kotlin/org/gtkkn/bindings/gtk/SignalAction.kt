// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSignalAction
import org.gtkkn.native.gtk.gtk_signal_action_get_signal_name
import org.gtkkn.native.gtk.gtk_signal_action_get_type
import org.gtkkn.native.gtk.gtk_signal_action_new
import kotlin.String

/**
 * A `GtkShortcut`Action that emits a signal.
 *
 * Signals that are used in this way are referred to as keybinding signals,
 * and they are expected to be defined with the %G_SIGNAL_ACTION flag.
 */
public open class SignalAction(public val gtkSignalActionPointer: CPointer<GtkSignalAction>) :
    ShortcutAction(gtkSignalActionPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The name of the signal to emit.
     */
    public open val signalName: String
        /**
         * Returns the name of the signal that will be emitted.
         *
         * @return the name of the signal to emit
         */
        get() = gtk_signal_action_get_signal_name(gtkSignalActionPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Creates an action that when activated, emits the given action signal
     * on the provided widget.
     *
     * It will also unpack the args into arguments passed to the signal.
     *
     * @param signalName name of the signal to emit
     * @return a new `GtkShortcutAction`
     */
    public constructor(signalName: String) : this(gtk_signal_action_new(signalName)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<SignalAction> {
        override val type: GeneratedClassKGType<SignalAction> =
            GeneratedClassKGType(getTypeOrNull()!!) { SignalAction(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SignalAction
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_signal_action_get_type()

        /**
         * Gets the GType of from the symbol `gtk_signal_action_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_signal_action_get_type")
    }
}
