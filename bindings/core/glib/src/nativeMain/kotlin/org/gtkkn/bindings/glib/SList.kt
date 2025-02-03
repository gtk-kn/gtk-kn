// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_34
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GSList
import org.gtkkn.native.glib.g_slist_alloc
import org.gtkkn.native.glib.g_slist_append
import org.gtkkn.native.glib.g_slist_concat
import org.gtkkn.native.glib.g_slist_copy
import org.gtkkn.native.glib.g_slist_copy_deep
import org.gtkkn.native.glib.g_slist_delete_link
import org.gtkkn.native.glib.g_slist_find
import org.gtkkn.native.glib.g_slist_foreach
import org.gtkkn.native.glib.g_slist_free
import org.gtkkn.native.glib.g_slist_free_1
import org.gtkkn.native.glib.g_slist_index
import org.gtkkn.native.glib.g_slist_insert
import org.gtkkn.native.glib.g_slist_insert_before
import org.gtkkn.native.glib.g_slist_insert_sorted_with_data
import org.gtkkn.native.glib.g_slist_last
import org.gtkkn.native.glib.g_slist_length
import org.gtkkn.native.glib.g_slist_nth
import org.gtkkn.native.glib.g_slist_nth_data
import org.gtkkn.native.glib.g_slist_pop_allocator
import org.gtkkn.native.glib.g_slist_position
import org.gtkkn.native.glib.g_slist_prepend
import org.gtkkn.native.glib.g_slist_push_allocator
import org.gtkkn.native.glib.g_slist_remove
import org.gtkkn.native.glib.g_slist_remove_all
import org.gtkkn.native.glib.g_slist_remove_link
import org.gtkkn.native.glib.g_slist_reverse
import org.gtkkn.native.glib.g_slist_sort_with_data
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import kotlin.String
import kotlin.Unit

/**
 * The #GSList struct is used for each element in the singly-linked
 * list.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `func`: CompareFunc
 * - parameter `free_func`: DestroyNotify
 * - parameter `func`: CompareFunc
 * - parameter `compare_func`: CompareFunc
 */
