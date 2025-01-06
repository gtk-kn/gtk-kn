// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.EventSequence
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkEventSequence
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkGestureClick
import org.gtkkn.native.gtk.gtk_gesture_click_get_type
import org.gtkkn.native.gtk.gtk_gesture_click_new
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGestureClick` is a `GtkGesture` implementation for clicks.
 *
 * It is able to recognize multiple clicks on a nearby zone, which
 * can be listened for through the [signal@Gtk.GestureClick::pressed]
 * signal. Whenever time or distance between clicks exceed the GTK
 * defaults, [signal@Gtk.GestureClick::stopped] is emitted, and the
 * click counter is reset.
 */
public open class GestureClick(pointer: CPointer<GtkGestureClick>) :
    GestureSingle(pointer.reinterpret()),
    KGTyped {
    public val gtkGestureClickPointer: CPointer<GtkGestureClick>
        get() = gPointer.reinterpret()

    /**
     * Returns a newly created `GtkGesture` that recognizes
     * single and multiple presses.
     *
     * @return a newly created `GtkGestureClick`
     */
    public constructor() : this(gtk_gesture_click_new()!!.reinterpret())

    /**
     * Emitted whenever a button or touch press happens.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `nPress` how many touch/button presses happened with this one; `x` The X coordinate, in widget allocation coordinates; `y` The Y coordinate, in widget allocation coordinates
     */
    public fun connectPressed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            nPress: gint,
            x: gdouble,
            y: gdouble,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "pressed",
        connectPressedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a button or touch is released.
     *
     * @n_press will report the number of press that is paired to
     * this event, note that [signal@Gtk.GestureClick::stopped] may
     * have been emitted between the press and its release, @n_press
     * will only start over at the next press.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `nPress` number of press that is paired with this release; `x` The X coordinate, in widget allocation coordinates; `y` The Y coordinate, in widget allocation coordinates
     */
    public fun connectReleased(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            nPress: gint,
            x: gdouble,
            y: gdouble,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "released",
        connectReleasedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted whenever any time/distance threshold has been exceeded.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectStopped(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "stopped",
            connectStoppedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever the gesture receives a release
     * event that had no previous corresponding press.
     *
     * Due to implicit grabs, this can only happen on situations
     * where input is grabbed elsewhere mid-press or the pressed
     * widget voluntarily relinquishes its implicit grab.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` X coordinate of the event; `y` Y coordinate of the event; `button` Button being released; `sequence` Sequence being released
     */
    public fun connectUnpairedRelease(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: gdouble,
            y: gdouble,
            button: guint,
            sequence: EventSequence?,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "unpaired-release",
        connectUnpairedReleaseFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<GestureClick> {
        override val type: GeneratedClassKGType<GestureClick> =
            GeneratedClassKGType(gtk_gesture_click_get_type()) { GestureClick(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureClick
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_click_get_type()
    }
}

private val connectPressedFunc: CPointer<
    CFunction<
        (
            gint,
            gdouble,
            gdouble,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        nPress: gint,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            nPress: gint,
            x: gdouble,
            y: gdouble,
        ) -> Unit
        >().get().invoke(nPress, x, y)
}
    .reinterpret()

private val connectReleasedFunc: CPointer<
    CFunction<
        (
            gint,
            gdouble,
            gdouble,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        nPress: gint,
        x: gdouble,
        y: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            nPress: gint,
            x: gdouble,
            y: gdouble,
        ) -> Unit
        >().get().invoke(nPress, x, y)
}
    .reinterpret()

private val connectStoppedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectUnpairedReleaseFunc: CPointer<
    CFunction<
        (
            gdouble,
            gdouble,
            guint,
            CPointer<GdkEventSequence>?,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        x: gdouble,
        y: gdouble,
        button: guint,
        sequence: CPointer<GdkEventSequence>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            x: gdouble,
            y: gdouble,
            button: guint,
            sequence: EventSequence?,
        ) -> Unit
        >().get().invoke(
        x,
        y,
        button,
        sequence?.run {
            EventSequence(reinterpret())
        }
    )
}
    .reinterpret()
