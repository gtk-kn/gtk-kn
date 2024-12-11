// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gobject.guint64
import org.gtkkn.native.gtk.GtkBitset
import org.gtkkn.native.gtk.gtk_bitset_add
import org.gtkkn.native.gtk.gtk_bitset_add_range
import org.gtkkn.native.gtk.gtk_bitset_add_range_closed
import org.gtkkn.native.gtk.gtk_bitset_add_rectangle
import org.gtkkn.native.gtk.gtk_bitset_contains
import org.gtkkn.native.gtk.gtk_bitset_copy
import org.gtkkn.native.gtk.gtk_bitset_difference
import org.gtkkn.native.gtk.gtk_bitset_equals
import org.gtkkn.native.gtk.gtk_bitset_get_maximum
import org.gtkkn.native.gtk.gtk_bitset_get_minimum
import org.gtkkn.native.gtk.gtk_bitset_get_nth
import org.gtkkn.native.gtk.gtk_bitset_get_size
import org.gtkkn.native.gtk.gtk_bitset_get_size_in_range
import org.gtkkn.native.gtk.gtk_bitset_get_type
import org.gtkkn.native.gtk.gtk_bitset_intersect
import org.gtkkn.native.gtk.gtk_bitset_is_empty
import org.gtkkn.native.gtk.gtk_bitset_new_empty
import org.gtkkn.native.gtk.gtk_bitset_new_range
import org.gtkkn.native.gtk.gtk_bitset_ref
import org.gtkkn.native.gtk.gtk_bitset_remove
import org.gtkkn.native.gtk.gtk_bitset_remove_all
import org.gtkkn.native.gtk.gtk_bitset_remove_range
import org.gtkkn.native.gtk.gtk_bitset_remove_range_closed
import org.gtkkn.native.gtk.gtk_bitset_remove_rectangle
import org.gtkkn.native.gtk.gtk_bitset_shift_left
import org.gtkkn.native.gtk.gtk_bitset_shift_right
import org.gtkkn.native.gtk.gtk_bitset_splice
import org.gtkkn.native.gtk.gtk_bitset_subtract
import org.gtkkn.native.gtk.gtk_bitset_union
import org.gtkkn.native.gtk.gtk_bitset_unref
import kotlin.Boolean
import kotlin.Unit

/**
 * A `GtkBitset` represents a set of unsigned integers.
 *
 * Another name for this data structure is "bitmap".
 *
 * The current implementation is based on [roaring bitmaps](https://roaringbitmap.org/).
 *
 * A bitset allows adding a set of integers and provides support for set operations
 * like unions, intersections and checks for equality or if a value is contained
 * in the set. `GtkBitset` also contains various functions to query metadata about
 * the bitset, such as the minimum or maximum values or its size.
 *
 * The fastest way to iterate values in a bitset is [struct@Gtk.BitsetIter].
 *
 * The main use case for `GtkBitset` is implementing complex selections for
 * [iface@Gtk.SelectionModel].
 */
public class Bitset(pointer: CPointer<GtkBitset>) : ProxyInstance(pointer) {
    public val gtkBitsetPointer: CPointer<GtkBitset> = pointer

    /**
     * Adds @value to @self if it wasn't part of it before.
     *
     * @param value value to add
     * @return true if @value was not part of @self and @self
     *   was changed
     */
    public fun add(`value`: guint): Boolean = gtk_bitset_add(gtkBitsetPointer.reinterpret(), `value`).asBoolean()

    /**
     * Adds all values from @start (inclusive) to @start + @n_items
     * (exclusive) in @self.
     *
     * @param start first value to add
     * @param nItems number of consecutive values to add
     */
    public fun addRange(start: guint, nItems: guint): Unit =
        gtk_bitset_add_range(gtkBitsetPointer.reinterpret(), start, nItems)

    /**
     * Adds the closed range [@first, @last], so @first, @last and all
     * values in between. @first must be smaller than @last.
     *
     * @param first first value to add
     * @param last last value to add
     */
    public fun addRangeClosed(first: guint, last: guint): Unit =
        gtk_bitset_add_range_closed(gtkBitsetPointer.reinterpret(), first, last)

    /**
     * Interprets the values as a 2-dimensional boolean grid with the given @stride
     * and inside that grid, adds a rectangle with the given @width and @height.
     *
     * @param start first value to add
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @param stride row stride of the grid
     */
    public fun addRectangle(start: guint, width: guint, height: guint, stride: guint): Unit =
        gtk_bitset_add_rectangle(gtkBitsetPointer.reinterpret(), start, width, height, stride)

