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
import org.gtkkn.bindings.gdk.ScrollUnit
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkEventControllerScroll
import org.gtkkn.native.gtk.gtk_event_controller_scroll_get_flags
import org.gtkkn.native.gtk.gtk_event_controller_scroll_get_type
import org.gtkkn.native.gtk.gtk_event_controller_scroll_get_unit
import org.gtkkn.native.gtk.gtk_event_controller_scroll_new
import org.gtkkn.native.gtk.gtk_event_controller_scroll_set_flags
import kotlin.Boolean
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
    public val gtkEventControllerScrollPointer: CPointer<GtkEventControllerScroll>,
) : EventController(gtkEventControllerScrollPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * The flags affecting event controller behavior.
     */
    public open var flags: EventControllerScrollFlags
        /**
         * Gets the flags conditioning the scroll controller behavior.
         *
         * @return the controller flags.
         */
        get() = gtk_event_controller_scroll_get_flags(gtkEventControllerScrollPointer).run {
            EventControllerScrollFlags(this)
        }

        /**
         * Sets the flags conditioning scroll controller behavior.
         *
         * @param flags flags affecting the controller behavior
         */
        set(flags) = gtk_event_controller_scroll_set_flags(gtkEventControllerScrollPointer, flags.mask)

    /**
     * Creates a new event controller that will handle scroll events.
     *
     * @param flags flags affecting the controller behavior
     * @return a new `GtkEventControllerScroll`
     */
    public constructor(
        flags: EventControllerScrollFlags,
    ) : this(gtk_event_controller_scroll_new(flags.mask)!!.reinterpret()) {
        InstanceCache.put(this)
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
    @GtkVersion4_8
    public open fun getUnit(): ScrollUnit = gtk_event_controller_scroll_get_unit(gtkEventControllerScrollPointer).run {
        ScrollUnit.fromNativeValue(this)
    }

    /**
     * Emitted after scroll is finished if the
     * %GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag is set.
     *
     * @vel_x and @vel_y express the initial velocity that was
     * imprinted by the scroll events. @vel_x and @vel_y are expressed in
     * pixels/ms.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `velX` X velocity; `velY` Y velocity
     */
    public fun onDecelerate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (velX: gdouble, velY: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkEventControllerScrollPointer,
        "decelerate",
        onDecelerateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "decelerate" signal. See [onDecelerate].
     *
     * @param velX X velocity
     * @param velY Y velocity
     */
    public fun emitDecelerate(velX: gdouble, velY: gdouble) {
        g_signal_emit_by_name(gtkEventControllerScrollPointer.reinterpret(), "decelerate", velX, velY)
    }

    /**
     * Signals that the widget should scroll by the
     * amount specified by @dx and @dy.
     *
     * For the representation unit of the deltas, see
     * [method@Gtk.EventControllerScroll.get_unit].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `dx` X delta; `dy` Y delta. Returns true if the scroll event was handled,
     *   false otherwise.
     */
    public fun onScroll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (dx: gdouble, dy: gdouble) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkEventControllerScrollPointer,
        "scroll",
        onScrollFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Signals that a new scrolling operation has begun.
     *
     * It will only be emitted on devices capable of it.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onScrollBegin(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkEventControllerScrollPointer,
            "scroll-begin",
            onScrollBeginFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "scroll-begin" signal. See [onScrollBegin].
     */
    public fun emitScrollBegin() {
        g_signal_emit_by_name(gtkEventControllerScrollPointer.reinterpret(), "scroll-begin")
    }

    /**
     * Signals that a scrolling operation has finished.
     *
     * It will only be emitted on devices capable of it.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onScrollEnd(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkEventControllerScrollPointer,
            "scroll-end",
            onScrollEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "scroll-end" signal. See [onScrollEnd].
     */
    public fun emitScrollEnd() {
        g_signal_emit_by_name(gtkEventControllerScrollPointer.reinterpret(), "scroll-end")
    }

    public companion object : TypeCompanion<EventControllerScroll> {
        override val type: GeneratedClassKGType<EventControllerScroll> =
            GeneratedClassKGType(getTypeOrNull()!!) { EventControllerScroll(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EventControllerScroll
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_scroll_get_type()

        /**
         * Gets the GType of from the symbol `gtk_event_controller_scroll_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_event_controller_scroll_get_type")
    }
}

private val onDecelerateFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        velX: gdouble,
        velY: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(velX: gdouble, velY: gdouble) -> Unit>().get().invoke(velX, velY)
}
    .reinterpret()

private val onScrollFunc: CPointer<CFunction<(gdouble, gdouble) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        dx: gdouble,
        dy: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(dx: gdouble, dy: gdouble) -> Boolean>().get().invoke(dx, dy).asGBoolean()
}
    .reinterpret()

private val onScrollBeginFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onScrollEndFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
