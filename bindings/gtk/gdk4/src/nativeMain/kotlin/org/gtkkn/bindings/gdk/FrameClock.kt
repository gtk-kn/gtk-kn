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
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Double
import kotlin.Long
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
public open class FrameClock(
    pointer: CPointer<GdkFrameClock>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gdkFrameClockPointer: CPointer<GdkFrameClock>
        get() = gPointer.reinterpret()

    /**
     * Starts updates for an animation.
     *
     * Until a matching call to [method@Gdk.FrameClock.end_updating] is made,
     * the frame clock will continually request a new frame with the
     * %GDK_FRAME_CLOCK_PHASE_UPDATE phase. This function may be called multiple
     * times and frames will be requested until gdk_frame_clock_end_updating()
     * is called the same number of times.
     */
    public open fun beginUpdating(): Unit = gdk_frame_clock_begin_updating(gdkFrameClockPointer.reinterpret())

    /**
     * Stops updates for an animation.
     *
     * See the documentation for [method@Gdk.FrameClock.begin_updating].
     */
    public open fun endUpdating(): Unit = gdk_frame_clock_end_updating(gdkFrameClockPointer.reinterpret())

    /**
     * Gets the frame timings for the current frame.
     *
     * @return the `GdkFrameTimings` for the
     *   frame currently being processed, or even no frame is being
     *   processed, for the previous frame. Before any frames have been
     *   processed, returns null.
     */
    public open fun getCurrentTimings(): FrameTimings? =
        gdk_frame_clock_get_current_timings(gdkFrameClockPointer.reinterpret())?.run {
            FrameTimings(reinterpret())
        }

    /**
     * Calculates the current frames-per-second, based on the
     * frame timings of @frame_clock.
     *
     * @return the current fps, as a `double`
     */
    public open fun getFps(): Double = gdk_frame_clock_get_fps(gdkFrameClockPointer.reinterpret())

    /**
     * `GdkFrameClock` maintains a 64-bit counter that increments for
     * each frame drawn.
     *
     * @return inside frame processing, the value of the frame counter
     *   for the current frame. Outside of frame processing, the frame
     *   counter for the last frame.
     */
    public open fun getFrameCounter(): Long = gdk_frame_clock_get_frame_counter(gdkFrameClockPointer.reinterpret())

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
    public open fun getFrameTime(): Long = gdk_frame_clock_get_frame_time(gdkFrameClockPointer.reinterpret())

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
    public open fun getHistoryStart(): Long = gdk_frame_clock_get_history_start(gdkFrameClockPointer.reinterpret())

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
    public open fun getTimings(frameCounter: Long): FrameTimings? =
        gdk_frame_clock_get_timings(gdkFrameClockPointer.reinterpret(), frameCounter)?.run {
            FrameTimings(reinterpret())
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
        gdk_frame_clock_request_phase(gdkFrameClockPointer.reinterpret(), phase.mask)

    /**
     * This signal ends processing of the frame.
     *
     * Applications should generally not handle this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectAfterPaint(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "after-paint",
            connectAfterPaintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Begins processing of the frame.
     *
     * Applications should generally not handle this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectBeforePaint(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "before-paint",
            connectBeforePaintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Used to flush pending motion events that are being batched up and
     * compressed together.
     *
     * Applications should not handle this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectFlushEvents(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "flush-events",
            connectFlushEventsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted as the second step of toolkit and application processing
     * of the frame.
     *
     * Any work to update sizes and positions of application elements
     * should be performed. GTK normally handles this internally.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLayout(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "layout",
            connectLayoutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted as the third step of toolkit and application processing
     * of the frame.
     *
     * The frame is repainted. GDK normally handles this internally and
     * emits [signal@Gdk.Surface::render] signals which are turned into
     * [GtkWidget::snapshot](../gtk4/signal.Widget.snapshot.html) signals
     * by GTK.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPaint(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "paint",
            connectPaintFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after processing of the frame is finished.
     *
     * This signal is handled internally by GTK to resume normal
     * event processing. Applications should not handle this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectResumeEvents(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "resume-events",
            connectResumeEventsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted as the first step of toolkit and application processing
     * of the frame.
     *
     * Animations should be updated using [method@Gdk.FrameClock.get_frame_time].
     * Applications can connect directly to this signal, or use
     * [gtk_widget_add_tick_callback()](../gtk4/method.Widget.add_tick_callback.html)
     * as a more convenient interface.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectUpdate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "update",
            connectUpdateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<FrameClock> {
        override val type: GeneratedClassKGType<FrameClock> =
            GeneratedClassKGType(gdk_frame_clock_get_type()) { FrameClock(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}

private val connectAfterPaintFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectBeforePaintFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectFlushEventsFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectLayoutFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectPaintFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectResumeEventsFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectUpdateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
