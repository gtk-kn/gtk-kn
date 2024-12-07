// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.pango.PangoRectangle
import kotlinx.cinterop.alloc as nativePlacementAlloc

/**
 * The `PangoRectangle` structure represents a rectangle.
 *
 * `PangoRectangle` is frequently used to represent the logical or ink
 * extents of a single glyph or section of text. (See, for instance,
 * [method@Pango.Font.get_glyph_extents].)
 */
public class Rectangle(
    pointer: CPointer<PangoRectangle>,
) : Record {
    public val pangoRectanglePointer: CPointer<PangoRectangle> = pointer

    /**
     * X coordinate of the left side of the rectangle.
     */
    public var x: gint
        get() = pangoRectanglePointer.pointed.x
        set(`value`) {
            pangoRectanglePointer.pointed.x = value
        }

    /**
     * Y coordinate of the the top side of the rectangle.
     */
    public var y: gint
        get() = pangoRectanglePointer.pointed.y
        set(`value`) {
            pangoRectanglePointer.pointed.y = value
        }

    /**
     * width of the rectangle.
     */
    public var width: gint
        get() = pangoRectanglePointer.pointed.width
        set(`value`) {
            pangoRectanglePointer.pointed.width = value
        }

    /**
     * height of the rectangle.
     */
    public var height: gint
        get() = pangoRectanglePointer.pointed.height
        set(`value`) {
            pangoRectanglePointer.pointed.height = value
        }

    public companion object : RecordCompanion<Rectangle, PangoRectangle> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Rectangle = Rectangle(pointer.reinterpret())
    }
}
