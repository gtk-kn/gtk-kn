// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_2
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_sphere_alloc
import org.gtkkn.native.graphene.graphene_sphere_contains_point
import org.gtkkn.native.graphene.graphene_sphere_distance
import org.gtkkn.native.graphene.graphene_sphere_equal
import org.gtkkn.native.graphene.graphene_sphere_free
import org.gtkkn.native.graphene.graphene_sphere_get_bounding_box
import org.gtkkn.native.graphene.graphene_sphere_get_center
import org.gtkkn.native.graphene.graphene_sphere_get_radius
import org.gtkkn.native.graphene.graphene_sphere_get_type
import org.gtkkn.native.graphene.graphene_sphere_init
import org.gtkkn.native.graphene.graphene_sphere_is_empty
import org.gtkkn.native.graphene.graphene_sphere_t
import org.gtkkn.native.graphene.graphene_sphere_translate
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A sphere, represented by its center and radius.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `points`: Array parameter of type Point3D is not supported
 * - parameter `vectors`: Array parameter of type Vec3 is not supported
 *
 * @since 1.2
 */
@GrapheneVersion1_2
public class Sphere(public val grapheneSpherePointer: CPointer<graphene_sphere_t>, cleaner: Cleaner? = null) :
    ProxyInstance(grapheneSpherePointer) {
    /**
     * Allocate a new Sphere.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_sphere_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Sphere and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_sphere_t>, Cleaner>,
    ) : this(grapheneSpherePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Sphere using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_sphere_t>().ptr)

    /**
     * Checks whether the given @point is contained in the volume
     * of a #graphene_sphere_t.
     *
     * @param point a #graphene_point3d_t
     * @return `true` if the sphere contains the point
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun containsPoint(point: Point3d): Boolean =
        graphene_sphere_contains_point(grapheneSpherePointer, point.graphenePoint3dPointer)

    /**
     * Computes the distance of the given @point from the surface of
     * a #graphene_sphere_t.
     *
     * @param point a #graphene_point3d_t
     * @return the distance of the point
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun distance(point: Point3d): gfloat =
        graphene_sphere_distance(grapheneSpherePointer, point.graphenePoint3dPointer)

    /**
     * Checks whether two #graphene_sphere_t are equal.
     *
     * @param b a #graphene_sphere_t
     * @return `true` if the spheres are equal
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(b: Sphere): Boolean = graphene_sphere_equal(grapheneSpherePointer, b.grapheneSpherePointer)

    /**
     * Frees the resources allocated by graphene_sphere_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_sphere_free(grapheneSpherePointer)

    /**
     * Computes the bounding box capable of containing the
     * given #graphene_sphere_t.
     *
     * @param box return location for the bounding box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getBoundingBox(box: Box): Unit =
        graphene_sphere_get_bounding_box(grapheneSpherePointer, box.grapheneBoxPointer)

    /**
     * Retrieves the coordinates of the center of a #graphene_sphere_t.
     *
     * @param center return location for the coordinates of
     *   the center
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getCenter(center: Point3d): Unit =
        graphene_sphere_get_center(grapheneSpherePointer, center.graphenePoint3dPointer)

    /**
     * Retrieves the radius of a #graphene_sphere_t.
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getRadius(): gfloat = graphene_sphere_get_radius(grapheneSpherePointer)

    /**
     * Initializes the given #graphene_sphere_t with the given @center and @radius.
     *
     * @param center the coordinates of the center of the sphere, or null
     *   for a center in (0, 0, 0)
     * @param radius the radius of the sphere
     * @return the initialized #graphene_sphere_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun `init`(center: Point3d? = null, radius: gfloat): Sphere =
        graphene_sphere_init(grapheneSpherePointer, center?.graphenePoint3dPointer, radius)!!.run {
            Sphere(this)
        }

    /**
     * Checks whether the sphere has a zero radius.
     *
     * @return `true` if the sphere is empty
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun isEmpty(): Boolean = graphene_sphere_is_empty(grapheneSpherePointer)

    /**
     * Translates the center of the given #graphene_sphere_t using the @point
     * coordinates as the delta of the translation.
     *
     * @param point the coordinates of the translation
     * @param res return location for the translated sphere
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun translate(point: Point3d, res: Sphere): Unit =
        graphene_sphere_translate(grapheneSpherePointer, point.graphenePoint3dPointer, res.grapheneSpherePointer)

    public companion object {
        /**
         * Allocates a new #graphene_sphere_t.
         *
         * The contents of the newly allocated structure are undefined.
         *
         * @return the newly allocated #graphene_sphere_t. Use
         *   graphene_sphere_free() to free the resources allocated by this function
         * @since 1.2
         */
        public fun alloc(): Sphere = Sphere(graphene_sphere_alloc()!!)

        /**
         * Get the GType of Sphere
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_sphere_get_type()
    }
}
