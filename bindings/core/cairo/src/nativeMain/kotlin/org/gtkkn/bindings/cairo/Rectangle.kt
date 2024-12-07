// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.cairo.cairo_gobject_rectangle_get_type
import org.gtkkn.native.cairo.cairo_rectangle_t
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gdouble
import kotlinx.cinterop.alloc as nativePlacementAlloc

public class Rectangle(
    pointer: CPointer<cairo_rectangle_t>,
) : Record {
    public val cairoRectanglePointer: CPointer<cairo_rectangle_t> = pointer

    public var x: gdouble
        get() = cairoRectanglePointer.pointed.x
        set(`value`) {
            cairoRectanglePointer.pointed.x = value
        }

    public var y: gdouble
        get() = cairoRectanglePointer.pointed.y
        set(`value`) {
            cairoRectanglePointer.pointed.y = value
        }

    public var width: gdouble
        get() = cairoRectanglePointer.pointed.width
        set(`value`) {
            cairoRectanglePointer.pointed.width = value
        }

    public var height: gdouble
        get() = cairoRectanglePointer.pointed.height
        set(`value`) {
            cairoRectanglePointer.pointed.height = value
        }

    public companion object : RecordCompanion<Rectangle, cairo_rectangle_t> {
        /**
         * Get the GType of Rectangle
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_rectangle_get_type()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rectangle = Rectangle(pointer.reinterpret())
    }
}
