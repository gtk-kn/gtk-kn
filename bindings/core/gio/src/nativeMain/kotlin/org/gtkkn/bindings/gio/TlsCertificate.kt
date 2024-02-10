// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.g_tls_certificate_get_issuer
import org.gtkkn.native.gio.g_tls_certificate_get_issuer_name
import org.gtkkn.native.gio.g_tls_certificate_get_not_valid_after
import org.gtkkn.native.gio.g_tls_certificate_get_not_valid_before
import org.gtkkn.native.gio.g_tls_certificate_get_subject_name
import org.gtkkn.native.gio.g_tls_certificate_get_type
import org.gtkkn.native.gio.g_tls_certificate_is_same
import org.gtkkn.native.gio.g_tls_certificate_list_new_from_file
import org.gtkkn.native.gio.g_tls_certificate_new_from_file
import org.gtkkn.native.gio.g_tls_certificate_new_from_file_with_password
import org.gtkkn.native.gio.g_tls_certificate_new_from_files
import org.gtkkn.native.gio.g_tls_certificate_new_from_pem
import org.gtkkn.native.gio.g_tls_certificate_new_from_pkcs11_uris
import org.gtkkn.native.gio.g_tls_certificate_verify
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.Throws

/**
 * A certificate used for TLS authentication and encryption.
 * This can represent either a certificate only (eg, the certificate
 * received by a client from a server), or the combination of
 * a certificate and a private key (which is needed when acting as a
 * #GTlsServerConnection).
 *
 * ## Skipped during bindings generation
 *
 * - method `get_dns_names`: Array parameter of type GLib.Bytes is not supported
 * - method `get_ip_addresses`: Array parameter of type InetAddress is not supported
 * - method `certificate`: Property has no getter nor setter
 * - method `certificate-pem`: Property has no getter nor setter
 * - method `dns-names`: Property has no getter nor setter
 * - method `ip-addresses`: Property has no getter nor setter
 * - method `password`: Property has no getter nor setter
 * - method `pkcs11-uri`: Property has no getter nor setter
 * - method `pkcs12-data`: Property has no getter nor setter
 * - method `private-key`: Property has no getter nor setter
 * - method `private-key-pem`: Property has no getter nor setter
 * - method `private-key-pkcs11-uri`: Property has no getter nor setter
 * - parameter `data`: guint8
 *
 * @since 2.28
 */
