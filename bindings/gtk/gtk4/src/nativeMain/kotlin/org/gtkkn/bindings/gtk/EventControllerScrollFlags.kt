// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES
import org.gtkkn.native.gtk.GTK_EVENT_CONTROLLER_SCROLL_DISCRETE
import org.gtkkn.native.gtk.GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL
import org.gtkkn.native.gtk.GTK_EVENT_CONTROLLER_SCROLL_KINETIC
import org.gtkkn.native.gtk.GTK_EVENT_CONTROLLER_SCROLL_NONE
import org.gtkkn.native.gtk.GTK_EVENT_CONTROLLER_SCROLL_VERTICAL
import org.gtkkn.native.gtk.GtkEventControllerScrollFlags
import org.gtkkn.native.gtk.gtk_event_controller_scroll_flags_get_type

/**
 * Describes the behavior of a `GtkEventControllerScroll`.
 */
public class EventControllerScrollFlags(public val mask: GtkEventControllerScrollFlags) :
    Bitfield<EventControllerScrollFlags> {
    override infix fun or(other: EventControllerScrollFlags): EventControllerScrollFlags = EventControllerScrollFlags(
        mask or other.mask
    )

    public companion object {
        /**
         * Don't emit scroll.
         */
        public val NONE: EventControllerScrollFlags =
            EventControllerScrollFlags(GTK_EVENT_CONTROLLER_SCROLL_NONE)

        /**
         * Emit scroll with vertical deltas.
         */
        public val VERTICAL: EventControllerScrollFlags =
            EventControllerScrollFlags(GTK_EVENT_CONTROLLER_SCROLL_VERTICAL)

        /**
         * Emit scroll with horizontal deltas.
         */
        public val HORIZONTAL: EventControllerScrollFlags =
            EventControllerScrollFlags(GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL)

        /**
         * Only emit deltas that are multiples of 1.
         */
        public val DISCRETE: EventControllerScrollFlags =
            EventControllerScrollFlags(GTK_EVENT_CONTROLLER_SCROLL_DISCRETE)

        /**
         * Emit ::decelerate after continuous scroll finishes.
         */
        public val KINETIC: EventControllerScrollFlags =
            EventControllerScrollFlags(GTK_EVENT_CONTROLLER_SCROLL_KINETIC)

        /**
         * Emit scroll on both axes.
         */
        public val BOTH_AXES: EventControllerScrollFlags =
            EventControllerScrollFlags(GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES)

        /**
         * Get the GType of EventControllerScrollFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_scroll_flags_get_type()
    }
}
