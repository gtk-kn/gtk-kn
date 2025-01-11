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
import org.gtkkn.native.cairo.cairo_glyph_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gulong
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class Glyph(public val cairoGlyphPointer: CPointer<cairo_glyph_t>, cleaner: Cleaner? = null) :
    ProxyInstance(cairoGlyphPointer) {
    public var index: gulong
        get() = cairoGlyphPointer.pointed.index

        @UnsafeFieldSetter
        set(`value`) {
            cairoGlyphPointer.pointed.index = value
        }

    public var x: gdouble
        get() = cairoGlyphPointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            cairoGlyphPointer.pointed.x = value
        }

    public var y: gdouble
        get() = cairoGlyphPointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            cairoGlyphPointer.pointed.y = value
        }

    /**
     * Allocate a new Glyph.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_glyph_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Glyph and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_glyph_t>, Cleaner>,
    ) : this(cairoGlyphPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Glyph using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_glyph_t>().ptr)

    /**
     * Allocate a new Glyph.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param index
     * @param x
     * @param y
     */
    public constructor(
        index: gulong,
        x: gdouble,
        y: gdouble,
    ) : this() {
        this.index = index
        this.x = x
        this.y = y
    }

    /**
     * Allocate a new Glyph using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param index
     * @param x
     * @param y
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        index: gulong,
        x: gdouble,
        y: gdouble,
        scope: AutofreeScope,
    ) : this(scope) {
        this.index = index
        this.x = x
        this.y = y
    }

    override fun toString(): String = "Glyph(index=$index, x=$x, y=$y)"
}
