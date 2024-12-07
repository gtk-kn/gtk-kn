// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkEventSequence
import org.gtkkn.native.gdk.gdk_event_sequence_get_type
import org.gtkkn.native.gobject.GType
import kotlinx.cinterop.alloc as nativePlacementAlloc

/**
 * `GdkEventSequence` is an opaque type representing a sequence
 * of related touch events.
 */
public class EventSequence(
    pointer: CPointer<GdkEventSequence>,
) : Record {
    public val gdkEventSequencePointer: CPointer<GdkEventSequence> = pointer

    public companion object : RecordCompanion<EventSequence, GdkEventSequence> {
        /**
         * Get the GType of EventSequence
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_event_sequence_get_type()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): EventSequence = EventSequence(pointer.reinterpret())
    }
}
