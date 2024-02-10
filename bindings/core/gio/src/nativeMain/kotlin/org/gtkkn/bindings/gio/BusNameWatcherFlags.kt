// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GBusNameWatcherFlags
import org.gtkkn.native.gio.G_BUS_NAME_WATCHER_FLAGS_AUTO_START
import org.gtkkn.native.gio.G_BUS_NAME_WATCHER_FLAGS_NONE

/**
 * Flags used in g_bus_watch_name().
 * @since 2.26
 */
public class BusNameWatcherFlags(
    public val mask: GBusNameWatcherFlags,
) : Bitfield<BusNameWatcherFlags> {
    override infix fun or(other: BusNameWatcherFlags): BusNameWatcherFlags = BusNameWatcherFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: BusNameWatcherFlags = BusNameWatcherFlags(G_BUS_NAME_WATCHER_FLAGS_NONE)

        /**
         * If no-one owns the name when
         * beginning to watch the name, ask the bus to launch an owner for the
         * name.
         */
        public val AUTO_START: BusNameWatcherFlags =
            BusNameWatcherFlags(G_BUS_NAME_WATCHER_FLAGS_AUTO_START)
    }
}
