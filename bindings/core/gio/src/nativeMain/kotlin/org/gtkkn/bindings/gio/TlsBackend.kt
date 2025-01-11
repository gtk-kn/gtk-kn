// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_48
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsBackend
import org.gtkkn.native.gio.g_tls_backend_get_certificate_type
import org.gtkkn.native.gio.g_tls_backend_get_client_connection_type
import org.gtkkn.native.gio.g_tls_backend_get_default
import org.gtkkn.native.gio.g_tls_backend_get_default_database
import org.gtkkn.native.gio.g_tls_backend_get_dtls_client_connection_type
import org.gtkkn.native.gio.g_tls_backend_get_dtls_server_connection_type
import org.gtkkn.native.gio.g_tls_backend_get_file_database_type
import org.gtkkn.native.gio.g_tls_backend_get_server_connection_type
import org.gtkkn.native.gio.g_tls_backend_get_type
import org.gtkkn.native.gio.g_tls_backend_set_default_database
import org.gtkkn.native.gio.g_tls_backend_supports_dtls
import org.gtkkn.native.gio.g_tls_backend_supports_tls
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend. This is an
 * internal type used to coordinate the different classes implemented
 * by a TLS backend.
 * @since 2.28
 */
@GioVersion2_28
public interface TlsBackend :
    Proxy,
    KGTyped {
    public val gioTlsBackendPointer: CPointer<GTlsBackend>

    /**
     * Gets the #GType of @backend's #GTlsCertificate implementation.
     *
     * @return the #GType of @backend's #GTlsCertificate
     *   implementation.
     * @since 2.28
     */
    @GioVersion2_28
    public fun getCertificateType(): GType = g_tls_backend_get_certificate_type(gioTlsBackendPointer)

    /**
     * Gets the #GType of @backend's #GTlsClientConnection implementation.
     *
     * @return the #GType of @backend's #GTlsClientConnection
     *   implementation.
     * @since 2.28
     */
    @GioVersion2_28
    public fun getClientConnectionType(): GType = g_tls_backend_get_client_connection_type(gioTlsBackendPointer)

    /**
     * Gets the default #GTlsDatabase used to verify TLS connections.
     *
     * @return the default database, which should be
     *               unreffed when done.
     * @since 2.30
     */
    @GioVersion2_30
    public fun getDefaultDatabase(): TlsDatabase = g_tls_backend_get_default_database(gioTlsBackendPointer)!!.run {
        TlsDatabase.TlsDatabaseImpl(this)
    }

    /**
     * Gets the #GType of @backend’s #GDtlsClientConnection implementation.
     *
     * @return the #GType of @backend’s #GDtlsClientConnection
     *   implementation, or %G_TYPE_INVALID if this backend doesn’t support DTLS.
     * @since 2.48
     */
    @GioVersion2_48
    public fun getDtlsClientConnectionType(): GType =
        g_tls_backend_get_dtls_client_connection_type(gioTlsBackendPointer)

    /**
     * Gets the #GType of @backend’s #GDtlsServerConnection implementation.
     *
     * @return the #GType of @backend’s #GDtlsServerConnection
     *   implementation, or %G_TYPE_INVALID if this backend doesn’t support DTLS.
     * @since 2.48
     */
    @GioVersion2_48
    public fun getDtlsServerConnectionType(): GType =
        g_tls_backend_get_dtls_server_connection_type(gioTlsBackendPointer)

    /**
     * Gets the #GType of @backend's #GTlsFileDatabase implementation.
     *
     * @return the #GType of backend's #GTlsFileDatabase implementation.
     * @since 2.30
     */
    @GioVersion2_30
    public fun getFileDatabaseType(): GType = g_tls_backend_get_file_database_type(gioTlsBackendPointer)

    /**
     * Gets the #GType of @backend's #GTlsServerConnection implementation.
     *
     * @return the #GType of @backend's #GTlsServerConnection
     *   implementation.
     * @since 2.28
     */
    @GioVersion2_28
    public fun getServerConnectionType(): GType = g_tls_backend_get_server_connection_type(gioTlsBackendPointer)

    /**
     * Set the default #GTlsDatabase used to verify TLS connections
     *
     * Any subsequent call to g_tls_backend_get_default_database() will return
     * the database set in this call.  Existing databases and connections are not
     * modified.
     *
     * Setting a null default database will reset to using the system default
     * database as if g_tls_backend_set_default_database() had never been called.
     *
     * @param database the #GTlsDatabase
     * @since 2.60
     */
    @GioVersion2_60
    public fun setDefaultDatabase(database: TlsDatabase? = null): Unit =
        g_tls_backend_set_default_database(gioTlsBackendPointer, database?.gioTlsDatabasePointer)

    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     *
     * @return whether DTLS is supported
     * @since 2.48
     */
    @GioVersion2_48
    public fun supportsDtls(): Boolean = g_tls_backend_supports_dtls(gioTlsBackendPointer).asBoolean()

    /**
     * Checks if TLS is supported; if this returns false for the default
     * #GTlsBackend, it means no "real" TLS backend is available.
     *
     * @return whether or not TLS is supported
     * @since 2.28
     */
    @GioVersion2_28
    public fun supportsTls(): Boolean = g_tls_backend_supports_tls(gioTlsBackendPointer).asBoolean()

    /**
     * The TlsBackendImpl type represents a native instance of the TlsBackend interface.
     *
     * @constructor Creates a new instance of TlsBackend for the provided [CPointer].
     */
    public data class TlsBackendImpl(override val gioTlsBackendPointer: CPointer<GTlsBackend>) :
        Object(gioTlsBackendPointer.reinterpret()),
        TlsBackend

    public companion object : TypeCompanion<TlsBackend> {
        override val type: GeneratedInterfaceKGType<TlsBackend> =
            GeneratedInterfaceKGType(g_tls_backend_get_type()) { TlsBackendImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets the default #GTlsBackend for the system.
         *
         * @return a #GTlsBackend, which will be a
         *     dummy object if no TLS backend is available
         * @since 2.28
         */
        @GioVersion2_28
        public fun getDefault(): TlsBackend = g_tls_backend_get_default()!!.run {
            TlsBackendImpl(reinterpret())
        }

        /**
         * Get the GType of TlsBackend
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_backend_get_type()
    }
}
