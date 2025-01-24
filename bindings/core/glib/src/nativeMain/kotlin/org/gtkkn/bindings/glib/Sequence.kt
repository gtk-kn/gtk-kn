// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_28
import org.gtkkn.bindings.glib.annotations.GLibVersion2_48
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GSequence
import org.gtkkn.native.glib.g_sequence_append
import org.gtkkn.native.glib.g_sequence_foreach
import org.gtkkn.native.glib.g_sequence_foreach_range
import org.gtkkn.native.glib.g_sequence_free
import org.gtkkn.native.glib.g_sequence_get
import org.gtkkn.native.glib.g_sequence_get_begin_iter
import org.gtkkn.native.glib.g_sequence_get_end_iter
import org.gtkkn.native.glib.g_sequence_get_iter_at_pos
import org.gtkkn.native.glib.g_sequence_get_length
import org.gtkkn.native.glib.g_sequence_insert_before
import org.gtkkn.native.glib.g_sequence_insert_sorted
import org.gtkkn.native.glib.g_sequence_insert_sorted_iter
import org.gtkkn.native.glib.g_sequence_is_empty
import org.gtkkn.native.glib.g_sequence_lookup
import org.gtkkn.native.glib.g_sequence_lookup_iter
import org.gtkkn.native.glib.g_sequence_move
import org.gtkkn.native.glib.g_sequence_move_range
import org.gtkkn.native.glib.g_sequence_prepend
import org.gtkkn.native.glib.g_sequence_range_get_midpoint
import org.gtkkn.native.glib.g_sequence_remove
import org.gtkkn.native.glib.g_sequence_remove_range
import org.gtkkn.native.glib.g_sequence_search
import org.gtkkn.native.glib.g_sequence_search_iter
import org.gtkkn.native.glib.g_sequence_set
import org.gtkkn.native.glib.g_sequence_sort
import org.gtkkn.native.glib.g_sequence_sort_changed
import org.gtkkn.native.glib.g_sequence_sort_changed_iter
import org.gtkkn.native.glib.g_sequence_sort_iter
import org.gtkkn.native.glib.g_sequence_swap
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import kotlin.Boolean
import kotlin.Unit

/**
 * The #GSequence struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data_destroy`: DestroyNotify
 */
public class Sequence(public val glibSequencePointer: CPointer<GSequence>) : ProxyInstance(glibSequencePointer) {
    /**
     * Adds a new item to the end of @seq.
     *
     * @param data the data for the new item
     * @return an iterator pointing to the new item
     * @since 2.14
     */
    @GLibVersion2_14
    public fun append(`data`: gpointer? = null): SequenceIter = g_sequence_append(glibSequencePointer, `data`)!!.run {
        SequenceIter(this)
    }

    /**
     * Calls @func for each item in the sequence passing @user_data
     * to the function. @func must not modify the sequence itself.
     *
     * @param func the function to call for each item in @seq
     * @since 2.14
     */
    @GLibVersion2_14
    public fun foreach(func: Func): Unit =
        g_sequence_foreach(glibSequencePointer, FuncFunc.reinterpret(), StableRef.create(func).asCPointer())

