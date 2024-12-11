// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GQueue
import org.gtkkn.native.glib.g_queue_clear
import org.gtkkn.native.glib.g_queue_copy
import org.gtkkn.native.glib.g_queue_delete_link
import org.gtkkn.native.glib.g_queue_foreach
import org.gtkkn.native.glib.g_queue_free
import org.gtkkn.native.glib.g_queue_get_length
import org.gtkkn.native.glib.g_queue_init
import org.gtkkn.native.glib.g_queue_insert_after_link
import org.gtkkn.native.glib.g_queue_insert_before_link
import org.gtkkn.native.glib.g_queue_is_empty
import org.gtkkn.native.glib.g_queue_link_index
import org.gtkkn.native.glib.g_queue_new
import org.gtkkn.native.glib.g_queue_peek_head_link
import org.gtkkn.native.glib.g_queue_peek_nth_link
import org.gtkkn.native.glib.g_queue_peek_tail_link
import org.gtkkn.native.glib.g_queue_pop_head_link
import org.gtkkn.native.glib.g_queue_pop_nth_link
import org.gtkkn.native.glib.g_queue_pop_tail_link
import org.gtkkn.native.glib.g_queue_push_head_link
import org.gtkkn.native.glib.g_queue_push_nth_link
import org.gtkkn.native.glib.g_queue_push_tail_link
import org.gtkkn.native.glib.g_queue_reverse
import org.gtkkn.native.glib.g_queue_sort
import org.gtkkn.native.glib.g_queue_unlink
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Contains the public fields of a
 * [Queue][glib-Double-ended-Queues].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `free_func`: DestroyNotify
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `free_func`: DestroyNotify
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
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
public class Queue(pointer: CPointer<GQueue>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibQueuePointer: CPointer<GQueue> = pointer

    /**
     * a pointer to the first element of the queue
     */
    public var head: List?
        get() = glibQueuePointer.pointed.head?.run {
            List(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibQueuePointer.pointed.head = value?.glibListPointer
        }

    /**
     * a pointer to the last element of the queue
     */
    public var tail: List?
        get() = glibQueuePointer.pointed.tail?.run {
            List(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibQueuePointer.pointed.tail = value?.glibListPointer
        }

    /**
     * the number of elements in the queue
     */
    public var length: guint
        get() = glibQueuePointer.pointed.length

        @UnsafeFieldSetter
        set(`value`) {
            glibQueuePointer.pointed.length = value
        }

    /**
     * Allocate a new Queue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GQueue>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Queue and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GQueue>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Queue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GQueue>().ptr)

    /**
     * Allocate a new Queue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param head a pointer to the first element of the queue
     * @param tail a pointer to the last element of the queue
     * @param length the number of elements in the queue
     */
    public constructor(
        head: List?,
        tail: List?,
        length: guint,
    ) : this() {
        this.head = head
        this.tail = tail
        this.length = length
    }

    /**
     * Allocate a new Queue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param head a pointer to the first element of the queue
     * @param tail a pointer to the last element of the queue
     * @param length the number of elements in the queue
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        head: List?,
        tail: List?,
        length: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.head = head
        this.tail = tail
        this.length = length
    }

    /**
     * Removes all the elements in @queue. If queue elements contain
     * dynamically-allocated memory, they should be freed first.
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun clear(): Unit = g_queue_clear(glibQueuePointer.reinterpret())

    /**
     * Copies a @queue. Note that is a shallow copy. If the elements in the
     * queue consist of pointers to data, the pointers are copied, but the
     * actual data is not.
     *
     * @return a copy of @queue
     * @since 2.4
     */
    @GLibVersion2_4
    public fun copy(): Queue = g_queue_copy(glibQueuePointer.reinterpret())!!.run {
        Queue(reinterpret())
    }

    /**
     * Removes @link_ from @queue and frees it.
     *
     * @link_ must be part of @queue.
     *
     * @param link a #GList link that must be part of @queue
     * @since 2.4
     */
    @GLibVersion2_4
    public fun deleteLink(link: List): Unit =
        g_queue_delete_link(glibQueuePointer.reinterpret(), link.glibListPointer.reinterpret())

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
    @GLibVersion2_4
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
    @GLibVersion2_4
    public fun getLength(): guint = g_queue_get_length(glibQueuePointer.reinterpret())

    /**
     * A statically-allocated #GQueue must be initialized with this function
     * before it can be used. Alternatively you can initialize it with
     * %G_QUEUE_INIT. It is not necessary to initialize queues created with
     * g_queue_new().
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun `init`(): Unit = g_queue_init(glibQueuePointer.reinterpret())

    /**
     * Inserts @link_ into @queue after @sibling.
     *
     * @sibling must be part of @queue.
     *
     * @param sibling a #GList link that must be part of @queue, or null to
     *   push at the head of the queue.
     * @param link a #GList link to insert which must not be part of any other list.
     * @since 2.62
     */
    @GLibVersion2_62
    public fun insertAfterLink(sibling: List? = null, link: List): Unit = g_queue_insert_after_link(
        glibQueuePointer.reinterpret(),
        sibling?.glibListPointer?.reinterpret(),
        link.glibListPointer.reinterpret()
    )

    /**
     * Inserts @link_ into @queue before @sibling.
     *
     * @sibling must be part of @queue.
     *
     * @param sibling a #GList link that must be part of @queue, or null to
     *   push at the tail of the queue.
     * @param link a #GList link to insert which must not be part of any other list.
     * @since 2.62
     */
    @GLibVersion2_62
    public fun insertBeforeLink(sibling: List? = null, link: List): Unit = g_queue_insert_before_link(
        glibQueuePointer.reinterpret(),
        sibling?.glibListPointer?.reinterpret(),
        link.glibListPointer.reinterpret()
    )

    /**
     * Returns true if the queue is empty.
     *
     * @return true if the queue is empty
     */
    public fun isEmpty(): Boolean = g_queue_is_empty(glibQueuePointer.reinterpret()).asBoolean()

    /**
     * Returns the position of @link_ in @queue.
     *
     * @param link a #GList link
     * @return the position of @link_, or -1 if the link is
     *     not part of @queue
     * @since 2.4
     */
    @GLibVersion2_4
    public fun linkIndex(link: List): gint =
        g_queue_link_index(glibQueuePointer.reinterpret(), link.glibListPointer.reinterpret())

    /**
     * Returns the first link in @queue.
     *
     * @return the first link in @queue, or null if @queue is empty
     * @since 2.4
     */
    @GLibVersion2_4
    public fun peekHeadLink(): List = g_queue_peek_head_link(glibQueuePointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Returns the link at the given position
     *
     * @param n the position of the link
     * @return the link at the @n'th position, or null
     *     if @n is off the end of the list
     * @since 2.4
     */
    @GLibVersion2_4
    public fun peekNthLink(n: guint): List = g_queue_peek_nth_link(glibQueuePointer.reinterpret(), n)!!.run {
        List(reinterpret())
    }

    /**
     * Returns the last link in @queue.
     *
     * @return the last link in @queue, or null if @queue is empty
     * @since 2.4
     */
    @GLibVersion2_4
    public fun peekTailLink(): List = g_queue_peek_tail_link(glibQueuePointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Removes and returns the first element of the queue.
     *
     * @return the #GList element at the head of the queue, or null
     *     if the queue is empty
     */
    public fun popHeadLink(): List = g_queue_pop_head_link(glibQueuePointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Removes and returns the link at the given position.
     *
     * @param n the link's position
     * @return the @n'th link, or null if @n is off the end of @queue
     * @since 2.4
     */
    @GLibVersion2_4
    public fun popNthLink(n: guint): List = g_queue_pop_nth_link(glibQueuePointer.reinterpret(), n)!!.run {
        List(reinterpret())
    }

    /**
     * Removes and returns the last element of the queue.
     *
     * @return the #GList element at the tail of the queue, or null
     *     if the queue is empty
     */
    public fun popTailLink(): List = g_queue_pop_tail_link(glibQueuePointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Adds a new element at the head of the queue.
     *
     * @param link a single #GList element, not a list with more than one element
     */
    public fun pushHeadLink(link: List): Unit =
        g_queue_push_head_link(glibQueuePointer.reinterpret(), link.glibListPointer.reinterpret())

    /**
     * Inserts @link into @queue at the given position.
     *
     * @param n the position to insert the link. If this is negative or larger than
     *     the number of elements in @queue, the link is added to the end of
     *     @queue.
     * @param link the link to add to @queue
     * @since 2.4
     */
    @GLibVersion2_4
    public fun pushNthLink(n: gint, link: List): Unit =
        g_queue_push_nth_link(glibQueuePointer.reinterpret(), n, link.glibListPointer.reinterpret())

    /**
     * Adds a new element at the tail of the queue.
     *
     * @param link a single #GList element, not a list with more than one element
     */
    public fun pushTailLink(link: List): Unit =
        g_queue_push_tail_link(glibQueuePointer.reinterpret(), link.glibListPointer.reinterpret())

    /**
     * Reverses the order of the items in @queue.
     *
     * @since 2.4
     */
    @GLibVersion2_4
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
    @GLibVersion2_4
    public fun sort(compareFunc: CompareDataFunc): Unit = g_queue_sort(
        glibQueuePointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(compareFunc).asCPointer()
    )

    /**
     * Unlinks @link_ so that it will no longer be part of @queue.
     * The link is not freed.
     *
     * @link_ must be part of @queue.
     *
     * @param link a #GList link that must be part of @queue
     * @since 2.4
     */
    @GLibVersion2_4
    public fun unlink(link: List): Unit =
        g_queue_unlink(glibQueuePointer.reinterpret(), link.glibListPointer.reinterpret())

    override fun toString(): String = "Queue(head=$head, tail=$tail, length=$length)"

    public companion object {
        /**
         * Creates a new #GQueue.
         *
         * @return a newly allocated #GQueue
         */
        public fun new(): Queue = g_queue_new()!!.run {
            Queue(reinterpret())
        }
    }
}
