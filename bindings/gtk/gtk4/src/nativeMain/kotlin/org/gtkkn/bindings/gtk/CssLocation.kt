// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkCssLocation
import kotlin.ULong

public class CssLocation(
    pointer: CPointer<GtkCssLocation>,
) : Record {
    public val gtkCssLocationPointer: CPointer<GtkCssLocation> = pointer

    public var bytes: ULong
        get() = gtkCssLocationPointer.pointed.bytes
        set(`value`) {
            gtkCssLocationPointer.pointed.bytes = value
        }

    public var chars: ULong
        get() = gtkCssLocationPointer.pointed.chars
        set(`value`) {
            gtkCssLocationPointer.pointed.chars = value
        }

    public var lines: ULong
        get() = gtkCssLocationPointer.pointed.lines
        set(`value`) {
            gtkCssLocationPointer.pointed.lines = value
        }

    public var lineBytes: ULong
        get() = gtkCssLocationPointer.pointed.line_bytes
        set(`value`) {
            gtkCssLocationPointer.pointed.line_bytes = value
        }

    public var lineChars: ULong
        get() = gtkCssLocationPointer.pointed.line_chars
        set(`value`) {
            gtkCssLocationPointer.pointed.line_chars = value
        }

    public companion object : RecordCompanion<CssLocation, GtkCssLocation> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): CssLocation =
            CssLocation(pointer.reinterpret())
    }
}
