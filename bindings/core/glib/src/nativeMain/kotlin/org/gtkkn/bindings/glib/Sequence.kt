// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_48
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GSequence
import org.gtkkn.native.glib.g_sequence_foreach
import org.gtkkn.native.glib.g_sequence_free
import org.gtkkn.native.glib.g_sequence_get_length
import org.gtkkn.native.glib.g_sequence_is_empty
import org.gtkkn.native.glib.g_sequence_sort
import org.gtkkn.native.glib.g_sequence_sort_iter
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.Unit

/**
 * The #GSequence struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: gpointer
 * - method `get_begin_iter`: Return type SequenceIter is unsupported
 * - method `get_end_iter`: Return type SequenceIter is unsupported
 * - method `get_iter_at_pos`: Return type SequenceIter is unsupported
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `data`: gpointer
 * - parameter `begin`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `src`: SequenceIter
 * - parameter `dest`: SequenceIter
 * - parameter `data_destroy`: DestroyNotify
 * - parameter `begin`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `begin`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `iter`: SequenceIter
 * - parameter `a`: SequenceIter
 */
public class Sequence(pointer: CPointer<GSequence>) : ProxyInstance(pointer) {
    public val glibSequencePointer: CPointer<GSequence> = pointer

    /**
     * Calls @func for each item in the sequence passing @user_data
     * to the function. @func must not modify the sequence itself.
     *
     * @param func the function to call for each item in @seq
     * @since 2.14
     */
    @GLibVersion2_14
    public fun foreach(func: Func): Unit = g_sequence_foreach(
        glibSequencePointer.reinterpret(),
        FuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Frees the memory allocated for @seq. If @seq has a data destroy
     * function associated with it, that function is called on all items
     * in @seq.
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun free(): Unit = g_sequence_free(glibSequencePointer.reinterpret())

    /**
     * Returns the positive length (>= 0) of @seq. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     *
     * @return the length of @seq
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getLength(): gint = g_sequence_get_length(glibSequencePointer.reinterpret())

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
    public fun isEmpty(): Boolean = g_sequence_is_empty(glibSequencePointer.reinterpret()).asBoolean()

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
    public fun sort(cmpFunc: CompareDataFunc): Unit = g_sequence_sort(
        glibSequencePointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(cmpFunc).asCPointer()
    )

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
        glibSequencePointer.reinterpret(),
        SequenceIterCompareFuncFunc.reinterpret(),
        StableRef.create(cmpFunc).asCPointer()
    )
}
