// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_4
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_point3d_alloc
import org.gtkkn.native.graphene.graphene_point3d_cross
import org.gtkkn.native.graphene.graphene_point3d_distance
import org.gtkkn.native.graphene.graphene_point3d_dot
import org.gtkkn.native.graphene.graphene_point3d_equal
import org.gtkkn.native.graphene.graphene_point3d_free
import org.gtkkn.native.graphene.graphene_point3d_init
import org.gtkkn.native.graphene.graphene_point3d_init_from_point
import org.gtkkn.native.graphene.graphene_point3d_init_from_vec3
import org.gtkkn.native.graphene.graphene_point3d_interpolate
import org.gtkkn.native.graphene.graphene_point3d_length
import org.gtkkn.native.graphene.graphene_point3d_near
import org.gtkkn.native.graphene.graphene_point3d_normalize
import org.gtkkn.native.graphene.graphene_point3d_normalize_viewport
import org.gtkkn.native.graphene.graphene_point3d_scale
import org.gtkkn.native.graphene.graphene_point3d_t
import org.gtkkn.native.graphene.graphene_point3d_to_vec3
import org.gtkkn.native.graphene.graphene_point3d_zero
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Unit

/**
 * A point with three components: X, Y, and Z.
 * @since 1.0
 */
@GrapheneVersion1_0
public class Point3D(
    pointer: CPointer<graphene_point3d_t>,
) : Record {
    public val graphenePoint3DPointer: CPointer<graphene_point3d_t> = pointer

    /**
     * the X coordinate
     */
    public var x: Float
        get() = graphenePoint3DPointer.pointed.x
        set(`value`) {
            graphenePoint3DPointer.pointed.x = value
        }

    /**
     * the Y coordinate
     */
    public var y: Float
        get() = graphenePoint3DPointer.pointed.y
        set(`value`) {
            graphenePoint3DPointer.pointed.y = value
        }

    /**
     * the Z coordinate
     */
    public var z: Float
        get() = graphenePoint3DPointer.pointed.z
        set(`value`) {
            graphenePoint3DPointer.pointed.z = value
        }

    /**
     * Computes the cross product of the two given #graphene_point3d_t.
     *
     * @param b a #graphene_point3d_t
     * @param res return location for the cross
     *   product
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun cross(
        b: Point3D,
        res: Point3D,
    ): Unit =
        graphene_point3d_cross(
            graphenePoint3DPointer.reinterpret(),
            b.graphenePoint3DPointer,
            res.graphenePoint3DPointer
        )

    /**
     * Computes the distance between the two given #graphene_point3d_t.
     *
     * @param b a #graphene_point3d_t
     * @param delta return location for the distance
     *   components on the X, Y, and Z axis
     * @return the distance between two points
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun distance(
        b: Point3D,
        delta: Vec3?,
    ): Float =
        graphene_point3d_distance(
            graphenePoint3DPointer.reinterpret(),
            b.graphenePoint3DPointer,
            delta?.grapheneVec3Pointer
        )

    /**
     * Computes the dot product of the two given #graphene_point3d_t.
     *
     * @param b a #graphene_point3d_t
     * @return the value of the dot product
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun dot(b: Point3D): Float =
        graphene_point3d_dot(graphenePoint3DPointer.reinterpret(), b.graphenePoint3DPointer)

    /**
     * Checks whether two given points are equal.
     *
     * @param b a #graphene_point3d_t
     * @return `true` if the points are equal
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun equal(b: Point3D): Boolean =
        graphene_point3d_equal(graphenePoint3DPointer.reinterpret(), b.graphenePoint3DPointer)

    /**
     * Frees the resources allocated via graphene_point3d_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_point3d_free(graphenePoint3DPointer.reinterpret())

    /**
     * Initializes a #graphene_point3d_t with the given coordinates.
     *
     * @param x the X coordinate of the point
     * @param y the Y coordinate of the point
     * @param z the Z coordinate of the point
     * @return the initialized #graphene_point3d_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(
        x: Float,
        y: Float,
        z: Float,
    ): Point3D =
        graphene_point3d_init(graphenePoint3DPointer.reinterpret(), x, y, z)!!.run {
            Point3D(reinterpret())
        }

    /**
     * Initializes a #graphene_point3d_t using the coordinates of
     * another #graphene_point3d_t.
     *
     * @param src a #graphene_point3d_t
     * @return the initialized point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromPoint(src: Point3D): Point3D =
        graphene_point3d_init_from_point(graphenePoint3DPointer.reinterpret(), src.graphenePoint3DPointer)!!.run {
            Point3D(reinterpret())
        }

    /**
     * Initializes a #graphene_point3d_t using the components
     * of a #graphene_vec3_t.
     *
     * @param v a #graphene_vec3_t
     * @return the initialized #graphene_point3d_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromVec3(v: Vec3): Point3D =
        graphene_point3d_init_from_vec3(graphenePoint3DPointer.reinterpret(), v.grapheneVec3Pointer)!!.run {
            Point3D(reinterpret())
        }

    /**
     * Linearly interpolates each component of @a and @b using the
     * provided @factor, and places the result in @res.
     *
     * @param b a #graphene_point3d_t
     * @param factor the interpolation factor
     * @param res the return location for the
     *   interpolated #graphene_point3d_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun interpolate(
        b: Point3D,
        factor: Double,
        res: Point3D,
    ): Unit =
        graphene_point3d_interpolate(
            graphenePoint3DPointer.reinterpret(),
            b.graphenePoint3DPointer,
            factor,
            res.graphenePoint3DPointer
        )

    /**
     * Computes the length of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     *
     * @return the length of the vector represented by the point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun length(): Float = graphene_point3d_length(graphenePoint3DPointer.reinterpret())

    /**
     * Checks whether the two points are near each other, within
     * an @epsilon factor.
     *
     * @param b a #graphene_point3d_t
     * @param epsilon fuzzyness factor
     * @return `true` if the points are near each other
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun near(
        b: Point3D,
        epsilon: Float,
    ): Boolean = graphene_point3d_near(graphenePoint3DPointer.reinterpret(), b.graphenePoint3DPointer, epsilon)

    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     *
     * @param res return location for the normalized
     *   #graphene_point3d_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Point3D): Unit =
        graphene_point3d_normalize(graphenePoint3DPointer.reinterpret(), res.graphenePoint3DPointer)

    /**
     * Normalizes the coordinates of a #graphene_point3d_t using the
     * given viewport and clipping planes.
     *
     * The coordinates of the resulting #graphene_point3d_t will be
     * in the [ -1, 1 ] range.
     *
     * @param viewport a #graphene_rect_t representing a viewport
     * @param zNear the coordinate of the near clipping plane, or 0 for
     *   the default near clipping plane
     * @param zFar the coordinate of the far clipping plane, or 1 for the
     *   default far clipping plane
     * @param res the return location for the
     *   normalized #graphene_point3d_t
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun normalizeViewport(
        viewport: Rect,
        zNear: Float,
        zFar: Float,
        res: Point3D,
    ): Unit =
        graphene_point3d_normalize_viewport(
            graphenePoint3DPointer.reinterpret(),
            viewport.grapheneRectPointer,
            zNear,
            zFar,
            res.graphenePoint3DPointer
        )

    /**
     * Scales the coordinates of the given #graphene_point3d_t by
     * the given @factor.
     *
     * @param factor the scaling factor
     * @param res return location for the scaled point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun scale(
        factor: Float,
        res: Point3D,
    ): Unit = graphene_point3d_scale(graphenePoint3DPointer.reinterpret(), factor, res.graphenePoint3DPointer)

    /**
     * Stores the coordinates of a #graphene_point3d_t into a
     * #graphene_vec3_t.
     *
     * @param v return location for a #graphene_vec3_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun toVec3(v: Vec3): Unit =
        graphene_point3d_to_vec3(graphenePoint3DPointer.reinterpret(), v.grapheneVec3Pointer)

    public companion object : RecordCompanion<Point3D, graphene_point3d_t> {
        /**
         * Allocates a #graphene_point3d_t structure.
         *
         * @return the newly allocated structure.
         *   Use graphene_point3d_free() to free the resources
         *   allocated by this function.
         * @since 1.0
         */
        public fun alloc(): Point3D = Point3D(graphene_point3d_alloc()!!.reinterpret())

        /**
         * Retrieves a constant point with all three coordinates set to 0.
         *
         * @return a zero point
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Point3D =
            graphene_point3d_zero()!!.run {
                Point3D(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Point3D = Point3D(pointer.reinterpret())
    }
}
