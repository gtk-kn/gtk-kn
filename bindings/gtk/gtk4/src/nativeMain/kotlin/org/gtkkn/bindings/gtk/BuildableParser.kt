// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkBuildableParser

/**
 * A sub-parser for `GtkBuildable` implementations.
 *
 * ## Skipped during bindings generation
 *
 * - field `start_element`: Fields with callbacks are not supported
 * - field `end_element`: Fields with callbacks are not supported
 * - field `text`: Fields with callbacks are not supported
 * - field `error`: Fields with callbacks are not supported
 * - field `padding`: Record field padding is private
 */
public class BuildableParser(
    pointer: CPointer<GtkBuildableParser>,
) : Record {
    public val gtkBuildableParserPointer: CPointer<GtkBuildableParser> = pointer

    public companion object : RecordCompanion<BuildableParser, GtkBuildableParser> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): BuildableParser =
            BuildableParser(pointer.reinterpret())
    }
}
