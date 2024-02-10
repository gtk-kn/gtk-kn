// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Device
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkEventController
import org.gtkkn.native.gtk.gtk_event_controller_get_current_event
import org.gtkkn.native.gtk.gtk_event_controller_get_current_event_device
import org.gtkkn.native.gtk.gtk_event_controller_get_current_event_state
import org.gtkkn.native.gtk.gtk_event_controller_get_current_event_time
import org.gtkkn.native.gtk.gtk_event_controller_get_name
import org.gtkkn.native.gtk.gtk_event_controller_get_propagation_limit
import org.gtkkn.native.gtk.gtk_event_controller_get_propagation_phase
import org.gtkkn.native.gtk.gtk_event_controller_get_type
import org.gtkkn.native.gtk.gtk_event_controller_get_widget
import org.gtkkn.native.gtk.gtk_event_controller_reset
import org.gtkkn.native.gtk.gtk_event_controller_set_name
import org.gtkkn.native.gtk.gtk_event_controller_set_propagation_limit
import org.gtkkn.native.gtk.gtk_event_controller_set_propagation_phase
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * `GtkEventController` is the base class for event controllers.
 *
 * These are ancillary objects associated to widgets, which react
 * to `GdkEvents`, and possibly trigger actions as a consequence.
 *
 * Event controllers are added to a widget with
 * [method@Gtk.Widget.add_controller]. It is rarely necessary to
 * explicitly remove a controller with [method@Gtk.Widget.remove_controller].
 *
 * See the chapter on [input handling](input-handling.html) for
 * an overview of the basic concepts, such as the capture and bubble
 * phases of even propagation.
 */
