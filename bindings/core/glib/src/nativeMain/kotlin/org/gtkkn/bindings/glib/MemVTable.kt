// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
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
public class MemVTable(public val glibMemVTablePointer: CPointer<GMemVTable>) : ProxyInstance(glibMemVTablePointer) {
    /**
     * Allocate a new MemVTable.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GMemVTable>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new MemVTable using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GMemVTable>().ptr)
}
