// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupMessageHeadersType
import org.gtkkn.native.soup.soup_message_headers_type_get_type

/**
 * Value passed to [ctor@MessageHeaders.new] to set certain default
 * behaviors.
 */
public enum class MessageHeadersType(public val nativeValue: SoupMessageHeadersType) {
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
        public fun fromNativeValue(nativeValue: SoupMessageHeadersType): MessageHeadersType = when (nativeValue) {
            SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_REQUEST -> REQUEST
            SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_RESPONSE -> RESPONSE
            SoupMessageHeadersType.SOUP_MESSAGE_HEADERS_MULTIPART -> MULTIPART
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of MessageHeadersType
         *
         * @return the GType
         */
        public fun getType(): GType = soup_message_headers_type_get_type()
    }
}
