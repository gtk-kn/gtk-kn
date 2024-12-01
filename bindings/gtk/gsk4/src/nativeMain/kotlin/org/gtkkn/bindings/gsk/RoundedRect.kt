// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.graphene.Size
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskRoundedRect
import org.gtkkn.native.gsk.gsk_rounded_rect_contains_point
import org.gtkkn.native.gsk.gsk_rounded_rect_contains_rect
import org.gtkkn.native.gsk.gsk_rounded_rect_init
import org.gtkkn.native.gsk.gsk_rounded_rect_init_copy
import org.gtkkn.native.gsk.gsk_rounded_rect_init_from_rect
import org.gtkkn.native.gsk.gsk_rounded_rect_intersects_rect
import org.gtkkn.native.gsk.gsk_rounded_rect_is_rectilinear
import org.gtkkn.native.gsk.gsk_rounded_rect_normalize
import org.gtkkn.native.gsk.gsk_rounded_rect_offset
import org.gtkkn.native.gsk.gsk_rounded_rect_shrink
import kotlin.Boolean
import kotlin.Float

/**
 * A rectangular region with rounded corners.
 *
 * Application code should normalize rectangles using
 * [method@Gsk.RoundedRect.normalize]; this function will ensure that
 * the bounds of the rectangle are normalized and ensure that the corner
 * values are positive and the corners do not overlap.
 *
 * All functions taking a `GskRoundedRect` as an argument will internally
 * operate on a normalized copy; all functions returning a `GskRoundedRect`
 * will always return a normalized one.
 *
 * The algorithm used for normalizing corner sizes is described in
 * [the CSS specification](https://drafts.csswg.org/css-backgrounds-3/#border-radius).
 *
 * ## Skipped during bindings generation
 *
 * - field `bounds`: Graphene.Rect
 * - field `corner`: Fields with arrays are not supported
 */
