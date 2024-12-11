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
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GList
import org.gtkkn.native.glib.g_list_alloc
import org.gtkkn.native.glib.g_list_concat
import org.gtkkn.native.glib.g_list_copy
import org.gtkkn.native.glib.g_list_delete_link
import org.gtkkn.native.glib.g_list_first
import org.gtkkn.native.glib.g_list_foreach
import org.gtkkn.native.glib.g_list_free
import org.gtkkn.native.glib.g_list_free_1
import org.gtkkn.native.glib.g_list_insert_before_link
import org.gtkkn.native.glib.g_list_last
import org.gtkkn.native.glib.g_list_length
import org.gtkkn.native.glib.g_list_nth
import org.gtkkn.native.glib.g_list_nth_prev
import org.gtkkn.native.glib.g_list_pop_allocator
import org.gtkkn.native.glib.g_list_position
import org.gtkkn.native.glib.g_list_remove_link
import org.gtkkn.native.glib.g_list_reverse
import org.gtkkn.native.glib.g_list_sort_with_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GList struct is used for each element in a doubly-linked list.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: gpointer
 * - function `copy_deep`: C function g_list_copy_deep is ignored
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `free_func`: DestroyNotify
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - function `nth_data`: Return type gpointer is unsupported
 * - parameter `data`: gpointer
 * - parameter `allocator`: Allocator
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `compare_func`: CompareFunc
 * - field `data`: gpointer
 */
