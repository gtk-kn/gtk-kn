// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.graphene.Size
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gfloat
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
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
 * - field `bounds`: Field with not-pointer record/union graphene_rect_t is not supported
 * - field `corner`: Array parameter of type Graphene.Size is not supported
 */
public class RoundedRect(pointer: CPointer<GskRoundedRect>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GskRoundedRect> = pointer

    /**
     * Allocate a new RoundedRect.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GskRoundedRect>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to RoundedRect and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GskRoundedRect>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new RoundedRect using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GskRoundedRect>().ptr)

    /**
     * Checks if the given @point is inside the rounded rectangle.
     *
     * @param point the point to check
     * @return true if the @point is inside the rounded rectangle
     */
    public fun containsPoint(point: Point): Boolean =
        gsk_rounded_rect_contains_point(gPointer, point.gPointer).asBoolean()

    /**
     * Checks if the given @rect is contained inside the rounded rectangle.
     *
     * @param rect the rectangle to check
     * @return true if the @rect is fully contained inside the rounded rectangle
     */
    public fun containsRect(rect: Rect): Boolean = gsk_rounded_rect_contains_rect(gPointer, rect.gPointer).asBoolean()

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
    public fun `init`(bounds: Rect, topLeft: Size, topRight: Size, bottomRight: Size, bottomLeft: Size): RoundedRect =
        gsk_rounded_rect_init(
            gPointer,
            bounds.gPointer,
            topLeft.gPointer,
            topRight.gPointer,
            bottomRight.gPointer,
            bottomLeft.gPointer
        )!!.run {
            RoundedRect(this)
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
    public fun initCopy(src: RoundedRect): RoundedRect = gsk_rounded_rect_init_copy(gPointer, src.gPointer)!!.run {
        RoundedRect(this)
    }

    /**
     * Initializes @self to the given @bounds and sets the radius
     * of all four corners to @radius.
     *
     * @param bounds a `graphene_rect_t`
     * @param radius the border radius
     * @return the initialized rectangle
     */
    public fun initFromRect(bounds: Rect, radius: gfloat): RoundedRect =
        gsk_rounded_rect_init_from_rect(gPointer, bounds.gPointer, radius)!!.run {
            RoundedRect(this)
        }

    /**
     * Checks if part of the given @rect is contained inside the rounded rectangle.
     *
     * @param rect the rectangle to check
     * @return true if the @rect intersects with the rounded rectangle
     */
    public fun intersectsRect(rect: Rect): Boolean =
        gsk_rounded_rect_intersects_rect(gPointer, rect.gPointer).asBoolean()

    /**
     * Checks if all corners of @self are right angles and the
     * rectangle covers all of its bounds.
     *
     * This information can be used to decide if [ctor@Gsk.ClipNode.new]
     * or [ctor@Gsk.RoundedClipNode.new] should be called.
     *
     * @return true if the rectangle is rectilinear
     */
    public fun isRectilinear(): Boolean = gsk_rounded_rect_is_rectilinear(gPointer).asBoolean()

    /**
     * Normalizes the passed rectangle.
     *
     * This function will ensure that the bounds of the rectangle
     * are normalized and ensure that the corner values are positive
     * and the corners do not overlap.
     *
     * @return the normalized rectangle
     */
    public fun normalize(): RoundedRect = gsk_rounded_rect_normalize(gPointer)!!.run {
        RoundedRect(this)
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
    public fun offset(dx: gfloat, dy: gfloat): RoundedRect = gsk_rounded_rect_offset(gPointer, dx, dy)!!.run {
        RoundedRect(this)
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
    public fun shrink(top: gfloat, right: gfloat, bottom: gfloat, left: gfloat): RoundedRect =
        gsk_rounded_rect_shrink(gPointer, top, right, bottom, left)!!.run {
            RoundedRect(this)
        }
}
