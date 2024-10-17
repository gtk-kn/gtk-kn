// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.he.HeColorCAM16Color
import kotlin.Double

public class ColorCAM16Color(
    pointer: CPointer<HeColorCAM16Color>,
) : Record {
    public val heColorCAM16ColorPointer: CPointer<HeColorCAM16Color> = pointer

    public var j: Double
        get() = heColorCAM16ColorPointer.pointed.j
        set(`value`) {
            heColorCAM16ColorPointer.pointed.j = value
        }

    public var a: Double
        get() = heColorCAM16ColorPointer.pointed.a
        set(`value`) {
            heColorCAM16ColorPointer.pointed.a = value
        }

    public var b: Double
        get() = heColorCAM16ColorPointer.pointed.b
        set(`value`) {
            heColorCAM16ColorPointer.pointed.b = value
        }

    public var c: Double
        get() = heColorCAM16ColorPointer.pointed.c
        set(`value`) {
            heColorCAM16ColorPointer.pointed.c = value
        }

    public var h: Double
        get() = heColorCAM16ColorPointer.pointed.h
        set(`value`) {
            heColorCAM16ColorPointer.pointed.h = value
        }

    public var m: Double
        get() = heColorCAM16ColorPointer.pointed.m
        set(`value`) {
            heColorCAM16ColorPointer.pointed.m = value
        }

    public var s: Double
        get() = heColorCAM16ColorPointer.pointed.s
        set(`value`) {
            heColorCAM16ColorPointer.pointed.s = value
        }

    public companion object : RecordCompanion<ColorCAM16Color, HeColorCAM16Color> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ColorCAM16Color =
            ColorCAM16Color(pointer.reinterpret())
    }
}
