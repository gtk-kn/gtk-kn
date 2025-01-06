// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class EventControllerLegacy(pointer: CPointer<GtkEventControllerLegacy>) :
    EventController(pointer.reinterpret()),
    KGTyped {
    public val gtkEventControllerLegacyPointer: CPointer<GtkEventControllerLegacy>
        get() = gPointer.reinterpret()

    /**
     * Creates a new legacy event controller.
     *
     * @return the newly created event controller.
     */
    public constructor() : this(gtk_event_controller_legacy_new()!!.reinterpret())

    /**
     * Emitted for each GDK event delivered to @controller.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` the `GdkEvent` which triggered this signal. Returns true to stop other handlers from being invoked for the event
     *   and the emission of this signal. false to propagate the event further.
     */
    public fun connectEvent(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (event: Event) -> Boolean): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "event",
            connectEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EventControllerLegacy> {
        override val type: GeneratedClassKGType<EventControllerLegacy> =
            GeneratedClassKGType(gtk_event_controller_legacy_get_type()) { EventControllerLegacy(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EventControllerLegacy
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_event_controller_legacy_get_type()
    }
}

private val connectEventFunc: CPointer<CFunction<(CPointer<GdkEvent>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            event: CPointer<GdkEvent>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(event: Event) -> Boolean>().get().invoke(
            event!!.run {
                Event(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()
