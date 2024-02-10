// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.cairo.cairo_rectangle_t
import kotlin.Double

public class Rectangle(
    pointer: CPointer<cairo_rectangle_t>,
) : Record {
    public val cairoRectanglePointer: CPointer<cairo_rectangle_t> = pointer

    public var x: Double
        get() = cairoRectanglePointer.pointed.x
        set(`value`) {
            cairoRectanglePointer.pointed.x = value
        }

    public var y: Double
        get() = cairoRectanglePointer.pointed.y
        set(`value`) {
            cairoRectanglePointer.pointed.y = value
        }

    public var width: Double
        get() = cairoRectanglePointer.pointed.width
        set(`value`) {
            cairoRectanglePointer.pointed.width = value
        }

    public var height: Double
        get() = cairoRectanglePointer.pointed.height
        set(`value`) {
            cairoRectanglePointer.pointed.height = value
        }

    public companion object : RecordCompanion<Rectangle, cairo_rectangle_t> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rectangle = Rectangle(pointer.reinterpret())
    }
}