    /**
     * Frees the memory allocated for @seq. If @seq has a data destroy
     * function associated with it, that function is called on all items
     * in @seq.
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun free(): Unit = g_sequence_free(glibSequencePointer)

    /**
     * Returns the begin iterator for @seq.
     *
     * @return the begin iterator for @seq.
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getBeginIter(): SequenceIter = g_sequence_get_begin_iter(glibSequencePointer)!!.run {
        SequenceIter(this)
    }

    /**
     * Returns the end iterator for @seg
     *
     * @return the end iterator for @seq
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getEndIter(): SequenceIter = g_sequence_get_end_iter(glibSequencePointer)!!.run {
        SequenceIter(this)
    }

    /**
     * Returns the iterator at position @pos. If @pos is negative or larger
     * than the number of items in @seq, the end iterator is returned.
     *
     * @param pos a position in @seq, or -1 for the end
     * @return The #GSequenceIter at position @pos
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getIterAtPos(pos: gint): SequenceIter = g_sequence_get_iter_at_pos(glibSequencePointer, pos)!!.run {
        SequenceIter(this)
    }

    /**
     * Returns the positive length (>= 0) of @seq. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     *
     * @return the length of @seq
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getLength(): gint = g_sequence_get_length(glibSequencePointer)

    /**
     * Inserts @data into @seq using @cmp_func to determine the new
     * position. The sequence must already be sorted according to @cmp_func;
     * otherwise the new position of @data is undefined.
     *
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value
     * if the first item comes before the second, and a positive value
     * if the second item comes before the first.
     *
     * Note that when adding a large amount of data to a #GSequence,
     * it is more efficient to do unsorted insertions and then call
     * g_sequence_sort() or g_sequence_sort_iter().
     *
     * @param data the data to insert
     * @param cmpFunc the function used to compare items in the sequence
     * @return a #GSequenceIter pointing to the new item.
     * @since 2.14
     */
    @GLibVersion2_14
    public fun insertSorted(`data`: gpointer? = null, cmpFunc: CompareDataFunc): SequenceIter =
        g_sequence_insert_sorted(
            glibSequencePointer,
            `data`,
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(cmpFunc).asCPointer()
        )!!.run {
            SequenceIter(this)
        }

    /**
     * Like g_sequence_insert_sorted(), but uses
     * a #GSequenceIterCompareFunc instead of a #GCompareDataFunc as
     * the compare function.
     *
     * @iter_cmp is called with two iterators pointing into @seq.
     * It should return 0 if the iterators are equal, a negative
     * value if the first iterator comes before the second, and a
     * positive value if the second iterator comes before the first.
     *
     * Note that when adding a large amount of data to a #GSequence,
     * it is more efficient to do unsorted insertions and then call
     * g_sequence_sort() or g_sequence_sort_iter().
     *
     * @param data data for the new item
     * @param iterCmp the function used to compare iterators in the sequence
     * @return a #GSequenceIter pointing to the new item
     * @since 2.14
     */
    @GLibVersion2_14
    public fun insertSortedIter(`data`: gpointer? = null, iterCmp: SequenceIterCompareFunc): SequenceIter =
        g_sequence_insert_sorted_iter(
            glibSequencePointer,
            `data`,
            SequenceIterCompareFuncFunc.reinterpret(),
            StableRef.create(iterCmp).asCPointer()
        )!!.run {
            SequenceIter(this)
        }

    /**
     * Returns true if the sequence contains zero items.
     *
     * This function is functionally identical to checking the result of
     * g_sequence_get_length() being equal to zero. However this function is
     * implemented in O(1) running time.
     *
     * @return true if the sequence is empty, otherwise false.
     * @since 2.48
     */
    @GLibVersion2_48
    public fun isEmpty(): Boolean = g_sequence_is_empty(glibSequencePointer).asBoolean()

    /**
     * Returns an iterator pointing to the position of the first item found
     * equal to @data according to @cmp_func and @cmp_data. If more than one
     * item is equal, it is not guaranteed that it is the first which is
     * returned. In that case, you can use g_sequence_iter_next() and
     * g_sequence_iter_prev() to get others.
     *
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     *
     * This function will fail if the data contained in the sequence is
     * unsorted.
     *
     * @param data data to look up
     * @param cmpFunc the function used to compare items in the sequence
     * @return an #GSequenceIter pointing to the position of the
     *     first item found equal to @data according to @cmp_func and
     *     @cmp_data, or null if no such item exists
     * @since 2.28
     */
    @GLibVersion2_28
    public fun lookup(`data`: gpointer? = null, cmpFunc: CompareDataFunc): SequenceIter? = g_sequence_lookup(
        glibSequencePointer,
        `data`,
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(cmpFunc).asCPointer()
    )?.run {
        SequenceIter(this)
    }

