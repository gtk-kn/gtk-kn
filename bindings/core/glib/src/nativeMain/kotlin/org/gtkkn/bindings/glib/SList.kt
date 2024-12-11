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
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GSList
import org.gtkkn.native.glib.g_slist_alloc
import org.gtkkn.native.glib.g_slist_concat
import org.gtkkn.native.glib.g_slist_copy
import org.gtkkn.native.glib.g_slist_delete_link
import org.gtkkn.native.glib.g_slist_foreach
import org.gtkkn.native.glib.g_slist_free
import org.gtkkn.native.glib.g_slist_free_1
import org.gtkkn.native.glib.g_slist_last
import org.gtkkn.native.glib.g_slist_length
import org.gtkkn.native.glib.g_slist_nth
import org.gtkkn.native.glib.g_slist_pop_allocator
import org.gtkkn.native.glib.g_slist_position
import org.gtkkn.native.glib.g_slist_remove_link
import org.gtkkn.native.glib.g_slist_reverse
import org.gtkkn.native.glib.g_slist_sort_with_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GSList struct is used for each element in the singly-linked
 * list.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: gpointer
 * - function `copy_deep`: C function g_slist_copy_deep is ignored
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
public class SList(pointer: CPointer<GSList>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibSListPointer: CPointer<GSList> = pointer

    /**
     * contains the link to the next element in the list.
     */
    public var next: SList?
        get() = glibSListPointer.pointed.next?.run {
            SList(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibSListPointer.pointed.next = value?.glibSListPointer
        }

    /**
     * Allocate a new SList.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GSList>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to SList and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GSList>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new SList using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GSList>().ptr)

    /**
     * Allocate a new SList.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param next contains the link to the next element in the list.
     */
    public constructor(next: SList?) : this() {
        this.next = next
    }

    /**
     * Allocate a new SList using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param next contains the link to the next element in the list.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(next: SList?, scope: AutofreeScope) : this(scope) {
        this.next = next
    }

    override fun toString(): String = "SList(next=$next)"

    public companion object {
        /**
         * Allocates space for one #GSList element. It is called by the
         * g_slist_append(), g_slist_prepend(), g_slist_insert() and
         * g_slist_insert_sorted() functions and so is rarely used on its own.
         *
         * @return a pointer to the newly-allocated #GSList element.
         */
        public fun alloc(): SList = g_slist_alloc()!!.run {
            SList(reinterpret())
        }

        /**
         * Adds the second #GSList onto the end of the first #GSList.
         * Note that the elements of the second #GSList are not copied.
         * They are used directly.
         *
         * @param list1 a #GSList
         * @param list2 the #GSList to add to the end of the first #GSList
         * @return the start of the new #GSList
         */
        public fun concat(list1: SList, list2: SList): SList =
            g_slist_concat(list1.glibSListPointer.reinterpret(), list2.glibSListPointer.reinterpret())!!.run {
                SList(reinterpret())
            }

        /**
         * Copies a #GSList.
         *
         * Note that this is a "shallow" copy. If the list elements
         * consist of pointers to data, the pointers are copied but
         * the actual data isn't. See g_slist_copy_deep() if you need
         * to copy the data as well.
         *
         * @param list a #GSList
         * @return a copy of @list
         */
        public fun copy(list: SList): SList = g_slist_copy(list.glibSListPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

        /**
         * Removes the node link_ from the list and frees it.
         * Compare this to g_slist_remove_link() which removes the node
         * without freeing it.
         *
         * Removing arbitrary nodes from a singly-linked list requires time
         * that is proportional to the length of the list (ie. O(n)). If you
         * find yourself using g_slist_delete_link() frequently, you should
         * consider a different data structure, such as the doubly-linked
         * #GList.
         *
         * @param list a #GSList
         * @param link node to delete
         * @return the new head of @list
         */
        public fun deleteLink(list: SList, link: SList): SList =
            g_slist_delete_link(list.glibSListPointer.reinterpret(), link.glibSListPointer.reinterpret())!!.run {
                SList(reinterpret())
            }

        /**
         * Calls a function for each element of a #GSList.
         *
         * It is safe for @func to remove the element from @list, but it must
         * not modify any part of the list after that element.
         *
         * @param list a #GSList
         * @param func the function to call with each element's data
         */
        public fun foreach(list: SList, func: Func): Unit = g_slist_foreach(
            list.glibSListPointer.reinterpret(),
            FuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

        /**
         * Frees all of the memory used by a #GSList.
         * The freed elements are returned to the slice allocator.
         *
         * If list elements contain dynamically-allocated memory,
         * you should either use g_slist_free_full() or free them manually
         * first.
         *
         * It can be combined with g_steal_pointer() to ensure the list head pointer
         * is not left dangling:
         * |[<!-- language="C" -->
         * GSList *list_of_borrowed_things = …;  /<!-- -->* (transfer container) *<!-- -->/
         * g_slist_free (g_steal_pointer (&list_of_borrowed_things));
         * ]|
         *
         * @param list the first link of a #GSList
         */
        public fun free(list: SList): Unit = g_slist_free(list.glibSListPointer.reinterpret())

        /**
         * Frees one #GSList element.
         * It is usually used after g_slist_remove_link().
         *
         * @param list a #GSList element
         */
        public fun free1(list: SList): Unit = g_slist_free_1(list.glibSListPointer.reinterpret())

        /**
         * Gets the last element in a #GSList.
         *
         * This function iterates over the whole list.
         *
         * @param list a #GSList
         * @return the last element in the #GSList,
         *     or null if the #GSList has no elements
         */
        public fun last(list: SList): SList = g_slist_last(list.glibSListPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

        /**
         * Gets the number of elements in a #GSList.
         *
         * This function iterates over the whole list to
         * count its elements. To check whether the list is non-empty, it is faster to
         * check @list against null.
         *
         * @param list a #GSList
         * @return the number of elements in the #GSList
         */
        public fun length(list: SList): guint = g_slist_length(list.glibSListPointer.reinterpret())

        /**
         * Gets the element at the given position in a #GSList.
         *
         * @param list a #GSList
         * @param n the position of the element, counting from 0
         * @return the element, or null if the position is off
         *     the end of the #GSList
         */
        public fun nth(list: SList, n: guint): SList = g_slist_nth(list.glibSListPointer.reinterpret(), n)!!.run {
            SList(reinterpret())
        }

        public fun popAllocator(): Unit = g_slist_pop_allocator()

        /**
         * Gets the position of the given element
         * in the #GSList (starting from 0).
         *
         * @param list a #GSList
         * @param llink an element in the #GSList
         * @return the position of the element in the #GSList,
         *     or -1 if the element is not found
         */
        public fun position(list: SList, llink: SList): gint =
            g_slist_position(list.glibSListPointer.reinterpret(), llink.glibSListPointer.reinterpret())

        /**
         * Removes an element from a #GSList, without
         * freeing the element. The removed element's next
         * link is set to null, so that it becomes a
         * self-contained list with one element.
         *
         * Removing arbitrary nodes from a singly-linked list
         * requires time that is proportional to the length of the list
         * (ie. O(n)). If you find yourself using g_slist_remove_link()
         * frequently, you should consider a different data structure,
         * such as the doubly-linked #GList.
         *
         * @param list a #GSList
         * @param link an element in the #GSList
         * @return the new start of the #GSList, without the element
         */
        public fun removeLink(list: SList, link: SList): SList =
            g_slist_remove_link(list.glibSListPointer.reinterpret(), link.glibSListPointer.reinterpret())!!.run {
                SList(reinterpret())
            }

        /**
         * Reverses a #GSList.
         *
         * @param list a #GSList
         * @return the start of the reversed #GSList
         */
        public fun reverse(list: SList): SList = g_slist_reverse(list.glibSListPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

        /**
         * Like g_slist_sort(), but the sort function accepts a user data argument.
         *
         * @param list a #GSList
         * @param compareFunc comparison function
         * @return new head of the list
         */
        public fun sortWithData(list: SList, compareFunc: CompareDataFunc): SList = g_slist_sort_with_data(
            list.glibSListPointer.reinterpret(),
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )!!.run {
            SList(reinterpret())
        }
    }
}
