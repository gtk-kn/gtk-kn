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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkEventControllerMotion
import org.gtkkn.native.gtk.gtk_event_controller_motion_contains_pointer
import org.gtkkn.native.gtk.gtk_event_controller_motion_get_type
import org.gtkkn.native.gtk.gtk_event_controller_motion_is_pointer
import org.gtkkn.native.gtk.gtk_event_controller_motion_new
import kotlin.Boolean
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
    public val gtkEventControllerMotionPointer: CPointer<GtkEventControllerMotion>,
) : EventController(gtkEventControllerMotionPointer.reinterpret()),
    KGTyped {
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
        gtk_event_controller_motion_contains_pointer(gtkEventControllerMotionPointer).asBoolean()

    /**
     * Returns if a pointer is within @self, but not one of its children.
     *
     * @return true if a pointer is within @self but not one of its children
     */
    public open fun isPointer(): Boolean =
        gtk_event_controller_motion_is_pointer(gtkEventControllerMotionPointer).asBoolean()

    /**
     * Signals that the pointer has entered the widget.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` coordinates of pointer location; `y` coordinates of pointer location
     */
    public fun onEnter(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: gdouble, y: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkEventControllerMotionPointer,
        "enter",
        onEnterFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "enter" signal. See [onEnter].
     *
     * @param x coordinates of pointer location
     * @param y coordinates of pointer location
     */
    public fun emitEnter(x: gdouble, y: gdouble) {
        g_signal_emit_by_name(gtkEventControllerMotionPointer.reinterpret(), "enter", x, y)
    }

    /**
     * Signals that the pointer has left the widget.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onLeave(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkEventControllerMotionPointer,
            "leave",
            onLeaveFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "leave" signal. See [onLeave].
     */
    public fun emitLeave() {
        g_signal_emit_by_name(gtkEventControllerMotionPointer.reinterpret(), "leave")
    }

    /**
     * Emitted when the pointer moves inside the widget.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the x coordinate; `y` the y coordinate
     */
    public fun onMotion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (x: gdouble, y: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkEventControllerMotionPointer,
        "motion",
        onMotionFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "motion" signal. See [onMotion].
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public fun emitMotion(x: gdouble, y: gdouble) {
        g_signal_emit_by_name(gtkEventControllerMotionPointer.reinterpret(), "motion", x, y)
    }

    public companion object : TypeCompanion<EventControllerMotion> {
        override val type: GeneratedClassKGType<EventControllerMotion> =
            GeneratedClassKGType(getTypeOrNull("gtk_event_controller_motion_get_type")!!) {
                EventControllerMotion(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EventControllerMotion
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_motion_get_type()
    }
}

private val onEnterFunc: CPointer<CFunction<(gdouble, gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(x: gdouble, y: gdouble) -> Unit>().get().invoke(x, y)
}
    .reinterpret()

private val onLeaveFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
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
