// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.gfloat
import org.gtkkn.native.gsk.GskColorStop
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A color stop in a gradient node.
 *
 * ## Skipped during bindings generation
 *
 * - field `color`: Gdk.RGBA
 */
public class ColorStop(pointer: CPointer<GskColorStop>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gskColorStopPointer: CPointer<GskColorStop> = pointer

    /**
     * the offset of the color stop
     */
    public var offset: gfloat
        get() = gskColorStopPointer.pointed.offset

        @UnsafeFieldSetter
        set(`value`) {
            gskColorStopPointer.pointed.offset = value
        }

    /**
     * Allocate a new ColorStop.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GskColorStop>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ColorStop and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GskColorStop>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ColorStop using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GskColorStop>().ptr)

    /**
     * Allocate a new ColorStop.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param offset the offset of the color stop
     */
    public constructor(offset: gfloat) : this() {
        this.offset = offset
    }

    /**
     * Allocate a new ColorStop using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param offset the offset of the color stop
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(offset: gfloat, scope: AutofreeScope) : this(scope) {
        this.offset = offset
    }

    override fun toString(): String = "ColorStop(offset=$offset)"
}
