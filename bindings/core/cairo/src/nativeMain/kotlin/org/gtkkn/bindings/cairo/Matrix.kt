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
import org.gtkkn.native.cairo.cairo_matrix_init
import org.gtkkn.native.cairo.cairo_matrix_init_identity
import org.gtkkn.native.cairo.cairo_matrix_init_translate
import org.gtkkn.native.cairo.cairo_matrix_invert
import org.gtkkn.native.cairo.cairo_matrix_multiply
import org.gtkkn.native.cairo.cairo_matrix_rotate
import org.gtkkn.native.cairo.cairo_matrix_scale
import org.gtkkn.native.cairo.cairo_matrix_t
import org.gtkkn.native.cairo.cairo_matrix_translate
import org.gtkkn.native.glib.gdouble
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - parameter `dx`: Unsupported pointer to primitive type
 * - parameter `x`: Unsupported pointer to primitive type
 */
public class Matrix(public val cairoMatrixPointer: CPointer<cairo_matrix_t>, cleaner: Cleaner? = null) :
    ProxyInstance(cairoMatrixPointer) {
    public var xx: gdouble
        get() = cairoMatrixPointer.pointed.xx

        @UnsafeFieldSetter
        set(`value`) {
            cairoMatrixPointer.pointed.xx = value
        }

    public var yx: gdouble
        get() = cairoMatrixPointer.pointed.yx

        @UnsafeFieldSetter
        set(`value`) {
            cairoMatrixPointer.pointed.yx = value
        }

    public var xy: gdouble
        get() = cairoMatrixPointer.pointed.xy

        @UnsafeFieldSetter
        set(`value`) {
            cairoMatrixPointer.pointed.xy = value
        }

    public var yy: gdouble
        get() = cairoMatrixPointer.pointed.yy

        @UnsafeFieldSetter
        set(`value`) {
            cairoMatrixPointer.pointed.yy = value
        }

    public var x0: gdouble
        get() = cairoMatrixPointer.pointed.x0

        @UnsafeFieldSetter
        set(`value`) {
            cairoMatrixPointer.pointed.x0 = value
        }

    public var y0: gdouble
        get() = cairoMatrixPointer.pointed.y0

        @UnsafeFieldSetter
        set(`value`) {
            cairoMatrixPointer.pointed.y0 = value
        }

    /**
     * Allocate a new Matrix.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_matrix_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Matrix and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_matrix_t>, Cleaner>,
    ) : this(cairoMatrixPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Matrix using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_matrix_t>().ptr)

    /**
     * Allocate a new Matrix.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param xx
     * @param yx
     * @param xy
     * @param yy
     * @param x0
     * @param y0
     */
    public constructor(
        xx: gdouble,
        yx: gdouble,
        xy: gdouble,
        yy: gdouble,
        x0: gdouble,
        y0: gdouble,
    ) : this() {
        this.xx = xx
        this.yx = yx
        this.xy = xy
        this.yy = yy
        this.x0 = x0
        this.y0 = y0
    }

    /**
     * Allocate a new Matrix using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param xx
     * @param yx
     * @param xy
     * @param yy
     * @param x0
     * @param y0
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        xx: gdouble,
        yx: gdouble,
        xy: gdouble,
        yy: gdouble,
        x0: gdouble,
        y0: gdouble,
        scope: AutofreeScope,
    ) : this(scope) {
        this.xx = xx
        this.yx = yx
        this.xy = xy
        this.yy = yy
        this.x0 = x0
        this.y0 = y0
    }

    public fun initIdentity(): Unit = cairo_matrix_init_identity(cairoMatrixPointer)

    public fun initTranslate(tx: gdouble, ty: gdouble): Unit = cairo_matrix_init_translate(cairoMatrixPointer, tx, ty)

    public fun translate(tx: gdouble, ty: gdouble): Unit = cairo_matrix_translate(cairoMatrixPointer, tx, ty)

    public fun scale(sx: gdouble, sy: gdouble): Unit = cairo_matrix_scale(cairoMatrixPointer, sx, sy)

    public fun rotate(radians: gdouble): Unit = cairo_matrix_rotate(cairoMatrixPointer, radians)

    public fun invert(): Status = cairo_matrix_invert(cairoMatrixPointer).run {
        Status.fromNativeValue(this)
    }

    public fun multiply(a: Matrix, b: Matrix): Unit =
        cairo_matrix_multiply(cairoMatrixPointer, a.cairoMatrixPointer, b.cairoMatrixPointer)

    public fun `init`(xx: gdouble, yx: gdouble, xy: gdouble, yy: gdouble, x0: gdouble, y0: gdouble): Unit =
        cairo_matrix_init(cairoMatrixPointer, xx, yx, xy, yy, x0, y0)

    override fun toString(): String = "Matrix(xx=$xx, yx=$yx, xy=$xy, yy=$yy, x0=$x0, y0=$y0)"
}
