// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GCond
import org.gtkkn.native.glib.g_cond_broadcast
import org.gtkkn.native.glib.g_cond_clear
import org.gtkkn.native.glib.g_cond_free
import org.gtkkn.native.glib.g_cond_init
import org.gtkkn.native.glib.g_cond_new
import org.gtkkn.native.glib.g_cond_signal
import org.gtkkn.native.glib.g_cond_timed_wait
import org.gtkkn.native.glib.g_cond_wait
import org.gtkkn.native.glib.g_cond_wait_until
import org.gtkkn.native.glib.gint64
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GCond struct is an opaque data structure that represents a
 * condition. Threads can block on a #GCond if they find a certain
 * condition to be false. If other threads change the state of this
 * condition they signal the #GCond, and that causes the waiting
 * threads to be woken up.
 *
 * Consider the following example of a shared variable.  One or more
 * threads can wait for data to be published to the variable and when
 * another thread publishes the data, it can signal one of the waiting
 * threads to wake up to collect the data.
 *
 * Here is an example for using GCond to block a thread until a condition
 * is satisfied:
 * |[<!-- language="C" -->
 *   gpointer current_data = NULL;
 *   GMutex data_mutex;
 *   GCond data_cond;
 *
 *   void
 *   push_data (gpointer data)
 *   {
 *     g_mutex_lock (&data_mutex);
 *     current_data = data;
 *     g_cond_signal (&data_cond);
 *     g_mutex_unlock (&data_mutex);
 *   }
 *
 *   gpointer
 *   pop_data (void)
 *   {
 *     gpointer data;
 *
 *     g_mutex_lock (&data_mutex);
 *     while (!current_data)
 *       g_cond_wait (&data_cond, &data_mutex);
 *     data = current_data;
 *     current_data = NULL;
 *     g_mutex_unlock (&data_mutex);
 *
 *     return data;
 *   }
 * ]|
 * Whenever a thread calls pop_data() now, it will wait until
 * current_data is non-null, i.e. until some other thread
 * has called push_data().
 *
 * The example shows that use of a condition variable must always be
 * paired with a mutex.  Without the use of a mutex, there would be a
 * race between the check of @current_data by the while loop in
 * pop_data() and waiting. Specifically, another thread could set
 * @current_data after the check, and signal the cond (with nobody
 * waiting on it) before the first thread goes to sleep. #GCond is
 * specifically useful for its ability to release the mutex and go
 * to sleep atomically.
 *
 * It is also important to use the g_cond_wait() and g_cond_wait_until()
 * functions only inside a loop which checks for the condition to be
 * true.  See g_cond_wait() for an explanation of why the condition may
 * not be true even after it returns.
 *
 * If a #GCond is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call g_cond_init()
 * on it and g_cond_clear() when done.
 *
 * A #GCond should only be accessed via the g_cond_ functions.
 */
