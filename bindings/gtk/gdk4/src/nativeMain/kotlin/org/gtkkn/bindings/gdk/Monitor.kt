// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkMonitor
import org.gtkkn.native.gdk.gdk_monitor_get_connector
import org.gtkkn.native.gdk.gdk_monitor_get_description
import org.gtkkn.native.gdk.gdk_monitor_get_display
import org.gtkkn.native.gdk.gdk_monitor_get_geometry
import org.gtkkn.native.gdk.gdk_monitor_get_height_mm
import org.gtkkn.native.gdk.gdk_monitor_get_manufacturer
import org.gtkkn.native.gdk.gdk_monitor_get_model
import org.gtkkn.native.gdk.gdk_monitor_get_refresh_rate
import org.gtkkn.native.gdk.gdk_monitor_get_scale
import org.gtkkn.native.gdk.gdk_monitor_get_scale_factor
import org.gtkkn.native.gdk.gdk_monitor_get_subpixel_layout
import org.gtkkn.native.gdk.gdk_monitor_get_type
import org.gtkkn.native.gdk.gdk_monitor_get_width_mm
import org.gtkkn.native.gdk.gdk_monitor_is_valid
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GdkMonitor` objects represent the individual outputs that are
 * associated with a `GdkDisplay`.
 *
 * `GdkDisplay` keeps a `GListModel` to enumerate and monitor
 * monitors with [method@Gdk.Display.get_monitors]. You can use
 * [method@Gdk.Display.get_monitor_at_surface] to find a particular
 * monitor.
 *
 * ## Skipped during bindings generation
 *
 * - method `geometry`: Property has no getter nor setter
 * - method `valid`: Property has no getter nor setter
 */
public open class Monitor(
    pointer: CPointer<GdkMonitor>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gdkMonitorPointer: CPointer<GdkMonitor>
        get() = gPointer.reinterpret()

    /**
     * The connector name.
     */
    public open val connector: String?
        /**
         * Gets the name of the monitor's connector, if available.
         *
         * These are strings such as "eDP-1", or "HDMI-2". They depend
         * on software and hardware configuration, and should not be
         * relied on as stable identifiers of a specific monitor.
         *
         * @return the name of the connector
         */
        get() = gdk_monitor_get_connector(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * A short description of the monitor, meant for display to the user.
     *
     * @since 4.10
     */
    public open val description: String?
        /**
         * Gets a string describing the monitor, if available.
         *
         * This can be used to identify a monitor in the UI.
         *
         * @return the monitor description
         * @since 4.10
         */
        get() = gdk_monitor_get_description(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * The `GdkDisplay` of the monitor.
     */
    public open val display: Display
        /**
         * Gets the display that this monitor belongs to.
         *
         * @return the display
         */
        get() =
            gdk_monitor_get_display(gdkMonitorPointer.reinterpret())!!.run {
                Display(reinterpret())
            }

    /**
     * The height of the monitor, in millimeters.
     */
    public open val heightMm: Int
        /**
         * Gets the height in millimeters of the monitor.
         *
         * @return the physical height of the monitor
         */
        get() = gdk_monitor_get_height_mm(gdkMonitorPointer.reinterpret())

    /**
     * The manufacturer name.
     */
    public open val manufacturer: String?
        /**
         * Gets the name or PNP ID of the monitor's manufacturer.
         *
         * Note that this value might also vary depending on actual
         * display backend.
         *
         * The PNP ID registry is located at
         * [https://uefi.org/pnp_id_list](https://uefi.org/pnp_id_list).
         *
         * @return the name of the manufacturer
         */
        get() = gdk_monitor_get_manufacturer(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * The model name.
     */
    public open val model: String?
        /**
         * Gets the string identifying the monitor model, if available.
         *
         * @return the monitor model
         */
        get() = gdk_monitor_get_model(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * The refresh rate, in milli-Hertz.
     */
    public open val refreshRate: Int
        /**
         * Gets the refresh rate of the monitor, if available.
         *
         * The value is in milli-Hertz, so a refresh rate of 60Hz
         * is returned as 60000.
         *
         * @return the refresh rate in milli-Hertz, or 0
         */
        get() = gdk_monitor_get_refresh_rate(gdkMonitorPointer.reinterpret())

    /**
     * The scale of the monitor.
     *
     * @since 4.14
     */
    public open val scale: Double
        /**
         * Gets the internal scale factor that maps from monitor coordinates
         * to device pixels.
         *
         * This can be used if you want to create pixel based data for a
         * particular monitor, but most of the time you’re drawing to a surface
         * where it is better to use [method@Gdk.Surface.get_scale] instead.
         *
         * @return the scale
         * @since 4.14
         */
        get() = gdk_monitor_get_scale(gdkMonitorPointer.reinterpret())

    /**
     * The scale factor.
     *
     * The scale factor is the next larger integer,
     * compared to [property@Gdk.Surface:scale].
     */
    public open val scaleFactor: Int
        /**
         * Gets the internal scale factor that maps from monitor coordinates
         * to device pixels.
         *
         * On traditional systems this is 1, but on very high density outputs
         * it can be a higher value (often 2).
         *
         * This can be used if you want to create pixel based data for a
         * particular monitor, but most of the time you’re drawing to a surface
         * where it is better to use [method@Gdk.Surface.get_scale_factor] instead.
         *
         * @return the scale factor
         */
        get() = gdk_monitor_get_scale_factor(gdkMonitorPointer.reinterpret())

    /**
     * The subpixel layout.
     */
    public open val subpixelLayout: SubpixelLayout
        /**
         * Gets information about the layout of red, green and blue
         * primaries for pixels.
         *
         * @return the subpixel layout
         */
        get() =
            gdk_monitor_get_subpixel_layout(gdkMonitorPointer.reinterpret()).run {
                SubpixelLayout.fromNativeValue(this)
            }

    /**
     * The width of the monitor, in millimeters.
     */
    public open val widthMm: Int
        /**
         * Gets the width in millimeters of the monitor.
         *
         * @return the physical width of the monitor
         */
        get() = gdk_monitor_get_width_mm(gdkMonitorPointer.reinterpret())

    /**
     * Gets the name of the monitor's connector, if available.
     *
     * These are strings such as "eDP-1", or "HDMI-2". They depend
     * on software and hardware configuration, and should not be
     * relied on as stable identifiers of a specific monitor.
     *
     * @return the name of the connector
     */
    public open fun getConnector(): String? = gdk_monitor_get_connector(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * Gets a string describing the monitor, if available.
     *
     * This can be used to identify a monitor in the UI.
     *
     * @return the monitor description
     * @since 4.10
     */
    public open fun getDescription(): String? =
        gdk_monitor_get_description(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * Gets the display that this monitor belongs to.
     *
     * @return the display
     */
    public open fun getDisplay(): Display =
        gdk_monitor_get_display(gdkMonitorPointer.reinterpret())!!.run {
            Display(reinterpret())
        }

    /**
     * Retrieves the size and position of the monitor within the
     * display coordinate space.
     *
     * The returned geometry is in  ”application pixels”, not in
     * ”device pixels” (see [method@Gdk.Monitor.get_scale]).
     *
     * @param geometry a `GdkRectangle` to be filled with the monitor geometry
     */
    public open fun getGeometry(geometry: Rectangle): Unit =
        gdk_monitor_get_geometry(gdkMonitorPointer.reinterpret(), geometry.gdkRectanglePointer)

    /**
     * Gets the height in millimeters of the monitor.
     *
     * @return the physical height of the monitor
     */
    public open fun getHeightMm(): Int = gdk_monitor_get_height_mm(gdkMonitorPointer.reinterpret())

    /**
     * Gets the name or PNP ID of the monitor's manufacturer.
     *
     * Note that this value might also vary depending on actual
     * display backend.
     *
     * The PNP ID registry is located at
     * [https://uefi.org/pnp_id_list](https://uefi.org/pnp_id_list).
     *
     * @return the name of the manufacturer
     */
    public open fun getManufacturer(): String? =
        gdk_monitor_get_manufacturer(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * Gets the string identifying the monitor model, if available.
     *
     * @return the monitor model
     */
    public open fun getModel(): String? = gdk_monitor_get_model(gdkMonitorPointer.reinterpret())?.toKString()

    /**
     * Gets the refresh rate of the monitor, if available.
     *
     * The value is in milli-Hertz, so a refresh rate of 60Hz
     * is returned as 60000.
     *
     * @return the refresh rate in milli-Hertz, or 0
     */
    public open fun getRefreshRate(): Int = gdk_monitor_get_refresh_rate(gdkMonitorPointer.reinterpret())

    /**
     * Gets the internal scale factor that maps from monitor coordinates
     * to device pixels.
     *
     * This can be used if you want to create pixel based data for a
     * particular monitor, but most of the time you’re drawing to a surface
     * where it is better to use [method@Gdk.Surface.get_scale] instead.
     *
     * @return the scale
     * @since 4.14
     */
    public open fun getScale(): Double = gdk_monitor_get_scale(gdkMonitorPointer.reinterpret())

    /**
     * Gets the internal scale factor that maps from monitor coordinates
     * to device pixels.
     *
     * On traditional systems this is 1, but on very high density outputs
     * it can be a higher value (often 2).
     *
     * This can be used if you want to create pixel based data for a
     * particular monitor, but most of the time you’re drawing to a surface
     * where it is better to use [method@Gdk.Surface.get_scale_factor] instead.
     *
     * @return the scale factor
     */
    public open fun getScaleFactor(): Int = gdk_monitor_get_scale_factor(gdkMonitorPointer.reinterpret())

    /**
     * Gets information about the layout of red, green and blue
     * primaries for pixels.
     *
     * @return the subpixel layout
     */
    public open fun getSubpixelLayout(): SubpixelLayout =
        gdk_monitor_get_subpixel_layout(gdkMonitorPointer.reinterpret()).run {
            SubpixelLayout.fromNativeValue(this)
        }

    /**
     * Gets the width in millimeters of the monitor.
     *
     * @return the physical width of the monitor
     */
    public open fun getWidthMm(): Int = gdk_monitor_get_width_mm(gdkMonitorPointer.reinterpret())

    /**
     * Returns true if the @monitor object corresponds to a
     * physical monitor.
     *
     * The @monitor becomes invalid when the physical monitor
     * is unplugged or removed.
     *
     * @return true if the object corresponds to a physical monitor
     */
    public open fun isValid(): Boolean = gdk_monitor_is_valid(gdkMonitorPointer.reinterpret()).asBoolean()

    /**
     * Emitted when the output represented by @monitor gets disconnected.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectInvalidate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "invalidate",
            connectInvalidateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Monitor> {
        override val type: GeneratedClassKGType<Monitor> =
            GeneratedClassKGType(gdk_monitor_get_type()) { Monitor(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}

private val connectInvalidateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
