// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GIOFuncs
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A table of functions used to handle different types of #GIOChannel
 * in a generic way.
 *
 * ## Skipped during bindings generation
 *
 * - field `io_read`: Fields with callbacks are not supported
 * - field `io_write`: Fields with callbacks are not supported
 * - field `io_seek`: Fields with callbacks are not supported
 * - field `io_close`: Fields with callbacks are not supported
 * - field `io_create_watch`: Fields with callbacks are not supported
 * - field `io_free`: Fields with callbacks are not supported
 * - field `io_set_flags`: Fields with callbacks are not supported
 * - field `io_get_flags`: Fields with callbacks are not supported
 */
public class IoFuncs(public val glibIoFuncsPointer: CPointer<GIOFuncs>, cleaner: Cleaner? = null) :
    ProxyInstance(glibIoFuncsPointer) {
    /**
     * Allocate a new IoFuncs.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GIOFuncs>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to IoFuncs and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GIOFuncs>, Cleaner>,
    ) : this(glibIoFuncsPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new IoFuncs using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GIOFuncs>().ptr)
}
