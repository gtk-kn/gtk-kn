// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.cairo.cairo_gobject_region_get_type
import org.gtkkn.native.cairo.cairo_region_contains_point
import org.gtkkn.native.cairo.cairo_region_contains_rectangle
import org.gtkkn.native.cairo.cairo_region_copy
import org.gtkkn.native.cairo.cairo_region_create
import org.gtkkn.native.cairo.cairo_region_create_rectangle
import org.gtkkn.native.cairo.cairo_region_destroy
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
public class Region(public val cairoRegionPointer: CPointer<cairo_region_t>) : ProxyInstance(cairoRegionPointer) {
    public constructor() : this(cairo_region_create()!!) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_region_destroy(it.reinterpret()) }
    }

    public constructor(rectangle: RectangleInt) : this(
        cairo_region_create_rectangle(rectangle.cairoRectangleIntPointer)!!
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { cairo_region_destroy(it.reinterpret()) }
    }

    public fun copy(): Region = cairo_region_copy(cairoRegionPointer)!!.run {
        Region(this)
    }

    public fun status(): Status = cairo_region_status(cairoRegionPointer).run {
        Status.fromNativeValue(this)
    }

    public fun getExtents(extents: RectangleInt): Unit =
        cairo_region_get_extents(cairoRegionPointer, extents.cairoRectangleIntPointer)

    public fun numRectangles(): gint = cairo_region_num_rectangles(cairoRegionPointer)

    public fun getRectangle(nth: gint, rectangle: RectangleInt): Unit =
        cairo_region_get_rectangle(cairoRegionPointer, nth, rectangle.cairoRectangleIntPointer)

    public fun isEmpty(): Boolean = cairo_region_is_empty(cairoRegionPointer).asBoolean()

    public fun containsPoint(x: gint, y: gint): Boolean =
        cairo_region_contains_point(cairoRegionPointer, x, y).asBoolean()

    public fun containsRectangle(rectangle: RectangleInt): RegionOverlap =
        cairo_region_contains_rectangle(cairoRegionPointer, rectangle.cairoRectangleIntPointer).run {
            RegionOverlap.fromNativeValue(this)
        }

    public fun equal(other: Region): Boolean =
        cairo_region_equal(cairoRegionPointer, other.cairoRegionPointer).asBoolean()

    public fun translate(dx: gint, dy: gint): Unit = cairo_region_translate(cairoRegionPointer, dx, dy)

    public fun intersect(other: Region): Status =
        cairo_region_intersect(cairoRegionPointer, other.cairoRegionPointer).run {
            Status.fromNativeValue(this)
        }

    public fun intersectRectangle(rectangle: RectangleInt): Status =
        cairo_region_intersect_rectangle(cairoRegionPointer, rectangle.cairoRectangleIntPointer).run {
            Status.fromNativeValue(this)
        }

    public fun subtract(other: Region): Status =
        cairo_region_subtract(cairoRegionPointer, other.cairoRegionPointer).run {
            Status.fromNativeValue(this)
        }

    public fun subtractRectangle(rectangle: RectangleInt): Status =
        cairo_region_subtract_rectangle(cairoRegionPointer, rectangle.cairoRectangleIntPointer).run {
            Status.fromNativeValue(this)
        }

    public fun union(other: Region): Status = cairo_region_union(cairoRegionPointer, other.cairoRegionPointer).run {
        Status.fromNativeValue(this)
    }

    public fun unionRectangle(rectangle: RectangleInt): Status =
        cairo_region_union_rectangle(cairoRegionPointer, rectangle.cairoRectangleIntPointer).run {
            Status.fromNativeValue(this)
        }

    public fun xor(other: Region): Status = cairo_region_xor(cairoRegionPointer, other.cairoRegionPointer).run {
        Status.fromNativeValue(this)
    }

    public fun xorRectangle(rectangle: RectangleInt): Status =
        cairo_region_xor_rectangle(cairoRegionPointer, rectangle.cairoRectangleIntPointer).run {
            Status.fromNativeValue(this)
        }

    public companion object {
        /**
         * Get the GType of Region
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_region_get_type()
    }
}
