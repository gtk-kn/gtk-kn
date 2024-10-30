// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.CompareDataFunc
import org.gtkkn.bindings.glib.CompareDataFuncFunc
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GValueArray
import org.gtkkn.native.gobject.g_value_array_append
import org.gtkkn.native.gobject.g_value_array_copy
import org.gtkkn.native.gobject.g_value_array_get_nth
import org.gtkkn.native.gobject.g_value_array_insert
import org.gtkkn.native.gobject.g_value_array_new
import org.gtkkn.native.gobject.g_value_array_prepend
import org.gtkkn.native.gobject.g_value_array_remove
import org.gtkkn.native.gobject.g_value_array_sort_with_data
import kotlin.UInt

/**
 * A `GValueArray` is a container structure to hold an array of generic values.
 *
 * The prime purpose of a `GValueArray` is for it to be used as an
 * object property that holds an array of values. A `GValueArray` wraps
 * an array of `GValue` elements in order for it to be used as a boxed
 * type through `G_TYPE_VALUE_ARRAY`.
 *
 * `GValueArray` is deprecated in favour of `GArray` since GLib 2.32.
 * It is possible to create a `GArray` that behaves like a `GValueArray`
 * by using the size of `GValue` as the element size, and by setting
 * [method@GObject.Value.unset] as the clear function using
 * [func@GLib.Array.set_clear_func], for instance, the following code:
 *
 * ```c
 *   GValueArray *array = g_value_array_new (10);
 * ```
 *
 * can be replaced by:
 *
 * ```c
 *   GArray *array = g_array_sized_new (FALSE, TRUE, sizeof (GValue), 10);
 *   g_array_set_clear_func (array, (GDestroyNotify) g_value_unset);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `sort`: g_value_array_sort is shadowedBy sort_with_data
 * - field `n_prealloced`: Record field n_prealloced is private
 */
public class ValueArray(
    pointer: CPointer<GValueArray>,
) : Record {
    public val gobjectValueArrayPointer: CPointer<GValueArray> = pointer

    /**
     * number of values contained in the array
     */
    public var nValues: UInt
        get() = gobjectValueArrayPointer.pointed.n_values
        set(`value`) {
            gobjectValueArrayPointer.pointed.n_values = value
        }

    /**
     * array of values
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val values: Value?
        get() =
            gobjectValueArrayPointer.pointed.values?.run {
                Value(reinterpret())
            }

    /**
     * Insert a copy of @value as last element of @value_array. If @value is
     * null, an uninitialized value is appended.
     *
     * @param value #GValue to copy into #GValueArray, or null
     * @return the #GValueArray passed in as @value_array
     */
    public fun append(`value`: Value? = null): ValueArray =
        g_value_array_append(gobjectValueArrayPointer.reinterpret(), `value`?.gobjectValuePointer)!!.run {
            ValueArray(reinterpret())
        }

    /**
     * Construct an exact copy of a #GValueArray by duplicating all its
     * contents.
     *
     * @return Newly allocated copy of #GValueArray
     */
    public fun copy(): ValueArray =
        g_value_array_copy(gobjectValueArrayPointer.reinterpret())!!.run {
            ValueArray(reinterpret())
        }

    /**
     * Return a pointer to the value at @index_ containd in @value_array.
     *
     * @param index index of the value of interest
     * @return pointer to a value at @index_ in @value_array
     */
    public fun getNth(index: UInt): Value =
        g_value_array_get_nth(gobjectValueArrayPointer.reinterpret(), index)!!.run {
            Value(reinterpret())
        }

    /**
     * Insert a copy of @value at specified position into @value_array. If @value
     * is null, an uninitialized value is inserted.
     *
     * @param index insertion position, must be <= value_array->;n_values
     * @param value #GValue to copy into #GValueArray, or null
     * @return the #GValueArray passed in as @value_array
     */
    public fun insert(
        index: UInt,
        `value`: Value? = null,
    ): ValueArray =
        g_value_array_insert(gobjectValueArrayPointer.reinterpret(), index, `value`?.gobjectValuePointer)!!.run {
            ValueArray(reinterpret())
        }

    /**
     * Insert a copy of @value as first element of @value_array. If @value is
     * null, an uninitialized value is prepended.
     *
     * @param value #GValue to copy into #GValueArray, or null
     * @return the #GValueArray passed in as @value_array
     */
    public fun prepend(`value`: Value? = null): ValueArray =
        g_value_array_prepend(gobjectValueArrayPointer.reinterpret(), `value`?.gobjectValuePointer)!!.run {
            ValueArray(reinterpret())
        }

    /**
     * Remove the value at position @index_ from @value_array.
     *
     * @param index position of value to remove, which must be less than
     *     @value_array->n_values
     * @return the #GValueArray passed in as @value_array
     */
    public fun remove(index: UInt): ValueArray =
        g_value_array_remove(gobjectValueArrayPointer.reinterpret(), index)!!.run {
            ValueArray(reinterpret())
        }

    /**
     * Sort @value_array using @compare_func to compare the elements according
     * to the semantics of #GCompareDataFunc.
     *
     * The current implementation uses the same sorting algorithm as standard
     * C qsort() function.
     *
     * @param compareFunc function to compare elements
     * @return the #GValueArray passed in as @value_array
     */
    public fun sort(compareFunc: CompareDataFunc): ValueArray =
        g_value_array_sort_with_data(
            gobjectValueArrayPointer.reinterpret(),
            CompareDataFuncFunc.reinterpret(),
            StableRef.create(compareFunc).asCPointer()
        )!!.run {
            ValueArray(reinterpret())
        }

    public companion object : RecordCompanion<ValueArray, GValueArray> {
        /**
         * Allocate and initialize a new #GValueArray, optionally preserve space
         * for @n_prealloced elements. New arrays always contain 0 elements,
         * regardless of the value of @n_prealloced.
         *
         * @param nPrealloced number of values to preallocate space for
         * @return a newly allocated #GValueArray with 0 values
         */
        public fun new(nPrealloced: UInt): ValueArray = ValueArray(g_value_array_new(nPrealloced)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ValueArray = ValueArray(pointer.reinterpret())
    }
}
