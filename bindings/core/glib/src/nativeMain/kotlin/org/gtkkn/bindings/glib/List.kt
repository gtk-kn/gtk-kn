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
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GList
import org.gtkkn.native.glib.g_list_alloc
import org.gtkkn.native.glib.g_list_append
import org.gtkkn.native.glib.g_list_concat
import org.gtkkn.native.glib.g_list_copy
import org.gtkkn.native.glib.g_list_copy_deep
import org.gtkkn.native.glib.g_list_delete_link
import org.gtkkn.native.glib.g_list_find
import org.gtkkn.native.glib.g_list_first
import org.gtkkn.native.glib.g_list_foreach
import org.gtkkn.native.glib.g_list_free
import org.gtkkn.native.glib.g_list_free_1
import org.gtkkn.native.glib.g_list_index
import org.gtkkn.native.glib.g_list_insert
import org.gtkkn.native.glib.g_list_insert_before
import org.gtkkn.native.glib.g_list_insert_before_link
import org.gtkkn.native.glib.g_list_insert_sorted_with_data
import org.gtkkn.native.glib.g_list_last
import org.gtkkn.native.glib.g_list_length
import org.gtkkn.native.glib.g_list_nth
import org.gtkkn.native.glib.g_list_nth_data
import org.gtkkn.native.glib.g_list_nth_prev
import org.gtkkn.native.glib.g_list_pop_allocator
import org.gtkkn.native.glib.g_list_position
import org.gtkkn.native.glib.g_list_prepend
import org.gtkkn.native.glib.g_list_push_allocator
import org.gtkkn.native.glib.g_list_remove
import org.gtkkn.native.glib.g_list_remove_all
import org.gtkkn.native.glib.g_list_remove_link
import org.gtkkn.native.glib.g_list_reverse
import org.gtkkn.native.glib.g_list_sort_with_data
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import kotlin.String
import kotlin.Unit

/**
 * The #GList struct is used for each element in a doubly-linked list.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `func`: CompareFunc
 * - parameter `free_func`: DestroyNotify
 * - parameter `func`: CompareFunc
 * - parameter `compare_func`: CompareFunc
 */
