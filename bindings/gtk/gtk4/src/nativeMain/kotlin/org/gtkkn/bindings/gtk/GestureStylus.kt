// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkGestureStylus
import org.gtkkn.native.gtk.gtk_gesture_stylus_get_device_tool
import org.gtkkn.native.gtk.gtk_gesture_stylus_get_stylus_only
import org.gtkkn.native.gtk.gtk_gesture_stylus_get_type
import org.gtkkn.native.gtk.gtk_gesture_stylus_new
import org.gtkkn.native.gtk.gtk_gesture_stylus_set_stylus_only
import kotlin.Boolean
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
public open class GestureStylus(public val gtkGestureStylusPointer: CPointer<GtkGestureStylus>) :
    GestureSingle(gtkGestureStylusPointer.reinterpret()),
    KGTyped {
    /**
     * If this gesture should exclusively react to stylus input devices.
     *
     * @since 4.10
     */
    @GtkVersion4_10
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
        get() = gtk_gesture_stylus_get_stylus_only(gtkGestureStylusPointer).asBoolean()

        /**
         * Sets the state of stylus-only
         *
         * If true, the gesture will exclusively handle events from stylus input devices,
         * otherwise it'll handle events from any pointing device.
         *
         * @param stylusOnly whether the gesture is used exclusively for stylus events
         * @since 4.10
         */
        @GtkVersion4_10
        set(stylusOnly) = gtk_gesture_stylus_set_stylus_only(gtkGestureStylusPointer, stylusOnly.asGBoolean())

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
    public open fun getDeviceTool(): DeviceTool? = gtk_gesture_stylus_get_device_tool(gtkGestureStylusPointer)?.run {
        DeviceTool(this)
    }

    /**
     * Emitted when the stylus touches the device.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y` the Y coordinate of the stylus event
     */
    public fun onDown(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (x: gdouble, y: gdouble) -> Unit): ULong =
        g_signal_connect_data(
            gtkGestureStylusPointer,
            "down",
            onDownFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "down" signal. See [onDown].
     *
     * @param x the X coordinate of the stylus event
     * @param y the Y coordinate of the stylus event
     */
    public fun emitDown(x: gdouble, y: gdouble) {
        g_signal_emit_by_name(gtkGestureStylusPointer.reinterpret(), "down", x, y)
    }

    /**
     * Emitted when the stylus moves while touching the device.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y` the Y coordinate of the stylus event
     */
    public fun onMotion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: gdouble, y: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureStylusPointer,
        "motion",
        onMotionFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "motion" signal. See [onMotion].
     *
     * @param x the X coordinate of the stylus event
     * @param y the Y coordinate of the stylus event
     */
    public fun emitMotion(x: gdouble, y: gdouble) {
        g_signal_emit_by_name(gtkGestureStylusPointer.reinterpret(), "motion", x, y)
    }

    /**
     * Emitted when the stylus is in proximity of the device.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y` the Y coordinate of the stylus event
     */
    public fun onProximity(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: gdouble, y: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkGestureStylusPointer,
        "proximity",
        onProximityFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "proximity" signal. See [onProximity].
     *
     * @param x the X coordinate of the stylus event
     * @param y the Y coordinate of the stylus event
     */
    public fun emitProximity(x: gdouble, y: gdouble) {
        g_signal_emit_by_name(gtkGestureStylusPointer.reinterpret(), "proximity", x, y)
    }

    /**
     * Emitted when the stylus no longer touches the device.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the stylus event; `y` the Y coordinate of the stylus event
     */
    public fun onUp(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (x: gdouble, y: gdouble) -> Unit): ULong =
        g_signal_connect_data(
            gtkGestureStylusPointer,
            "up",
            onUpFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "up" signal. See [onUp].
     *
     * @param x the X coordinate of the stylus event
     * @param y the Y coordinate of the stylus event
     */
    public fun emitUp(x: gdouble, y: gdouble) {
        g_signal_emit_by_name(gtkGestureStylusPointer.reinterpret(), "up", x, y)
    }

    public companion object : TypeCompanion<GestureStylus> {
        override val type: GeneratedClassKGType<GestureStylus> =
            GeneratedClassKGType(getTypeOrNull("gtk_gesture_stylus_get_type")!!) { GestureStylus(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureStylus
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_stylus_get_type()
    }
}

private val onDownFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(x: gdouble, y: gdouble) -> Unit>().get().invoke(x, y)
}
    .reinterpret()

private val onMotionFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(x: gdouble, y: gdouble) -> Unit>().get().invoke(x, y)
}
    .reinterpret()

private val onProximityFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(x: gdouble, y: gdouble) -> Unit>().get().invoke(x, y)
}
    .reinterpret()

private val onUpFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(x: gdouble, y: gdouble) -> Unit>().get().invoke(x, y)
}
    .reinterpret()
