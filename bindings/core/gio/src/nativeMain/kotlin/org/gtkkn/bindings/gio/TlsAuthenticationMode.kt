// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.native.gio.GTlsAuthenticationMode
import org.gtkkn.native.gio.g_tls_authentication_mode_get_type
import org.gtkkn.native.gobject.GType

/**
 * The client authentication mode for a #GTlsServerConnection.
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsAuthenticationMode(public val nativeValue: GTlsAuthenticationMode) {
    /**
     * client authentication not required
     */
    NONE(GTlsAuthenticationMode.G_TLS_AUTHENTICATION_NONE),

    /**
     * client authentication is requested
     */
    REQUESTED(GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUESTED),

    /**
     * client authentication is required
     */
    REQUIRED(GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUIRED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsAuthenticationMode): TlsAuthenticationMode = when (nativeValue) {
            GTlsAuthenticationMode.G_TLS_AUTHENTICATION_NONE -> NONE
            GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUESTED -> REQUESTED
            GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUIRED -> REQUIRED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TlsAuthenticationMode
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_authentication_mode_get_type()
    }
}
