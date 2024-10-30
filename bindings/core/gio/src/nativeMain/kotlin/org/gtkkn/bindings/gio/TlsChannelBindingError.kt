// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gio.GTlsChannelBindingError
import org.gtkkn.native.gio.GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR
import org.gtkkn.native.gio.GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE
import org.gtkkn.native.gio.GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE
import org.gtkkn.native.gio.GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED
import org.gtkkn.native.gio.GTlsChannelBindingError.G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED
import org.gtkkn.native.gio.g_tls_channel_binding_error_quark
import kotlin.UInt

/**
 * An error code used with %G_TLS_CHANNEL_BINDING_ERROR in a #GError to
 * indicate a TLS channel binding retrieval error.
 * @since 2.66
 */
public enum class TlsChannelBindingError(
    public val nativeValue: GTlsChannelBindingError,
) {
    /**
     * Either entire binding
     *    retrieval facility or specific binding type is not implemented in the
     *    TLS backend.
     */
    NOT_IMPLEMENTED(G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED),

    /**
     * The handshake is not yet
     *    complete on the connection which is a strong requirement for any existing
     *    binding type.
     */
    INVALID_STATE(G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE),

    /**
     * Handshake is complete but
     *    binding data is not available. That normally indicates the TLS
     *    implementation failed to provide the binding data. For example, some
     *    implementations do not provide a peer certificate for resumed connections.
     */
    NOT_AVAILABLE(G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE),

    /**
     * Binding type is not supported
     *    on the current connection. This error could be triggered when requesting
     *    `tls-server-end-point` binding data for a certificate which has no hash
     *    function or uses multiple hash functions.
     */
    NOT_SUPPORTED(G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED),

    /**
     * Any other backend error
     *    preventing binding data retrieval.
     */
    GENERAL_ERROR(G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsChannelBindingError): TlsChannelBindingError =
            when (nativeValue) {
                G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED -> NOT_IMPLEMENTED
                G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE -> INVALID_STATE
                G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE -> NOT_AVAILABLE
                G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED -> NOT_SUPPORTED
                G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR -> GENERAL_ERROR
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the TLS channel binding error quark.
         *
         * @return a #GQuark.
         * @since 2.66
         */
        public fun quark(): UInt = g_tls_channel_binding_error_quark()

        public fun fromErrorOrNull(error: Error): TlsChannelBindingError? =
            if (error.domain != quark()) {
                null
            } else {
                TlsChannelBindingError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}