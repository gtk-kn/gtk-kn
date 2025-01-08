// This is a generated file. Do not modify.
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
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gio.annotations.GioVersion2_70
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsCertificate
import org.gtkkn.native.gio.GTlsCertificateFlags
import org.gtkkn.native.gio.GTlsConnection
import org.gtkkn.native.gio.g_tls_connection_emit_accept_certificate
import org.gtkkn.native.gio.g_tls_connection_get_certificate
import org.gtkkn.native.gio.g_tls_connection_get_ciphersuite_name
import org.gtkkn.native.gio.g_tls_connection_get_database
import org.gtkkn.native.gio.g_tls_connection_get_interaction
import org.gtkkn.native.gio.g_tls_connection_get_negotiated_protocol
import org.gtkkn.native.gio.g_tls_connection_get_peer_certificate
import org.gtkkn.native.gio.g_tls_connection_get_peer_certificate_errors
import org.gtkkn.native.gio.g_tls_connection_get_protocol_version
import org.gtkkn.native.gio.g_tls_connection_get_rehandshake_mode
import org.gtkkn.native.gio.g_tls_connection_get_require_close_notify
import org.gtkkn.native.gio.g_tls_connection_get_type
import org.gtkkn.native.gio.g_tls_connection_get_use_system_certdb
import org.gtkkn.native.gio.g_tls_connection_handshake
import org.gtkkn.native.gio.g_tls_connection_handshake_async
import org.gtkkn.native.gio.g_tls_connection_handshake_finish
import org.gtkkn.native.gio.g_tls_connection_set_advertised_protocols
import org.gtkkn.native.gio.g_tls_connection_set_certificate
import org.gtkkn.native.gio.g_tls_connection_set_database
import org.gtkkn.native.gio.g_tls_connection_set_interaction
import org.gtkkn.native.gio.g_tls_connection_set_rehandshake_mode
import org.gtkkn.native.gio.g_tls_connection_set_require_close_notify
import org.gtkkn.native.gio.g_tls_connection_set_use_system_certdb
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
 * `GTlsConnection` is the base TLS connection class type, which wraps
 * a [class@Gio.IOStream] and provides TLS encryption on top of it. Its
 * subclasses, [iface@Gio.TlsClientConnection] and
 * [iface@Gio.TlsServerConnection], implement client-side and server-side TLS,
 * respectively.
 *
 * For DTLS (Datagram TLS) support, see [iface@Gio.DtlsConnection].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: data: Out parameter is not supported
 * - method `advertised-protocols`: Property has no getter
 * - method `base-io-stream`: Property has no getter nor setter
 * - method `certificate`: Property TypeInfo of getter and setter do not match
 *
 * @since 2.28
 */
