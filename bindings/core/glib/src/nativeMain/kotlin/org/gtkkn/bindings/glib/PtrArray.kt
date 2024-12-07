// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GPtrArray
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_ptr_array_get_type
import org.gtkkn.native.gobject.guint
import kotlinx.cinterop.alloc as nativePlacementAlloc

/**
 * Contains the public fields of a pointer array.
 *
 * ## Skipped during bindings generation
 *
 * - field `pdata`: gpointer
 */
public class PtrArray(
    pointer: CPointer<GPtrArray>,
) : Record {
    public val glibPtrArrayPointer: CPointer<GPtrArray> = pointer

    /**
     * number of pointers in the array
     */
    public var len: guint
        get() = glibPtrArrayPointer.pointed.len
        set(`value`) {
            glibPtrArrayPointer.pointed.len = value
        }

    public companion object : RecordCompanion<PtrArray, GPtrArray> {
        /**
         * Get the GType of PtrArray
         *
         * @return the GType
         */
        public fun getType(): GType = g_ptr_array_get_type()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PtrArray = PtrArray(pointer.reinterpret())
    }
}
