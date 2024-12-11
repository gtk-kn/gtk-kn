// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GSourceCallbackFuncs
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `GSourceCallbackFuncs` struct contains
 * functions for managing callback objects.
 *
 * ## Skipped during bindings generation
 *
 * - field `ref`: Fields with callbacks are not supported
 * - field `unref`: Fields with callbacks are not supported
 * - field `get`: Fields with callbacks are not supported
 */
public class SourceCallbackFuncs(pointer: CPointer<GSourceCallbackFuncs>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val glibSourceCallbackFuncsPointer: CPointer<GSourceCallbackFuncs> = pointer

    /**
     * Allocate a new SourceCallbackFuncs.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GSourceCallbackFuncs>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to SourceCallbackFuncs and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GSourceCallbackFuncs>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new SourceCallbackFuncs using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GSourceCallbackFuncs>().ptr)
}
