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
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsServerConnection
import org.gtkkn.native.gio.g_tls_server_connection_get_type
import org.gtkkn.native.gio.g_tls_server_connection_new
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Result

/**
 * `GTlsServerConnection` is the server-side subclass of
 * [class@Gio.TlsConnection], representing a server-side TLS connection.
 *
 * ## Skipped during bindings generation
 *
 * - method `authentication-mode`: Property has no getter nor setter
 *
 * @since 2.28
 */
@GioVersion2_28
public interface TlsServerConnection :
    Proxy,
    KGTyped {
    public val gioTlsServerConnectionPointer: CPointer<GTlsServerConnection>

    /**
     * The TlsServerConnectionImpl type represents a native instance of the TlsServerConnection interface.
     *
     * @constructor Creates a new instance of TlsServerConnection for the provided [CPointer].
     */
    public data class TlsServerConnectionImpl(
        override val gioTlsServerConnectionPointer: CPointer<GTlsServerConnection>,
    ) : TlsConnection(gioTlsServerConnectionPointer.reinterpret()),
        TlsServerConnection

    public companion object : TypeCompanion<TlsServerConnection> {
        override val type: GeneratedInterfaceKGType<TlsServerConnection> =
            GeneratedInterfaceKGType(getTypeOrNull("g_tls_server_connection_get_type")!!) {
                TlsServerConnectionImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GTlsServerConnection wrapping @base_io_stream (which
         * must have pollable input and output streams).
         *
         * See the documentation for #GTlsConnection:base-io-stream for restrictions
         * on when application code can run operations on the @base_io_stream after
         * this function has returned.
         *
         * @param baseIoStream the #GIOStream to wrap
         * @param certificate the default server certificate, or null
         * @return the new
         * #GTlsServerConnection, or null on error
         * @since 2.28
         */
        @GioVersion2_28
        public fun new(baseIoStream: IoStream, certificate: TlsCertificate? = null): Result<TlsServerConnection> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_tls_server_connection_new(
                    baseIoStream.gioIoStreamPointer,
                    certificate?.gioTlsCertificatePointer,
                    gError.ptr
                )?.run {
                    TlsServerConnectionImpl(reinterpret())
                }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Get the GType of TlsServerConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_server_connection_get_type()
    }
}
