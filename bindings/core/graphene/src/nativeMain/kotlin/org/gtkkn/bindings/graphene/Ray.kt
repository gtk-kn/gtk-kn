// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_4
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_ray_alloc
import org.gtkkn.native.graphene.graphene_ray_equal
import org.gtkkn.native.graphene.graphene_ray_free
import org.gtkkn.native.graphene.graphene_ray_get_closest_point_to_point
import org.gtkkn.native.graphene.graphene_ray_get_direction
import org.gtkkn.native.graphene.graphene_ray_get_distance_to_plane
import org.gtkkn.native.graphene.graphene_ray_get_distance_to_point
import org.gtkkn.native.graphene.graphene_ray_get_origin
import org.gtkkn.native.graphene.graphene_ray_get_position_at
import org.gtkkn.native.graphene.graphene_ray_get_type
import org.gtkkn.native.graphene.graphene_ray_init
import org.gtkkn.native.graphene.graphene_ray_init_from_ray
import org.gtkkn.native.graphene.graphene_ray_init_from_vec3
import org.gtkkn.native.graphene.graphene_ray_intersects_box
import org.gtkkn.native.graphene.graphene_ray_intersects_sphere
import org.gtkkn.native.graphene.graphene_ray_intersects_triangle
import org.gtkkn.native.graphene.graphene_ray_t
import kotlin.Boolean
import kotlin.Unit

/**
 * A ray emitted from an origin in a given direction.
 *
 * The contents of the `graphene_ray_t` structure are private, and should not
 * be modified directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `t_out`: t_out: Out parameter is not supported
 * - parameter `t_out`: t_out: Out parameter is not supported
 * - parameter `t_out`: t_out: Out parameter is not supported
 *
 * @since 1.4
 */
@GrapheneVersion1_4
public class Ray(public val grapheneRayPointer: CPointer<graphene_ray_t>) : ProxyInstance(grapheneRayPointer) {
    /**
     * Allocates a new #graphene_ray_t structure.
     *
     * The contents of the returned structure are undefined.
     *
     * @return the newly allocated #graphene_ray_t.
     *   Use graphene_ray_free() to free the resources allocated by
     *   this function
     * @since 1.4
     */
    public constructor() : this(graphene_ray_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks whether the two given #graphene_ray_t are equal.
     *
     * @param b a #graphene_ray_t
     * @return `true` if the given rays are equal
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun equal(b: Ray): Boolean = graphene_ray_equal(grapheneRayPointer, b.grapheneRayPointer)

    /**
     * Frees the resources allocated by graphene_ray_alloc().
     *
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun free(): Unit = graphene_ray_free(grapheneRayPointer)

    /**
     * Computes the point on the given #graphene_ray_t that is closest to the
     * given point @p.
     *
     * @param p a #graphene_point3d_t
     * @param res return location for the closest point3d
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun getClosestPointToPoint(p: Point3d, res: Point3d): Unit = graphene_ray_get_closest_point_to_point(
        grapheneRayPointer,
        p.graphenePoint3dPointer,
        res.graphenePoint3dPointer
    )

    /**
     * Retrieves the direction of the given #graphene_ray_t.
     *
     * @param direction return location for the direction
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun getDirection(direction: Vec3): Unit =
        graphene_ray_get_direction(grapheneRayPointer, direction.grapheneVec3Pointer)

    /**
     * Computes the distance of the origin of the given #graphene_ray_t from the
     * given plane.
     *
     * If the ray does not intersect the plane, this function returns `INFINITY`.
     *
     * @param p a #graphene_plane_t
     * @return the distance of the origin of the ray from the plane
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun getDistanceToPlane(p: Plane): gfloat =
        graphene_ray_get_distance_to_plane(grapheneRayPointer, p.graphenePlanePointer)

    /**
     * Computes the distance of the closest approach between the
     * given #graphene_ray_t @r and the point @p.
     *
     * The closest approach to a ray from a point is the distance
     * between the point and the projection of the point on the
     * ray itself.
     *
     * @param p a #graphene_point3d_t
     * @return the distance of the point
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun getDistanceToPoint(p: Point3d): gfloat =
        graphene_ray_get_distance_to_point(grapheneRayPointer, p.graphenePoint3dPointer)

    /**
     * Retrieves the origin of the given #graphene_ray_t.
     *
     * @param origin return location for the origin
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun getOrigin(origin: Point3d): Unit =
        graphene_ray_get_origin(grapheneRayPointer, origin.graphenePoint3dPointer)

    /**
     * Retrieves the coordinates of a point at the distance @t along the
     * given #graphene_ray_t.
     *
     * @param t the distance along the ray
     * @param position return location for the position
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun getPositionAt(t: gfloat, position: Point3d): Unit =
        graphene_ray_get_position_at(grapheneRayPointer, t, position.graphenePoint3dPointer)

    /**
     * Initializes the given #graphene_ray_t using the given @origin
     * and @direction values.
     *
     * @param origin the origin of the ray
     * @param direction the direction vector
     * @return the initialized ray
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun `init`(origin: Point3d? = null, direction: Vec3? = null): Ray =
        graphene_ray_init(grapheneRayPointer, origin?.graphenePoint3dPointer, direction?.grapheneVec3Pointer)!!.run {
            Ray(this)
        }

    /**
     * Initializes the given #graphene_ray_t using the origin and direction
     * values of another #graphene_ray_t.
     *
     * @param src a #graphene_ray_t
     * @return the initialized ray
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun initFromRay(src: Ray): Ray =
        graphene_ray_init_from_ray(grapheneRayPointer, src.grapheneRayPointer)!!.run {
            Ray(this)
        }

    /**
     * Initializes the given #graphene_ray_t using the given vectors.
     *
     * @param origin a #graphene_vec3_t
     * @param direction a #graphene_vec3_t
     * @return the initialized ray
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun initFromVec3(origin: Vec3? = null, direction: Vec3? = null): Ray = graphene_ray_init_from_vec3(
        grapheneRayPointer,
        origin?.grapheneVec3Pointer,
        direction?.grapheneVec3Pointer
    )!!.run {
        Ray(this)
    }

    /**
     * Checks whether the given #graphene_ray_t @r intersects the
     * given #graphene_box_t @b.
     *
     * See also: graphene_ray_intersect_box()
     *
     * @param b a #graphene_box_t
     * @return `true` if the ray intersects the box
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun intersectsBox(b: Box): Boolean = graphene_ray_intersects_box(grapheneRayPointer, b.grapheneBoxPointer)

    /**
     * Checks if the given #graphene_ray_t @r intersects the
     * given #graphene_sphere_t @s.
     *
     * See also: graphene_ray_intersect_sphere()
     *
     * @param s a #graphene_sphere_t
     * @return `true` if the ray intersects the sphere
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun intersectsSphere(s: Sphere): Boolean =
        graphene_ray_intersects_sphere(grapheneRayPointer, s.grapheneSpherePointer)

    /**
     * Checks whether the given #graphene_ray_t @r intersects the
     * given #graphene_triangle_t @b.
     *
     * See also: graphene_ray_intersect_triangle()
     *
     * @param t a #graphene_triangle_t
     * @return `true` if the ray intersects the triangle
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun intersectsTriangle(t: Triangle): Boolean =
        graphene_ray_intersects_triangle(grapheneRayPointer, t.grapheneTrianglePointer)

    public companion object {
        /**
         * Get the GType of Ray
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_ray_get_type()
    }
}
