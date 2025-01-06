// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gtk.GtkRequestedSize
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See [func@distribute_natural_allocation].
 */
public class RequestedSize(pointer: CPointer<GtkRequestedSize>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkRequestedSize> = pointer

    /**
     * A client pointer
     */
    public var `data`: gpointer
        get() = gPointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.data = value
        }

    /**
     * The minimum size needed for allocation in a given orientation
     */
    public var minimumSize: gint
        get() = gPointer.pointed.minimum_size

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.minimum_size = value
        }

    /**
     * The natural size for allocation in a given orientation
     */
    public var naturalSize: gint
        get() = gPointer.pointed.natural_size

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.natural_size = value
        }

    /**
     * Allocate a new RequestedSize.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkRequestedSize>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to RequestedSize and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkRequestedSize>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new RequestedSize using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkRequestedSize>().ptr)

    /**
     * Allocate a new RequestedSize.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data A client pointer
     * @param minimumSize The minimum size needed for allocation in a given orientation
     * @param naturalSize The natural size for allocation in a given orientation
     */
    public constructor(
        `data`: gpointer,
        minimumSize: gint,
        naturalSize: gint,
    ) : this() {
        this.data = data
        this.minimumSize = minimumSize
        this.naturalSize = naturalSize
    }

    /**
     * Allocate a new RequestedSize using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data A client pointer
     * @param minimumSize The minimum size needed for allocation in a given orientation
     * @param naturalSize The natural size for allocation in a given orientation
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: gpointer,
        minimumSize: gint,
        naturalSize: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.minimumSize = minimumSize
        this.naturalSize = naturalSize
    }

    override fun toString(): String = "RequestedSize(data=$data, minimumSize=$minimumSize, naturalSize=$naturalSize)"
}
