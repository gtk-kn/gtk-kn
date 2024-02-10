// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkPageRange
import kotlin.Int

/**
 * A range of pages to print.
 *
 * See also [method@Gtk.PrintSettings.set_page_ranges].
 */
public class PageRange(
    pointer: CPointer<GtkPageRange>,
) : Record {
    public val gtkPageRangePointer: CPointer<GtkPageRange> = pointer

    /**
     * start of page range.
     */
    public var start: Int
        get() = gtkPageRangePointer.pointed.start
        set(`value`) {
            gtkPageRangePointer.pointed.start = value
        }

    /**
     * end of page range.
     */
    public var end: Int
        get() = gtkPageRangePointer.pointed.end
        set(`value`) {
            gtkPageRangePointer.pointed.end = value
        }

    public companion object : RecordCompanion<PageRange, GtkPageRange> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PageRange = PageRange(pointer.reinterpret())
    }
}
