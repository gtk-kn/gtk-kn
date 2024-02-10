// This is a generated file. Do not modify.
package org.gtkkn.bindings.graphene

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.graphene.graphene_rect_alloc
import org.gtkkn.native.graphene.graphene_rect_contains_point
import org.gtkkn.native.graphene.graphene_rect_contains_rect
import org.gtkkn.native.graphene.graphene_rect_equal
import org.gtkkn.native.graphene.graphene_rect_expand
import org.gtkkn.native.graphene.graphene_rect_free
import org.gtkkn.native.graphene.graphene_rect_get_area
import org.gtkkn.native.graphene.graphene_rect_get_bottom_left
import org.gtkkn.native.graphene.graphene_rect_get_bottom_right
import org.gtkkn.native.graphene.graphene_rect_get_center
import org.gtkkn.native.graphene.graphene_rect_get_height
import org.gtkkn.native.graphene.graphene_rect_get_top_left
import org.gtkkn.native.graphene.graphene_rect_get_top_right
import org.gtkkn.native.graphene.graphene_rect_get_width
import org.gtkkn.native.graphene.graphene_rect_get_x
import org.gtkkn.native.graphene.graphene_rect_get_y
import org.gtkkn.native.graphene.graphene_rect_init
import org.gtkkn.native.graphene.graphene_rect_init_from_rect
import org.gtkkn.native.graphene.graphene_rect_inset
import org.gtkkn.native.graphene.graphene_rect_inset_r
import org.gtkkn.native.graphene.graphene_rect_interpolate
import org.gtkkn.native.graphene.graphene_rect_intersection
import org.gtkkn.native.graphene.graphene_rect_normalize
import org.gtkkn.native.graphene.graphene_rect_normalize_r
import org.gtkkn.native.graphene.graphene_rect_offset
import org.gtkkn.native.graphene.graphene_rect_offset_r
import org.gtkkn.native.graphene.graphene_rect_round
import org.gtkkn.native.graphene.graphene_rect_round_extents
import org.gtkkn.native.graphene.graphene_rect_round_to_pixel
import org.gtkkn.native.graphene.graphene_rect_scale
import org.gtkkn.native.graphene.graphene_rect_t
import org.gtkkn.native.graphene.graphene_rect_union
import org.gtkkn.native.graphene.graphene_rect_zero
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Unit

/**
 * The location and size of a rectangle region.
 *
 * The width and height of a #graphene_rect_t can be negative; for instance,
 * a #graphene_rect_t with an origin of [ 0, 0 ] and a size of [ 10, 10 ] is
 * equivalent to a #graphene_rect_t with an origin of [ 10, 10 ] and a size
 * of [ -10, -10 ].
 *
 * Application code can normalize rectangles using graphene_rect_normalize();
 * this function will ensure that the width and height of a rectangle are
 * positive values. All functions taking a #graphene_rect_t as an argument
 * will internally operate on a normalized copy; all functions returning a
 * #graphene_rect_t will always return a normalized rectangle.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `vertices`: vertices: Out parameter is not supported
 * - field `origin`: Point
 * - field `size`: Size
 *
 * @since 1.0
 */
