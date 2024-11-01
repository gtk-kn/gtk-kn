// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GTlsDatabaseLookupFlags
import org.gtkkn.native.gio.GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_KEYPAIR
import org.gtkkn.native.gio.GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_NONE

/**
 * Flags for g_tls_database_lookup_certificate_for_handle(),
 * g_tls_database_lookup_certificate_issuer(),
 * and g_tls_database_lookup_certificates_issued_by().
 * @since 2.30
 */
public enum class TlsDatabaseLookupFlags(
    public val nativeValue: GTlsDatabaseLookupFlags,
) {
    /**
     * No lookup flags
     */
    NONE(G_TLS_DATABASE_LOOKUP_NONE),

    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    KEYPAIR(G_TLS_DATABASE_LOOKUP_KEYPAIR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsDatabaseLookupFlags): TlsDatabaseLookupFlags =
            when (nativeValue) {
                G_TLS_DATABASE_LOOKUP_NONE -> NONE
                G_TLS_DATABASE_LOOKUP_KEYPAIR -> KEYPAIR
                else -> error("invalid nativeValue")
            }
    }
}