    /**
     * Like g_sequence_lookup(), but uses a #GSequenceIterCompareFunc
     * instead of a #GCompareDataFunc as the compare function.
     *
     * @iter_cmp is called with two iterators pointing into @seq.
     * It should return 0 if the iterators are equal, a negative value
     * if the first iterator comes before the second, and a positive
     * value if the second iterator comes before the first.
     *
     * This function will fail if the data contained in the sequence is
     * unsorted.
     *
     * @param data data to look up
     * @param iterCmp the function used to compare iterators in the sequence
     * @return an #GSequenceIter pointing to the position of
     *     the first item found equal to @data according to @iter_cmp
     *     and @cmp_data, or null if no such item exists
     * @since 2.28
     */
    @GLibVersion2_28
    public fun lookupIter(`data`: gpointer? = null, iterCmp: SequenceIterCompareFunc): SequenceIter? =
        g_sequence_lookup_iter(
            glibSequencePointer,
            `data`,
            SequenceIterCompareFuncFunc.reinterpret(),
            StableRef.create(iterCmp).asCPointer()
        )?.run {
            SequenceIter(this)
        }

    /**
     * Adds a new item to the front of @seq
     *
     * @param data the data for the new item
     * @return an iterator pointing to the new item
     * @since 2.14
     */
    @GLibVersion2_14
    public fun prepend(`data`: gpointer? = null): SequenceIter = g_sequence_prepend(glibSequencePointer, `data`)!!.run {
        SequenceIter(this)
    }

    /**
     * Returns an iterator pointing to the position where @data would
     * be inserted according to @cmp_func and @cmp_data.
     *
     * @cmp_func is called with two items of the @seq, and @cmp_data.
     * It should return 0 if the items are equal, a negative value if
     * the first item comes before the second, and a positive value if
     * the second item comes before the first.
     *
     * If you are simply searching for an existing element of the sequence,
     * consider using g_sequence_lookup().
     *
     * This function will fail if the data contained in the sequence is
     * unsorted.
     *
     * @param data data for the new item
     * @param cmpFunc the function used to compare items in the sequence
     * @return an #GSequenceIter pointing to the position where @data
     *     would have been inserted according to @cmp_func and @cmp_data
     * @since 2.14
     */
    @GLibVersion2_14
    public fun search(`data`: gpointer? = null, cmpFunc: CompareDataFunc): SequenceIter = g_sequence_search(
        glibSequencePointer,
        `data`,
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(cmpFunc).asCPointer()
    )!!.run {
        SequenceIter(this)
    }

    /**
     * Like g_sequence_search(), but uses a #GSequenceIterCompareFunc
     * instead of a #GCompareDataFunc as the compare function.
     *
     * @iter_cmp is called with two iterators pointing into @seq.
     * It should return 0 if the iterators are equal, a negative value
     * if the first iterator comes before the second, and a positive
     * value if the second iterator comes before the first.
     *
     * If you are simply searching for an existing element of the sequence,
     * consider using g_sequence_lookup_iter().
     *
     * This function will fail if the data contained in the sequence is
     * unsorted.
     *
     * @param data data for the new item
     * @param iterCmp the function used to compare iterators in the sequence
     * @return a #GSequenceIter pointing to the position in @seq
     *     where @data would have been inserted according to @iter_cmp
     *     and @cmp_data
     * @since 2.14
     */
    @GLibVersion2_14
    public fun searchIter(`data`: gpointer? = null, iterCmp: SequenceIterCompareFunc): SequenceIter =
        g_sequence_search_iter(
            glibSequencePointer,
            `data`,
            SequenceIterCompareFuncFunc.reinterpret(),
            StableRef.create(iterCmp).asCPointer()
        )!!.run {
            SequenceIter(this)
        }

    /**
     * Sorts @seq using @cmp_func.
     *
     * @cmp_func is passed two items of @seq and should
     * return 0 if they are equal, a negative value if the
     * first comes before the second, and a positive value
     * if the second comes before the first.
     *
     * @param cmpFunc the function used to sort the sequence
     * @since 2.14
     */
    @GLibVersion2_14
    public fun sort(cmpFunc: CompareDataFunc): Unit =
        g_sequence_sort(glibSequencePointer, CompareDataFuncFunc.reinterpret(), StableRef.create(cmpFunc).asCPointer())

