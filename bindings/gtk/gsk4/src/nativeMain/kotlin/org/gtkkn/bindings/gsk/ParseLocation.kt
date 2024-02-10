// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gsk.GskParseLocation
import kotlin.ULong

/**
 * A location in a parse buffer.
 */
public class ParseLocation(
    pointer: CPointer<GskParseLocation>,
) : Record {
    public val gskParseLocationPointer: CPointer<GskParseLocation> = pointer

    /**
     * the offset of the location in the parse buffer, as bytes
     */
    public var bytes: ULong
        get() = gskParseLocationPointer.pointed.bytes
        set(`value`) {
            gskParseLocationPointer.pointed.bytes = value
        }

    /**
     * the offset of the location in the parse buffer, as characters
     */
    public var chars: ULong
        get() = gskParseLocationPointer.pointed.chars
        set(`value`) {
            gskParseLocationPointer.pointed.chars = value
        }

    /**
     * the line of the location in the parse buffer
     */
    public var lines: ULong
        get() = gskParseLocationPointer.pointed.lines
        set(`value`) {
            gskParseLocationPointer.pointed.lines = value
        }

    /**
     * the position in the line, as bytes
     */
    public var lineBytes: ULong
        get() = gskParseLocationPointer.pointed.line_bytes
        set(`value`) {
            gskParseLocationPointer.pointed.line_bytes = value
        }

    /**
     * the position in the line, as characters
     */
    public var lineChars: ULong
        get() = gskParseLocationPointer.pointed.line_chars
        set(`value`) {
            gskParseLocationPointer.pointed.line_chars = value
        }

    public companion object : RecordCompanion<ParseLocation, GskParseLocation> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ParseLocation =
            ParseLocation(pointer.reinterpret())
    }
}
