// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkGestureLongPress
import org.gtkkn.native.gtk.gtk_gesture_long_press_get_delay_factor
import org.gtkkn.native.gtk.gtk_gesture_long_press_get_type
import org.gtkkn.native.gtk.gtk_gesture_long_press_new
import org.gtkkn.native.gtk.gtk_gesture_long_press_set_delay_factor
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureLongPress` is a `GtkGesture` for long presses.
 *
 * This gesture is also known as “Press and Hold”.
 *
 * When the timeout is exceeded, the gesture is triggering the
 * [signal@Gtk.GestureLongPress::pressed] signal.
 *
 * If the touchpoint is lifted before the timeout passes, or if
 * it drifts too far of the initial press point, the
 * [signal@Gtk.GestureLongPress::cancelled] signal will be emitted.
 *
 * How long the timeout is before the ::pressed signal gets emitted is
 * determined by the [property@Gtk.Settings:gtk-long-press-time] setting.
 * It can be modified by the [property@Gtk.GestureLongPress:delay-factor]
 * property.
 */
public open class GestureLongPress(
    pointer: CPointer<GtkGestureLongPress>,
) : GestureSingle(pointer.reinterpret()),
    KGTyped {
    public val gtkGestureLongPressPointer: CPointer<GtkGestureLongPress>
        get() = gPointer.reinterpret()

    /**
     * Factor by which to modify the default timeout.
     */
    public open var delayFactor: Double
        /**
         * Returns the delay factor.
         *
         * @return the delay factor
         */
        get() = gtk_gesture_long_press_get_delay_factor(gtkGestureLongPressPointer.reinterpret())

        /**
         * Applies the given delay factor.
         *
         * The default long press time will be multiplied by this value.
         * Valid values are in the range [0.5..2.0].
         *
         * @param delayFactor The delay factor to apply
         */
        set(
            delayFactor
        ) = gtk_gesture_long_press_set_delay_factor(gtkGestureLongPressPointer.reinterpret(), delayFactor)

    /**
     * Returns a newly created `GtkGesture` that recognizes long presses.
     *
     * @return a newly created `GtkGestureLongPress`.
     */
    public constructor() : this(gtk_gesture_long_press_new()!!.reinterpret())

    /**
     * Returns the delay factor.
     *
     * @return the delay factor
     */
    public open fun getDelayFactor(): Double =
        gtk_gesture_long_press_get_delay_factor(gtkGestureLongPressPointer.reinterpret())

    /**
     * Applies the given delay factor.
     *
     * The default long press time will be multiplied by this value.
     * Valid values are in the range [0.5..2.0].
     *
     * @param delayFactor The delay factor to apply
     */
    public open fun setDelayFactor(delayFactor: Double): Unit =
        gtk_gesture_long_press_set_delay_factor(gtkGestureLongPressPointer.reinterpret(), delayFactor)

    /**
     * Emitted whenever a press moved too far, or was released
     * before [signal@Gtk.GestureLongPress::pressed] happened.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectCancelled(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cancelled",
            connectCancelledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever a press goes unmoved/unreleased longer than
     * what the GTK defaults tell.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate where the press happened, relative to the widget allocation; `y` the Y coordinate where the press happened, relative to the widget allocation
     */
    public fun connectPressed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: Double, y: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "pressed",
            connectPressedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<GestureLongPress> {
        override val type: GeneratedClassKGType<GestureLongPress> =
            GeneratedClassKGType(gtk_gesture_long_press_get_type()) { GestureLongPress(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectCancelledFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectPressedFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }.reinterpret()
