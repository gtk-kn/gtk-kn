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
import org.gtkkn.native.webkit.WebKitURIRequest
import org.gtkkn.native.webkit.webkit_uri_request_get_http_headers
import org.gtkkn.native.webkit.webkit_uri_request_get_http_method
import org.gtkkn.native.webkit.webkit_uri_request_get_type
import org.gtkkn.native.webkit.webkit_uri_request_get_uri
import org.gtkkn.native.webkit.webkit_uri_request_new
import org.gtkkn.native.webkit.webkit_uri_request_set_uri
import kotlin.String
import kotlin.Unit

/**
 * Represents a URI request.
 *
 * A #WebKitURIRequest can be created with a URI using the
 * webkit_uri_request_new() method, and you can get the URI of an
 * existing request with the webkit_uri_request_get_uri() one.
 */
public class URIRequest(
    pointer: CPointer<WebKitURIRequest>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val webkitURIRequestPointer: CPointer<WebKitURIRequest>
        get() = gPointer.reinterpret()

    /**
     * The URI to which the request will be made.
     */
    public var uri: String
        /**
         * Obtains the request URI.
         *
         * @return request URI, as a string.
         */
        get() =
            webkit_uri_request_get_uri(webkitURIRequestPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Set the URI of @request
         *
         * @param uri an URI
         */
        set(uri) = webkit_uri_request_set_uri(webkitURIRequestPointer.reinterpret(), uri)

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
    public fun getHttpHeaders(): MessageHeaders =
        webkit_uri_request_get_http_headers(webkitURIRequestPointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
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
        webkit_uri_request_get_http_method(webkitURIRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Obtains the request URI.
     *
     * @return request URI, as a string.
     */
    public fun getUri(): String =
        webkit_uri_request_get_uri(webkitURIRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Set the URI of @request
     *
     * @param uri an URI
     */
    public fun setUri(uri: String): Unit = webkit_uri_request_set_uri(webkitURIRequestPointer.reinterpret(), uri)

    public companion object : TypeCompanion<URIRequest> {
        override val type: GeneratedClassKGType<URIRequest> =
            GeneratedClassKGType(webkit_uri_request_get_type()) { URIRequest(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}
