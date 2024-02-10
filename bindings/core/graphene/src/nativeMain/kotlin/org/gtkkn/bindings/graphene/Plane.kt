// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_plane_alloc
import org.gtkkn.native.graphene.graphene_plane_distance
import org.gtkkn.native.graphene.graphene_plane_equal
import org.gtkkn.native.graphene.graphene_plane_free
import org.gtkkn.native.graphene.graphene_plane_get_constant
import org.gtkkn.native.graphene.graphene_plane_get_normal
import org.gtkkn.native.graphene.graphene_plane_init
import org.gtkkn.native.graphene.graphene_plane_init_from_plane
import org.gtkkn.native.graphene.graphene_plane_init_from_point
import org.gtkkn.native.graphene.graphene_plane_init_from_points
import org.gtkkn.native.graphene.graphene_plane_init_from_vec4
import org.gtkkn.native.graphene.graphene_plane_negate
import org.gtkkn.native.graphene.graphene_plane_normalize
import org.gtkkn.native.graphene.graphene_plane_t
import org.gtkkn.native.graphene.graphene_plane_transform
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit

/**
 * A 2D plane that extends infinitely in a 3D volume.
 *
 * The contents of the `graphene_plane_t` are private, and should not be
 * modified directly.
 *
 * ## Skipped during bindings generation
 *
 * - field `normal`: Record field normal is private
 * - field `constant`: Record field constant is private
 *
 * @since 1.2
 */