public open class TlsCertificate(
    pointer: CPointer<GTlsCertificate>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gioTlsCertificatePointer: CPointer<GTlsCertificate>
        get() = gPointer.reinterpret()

    /**
     * A #GTlsCertificate representing the entity that issued this
     * certificate. If null, this means that the certificate is either
     * self-signed, or else the certificate of the issuer is not
     * available.
     *
     * Beware the issuer certificate may not be the same as the
     * certificate that would actually be used to construct a valid
     * certification path during certificate verification.
     * [RFC 4158](https://datatracker.ietf.org/doc/html/rfc4158) explains
     * why an issuer certificate cannot be naively assumed to be part of the
     * the certification path (though GLib's TLS backends may not follow the
     * path building strategies outlined in this RFC). Due to the complexity
     * of certification path building, GLib does not provide any way to know
     * which certification path will actually be used. Accordingly, this
     * property cannot be used to make security-related decisions. Only
     * GLib itself should make security decisions about TLS certificates.
     *
     * @since 2.28
     */
    public open val issuer: TlsCertificate?
        /**
         * Gets the #GTlsCertificate representing @cert's issuer, if known
         *
         * @return The certificate of @cert's issuer,
         * or null if @cert is self-signed or signed with an unknown
         * certificate.
         * @since 2.28
         */
        get() =
            g_tls_certificate_get_issuer(gioTlsCertificatePointer.reinterpret())?.run {
                TlsCertificate(reinterpret())
            }

    /**
     * The issuer from the certificate,
     * null if unavailable.
     *
     * @since 2.70
     */
    public open val issuerName: String
        /**
         * Returns the issuer name from the certificate.
         *
         * @return The issuer name, or null if it's not available.
         * @since 2.70
         */
        get() =
            g_tls_certificate_get_issuer_name(gioTlsCertificatePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * The time at which this cert is no longer valid,
     * null if unavailable.
     *
     * @since 2.70
     */
    public open val notValidAfter: DateTime?
        /**
         * Returns the time at which the certificate became or will become invalid.
         *
         * @return The not-valid-after date, or null if it's not available.
         * @since 2.70
         */
        get() =
            g_tls_certificate_get_not_valid_after(gioTlsCertificatePointer.reinterpret())?.run {
                DateTime(reinterpret())
            }

    /**
     * The time at which this cert is considered to be valid,
     * null if unavailable.
     *
     * @since 2.70
     */
    public open val notValidBefore: DateTime?
        /**
         * Returns the time at which the certificate became or will become valid.
         *
         * @return The not-valid-before date, or null if it's not available.
         * @since 2.70
         */
        get() =
            g_tls_certificate_get_not_valid_before(gioTlsCertificatePointer.reinterpret())?.run {
                DateTime(reinterpret())
            }

    /**
     * The subject from the cert,
     * null if unavailable.
     *
     * @since 2.70
     */
    public open val subjectName: String
        /**
         * Returns the subject name from the certificate.
         *
         * @return The subject name, or null if it's not available.
         * @since 2.70
         */
        get() =
            g_tls_certificate_get_subject_name(gioTlsCertificatePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

    /**
     * Creates a #GTlsCertificate from the data in @file.
     *
     * As of 2.72, if the filename ends in `.p12` or `.pfx` the data is loaded by
     * g_tls_certificate_new_from_pkcs12() otherwise it is loaded by
     * g_tls_certificate_new_from_pem(). See those functions for
     * exact details.
     *
     * If @file cannot be read or parsed, the function will return null and
     * set @error.
     *
     * @param file file containing a certificate to import
     * @return the new certificate, or null on error
     * @since 2.28
     */
    @Throws(GlibException::class)
    public constructor(`file`: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_tls_certificate_new_from_file(`file`, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a #GTlsCertificate from the PEM-encoded data in @cert_file
     * and @key_file. The returned certificate will be the first certificate
     * found in @cert_file. As of GLib 2.44, if @cert_file contains more
     * certificates it will try to load a certificate chain. All
     * certificates will be verified in the order found (top-level
     * certificate should be the last one in the file) and the
     * #GTlsCertificate:issuer property of each certificate will be set
     * accordingly if the verification succeeds. If any certificate in the
     * chain cannot be verified, the first certificate in the file will
     * still be returned.
     *
     * If either file cannot be read or parsed, the function will return
     * null and set @error. Otherwise, this behaves like
     * g_tls_certificate_new_from_pem().
     *
     * @param certFile file containing one or more PEM-encoded
     *     certificates to import
     * @param keyFile file containing a PEM-encoded private key
     *     to import
     * @return the new certificate, or null on error
     * @since 2.28
     */
    @Throws(GlibException::class)
    public constructor(certFile: String, keyFile: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_tls_certificate_new_from_files(certFile, keyFile, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a #GTlsCertificate from the PEM-encoded data in @data. If
     * @data includes both a certificate and a private key, then the
     * returned certificate will include the private key data as well. (See
     * the #GTlsCertificate:private-key-pem property for information about
     * supported formats.)
     *
     * The returned certificate will be the first certificate found in
     * @data. As of GLib 2.44, if @data contains more certificates it will
     * try to load a certificate chain. All certificates will be verified in
     * the order found (top-level certificate should be the last one in the
     * file) and the #GTlsCertificate:issuer property of each certificate
     * will be set accordingly if the verification succeeds. If any
     * certificate in the chain cannot be verified, the first certificate in
     * the file will still be returned.
     *
     * @param data PEM-encoded certificate data
     * @param length the length of @data, or -1 if it's 0-terminated.
     * @return the new certificate, or null if @data is invalid
     * @since 2.28
     */
    @Throws(GlibException::class)
    public constructor(`data`: String, length: Long) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_tls_certificate_new_from_pem(`data`, length, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Creates a #GTlsCertificate from a
     * [PKCS \#11](https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html)
     * URI.
     *
     * An example @pkcs11_uri would be
     * `pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01`
     *
     * Where the token’s layout is:
     *
     * |[
     * Object 0:
     *   URL:
     * pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=private%20key;type=private
     *   Type: Private key (RSA-2048)
     *   ID: 01
     *
     * Object 1:
     *   URL:
     * pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=Certificate%20for%20Authentication;type=cert
     *   Type: X.509 Certificate (RSA-2048)
     *   ID: 01
     * ]|
     *
     * In this case the certificate and private key would both be detected and used as expected.
     * @pkcs_uri may also just reference an X.509 certificate object and then optionally
     * @private_key_pkcs11_uri allows using a private key exposed under a different URI.
     *
     * Note that the private key is not accessed until usage and may fail or require a PIN later.
     *
     * @param pkcs11Uri A PKCS \#11 URI
     * @param privateKeyPkcs11Uri A PKCS \#11 URI
     * @return the new certificate, or null on error
     * @since 2.68
     */
    @Throws(GlibException::class)
    public constructor(pkcs11Uri: String, privateKeyPkcs11Uri: String? = null) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_certificate_new_from_pkcs11_uris(
                    pkcs11Uri,
                    privateKeyPkcs11Uri,
                    gError.ptr
                )
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Gets the #GTlsCertificate representing @cert's issuer, if known
     *
     * @return The certificate of @cert's issuer,
     * or null if @cert is self-signed or signed with an unknown
     * certificate.
     * @since 2.28
     */
    public open fun getIssuer(): TlsCertificate? =
        g_tls_certificate_get_issuer(gioTlsCertificatePointer.reinterpret())?.run {
            TlsCertificate(reinterpret())
        }

    /**
     * Returns the issuer name from the certificate.
     *
     * @return The issuer name, or null if it's not available.
     * @since 2.70
     */
    public open fun getIssuerName(): String =
        g_tls_certificate_get_issuer_name(gioTlsCertificatePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the time at which the certificate became or will become invalid.
     *
     * @return The not-valid-after date, or null if it's not available.
     * @since 2.70
     */
    public open fun getNotValidAfter(): DateTime? =
        g_tls_certificate_get_not_valid_after(gioTlsCertificatePointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Returns the time at which the certificate became or will become valid.
     *
     * @return The not-valid-before date, or null if it's not available.
     * @since 2.70
     */
    public open fun getNotValidBefore(): DateTime? =
        g_tls_certificate_get_not_valid_before(gioTlsCertificatePointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Returns the subject name from the certificate.
     *
     * @return The subject name, or null if it's not available.
     * @since 2.70
     */
    public open fun getSubjectName(): String =
        g_tls_certificate_get_subject_name(gioTlsCertificatePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Check if two #GTlsCertificate objects represent the same certificate.
     * The raw DER byte data of the two certificates are checked for equality.
     * This has the effect that two certificates may compare equal even if
     * their #GTlsCertificate:issuer, #GTlsCertificate:private-key, or
     * #GTlsCertificate:private-key-pem properties differ.
     *
     * @param certTwo second certificate to compare
     * @return whether the same or not
     * @since 2.34
     */
    public open fun isSame(certTwo: TlsCertificate): Boolean =
        g_tls_certificate_is_same(
            gioTlsCertificatePointer.reinterpret(),
            certTwo.gioTlsCertificatePointer.reinterpret()
        ).asBoolean()

    /**
     * This verifies @cert and returns a set of #GTlsCertificateFlags
     * indicating any problems found with it. This can be used to verify a
     * certificate outside the context of making a connection, or to
     * check a certificate against a CA that is not part of the system
     * CA database.
     *
     * If @identity is not null, @cert's name(s) will be compared against
     * it, and %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the return
     * value if it does not match. If @identity is null, that bit will
     * never be set in the return value.
     *
     * If @trusted_ca is not null, then @cert (or one of the certificates
     * in its chain) must be signed by it, or else
     * %G_TLS_CERTIFICATE_UNKNOWN_CA will be set in the return value. If
     * @trusted_ca is null, that bit will never be set in the return
     * value.
     *
     * GLib guarantees that if certificate verification fails, at least one
     * error will be set in the return value, but it does not guarantee
     * that all possible errors will be set. Accordingly, you may not safely
     * decide to ignore any particular type of error. For example, it would
     * be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     *
     * Because TLS session context is not used, #GTlsCertificate may not
     * perform as many checks on the certificates as #GTlsConnection would.
     * For example, certificate constraints may not be honored, and
     * revocation checks may not be performed. The best way to verify TLS
     * certificates used by a TLS connection is to let #GTlsConnection
     * handle the verification.
     *
     * @param identity the expected peer identity
     * @param trustedCa the certificate of a trusted authority
     * @return the appropriate #GTlsCertificateFlags
     * @since 2.28
     */
    public open fun verify(
        identity: SocketConnectable? = null,
        trustedCa: TlsCertificate? = null,
    ): TlsCertificateFlags =
        g_tls_certificate_verify(
            gioTlsCertificatePointer.reinterpret(),
            identity?.gioSocketConnectablePointer,
            trustedCa?.gioTlsCertificatePointer?.reinterpret()
        ).run {
            TlsCertificateFlags(this)
        }

    public companion object : TypeCompanion<TlsCertificate> {
        override val type: GeneratedClassKGType<TlsCertificate> =
            GeneratedClassKGType(g_tls_certificate_get_type()) {
                TlsCertificate(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a #GTlsCertificate from the PEM-encoded data in @cert_file
         * and @key_file. The returned certificate will be the first certificate
         * found in @cert_file. As of GLib 2.44, if @cert_file contains more
         * certificates it will try to load a certificate chain. All
         * certificates will be verified in the order found (top-level
         * certificate should be the last one in the file) and the
         * #GTlsCertificate:issuer property of each certificate will be set
         * accordingly if the verification succeeds. If any certificate in the
         * chain cannot be verified, the first certificate in the file will
         * still be returned.
         *
         * If either file cannot be read or parsed, the function will return
         * null and set @error. Otherwise, this behaves like
         * g_tls_certificate_new_from_pem().
         *
         * @param certFile file containing one or more PEM-encoded
         *     certificates to import
         * @param keyFile file containing a PEM-encoded private key
         *     to import
         * @return the new certificate, or null on error
         * @since 2.28
         */
        public fun newFromFiles(
            certFile: String,
            keyFile: String,
        ): Result<TlsCertificate> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_tls_certificate_new_from_files(certFile, keyFile, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(TlsCertificate(checkNotNull(gResult).reinterpret()))
                }
            }

        /**
         * Creates a #GTlsCertificate from the data in @file.
         *
         * If @file cannot be read or parsed, the function will return null and
         * set @error.
         *
         * Any unknown file types will error with %G_IO_ERROR_NOT_SUPPORTED.
         * Currently only `.p12` and `.pfx` files are supported.
         * See g_tls_certificate_new_from_pkcs12() for more details.
         *
         * @param file file containing a certificate to import
         * @param password password for PKCS #12 files
         * @return the new certificate, or null on error
         * @since 2.72
         */
        public fun newFromFileWithPassword(
            `file`: String,
            password: String,
        ): Result<TlsCertificate> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_tls_certificate_new_from_file_with_password(
                        `file`,
                        password,
                        gError.ptr
                    )
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(TlsCertificate(checkNotNull(gResult).reinterpret()))
                }
            }

        /**
         * Creates one or more #GTlsCertificates from the PEM-encoded
         * data in @file. If @file cannot be read or parsed, the function will
         * return null and set @error. If @file does not contain any
         * PEM-encoded certificates, this will return an empty list and not
         * set @error.
         *
         * @param file file containing PEM-encoded certificates to import
         * @return a
         * #GList containing #GTlsCertificate objects. You must free the list
         * and its contents when you are done with it.
         * @since 2.28
         */
        public fun listNewFromFile(`file`: String): Result<List> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_tls_certificate_list_new_from_file(`file`, gError.ptr)?.run {
                        List(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }
    }
}
