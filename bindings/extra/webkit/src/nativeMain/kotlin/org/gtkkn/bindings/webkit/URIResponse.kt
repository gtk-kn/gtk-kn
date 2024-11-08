// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.MessageHeaders
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_6
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.webkit.WebKitURIResponse
import org.gtkkn.native.webkit.webkit_uri_response_get_content_length
import org.gtkkn.native.webkit.webkit_uri_response_get_http_headers
import org.gtkkn.native.webkit.webkit_uri_response_get_mime_type
import org.gtkkn.native.webkit.webkit_uri_response_get_status_code
import org.gtkkn.native.webkit.webkit_uri_response_get_suggested_filename
import org.gtkkn.native.webkit.webkit_uri_response_get_type
import org.gtkkn.native.webkit.webkit_uri_response_get_uri
import kotlin.String
import kotlin.UInt
import kotlin.ULong

/**
 * Represents an URI response.
 *
 * A #WebKitURIResponse contains information such as the URI, the
 * status code, the content length, the mime type, the HTTP status or
 * the suggested filename.
 */
public class URIResponse(
    pointer: CPointer<WebKitURIResponse>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val webkitURIResponsePointer: CPointer<WebKitURIResponse>
        get() = gPointer.reinterpret()

    /**
     * The expected content length of the response.
     */
    public val contentLength: ULong
        /**
         * Get the expected content length of the #WebKitURIResponse.
         *
         * It can be 0 if the server provided an incorrect or missing Content-Length.
         *
         * @return the expected content length of @response.
         */
        get() = webkit_uri_response_get_content_length(webkitURIResponsePointer.reinterpret())

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
        get() =
            webkit_uri_response_get_http_headers(webkitURIResponsePointer.reinterpret())!!.run {
                MessageHeaders(reinterpret())
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
        get() =
            webkit_uri_response_get_mime_type(webkitURIResponsePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * The status code of the response as returned by the server.
     */
    public val statusCode: UInt
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
        get() = webkit_uri_response_get_status_code(webkitURIResponsePointer.reinterpret())

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
        get() =
            webkit_uri_response_get_suggested_filename(webkitURIResponsePointer.reinterpret())?.toKString()
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
        get() =
            webkit_uri_response_get_uri(webkitURIResponsePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Get the expected content length of the #WebKitURIResponse.
     *
     * It can be 0 if the server provided an incorrect or missing Content-Length.
     *
     * @return the expected content length of @response.
     */
    public fun getContentLength(): ULong =
        webkit_uri_response_get_content_length(webkitURIResponsePointer.reinterpret())

    /**
     * Get the HTTP headers of a #WebKitURIResponse as a #SoupMessageHeaders.
     *
     * @return a #SoupMessageHeaders with the HTTP headers of @response
     *    or null if @response is not an HTTP response.
     * @since 2.6
     */
    @WebKitVersion2_6
    public fun getHttpHeaders(): MessageHeaders =
        webkit_uri_response_get_http_headers(webkitURIResponsePointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
        }

    /**
     * Gets the MIME type of the response.
     *
     * @return MIME type, as a string.
     */
    public fun getMimeType(): String =
        webkit_uri_response_get_mime_type(webkitURIResponsePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

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
    public fun getStatusCode(): UInt = webkit_uri_response_get_status_code(webkitURIResponsePointer.reinterpret())

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
    public fun getSuggestedFilename(): String =
        webkit_uri_response_get_suggested_filename(webkitURIResponsePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the URI which resulted in the response.
     *
     * @return response URI, as a string.
     */
    public fun getUri(): String =
        webkit_uri_response_get_uri(webkitURIResponsePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<URIResponse> {
        override val type: GeneratedClassKGType<URIResponse> =
            GeneratedClassKGType(webkit_uri_response_get_type()) { URIResponse(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}