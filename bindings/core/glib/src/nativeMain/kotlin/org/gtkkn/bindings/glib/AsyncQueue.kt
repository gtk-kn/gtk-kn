// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GAsyncQueue
import org.gtkkn.native.glib.g_async_queue_length
import org.gtkkn.native.glib.g_async_queue_length_unlocked
import org.gtkkn.native.glib.g_async_queue_lock
import org.gtkkn.native.glib.g_async_queue_ref_unlocked
import org.gtkkn.native.glib.g_async_queue_sort
import org.gtkkn.native.glib.g_async_queue_sort_unlocked
import org.gtkkn.native.glib.g_async_queue_unlock
import org.gtkkn.native.glib.g_async_queue_unref
import org.gtkkn.native.glib.g_async_queue_unref_and_unlock
import org.gtkkn.native.gobject.gint
import kotlin.Unit

/**
 * An opaque data structure which represents an asynchronous queue.
 *
 * It should only be accessed through the `g_async_queue_*` functions.
 *
 * ## Skipped during bindings generation
 *
 * - method `pop`: Return type gpointer is unsupported
 * - method `pop_unlocked`: Return type gpointer is unsupported
 * - parameter `data`: gpointer
 * - parameter `item`: gpointer
 * - parameter `item`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - method `ref`: Return type AsyncQueue is unsupported
 * - parameter `item`: gpointer
 * - parameter `item`: gpointer
 * - method `timed_pop`: Return type gpointer is unsupported
 * - method `timed_pop_unlocked`: Return type gpointer is unsupported
 * - method `timeout_pop`: Return type gpointer is unsupported
 * - method `timeout_pop_unlocked`: Return type gpointer is unsupported
 * - method `try_pop`: Return type gpointer is unsupported
 * - method `try_pop_unlocked`: Return type gpointer is unsupported
 * - function `new`: Return type AsyncQueue is unsupported
 * - parameter `item_free_func`: DestroyNotify
 */
public class AsyncQueue(pointer: CPointer<GAsyncQueue>) : ProxyInstance(pointer) {
    public val glibAsyncQueuePointer: CPointer<GAsyncQueue> = pointer

    /**
     * Returns the length of the queue.
     *
     * Actually this function returns the number of data items in
     * the queue minus the number of waiting threads, so a negative
     * value means waiting threads, and a positive value means available
     * entries in the @queue. A return value of 0 could mean n entries
     * in the queue and n threads waiting. This can happen due to locking
     * of the queue or due to scheduling.
     *
     * @return the length of the @queue
     */
    public fun length(): gint = g_async_queue_length(glibAsyncQueuePointer.reinterpret())

    /**
     * Returns the length of the queue.
     *
     * Actually this function returns the number of data items in
     * the queue minus the number of waiting threads, so a negative
     * value means waiting threads, and a positive value means available
     * entries in the @queue. A return value of 0 could mean n entries
     * in the queue and n threads waiting. This can happen due to locking
     * of the queue or due to scheduling.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @return the length of the @queue.
     */
    public fun lengthUnlocked(): gint = g_async_queue_length_unlocked(glibAsyncQueuePointer.reinterpret())

    /**
     * Acquires the @queue's lock. If another thread is already
     * holding the lock, this call will block until the lock
     * becomes available.
     *
     * Call g_async_queue_unlock() to drop the lock again.
     *
     * While holding the lock, you can only call the
     * g_async_queue_*_unlocked() functions on @queue. Otherwise,
     * deadlock may occur.
     */
    public fun lock(): Unit = g_async_queue_lock(glibAsyncQueuePointer.reinterpret())

    /**
     * Increases the reference count of the asynchronous @queue by 1.
     */
    public fun refUnlocked(): Unit = g_async_queue_ref_unlocked(glibAsyncQueuePointer.reinterpret())

    /**
     * Sorts @queue using @func.
     *
     * The sort function @func is passed two elements of the @queue.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the @queue or a positive value
     * if the first element should be lower in the @queue than the second
     * element.
     *
     * This function will lock @queue before it sorts the queue and unlock
     * it when it is finished.
     *
     * If you were sorting a list of priority numbers to make sure the
     * lowest priority would be at the top of the queue, you could use:
     * |[<!-- language="C" -->
     *  gint32 id1;
     *  gint32 id2;
     *
     *  id1 = GPOINTER_TO_INT (element1);
     *  id2 = GPOINTER_TO_INT (element2);
     *
     *  return (id1 > id2 ? +1 : id1 == id2 ? 0 : -1);
     * ]|
     *
     * @param func the #GCompareDataFunc is used to sort @queue
     * @since 2.10
     */
    @GLibVersion2_10
    public fun sort(func: CompareDataFunc): Unit = g_async_queue_sort(
        glibAsyncQueuePointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Sorts @queue using @func.
     *
     * The sort function @func is passed two elements of the @queue.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the @queue or a positive value
     * if the first element should be lower in the @queue than the second
     * element.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @param func the #GCompareDataFunc is used to sort @queue
     * @since 2.10
     */
    @GLibVersion2_10
    public fun sortUnlocked(func: CompareDataFunc): Unit = g_async_queue_sort_unlocked(
        glibAsyncQueuePointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Releases the queue's lock.
     *
     * Calling this function when you have not acquired
     * the with g_async_queue_lock() leads to undefined
     * behaviour.
     */
    public fun unlock(): Unit = g_async_queue_unlock(glibAsyncQueuePointer.reinterpret())

    /**
     * Decreases the reference count of the asynchronous @queue by 1.
     *
     * If the reference count went to 0, the @queue will be destroyed
     * and the memory allocated will be freed. So you are not allowed
     * to use the @queue afterwards, as it might have disappeared.
     * You do not need to hold the lock to call this function.
     */
    public fun unref(): Unit = g_async_queue_unref(glibAsyncQueuePointer.reinterpret())

    /**
     * Decreases the reference count of the asynchronous @queue by 1
     * and releases the lock. This function must be called while holding
     * the @queue's lock. If the reference count went to 0, the @queue
     * will be destroyed and the memory allocated will be freed.
     */
    public fun unrefAndUnlock(): Unit = g_async_queue_unref_and_unlock(glibAsyncQueuePointer.reinterpret())
}