public class List(pointer: CPointer<GList>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibListPointer: CPointer<GList> = pointer

    /**
     * contains the link to the next element in the list
     */
    public var next: List?
        get() = glibListPointer.pointed.next?.run {
            List(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibListPointer.pointed.next = value?.glibListPointer
        }

    /**
     * contains the link to the previous element in the list
     */
    public var prev: List?
        get() = glibListPointer.pointed.prev?.run {
            List(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibListPointer.pointed.prev = value?.glibListPointer
        }

    /**
     * Allocate a new List.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GList>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to List and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GList>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new List using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GList>().ptr)

    /**
     * Allocate a new List.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param next contains the link to the next element in the list
     * @param prev contains the link to the previous element in the list
     */
    public constructor(next: List?, prev: List?) : this() {
        this.next = next
        this.prev = prev
    }

    /**
     * Allocate a new List using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param next contains the link to the next element in the list
     * @param prev contains the link to the previous element in the list
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        next: List?,
        prev: List?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.next = next
        this.prev = prev
    }

    override fun toString(): String = "List(next=$next, prev=$prev)"

    public companion object {
        /**
         * Allocates space for one #GList element. It is called by
         * g_list_append(), g_list_prepend(), g_list_insert() and
         * g_list_insert_sorted() and so is rarely used on its own.
         *
         * @return a pointer to the newly-allocated #GList element
         */
        public fun alloc(): List = g_list_alloc()!!.run {
            List(reinterpret())
        }

        /**
         * Adds the second #GList onto the end of the first #GList.
         * Note that the elements of the second #GList are not copied.
         * They are used directly.
         *
         * This function is for example used to move an element in the list.
         * The following example moves an element to the top of the list:
         * |[<!-- language="C" -->
         * list = g_list_remove_link (list, llink);
         * list = g_list_concat (llink, list);
         * ]|
         *
         * @param list1 a #GList, this must point to the top of the list
         * @param list2 the #GList to add to the end of the first #GList,
         *     this must point  to the top of the list
         * @return the start of the new #GList, which equals @list1 if not null
         */
        public fun concat(list1: List, list2: List): List =
            g_list_concat(list1.glibListPointer.reinterpret(), list2.glibListPointer.reinterpret())!!.run {
                List(reinterpret())
            }

        /**
         * Copies a #GList.
         *
         * Note that this is a "shallow" copy. If the list elements
         * consist of pointers to data, the pointers are copied but
         * the actual data is not. See g_list_copy_deep() if you need
         * to copy the data as well.
         *
         * @param list a #GList, this must point to the top of the list
         * @return the start of the new list that holds the same data as @list
         */
        public fun copy(list: List): List = g_list_copy(list.glibListPointer.reinterpret())!!.run {
            List(reinterpret())
        }

        /**
         * Removes the node link_ from the list and frees it.
         * Compare this to g_list_remove_link() which removes the node
         * without freeing it.
         *
         * @param list a #GList, this must point to the top of the list
         * @param link node to delete from @list
         * @return the (possibly changed) start of the #GList
         */
        public fun deleteLink(list: List, link: List): List =
            g_list_delete_link(list.glibListPointer.reinterpret(), link.glibListPointer.reinterpret())!!.run {
                List(reinterpret())
            }

        /**
         * Gets the first element in a #GList.
         *
         * @param list any #GList element
         * @return the first element in the #GList,
         *     or null if the #GList has no elements
         */
        public fun first(list: List): List = g_list_first(list.glibListPointer.reinterpret())!!.run {
            List(reinterpret())
        }

        /**
         * Calls a function for each element of a #GList.
         *
         * It is safe for @func to remove the element from @list, but it must
         * not modify any part of the list after that element.
         *
         * @param list a #GList, this must point to the top of the list
         * @param func the function to call with each element's data
         */
        public fun foreach(list: List, func: Func): Unit = g_list_foreach(
            list.glibListPointer.reinterpret(),
            FuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

        /**
         * Frees all of the memory used by a #GList.
         * The freed elements are returned to the slice allocator.
         *
         * If list elements contain dynamically-allocated memory, you should
         * either use g_list_free_full() or free them manually first.
         *
         * It can be combined with g_steal_pointer() to ensure the list head pointer
         * is not left dangling:
         * |[<!-- language="C" -->
         * GList *list_of_borrowed_things = …;  /<!-- -->* (transfer container) *<!-- -->/
         * g_list_free (g_steal_pointer (&list_of_borrowed_things));
         * ]|
         *
         * @param list the first link of a #GList
         */
        public fun free(list: List): Unit = g_list_free(list.glibListPointer.reinterpret())

        /**
         * Frees one #GList element, but does not update links from the next and
         * previous elements in the list, so you should not call this function on an
         * element that is currently part of a list.
         *
         * It is usually used after g_list_remove_link().
         *
         * @param list a #GList element
         */
        public fun free1(list: List): Unit = g_list_free_1(list.glibListPointer.reinterpret())

        /**
         * Inserts @link_ into the list before the given position.
         *
         * @param list a pointer to a #GList, this must point to the top of the list
         * @param sibling the list element before which the new element
         *     is inserted or null to insert at the end of the list
         * @param link the list element to be added, which must not be part of
         *     any other list
         * @return the (possibly changed) start of the #GList
         * @since 2.62
         */
        @GLibVersion2_62
        public fun insertBeforeLink(list: List, sibling: List? = null, link: List): List = g_list_insert_before_link(
            list.glibListPointer.reinterpret(),
            sibling?.glibListPointer?.reinterpret(),
            link.glibListPointer.reinterpret()
        )!!.run {
            List(reinterpret())
        }

        /**
         * Gets the last element in a #GList.
         *
         * @param list any #GList element
         * @return the last element in the #GList,
         *     or null if the #GList has no elements
         */
        public fun last(list: List): List = g_list_last(list.glibListPointer.reinterpret())!!.run {
            List(reinterpret())
        }

        /**
         * Gets the number of elements in a #GList.
         *
         * This function iterates over the whole list to count its elements.
         * Use a #GQueue instead of a GList if you regularly need the number
         * of items. To check whether the list is non-empty, it is faster to check
         * @list against null.
         *
         * @param list a #GList, this must point to the top of the list
         * @return the number of elements in the #GList
         */
        public fun length(list: List): guint = g_list_length(list.glibListPointer.reinterpret())

        /**
         * Gets the element at the given position in a #GList.
         *
         * This iterates over the list until it reaches the @n-th position. If you
         * intend to iterate over every element, it is better to use a for-loop as
         * described in the #GList introduction.
         *
         * @param list a #GList, this must point to the top of the list
         * @param n the position of the element, counting from 0
         * @return the element, or null if the position is off
         *     the end of the #GList
         */
        public fun nth(list: List, n: guint): List = g_list_nth(list.glibListPointer.reinterpret(), n)!!.run {
            List(reinterpret())
        }

        /**
         * Gets the element @n places before @list.
         *
         * @param list a #GList
         * @param n the position of the element, counting from 0
         * @return the element, or null if the position is
         *     off the end of the #GList
         */
        public fun nthPrev(list: List, n: guint): List = g_list_nth_prev(list.glibListPointer.reinterpret(), n)!!.run {
            List(reinterpret())
        }

        public fun popAllocator(): Unit = g_list_pop_allocator()

        /**
         * Gets the position of the given element
         * in the #GList (starting from 0).
         *
         * @param list a #GList, this must point to the top of the list
         * @param llink an element in the #GList
         * @return the position of the element in the #GList,
         *     or -1 if the element is not found
         */
        public fun position(list: List, llink: List): gint =
            g_list_position(list.glibListPointer.reinterpret(), llink.glibListPointer.reinterpret())

        /**
         * Removes an element from a #GList, without freeing the element.
         * The removed element's prev and next links are set to null, so
         * that it becomes a self-contained list with one element.
         *
         * This function is for example used to move an element in the list
         * (see the example for g_list_concat()) or to remove an element in
         * the list before freeing its data:
         * |[<!-- language="C" -->
         * list = g_list_remove_link (list, llink);
         * free_some_data_that_may_access_the_list_again (llink->data);
         * g_list_free (llink);
         * ]|
         *
         * @param list a #GList, this must point to the top of the list
         * @param llink an element in the #GList
         * @return the (possibly changed) start of the #GList
         */
        public fun removeLink(list: List, llink: List): List =
            g_list_remove_link(list.glibListPointer.reinterpret(), llink.glibListPointer.reinterpret())!!.run {
                List(reinterpret())
            }

        /**
         * Reverses a #GList.
         * It simply switches the next and prev pointers of each element.
         *
         * @param list a #GList, this must point to the top of the list
         * @return the start of the reversed #GList
         */
        public fun reverse(list: List): List = g_list_reverse(list.glibListPointer.reinterpret())!!.run {
            List(reinterpret())
        }

        /**
         * Like g_list_sort(), but the comparison function accepts
         * a user data argument.
         *
         * @param list a #GList, this must point to the top of the list
         * @param compareFunc comparison function
         * @return the (possibly changed) start of the #GList
         */
        public fun sortWithData(list: List, compareFunc: CompareDataFunc): List = g_list_sort_with_data(
            list.glibListPointer.reinterpret(),
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )!!.run {
            List(reinterpret())
        }
    }
}
