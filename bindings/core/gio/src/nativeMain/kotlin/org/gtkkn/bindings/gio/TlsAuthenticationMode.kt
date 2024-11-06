// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.native.gio.GTlsAuthenticationMode
import org.gtkkn.native.gio.GTlsAuthenticationMode.G_TLS_AUTHENTICATION_NONE
import org.gtkkn.native.gio.GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUESTED
import org.gtkkn.native.gio.GTlsAuthenticationMode.G_TLS_AUTHENTICATION_REQUIRED

/**
 * The client authentication mode for a #GTlsServerConnection.
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsAuthenticationMode(
    public val nativeValue: GTlsAuthenticationMode,
) {
    /**
     * client authentication not required
     */
    NONE(G_TLS_AUTHENTICATION_NONE),

    /**
     * client authentication is requested
     */
    REQUESTED(G_TLS_AUTHENTICATION_REQUESTED),

    /**
     * client authentication is required
     */
    REQUIRED(G_TLS_AUTHENTICATION_REQUIRED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsAuthenticationMode): TlsAuthenticationMode =
            when (nativeValue) {
                G_TLS_AUTHENTICATION_NONE -> NONE
                G_TLS_AUTHENTICATION_REQUESTED -> REQUESTED
                G_TLS_AUTHENTICATION_REQUIRED -> REQUIRED
                else -> error("invalid nativeValue")
            }
    }
}
