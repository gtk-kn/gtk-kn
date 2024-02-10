// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_ALL
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_ALL_POINTING
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_KEYBOARD
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_NONE
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_POINTER
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_TABLET_PAD
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_TABLET_STYLUS
import org.gtkkn.native.gdk.GDK_SEAT_CAPABILITY_TOUCH
import org.gtkkn.native.gdk.GdkSeatCapabilities

/**
 * Flags describing the seat capabilities.
 */
public class SeatCapabilities(
    public val mask: GdkSeatCapabilities,
) : Bitfield<SeatCapabilities> {
    override infix fun or(other: SeatCapabilities): SeatCapabilities = SeatCapabilities(mask or other.mask)

    public companion object {
        /**
         * No input capabilities
         */
        public val NONE: SeatCapabilities = SeatCapabilities(GDK_SEAT_CAPABILITY_NONE)

        /**
         * The seat has a pointer (e.g. mouse)
         */
        public val POINTER: SeatCapabilities = SeatCapabilities(GDK_SEAT_CAPABILITY_POINTER)

        /**
         * The seat has touchscreen(s) attached
         */
        public val TOUCH: SeatCapabilities = SeatCapabilities(GDK_SEAT_CAPABILITY_TOUCH)

        /**
         * The seat has drawing tablet(s) attached
         */
        public val TABLET_STYLUS: SeatCapabilities =
            SeatCapabilities(GDK_SEAT_CAPABILITY_TABLET_STYLUS)

        /**
         * The seat has keyboard(s) attached
         */
        public val KEYBOARD: SeatCapabilities = SeatCapabilities(GDK_SEAT_CAPABILITY_KEYBOARD)

        /**
         * The seat has drawing tablet pad(s) attached
         */
        public val TABLET_PAD: SeatCapabilities = SeatCapabilities(GDK_SEAT_CAPABILITY_TABLET_PAD)

        /**
         * The union of all pointing capabilities
         */
        public val ALL_POINTING: SeatCapabilities =
            SeatCapabilities(GDK_SEAT_CAPABILITY_ALL_POINTING)

        /**
         * The union of all capabilities
         */
        public val ALL: SeatCapabilities = SeatCapabilities(GDK_SEAT_CAPABILITY_ALL)
    }
}
