// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.MessageHeaders
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_12
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitURIRequest
import org.gtkkn.native.webkit.webkit_uri_request_get_http_headers
import org.gtkkn.native.webkit.webkit_uri_request_get_http_method
import org.gtkkn.native.webkit.webkit_uri_request_get_type
import org.gtkkn.native.webkit.webkit_uri_request_get_uri
import org.gtkkn.native.webkit.webkit_uri_request_new
import org.gtkkn.native.webkit.webkit_uri_request_set_uri
import kotlin.String

/**
 * Represents a URI request.
 *
 * A #WebKitURIRequest can be created with a URI using the
 * webkit_uri_request_new() method, and you can get the URI of an
 * existing request with the webkit_uri_request_get_uri() one.
 */
public class UriRequest(public val webkitUriRequestPointer: CPointer<WebKitURIRequest>) :
    Object(webkitUriRequestPointer.reinterpret()),
    KGTyped {
    /**
     * The URI to which the request will be made.
     */
    public var uri: String
        /**
         * Obtains the request URI.
         *
         * @return request URI, as a string.
         */
        get() = webkit_uri_request_get_uri(webkitUriRequestPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Set the URI of @request
         *
         * @param uri an URI
         */
        set(uri) = webkit_uri_request_set_uri(webkitUriRequestPointer, uri)

    /**
     * Creates a new #WebKitURIRequest for the given URI.
     *
     * @param uri an URI
     * @return a new #WebKitURIRequest
     */
    public constructor(uri: String) : this(webkit_uri_request_new(uri)!!.reinterpret())

    /**
     * Get the HTTP headers of a #WebKitURIRequest as a #SoupMessageHeaders.
     *
     * @return a #SoupMessageHeaders with the HTTP headers of @request
     *    or null if @request is not an HTTP request.
     */
    public fun getHttpHeaders(): MessageHeaders = webkit_uri_request_get_http_headers(webkitUriRequestPointer)!!.run {
        MessageHeaders(this)
    }

    /**
     * Get the HTTP method of the #WebKitURIRequest.
     *
     * @return the HTTP method of the #WebKitURIRequest or null if @request is not
     *    an HTTP request.
     * @since 2.12
     */
    @WebKitVersion2_12
    public fun getHttpMethod(): String =
        webkit_uri_request_get_http_method(webkitUriRequestPointer)?.toKString() ?: error("Expected not null string")

    public companion object : TypeCompanion<UriRequest> {
        override val type: GeneratedClassKGType<UriRequest> =
            GeneratedClassKGType(webkit_uri_request_get_type()) { UriRequest(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of URIRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_uri_request_get_type()
    }
}
