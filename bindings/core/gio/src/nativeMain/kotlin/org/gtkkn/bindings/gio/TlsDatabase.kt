// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsDatabase
import org.gtkkn.native.gio.g_tls_database_create_certificate_handle
import org.gtkkn.native.gio.g_tls_database_get_type
import org.gtkkn.native.gio.g_tls_database_lookup_certificate_for_handle
import org.gtkkn.native.gio.g_tls_database_lookup_certificate_for_handle_async
import org.gtkkn.native.gio.g_tls_database_lookup_certificate_for_handle_finish
import org.gtkkn.native.gio.g_tls_database_lookup_certificate_issuer
import org.gtkkn.native.gio.g_tls_database_lookup_certificate_issuer_async
import org.gtkkn.native.gio.g_tls_database_lookup_certificate_issuer_finish
import org.gtkkn.native.gio.g_tls_database_lookup_certificates_issued_by_finish
import org.gtkkn.native.gio.g_tls_database_verify_chain
import org.gtkkn.native.gio.g_tls_database_verify_chain_async
import org.gtkkn.native.gio.g_tls_database_verify_chain_finish
import org.gtkkn.native.glib.GError
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * `GTlsDatabase` is used to look up certificates and other information
 * from a certificate or key store. It is an abstract base class which
 * TLS library specific subtypes override.
 *
 * A `GTlsDatabase` may be accessed from multiple threads by the TLS backend.
 * All implementations are required to be fully thread-safe.
 *
 * Most common client applications will not directly interact with
 * `GTlsDatabase`. It is used internally by [class@Gio.TlsConnection].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `issuer_raw_dn`: guint8
 * - parameter `issuer_raw_dn`: guint8
 *
 * @since 2.30
 */
