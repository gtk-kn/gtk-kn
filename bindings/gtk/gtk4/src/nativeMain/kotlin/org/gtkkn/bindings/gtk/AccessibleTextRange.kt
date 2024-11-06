// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkAccessibleTextRange
import kotlin.ULong

/**
 * A range inside the text of an accessible object.
 * @since 4.14
 */
@GtkVersion4_14
public class AccessibleTextRange(
    pointer: CPointer<GtkAccessibleTextRange>,
) : Record {
    public val gtkAccessibleTextRangePointer: CPointer<GtkAccessibleTextRange> = pointer

    /**
     * the start of the range, in characters
     */
    public var start: ULong
        get() = gtkAccessibleTextRangePointer.pointed.start
        set(`value`) {
            gtkAccessibleTextRangePointer.pointed.start = value
        }

    /**
     * the length of the range, in characters
     */
    public var length: ULong
        get() = gtkAccessibleTextRangePointer.pointed.length
        set(`value`) {
            gtkAccessibleTextRangePointer.pointed.length = value
        }

    public companion object : RecordCompanion<AccessibleTextRange, GtkAccessibleTextRange> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AccessibleTextRange =
            AccessibleTextRange(pointer.reinterpret())
    }
}
