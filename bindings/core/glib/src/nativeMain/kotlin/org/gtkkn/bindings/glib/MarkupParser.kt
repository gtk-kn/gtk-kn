// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GMarkupParser

/**
 * Any of the fields in #GMarkupParser can be null, in which case they
 * will be ignored. Except for the @error function, any of these callbacks
 * can set an error; in particular the %G_MARKUP_ERROR_UNKNOWN_ELEMENT,
 * %G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE, and %G_MARKUP_ERROR_INVALID_CONTENT
 * errors are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 *
 * ## Skipped during bindings generation
 *
 * - field `start_element`: Fields with callbacks are not supported
 * - field `end_element`: Fields with callbacks are not supported
 * - field `text`: Fields with callbacks are not supported
 * - field `passthrough`: Fields with callbacks are not supported
 * - field `error`: Fields with callbacks are not supported
 */
public class MarkupParser(
    pointer: CPointer<GMarkupParser>,
) : Record {
    public val glibMarkupParserPointer: CPointer<GMarkupParser> = pointer

    public companion object : RecordCompanion<MarkupParser, GMarkupParser> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): MarkupParser =
            MarkupParser(pointer.reinterpret())
    }
}
