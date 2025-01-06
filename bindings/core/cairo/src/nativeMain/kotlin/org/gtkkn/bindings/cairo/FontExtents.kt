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
import org.gtkkn.native.cairo.cairo_font_extents_t
import org.gtkkn.native.glib.gdouble
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class FontExtents(pointer: CPointer<cairo_font_extents_t>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<cairo_font_extents_t> = pointer

    public var ascent: gdouble
        get() = gPointer.pointed.ascent

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.ascent = value
        }

    public var descent: gdouble
        get() = gPointer.pointed.descent

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.descent = value
        }

    public var height: gdouble
        get() = gPointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.height = value
        }

    public var maxXAdvance: gdouble
        get() = gPointer.pointed.max_x_advance

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.max_x_advance = value
        }

    public var maxYAdvance: gdouble
        get() = gPointer.pointed.max_y_advance

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.max_y_advance = value
        }

    /**
     * Allocate a new FontExtents.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_font_extents_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to FontExtents and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_font_extents_t>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new FontExtents using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_font_extents_t>().ptr)

    /**
     * Allocate a new FontExtents.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param ascent
     * @param descent
     * @param height
     * @param maxXAdvance
     * @param maxYAdvance
     */
    public constructor(
        ascent: gdouble,
        descent: gdouble,
        height: gdouble,
        maxXAdvance: gdouble,
        maxYAdvance: gdouble,
    ) : this() {
        this.ascent = ascent
        this.descent = descent
        this.height = height
        this.maxXAdvance = maxXAdvance
        this.maxYAdvance = maxYAdvance
    }

    /**
     * Allocate a new FontExtents using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param ascent
     * @param descent
     * @param height
     * @param maxXAdvance
     * @param maxYAdvance
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        ascent: gdouble,
        descent: gdouble,
        height: gdouble,
        maxXAdvance: gdouble,
        maxYAdvance: gdouble,
        scope: AutofreeScope,
    ) : this(scope) {
        this.ascent = ascent
        this.descent = descent
        this.height = height
        this.maxXAdvance = maxXAdvance
        this.maxYAdvance = maxYAdvance
    }

    override fun toString(): String =
        "FontExtents(ascent=$ascent, descent=$descent, height=$height, maxXAdvance=$maxXAdvance, maxYAdvance=$maxYAdvance)"
}
