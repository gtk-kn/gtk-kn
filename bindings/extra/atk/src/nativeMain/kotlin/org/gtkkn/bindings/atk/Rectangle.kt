// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkRectangle
import kotlin.Int

/**
 * A data structure for holding a rectangle. Those coordinates are
 * relative to the component top-level parent.
 */
public class Rectangle(
    pointer: CPointer<AtkRectangle>,
) : Record {
    public val atkRectanglePointer: CPointer<AtkRectangle> = pointer

    /**
     * X coordinate of the left side of the rectangle.
     */
    public var x: Int
        get() = atkRectanglePointer.pointed.x
        set(`value`) {
            atkRectanglePointer.pointed.x = value
        }

    /**
     * Y coordinate of the top side of the rectangle.
     */
    public var y: Int
        get() = atkRectanglePointer.pointed.y
        set(`value`) {
            atkRectanglePointer.pointed.y = value
        }

    /**
     * width of the rectangle.
     */
    public var width: Int
        get() = atkRectanglePointer.pointed.width
        set(`value`) {
            atkRectanglePointer.pointed.width = value
        }

    /**
     * height of the rectangle.
     */
    public var height: Int
        get() = atkRectanglePointer.pointed.height
        set(`value`) {
            atkRectanglePointer.pointed.height = value
        }

    public companion object : RecordCompanion<Rectangle, AtkRectangle> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rectangle = Rectangle(pointer.reinterpret())
    }
}
