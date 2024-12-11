// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.native.gio.GTlsDatabaseLookupFlags
import org.gtkkn.native.gio.g_tls_database_lookup_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags for g_tls_database_lookup_certificate_for_handle(),
 * g_tls_database_lookup_certificate_issuer(),
 * and g_tls_database_lookup_certificates_issued_by().
 * @since 2.30
 */
@GioVersion2_30
public enum class TlsDatabaseLookupFlags(public val nativeValue: GTlsDatabaseLookupFlags) {
    /**
     * No lookup flags
     */
    NONE(GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_NONE),

    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    KEYPAIR(GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_KEYPAIR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsDatabaseLookupFlags): TlsDatabaseLookupFlags = when (nativeValue) {
            GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_NONE -> NONE
            GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_KEYPAIR -> KEYPAIR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TlsDatabaseLookupFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_database_lookup_flags_get_type()
    }
}
