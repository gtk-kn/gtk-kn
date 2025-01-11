// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GCache
import org.gtkkn.native.glib.g_cache_destroy
import org.gtkkn.native.glib.g_cache_insert
import org.gtkkn.native.glib.g_cache_key_foreach
import org.gtkkn.native.glib.g_cache_remove
import org.gtkkn.native.glib.g_cache_value_foreach
import org.gtkkn.native.glib.gpointer
import kotlin.Unit

/**
 * A `GCache` allows sharing of complex data structures, in order to
 * save system resources.
 *
 * `GCache` uses keys and values. A `GCache` key describes the properties
 * of a particular resource. A `GCache` value is the actual resource.
 *
 * `GCache` has been marked as deprecated, since this API is rarely
 * used and not very actively maintained.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `value_new_func`: CacheNewFunc
 */
public class Cache(public val glibCachePointer: CPointer<GCache>) : ProxyInstance(glibCachePointer) {
    /**
     * Frees the memory allocated for the #GCache.
     *
     * Note that it does not destroy the keys and values which were
     * contained in the #GCache.
     */
    public fun destroy(): Unit = g_cache_destroy(glibCachePointer)

    /**
     * Gets the value corresponding to the given key, creating it if
     * necessary. It first checks if the value already exists in the
     * #GCache, by using the @key_equal_func function passed to
     * g_cache_new(). If it does already exist it is returned, and its
     * reference count is increased by one. If the value does not currently
     * exist, if is created by calling the @value_new_func. The key is
     * duplicated by calling @key_dup_func and the duplicated key and value
     * are inserted into the #GCache.
     *
     * @param key a key describing a #GCache object
     * @return a pointer to a #GCache value
     */
    public fun insert(key: gpointer? = null): gpointer? = g_cache_insert(glibCachePointer, key)

    /**
     * Calls the given function for each of the keys in the #GCache.
     *
     * NOTE @func is passed three parameters, the value and key of a cache
     * entry and the @user_data. The order of value and key is different
     * from the order in which g_hash_table_foreach() passes key-value
     * pairs to its callback function !
     *
     * @param func the function to call with each #GCache key
     */
    public fun keyForeach(func: HFunc): Unit =
        g_cache_key_foreach(glibCachePointer, HFuncFunc.reinterpret(), StableRef.create(func).asCPointer())

    /**
     * Decreases the reference count of the given value. If it drops to 0
     * then the value and its corresponding key are destroyed, using the
     * @value_destroy_func and @key_destroy_func passed to g_cache_new().
     *
     * @param value the value to remove
     */
    public fun remove(`value`: gpointer? = null): Unit = g_cache_remove(glibCachePointer, `value`)

    /**
     * Calls the given function for each of the values in the #GCache.
     *
     * @param func the function to call with each #GCache value
     */
    public fun valueForeach(func: HFunc): Unit =
        g_cache_value_foreach(glibCachePointer, HFuncFunc.reinterpret(), StableRef.create(func).asCPointer())
}
