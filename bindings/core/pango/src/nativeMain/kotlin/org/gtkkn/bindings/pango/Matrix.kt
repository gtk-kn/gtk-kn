// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.pango.annotations.PangoVersion1_12
import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.bindings.pango.annotations.PangoVersion1_6
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoMatrix
import org.gtkkn.native.pango.pango_matrix_concat
import org.gtkkn.native.pango.pango_matrix_copy
import org.gtkkn.native.pango.pango_matrix_free
import org.gtkkn.native.pango.pango_matrix_get_font_scale_factor
import org.gtkkn.native.pango.pango_matrix_get_slant_ratio
import org.gtkkn.native.pango.pango_matrix_get_type
import org.gtkkn.native.pango.pango_matrix_rotate
import org.gtkkn.native.pango.pango_matrix_scale
import org.gtkkn.native.pango.pango_matrix_translate
import kotlin.String
import kotlin.Unit

/**
 * A `PangoMatrix` specifies a transformation between user-space
 * and device coordinates.
 *
 * The transformation is given by
 *
 * ```
 * x_device = x_user * matrix->xx + y_user * matrix->xy + matrix->x0;
 * y_device = x_user * matrix->yx + y_user * matrix->yy + matrix->y0;
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `xscale`: xscale: Out parameter is not supported
 * - method `transform_distance`: In/Out parameter is not supported
 * - method `transform_pixel_rectangle`: In/Out parameter is not supported
 * - method `transform_point`: In/Out parameter is not supported
 * - method `transform_rectangle`: In/Out parameter is not supported
 *
 * @since 1.6
 */
@PangoVersion1_6
public class Matrix(public val pangoMatrixPointer: CPointer<PangoMatrix>) : ProxyInstance(pangoMatrixPointer) {
    /**
     * 1st component of the transformation matrix
     */
    public var xx: gdouble
        get() = pangoMatrixPointer.pointed.xx

        @UnsafeFieldSetter
        set(`value`) {
            pangoMatrixPointer.pointed.xx = value
        }

    /**
     * 2nd component of the transformation matrix
     */
    public var xy: gdouble
        get() = pangoMatrixPointer.pointed.xy

        @UnsafeFieldSetter
        set(`value`) {
            pangoMatrixPointer.pointed.xy = value
        }

    /**
     * 3rd component of the transformation matrix
     */
    public var yx: gdouble
        get() = pangoMatrixPointer.pointed.yx

        @UnsafeFieldSetter
        set(`value`) {
            pangoMatrixPointer.pointed.yx = value
        }

    /**
     * 4th component of the transformation matrix
     */
    public var yy: gdouble
        get() = pangoMatrixPointer.pointed.yy

        @UnsafeFieldSetter
        set(`value`) {
            pangoMatrixPointer.pointed.yy = value
        }

    /**
     * x translation
     */
    public var x0: gdouble
        get() = pangoMatrixPointer.pointed.x0

        @UnsafeFieldSetter
        set(`value`) {
            pangoMatrixPointer.pointed.x0 = value
        }

    /**
     * y translation
     */
    public var y0: gdouble
        get() = pangoMatrixPointer.pointed.y0

        @UnsafeFieldSetter
        set(`value`) {
            pangoMatrixPointer.pointed.y0 = value
        }

    /**
     * Allocate a new Matrix.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoMatrix>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Matrix using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoMatrix>().ptr)

    /**
     * Allocate a new Matrix.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param xx 1st component of the transformation matrix
     * @param xy 2nd component of the transformation matrix
     * @param yx 3rd component of the transformation matrix
     * @param yy 4th component of the transformation matrix
     * @param x0 x translation
     * @param y0 y translation
     */
    public constructor(
        xx: gdouble,
        xy: gdouble,
        yx: gdouble,
        yy: gdouble,
        x0: gdouble,
        y0: gdouble,
    ) : this() {
        this.xx = xx
        this.xy = xy
        this.yx = yx
        this.yy = yy
        this.x0 = x0
        this.y0 = y0
    }

