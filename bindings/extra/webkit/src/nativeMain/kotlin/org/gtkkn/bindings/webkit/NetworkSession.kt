// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitDownload
import org.gtkkn.native.webkit.WebKitNetworkSession
import org.gtkkn.native.webkit.webkit_network_session_allow_tls_certificate_for_host
import org.gtkkn.native.webkit.webkit_network_session_download_uri
import org.gtkkn.native.webkit.webkit_network_session_get_cookie_manager
import org.gtkkn.native.webkit.webkit_network_session_get_default
import org.gtkkn.native.webkit.webkit_network_session_get_itp_enabled
import org.gtkkn.native.webkit.webkit_network_session_get_itp_summary
import org.gtkkn.native.webkit.webkit_network_session_get_itp_summary_finish
import org.gtkkn.native.webkit.webkit_network_session_get_persistent_credential_storage_enabled
import org.gtkkn.native.webkit.webkit_network_session_get_tls_errors_policy
import org.gtkkn.native.webkit.webkit_network_session_get_type
import org.gtkkn.native.webkit.webkit_network_session_get_website_data_manager
import org.gtkkn.native.webkit.webkit_network_session_is_ephemeral
import org.gtkkn.native.webkit.webkit_network_session_new
import org.gtkkn.native.webkit.webkit_network_session_new_ephemeral
import org.gtkkn.native.webkit.webkit_network_session_prefetch_dns
import org.gtkkn.native.webkit.webkit_network_session_set_itp_enabled
import org.gtkkn.native.webkit.webkit_network_session_set_memory_pressure_settings
import org.gtkkn.native.webkit.webkit_network_session_set_persistent_credential_storage_enabled
import org.gtkkn.native.webkit.webkit_network_session_set_proxy_settings
import org.gtkkn.native.webkit.webkit_network_session_set_tls_errors_policy
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Manages network configuration.
 *
 * ## Skipped during bindings generation
 *
 * - method `cache-directory`: Property has no getter nor setter
 * - method `data-directory`: Property has no getter nor setter
 * - method `is-ephemeral`: Property has no getter nor setter
 *
 * @since 2.40
 */