public class List(public val glibListPointer: CPointer<GList>) : ProxyInstance(glibListPointer) {
    /**
     * holds the element's data, which can be a pointer to any kind
     *        of data, or any integer value using the
     *        [Type Conversion Macros][glib-Type-Conversion-Macros]
     */
    public var `data`: gpointer
        get() = glibListPointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            glibListPointer.pointed.data = value
        }

    /**
     * contains the link to the next element in the list
     */
    public var next: List?
        get() = glibListPointer.pointed.next?.run {
            List(this)
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
            List(this)
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
    public constructor() : this(nativeHeap.alloc<GList>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

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
     * @param data holds the element's data, which can be a pointer to any kind
     *        of data, or any integer value using the
     *        [Type Conversion Macros][glib-Type-Conversion-Macros]
     * @param next contains the link to the next element in the list
     * @param prev contains the link to the previous element in the list
     */
    public constructor(
        `data`: gpointer,
        next: List?,
        prev: List?,
    ) : this() {
        this.data = data
        this.next = next
        this.prev = prev
    }

    /**
     * Allocate a new List using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data holds the element's data, which can be a pointer to any kind
     *        of data, or any integer value using the
     *        [Type Conversion Macros][glib-Type-Conversion-Macros]
     * @param next contains the link to the next element in the list
     * @param prev contains the link to the previous element in the list
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: gpointer,
        next: List?,
        prev: List?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.next = next
        this.prev = prev
    }

    override fun toString(): String = "List(data=$data, next=$next, prev=$prev)"

    public companion object {
        /**
         * Allocates space for one #GList element. It is called by
         * g_list_append(), g_list_prepend(), g_list_insert() and
         * g_list_insert_sorted() and so is rarely used on its own.
         *
         * @return a pointer to the newly-allocated #GList element
         */
        public fun alloc(): List = g_list_alloc()!!.run {
            List(this)
        }

        /**
         * Adds a new element on to the end of the list.
         *
         * Note that the return value is the new start of the list,
         * if @list was empty; make sure you store the new value.
         *
         * g_list_append() has to traverse the entire list to find the end,
         * which is inefficient when adding multiple elements. A common idiom
         * to avoid the inefficiency is to use g_list_prepend() and reverse
         * the list with g_list_reverse() when all elements have been added.
         *
         * |[<!-- language="C" -->
         * // Notice that these are initialized to the empty list.
         * GList *string_list = NULL, *number_list = NULL;
         *
         * // This is a list of strings.
         * string_list = g_list_append (string_list, "first");
         * string_list = g_list_append (string_list, "second");
         *
         * // This is a list of integers.
         * number_list = g_list_append (number_list, GINT_TO_POINTER (27));
         * number_list = g_list_append (number_list, GINT_TO_POINTER (14));
         * ]|
         *
         * @param list a pointer to a #GList
         * @param data the data for the new element
         * @return either @list or the new start of the #GList if @list was null
         */
        public fun append(list: List, `data`: gpointer? = null): List =
            g_list_append(list.glibListPointer, `data`)!!.run {
                List(this)
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
            g_list_concat(list1.glibListPointer, list2.glibListPointer)!!.run {
                List(this)
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
        public fun copy(list: List): List = g_list_copy(list.glibListPointer)!!.run {
            List(this)
        }

        /**
         * Makes a full (deep) copy of a #GList.
         *
         * In contrast with g_list_copy(), this function uses @func to make
         * a copy of each list element, in addition to copying the list
         * container itself.
         *
         * @func, as a #GCopyFunc, takes two arguments, the data to be copied
         * and a @user_data pointer. On common processor architectures, it's safe to
         * pass null as @user_data if the copy function takes only one argument. You
         * may get compiler warnings from this though if compiling with GCC’s
         * `-Wcast-function-type` warning.
         *
         * For instance, if @list holds a list of GObjects, you can do:
         * |[<!-- language="C" -->
         * another_list = g_list_copy_deep (list, (GCopyFunc) g_object_ref, NULL);
         * ]|
         *
         * And, to entirely free the new list, you could do:
         * |[<!-- language="C" -->
         * g_list_free_full (another_list, g_object_unref);
         * ]|
         *
         * @param list a #GList, this must point to the top of the list
         * @param func a copy function used to copy every element in the list
         * @return the start of the new list that holds a full copy of @list,
         *     use g_list_free_full() to free it
         * @since 2.34
         */
        @GLibVersion2_34
        public fun copyDeep(list: List, func: CopyFunc): List = g_list_copy_deep(
            list.glibListPointer,
            CopyFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )!!.run {
            List(this)
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
            g_list_delete_link(list.glibListPointer, link.glibListPointer)!!.run {
                List(this)
            }

        /**
         * Finds the element in a #GList which contains the given data.
         *
         * @param list a #GList, this must point to the top of the list
         * @param data the element data to find
         * @return the found #GList element, or null if it is not found
         */
        public fun find(list: List, `data`: gpointer? = null): List = g_list_find(list.glibListPointer, `data`)!!.run {
            List(this)
        }

        /**
         * Gets the first element in a #GList.
         *
         * @param list any #GList element
         * @return the first element in the #GList,
         *     or null if the #GList has no elements
         */
        public fun first(list: List): List = g_list_first(list.glibListPointer)!!.run {
            List(this)
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
        public fun foreach(list: List, func: Func): Unit =
            g_list_foreach(list.glibListPointer, FuncFunc.reinterpret(), StableRef.create(func).asCPointer())

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
        public fun free(list: List): Unit = g_list_free(list.glibListPointer)

        /**
         * Frees one #GList element, but does not update links from the next and
         * previous elements in the list, so you should not call this function on an
         * element that is currently part of a list.
         *
         * It is usually used after g_list_remove_link().
         *
         * @param list a #GList element
         */
        public fun free1(list: List): Unit = g_list_free_1(list.glibListPointer)

        /**
         * Gets the position of the element containing
         * the given data (starting from 0).
         *
         * @param list a #GList, this must point to the top of the list
         * @param data the data to find
         * @return the index of the element containing the data,
         *     or -1 if the data is not found
         */
        public fun index(list: List, `data`: gpointer? = null): gint = g_list_index(list.glibListPointer, `data`)

        /**
         * Inserts a new element into the list at the given position.
         *
         * @param list a pointer to a #GList, this must point to the top of the list
         * @param data the data for the new element
         * @param position the position to insert the element. If this is
         *     negative, or is larger than the number of elements in the
         *     list, the new element is added on to the end of the list.
         * @return the (possibly changed) start of the #GList
         */
        public fun insert(list: List, `data`: gpointer? = null, position: gint): List =
            g_list_insert(list.glibListPointer, `data`, position)!!.run {
                List(this)
            }

        /**
         * Inserts a new element into the list before the given position.
         *
         * @param list a pointer to a #GList, this must point to the top of the list
         * @param sibling the list element before which the new element
         *     is inserted or null to insert at the end of the list
         * @param data the data for the new element
         * @return the (possibly changed) start of the #GList
         */
        public fun insertBefore(list: List, sibling: List, `data`: gpointer? = null): List =
            g_list_insert_before(list.glibListPointer, sibling.glibListPointer, `data`)!!.run {
                List(this)
            }

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
        public fun insertBeforeLink(list: List, sibling: List? = null, link: List): List =
            g_list_insert_before_link(list.glibListPointer, sibling?.glibListPointer, link.glibListPointer)!!.run {
                List(this)
            }

        /**
         * Inserts a new element into the list, using the given comparison
         * function to determine its position.
         *
         * If you are adding many new elements to a list, and the number of
         * new elements is much larger than the length of the list, use
         * g_list_prepend() to add the new items and sort the list afterwards
         * with g_list_sort().
         *
         * @param list a pointer to a #GList, this must point to the top of the
         *     already sorted list
         * @param data the data for the new element
         * @param func the function to compare elements in the list. It should
         *     return a number > 0 if the first parameter  comes after the
         *     second parameter in the sort order.
         * @return the (possibly changed) start of the #GList
         * @since 2.10
         */
        @GLibVersion2_10
        public fun insertSortedWithData(list: List, `data`: gpointer? = null, func: CompareDataFunc): List =
            g_list_insert_sorted_with_data(
                list.glibListPointer,
                `data`,
                CompareDataFuncFunc.reinterpret(),
                StableRef.create(func).asCPointer()
            )!!.run {
                List(this)
            }

        /**
         * Gets the last element in a #GList.
         *
         * @param list any #GList element
         * @return the last element in the #GList,
         *     or null if the #GList has no elements
         */
        public fun last(list: List): List = g_list_last(list.glibListPointer)!!.run {
            List(this)
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
        public fun length(list: List): guint = g_list_length(list.glibListPointer)

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
        public fun nth(list: List, n: guint): List = g_list_nth(list.glibListPointer, n)!!.run {
            List(this)
        }

        /**
         * Gets the data of the element at the given position.
         *
         * This iterates over the list until it reaches the @n-th position. If you
         * intend to iterate over every element, it is better to use a for-loop as
         * described in the #GList introduction.
         *
         * @param list a #GList, this must point to the top of the list
         * @param n the position of the element
         * @return the element's data, or null if the position
         *     is off the end of the #GList
         */
        public fun nthData(list: List, n: guint): gpointer? = g_list_nth_data(list.glibListPointer, n)

        /**
         * Gets the element @n places before @list.
         *
         * @param list a #GList
         * @param n the position of the element, counting from 0
         * @return the element, or null if the position is
         *     off the end of the #GList
         */
        public fun nthPrev(list: List, n: guint): List = g_list_nth_prev(list.glibListPointer, n)!!.run {
            List(this)
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
            g_list_position(list.glibListPointer, llink.glibListPointer)

        /**
         * Prepends a new element on to the start of the list.
         *
         * Note that the return value is the new start of the list,
         * which will have changed, so make sure you store the new value.
         *
         * |[<!-- language="C" -->
         * // Notice that it is initialized to the empty list.
         * GList *list = NULL;
         *
         * list = g_list_prepend (list, "last");
         * list = g_list_prepend (list, "first");
         * ]|
         *
         * Do not use this function to prepend a new element to a different
         * element than the start of the list. Use g_list_insert_before() instead.
         *
         * @param list a pointer to a #GList, this must point to the top of the list
         * @param data the data for the new element
         * @return a pointer to the newly prepended element, which is the new
         *     start of the #GList
         */
        public fun prepend(list: List, `data`: gpointer? = null): List =
            g_list_prepend(list.glibListPointer, `data`)!!.run {
                List(this)
            }

        public fun pushAllocator(allocator: Allocator): Unit = g_list_push_allocator(allocator.glibAllocatorPointer)

        /**
         * Removes an element from a #GList.
         * If two elements contain the same data, only the first is removed.
         * If none of the elements contain the data, the #GList is unchanged.
         *
         * @param list a #GList, this must point to the top of the list
         * @param data the data of the element to remove
         * @return the (possibly changed) start of the #GList
         */
        public fun remove(list: List, `data`: gpointer? = null): List =
            g_list_remove(list.glibListPointer, `data`)!!.run {
                List(this)
            }

        /**
         * Removes all list nodes with data equal to @data.
         * Returns the new head of the list. Contrast with
         * g_list_remove() which removes only the first node
         * matching the given data.
         *
         * @param list a #GList, this must point to the top of the list
         * @param data data to remove
         * @return the (possibly changed) start of the #GList
         */
        public fun removeAll(list: List, `data`: gpointer? = null): List =
            g_list_remove_all(list.glibListPointer, `data`)!!.run {
                List(this)
            }

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
            g_list_remove_link(list.glibListPointer, llink.glibListPointer)!!.run {
                List(this)
            }

        /**
         * Reverses a #GList.
         * It simply switches the next and prev pointers of each element.
         *
         * @param list a #GList, this must point to the top of the list
         * @return the start of the reversed #GList
         */
        public fun reverse(list: List): List = g_list_reverse(list.glibListPointer)!!.run {
            List(this)
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
            list.glibListPointer,
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )!!.run {
            List(this)
        }
    }
}
