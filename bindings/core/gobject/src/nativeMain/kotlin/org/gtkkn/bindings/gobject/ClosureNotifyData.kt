// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GClosureNotifyData
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - field `data`: gpointer
 * - field `notify`: ClosureNotify
 */
public class ClosureNotifyData(pointer: CPointer<GClosureNotifyData>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gobjectClosureNotifyDataPointer: CPointer<GClosureNotifyData> = pointer

    /**
     * Allocate a new ClosureNotifyData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GClosureNotifyData>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ClosureNotifyData and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GClosureNotifyData>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ClosureNotifyData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GClosureNotifyData>().ptr)
}
