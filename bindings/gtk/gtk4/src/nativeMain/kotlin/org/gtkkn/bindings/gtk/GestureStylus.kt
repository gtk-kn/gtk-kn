// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.DeviceTool
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkGestureStylus
import org.gtkkn.native.gtk.gtk_gesture_stylus_get_device_tool
import org.gtkkn.native.gtk.gtk_gesture_stylus_get_stylus_only
import org.gtkkn.native.gtk.gtk_gesture_stylus_get_type
import org.gtkkn.native.gtk.gtk_gesture_stylus_new
import org.gtkkn.native.gtk.gtk_gesture_stylus_set_stylus_only
import kotlin.Boolean
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureStylus` is a `GtkGesture` specific to stylus input.
 *
 * The provided signals just relay the basic information of the
 * stylus events.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `axes`: Array parameter of type Gdk.AxisUse is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `backlog`: backlog: Out parameter is not supported
 */
public open class GestureStylus(
    pointer: CPointer<GtkGestureStylus>,
) : GestureSingle(pointer.reinterpret()), KGTyped {
    public val gtkGestureStylusPointer: CPointer<GtkGestureStylus>
        get() = gPointer.reinterpret()

    /**
     * If this gesture should exclusively react to stylus input devices.
     *
     * @since 4.10
     */
    public open var stylusOnly: Boolean
        /**
         * Checks whether the gesture is for styluses only.
         *
         * Stylus-only gestures will signal events exclusively from stylus
         * input devices.
         *
         * @return true if the gesture is only for stylus events
         * @since 4.10
         */
        get() =
            gtk_gesture_stylus_get_stylus_only(gtkGestureStylusPointer.reinterpret()).asBoolean()

        /**
         * Sets the state of stylus-only
         *
         * If true, the gesture will exclusively handle events from stylus input devices,
         * otherwise it'll handle events from any pointing device.
         *
         * @param stylusOnly whether the gesture is used exclusively for stylus events
         * @since 4.10
         */
        set(stylusOnly) =
            gtk_gesture_stylus_set_stylus_only(
                gtkGestureStylusPointer.reinterpret(),
                stylusOnly.asGBoolean()
            )

    /**
     * Creates a new `GtkGestureStylus`.
     *
     * @return a newly created stylus gesture
     */
    public constructor() : this(gtk_gesture_stylus_new()!!.reinterpret())

    /**
     * Returns the `GdkDeviceTool` currently driving input through this gesture.
     *
     * This function must be called from the handler of one of the
     * [signal@Gtk.GestureStylus::down], [signal@Gtk.GestureStylus::motion],
     * [signal@Gtk.GestureStylus::up] or [signal@Gtk.GestureStylus::proximity]
     * signals.
     *
     * @return The current stylus tool
     */
    public open fun getDeviceTool(): DeviceTool? =
        gtk_gesture_stylus_get_device_tool(gtkGestureStylusPointer.reinterpret())?.run {
            DeviceTool(reinterpret())
        }

    /**
     * Checks whether the gesture is for styluses only.
     *
     * Stylus-only gestures will signal events exclusively from stylus
     * input devices.
     *
     * @return true if the gesture is only for stylus events
     * @since 4.10
     */
    public open fun getStylusOnly(): Boolean =
        gtk_gesture_stylus_get_stylus_only(gtkGestureStylusPointer.reinterpret()).asBoolean()

    /**
     * Sets the state of stylus-only
     *
     * If true, the gesture will exclusively handle events from stylus input devices,
     * otherwise it'll handle events from any pointing device.
     *
     * @param stylusOnly whether the gesture is used exclusively for stylus events
     * @since 4.10
     */
    public open fun setStylusOnly(stylusOnly: Boolean): Unit =
        gtk_gesture_stylus_set_stylus_only(
            gtkGestureStylusPointer.reinterpret(),
            stylusOnly.asGBoolean()
        )

    /**
     * Emitted when the stylus touches the device.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y`
     * the Y coordinate of the stylus event
     */
    public fun connectDown(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Double,
            y: Double,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "down",
            connectDownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the stylus moves while touching the device.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y`
     * the Y coordinate of the stylus event
     */
    public fun connectMotion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Double,
            y: Double,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "motion",
            connectMotionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the stylus is in proximity of the device.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y`
     * the Y coordinate of the stylus event
     */
    public fun connectProximity(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Double,
            y: Double,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "proximity",
            connectProximityFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the stylus no longer touches the device.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y`
     * the Y coordinate of the stylus event
     */
    public fun connectUp(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Double,
            y: Double,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "up",
            connectUpFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<GestureStylus> {
        override val type: GeneratedClassKGType<GestureStylus> =
            GeneratedClassKGType(gtk_gesture_stylus_get_type()) {
                GestureStylus(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectDownFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }
        .reinterpret()

private val connectMotionFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }
        .reinterpret()

private val connectProximityFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }
        .reinterpret()

private val connectUpFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }
        .reinterpret()