    /**
     * Like g_sequence_sort(), but uses a #GSequenceIterCompareFunc instead
     * of a #GCompareDataFunc as the compare function
     *
     * @cmp_func is called with two iterators pointing into @seq. It should
     * return 0 if the iterators are equal, a negative value if the first
     * iterator comes before the second, and a positive value if the second
     * iterator comes before the first.
     *
     * @param cmpFunc the function used to compare iterators in the sequence
     * @since 2.14
     */
    @GLibVersion2_14
    public fun sortIter(cmpFunc: SequenceIterCompareFunc): Unit = g_sequence_sort_iter(
        glibSequencePointer,
        SequenceIterCompareFuncFunc.reinterpret(),
        StableRef.create(cmpFunc).asCPointer()
    )

    public companion object {
        /**
         * Calls @func for each item in the range (@begin, @end) passing
         * @user_data to the function. @func must not modify the sequence
         * itself.
         *
         * @param begin a #GSequenceIter
         * @param end a #GSequenceIter
         * @param func a #GFunc
         * @since 2.14
         */
        @GLibVersion2_14
        public fun foreachRange(begin: SequenceIter, end: SequenceIter, func: Func): Unit = g_sequence_foreach_range(
            begin.glibSequenceIterPointer,
            end.glibSequenceIterPointer,
            FuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

        /**
         * Returns the data that @iter points to.
         *
         * @param iter a #GSequenceIter
         * @return the data that @iter points to
         * @since 2.14
         */
        @GLibVersion2_14
        public fun `get`(iter: SequenceIter): gpointer? = g_sequence_get(iter.glibSequenceIterPointer)

        /**
         * Inserts a new item just before the item pointed to by @iter.
         *
         * @param iter a #GSequenceIter
         * @param data the data for the new item
         * @return an iterator pointing to the new item
         * @since 2.14
         */
        @GLibVersion2_14
        public fun insertBefore(iter: SequenceIter, `data`: gpointer? = null): SequenceIter =
            g_sequence_insert_before(iter.glibSequenceIterPointer, `data`)!!.run {
                SequenceIter(this)
            }

        /**
         * Moves the item pointed to by @src to the position indicated by @dest.
         * After calling this function @dest will point to the position immediately
         * after @src. It is allowed for @src and @dest to point into different
         * sequences.
         *
         * @param src a #GSequenceIter pointing to the item to move
         * @param dest a #GSequenceIter pointing to the position to which
         *     the item is moved
         * @since 2.14
         */
        @GLibVersion2_14
        public fun move(src: SequenceIter, dest: SequenceIter): Unit =
            g_sequence_move(src.glibSequenceIterPointer, dest.glibSequenceIterPointer)

        /**
         * Inserts the (@begin, @end) range at the destination pointed to by @dest.
         * The @begin and @end iters must point into the same sequence. It is
         * allowed for @dest to point to a different sequence than the one pointed
         * into by @begin and @end.
         *
         * If @dest is null, the range indicated by @begin and @end is
         * removed from the sequence. If @dest points to a place within
         * the (@begin, @end) range, the range does not move.
         *
         * @param dest a #GSequenceIter
         * @param begin a #GSequenceIter
         * @param end a #GSequenceIter
         * @since 2.14
         */
        @GLibVersion2_14
        public fun moveRange(dest: SequenceIter, begin: SequenceIter, end: SequenceIter): Unit = g_sequence_move_range(
            dest.glibSequenceIterPointer,
            begin.glibSequenceIterPointer,
            end.glibSequenceIterPointer
        )

        /**
         * Finds an iterator somewhere in the range (@begin, @end). This
         * iterator will be close to the middle of the range, but is not
         * guaranteed to be exactly in the middle.
         *
         * The @begin and @end iterators must both point to the same sequence
         * and @begin must come before or be equal to @end in the sequence.
         *
         * @param begin a #GSequenceIter
         * @param end a #GSequenceIter
         * @return a #GSequenceIter pointing somewhere in the
         *    (@begin, @end) range
         * @since 2.14
         */
        @GLibVersion2_14
        public fun rangeGetMidpoint(begin: SequenceIter, end: SequenceIter): SequenceIter =
            g_sequence_range_get_midpoint(begin.glibSequenceIterPointer, end.glibSequenceIterPointer)!!.run {
                SequenceIter(this)
            }

        /**
         * Removes the item pointed to by @iter. It is an error to pass the
         * end iterator to this function.
         *
         * If the sequence has a data destroy function associated with it, this
         * function is called on the data for the removed item.
         *
         * @param iter a #GSequenceIter
         * @since 2.14
         */
        @GLibVersion2_14
        public fun remove(iter: SequenceIter): Unit = g_sequence_remove(iter.glibSequenceIterPointer)

        /**
         * Removes all items in the (@begin, @end) range.
         *
         * If the sequence has a data destroy function associated with it, this
         * function is called on the data for the removed items.
         *
         * @param begin a #GSequenceIter
         * @param end a #GSequenceIter
         * @since 2.14
         */
        @GLibVersion2_14
        public fun removeRange(begin: SequenceIter, end: SequenceIter): Unit =
            g_sequence_remove_range(begin.glibSequenceIterPointer, end.glibSequenceIterPointer)

        /**
         * Changes the data for the item pointed to by @iter to be @data. If
         * the sequence has a data destroy function associated with it, that
         * function is called on the existing data that @iter pointed to.
         *
         * @param iter a #GSequenceIter
         * @param data new data for the item
         * @since 2.14
         */
        @GLibVersion2_14
        public fun `set`(iter: SequenceIter, `data`: gpointer? = null): Unit =
            g_sequence_set(iter.glibSequenceIterPointer, `data`)

        /**
         * Moves the data pointed to by @iter to a new position as indicated by
         * @cmp_func. This
         * function should be called for items in a sequence already sorted according
         * to @cmp_func whenever some aspect of an item changes so that @cmp_func
         * may return different values for that item.
         *
         * @cmp_func is called with two items of the @seq, and @cmp_data.
         * It should return 0 if the items are equal, a negative value if
         * the first item comes before the second, and a positive value if
         * the second item comes before the first.
         *
         * @param iter A #GSequenceIter
         * @param cmpFunc the function used to compare items in the sequence
         * @since 2.14
         */
        @GLibVersion2_14
        public fun sortChanged(iter: SequenceIter, cmpFunc: CompareDataFunc): Unit = g_sequence_sort_changed(
            iter.glibSequenceIterPointer,
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(cmpFunc).asCPointer()
        )

        /**
         * Like g_sequence_sort_changed(), but uses
         * a #GSequenceIterCompareFunc instead of a #GCompareDataFunc as
         * the compare function.
         *
         * @iter_cmp is called with two iterators pointing into the #GSequence that
         * @iter points into. It should
         * return 0 if the iterators are equal, a negative value if the first
         * iterator comes before the second, and a positive value if the second
         * iterator comes before the first.
         *
         * @param iter a #GSequenceIter
         * @param iterCmp the function used to compare iterators in the sequence
         * @since 2.14
         */
        @GLibVersion2_14
        public fun sortChangedIter(iter: SequenceIter, iterCmp: SequenceIterCompareFunc): Unit =
            g_sequence_sort_changed_iter(
                iter.glibSequenceIterPointer,
                SequenceIterCompareFuncFunc.reinterpret(),
                StableRef.create(iterCmp).asCPointer()
            )

        /**
         * Swaps the items pointed to by @a and @b. It is allowed for @a and @b
         * to point into difference sequences.
         *
         * @param a a #GSequenceIter
         * @param b a #GSequenceIter
         * @since 2.14
         */
        @GLibVersion2_14
        public fun swap(a: SequenceIter, b: SequenceIter): Unit =
            g_sequence_swap(a.glibSequenceIterPointer, b.glibSequenceIterPointer)
    }
}
