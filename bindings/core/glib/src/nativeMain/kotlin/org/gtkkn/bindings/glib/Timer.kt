// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GTimer
import org.gtkkn.native.glib.g_timer_continue
import org.gtkkn.native.glib.g_timer_destroy
import org.gtkkn.native.glib.g_timer_is_active
import org.gtkkn.native.glib.g_timer_new
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
 */
public class Timer(public val glibTimerPointer: CPointer<GTimer>) : ProxyInstance(glibTimerPointer) {
    /**
     * Resumes a timer that has previously been stopped with
     * g_timer_stop(). g_timer_stop() must be called before using this
     * function.
     *
     * @since 2.4
     */
    @GLibVersion2_4
    public fun `continue`(): Unit = g_timer_continue(glibTimerPointer)

    /**
     * Destroys a timer, freeing associated resources.
     */
    public fun destroy(): Unit = g_timer_destroy(glibTimerPointer)

    /**
     * Exposes whether the timer is currently active.
     *
     * @return true if the timer is running, false otherwise
     * @since 2.62
     */
    @GLibVersion2_62
    public fun isActive(): Boolean = g_timer_is_active(glibTimerPointer).asBoolean()

    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * already-started timer to reset the start time, so g_timer_reset()
     * serves no purpose.
     */
    public fun reset(): Unit = g_timer_reset(glibTimerPointer)

    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * report the time since g_timer_start() was called. g_timer_new()
     * automatically marks the start time, so no need to call
     * g_timer_start() immediately after creating the timer.
     */
    public fun start(): Unit = g_timer_start(glibTimerPointer)

    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * difference between this end time and the start time.
     */
    public fun stop(): Unit = g_timer_stop(glibTimerPointer)

    public companion object {
        /**
         * Creates a new timer, and starts timing (i.e. g_timer_start() is
         * implicitly called for you).
         *
         * @return a new #GTimer.
         */
        public fun new(): Timer = g_timer_new()!!.run {
            Timer(this)
        }
    }
}