public class Rect(
    pointer: CPointer<graphene_rect_t>,
) : Record {
    public val grapheneRectPointer: CPointer<graphene_rect_t> = pointer

    /**
     * Checks whether a #graphene_rect_t contains the given coordinates.
     *
     * @param p a #graphene_point_t
     * @return `true` if the rectangle contains the point
     * @since 1.0
     */
    public fun containsPoint(p: Point): Boolean =
        graphene_rect_contains_point(grapheneRectPointer.reinterpret(), p.graphenePointPointer)

    /**
     * Checks whether a #graphene_rect_t fully contains the given
     * rectangle.
     *
     * @param b a #graphene_rect_t
     * @return `true` if the rectangle @a fully contains @b
     * @since 1.0
     */
    public fun containsRect(b: Rect): Boolean =
        graphene_rect_contains_rect(grapheneRectPointer.reinterpret(), b.grapheneRectPointer)

    /**
     * Checks whether the two given rectangle are equal.
     *
     * @param b a #graphene_rect_t
     * @return `true` if the rectangles are equal
     * @since 1.0
     */
    public fun equal(b: Rect): Boolean =
        graphene_rect_equal(
            grapheneRectPointer.reinterpret(),
            b.grapheneRectPointer
        )

    /**
     * Expands a #graphene_rect_t to contain the given #graphene_point_t.
     *
     * @param p a #graphene_point_t
     * @param res return location for the expanded rectangle
     * @since 1.4
     */
    public fun expand(
        p: Point,
        res: Rect,
    ): Unit =
        graphene_rect_expand(
            grapheneRectPointer.reinterpret(),
            p.graphenePointPointer,
            res.grapheneRectPointer
        )

    /**
     * Frees the resources allocated by graphene_rect_alloc().
     *
     * @since 1.0
     */
    public fun free(): Unit = graphene_rect_free(grapheneRectPointer.reinterpret())

    /**
     * Compute the area of given normalized rectangle.
     *
     * @return the area of the normalized rectangle
     * @since 1.10
     */
    public fun getArea(): Float = graphene_rect_get_area(grapheneRectPointer.reinterpret())

    /**
     * Retrieves the coordinates of the bottom-left corner of the given rectangle.
     *
     * @param p return location for a #graphene_point_t
     * @since 1.0
     */
    public fun getBottomLeft(p: Point): Unit =
        graphene_rect_get_bottom_left(grapheneRectPointer.reinterpret(), p.graphenePointPointer)

    /**
     * Retrieves the coordinates of the bottom-right corner of the given rectangle.
     *
     * @param p return location for a #graphene_point_t
     * @since 1.0
     */
    public fun getBottomRight(p: Point): Unit =
        graphene_rect_get_bottom_right(
            grapheneRectPointer.reinterpret(),
            p.graphenePointPointer
        )

    /**
     * Retrieves the coordinates of the center of the given rectangle.
     *
     * @param p return location for a #graphene_point_t
     * @since 1.0
     */
    public fun getCenter(p: Point): Unit =
        graphene_rect_get_center(grapheneRectPointer.reinterpret(), p.graphenePointPointer)

    /**
     * Retrieves the normalized height of the given rectangle.
     *
     * @return the normalized height of the rectangle
     * @since 1.0
     */
    public fun getHeight(): Float = graphene_rect_get_height(grapheneRectPointer.reinterpret())

    /**
     * Retrieves the coordinates of the top-left corner of the given rectangle.
     *
     * @param p return location for a #graphene_point_t
     * @since 1.0
     */
    public fun getTopLeft(p: Point): Unit =
        graphene_rect_get_top_left(grapheneRectPointer.reinterpret(), p.graphenePointPointer)

    /**
     * Retrieves the coordinates of the top-right corner of the given rectangle.
     *
     * @param p return location for a #graphene_point_t
     * @since 1.0
     */
    public fun getTopRight(p: Point): Unit =
        graphene_rect_get_top_right(grapheneRectPointer.reinterpret(), p.graphenePointPointer)

    /**
     * Retrieves the normalized width of the given rectangle.
     *
     * @return the normalized width of the rectangle
     * @since 1.0
     */
    public fun getWidth(): Float = graphene_rect_get_width(grapheneRectPointer.reinterpret())

    /**
     * Retrieves the normalized X coordinate of the origin of the given
     * rectangle.
     *
     * @return the normalized X coordinate of the rectangle
     * @since 1.0
     */
    public fun getX(): Float = graphene_rect_get_x(grapheneRectPointer.reinterpret())

    /**
     * Retrieves the normalized Y coordinate of the origin of the given
     * rectangle.
     *
     * @return the normalized Y coordinate of the rectangle
     * @since 1.0
     */
    public fun getY(): Float = graphene_rect_get_y(grapheneRectPointer.reinterpret())

    /**
     * Initializes the given #graphene_rect_t with the given values.
     *
     * This function will implicitly normalize the #graphene_rect_t
     * before returning.
     *
     * @param x the X coordinate of the @graphene_rect_t.origin
     * @param y the Y coordinate of the @graphene_rect_t.origin
     * @param width the width of the @graphene_rect_t.size
     * @param height the height of the @graphene_rect_t.size
     * @return the initialized rectangle
     * @since 1.0
     */
    public fun `init`(
        x: Float,
        y: Float,
        width: Float,
        height: Float,
    ): Rect =
        graphene_rect_init(grapheneRectPointer.reinterpret(), x, y, width, height)!!.run {
            Rect(reinterpret())
        }

    /**
     * Initializes @r using the given @src rectangle.
     *
     * This function will implicitly normalize the #graphene_rect_t
     * before returning.
     *
     * @param src a #graphene_rect_t
     * @return the initialized rectangle
     * @since 1.0
     */
    public fun initFromRect(src: Rect): Rect =
        graphene_rect_init_from_rect(
            grapheneRectPointer.reinterpret(),
            src.grapheneRectPointer
        )!!.run {
            Rect(reinterpret())
        }

    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     *
     * To create an inset rectangle, use positive @d_x or @d_y values; to
     * create a larger, encompassing rectangle, use negative @d_x or @d_y
     * values.
     *
     * The origin of the rectangle is offset by @d_x and @d_y, while the size
     * is adjusted by `(2 * @d_x, 2 * @d_y)`. If @d_x and @d_y are positive
     * values, the size of the rectangle is decreased; if @d_x and @d_y are
     * negative values, the size of the rectangle is increased.
     *
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     *
     * @param dX the horizontal inset
     * @param dY the vertical inset
     * @return the inset rectangle
     * @since 1.0
     */
    public fun inset(
        dX: Float,
        dY: Float,
    ): Rect =
        graphene_rect_inset(grapheneRectPointer.reinterpret(), dX, dY)!!.run {
            Rect(reinterpret())
        }

    /**
     * Changes the given rectangle to be smaller, or larger depending on the
     * given inset parameters.
     *
     * To create an inset rectangle, use positive @d_x or @d_y values; to
     * create a larger, encompassing rectangle, use negative @d_x or @d_y
     * values.
     *
     * The origin of the rectangle is offset by @d_x and @d_y, while the size
     * is adjusted by `(2 * @d_x, 2 * @d_y)`. If @d_x and @d_y are positive
     * values, the size of the rectangle is decreased; if @d_x and @d_y are
     * negative values, the size of the rectangle is increased.
     *
     * If the size of the resulting inset rectangle has a negative width or
     * height then the size will be set to zero.
     *
     * @param dX the horizontal inset
     * @param dY the vertical inset
     * @param res return location for the inset rectangle
     * @since 1.4
     */
    public fun insetR(
        dX: Float,
        dY: Float,
        res: Rect,
    ): Unit =
        graphene_rect_inset_r(
            grapheneRectPointer.reinterpret(),
            dX,
            dY,
            res.grapheneRectPointer
        )

    /**
     * Linearly interpolates the origin and size of the two given
     * rectangles.
     *
     * @param b a #graphene_rect_t
     * @param factor the linear interpolation factor
     * @param res return location for the
     *   interpolated rectangle
     * @since 1.0
     */
    public fun interpolate(
        b: Rect,
        factor: Double,
        res: Rect,
    ): Unit =
        graphene_rect_interpolate(
            grapheneRectPointer.reinterpret(),
            b.grapheneRectPointer,
            factor,
            res.grapheneRectPointer
        )

    /**
     * Computes the intersection of the two given rectangles.
     *
     * ![](rectangle-intersection.png)
     *
     * The intersection in the image above is the blue outline.
     *
     * If the two rectangles do not intersect, @res will contain
     * a degenerate rectangle with origin in (0, 0) and a size of 0.
     *
     * @param b a #graphene_rect_t
     * @param res return location for
     *   a #graphene_rect_t
     * @return `true` if the two rectangles intersect
     * @since 1.0
     */
    public fun intersection(
        b: Rect,
        res: Rect?,
    ): Boolean =
        graphene_rect_intersection(
            grapheneRectPointer.reinterpret(),
            b.grapheneRectPointer,
            res?.grapheneRectPointer
        )

    /**
     * Normalizes the passed rectangle.
     *
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is the top-left corner of
     * the rectangle.
     *
     * @return the normalized rectangle
     * @since 1.0
     */
    public fun normalize(): Rect =
        graphene_rect_normalize(grapheneRectPointer.reinterpret())!!.run {
            Rect(reinterpret())
        }

    /**
     * Normalizes the passed rectangle.
     *
     * This function ensures that the size of the rectangle is made of
     * positive values, and that the origin is in the top-left corner
     * of the rectangle.
     *
     * @param res the return location for the
     *   normalized rectangle
     * @since 1.4
     */
    public fun normalizeR(res: Rect): Unit =
        graphene_rect_normalize_r(grapheneRectPointer.reinterpret(), res.grapheneRectPointer)

    /**
     * Offsets the origin by @d_x and @d_y.
     *
     * The size of the rectangle is unchanged.
     *
     * @param dX the horizontal offset
     * @param dY the vertical offset
     * @return the offset rectangle
     * @since 1.0
     */
    public fun offset(
        dX: Float,
        dY: Float,
    ): Rect =
        graphene_rect_offset(grapheneRectPointer.reinterpret(), dX, dY)!!.run {
            Rect(reinterpret())
        }

    /**
     * Offsets the origin of the given rectangle by @d_x and @d_y.
     *
     * The size of the rectangle is left unchanged.
     *
     * @param dX the horizontal offset
     * @param dY the vertical offset
     * @param res return location for the offset
     *   rectangle
     * @since 1.4
     */
    public fun offsetR(
        dX: Float,
        dY: Float,
        res: Rect,
    ): Unit =
        graphene_rect_offset_r(
            grapheneRectPointer.reinterpret(),
            dX,
            dY,
            res.grapheneRectPointer
        )

    /**
     * Rounds the origin and size of the given rectangle to
     * their nearest integer values; the rounding is guaranteed
     * to be large enough to have an area bigger or equal to the
     * original rectangle, but might not fully contain its extents.
     * Use graphene_rect_round_extents() in case you need to round
     * to a rectangle that covers fully the original one.
     *
     * This function is the equivalent of calling `floor` on
     * the coordinates of the origin, and `ceil` on the size.
     *
     * @param res return location for the
     *   rounded rectangle
     * @since 1.4
     */
    public fun round(res: Rect): Unit =
        graphene_rect_round(
            grapheneRectPointer.reinterpret(),
            res.grapheneRectPointer
        )

    /**
     * Rounds the origin of the given rectangle to its nearest
     * integer value and and recompute the size so that the
     * rectangle is large enough to contain all the conrners
     * of the original rectangle.
     *
     * This function is the equivalent of calling `floor` on
     * the coordinates of the origin, and recomputing the size
     * calling `ceil` on the bottom-right coordinates.
     *
     * If you want to be sure that the rounded rectangle
     * completely covers the area that was covered by the
     * original rectangle — i.e. you want to cover the area
     * including all its corners — this function will make sure
     * that the size is recomputed taking into account the ceiling
     * of the coordinates of the bottom-right corner.
     * If the difference between the original coordinates and the
     * coordinates of the rounded rectangle is greater than the
     * difference between the original size and and the rounded
     * size, then the move of the origin would not be compensated
     * by a move in the anti-origin, leaving the corners of the
     * original rectangle outside the rounded one.
     *
     * @param res return location for the
     *   rectangle with rounded extents
     * @since 1.10
     */
    public fun roundExtents(res: Rect): Unit =
        graphene_rect_round_extents(grapheneRectPointer.reinterpret(), res.grapheneRectPointer)

    /**
     * Rounds the origin and the size of the given rectangle to
     * their nearest integer values; the rounding is guaranteed
     * to be large enough to contain the original rectangle.
     *
     * @return the pixel-aligned rectangle.
     * @since 1.0
     */
    public fun roundToPixel(): Rect =
        graphene_rect_round_to_pixel(grapheneRectPointer.reinterpret())!!.run {
            Rect(reinterpret())
        }

    /**
     * Scales the size and origin of a rectangle horizontaly by @s_h,
     * and vertically by @s_v. The result @res is normalized.
     *
     * @param sH horizontal scale factor
     * @param sV vertical scale factor
     * @param res return location for the
     *   scaled rectangle
     * @since 1.10
     */
    public fun scale(
        sH: Float,
        sV: Float,
        res: Rect,
    ): Unit =
        graphene_rect_scale(
            grapheneRectPointer.reinterpret(),
            sH,
            sV,
            res.grapheneRectPointer
        )

    /**
     * Computes the union of the two given rectangles.
     *
     * ![](rectangle-union.png)
     *
     * The union in the image above is the blue outline.
     *
     * @param b a #graphene_rect_t
     * @param res return location for a #graphene_rect_t
     * @since 1.0
     */
    public fun union(
        b: Rect,
        res: Rect,
    ): Unit =
        graphene_rect_union(
            grapheneRectPointer.reinterpret(),
            b.grapheneRectPointer,
            res.grapheneRectPointer
        )

    public companion object : RecordCompanion<Rect, graphene_rect_t> {
        /**
         * Allocates a new #graphene_rect_t.
         *
         * The contents of the returned rectangle are undefined.
         *
         * @return the newly allocated rectangle
         * @since 1.0
         */
        public fun alloc(): Rect =
            graphene_rect_alloc()!!.run {
                Rect(reinterpret())
            }

        /**
         * Returns a degenerate rectangle with origin fixed at (0, 0) and
         * a size of 0, 0.
         *
         * @return a fixed rectangle
         * @since 1.4
         */
        public fun zero(): Rect =
            graphene_rect_zero()!!.run {
                Rect(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rect = Rect(pointer.reinterpret())
    }
}
