// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gdk.gdk_rectangle_contains_point
import org.gtkkn.native.gdk.gdk_rectangle_equal
import org.gtkkn.native.gdk.gdk_rectangle_get_type
import org.gtkkn.native.gdk.gdk_rectangle_intersect
import org.gtkkn.native.gdk.gdk_rectangle_union
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
public class Rectangle(pointer: CPointer<GdkRectangle>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gdkRectanglePointer: CPointer<GdkRectangle> = pointer

    /**
     * the x coordinate of the top left corner
     */
    public var x: gint
        get() = gdkRectanglePointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            gdkRectanglePointer.pointed.x = value
        }

    /**
     * the y coordinate of the top left corner
     */
    public var y: gint
        get() = gdkRectanglePointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            gdkRectanglePointer.pointed.y = value
        }

    /**
     * the width of the rectangle
     */
    public var width: gint
        get() = gdkRectanglePointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            gdkRectanglePointer.pointed.width = value
        }

    /**
     * the height of the rectangle
     */
    public var height: gint
        get() = gdkRectanglePointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            gdkRectanglePointer.pointed.height = value
        }

    /**
     * Allocate a new Rectangle.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GdkRectangle>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Rectangle and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GdkRectangle>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Rectangle using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkRectangle>().ptr)

    /**
     * Allocate a new Rectangle.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public constructor(
        x: gint,
        y: gint,
        width: gint,
        height: gint,
    ) : this() {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    /**
     * Allocate a new Rectangle using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        x: gint,
        y: gint,
        width: gint,
        height: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    /**
     * Returns true if @rect contains the point described by @x and @y.
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @return true if @rect contains the point
     */
    public fun containsPoint(x: gint, y: gint): Boolean =
        gdk_rectangle_contains_point(gdkRectanglePointer.reinterpret(), x, y).asBoolean()

    /**
     * Checks if the two given rectangles are equal.
     *
     * @param rect2 a `GdkRectangle`
     * @return true if the rectangles are equal.
     */
    public fun equal(rect2: Rectangle): Boolean =
        gdk_rectangle_equal(gdkRectanglePointer.reinterpret(), rect2.gdkRectanglePointer.reinterpret()).asBoolean()

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
    public fun intersect(src2: Rectangle, dest: Rectangle?): Boolean = gdk_rectangle_intersect(
        gdkRectanglePointer.reinterpret(),
        src2.gdkRectanglePointer.reinterpret(),
        dest?.gdkRectanglePointer?.reinterpret()
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
    public fun union(src2: Rectangle, dest: Rectangle): Unit = gdk_rectangle_union(
        gdkRectanglePointer.reinterpret(),
        src2.gdkRectanglePointer.reinterpret(),
        dest.gdkRectanglePointer.reinterpret()
    )

    override fun toString(): String = "Rectangle(x=$x, y=$y, width=$width, height=$height)"

    public companion object {
        /**
         * Get the GType of Rectangle
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_rectangle_get_type()
    }
}
