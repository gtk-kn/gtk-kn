// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkEventSequenceState
import org.gtkkn.native.gtk.gtk_event_sequence_state_get_type

/**
 * Describes the state of a [struct@Gdk.EventSequence] in a [class@Gesture].
 */
public enum class EventSequenceState(public val nativeValue: GtkEventSequenceState) {
    /**
     * The sequence is handled, but not grabbed.
     */
    NONE(GtkEventSequenceState.GTK_EVENT_SEQUENCE_NONE),

    /**
     * The sequence is handled and grabbed.
     */
    CLAIMED(GtkEventSequenceState.GTK_EVENT_SEQUENCE_CLAIMED),

    /**
     * The sequence is denied.
     */
    DENIED(GtkEventSequenceState.GTK_EVENT_SEQUENCE_DENIED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkEventSequenceState): EventSequenceState = when (nativeValue) {
            GtkEventSequenceState.GTK_EVENT_SEQUENCE_NONE -> NONE
            GtkEventSequenceState.GTK_EVENT_SEQUENCE_CLAIMED -> CLAIMED
            GtkEventSequenceState.GTK_EVENT_SEQUENCE_DENIED -> DENIED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of EventSequenceState
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_sequence_state_get_type()
    }
}
