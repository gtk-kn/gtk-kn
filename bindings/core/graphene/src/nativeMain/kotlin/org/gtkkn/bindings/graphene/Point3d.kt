// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_0
import org.gtkkn.bindings.graphene.annotations.GrapheneVersion1_4
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.graphene.graphene_point3d_alloc
import org.gtkkn.native.graphene.graphene_point3d_cross
import org.gtkkn.native.graphene.graphene_point3d_distance
import org.gtkkn.native.graphene.graphene_point3d_dot
import org.gtkkn.native.graphene.graphene_point3d_equal
import org.gtkkn.native.graphene.graphene_point3d_free
import org.gtkkn.native.graphene.graphene_point3d_get_type
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
import kotlin.String
import kotlin.Unit

/**
 * A point with three components: X, Y, and Z.
 * @since 1.0
 */
@GrapheneVersion1_0
public class Point3d(public val graphenePoint3dPointer: CPointer<graphene_point3d_t>) :
    ProxyInstance(graphenePoint3dPointer) {
    /**
     * the X coordinate
     */
    public var x: gfloat
        get() = graphenePoint3dPointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            graphenePoint3dPointer.pointed.x = value
        }

    /**
     * the Y coordinate
     */
    public var y: gfloat
        get() = graphenePoint3dPointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            graphenePoint3dPointer.pointed.y = value
        }

    /**
     * the Z coordinate
     */
    public var z: gfloat
        get() = graphenePoint3dPointer.pointed.z

        @UnsafeFieldSetter
        set(`value`) {
            graphenePoint3dPointer.pointed.z = value
        }

    /**
     * Allocates a #graphene_point3d_t structure.
     *
     * @return the newly allocated structure.
     *   Use graphene_point3d_free() to free the resources
     *   allocated by this function.
     * @since 1.0
     */
    public constructor() : this(graphene_point3d_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
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
    public fun cross(b: Point3d, res: Point3d): Unit =
        graphene_point3d_cross(graphenePoint3dPointer, b.graphenePoint3dPointer, res.graphenePoint3dPointer)

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
    public fun distance(b: Point3d, delta: Vec3?): gfloat =
        graphene_point3d_distance(graphenePoint3dPointer, b.graphenePoint3dPointer, delta?.grapheneVec3Pointer)

    /**
     * Computes the dot product of the two given #graphene_point3d_t.
     *
     * @param b a #graphene_point3d_t
     * @return the value of the dot product
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun dot(b: Point3d): gfloat = graphene_point3d_dot(graphenePoint3dPointer, b.graphenePoint3dPointer)

    /**
     * Checks whether two given points are equal.
     *
     * @param b a #graphene_point3d_t
     * @return `true` if the points are equal
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun equal(b: Point3d): Boolean = graphene_point3d_equal(graphenePoint3dPointer, b.graphenePoint3dPointer)

    /**
     * Frees the resources allocated via graphene_point3d_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_point3d_free(graphenePoint3dPointer)

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
    public fun `init`(x: gfloat, y: gfloat, z: gfloat): Point3d =
        graphene_point3d_init(graphenePoint3dPointer, x, y, z)!!.run {
            Point3d(this)
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
    public fun initFromPoint(src: Point3d): Point3d =
        graphene_point3d_init_from_point(graphenePoint3dPointer, src.graphenePoint3dPointer)!!.run {
            Point3d(this)
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
    public fun initFromVec3(v: Vec3): Point3d =
        graphene_point3d_init_from_vec3(graphenePoint3dPointer, v.grapheneVec3Pointer)!!.run {
            Point3d(this)
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
    public fun interpolate(b: Point3d, factor: gdouble, res: Point3d): Unit = graphene_point3d_interpolate(
        graphenePoint3dPointer,
        b.graphenePoint3dPointer,
        factor,
        res.graphenePoint3dPointer
    )

    /**
     * Computes the length of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     *
     * @return the length of the vector represented by the point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun length(): gfloat = graphene_point3d_length(graphenePoint3dPointer)

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
    public fun near(b: Point3d, epsilon: gfloat): Boolean =
        graphene_point3d_near(graphenePoint3dPointer, b.graphenePoint3dPointer, epsilon)

    /**
     * Computes the normalization of the vector represented by the
     * coordinates of the given #graphene_point3d_t.
     *
     * @param res return location for the normalized
     *   #graphene_point3d_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun normalize(res: Point3d): Unit =
        graphene_point3d_normalize(graphenePoint3dPointer, res.graphenePoint3dPointer)

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
    public fun normalizeViewport(viewport: Rect, zNear: gfloat, zFar: gfloat, res: Point3d): Unit =
        graphene_point3d_normalize_viewport(
            graphenePoint3dPointer,
            viewport.grapheneRectPointer,
            zNear,
            zFar,
            res.graphenePoint3dPointer
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
    public fun scale(factor: gfloat, res: Point3d): Unit =
        graphene_point3d_scale(graphenePoint3dPointer, factor, res.graphenePoint3dPointer)

    /**
     * Stores the coordinates of a #graphene_point3d_t into a
     * #graphene_vec3_t.
     *
     * @param v return location for a #graphene_vec3_t
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun toVec3(v: Vec3): Unit = graphene_point3d_to_vec3(graphenePoint3dPointer, v.grapheneVec3Pointer)

    override fun toString(): String = "Point3d(x=$x, y=$y, z=$z)"

    public companion object {
        /**
         * Retrieves a constant point with all three coordinates set to 0.
         *
         * @return a zero point
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Point3d = graphene_point3d_zero()!!.run {
            Point3d(this)
        }

        /**
         * Get the GType of Point3D
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_point3d_get_type()
    }
}
