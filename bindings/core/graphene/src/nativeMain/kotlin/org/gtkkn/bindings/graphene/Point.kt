// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_point_alloc
import org.gtkkn.native.graphene.graphene_point_equal
import org.gtkkn.native.graphene.graphene_point_free
import org.gtkkn.native.graphene.graphene_point_init
import org.gtkkn.native.graphene.graphene_point_init_from_point
import org.gtkkn.native.graphene.graphene_point_init_from_vec2
import org.gtkkn.native.graphene.graphene_point_interpolate
import org.gtkkn.native.graphene.graphene_point_near
import org.gtkkn.native.graphene.graphene_point_t
import org.gtkkn.native.graphene.graphene_point_to_vec2
import org.gtkkn.native.graphene.graphene_point_zero
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
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
public class Point(
    pointer: CPointer<graphene_point_t>,
) : Record {
    public val graphenePointPointer: CPointer<graphene_point_t> = pointer

    /**
     * the X coordinate of the point
     */
    public var x: Float
        get() = graphenePointPointer.pointed.x
        set(`value`) {
            graphenePointPointer.pointed.x = value
        }

    /**
     * the Y coordinate of the point
     */
    public var y: Float
        get() = graphenePointPointer.pointed.y
        set(`value`) {
            graphenePointPointer.pointed.y = value
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
    public fun equal(b: Point): Boolean =
        graphene_point_equal(
            graphenePointPointer.reinterpret(),
            b.graphenePointPointer
        )

    /**
     * Frees the resources allocated by graphene_point_alloc().
     *
     * @since 1.0
     */
    public fun free(): Unit = graphene_point_free(graphenePointPointer.reinterpret())

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
    public fun `init`(
        x: Float,
        y: Float,
    ): Point =
        graphene_point_init(graphenePointPointer.reinterpret(), x, y)!!.run {
            Point(reinterpret())
        }

    /**
     * Initializes @p with the same coordinates of @src.
     *
     * @param src the #graphene_point_t to use
     * @return the initialized point
     * @since 1.0
     */
    public fun initFromPoint(src: Point): Point =
        graphene_point_init_from_point(
            graphenePointPointer.reinterpret(),
            src.graphenePointPointer
        )!!.run {
            Point(reinterpret())
        }

    /**
     * Initializes @p with the coordinates inside the given #graphene_vec2_t.
     *
     * @param src a #graphene_vec2_t
     * @return the initialized point
     * @since 1.4
     */
    public fun initFromVec2(src: Vec2): Point =
        graphene_point_init_from_vec2(
            graphenePointPointer.reinterpret(),
            src.grapheneVec2Pointer
        )!!.run {
            Point(reinterpret())
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
    public fun interpolate(
        b: Point,
        factor: Double,
        res: Point,
    ): Unit =
        graphene_point_interpolate(
            graphenePointPointer.reinterpret(),
            b.graphenePointPointer,
            factor,
            res.graphenePointPointer
        )

    /**
     * Checks whether the two points @a and @b are within
     * the threshold of @epsilon.
     *
     * @param b a #graphene_point_t
     * @param epsilon threshold between the two points
     * @return `true` if the distance is within @epsilon
     * @since 1.0
     */
    public fun near(
        b: Point,
        epsilon: Float,
    ): Boolean = graphene_point_near(graphenePointPointer.reinterpret(), b.graphenePointPointer, epsilon)

    /**
     * Stores the coordinates of the given #graphene_point_t into a
     * #graphene_vec2_t.
     *
     * @param v return location for the vertex
     * @since 1.4
     */
    public fun toVec2(v: Vec2): Unit =
        graphene_point_to_vec2(
            graphenePointPointer.reinterpret(),
            v.grapheneVec2Pointer
        )

    public companion object : RecordCompanion<Point, graphene_point_t> {
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
        public fun alloc(): Point = Point(graphene_point_alloc()!!.reinterpret())

        /**
         * Returns a point fixed at (0, 0).
         *
         * @return a fixed point
         * @since 1.0
         */
        public fun zero(): Point =
            graphene_point_zero()!!.run {
                Point(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Point = Point(pointer.reinterpret())
    }
}
