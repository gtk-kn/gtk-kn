// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class PasswordEntryBuffer(
    pointer: CPointer<GtkPasswordEntryBuffer>,
) : EntryBuffer(pointer.reinterpret()), KGTyped {
    public val gtkPasswordEntryBufferPointer: CPointer<GtkPasswordEntryBuffer>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkEntryBuffer` using secure memory allocations.
     *
     * @return the newly created instance
     */
    public constructor() : this(gtk_password_entry_buffer_new()!!.reinterpret())

    public companion object : TypeCompanion<PasswordEntryBuffer> {
        override val type: GeneratedClassKGType<PasswordEntryBuffer> =
            GeneratedClassKGType(gtk_password_entry_buffer_get_type()) {
                PasswordEntryBuffer(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
