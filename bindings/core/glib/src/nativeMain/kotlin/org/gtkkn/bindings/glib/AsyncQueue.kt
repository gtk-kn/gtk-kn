// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_46
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GAsyncQueue
import org.gtkkn.native.glib.g_async_queue_length
import org.gtkkn.native.glib.g_async_queue_length_unlocked
import org.gtkkn.native.glib.g_async_queue_lock
import org.gtkkn.native.glib.g_async_queue_new
import org.gtkkn.native.glib.g_async_queue_pop
import org.gtkkn.native.glib.g_async_queue_pop_unlocked
import org.gtkkn.native.glib.g_async_queue_push
import org.gtkkn.native.glib.g_async_queue_push_front
import org.gtkkn.native.glib.g_async_queue_push_front_unlocked
import org.gtkkn.native.glib.g_async_queue_push_sorted
import org.gtkkn.native.glib.g_async_queue_push_sorted_unlocked
import org.gtkkn.native.glib.g_async_queue_push_unlocked
import org.gtkkn.native.glib.g_async_queue_ref
import org.gtkkn.native.glib.g_async_queue_ref_unlocked
import org.gtkkn.native.glib.g_async_queue_remove
import org.gtkkn.native.glib.g_async_queue_remove_unlocked
import org.gtkkn.native.glib.g_async_queue_sort
import org.gtkkn.native.glib.g_async_queue_sort_unlocked
import org.gtkkn.native.glib.g_async_queue_timed_pop
import org.gtkkn.native.glib.g_async_queue_timed_pop_unlocked
import org.gtkkn.native.glib.g_async_queue_timeout_pop
import org.gtkkn.native.glib.g_async_queue_timeout_pop_unlocked
import org.gtkkn.native.glib.g_async_queue_try_pop
import org.gtkkn.native.glib.g_async_queue_try_pop_unlocked
import org.gtkkn.native.glib.g_async_queue_unlock
import org.gtkkn.native.glib.g_async_queue_unref
import org.gtkkn.native.glib.g_async_queue_unref_and_unlock
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint64
import kotlin.Boolean
import kotlin.Unit

/**
 * An opaque data structure which represents an asynchronous queue.
 *
 * It should only be accessed through the `g_async_queue_*` functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `item_free_func`: DestroyNotify
 */
