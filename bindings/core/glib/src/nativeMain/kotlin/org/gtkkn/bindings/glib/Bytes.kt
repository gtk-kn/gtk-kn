// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.bindings.glib.annotations.GLibVersion2_70
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GBytes
import org.gtkkn.native.glib.g_bytes_compare
import org.gtkkn.native.glib.g_bytes_equal
import org.gtkkn.native.glib.g_bytes_get_region
import org.gtkkn.native.glib.g_bytes_get_size
import org.gtkkn.native.glib.g_bytes_hash
import org.gtkkn.native.glib.g_bytes_new_from_bytes
import org.gtkkn.native.glib.g_bytes_ref
import org.gtkkn.native.glib.g_bytes_unref
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_bytes_get_type
import kotlin.Boolean
import kotlin.Unit

/**
 * A simple refcounted data type representing an immutable sequence of zero or
 * more bytes from an unspecified origin.
 *
 * The purpose of a #GBytes is to keep the memory region that it holds
 * alive for as long as anyone holds a reference to the bytes.  When
 * the last reference count is dropped, the memory is released. Multiple
 * unrelated callers can use byte data in the #GBytes without coordinating
 * their activities, resting assured that the byte data will not change or
 * move while they hold a reference.
 *
 * A #GBytes can come from many different origins that may have
 * different procedures for freeing the memory region.  Examples are
 * memory from g_malloc(), from memory slices, from a #GMappedFile or
 * memory from other allocators.
 *
 * #GBytes work well as keys in #GHashTable. Use g_bytes_equal() and
 * g_bytes_hash() as parameters to g_hash_table_new() or g_hash_table_new_full().
 * #GBytes can also be used as keys in a #GTree by passing the g_bytes_compare()
 * function to g_tree_new().
 *
 * The data pointed to by this bytes must not be modified. For a mutable
 * array of bytes see #GByteArray. Use g_bytes_unref_to_array() to create a
 * mutable array for a #GBytes sequence. To create an immutable #GBytes from
 * a mutable #GByteArray, use the g_byte_array_free_to_bytes() function.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `size`: size: Out parameter is not supported
 * - method `unref_to_array`: GLib.ByteArray parameter of type guint8 is not supported
 * - parameter `size`: size: Out parameter is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 *
 * @since 2.32
 */
@GLibVersion2_32
public class Bytes(pointer: CPointer<GBytes>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GBytes> = pointer

    /**
     * Compares the two #GBytes values.
     *
     * This function can be used to sort GBytes instances in lexicographical order.
     *
     * If @bytes1 and @bytes2 have different length but the shorter one is a
     * prefix of the longer one then the shorter one is considered to be less than
     * the longer one. Otherwise the first byte where both differ is used for
     * comparison. If @bytes1 has a smaller value at that position it is
     * considered less, otherwise greater than @bytes2.
     *
     * @param bytes2 a pointer to a #GBytes to compare with @bytes1
     * @return a negative value if @bytes1 is less than @bytes2, a positive value
     *          if @bytes1 is greater than @bytes2, and zero if @bytes1 is equal to
     *          @bytes2
     * @since 2.32
     */
    @GLibVersion2_32
    public fun compare(bytes2: Bytes): gint = g_bytes_compare(gPointer, bytes2.gPointer)

    /**
     * Compares the two #GBytes values being pointed to and returns
     * true if they are equal.
     *
     * This function can be passed to g_hash_table_new() as the @key_equal_func
     * parameter, when using non-null #GBytes pointers as keys in a #GHashTable.
     *
     * @param bytes2 a pointer to a #GBytes to compare with @bytes1
     * @return true if the two keys match.
     * @since 2.32
     */
    @GLibVersion2_32
    public fun equal(bytes2: Bytes): Boolean = g_bytes_equal(gPointer, bytes2.gPointer).asBoolean()

    /**
     * Gets a pointer to a region in @bytes.
     *
     * The region starts at @offset many bytes from the start of the data
     * and contains @n_elements many elements of @element_size size.
     *
     * @n_elements may be zero, but @element_size must always be non-zero.
     * Ideally, @element_size is a static constant (eg: sizeof a struct).
     *
     * This function does careful bounds checking (including checking for
     * arithmetic overflows) and returns a non-null pointer if the
     * specified region lies entirely within the @bytes. If the region is
     * in some way out of range, or if an overflow has occurred, then null
     * is returned.
     *
     * Note: it is possible to have a valid zero-size region. In this case,
     * the returned pointer will be equal to the base pointer of the data of
     * @bytes, plus @offset.  This will be non-null except for the case
     * where @bytes itself was a zero-sized region.  Since it is unlikely
     * that you will be using this function to check for a zero-sized region
     * in a zero-sized @bytes, null effectively always means "error".
     *
     * @param elementSize a non-zero element size
     * @param offset an offset to the start of the region within the @bytes
     * @param nElements the number of elements in the region
     * @return the requested region, or null in case of an error
     * @since 2.70
     */
    @GLibVersion2_70
    public fun getRegion(elementSize: gsize, offset: gsize, nElements: gsize): gpointer? =
        g_bytes_get_region(gPointer, elementSize, offset, nElements)

    /**
     * Get the size of the byte data in the #GBytes.
     *
     * This function will always return the same value for a given #GBytes.
     *
     * @return the size
     * @since 2.32
     */
    @GLibVersion2_32
    public fun getSize(): gsize = g_bytes_get_size(gPointer)

    /**
     * Creates an integer hash code for the byte data in the #GBytes.
     *
     * This function can be passed to g_hash_table_new() as the @key_hash_func
     * parameter, when using non-null #GBytes pointers as keys in a #GHashTable.
     *
     * @return a hash value corresponding to the key.
     * @since 2.32
     */
    @GLibVersion2_32
    public fun hash(): guint = g_bytes_hash(gPointer)

    /**
     * Creates a #GBytes which is a subsection of another #GBytes. The @offset +
     * @length may not be longer than the size of @bytes.
     *
     * A reference to @bytes will be held by the newly created #GBytes until
     * the byte data is no longer needed.
     *
     * Since 2.56, if @offset is 0 and @length matches the size of @bytes, then
     * @bytes will be returned with the reference count incremented by 1. If @bytes
     * is a slice of another #GBytes, then the resulting #GBytes will reference
     * the same #GBytes instead of @bytes. This allows consumers to simplify the
     * usage of #GBytes when asynchronously writing to streams.
     *
     * @param offset offset which subsection starts at
     * @param length length of subsection
     * @return a new #GBytes
     * @since 2.32
     */
    @GLibVersion2_32
    public fun newFromBytes(offset: gsize, length: gsize): Bytes =
        g_bytes_new_from_bytes(gPointer, offset, length)!!.run {
            Bytes(this)
        }

    /**
     * Increase the reference count on @bytes.
     *
     * @return the #GBytes
     * @since 2.32
     */
    @GLibVersion2_32
    public fun ref(): Bytes = g_bytes_ref(gPointer)!!.run {
        Bytes(this)
    }

    /**
     * Releases a reference on @bytes.  This may result in the bytes being
     * freed. If @bytes is null, it will return immediately.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun unref(): Unit = g_bytes_unref(gPointer)

    public companion object {
        /**
         * Get the GType of Bytes
         *
         * @return the GType
         */
        public fun getType(): GType = g_bytes_get_type()
    }
}
