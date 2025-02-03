// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_plane_alloc
import org.gtkkn.native.graphene.graphene_plane_distance
import org.gtkkn.native.graphene.graphene_plane_equal
import org.gtkkn.native.graphene.graphene_plane_free
import org.gtkkn.native.graphene.graphene_plane_get_constant
import org.gtkkn.native.graphene.graphene_plane_get_normal
import org.gtkkn.native.graphene.graphene_plane_get_type
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
import kotlin.Unit

/**
 * A 2D plane that extends infinitely in a 3D volume.
 *
 * The contents of the `graphene_plane_t` are private, and should not be
 * modified directly.
 * @since 1.2
 */
@GrapheneVersion1_2
public class Plane(public val graphenePlanePointer: CPointer<graphene_plane_t>) : ProxyInstance(graphenePlanePointer) {
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
    public constructor() : this(graphene_plane_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Computes the distance of @point from a #graphene_plane_t.
     *
     * @param point a #graphene_point3d_t
     * @return the distance of the given #graphene_point3d_t from the plane
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun distance(point: Point3d): gfloat =
        graphene_plane_distance(graphenePlanePointer, point.graphenePoint3dPointer)

    /**
     * Checks whether the two given #graphene_plane_t are equal.
     *
     * @param b a #graphene_plane_t
     * @return `true` if the given planes are equal
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(b: Plane): Boolean = graphene_plane_equal(graphenePlanePointer, b.graphenePlanePointer)

    /**
     * Frees the resources allocated by graphene_plane_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_plane_free(graphenePlanePointer)

    /**
     * Retrieves the distance along the normal vector of the
     * given #graphene_plane_t from the origin.
     *
     * @return the constant value of the plane
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getConstant(): gfloat = graphene_plane_get_constant(graphenePlanePointer)

    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given #graphene_plane_t.
     *
     * @param normal return location for the normal vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getNormal(normal: Vec3): Unit =
        graphene_plane_get_normal(graphenePlanePointer, normal.grapheneVec3Pointer)

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
    @GrapheneVersion1_2
    public fun `init`(normal: Vec3? = null, constant: gfloat): Plane =
        graphene_plane_init(graphenePlanePointer, normal?.grapheneVec3Pointer, constant)!!.run {
            Plane(this)
        }

    /**
     * Initializes the given #graphene_plane_t using the normal
     * vector and constant of another #graphene_plane_t.
     *
     * @param src a #graphene_plane_t
     * @return the initialized plane
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromPlane(src: Plane): Plane =
        graphene_plane_init_from_plane(graphenePlanePointer, src.graphenePlanePointer)!!.run {
            Plane(this)
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
    @GrapheneVersion1_2
    public fun initFromPoint(normal: Vec3, point: Point3d): Plane = graphene_plane_init_from_point(
        graphenePlanePointer,
        normal.grapheneVec3Pointer,
        point.graphenePoint3dPointer
    )!!.run {
        Plane(this)
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
    @GrapheneVersion1_2
    public fun initFromPoints(a: Point3d, b: Point3d, c: Point3d): Plane = graphene_plane_init_from_points(
        graphenePlanePointer,
        a.graphenePoint3dPointer,
        b.graphenePoint3dPointer,
        c.graphenePoint3dPointer
    )!!.run {
        Plane(this)
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
    @GrapheneVersion1_2
    public fun initFromVec4(src: Vec4): Plane =
        graphene_plane_init_from_vec4(graphenePlanePointer, src.grapheneVec4Pointer)!!.run {
            Plane(this)
        }

    /**
     * Negates the normal vector and constant of a #graphene_plane_t, effectively
     * mirroring the plane across the origin.
     *
     * @param res return location for the negated plane
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun negate(res: Plane): Unit = graphene_plane_negate(graphenePlanePointer, res.graphenePlanePointer)

    /**
     * Normalizes the vector of the given #graphene_plane_t,
     * and adjusts the constant accordingly.
     *
     * @param res return location for the normalized plane
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun normalize(res: Plane): Unit = graphene_plane_normalize(graphenePlanePointer, res.graphenePlanePointer)

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
    @GrapheneVersion1_10
    public fun transform(matrix: Matrix, normalMatrix: Matrix? = null, res: Plane): Unit = graphene_plane_transform(
        graphenePlanePointer,
        matrix.grapheneMatrixPointer,
        normalMatrix?.grapheneMatrixPointer,
        res.graphenePlanePointer
    )

    public companion object {
        /**
         * Get the GType of Plane
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_plane_get_type()
    }
}
