// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GClosureNotifyData

/**
 * ## Skipped during bindings generation
 *
 * - field `data`: gpointer
 * - field `notify`: ClosureNotify
 */
public class ClosureNotifyData(
    pointer: CPointer<GClosureNotifyData>,
) : Record {
    public val gobjectClosureNotifyDataPointer: CPointer<GClosureNotifyData> = pointer

    public companion object : RecordCompanion<ClosureNotifyData, GClosureNotifyData> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ClosureNotifyData =
            ClosureNotifyData(pointer.reinterpret())
    }
}
