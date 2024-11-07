// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkTextRange
import kotlin.Int
import kotlin.String

/**
 * A structure used to describe a text range.
 *
 * ## Skipped during bindings generation
 *
 * - field `bounds`: TextRectangle
 */
public class TextRange(
    pointer: CPointer<AtkTextRange>,
) : Record {
    public val atkTextRangePointer: CPointer<AtkTextRange> = pointer

    /**
     * The start offset of a AtkTextRange
     */
    public var startOffset: Int
        get() = atkTextRangePointer.pointed.start_offset
        set(`value`) {
            atkTextRangePointer.pointed.start_offset = value
        }

    /**
     * The end offset of a AtkTextRange
     */
    public var endOffset: Int
        get() = atkTextRangePointer.pointed.end_offset
        set(`value`) {
            atkTextRangePointer.pointed.end_offset = value
        }

    /**
     * The text in the text range
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val content: String?
        get() = atkTextRangePointer.pointed.content?.toKString()

    public companion object : RecordCompanion<TextRange, AtkTextRange> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TextRange = TextRange(pointer.reinterpret())
    }
}
