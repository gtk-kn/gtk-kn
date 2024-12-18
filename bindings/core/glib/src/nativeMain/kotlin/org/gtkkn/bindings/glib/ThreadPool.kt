// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_46
import org.gtkkn.bindings.glib.annotations.GLibVersion2_70
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GThreadPool
import org.gtkkn.native.glib.g_thread_pool_free
import org.gtkkn.native.glib.g_thread_pool_get_max_idle_time
import org.gtkkn.native.glib.g_thread_pool_get_max_threads
import org.gtkkn.native.glib.g_thread_pool_get_max_unused_threads
import org.gtkkn.native.glib.g_thread_pool_get_num_threads
import org.gtkkn.native.glib.g_thread_pool_get_num_unused_threads
import org.gtkkn.native.glib.g_thread_pool_move_to_front
import org.gtkkn.native.glib.g_thread_pool_new
import org.gtkkn.native.glib.g_thread_pool_new_full
import org.gtkkn.native.glib.g_thread_pool_push
import org.gtkkn.native.glib.g_thread_pool_set_max_idle_time
import org.gtkkn.native.glib.g_thread_pool_set_max_threads
import org.gtkkn.native.glib.g_thread_pool_set_max_unused_threads
import org.gtkkn.native.glib.g_thread_pool_set_sort_function
import org.gtkkn.native.glib.g_thread_pool_stop_unused_threads
import org.gtkkn.native.glib.g_thread_pool_unprocessed
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import kotlin.Boolean
import kotlin.Pair
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `GThreadPool` struct represents a thread pool.
 *
 * A thread pool is useful when you wish to asynchronously fork out the execution of work
 * and continue working in your own thread. If that will happen often, the overhead of starting
 * and destroying a thread each time might be too high. In such cases reusing already started
 * threads seems like a good idea. And it indeed is, but implementing this can be tedious
 * and error-prone.
 *
 * Therefore GLib provides thread pools for your convenience. An added advantage is, that the
 * threads can be shared between the different subsystems of your program, when they are using GLib.
 *
 * To create a new thread pool, you use [func@GLib.ThreadPool.new].
 * It is destroyed by [method@GLib.ThreadPool.free].
 *
 * If you want to execute a certain task within a thread pool, use [method@GLib.ThreadPool.push].
 *
 * To get the current number of running threads you call [method@GLib.ThreadPool.get_num_threads].
 * To get the number of still unprocessed tasks you call [method@GLib.ThreadPool.unprocessed].
 * To control the maximum number of threads for a thread pool, you use
 * [method@GLib.ThreadPool.get_max_threads]. and [method@GLib.ThreadPool.set_max_threads].
 *
 * Finally you can control the number of unused threads, that are kept alive by GLib for future use.
 * The current number can be fetched with [func@GLib.ThreadPool.get_num_unused_threads].
 * The maximum number can be controlled by [func@GLib.ThreadPool.get_max_unused_threads] and
 * [func@GLib.ThreadPool.set_max_unused_threads]. All currently unused threads
 * can be stopped by calling [func@GLib.ThreadPool.stop_unused_threads].
 *
 * ## Skipped during bindings generation
 *
 * - field `func`: Func
 */
