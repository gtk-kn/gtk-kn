// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GCache
import org.gtkkn.native.glib.g_cache_destroy
import org.gtkkn.native.glib.g_cache_key_foreach
import org.gtkkn.native.glib.g_cache_value_foreach
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
 * - parameter `key`: gpointer
 * - parameter `value`: gpointer
 * - parameter `value_new_func`: CacheNewFunc
 */
public class Cache(pointer: CPointer<GCache>) : ProxyInstance(pointer) {
    public val glibCachePointer: CPointer<GCache> = pointer

    /**
     * Frees the memory allocated for the #GCache.
     *
     * Note that it does not destroy the keys and values which were
     * contained in the #GCache.
     */
    public fun destroy(): Unit = g_cache_destroy(glibCachePointer.reinterpret())

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
    public fun keyForeach(func: HFunc): Unit = g_cache_key_foreach(
        glibCachePointer.reinterpret(),
        HFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Calls the given function for each of the values in the #GCache.
     *
     * @param func the function to call with each #GCache value
     */
    public fun valueForeach(func: HFunc): Unit = g_cache_value_foreach(
        glibCachePointer.reinterpret(),
        HFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )
}