public class Cond(public val glibCondPointer: CPointer<GCond>, cleaner: Cleaner? = null) :
    ProxyInstance(glibCondPointer) {
    /**
     * Allocate a new Cond.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GCond>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Cond and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GCond>, Cleaner>,
    ) : this(glibCondPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Cond using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GCond>().ptr)

    /**
     * If threads are waiting for @cond, all of them are unblocked.
     * If no threads are waiting for @cond, this function has no effect.
     * It is good practice to lock the same mutex as the waiting threads
     * while calling this function, though not required.
     */
    public fun broadcast(): Unit = g_cond_broadcast(glibCondPointer)

    /**
     * Frees the resources allocated to a #GCond with g_cond_init().
     *
     * This function should not be used with a #GCond that has been
     * statically allocated.
     *
     * Calling g_cond_clear() for a #GCond on which threads are
     * blocking leads to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun clear(): Unit = g_cond_clear(glibCondPointer)

    /**
     * Destroys a #GCond that has been created with g_cond_new().
     *
     * Calling g_cond_free() for a #GCond on which threads are
     * blocking leads to undefined behaviour.
     */
    public fun free(): Unit = g_cond_free(glibCondPointer)

    /**
     * Initialises a #GCond so that it can be used.
     *
     * This function is useful to initialise a #GCond that has been
     * allocated as part of a larger structure.  It is not necessary to
     * initialise a #GCond that has been statically allocated.
     *
     * To undo the effect of g_cond_init() when a #GCond is no longer
     * needed, use g_cond_clear().
     *
     * Calling g_cond_init() on an already-initialised #GCond leads
     * to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun `init`(): Unit = g_cond_init(glibCondPointer)

    /**
     * If threads are waiting for @cond, at least one of them is unblocked.
     * If no threads are waiting for @cond, this function has no effect.
     * It is good practice to hold the same lock as the waiting thread
     * while calling this function, though not required.
     */
    public fun signal(): Unit = g_cond_signal(glibCondPointer)

    /**
     * Waits until this thread is woken up on @cond, but not longer than
     * until the time specified by @abs_time. The @mutex is unlocked before
     * falling asleep and locked again before resuming.
     *
     * If @abs_time is null, g_cond_timed_wait() acts like g_cond_wait().
     *
     * This function can be used even if g_thread_init() has not yet been
     * called, and, in that case, will immediately return true.
     *
     * To easily calculate @abs_time a combination of g_get_real_time()
     * and g_time_val_add() can be used.
     *
     * @param mutex a #GMutex that is currently locked
     * @param absTime a #GTimeVal, determining the final time
     * @return true if @cond was signalled, or false on timeout
     */
    public fun timedWait(mutex: Mutex, absTime: TimeVal): Boolean =
        g_cond_timed_wait(glibCondPointer, mutex.glibMutexPointer, absTime.glibTimeValPointer).asBoolean()

    /**
     * Atomically releases @mutex and waits until @cond is signalled.
     * When this function returns, @mutex is locked again and owned by the
     * calling thread.
     *
     * When using condition variables, it is possible that a spurious wakeup
     * may occur (ie: g_cond_wait() returns even though g_cond_signal() was
     * not called).  It's also possible that a stolen wakeup may occur.
     * This is when g_cond_signal() is called, but another thread acquires
     * @mutex before this thread and modifies the state of the program in
     * such a way that when g_cond_wait() is able to return, the expected
     * condition is no longer met.
     *
     * For this reason, g_cond_wait() must always be used in a loop.  See
     * the documentation for #GCond for a complete example.
     *
     * @param mutex a #GMutex that is currently locked
     */
    public fun wait(mutex: Mutex): Unit = g_cond_wait(glibCondPointer, mutex.glibMutexPointer)

    /**
     * Waits until either @cond is signalled or @end_time has passed.
     *
     * As with g_cond_wait() it is possible that a spurious or stolen wakeup
     * could occur.  For that reason, waiting on a condition variable should
     * always be in a loop, based on an explicitly-checked predicate.
     *
     * true is returned if the condition variable was signalled (or in the
     * case of a spurious wakeup).  false is returned if @end_time has
     * passed.
     *
     * The following code shows how to correctly perform a timed wait on a
     * condition variable (extending the example presented in the
     * documentation for #GCond):
     *
     * |[<!-- language="C" -->
     * gpointer
     * pop_data_timed (void)
     * {
     *   gint64 end_time;
     *   gpointer data;
     *
     *   g_mutex_lock (&data_mutex);
     *
     *   end_time = g_get_monotonic_time () + 5 * G_TIME_SPAN_SECOND;
     *   while (!current_data)
     *     if (!g_cond_wait_until (&data_cond, &data_mutex, end_time))
     *       {
     *         // timeout has passed.
     *         g_mutex_unlock (&data_mutex);
     *         return NULL;
     *       }
     *
     *   // there is data for us
     *   data = current_data;
     *   current_data = NULL;
     *
     *   g_mutex_unlock (&data_mutex);
     *
     *   return data;
     * }
     * ]|
     *
     * Notice that the end time is calculated once, before entering the
     * loop and reused.  This is the motivation behind the use of absolute
     * time on this API -- if a relative time of 5 seconds were passed
     * directly to the call and a spurious wakeup occurred, the program would
     * have to start over waiting again (which would lead to a total wait
     * time of more than 5 seconds).
     *
     * @param mutex a #GMutex that is currently locked
     * @param endTime the monotonic time to wait until
     * @return true on a signal, false on a timeout
     * @since 2.32
     */
    @GLibVersion2_32
    public fun waitUntil(mutex: Mutex, endTime: gint64): Boolean =
        g_cond_wait_until(glibCondPointer, mutex.glibMutexPointer, endTime).asBoolean()

    public companion object {
        /**
         * Allocates and initializes a new #GCond.
         *
         * @return a newly allocated #GCond. Free with g_cond_free()
         */
        public fun new(): Cond = g_cond_new()!!.run {
            Cond(this)
        }
    }
}
