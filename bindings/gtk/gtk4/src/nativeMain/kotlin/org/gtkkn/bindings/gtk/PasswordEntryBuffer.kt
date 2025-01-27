// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_4
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    /**
     * Creates a new `GtkEntryBuffer` using secure memory allocations.
     *
     * @return the newly created instance
     */
    public constructor() : this(gtk_password_entry_buffer_new()!!.reinterpret())

    public companion object : TypeCompanion<PasswordEntryBuffer> {
        override val type: GeneratedClassKGType<PasswordEntryBuffer> =
            GeneratedClassKGType(getTypeOrNull("gtk_password_entry_buffer_get_type")!!) {
                PasswordEntryBuffer(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of PasswordEntryBuffer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_password_entry_buffer_get_type()
    }
}