@WebKitVersion2_40
public class NetworkSession(pointer: CPointer<WebKitNetworkSession>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitNetworkSessionPointer: CPointer<WebKitNetworkSession>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #WebKitNetworkSession with an ephemeral #WebKitWebsiteDataManager.
     *
     * @return a new ephemeral #WebKitNetworkSession.
     * @since 2.40
     */
    public constructor() : this(webkit_network_session_new_ephemeral()!!.reinterpret())

    /**
     * Creates a new #WebKitNetworkSession with a persistent #WebKitWebsiteDataManager.
     * The parameters @data_directory and @cache_directory will be used as construct
     * properties of the #WebKitWebsiteDataManager of the network session. Note that if
     * null is passed, the default directory will be passed to #WebKitWebsiteDataManager
     * so that webkit_website_data_manager_get_base_data_directory() and
     * webkit_website_data_manager_get_base_cache_directory() always return a value for
     * non ephemeral sessions.
     *
     * It must be passed as construct parameter of a #WebKitWebView.
     *
     * @param dataDirectory a base directory for data, or null
     * @param cacheDirectory a base directory for caches, or null
     * @return the newly created #WebKitNetworkSession
     * @since 2.40
     */
    public constructor(
        dataDirectory: String? = null,
        cacheDirectory: String? = null,
    ) : this(webkit_network_session_new(dataDirectory, cacheDirectory)!!.reinterpret())

    /**
     * Ignore further TLS errors on the @host for the certificate present in @info.
     *
     * If @host is an IPv6 address, it should not be surrounded by brackets. This
     * expectation matches g_uri_get_host().
     *
     * @param certificate a #GTlsCertificate
     * @param host the host for which a certificate is to be allowed
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun allowTlsCertificateForHost(certificate: TlsCertificate, host: String): Unit =
        webkit_network_session_allow_tls_certificate_for_host(
            webkitNetworkSessionPointer,
            certificate.gioTlsCertificatePointer,
            host
        )

    /**
     * Requests downloading of the specified URI string.
     *
     * The download operation will not be associated to any #WebKitWebView,
     * if you are interested in starting a download from a particular #WebKitWebView use
     * webkit_web_view_download_uri() instead.
     *
     * @param uri the URI to download
     * @return a new #WebKitDownload representing
     *    the download operation.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun downloadUri(uri: String): Download =
        webkit_network_session_download_uri(webkitNetworkSessionPointer, uri)!!.run {
            Download(this)
        }

    /**
     * Get the #WebKitCookieManager of @session.
     *
     * @return a #WebKitCookieManager
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getCookieManager(): CookieManager =
        webkit_network_session_get_cookie_manager(webkitNetworkSessionPointer)!!.run {
            CookieManager(this)
        }

    /**
     * Get whether Intelligent Tracking Prevention (ITP) is enabled or not.
     *
     * @return true if ITP is enabled, or false otherwise.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getItpEnabled(): Boolean =
        webkit_network_session_get_itp_enabled(webkitNetworkSessionPointer).asBoolean()

    /**
     * Asynchronously get the list of #WebKitITPThirdParty seen for @session.
     *
     * Every #WebKitITPThirdParty
     * contains the list of #WebKitITPFirstParty under which it has been seen.
     *
     * When the operation is finished, @callback will be called. You can then call
     * webkit_network_session_get_itp_summary_finish() to get the result of the operation.
     *
     * @param cancellable a #GCancellable or null to ignore
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getItpSummary(cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        webkit_network_session_get_itp_summary(
            webkitNetworkSessionPointer,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous operation started with webkit_network_session_get_itp_summary().
     *
     * @param result a #GAsyncResult
     * @return a #GList of #WebKitITPThirdParty.
     *    You must free the #GList with g_list_free() and unref the #WebKitITPThirdParty<!-- -->s with
     *    webkit_itp_third_party_unref() when you're done with them.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getItpSummaryFinish(result: AsyncResult): Result<List> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_network_session_get_itp_summary_finish(
            webkitNetworkSessionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        )?.run {
            List(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Get whether persistent credential storage is enabled or not.
     *
     * See also webkit_network_session_set_persistent_credential_storage_enabled().
     *
     * @return true if persistent credential storage is enabled, or false otherwise.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getPersistentCredentialStorageEnabled(): Boolean =
        webkit_network_session_get_persistent_credential_storage_enabled(webkitNetworkSessionPointer).asBoolean()

    /**
     * Get the TLS errors policy of @session.
     *
     * @return a #WebKitTLSErrorsPolicy
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getTlsErrorsPolicy(): TlsErrorsPolicy =
        webkit_network_session_get_tls_errors_policy(webkitNetworkSessionPointer).run {
            TlsErrorsPolicy.fromNativeValue(this)
        }

    /**
     * Get the #WebKitWebsiteDataManager of @session.
     *
     * @return a #WebKitWebsiteDataManager
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getWebsiteDataManager(): WebsiteDataManager =
        webkit_network_session_get_website_data_manager(webkitNetworkSessionPointer)!!.run {
            WebsiteDataManager(this)
        }

    /**
     * Get whether @session is ephemeral.
     * A #WebKitNetworkSession is ephemeral when its #WebKitWebsiteDataManager is ephemeral.
     * See #WebKitWebsiteDataManager:is-ephemeral for more details.
     *
     * @return true if @session is pehmeral, or false otherwise
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun isEphemeral(): Boolean = webkit_network_session_is_ephemeral(webkitNetworkSessionPointer).asBoolean()

    /**
     * Resolve the domain name of the given @hostname in advance, so that if a URI
     * of @hostname is requested the load will be performed more quickly.
     *
     * @param hostname a hostname to be resolved
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun prefetchDns(hostname: String): Unit =
        webkit_network_session_prefetch_dns(webkitNetworkSessionPointer, hostname)

    /**
     * Enable or disable Intelligent Tracking Prevention (ITP).
     *
     * When ITP is enabled resource load statistics
     * are collected and used to decide whether to allow or block third-party cookies and prevent user tracking.
     * Note that while ITP is enabled the accept policy %WEBKIT_COOKIE_POLICY_ACCEPT_NO_THIRD_PARTY is ignored and
     * %WEBKIT_COOKIE_POLICY_ACCEPT_ALWAYS is used instead. See also webkit_cookie_session_set_accept_policy().
     *
     * @param enabled value to set
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun setItpEnabled(enabled: Boolean): Unit =
        webkit_network_session_set_itp_enabled(webkitNetworkSessionPointer, enabled.asGBoolean())

    /**
     * Enable or disable persistent credential storage.
     *
     * When enabled, which is the default for
     * non-ephemeral sessions, the network process will try to read and write HTTP authentiacation
     * credentials from persistent storage.
     *
     * @param enabled value to set
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun setPersistentCredentialStorageEnabled(enabled: Boolean): Unit =
        webkit_network_session_set_persistent_credential_storage_enabled(
            webkitNetworkSessionPointer,
            enabled.asGBoolean()
        )

    /**
     * Set the network proxy settings to be used by connections started in @session session.
     *
     * By default %WEBKIT_NETWORK_PROXY_MODE_DEFAULT is used, which means that the
     * system settings will be used (g_proxy_resolver_get_default()).
     * If you want to override the system default settings, you can either use
     * %WEBKIT_NETWORK_PROXY_MODE_NO_PROXY to make sure no proxies are used at all,
     * or %WEBKIT_NETWORK_PROXY_MODE_CUSTOM to provide your own proxy settings.
     * When @proxy_mode is %WEBKIT_NETWORK_PROXY_MODE_CUSTOM @proxy_settings must be
     * a valid #WebKitNetworkProxySettings; otherwise, @proxy_settings must be null.
     *
     * @param proxyMode a #WebKitNetworkProxyMode
     * @param proxySettings a #WebKitNetworkProxySettings, or null
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun setProxySettings(proxyMode: NetworkProxyMode, proxySettings: NetworkProxySettings? = null): Unit =
        webkit_network_session_set_proxy_settings(
            webkitNetworkSessionPointer,
            proxyMode.nativeValue,
            proxySettings?.gPointer
        )

    /**
     * Set the TLS errors policy of @session as @policy.
     *
     * @param policy a #WebKitTLSErrorsPolicy
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun setTlsErrorsPolicy(policy: TlsErrorsPolicy): Unit =
        webkit_network_session_set_tls_errors_policy(webkitNetworkSessionPointer, policy.nativeValue)

    /**
     * This signal is emitted when a new download request is made.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `download` the #WebKitDownload associated with this event
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun onDownloadStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (download: Download) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "download-started",
        onDownloadStartedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "download-started" signal. See [onDownloadStarted].
     *
     * @param download the #WebKitDownload associated with this event
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun emitDownloadStarted(download: Download) {
        g_signal_emit_by_name(gPointer.reinterpret(), "download-started", download.webkitDownloadPointer)
    }

    public companion object : TypeCompanion<NetworkSession> {
        override val type: GeneratedClassKGType<NetworkSession> =
            GeneratedClassKGType(webkit_network_session_get_type()) { NetworkSession(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the default network session.
         * The default network session is created using webkit_network_session_new() and passing
         * null as data and cache directories.
         *
         * @return a #WebKitNetworkSession
         * @since 2.40
         */
        @WebKitVersion2_40
        public fun getDefault(): NetworkSession = webkit_network_session_get_default()!!.run {
            NetworkSession(this)
        }

        /**
         * Sets @settings as the #WebKitMemoryPressureSettings.
         *
         * Sets @settings as the #WebKitMemoryPressureSettings to be used by the network
         * process created by any instance of #WebKitNetworkSession after this function
         * is called.
         *
         * Be sure to call this function before creating any #WebKitNetworkSession.
         *
         * The periodic check for used memory is disabled by default on network processes. This will
         * be enabled only if custom settings have been set using this function. After that, in order
         * to remove the custom settings and disable the periodic check, this function must be called
         * passing null as the value of @settings.
         *
         * @param settings a WebKitMemoryPressureSettings.
         * @since 2.40
         */
        @WebKitVersion2_40
        public fun setMemoryPressureSettings(settings: MemoryPressureSettings): Unit =
            webkit_network_session_set_memory_pressure_settings(settings.gPointer)

        /**
         * Get the GType of NetworkSession
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_network_session_get_type()
    }
}

private val onDownloadStartedFunc: CPointer<CFunction<(CPointer<WebKitDownload>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            download: CPointer<WebKitDownload>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(download: Download) -> Unit>().get().invoke(
            download!!.run {
                Download(this)
            }
        )
    }
        .reinterpret()