public class ThreadPool(pointer: CPointer<GThreadPool>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibThreadPoolPointer: CPointer<GThreadPool> = pointer

    /**
     * the user data for the threads of this pool
     */
    public var userData: gpointer
        get() = glibThreadPoolPointer.pointed.user_data!!

        @UnsafeFieldSetter
        set(`value`) {
            glibThreadPoolPointer.pointed.user_data = value
        }

    /**
     * are all threads exclusive to this pool
     */
    public var exclusive: Boolean
        get() = glibThreadPoolPointer.pointed.exclusive.asBoolean()

        @UnsafeFieldSetter
        set(`value`) {
            glibThreadPoolPointer.pointed.exclusive = value.asGBoolean()
        }

    /**
     * Allocate a new ThreadPool.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GThreadPool>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ThreadPool and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GThreadPool>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ThreadPool using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GThreadPool>().ptr)

    /**
     * Allocate a new ThreadPool.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param userData the user data for the threads of this pool
     * @param exclusive are all threads exclusive to this pool
     */
    public constructor(userData: gpointer, exclusive: Boolean) : this() {
        this.userData = userData
        this.exclusive = exclusive
    }

    /**
     * Allocate a new ThreadPool using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param userData the user data for the threads of this pool
     * @param exclusive are all threads exclusive to this pool
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        userData: gpointer,
        exclusive: Boolean,
        scope: AutofreeScope,
    ) : this(scope) {
        this.userData = userData
        this.exclusive = exclusive
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
    public fun free(immediate: Boolean, wait: Boolean): Unit =
        g_thread_pool_free(glibThreadPoolPointer.reinterpret(), immediate.asGBoolean(), wait.asGBoolean())

    /**
     * Returns the maximal number of threads for @pool.
     *
     * @return the maximal number of threads
     */
    public fun getMaxThreads(): gint = g_thread_pool_get_max_threads(glibThreadPoolPointer.reinterpret())

    /**
     * Returns the number of threads currently running in @pool.
     *
     * @return the number of threads currently running
     */
    public fun getNumThreads(): guint = g_thread_pool_get_num_threads(glibThreadPoolPointer.reinterpret())

    /**
     * Moves the item to the front of the queue of unprocessed
     * items, so that it will be processed next.
     *
     * @param data an unprocessed item in the pool
     * @return true if the item was found and moved
     * @since 2.46
     */
    @GLibVersion2_46
    public fun moveToFront(`data`: gpointer? = null): Boolean =
        g_thread_pool_move_to_front(glibThreadPoolPointer.reinterpret(), `data`).asBoolean()

    /**
     * Inserts @data into the list of tasks to be executed by @pool.
     *
     * When the number of currently running threads is lower than the
     * maximal allowed number of threads, a new thread is started (or
     * reused) with the properties given to g_thread_pool_new().
     * Otherwise, @data stays in the queue until a thread in this pool
     * finishes its previous task and processes @data.
     *
     * @error can be null to ignore errors, or non-null to report
     * errors. An error can only occur when a new thread couldn't be
     * created. In that case @data is simply appended to the queue of
     * work to do.
     *
     * Before version 2.32, this function did not return a success status.
     *
     * @param data a new task for @pool
     * @return true on success, false if an error occurred
     */
    public fun push(`data`: gpointer? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_thread_pool_push(glibThreadPoolPointer.reinterpret(), `data`, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

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
    public fun setMaxThreads(maxThreads: gint): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_thread_pool_set_max_threads(
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
     * Sets the function used to sort the list of tasks. This allows the
     * tasks to be processed by a priority determined by @func, and not
     * just in the order in which they were added to the pool.
     *
     * Note, if the maximum number of threads is more than 1, the order
     * that threads are executed cannot be guaranteed 100%. Threads are
     * scheduled by the operating system and are executed at random. It
     * cannot be assumed that threads are executed in the order they are
     * created.
     *
     * @param func the #GCompareDataFunc used to sort the list of tasks.
     *     This function is passed two tasks. It should return
     *     0 if the order in which they are handled does not matter,
     *     a negative value if the first task should be processed before
     *     the second or a positive value if the second task should be
     *     processed first.
     * @since 2.10
     */
    @GLibVersion2_10
    public fun setSortFunction(func: CompareDataFunc): Unit = g_thread_pool_set_sort_function(
        glibThreadPoolPointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Returns the number of tasks still unprocessed in @pool.
     *
     * @return the number of unprocessed tasks
     */
    public fun unprocessed(): guint = g_thread_pool_unprocessed(glibThreadPoolPointer.reinterpret())

    override fun toString(): String = "ThreadPool(userData=$userData, exclusive=$exclusive)"

    public companion object {
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
        @GLibVersion2_10
        public fun getMaxIdleTime(): guint = g_thread_pool_get_max_idle_time()

        /**
         * Returns the maximal allowed number of unused threads.
         *
         * @return the maximal number of unused threads
         */
        public fun getMaxUnusedThreads(): gint = g_thread_pool_get_max_unused_threads()

        /**
         * Returns the number of currently unused threads.
         *
         * @return the number of currently unused threads
         */
        public fun getNumUnusedThreads(): guint = g_thread_pool_get_num_unused_threads()

        /**
         * This function creates a new thread pool.
         *
         * Whenever you call g_thread_pool_push(), either a new thread is
         * created or an unused one is reused. At most @max_threads threads
         * are running concurrently for this thread pool. @max_threads = -1
         * allows unlimited threads to be created for this thread pool. The
         * newly created or reused thread now executes the function @func
         * with the two arguments. The first one is the parameter to
         * g_thread_pool_push() and the second one is @user_data.
         *
         * Pass g_get_num_processors() to @max_threads to create as many threads as
         * there are logical processors on the system. This will not pin each thread to
         * a specific processor.
         *
         * The parameter @exclusive determines whether the thread pool owns
         * all threads exclusive or shares them with other thread pools.
         * If @exclusive is true, @max_threads threads are started
         * immediately and they will run exclusively for this thread pool
         * until it is destroyed by g_thread_pool_free(). If @exclusive is
         * false, threads are created when needed and shared between all
         * non-exclusive thread pools. This implies that @max_threads may
         * not be -1 for exclusive thread pools. Besides, exclusive thread
         * pools are not affected by g_thread_pool_set_max_idle_time()
         * since their threads are never considered idle and returned to the
         * global pool.
         *
         * Note that the threads used by exclusive thread pools will all inherit the
         * scheduler settings of the current thread while the threads used by
         * non-exclusive thread pools will inherit the scheduler settings from the
         * first thread that created such a thread pool.
         *
         * At least one thread will be spawned when this function is called, either to
         * create the @max_threads exclusive threads, or to preserve the scheduler
         * settings of the current thread for future spawns.
         *
         * @error can be null to ignore errors, or non-null to report
         * errors. An error can only occur when @exclusive is set to true
         * and not all @max_threads threads could be created.
         * See #GThreadError for possible errors that may occur.
         * Note, even in case of error a valid #GThreadPool is returned.
         *
         * @param func a function to execute in the threads of the new thread pool
         * @param maxThreads the maximal number of threads to execute concurrently
         *     in  the new thread pool, -1 means no limit
         * @param exclusive should this thread pool be exclusive?
         * @return the new #GThreadPool
         */
        public fun new(func: Func, maxThreads: gint, exclusive: Boolean): Result<ThreadPool> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_thread_pool_new(
                FuncFunc.reinterpret(),
                StableRef.create(func).asCPointer(),
                maxThreads,
                exclusive.asGBoolean(),
                gError.ptr
            )?.run {
                ThreadPool(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * This function creates a new thread pool similar to g_thread_pool_new()
         * but allowing @item_free_func to be specified to free the data passed
         * to g_thread_pool_push() in the case that the #GThreadPool is stopped
         * and freed before all tasks have been executed.
         *
         * @item_free_func will *not* be called on items successfully passed to @func.
         * @func is responsible for freeing the items passed to it.
         *
         * @param func a function to execute in the threads of the new thread pool
         * @param maxThreads the maximal number of threads to execute concurrently
         *     in the new thread pool, `-1` means no limit
         * @param exclusive should this thread pool be exclusive?
         * @return the new #GThreadPool
         * @since 2.70
         */
        @GLibVersion2_70
        public fun newFull(func: Func, maxThreads: gint, exclusive: Boolean): Result<ThreadPool> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_thread_pool_new_full(
                FuncFunc.reinterpret(),
                StableRef.create(func).asCPointer(),
                staticStableRefDestroy.reinterpret(),
                maxThreads,
                exclusive.asGBoolean(),
                gError.ptr
            )?.run {
                ThreadPool(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

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
        @GLibVersion2_10
        public fun setMaxIdleTime(interval: guint): Unit = g_thread_pool_set_max_idle_time(interval)

        /**
         * Sets the maximal number of unused threads to @max_threads.
         * If @max_threads is -1, no limit is imposed on the number
         * of unused threads.
         *
         * The default value is 2.
         *
         * @param maxThreads maximal number of unused threads
         */
        public fun setMaxUnusedThreads(maxThreads: gint): Unit = g_thread_pool_set_max_unused_threads(maxThreads)

        /**
         * Stops all currently unused threads. This does not change the
         * maximal number of unused threads. This function can be used to
         * regularly stop all unused threads e.g. from g_timeout_add().
         */
        public fun stopUnusedThreads(): Unit = g_thread_pool_stop_unused_threads()
    }
}
