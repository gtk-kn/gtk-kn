// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GTimer
import org.gtkkn.native.glib.g_timer_continue
import org.gtkkn.native.glib.g_timer_destroy
import org.gtkkn.native.glib.g_timer_is_active
import org.gtkkn.native.glib.g_timer_reset
import org.gtkkn.native.glib.g_timer_start
import org.gtkkn.native.glib.g_timer_stop
import kotlin.Boolean
import kotlin.Unit

/**
 * `GTimer` records a start time, and counts microseconds elapsed since
 * that time.
 *
 * This is done somewhat differently on different platforms, and can be
 * tricky to get exactly right, so `GTimer` provides a portable/convenient interface.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `microseconds`: Unsupported pointer to primitive type
 * - function `new`: Return type Timer is unsupported
 */
public class Timer(pointer: CPointer<GTimer>) : ProxyInstance(pointer) {
    public val glibTimerPointer: CPointer<GTimer> = pointer

    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     *
     * @since 2.4
     */
    @GLibVersion2_4
    public fun `continue`(): Unit = g_timer_continue(glibTimerPointer.reinterpret())

    /**
     * Destroys a timer, freeing associated resources.
     */
    public fun destroy(): Unit = g_timer_destroy(glibTimerPointer.reinterpret())

    /**
     * Exposes whether the timer is currently active.
     *
     * @return true if the timer is running, false otherwise
     * @since 2.62
     */
    @GLibVersion2_62
    public fun isActive(): Boolean = g_timer_is_active(glibTimerPointer.reinterpret()).asBoolean()

    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public fun reset(): Unit = g_timer_reset(glibTimerPointer.reinterpret())

    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public fun start(): Unit = g_timer_start(glibTimerPointer.reinterpret())

    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public fun stop(): Unit = g_timer_stop(glibTimerPointer.reinterpret())
}
