// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gdk.gdk_rectangle_contains_point
import org.gtkkn.native.gdk.gdk_rectangle_equal
import org.gtkkn.native.gdk.gdk_rectangle_intersect
import org.gtkkn.native.gdk.gdk_rectangle_union
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * A `GdkRectangle` data type for representing rectangles.
 *
 * `GdkRectangle` is identical to `cairo_rectangle_t`. Together with Cairo’s
 * `cairo_region_t` data type, these are the central types for representing
 * sets of pixels.
 *
 * The intersection of two rectangles can be computed with
 * [method@Gdk.Rectangle.intersect]; to find the union of two rectangles use
 * [method@Gdk.Rectangle.union].
 *
 * The `cairo_region_t` type provided by Cairo is usually used for managing
 * non-rectangular clipping of graphical operations.
 *
 * The Graphene library has a number of other data types for regions and
 * volumes in 2D and 3D.
 */
public class Rectangle(
    pointer: CPointer<GdkRectangle>,
) : Record {
    public val gdkRectanglePointer: CPointer<GdkRectangle> = pointer

    /**
     * the x coordinate of the top left corner
     */
    public var x: Int
        get() = gdkRectanglePointer.pointed.x
        set(`value`) {
            gdkRectanglePointer.pointed.x = value
        }

    /**
     * the y coordinate of the top left corner
     */
    public var y: Int
        get() = gdkRectanglePointer.pointed.y
        set(`value`) {
            gdkRectanglePointer.pointed.y = value
        }

    /**
     * the width of the rectangle
     */
    public var width: Int
        get() = gdkRectanglePointer.pointed.width
        set(`value`) {
            gdkRectanglePointer.pointed.width = value
        }

    /**
     * the height of the rectangle
     */
    public var height: Int
        get() = gdkRectanglePointer.pointed.height
        set(`value`) {
            gdkRectanglePointer.pointed.height = value
        }

    /**
     * Returns true if @rect contains the point described by @x and @y.
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @return true if @rect contains the point
     */
    public fun containsPoint(
        x: Int,
        y: Int,
    ): Boolean = gdk_rectangle_contains_point(gdkRectanglePointer.reinterpret(), x, y).asBoolean()

    /**
     * Checks if the two given rectangles are equal.
     *
     * @param rect2 a `GdkRectangle`
     * @return true if the rectangles are equal.
     */
    public fun equal(rect2: Rectangle): Boolean =
        gdk_rectangle_equal(gdkRectanglePointer.reinterpret(), rect2.gdkRectanglePointer).asBoolean()

    /**
     * Calculates the intersection of two rectangles.
     *
     * It is allowed for @dest to be the same as either @src1 or @src2.
     * If the rectangles do not intersect, @dest’s width and height is set
     * to 0 and its x and y values are undefined. If you are only interested
     * in whether the rectangles intersect, but not in the intersecting area
     * itself, pass null for @dest.
     *
     * @param src2 a `GdkRectangle`
     * @param dest return location for the
     *   intersection of @src1 and @src2
     * @return true if the rectangles intersect.
     */
    public fun intersect(
        src2: Rectangle,
        dest: Rectangle?,
    ): Boolean =
        gdk_rectangle_intersect(
            gdkRectanglePointer.reinterpret(),
            src2.gdkRectanglePointer,
            dest?.gdkRectanglePointer
        ).asBoolean()

    /**
     * Calculates the union of two rectangles.
     *
     * The union of rectangles @src1 and @src2 is the smallest rectangle which
     * includes both @src1 and @src2 within it. It is allowed for @dest to be
     * the same as either @src1 or @src2.
     *
     * Note that this function does not ignore 'empty' rectangles (ie. with
     * zero width or height).
     *
     * @param src2 a `GdkRectangle`
     * @param dest return location for the union of @src1 and @src2
     */
    public fun union(
        src2: Rectangle,
        dest: Rectangle,
    ): Unit = gdk_rectangle_union(gdkRectanglePointer.reinterpret(), src2.gdkRectanglePointer, dest.gdkRectanglePointer)

    public companion object : RecordCompanion<Rectangle, GdkRectangle> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rectangle = Rectangle(pointer.reinterpret())
    }
}
