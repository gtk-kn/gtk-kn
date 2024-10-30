// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoMatrix
import org.gtkkn.native.pango.pango_matrix_concat
import org.gtkkn.native.pango.pango_matrix_copy
import org.gtkkn.native.pango.pango_matrix_free
import org.gtkkn.native.pango.pango_matrix_get_font_scale_factor
import org.gtkkn.native.pango.pango_matrix_get_slant_ratio
import org.gtkkn.native.pango.pango_matrix_rotate
import org.gtkkn.native.pango.pango_matrix_scale
import org.gtkkn.native.pango.pango_matrix_translate
import kotlin.Double
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
public class Matrix(
    pointer: CPointer<PangoMatrix>,
) : Record {
    public val pangoMatrixPointer: CPointer<PangoMatrix> = pointer

    /**
     * 1st component of the transformation matrix
     */
    public var xx: Double
        get() = pangoMatrixPointer.pointed.xx
        set(`value`) {
            pangoMatrixPointer.pointed.xx = value
        }

    /**
     * 2nd component of the transformation matrix
     */
    public var xy: Double
        get() = pangoMatrixPointer.pointed.xy
        set(`value`) {
            pangoMatrixPointer.pointed.xy = value
        }

    /**
     * 3rd component of the transformation matrix
     */
    public var yx: Double
        get() = pangoMatrixPointer.pointed.yx
        set(`value`) {
            pangoMatrixPointer.pointed.yx = value
        }

    /**
     * 4th component of the transformation matrix
     */
    public var yy: Double
        get() = pangoMatrixPointer.pointed.yy
        set(`value`) {
            pangoMatrixPointer.pointed.yy = value
        }

    /**
     * x translation
     */
    public var x0: Double
        get() = pangoMatrixPointer.pointed.x0
        set(`value`) {
            pangoMatrixPointer.pointed.x0 = value
        }

    /**
     * y translation
     */
    public var y0: Double
        get() = pangoMatrixPointer.pointed.y0
        set(`value`) {
            pangoMatrixPointer.pointed.y0 = value
        }

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first applying transformation
     * given by @new_matrix then applying the original transformation.
     *
     * @param newMatrix a `PangoMatrix`
     * @since 1.6
     */
    public fun concat(newMatrix: Matrix): Unit =
        pango_matrix_concat(pangoMatrixPointer.reinterpret(), newMatrix.pangoMatrixPointer)

    /**
     * Copies a `PangoMatrix`.
     *
     * @return the newly allocated `PangoMatrix`
     * @since 1.6
     */
    public fun copy(): Matrix? =
        pango_matrix_copy(pangoMatrixPointer.reinterpret())?.run {
            Matrix(reinterpret())
        }

    /**
     * Free a `PangoMatrix`.
     *
     * @since 1.6
     */
    public fun free(): Unit = pango_matrix_free(pangoMatrixPointer.reinterpret())

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
    public fun getFontScaleFactor(): Double = pango_matrix_get_font_scale_factor(pangoMatrixPointer.reinterpret())

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
    public fun getSlantRatio(): Double = pango_matrix_get_slant_ratio(pangoMatrixPointer.reinterpret())

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first rotating by @degrees degrees
     * counter-clockwise then applying the original transformation.
     *
     * @param degrees degrees to rotate counter-clockwise
     * @since 1.6
     */
    public fun rotate(degrees: Double): Unit = pango_matrix_rotate(pangoMatrixPointer.reinterpret(), degrees)

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
    public fun scale(
        scaleX: Double,
        scaleY: Double,
    ): Unit = pango_matrix_scale(pangoMatrixPointer.reinterpret(), scaleX, scaleY)

    /**
     * Changes the transformation represented by @matrix to be the
     * transformation given by first translating by (@tx, @ty)
     * then applying the original transformation.
     *
     * @param tx amount to translate in the X direction
     * @param ty amount to translate in the Y direction
     * @since 1.6
     */
    public fun translate(
        tx: Double,
        ty: Double,
    ): Unit = pango_matrix_translate(pangoMatrixPointer.reinterpret(), tx, ty)

    public companion object : RecordCompanion<Matrix, PangoMatrix> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Matrix = Matrix(pointer.reinterpret())
    }
}
