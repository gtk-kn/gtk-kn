// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_AFTER_PAINT
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_LAYOUT
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_NONE
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_PAINT
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS
import org.gtkkn.native.gdk.GDK_FRAME_CLOCK_PHASE_UPDATE
import org.gtkkn.native.gdk.GdkFrameClockPhase
import org.gtkkn.native.gdk.gdk_frame_clock_phase_get_type
import org.gtkkn.native.gobject.GType

/**
 * Used to represent the different paint clock phases that can be requested.
 *
 * The elements of the enumeration correspond to the signals of `GdkFrameClock`.
 */
public class FrameClockPhase(public val mask: GdkFrameClockPhase) : Bitfield<FrameClockPhase> {
    override infix fun or(other: FrameClockPhase): FrameClockPhase = FrameClockPhase(mask or other.mask)

    public companion object {
        /**
         * no phase
         */
        public val NONE: FrameClockPhase = FrameClockPhase(GDK_FRAME_CLOCK_PHASE_NONE)

        /**
         * corresponds to GdkFrameClock::flush-events. Should not be handled by applications.
         */
        public val FLUSH_EVENTS: FrameClockPhase =
            FrameClockPhase(GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS)

        /**
         * corresponds to GdkFrameClock::before-paint. Should not be handled by applications.
         */
        public val BEFORE_PAINT: FrameClockPhase =
            FrameClockPhase(GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT)

        /**
         * corresponds to GdkFrameClock::update.
         */
        public val UPDATE: FrameClockPhase = FrameClockPhase(GDK_FRAME_CLOCK_PHASE_UPDATE)

        /**
         * corresponds to GdkFrameClock::layout. Should not be handled by applications.
         */
        public val LAYOUT: FrameClockPhase = FrameClockPhase(GDK_FRAME_CLOCK_PHASE_LAYOUT)

        /**
         * corresponds to GdkFrameClock::paint.
         */
        public val PAINT: FrameClockPhase = FrameClockPhase(GDK_FRAME_CLOCK_PHASE_PAINT)

        /**
         * corresponds to GdkFrameClock::resume-events. Should not be handled by applications.
         */
        public val RESUME_EVENTS: FrameClockPhase =
            FrameClockPhase(GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS)

        /**
         * corresponds to GdkFrameClock::after-paint. Should not be handled by applications.
         */
        public val AFTER_PAINT: FrameClockPhase = FrameClockPhase(GDK_FRAME_CLOCK_PHASE_AFTER_PAINT)

        /**
         * Get the GType of FrameClockPhase
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_frame_clock_phase_get_type()
    }
}
