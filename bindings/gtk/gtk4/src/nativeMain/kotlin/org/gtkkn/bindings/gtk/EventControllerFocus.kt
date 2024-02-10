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
public open class EventControllerFocus(
    pointer: CPointer<GtkEventControllerFocus>,
) : EventController(pointer.reinterpret()), KGTyped {
    public val gtkEventControllerFocusPointer: CPointer<GtkEventControllerFocus>
        get() = gPointer.reinterpret()

    /**
     * Creates a new event controller that will handle focus events.
     *
     * @return a new `GtkEventControllerFocus`
     */
    public constructor() : this(gtk_event_controller_focus_new()!!.reinterpret())

    /**
     * Returns true if focus is within @self or one of its children.
     *
     * @return true if focus is within @self or one of its children
     */
    public open fun containsFocus(): Boolean =
        gtk_event_controller_focus_contains_focus(gtkEventControllerFocusPointer.reinterpret()).asBoolean()

    /**
     * Returns true if focus is within @self, but not one of its children.
     *
     * @return true if focus is within @self, but not one of its children
     */
    public open fun isFocus(): Boolean =
        gtk_event_controller_focus_is_focus(gtkEventControllerFocusPointer.reinterpret()).asBoolean()

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectEnter(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
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

    public companion object : TypeCompanion<EventControllerFocus> {
        override val type: GeneratedClassKGType<EventControllerFocus> =
            GeneratedClassKGType(gtk_event_controller_focus_get_type()) {
                EventControllerFocus(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectEnterFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectLeaveFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
