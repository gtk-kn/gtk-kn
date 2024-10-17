// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskStroke
import org.gtkkn.native.gsk.gsk_stroke_copy
import org.gtkkn.native.gsk.gsk_stroke_free
import org.gtkkn.native.gsk.gsk_stroke_get_dash_offset
import org.gtkkn.native.gsk.gsk_stroke_get_line_cap
import org.gtkkn.native.gsk.gsk_stroke_get_line_join
import org.gtkkn.native.gsk.gsk_stroke_get_line_width
import org.gtkkn.native.gsk.gsk_stroke_get_miter_limit
import org.gtkkn.native.gsk.gsk_stroke_new
import org.gtkkn.native.gsk.gsk_stroke_set_dash_offset
import org.gtkkn.native.gsk.gsk_stroke_set_line_cap
import org.gtkkn.native.gsk.gsk_stroke_set_line_join
import org.gtkkn.native.gsk.gsk_stroke_set_line_width
import org.gtkkn.native.gsk.gsk_stroke_set_miter_limit
import kotlin.Float
import kotlin.Unit

/**
 * A `GskStroke` struct collects the parameters that influence
 * the operation of stroking a path.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_dash`: n_dash: Out parameter is not supported
 * - parameter `dash`: Array parameter of type gfloat is not supported
 * - parameter `cr`: cairo.Context
 * - parameter `stroke1`: gpointer
 *
 * @since 4.14
 */
public class Stroke(
    pointer: CPointer<GskStroke>,
) : Record {
    public val gskStrokePointer: CPointer<GskStroke> = pointer

    /**
     * Creates a copy of the given @other stroke.
     *
     * @return a new `GskStroke`. Use [method@Gsk.Stroke.free] to free it
     * @since 4.14
     */
    public fun copy(): Stroke =
        gsk_stroke_copy(gskStrokePointer.reinterpret())!!.run {
            Stroke(reinterpret())
        }

    /**
     * Frees a `GskStroke`.
     *
     * @since 4.14
     */
    public fun free(): Unit = gsk_stroke_free(gskStrokePointer.reinterpret())

    /**
     * Returns the dash_offset of a `GskStroke`.
     *
     * @since 4.14
     */
    public fun getDashOffset(): Float = gsk_stroke_get_dash_offset(gskStrokePointer.reinterpret())

    /**
     * Gets the line cap used.
     *
     * See [enum@Gsk.LineCap] for details.
     *
     * @return The line cap
     * @since 4.14
     */
    public fun getLineCap(): LineCap =
        gsk_stroke_get_line_cap(gskStrokePointer.reinterpret()).run {
            LineCap.fromNativeValue(this)
        }

    /**
     * Gets the line join used.
     *
     * See [enum@Gsk.LineJoin] for details.
     *
     * @return The line join
     * @since 4.14
     */
    public fun getLineJoin(): LineJoin =
        gsk_stroke_get_line_join(gskStrokePointer.reinterpret()).run {
            LineJoin.fromNativeValue(this)
        }

    /**
     * Gets the line width used.
     *
     * @return The line width
     * @since 4.14
     */
    public fun getLineWidth(): Float = gsk_stroke_get_line_width(gskStrokePointer.reinterpret())

    /**
     * Returns the miter limit of a `GskStroke`.
     *
     * @since 4.14
     */
    public fun getMiterLimit(): Float = gsk_stroke_get_miter_limit(gskStrokePointer.reinterpret())

    /**
     * Sets the offset into the dash pattern where dashing should begin.
     *
     * This is an offset into the length of the path, not an index into
     * the array values of the dash array.
     *
     * See [method@Gsk.Stroke.set_dash] for more details on dashing.
     *
     * @param offset offset into the dash pattern
     * @since 4.14
     */
    public fun setDashOffset(offset: Float): Unit = gsk_stroke_set_dash_offset(gskStrokePointer.reinterpret(), offset)

    /**
     * Sets the line cap to be used when stroking.
     *
     * See [enum@Gsk.LineCap] for details.
     *
     * @param lineCap the `GskLineCap`
     * @since 4.14
     */
    public fun setLineCap(lineCap: LineCap): Unit =
        gsk_stroke_set_line_cap(gskStrokePointer.reinterpret(), lineCap.nativeValue)

    /**
     * Sets the line join to be used when stroking.
     *
     * See [enum@Gsk.LineJoin] for details.
     *
     * @param lineJoin The line join to use
     * @since 4.14
     */
    public fun setLineJoin(lineJoin: LineJoin): Unit =
        gsk_stroke_set_line_join(gskStrokePointer.reinterpret(), lineJoin.nativeValue)

    /**
     * Sets the line width to be used when stroking.
     *
     * The line width must be > 0.
     *
     * @param lineWidth width of the line in pixels
     * @since 4.14
     */
    public fun setLineWidth(lineWidth: Float): Unit =
        gsk_stroke_set_line_width(gskStrokePointer.reinterpret(), lineWidth)

    /**
     * Sets the limit for the distance from the corner where sharp
     * turns of joins get cut off.
     *
     * The miter limit is in units of line width and must be non-negative.
     *
     * For joins of type `GSK_LINE_JOIN_MITER` that exceed the miter
     * limit, the join gets rendered as if it was of type
     * `GSK_LINE_JOIN_BEVEL`.
     *
     * @param limit the miter limit
     * @since 4.14
     */
    public fun setMiterLimit(limit: Float): Unit = gsk_stroke_set_miter_limit(gskStrokePointer.reinterpret(), limit)

    public companion object : RecordCompanion<Stroke, GskStroke> {
        /**
         * Creates a new `GskStroke` with the given @line_width.
         *
         * @param lineWidth line width of the stroke. Must be > 0
         * @return a new `GskStroke`
         * @since 4.14
         */
        public fun new(lineWidth: Float): Stroke = Stroke(gsk_stroke_new(lineWidth)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Stroke = Stroke(pointer.reinterpret())
    }
}
