// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_26
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.webkit.WebKitGeolocationManager
import org.gtkkn.native.webkit.webkit_geolocation_manager_failed
import org.gtkkn.native.webkit.webkit_geolocation_manager_get_enable_high_accuracy
import org.gtkkn.native.webkit.webkit_geolocation_manager_get_type
import org.gtkkn.native.webkit.webkit_geolocation_manager_update_position
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Geolocation manager.
 *
 * WebKitGeolocationManager provides API to get the geographical position of the user.
 * Once a #WebKitGeolocationPermissionRequest is allowed, when WebKit needs to know the
 * user location #WebKitGeolocationManager::start signal is emitted. If the signal is handled
 * and returns true, the application is responsible for providing the position every time it's
 * updated by calling webkit_geolocation_manager_update_position(). The signal #WebKitGeolocationManager::stop
 * will be emitted when location updates are no longer needed.
 * @since 2.26
 */
@WebKitVersion2_26
public class GeolocationManager(pointer: CPointer<WebKitGeolocationManager>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitGeolocationManagerPointer: CPointer<WebKitGeolocationManager>
        get() = gPointer.reinterpret()

    /**
     * Whether high accuracy is enabled. This is a read-only property that will be
     * set to true when a #WebKitGeolocationManager needs to get accurate position updates.
     * You can connect to notify::enable-high-accuracy signal to monitor it.
     *
     * @since 2.26
     */
    @WebKitVersion2_26
    public val enableHighAccuracy: Boolean
        /**
         * Get whether high accuracy is enabled.
         *
         * @return Whether the setting is enabled.
         * @since 2.26
         */
        get() = webkit_geolocation_manager_get_enable_high_accuracy(
            webkitGeolocationManagerPointer.reinterpret()
        ).asBoolean()

    /**
     * Notify @manager that determining the position failed.
     *
     * @param errorMessage the error message
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun failed(errorMessage: String): Unit =
        webkit_geolocation_manager_failed(webkitGeolocationManagerPointer.reinterpret(), errorMessage)

    /**
     * Notify @manager that position has been updated to @position.
     *
     * @param position a #WebKitGeolocationPosition
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun updatePosition(position: GeolocationPosition): Unit = webkit_geolocation_manager_update_position(
        webkitGeolocationManagerPointer.reinterpret(),
        position.gPointer.reinterpret()
    )

    /**
     * The signal is emitted to notify that @manager needs to start receiving
     * position updates. After this signal is emitted the user should provide
     * the updates using webkit_geolocation_manager_update_position() every time
     * the position changes, or use webkit_geolocation_manager_failed() in case
     * it isn't possible to determine the current position.
     *
     * If the signal is not handled, WebKit will try to determine the position
     * using GeoClue if available.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun connectStart(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "start",
            connectStartFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal is emitted to notify that @manager doesn't need to receive
     * position updates anymore.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun connectStop(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "stop",
            connectStopFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<GeolocationManager> {
        override val type: GeneratedClassKGType<GeolocationManager> =
            GeneratedClassKGType(webkit_geolocation_manager_get_type()) { GeolocationManager(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of GeolocationManager
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_geolocation_manager_get_type()
    }
}

private val connectStartFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val connectStopFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
