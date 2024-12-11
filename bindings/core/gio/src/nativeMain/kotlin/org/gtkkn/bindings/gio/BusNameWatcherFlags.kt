// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GBusNameWatcherFlags
import org.gtkkn.native.gio.G_BUS_NAME_WATCHER_FLAGS_AUTO_START
import org.gtkkn.native.gio.G_BUS_NAME_WATCHER_FLAGS_NONE
import org.gtkkn.native.gio.g_bus_name_watcher_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used in g_bus_watch_name().
 * @since 2.26
 */
public class BusNameWatcherFlags(public val mask: GBusNameWatcherFlags) : Bitfield<BusNameWatcherFlags> {
    override infix fun or(other: BusNameWatcherFlags): BusNameWatcherFlags = BusNameWatcherFlags(mask or other.mask)

    @GioVersion2_26
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

        /**
         * Get the GType of BusNameWatcherFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_bus_name_watcher_flags_get_type()
    }
}
