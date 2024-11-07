// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import org.gtkkn.native.soup.SoupMessageHeadersType

/**
 * Value passed to [ctor@MessageHeaders.new] to set certain default
 * behaviors.
 */
public enum class MessageHeadersType(
    public val nativeValue: SoupMessageHeadersType,
) {
    /**
     * request headers
     */
    REQUEST(SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_REQUEST),

    /**
     * response headers
     */
    RESPONSE(SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_RESPONSE),

    /**
     * multipart body part headers
     */
    MULTIPART(SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_MULTIPART),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupMessageHeadersType): MessageHeadersType =
            when (nativeValue) {
                SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_REQUEST -> REQUEST
                SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_RESPONSE -> RESPONSE
                SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_MULTIPART -> MULTIPART
                else -> error("invalid nativeValue")
            }
    }
}
