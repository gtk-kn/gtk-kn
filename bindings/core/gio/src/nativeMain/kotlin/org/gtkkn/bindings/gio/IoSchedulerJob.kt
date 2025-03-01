// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SourceFunc
import org.gtkkn.bindings.glib.SourceFuncFunc
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.gio.GIOSchedulerJob
import org.gtkkn.native.gio.g_io_scheduler_job_send_to_mainloop
import org.gtkkn.native.gio.g_io_scheduler_job_send_to_mainloop_async
import kotlin.Boolean
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.36.
 *
 * Use [struct@GLib.ThreadPool] or
 *   [method@Gio.Task.run_in_thread]
 * ---
 *
 * Opaque class for defining and scheduling IO jobs.
 */
public class IoSchedulerJob(public val gioIoSchedulerJobPointer: CPointer<GIOSchedulerJob>) :
    ProxyInstance(gioIoSchedulerJobPointer) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.36.
     *
     * Use g_main_context_invoke().
     * ---
     *
     * Used from an I/O job to send a callback to be run in the thread
     * that the job was started from, waiting for the result (and thus
     * blocking the I/O job).
     *
     * @param func a #GSourceFunc callback that will be called in the original thread
     * @return The return value of @func
     */
    public fun sendToMainloop(func: SourceFunc): Boolean = g_io_scheduler_job_send_to_mainloop(
        gioIoSchedulerJobPointer,
        SourceFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    ).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.36.
     *
     * Use g_main_context_invoke().
     * ---
     *
     * Used from an I/O job to send a callback to be run asynchronously in
     * the thread that the job was started from. The callback will be run
     * when the main loop is available, but at that time the I/O job might
     * have finished. The return value from the callback is ignored.
     *
     * Note that if you are passing the @user_data from g_io_scheduler_push_job()
     * on to this function you have to ensure that it is not freed before
     * @func is called, either by passing null as @notify to
     * g_io_scheduler_push_job() or by using refcounting for @user_data.
     *
     * @param func a #GSourceFunc callback that will be called in the original thread
     */
    public fun sendToMainloopAsync(func: SourceFunc): Unit = g_io_scheduler_job_send_to_mainloop_async(
        gioIoSchedulerJobPointer,
        SourceFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )
}