public open class EventController(
    pointer: CPointer<GtkEventController>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gtkEventControllerPointer: CPointer<GtkEventController>
        get() = gPointer.reinterpret()

    /**
     * The name for this controller, typically used for debugging purposes.
     */
    public open var name: String?
        /**
         * Gets the name of @controller.
         *
         * @return The controller name
         */
        get() = gtk_event_controller_get_name(gtkEventControllerPointer.reinterpret())?.toKString()

        /**
         * Sets a name on the controller that can be used for debugging.
         *
         * @param name a name for @controller
         */
        set(name) = gtk_event_controller_set_name(gtkEventControllerPointer.reinterpret(), name)

    /**
     * The limit for which events this controller will handle.
     */
    public open var propagationLimit: PropagationLimit
        /**
         * Gets the propagation limit of the event controller.
         *
         * @return the propagation limit
         */
        get() =
            gtk_event_controller_get_propagation_limit(gtkEventControllerPointer.reinterpret()).run {
                PropagationLimit.fromNativeValue(this)
            }

        /**
         * Sets the event propagation limit on the event controller.
         *
         * If the limit is set to %GTK_LIMIT_SAME_NATIVE, the controller
         * won't handle events that are targeted at widgets on a different
         * surface, such as popovers.
         *
         * @param limit the propagation limit
         */
        set(limit) =
            gtk_event_controller_set_propagation_limit(
                gtkEventControllerPointer.reinterpret(),
                limit.nativeValue
            )

    /**
     * The propagation phase at which this controller will handle events.
     */
    public open var propagationPhase: PropagationPhase
        /**
         * Gets the propagation phase at which @controller handles events.
         *
         * @return the propagation phase
         */
        get() =
            gtk_event_controller_get_propagation_phase(gtkEventControllerPointer.reinterpret()).run {
                PropagationPhase.fromNativeValue(this)
            }

        /**
         * Sets the propagation phase at which a controller handles events.
         *
         * If @phase is %GTK_PHASE_NONE, no automatic event handling will be
         * performed, but other additional gesture maintenance will.
         *
         * @param phase a propagation phase
         */
        set(phase) =
            gtk_event_controller_set_propagation_phase(
                gtkEventControllerPointer.reinterpret(),
                phase.nativeValue
            )

    /**
     * The widget receiving the `GdkEvents` that the controller will handle.
     */
    public open val widget: Widget
        /**
         * Returns the `GtkWidget` this controller relates to.
         *
         * @return a `GtkWidget`
         */
        get() =
            gtk_event_controller_get_widget(gtkEventControllerPointer.reinterpret())!!.run {
                Widget(reinterpret())
            }

    /**
     * Returns the event that is currently being handled by the controller.
     *
     * At other times, null is returned.
     *
     * @return the event that is currently
     *   handled by @controller
     */
    public open fun getCurrentEvent(): Event? =
        gtk_event_controller_get_current_event(gtkEventControllerPointer.reinterpret())?.run {
            Event(reinterpret())
        }

    /**
     * Returns the device of the event that is currently being
     * handled by the controller.
     *
     * At other times, null is returned.
     *
     * @return device of the event is
     *   currently handled by @controller
     */
    public open fun getCurrentEventDevice(): Device? =
        gtk_event_controller_get_current_event_device(gtkEventControllerPointer.reinterpret())?.run {
            Device(reinterpret())
        }

    /**
     * Returns the modifier state of the event that is currently being
     * handled by the controller.
     *
     * At other times, 0 is returned.
     *
     * @return modifier state of the event is currently handled by @controller
     */
    public open fun getCurrentEventState(): ModifierType =
        gtk_event_controller_get_current_event_state(gtkEventControllerPointer.reinterpret()).run {
            ModifierType(this)
        }

    /**
     * Returns the timestamp of the event that is currently being
     * handled by the controller.
     *
     * At other times, 0 is returned.
     *
     * @return timestamp of the event is currently handled by @controller
     */
    public open fun getCurrentEventTime(): UInt =
        gtk_event_controller_get_current_event_time(gtkEventControllerPointer.reinterpret())

    /**
     * Gets the name of @controller.
     *
     * @return The controller name
     */
    public open fun getName(): String? =
        gtk_event_controller_get_name(gtkEventControllerPointer.reinterpret())?.toKString()

    /**
     * Gets the propagation limit of the event controller.
     *
     * @return the propagation limit
     */
    public open fun getPropagationLimit(): PropagationLimit =
        gtk_event_controller_get_propagation_limit(gtkEventControllerPointer.reinterpret()).run {
            PropagationLimit.fromNativeValue(this)
        }

    /**
     * Gets the propagation phase at which @controller handles events.
     *
     * @return the propagation phase
     */
    public open fun getPropagationPhase(): PropagationPhase =
        gtk_event_controller_get_propagation_phase(gtkEventControllerPointer.reinterpret()).run {
            PropagationPhase.fromNativeValue(this)
        }

    /**
     * Returns the `GtkWidget` this controller relates to.
     *
     * @return a `GtkWidget`
     */
    public open fun getWidget(): Widget =
        gtk_event_controller_get_widget(gtkEventControllerPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Resets the @controller to a clean state.
     */
    public open fun reset(): Unit = gtk_event_controller_reset(gtkEventControllerPointer.reinterpret())

    /**
     * Sets a name on the controller that can be used for debugging.
     *
     * @param name a name for @controller
     */
    public open fun setName(name: String? = null): Unit =
        gtk_event_controller_set_name(gtkEventControllerPointer.reinterpret(), name)

    /**
     * Sets the event propagation limit on the event controller.
     *
     * If the limit is set to %GTK_LIMIT_SAME_NATIVE, the controller
     * won't handle events that are targeted at widgets on a different
     * surface, such as popovers.
     *
     * @param limit the propagation limit
     */
    public open fun setPropagationLimit(limit: PropagationLimit): Unit =
        gtk_event_controller_set_propagation_limit(
            gtkEventControllerPointer.reinterpret(),
            limit.nativeValue
        )

    /**
     * Sets the propagation phase at which a controller handles events.
     *
     * If @phase is %GTK_PHASE_NONE, no automatic event handling will be
     * performed, but other additional gesture maintenance will.
     *
     * @param phase a propagation phase
     */
    public open fun setPropagationPhase(phase: PropagationPhase): Unit =
        gtk_event_controller_set_propagation_phase(
            gtkEventControllerPointer.reinterpret(),
            phase.nativeValue
        )

    public companion object : TypeCompanion<EventController> {
        override val type: GeneratedClassKGType<EventController> =
            GeneratedClassKGType(gtk_event_controller_get_type()) {
                EventController(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
