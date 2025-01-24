// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitAuthenticationScheme
import org.gtkkn.native.webkit.webkit_authentication_scheme_get_type

/**
 * Enum values representing the authentication scheme.
 * @since 2.2
 */
@WebKitVersion2_2
public enum class AuthenticationScheme(public val nativeValue: WebKitAuthenticationScheme) {
    /**
     * The default authentication scheme of WebKit.
     */
    DEFAULT(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_DEFAULT),

    /**
     * Basic authentication scheme as defined in RFC 2617.
     */
    HTTP_BASIC(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_HTTP_BASIC),

    /**
     * Digest authentication scheme as defined in RFC 2617.
     */
    HTTP_DIGEST(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_HTTP_DIGEST),

    /**
     * HTML Form authentication.
     */
    HTML_FORM(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_HTML_FORM),

    /**
     * NTLM Microsoft proprietary authentication scheme.
     */
    NTLM(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_NTLM),

    /**
     * Negotiate (or SPNEGO) authentication scheme as defined in RFC 4559.
     */
    NEGOTIATE(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_NEGOTIATE),

    /**
     * Client Certificate Authentication (see RFC 2246).
     */
    CLIENT_CERTIFICATE_REQUESTED(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_CLIENT_CERTIFICATE_REQUESTED),

    /**
     * Server Trust Authentication.
     */
    SERVER_TRUST_EVALUATION_REQUESTED(
        WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_SERVER_TRUST_EVALUATION_REQUESTED
    ),

    /**
     * Client certificate PIN required for use. Since: 2.34
     */
    CLIENT_CERTIFICATE_PIN_REQUESTED(
        WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_CLIENT_CERTIFICATE_PIN_REQUESTED
    ),

    /**
     * Authentication scheme unknown.
     */
    UNKNOWN(WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_UNKNOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitAuthenticationScheme): AuthenticationScheme = when (nativeValue) {
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_DEFAULT -> DEFAULT
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_HTTP_BASIC -> HTTP_BASIC
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_HTTP_DIGEST -> HTTP_DIGEST
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_HTML_FORM -> HTML_FORM
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_NTLM -> NTLM
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_NEGOTIATE -> NEGOTIATE
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_CLIENT_CERTIFICATE_REQUESTED -> CLIENT_CERTIFICATE_REQUESTED
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_SERVER_TRUST_EVALUATION_REQUESTED -> SERVER_TRUST_EVALUATION_REQUESTED
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_CLIENT_CERTIFICATE_PIN_REQUESTED -> CLIENT_CERTIFICATE_PIN_REQUESTED
            WebKitAuthenticationScheme.WEBKIT_AUTHENTICATION_SCHEME_UNKNOWN -> UNKNOWN
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of AuthenticationScheme
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_authentication_scheme_get_type()
    }
}
