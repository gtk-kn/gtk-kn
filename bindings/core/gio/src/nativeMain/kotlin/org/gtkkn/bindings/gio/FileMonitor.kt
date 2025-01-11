// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFile
import org.gtkkn.native.gio.GFileMonitor
import org.gtkkn.native.gio.GFileMonitorEvent
import org.gtkkn.native.gio.g_file_monitor_cancel
import org.gtkkn.native.gio.g_file_monitor_emit_event
import org.gtkkn.native.gio.g_file_monitor_get_type
import org.gtkkn.native.gio.g_file_monitor_is_cancelled
import org.gtkkn.native.gio.g_file_monitor_set_rate_limit
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * Monitors a file or directory for changes.
 *
 * To obtain a `GFileMonitor` for a file or directory, use
 * [method@Gio.File.monitor], [method@Gio.File.monitor_file], or
 * [method@Gio.File.monitor_directory].
 *
 * To get informed about changes to the file or directory you are
 * monitoring, connect to the [signal@Gio.FileMonitor::changed] signal. The
 * signal will be emitted in the thread-default main context (see
 * [method@GLib.MainContext.push_thread_default]) of the thread that the monitor
 * was created in (though if the global default main context is blocked, this
 * may cause notifications to be blocked even if the thread-default
 * context is still running).
 *
 * ## Skipped during bindings generation
 *
 * - method `cancelled`: Property has no getter nor setter
 * - method `rate-limit`: Property has no getter
 */
public abstract class FileMonitor(public val gioFileMonitorPointer: CPointer<GFileMonitor>) :
    Object(gioFileMonitorPointer.reinterpret()),
    KGTyped {
    /**
     * Cancels a file monitor.
     *
     * @return always true
     */
    public open fun cancel(): Boolean = g_file_monitor_cancel(gioFileMonitorPointer).asBoolean()

    /**
     * Emits the #GFileMonitor::changed signal if a change
     * has taken place. Should be called from file monitor
     * implementations only.
     *
     * Implementations are responsible to call this method from the
     * [thread-default main context][g-main-context-push-thread-default] of the
     * thread that the monitor was created in.
     *
     * @param child a #GFile.
     * @param otherFile a #GFile.
     * @param eventType a set of #GFileMonitorEvent flags.
     */
    public open fun emitEvent(child: File, otherFile: File, eventType: FileMonitorEvent): Unit =
        g_file_monitor_emit_event(
            gioFileMonitorPointer,
            child.gioFilePointer,
            otherFile.gioFilePointer,
            eventType.nativeValue
        )

    /**
     * Returns whether the monitor is canceled.
     *
     * @return true if monitor is canceled. false otherwise.
     */
    public open fun isCancelled(): Boolean = g_file_monitor_is_cancelled(gioFileMonitorPointer).asBoolean()

    /**
     * Sets the rate limit to which the @monitor will report
     * consecutive change events to the same file.
     *
     * @param limitMsecs a non-negative integer with the limit in milliseconds
     *     to poll for changes
     */
    public open fun setRateLimit(limitMsecs: gint): Unit =
        g_file_monitor_set_rate_limit(gioFileMonitorPointer, limitMsecs)

    /**
     * Emitted when @file has been changed.
     *
     * If using %G_FILE_MONITOR_WATCH_MOVES on a directory monitor, and
     * the information is available (and if supported by the backend),
     * @event_type may be %G_FILE_MONITOR_EVENT_RENAMED,
     * %G_FILE_MONITOR_EVENT_MOVED_IN or %G_FILE_MONITOR_EVENT_MOVED_OUT.
     *
     * In all cases @file will be a child of the monitored directory.  For
     * renames, @file will be the old name and @other_file is the new
     * name.  For "moved in" events, @file is the name of the file that
     * appeared and @other_file is the old name that it was moved from (in
     * another directory).  For "moved out" events, @file is the name of
     * the file that used to be in this directory and @other_file is the
     * name of the file at its new location.
     *
     * It makes sense to treat %G_FILE_MONITOR_EVENT_MOVED_IN as
     * equivalent to %G_FILE_MONITOR_EVENT_CREATED and
     * %G_FILE_MONITOR_EVENT_MOVED_OUT as equivalent to
     * %G_FILE_MONITOR_EVENT_DELETED, with extra information.
     * %G_FILE_MONITOR_EVENT_RENAMED is equivalent to a delete/create
     * pair.  This is exactly how the events will be reported in the case
     * that the %G_FILE_MONITOR_WATCH_MOVES flag is not in use.
     *
     * If using the deprecated flag %G_FILE_MONITOR_SEND_MOVED flag and @event_type is
     * %G_FILE_MONITOR_EVENT_MOVED, @file will be set to a #GFile containing the
     * old path, and @other_file will be set to a #GFile containing the new path.
     *
     * In all the other cases, @other_file will be set to #NULL.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `file` a #GFile.; `otherFile` a #GFile or #NULL.; `eventType` a #GFileMonitorEvent.
     */
    public fun onChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            `file`: File,
            otherFile: File?,
            eventType: FileMonitorEvent,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gioFileMonitorPointer,
        "changed",
        onChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "changed" signal. See [onChanged].
     *
     * @param file a #GFile.
     * @param otherFile a #GFile or #NULL.
     * @param eventType a #GFileMonitorEvent.
     */
    public fun emitChanged(`file`: File, otherFile: File?, eventType: FileMonitorEvent) {
        g_signal_emit_by_name(
            gioFileMonitorPointer.reinterpret(),
            "changed",
            `file`.gioFilePointer,
            otherFile?.gioFilePointer,
            eventType.nativeValue
        )
    }

    /**
     * The FileMonitorImpl type represents a native instance of the abstract FileMonitor class.
     *
     * @constructor Creates a new instance of FileMonitor for the provided [CPointer].
     */
    public class FileMonitorImpl(pointer: CPointer<GFileMonitor>) : FileMonitor(pointer)

    public companion object : TypeCompanion<FileMonitor> {
        override val type: GeneratedClassKGType<FileMonitor> =
            GeneratedClassKGType(g_file_monitor_get_type()) { FileMonitorImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FileMonitor
         *
         * @return the GType
         */
        public fun getType(): GType = g_file_monitor_get_type()
    }
}

private val onChangedFunc: CPointer<
    CFunction<
        (
            CPointer<GFile>,
            CPointer<GFile>?,
            GFileMonitorEvent,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        `file`: CPointer<GFile>?,
        otherFile: CPointer<GFile>?,
        eventType: GFileMonitorEvent,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            `file`: File,
            otherFile: File?,
            eventType: FileMonitorEvent,
        ) -> Unit
        >().get().invoke(
        `file`!!.run {
            File.FileImpl(reinterpret())
        },
        otherFile?.run {
            File.FileImpl(reinterpret())
        },
        eventType.run {
            FileMonitorEvent.fromNativeValue(this)
        }
    )
}
    .reinterpret()
