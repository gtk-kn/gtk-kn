// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_10
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_triangle_alloc
import org.gtkkn.native.graphene.graphene_triangle_contains_point
import org.gtkkn.native.graphene.graphene_triangle_equal
import org.gtkkn.native.graphene.graphene_triangle_free
import org.gtkkn.native.graphene.graphene_triangle_get_area
import org.gtkkn.native.graphene.graphene_triangle_get_barycoords
import org.gtkkn.native.graphene.graphene_triangle_get_bounding_box
import org.gtkkn.native.graphene.graphene_triangle_get_midpoint
import org.gtkkn.native.graphene.graphene_triangle_get_normal
import org.gtkkn.native.graphene.graphene_triangle_get_plane
import org.gtkkn.native.graphene.graphene_triangle_get_points
import org.gtkkn.native.graphene.graphene_triangle_get_type
import org.gtkkn.native.graphene.graphene_triangle_get_uv
import org.gtkkn.native.graphene.graphene_triangle_get_vertices
import org.gtkkn.native.graphene.graphene_triangle_init_from_point3d
import org.gtkkn.native.graphene.graphene_triangle_init_from_vec3
import org.gtkkn.native.graphene.graphene_triangle_t
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A triangle.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `a`: Array parameter of type gfloat is not supported
 *
 * @since 1.2
 */
