// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
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
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 * @since 2.28
 */
public interface TlsBackend : Interface, KGTyped {
    public val gioTlsBackendPointer: CPointer<GTlsBackend>

    /**
     * Gets the #GType of @backend's #GTlsCertificate implementation.
     *
     * @return the #GType of @backend's #GTlsCertificate
     *   implementation.
     * @since 2.28
     */
    public fun getCertificateType(): ULong = g_tls_backend_get_certificate_type(gioTlsBackendPointer.reinterpret())

    /**
     * Gets the #GType of @backend's #GTlsClientConnection implementation.
     *
     * @return the #GType of @backend's #GTlsClientConnection
     *   implementation.
     * @since 2.28
     */
    public fun getClientConnectionType(): ULong =
        g_tls_backend_get_client_connection_type(gioTlsBackendPointer.reinterpret())

    /**
     * Gets the default #GTlsDatabase used to verify TLS connections.
     *
     * @return the default database, which should be
     *               unreffed when done.
     * @since 2.30
     */
    public fun getDefaultDatabase(): TlsDatabase =
        g_tls_backend_get_default_database(gioTlsBackendPointer.reinterpret())!!.run {
            TlsDatabase(reinterpret())
        }

    /**
     * Gets the #GType of @backend’s #GDtlsClientConnection implementation.
     *
     * @return the #GType of @backend’s #GDtlsClientConnection
     *   implementation, or %G_TYPE_INVALID if this backend doesn’t support DTLS.
     * @since 2.48
     */
    public fun getDtlsClientConnectionType(): ULong =
        g_tls_backend_get_dtls_client_connection_type(gioTlsBackendPointer.reinterpret())

    /**
     * Gets the #GType of @backend’s #GDtlsServerConnection implementation.
     *
     * @return the #GType of @backend’s #GDtlsServerConnection
     *   implementation, or %G_TYPE_INVALID if this backend doesn’t support DTLS.
     * @since 2.48
     */
    public fun getDtlsServerConnectionType(): ULong =
        g_tls_backend_get_dtls_server_connection_type(gioTlsBackendPointer.reinterpret())

    /**
     * Gets the #GType of @backend's #GTlsFileDatabase implementation.
     *
     * @return the #GType of backend's #GTlsFileDatabase implementation.
     * @since 2.30
     */
    public fun getFileDatabaseType(): ULong = g_tls_backend_get_file_database_type(gioTlsBackendPointer.reinterpret())

    /**
     * Gets the #GType of @backend's #GTlsServerConnection implementation.
     *
     * @return the #GType of @backend's #GTlsServerConnection
     *   implementation.
     * @since 2.28
     */
    public fun getServerConnectionType(): ULong =
        g_tls_backend_get_server_connection_type(gioTlsBackendPointer.reinterpret())

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
    public fun setDefaultDatabase(database: TlsDatabase? = null): Unit =
        g_tls_backend_set_default_database(
            gioTlsBackendPointer.reinterpret(),
            database?.gioTlsDatabasePointer?.reinterpret()
        )

    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     *
     * @return whether DTLS is supported
     * @since 2.48
     */
    public fun supportsDtls(): Boolean = g_tls_backend_supports_dtls(gioTlsBackendPointer.reinterpret()).asBoolean()

    /**
     * Checks if TLS is supported; if this returns false for the default
     * #GTlsBackend, it means no "real" TLS backend is available.
     *
     * @return whether or not TLS is supported
     * @since 2.28
     */
    public fun supportsTls(): Boolean = g_tls_backend_supports_tls(gioTlsBackendPointer.reinterpret()).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<GTlsBackend>,
    ) : TlsBackend {
        override val gioTlsBackendPointer: CPointer<GTlsBackend> = pointer
    }

    public companion object : TypeCompanion<TlsBackend> {
        override val type: GeneratedInterfaceKGType<TlsBackend> =
            GeneratedInterfaceKGType(g_tls_backend_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GTlsBackend>): TlsBackend = Wrapper(pointer)

        /**
         * Gets the default #GTlsBackend for the system.
         *
         * @return a #GTlsBackend, which will be a
         *     dummy object if no TLS backend is available
         * @since 2.28
         */
        public fun getDefault(): TlsBackend =
            g_tls_backend_get_default()!!.run {
                TlsBackend.wrap(reinterpret())
            }
    }
}
