// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.native.gdk.gdk_seat_capabilities_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags describing the seat capabilities.
 */
public class SeatCapabilities(public val mask: GdkSeatCapabilities) : Bitfield<SeatCapabilities> {
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

        /**
         * Get the GType of SeatCapabilities
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_seat_capabilities_get_type()
    }
}
