// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.native.gio.GTlsRehandshakeMode
import org.gtkkn.native.gio.g_tls_rehandshake_mode_get_type
import org.gtkkn.native.gobject.GType

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsRehandshakeMode(public val nativeValue: GTlsRehandshakeMode) {
    /**
     * Never allow rehandshaking
     */
    NEVER(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER),

    /**
     * Allow safe rehandshaking only
     */
    SAFELY(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY),

    /**
     * Allow unsafe rehandshaking
     */
    UNSAFELY(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_UNSAFELY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsRehandshakeMode): TlsRehandshakeMode = when (nativeValue) {
            GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER -> NEVER
            GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY -> SAFELY
            GTlsRehandshakeMode.G_TLS_REHANDSHAKE_UNSAFELY -> UNSAFELY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TlsRehandshakeMode
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_rehandshake_mode_get_type()
    }
}
