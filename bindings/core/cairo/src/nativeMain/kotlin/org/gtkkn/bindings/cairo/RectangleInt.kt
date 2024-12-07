// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.cairo.cairo_gobject_rectangle_int_get_type
import org.gtkkn.native.cairo.cairo_rectangle_int_t
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import kotlinx.cinterop.alloc as nativePlacementAlloc

public class RectangleInt(
    pointer: CPointer<cairo_rectangle_int_t>,
) : Record {
    public val cairoRectangleIntPointer: CPointer<cairo_rectangle_int_t> = pointer

    public var x: gint
        get() = cairoRectangleIntPointer.pointed.x
        set(`value`) {
            cairoRectangleIntPointer.pointed.x = value
        }

    public var y: gint
        get() = cairoRectangleIntPointer.pointed.y
        set(`value`) {
            cairoRectangleIntPointer.pointed.y = value
        }

    public var width: gint
        get() = cairoRectangleIntPointer.pointed.width
        set(`value`) {
            cairoRectangleIntPointer.pointed.width = value
        }

    public var height: gint
        get() = cairoRectangleIntPointer.pointed.height
        set(`value`) {
            cairoRectangleIntPointer.pointed.height = value
        }

    public companion object : RecordCompanion<RectangleInt, cairo_rectangle_int_t> {
        /**
         * Get the GType of RectangleInt
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_rectangle_int_get_type()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RectangleInt = RectangleInt(pointer.reinterpret())
    }
}
