// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.he.HeColorLCHColor
import kotlin.Double

public class ColorLCHColor(
    pointer: CPointer<HeColorLCHColor>,
) : Record {
    public val heColorLCHColorPointer: CPointer<HeColorLCHColor> = pointer

    public var l: Double
        get() = heColorLCHColorPointer.pointed.l
        set(`value`) {
            heColorLCHColorPointer.pointed.l = value
        }

    public var c: Double
        get() = heColorLCHColorPointer.pointed.c
        set(`value`) {
            heColorLCHColorPointer.pointed.c = value
        }

    public var h: Double
        get() = heColorLCHColorPointer.pointed.h
        set(`value`) {
            heColorLCHColorPointer.pointed.h = value
        }

    public companion object : RecordCompanion<ColorLCHColor, HeColorLCHColor> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorLCHColor =
            ColorLCHColor(pointer.reinterpret())
    }
}
