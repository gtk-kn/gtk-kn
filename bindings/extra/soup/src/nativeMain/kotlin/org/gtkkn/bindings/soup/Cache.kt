// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupCache
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_cache_clear
import org.gtkkn.native.soup.soup_cache_dump
import org.gtkkn.native.soup.soup_cache_flush
import org.gtkkn.native.soup.soup_cache_get_max_size
import org.gtkkn.native.soup.soup_cache_get_type
import org.gtkkn.native.soup.soup_cache_load
import org.gtkkn.native.soup.soup_cache_new
import org.gtkkn.native.soup.soup_cache_set_max_size
import kotlin.String
import kotlin.Unit

/**
 * File-based cache for HTTP resources.
 *
 * ## Skipped during bindings generation
 *
 * - method `cache-dir`: Property has no getter nor setter
 * - method `cache-type`: Property has no getter nor setter
 */
public open class Cache(public val soupCachePointer: CPointer<SoupCache>) :
    Object(soupCachePointer.reinterpret()),
    SessionFeature,
    KGTyped {
    init {
        Soup
    }

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = handle.reinterpret()

    /**
     * Creates a new #SoupCache.
     *
     * @param cacheDir the directory to store the cached data, or null
     *   to use the default one. Note that since the cache isn't safe to access for
     *   multiple processes at once, and the default directory isn't namespaced by
     *   process, clients are strongly discouraged from passing null.
     * @param cacheType the #SoupCacheType of the cache
     * @return a new #SoupCache
     */
    public constructor(
        cacheDir: String? = null,
        cacheType: CacheType,
    ) : this(soup_cache_new(cacheDir, cacheType.nativeValue)!!) {
        InstanceCache.put(this)
    }

    /**
     * Will remove all entries in the @cache plus all the cache files.
     *
     * This is not thread safe and must be called only from the thread that created the #SoupCache
     */
    public open fun clear(): Unit = soup_cache_clear(soupCachePointer)

    /**
     * Synchronously writes the cache index out to disk.
     *
     * Contrast with [method@Cache.flush], which writes pending cache *entries* to
     * disk.
     *
     * You must call this before exiting if you want your cache data to
     * persist between sessions.
     *
     * This is not thread safe and must be called only from the thread that created the #SoupCache
     */
    public open fun dump(): Unit = soup_cache_dump(soupCachePointer)

    /**
     * Forces all pending writes in the @cache to be
     * committed to disk.
     *
     * For doing so it will iterate the [struct@GLib.MainContext] associated with
     * @cache's session as long as needed.
     *
     * Contrast with [method@Cache.dump], which writes out the cache index file.
     */
    public open fun flush(): Unit = soup_cache_flush(soupCachePointer)

    /**
     * Gets the maximum size of the cache.
     *
     * @return the maximum size of the cache, in bytes.
     */
    public open fun getMaxSize(): guint = soup_cache_get_max_size(soupCachePointer)

    /**
     * Loads the contents of @cache's index into memory.
     *
     * This is not thread safe and must be called only from the thread that created the #SoupCache
     */
    public open fun load(): Unit = soup_cache_load(soupCachePointer)

    /**
     * Sets the maximum size of the cache.
     *
     * @param maxSize the maximum size of the cache, in bytes
     */
    public open fun setMaxSize(maxSize: guint): Unit = soup_cache_set_max_size(soupCachePointer, maxSize)

    public companion object : TypeCompanion<Cache> {
        override val type: GeneratedClassKGType<Cache> =
            GeneratedClassKGType(getTypeOrNull()!!) { Cache(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of Cache
         *
         * @return the GType
         */
        public fun getType(): GType = soup_cache_get_type()

        /**
         * Gets the GType of from the symbol `soup_cache_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("soup_cache_get_type")
    }
}
