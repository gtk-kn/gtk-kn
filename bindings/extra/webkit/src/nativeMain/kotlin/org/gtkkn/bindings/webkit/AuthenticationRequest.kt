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
import org.gtkkn.bindings.gio.TlsPasswordFlags
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.webkit.WebKitAuthenticationRequest
import org.gtkkn.native.webkit.WebKitCredential
import org.gtkkn.native.webkit.webkit_authentication_request_authenticate
import org.gtkkn.native.webkit.webkit_authentication_request_can_save_credentials
import org.gtkkn.native.webkit.webkit_authentication_request_cancel
import org.gtkkn.native.webkit.webkit_authentication_request_get_certificate_pin_flags
import org.gtkkn.native.webkit.webkit_authentication_request_get_host
import org.gtkkn.native.webkit.webkit_authentication_request_get_port
import org.gtkkn.native.webkit.webkit_authentication_request_get_proposed_credential
import org.gtkkn.native.webkit.webkit_authentication_request_get_realm
import org.gtkkn.native.webkit.webkit_authentication_request_get_scheme
import org.gtkkn.native.webkit.webkit_authentication_request_get_security_origin
import org.gtkkn.native.webkit.webkit_authentication_request_get_type
import org.gtkkn.native.webkit.webkit_authentication_request_is_for_proxy
import org.gtkkn.native.webkit.webkit_authentication_request_is_retry
import org.gtkkn.native.webkit.webkit_authentication_request_set_can_save_credentials
import org.gtkkn.native.webkit.webkit_authentication_request_set_proposed_credential
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Represents an authentication request.
 *
 * Whenever a client attempts to load a page protected by HTTP
 * authentication, credentials will need to be provided to authorize access.
 * To allow the client to decide how it wishes to handle authentication,
 * WebKit will fire a #WebKitWebView::authenticate signal with a
 * WebKitAuthenticationRequest object to provide client side
 * authentication support. Credentials are exposed through the
 * #WebKitCredential object.
 *
 * In case the client application does not wish
 * to handle this signal WebKit will provide a default handler. To handle
 * authentication asynchronously, simply increase the reference count of the
 * WebKitAuthenticationRequest object.
 */
