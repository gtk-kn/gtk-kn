// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.he.HeColorRGBColor
import kotlin.Double

public class ColorRGBColor(
    pointer: CPointer<HeColorRGBColor>,
) : Record {
    public val heColorRGBColorPointer: CPointer<HeColorRGBColor> = pointer

    public var r: Double
        get() = heColorRGBColorPointer.pointed.r
        set(`value`) {
            heColorRGBColorPointer.pointed.r = value
        }

    public var g: Double
        get() = heColorRGBColorPointer.pointed.g
        set(`value`) {
            heColorRGBColorPointer.pointed.g = value
        }

    public var b: Double
        get() = heColorRGBColorPointer.pointed.b
        set(`value`) {
            heColorRGBColorPointer.pointed.b = value
        }

    public companion object : RecordCompanion<ColorRGBColor, HeColorRGBColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorRGBColor =
            ColorRGBColor(pointer.reinterpret())
    }
}
