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
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkEvent
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEventControllerLegacy
import org.gtkkn.native.gtk.gtk_event_controller_legacy_get_type
import org.gtkkn.native.gtk.gtk_event_controller_legacy_new
import kotlin.Boolean
import kotlin.ULong

/**
 * `GtkEventControllerLegacy` is an event controller that provides raw
 * access to the event stream.
 *
 * It should only be used as a last resort if none of the other event
 * controllers or gestures do the job.
 */
public open class EventControllerLegacy(
    public val gtkEventControllerLegacyPointer: CPointer<GtkEventControllerLegacy>,
) : EventController(gtkEventControllerLegacyPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new legacy event controller.
     *
     * @return the newly created event controller.
     */
    public constructor() : this(gtk_event_controller_legacy_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Emitted for each GDK event delivered to @controller.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` the `GdkEvent` which triggered this signal. Returns true to stop other handlers from being invoked for the event
     *   and the emission of this signal. false to propagate the event further.
     */
    public fun onEvent(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (event: Event) -> Boolean): ULong =
        g_signal_connect_data(
            gtkEventControllerLegacyPointer,
            "event",
            onEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EventControllerLegacy> {
        override val type: GeneratedClassKGType<EventControllerLegacy> =
            GeneratedClassKGType(getTypeOrNull()!!) { EventControllerLegacy(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EventControllerLegacy
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_legacy_get_type()

        /**
         * Gets the GType of from the symbol `gtk_event_controller_legacy_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_event_controller_legacy_get_type")
    }
}

private val onEventFunc: CPointer<CFunction<(CPointer<GdkEvent>) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        event: CPointer<GdkEvent>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(event: Event) -> Boolean>().get().invoke(
        event!!.run {
            Event.EventImpl(this)
        }
    ).asGBoolean()
}
    .reinterpret()
