// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.he.HeColorHCTColor
import kotlin.Double
import kotlin.Int

public class ColorHCTColor(
    pointer: CPointer<HeColorHCTColor>,
) : Record {
    public val heColorHCTColorPointer: CPointer<HeColorHCTColor> = pointer

    public var h: Double
        get() = heColorHCTColorPointer.pointed.h
        set(`value`) {
            heColorHCTColorPointer.pointed.h = value
        }

    public var c: Double
        get() = heColorHCTColorPointer.pointed.c
        set(`value`) {
            heColorHCTColorPointer.pointed.c = value
        }

    public var t: Double
        get() = heColorHCTColorPointer.pointed.t
        set(`value`) {
            heColorHCTColorPointer.pointed.t = value
        }

    public var a: Int
        get() = heColorHCTColorPointer.pointed.a
        set(`value`) {
            heColorHCTColorPointer.pointed.a = value
        }

    public companion object : RecordCompanion<ColorHCTColor, HeColorHCTColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorHCTColor =
            ColorHCTColor(pointer.reinterpret())
    }
}
