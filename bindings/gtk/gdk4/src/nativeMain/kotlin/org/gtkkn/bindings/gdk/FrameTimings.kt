// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkFrameTimings
import org.gtkkn.native.gdk.gdk_frame_timings_get_complete
import org.gtkkn.native.gdk.gdk_frame_timings_get_frame_counter
import org.gtkkn.native.gdk.gdk_frame_timings_get_frame_time
import org.gtkkn.native.gdk.gdk_frame_timings_get_predicted_presentation_time
import org.gtkkn.native.gdk.gdk_frame_timings_get_presentation_time
import org.gtkkn.native.gdk.gdk_frame_timings_get_refresh_interval
import org.gtkkn.native.gdk.gdk_frame_timings_get_type
import org.gtkkn.native.gdk.gdk_frame_timings_ref
import org.gtkkn.native.gdk.gdk_frame_timings_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint64
import kotlin.Boolean
import kotlin.Unit

/**
 * A `GdkFrameTimings` object holds timing information for a single frame
 * of the application’s displays.
 *
 * To retrieve `GdkFrameTimings` objects, use [method@Gdk.FrameClock.get_timings]
 * or [method@Gdk.FrameClock.get_current_timings]. The information in
 * `GdkFrameTimings` is useful for precise synchronization of video with
 * the event or audio streams, and for measuring quality metrics for the
 * application’s display, such as latency and jitter.
 */
public class FrameTimings(pointer: CPointer<GdkFrameTimings>) : ProxyInstance(pointer) {
    public val gdkFrameTimingsPointer: CPointer<GdkFrameTimings> = pointer

    /**
     * Returns whether @timings are complete.
     *
     * The timing information in a `GdkFrameTimings` is filled in
     * incrementally as the frame as drawn and passed off to the
     * window system for processing and display to the user. The
     * accessor functions for `GdkFrameTimings` can return 0 to
     * indicate an unavailable value for two reasons: either because
     * the information is not yet available, or because it isn't
     * available at all.
     *
     * Once this function returns true for a frame, you can be
     * certain that no further values will become available and be
     * stored in the `GdkFrameTimings`.
     *
     * @return true if all information that will be available
     *   for the frame has been filled in.
     */
    public fun getComplete(): Boolean = gdk_frame_timings_get_complete(gdkFrameTimingsPointer.reinterpret()).asBoolean()

    /**
     * Gets the frame counter value of the `GdkFrameClock` when
     * this frame was drawn.
     *
     * @return the frame counter value for this frame
     */
    public fun getFrameCounter(): gint64 = gdk_frame_timings_get_frame_counter(gdkFrameTimingsPointer.reinterpret())

    /**
     * Returns the frame time for the frame.
     *
     * This is the time value that is typically used to time
     * animations for the frame. See [method@Gdk.FrameClock.get_frame_time].
     *
     * @return the frame time for the frame, in the timescale
     *  of g_get_monotonic_time()
     */
    public fun getFrameTime(): gint64 = gdk_frame_timings_get_frame_time(gdkFrameTimingsPointer.reinterpret())

    /**
     * Gets the predicted time at which this frame will be displayed.
     *
     * Although no predicted time may be available, if one is available,
     * it will be available while the frame is being generated, in contrast
     * to [method@Gdk.FrameTimings.get_presentation_time], which is only
     * available after the frame has been presented.
     *
     * In general, if you are simply animating, you should use
     * [method@Gdk.FrameClock.get_frame_time] rather than this function,
     * but this function is useful for applications that want exact control
     * over latency. For example, a movie player may want this information
     * for Audio/Video synchronization.
     *
     * @return The predicted time at which the frame will be presented,
     *   in the timescale of g_get_monotonic_time(), or 0 if no predicted
     *   presentation time is available.
     */
    public fun getPredictedPresentationTime(): gint64 =
        gdk_frame_timings_get_predicted_presentation_time(gdkFrameTimingsPointer.reinterpret())

    /**
     * Reurns the presentation time.
     *
     * This is the time at which the frame became visible to the user.
     *
     * @return the time the frame was displayed to the user, in the
     *   timescale of g_get_monotonic_time(), or 0 if no presentation
     *   time is available. See [method@Gdk.FrameTimings.get_complete]
     */
    public fun getPresentationTime(): gint64 =
        gdk_frame_timings_get_presentation_time(gdkFrameTimingsPointer.reinterpret())

    /**
     * Gets the natural interval between presentation times for
     * the display that this frame was displayed on.
     *
     * Frame presentation usually happens during the “vertical
     * blanking interval”.
     *
     * @return the refresh interval of the display, in microseconds,
     *   or 0 if the refresh interval is not available.
     *   See [method@Gdk.FrameTimings.get_complete].
     */
    public fun getRefreshInterval(): gint64 =
        gdk_frame_timings_get_refresh_interval(gdkFrameTimingsPointer.reinterpret())

    /**
     * Increases the reference count of @timings.
     *
     * @return @timings
     */
    public fun ref(): FrameTimings = gdk_frame_timings_ref(gdkFrameTimingsPointer.reinterpret())!!.run {
        FrameTimings(reinterpret())
    }

    /**
     * Decreases the reference count of @timings.
     *
     * If @timings is no longer referenced, it will be freed.
     */
    public fun unref(): Unit = gdk_frame_timings_unref(gdkFrameTimingsPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of FrameTimings
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_frame_timings_get_type()
    }
}
