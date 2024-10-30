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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEventControllerMotion
import org.gtkkn.native.gtk.gtk_event_controller_motion_contains_pointer
import org.gtkkn.native.gtk.gtk_event_controller_motion_get_type
import org.gtkkn.native.gtk.gtk_event_controller_motion_is_pointer
import org.gtkkn.native.gtk.gtk_event_controller_motion_new
import kotlin.Boolean
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkEventControllerMotion` is an event controller tracking the pointer
 * position.
 *
 * The event controller offers [signal@Gtk.EventControllerMotion::enter]
 * and [signal@Gtk.EventControllerMotion::leave] signals, as well as
 * [property@Gtk.EventControllerMotion:is-pointer] and
 * [property@Gtk.EventControllerMotion:contains-pointer] properties
 * which are updated to reflect changes in the pointer position as it
 * moves over the widget.
 *
 * ## Skipped during bindings generation
 *
 * - method `contains-pointer`: Property has no getter nor setter
 * - method `is-pointer`: Property has no getter nor setter
 */
public open class EventControllerMotion(
    pointer: CPointer<GtkEventControllerMotion>,
) : EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkEventControllerMotionPointer: CPointer<GtkEventControllerMotion>
        get() = gPointer.reinterpret()

    /**
     * Creates a new event controller that will handle motion events.
     *
     * @return a new `GtkEventControllerMotion`
     */
    public constructor() : this(gtk_event_controller_motion_new()!!.reinterpret())

    /**
     * Returns if a pointer is within @self or one of its children.
     *
     * @return true if a pointer is within @self or one of its children
     */
    public open fun containsPointer(): Boolean =
        gtk_event_controller_motion_contains_pointer(gtkEventControllerMotionPointer.reinterpret()).asBoolean()

    /**
     * Returns if a pointer is within @self, but not one of its children.
     *
     * @return true if a pointer is within @self but not one of its children
     */
    public open fun isPointer(): Boolean =
        gtk_event_controller_motion_is_pointer(gtkEventControllerMotionPointer.reinterpret()).asBoolean()

    /**
     * Signals that the pointer has entered the widget.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` coordinates of pointer location; `y` coordinates of pointer location
     */
    public fun connectEnter(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: Double, y: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "enter",
            connectEnterFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Signals that the pointer has left the widget.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLeave(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "leave",
            connectLeaveFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the pointer moves inside the widget.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the x coordinate; `y` the y coordinate
     */
    public fun connectMotion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: Double, y: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "motion",
            connectMotionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EventControllerMotion> {
        override val type: GeneratedClassKGType<EventControllerMotion> =
            GeneratedClassKGType(gtk_event_controller_motion_get_type()) { EventControllerMotion(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectEnterFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }.reinterpret()

private val connectLeaveFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectMotionFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }.reinterpret()
