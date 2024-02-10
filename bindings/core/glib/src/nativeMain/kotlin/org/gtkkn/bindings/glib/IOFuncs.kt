// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GIOFuncs

/**
 * A table of functions used to handle different types of #GIOChannel
 * in a generic way.
 *
 * ## Skipped during bindings generation
 *
 * - field `io_read`: Fields with callbacks are not supported
 * - field `io_write`: Fields with callbacks are not supported
 * - field `io_seek`: Fields with callbacks are not supported
 * - field `io_close`: Fields with callbacks are not supported
 * - field `io_create_watch`: Fields with callbacks are not supported
 * - field `io_free`: Fields with callbacks are not supported
 * - field `io_set_flags`: Fields with callbacks are not supported
 * - field `io_get_flags`: Fields with callbacks are not supported
 */
public class IOFuncs(
    pointer: CPointer<GIOFuncs>,
) : Record {
    public val glibIOFuncsPointer: CPointer<GIOFuncs> = pointer

    public companion object : RecordCompanion<IOFuncs, GIOFuncs> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): IOFuncs = IOFuncs(pointer.reinterpret())
    }
}
