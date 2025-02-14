// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_48
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gio.annotations.GioVersion2_70
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.GDtlsConnection
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.gio.g_dtls_connection_close
import org.gtkkn.native.gio.g_dtls_connection_close_async
import org.gtkkn.native.gio.g_dtls_connection_close_finish
import org.gtkkn.native.gio.g_dtls_connection_emit_accept_certificate
import org.gtkkn.native.gio.g_dtls_connection_get_certificate
import org.gtkkn.native.gio.g_dtls_connection_get_ciphersuite_name
import org.gtkkn.native.gio.g_dtls_connection_get_database
import org.gtkkn.native.gio.g_dtls_connection_get_interaction
import org.gtkkn.native.gio.g_dtls_connection_get_negotiated_protocol
import org.gtkkn.native.gio.g_dtls_connection_get_peer_certificate
import org.gtkkn.native.gio.g_dtls_connection_get_peer_certificate_errors
import org.gtkkn.native.gio.g_dtls_connection_get_protocol_version
import org.gtkkn.native.gio.g_dtls_connection_get_rehandshake_mode
import org.gtkkn.native.gio.g_dtls_connection_get_require_close_notify
import org.gtkkn.native.gio.g_dtls_connection_get_type
import org.gtkkn.native.gio.g_dtls_connection_handshake
import org.gtkkn.native.gio.g_dtls_connection_handshake_async
import org.gtkkn.native.gio.g_dtls_connection_handshake_finish
import org.gtkkn.native.gio.g_dtls_connection_set_advertised_protocols
import org.gtkkn.native.gio.g_dtls_connection_set_certificate
import org.gtkkn.native.gio.g_dtls_connection_set_database
import org.gtkkn.native.gio.g_dtls_connection_set_interaction
import org.gtkkn.native.gio.g_dtls_connection_set_rehandshake_mode
import org.gtkkn.native.gio.g_dtls_connection_set_require_close_notify
import org.gtkkn.native.gio.g_dtls_connection_shutdown
import org.gtkkn.native.gio.g_dtls_connection_shutdown_async
import org.gtkkn.native.gio.g_dtls_connection_shutdown_finish
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GDtlsConnection` is the base DTLS connection class type, which wraps
 * a [iface@Gio.DatagramBased] and provides DTLS encryption on top of it. Its
 * subclasses, [iface@Gio.DtlsClientConnection] and
 * [iface@Gio.DtlsServerConnection], implement client-side and server-side DTLS,
 * respectively.
 *
 * For TLS support, see [class@Gio.TlsConnection].
 *
 * As DTLS is datagram based, `GDtlsConnection` implements
 * [iface@Gio.DatagramBased], presenting a datagram-socket-like API for the
 * encrypted connection. This operates over a base datagram connection, which is
 * also a `GDatagramBased` ([property@Gio.DtlsConnection:base-socket]).
 *
 * To close a DTLS connection, use [method@Gio.DtlsConnection.close].
 *
 * Neither [iface@Gio.DtlsServerConnection] or [iface@Gio.DtlsClientConnection]
 * set the peer address on their base [iface@Gio.DatagramBased] if it is a
 * [class@Gio.Socket] — it is up to the caller to do that if they wish. If they
 * do not, and [method@Gio.Socket.close] is called on the base socket, the
 * `GDtlsConnection` will not raise a `G_IO_ERROR_NOT_CONNECTED` error on
 * further I/O.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: data: Out parameter is not supported
 * - method `advertised-protocols`: Property has no getter
 * - method `base-socket`: Property has no getter nor setter
 * - method `certificate`: Property TypeInfo of getter and setter do not match
 *
 * @since 2.48
 */
@GioVersion2_48
public interface DtlsConnection :
    Proxy,
    DatagramBased,
    KGTyped {
    public val gioDtlsConnectionPointer: CPointer<GDtlsConnection>

    override val gioDatagramBasedPointer: CPointer<GDatagramBased>
        get() = gioDtlsConnectionPointer.reinterpret()

    /**
     * The name of the DTLS ciphersuite in use. See g_dtls_connection_get_ciphersuite_name().
     *
     * @since 2.70
     */
    @GioVersion2_70
    public val ciphersuiteName: String?
        /**
         * Returns the name of the current DTLS ciphersuite, or null if the
         * connection has not handshaked or has been closed. Beware that the TLS
         * backend may use any of multiple different naming conventions, because
         * OpenSSL and GnuTLS have their own ciphersuite naming conventions that
         * are different from each other and different from the standard, IANA-
         * registered ciphersuite names. The ciphersuite name is intended to be
         * displayed to the user for informative purposes only, and parsing it
         * is not recommended.
         *
         * @return The name of the current DTLS ciphersuite, or null
         * @since 2.70
         */
        get() = g_dtls_connection_get_ciphersuite_name(gioDtlsConnectionPointer)?.toKString()

    /**
     * The certificate database to use when verifying this TLS connection.
     * If no certificate database is set, then the default database will be
     * used. See g_tls_backend_get_default_database().
     *
     * When using a non-default database, #GDtlsConnection must fall back to using
     * the #GTlsDatabase to perform certificate verification using
     * g_tls_database_verify_chain(), which means certificate verification will
     * not be able to make use of TLS session context. This may be less secure.
     * For example, if you create your own #GTlsDatabase that just wraps the
     * default #GTlsDatabase, you might expect that you have not changed anything,
     * but this is not true because you may have altered the behavior of
     * #GDtlsConnection by causing it to use g_tls_database_verify_chain(). See the
     * documentation of g_tls_database_verify_chain() for more details on specific
     * security checks that may not be performed. Accordingly, setting a
     * non-default database is discouraged except for specialty applications with
     * unusual security requirements.
     *
     * @since 2.48
     */
    @GioVersion2_48
    public var database: TlsDatabase?
        /**
         * Gets the certificate database that @conn uses to verify
         * peer certificates. See g_dtls_connection_set_database().
         *
         * @return the certificate database that @conn uses or null
         * @since 2.48
         */
        get() = g_dtls_connection_get_database(gioDtlsConnectionPointer)?.run {
            InstanceCache.get(this, true) { TlsDatabase.TlsDatabaseImpl(reinterpret()) }!!
        }

        /**
         * Sets the certificate database that is used to verify peer certificates.
         * This is set to the default database by default. See
         * g_tls_backend_get_default_database(). If set to null, then
         * peer certificate validation will always set the
         * %G_TLS_CERTIFICATE_UNKNOWN_CA error (meaning
         * #GDtlsConnection::accept-certificate will always be emitted on
         * client-side connections, unless that bit is not set in
         * #GDtlsClientConnection:validation-flags).
         *
         * There are nonintuitive security implications when using a non-default
         * database. See #GDtlsConnection:database for details.
         *
         * @param database a #GTlsDatabase
         * @since 2.48
         */
        @GioVersion2_48
        set(database) = g_dtls_connection_set_database(gioDtlsConnectionPointer, database?.gioTlsDatabasePointer)

    /**
     * A #GTlsInteraction object to be used when the connection or certificate
     * database need to interact with the user. This will be used to prompt the
     * user for passwords where necessary.
     *
     * @since 2.48
     */
    @GioVersion2_48
    public var interaction: TlsInteraction?
        /**
         * Get the object that will be used to interact with the user. It will be used
         * for things like prompting the user for passwords. If null is returned, then
         * no user interaction will occur for this connection.
         *
         * @return The interaction object.
         * @since 2.48
         */
        get() = g_dtls_connection_get_interaction(gioDtlsConnectionPointer)?.run {
            InstanceCache.get(this, true) { TlsInteraction(reinterpret()) }!!
        }

        /**
         * Set the object that will be used to interact with the user. It will be used
         * for things like prompting the user for passwords.
         *
         * The @interaction argument will normally be a derived subclass of
         * #GTlsInteraction. null can also be provided if no user interaction
         * should occur for this connection.
         *
         * @param interaction an interaction object, or null
         * @since 2.48
         */
        @GioVersion2_48
        set(
            interaction
        ) = g_dtls_connection_set_interaction(gioDtlsConnectionPointer, interaction?.gioTlsInteractionPointer)

    /**
     * The application-layer protocol negotiated during the TLS
     * handshake. See g_dtls_connection_get_negotiated_protocol().
     *
     * @since 2.60
     */
    @GioVersion2_60
    public val negotiatedProtocol: String?
        /**
         * Gets the name of the application-layer protocol negotiated during
         * the handshake.
         *
         * If the peer did not use the ALPN extension, or did not advertise a
         * protocol that matched one of @conn's protocols, or the TLS backend
         * does not support ALPN, then this will be null. See
         * g_dtls_connection_set_advertised_protocols().
         *
         * @return the negotiated protocol, or null
         * @since 2.60
         */
        get() = g_dtls_connection_get_negotiated_protocol(gioDtlsConnectionPointer)?.toKString()

    /**
     * The connection's peer's certificate, after the TLS handshake has
     * completed or failed. Note in particular that this is not yet set
     * during the emission of #GDtlsConnection::accept-certificate.
     *
     * (You can watch for a #GObject::notify signal on this property to
     * detect when a handshake has occurred.)
     *
     * @since 2.48
     */
    @GioVersion2_48
    public val peerCertificate: TlsCertificate?
        /**
         * Gets @conn's peer's certificate after the handshake has completed
         * or failed. (It is not set during the emission of
         * #GDtlsConnection::accept-certificate.)
         *
         * @return @conn's peer's certificate, or null
         * @since 2.48
         */
        get() = g_dtls_connection_get_peer_certificate(gioDtlsConnectionPointer)?.run {
            InstanceCache.get(this, true) { TlsCertificate.TlsCertificateImpl(reinterpret()) }!!
        }

    /**
     * The errors noticed while verifying
     * #GDtlsConnection:peer-certificate. Normally this should be 0, but
     * it may not be if #GDtlsClientConnection:validation-flags is not
     * %G_TLS_CERTIFICATE_VALIDATE_ALL, or if
     * #GDtlsConnection::accept-certificate overrode the default
     * behavior.
     *
     * GLib guarantees that if certificate verification fails, at least
     * one error will be set, but it does not guarantee that all possible
     * errors will be set. Accordingly, you may not safely decide to
     * ignore any particular type of error. For example, it would be
     * incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     *
     * @since 2.48
     */
    @GioVersion2_48
    public val peerCertificateErrors: TlsCertificateFlags
        /**
         * Gets the errors associated with validating @conn's peer's
         * certificate, after the handshake has completed or failed. (It is
         * not set during the emission of #GDtlsConnection::accept-certificate.)
         *
         * @return @conn's peer's certificate errors
         * @since 2.48
         */
        get() = g_dtls_connection_get_peer_certificate_errors(gioDtlsConnectionPointer).run {
            TlsCertificateFlags(this)
        }

    /**
     * The DTLS protocol version in use. See g_dtls_connection_get_protocol_version().
     *
     * @since 2.70
     */
    @GioVersion2_70
    public val protocolVersion: TlsProtocolVersion
        /**
         * Returns the current DTLS protocol version, which may be
         * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
         * has been closed, or if the TLS backend has implemented a protocol version
         * that is not a recognized #GTlsProtocolVersion.
         *
         * @return The current DTLS protocol version
         * @since 2.70
         */
        get() = g_dtls_connection_get_protocol_version(gioDtlsConnectionPointer).run {
            TlsProtocolVersion.fromNativeValue(this)
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.60.
     *
     * The rehandshake mode is ignored.
     * ---
     *
     * The rehandshaking mode. See
     * g_dtls_connection_set_rehandshake_mode().
     *
     * @since 2.48
     */
    @GioVersion2_48
    public var rehandshakeMode: TlsRehandshakeMode
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.64..
         *
         * Changing the rehandshake mode is no longer
         *   required for compatibility. Also, rehandshaking has been removed
         *   from the TLS protocol in TLS 1.3.
         * ---
         *
         * Gets @conn rehandshaking mode. See
         * g_dtls_connection_set_rehandshake_mode() for details.
         *
         * @return %G_TLS_REHANDSHAKE_SAFELY
         * @since 2.48
         */
        get() = g_dtls_connection_get_rehandshake_mode(gioDtlsConnectionPointer).run {
            TlsRehandshakeMode.fromNativeValue(this)
        }

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
         * Since GLib 2.64, changing the rehandshake mode is no longer supported
         * and will have no effect. With TLS 1.3, rehandshaking has been removed from
         * the TLS protocol, replaced by separate post-handshake authentication and
         * rekey operations.
         *
         * @param mode the rehandshaking mode
         * @since 2.48
         */
        @GioVersion2_48
        set(mode) = g_dtls_connection_set_rehandshake_mode(gioDtlsConnectionPointer, mode.nativeValue)

    /**
     * Whether or not proper TLS close notification is required.
     * See g_dtls_connection_set_require_close_notify().
     *
     * @since 2.48
     */
    @GioVersion2_48
    public var requireCloseNotify: Boolean
        /**
         * Tests whether or not @conn expects a proper TLS close notification
         * when the connection is closed. See
         * g_dtls_connection_set_require_close_notify() for details.
         *
         * @return true if @conn requires a proper TLS close notification.
         * @since 2.48
         */
        get() = g_dtls_connection_get_require_close_notify(gioDtlsConnectionPointer).asBoolean()

        /**
         * Sets whether or not @conn expects a proper TLS close notification
         * before the connection is closed. If this is true (the default),
         * then @conn will expect to receive a TLS close notification from its
         * peer before the connection is closed, and will return a
         * %G_TLS_ERROR_EOF error if the connection is closed without proper
         * notification (since this may indicate a network error, or
         * man-in-the-middle attack).
         *
         * In some protocols, the application will know whether or not the
         * connection was closed cleanly based on application-level data
         * (because the application-level data includes a length field, or is
         * somehow self-delimiting); in this case, the close notify is
         * redundant and may be omitted. You
         * can use g_dtls_connection_set_require_close_notify() to tell @conn
         * to allow an "unannounced" connection close, in which case the close
         * will show up as a 0-length read, as in a non-TLS
         * #GDatagramBased, and it is up to the application to check that
         * the data has been fully received.
         *
         * Note that this only affects the behavior when the peer closes the
         * connection; when the application calls g_dtls_connection_close_async() on
         * @conn itself, this will send a close notification regardless of the
         * setting of this property. If you explicitly want to do an unclean
         * close, you can close @conn's #GDtlsConnection:base-socket rather
         * than closing @conn itself.
         *
         * @param requireCloseNotify whether or not to require close notification
         * @since 2.48
         */
        @GioVersion2_48
        set(
            requireCloseNotify
        ) = g_dtls_connection_set_require_close_notify(gioDtlsConnectionPointer, requireCloseNotify.asGBoolean())

    /**
     * Close the DTLS connection. This is equivalent to calling
     * g_dtls_connection_shutdown() to shut down both sides of the connection.
     *
     * Closing a #GDtlsConnection waits for all buffered but untransmitted data to
     * be sent before it completes. It then sends a `close_notify` DTLS alert to the
     * peer and may wait for a `close_notify` to be received from the peer. It does
     * not close the underlying #GDtlsConnection:base-socket; that must be closed
     * separately.
     *
     * Once @conn is closed, all other operations will return %G_IO_ERROR_CLOSED.
     * Closing a #GDtlsConnection multiple times will not return an error.
     *
     * #GDtlsConnections will be automatically closed when the last reference is
     * dropped, but you might want to call this function to make sure resources are
     * released as early as possible.
     *
     * If @cancellable is cancelled, the #GDtlsConnection may be left
     * partially-closed and any pending untransmitted data may be lost. Call
     * g_dtls_connection_close() again to complete closing the #GDtlsConnection.
     *
     * @param cancellable a #GCancellable, or null
     * @return true on success, false otherwise
     * @since 2.48
     */
    @GioVersion2_48
    public fun close(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dtls_connection_close(
            gioDtlsConnectionPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously close the DTLS connection. See g_dtls_connection_close() for
     * more information.
     *
     * @param ioPriority the [I/O priority](iface.AsyncResult.html#io-priority) of the request
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the close operation is complete
     * @since 2.48
     */
    @GioVersion2_48
    public fun closeAsync(ioPriority: gint, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_dtls_connection_close_async(
            gioDtlsConnectionPointer,
            ioPriority,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finish an asynchronous TLS close operation. See g_dtls_connection_close()
     * for more information.
     *
     * @param result a #GAsyncResult
     * @return true on success, false on failure, in which
     * case @error will be set
     * @since 2.48
     */
    @GioVersion2_48
    public fun closeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dtls_connection_close_finish(
            gioDtlsConnectionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Used by #GDtlsConnection implementations to emit the
     * #GDtlsConnection::accept-certificate signal.
     *
     * @param peerCert the peer's #GTlsCertificate
     * @param errors the problems with @peer_cert
     * @return true if one of the signal handlers has returned
     *     true to accept @peer_cert
     * @since 2.48
     */
    @GioVersion2_48
    public fun emitAcceptCertificate(peerCert: TlsCertificate, errors: TlsCertificateFlags): Boolean =
        g_dtls_connection_emit_accept_certificate(
            gioDtlsConnectionPointer,
            peerCert.gioTlsCertificatePointer,
            errors.mask
        ).asBoolean()

    /**
     * Gets @conn's certificate, as set by
     * g_dtls_connection_set_certificate().
     *
     * @return @conn's certificate, or null
     * @since 2.48
     */
    @GioVersion2_48
    public fun getCertificate(): TlsCertificate? = g_dtls_connection_get_certificate(gioDtlsConnectionPointer)?.run {
        InstanceCache.get(this, true) { TlsCertificate.TlsCertificateImpl(reinterpret()) }!!
    }

    /**
     * Returns the name of the current DTLS ciphersuite, or null if the
     * connection has not handshaked or has been closed. Beware that the TLS
     * backend may use any of multiple different naming conventions, because
     * OpenSSL and GnuTLS have their own ciphersuite naming conventions that
     * are different from each other and different from the standard, IANA-
     * registered ciphersuite names. The ciphersuite name is intended to be
     * displayed to the user for informative purposes only, and parsing it
     * is not recommended.
     *
     * @return The name of the current DTLS ciphersuite, or null
     * @since 2.70
     */
    @GioVersion2_70
    public fun getCiphersuiteName(): String? =
        g_dtls_connection_get_ciphersuite_name(gioDtlsConnectionPointer)?.toKString()

    /**
     * Gets the certificate database that @conn uses to verify
     * peer certificates. See g_dtls_connection_set_database().
     *
     * @return the certificate database that @conn uses or null
     * @since 2.48
     */
    @GioVersion2_48
    public fun getDatabase(): TlsDatabase? = g_dtls_connection_get_database(gioDtlsConnectionPointer)?.run {
        InstanceCache.get(this, true) { TlsDatabase.TlsDatabaseImpl(reinterpret()) }!!
    }

    /**
     * Get the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords. If null is returned, then
     * no user interaction will occur for this connection.
     *
     * @return The interaction object.
     * @since 2.48
     */
    @GioVersion2_48
    public fun getInteraction(): TlsInteraction? = g_dtls_connection_get_interaction(gioDtlsConnectionPointer)?.run {
        InstanceCache.get(this, true) { TlsInteraction(reinterpret()) }!!
    }

    /**
     * Gets the name of the application-layer protocol negotiated during
     * the handshake.
     *
     * If the peer did not use the ALPN extension, or did not advertise a
     * protocol that matched one of @conn's protocols, or the TLS backend
     * does not support ALPN, then this will be null. See
     * g_dtls_connection_set_advertised_protocols().
     *
     * @return the negotiated protocol, or null
     * @since 2.60
     */
    @GioVersion2_60
    public fun getNegotiatedProtocol(): String? =
        g_dtls_connection_get_negotiated_protocol(gioDtlsConnectionPointer)?.toKString()

    /**
     * Gets @conn's peer's certificate after the handshake has completed
     * or failed. (It is not set during the emission of
     * #GDtlsConnection::accept-certificate.)
     *
     * @return @conn's peer's certificate, or null
     * @since 2.48
     */
    @GioVersion2_48
    public fun getPeerCertificate(): TlsCertificate? =
        g_dtls_connection_get_peer_certificate(gioDtlsConnectionPointer)?.run {
            InstanceCache.get(this, true) { TlsCertificate.TlsCertificateImpl(reinterpret()) }!!
        }

    /**
     * Gets the errors associated with validating @conn's peer's
     * certificate, after the handshake has completed or failed. (It is
     * not set during the emission of #GDtlsConnection::accept-certificate.)
     *
     * @return @conn's peer's certificate errors
     * @since 2.48
     */
    @GioVersion2_48
    public fun getPeerCertificateErrors(): TlsCertificateFlags =
        g_dtls_connection_get_peer_certificate_errors(gioDtlsConnectionPointer).run {
            TlsCertificateFlags(this)
        }

    /**
     * Returns the current DTLS protocol version, which may be
     * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
     * has been closed, or if the TLS backend has implemented a protocol version
     * that is not a recognized #GTlsProtocolVersion.
     *
     * @return The current DTLS protocol version
     * @since 2.70
     */
    @GioVersion2_70
    public fun getProtocolVersion(): TlsProtocolVersion =
        g_dtls_connection_get_protocol_version(gioDtlsConnectionPointer).run {
            TlsProtocolVersion.fromNativeValue(this)
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.64..
     *
     * Changing the rehandshake mode is no longer
     *   required for compatibility. Also, rehandshaking has been removed
     *   from the TLS protocol in TLS 1.3.
     * ---
     *
     * Gets @conn rehandshaking mode. See
     * g_dtls_connection_set_rehandshake_mode() for details.
     *
     * @return %G_TLS_REHANDSHAKE_SAFELY
     * @since 2.48
     */
    @GioVersion2_48
    public fun getRehandshakeMode(): TlsRehandshakeMode =
        g_dtls_connection_get_rehandshake_mode(gioDtlsConnectionPointer).run {
            TlsRehandshakeMode.fromNativeValue(this)
        }

    /**
     * Tests whether or not @conn expects a proper TLS close notification
     * when the connection is closed. See
     * g_dtls_connection_set_require_close_notify() for details.
     *
     * @return true if @conn requires a proper TLS close notification.
     * @since 2.48
     */
    @GioVersion2_48
    public fun getRequireCloseNotify(): Boolean =
        g_dtls_connection_get_require_close_notify(gioDtlsConnectionPointer).asBoolean()

    /**
     * Attempts a TLS handshake on @conn.
     *
     * On the client side, it is never necessary to call this method;
     * although the connection needs to perform a handshake after
     * connecting, #GDtlsConnection will handle this for you automatically
     * when you try to send or receive data on the connection. You can call
     * g_dtls_connection_handshake() manually if you want to know whether
     * the initial handshake succeeded or failed (as opposed to just
     * immediately trying to use @conn to read or write, in which case,
     * if it fails, it may not be possible to tell if it failed before
     * or after completing the handshake), but beware that servers may reject
     * client authentication after the handshake has completed, so a
     * successful handshake does not indicate the connection will be usable.
     *
     * Likewise, on the server side, although a handshake is necessary at
     * the beginning of the communication, you do not need to call this
     * function explicitly unless you want clearer error reporting.
     *
     * Previously, calling g_dtls_connection_handshake() after the initial
     * handshake would trigger a rehandshake; however, this usage was
     * deprecated in GLib 2.60 because rehandshaking was removed from the
     * TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * the initial handshake will no longer do anything.
     *
     * #GDtlsConnection::accept_certificate may be emitted during the
     * handshake.
     *
     * @param cancellable a #GCancellable, or null
     * @return success or failure
     * @since 2.48
     */
    @GioVersion2_48
    public fun handshake(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dtls_connection_handshake(
            gioDtlsConnectionPointer,
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously performs a TLS handshake on @conn. See
     * g_dtls_connection_handshake() for more information.
     *
     * @param ioPriority the [I/O priority](iface.AsyncResult.html#io-priority) of the request
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the handshake is complete
     * @since 2.48
     */
    @GioVersion2_48
    public fun handshakeAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dtls_connection_handshake_async(
        gioDtlsConnectionPointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finish an asynchronous TLS handshake operation. See
     * g_dtls_connection_handshake() for more information.
     *
     * @param result a #GAsyncResult.
     * @return true on success, false on failure, in which
     * case @error will be set.
     * @since 2.48
     */
    @GioVersion2_48
    public fun handshakeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dtls_connection_handshake_finish(
            gioDtlsConnectionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets the list of application-layer protocols to advertise that the
     * caller is willing to speak on this connection. The
     * Application-Layer Protocol Negotiation (ALPN) extension will be
     * used to negotiate a compatible protocol with the peer; use
     * g_dtls_connection_get_negotiated_protocol() to find the negotiated
     * protocol after the handshake.  Specifying null for the the value
     * of @protocols will disable ALPN negotiation.
     *
     * See [IANA TLS ALPN Protocol IDs](https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids)
     * for a list of registered protocol IDs.
     *
     * @param protocols a null-terminated
     *   array of ALPN protocol names (eg, "http/1.1", "h2"), or null
     * @since 2.60
     */
    @GioVersion2_60
    public fun setAdvertisedProtocols(protocols: List<String>? = null): Unit = memScoped {
        return g_dtls_connection_set_advertised_protocols(gioDtlsConnectionPointer, protocols?.toCStringList(this))
    }

    /**
     * This sets the certificate that @conn will present to its peer
     * during the TLS handshake. For a #GDtlsServerConnection, it is
     * mandatory to set this, and that will normally be done at construct
     * time.
     *
     * For a #GDtlsClientConnection, this is optional. If a handshake fails
     * with %G_TLS_ERROR_CERTIFICATE_REQUIRED, that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_dtls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     *
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don't provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_dtls_client_connection_get_accepted_cas() will return
     * non-null.)
     *
     * @param certificate the certificate to use for @conn
     * @since 2.48
     */
    @GioVersion2_48
    public fun setCertificate(certificate: TlsCertificate): Unit =
        g_dtls_connection_set_certificate(gioDtlsConnectionPointer, certificate.gioTlsCertificatePointer)

    /**
     * Sets the certificate database that is used to verify peer certificates.
     * This is set to the default database by default. See
     * g_tls_backend_get_default_database(). If set to null, then
     * peer certificate validation will always set the
     * %G_TLS_CERTIFICATE_UNKNOWN_CA error (meaning
     * #GDtlsConnection::accept-certificate will always be emitted on
     * client-side connections, unless that bit is not set in
     * #GDtlsClientConnection:validation-flags).
     *
     * There are nonintuitive security implications when using a non-default
     * database. See #GDtlsConnection:database for details.
     *
     * @param database a #GTlsDatabase
     * @since 2.48
     */
    @GioVersion2_48
    public fun setDatabase(database: TlsDatabase? = null): Unit =
        g_dtls_connection_set_database(gioDtlsConnectionPointer, database?.gioTlsDatabasePointer)

    /**
     * Set the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords.
     *
     * The @interaction argument will normally be a derived subclass of
     * #GTlsInteraction. null can also be provided if no user interaction
     * should occur for this connection.
     *
     * @param interaction an interaction object, or null
     * @since 2.48
     */
    @GioVersion2_48
    public fun setInteraction(interaction: TlsInteraction? = null): Unit =
        g_dtls_connection_set_interaction(gioDtlsConnectionPointer, interaction?.gioTlsInteractionPointer)

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
     * Since GLib 2.64, changing the rehandshake mode is no longer supported
     * and will have no effect. With TLS 1.3, rehandshaking has been removed from
     * the TLS protocol, replaced by separate post-handshake authentication and
     * rekey operations.
     *
     * @param mode the rehandshaking mode
     * @since 2.48
     */
    @GioVersion2_48
    public fun setRehandshakeMode(mode: TlsRehandshakeMode): Unit =
        g_dtls_connection_set_rehandshake_mode(gioDtlsConnectionPointer, mode.nativeValue)

    /**
     * Sets whether or not @conn expects a proper TLS close notification
     * before the connection is closed. If this is true (the default),
     * then @conn will expect to receive a TLS close notification from its
     * peer before the connection is closed, and will return a
     * %G_TLS_ERROR_EOF error if the connection is closed without proper
     * notification (since this may indicate a network error, or
     * man-in-the-middle attack).
     *
     * In some protocols, the application will know whether or not the
     * connection was closed cleanly based on application-level data
     * (because the application-level data includes a length field, or is
     * somehow self-delimiting); in this case, the close notify is
     * redundant and may be omitted. You
     * can use g_dtls_connection_set_require_close_notify() to tell @conn
     * to allow an "unannounced" connection close, in which case the close
     * will show up as a 0-length read, as in a non-TLS
     * #GDatagramBased, and it is up to the application to check that
     * the data has been fully received.
     *
     * Note that this only affects the behavior when the peer closes the
     * connection; when the application calls g_dtls_connection_close_async() on
     * @conn itself, this will send a close notification regardless of the
     * setting of this property. If you explicitly want to do an unclean
     * close, you can close @conn's #GDtlsConnection:base-socket rather
     * than closing @conn itself.
     *
     * @param requireCloseNotify whether or not to require close notification
     * @since 2.48
     */
    @GioVersion2_48
    public fun setRequireCloseNotify(requireCloseNotify: Boolean): Unit =
        g_dtls_connection_set_require_close_notify(gioDtlsConnectionPointer, requireCloseNotify.asGBoolean())

    /**
     * Shut down part or all of a DTLS connection.
     *
     * If @shutdown_read is true then the receiving side of the connection is shut
     * down, and further reading is disallowed. Subsequent calls to
     * g_datagram_based_receive_messages() will return %G_IO_ERROR_CLOSED.
     *
     * If @shutdown_write is true then the sending side of the connection is shut
     * down, and further writing is disallowed. Subsequent calls to
     * g_datagram_based_send_messages() will return %G_IO_ERROR_CLOSED.
     *
     * It is allowed for both @shutdown_read and @shutdown_write to be TRUE — this
     * is equivalent to calling g_dtls_connection_close().
     *
     * If @cancellable is cancelled, the #GDtlsConnection may be left
     * partially-closed and any pending untransmitted data may be lost. Call
     * g_dtls_connection_shutdown() again to complete closing the #GDtlsConnection.
     *
     * @param shutdownRead true to stop reception of incoming datagrams
     * @param shutdownWrite true to stop sending outgoing datagrams
     * @param cancellable a #GCancellable, or null
     * @return true on success, false otherwise
     * @since 2.48
     */
    @GioVersion2_48
    public fun shutdown(
        shutdownRead: Boolean,
        shutdownWrite: Boolean,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dtls_connection_shutdown(
            gioDtlsConnectionPointer,
            shutdownRead.asGBoolean(),
            shutdownWrite.asGBoolean(),
            cancellable?.gioCancellablePointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Asynchronously shut down part or all of the DTLS connection. See
     * g_dtls_connection_shutdown() for more information.
     *
     * @param shutdownRead true to stop reception of incoming datagrams
     * @param shutdownWrite true to stop sending outgoing datagrams
     * @param ioPriority the [I/O priority](iface.AsyncResult.html#io-priority) of the request
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the shutdown operation is complete
     * @since 2.48
     */
    @GioVersion2_48
    public fun shutdownAsync(
        shutdownRead: Boolean,
        shutdownWrite: Boolean,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dtls_connection_shutdown_async(
        gioDtlsConnectionPointer,
        shutdownRead.asGBoolean(),
        shutdownWrite.asGBoolean(),
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finish an asynchronous TLS shutdown operation. See
     * g_dtls_connection_shutdown() for more information.
     *
     * @param result a #GAsyncResult
     * @return true on success, false on failure, in which
     * case @error will be set
     * @since 2.48
     */
    @GioVersion2_48
    public fun shutdownFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dtls_connection_shutdown_finish(
            gioDtlsConnectionPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Emitted during the TLS handshake after the peer certificate has
     * been received. You can examine @peer_cert's certification path by
     * calling g_tls_certificate_get_issuer() on it.
     *
     * For a client-side connection, @peer_cert is the server's
     * certificate, and the signal will only be emitted if the
     * certificate was not acceptable according to @conn's
     * #GDtlsClientConnection:validation_flags. If you would like the
     * certificate to be accepted despite @errors, return true from the
     * signal handler. Otherwise, if no handler accepts the certificate,
     * the handshake will fail with %G_TLS_ERROR_BAD_CERTIFICATE.
     *
     * GLib guarantees that if certificate verification fails, this signal
     * will be emitted with at least one error will be set in @errors, but
     * it does not guarantee that all possible errors will be set.
     * Accordingly, you may not safely decide to ignore any particular
     * type of error. For example, it would be incorrect to ignore
     * %G_TLS_CERTIFICATE_EXPIRED if you want to allow expired
     * certificates, because this could potentially be the only error flag
     * set even if other problems exist with the certificate.
     *
     * For a server-side connection, @peer_cert is the certificate
     * presented by the client, if this was requested via the server's
     * #GDtlsServerConnection:authentication_mode. On the server side,
     * the signal is always emitted when the client presents a
     * certificate, and the certificate will only be accepted if a
     * handler returns true.
     *
     * Note that if this signal is emitted as part of asynchronous I/O
     * in the main thread, then you should not attempt to interact with
     * the user before returning from the signal handler. If you want to
     * let the user decide whether or not to accept the certificate, you
     * would have to return false from the signal handler on the first
     * attempt, and then after the connection attempt returns a
     * %G_TLS_ERROR_BAD_CERTIFICATE, you can interact with the user, and
     * if the user decides to accept the certificate, remember that fact,
     * create a new connection, and return true from the signal handler
     * the next time.
     *
     * If you are doing I/O in another thread, you do not
     * need to worry about this, and can simply block in the signal
     * handler until the UI thread returns an answer.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `peerCert` the peer's #GTlsCertificate; `errors` the problems with @peer_cert.. Returns true to accept @peer_cert (which will also
     * immediately end the signal emission). false to allow the signal
     * emission to continue, which will cause the handshake to fail if
     * no one else overrides it.
     * @since 2.48
     */
    @GioVersion2_48
    public fun onAcceptCertificate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (peerCert: TlsCertificate, errors: TlsCertificateFlags) -> Boolean,
    ): ULong = g_signal_connect_data(
        gioDtlsConnectionPointer,
        "accept-certificate",
        onAcceptCertificateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The DtlsConnectionImpl type represents a native instance of the DtlsConnection interface.
     *
     * @constructor Creates a new instance of DtlsConnection for the provided [CPointer].
     */
    public class DtlsConnectionImpl(gioDtlsConnectionPointer: CPointer<GDtlsConnection>) :
        Object(gioDtlsConnectionPointer.reinterpret()),
        DtlsConnection {
        init {
            Gio
        }

        override val gioDtlsConnectionPointer: CPointer<GDtlsConnection> = gioDtlsConnectionPointer
    }

    public companion object : TypeCompanion<DtlsConnection> {
        override val type: GeneratedInterfaceKGType<DtlsConnection> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { DtlsConnectionImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of DtlsConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_dtls_connection_get_type()

        /**
         * Gets the GType of from the symbol `g_dtls_connection_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dtls_connection_get_type")
    }
}

private val onAcceptCertificateFunc:
    CPointer<CFunction<(CPointer<GTlsCertificate>, GTlsCertificateFlags) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            peerCert: CPointer<GTlsCertificate>?,
            errors: GTlsCertificateFlags,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                peerCert: TlsCertificate,
                errors: TlsCertificateFlags,
            ) -> Boolean
            >().get().invoke(
            peerCert!!.run {
                InstanceCache.get(this, false) { TlsCertificate.TlsCertificateImpl(reinterpret()) }!!
            },
            errors.run {
                TlsCertificateFlags(this)
            }
        ).asGBoolean()
    }
        .reinterpret()
