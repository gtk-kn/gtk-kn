// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.cairo.cairo_gobject_region_get_type
import org.gtkkn.native.cairo.cairo_region_contains_point
import org.gtkkn.native.cairo.cairo_region_contains_rectangle
import org.gtkkn.native.cairo.cairo_region_copy
import org.gtkkn.native.cairo.cairo_region_create
import org.gtkkn.native.cairo.cairo_region_create_rectangle
import org.gtkkn.native.cairo.cairo_region_equal
import org.gtkkn.native.cairo.cairo_region_get_extents
import org.gtkkn.native.cairo.cairo_region_get_rectangle
import org.gtkkn.native.cairo.cairo_region_intersect
import org.gtkkn.native.cairo.cairo_region_intersect_rectangle
import org.gtkkn.native.cairo.cairo_region_is_empty
import org.gtkkn.native.cairo.cairo_region_num_rectangles
import org.gtkkn.native.cairo.cairo_region_status
import org.gtkkn.native.cairo.cairo_region_subtract
import org.gtkkn.native.cairo.cairo_region_subtract_rectangle
import org.gtkkn.native.cairo.cairo_region_t
import org.gtkkn.native.cairo.cairo_region_translate
import org.gtkkn.native.cairo.cairo_region_union
import org.gtkkn.native.cairo.cairo_region_union_rectangle
import org.gtkkn.native.cairo.cairo_region_xor
import org.gtkkn.native.cairo.cairo_region_xor_rectangle
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 *
 * @since 1.10
 */
@CairoVersion1_10
public class Region(pointer: CPointer<cairo_region_t>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<cairo_region_t> = pointer

    public fun copy(): Region = cairo_region_copy(gPointer.reinterpret())!!.run {
        Region(reinterpret())
    }

    public fun status(): Status = cairo_region_status(gPointer.reinterpret()).run {
        Status.fromNativeValue(this)
    }

    public fun getExtents(extents: RectangleInt): Unit =
        cairo_region_get_extents(gPointer.reinterpret(), extents.gPointer.reinterpret())

    public fun numRectangles(): gint = cairo_region_num_rectangles(gPointer.reinterpret())

    public fun getRectangle(nth: gint, rectangle: RectangleInt): Unit =
        cairo_region_get_rectangle(gPointer.reinterpret(), nth, rectangle.gPointer.reinterpret())

    public fun isEmpty(): Boolean = cairo_region_is_empty(gPointer.reinterpret()).asBoolean()

    public fun containsPoint(x: gint, y: gint): Boolean =
        cairo_region_contains_point(gPointer.reinterpret(), x, y).asBoolean()

    public fun containsRectangle(rectangle: RectangleInt): RegionOverlap =
        cairo_region_contains_rectangle(gPointer.reinterpret(), rectangle.gPointer.reinterpret()).run {
            RegionOverlap.fromNativeValue(this)
        }

    public fun equal(other: Region): Boolean =
        cairo_region_equal(gPointer.reinterpret(), other.gPointer.reinterpret()).asBoolean()

    public fun translate(dx: gint, dy: gint): Unit = cairo_region_translate(gPointer.reinterpret(), dx, dy)

    public fun intersect(other: Region): Status =
        cairo_region_intersect(gPointer.reinterpret(), other.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public fun intersectRectangle(rectangle: RectangleInt): Status =
        cairo_region_intersect_rectangle(gPointer.reinterpret(), rectangle.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public fun subtract(other: Region): Status =
        cairo_region_subtract(gPointer.reinterpret(), other.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public fun subtractRectangle(rectangle: RectangleInt): Status =
        cairo_region_subtract_rectangle(gPointer.reinterpret(), rectangle.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public fun union(other: Region): Status =
        cairo_region_union(gPointer.reinterpret(), other.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public fun unionRectangle(rectangle: RectangleInt): Status =
        cairo_region_union_rectangle(gPointer.reinterpret(), rectangle.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public fun xor(other: Region): Status = cairo_region_xor(gPointer.reinterpret(), other.gPointer.reinterpret()).run {
        Status.fromNativeValue(this)
    }

    public fun xorRectangle(rectangle: RectangleInt): Status =
        cairo_region_xor_rectangle(gPointer.reinterpret(), rectangle.gPointer.reinterpret()).run {
            Status.fromNativeValue(this)
        }

    public companion object {
        public fun create(): Region = Region(cairo_region_create()!!.reinterpret())

        public fun createRectangle(rectangle: RectangleInt): Region =
            Region(cairo_region_create_rectangle(rectangle.gPointer.reinterpret())!!.reinterpret())

        /**
         * Get the GType of Region
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_region_get_type()
    }
}
