// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.cairo.cairo_rectangle_int_t
import kotlin.Int

public class RectangleInt(
    pointer: CPointer<cairo_rectangle_int_t>,
) : Record {
    public val cairoRectangleIntPointer: CPointer<cairo_rectangle_int_t> = pointer

    public var x: Int
        get() = cairoRectangleIntPointer.pointed.x
        set(`value`) {
            cairoRectangleIntPointer.pointed.x = value
        }

    public var y: Int
        get() = cairoRectangleIntPointer.pointed.y
        set(`value`) {
            cairoRectangleIntPointer.pointed.y = value
        }

    public var width: Int
        get() = cairoRectangleIntPointer.pointed.width
        set(`value`) {
            cairoRectangleIntPointer.pointed.width = value
        }

    public var height: Int
        get() = cairoRectangleIntPointer.pointed.height
        set(`value`) {
            cairoRectangleIntPointer.pointed.height = value
        }

    public companion object : RecordCompanion<RectangleInt, cairo_rectangle_int_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): RectangleInt =
            RectangleInt(pointer.reinterpret())
    }
}
