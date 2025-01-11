// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkEventSequence
import org.gtkkn.native.gdk.gdk_event_sequence_get_type
import org.gtkkn.native.gobject.GType

/**
 * `GdkEventSequence` is an opaque type representing a sequence
 * of related touch events.
 */
public class EventSequence(public val gdkEventSequencePointer: CPointer<GdkEventSequence>) :
    ProxyInstance(gdkEventSequencePointer) {
    public companion object {
        /**
         * Get the GType of EventSequence
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_event_sequence_get_type()
    }
}