public class RoundedRect(
    pointer: CPointer<GskRoundedRect>,
) : Record {
    public val gskRoundedRectPointer: CPointer<GskRoundedRect> = pointer

    /**
     * Checks if the given @point is inside the rounded rectangle.
     *
     * @param point the point to check
     * @return true if the @point is inside the rounded rectangle
     */
    public fun containsPoint(point: Point): Boolean =
        gsk_rounded_rect_contains_point(
            gskRoundedRectPointer.reinterpret(),
            point.graphenePointPointer.reinterpret()
        ).asBoolean()

    /**
     * Checks if the given @rect is contained inside the rounded rectangle.
     *
     * @param rect the rectangle to check
     * @return true if the @rect is fully contained inside the rounded rectangle
     */
    public fun containsRect(rect: Rect): Boolean =
        gsk_rounded_rect_contains_rect(
            gskRoundedRectPointer.reinterpret(),
            rect.grapheneRectPointer.reinterpret()
        ).asBoolean()

    /**
     * Initializes the given `GskRoundedRect` with the given values.
     *
     * This function will implicitly normalize the `GskRoundedRect`
     * before returning.
     *
     * @param bounds a `graphene_rect_t` describing the bounds
     * @param topLeft the rounding radius of the top left corner
     * @param topRight the rounding radius of the top right corner
     * @param bottomRight the rounding radius of the bottom right corner
     * @param bottomLeft the rounding radius of the bottom left corner
     * @return the initialized rectangle
     */
    public fun `init`(
        bounds: Rect,
        topLeft: Size,
        topRight: Size,
        bottomRight: Size,
        bottomLeft: Size,
    ): RoundedRect =
        gsk_rounded_rect_init(
            gskRoundedRectPointer.reinterpret(),
            bounds.grapheneRectPointer.reinterpret(),
            topLeft.grapheneSizePointer.reinterpret(),
            topRight.grapheneSizePointer.reinterpret(),
            bottomRight.grapheneSizePointer.reinterpret(),
            bottomLeft.grapheneSizePointer.reinterpret()
        )!!.run {
            RoundedRect(reinterpret())
        }

    /**
     * Initializes @self using the given @src rectangle.
     *
     * This function will not normalize the `GskRoundedRect`,
     * so make sure the source is normalized.
     *
     * @param src a `GskRoundedRect`
     * @return the initialized rectangle
     */
    public fun initCopy(src: RoundedRect): RoundedRect =
        gsk_rounded_rect_init_copy(gskRoundedRectPointer.reinterpret(), src.gskRoundedRectPointer.reinterpret())!!.run {
            RoundedRect(reinterpret())
        }

    /**
     * Initializes @self to the given @bounds and sets the radius
     * of all four corners to @radius.
     *
     * @param bounds a `graphene_rect_t`
     * @param radius the border radius
     * @return the initialized rectangle
     */
    public fun initFromRect(
        bounds: Rect,
        radius: Float,
    ): RoundedRect =
        gsk_rounded_rect_init_from_rect(
            gskRoundedRectPointer.reinterpret(),
            bounds.grapheneRectPointer.reinterpret(),
            radius
        )!!.run {
            RoundedRect(reinterpret())
        }

    /**
     * Checks if part of the given @rect is contained inside the rounded rectangle.
     *
     * @param rect the rectangle to check
     * @return true if the @rect intersects with the rounded rectangle
     */
    public fun intersectsRect(rect: Rect): Boolean =
        gsk_rounded_rect_intersects_rect(
            gskRoundedRectPointer.reinterpret(),
            rect.grapheneRectPointer.reinterpret()
        ).asBoolean()

    /**
     * Checks if all corners of @self are right angles and the
     * rectangle covers all of its bounds.
     *
     * This information can be used to decide if [ctor@Gsk.ClipNode.new]
     * or [ctor@Gsk.RoundedClipNode.new] should be called.
     *
     * @return true if the rectangle is rectilinear
     */
    public fun isRectilinear(): Boolean =
        gsk_rounded_rect_is_rectilinear(gskRoundedRectPointer.reinterpret()).asBoolean()

    /**
     * Normalizes the passed rectangle.
     *
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     *
     * @return the normalized rectangle
     */
    public fun normalize(): RoundedRect =
        gsk_rounded_rect_normalize(gskRoundedRectPointer.reinterpret())!!.run {
            RoundedRect(reinterpret())
        }

    /**
     * Offsets the bound's origin by @dx and @dy.
     *
     * The size and corners of the rectangle are unchanged.
     *
     * @param dx the horizontal offset
     * @param dy the vertical offset
     * @return the offset rectangle
     */
    public fun offset(
        dx: Float,
        dy: Float,
    ): RoundedRect =
        gsk_rounded_rect_offset(gskRoundedRectPointer.reinterpret(), dx, dy)!!.run {
            RoundedRect(reinterpret())
        }

    /**
     * Shrinks (or grows) the given rectangle by moving the 4 sides
     * according to the offsets given.
     *
     * The corner radii will be changed in a way that tries to keep
     * the center of the corner circle intact. This emulates CSS behavior.
     *
     * This function also works for growing rectangles if you pass
     * negative values for the @top, @right, @bottom or @left.
     *
     * @param top How far to move the top side downwards
     * @param right How far to move the right side to the left
     * @param bottom How far to move the bottom side upwards
     * @param left How far to move the left side to the right
     * @return the resized `GskRoundedRect`
     */
    public fun shrink(
        top: Float,
        right: Float,
        bottom: Float,
        left: Float,
    ): RoundedRect =
        gsk_rounded_rect_shrink(gskRoundedRectPointer.reinterpret(), top, right, bottom, left)!!.run {
            RoundedRect(reinterpret())
        }

    public companion object : RecordCompanion<RoundedRect, GskRoundedRect> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RoundedRect =
            RoundedRect(pointer.reinterpret())
    }
}
