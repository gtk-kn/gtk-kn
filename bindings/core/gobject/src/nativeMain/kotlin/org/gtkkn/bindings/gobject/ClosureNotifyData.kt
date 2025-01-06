// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GClosureNotifyData
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - field `notify`: ClosureNotify
 */
public class ClosureNotifyData(pointer: CPointer<GClosureNotifyData>, cleaner: Cleaner? = null) :
    ProxyInstance(pointer) {
    public val gPointer: CPointer<GClosureNotifyData> = pointer

    public var `data`: gpointer
        get() = gPointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.data = value
        }

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

    /**
     * Allocate a new ClosureNotifyData.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data
     */
    public constructor(`data`: gpointer) : this() {
        this.data = data
    }

    /**
     * Allocate a new ClosureNotifyData using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(`data`: gpointer, scope: AutofreeScope) : this(scope) {
        this.data = data
    }

    override fun toString(): String = "ClosureNotifyData(data=$data)"
}
