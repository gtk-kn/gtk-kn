// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.MessageHeaders
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_36
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint64
import org.gtkkn.native.webkit.WebKitURISchemeRequest
import org.gtkkn.native.webkit.webkit_uri_scheme_request_finish
import org.gtkkn.native.webkit.webkit_uri_scheme_request_finish_error
import org.gtkkn.native.webkit.webkit_uri_scheme_request_finish_with_response
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_http_body
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_http_headers
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_http_method
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_path
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_scheme
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_type
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_uri
import org.gtkkn.native.webkit.webkit_uri_scheme_request_get_web_view
import kotlin.String
import kotlin.Unit

/**
 * Represents a URI scheme request.
 *
 * If you register a particular URI scheme in a #WebKitWebContext,
 * using webkit_web_context_register_uri_scheme(), you have to provide
 * a #WebKitURISchemeRequestCallback. After that, when a URI request
 * is made with that particular scheme, your callback will be
 * called. There you will be able to access properties such as the
 * scheme, the URI and path, and the #WebKitWebView that initiated the
 * request, and also finish the request with
 * webkit_uri_scheme_request_finish().
 */
public class URISchemeRequest(pointer: CPointer<WebKitURISchemeRequest>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitURISchemeRequestPointer: CPointer<WebKitURISchemeRequest>
        get() = gPointer.reinterpret()

    /**
     * Finish a #WebKitURISchemeRequest by setting the contents of the request and its mime type.
     *
     * @param stream a #GInputStream to read the contents of the request
     * @param streamLength the length of the stream or -1 if not known
     * @param contentType the content type of the stream or null if not known
     */
    public fun finish(stream: InputStream, streamLength: gint64, contentType: String? = null): Unit =
        webkit_uri_scheme_request_finish(
            webkitURISchemeRequestPointer.reinterpret(),
            stream.gioInputStreamPointer.reinterpret(),
            streamLength,
            contentType
        )

    /**
     * Finish a #WebKitURISchemeRequest with a #GError.
     *
     * @param error a #GError that will be passed to the #WebKitWebView
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun finishError(error: Error): Unit = webkit_uri_scheme_request_finish_error(
        webkitURISchemeRequestPointer.reinterpret(),
        error.glibErrorPointer.reinterpret()
    )

    /**
     * Finish a #WebKitURISchemeRequest by returning a #WebKitURISchemeResponse
     *
     * @param response a #WebKitURISchemeResponse
     * @since 2.36
     */
    @WebKitVersion2_36
    public fun finishWithResponse(response: URISchemeResponse): Unit = webkit_uri_scheme_request_finish_with_response(
        webkitURISchemeRequestPointer.reinterpret(),
        response.webkitURISchemeResponsePointer.reinterpret()
    )

    /**
     * Get the request body.
     *
     * @return (nullable): the body of the @request.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getHttpBody(): InputStream =
        webkit_uri_scheme_request_get_http_body(webkitURISchemeRequestPointer.reinterpret())!!.run {
            InputStream(reinterpret())
        }

    /**
     * Get the #SoupMessageHeaders of the request.
     *
     * @return the #SoupMessageHeaders of the @request.
     * @since 2.36
     */
    @WebKitVersion2_36
    public fun getHttpHeaders(): MessageHeaders =
        webkit_uri_scheme_request_get_http_headers(webkitURISchemeRequestPointer.reinterpret())!!.run {
            MessageHeaders(reinterpret())
        }

    /**
     * Get the HTTP method of the @request.
     *
     * @return the HTTP method of the @request
     * @since 2.36
     */
    @WebKitVersion2_36
    public fun getHttpMethod(): String =
        webkit_uri_scheme_request_get_http_method(webkitURISchemeRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the URI path of @request.
     *
     * @return the URI path of @request
     */
    public fun getPath(): String =
        webkit_uri_scheme_request_get_path(webkitURISchemeRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the URI scheme of @request.
     *
     * @return the URI scheme of @request
     */
    public fun getScheme(): String =
        webkit_uri_scheme_request_get_scheme(webkitURISchemeRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the URI of @request.
     *
     * @return the full URI of @request
     */
    public fun getUri(): String =
        webkit_uri_scheme_request_get_uri(webkitURISchemeRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the #WebKitWebView that initiated the request.
     *
     * @return the #WebKitWebView that initiated @request.
     */
    public fun getWebView(): WebView =
        webkit_uri_scheme_request_get_web_view(webkitURISchemeRequestPointer.reinterpret())!!.run {
            WebView(reinterpret())
        }

    public companion object : TypeCompanion<URISchemeRequest> {
        override val type: GeneratedClassKGType<URISchemeRequest> =
            GeneratedClassKGType(webkit_uri_scheme_request_get_type()) { URISchemeRequest(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of URISchemeRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_uri_scheme_request_get_type()
    }
}