    /**
     * Checks if the given @value has been added to @self
     *
     * @param value the value to check
     * @return true if @self contains @value
     */
    public fun contains(`value`: guint): Boolean =
        gtk_bitset_contains(gtkBitsetPointer.reinterpret(), `value`).asBoolean()

    /**
     * Creates a copy of @self.
     *
     * @return A new bitset that contains the same
     *   values as @self
     */
    public fun copy(): Bitset = gtk_bitset_copy(gtkBitsetPointer.reinterpret())!!.run {
        Bitset(reinterpret())
    }

    /**
     * Sets @self to be the symmetric difference of @self and @other.
     *
     * The symmetric difference is set @self to contain all values that
     * were either contained in @self or in @other, but not in both.
     * This operation is also called an XOR.
     *
     * It is allowed for @self and @other to be the same bitset. The bitset
     * will be emptied in that case.
     *
     * @param other the `GtkBitset` to compute the difference from
     */
    public fun difference(other: Bitset): Unit =
        gtk_bitset_difference(gtkBitsetPointer.reinterpret(), other.gtkBitsetPointer.reinterpret())

    /**
     * Returns true if @self and @other contain the same values.
     *
     * @param other another `GtkBitset`
     * @return true if @self and @other contain the same values
     */
    public fun equals(other: Bitset): Boolean =
        gtk_bitset_equals(gtkBitsetPointer.reinterpret(), other.gtkBitsetPointer.reinterpret()).asBoolean()

    /**
     * Returns the largest value in @self.
     *
     * If @self is empty, 0 is returned.
     *
     * @return The largest value in @self
     */
    public fun getMaximum(): guint = gtk_bitset_get_maximum(gtkBitsetPointer.reinterpret())

    /**
     * Returns the smallest value in @self.
     *
     * If @self is empty, `G_MAXUINT` is returned.
     *
     * @return The smallest value in @self
     */
    public fun getMinimum(): guint = gtk_bitset_get_minimum(gtkBitsetPointer.reinterpret())

    /**
     * Returns the value of the @nth item in self.
     *
     * If @nth is >= the size of @self, 0 is returned.
     *
     * @param nth index of the item to get
     * @return the value of the @nth item in @self
     */
    public fun getNth(nth: guint): guint = gtk_bitset_get_nth(gtkBitsetPointer.reinterpret(), nth)

    /**
     * Gets the number of values that were added to the set.
     *
     * For example, if the set is empty, 0 is returned.
     *
     * Note that this function returns a `guint64`, because when all
     * values are set, the return value is `G_MAXUINT + 1`. Unless you
     * are sure this cannot happen (it can't with `GListModel`), be sure
     * to use a 64bit type.
     *
     * @return The number of values in the set.
     */
    public fun getSize(): guint64 = gtk_bitset_get_size(gtkBitsetPointer.reinterpret())

    /**
     * Gets the number of values that are part of the set from @first to @last
     * (inclusive).
     *
     * Note that this function returns a `guint64`, because when all values are
     * set, the return value is `G_MAXUINT + 1`. Unless you are sure this cannot
     * happen (it can't with `GListModel`), be sure to use a 64bit type.
     *
     * @param first the first element to include
     * @param last the last element to include
     * @return The number of values in the set from @first to @last.
     */
    public fun getSizeInRange(first: guint, last: guint): guint64 =
        gtk_bitset_get_size_in_range(gtkBitsetPointer.reinterpret(), first, last)

    /**
     * Sets @self to be the intersection of @self and @other.
     *
     * In other words, remove all values from @self that are not part of @other.
     *
     * It is allowed for @self and @other to be the same bitset. Nothing will
     * happen in that case.
     *
     * @param other the `GtkBitset` to intersect with
     */
    public fun intersect(other: Bitset): Unit =
        gtk_bitset_intersect(gtkBitsetPointer.reinterpret(), other.gtkBitsetPointer.reinterpret())

    /**
     * Check if no value is contained in bitset.
     *
     * @return true if @self is empty
     */
    public fun isEmpty(): Boolean = gtk_bitset_is_empty(gtkBitsetPointer.reinterpret()).asBoolean()

    /**
     * Acquires a reference on the given `GtkBitset`.
     *
     * @return the `GtkBitset` with an additional reference
     */
    public fun ref(): Bitset = gtk_bitset_ref(gtkBitsetPointer.reinterpret())!!.run {
        Bitset(reinterpret())
    }

    /**
     * Removes @value from @self if it was part of it before.
     *
     * @param value value to remove
     * @return true if @value was part of @self and @self
     *   was changed
     */
    public fun remove(`value`: guint): Boolean = gtk_bitset_remove(gtkBitsetPointer.reinterpret(), `value`).asBoolean()

