// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GBytes
import org.gtkkn.native.glib.g_bytes_get_size
import org.gtkkn.native.glib.g_bytes_hash
import org.gtkkn.native.glib.g_bytes_new_from_bytes
import org.gtkkn.native.glib.g_bytes_ref
import org.gtkkn.native.glib.g_bytes_unref
import kotlin.UInt
import kotlin.ULong
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
 * - parameter `bytes2`: Bytes
 * - parameter `bytes2`: Bytes
 * - parameter `size`: size: Out parameter is not supported
 * - method `get_region`: Return type gpointer is unsupported
 * - method `unref_to_array`: Array parameter of type guint8 is not supported
 * - parameter `size`: size: Out parameter is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 *
 * @since 2.32
 */
public class Bytes(
    pointer: CPointer<GBytes>,
) : Record {
    public val glibBytesPointer: CPointer<GBytes> = pointer

    /**
     * Get the size of the byte data in the #GBytes.
     *
     * This function will always return the same value for a given #GBytes.
     *
     * @return the size
     * @since 2.32
     */
    public fun getSize(): ULong = g_bytes_get_size(glibBytesPointer.reinterpret())

    /**
     * Creates an integer hash code for the byte data in the #GBytes.
     *
     * This function can be passed to g_hash_table_new() as the @key_hash_func
     * parameter, when using non-null #GBytes pointers as keys in a #GHashTable.
     *
     * @return a hash value corresponding to the key.
     * @since 2.32
     */
    public fun hash(): UInt = g_bytes_hash(glibBytesPointer.reinterpret())

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
    public fun newFromBytes(
        offset: ULong,
        length: ULong,
    ): Bytes =
        g_bytes_new_from_bytes(glibBytesPointer.reinterpret(), offset, length)!!.run {
            Bytes(reinterpret())
        }

    /**
     * Increase the reference count on @bytes.
     *
     * @return the #GBytes
     * @since 2.32
     */
    public fun ref(): Bytes =
        g_bytes_ref(glibBytesPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Releases a reference on @bytes.  This may result in the bytes being
     * freed. If @bytes is null, it will return immediately.
     *
     * @since 2.32
     */
    public fun unref(): Unit = g_bytes_unref(glibBytesPointer.reinterpret())

    public companion object : RecordCompanion<Bytes, GBytes> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Bytes = Bytes(pointer.reinterpret())
    }
}
