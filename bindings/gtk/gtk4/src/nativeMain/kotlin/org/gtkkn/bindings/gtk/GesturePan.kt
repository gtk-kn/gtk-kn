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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkGesturePan
import org.gtkkn.native.gtk.GtkPanDirection
import org.gtkkn.native.gtk.gtk_gesture_pan_get_orientation
import org.gtkkn.native.gtk.gtk_gesture_pan_get_type
import org.gtkkn.native.gtk.gtk_gesture_pan_new
import org.gtkkn.native.gtk.gtk_gesture_pan_set_orientation
import kotlin.Double
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGesturePan` is a `GtkGesture` for pan gestures.
 *
 * These are drags that are locked to happen along one axis. The axis
 * that a `GtkGesturePan` handles is defined at construct time, and
 * can be changed through [method@Gtk.GesturePan.set_orientation].
 *
 * When the gesture starts to be recognized, `GtkGesturePan` will
 * attempt to determine as early as possible whether the sequence
 * is moving in the expected direction, and denying the sequence if
 * this does not happen.
 *
 * Once a panning gesture along the expected axis is recognized,
 * the [signal@Gtk.GesturePan::pan] signal will be emitted as input
 * events are received, containing the offset in the given axis.
 */
public open class GesturePan(
    pointer: CPointer<GtkGesturePan>,
) : GestureDrag(pointer.reinterpret()),
    KGTyped {
    public val gtkGesturePanPointer: CPointer<GtkGesturePan>
        get() = gPointer.reinterpret()

    /**
     * The expected orientation of pan gestures.
     */
    public open var orientation: Orientation
        /**
         * Returns the orientation of the pan gestures that this @gesture expects.
         *
         * @return the expected orientation for pan gestures
         */
        get() =
            gtk_gesture_pan_get_orientation(gtkGesturePanPointer.reinterpret()).run {
                Orientation.fromNativeValue(this)
            }

        /**
         * Sets the orientation to be expected on pan gestures.
         *
         * @param orientation expected orientation
         */
        set(orientation) = gtk_gesture_pan_set_orientation(gtkGesturePanPointer.reinterpret(), orientation.nativeValue)

    /**
     * Returns a newly created `GtkGesture` that recognizes pan gestures.
     *
     * @param orientation expected orientation
     * @return a newly created `GtkGesturePan`
     */
    public constructor(orientation: Orientation) : this(gtk_gesture_pan_new(orientation.nativeValue)!!.reinterpret())

    /**
     * Returns the orientation of the pan gestures that this @gesture expects.
     *
     * @return the expected orientation for pan gestures
     */
    public open fun getOrientation(): Orientation =
        gtk_gesture_pan_get_orientation(gtkGesturePanPointer.reinterpret()).run {
            Orientation.fromNativeValue(this)
        }

    /**
     * Sets the orientation to be expected on pan gestures.
     *
     * @param orientation expected orientation
     */
    public open fun setOrientation(orientation: Orientation): Unit =
        gtk_gesture_pan_set_orientation(gtkGesturePanPointer.reinterpret(), orientation.nativeValue)

    /**
     * Emitted once a panning gesture along the expected axis is detected.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `direction` current direction of the pan gesture; `offset` Offset along the gesture orientation
     */
    public fun connectPan(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (direction: PanDirection, offset: Double) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "pan",
            connectPanFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<GesturePan> {
        override val type: GeneratedClassKGType<GesturePan> =
            GeneratedClassKGType(gtk_gesture_pan_get_type()) { GesturePan(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectPanFunc: CPointer<CFunction<(GtkPanDirection, Double) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            direction: GtkPanDirection,
            offset: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(direction: PanDirection, offset: Double) -> Unit>().get().invoke(
            direction.run {
                PanDirection.fromNativeValue(this)
            },
            offset
        )
    }.reinterpret()
