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

/**
 * Represents a location in a file or other source of data parsed
 * by the CSS engine.
 *
 * The @bytes and @line_bytes offsets are meant to be used to
 * programmatically match data. The @lines and @line_chars offsets
 * can be used for printing the location in a file.
 *
 * Note that the @lines parameter starts from 0 and is increased
 * whenever a CSS line break is encountered. (CSS defines the C character
 * sequences "\r\n", "\r", "\n" and "\f" as newlines.)
 * If your document uses different rules for line breaking, you might want
 * run into problems here.
 */
public class CssLocation(
    pointer: CPointer<GtkCssLocation>,
) : Record {
    public val gtkCssLocationPointer: CPointer<GtkCssLocation> = pointer

    /**
     * number of bytes parsed since the beginning
     */
    public var bytes: ULong
        get() = gtkCssLocationPointer.pointed.bytes
        set(`value`) {
            gtkCssLocationPointer.pointed.bytes = value
        }

    /**
     * number of characters parsed since the beginning
     */
    public var chars: ULong
        get() = gtkCssLocationPointer.pointed.chars
        set(`value`) {
            gtkCssLocationPointer.pointed.chars = value
        }

    /**
     * number of full lines that have been parsed. If you want to
     *   display this as a line number, you need to add 1 to this.
     */
    public var lines: ULong
        get() = gtkCssLocationPointer.pointed.lines
        set(`value`) {
            gtkCssLocationPointer.pointed.lines = value
        }

    /**
     * Number of bytes parsed since the last line break
     */
    public var lineBytes: ULong
        get() = gtkCssLocationPointer.pointed.line_bytes
        set(`value`) {
            gtkCssLocationPointer.pointed.line_bytes = value
        }

    /**
     * Number of characters parsed since the last line break
     */
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
