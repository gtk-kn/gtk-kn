// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.soup.SOUP_CACHE_CACHEABLE
import org.gtkkn.native.soup.SOUP_CACHE_INVALIDATES
import org.gtkkn.native.soup.SOUP_CACHE_UNCACHEABLE
import org.gtkkn.native.soup.SOUP_CACHE_VALIDATES
import org.gtkkn.native.soup.SoupCacheability

/**
 * Indicates if a message should or shouldn't be cached.
 */
public class Cacheability(
    public val mask: SoupCacheability,
) : Bitfield<Cacheability> {
    override infix fun or(other: Cacheability): Cacheability = Cacheability(mask or other.mask)

    public companion object {
        /**
         * The message should be cached
         */
        public val CACHEABLE: Cacheability = Cacheability(SOUP_CACHE_CACHEABLE)

        /**
         * The message shouldn't be cached
         */
        public val UNCACHEABLE: Cacheability = Cacheability(SOUP_CACHE_UNCACHEABLE)

        /**
         * The messages cache should be invalidated
         */
        public val INVALIDATES: Cacheability = Cacheability(SOUP_CACHE_INVALIDATES)

        /**
         * The messages cache should be updated
         */
        public val VALIDATES: Cacheability = Cacheability(SOUP_CACHE_VALIDATES)
    }
}