@GioVersion2_28
public open class TlsConnection(pointer: CPointer<GTlsConnection>) :
    IoStream(pointer.reinterpret()),
    KGTyped {
    public val gioTlsConnectionPointer: CPointer<GTlsConnection>
        get() = gPointer.reinterpret()

    /**
     * The name of the TLS ciphersuite in use. See g_tls_connection_get_ciphersuite_name().
     *
     * @since 2.70
     */
    @GioVersion2_70
    public open val ciphersuiteName: String?
        /**
         * Returns the name of the current TLS ciphersuite, or null if the
         * connection has not handshaked or has been closed. Beware that the TLS
         * backend may use any of multiple different naming conventions, because
         * OpenSSL and GnuTLS have their own ciphersuite naming conventions that
         * are different from each other and different from the standard, IANA-
         * registered ciphersuite names. The ciphersuite name is intended to be
         * displayed to the user for informative purposes only, and parsing it
         * is not recommended.
         *
         * @return The name of the current TLS ciphersuite, or null
         * @since 2.70
         */
        get() = g_tls_connection_get_ciphersuite_name(gioTlsConnectionPointer)?.toKString()

    /**
     * The certificate database to use when verifying this TLS connection.
     * If no certificate database is set, then the default database will be
     * used. See g_tls_backend_get_default_database().
     *
     * When using a non-default database, #GTlsConnection must fall back to using
     * the #GTlsDatabase to perform certificate verification using
     * g_tls_database_verify_chain(), which means certificate verification will
     * not be able to make use of TLS session context. This may be less secure.
     * For example, if you create your own #GTlsDatabase that just wraps the
     * default #GTlsDatabase, you might expect that you have not changed anything,
     * but this is not true because you may have altered the behavior of
     * #GTlsConnection by causing it to use g_tls_database_verify_chain(). See the
     * documentation of g_tls_database_verify_chain() for more details on specific
     * security checks that may not be performed. Accordingly, setting a
     * non-default database is discouraged except for specialty applications with
     * unusual security requirements.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open var database: TlsDatabase?
        /**
         * Gets the certificate database that @conn uses to verify
         * peer certificates. See g_tls_connection_set_database().
         *
         * @return the certificate database that @conn uses or null
         * @since 2.30
         */
        get() = g_tls_connection_get_database(gioTlsConnectionPointer)?.run {
            TlsDatabase(this)
        }

        /**
         * Sets the certificate database that is used to verify peer certificates.
         * This is set to the default database by default. See
         * g_tls_backend_get_default_database(). If set to null, then
         * peer certificate validation will always set the
         * %G_TLS_CERTIFICATE_UNKNOWN_CA error (meaning
         * #GTlsConnection::accept-certificate will always be emitted on
         * client-side connections, unless that bit is not set in
         * #GTlsClientConnection:validation-flags).
         *
         * There are nonintuitive security implications when using a non-default
         * database. See #GTlsConnection:database for details.
         *
         * @param database a #GTlsDatabase
         * @since 2.30
         */
        @GioVersion2_30
        set(database) = g_tls_connection_set_database(gioTlsConnectionPointer, database?.gioTlsDatabasePointer)

    /**
     * A #GTlsInteraction object to be used when the connection or certificate
     * database need to interact with the user. This will be used to prompt the
     * user for passwords where necessary.
     *
     * @since 2.30
     */
    @GioVersion2_30
    public open var interaction: TlsInteraction?
        /**
         * Get the object that will be used to interact with the user. It will be used
         * for things like prompting the user for passwords. If null is returned, then
         * no user interaction will occur for this connection.
         *
         * @return The interaction object.
         * @since 2.30
         */
        get() = g_tls_connection_get_interaction(gioTlsConnectionPointer)?.run {
            TlsInteraction(this)
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
         * @since 2.30
         */
        @GioVersion2_30
        set(
            interaction
        ) = g_tls_connection_set_interaction(gioTlsConnectionPointer, interaction?.gioTlsInteractionPointer)

    /**
     * The application-layer protocol negotiated during the TLS
     * handshake. See g_tls_connection_get_negotiated_protocol().
     *
     * @since 2.60
     */
    @GioVersion2_60
    public open val negotiatedProtocol: String?
        /**
         * Gets the name of the application-layer protocol negotiated during
         * the handshake.
         *
         * If the peer did not use the ALPN extension, or did not advertise a
         * protocol that matched one of @conn's protocols, or the TLS backend
         * does not support ALPN, then this will be null. See
         * g_tls_connection_set_advertised_protocols().
         *
         * @return the negotiated protocol, or null
         * @since 2.60
         */
        get() = g_tls_connection_get_negotiated_protocol(gioTlsConnectionPointer)?.toKString()

    /**
     * The connection's peer's certificate, after the TLS handshake has
     * completed or failed. Note in particular that this is not yet set
     * during the emission of #GTlsConnection::accept-certificate.
     *
     * (You can watch for a #GObject::notify signal on this property to
     * detect when a handshake has occurred.)
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open val peerCertificate: TlsCertificate?
        /**
         * Gets @conn's peer's certificate after the handshake has completed
         * or failed. (It is not set during the emission of
         * #GTlsConnection::accept-certificate.)
         *
         * @return @conn's peer's certificate, or null
         * @since 2.28
         */
        get() = g_tls_connection_get_peer_certificate(gioTlsConnectionPointer)?.run {
            TlsCertificate(this)
        }

    /**
     * The errors noticed while verifying
     * #GTlsConnection:peer-certificate. Normally this should be 0, but
     * it may not be if #GTlsClientConnection:validation-flags is not
     * %G_TLS_CERTIFICATE_VALIDATE_ALL, or if
     * #GTlsConnection::accept-certificate overrode the default
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
     * @since 2.28
     */
    @GioVersion2_28
    public open val peerCertificateErrors: TlsCertificateFlags
        /**
         * Gets the errors associated with validating @conn's peer's
         * certificate, after the handshake has completed or failed. (It is
         * not set during the emission of #GTlsConnection::accept-certificate.)
         *
         * See #GTlsConnection:peer-certificate-errors for more information.
         *
         * @return @conn's peer's certificate errors
         * @since 2.28
         */
        get() = g_tls_connection_get_peer_certificate_errors(gioTlsConnectionPointer).run {
            TlsCertificateFlags(this)
        }

    /**
     * The TLS protocol version in use. See g_tls_connection_get_protocol_version().
     *
     * @since 2.70
     */
    @GioVersion2_70
    public open val protocolVersion: TlsProtocolVersion
        /**
         * Returns the current TLS protocol version, which may be
         * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
         * has been closed, or if the TLS backend has implemented a protocol version
         * that is not a recognized #GTlsProtocolVersion.
         *
         * @return The current TLS protocol version
         * @since 2.70
         */
        get() = g_tls_connection_get_protocol_version(gioTlsConnectionPointer).run {
            TlsProtocolVersion.fromNativeValue(this)
        }

    /**
     * The rehandshaking mode. See
     * g_tls_connection_set_rehandshake_mode().
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open var rehandshakeMode: TlsRehandshakeMode
        /**
         * Gets @conn rehandshaking mode. See
         * g_tls_connection_set_rehandshake_mode() for details.
         *
         * @return %G_TLS_REHANDSHAKE_SAFELY
         * @since 2.28
         */
        get() = g_tls_connection_get_rehandshake_mode(gioTlsConnectionPointer).run {
            TlsRehandshakeMode.fromNativeValue(this)
        }

        /**
         * Since GLib 2.64, changing the rehandshake mode is no longer supported
         * and will have no effect. With TLS 1.3, rehandshaking has been removed from
         * the TLS protocol, replaced by separate post-handshake authentication and
         * rekey operations.
         *
         * @param mode the rehandshaking mode
         * @since 2.28
         */
        @GioVersion2_28
        set(mode) = g_tls_connection_set_rehandshake_mode(gioTlsConnectionPointer, mode.nativeValue)

    /**
     * Whether or not proper TLS close notification is required.
     * See g_tls_connection_set_require_close_notify().
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open var requireCloseNotify: Boolean
        /**
         * Tests whether or not @conn expects a proper TLS close notification
         * when the connection is closed. See
         * g_tls_connection_set_require_close_notify() for details.
         *
         * @return true if @conn requires a proper TLS close
         * notification.
         * @since 2.28
         */
        get() = g_tls_connection_get_require_close_notify(gioTlsConnectionPointer).asBoolean()

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
         * redundant and sometimes omitted. (TLS 1.1 explicitly allows this;
         * in TLS 1.0 it is technically an error, but often done anyway.) You
         * can use g_tls_connection_set_require_close_notify() to tell @conn
         * to allow an "unannounced" connection close, in which case the close
         * will show up as a 0-length read, as in a non-TLS
         * #GSocketConnection, and it is up to the application to check that
         * the data has been fully received.
         *
         * Note that this only affects the behavior when the peer closes the
         * connection; when the application calls g_io_stream_close() itself
         * on @conn, this will send a close notification regardless of the
         * setting of this property. If you explicitly want to do an unclean
         * close, you can close @conn's #GTlsConnection:base-io-stream rather
         * than closing @conn itself, but note that this may only be done when no other
         * operations are pending on @conn or the base I/O stream.
         *
         * @param requireCloseNotify whether or not to require close notification
         * @since 2.28
         */
        @GioVersion2_28
        set(
            requireCloseNotify
        ) = g_tls_connection_set_require_close_notify(gioTlsConnectionPointer, requireCloseNotify.asGBoolean())

    /**
     * Whether or not the system certificate database will be used to
     * verify peer certificates. See
     * g_tls_connection_set_use_system_certdb().
     */
    public open var useSystemCertdb: Boolean
        /**
         * Gets whether @conn uses the system certificate database to verify
         * peer certificates. See g_tls_connection_set_use_system_certdb().
         *
         * @return whether @conn uses the system certificate database
         */
        get() = g_tls_connection_get_use_system_certdb(gioTlsConnectionPointer).asBoolean()

        /**
         * Sets whether @conn uses the system certificate database to verify
         * peer certificates. This is true by default. If set to false, then
         * peer certificate validation will always set the
         * %G_TLS_CERTIFICATE_UNKNOWN_CA error (meaning
         * #GTlsConnection::accept-certificate will always be emitted on
         * client-side connections, unless that bit is not set in
         * #GTlsClientConnection:validation-flags).
         *
         * @param useSystemCertdb whether to use the system certificate database
         */
        set(
            useSystemCertdb
        ) = g_tls_connection_set_use_system_certdb(gioTlsConnectionPointer, useSystemCertdb.asGBoolean())

    /**
     * Used by #GTlsConnection implementations to emit the
     * #GTlsConnection::accept-certificate signal.
     *
     * @param peerCert the peer's #GTlsCertificate
     * @param errors the problems with @peer_cert
     * @return true if one of the signal handlers has returned
     *     true to accept @peer_cert
     * @since 2.28
     */
    @GioVersion2_28
    public open fun emitAcceptCertificate(peerCert: TlsCertificate, errors: TlsCertificateFlags): Boolean =
        g_tls_connection_emit_accept_certificate(
            gioTlsConnectionPointer,
            peerCert.gioTlsCertificatePointer,
            errors.mask
        ).asBoolean()

    /**
     * Gets @conn's certificate, as set by
     * g_tls_connection_set_certificate().
     *
     * @return @conn's certificate, or null
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getCertificate(): TlsCertificate? = g_tls_connection_get_certificate(gioTlsConnectionPointer)?.run {
        TlsCertificate(this)
    }

    /**
     * Attempts a TLS handshake on @conn.
     *
     * On the client side, it is never necessary to call this method;
     * although the connection needs to perform a handshake after
     * connecting (or after sending a "STARTTLS"-type command),
     * #GTlsConnection will handle this for you automatically when you try
     * to send or receive data on the connection. You can call
     * g_tls_connection_handshake() manually if you want to know whether
     * the initial handshake succeeded or failed (as opposed to just
     * immediately trying to use @conn to read or write, in which case,
     * if it fails, it may not be possible to tell if it failed before or
     * after completing the handshake), but beware that servers may reject
     * client authentication after the handshake has completed, so a
     * successful handshake does not indicate the connection will be usable.
     *
     * Likewise, on the server side, although a handshake is necessary at
     * the beginning of the communication, you do not need to call this
     * function explicitly unless you want clearer error reporting.
     *
     * Previously, calling g_tls_connection_handshake() after the initial
     * handshake would trigger a rehandshake; however, this usage was
     * deprecated in GLib 2.60 because rehandshaking was removed from the
     * TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * the initial handshake will no longer do anything.
     *
     * When using a #GTlsConnection created by #GSocketClient, the
     * #GSocketClient performs the initial handshake, so calling this
     * function manually is not recommended.
     *
     * #GTlsConnection::accept_certificate may be emitted during the
     * handshake.
     *
     * @param cancellable a #GCancellable, or null
     * @return success or failure
     * @since 2.28
     */
    @GioVersion2_28
    public open fun handshake(cancellable: Cancellable? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_connection_handshake(
            gioTlsConnectionPointer,
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
     * g_tls_connection_handshake() for more information.
     *
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable a #GCancellable, or null
     * @param callback callback to call when the handshake is complete
     * @since 2.28
     */
    @GioVersion2_28
    public open fun handshakeAsync(
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_tls_connection_handshake_async(
        gioTlsConnectionPointer,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finish an asynchronous TLS handshake operation. See
     * g_tls_connection_handshake() for more information.
     *
     * @param result a #GAsyncResult.
     * @return true on success, false on failure, in which
     * case @error will be set.
     * @since 2.28
     */
    @GioVersion2_28
    public open fun handshakeFinish(result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_tls_connection_handshake_finish(
            gioTlsConnectionPointer,
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
     * g_tls_connection_get_negotiated_protocol() to find the negotiated
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
    public open fun setAdvertisedProtocols(protocols: List<String>? = null): Unit = memScoped {
        return g_tls_connection_set_advertised_protocols(gioTlsConnectionPointer, protocols?.toCStringList(this))
    }

    /**
     * This sets the certificate that @conn will present to its peer
     * during the TLS handshake. For a #GTlsServerConnection, it is
     * mandatory to set this, and that will normally be done at construct
     * time.
     *
     * For a #GTlsClientConnection, this is optional. If a handshake fails
     * with %G_TLS_ERROR_CERTIFICATE_REQUIRED, that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_tls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     *
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don't provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_tls_client_connection_get_accepted_cas() will return
     * non-null.)
     *
     * @param certificate the certificate to use for @conn
     * @since 2.28
     */
    @GioVersion2_28
    public open fun setCertificate(certificate: TlsCertificate): Unit =
        g_tls_connection_set_certificate(gioTlsConnectionPointer, certificate.gioTlsCertificatePointer)

    /**
     * Emitted during the TLS handshake after the peer certificate has
     * been received. You can examine @peer_cert's certification path by
     * calling g_tls_certificate_get_issuer() on it.
     *
     * For a client-side connection, @peer_cert is the server's
     * certificate, and the signal will only be emitted if the
     * certificate was not acceptable according to @conn's
     * #GTlsClientConnection:validation_flags. If you would like the
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
     * #GTlsServerConnection:authentication_mode. On the server side,
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
     * @since 2.28
     */
    @GioVersion2_28
    public fun onAcceptCertificate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (peerCert: TlsCertificate, errors: TlsCertificateFlags) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "accept-certificate",
        onAcceptCertificateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<TlsConnection> {
        override val type: GeneratedClassKGType<TlsConnection> =
            GeneratedClassKGType(g_tls_connection_get_type()) { TlsConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of TlsConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_connection_get_type()
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
                TlsCertificate(this)
            },
            errors.run {
                TlsCertificateFlags(this)
            }
        ).asGBoolean()
    }
        .reinterpret()
