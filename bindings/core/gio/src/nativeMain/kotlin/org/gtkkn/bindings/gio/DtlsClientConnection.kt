// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_48
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.GDtlsClientConnection
import org.gtkkn.native.gio.GDtlsConnection
import org.gtkkn.native.gio.g_dtls_client_connection_get_accepted_cas
import org.gtkkn.native.gio.g_dtls_client_connection_get_server_identity
import org.gtkkn.native.gio.g_dtls_client_connection_get_type
import org.gtkkn.native.gio.g_dtls_client_connection_get_validation_flags
import org.gtkkn.native.gio.g_dtls_client_connection_new
import org.gtkkn.native.gio.g_dtls_client_connection_set_server_identity
import org.gtkkn.native.gio.g_dtls_client_connection_set_validation_flags
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.Unit

/**
 * `GDtlsClientConnection` is the client-side subclass of
 * [iface@Gio.DtlsConnection], representing a client-side DTLS connection.
 * @since 2.48
 */
@GioVersion2_48
public interface DtlsClientConnection :
    Proxy,
    DatagramBased,
    DtlsConnection,
    KGTyped {
    public val gioDtlsClientConnectionPointer: CPointer<GDtlsClientConnection>

    override val gioDatagramBasedPointer: CPointer<GDatagramBased>
        get() = gioDtlsClientConnectionPointer.reinterpret()

    override val gioDtlsConnectionPointer: CPointer<GDtlsConnection>
        get() = gioDtlsClientConnectionPointer.reinterpret()

    /**
     * A list of the distinguished names of the Certificate Authorities
     * that the server will accept client certificates signed by. If the
     * server requests a client certificate during the handshake, then
     * this property will be set after the handshake completes.
     *
     * Each item in the list is a #GByteArray which contains the complete
     * subject DN of the certificate authority.
     *
     * @since 2.48
     */
    @GioVersion2_48
    public val acceptedCas: List
        /**
         * Gets the list of distinguished names of the Certificate Authorities
         * that the server will accept certificates from. This will be set
         * during the TLS handshake if the server requests a certificate.
         * Otherwise, it will be null.
         *
         * Each item in the list is a #GByteArray which contains the complete
         * subject DN of the certificate authority.
         *
         * @return the list of
         * CA DNs. You should unref each element with g_byte_array_unref() and then
         * the free the list with g_list_free().
         * @since 2.48
         */
        get() = g_dtls_client_connection_get_accepted_cas(gioDtlsClientConnectionPointer)!!.run {
            List(this)
        }

    /**
     * A #GSocketConnectable describing the identity of the server that
     * is expected on the other end of the connection.
     *
     * If the %G_TLS_CERTIFICATE_BAD_IDENTITY flag is set in
     * #GDtlsClientConnection:validation-flags, this object will be used
     * to determine the expected identify of the remote end of the
     * connection; if #GDtlsClientConnection:server-identity is not set,
     * or does not match the identity presented by the server, then the
     * %G_TLS_CERTIFICATE_BAD_IDENTITY validation will fail.
     *
     * In addition to its use in verifying the server certificate,
     * this is also used to give a hint to the server about what
     * certificate we expect, which is useful for servers that serve
     * virtual hosts.
     *
     * @since 2.48
     */
    @GioVersion2_48
    public var serverIdentity: SocketConnectable
        /**
         * Gets @conn's expected server identity
         *
         * @return a #GSocketConnectable describing the
         * expected server identity, or null if the expected identity is not
         * known.
         * @since 2.48
         */
        get() = g_dtls_client_connection_get_server_identity(gioDtlsClientConnectionPointer)!!.run {
            SocketConnectable.SocketConnectableImpl(reinterpret())
        }

        /**
         * Sets @conn's expected server identity, which is used both to tell
         * servers on virtual hosts which certificate to present, and also
         * to let @conn know what name to look for in the certificate when
         * performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
         *
         * @param identity a #GSocketConnectable describing the expected server identity
         * @since 2.48
         */
        @GioVersion2_48
        set(
            identity
        ) = g_dtls_client_connection_set_server_identity(
            gioDtlsClientConnectionPointer,
            identity.gioSocketConnectablePointer
        )

    /**
     * What steps to perform when validating a certificate received from
     * a server. Server certificates that fail to validate in any of the
     * ways indicated here will be rejected unless the application
     * overrides the default via #GDtlsConnection::accept-certificate.
     *
     * GLib guarantees that if certificate verification fails, at least one
     * flag will be set, but it does not guarantee that all possible flags
     * will be set. Accordingly, you may not safely decide to ignore any
     * particular type of error. For example, it would be incorrect to mask
     * %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired certificates,
     * because this could potentially be the only error flag set even if
     * other problems exist with the certificate. Therefore, there is no
     * safe way to use this property. This is not a horrible problem,
     * though, because you should not be attempting to ignore validation
     * errors anyway. If you really must ignore TLS certificate errors,
     * connect to #GDtlsConnection::accept-certificate.
     *
     * @since 2.48
     */
    @GioVersion2_48
    public var validationFlags: TlsCertificateFlags
        /**
         * Gets @conn's validation flags
         *
         * This function does not work as originally designed and is impossible
         * to use correctly. See #GDtlsClientConnection:validation-flags for more
         * information.
         *
         * @return the validation flags
         * @since 2.48
         */
        get() = g_dtls_client_connection_get_validation_flags(gioDtlsClientConnectionPointer).run {
            TlsCertificateFlags(this)
        }

        /**
         * Sets @conn's validation flags, to override the default set of
         * checks performed when validating a server certificate. By default,
         * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
         *
         * This function does not work as originally designed and is impossible
         * to use correctly. See #GDtlsClientConnection:validation-flags for more
         * information.
         *
         * @param flags the #GTlsCertificateFlags to use
         * @since 2.48
         */
        @GioVersion2_48
        set(flags) = g_dtls_client_connection_set_validation_flags(gioDtlsClientConnectionPointer, flags.mask)

    /**
     * Gets the list of distinguished names of the Certificate Authorities
     * that the server will accept certificates from. This will be set
     * during the TLS handshake if the server requests a certificate.
     * Otherwise, it will be null.
     *
     * Each item in the list is a #GByteArray which contains the complete
     * subject DN of the certificate authority.
     *
     * @return the list of
     * CA DNs. You should unref each element with g_byte_array_unref() and then
     * the free the list with g_list_free().
     * @since 2.48
     */
    @GioVersion2_48
    public fun getAcceptedCas(): List =
        g_dtls_client_connection_get_accepted_cas(gioDtlsClientConnectionPointer)!!.run {
            List(this)
        }

    /**
     * Gets @conn's expected server identity
     *
     * @return a #GSocketConnectable describing the
     * expected server identity, or null if the expected identity is not
     * known.
     * @since 2.48
     */
    @GioVersion2_48
    public fun getServerIdentity(): SocketConnectable =
        g_dtls_client_connection_get_server_identity(gioDtlsClientConnectionPointer)!!.run {
            SocketConnectable.SocketConnectableImpl(reinterpret())
        }

    /**
     * Gets @conn's validation flags
     *
     * This function does not work as originally designed and is impossible
     * to use correctly. See #GDtlsClientConnection:validation-flags for more
     * information.
     *
     * @return the validation flags
     * @since 2.48
     */
    @GioVersion2_48
    public fun getValidationFlags(): TlsCertificateFlags =
        g_dtls_client_connection_get_validation_flags(gioDtlsClientConnectionPointer).run {
            TlsCertificateFlags(this)
        }

    /**
     * Sets @conn's expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let @conn know what name to look for in the certificate when
     * performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
     *
     * @param identity a #GSocketConnectable describing the expected server identity
     * @since 2.48
     */
    @GioVersion2_48
    public fun setServerIdentity(identity: SocketConnectable): Unit = g_dtls_client_connection_set_server_identity(
        gioDtlsClientConnectionPointer,
        identity.gioSocketConnectablePointer
    )

    /**
     * Sets @conn's validation flags, to override the default set of
     * checks performed when validating a server certificate. By default,
     * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
     *
     * This function does not work as originally designed and is impossible
     * to use correctly. See #GDtlsClientConnection:validation-flags for more
     * information.
     *
     * @param flags the #GTlsCertificateFlags to use
     * @since 2.48
     */
    @GioVersion2_48
    public fun setValidationFlags(flags: TlsCertificateFlags): Unit =
        g_dtls_client_connection_set_validation_flags(gioDtlsClientConnectionPointer, flags.mask)

    /**
     * The DtlsClientConnectionImpl type represents a native instance of the DtlsClientConnection interface.
     *
     * @constructor Creates a new instance of DtlsClientConnection for the provided [CPointer].
     */
    public data class DtlsClientConnectionImpl(
        override val gioDtlsClientConnectionPointer: CPointer<GDtlsClientConnection>,
    ) : Object(gioDtlsClientConnectionPointer.reinterpret()),
        DtlsClientConnection

    public companion object : TypeCompanion<DtlsClientConnection> {
        override val type: GeneratedInterfaceKGType<DtlsClientConnection> =
            GeneratedInterfaceKGType(g_dtls_client_connection_get_type()) {
                DtlsClientConnectionImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GDtlsClientConnection wrapping @base_socket which is
         * assumed to communicate with the server identified by @server_identity.
         *
         * @param baseSocket the #GDatagramBased to wrap
         * @param serverIdentity the expected identity of the server
         * @return the new
         *   #GDtlsClientConnection, or null on error
         * @since 2.48
         */
        @GioVersion2_48
        public fun new(
            baseSocket: DatagramBased,
            serverIdentity: SocketConnectable? = null,
        ): Result<DtlsClientConnection> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dtls_client_connection_new(
                baseSocket.gioDatagramBasedPointer,
                serverIdentity?.gioSocketConnectablePointer,
                gError.ptr
            )?.run {
                DtlsClientConnectionImpl(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Get the GType of DtlsClientConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_dtls_client_connection_get_type()
    }
}
