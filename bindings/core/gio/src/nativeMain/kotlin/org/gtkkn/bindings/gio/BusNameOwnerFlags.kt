// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GBusNameOwnerFlags
import org.gtkkn.native.gio.G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT
import org.gtkkn.native.gio.G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE
import org.gtkkn.native.gio.G_BUS_NAME_OWNER_FLAGS_NONE
import org.gtkkn.native.gio.G_BUS_NAME_OWNER_FLAGS_REPLACE

/**
 * Flags used in g_bus_own_name().
 * @since 2.26
 */
public class BusNameOwnerFlags(
    public val mask: GBusNameOwnerFlags,
) : Bitfield<BusNameOwnerFlags> {
    override infix fun or(other: BusNameOwnerFlags): BusNameOwnerFlags = BusNameOwnerFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: BusNameOwnerFlags = BusNameOwnerFlags(G_BUS_NAME_OWNER_FLAGS_NONE)

        /**
         * Allow another message bus connection to claim the name.
         */
        public val ALLOW_REPLACEMENT: BusNameOwnerFlags =
            BusNameOwnerFlags(G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT)

        /**
         * If another message bus connection owns the name and have
         * specified %G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, then take the name from the other
         * connection.
         */
        public val REPLACE: BusNameOwnerFlags = BusNameOwnerFlags(G_BUS_NAME_OWNER_FLAGS_REPLACE)

        /**
         * If another message bus connection owns the name, immediately
         * return an error from g_bus_own_name() rather than entering the waiting queue for that
         * name. (Since 2.54)
         */
        public val DO_NOT_QUEUE: BusNameOwnerFlags =
            BusNameOwnerFlags(G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE)
    }
}
