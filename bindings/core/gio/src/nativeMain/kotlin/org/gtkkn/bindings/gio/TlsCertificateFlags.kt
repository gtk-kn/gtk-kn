// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_BAD_IDENTITY
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_EXPIRED
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_GENERIC_ERROR
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_INSECURE
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_NOT_ACTIVATED
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_REVOKED
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_UNKNOWN_CA
import org.gtkkn.native.gio.G_TLS_CERTIFICATE_VALIDATE_ALL

/**
 * A set of flags describing TLS certification validation. This can be
 * used to describe why a particular certificate was rejected (for
 * example, in #GTlsConnection::accept-certificate).
 *
 * GLib guarantees that if certificate verification fails, at least one
 * flag will be set, but it does not guarantee that all possible flags
 * will be set. Accordingly, you may not safely decide to ignore any
 * particular type of error. For example, it would be incorrect to mask
 * %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired certificates,
 * because this could potentially be the only error flag set even if
 * other problems exist with the certificate.
 * @since 2.28
 */
public class TlsCertificateFlags(
    public val mask: GTlsCertificateFlags,
) : Bitfield<TlsCertificateFlags> {
    override infix fun or(other: TlsCertificateFlags): TlsCertificateFlags = TlsCertificateFlags(mask or other.mask)

    public companion object {
        /**
         * The signing certificate authority is
         *   not known.
         */
        public val UNKNOWN_CA: TlsCertificateFlags =
            TlsCertificateFlags(G_TLS_CERTIFICATE_UNKNOWN_CA)

        /**
         * The certificate does not match the
         *   expected identity of the site that it was retrieved from.
         */
        public val BAD_IDENTITY: TlsCertificateFlags =
            TlsCertificateFlags(G_TLS_CERTIFICATE_BAD_IDENTITY)

        /**
         * The certificate's activation time
         *   is still in the future
         */
        public val NOT_ACTIVATED: TlsCertificateFlags =
            TlsCertificateFlags(G_TLS_CERTIFICATE_NOT_ACTIVATED)

        /**
         * The certificate has expired
         */
        public val EXPIRED: TlsCertificateFlags = TlsCertificateFlags(G_TLS_CERTIFICATE_EXPIRED)

        /**
         * The certificate has been revoked
         *   according to the #GTlsConnection's certificate revocation list.
         */
        public val REVOKED: TlsCertificateFlags = TlsCertificateFlags(G_TLS_CERTIFICATE_REVOKED)

        /**
         * The certificate's algorithm is
         *   considered insecure.
         */
        public val INSECURE: TlsCertificateFlags = TlsCertificateFlags(G_TLS_CERTIFICATE_INSECURE)

        /**
         * Some other error occurred validating
         *   the certificate
         */
        public val GENERIC_ERROR: TlsCertificateFlags =
            TlsCertificateFlags(G_TLS_CERTIFICATE_GENERIC_ERROR)

        /**
         * the combination of all of the above
         *   flags
         */
        public val VALIDATE_ALL: TlsCertificateFlags =
            TlsCertificateFlags(G_TLS_CERTIFICATE_VALIDATE_ALL)
    }
}
