// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GOutputVector
import org.gtkkn.native.gobject.gsize
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of #GOutputVectors
 * and the operation will use all the buffers as if they were
 * one buffer.
 *
 * ## Skipped during bindings generation
 *
 * - field `buffer`: gpointer
 *
 * @since 2.22
 */
@GioVersion2_22
public class OutputVector(pointer: CPointer<GOutputVector>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gioOutputVectorPointer: CPointer<GOutputVector> = pointer

    /**
     * the size of @buffer.
     */
    public var size: gsize
        get() = gioOutputVectorPointer.pointed.size

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputVectorPointer.pointed.size = value
        }

    /**
     * Allocate a new OutputVector.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GOutputVector>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to OutputVector and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GOutputVector>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new OutputVector using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GOutputVector>().ptr)

    /**
     * Allocate a new OutputVector.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param size the size of @buffer.
     */
    public constructor(size: gsize) : this() {
        this.size = size
    }

    /**
     * Allocate a new OutputVector using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param size the size of @buffer.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(size: gsize, scope: AutofreeScope) : this(scope) {
        this.size = size
    }

    override fun toString(): String = "OutputVector(size=$size)"
}
