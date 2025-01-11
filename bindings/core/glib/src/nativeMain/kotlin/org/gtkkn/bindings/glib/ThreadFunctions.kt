// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GThreadFunctions
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
public class ThreadFunctions(
    public val glibThreadFunctionsPointer: CPointer<GThreadFunctions>,
    cleaner: Cleaner? = null,
) : ProxyInstance(glibThreadFunctionsPointer) {
    /**
     * Allocate a new ThreadFunctions.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GThreadFunctions>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ThreadFunctions and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GThreadFunctions>, Cleaner>,
    ) : this(glibThreadFunctionsPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ThreadFunctions using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GThreadFunctions>().ptr)
}
