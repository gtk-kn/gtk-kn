// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ScrollUnit
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEventControllerScroll
import org.gtkkn.native.gtk.gtk_event_controller_scroll_get_flags
import org.gtkkn.native.gtk.gtk_event_controller_scroll_get_type
import org.gtkkn.native.gtk.gtk_event_controller_scroll_get_unit
import org.gtkkn.native.gtk.gtk_event_controller_scroll_new
import org.gtkkn.native.gtk.gtk_event_controller_scroll_set_flags
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkEventControllerScroll` is an event controller that handles scroll
 * events.
 *
 * It is capable of handling both discrete and continuous scroll
 * events from mice or touchpads, abstracting them both with the
 * [signal@Gtk.EventControllerScroll::scroll] signal. Deltas in
 * the discrete case are multiples of 1.
 *
 * In the case of continuous scroll events, `GtkEventControllerScroll`
 * encloses all [signal@Gtk.EventControllerScroll::scroll] emissions
 * between two [signal@Gtk.EventControllerScroll::scroll-begin] and
 * [signal@Gtk.EventControllerScroll::scroll-end] signals.
 *
 * The behavior of the event controller can be modified by the flags
 * given at creation time, or modified at a later point through
 * [method@Gtk.EventControllerScroll.set_flags] (e.g. because the scrolling
 * conditions of the widget changed).
 *
 * The controller can be set up to emit motion for either/both vertical
 * and horizontal scroll events through %GTK_EVENT_CONTROLLER_SCROLL_VERTICAL,
 * %GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL and %GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES.
 * If any axis is disabled, the respective [signal@Gtk.EventControllerScroll::scroll]
 * delta will be 0. Vertical scroll events will be translated to horizontal
 * motion for the devices incapable of horizontal scrolling.
 *
 * The event controller can also be forced to emit discrete events on all
 * devices through %GTK_EVENT_CONTROLLER_SCROLL_DISCRETE. This can be used
 * to implement discrete actions triggered through scroll events (e.g.
 * switching across combobox options).
 *
 * The %GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag toggles the emission of the
 * [signal@Gtk.EventControllerScroll::decelerate] signal, emitted at the end
 * of scrolling with two X/Y velocity arguments that are consistent with the
 * motion that was received.
 */
public open class EventControllerScroll(
    pointer: CPointer<GtkEventControllerScroll>,
) : EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkEventControllerScrollPointer: CPointer<GtkEventControllerScroll>
        get() = gPointer.reinterpret()

    /**
     * The flags affecting event controller behavior.
     */
    public open var flags: EventControllerScrollFlags
        /**
         * Gets the flags conditioning the scroll controller behavior.
         *
         * @return the controller flags.
         */
        get() =
            gtk_event_controller_scroll_get_flags(gtkEventControllerScrollPointer.reinterpret()).run {
                EventControllerScrollFlags(this)
            }

        /**
         * Sets the flags conditioning scroll controller behavior.
         *
         * @param flags flags affecting the controller behavior
         */
        set(flags) = gtk_event_controller_scroll_set_flags(gtkEventControllerScrollPointer.reinterpret(), flags.mask)

    /**
     * Creates a new event controller that will handle scroll events.
     *
     * @param flags flags affecting the controller behavior
     * @return a new `GtkEventControllerScroll`
     */
    public constructor(
        flags: EventControllerScrollFlags,
    ) : this(gtk_event_controller_scroll_new(flags.mask)!!.reinterpret())

    /**
     * Gets the flags conditioning the scroll controller behavior.
     *
     * @return the controller flags.
     */
    public open fun getFlags(): EventControllerScrollFlags =
        gtk_event_controller_scroll_get_flags(gtkEventControllerScrollPointer.reinterpret()).run {
            EventControllerScrollFlags(this)
        }

    /**
     * Gets the scroll unit of the last
     * [signal@Gtk.EventControllerScroll::scroll] signal received.
     *
     * Always returns %GDK_SCROLL_UNIT_WHEEL if the
     * %GTK_EVENT_CONTROLLER_SCROLL_DISCRETE flag is set.
     *
     * @return the scroll unit.
     * @since 4.8
     */
    public open fun getUnit(): ScrollUnit =
        gtk_event_controller_scroll_get_unit(gtkEventControllerScrollPointer.reinterpret()).run {
            ScrollUnit.fromNativeValue(this)
        }

    /**
     * Sets the flags conditioning scroll controller behavior.
     *
     * @param flags flags affecting the controller behavior
     */
    public open fun setFlags(flags: EventControllerScrollFlags): Unit =
        gtk_event_controller_scroll_set_flags(gtkEventControllerScrollPointer.reinterpret(), flags.mask)

    /**
     * Emitted after scroll is finished if the
     * %GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag is set.
     *
     * @vel_x and @vel_y express the initial velocity that was
     * imprinted by the scroll events. @vel_x and @vel_y are expressed in
     * pixels/ms.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `velX` X velocity; `velY` Y velocity
     */
    public fun connectDecelerate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (velX: Double, velY: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "decelerate",
            connectDecelerateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Signals that the widget should scroll by the
     * amount specified by @dx and @dy.
     *
     * For the representation unit of the deltas, see
     * [method@Gtk.EventControllerScroll.get_unit].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `dx` X delta; `dy` Y delta. Returns true if the scroll event was handled,
     *   false otherwise.
     */
    public fun connectScroll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (dx: Double, dy: Double) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "scroll",
            connectScrollFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Signals that a new scrolling operation has begun.
     *
     * It will only be emitted on devices capable of it.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectScrollBegin(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "scroll-begin",
            connectScrollBeginFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Signals that a scrolling operation has finished.
     *
     * It will only be emitted on devices capable of it.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectScrollEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "scroll-end",
            connectScrollEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EventControllerScroll> {
        override val type: GeneratedClassKGType<EventControllerScroll> =
            GeneratedClassKGType(gtk_event_controller_scroll_get_type()) { EventControllerScroll(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectDecelerateFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            velX: Double,
            velY: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(velX: Double, velY: Double) -> Unit>().get().invoke(velX, velY)
    }.reinterpret()

private val connectScrollFunc: CPointer<CFunction<(Double, Double) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            dx: Double,
            dy: Double,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(dx: Double, dy: Double) -> Boolean>()
            .get()
            .invoke(dx, dy)
            .asGBoolean()
    }.reinterpret()

private val connectScrollBeginFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectScrollEndFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
