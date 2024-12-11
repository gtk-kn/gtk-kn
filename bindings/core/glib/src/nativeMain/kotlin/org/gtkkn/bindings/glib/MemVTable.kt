// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GMemVTable
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
public class MemVTable(pointer: CPointer<GMemVTable>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibMemVTablePointer: CPointer<GMemVTable> = pointer

    /**
     * Allocate a new MemVTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GMemVTable>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to MemVTable and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GMemVTable>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new MemVTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GMemVTable>().ptr)
}
