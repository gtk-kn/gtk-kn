// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.native.gio.GTlsCertificateRequestFlags
import org.gtkkn.native.gio.g_tls_certificate_request_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags for g_tls_interaction_request_certificate(),
 * g_tls_interaction_request_certificate_async(), and
 * g_tls_interaction_invoke_request_certificate().
 * @since 2.40
 */
@GioVersion2_40
public enum class TlsCertificateRequestFlags(public val nativeValue: GTlsCertificateRequestFlags) {
    /**
     * No flags
     */
    NONE(GTlsCertificateRequestFlags.G_TLS_CERTIFICATE_REQUEST_NONE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsCertificateRequestFlags): TlsCertificateRequestFlags =
            when (nativeValue) {
                GTlsCertificateRequestFlags.G_TLS_CERTIFICATE_REQUEST_NONE -> NONE
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of TlsCertificateRequestFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_certificate_request_flags_get_type()
    }
}
