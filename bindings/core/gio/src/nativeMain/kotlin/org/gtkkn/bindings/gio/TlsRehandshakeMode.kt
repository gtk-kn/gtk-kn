// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.native.gio.GTlsRehandshakeMode
import org.gtkkn.native.gio.g_tls_rehandshake_mode_get_type
import org.gtkkn.native.gobject.GType

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.60..
 *
 * Changing the rehandshake mode is no longer
 *   required for compatibility. Also, rehandshaking has been removed
 *   from the TLS protocol in TLS 1.3.
 * ---
 *
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 * @since 2.28
 */
@GioVersion2_28
public enum class TlsRehandshakeMode(public val nativeValue: GTlsRehandshakeMode) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.60..
     *
     * Changing the rehandshake mode is no longer
     *   required for compatibility. Also, rehandshaking has been removed
     *   from the TLS protocol in TLS 1.3.
     * ---
     *
     * Never allow rehandshaking
     */
    NEVER(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_NEVER),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.60..
     *
     * Changing the rehandshake mode is no longer
     *   required for compatibility. Also, rehandshaking has been removed
     *   from the TLS protocol in TLS 1.3.
     * ---
     *
     * Allow safe rehandshaking only
     */
    SAFELY(GTlsRehandshakeMode.G_TLS_REHANDSHAKE_SAFELY),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.60..
     *
     * Changing the rehandshake mode is no longer
     *   required for compatibility. Also, rehandshaking has been removed
     *   from the TLS protocol in TLS 1.3.
     * ---
     *
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
