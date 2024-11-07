// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.soup.SoupHTTPVersion

/**
 * Indicates the HTTP protocol version being used.
 */
public enum class HTTPVersion(
    public val nativeValue: SoupHTTPVersion,
) {
    /**
     * HTTP 1.0 (RFC 1945)
     */
    HTTP_1_0(SoupHTTPVersion.SOUP_HTTP_1_0),

    /**
     * HTTP 1.1 (RFC 2616)
     */
    HTTP_1_1(SoupHTTPVersion.SOUP_HTTP_1_1),

    /**
     * HTTP 2.0 (RFC 7540)
     */
    HTTP_2_0(SoupHTTPVersion.SOUP_HTTP_2_0),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupHTTPVersion): HTTPVersion =
            when (nativeValue) {
                SoupHTTPVersion.SOUP_HTTP_1_0 -> HTTP_1_0
                SoupHTTPVersion.SOUP_HTTP_1_1 -> HTTP_1_1
                SoupHTTPVersion.SOUP_HTTP_2_0 -> HTTP_2_0
                else -> error("invalid nativeValue")
            }
    }
}
