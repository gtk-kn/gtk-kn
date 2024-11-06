// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_6
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_frustum_alloc
import org.gtkkn.native.graphene.graphene_frustum_contains_point
import org.gtkkn.native.graphene.graphene_frustum_equal
import org.gtkkn.native.graphene.graphene_frustum_free
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
 * - field `planes`: Record field planes is private
 *
 * @since 1.2
 */
@GrapheneVersion1_2
public class Frustum(
    pointer: CPointer<graphene_frustum_t>,
) : Record {
    public val grapheneFrustumPointer: CPointer<graphene_frustum_t> = pointer

    /**
     * Checks whether a point is inside the volume defined by the given
     * #graphene_frustum_t.
     *
     * @param point a #graphene_point3d_t
     * @return `true` if the point is inside the frustum
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun containsPoint(point: Point3D): Boolean =
        graphene_frustum_contains_point(grapheneFrustumPointer.reinterpret(), point.graphenePoint3DPointer)

    /**
     * Checks whether the two given #graphene_frustum_t are equal.
     *
     * @param b a #graphene_frustum_t
     * @return `true` if the given frustums are equal
     * @since 1.6
     */
    @GrapheneVersion1_6
    public fun equal(b: Frustum): Boolean =
        graphene_frustum_equal(grapheneFrustumPointer.reinterpret(), b.grapheneFrustumPointer)

    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_frustum_free(grapheneFrustumPointer.reinterpret())

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
    public fun `init`(
        p0: Plane,
        p1: Plane,
        p2: Plane,
        p3: Plane,
        p4: Plane,
        p5: Plane,
    ): Frustum =
        graphene_frustum_init(
            grapheneFrustumPointer.reinterpret(),
            p0.graphenePlanePointer,
            p1.graphenePlanePointer,
            p2.graphenePlanePointer,
            p3.graphenePlanePointer,
            p4.graphenePlanePointer,
            p5.graphenePlanePointer
        )!!.run {
            Frustum(reinterpret())
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
        graphene_frustum_init_from_frustum(grapheneFrustumPointer.reinterpret(), src.grapheneFrustumPointer)!!.run {
            Frustum(reinterpret())
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
        graphene_frustum_init_from_matrix(grapheneFrustumPointer.reinterpret(), matrix.grapheneMatrixPointer)!!.run {
            Frustum(reinterpret())
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
        graphene_frustum_intersects_box(grapheneFrustumPointer.reinterpret(), box.grapheneBoxPointer)

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
        graphene_frustum_intersects_sphere(grapheneFrustumPointer.reinterpret(), sphere.grapheneSpherePointer)

    public companion object : RecordCompanion<Frustum, graphene_frustum_t> {
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
        public fun alloc(): Frustum = Frustum(graphene_frustum_alloc()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Frustum = Frustum(pointer.reinterpret())
    }
}
