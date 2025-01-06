// This is a generated file. Do not modify.
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
 * Opaque class for defining and scheduling IO jobs.
 */
public class IoSchedulerJob(pointer: CPointer<GIOSchedulerJob>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GIOSchedulerJob> = pointer

    /**
     * Used from an I/O job to send a callback to be run in the thread
     * that the job was started from, waiting for the result (and thus
     * blocking the I/O job).
     *
     * @param func a #GSourceFunc callback that will be called in the original thread
     * @return The return value of @func
     */
    public fun sendToMainloop(func: SourceFunc): Boolean = g_io_scheduler_job_send_to_mainloop(
        gPointer.reinterpret(),
        SourceFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    ).asBoolean()

    /**
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
        gPointer.reinterpret(),
        SourceFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )
}
