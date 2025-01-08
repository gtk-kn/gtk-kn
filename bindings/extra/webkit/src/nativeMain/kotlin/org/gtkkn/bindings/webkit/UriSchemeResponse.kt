// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.InputStream
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.soup.MessageHeaders
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_36
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitURISchemeResponse
import org.gtkkn.native.webkit.webkit_uri_scheme_response_get_type
import org.gtkkn.native.webkit.webkit_uri_scheme_response_new
import org.gtkkn.native.webkit.webkit_uri_scheme_response_set_content_type
import org.gtkkn.native.webkit.webkit_uri_scheme_response_set_http_headers
import org.gtkkn.native.webkit.webkit_uri_scheme_response_set_status
import kotlin.String
import kotlin.Unit

/**
 * Represents a URI scheme response.
 *
 * If you register a particular URI scheme in a #WebKitWebContext,
 * using webkit_web_context_register_uri_scheme(), you have to provide
 * a #WebKitURISchemeRequestCallback. After that, when a URI response
 * is made with that particular scheme, your callback will be
 * called. There you will be able to provide more response parameters
 * when the methods and properties of a #WebKitURISchemeRequest is not
 * enough.
 *
 * When you finished setting up your #WebKitURISchemeResponse, call
 * webkit_uri_request_finish_with_response() with it to return the response.
 *
 * ## Skipped during bindings generation
 *
 * - method `stream`: Property has no getter nor setter
 * - method `stream-length`: Property has no getter nor setter
 */
public class UriSchemeResponse(pointer: CPointer<WebKitURISchemeResponse>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitUriSchemeResponsePointer: CPointer<WebKitURISchemeResponse>
        get() = gPointer.reinterpret()

    /**
     * Create a new #WebKitURISchemeResponse
     *
     * @param inputStream a #GInputStream to read the contents of the request
     * @param streamLength the length of the stream or -1 if not known
     * @return the newly created #WebKitURISchemeResponse.
     * @since 2.36
     */
    public constructor(
        inputStream: InputStream,
        streamLength: gint64,
    ) : this(webkit_uri_scheme_response_new(inputStream.gioInputStreamPointer, streamLength)!!.reinterpret())

    /**
     * Sets the content type for the @response
     *
     * @param contentType the content type of the stream
     * @since 2.36
     */
    @WebKitVersion2_36
    public fun setContentType(contentType: String): Unit =
        webkit_uri_scheme_response_set_content_type(webkitUriSchemeResponsePointer, contentType)

    /**
     * Assign the provided #SoupMessageHeaders to the response.
     *
     * @headers need to be of the type %SOUP_MESSAGE_HEADERS_RESPONSE.
     * Any existing headers will be overwritten.
     *
     * @param headers the HTTP headers to be set
     * @since 2.36
     */
    @WebKitVersion2_36
    public fun setHttpHeaders(headers: MessageHeaders): Unit =
        webkit_uri_scheme_response_set_http_headers(webkitUriSchemeResponsePointer, headers.gPointer)

    /**
     * Sets the status code and reason phrase for the @response.
     *
     * If @status_code is a known value and @reason_phrase is null, the @reason_phrase will be set automatically.
     *
     * @param statusCode the HTTP status code to be returned
     * @param reasonPhrase a reason phrase
     * @since 2.36
     */
    @WebKitVersion2_36
    public fun setStatus(statusCode: guint, reasonPhrase: String? = null): Unit =
        webkit_uri_scheme_response_set_status(webkitUriSchemeResponsePointer, statusCode, reasonPhrase)

    public companion object : TypeCompanion<UriSchemeResponse> {
        override val type: GeneratedClassKGType<UriSchemeResponse> =
            GeneratedClassKGType(webkit_uri_scheme_response_get_type()) { UriSchemeResponse(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of URISchemeResponse
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_uri_scheme_response_get_type()
    }
}
