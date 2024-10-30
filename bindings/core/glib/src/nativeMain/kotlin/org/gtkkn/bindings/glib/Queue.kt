// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GQueue
import org.gtkkn.native.glib.g_queue_clear
import org.gtkkn.native.glib.g_queue_foreach
import org.gtkkn.native.glib.g_queue_free
import org.gtkkn.native.glib.g_queue_get_length
import org.gtkkn.native.glib.g_queue_init
import org.gtkkn.native.glib.g_queue_is_empty
import org.gtkkn.native.glib.g_queue_reverse
import org.gtkkn.native.glib.g_queue_sort
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `free_func`: DestroyNotify
 * - parameter `free_func`: DestroyNotify
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - method `peek_head`: Return type gpointer is unsupported
 * - method `peek_nth`: Return type gpointer is unsupported
 * - method `peek_tail`: Return type gpointer is unsupported
 * - method `pop_head`: Return type gpointer is unsupported
 * - method `pop_nth`: Return type gpointer is unsupported
 * - method `pop_tail`: Return type gpointer is unsupported
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 */
public class Queue(
    pointer: CPointer<GQueue>,
) : Record {
    public val glibQueuePointer: CPointer<GQueue> = pointer

    /**
     * a pointer to the first element of the queue
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val head: List?
        get() =
            glibQueuePointer.pointed.head?.run {
                List(reinterpret())
            }

    /**
     * a pointer to the last element of the queue
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val tail: List?
        get() =
            glibQueuePointer.pointed.tail?.run {
                List(reinterpret())
            }

    /**
     * the number of elements in the queue
     */
    public var length: UInt
        get() = glibQueuePointer.pointed.length
        set(`value`) {
            glibQueuePointer.pointed.length = value
        }

    /**
     * Removes all the elements in @queue. If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     *
     * @since 2.14
     */
    public fun clear(): Unit = g_queue_clear(glibQueuePointer.reinterpret())

    /**
     * Calls @func for each element in the queue passing @user_data to the
     * function.
     *
     * It is safe for @func to remove the element from @queue, but it must
     * not modify any part of the queue after that element.
     *
     * @param func the function to call for each element's data
     * @since 2.4
     */
    public fun foreach(func: Func): Unit =
        g_queue_foreach(glibQueuePointer.reinterpret(), FuncFunc.reinterpret(), StableRef.create(func).asCPointer())

    /**
     * Frees the memory allocated for the #GQueue. Only call this function
     * if @queue was created with g_queue_new(). If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     *
     * If queue elements contain dynamically-allocated memory, you should
     * either use g_queue_free_full() or free them manually first.
     */
    public fun free(): Unit = g_queue_free(glibQueuePointer.reinterpret())

    /**
     * Returns the number of items in @queue.
     *
     * @return the number of items in @queue
     * @since 2.4
     */
    public fun getLength(): UInt = g_queue_get_length(glibQueuePointer.reinterpret())

    /**
     * A statically-allocated #GQueue must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * %G_QUEUE_INIT. It is not necessary to initialize queues created with
     * g_queue_new().
     *
     * @since 2.14
     */
    public fun `init`(): Unit = g_queue_init(glibQueuePointer.reinterpret())

    /**
     * Returns true if the queue is empty.
     *
     * @return true if the queue is empty
     */
    public fun isEmpty(): Boolean = g_queue_is_empty(glibQueuePointer.reinterpret()).asBoolean()

    /**
     * Reverses the order of the items in @queue.
     *
     * @since 2.4
     */
    public fun reverse(): Unit = g_queue_reverse(glibQueuePointer.reinterpret())

    /**
     * Sorts @queue using @compare_func.
     *
     * @param compareFunc the #GCompareDataFunc used to sort @queue. This function
     *     is passed two elements of the queue and should return 0 if they are
     *     equal, a negative value if the first comes before the second, and
     *     a positive value if the second comes before the first.
     * @since 2.4
     */
    public fun sort(compareFunc: CompareDataFunc): Unit =
        g_queue_sort(
            glibQueuePointer.reinterpret(),
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )

    public companion object : RecordCompanion<Queue, GQueue> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Queue = Queue(pointer.reinterpret())
    }
}
