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
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsClientConnection
import org.gtkkn.native.gio.g_tls_client_connection_copy_session_state
import org.gtkkn.native.gio.g_tls_client_connection_get_accepted_cas
import org.gtkkn.native.gio.g_tls_client_connection_get_server_identity
import org.gtkkn.native.gio.g_tls_client_connection_get_type
import org.gtkkn.native.gio.g_tls_client_connection_get_use_ssl3
import org.gtkkn.native.gio.g_tls_client_connection_get_validation_flags
import org.gtkkn.native.gio.g_tls_client_connection_new
import org.gtkkn.native.gio.g_tls_client_connection_set_server_identity
import org.gtkkn.native.gio.g_tls_client_connection_set_use_ssl3
import org.gtkkn.native.gio.g_tls_client_connection_set_validation_flags
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * `GTlsClientConnection` is the client-side subclass of
 * [class@Gio.TlsConnection], representing a client-side TLS connection.
 *
 * ## Skipped during bindings generation
 *
 * - method `server-identity`: Property TypeInfo of getter and setter do not match
 *
 * @since 2.28
 */
@GioVersion2_28
public interface TlsClientConnection :
    Proxy,
    KGTyped {
    public val gioTlsClientConnectionPointer: CPointer<GTlsClientConnection>

    /**
     * A list of the distinguished names of the Certificate Authorities
     * that the server will accept client certificates signed by. If the
     * server requests a client certificate during the handshake, then
     * this property will be set after the handshake completes.
     *
     * Each item in the list is a #GByteArray which contains the complete
     * subject DN of the certificate authority.
     *
     * @since 2.28
     */
    @GioVersion2_28
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
         * @since 2.28
         */
        get() = g_tls_client_connection_get_accepted_cas(gioTlsClientConnectionPointer)!!.run {
            List(this)
        }

    /**
     * SSL 3.0 is no longer supported. See
     * g_tls_client_connection_set_use_ssl3() for details.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public var useSsl3: Boolean
        /**
         * SSL 3.0 is no longer supported. See
         * g_tls_client_connection_set_use_ssl3() for details.
         *
         * @return false
         * @since 2.28
         */
        get() = g_tls_client_connection_get_use_ssl3(gioTlsClientConnectionPointer).asBoolean()

        /**
         * Since GLib 2.42.1, SSL 3.0 is no longer supported.
         *
         * From GLib 2.42.1 through GLib 2.62, this function could be used to
         * force use of TLS 1.0, the lowest-supported TLS protocol version at
         * the time. In the past, this was needed to connect to broken TLS
         * servers that exhibited protocol version intolerance. Such servers
         * are no longer common, and using TLS 1.0 is no longer considered
         * acceptable.
         *
         * Since GLib 2.64, this function does nothing.
         *
         * @param useSsl3 a #gboolean, ignored
         * @since 2.28
         */
        @GioVersion2_28
        set(useSsl3) = g_tls_client_connection_set_use_ssl3(gioTlsClientConnectionPointer, useSsl3.asGBoolean())

    /**
     * What steps to perform when validating a certificate received from
     * a server. Server certificates that fail to validate in any of the
     * ways indicated here will be rejected unless the application
     * overrides the default via #GTlsConnection::accept-certificate.
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
     * connect to #GTlsConnection::accept-certificate.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public var validationFlags: TlsCertificateFlags
        /**
         * Gets @conn's validation flags
         *
         * This function does not work as originally designed and is impossible
         * to use correctly. See #GTlsClientConnection:validation-flags for more
         * information.
         *
         * @return the validation flags
         * @since 2.28
         */
        get() = g_tls_client_connection_get_validation_flags(gioTlsClientConnectionPointer).run {
            TlsCertificateFlags(this)
        }

        /**
         * Sets @conn's validation flags, to override the default set of
         * checks performed when validating a server certificate. By default,
         * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
         *
         * This function does not work as originally designed and is impossible
         * to use correctly. See #GTlsClientConnection:validation-flags for more
         * information.
         *
         * @param flags the #GTlsCertificateFlags to use
         * @since 2.28
         */
        @GioVersion2_28
        set(flags) = g_tls_client_connection_set_validation_flags(gioTlsClientConnectionPointer, flags.mask)

    /**
     * Possibly copies session state from one connection to another, for use
     * in TLS session resumption. This is not normally needed, but may be
     * used when the same session needs to be used between different
     * endpoints, as is required by some protocols, such as FTP over TLS.
     * @source should have already completed a handshake and, since TLS 1.3,
     * it should have been used to read data at least once. @conn should not
     * have completed a handshake.
     *
     * It is not possible to know whether a call to this function will
     * actually do anything. Because session resumption is normally used
     * only for performance benefit, the TLS backend might not implement
     * this function. Even if implemented, it may not actually succeed in
     * allowing @conn to resume @source's TLS session, because the server
     * may not have sent a session resumption token to @source, or it may
     * refuse to accept the token from @conn. There is no way to know
     * whether a call to this function is actually successful.
     *
     * Using this function is not required to benefit from session
     * resumption. If the TLS backend supports session resumption, the
     * session will be resumed automatically if it is possible to do so
     * without weakening the privacy guarantees normally provided by TLS,
     * without need to call this function. For example, with TLS 1.3,
     * a session ticket will be automatically copied from any
     * #GTlsClientConnection that has previously received session tickets
     * from the server, provided a ticket is available that has not
     * previously been used for session resumption, since session ticket
     * reuse would be a privacy weakness. Using this function causes the
     * ticket to be copied without regard for privacy considerations.
     *
     * @param source a #GTlsClientConnection
     * @since 2.46
     */
    @GioVersion2_46
    public fun copySessionState(source: TlsClientConnection): Unit =
        g_tls_client_connection_copy_session_state(gioTlsClientConnectionPointer, source.gioTlsClientConnectionPointer)

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
     * @since 2.28
     */
    @GioVersion2_28
    public fun getAcceptedCas(): List = g_tls_client_connection_get_accepted_cas(gioTlsClientConnectionPointer)!!.run {
        List(this)
    }

    /**
     * Gets @conn's expected server identity
     *
     * @return a #GSocketConnectable describing the
     * expected server identity, or null if the expected identity is not
     * known.
     * @since 2.28
     */
    @GioVersion2_28
    public fun getServerIdentity(): SocketConnectable? =
        g_tls_client_connection_get_server_identity(gioTlsClientConnectionPointer)?.run {
            SocketConnectable.SocketConnectableImpl(reinterpret())
        }

    /**
     * SSL 3.0 is no longer supported. See
     * g_tls_client_connection_set_use_ssl3() for details.
     *
     * @return false
     * @since 2.28
     */
    @GioVersion2_28
    public fun getUseSsl3(): Boolean = g_tls_client_connection_get_use_ssl3(gioTlsClientConnectionPointer).asBoolean()

    /**
     * Gets @conn's validation flags
     *
     * This function does not work as originally designed and is impossible
     * to use correctly. See #GTlsClientConnection:validation-flags for more
     * information.
     *
     * @return the validation flags
     * @since 2.28
     */
    @GioVersion2_28
    public fun getValidationFlags(): TlsCertificateFlags =
        g_tls_client_connection_get_validation_flags(gioTlsClientConnectionPointer).run {
            TlsCertificateFlags(this)
        }

    /**
     * Sets @conn's expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let @conn know what name to look for in the certificate when
     * performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
     *
     * @param identity a #GSocketConnectable describing the expected server identity
     * @since 2.28
     */
    @GioVersion2_28
    public fun setServerIdentity(identity: SocketConnectable): Unit =
        g_tls_client_connection_set_server_identity(gioTlsClientConnectionPointer, identity.gioSocketConnectablePointer)

    /**
     * Since GLib 2.42.1, SSL 3.0 is no longer supported.
     *
     * From GLib 2.42.1 through GLib 2.62, this function could be used to
     * force use of TLS 1.0, the lowest-supported TLS protocol version at
     * the time. In the past, this was needed to connect to broken TLS
     * servers that exhibited protocol version intolerance. Such servers
     * are no longer common, and using TLS 1.0 is no longer considered
     * acceptable.
     *
     * Since GLib 2.64, this function does nothing.
     *
     * @param useSsl3 a #gboolean, ignored
     * @since 2.28
     */
    @GioVersion2_28
    public fun setUseSsl3(useSsl3: Boolean): Unit =
        g_tls_client_connection_set_use_ssl3(gioTlsClientConnectionPointer, useSsl3.asGBoolean())

    /**
     * Sets @conn's validation flags, to override the default set of
     * checks performed when validating a server certificate. By default,
     * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
     *
     * This function does not work as originally designed and is impossible
     * to use correctly. See #GTlsClientConnection:validation-flags for more
     * information.
     *
     * @param flags the #GTlsCertificateFlags to use
     * @since 2.28
     */
    @GioVersion2_28
    public fun setValidationFlags(flags: TlsCertificateFlags): Unit =
        g_tls_client_connection_set_validation_flags(gioTlsClientConnectionPointer, flags.mask)

    /**
     * The TlsClientConnectionImpl type represents a native instance of the TlsClientConnection interface.
     *
     * @constructor Creates a new instance of TlsClientConnection for the provided [CPointer].
     */
    public data class TlsClientConnectionImpl(
        override val gioTlsClientConnectionPointer: CPointer<GTlsClientConnection>,
    ) : TlsConnection(gioTlsClientConnectionPointer.reinterpret()),
        TlsClientConnection

    public companion object : TypeCompanion<TlsClientConnection> {
        override val type: GeneratedInterfaceKGType<TlsClientConnection> =
            GeneratedInterfaceKGType(g_tls_client_connection_get_type()) {
                TlsClientConnectionImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GTlsClientConnection wrapping @base_io_stream (which
         * must have pollable input and output streams) which is assumed to
         * communicate with the server identified by @server_identity.
         *
         * See the documentation for #GTlsConnection:base-io-stream for restrictions
         * on when application code can run operations on the @base_io_stream after
         * this function has returned.
         *
         * @param baseIoStream the #GIOStream to wrap
         * @param serverIdentity the expected identity of the server
         * @return the new
         * #GTlsClientConnection, or null on error
         * @since 2.28
         */
        @GioVersion2_28
        public fun new(baseIoStream: IoStream, serverIdentity: SocketConnectable? = null): Result<TlsClientConnection> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_tls_client_connection_new(
                    baseIoStream.gioIoStreamPointer,
                    serverIdentity?.gioSocketConnectablePointer,
                    gError.ptr
                )?.run {
                    TlsClientConnectionImpl(reinterpret())
                }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Get the GType of TlsClientConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_client_connection_get_type()
    }
}
