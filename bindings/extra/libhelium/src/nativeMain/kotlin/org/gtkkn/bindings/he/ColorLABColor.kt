// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.he.HeColorLABColor
import kotlin.Double

/**
 * ## Skipped during bindings generation
 *
 * - parameter `lab`: He.HeLABColor
 */
public class ColorLABColor(
    pointer: CPointer<HeColorLABColor>,
) : Record {
    public val heColorLABColorPointer: CPointer<HeColorLABColor> = pointer

    public var l: Double
        get() = heColorLABColorPointer.pointed.l
        set(`value`) {
            heColorLABColorPointer.pointed.l = value
        }

    public var a: Double
        get() = heColorLABColorPointer.pointed.a
        set(`value`) {
            heColorLABColorPointer.pointed.a = value
        }

    public var b: Double
        get() = heColorLABColorPointer.pointed.b
        set(`value`) {
            heColorLABColorPointer.pointed.b = value
        }

    public companion object : RecordCompanion<ColorLABColor, HeColorLABColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorLABColor =
            ColorLABColor(pointer.reinterpret())
    }
}
