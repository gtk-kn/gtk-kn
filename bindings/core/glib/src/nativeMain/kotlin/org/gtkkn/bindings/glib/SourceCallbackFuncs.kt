// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GSourceCallbackFuncs

/**
 * The `GSourceCallbackFuncs` struct contains
 * functions for managing callback objects.
 *
 * ## Skipped during bindings generation
 *
 * - field `ref`: Fields with callbacks are not supported
 * - field `unref`: Fields with callbacks are not supported
 * - field `get`: Fields with callbacks are not supported
 */
public class SourceCallbackFuncs(
    pointer: CPointer<GSourceCallbackFuncs>,
) : Record {
    public val glibSourceCallbackFuncsPointer: CPointer<GSourceCallbackFuncs> = pointer

    public companion object : RecordCompanion<SourceCallbackFuncs, GSourceCallbackFuncs> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SourceCallbackFuncs =
            SourceCallbackFuncs(pointer.reinterpret())
    }
}
