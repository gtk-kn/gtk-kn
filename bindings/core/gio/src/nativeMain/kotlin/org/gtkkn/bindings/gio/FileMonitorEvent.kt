// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GFileMonitorEvent

/**
 * Specifies what type of event a monitor event is.
 */
public enum class FileMonitorEvent(
    public val nativeValue: GFileMonitorEvent,
) {
    /**
     * a file changed.
     */
    CHANGED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGED),

    /**
     * a hint that this was probably the last change in a set of changes.
     */
    CHANGES_DONE_HINT(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT),

    /**
     * a file was deleted.
     */
    DELETED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_DELETED),

    /**
     * a file was created.
     */
    CREATED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CREATED),

    /**
     * a file attribute was changed.
     */
    ATTRIBUTE_CHANGED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED),

    /**
     * the file location will soon be unmounted.
     */
    PRE_UNMOUNT(GFileMonitorEvent.G_FILE_MONITOR_EVENT_PRE_UNMOUNT),

    /**
     * the file location was unmounted.
     */
    UNMOUNTED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_UNMOUNTED),

    /**
     * the file was moved -- only sent if the
     *   (deprecated) %G_FILE_MONITOR_SEND_MOVED flag is set
     */
    MOVED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED),

    /**
     * the file was renamed within the
     *   current directory -- only sent if the %G_FILE_MONITOR_WATCH_MOVES
     *   flag is set.  Since: 2.46.
     */
    RENAMED(GFileMonitorEvent.G_FILE_MONITOR_EVENT_RENAMED),

    /**
     * the file was moved into the
     *   monitored directory from another location -- only sent if the
     *   %G_FILE_MONITOR_WATCH_MOVES flag is set.  Since: 2.46.
     */
    MOVED_IN(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_IN),

    /**
     * the file was moved out of the
     *   monitored directory to another location -- only sent if the
     *   %G_FILE_MONITOR_WATCH_MOVES flag is set.  Since: 2.46
     */
    MOVED_OUT(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_OUT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GFileMonitorEvent): FileMonitorEvent =
            when (nativeValue) {
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGED -> CHANGED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT -> CHANGES_DONE_HINT
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_DELETED -> DELETED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_CREATED -> CREATED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED -> ATTRIBUTE_CHANGED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_PRE_UNMOUNT -> PRE_UNMOUNT
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_UNMOUNTED -> UNMOUNTED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED -> MOVED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_RENAMED -> RENAMED
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_IN -> MOVED_IN
                GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_OUT -> MOVED_OUT
                else -> error("invalid nativeValue")
            }
    }
}
