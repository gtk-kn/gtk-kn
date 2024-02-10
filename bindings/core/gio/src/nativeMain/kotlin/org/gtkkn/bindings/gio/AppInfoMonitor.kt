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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAppInfoMonitor
import org.gtkkn.native.gio.g_app_info_monitor_get
import org.gtkkn.native.gio.g_app_info_monitor_get_type
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.ULong
import kotlin.Unit

/**
 * #GAppInfoMonitor is a very simple object used for monitoring the app
 * info database for changes (ie: newly installed or removed
 * applications).
 *
 * Call g_app_info_monitor_get() to get a #GAppInfoMonitor and connect
 * to the "changed" signal.
 *
 * In the usual case, applications should try to make note of the change
 * (doing things like invalidating caches) but not act on it.  In
 * particular, applications should avoid making calls to #GAppInfo APIs
 * in response to the change signal, deferring these until the time that
 * the data is actually required.  The exception to this case is when
 * application information is actually being displayed on the screen
 * (eg: during a search or when the list of all applications is shown).
 * The reason for this is that changes to the list of installed
 * applications often come in groups (like during system updates) and
 * rescanning the list on every change is pointless and expensive.
 * @since 2.40
 */
public open class AppInfoMonitor(
    pointer: CPointer<GAppInfoMonitor>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioAppInfoMonitorPointer: CPointer<GAppInfoMonitor>
        get() = gPointer.reinterpret()

    /**
     * Signal emitted when the app info database for changes (ie: newly installed
     * or removed applications).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<AppInfoMonitor> {
        override val type: GeneratedClassKGType<AppInfoMonitor> =
            GeneratedClassKGType(g_app_info_monitor_get_type()) {
                AppInfoMonitor(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets the #GAppInfoMonitor for the current thread-default main
         * context.
         *
         * The #GAppInfoMonitor will emit a "changed" signal in the
         * thread-default main context whenever the list of installed
         * applications (as reported by g_app_info_get_all()) may have changed.
         *
         * You must only call g_object_unref() on the return value from under
         * the same main context as you created it.
         *
         * @return a reference to a #GAppInfoMonitor
         * @since 2.40
         */
        public fun `get`(): AppInfoMonitor =
            g_app_info_monitor_get()!!.run {
                AppInfoMonitor(reinterpret())
            }
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
