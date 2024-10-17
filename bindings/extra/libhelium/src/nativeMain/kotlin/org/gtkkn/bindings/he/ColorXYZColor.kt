// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.he.HeColorXYZColor
import kotlin.Double

public class ColorXYZColor(
    pointer: CPointer<HeColorXYZColor>,
) : Record {
    public val heColorXYZColorPointer: CPointer<HeColorXYZColor> = pointer

    public var x: Double
        get() = heColorXYZColorPointer.pointed.x
        set(`value`) {
            heColorXYZColorPointer.pointed.x = value
        }

    public var y: Double
        get() = heColorXYZColorPointer.pointed.y
        set(`value`) {
            heColorXYZColorPointer.pointed.y = value
        }

    public var z: Double
        get() = heColorXYZColorPointer.pointed.z
        set(`value`) {
            heColorXYZColorPointer.pointed.z = value
        }

    public companion object : RecordCompanion<ColorXYZColor, HeColorXYZColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorXYZColor =
            ColorXYZColor(pointer.reinterpret())
    }
}