    /**
     * Allocate a new Matrix using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param xx 1st component of the transformation matrix
     * @param xy 2nd component of the transformation matrix
     * @param yx 3rd component of the transformation matrix
     * @param yy 4th component of the transformation matrix
     * @param x0 x translation
     * @param y0 y translation
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        xx: gdouble,
        xy: gdouble,
        yx: gdouble,
        yy: gdouble,
        x0: gdouble,
        y0: gdouble,
        scope: AutofreeScope,
    ) : this(scope) {
        this.xx = xx
        this.xy = xy
        this.yx = yx
        this.yy = yy
        this.x0 = x0
        this.y0 = y0
    }

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first applying transformation
     * given by @new_matrix then applying the original transformation.
     *
     * @param newMatrix a `PangoMatrix`
     * @since 1.6
     */
    @PangoVersion1_6
    public fun concat(newMatrix: Matrix): Unit = pango_matrix_concat(pangoMatrixPointer, newMatrix.pangoMatrixPointer)

    /**
     * Copies a `PangoMatrix`.
     *
     * @return the newly allocated `PangoMatrix`
     * @since 1.6
     */
    @PangoVersion1_6
    public fun copy(): Matrix? = pango_matrix_copy(pangoMatrixPointer)?.run {
        Matrix(this)
    }

    /**
     * Free a `PangoMatrix`.
     *
     * @since 1.6
     */
    @PangoVersion1_6
    public fun free(): Unit = pango_matrix_free(pangoMatrixPointer)

    /**
     * Returns the scale factor of a matrix on the height of the font.
     *
     * That is, the scale factor in the direction perpendicular to the
     * vector that the X coordinate is mapped to.  If the scale in the X
     * coordinate is needed as well, use [method@Pango.Matrix.get_font_scale_factors].
     *
     * @return the scale factor of @matrix on the height of the font,
     *   or 1.0 if @matrix is null.
     * @since 1.12
     */
    @PangoVersion1_12
    public fun getFontScaleFactor(): gdouble = pango_matrix_get_font_scale_factor(pangoMatrixPointer)

    /**
     * Gets the slant ratio of a matrix.
     *
     * For a simple shear matrix in the form:
     *
     *     1 λ
     *     0 1
     *
     * this is simply λ.
     *
     * @return the slant ratio of @matrix
     * @since 1.50
     */
    @PangoVersion1_50
    public fun getSlantRatio(): gdouble = pango_matrix_get_slant_ratio(pangoMatrixPointer)

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first rotating by @degrees degrees
     * counter-clockwise then applying the original transformation.
     *
     * @param degrees degrees to rotate counter-clockwise
     * @since 1.6
     */
    @PangoVersion1_6
    public fun rotate(degrees: gdouble): Unit = pango_matrix_rotate(pangoMatrixPointer, degrees)

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first scaling by @sx in the X direction
     * and @sy in the Y direction then applying the original
     * transformation.
     *
     * @param scaleX amount to scale by in X direction
     * @param scaleY amount to scale by in Y direction
     * @since 1.6
     */
    @PangoVersion1_6
    public fun scale(scaleX: gdouble, scaleY: gdouble): Unit = pango_matrix_scale(pangoMatrixPointer, scaleX, scaleY)

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first translating by (@tx, @ty)
     * then applying the original transformation.
     *
     * @param tx amount to translate in the X direction
     * @param ty amount to translate in the Y direction
     * @since 1.6
     */
    @PangoVersion1_6
    public fun translate(tx: gdouble, ty: gdouble): Unit = pango_matrix_translate(pangoMatrixPointer, tx, ty)

    override fun toString(): String = "Matrix(xx=$xx, xy=$xy, yx=$yx, yy=$yy, x0=$x0, y0=$y0)"

    public companion object {
        /**
         * Get the GType of Matrix
         *
         * @return the GType
         */
        public fun getType(): GType = pango_matrix_get_type()
    }
}
