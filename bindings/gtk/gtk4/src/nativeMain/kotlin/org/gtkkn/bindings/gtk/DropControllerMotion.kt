// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Drop
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkDropControllerMotion
import org.gtkkn.native.gtk.gtk_drop_controller_motion_contains_pointer
import org.gtkkn.native.gtk.gtk_drop_controller_motion_get_drop
import org.gtkkn.native.gtk.gtk_drop_controller_motion_get_type
import org.gtkkn.native.gtk.gtk_drop_controller_motion_is_pointer
import org.gtkkn.native.gtk.gtk_drop_controller_motion_new
import kotlin.Boolean
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkDropControllerMotion` is an event controller tracking
 * the pointer during Drag-and-Drop operations.
 *
 * It is modeled after [class@Gtk.EventControllerMotion] so if you
 * have used that, this should feel really familiar.
 *
 * This controller is not able to accept drops, use [class@Gtk.DropTarget]
 * for that purpose.
 *
 * ## Skipped during bindings generation
 *
 * - method `contains-pointer`: Property has no getter nor setter
 * - method `is-pointer`: Property has no getter nor setter
 */
public open class DropControllerMotion(
    pointer: CPointer<GtkDropControllerMotion>,
) : EventController(pointer.reinterpret()), KGTyped {
    public val gtkDropControllerMotionPointer: CPointer<GtkDropControllerMotion>
        get() = gPointer.reinterpret()

    /**
     * The ongoing drop operation over the controller's widget or
     * its descendant.
     *
     * If no drop operation is going on, this property returns null.
     *
     * The event controller should not modify the @drop, but it might
     * want to query its properties.
     *
     * When handling crossing events, this property is updated
     * before [signal@Gtk.DropControllerMotion::enter], but after
     * [signal@Gtk.DropControllerMotion::leave] is emitted.
     */
    public open val drop: Drop?
        /**
         * Returns the `GdkDrop` of a current Drag-and-Drop operation
         * over the widget of @self.
         *
         * @return The `GdkDrop` currently
         *   happening within @self
         */
        get() =
            gtk_drop_controller_motion_get_drop(gtkDropControllerMotionPointer.reinterpret())?.run {
                Drop(reinterpret())
            }

    /**
     * Creates a new event controller that will handle pointer motion
     * events during drag and drop.
     *
     * @return a new `GtkDropControllerMotion`
     */
    public constructor() : this(gtk_drop_controller_motion_new()!!.reinterpret())

    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * @self or one of its children.
     *
     * @return true if a dragging pointer is within @self or one of its children.
     */
    public open fun containsPointer(): Boolean =
        gtk_drop_controller_motion_contains_pointer(gtkDropControllerMotionPointer.reinterpret()).asBoolean()

    /**
     * Returns the `GdkDrop` of a current Drag-and-Drop operation
     * over the widget of @self.
     *
     * @return The `GdkDrop` currently
     *   happening within @self
     */
    public open fun getDrop(): Drop? =
        gtk_drop_controller_motion_get_drop(gtkDropControllerMotionPointer.reinterpret())?.run {
            Drop(reinterpret())
        }

    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * @self, not one of its children.
     *
     * @return true if a dragging pointer is within @self but
     *   not one of its children
     */
    public open fun isPointer(): Boolean =
        gtk_drop_controller_motion_is_pointer(gtkDropControllerMotionPointer.reinterpret()).asBoolean()

    /**
     * Signals that the pointer has entered the widget.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` coordinates of pointer location; `y`
     * coordinates of pointer location
     */
    public fun connectEnter(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Double,
            y: Double,
        ) -> Unit,
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
        handler: (
            x: Double,
            y: Double,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "motion",
            connectMotionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<DropControllerMotion> {
        override val type: GeneratedClassKGType<DropControllerMotion> =
            GeneratedClassKGType(gtk_drop_controller_motion_get_type()) {
                DropControllerMotion(it.reinterpret())
            }

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

private val connectMotionFunc: CPointer<CFunction<(Double, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> Unit>().get().invoke(x, y)
    }
        .reinterpret()