public open class TlsDatabase(
    pointer: CPointer<GTlsDatabase>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioTlsDatabasePointer: CPointer<GTlsDatabase>
        get() = gPointer.reinterpret()

    /**
     * Create a handle string for the certificate. The database will only be able
     * to create a handle for certificates that originate from the database. In
     * cases where the database cannot create a handle for a certificate, null
     * will be returned.
     *
     * This handle should be stable across various instances of the application,
     * and between applications. If a certificate is modified in the database,
     * then it is not guaranteed that this handle will continue to point to it.
     *
     * @param certificate certificate for which to create a handle.
     * @return a newly allocated string containing the
     * handle.
     * @since 2.30
     */
    public open fun createCertificateHandle(certificate: TlsCertificate): String =
        g_tls_database_create_certificate_handle(
            gioTlsDatabasePointer.reinterpret(),
            certificate.gioTlsCertificatePointer.reinterpret()
        )?.toKString()
            ?: error("Expected not null string")

    /**
     * Look up a certificate by its handle.
     *
     * The handle should have been created by calling
     * g_tls_database_create_certificate_handle() on a #GTlsDatabase object of
     * the same TLS backend. The handle is designed to remain valid across
     * instantiations of the database.
     *
     * If the handle is no longer valid, or does not point to a certificate in
     * this database, then null will be returned.
     *
     * This function can block, use g_tls_database_lookup_certificate_for_handle_async() to perform
     * the lookup operation asynchronously.
     *
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a #GCancellable, or null
     * @return a newly allocated
     * #GTlsCertificate, or null. Use g_object_unref() to release the certificate.
     * @since 2.30
     */
    public open fun lookupCertificateForHandle(
        handle: String,
        interaction: TlsInteraction? = null,
        flags: TlsDatabaseLookupFlags,
        cancellable: Cancellable? = null,
    ): Result<TlsCertificate?> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_lookup_certificate_for_handle(
                    gioTlsDatabasePointer.reinterpret(),
                    handle,
                    interaction?.gioTlsInteractionPointer?.reinterpret(),
                    flags.nativeValue,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    TlsCertificate(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asynchronously look up a certificate by its handle in the database. See
     * g_tls_database_lookup_certificate_for_handle() for more information.
     *
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the operation completes
     * @since 2.30
     */
    public open fun lookupCertificateForHandleAsync(
        handle: String,
        interaction: TlsInteraction? = null,
        flags: TlsDatabaseLookupFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_tls_database_lookup_certificate_for_handle_async(
            gioTlsDatabasePointer.reinterpret(),
            handle,
            interaction?.gioTlsInteractionPointer?.reinterpret(),
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finish an asynchronous lookup of a certificate by its handle. See
     * g_tls_database_lookup_certificate_for_handle() for more information.
     *
     * If the handle is no longer valid, or does not point to a certificate in
     * this database, then null will be returned.
     *
     * @param result a #GAsyncResult.
     * @return a newly allocated #GTlsCertificate object.
     * Use g_object_unref() to release the certificate.
     * @since 2.30
     */
    public open fun lookupCertificateForHandleFinish(result: AsyncResult): Result<TlsCertificate> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_lookup_certificate_for_handle_finish(
                    gioTlsDatabasePointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    TlsCertificate(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Look up the issuer of @certificate in the database. The
     * #GTlsCertificate:issuer property of @certificate is not modified, and
     * the two certificates are not hooked into a chain.
     *
     * This function can block. Use g_tls_database_lookup_certificate_issuer_async()
     * to perform the lookup operation asynchronously.
     *
     * Beware this function cannot be used to build certification paths. The
     * issuer certificate returned by this function may not be the same as
     * the certificate that would actually be used to construct a valid
     * certification path during certificate verification.
     * [RFC 4158](https://datatracker.ietf.org/doc/html/rfc4158) explains
     * why an issuer certificate cannot be naively assumed to be part of the
     * the certification path (though GLib's TLS backends may not follow the
     * path building strategies outlined in this RFC). Due to the complexity
     * of certification path building, GLib does not provide any way to know
     * which certification path will actually be used when verifying a TLS
     * certificate. Accordingly, this function cannot be used to make
     * security-related decisions. Only GLib itself should make security
     * decisions about TLS certificates.
     *
     * @param certificate a #GTlsCertificate
     * @param interaction used to interact with the user if necessary
     * @param flags flags which affect the lookup operation
     * @param cancellable a #GCancellable, or null
     * @return a newly allocated issuer #GTlsCertificate,
     * or null. Use g_object_unref() to release the certificate.
     * @since 2.30
     */
    public open fun lookupCertificateIssuer(
        certificate: TlsCertificate,
        interaction: TlsInteraction? = null,
        flags: TlsDatabaseLookupFlags,
        cancellable: Cancellable? = null,
    ): Result<TlsCertificate> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_lookup_certificate_issuer(
                    gioTlsDatabasePointer.reinterpret(),
                    certificate.gioTlsCertificatePointer.reinterpret(),
                    interaction?.gioTlsInteractionPointer?.reinterpret(),
                    flags.nativeValue,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                )?.run {
                    TlsCertificate(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Asynchronously look up the issuer of @certificate in the database. See
     * g_tls_database_lookup_certificate_issuer() for more information.
     *
     * @param certificate a #GTlsCertificate
     * @param interaction used to interact with the user if necessary
     * @param flags flags which affect the lookup operation
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the operation completes
     * @since 2.30
     */
    public open fun lookupCertificateIssuerAsync(
        certificate: TlsCertificate,
        interaction: TlsInteraction? = null,
        flags: TlsDatabaseLookupFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_tls_database_lookup_certificate_issuer_async(
            gioTlsDatabasePointer.reinterpret(),
            certificate.gioTlsCertificatePointer.reinterpret(),
            interaction?.gioTlsInteractionPointer?.reinterpret(),
            flags.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finish an asynchronous lookup issuer operation. See
     * g_tls_database_lookup_certificate_issuer() for more information.
     *
     * @param result a #GAsyncResult.
     * @return a newly allocated issuer #GTlsCertificate,
     * or null. Use g_object_unref() to release the certificate.
     * @since 2.30
     */
    public open fun lookupCertificateIssuerFinish(result: AsyncResult): Result<TlsCertificate> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_lookup_certificate_issuer_finish(
                    gioTlsDatabasePointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    TlsCertificate(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Finish an asynchronous lookup of certificates. See
     * g_tls_database_lookup_certificates_issued_by() for more information.
     *
     * @param result a #GAsyncResult.
     * @return a newly allocated list of #GTlsCertificate
     * objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
     * @since 2.30
     */
    public open fun lookupCertificatesIssuedByFinish(result: AsyncResult): Result<List> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_lookup_certificates_issued_by_finish(
                    gioTlsDatabasePointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                )?.run {
                    List(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Determines the validity of a certificate chain, outside the context
     * of a TLS session.
     *
     * @chain is a chain of #GTlsCertificate objects each pointing to the next
     * certificate in the chain by its #GTlsCertificate:issuer property.
     *
     * @purpose describes the purpose (or usage) for which the certificate
     * is being used. Typically @purpose will be set to %G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER
     * which means that the certificate is being used to authenticate a server
     * (and we are acting as the client).
     *
     * The @identity is used to ensure the server certificate is valid for
     * the expected peer identity. If the identity does not match the
     * certificate, %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the
     * return value. If @identity is null, that bit will never be set in
     * the return value. The peer identity may also be used to check for
     * pinned certificates (trust exceptions) in the database. These may
     * override the normal verification process on a host-by-host basis.
     *
     * Currently there are no @flags, and %G_TLS_DATABASE_VERIFY_NONE should be
     * used.
     *
     * If @chain is found to be valid, then the return value will be 0. If
     * @chain is found to be invalid, then the return value will indicate at
     * least one problem found. If the function is unable to determine
     * whether @chain is valid (for example, because @cancellable is
     * triggered before it completes) then the return value will be
     * %G_TLS_CERTIFICATE_GENERIC_ERROR and @error will be set accordingly.
     * @error is not set when @chain is successfully analyzed but found to
     * be invalid.
     *
     * GLib guarantees that if certificate verification fails, at least one
     * error will be set in the return value, but it does not guarantee
     * that all possible errors will be set. Accordingly, you may not safely
     * decide to ignore any particular type of error. For example, it would
     * be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     *
     * Prior to GLib 2.48, GLib's default TLS backend modified @chain to
     * represent the certification path built by #GTlsDatabase during
     * certificate verification by adjusting the #GTlsCertificate:issuer
     * property of each certificate in @chain. Since GLib 2.48, this no
     * longer occurs, so you cannot rely on #GTlsCertificate:issuer to
     * represent the actual certification path used during certificate
     * verification.
     *
     * Because TLS session context is not used, #GTlsDatabase may not
     * perform as many checks on the certificates as #GTlsConnection would.
     * For example, certificate constraints may not be honored, and
     * revocation checks may not be performed. The best way to verify TLS
     * certificates used by a TLS connection is to let #GTlsConnection
     * handle the verification.
     *
     * The TLS backend may attempt to look up and add missing certificates
     * to the chain. This may involve HTTP requests to download missing
     * certificates.
     *
     * This function can block. Use g_tls_database_verify_chain_async() to
     * perform the verification operation asynchronously.
     *
     * @param chain a #GTlsCertificate chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a #GCancellable, or null
     * @return the appropriate #GTlsCertificateFlags which represents the
     * result of verification.
     * @since 2.30
     */
    public open fun verifyChain(
        chain: TlsCertificate,
        purpose: String,
        identity: SocketConnectable? = null,
        interaction: TlsInteraction? = null,
        flags: TlsDatabaseVerifyFlags,
        cancellable: Cancellable? = null,
    ): Result<TlsCertificateFlags> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_verify_chain(
                    gioTlsDatabasePointer.reinterpret(),
                    chain.gioTlsCertificatePointer.reinterpret(),
                    purpose,
                    identity?.gioSocketConnectablePointer,
                    interaction?.gioTlsInteractionPointer?.reinterpret(),
                    flags.mask,
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).run {
                    TlsCertificateFlags(this)
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Asynchronously determines the validity of a certificate chain after
     * looking up and adding any missing certificates to the chain. See
     * g_tls_database_verify_chain() for more information.
     *
     * @param chain a #GTlsCertificate chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the operation completes
     * @since 2.30
     */
    public open fun verifyChainAsync(
        chain: TlsCertificate,
        purpose: String,
        identity: SocketConnectable? = null,
        interaction: TlsInteraction? = null,
        flags: TlsDatabaseVerifyFlags,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_tls_database_verify_chain_async(
            gioTlsDatabasePointer.reinterpret(),
            chain.gioTlsCertificatePointer.reinterpret(),
            purpose,
            identity?.gioSocketConnectablePointer,
            interaction?.gioTlsInteractionPointer?.reinterpret(),
            flags.mask,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finish an asynchronous verify chain operation. See
     * g_tls_database_verify_chain() for more information.
     *
     * If @chain is found to be valid, then the return value will be 0. If
     * @chain is found to be invalid, then the return value will indicate
     * the problems found. If the function is unable to determine whether
     * @chain is valid or not (eg, because @cancellable is triggered
     * before it completes) then the return value will be
     * %G_TLS_CERTIFICATE_GENERIC_ERROR and @error will be set
     * accordingly. @error is not set when @chain is successfully analyzed
     * but found to be invalid.
     *
     * @param result a #GAsyncResult.
     * @return the appropriate #GTlsCertificateFlags which represents the
     * result of verification.
     * @since 2.30
     */
    public open fun verifyChainFinish(result: AsyncResult): Result<TlsCertificateFlags> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_tls_database_verify_chain_finish(
                    gioTlsDatabasePointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).run {
                    TlsCertificateFlags(this)
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<TlsDatabase> {
        override val type: GeneratedClassKGType<TlsDatabase> =
            GeneratedClassKGType(g_tls_database_get_type()) { TlsDatabase(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