    /**
     * Removes all values from the bitset so that it is empty again.
     */
    public fun removeAll(): Unit = gtk_bitset_remove_all(gtkBitsetPointer.reinterpret())

    /**
     * Removes all values from @start (inclusive) to @start + @n_items (exclusive)
     * in @self.
     *
     * @param start first value to remove
     * @param nItems number of consecutive values to remove
     */
    public fun removeRange(start: guint, nItems: guint): Unit =
        gtk_bitset_remove_range(gtkBitsetPointer.reinterpret(), start, nItems)

    /**
     * Removes the closed range [@first, @last], so @first, @last and all
     * values in between. @first must be smaller than @last.
     *
     * @param first first value to remove
     * @param last last value to remove
     */
    public fun removeRangeClosed(first: guint, last: guint): Unit =
        gtk_bitset_remove_range_closed(gtkBitsetPointer.reinterpret(), first, last)

    /**
     * Interprets the values as a 2-dimensional boolean grid with the given @stride
     * and inside that grid, removes a rectangle with the given @width and @height.
     *
     * @param start first value to remove
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @param stride row stride of the grid
     */
    public fun removeRectangle(start: guint, width: guint, height: guint, stride: guint): Unit =
        gtk_bitset_remove_rectangle(gtkBitsetPointer.reinterpret(), start, width, height, stride)

    /**
     * Shifts all values in @self to the left by @amount.
     *
     * Values smaller than @amount are discarded.
     *
     * @param amount amount to shift all values to the left
     */
    public fun shiftLeft(amount: guint): Unit = gtk_bitset_shift_left(gtkBitsetPointer.reinterpret(), amount)

    /**
     * Shifts all values in @self to the right by @amount.
     *
     * Values that end up too large to be held in a #guint are discarded.
     *
     * @param amount amount to shift all values to the right
     */
    public fun shiftRight(amount: guint): Unit = gtk_bitset_shift_right(gtkBitsetPointer.reinterpret(), amount)

    /**
     * This is a support function for `GListModel` handling, by mirroring
     * the `GlistModel::items-changed` signal.
     *
     * First, it "cuts" the values from @position to @removed from
     * the bitset. That is, it removes all those values and shifts
     * all larger values to the left by @removed places.
     *
     * Then, it "pastes" new room into the bitset by shifting all values
     * larger than @position by @added spaces to the right. This frees
     * up space that can then be filled.
     *
     * @param position position at which to slice
     * @param removed number of values to remove
     * @param added number of values to add
     */
    public fun splice(position: guint, removed: guint, added: guint): Unit =
        gtk_bitset_splice(gtkBitsetPointer.reinterpret(), position, removed, added)

    /**
     * Sets @self to be the subtraction of @other from @self.
     *
     * In other words, remove all values from @self that are part of @other.
     *
     * It is allowed for @self and @other to be the same bitset. The bitset
     * will be emptied in that case.
     *
     * @param other the `GtkBitset` to subtract
     */
    public fun subtract(other: Bitset): Unit =
        gtk_bitset_subtract(gtkBitsetPointer.reinterpret(), other.gtkBitsetPointer.reinterpret())

    /**
     * Sets @self to be the union of @self and @other.
     *
     * That is, add all values from @other into @self that weren't part of it.
     *
     * It is allowed for @self and @other to be the same bitset. Nothing will
     * happen in that case.
     *
     * @param other the `GtkBitset` to union with
     */
    public fun union(other: Bitset): Unit =
        gtk_bitset_union(gtkBitsetPointer.reinterpret(), other.gtkBitsetPointer.reinterpret())

    /**
     * Releases a reference on the given `GtkBitset`.
     *
     * If the reference was the last, the resources associated to the @self are
     * freed.
     */
    public fun unref(): Unit = gtk_bitset_unref(gtkBitsetPointer.reinterpret())

    public companion object {
        /**
         * Creates a new empty bitset.
         *
         * @return A new empty bitset
         */
        public fun newEmpty(): Bitset = Bitset(gtk_bitset_new_empty()!!.reinterpret())

        /**
         * Creates a bitset with the given range set.
         *
         * @param start first value to add
         * @param nItems number of consecutive values to add
         * @return A new bitset
         */
        public fun newRange(start: guint, nItems: guint): Bitset =
            Bitset(gtk_bitset_new_range(start, nItems)!!.reinterpret())

        /**
         * Get the GType of Bitset
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_bitset_get_type()
    }
}
