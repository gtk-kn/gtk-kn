// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.MessageHeaders
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitURIResponse
import org.gtkkn.native.webkit.webkit_uri_response_get_content_length
import org.gtkkn.native.webkit.webkit_uri_response_get_http_headers
import org.gtkkn.native.webkit.webkit_uri_response_get_mime_type
import org.gtkkn.native.webkit.webkit_uri_response_get_status_code
import org.gtkkn.native.webkit.webkit_uri_response_get_suggested_filename
import org.gtkkn.native.webkit.webkit_uri_response_get_type
import org.gtkkn.native.webkit.webkit_uri_response_get_uri
import kotlin.String

/**
 * Represents an URI response.
 *
 * A #WebKitURIResponse contains information such as the URI, the
 * status code, the content length, the mime type, the HTTP status or
 * the suggested filename.
 */
public class UriResponse(public val webkitUriResponsePointer: CPointer<WebKitURIResponse>) :
    Object(webkitUriResponsePointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * The expected content length of the response.
     */
    public val contentLength: guint64
        /**
         * Get the expected content length of the #WebKitURIResponse.
         *
         * It can be 0 if the server provided an incorrect or missing Content-Length.
         *
         * @return the expected content length of @response.
         */
        get() = webkit_uri_response_get_content_length(webkitUriResponsePointer)

    /**
     * The HTTP headers of the response, or null if the response is not an HTTP response.
     *
     * @since 2.6
     */
    @WebKitVersion2_6
    public val httpHeaders: MessageHeaders
        /**
         * Get the HTTP headers of a #WebKitURIResponse as a #SoupMessageHeaders.
         *
         * @return a #SoupMessageHeaders with the HTTP headers of @response
         *    or null if @response is not an HTTP response.
         * @since 2.6
         */
        get() = webkit_uri_response_get_http_headers(webkitUriResponsePointer)!!.run {
            MessageHeaders(this)
        }

    /**
     * The MIME type of the response.
     */
    public val mimeType: String
        /**
         * Gets the MIME type of the response.
         *
         * @return MIME type, as a string.
         */
        get() = webkit_uri_response_get_mime_type(webkitUriResponsePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The status code of the response as returned by the server.
     */
    public val statusCode: guint
        /**
         * Get the status code of the #WebKitURIResponse.
         *
         * Get the status code of the #WebKitURIResponse as returned by
         * the server. It will normally be a #SoupKnownStatusCode, for
         * example %SOUP_STATUS_OK, though the server can respond with any
         * unsigned integer.
         *
         * @return the status code of @response
         */
        get() = webkit_uri_response_get_status_code(webkitUriResponsePointer)

    /**
     * The suggested filename for the URI response.
     */
    public val suggestedFilename: String
        /**
         * Get the suggested filename for @response.
         *
         * Get the suggested filename for @response, as specified by
         * the 'Content-Disposition' HTTP header, or null if it's not
         * present.
         *
         * @return the suggested filename or null if
         *    the 'Content-Disposition' HTTP header is not present.
         */
        get() = webkit_uri_response_get_suggested_filename(webkitUriResponsePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The URI for which the response was made.
     */
    public val uri: String
        /**
         * Gets the URI which resulted in the response.
         *
         * @return response URI, as a string.
         */
        get() = webkit_uri_response_get_uri(webkitUriResponsePointer)?.toKString() ?: error("Expected not null string")

    public companion object : TypeCompanion<UriResponse> {
        override val type: GeneratedClassKGType<UriResponse> =
            GeneratedClassKGType(getTypeOrNull()!!) { UriResponse(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of URIResponse
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_uri_response_get_type()

        /**
         * Gets the GType of from the symbol `webkit_uri_response_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_uri_response_get_type")
    }
}
