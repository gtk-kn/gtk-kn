// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GTlsPasswordFlags
import org.gtkkn.native.gio.G_TLS_PASSWORD_FINAL_TRY
import org.gtkkn.native.gio.G_TLS_PASSWORD_MANY_TRIES
import org.gtkkn.native.gio.G_TLS_PASSWORD_NONE
import org.gtkkn.native.gio.G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC
import org.gtkkn.native.gio.G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER
import org.gtkkn.native.gio.G_TLS_PASSWORD_PKCS11_USER
import org.gtkkn.native.gio.G_TLS_PASSWORD_RETRY
import org.gtkkn.native.gio.g_tls_password_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Various flags for the password.
 * @since 2.30
 */
public class TlsPasswordFlags(public val mask: GTlsPasswordFlags) : Bitfield<TlsPasswordFlags> {
    override infix fun or(other: TlsPasswordFlags): TlsPasswordFlags = TlsPasswordFlags(mask or other.mask)

    @GioVersion2_30
    public companion object {
        /**
         * No flags
         */
        public val NONE: TlsPasswordFlags = TlsPasswordFlags(G_TLS_PASSWORD_NONE)

        /**
         * The password was wrong, and the user should retry.
         */
        public val RETRY: TlsPasswordFlags = TlsPasswordFlags(G_TLS_PASSWORD_RETRY)

        /**
         * Hint to the user that the password has been
         *    wrong many times, and the user may not have many chances left.
         */
        public val MANY_TRIES: TlsPasswordFlags = TlsPasswordFlags(G_TLS_PASSWORD_MANY_TRIES)

        /**
         * Hint to the user that this is the last try to get
         *    this password right.
         */
        public val FINAL_TRY: TlsPasswordFlags = TlsPasswordFlags(G_TLS_PASSWORD_FINAL_TRY)

        /**
         * For PKCS #11, the user PIN is required.
         *    Since: 2.70.
         */
        public val PKCS11_USER: TlsPasswordFlags = TlsPasswordFlags(G_TLS_PASSWORD_PKCS11_USER)

        /**
         * For PKCS #11, the security officer
         *    PIN is required. Since: 2.70.
         */
        public val PKCS11_SECURITY_OFFICER: TlsPasswordFlags =
            TlsPasswordFlags(G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER)

        /**
         * For PKCS #11, the context-specific
         *    PIN is required. Since: 2.70.
         */
        public val PKCS11_CONTEXT_SPECIFIC: TlsPasswordFlags =
            TlsPasswordFlags(G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC)

        /**
         * Get the GType of TlsPasswordFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_password_flags_get_type()
    }
}
