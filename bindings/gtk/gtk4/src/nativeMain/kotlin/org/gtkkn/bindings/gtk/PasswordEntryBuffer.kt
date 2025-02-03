// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPasswordEntryBuffer
import org.gtkkn.native.gtk.gtk_password_entry_buffer_get_type
import org.gtkkn.native.gtk.gtk_password_entry_buffer_new

/**
 * A `GtkEntryBuffer` that locks the underlying memory to prevent it
 * from being swapped to disk.
 *
 * `GtkPasswordEntry` uses a `GtkPasswordEntryBuffer`.
 * @since 4.4
 */
@GtkVersion4_4
public open class PasswordEntryBuffer(public val gtkPasswordEntryBufferPointer: CPointer<GtkPasswordEntryBuffer>) :
    EntryBuffer(gtkPasswordEntryBufferPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkEntryBuffer` using secure memory allocations.
     *
     * @return the newly created instance
     */
    public constructor() : this(gtk_password_entry_buffer_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<PasswordEntryBuffer> {
        override val type: GeneratedClassKGType<PasswordEntryBuffer> =
            GeneratedClassKGType(getTypeOrNull()!!) { PasswordEntryBuffer(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PasswordEntryBuffer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_password_entry_buffer_get_type()

        /**
         * Gets the GType of from the symbol `gtk_password_entry_buffer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_password_entry_buffer_get_type")
    }
}
