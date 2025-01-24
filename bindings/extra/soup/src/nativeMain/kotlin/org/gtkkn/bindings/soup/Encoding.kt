// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupEncoding
import org.gtkkn.native.soup.soup_encoding_get_type

/**
 * How a message body is encoded for transport
 */
public enum class Encoding(public val nativeValue: SoupEncoding) {
    /**
     * unknown / error
     */
    UNRECOGNIZED(SoupEncoding.SOUP_ENCODING_UNRECOGNIZED),

    /**
     * no body is present (which is not the same as a
     *   0-length body, and only occurs in certain places)
     */
    NONE(SoupEncoding.SOUP_ENCODING_NONE),

    /**
     * Content-Length encoding
     */
    CONTENT_LENGTH(SoupEncoding.SOUP_ENCODING_CONTENT_LENGTH),

    /**
     * Response body ends when the connection is closed
     */
    EOF(SoupEncoding.SOUP_ENCODING_EOF),

    /**
     * chunked encoding (currently only supported
     *   for response)
     */
    CHUNKED(SoupEncoding.SOUP_ENCODING_CHUNKED),

    /**
     * multipart/byteranges (Reserved for future
     *   use: NOT CURRENTLY IMPLEMENTED)
     */
    BYTERANGES(SoupEncoding.SOUP_ENCODING_BYTERANGES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: SoupEncoding): Encoding = when (nativeValue) {
            SoupEncoding.SOUP_ENCODING_UNRECOGNIZED -> UNRECOGNIZED
            SoupEncoding.SOUP_ENCODING_NONE -> NONE
            SoupEncoding.SOUP_ENCODING_CONTENT_LENGTH -> CONTENT_LENGTH
            SoupEncoding.SOUP_ENCODING_EOF -> EOF
            SoupEncoding.SOUP_ENCODING_CHUNKED -> CHUNKED
            SoupEncoding.SOUP_ENCODING_BYTERANGES -> BYTERANGES
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Encoding
         *
         * @return the GType
         */
        public fun getType(): GType = soup_encoding_get_type()
    }
}
