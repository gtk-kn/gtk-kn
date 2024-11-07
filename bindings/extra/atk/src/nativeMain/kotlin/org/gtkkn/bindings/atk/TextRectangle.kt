// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkTextRectangle
import kotlin.Int

/**
 * A structure used to store a rectangle used by AtkText.
 */
public class TextRectangle(
    pointer: CPointer<AtkTextRectangle>,
) : Record {
    public val atkTextRectanglePointer: CPointer<AtkTextRectangle> = pointer

    /**
     * The horizontal coordinate of a rectangle
     */
    public var x: Int
        get() = atkTextRectanglePointer.pointed.x
        set(`value`) {
            atkTextRectanglePointer.pointed.x = value
        }

    /**
     * The vertical coordinate of a rectangle
     */
    public var y: Int
        get() = atkTextRectanglePointer.pointed.y
        set(`value`) {
            atkTextRectanglePointer.pointed.y = value
        }

    /**
     * The width of a rectangle
     */
    public var width: Int
        get() = atkTextRectanglePointer.pointed.width
        set(`value`) {
            atkTextRectanglePointer.pointed.width = value
        }

    /**
     * The height of a rectangle
     */
    public var height: Int
        get() = atkTextRectanglePointer.pointed.height
        set(`value`) {
            atkTextRectanglePointer.pointed.height = value
        }

    public companion object : RecordCompanion<TextRectangle, AtkTextRectangle> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TextRectangle =
            TextRectangle(pointer.reinterpret())
    }
}
