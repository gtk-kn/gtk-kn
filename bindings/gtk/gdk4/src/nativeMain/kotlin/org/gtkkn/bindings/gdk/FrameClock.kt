// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkFrameClock
import org.gtkkn.native.gdk.gdk_frame_clock_begin_updating
import org.gtkkn.native.gdk.gdk_frame_clock_end_updating
import org.gtkkn.native.gdk.gdk_frame_clock_get_current_timings
import org.gtkkn.native.gdk.gdk_frame_clock_get_fps
import org.gtkkn.native.gdk.gdk_frame_clock_get_frame_counter
import org.gtkkn.native.gdk.gdk_frame_clock_get_frame_time
import org.gtkkn.native.gdk.gdk_frame_clock_get_history_start
import org.gtkkn.native.gdk.gdk_frame_clock_get_timings
import org.gtkkn.native.gdk.gdk_frame_clock_get_type
import org.gtkkn.native.gdk.gdk_frame_clock_request_phase
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkFrameClock` tells the application when to update and repaint
 * a surface.
 *
 * This may be synced to the vertical refresh rate of the monitor, for example.
 * Even when the frame clock uses a simple timer rather than a hardware-based
 * vertical sync, the frame clock helps because it ensures everything paints at
 * the same time (reducing the total number of frames).
 *
 * The frame clock can also automatically stop painting when it knows the frames
 * will not be visible, or scale back animation framerates.
 *
 * `GdkFrameClock` is designed to be compatible with an OpenGL-based implementation
 * or with mozRequestAnimationFrame in Firefox, for example.
 *
 * A frame clock is idle until someone requests a frame with
 * [method@Gdk.FrameClock.request_phase]. At some later point that makes sense
 * for the synchronization being implemented, the clock will process a frame and
 * emit signals for each phase that has been requested. (See the signals of the
 * `GdkFrameClock` class for documentation of the phases.
 * %GDK_FRAME_CLOCK_PHASE_UPDATE and the [signal@Gdk.FrameClock::update] signal
 * are most interesting for application writers, and are used to update the
 * animations, using the frame time given by [method@Gdk.FrameClock.get_frame_time].
 *
 * The frame time is reported in microseconds and generally in the same
 * timescale as g_get_monotonic_time(), however, it is not the same
 * as g_get_monotonic_time(). The frame time does not advance during
 * the time a frame is being painted, and outside of a frame, an attempt
 * is made so that all calls to [method@Gdk.FrameClock.get_frame_time] that
 * are called at a “similar” time get the same value. This means that
 * if different animations are timed by looking at the difference in
 * time between an initial value from [method@Gdk.FrameClock.get_frame_time]
 * and the value inside the [signal@Gdk.FrameClock::update] signal of the clock,
 * they will stay exactly synchronized.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `refresh_interval_return`: refresh_interval_return: Out parameter is not supported
 */
public abstract class FrameClock(public val gdkFrameClockPointer: CPointer<GdkFrameClock>) :
    Object(gdkFrameClockPointer.reinterpret()),
    KGTyped {
    /**
     * Starts updates for an animation.
     *
     * Until a matching call to [method@Gdk.FrameClock.end_updating] is made,
     * the frame clock will continually request a new frame with the
     * %GDK_FRAME_CLOCK_PHASE_UPDATE phase. This function may be called multiple
     * times and frames will be requested until gdk_frame_clock_end_updating()
     * is called the same number of times.
     */
    public open fun beginUpdating(): Unit = gdk_frame_clock_begin_updating(gdkFrameClockPointer)

    /**
     * Stops updates for an animation.
     *
     * See the documentation for [method@Gdk.FrameClock.begin_updating].
     */
    public open fun endUpdating(): Unit = gdk_frame_clock_end_updating(gdkFrameClockPointer)

    /**
     * Gets the frame timings for the current frame.
     *
     * @return the `GdkFrameTimings` for the
     *   frame currently being processed, or even no frame is being
     *   processed, for the previous frame. Before any frames have been
     *   processed, returns null.
     */
    public open fun getCurrentTimings(): FrameTimings? =
        gdk_frame_clock_get_current_timings(gdkFrameClockPointer)?.run {
            FrameTimings(this)
        }

    /**
     * Calculates the current frames-per-second, based on the
     * frame timings of @frame_clock.
     *
     * @return the current fps, as a `double`
     */
    public open fun getFps(): gdouble = gdk_frame_clock_get_fps(gdkFrameClockPointer)

    /**
     * `GdkFrameClock` maintains a 64-bit counter that increments for
     * each frame drawn.
     *
     * @return inside frame processing, the value of the frame counter
     *   for the current frame. Outside of frame processing, the frame
     *   counter for the last frame.
     */
    public open fun getFrameCounter(): gint64 = gdk_frame_clock_get_frame_counter(gdkFrameClockPointer)

    /**
     * Gets the time that should currently be used for animations.
     *
     * Inside the processing of a frame, it’s the time used to compute the
     * animation position of everything in a frame. Outside of a frame, it's
     * the time of the conceptual “previous frame,” which may be either
     * the actual previous frame time, or if that’s too old, an updated
     * time.
     *
     * @return a timestamp in microseconds, in the timescale of
     *  of g_get_monotonic_time().
     */
    public open fun getFrameTime(): gint64 = gdk_frame_clock_get_frame_time(gdkFrameClockPointer)

    /**
     * Returns the frame counter for the oldest frame available in history.
     *
     * `GdkFrameClock` internally keeps a history of `GdkFrameTimings`
     * objects for recent frames that can be retrieved with
     * [method@Gdk.FrameClock.get_timings]. The set of stored frames
     * is the set from the counter values given by
     * [method@Gdk.FrameClock.get_history_start] and
     * [method@Gdk.FrameClock.get_frame_counter], inclusive.
     *
     * @return the frame counter value for the oldest frame
     *  that is available in the internal frame history of the
     *  `GdkFrameClock`
     */
    public open fun getHistoryStart(): gint64 = gdk_frame_clock_get_history_start(gdkFrameClockPointer)

    /**
     * Retrieves a `GdkFrameTimings` object holding timing information
     * for the current frame or a recent frame.
     *
     * The `GdkFrameTimings` object may not yet be complete: see
     * [method@Gdk.FrameTimings.get_complete] and
     * [method@Gdk.FrameClock.get_history_start].
     *
     * @param frameCounter the frame counter value identifying the frame to
     *  be received
     * @return the `GdkFrameTimings` object
     *   for the specified frame, or null if it is not available
     */
    public open fun getTimings(frameCounter: gint64): FrameTimings? =
        gdk_frame_clock_get_timings(gdkFrameClockPointer, frameCounter)?.run {
            FrameTimings(this)
        }

    /**
     * Asks the frame clock to run a particular phase.
     *
     * The signal corresponding the requested phase will be emitted the next
     * time the frame clock processes. Multiple calls to
     * gdk_frame_clock_request_phase() will be combined together
     * and only one frame processed. If you are displaying animated
     * content and want to continually request the
     * %GDK_FRAME_CLOCK_PHASE_UPDATE phase for a period of time,
     * you should use [method@Gdk.FrameClock.begin_updating] instead,
     * since this allows GTK to adjust system parameters to get maximally
     * smooth animations.
     *
     * @param phase the phase that is requested
     */
    public open fun requestPhase(phase: FrameClockPhase): Unit =
        gdk_frame_clock_request_phase(gdkFrameClockPointer, phase.mask)

    /**
     * This signal ends processing of the frame.
     *
     * Applications should generally not handle this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onAfterPaint(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "after-paint",
            onAfterPaintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "after-paint" signal. See [onAfterPaint].
     */
    public fun emitAfterPaint() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "after-paint")
    }

    /**
     * Begins processing of the frame.
     *
     * Applications should generally not handle this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onBeforePaint(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "before-paint",
            onBeforePaintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "before-paint" signal. See [onBeforePaint].
     */
    public fun emitBeforePaint() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "before-paint")
    }

    /**
     * Used to flush pending motion events that are being batched up and
     * compressed together.
     *
     * Applications should not handle this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onFlushEvents(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "flush-events",
            onFlushEventsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "flush-events" signal. See [onFlushEvents].
     */
    public fun emitFlushEvents() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "flush-events")
    }

    /**
     * Emitted as the second step of toolkit and application processing
     * of the frame.
     *
     * Any work to update sizes and positions of application elements
     * should be performed. GTK normally handles this internally.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onLayout(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "layout",
            onLayoutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "layout" signal. See [onLayout].
     */
    public fun emitLayout() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "layout")
    }

    /**
     * Emitted as the third step of toolkit and application processing
     * of the frame.
     *
     * The frame is repainted. GDK normally handles this internally and
     * emits [signal@Gdk.Surface::render] signals which are turned into
     * [GtkWidget::snapshot](../gtk4/signal.Widget.snapshot.html) signals
     * by GTK.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPaint(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "paint",
            onPaintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "paint" signal. See [onPaint].
     */
    public fun emitPaint() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "paint")
    }

    /**
     * Emitted after processing of the frame is finished.
     *
     * This signal is handled internally by GTK to resume normal
     * event processing. Applications should not handle this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onResumeEvents(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "resume-events",
            onResumeEventsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "resume-events" signal. See [onResumeEvents].
     */
    public fun emitResumeEvents() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "resume-events")
    }

    /**
     * Emitted as the first step of toolkit and application processing
     * of the frame.
     *
     * Animations should be updated using [method@Gdk.FrameClock.get_frame_time].
     * Applications can connect directly to this signal, or use
     * [gtk_widget_add_tick_callback()](../gtk4/method.Widget.add_tick_callback.html)
     * as a more convenient interface.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUpdate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkFrameClockPointer,
            "update",
            onUpdateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "update" signal. See [onUpdate].
     */
    public fun emitUpdate() {
        g_signal_emit_by_name(gdkFrameClockPointer.reinterpret(), "update")
    }

    /**
     * The FrameClockImpl type represents a native instance of the abstract FrameClock class.
     *
     * @constructor Creates a new instance of FrameClock for the provided [CPointer].
     */
    public class FrameClockImpl(pointer: CPointer<GdkFrameClock>) : FrameClock(pointer)

    public companion object : TypeCompanion<FrameClock> {
        override val type: GeneratedClassKGType<FrameClock> =
            GeneratedClassKGType(gdk_frame_clock_get_type()) { FrameClockImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of FrameClock
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_frame_clock_get_type()
    }
}

private val onAfterPaintFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onBeforePaintFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onFlushEventsFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onLayoutFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPaintFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onResumeEventsFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onUpdateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
