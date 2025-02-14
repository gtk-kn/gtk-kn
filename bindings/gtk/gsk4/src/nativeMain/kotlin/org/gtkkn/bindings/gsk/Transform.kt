// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.graphene.Matrix
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Point3d
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.graphene.Vec3
import org.gtkkn.bindings.gsk.annotations.GskVersion4_6
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskTransform
import org.gtkkn.native.gsk.gsk_transform_equal
import org.gtkkn.native.gsk.gsk_transform_get_category
import org.gtkkn.native.gsk.gsk_transform_get_type
import org.gtkkn.native.gsk.gsk_transform_invert
import org.gtkkn.native.gsk.gsk_transform_matrix
import org.gtkkn.native.gsk.gsk_transform_new
import org.gtkkn.native.gsk.gsk_transform_perspective
import org.gtkkn.native.gsk.gsk_transform_print
import org.gtkkn.native.gsk.gsk_transform_ref
import org.gtkkn.native.gsk.gsk_transform_rotate
import org.gtkkn.native.gsk.gsk_transform_rotate_3d
import org.gtkkn.native.gsk.gsk_transform_scale
import org.gtkkn.native.gsk.gsk_transform_scale_3d
import org.gtkkn.native.gsk.gsk_transform_skew
import org.gtkkn.native.gsk.gsk_transform_to_matrix
import org.gtkkn.native.gsk.gsk_transform_to_string
import org.gtkkn.native.gsk.gsk_transform_transform
import org.gtkkn.native.gsk.gsk_transform_transform_bounds
import org.gtkkn.native.gsk.gsk_transform_transform_point
import org.gtkkn.native.gsk.gsk_transform_translate
import org.gtkkn.native.gsk.gsk_transform_translate_3d
import org.gtkkn.native.gsk.gsk_transform_unref
import kotlin.Boolean
import kotlin.Unit
import kotlin.String as KotlinString
import org.gtkkn.bindings.glib.String as GlibString

/**
 * `GskTransform` is an object to describe transform matrices.
 *
 * Unlike `graphene_matrix_t`, `GskTransform` retains the steps in how
 * a transform was constructed, and allows inspecting them. It is modeled
 * after the way CSS describes transforms.
 *
 * `GskTransform` objects are immutable and cannot be changed after creation.
 * This means code can safely expose them as properties of objects without
 * having to worry about others changing them.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_xx`: out_xx: Out parameter is not supported
 * - parameter `out_skew_x`: out_skew_x: Out parameter is not supported
 * - parameter `out_scale_x`: out_scale_x: Out parameter is not supported
 * - parameter `out_dx`: out_dx: Out parameter is not supported
 * - parameter `out_transform`: out_transform: Out parameter is not supported
 */
