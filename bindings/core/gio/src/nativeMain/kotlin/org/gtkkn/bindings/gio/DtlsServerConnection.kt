// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.GDtlsConnection
import org.gtkkn.native.gio.GDtlsServerConnection
import org.gtkkn.native.gio.g_dtls_server_connection_get_type
import org.gtkkn.native.gio.g_dtls_server_connection_new
import org.gtkkn.native.glib.GError
import kotlin.Result

/**
 * `GDtlsServerConnection` is the server-side subclass of
 * [iface@Gio.DtlsConnection], representing a server-side DTLS connection.
 *
 * ## Skipped during bindings generation
 *
 * - method `authentication-mode`: Property has no getter nor setter
 *
 * @since 2.48
 */
public interface DtlsServerConnection : Interface, DatagramBased, DtlsConnection, KGTyped {
    public val gioDtlsServerConnectionPointer: CPointer<GDtlsServerConnection>

    override val gioDatagramBasedPointer: CPointer<GDatagramBased>
        get() = gioDtlsServerConnectionPointer.reinterpret()

    override val gioDtlsConnectionPointer: CPointer<GDtlsConnection>
        get() = gioDtlsServerConnectionPointer.reinterpret()

    private data class Wrapper(
        private val pointer: CPointer<GDtlsServerConnection>,
    ) : DtlsServerConnection {
        override val gioDtlsServerConnectionPointer: CPointer<GDtlsServerConnection> = pointer
    }

    public companion object : TypeCompanion<DtlsServerConnection> {
        override val type: GeneratedInterfaceKGType<DtlsServerConnection> =
            GeneratedInterfaceKGType(g_dtls_server_connection_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDtlsServerConnection>): DtlsServerConnection = Wrapper(pointer)

        /**
         * Creates a new #GDtlsServerConnection wrapping @base_socket.
         *
         * @param baseSocket the #GDatagramBased to wrap
         * @param certificate the default server certificate, or null
         * @return the new
         *   #GDtlsServerConnection, or null on error
         * @since 2.48
         */
        public fun new(
            baseSocket: DatagramBased,
            certificate: TlsCertificate? = null,
        ): Result<DtlsServerConnection> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_dtls_server_connection_new(
                        baseSocket.gioDatagramBasedPointer,
                        certificate?.gioTlsCertificatePointer?.reinterpret(),
                        gError.ptr
                    )?.run {
                        DtlsServerConnection.wrap(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }
    }
}
