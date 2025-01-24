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
import org.gtkkn.native.graphene.graphene_box_alloc
import org.gtkkn.native.graphene.graphene_box_contains_box
import org.gtkkn.native.graphene.graphene_box_contains_point
import org.gtkkn.native.graphene.graphene_box_empty
import org.gtkkn.native.graphene.graphene_box_equal
import org.gtkkn.native.graphene.graphene_box_expand
import org.gtkkn.native.graphene.graphene_box_expand_scalar
import org.gtkkn.native.graphene.graphene_box_expand_vec3
import org.gtkkn.native.graphene.graphene_box_free
import org.gtkkn.native.graphene.graphene_box_get_bounding_sphere
import org.gtkkn.native.graphene.graphene_box_get_center
import org.gtkkn.native.graphene.graphene_box_get_depth
import org.gtkkn.native.graphene.graphene_box_get_height
import org.gtkkn.native.graphene.graphene_box_get_max
import org.gtkkn.native.graphene.graphene_box_get_min
import org.gtkkn.native.graphene.graphene_box_get_size
import org.gtkkn.native.graphene.graphene_box_get_type
import org.gtkkn.native.graphene.graphene_box_get_width
import org.gtkkn.native.graphene.graphene_box_infinite
import org.gtkkn.native.graphene.graphene_box_init
import org.gtkkn.native.graphene.graphene_box_init_from_box
import org.gtkkn.native.graphene.graphene_box_init_from_vec3
import org.gtkkn.native.graphene.graphene_box_intersection
import org.gtkkn.native.graphene.graphene_box_minus_one
import org.gtkkn.native.graphene.graphene_box_one
import org.gtkkn.native.graphene.graphene_box_one_minus_one
import org.gtkkn.native.graphene.graphene_box_t
import org.gtkkn.native.graphene.graphene_box_union
import org.gtkkn.native.graphene.graphene_box_zero
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A 3D box, described as the volume between a minimum and
 * a maximum vertices.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `vertices`: vertices: Out parameter is not supported
 * - parameter `points`: Array parameter of type Point3D is not supported
 * - parameter `vectors`: Array parameter of type Vec3 is not supported
 *
 * @since 1.2
 */