public class SList(public val glibSListPointer: CPointer<GSList>) : ProxyInstance(glibSListPointer) {
    /**
     * holds the element's data, which can be a pointer to any kind
     *        of data, or any integer value using the
     *        [Type Conversion Macros][glib-Type-Conversion-Macros]
     */
    public var `data`: gpointer
        get() = glibSListPointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            glibSListPointer.pointed.data = value
        }

    /**
     * contains the link to the next element in the list.
     */
    public var next: SList?
        get() = glibSListPointer.pointed.next?.run {
            SList(this)
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
    public constructor() : this(nativeHeap.alloc<GSList>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

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
     * @param data holds the element's data, which can be a pointer to any kind
     *        of data, or any integer value using the
     *        [Type Conversion Macros][glib-Type-Conversion-Macros]
     * @param next contains the link to the next element in the list.
     */
    public constructor(`data`: gpointer, next: SList?) : this() {
        this.data = data
        this.next = next
    }

    /**
     * Allocate a new SList using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data holds the element's data, which can be a pointer to any kind
     *        of data, or any integer value using the
     *        [Type Conversion Macros][glib-Type-Conversion-Macros]
     * @param next contains the link to the next element in the list.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: gpointer,
        next: SList?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.next = next
    }

    override fun toString(): String = "SList(data=$data, next=$next)"

    public companion object {
        /**
         * Allocates space for one #GSList element. It is called by the
         * g_slist_append(), g_slist_prepend(), g_slist_insert() and
         * g_slist_insert_sorted() functions and so is rarely used on its own.
         *
         * @return a pointer to the newly-allocated #GSList element.
         */
        public fun alloc(): SList = g_slist_alloc()!!.run {
            SList(this)
        }

        /**
         * Adds a new element on to the end of the list.
         *
         * The return value is the new start of the list, which may
         * have changed, so make sure you store the new value.
         *
         * Note that g_slist_append() has to traverse the entire list
         * to find the end, which is inefficient when adding multiple
         * elements. A common idiom to avoid the inefficiency is to prepend
         * the elements and reverse the list when all elements have been added.
         *
         * |[<!-- language="C" -->
         * // Notice that these are initialized to the empty list.
         * GSList *list = NULL, *number_list = NULL;
         *
         * // This is a list of strings.
         * list = g_slist_append (list, "first");
         * list = g_slist_append (list, "second");
         *
         * // This is a list of integers.
         * number_list = g_slist_append (number_list, GINT_TO_POINTER (27));
         * number_list = g_slist_append (number_list, GINT_TO_POINTER (14));
         * ]|
         *
         * @param list a #GSList
         * @param data the data for the new element
         * @return the new start of the #GSList
         */
        public fun append(list: SList, `data`: gpointer? = null): SList =
            g_slist_append(list.glibSListPointer, `data`)!!.run {
                SList(this)
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
            g_slist_concat(list1.glibSListPointer, list2.glibSListPointer)!!.run {
                SList(this)
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
        public fun copy(list: SList): SList = g_slist_copy(list.glibSListPointer)!!.run {
            SList(this)
        }

        /**
         * Makes a full (deep) copy of a #GSList.
         *
         * In contrast with g_slist_copy(), this function uses @func to make a copy of
         * each list element, in addition to copying the list container itself.
         *
         * @func, as a #GCopyFunc, takes two arguments, the data to be copied
         * and a @user_data pointer. On common processor architectures, it's safe to
         * pass null as @user_data if the copy function takes only one argument. You
         * may get compiler warnings from this though if compiling with GCC’s
         * `-Wcast-function-type` warning.
         *
         * For instance, if @list holds a list of GObjects, you can do:
         * |[<!-- language="C" -->
         * another_list = g_slist_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
         * ]|
         *
         * And, to entirely free the new list, you could do:
         * |[<!-- language="C" -->
         * g_slist_free_full (another_list, g_object_unref);
         * ]|
         *
         * @param list a #GSList
         * @param func a copy function used to copy every element in the list
         * @return a full copy of @list, use g_slist_free_full() to free it
         * @since 2.34
         */
        @GLibVersion2_34
        public fun copyDeep(list: SList, func: CopyFunc): SList = g_slist_copy_deep(
            list.glibSListPointer,
            CopyFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )!!.run {
            SList(this)
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
            g_slist_delete_link(list.glibSListPointer, link.glibSListPointer)!!.run {
                SList(this)
            }

        /**
         * Finds the element in a #GSList which
         * contains the given data.
         *
         * @param list a #GSList
         * @param data the element data to find
         * @return the found #GSList element,
         *     or null if it is not found
         */
        public fun find(list: SList, `data`: gpointer? = null): SList =
            g_slist_find(list.glibSListPointer, `data`)!!.run {
                SList(this)
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
        public fun foreach(list: SList, func: Func): Unit =
            g_slist_foreach(list.glibSListPointer, FuncFunc.reinterpret(), StableRef.create(func).asCPointer())

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
        public fun free(list: SList): Unit = g_slist_free(list.glibSListPointer)

        /**
         * Frees one #GSList element.
         * It is usually used after g_slist_remove_link().
         *
         * @param list a #GSList element
         */
        public fun free1(list: SList): Unit = g_slist_free_1(list.glibSListPointer)

        /**
         * Gets the position of the element containing
         * the given data (starting from 0).
         *
         * @param list a #GSList
         * @param data the data to find
         * @return the index of the element containing the data,
         *     or -1 if the data is not found
         */
        public fun index(list: SList, `data`: gpointer? = null): gint = g_slist_index(list.glibSListPointer, `data`)

        /**
         * Inserts a new element into the list at the given position.
         *
         * @param list a #GSList
         * @param data the data for the new element
         * @param position the position to insert the element.
         *     If this is negative, or is larger than the number
         *     of elements in the list, the new element is added on
         *     to the end of the list.
         * @return the new start of the #GSList
         */
        public fun insert(list: SList, `data`: gpointer? = null, position: gint): SList =
            g_slist_insert(list.glibSListPointer, `data`, position)!!.run {
                SList(this)
            }

        /**
         * Inserts a node before @sibling containing @data.
         *
         * @param slist a #GSList
         * @param sibling node to insert @data before
         * @param data data to put in the newly-inserted node
         * @return the new head of the list.
         */
        public fun insertBefore(slist: SList, sibling: SList, `data`: gpointer? = null): SList =
            g_slist_insert_before(slist.glibSListPointer, sibling.glibSListPointer, `data`)!!.run {
                SList(this)
            }

        /**
         * Inserts a new element into the list, using the given
         * comparison function to determine its position.
         *
         * @param list a #GSList
         * @param data the data for the new element
         * @param func the function to compare elements in the list.
         *     It should return a number > 0 if the first parameter
         *     comes after the second parameter in the sort order.
         * @return the new start of the #GSList
         * @since 2.10
         */
        @GLibVersion2_10
        public fun insertSortedWithData(list: SList, `data`: gpointer? = null, func: CompareDataFunc): SList =
            g_slist_insert_sorted_with_data(
                list.glibSListPointer,
                `data`,
                CompareDataFuncFunc.reinterpret(),
                StableRef.create(func).asCPointer()
            )!!.run {
                SList(this)
            }

        /**
         * Gets the last element in a #GSList.
         *
         * This function iterates over the whole list.
         *
         * @param list a #GSList
         * @return the last element in the #GSList,
         *     or null if the #GSList has no elements
         */
        public fun last(list: SList): SList = g_slist_last(list.glibSListPointer)!!.run {
            SList(this)
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
        public fun length(list: SList): guint = g_slist_length(list.glibSListPointer)

        /**
         * Gets the element at the given position in a #GSList.
         *
         * @param list a #GSList
         * @param n the position of the element, counting from 0
         * @return the element, or null if the position is off
         *     the end of the #GSList
         */
        public fun nth(list: SList, n: guint): SList = g_slist_nth(list.glibSListPointer, n)!!.run {
            SList(this)
        }

        /**
         * Gets the data of the element at the given position.
         *
         * @param list a #GSList
         * @param n the position of the element
         * @return the element's data, or null if the position
         *     is off the end of the #GSList
         */
        public fun nthData(list: SList, n: guint): gpointer? = g_slist_nth_data(list.glibSListPointer, n)

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
            g_slist_position(list.glibSListPointer, llink.glibSListPointer)

        /**
         * Adds a new element on to the start of the list.
         *
         * The return value is the new start of the list, which
         * may have changed, so make sure you store the new value.
         *
         * |[<!-- language="C" -->
         * // Notice that it is initialized to the empty list.
         * GSList *list = NULL;
         * list = g_slist_prepend (list, "last");
         * list = g_slist_prepend (list, "first");
         * ]|
         *
         * @param list a #GSList
         * @param data the data for the new element
         * @return the new start of the #GSList
         */
        public fun prepend(list: SList, `data`: gpointer? = null): SList =
            g_slist_prepend(list.glibSListPointer, `data`)!!.run {
                SList(this)
            }

        public fun pushAllocator(allocator: Allocator): Unit = g_slist_push_allocator(allocator.glibAllocatorPointer)

        /**
         * Removes an element from a #GSList.
         * If two elements contain the same data, only the first is removed.
         * If none of the elements contain the data, the #GSList is unchanged.
         *
         * @param list a #GSList
         * @param data the data of the element to remove
         * @return the new start of the #GSList
         */
        public fun remove(list: SList, `data`: gpointer? = null): SList =
            g_slist_remove(list.glibSListPointer, `data`)!!.run {
                SList(this)
            }

        /**
         * Removes all list nodes with data equal to @data.
         * Returns the new head of the list. Contrast with
         * g_slist_remove() which removes only the first node
         * matching the given data.
         *
         * @param list a #GSList
         * @param data data to remove
         * @return new head of @list
         */
        public fun removeAll(list: SList, `data`: gpointer? = null): SList =
            g_slist_remove_all(list.glibSListPointer, `data`)!!.run {
                SList(this)
            }

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
            g_slist_remove_link(list.glibSListPointer, link.glibSListPointer)!!.run {
                SList(this)
            }

        /**
         * Reverses a #GSList.
         *
         * @param list a #GSList
         * @return the start of the reversed #GSList
         */
        public fun reverse(list: SList): SList = g_slist_reverse(list.glibSListPointer)!!.run {
            SList(this)
        }

        /**
         * Like g_slist_sort(), but the sort function accepts a user data argument.
         *
         * @param list a #GSList
         * @param compareFunc comparison function
         * @return new head of the list
         */
        public fun sortWithData(list: SList, compareFunc: CompareDataFunc): SList = g_slist_sort_with_data(
            list.glibSListPointer,
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )!!.run {
            SList(this)
        }
    }
}