@GrapheneVersion1_2
public class Triangle(public val grapheneTrianglePointer: CPointer<graphene_triangle_t>, cleaner: Cleaner? = null) :
    ProxyInstance(grapheneTrianglePointer) {
    /**
     * Allocate a new Triangle.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_triangle_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Triangle and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_triangle_t>, Cleaner>,
    ) : this(grapheneTrianglePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Triangle using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_triangle_t>().ptr)

    /**
     * Checks whether the given triangle @t contains the point @p.
     *
     * @param p a #graphene_point3d_t
     * @return `true` if the point is inside the triangle
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun containsPoint(p: Point3d): Boolean =
        graphene_triangle_contains_point(grapheneTrianglePointer, p.graphenePoint3dPointer)

    /**
     * Checks whether the two given #graphene_triangle_t are equal.
     *
     * @param b a #graphene_triangle_t
     * @return `true` if the triangles are equal
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(b: Triangle): Boolean = graphene_triangle_equal(grapheneTrianglePointer, b.grapheneTrianglePointer)

    /**
     * Frees the resources allocated by graphene_triangle_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_triangle_free(grapheneTrianglePointer)

    /**
     * Computes the area of the given #graphene_triangle_t.
     *
     * @return the area of the triangle
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getArea(): gfloat = graphene_triangle_get_area(grapheneTrianglePointer)

    /**
     * Computes the [barycentric coordinates](http://en.wikipedia.org/wiki/Barycentric_coordinate_system)
     * of the given point @p.
     *
     * The point @p must lie on the same plane as the triangle @t; if the
     * point is not coplanar, the result of this function is undefined.
     *
     * If we place the origin in the coordinates of the triangle's A point,
     * the barycentric coordinates are `u`, which is on the AC vector; and `v`
     * which is on the AB vector:
     *
     * ![](triangle-barycentric.png)
     *
     * The returned #graphene_vec2_t contains the following values, in order:
     *
     *  - `res.x = u`
     *  - `res.y = v`
     *
     * @param p a #graphene_point3d_t
     * @param res return location for the vector
     *   with the barycentric coordinates
     * @return `true` if the barycentric coordinates are valid
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getBarycoords(p: Point3d? = null, res: Vec2): Boolean =
        graphene_triangle_get_barycoords(grapheneTrianglePointer, p?.graphenePoint3dPointer, res.grapheneVec2Pointer)

    /**
     * Computes the bounding box of the given #graphene_triangle_t.
     *
     * @param res return location for the box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getBoundingBox(res: Box): Unit =
        graphene_triangle_get_bounding_box(grapheneTrianglePointer, res.grapheneBoxPointer)

    /**
     * Computes the coordinates of the midpoint of the given #graphene_triangle_t.
     *
     * The midpoint G is the [centroid](https://en.wikipedia.org/wiki/Centroid#Triangle_centroid)
     * of the triangle, i.e. the intersection of its medians.
     *
     * @param res return location for the coordinates of
     *   the midpoint
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getMidpoint(res: Point3d): Unit =
        graphene_triangle_get_midpoint(grapheneTrianglePointer, res.graphenePoint3dPointer)

    /**
     * Computes the normal vector of the given #graphene_triangle_t.
     *
     * @param res return location for the normal vector
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getNormal(res: Vec3): Unit =
        graphene_triangle_get_normal(grapheneTrianglePointer, res.grapheneVec3Pointer)

    /**
     * Computes the plane based on the vertices of the given #graphene_triangle_t.
     *
     * @param res return location for the plane
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getPlane(res: Plane): Unit =
        graphene_triangle_get_plane(grapheneTrianglePointer, res.graphenePlanePointer)

    /**
     * Retrieves the three vertices of the given #graphene_triangle_t and returns
     * their coordinates as #graphene_point3d_t.
     *
     * @param a return location for the coordinates
     *   of the first vertex
     * @param b return location for the coordinates
     *   of the second vertex
     * @param c return location for the coordinates
     *   of the third vertex
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getPoints(a: Point3d?, b: Point3d?, c: Point3d?): Unit = graphene_triangle_get_points(
        grapheneTrianglePointer,
        a?.graphenePoint3dPointer,
        b?.graphenePoint3dPointer,
        c?.graphenePoint3dPointer
    )

    /**
     * Computes the UV coordinates of the given point @p.
     *
     * The point @p must lie on the same plane as the triangle @t; if the point
     * is not coplanar, the result of this function is undefined. If @p is null,
     * the point will be set in (0, 0, 0).
     *
     * The UV coordinates will be placed in the @res vector:
     *
     *  - `res.x = u`
     *  - `res.y = v`
     *
     * See also: graphene_triangle_get_barycoords()
     *
     * @param p a #graphene_point3d_t
     * @param uvA the UV coordinates of the first point
     * @param uvB the UV coordinates of the second point
     * @param uvC the UV coordinates of the third point
     * @param res a vector containing the UV coordinates
     *   of the given point @p
     * @return `true` if the coordinates are valid
     * @since 1.10
     */
    @GrapheneVersion1_10
    public fun getUv(p: Point3d? = null, uvA: Vec2, uvB: Vec2, uvC: Vec2, res: Vec2): Boolean =
        graphene_triangle_get_uv(
            grapheneTrianglePointer,
            p?.graphenePoint3dPointer,
            uvA.grapheneVec2Pointer,
            uvB.grapheneVec2Pointer,
            uvC.grapheneVec2Pointer,
            res.grapheneVec2Pointer
        )

    /**
     * Retrieves the three vertices of the given #graphene_triangle_t.
     *
     * @param a return location for the first vertex
     * @param b return location for the second vertex
     * @param c return location for the third vertex
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getVertices(a: Vec3?, b: Vec3?, c: Vec3?): Unit = graphene_triangle_get_vertices(
        grapheneTrianglePointer,
        a?.grapheneVec3Pointer,
        b?.grapheneVec3Pointer,
        c?.grapheneVec3Pointer
    )

    /**
     * Initializes a #graphene_triangle_t using the three given 3D points.
     *
     * @param a a #graphene_point3d_t
     * @param b a #graphene_point3d_t
     * @param c a #graphene_point3d_t
     * @return the initialized #graphene_triangle_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromPoint3d(a: Point3d? = null, b: Point3d? = null, c: Point3d? = null): Triangle =
        graphene_triangle_init_from_point3d(
            grapheneTrianglePointer,
            a?.graphenePoint3dPointer,
            b?.graphenePoint3dPointer,
            c?.graphenePoint3dPointer
        )!!.run {
            Triangle(this)
        }

    /**
     * Initializes a #graphene_triangle_t using the three given vectors.
     *
     * @param a a #graphene_vec3_t
     * @param b a #graphene_vec3_t
     * @param c a #graphene_vec3_t
     * @return the initialized #graphene_triangle_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromVec3(a: Vec3? = null, b: Vec3? = null, c: Vec3? = null): Triangle =
        graphene_triangle_init_from_vec3(
            grapheneTrianglePointer,
            a?.grapheneVec3Pointer,
            b?.grapheneVec3Pointer,
            c?.grapheneVec3Pointer
        )!!.run {
            Triangle(this)
        }

    public companion object {
        /**
         * Allocates a new #graphene_triangle_t.
         *
         * The contents of the returned structure are undefined.
         *
         * @return the newly allocated #graphene_triangle_t
         *   structure. Use graphene_triangle_free() to free the resources
         *   allocated by this function
         * @since 1.2
         */
        public fun alloc(): Triangle = Triangle(graphene_triangle_alloc()!!)

        /**
         * Get the GType of Triangle
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_triangle_get_type()
    }
}
