// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Device
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.EventSequence
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkEventSequence
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEventSequenceState
import org.gtkkn.native.gtk.GtkGesture
import org.gtkkn.native.gtk.gtk_gesture_get_bounding_box
import org.gtkkn.native.gtk.gtk_gesture_get_device
import org.gtkkn.native.gtk.gtk_gesture_get_group
import org.gtkkn.native.gtk.gtk_gesture_get_last_event
import org.gtkkn.native.gtk.gtk_gesture_get_last_updated_sequence
import org.gtkkn.native.gtk.gtk_gesture_get_sequence_state
import org.gtkkn.native.gtk.gtk_gesture_get_sequences
import org.gtkkn.native.gtk.gtk_gesture_get_type
import org.gtkkn.native.gtk.gtk_gesture_group
import org.gtkkn.native.gtk.gtk_gesture_handles_sequence
import org.gtkkn.native.gtk.gtk_gesture_is_active
import org.gtkkn.native.gtk.gtk_gesture_is_grouped_with
import org.gtkkn.native.gtk.gtk_gesture_is_recognized
import org.gtkkn.native.gtk.gtk_gesture_set_sequence_state
import org.gtkkn.native.gtk.gtk_gesture_set_state
import org.gtkkn.native.gtk.gtk_gesture_ungroup
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGesture` is the base class for gesture recognition.
 *
 * Although `GtkGesture` is quite generalized to serve as a base for
 * multi-touch gestures, it is suitable to implement single-touch and
 * pointer-based gestures (using the special null `GdkEventSequence`
 * value for these).
 *
 * The number of touches that a `GtkGesture` need to be recognized is
 * controlled by the [property@Gtk.Gesture:n-points] property, if a
 * gesture is keeping track of less or more than that number of sequences,
 * it won't check whether the gesture is recognized.
 *
 * As soon as the gesture has the expected number of touches, it will check
 * regularly if it is recognized, the criteria to consider a gesture as
 * "recognized" is left to `GtkGesture` subclasses.
 *
 * A recognized gesture will then emit the following signals:
 *
 * - [signal@Gtk.Gesture::begin] when the gesture is recognized.
 * - [signal@Gtk.Gesture::update], whenever an input event is processed.
 * - [signal@Gtk.Gesture::end] when the gesture is no longer recognized.
 *
 * ## Event propagation
 *
 * In order to receive events, a gesture needs to set a propagation phase
 * through [method@Gtk.EventController.set_propagation_phase].
 *
 * In the capture phase, events are propagated from the toplevel down
 * to the target widget, and gestures that are attached to containers
 * above the widget get a chance to interact with the event before it
 * reaches the target.
 *
 * In the bubble phase, events are propagated up from the target widget
 * to the toplevel, and gestures that are attached to containers above
 * the widget get a chance to interact with events that have not been
 * handled yet.
 *
 * ## States of a sequence
 *
 * Whenever input interaction happens, a single event may trigger a cascade
 * of `GtkGesture`s, both across the parents of the widget receiving the
 * event and in parallel within an individual widget. It is a responsibility
 * of the widgets using those gestures to set the state of touch sequences
 * accordingly in order to enable cooperation of gestures around the
 * `GdkEventSequence`s triggering those.
 *
 * Within a widget, gestures can be grouped through [method@Gtk.Gesture.group].
 * Grouped gestures synchronize the state of sequences, so calling
 * [method@Gtk.Gesture.set_sequence_state] on one will effectively propagate
 * the state throughout the group.
 *
 * By default, all sequences start out in the %GTK_EVENT_SEQUENCE_NONE state,
 * sequences in this state trigger the gesture event handler, but event
 * propagation will continue unstopped by gestures.
 *
 * If a sequence enters into the %GTK_EVENT_SEQUENCE_DENIED state, the gesture
 * group will effectively ignore the sequence, letting events go unstopped
 * through the gesture, but the "slot" will still remain occupied while
 * the touch is active.
 *
 * If a sequence enters in the %GTK_EVENT_SEQUENCE_CLAIMED state, the gesture
 * group will grab all interaction on the sequence, by:
 *
 * - Setting the same sequence to %GTK_EVENT_SEQUENCE_DENIED on every other
 *   gesture group within the widget, and every gesture on parent widgets
 *   in the propagation chain.
 * - Emitting [signal@Gtk.Gesture::cancel] on every gesture in widgets
 *   underneath in the propagation chain.
 * - Stopping event propagation after the gesture group handles the event.
 *
 * Note: if a sequence is set early to %GTK_EVENT_SEQUENCE_CLAIMED on
 * %GDK_TOUCH_BEGIN/%GDK_BUTTON_PRESS (so those events are captured before
 * reaching the event widget, this implies %GTK_PHASE_CAPTURE), one similar
 * event will be emulated if the sequence changes to %GTK_EVENT_SEQUENCE_DENIED.
 * This way event coherence is preserved before event propagation is unstopped
 * again.
 *
 * Sequence states can't be changed freely.
 * See [method@Gtk.Gesture.set_sequence_state] to know about the possible
 * lifetimes of a `GdkEventSequence`.
 *
 * ## Touchpad gestures
 *
 * On the platforms that support it, `GtkGesture` will handle transparently
 * touchpad gesture events. The only precautions users of `GtkGesture` should
 * do to enable this support are:
 *
 * - If the gesture has %GTK_PHASE_NONE, ensuring events of type
 *   %GDK_TOUCHPAD_SWIPE and %GDK_TOUCHPAD_PINCH are handled by the `GtkGesture`
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `x`: x: Out parameter is not supported
 * - method `n-points`: Property has no getter nor setter
 */
public open class Gesture(
    pointer: CPointer<GtkGesture>,
) : EventController(pointer.reinterpret()), KGTyped {
    public val gtkGesturePointer: CPointer<GtkGesture>
        get() = gPointer.reinterpret()

    /**
     * If there are touch sequences being currently handled by @gesture,
     * returns true and fills in @rect with the bounding box containing
     * all active touches.
     *
     * Otherwise, false will be returned.
     *
     * Note: This function will yield unexpected results on touchpad
     * gestures. Since there is no correlation between physical and
     * pixel distances, these will look as if constrained in an
     * infinitely small area, @rect width and height will thus be 0
     * regardless of the number of touchpoints.
     *
     * @param rect bounding box containing all active touches.
     * @return true if there are active touches, false otherwise
     */
    public open fun getBoundingBox(rect: Rectangle): Boolean =
        gtk_gesture_get_bounding_box(
            gtkGesturePointer.reinterpret(),
            rect.gdkRectanglePointer
        ).asBoolean()

    /**
     * Returns the logical `GdkDevice` that is currently operating
     * on @gesture.
     *
     * This returns null if the gesture is not being interacted.
     *
     * @return a `GdkDevice`
     */
    public open fun getDevice(): Device? =
        gtk_gesture_get_device(gtkGesturePointer.reinterpret())?.run {
            Device(reinterpret())
        }

    /**
     * Returns all gestures in the group of @gesture
     *
     * @return The list
     *   of `GtkGesture`s, free with g_list_free()
     */
    public open fun getGroup(): List =
        gtk_gesture_get_group(gtkGesturePointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Returns the last event that was processed for @sequence.
     *
     * Note that the returned pointer is only valid as long as the
     * @sequence is still interpreted by the @gesture. If in doubt,
     * you should make a copy of the event.
     *
     * @param sequence a `GdkEventSequence`
     * @return The last event from @sequence
     */
    public open fun getLastEvent(sequence: EventSequence? = null): Event? =
        gtk_gesture_get_last_event(
            gtkGesturePointer.reinterpret(),
            sequence?.gdkEventSequencePointer
        )?.run {
            Event(reinterpret())
        }

    /**
     * Returns the `GdkEventSequence` that was last updated on @gesture.
     *
     * @return The last updated sequence
     */
    public open fun getLastUpdatedSequence(): EventSequence? =
        gtk_gesture_get_last_updated_sequence(gtkGesturePointer.reinterpret())?.run {
            EventSequence(reinterpret())
        }

    /**
     * Returns the @sequence state, as seen by @gesture.
     *
     * @param sequence a `GdkEventSequence`
     * @return The sequence state in @gesture
     */
    public open fun getSequenceState(sequence: EventSequence): EventSequenceState =
        gtk_gesture_get_sequence_state(
            gtkGesturePointer.reinterpret(),
            sequence.gdkEventSequencePointer
        ).run {
            EventSequenceState.fromNativeValue(this)
        }

    /**
     * Returns the list of `GdkEventSequences` currently being interpreted
     * by @gesture.
     *
     * @return A list
     *   of `GdkEventSequence`, the list elements are owned by GTK and must
     *   not be freed or modified, the list itself must be deleted
     *   through g_list_free()
     */
    public open fun getSequences(): List =
        gtk_gesture_get_sequences(gtkGesturePointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Adds @gesture to the same group than @group_gesture.
     *
     * Gestures are by default isolated in their own groups.
     *
     * Both gestures must have been added to the same widget before
     * they can be grouped.
     *
     * When gestures are grouped, the state of `GdkEventSequences`
     * is kept in sync for all of those, so calling
     * [method@Gtk.Gesture.set_sequence_state], on one will transfer
     * the same value to the others.
     *
     * Groups also perform an "implicit grabbing" of sequences, if a
     * `GdkEventSequence` state is set to %GTK_EVENT_SEQUENCE_CLAIMED
     * on one group, every other gesture group attached to the same
     * `GtkWidget` will switch the state for that sequence to
     * %GTK_EVENT_SEQUENCE_DENIED.
     *
     * @param gesture a `GtkGesture`
     */
    public open fun group(gesture: Gesture): Unit =
        gtk_gesture_group(
            gtkGesturePointer.reinterpret(),
            gesture.gtkGesturePointer.reinterpret()
        )

    /**
     * Returns true if @gesture is currently handling events
     * corresponding to @sequence.
     *
     * @param sequence a `GdkEventSequence`
     * @return true if @gesture is handling @sequence, false otherwise
     */
    public open fun handlesSequence(sequence: EventSequence? = null): Boolean =
        gtk_gesture_handles_sequence(
            gtkGesturePointer.reinterpret(),
            sequence?.gdkEventSequencePointer
        ).asBoolean()

    /**
     * Returns true if the gesture is currently active.
     *
     * A gesture is active while there are touch sequences
     * interacting with it.
     *
     * @return true if gesture is active
     */
    public open fun isActive(): Boolean = gtk_gesture_is_active(gtkGesturePointer.reinterpret()).asBoolean()

    /**
     * Returns true if both gestures pertain to the same group.
     *
     * @param other another `GtkGesture`
     * @return whether the gestures are grouped
     */
    public open fun isGroupedWith(other: Gesture): Boolean =
        gtk_gesture_is_grouped_with(
            gtkGesturePointer.reinterpret(),
            other.gtkGesturePointer.reinterpret()
        ).asBoolean()

    /**
     * Returns true if the gesture is currently recognized.
     *
     * A gesture is recognized if there are as many interacting
     * touch sequences as required by @gesture.
     *
     * @return true if gesture is recognized
     */
    public open fun isRecognized(): Boolean = gtk_gesture_is_recognized(gtkGesturePointer.reinterpret()).asBoolean()

    /**
     * Sets the state of @sequence in @gesture.
     *
     * Sequences start in state %GTK_EVENT_SEQUENCE_NONE, and whenever
     * they change state, they can never go back to that state. Likewise,
     * sequences in state %GTK_EVENT_SEQUENCE_DENIED cannot turn back to
     * a not denied state. With these rules, the lifetime of an event
     * sequence is constrained to the next four:
     *
     * * None
     * * None → Denied
     * * None → Claimed
     * * None → Claimed → Denied
     *
     * Note: Due to event handling ordering, it may be unsafe to set the
     * state on another gesture within a [signal@Gtk.Gesture::begin] signal
     * handler, as the callback might be executed before the other gesture
     * knows about the sequence. A safe way to perform this could be:
     *
     * ```c
     * static void
     * first_gesture_begin_cb (GtkGesture       *first_gesture,
     *                         GdkEventSequence *sequence,
     *                         gpointer          user_data)
     * {
     *   gtk_gesture_set_sequence_state (first_gesture, sequence, GTK_EVENT_SEQUENCE_CLAIMED);
     *   gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
     * }
     *
     * static void
     * second_gesture_begin_cb (GtkGesture       *second_gesture,
     *                          GdkEventSequence *sequence,
     *                          gpointer          user_data)
     * {
     *   if (gtk_gesture_get_sequence_state (first_gesture, sequence) == GTK_EVENT_SEQUENCE_CLAIMED)
     *     gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
     * }
     * ```
     *
     * If both gestures are in the same group, just set the state on
     * the gesture emitting the event, the sequence will be already
     * be initialized to the group's global state when the second
     * gesture processes the event.
     *
     * @param sequence a `GdkEventSequence`
     * @param state the sequence state
     * @return true if @sequence is handled by @gesture,
     *   and the state is changed successfully
     */
    public open fun setSequenceState(
        sequence: EventSequence,
        state: EventSequenceState,
    ): Boolean =
        gtk_gesture_set_sequence_state(
            gtkGesturePointer.reinterpret(),
            sequence.gdkEventSequencePointer,
            state.nativeValue
        ).asBoolean()

    /**
     * Sets the state of all sequences that @gesture is currently
     * interacting with.
     *
     * See [method@Gtk.Gesture.set_sequence_state] for more details
     * on sequence states.
     *
     * @param state the sequence state
     * @return true if the state of at least one sequence
     *   was changed successfully
     */
    public open fun setState(state: EventSequenceState): Boolean =
        gtk_gesture_set_state(gtkGesturePointer.reinterpret(), state.nativeValue).asBoolean()

    /**
     * Separates @gesture into an isolated group.
     */
    public open fun ungroup(): Unit = gtk_gesture_ungroup(gtkGesturePointer.reinterpret())

    /**
     * Emitted when the gesture is recognized.
     *
     * This means the number of touch sequences matches
     * [property@Gtk.Gesture:n-points].
     *
     * Note: These conditions may also happen when an extra touch
     * (eg. a third touch on a 2-touches gesture) is lifted, in that
     * situation @sequence won't pertain to the current set of active
     * touches, so don't rely on this being true.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `sequence` the `GdkEventSequence` that made
     * the gesture
     *   to be recognized
     */
    public fun connectBegin(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (sequence: EventSequence?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "begin",
            connectBeginFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever a sequence is cancelled.
     *
     * This usually happens on active touches when
     * [method@Gtk.EventController.reset] is called on @gesture
     * (manually, due to grabs...), or the individual @sequence
     * was claimed by parent widgets' controllers (see
     * [method@Gtk.Gesture.set_sequence_state]).
     *
     * @gesture must forget everything about @sequence as in
     * response to this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `sequence` the `GdkEventSequence` that was
     * cancelled
     */
    public fun connectCancel(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (sequence: EventSequence?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cancel",
            connectCancelFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when @gesture either stopped recognizing the event
     * sequences as something to be handled, or the number of touch
     * sequences became higher or lower than [property@Gtk.Gesture:n-points].
     *
     * Note: @sequence might not pertain to the group of sequences that
     * were previously triggering recognition on @gesture (ie. a just
     * pressed touch sequence that exceeds [property@Gtk.Gesture:n-points]).
     * This situation may be detected by checking through
     * [method@Gtk.Gesture.handles_sequence].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `sequence` the `GdkEventSequence` that made
     * gesture
     *   recognition to finish
     */
    public fun connectEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (sequence: EventSequence?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "end",
            connectEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever a sequence state changes.
     *
     * See [method@Gtk.Gesture.set_sequence_state] to know
     * more about the expectable sequence lifetimes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `sequence` the `GdkEventSequence` that was
     * cancelled; `state` the new sequence state
     */
    public fun connectSequenceStateChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (sequence: EventSequence?, state: EventSequenceState) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "sequence-state-changed",
            connectSequenceStateChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted whenever an event is handled while the gesture is recognized.
     *
     * @sequence is guaranteed to pertain to the set of active touches.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `sequence` the `GdkEventSequence` that was
     * updated
     */
    public fun connectUpdate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (sequence: EventSequence?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "update",
            connectUpdateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Gesture> {
        override val type: GeneratedClassKGType<Gesture> =
            GeneratedClassKGType(gtk_gesture_get_type()) { Gesture(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectBeginFunc: CPointer<CFunction<(CPointer<GdkEventSequence>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            sequence: CPointer<GdkEventSequence>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(sequence: EventSequence?) -> Unit>().get().invoke(
            sequence?.run {
                EventSequence(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectCancelFunc: CPointer<CFunction<(CPointer<GdkEventSequence>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            sequence: CPointer<GdkEventSequence>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(sequence: EventSequence?) -> Unit>().get().invoke(
            sequence?.run {
                EventSequence(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectEndFunc: CPointer<CFunction<(CPointer<GdkEventSequence>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            sequence: CPointer<GdkEventSequence>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(sequence: EventSequence?) -> Unit>().get().invoke(
            sequence?.run {
                EventSequence(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectSequenceStateChangedFunc: CPointer<
    CFunction<
        (
            CPointer<GdkEventSequence>?,
            GtkEventSequenceState,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            sequence: CPointer<GdkEventSequence>?,
            state: GtkEventSequenceState,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                sequence: EventSequence?,
                state: EventSequenceState,
            ) -> Unit
        >().get().invoke(
            sequence?.run {
                EventSequence(reinterpret())
            },
            state.run {
                EventSequenceState.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val connectUpdateFunc: CPointer<CFunction<(CPointer<GdkEventSequence>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            sequence: CPointer<GdkEventSequence>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(sequence: EventSequence?) -> Unit>().get().invoke(
            sequence?.run {
                EventSequence(reinterpret())
            }
        )
    }
        .reinterpret()
