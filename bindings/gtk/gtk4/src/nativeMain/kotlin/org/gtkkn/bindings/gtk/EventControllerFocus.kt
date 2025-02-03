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
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkEventControllerFocus
import org.gtkkn.native.gtk.gtk_event_controller_focus_contains_focus
import org.gtkkn.native.gtk.gtk_event_controller_focus_get_type
import org.gtkkn.native.gtk.gtk_event_controller_focus_is_focus
import org.gtkkn.native.gtk.gtk_event_controller_focus_new
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkEventControllerFocus` is an event controller to keep track of
 * keyboard focus.
 *
 * The event controller offers [signal@Gtk.EventControllerFocus::enter]
 * and [signal@Gtk.EventControllerFocus::leave] signals, as well as
 * [property@Gtk.EventControllerFocus:is-focus] and
 * [property@Gtk.EventControllerFocus:contains-focus] properties
 * which are updated to reflect focus changes inside the widget hierarchy
 * that is rooted at the controllers widget.
 *
 * ## Skipped during bindings generation
 *
 * - method `contains-focus`: Property has no getter nor setter
 * - method `is-focus`: Property has no getter nor setter
 */
public open class EventControllerFocus(public val gtkEventControllerFocusPointer: CPointer<GtkEventControllerFocus>) :
    EventController(gtkEventControllerFocusPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new event controller that will handle focus events.
     *
     * @return a new `GtkEventControllerFocus`
     */
    public constructor() : this(gtk_event_controller_focus_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Returns true if focus is within @self or one of its children.
     *
     * @return true if focus is within @self or one of its children
     */
    public open fun containsFocus(): Boolean =
        gtk_event_controller_focus_contains_focus(gtkEventControllerFocusPointer).asBoolean()

    /**
     * Returns true if focus is within @self, but not one of its children.
     *
     * @return true if focus is within @self, but not one of its children
     */
    public open fun isFocus(): Boolean = gtk_event_controller_focus_is_focus(gtkEventControllerFocusPointer).asBoolean()

    /**
     * Emitted whenever the focus enters into the widget or one
     * of its descendents.
     *
     * Note that this means you may not get an ::enter signal
     * even though the widget becomes the focus location, in
     * certain cases (such as when the focus moves from a descendent
     * of the widget to the widget itself). If you are interested
     * in these cases, you can monitor the
     * [property@Gtk.EventControllerFocus:is-focus]
     * property for changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onEnter(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkEventControllerFocusPointer,
            "enter",
            onEnterFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "enter" signal. See [onEnter].
     */
    public fun emitEnter() {
        g_signal_emit_by_name(gtkEventControllerFocusPointer.reinterpret(), "enter")
    }

    /**
     * Emitted whenever the focus leaves the widget hierarchy
     * that is rooted at the widget that the controller is attached to.
     *
     * Note that this means you may not get a ::leave signal
     * even though the focus moves away from the widget, in
     * certain cases (such as when the focus moves from the widget
     * to a descendent). If you are interested in these cases, you
     * can monitor the [property@Gtk.EventControllerFocus:is-focus]
     * property for changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onLeave(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkEventControllerFocusPointer,
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
        g_signal_emit_by_name(gtkEventControllerFocusPointer.reinterpret(), "leave")
    }

    public companion object : TypeCompanion<EventControllerFocus> {
        override val type: GeneratedClassKGType<EventControllerFocus> =
            GeneratedClassKGType(getTypeOrNull()!!) { EventControllerFocus(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EventControllerFocus
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_focus_get_type()

        /**
         * Gets the GType of from the symbol `gtk_event_controller_focus_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_event_controller_focus_get_type")
    }
}

private val onEnterFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onLeaveFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