@GrapheneVersion1_2
public class Box(public val grapheneBoxPointer: CPointer<graphene_box_t>, cleaner: Cleaner? = null) :
    ProxyInstance(grapheneBoxPointer) {
    /**
     * Allocate a new Box.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<graphene_box_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Box and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<graphene_box_t>, Cleaner>,
    ) : this(grapheneBoxPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Box using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<graphene_box_t>().ptr)

    /**
     * Checks whether the #graphene_box_t @a contains the given
     * #graphene_box_t @b.
     *
     * @param b a #graphene_box_t
     * @return `true` if the box is contained in the given box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun containsBox(b: Box): Boolean = graphene_box_contains_box(grapheneBoxPointer, b.grapheneBoxPointer)

    /**
     * Checks whether @box contains the given @point.
     *
     * @param point the coordinates to check
     * @return `true` if the point is contained in the given box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun containsPoint(point: Point3d): Boolean =
        graphene_box_contains_point(grapheneBoxPointer, point.graphenePoint3dPointer)

    /**
     * Checks whether the two given boxes are equal.
     *
     * @param b a #graphene_box_t
     * @return `true` if the boxes are equal
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun equal(b: Box): Boolean = graphene_box_equal(grapheneBoxPointer, b.grapheneBoxPointer)

    /**
     * Expands the dimensions of @box to include the coordinates at @point.
     *
     * @param point the coordinates of the point to include
     * @param res return location for the expanded box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun expand(point: Point3d, res: Box): Unit =
        graphene_box_expand(grapheneBoxPointer, point.graphenePoint3dPointer, res.grapheneBoxPointer)

    /**
     * Expands the dimensions of @box by the given @scalar value.
     *
     * If @scalar is positive, the #graphene_box_t will grow; if @scalar is
     * negative, the #graphene_box_t will shrink.
     *
     * @param scalar a scalar value
     * @param res return location for the expanded box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun expandScalar(scalar: gfloat, res: Box): Unit =
        graphene_box_expand_scalar(grapheneBoxPointer, scalar, res.grapheneBoxPointer)

    /**
     * Expands the dimensions of @box to include the coordinates of the
     * given vector.
     *
     * @param vec the coordinates of the point to include, as a #graphene_vec3_t
     * @param res return location for the expanded box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun expandVec3(vec: Vec3, res: Box): Unit =
        graphene_box_expand_vec3(grapheneBoxPointer, vec.grapheneVec3Pointer, res.grapheneBoxPointer)

    /**
     * Frees the resources allocated by graphene_box_alloc().
     *
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun free(): Unit = graphene_box_free(grapheneBoxPointer)

    /**
     * Computes the bounding #graphene_sphere_t capable of containing the given
     * #graphene_box_t.
     *
     * @param sphere return location for the bounding sphere
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getBoundingSphere(sphere: Sphere): Unit =
        graphene_box_get_bounding_sphere(grapheneBoxPointer, sphere.grapheneSpherePointer)

    /**
     * Retrieves the coordinates of the center of a #graphene_box_t.
     *
     * @param center return location for the coordinates of
     *   the center
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getCenter(center: Point3d): Unit =
        graphene_box_get_center(grapheneBoxPointer, center.graphenePoint3dPointer)

    /**
     * Retrieves the size of the @box on the Z axis.
     *
     * @return the depth of the box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getDepth(): gfloat = graphene_box_get_depth(grapheneBoxPointer)

    /**
     * Retrieves the size of the @box on the Y axis.
     *
     * @return the height of the box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getHeight(): gfloat = graphene_box_get_height(grapheneBoxPointer)

    /**
     * Retrieves the coordinates of the maximum point of the given
     * #graphene_box_t.
     *
     * @param max return location for the maximum point
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getMax(max: Point3d): Unit = graphene_box_get_max(grapheneBoxPointer, max.graphenePoint3dPointer)

    /**
     * Retrieves the coordinates of the minimum point of the given
     * #graphene_box_t.
     *
     * @param min return location for the minimum point
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getMin(min: Point3d): Unit = graphene_box_get_min(grapheneBoxPointer, min.graphenePoint3dPointer)

    /**
     * Retrieves the size of the box on all three axes, and stores
     * it into the given @size vector.
     *
     * @param size return location for the size
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getSize(size: Vec3): Unit = graphene_box_get_size(grapheneBoxPointer, size.grapheneVec3Pointer)

    /**
     * Retrieves the size of the @box on the X axis.
     *
     * @return the width of the box
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun getWidth(): gfloat = graphene_box_get_width(grapheneBoxPointer)

    /**
     * Initializes the given #graphene_box_t with two vertices.
     *
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun `init`(min: Point3d? = null, max: Point3d? = null): Box =
        graphene_box_init(grapheneBoxPointer, min?.graphenePoint3dPointer, max?.graphenePoint3dPointer)!!.run {
            Box(this)
        }

    /**
     * Initializes the given #graphene_box_t with the vertices of
     * another #graphene_box_t.
     *
     * @param src a #graphene_box_t
     * @return the initialized #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromBox(src: Box): Box =
        graphene_box_init_from_box(grapheneBoxPointer, src.grapheneBoxPointer)!!.run {
            Box(this)
        }

    /**
     * Initializes the given #graphene_box_t with two vertices
     * stored inside #graphene_vec3_t.
     *
     * @param min the coordinates of the minimum vertex
     * @param max the coordinates of the maximum vertex
     * @return the initialized #graphene_box_t
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun initFromVec3(min: Vec3? = null, max: Vec3? = null): Box =
        graphene_box_init_from_vec3(grapheneBoxPointer, min?.grapheneVec3Pointer, max?.grapheneVec3Pointer)!!.run {
            Box(this)
        }

    /**
     * Intersects the two given #graphene_box_t.
     *
     * If the two boxes do not intersect, @res will contain a degenerate box
     * initialized with graphene_box_empty().
     *
     * @param b a #graphene_box_t
     * @param res return location for the result
     * @return true if the two boxes intersect
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun intersection(b: Box, res: Box?): Boolean =
        graphene_box_intersection(grapheneBoxPointer, b.grapheneBoxPointer, res?.grapheneBoxPointer)

    /**
     * Unions the two given #graphene_box_t.
     *
     * @param b the box to union to @a
     * @param res return location for the result
     * @since 1.2
     */
    @GrapheneVersion1_2
    public fun union(b: Box, res: Box): Unit =
        graphene_box_union(grapheneBoxPointer, b.grapheneBoxPointer, res.grapheneBoxPointer)

    public companion object {
        /**
         * Allocates a new #graphene_box_t.
         *
         * The contents of the returned structure are undefined.
         *
         * @return the newly allocated #graphene_box_t structure.
         *   Use graphene_box_free() to free the resources allocated by this function
         * @since 1.2
         */
        public fun alloc(): Box = Box(graphene_box_alloc()!!)

        /**
         * A degenerate #graphene_box_t that can only be expanded.
         *
         * The returned value is owned by Graphene and should not be modified or freed.
         *
         * @return a #graphene_box_t
         * @since 1.2
         */
        @GrapheneVersion1_2
        public fun empty(): Box = graphene_box_empty()!!.run {
            Box(this)
        }

        /**
         * A degenerate #graphene_box_t that cannot be expanded.
         *
         * The returned value is owned by Graphene and should not be modified or freed.
         *
         * @return a #graphene_box_t
         * @since 1.2
         */
        @GrapheneVersion1_2
        public fun infinite(): Box = graphene_box_infinite()!!.run {
            Box(this)
        }

        /**
         * A #graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
         * maximum vertex set at (0, 0, 0).
         *
         * The returned value is owned by Graphene and should not be modified or freed.
         *
         * @return a #graphene_box_t
         * @since 1.2
         */
        @GrapheneVersion1_2
        public fun minusOne(): Box = graphene_box_minus_one()!!.run {
            Box(this)
        }

        /**
         * A #graphene_box_t with the minimum vertex set at (0, 0, 0) and the
         * maximum vertex set at (1, 1, 1).
         *
         * The returned value is owned by Graphene and should not be modified or freed.
         *
         * @return a #graphene_box_t
         * @since 1.2
         */
        @GrapheneVersion1_2
        public fun one(): Box = graphene_box_one()!!.run {
            Box(this)
        }

        /**
         * A #graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
         * maximum vertex set at (1, 1, 1).
         *
         * The returned value is owned by Graphene and should not be modified or freed.
         *
         * @return a #graphene_box_t
         * @since 1.2
         */
        @GrapheneVersion1_2
        public fun oneMinusOne(): Box = graphene_box_one_minus_one()!!.run {
            Box(this)
        }

        /**
         * A #graphene_box_t with both the minimum and maximum vertices set at (0, 0, 0).
         *
         * The returned value is owned by Graphene and should not be modified or freed.
         *
         * @return a #graphene_box_t
         * @since 1.2
         */
        @GrapheneVersion1_2
        public fun zero(): Box = graphene_box_zero()!!.run {
            Box(this)
        }

        /**
         * Get the GType of Box
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_box_get_type()
    }
}
