// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GFileMonitorFlags
import org.gtkkn.native.gio.G_FILE_MONITOR_NONE
import org.gtkkn.native.gio.G_FILE_MONITOR_SEND_MOVED
import org.gtkkn.native.gio.G_FILE_MONITOR_WATCH_HARD_LINKS
import org.gtkkn.native.gio.G_FILE_MONITOR_WATCH_MOUNTS
import org.gtkkn.native.gio.G_FILE_MONITOR_WATCH_MOVES

/**
 * Flags used to set what a #GFileMonitor will watch for.
 */
public class FileMonitorFlags(
    public val mask: GFileMonitorFlags,
) : Bitfield<FileMonitorFlags> {
    override infix fun or(other: FileMonitorFlags): FileMonitorFlags = FileMonitorFlags(mask or other.mask)

    public companion object {
        /**
         * No flags set.
         */
        public val NONE: FileMonitorFlags = FileMonitorFlags(G_FILE_MONITOR_NONE)

        /**
         * Watch for mount events.
         */
        public val WATCH_MOUNTS: FileMonitorFlags = FileMonitorFlags(G_FILE_MONITOR_WATCH_MOUNTS)

        /**
         * Pair DELETED and CREATED events caused
         *   by file renames (moves) and send a single G_FILE_MONITOR_EVENT_MOVED
         *   event instead (NB: not supported on all backends; the default
         *   behaviour -without specifying this flag- is to send single DELETED
         *   and CREATED events).  Deprecated since 2.46: use
         *   %G_FILE_MONITOR_WATCH_MOVES instead.
         */
        public val SEND_MOVED: FileMonitorFlags = FileMonitorFlags(G_FILE_MONITOR_SEND_MOVED)

        /**
         * Watch for changes to the file made
         *   via another hard link. Since 2.36.
         */
        public val WATCH_HARD_LINKS: FileMonitorFlags =
            FileMonitorFlags(G_FILE_MONITOR_WATCH_HARD_LINKS)

        /**
         * Watch for rename operations on a
         *   monitored directory.  This causes %G_FILE_MONITOR_EVENT_RENAMED,
         *   %G_FILE_MONITOR_EVENT_MOVED_IN and %G_FILE_MONITOR_EVENT_MOVED_OUT
         *   events to be emitted when possible.  Since: 2.46.
         */
        public val WATCH_MOVES: FileMonitorFlags = FileMonitorFlags(G_FILE_MONITOR_WATCH_MOVES)
    }
}
