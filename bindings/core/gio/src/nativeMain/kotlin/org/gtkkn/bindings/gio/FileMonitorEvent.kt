// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileMonitorEvent
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGED
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_CREATED
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_DELETED
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_IN
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_OUT
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_PRE_UNMOUNT
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_RENAMED
import org.gtkkn.native.gio.GFileMonitorEvent.G_FILE_MONITOR_EVENT_UNMOUNTED

/**
 * Specifies what type of event a monitor event is.
 */
public enum class FileMonitorEvent(
    public val nativeValue: GFileMonitorEvent,
) {
    /**
     * a file changed.
     */
    CHANGED(G_FILE_MONITOR_EVENT_CHANGED),

    /**
     * a hint that this was probably the last change in a set of changes.
     */
    CHANGES_DONE_HINT(G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT),

    /**
     * a file was deleted.
     */
    DELETED(G_FILE_MONITOR_EVENT_DELETED),

    /**
     * a file was created.
     */
    CREATED(G_FILE_MONITOR_EVENT_CREATED),

    /**
     * a file attribute was changed.
     */
    ATTRIBUTE_CHANGED(G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED),

    /**
     * the file location will soon be unmounted.
     */
    PRE_UNMOUNT(G_FILE_MONITOR_EVENT_PRE_UNMOUNT),

    /**
     * the file location was unmounted.
     */
    UNMOUNTED(G_FILE_MONITOR_EVENT_UNMOUNTED),

    /**
     * the file was moved -- only sent if the
     *   (deprecated) %G_FILE_MONITOR_SEND_MOVED flag is set
     */
    MOVED(G_FILE_MONITOR_EVENT_MOVED),

    /**
     * the file was renamed within the
     *   current directory -- only sent if the %G_FILE_MONITOR_WATCH_MOVES
     *   flag is set.  Since: 2.46.
     */
    RENAMED(G_FILE_MONITOR_EVENT_RENAMED),

    /**
     * the file was moved into the
     *   monitored directory from another location -- only sent if the
     *   %G_FILE_MONITOR_WATCH_MOVES flag is set.  Since: 2.46.
     */
    MOVED_IN(G_FILE_MONITOR_EVENT_MOVED_IN),

    /**
     * the file was moved out of the
     *   monitored directory to another location -- only sent if the
     *   %G_FILE_MONITOR_WATCH_MOVES flag is set.  Since: 2.46
     */
    MOVED_OUT(G_FILE_MONITOR_EVENT_MOVED_OUT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileMonitorEvent): FileMonitorEvent =
            when (nativeValue) {
                G_FILE_MONITOR_EVENT_CHANGED -> CHANGED
                G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT -> CHANGES_DONE_HINT
                G_FILE_MONITOR_EVENT_DELETED -> DELETED
                G_FILE_MONITOR_EVENT_CREATED -> CREATED
                G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED -> ATTRIBUTE_CHANGED
                G_FILE_MONITOR_EVENT_PRE_UNMOUNT -> PRE_UNMOUNT
                G_FILE_MONITOR_EVENT_UNMOUNTED -> UNMOUNTED
                G_FILE_MONITOR_EVENT_MOVED -> MOVED
                G_FILE_MONITOR_EVENT_RENAMED -> RENAMED
                G_FILE_MONITOR_EVENT_MOVED_IN -> MOVED_IN
                G_FILE_MONITOR_EVENT_MOVED_OUT -> MOVED_OUT
                else -> error("invalid nativeValue")
            }
    }
}
