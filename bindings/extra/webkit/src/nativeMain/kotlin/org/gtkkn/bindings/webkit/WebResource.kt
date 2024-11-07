// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.gio.TlsCertificateFlags
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.webkit.WebKitURIRequest
import org.gtkkn.native.webkit.WebKitURIResponse
import org.gtkkn.native.webkit.WebKitWebResource
import org.gtkkn.native.webkit.webkit_web_resource_get_data
import org.gtkkn.native.webkit.webkit_web_resource_get_response
import org.gtkkn.native.webkit.webkit_web_resource_get_type
import org.gtkkn.native.webkit.webkit_web_resource_get_uri
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Represents a resource at the end of a URI.
 *
 * A #WebKitWebResource encapsulates content for each resource at the
 * end of a particular URI. For example, one #WebKitWebResource will
 * be created for each separate image and stylesheet when a page is
 * loaded.
 *
 * You can access the response and the URI for a given
 * #WebKitWebResource, using webkit_web_resource_get_uri() and
 * webkit_web_resource_get_response(), as well as the raw data, using
 * webkit_web_resource_get_data().
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 */
public class WebResource(
    pointer: CPointer<WebKitWebResource>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val webkitWebResourcePointer: CPointer<WebKitWebResource>
        get() = gPointer.reinterpret()

    /**
     * The #WebKitURIResponse associated with this resource.
     */
    public val response: URIResponse
        /**
         * Retrieves the #WebKitURIResponse of the resource load operation.
         *
         * This method returns null if called before the response
         * is received from the server. You can connect to notify::response
         * signal to be notified when the response is received.
         *
         * @return the #WebKitURIResponse, or null if
         *     the response hasn't been received yet.
         */
        get() =
            webkit_web_resource_get_response(webkitWebResourcePointer.reinterpret())!!.run {
                URIResponse(reinterpret())
            }

    /**
     * The current active URI of the #WebKitWebResource.
     * See webkit_web_resource_get_uri() for more details.
     */
    public val uri: String
        /**
         * Returns the current active URI of @resource.
         *
         * The active URI might change during
         * a load operation:
         *
         * <orderedlist>
         * <listitem><para>
         *   When the resource load starts, the active URI is the requested URI
         * </para></listitem>
         * <listitem><para>
         *   When the initial request is sent to the server, #WebKitWebResource::sent-request
         *   signal is emitted without a redirected response, the active URI is the URI of
         *   the request sent to the server.
         * </para></listitem>
         * <listitem><para>
         *   In case of a server redirection, #WebKitWebResource::sent-request signal
         *   is emitted again with a redirected response, the active URI is the URI the request
         *   was redirected to.
         * </para></listitem>
         * <listitem><para>
         *   When the response is received from the server, the active URI is the final
         *   one and it will not change again.
         * </para></listitem>
         * </orderedlist>
         *
         * You can monitor the active URI by connecting to the notify::uri
         * signal of @resource.
         *
         * @return the current active URI of @resource
         */
        get() =
            webkit_web_resource_get_uri(webkitWebResourcePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Asynchronously get the raw data for @resource.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_web_resource_get_data_finish() to get the result of the operation.
     *
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     */
    public fun getData_(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        webkit_web_resource_get_data(
            webkitWebResourcePointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Retrieves the #WebKitURIResponse of the resource load operation.
     *
     * This method returns null if called before the response
     * is received from the server. You can connect to notify::response
     * signal to be notified when the response is received.
     *
     * @return the #WebKitURIResponse, or null if
     *     the response hasn't been received yet.
     */
    public fun getResponse(): URIResponse =
        webkit_web_resource_get_response(webkitWebResourcePointer.reinterpret())!!.run {
            URIResponse(reinterpret())
        }

    /**
     * Returns the current active URI of @resource.
     *
     * The active URI might change during
     * a load operation:
     *
     * <orderedlist>
     * <listitem><para>
     *   When the resource load starts, the active URI is the requested URI
     * </para></listitem>
     * <listitem><para>
     *   When the initial request is sent to the server, #WebKitWebResource::sent-request
     *   signal is emitted without a redirected response, the active URI is the URI of
     *   the request sent to the server.
     * </para></listitem>
     * <listitem><para>
     *   In case of a server redirection, #WebKitWebResource::sent-request signal
     *   is emitted again with a redirected response, the active URI is the URI the request
     *   was redirected to.
     * </para></listitem>
     * <listitem><para>
     *   When the response is received from the server, the active URI is the final
     *   one and it will not change again.
     * </para></listitem>
     * </orderedlist>
     *
     * You can monitor the active URI by connecting to the notify::uri
     * signal of @resource.
     *
     * @return the current active URI of @resource
     */
    public fun getUri(): String =
        webkit_web_resource_get_uri(webkitWebResourcePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * This signal is emitted when an error occurs during the resource
     * load operation.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `error` the #GError that was triggered
     */
    public fun connectFailed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (error: Error) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "failed",
            connectFailedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when a TLS error occurs during the resource load operation.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `certificate` a #GTlsCertificate; `errors` a #GTlsCertificateFlags with the verification status of @certificate
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun connectFailedWithTlsErrors(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (certificate: TlsCertificate, errors: TlsCertificateFlags) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "failed-with-tls-errors",
            connectFailedWithTlsErrorsFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when the resource load finishes successfully
     * or due to an error. In case of errors #WebKitWebResource::failed signal
     * is emitted before this one.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectFinished(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "finished",
            connectFinishedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when @request has been sent to the
     * server. In case of a server redirection this signal is
     * emitted again with the @request argument containing the new
     * request sent to the server due to the redirection and the
     * @redirected_response parameter containing the response
     * received by the server for the initial request.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `request` a #WebKitURIRequest; `redirectedResponse` a #WebKitURIResponse, or null
     */
    public fun connectSentRequest(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (request: URIRequest, redirectedResponse: URIResponse) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "sent-request",
            connectSentRequestFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<WebResource> {
        override val type: GeneratedClassKGType<WebResource> =
            GeneratedClassKGType(webkit_web_resource_get_type()) { WebResource(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }
    }
}

private val connectFailedFunc: CPointer<CFunction<(CPointer<GError>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            error: CPointer<GError>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(error: Error) -> Unit>().get().invoke(
            error!!.run {
                Error(reinterpret())
            }
        )
    }.reinterpret()

private val connectFailedWithTlsErrorsFunc:
    CPointer<CFunction<(CPointer<GTlsCertificate>, GTlsCertificateFlags) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            certificate: CPointer<GTlsCertificate>?,
            errors: GTlsCertificateFlags,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(certificate: TlsCertificate, errors: TlsCertificateFlags) -> Unit>().get().invoke(
            certificate!!.run {
                TlsCertificate(reinterpret())
            },
            errors.run {
                TlsCertificateFlags(this)
            }
        )
    }.reinterpret()

private val connectFinishedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectSentRequestFunc:
    CPointer<CFunction<(CPointer<WebKitURIRequest>, CPointer<WebKitURIResponse>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            request: CPointer<WebKitURIRequest>?,
            redirectedResponse: CPointer<WebKitURIResponse>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(request: URIRequest, redirectedResponse: URIResponse) -> Unit>().get().invoke(
            request!!.run {
                URIRequest(reinterpret())
            },
            redirectedResponse!!.run {
                URIResponse(reinterpret())
            }
        )
    }.reinterpret()
