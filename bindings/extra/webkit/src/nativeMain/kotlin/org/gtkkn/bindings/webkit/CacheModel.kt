// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.native.webkit.WebKitCacheModel

/**
 * Enum values used for determining the #WebKitWebContext cache model.
 */
public enum class CacheModel(
    public val nativeValue: WebKitCacheModel,
) {
    /**
     * Disable the cache completely, which
     *   substantially reduces memory usage. Useful for applications that only
     *   access a single local file, with no navigation to other pages. No remote
     *   resources will be cached.
     */
    DOCUMENT_VIEWER(WebKitCacheModel.WEBKIT_CACHE_MODEL_DOCUMENT_VIEWER),

    /**
     * Improve document load speed substantially
     *   by caching a very large number of resources and previously viewed content.
     */
    WEB_BROWSER(WebKitCacheModel.WEBKIT_CACHE_MODEL_WEB_BROWSER),

    /**
     * A cache model optimized for viewing
     *   a series of local files -- for example, a documentation viewer or a website
     *   designer. WebKit will cache a moderate number of resources.
     */
    DOCUMENT_BROWSER(WebKitCacheModel.WEBKIT_CACHE_MODEL_DOCUMENT_BROWSER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitCacheModel): CacheModel =
            when (nativeValue) {
                WebKitCacheModel.WEBKIT_CACHE_MODEL_DOCUMENT_VIEWER -> DOCUMENT_VIEWER
                WebKitCacheModel.WEBKIT_CACHE_MODEL_WEB_BROWSER -> WEB_BROWSER
                WebKitCacheModel.WEBKIT_CACHE_MODEL_DOCUMENT_BROWSER -> DOCUMENT_BROWSER
                else -> error("invalid nativeValue")
            }
    }
}
