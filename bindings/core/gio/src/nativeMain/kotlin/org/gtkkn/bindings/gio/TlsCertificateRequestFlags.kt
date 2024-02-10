// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GTlsCertificateRequestFlags
import org.gtkkn.native.gio.GTlsCertificateRequestFlags.G_TLS_CERTIFICATE_REQUEST_NONE

/**
 * Flags for g_tls_interaction_request_certificate(),
 * g_tls_interaction_request_certificate_async(), and
 * g_tls_interaction_invoke_request_certificate().
 * @since 2.40
 */
public enum class TlsCertificateRequestFlags(
    public val nativeValue: GTlsCertificateRequestFlags,
) {
    /**
     * No flags
     */
    NONE(G_TLS_CERTIFICATE_REQUEST_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsCertificateRequestFlags): TlsCertificateRequestFlags =
            when (nativeValue) {
                G_TLS_CERTIFICATE_REQUEST_NONE -> NONE
                else -> error("invalid nativeValue")
            }
    }
}
