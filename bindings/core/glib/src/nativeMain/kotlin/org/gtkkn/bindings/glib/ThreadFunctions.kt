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
import org.gtkkn.native.glib.GThreadFunctions

/**
 * This function table is no longer used by g_thread_init()
 * to initialize the thread system.
 *
 * ## Skipped during bindings generation
 *
 * - field `mutex_new`: Fields with callbacks are not supported
 * - field `mutex_lock`: Fields with callbacks are not supported
 * - field `mutex_trylock`: Fields with callbacks are not supported
 * - field `mutex_unlock`: Fields with callbacks are not supported
 * - field `mutex_free`: Fields with callbacks are not supported
 * - field `cond_new`: Fields with callbacks are not supported
 * - field `cond_signal`: Fields with callbacks are not supported
 * - field `cond_broadcast`: Fields with callbacks are not supported
 * - field `cond_wait`: Fields with callbacks are not supported
 * - field `cond_timed_wait`: Fields with callbacks are not supported
 * - field `cond_free`: Fields with callbacks are not supported
 * - field `private_new`: Fields with callbacks are not supported
 * - field `private_get`: Fields with callbacks are not supported
 * - field `private_set`: Fields with callbacks are not supported
 * - field `thread_create`: Fields with callbacks are not supported
 * - field `thread_yield`: Fields with callbacks are not supported
 * - field `thread_join`: Fields with callbacks are not supported
 * - field `thread_exit`: Fields with callbacks are not supported
 * - field `thread_set_priority`: Fields with callbacks are not supported
 * - field `thread_self`: Fields with callbacks are not supported
 * - field `thread_equal`: Fields with callbacks are not supported
 */
public class ThreadFunctions(public val glibThreadFunctionsPointer: CPointer<GThreadFunctions>) :
    ProxyInstance(glibThreadFunctionsPointer) {
    /**
     * Allocate a new ThreadFunctions.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GThreadFunctions>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new ThreadFunctions using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GThreadFunctions>().ptr)
}
