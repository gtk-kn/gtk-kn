// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Glib.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GThreadPool
import org.gtkkn.native.glib.g_thread_pool_free
import org.gtkkn.native.glib.g_thread_pool_get_max_idle_time
import org.gtkkn.native.glib.g_thread_pool_get_max_threads
import org.gtkkn.native.glib.g_thread_pool_get_max_unused_threads
import org.gtkkn.native.glib.g_thread_pool_get_num_threads
import org.gtkkn.native.glib.g_thread_pool_get_num_unused_threads
import org.gtkkn.native.glib.g_thread_pool_set_max_idle_time
import org.gtkkn.native.glib.g_thread_pool_set_max_threads
import org.gtkkn.native.glib.g_thread_pool_set_max_unused_threads
import org.gtkkn.native.glib.g_thread_pool_stop_unused_threads
import org.gtkkn.native.glib.g_thread_pool_unprocessed
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.UInt
import kotlin.Unit

/**
 * The #GThreadPool struct represents a thread pool. It has three
 * public read-only members, but the underlying struct is bigger,
 * so you must not copy this struct.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - field `func`: Func
 * - field `user_data`: gpointer
 */
public class ThreadPool(
    pointer: CPointer<GThreadPool>,
) : Record {
    public val glibThreadPoolPointer: CPointer<GThreadPool> = pointer

    /**
     * are all threads exclusive to this pool
     */
    public var exclusive: Boolean
        get() = glibThreadPoolPointer.pointed.exclusive.asBoolean()
        set(`value`) {
            glibThreadPoolPointer.pointed.exclusive = value.asGBoolean()
        }

    /**
     * Frees all resources allocated for @pool.
     *
     * If @immediate is true, no new task is processed for @pool.
     * Otherwise @pool is not freed before the last task is processed.
     * Note however, that no thread of this pool is interrupted while
     * processing a task. Instead at least all still running threads
     * can finish their tasks before the @pool is freed.
     *
     * If @wait_ is true, this function does not return before all
     * tasks to be processed (dependent on @immediate, whether all
     * or only the currently running) are ready.
     * Otherwise this function returns immediately.
     *
     * After calling this function @pool must not be used anymore.
     *
     * @param immediate should @pool shut down immediately?
     * @param wait should the function wait for all tasks to be finished?
     */
    public fun free(
        immediate: Boolean,
        wait: Boolean,
    ): Unit =
        g_thread_pool_free(
            glibThreadPoolPointer.reinterpret(),
            immediate.asGBoolean(),
            wait.asGBoolean()
        )

    /**
     * Returns the maximal number of threads for @pool.
     *
     * @return the maximal number of threads
     */
    public fun getMaxThreads(): Int = g_thread_pool_get_max_threads(glibThreadPoolPointer.reinterpret())

    /**
     * Returns the number of threads currently running in @pool.
     *
     * @return the number of threads currently running
     */
    public fun getNumThreads(): UInt = g_thread_pool_get_num_threads(glibThreadPoolPointer.reinterpret())

    /**
     * Sets the maximal allowed number of threads for @pool.
     * A value of -1 means that the maximal number of threads
     * is unlimited. If @pool is an exclusive thread pool, setting
     * the maximal number of threads to -1 is not allowed.
     *
     * Setting @max_threads to 0 means stopping all work for @pool.
     * It is effectively frozen until @max_threads is set to a non-zero
     * value again.
     *
     * A thread is never terminated while calling @func, as supplied by
     * g_thread_pool_new(). Instead the maximal number of threads only
     * has effect for the allocation of new threads in g_thread_pool_push().
     * A new thread is allocated, whenever the number of currently
     * running threads in @pool is smaller than the maximal number.
     *
     * @error can be null to ignore errors, or non-null to report
     * errors. An error can only occur when a new thread couldn't be
     * created.
     *
     * Before version 2.32, this function did not return a success status.
     *
     * @param maxThreads a new maximal number of threads for @pool,
     *     or -1 for unlimited
     * @return true on success, false if an error occurred
     */
    public fun setMaxThreads(maxThreads: Int): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_thread_pool_set_max_threads(
                    glibThreadPoolPointer.reinterpret(),
                    maxThreads,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Returns the number of tasks still unprocessed in @pool.
     *
     * @return the number of unprocessed tasks
     */
    public fun unprocessed(): UInt = g_thread_pool_unprocessed(glibThreadPoolPointer.reinterpret())

    public companion object : RecordCompanion<ThreadPool, GThreadPool> {
        /**
         * This function will return the maximum @interval that a
         * thread will wait in the thread pool for new tasks before
         * being stopped.
         *
         * If this function returns 0, threads waiting in the thread
         * pool for new work are not stopped.
         *
         * @return the maximum @interval (milliseconds) to wait
         *     for new tasks in the thread pool before stopping the
         *     thread
         * @since 2.10
         */
        public fun getMaxIdleTime(): UInt = g_thread_pool_get_max_idle_time()

        /**
         * Returns the maximal allowed number of unused threads.
         *
         * @return the maximal number of unused threads
         */
        public fun getMaxUnusedThreads(): Int = g_thread_pool_get_max_unused_threads()

        /**
         * Returns the number of currently unused threads.
         *
         * @return the number of currently unused threads
         */
        public fun getNumUnusedThreads(): UInt = g_thread_pool_get_num_unused_threads()

        /**
         * This function will set the maximum @interval that a thread
         * waiting in the pool for new tasks can be idle for before
         * being stopped. This function is similar to calling
         * g_thread_pool_stop_unused_threads() on a regular timeout,
         * except this is done on a per thread basis.
         *
         * By setting @interval to 0, idle threads will not be stopped.
         *
         * The default value is 15000 (15 seconds).
         *
         * @param interval the maximum @interval (in milliseconds)
         *     a thread can be idle
         * @since 2.10
         */
        public fun setMaxIdleTime(interval: UInt): Unit = g_thread_pool_set_max_idle_time(interval)

        /**
         * Sets the maximal number of unused threads to @max_threads.
         * If @max_threads is -1, no limit is imposed on the number
         * of unused threads.
         *
         * The default value is 2.
         *
         * @param maxThreads maximal number of unused threads
         */
        public fun setMaxUnusedThreads(maxThreads: Int): Unit = g_thread_pool_set_max_unused_threads(maxThreads)

        /**
         * Stops all currently unused threads. This does not change the
         * maximal number of unused threads. This function can be used to
         * regularly stop all unused threads e.g. from g_timeout_add().
         */
        public fun stopUnusedThreads(): Unit = g_thread_pool_stop_unused_threads()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ThreadPool = ThreadPool(pointer.reinterpret())
    }
}
