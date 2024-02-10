// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GMemVTable

/**
 * A set of functions used to perform memory allocation. The same #GMemVTable must
 * be used for all allocations in the same program; a call to g_mem_set_vtable(),
 * if it exists, should be prior to any use of GLib.
 *
 * This functions related to this has been deprecated in 2.46, and no longer work.
 *
 * ## Skipped during bindings generation
 *
 * - field `malloc`: Fields with callbacks are not supported
 * - field `realloc`: Fields with callbacks are not supported
 * - field `free`: Fields with callbacks are not supported
 * - field `calloc`: Fields with callbacks are not supported
 * - field `try_malloc`: Fields with callbacks are not supported
 * - field `try_realloc`: Fields with callbacks are not supported
 */
public class MemVTable(
    pointer: CPointer<GMemVTable>,
) : Record {
    public val glibMemVTablePointer: CPointer<GMemVTable> = pointer

    public companion object : RecordCompanion<MemVTable, GMemVTable> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): MemVTable = MemVTable(pointer.reinterpret())
    }
}