public class Transform(public val gskTransformPointer: CPointer<GskTransform>) : ProxyInstance(gskTransformPointer) {
    /**
     * Creates a new identity transform.
     *
     * This function is meant to be used by language
     * bindings. For C code, this is equivalent to using null.
     *
     * @return A new identity transform
     */
    public constructor() : this(gsk_transform_new()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks two transforms for equality.
     *
     * @param second the second transform
     * @return true if the two transforms perform the same operation
     */
    public fun equal(second: Transform? = null): Boolean =
        gsk_transform_equal(gskTransformPointer, second?.gskTransformPointer).asBoolean()

    /**
     * Returns the category this transform belongs to.
     *
     * @return The category of the transform
     */
    public fun getCategory(): TransformCategory = gsk_transform_get_category(gskTransformPointer).run {
        TransformCategory.fromNativeValue(this)
    }

    /**
     * Inverts the given transform.
     *
     * If @self is not invertible, null is returned.
     * Note that inverting null also returns null, which is
     * the correct inverse of null. If you need to differentiate
     * between those cases, you should check @self is not null
     * before calling this function.
     *
     * This function consumes @self. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @return The inverted transform
     */
    public fun invert(): Transform? = gsk_transform_invert(gskTransformPointer)?.run {
        Transform(this)
    }

    /**
     * Multiplies @next with the given @matrix.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param matrix the matrix to multiply @next with
     * @return The new transform
     */
    public fun matrix(matrix: Matrix): Transform =
        gsk_transform_matrix(gskTransformPointer, matrix.grapheneMatrixPointer)!!.run {
            Transform(this)
        }

    /**
     * Applies a perspective projection transform.
     *
     * This transform scales points in X and Y based on their Z value,
     * scaling points with positive Z values away from the origin, and
     * those with negative Z values towards the origin. Points
     * on the z=0 plane are unchanged.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param depth distance of the z=0 plane. Lower values give a more
     *   flattened pyramid and therefore a more pronounced
     *   perspective effect.
     * @return The new transform
     */
    public fun perspective(depth: gfloat): Transform = gsk_transform_perspective(gskTransformPointer, depth)!!.run {
        Transform(this)
    }

    /**
     * Converts @self into a human-readable string representation suitable
     * for printing.
     *
     * The result of this function can later be parsed with
     * [func@Gsk.Transform.parse].
     *
     * @param string The string to print into
     */
    public fun print(string: GlibString): Unit = gsk_transform_print(gskTransformPointer, string.glibStringPointer)

    /**
     * Acquires a reference on the given `GskTransform`.
     *
     * @return the `GskTransform` with an additional reference
     */
    public fun ref(): Transform? = gsk_transform_ref(gskTransformPointer)?.run {
        Transform(this)
    }

    /**
     * Rotates @next @angle degrees in 2D - or in 3D-speak, around the Z axis.
     * The rotation happens around the origin point of (0, 0).
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param angle the rotation angle, in degrees (clockwise)
     * @return The new transform
     */
    public fun rotate(angle: gfloat): Transform? = gsk_transform_rotate(gskTransformPointer, angle)?.run {
        Transform(this)
    }

    /**
     * Rotates @next @angle degrees around @axis.
     *
     * For a rotation in 2D space, use [method@Gsk.Transform.rotate]
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param angle the rotation angle, in degrees (clockwise)
     * @param axis The rotation axis
     * @return The new transform
     */
    public fun rotate3d(angle: gfloat, axis: Vec3): Transform? =
        gsk_transform_rotate_3d(gskTransformPointer, angle, axis.grapheneVec3Pointer)?.run {
            Transform(this)
        }

    /**
     * Scales @next in 2-dimensional space by the given factors.
     *
     * Use [method@Gsk.Transform.scale_3d] to scale in all 3 dimensions.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @return The new transform
     */
    public fun scale(factorX: gfloat, factorY: gfloat): Transform? =
        gsk_transform_scale(gskTransformPointer, factorX, factorY)?.run {
            Transform(this)
        }

    /**
     * Scales @next by the given factors.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @param factorZ scaling factor on the Z axis
     * @return The new transform
     */
    public fun scale3d(factorX: gfloat, factorY: gfloat, factorZ: gfloat): Transform? =
        gsk_transform_scale_3d(gskTransformPointer, factorX, factorY, factorZ)?.run {
            Transform(this)
        }

    /**
     * Applies a skew transform.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param skewX skew factor, in degrees, on the X axis
     * @param skewY skew factor, in degrees, on the Y axis
     * @return The new transform
     * @since 4.6
     */
    @GskVersion4_6
    public fun skew(skewX: gfloat, skewY: gfloat): Transform? =
        gsk_transform_skew(gskTransformPointer, skewX, skewY)?.run {
            Transform(this)
        }

    /**
     * Computes the actual value of @self and stores it in @out_matrix.
     *
     * The previous value of @out_matrix will be ignored.
     *
     * @param outMatrix The matrix to set
     */
    public fun toMatrix(outMatrix: Matrix): Unit =
        gsk_transform_to_matrix(gskTransformPointer, outMatrix.grapheneMatrixPointer)

    /**
     * Converts a matrix into a string that is suitable for printing.
     *
     * The resulting string can be parsed with [func@Gsk.Transform.parse].
     *
     * This is a wrapper around [method@Gsk.Transform.print].
     *
     * @return A new string for @self
     */
    override fun toString(): KotlinString =
        gsk_transform_to_string(gskTransformPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Applies all the operations from @other to @next.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param other Transform to apply
     * @return The new transform
     */
    public fun transform(other: Transform? = null): Transform? =
        gsk_transform_transform(gskTransformPointer, other?.gskTransformPointer)?.run {
            Transform(this)
        }

    /**
     * Transforms a `graphene_rect_t` using the given transform @self.
     *
     * The result is the bounding box containing the coplanar quad.
     *
     * @param rect a `graphene_rect_t`
     * @param outRect return location for the bounds
     *   of the transformed rectangle
     */
    public fun transformBounds(rect: Rect, outRect: Rect): Unit =
        gsk_transform_transform_bounds(gskTransformPointer, rect.grapheneRectPointer, outRect.grapheneRectPointer)

    /**
     * Transforms a `graphene_point_t` using the given transform @self.
     *
     * @param point a `graphene_point_t`
     * @param outPoint return location for
     *   the transformed point
     */
    public fun transformPoint(point: Point, outPoint: Point): Unit =
        gsk_transform_transform_point(gskTransformPointer, point.graphenePointPointer, outPoint.graphenePointPointer)

    /**
     * Translates @next in 2-dimensional space by @point.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param point the point to translate the transform by
     * @return The new transform
     */
    public fun translate(point: Point): Transform? =
        gsk_transform_translate(gskTransformPointer, point.graphenePointPointer)?.run {
            Transform(this)
        }

    /**
     * Translates @next by @point.
     *
     * This function consumes @next. Use [method@Gsk.Transform.ref] first
     * if you want to keep it around.
     *
     * @param point the point to translate the transform by
     * @return The new transform
     */
    public fun translate3d(point: Point3d): Transform? =
        gsk_transform_translate_3d(gskTransformPointer, point.graphenePoint3dPointer)?.run {
            Transform(this)
        }

    /**
     * Releases a reference on the given `GskTransform`.
     *
     * If the reference was the last, the resources associated to the @self are
     * freed.
     */
    public fun unref(): Unit = gsk_transform_unref(gskTransformPointer)

    public companion object {
        /**
         * Get the GType of Transform
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_transform_get_type()
    }
}
