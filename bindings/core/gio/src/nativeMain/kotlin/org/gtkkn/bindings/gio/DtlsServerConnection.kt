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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.GDtlsConnection
import org.gtkkn.native.gio.GDtlsServerConnection
import org.gtkkn.native.gio.g_dtls_server_connection_get_type
import org.gtkkn.native.gio.g_dtls_server_connection_new
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
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
@GioVersion2_48
public interface DtlsServerConnection :
    Proxy,
    DatagramBased,
    DtlsConnection,
    KGTyped {
    public val gioDtlsServerConnectionPointer: CPointer<GDtlsServerConnection>

    override val gioDatagramBasedPointer: CPointer<GDatagramBased>
        get() = gioDtlsServerConnectionPointer.reinterpret()

    override val gioDtlsConnectionPointer: CPointer<GDtlsConnection>
        get() = gioDtlsServerConnectionPointer.reinterpret()

    /**
     * The DtlsServerConnectionImpl type represents a native instance of the DtlsServerConnection interface.
     *
     * @constructor Creates a new instance of DtlsServerConnection for the provided [CPointer].
     */
    public class DtlsServerConnectionImpl(gioDtlsServerConnectionPointer: CPointer<GDtlsServerConnection>) :
        Object(gioDtlsServerConnectionPointer.reinterpret()),
        DtlsServerConnection {
        init {
            Gio
        }

        override val gioDtlsServerConnectionPointer: CPointer<GDtlsServerConnection> =
            gioDtlsServerConnectionPointer
    }

    public companion object : TypeCompanion<DtlsServerConnection> {
        override val type: GeneratedInterfaceKGType<DtlsServerConnection> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { DtlsServerConnectionImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GDtlsServerConnection wrapping @base_socket.
         *
         * @param baseSocket the #GDatagramBased to wrap
         * @param certificate the default server certificate, or null
         * @return the new
         *   #GDtlsServerConnection, or null on error
         * @since 2.48
         */
        @GioVersion2_48
        public fun new(baseSocket: DatagramBased, certificate: TlsCertificate? = null): Result<DtlsServerConnection> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_dtls_server_connection_new(
                    baseSocket.gioDatagramBasedPointer,
                    certificate?.gioTlsCertificatePointer,
                    gError.ptr
                )?.run {
                    DtlsServerConnectionImpl(reinterpret())
                }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Get the GType of DtlsServerConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_dtls_server_connection_get_type()

        /**
         * Gets the GType of from the symbol `g_dtls_server_connection_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_dtls_server_connection_get_type")
    }
}