public class AuthenticationRequest(pointer: CPointer<WebKitAuthenticationRequest>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitAuthenticationRequestPointer: CPointer<WebKitAuthenticationRequest>
        get() = gPointer.reinterpret()

    /**
     * Authenticate the #WebKitAuthenticationRequest.
     *
     * Authenticate the #WebKitAuthenticationRequest using the #WebKitCredential
     * supplied. To continue without credentials, pass null as @credential.
     *
     * @param credential A #WebKitCredential, or null
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun authenticate(credential: Credential? = null): Unit = webkit_authentication_request_authenticate(
        webkitAuthenticationRequestPointer.reinterpret(),
        credential?.webkitCredentialPointer?.reinterpret()
    )

    /**
     * Determine whether this #WebKitAuthenticationRequest should allow the storage of credentials.
     *
     * Determine whether the authentication method associated with this
     * #WebKitAuthenticationRequest should allow the storage of credentials.
     * This will return false if WebKit doesn't support credential storing,
     * if private browsing is enabled, or if persistent credential storage has been
     * disabled in #WebKitWebsiteDataManager, unless credentials saving has been
     * explicitly enabled with webkit_authentication_request_set_can_save_credentials().
     *
     * @return true if WebKit can store credentials or false otherwise.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun canSaveCredentials(): Boolean =
        webkit_authentication_request_can_save_credentials(webkitAuthenticationRequestPointer.reinterpret()).asBoolean()

    /**
     * Cancel the authentication challenge.
     *
     * This will also cancel the page loading and result in a
     * #WebKitWebView::load-failed signal with a #WebKitNetworkError of type %WEBKIT_NETWORK_ERROR_CANCELLED being emitted.
     *
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun cancel(): Unit = webkit_authentication_request_cancel(webkitAuthenticationRequestPointer.reinterpret())

    /**
     * Get the #GTlsPasswordFlags of the %WEBKIT_AUTHENTICATION_SCHEME_CLIENT_CERTIFICATE_PIN_REQUESTED authentication challenge.
     *
     * @return a #GTlsPasswordFlags
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getCertificatePinFlags(): TlsPasswordFlags =
        webkit_authentication_request_get_certificate_pin_flags(webkitAuthenticationRequestPointer.reinterpret()).run {
            TlsPasswordFlags(this)
        }

    /**
     * Get the host that this authentication challenge is applicable to.
     *
     * @return The host of @request.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getHost(): String =
        webkit_authentication_request_get_host(webkitAuthenticationRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the port that this authentication challenge is applicable to.
     *
     * @return The port of @request.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getPort(): guint =
        webkit_authentication_request_get_port(webkitAuthenticationRequestPointer.reinterpret())

    /**
     * Get the #WebKitCredential of the proposed authentication challenge.
     *
     * Get the #WebKitCredential of the proposed authentication challenge that was
     * stored from a previous session. The client can use this directly for
     * authentication or construct their own #WebKitCredential.
     *
     * @return A #WebKitCredential encapsulating credential details
     * or null if there is no stored credential.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getProposedCredential(): Credential =
        webkit_authentication_request_get_proposed_credential(webkitAuthenticationRequestPointer.reinterpret())!!.run {
            Credential(reinterpret())
        }

    /**
     * Get the realm that this authentication challenge is applicable to.
     *
     * @return The realm of @request.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getRealm(): String =
        webkit_authentication_request_get_realm(webkitAuthenticationRequestPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the authentication scheme of the authentication challenge.
     *
     * @return The #WebKitAuthenticationScheme of @request.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getScheme(): AuthenticationScheme =
        webkit_authentication_request_get_scheme(webkitAuthenticationRequestPointer.reinterpret()).run {
            AuthenticationScheme.fromNativeValue(this)
        }

    /**
     * Get the #WebKitSecurityOrigin that this authentication challenge is applicable to.
     *
     * @return a newly created #WebKitSecurityOrigin.
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getSecurityOrigin(): SecurityOrigin =
        webkit_authentication_request_get_security_origin(webkitAuthenticationRequestPointer.reinterpret())!!.run {
            SecurityOrigin(reinterpret())
        }

    /**
     * Determine whether the authentication challenge is associated with a proxy server.
     *
     * Determine whether the authentication challenge is associated with a proxy server rather than an "origin" server.
     *
     * @return true if authentication is for a proxy or false otherwise.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun isForProxy(): Boolean =
        webkit_authentication_request_is_for_proxy(webkitAuthenticationRequestPointer.reinterpret()).asBoolean()

    /**
     * Determine whether this this is a first attempt or a retry for this authentication challenge.
     *
     * @return true if authentication attempt is a retry or false otherwise.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun isRetry(): Boolean =
        webkit_authentication_request_is_retry(webkitAuthenticationRequestPointer.reinterpret()).asBoolean()

    /**
     * Set whether the authentication method associated with @request
     * should allow the storage of credentials.
     *
     * Set whether the authentication method associated with @request
     * should allow the storage of credentials.
     * This should be used by applications handling their own credentials
     * storage to indicate that it should be supported even when internal
     * credential storage is disabled or unsupported.
     * Note that storing of credentials will not be allowed on ephemeral
     * sessions in any case.
     *
     * @param enabled value to set
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun setCanSaveCredentials(enabled: Boolean): Unit = webkit_authentication_request_set_can_save_credentials(
        webkitAuthenticationRequestPointer.reinterpret(),
        enabled.asGBoolean()
    )

    /**
     * Set the #WebKitCredential of the proposed authentication challenge.
     *
     * Set the #WebKitCredential of the proposed authentication challenge that was
     * stored from a previous session. This should only be used by applications handling
     * their own credential storage. (When using the default WebKit credential storage,
     * webkit_authentication_request_get_proposed_credential() already contains previously-stored
     * credentials.)
     * Passing a null @credential will clear the proposed credential.
     *
     * @param credential a #WebKitCredential, or null
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun setProposedCredential(credential: Credential): Unit =
        webkit_authentication_request_set_proposed_credential(
            webkitAuthenticationRequestPointer.reinterpret(),
            credential.webkitCredentialPointer.reinterpret()
        )

    /**
     * This signal is emitted when the user authentication request succeeded.
     * Applications handling their own credential storage should connect to
     * this signal to save the credentials.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `credential` the #WebKitCredential accepted
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun connectAuthenticated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (credential: Credential) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "authenticated",
        connectAuthenticatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted when the user authentication request is
     * cancelled. It allows the application to dismiss its authentication
     * dialog in case of page load failure for example.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun connectCancelled(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cancelled",
            connectCancelledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<AuthenticationRequest> {
        override val type: GeneratedClassKGType<AuthenticationRequest> =
            GeneratedClassKGType(webkit_authentication_request_get_type()) {
                AuthenticationRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of AuthenticationRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_authentication_request_get_type()
    }
}

private val connectAuthenticatedFunc: CPointer<CFunction<(CPointer<WebKitCredential>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            credential: CPointer<WebKitCredential>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(credential: Credential) -> Unit>().get().invoke(
            credential!!.run {
                Credential(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectCancelledFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
