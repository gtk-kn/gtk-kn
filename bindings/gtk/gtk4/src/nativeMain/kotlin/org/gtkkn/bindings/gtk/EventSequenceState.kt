// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkEventSequenceState
import org.gtkkn.native.gtk.GtkEventSequenceState.GTK_EVENT_SEQUENCE_CLAIMED
import org.gtkkn.native.gtk.GtkEventSequenceState.GTK_EVENT_SEQUENCE_DENIED
import org.gtkkn.native.gtk.GtkEventSequenceState.GTK_EVENT_SEQUENCE_NONE

/**
 * Describes the state of a [struct@Gdk.EventSequence] in a [class@Gesture].
 */
public enum class EventSequenceState(
    public val nativeValue: GtkEventSequenceState,
) {
    /**
     * The sequence is handled, but not grabbed.
     */
    NONE(GTK_EVENT_SEQUENCE_NONE),

    /**
     * The sequence is handled and grabbed.
     */
    CLAIMED(GTK_EVENT_SEQUENCE_CLAIMED),

    /**
     * The sequence is denied.
     */
    DENIED(GTK_EVENT_SEQUENCE_DENIED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkEventSequenceState): EventSequenceState =
            when (nativeValue) {
                GTK_EVENT_SEQUENCE_NONE -> NONE
                GTK_EVENT_SEQUENCE_CLAIMED -> CLAIMED
                GTK_EVENT_SEQUENCE_DENIED -> DENIED
                else -> error("invalid nativeValue")
            }
    }
}