public class Plane(
    pointer: CPointer<graphene_plane_t>,
) : Record {
    public val graphenePlanePointer: CPointer<graphene_plane_t> = pointer

    /**
     * Computes the distance of @point from a #graphene_plane_t.
     *
     * @param point a #graphene_point3d_t
     * @return the distance of the given #graphene_point3d_t from the plane
     * @since 1.2
     */
    public fun distance(point: Point3D): Float =
        graphene_plane_distance(
            graphenePlanePointer.reinterpret(),
            point.graphenePoint3DPointer
        )

    /**
     * Checks whether the two given #graphene_plane_t are equal.
     *
     * @param b a #graphene_plane_t
     * @return `true` if the given planes are equal
     * @since 1.2
     */
    public fun equal(b: Plane): Boolean =
        graphene_plane_equal(
            graphenePlanePointer.reinterpret(),
            b.graphenePlanePointer
        )

    /**
     * Frees the resources allocated by graphene_plane_alloc().
     *
     * @since 1.2
     */
    public fun free(): Unit = graphene_plane_free(graphenePlanePointer.reinterpret())

    /**
     * Retrieves the distance along the normal vector of the
     * given #graphene_plane_t from the origin.
     *
     * @return the constant value of the plane
     * @since 1.2
     */
    public fun getConstant(): Float = graphene_plane_get_constant(graphenePlanePointer.reinterpret())

    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given #graphene_plane_t.
     *
     * @param normal return location for the normal vector
     * @since 1.2
     */
    public fun getNormal(normal: Vec3): Unit =
        graphene_plane_get_normal(
            graphenePlanePointer.reinterpret(),
            normal.grapheneVec3Pointer
        )

    /**
     * Initializes the given #graphene_plane_t using the given @normal vector
     * and @constant values.
     *
     * @param normal a unit length normal vector defining the plane
     *   pointing towards the origin; if unset, we use the X axis by default
     * @param constant the distance from the origin to the plane along the
     *   normal vector; the sign determines the half-space occupied by the
     *   plane
     * @return the initialized plane
     * @since 1.2
     */
    public fun `init`(
        normal: Vec3? = null,
        constant: Float,
    ): Plane =
        graphene_plane_init(
            graphenePlanePointer.reinterpret(),
            normal?.grapheneVec3Pointer,
            constant
        )!!.run {
            Plane(reinterpret())
        }

    /**
     * Initializes the given #graphene_plane_t using the normal
     * vector and constant of another #graphene_plane_t.
     *
     * @param src a #graphene_plane_t
     * @return the initialized plane
     * @since 1.2
     */
    public fun initFromPlane(src: Plane): Plane =
        graphene_plane_init_from_plane(
            graphenePlanePointer.reinterpret(),
            src.graphenePlanePointer
        )!!.run {
            Plane(reinterpret())
        }

    /**
     * Initializes the given #graphene_plane_t using the given normal vector
     * and an arbitrary co-planar point.
     *
     * @param normal a normal vector defining the plane pointing towards the origin
     * @param point a #graphene_point3d_t
     * @return the initialized plane
     * @since 1.2
     */
    public fun initFromPoint(
        normal: Vec3,
        point: Point3D,
    ): Plane =
        graphene_plane_init_from_point(
            graphenePlanePointer.reinterpret(),
            normal.grapheneVec3Pointer,
            point.graphenePoint3DPointer
        )!!.run {
            Plane(reinterpret())
        }

    /**
     * Initializes the given #graphene_plane_t using the 3 provided co-planar
     * points.
     *
     * The winding order is counter-clockwise, and determines which direction
     * the normal vector will point.
     *
     * @param a a #graphene_point3d_t
     * @param b a #graphene_point3d_t
     * @param c a #graphene_point3d_t
     * @return the initialized plane
     * @since 1.2
     */
    public fun initFromPoints(
        a: Point3D,
        b: Point3D,
        c: Point3D,
    ): Plane =
        graphene_plane_init_from_points(
            graphenePlanePointer.reinterpret(),
            a.graphenePoint3DPointer,
            b.graphenePoint3DPointer,
            c.graphenePoint3DPointer
        )!!.run {
            Plane(reinterpret())
        }

    /**
     * Initializes the given #graphene_plane_t using the components of
     * the given #graphene_vec4_t vector.
     *
     * @param src a #graphene_vec4_t containing the normal vector in its first
     *   three components, and the distance in its fourth component
     * @return the initialized plane
     * @since 1.2
     */
    public fun initFromVec4(src: Vec4): Plane =
        graphene_plane_init_from_vec4(
            graphenePlanePointer.reinterpret(),
            src.grapheneVec4Pointer
        )!!.run {
            Plane(reinterpret())
        }

    /**
     * Negates the normal vector and constant of a #graphene_plane_t, effectively
     * mirroring the plane across the origin.
     *
     * @param res return location for the negated plane
     * @since 1.2
     */
    public fun negate(res: Plane): Unit =
        graphene_plane_negate(
            graphenePlanePointer.reinterpret(),
            res.graphenePlanePointer
        )

    /**
     * Normalizes the vector of the given #graphene_plane_t,
     * and adjusts the constant accordingly.
     *
     * @param res return location for the normalized plane
     * @since 1.2
     */
    public fun normalize(res: Plane): Unit =
        graphene_plane_normalize(graphenePlanePointer.reinterpret(), res.graphenePlanePointer)

    /**
     * Transforms a #graphene_plane_t @p using the given @matrix
     * and @normal_matrix.
     *
     * If @normal_matrix is null, a transformation matrix for the plane
     * normal will be computed from @matrix. If you are transforming
     * multiple planes using the same @matrix it's recommended to compute
     * the normal matrix beforehand to avoid incurring in the cost of
     * recomputing it every time.
     *
     * @param matrix a #graphene_matrix_t
     * @param normalMatrix a #graphene_matrix_t
     * @param res the transformed plane
     * @since 1.10
     */
    public fun transform(
        matrix: Matrix,
        normalMatrix: Matrix? = null,
        res: Plane,
    ): Unit =
        graphene_plane_transform(
            graphenePlanePointer.reinterpret(),
            matrix.grapheneMatrixPointer,
            normalMatrix?.grapheneMatrixPointer,
            res.graphenePlanePointer
        )

    public companion object : RecordCompanion<Plane, graphene_plane_t> {
        /**
         * Allocates a new #graphene_plane_t structure.
         *
         * The contents of the returned structure are undefined.
         *
         * @return the newly allocated #graphene_plane_t.
         *   Use graphene_plane_free() to free the resources allocated by
         *   this function
         * @since 1.2
         */
        public fun alloc(): Plane = Plane(graphene_plane_alloc()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Plane = Plane(pointer.reinterpret())
    }
}
