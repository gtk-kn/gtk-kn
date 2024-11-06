// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.native.gio.GTlsRehandshakeMode
import org.gtkkn.native.gio.GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER
import org.gtkkn.native.gio.GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY
import org.gtkkn.native.gio.GTlsRehandshakeMode.G_TLS_REHANDSHAKE_UNSAFELY

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsRehandshakeMode(
    public val nativeValue: GTlsRehandshakeMode,
) {
    /**
     * Never allow rehandshaking
     */
    NEVER(G_TLS_REHANDSHAKE_NEVER),

    /**
     * Allow safe rehandshaking only
     */
    SAFELY(G_TLS_REHANDSHAKE_SAFELY),

    /**
     * Allow unsafe rehandshaking
     */
    UNSAFELY(G_TLS_REHANDSHAKE_UNSAFELY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsRehandshakeMode): TlsRehandshakeMode =
            when (nativeValue) {
                G_TLS_REHANDSHAKE_NEVER -> NEVER
                G_TLS_REHANDSHAKE_SAFELY -> SAFELY
                G_TLS_REHANDSHAKE_UNSAFELY -> UNSAFELY
                else -> error("invalid nativeValue")
            }
    }
}
