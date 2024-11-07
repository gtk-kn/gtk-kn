// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
import kotlin.UInt
import kotlin.Unit

/**
 * File-based cache for HTTP resources.
 *
 * ## Skipped during bindings generation
 *
 * - method `cache-dir`: Property has no getter nor setter
 * - method `cache-type`: Property has no getter nor setter
 */
public open class Cache(
    pointer: CPointer<SoupCache>,
) : Object(pointer.reinterpret()),
    SessionFeature,
    KGTyped {
    public val soupCachePointer: CPointer<SoupCache>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

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
    ) : this(soup_cache_new(cacheDir, cacheType.nativeValue)!!.reinterpret())

    /**
     * Will remove all entries in the @cache plus all the cache files.
     *
     * This is not thread safe and must be called only from the thread that created the #SoupCache
     */
    public open fun clear(): Unit = soup_cache_clear(soupCachePointer.reinterpret())

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
    public open fun dump(): Unit = soup_cache_dump(soupCachePointer.reinterpret())

    /**
     * Forces all pending writes in the @cache to be
     * committed to disk.
     *
     * For doing so it will iterate the [struct@GLib.MainContext] associated with
     * @cache's session as long as needed.
     *
     * Contrast with [method@Cache.dump], which writes out the cache index file.
     */
    public open fun flush(): Unit = soup_cache_flush(soupCachePointer.reinterpret())

    /**
     * Gets the maximum size of the cache.
     *
     * @return the maximum size of the cache, in bytes.
     */
    public open fun getMaxSize(): UInt = soup_cache_get_max_size(soupCachePointer.reinterpret())

    /**
     * Loads the contents of @cache's index into memory.
     *
     * This is not thread safe and must be called only from the thread that created the #SoupCache
     */
    public open fun load(): Unit = soup_cache_load(soupCachePointer.reinterpret())

    /**
     * Sets the maximum size of the cache.
     *
     * @param maxSize the maximum size of the cache, in bytes
     */
    public open fun setMaxSize(maxSize: UInt): Unit = soup_cache_set_max_size(soupCachePointer.reinterpret(), maxSize)

    public companion object : TypeCompanion<Cache> {
        override val type: GeneratedClassKGType<Cache> =
            GeneratedClassKGType(soup_cache_get_type()) { Cache(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }
    }
}
