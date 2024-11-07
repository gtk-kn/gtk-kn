// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.soup.SoupCacheType

/**
 * The type of cache; this affects what kinds of responses will be
 * saved.
 */
public enum class CacheType(
    public val nativeValue: SoupCacheType,
) {
    /**
     * a single-user cache
     */
    SINGLE_USER(SoupCacheType.SOUP_CACHE_SINGLE_USER),

    /**
     * a shared cache
     */
    SHARED(SoupCacheType.SOUP_CACHE_SHARED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupCacheType): CacheType =
            when (nativeValue) {
                SoupCacheType.SOUP_CACHE_SINGLE_USER -> SINGLE_USER
                SoupCacheType.SOUP_CACHE_SHARED -> SHARED
                else -> error("invalid nativeValue")
            }
    }
}
