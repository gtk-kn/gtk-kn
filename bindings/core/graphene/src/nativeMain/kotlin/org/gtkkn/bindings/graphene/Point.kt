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
import org.gtkkn.native.graphene.graphene_point_alloc
import org.gtkkn.native.graphene.graphene_point_equal
import org.gtkkn.native.graphene.graphene_point_free
import org.gtkkn.native.graphene.graphene_point_get_type
import org.gtkkn.native.graphene.graphene_point_init
import org.gtkkn.native.graphene.graphene_point_init_from_point
import org.gtkkn.native.graphene.graphene_point_init_from_vec2
import org.gtkkn.native.graphene.graphene_point_interpolate
import org.gtkkn.native.graphene.graphene_point_near
import org.gtkkn.native.graphene.graphene_point_t
import org.gtkkn.native.graphene.graphene_point_to_vec2
import org.gtkkn.native.graphene.graphene_point_zero
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A point with two coordinates.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `d_x`: d_x: Out parameter is not supported
 *
 * @since 1.0
 */
@GrapheneVersion1_0
public class Point(public val graphenePointPointer: CPointer<graphene_point_t>) : ProxyInstance(graphenePointPointer) {
    /**
     * the X coordinate of the point
     */
    public var x: gfloat
        get() = graphenePointPointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            graphenePointPointer.pointed.x = value
        }

    /**
     * the Y coordinate of the point
     */
    public var y: gfloat
        get() = graphenePointPointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            graphenePointPointer.pointed.y = value
        }

    /**
     * Allocates a new #graphene_point_t structure.
     *
     * The coordinates of the returned point are (0, 0).
     *
     * It's possible to chain this function with graphene_point_init()
     * or graphene_point_init_from_point(), e.g.:
     *
     * |[<!-- language="C" -->
     *   graphene_point_t *
     *   point_new (float x, float y)
     *   {
     *     return graphene_point_init (graphene_point_alloc (), x, y);
     *   }
     *
     *   graphene_point_t *
     *   point_copy (const graphene_point_t *p)
     *   {
     *     return graphene_point_init_from_point (graphene_point_alloc (), p);
     *   }
     * ]|
     *
     * @return the newly allocated #graphene_point_t.
     *   Use graphene_point_free() to free the resources allocated by
     *   this function.
     * @since 1.0
     */
    public constructor() : this(graphene_point_alloc()!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Checks if the two points @a and @b point to the same
     * coordinates.
     *
     * This function accounts for floating point fluctuations; if
     * you want to control the fuzziness of the match, you can use
     * graphene_point_near() instead.
     *
     * @param b a #graphene_point_t
     * @return `true` if the points have the same coordinates
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun equal(b: Point): Boolean = graphene_point_equal(graphenePointPointer, b.graphenePointPointer)

    /**
     * Frees the resources allocated by graphene_point_alloc().
     *
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun free(): Unit = graphene_point_free(graphenePointPointer)

    /**
     * Initializes @p to the given @x and @y coordinates.
     *
     * It's safe to call this function multiple times.
     *
     * @param x the X coordinate
     * @param y the Y coordinate
     * @return the initialized point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun `init`(x: gfloat, y: gfloat): Point = graphene_point_init(graphenePointPointer, x, y)!!.run {
        Point(this)
    }

    /**
     * Initializes @p with the same coordinates of @src.
     *
     * @param src the #graphene_point_t to use
     * @return the initialized point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun initFromPoint(src: Point): Point =
        graphene_point_init_from_point(graphenePointPointer, src.graphenePointPointer)!!.run {
            Point(this)
        }

    /**
     * Initializes @p with the coordinates inside the given #graphene_vec2_t.
     *
     * @param src a #graphene_vec2_t
     * @return the initialized point
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun initFromVec2(src: Vec2): Point =
        graphene_point_init_from_vec2(graphenePointPointer, src.grapheneVec2Pointer)!!.run {
            Point(this)
        }

    /**
     * Linearly interpolates the coordinates of @a and @b using the
     * given @factor.
     *
     * @param b a #graphene_point_t
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated
     *   point
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun interpolate(b: Point, factor: gdouble, res: Point): Unit =
        graphene_point_interpolate(graphenePointPointer, b.graphenePointPointer, factor, res.graphenePointPointer)

    /**
     * Checks whether the two points @a and @b are within
     * the threshold of @epsilon.
     *
     * @param b a #graphene_point_t
     * @param epsilon threshold between the two points
     * @return `true` if the distance is within @epsilon
     * @since 1.0
     */
    @GrapheneVersion1_0
    public fun near(b: Point, epsilon: gfloat): Boolean =
        graphene_point_near(graphenePointPointer, b.graphenePointPointer, epsilon)

    /**
     * Stores the coordinates of the given #graphene_point_t into a
     * #graphene_vec2_t.
     *
     * @param v return location for the vertex
     * @since 1.4
     */
    @GrapheneVersion1_4
    public fun toVec2(v: Vec2): Unit = graphene_point_to_vec2(graphenePointPointer, v.grapheneVec2Pointer)

    override fun toString(): String = "Point(x=$x, y=$y)"

    public companion object {
        /**
         * Returns a point fixed at (0, 0).
         *
         * @return a fixed point
         * @since 1.0
         */
        @GrapheneVersion1_0
        public fun zero(): Point = graphene_point_zero()!!.run {
            Point(this)
        }

        /**
         * Get the GType of Point
         *
         * @return the GType
         */
        public fun getType(): GType = graphene_point_get_type()
    }
}
