// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gio.GTlsError
import org.gtkkn.native.gio.g_tls_error_get_type
import org.gtkkn.native.gio.g_tls_error_quark
import org.gtkkn.native.gobject.GType

/**
 * An error code used with %G_TLS_ERROR in a #GError returned from a
 * TLS-related routine.
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsError(public val nativeValue: GTlsError) {
    /**
     * No TLS provider is available
     */
    UNAVAILABLE(GTlsError.G_TLS_ERROR_UNAVAILABLE),

    /**
     * Miscellaneous TLS error
     */
    MISC(GTlsError.G_TLS_ERROR_MISC),

    /**
     * The certificate presented could not
     *   be parsed or failed validation.
     */
    BAD_CERTIFICATE(GTlsError.G_TLS_ERROR_BAD_CERTIFICATE),

    /**
     * The TLS handshake failed because the
     *   peer does not seem to be a TLS server.
     */
    NOT_TLS(GTlsError.G_TLS_ERROR_NOT_TLS),

    /**
     * The TLS handshake failed because the
     *   peer's certificate was not acceptable.
     */
    HANDSHAKE(GTlsError.G_TLS_ERROR_HANDSHAKE),

    /**
     * The TLS handshake failed because
     *   the server requested a client-side certificate, but none was
     *   provided. See g_tls_connection_set_certificate().
     */
    CERTIFICATE_REQUIRED(GTlsError.G_TLS_ERROR_CERTIFICATE_REQUIRED),

    /**
     * The TLS connection was closed without proper
     *   notice, which may indicate an attack. See
     *   g_tls_connection_set_require_close_notify().
     */
    EOF(GTlsError.G_TLS_ERROR_EOF),

    /**
     * The TLS handshake failed
     *   because the client sent the fallback SCSV, indicating a protocol
     *   downgrade attack. Since: 2.60
     */
    INAPPROPRIATE_FALLBACK(GTlsError.G_TLS_ERROR_INAPPROPRIATE_FALLBACK),

    /**
     * The certificate failed
     *   to load because a password was incorrect. Since: 2.72
     */
    BAD_CERTIFICATE_PASSWORD(GTlsError.G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsError): TlsError = when (nativeValue) {
            GTlsError.G_TLS_ERROR_UNAVAILABLE -> UNAVAILABLE
            GTlsError.G_TLS_ERROR_MISC -> MISC
            GTlsError.G_TLS_ERROR_BAD_CERTIFICATE -> BAD_CERTIFICATE
            GTlsError.G_TLS_ERROR_NOT_TLS -> NOT_TLS
            GTlsError.G_TLS_ERROR_HANDSHAKE -> HANDSHAKE
            GTlsError.G_TLS_ERROR_CERTIFICATE_REQUIRED -> CERTIFICATE_REQUIRED
            GTlsError.G_TLS_ERROR_EOF -> EOF
            GTlsError.G_TLS_ERROR_INAPPROPRIATE_FALLBACK -> INAPPROPRIATE_FALLBACK
            GTlsError.G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD -> BAD_CERTIFICATE_PASSWORD
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the TLS error quark.
         *
         * @return a #GQuark.
         * @since 2.28
         */
        @GioVersion2_28
        public fun quark(): Quark = g_tls_error_quark()

        /**
         * Get the GType of TlsError
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_error_get_type()

        public fun fromErrorOrNull(error: Error): TlsError? = if (error.domain != quark()) {
            null
        } else {
            TlsError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
