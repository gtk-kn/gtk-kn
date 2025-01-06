// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_path_t
import org.gtkkn.native.glib.gint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - field `data`: PathData
 */
public class Path(pointer: CPointer<cairo_path_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<cairo_path_t> = pointer

    public var status: Status
        get() = gPointer.pointed.status.run {
            Status.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.status = value.nativeValue
        }

    public var numData: gint
        get() = gPointer.pointed.num_data

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.num_data = value
        }

    /**
     * Allocate a new Path.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_path_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Path and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<cairo_path_t>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Path using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_path_t>().ptr)

    /**
     * Allocate a new Path.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param status
     * @param numData
     */
    public constructor(status: Status, numData: gint) : this() {
        this.status = status
        this.numData = numData
    }

    /**
     * Allocate a new Path using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param status
     * @param numData
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        status: Status,
        numData: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.status = status
        this.numData = numData
    }

    override fun toString(): String = "Path(status=$status, numData=$numData)"
}
