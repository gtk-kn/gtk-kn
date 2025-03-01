// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.bindings.glib.annotations.GLibVersion2_30
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GHashTableIter
import org.gtkkn.native.glib.g_hash_table_iter_get_hash_table
import org.gtkkn.native.glib.g_hash_table_iter_init
import org.gtkkn.native.glib.g_hash_table_iter_remove
import org.gtkkn.native.glib.g_hash_table_iter_replace
import org.gtkkn.native.glib.g_hash_table_iter_steal
import org.gtkkn.native.glib.gpointer
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
 */
public class HashTableIter(public val glibHashTableIterPointer: CPointer<GHashTableIter>) :
    ProxyInstance(glibHashTableIterPointer) {
    /**
     * Allocate a new HashTableIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GHashTableIter>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new HashTableIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GHashTableIter>().ptr)

    /**
     * Returns the #GHashTable associated with @iter.
     *
     * @return the #GHashTable associated with @iter.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun getHashTable(): HashTable = g_hash_table_iter_get_hash_table(glibHashTableIterPointer)!!.run {
        HashTable(this)
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
    @GLibVersion2_16
    public fun `init`(hashTable: HashTable): Unit =
        g_hash_table_iter_init(glibHashTableIterPointer, hashTable.glibHashTablePointer)

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
    @GLibVersion2_16
    public fun remove(): Unit = g_hash_table_iter_remove(glibHashTableIterPointer)

    /**
     * Replaces the value currently pointed to by the iterator
     * from its associated #GHashTable. Can only be called after
     * g_hash_table_iter_next() returned true.
     *
     * If you supplied a @value_destroy_func when creating the
     * #GHashTable, the old value is freed using that function.
     *
     * @param value the value to replace with
     * @since 2.30
     */
    @GLibVersion2_30
    public fun replace(`value`: gpointer? = null): Unit = g_hash_table_iter_replace(glibHashTableIterPointer, `value`)

    /**
     * Removes the key/value pair currently pointed to by the
     * iterator from its associated #GHashTable, without calling
     * the key and value destroy functions. Can only be called
     * after g_hash_table_iter_next() returned true, and cannot
     * be called more than once for the same key/value pair.
     *
     * @since 2.16
     */
    @GLibVersion2_16
    public fun steal(): Unit = g_hash_table_iter_steal(glibHashTableIterPointer)
}
