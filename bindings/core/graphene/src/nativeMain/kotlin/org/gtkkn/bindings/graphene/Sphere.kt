// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_sphere_alloc
import org.gtkkn.native.graphene.graphene_sphere_contains_point
import org.gtkkn.native.graphene.graphene_sphere_distance
import org.gtkkn.native.graphene.graphene_sphere_equal
import org.gtkkn.native.graphene.graphene_sphere_free
import org.gtkkn.native.graphene.graphene_sphere_get_bounding_box
import org.gtkkn.native.graphene.graphene_sphere_get_center
import org.gtkkn.native.graphene.graphene_sphere_get_radius
import org.gtkkn.native.graphene.graphene_sphere_init
import org.gtkkn.native.graphene.graphene_sphere_is_empty
import org.gtkkn.native.graphene.graphene_sphere_t
import org.gtkkn.native.graphene.graphene_sphere_translate
import kotlin.Boolean
import kotlin.Float
import kotlin.Unit

/**
 * A sphere, represented by its center and radius.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `points`: Point3D
 * - parameter `vectors`: Vec3
 * - field `center`: Record field center is private
 * - field `radius`: Record field radius is private
 *
 * @since 1.2
 */
public class Sphere(
    pointer: CPointer<graphene_sphere_t>,
) : Record {
    public val grapheneSpherePointer: CPointer<graphene_sphere_t> = pointer

    /**
     * Checks whether the given @point is contained in the volume
     * of a #graphene_sphere_t.
     *
     * @param point a #graphene_point3d_t
     * @return `true` if the sphere contains the point
     * @since 1.2
     */
    public fun containsPoint(point: Point3D): Boolean =
        graphene_sphere_contains_point(grapheneSpherePointer.reinterpret(), point.graphenePoint3DPointer)

    /**
     * Computes the distance of the given @point from the surface of
     * a #graphene_sphere_t.
     *
     * @param point a #graphene_point3d_t
     * @return the distance of the point
     * @since 1.2
     */
    public fun distance(point: Point3D): Float =
        graphene_sphere_distance(grapheneSpherePointer.reinterpret(), point.graphenePoint3DPointer)

    /**
     * Checks whether two #graphene_sphere_t are equal.
     *
     * @param b a #graphene_sphere_t
     * @return `true` if the spheres are equal
     * @since 1.2
     */
    public fun equal(b: Sphere): Boolean =
        graphene_sphere_equal(grapheneSpherePointer.reinterpret(), b.grapheneSpherePointer)

    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     *
     * @since 1.2
     */
    public fun free(): Unit = graphene_sphere_free(grapheneSpherePointer.reinterpret())

    /**
     * Computes the bounding box capable of containing the
     * given #graphene_sphere_t.
     *
     * @param box return location for the bounding box
     * @since 1.2
     */
    public fun getBoundingBox(box: Box): Unit =
        graphene_sphere_get_bounding_box(grapheneSpherePointer.reinterpret(), box.grapheneBoxPointer)

    /**
     * Retrieves the coordinates of the center of a #graphene_sphere_t.
     *
     * @param center return location for the coordinates of
     *   the center
     * @since 1.2
     */
    public fun getCenter(center: Point3D): Unit =
        graphene_sphere_get_center(grapheneSpherePointer.reinterpret(), center.graphenePoint3DPointer)

    /**
     * Retrieves the radius of a #graphene_sphere_t.
     *
     * @since 1.2
     */
    public fun getRadius(): Float = graphene_sphere_get_radius(grapheneSpherePointer.reinterpret())

    /**
     * Initializes the given #graphene_sphere_t with the given @center and @radius.
     *
     * @param center the coordinates of the center of the sphere, or null
     *   for a center in (0, 0, 0)
     * @param radius the radius of the sphere
     * @return the initialized #graphene_sphere_t
     * @since 1.2
     */
    public fun `init`(
        center: Point3D? = null,
        radius: Float,
    ): Sphere =
        graphene_sphere_init(grapheneSpherePointer.reinterpret(), center?.graphenePoint3DPointer, radius)!!.run {
            Sphere(reinterpret())
        }

    /**
     * Checks whether the sphere has a zero radius.
     *
     * @return `true` if the sphere is empty
     * @since 1.2
     */
    public fun isEmpty(): Boolean = graphene_sphere_is_empty(grapheneSpherePointer.reinterpret())

    /**
     * Translates the center of the given #graphene_sphere_t using the @point
     * coordinates as the delta of the translation.
     *
     * @param point the coordinates of the translation
     * @param res return location for the translated sphere
     * @since 1.2
     */
    public fun translate(
        point: Point3D,
        res: Sphere,
    ): Unit =
        graphene_sphere_translate(
            grapheneSpherePointer.reinterpret(),
            point.graphenePoint3DPointer,
            res.grapheneSpherePointer
        )

    public companion object : RecordCompanion<Sphere, graphene_sphere_t> {
        /**
         * Allocates a new #graphene_sphere_t.
         *
         * The contents of the newly allocated structure are undefined.
         *
         * @return the newly allocated #graphene_sphere_t. Use
         *   graphene_sphere_free() to free the resources allocated by this function
         * @since 1.2
         */
        public fun alloc(): Sphere = Sphere(graphene_sphere_alloc()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Sphere = Sphere(pointer.reinterpret())
    }
}
