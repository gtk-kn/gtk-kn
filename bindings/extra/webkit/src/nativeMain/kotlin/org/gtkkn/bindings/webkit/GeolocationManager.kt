// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
public class GeolocationManager(public val webkitGeolocationManagerPointer: CPointer<WebKitGeolocationManager>) :
    Object(webkitGeolocationManagerPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

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
        get() = webkit_geolocation_manager_get_enable_high_accuracy(webkitGeolocationManagerPointer).asBoolean()

    /**
     * Notify @manager that determining the position failed.
     *
     * @param errorMessage the error message
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun failed(errorMessage: String): Unit =
        webkit_geolocation_manager_failed(webkitGeolocationManagerPointer, errorMessage)

    /**
     * Notify @manager that position has been updated to @position.
     *
     * @param position a #WebKitGeolocationPosition
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun updatePosition(position: GeolocationPosition): Unit = webkit_geolocation_manager_update_position(
        webkitGeolocationManagerPointer,
        position.webkitGeolocationPositionPointer
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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true to stop other handlers from being invoked for the event.
     *    false to propagate the event further.
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun onStart(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            webkitGeolocationManagerPointer,
            "start",
            onStartFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The signal is emitted to notify that @manager doesn't need to receive
     * position updates anymore.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun onStop(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitGeolocationManagerPointer,
            "stop",
            onStopFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "stop" signal. See [onStop].
     *
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun emitStop() {
        g_signal_emit_by_name(webkitGeolocationManagerPointer.reinterpret(), "stop")
    }

    public companion object : TypeCompanion<GeolocationManager> {
        override val type: GeneratedClassKGType<GeolocationManager> =
            GeneratedClassKGType(getTypeOrNull()!!) { GeolocationManager(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of GeolocationManager
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_geolocation_manager_get_type()

        /**
         * Gets the GType of from the symbol `webkit_geolocation_manager_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_geolocation_manager_get_type")
    }
}

private val onStartFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onStopFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
