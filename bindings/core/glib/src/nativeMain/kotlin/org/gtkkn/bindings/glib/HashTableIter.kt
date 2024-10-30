// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GHashTableIter
import org.gtkkn.native.glib.g_hash_table_iter_get_hash_table
import org.gtkkn.native.glib.g_hash_table_iter_init
import org.gtkkn.native.glib.g_hash_table_iter_remove
import org.gtkkn.native.glib.g_hash_table_iter_steal
import kotlin.Unit

/**
 * A GHashTableIter structure represents an iterator that can be used
 * to iterate over the elements of a #GHashTable. GHashTableIter
 * structures are typically allocated on the stack and then initialized
 * with g_hash_table_iter_init().
 *
 * The iteration order of a #GHashTableIter over the keys/values in a hash
 * table is not defined.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `key`: key: Out parameter is not supported
 * - parameter `value`: gpointer
 * - field `dummy1`: Record field dummy1 is private
 * - field `dummy2`: Record field dummy2 is private
 * - field `dummy3`: Record field dummy3 is private
 * - field `dummy4`: Record field dummy4 is private
 * - field `dummy5`: Record field dummy5 is private
 * - field `dummy6`: Record field dummy6 is private
 */
public class HashTableIter(
    pointer: CPointer<GHashTableIter>,
) : Record {
    public val glibHashTableIterPointer: CPointer<GHashTableIter> = pointer

    /**
     * Returns the #GHashTable associated with @iter.
     *
     * @return the #GHashTable associated with @iter.
     * @since 2.16
     */
    public fun getHashTable(): HashTable =
        g_hash_table_iter_get_hash_table(glibHashTableIterPointer.reinterpret())!!.run {
            HashTable(reinterpret())
        }

    /**
     * Initializes a key/value pair iterator and associates it with
     * @hash_table. Modifying the hash table after calling this function
     * invalidates the returned iterator.
     *
     * The iteration order of a #GHashTableIter over the keys/values in a hash
     * table is not defined.
     *
     * |[<!-- language="C" -->
     * GHashTableIter iter;
     * gpointer key, value;
     *
     * g_hash_table_iter_init (&iter, hash_table);
     * while (g_hash_table_iter_next (&iter, &key, &value))
     *   {
     *     // do something with key and value
     *   }
     * ]|
     *
     * @param hashTable a #GHashTable
     * @since 2.16
     */
    public fun `init`(hashTable: HashTable): Unit =
        g_hash_table_iter_init(glibHashTableIterPointer.reinterpret(), hashTable.glibHashTablePointer)

    /**
     * Removes the key/value pair currently pointed to by the iterator
     * from its associated #GHashTable. Can only be called after
     * g_hash_table_iter_next() returned true, and cannot be called
     * more than once for the same key/value pair.
     *
     * If the #GHashTable was created using g_hash_table_new_full(),
     * the key and value are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     *
     * It is safe to continue iterating the #GHashTable afterward:
     * |[<!-- language="C" -->
     * while (g_hash_table_iter_next (&iter, &key, &value))
     *   {
     *     if (condition)
     *       g_hash_table_iter_remove (&iter);
     *   }
     * ]|
     *
     * @since 2.16
     */
    public fun remove(): Unit = g_hash_table_iter_remove(glibHashTableIterPointer.reinterpret())

    /**
     * Removes the key/value pair currently pointed to by the
     * iterator from its associated #GHashTable, without calling
     * the key and value destroy functions. Can only be called
     * after g_hash_table_iter_next() returned true, and cannot
     * be called more than once for the same key/value pair.
     *
     * @since 2.16
     */
    public fun steal(): Unit = g_hash_table_iter_steal(glibHashTableIterPointer.reinterpret())

    public companion object : RecordCompanion<HashTableIter, GHashTableIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): HashTableIter =
            HashTableIter(pointer.reinterpret())
    }
}