public class AsyncQueue(pointer: CPointer<GAsyncQueue>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GAsyncQueue> = pointer

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
    public fun length(): gint = g_async_queue_length(gPointer.reinterpret())

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
    public fun lengthUnlocked(): gint = g_async_queue_length_unlocked(gPointer.reinterpret())

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
    public fun lock(): Unit = g_async_queue_lock(gPointer.reinterpret())

    /**
     * Pops data from the @queue. If @queue is empty, this function
     * blocks until data becomes available.
     *
     * @return data from the queue
     */
    public fun pop(): gpointer? = g_async_queue_pop(gPointer.reinterpret())

    /**
     * Pops data from the @queue. If @queue is empty, this function
     * blocks until data becomes available.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @return data from the queue.
     */
    public fun popUnlocked(): gpointer? = g_async_queue_pop_unlocked(gPointer.reinterpret())

    /**
     * Pushes the @data into the @queue.
     *
     * The @data parameter must not be null.
     *
     * @param data data to push onto the @queue
     */
    public fun push(`data`: gpointer): Unit = g_async_queue_push(gPointer.reinterpret(), `data`)

    /**
     * Pushes the @item into the @queue. @item must not be null.
     * In contrast to g_async_queue_push(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     *
     * @param item data to push into the @queue
     * @since 2.46
     */
    @GLibVersion2_46
    public fun pushFront(item: gpointer): Unit = g_async_queue_push_front(gPointer.reinterpret(), item)

    /**
     * Pushes the @item into the @queue. @item must not be null.
     * In contrast to g_async_queue_push_unlocked(), this function
     * pushes the new item ahead of the items already in the queue,
     * so that it will be the next one to be popped off the queue.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @param item data to push into the @queue
     * @since 2.46
     */
    @GLibVersion2_46
    public fun pushFrontUnlocked(item: gpointer): Unit = g_async_queue_push_front_unlocked(gPointer.reinterpret(), item)

    /**
     * Inserts @data into @queue using @func to determine the new
     * position.
     *
     * This function requires that the @queue is sorted before pushing on
     * new elements, see g_async_queue_sort().
     *
     * This function will lock @queue before it sorts the queue and unlock
     * it when it is finished.
     *
     * For an example of @func see g_async_queue_sort().
     *
     * @param data the @data to push into the @queue
     * @param func the #GCompareDataFunc is used to sort @queue
     * @since 2.10
     */
    @GLibVersion2_10
    public fun pushSorted(`data`: gpointer, func: CompareDataFunc): Unit = g_async_queue_push_sorted(
        gPointer.reinterpret(),
        `data`,
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Inserts @data into @queue using @func to determine the new
     * position.
     *
     * The sort function @func is passed two elements of the @queue.
     * It should return 0 if they are equal, a negative value if the
     * first element should be higher in the @queue or a positive value
     * if the first element should be lower in the @queue than the second
     * element.
     *
     * This function requires that the @queue is sorted before pushing on
     * new elements, see g_async_queue_sort().
     *
     * This function must be called while holding the @queue's lock.
     *
     * For an example of @func see g_async_queue_sort().
     *
     * @param data the data to push into the @queue
     * @param func the #GCompareDataFunc is used to sort @queue
     * @since 2.10
     */
    @GLibVersion2_10
    public fun pushSortedUnlocked(`data`: gpointer? = null, func: CompareDataFunc): Unit =
        g_async_queue_push_sorted_unlocked(
            gPointer.reinterpret(),
            `data`,
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Pushes the @data into the @queue.
     *
     * The @data parameter must not be null.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @param data data to push onto the @queue
     */
    public fun pushUnlocked(`data`: gpointer): Unit = g_async_queue_push_unlocked(gPointer.reinterpret(), `data`)

    /**
     * Increases the reference count of the asynchronous @queue by 1.
     * You do not need to hold the lock to call this function.
     *
     * @return the @queue that was passed in (since 2.6)
     */
    public fun ref(): AsyncQueue = g_async_queue_ref(gPointer.reinterpret())!!.run {
        AsyncQueue(reinterpret())
    }

    /**
     * Increases the reference count of the asynchronous @queue by 1.
     */
    public fun refUnlocked(): Unit = g_async_queue_ref_unlocked(gPointer.reinterpret())

    /**
     * Remove an item from the queue.
     *
     * @param item the data to remove from the @queue
     * @return true if the item was removed
     * @since 2.46
     */
    @GLibVersion2_46
    public fun remove(item: gpointer): Boolean = g_async_queue_remove(gPointer.reinterpret(), item).asBoolean()

    /**
     * Remove an item from the queue.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @param item the data to remove from the @queue
     * @return true if the item was removed
     * @since 2.46
     */
    @GLibVersion2_46
    public fun removeUnlocked(item: gpointer? = null): Boolean =
        g_async_queue_remove_unlocked(gPointer.reinterpret(), item).asBoolean()

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
        gPointer.reinterpret(),
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
        gPointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Pops data from the @queue. If the queue is empty, blocks until
     * @end_time or until data becomes available.
     *
     * If no data is received before @end_time, null is returned.
     *
     * To easily calculate @end_time, a combination of g_get_real_time()
     * and g_time_val_add() can be used.
     *
     * @param endTime a #GTimeVal, determining the final time
     * @return data from the queue or null, when no data is
     *   received before @end_time.
     */
    public fun timedPop(endTime: TimeVal): gpointer? =
        g_async_queue_timed_pop(gPointer.reinterpret(), endTime.gPointer.reinterpret())

    /**
     * Pops data from the @queue. If the queue is empty, blocks until
     * @end_time or until data becomes available.
     *
     * If no data is received before @end_time, null is returned.
     *
     * To easily calculate @end_time, a combination of g_get_real_time()
     * and g_time_val_add() can be used.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @param endTime a #GTimeVal, determining the final time
     * @return data from the queue or null, when no data is
     *   received before @end_time.
     */
    public fun timedPopUnlocked(endTime: TimeVal): gpointer? =
        g_async_queue_timed_pop_unlocked(gPointer.reinterpret(), endTime.gPointer.reinterpret())

    /**
     * Pops data from the @queue. If the queue is empty, blocks for
     * @timeout microseconds, or until data becomes available.
     *
     * If no data is received before the timeout, null is returned.
     *
     * @param timeout the number of microseconds to wait
     * @return data from the queue or null, when no data is
     *   received before the timeout.
     */
    public fun timeoutPop(timeout: guint64): gpointer? = g_async_queue_timeout_pop(gPointer.reinterpret(), timeout)

    /**
     * Pops data from the @queue. If the queue is empty, blocks for
     * @timeout microseconds, or until data becomes available.
     *
     * If no data is received before the timeout, null is returned.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @param timeout the number of microseconds to wait
     * @return data from the queue or null, when no data is
     *   received before the timeout.
     */
    public fun timeoutPopUnlocked(timeout: guint64): gpointer? =
        g_async_queue_timeout_pop_unlocked(gPointer.reinterpret(), timeout)

    /**
     * Tries to pop data from the @queue. If no data is available,
     * null is returned.
     *
     * @return data from the queue or null, when no data is
     *   available immediately.
     */
    public fun tryPop(): gpointer? = g_async_queue_try_pop(gPointer.reinterpret())

    /**
     * Tries to pop data from the @queue. If no data is available,
     * null is returned.
     *
     * This function must be called while holding the @queue's lock.
     *
     * @return data from the queue or null, when no data is
     *   available immediately.
     */
    public fun tryPopUnlocked(): gpointer? = g_async_queue_try_pop_unlocked(gPointer.reinterpret())

    /**
     * Releases the queue's lock.
     *
     * Calling this function when you have not acquired
     * the with g_async_queue_lock() leads to undefined
     * behaviour.
     */
    public fun unlock(): Unit = g_async_queue_unlock(gPointer.reinterpret())

    /**
     * Decreases the reference count of the asynchronous @queue by 1.
     *
     * If the reference count went to 0, the @queue will be destroyed
     * and the memory allocated will be freed. So you are not allowed
     * to use the @queue afterwards, as it might have disappeared.
     * You do not need to hold the lock to call this function.
     */
    public fun unref(): Unit = g_async_queue_unref(gPointer.reinterpret())

    /**
     * Decreases the reference count of the asynchronous @queue by 1
     * and releases the lock. This function must be called while holding
     * the @queue's lock. If the reference count went to 0, the @queue
     * will be destroyed and the memory allocated will be freed.
     */
    public fun unrefAndUnlock(): Unit = g_async_queue_unref_and_unlock(gPointer.reinterpret())

    public companion object {
        /**
         * Creates a new asynchronous queue.
         *
         * @return a new #GAsyncQueue. Free with g_async_queue_unref()
         */
        public fun new(): AsyncQueue = g_async_queue_new()!!.run {
            AsyncQueue(reinterpret())
        }
    }
}
