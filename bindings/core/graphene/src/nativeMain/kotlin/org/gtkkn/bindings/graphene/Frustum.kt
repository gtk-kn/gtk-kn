// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_6
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_frustum_alloc
import org.gtkkn.native.graphene.graphene_frustum_contains_point
import org.gtkkn.native.graphene.graphene_frustum_equal
import org.gtkkn.native.graphene.graphene_frustum_free
import org.gtkkn.native.graphene.graphene_frustum_get_type
import org.gtkkn.native.graphene.graphene_frustum_init
import org.gtkkn.native.graphene.graphene_frustum_init_from_frustum
import org.gtkkn.native.graphene.graphene_frustum_init_from_matrix
import org.gtkkn.native.graphene.graphene_frustum_intersects_box
import org.gtkkn.native.graphene.graphene_frustum_intersects_sphere
import org.gtkkn.native.graphene.graphene_frustum_t
import kotlin.Boolean
import kotlin.Unit

/**
 * A 3D volume delimited by 2D clip planes.
 *
 * The contents of the `graphene_frustum_t` are private, and should not be
 * modified directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `planes`: planes: Out parameter is not supported
 *
 * @since 1.2
 */
@GrapheneVersion1_2
public class Frustum(public val grapheneFrustumPointer: CPointer<graphene_frustum_t>) :
    ProxyInstance(grapheneFrustumPointer) {
    /**
     * Allocates a new #graphene_frustum_t structure.
     *
     * The contents of the returned structure are undefined.
     *
     * @return the newly allocated #graphene_frustum_t
     *   structure. Use graphene_frustum_free() to free the resources
     *   allocated by this function.
     * @since 1.2
     */
    public constructor() : this(graphene_frustum_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks whether a point is inside the volume defined by the given
     * #graphene_frustum_t.
     *
     * @param point a #graphene_point3d_t
     * @return `true` if the point is inside the frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun containsPoint(point: Point3d): Boolean =
        graphene_frustum_contains_point(grapheneFrustumPointer, point.graphenePoint3dPointer)

    /**
     * Checks whether the two given #graphene_frustum_t are equal.
     *
     * @param b a #graphene_frustum_t
     * @return `true` if the given frustums are equal
     * @since 1.6
     */
    @GrapheneVersion1_6
    public fun equal(b: Frustum): Boolean = graphene_frustum_equal(grapheneFrustumPointer, b.grapheneFrustumPointer)

    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_frustum_free(grapheneFrustumPointer)

    /**
     * Initializes the given #graphene_frustum_t using the provided
     * clipping planes.
     *
     * @param p0 a clipping plane
     * @param p1 a clipping plane
     * @param p2 a clipping plane
     * @param p3 a clipping plane
     * @param p4 a clipping plane
     * @param p5 a clipping plane
     * @return the initialized frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun `init`(p0: Plane, p1: Plane, p2: Plane, p3: Plane, p4: Plane, p5: Plane): Frustum =
        graphene_frustum_init(
            grapheneFrustumPointer,
            p0.graphenePlanePointer,
            p1.graphenePlanePointer,
            p2.graphenePlanePointer,
            p3.graphenePlanePointer,
            p4.graphenePlanePointer,
            p5.graphenePlanePointer
        )!!.run {
            Frustum(this)
        }

    /**
     * Initializes the given #graphene_frustum_t using the clipping
     * planes of another #graphene_frustum_t.
     *
     * @param src a #graphene_frustum_t
     * @return the initialized frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromFrustum(src: Frustum): Frustum =
        graphene_frustum_init_from_frustum(grapheneFrustumPointer, src.grapheneFrustumPointer)!!.run {
            Frustum(this)
        }

    /**
     * Initializes a #graphene_frustum_t using the given @matrix.
     *
     * @param matrix a #graphene_matrix_t
     * @return the initialized frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromMatrix(matrix: Matrix): Frustum =
        graphene_frustum_init_from_matrix(grapheneFrustumPointer, matrix.grapheneMatrixPointer)!!.run {
            Frustum(this)
        }

    /**
     * Checks whether the given @box intersects a plane of
     * a #graphene_frustum_t.
     *
     * @param box a #graphene_box_t
     * @return `true` if the box intersects the frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun intersectsBox(box: Box): Boolean =
        graphene_frustum_intersects_box(grapheneFrustumPointer, box.grapheneBoxPointer)

    /**
     * Checks whether the given @sphere intersects a plane of
     * a #graphene_frustum_t.
     *
     * @param sphere a #graphene_sphere_t
     * @return `true` if the sphere intersects the frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun intersectsSphere(sphere: Sphere): Boolean =
        graphene_frustum_intersects_sphere(grapheneFrustumPointer, sphere.grapheneSpherePointer)

    public companion object {
        /**
         * Get the GType of Frustum
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_frustum_get_type()
    }
}
