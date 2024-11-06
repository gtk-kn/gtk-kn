// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gio.GTlsError
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_BAD_CERTIFICATE
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_CERTIFICATE_REQUIRED
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_EOF
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_HANDSHAKE
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_INAPPROPRIATE_FALLBACK
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_MISC
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_NOT_TLS
import org.gtkkn.native.gio.GTlsError.G_TLS_ERROR_UNAVAILABLE
import org.gtkkn.native.gio.g_tls_error_quark
import kotlin.UInt

/**
 * An error code used with %G_TLS_ERROR in a #GError returned from a
 * TLS-related routine.
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsError(
    public val nativeValue: GTlsError,
) {
    /**
     * No TLS provider is available
     */
    UNAVAILABLE(G_TLS_ERROR_UNAVAILABLE),

    /**
     * Miscellaneous TLS error
     */
    MISC(G_TLS_ERROR_MISC),

    /**
     * The certificate presented could not
     *   be parsed or failed validation.
     */
    BAD_CERTIFICATE(G_TLS_ERROR_BAD_CERTIFICATE),

    /**
     * The TLS handshake failed because the
     *   peer does not seem to be a TLS server.
     */
    NOT_TLS(G_TLS_ERROR_NOT_TLS),

    /**
     * The TLS handshake failed because the
     *   peer's certificate was not acceptable.
     */
    HANDSHAKE(G_TLS_ERROR_HANDSHAKE),

    /**
     * The TLS handshake failed because
     *   the server requested a client-side certificate, but none was
     *   provided. See g_tls_connection_set_certificate().
     */
    CERTIFICATE_REQUIRED(G_TLS_ERROR_CERTIFICATE_REQUIRED),

    /**
     * The TLS connection was closed without proper
     *   notice, which may indicate an attack. See
     *   g_tls_connection_set_require_close_notify().
     */
    EOF(G_TLS_ERROR_EOF),

    /**
     * The TLS handshake failed
     *   because the client sent the fallback SCSV, indicating a protocol
     *   downgrade attack. Since: 2.60
     */
    INAPPROPRIATE_FALLBACK(G_TLS_ERROR_INAPPROPRIATE_FALLBACK),

    /**
     * The certificate failed
     *   to load because a password was incorrect. Since: 2.72
     */
    BAD_CERTIFICATE_PASSWORD(G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsError): TlsError =
            when (nativeValue) {
                G_TLS_ERROR_UNAVAILABLE -> UNAVAILABLE
                G_TLS_ERROR_MISC -> MISC
                G_TLS_ERROR_BAD_CERTIFICATE -> BAD_CERTIFICATE
                G_TLS_ERROR_NOT_TLS -> NOT_TLS
                G_TLS_ERROR_HANDSHAKE -> HANDSHAKE
                G_TLS_ERROR_CERTIFICATE_REQUIRED -> CERTIFICATE_REQUIRED
                G_TLS_ERROR_EOF -> EOF
                G_TLS_ERROR_INAPPROPRIATE_FALLBACK -> INAPPROPRIATE_FALLBACK
                G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD -> BAD_CERTIFICATE_PASSWORD
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the TLS error quark.
         *
         * @return a #GQuark.
         * @since 2.28
         */
        @GioVersion2_28
        public fun quark(): UInt = g_tls_error_quark()

        public fun fromErrorOrNull(error: Error): TlsError? =
            if (error.domain != quark()) {
                null
            } else {
                TlsError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
