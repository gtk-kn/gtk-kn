// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkEventSequence

/**
 * `GdkEventSequence` is an opaque type representing a sequence
 * of related touch events.
 */
public class EventSequence(
    pointer: CPointer<GdkEventSequence>,
) : Record {
    public val gdkEventSequencePointer: CPointer<GdkEventSequence> = pointer

    public companion object : RecordCompanion<EventSequence, GdkEventSequence> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): EventSequence =
            EventSequence(pointer.reinterpret())
    }
}
