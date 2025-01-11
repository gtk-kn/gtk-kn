// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.annotations.GioVersion2_64
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.GMemoryMonitor
import org.gtkkn.native.gio.GMemoryMonitorWarningLevel
import org.gtkkn.native.gio.g_memory_monitor_dup_default
import org.gtkkn.native.gio.g_memory_monitor_get_type
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.ULong
import kotlin.Unit

/**
 * `GMemoryMonitor` will monitor system memory and suggest to the application
 * when to free memory so as to leave more room for other applications.
 * It is implemented on Linux using the
 * [Low Memory Monitor](https://gitlab.freedesktop.org/hadess/low-memory-monitor/)
 * ([API documentation](https://hadess.pages.freedesktop.org/low-memory-monitor/)).
 *
 * There is also an implementation for use inside Flatpak sandboxes.
 *
 * Possible actions to take when the signal is received are:
 *
 *  - Free caches
 *  - Save files that haven’t been looked at in a while to disk, ready to be reopened when needed
 *  - Run a garbage collection cycle
 *  - Try and compress fragmented allocations
 *  - Exit on idle if the process has no reason to stay around
 *  - Call [`malloc_trim(3)`](man:malloc_trim(3)) to return cached heap pages to
 *    the kernel (if supported by your libc)
 *
 * Note that some actions may not always improve system performance, and so
 * should be profiled for your application. `malloc_trim()`, for example, may
 * make future heap allocations slower (due to releasing cached heap pages back
 * to the kernel).
 *
 * See [type@Gio.MemoryMonitorWarningLevel] for details on the various warning
 * levels.
 *
 * ```c
 * static void
 * warning_cb (GMemoryMonitor *m, GMemoryMonitorWarningLevel level)
 * {
 *   g_debug ("Warning level: %d", level);
 *   if (warning_level > G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *     drop_caches ();
 * }
 *
 * static GMemoryMonitor *
 * monitor_low_memory (void)
 * {
 *   GMemoryMonitor *m;
 *   m = g_memory_monitor_dup_default ();
 *   g_signal_connect (G_OBJECT (m), "low-memory-warning",
 *                     G_CALLBACK (warning_cb), NULL);
 *   return m;
 * }
 * ```
 *
 * Don’t forget to disconnect the [signal@Gio.MemoryMonitor::low-memory-warning]
 * signal, and unref the `GMemoryMonitor` itself when exiting.
 * @since 2.64
 */
@GioVersion2_64
public interface MemoryMonitor :
    Proxy,
    Initable,
    KGTyped {
    public val gioMemoryMonitorPointer: CPointer<GMemoryMonitor>

    override val gioInitablePointer: CPointer<GInitable>
        get() = gioMemoryMonitorPointer.reinterpret()

    /**
     * Emitted when the system is running low on free memory. The signal
     * handler should then take the appropriate action depending on the
     * warning level. See the #GMemoryMonitorWarningLevel documentation for
     * details.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `level` the #GMemoryMonitorWarningLevel warning level
     * @since 2.64
     */
    @GioVersion2_64
    public fun onLowMemoryWarning(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (level: MemoryMonitorWarningLevel) -> Unit,
    ): ULong = g_signal_connect_data(
        gioMemoryMonitorPointer,
        "low-memory-warning",
        onLowMemoryWarningFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The MemoryMonitorImpl type represents a native instance of the MemoryMonitor interface.
     *
     * @constructor Creates a new instance of MemoryMonitor for the provided [CPointer].
     */
    public data class MemoryMonitorImpl(override val gioMemoryMonitorPointer: CPointer<GMemoryMonitor>) :
        Object(gioMemoryMonitorPointer.reinterpret()),
        MemoryMonitor

    public companion object : TypeCompanion<MemoryMonitor> {
        override val type: GeneratedInterfaceKGType<MemoryMonitor> =
            GeneratedInterfaceKGType(g_memory_monitor_get_type()) { MemoryMonitorImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets a reference to the default #GMemoryMonitor for the system.
         *
         * @return a new reference to the default #GMemoryMonitor
         * @since 2.64
         */
        @GioVersion2_64
        public fun dupDefault(): MemoryMonitor = g_memory_monitor_dup_default()!!.run {
            MemoryMonitorImpl(reinterpret())
        }

        /**
         * Get the GType of MemoryMonitor
         *
         * @return the GType
         */
        public fun getType(): GType = g_memory_monitor_get_type()
    }
}

private val onLowMemoryWarningFunc: CPointer<CFunction<(GMemoryMonitorWarningLevel) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            level: GMemoryMonitorWarningLevel,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(level: MemoryMonitorWarningLevel) -> Unit>().get().invoke(
            level.run {
                MemoryMonitorWarningLevel.fromNativeValue(this)
            }
        )
    }
        .reinterpret()
