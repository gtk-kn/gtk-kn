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
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsFileDatabase
import org.gtkkn.native.gio.g_tls_file_database_get_type
import org.gtkkn.native.gio.g_tls_file_database_new
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.String

/**
 * `GTlsFileDatabase` is implemented by [class@Gio.TlsDatabase] objects which
 * load their certificate information from a file. It is an interface which
 * TLS library specific subtypes implement.
 *
 * ## Skipped during bindings generation
 *
 * - method `anchors`: Property has no getter nor setter
 *
 * @since 2.30
 */
@GioVersion2_30
public interface TlsFileDatabase :
    Proxy,
    KGTyped {
    public val gioTlsFileDatabasePointer: CPointer<GTlsFileDatabase>

    /**
     * The TlsFileDatabaseImpl type represents a native instance of the TlsFileDatabase interface.
     *
     * @constructor Creates a new instance of TlsFileDatabase for the provided [CPointer].
     */
    public data class TlsFileDatabaseImpl(override val gioTlsFileDatabasePointer: CPointer<GTlsFileDatabase>) :
        TlsDatabase(gioTlsFileDatabasePointer.reinterpret()),
        TlsFileDatabase

    public companion object : TypeCompanion<TlsFileDatabase> {
        override val type: GeneratedInterfaceKGType<TlsFileDatabase> =
            GeneratedInterfaceKGType(getTypeOrNull("g_tls_file_database_get_type")!!) {
                TlsFileDatabaseImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new #GTlsFileDatabase which uses anchor certificate authorities
         * in @anchors to verify certificate chains.
         *
         * The certificates in @anchors must be PEM encoded.
         *
         * @param anchors filename of anchor certificate authorities.
         * @return the new
         * #GTlsFileDatabase, or null on error
         * @since 2.30
         */
        @GioVersion2_30
        public fun new(anchors: String): Result<TlsFileDatabase> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_tls_file_database_new(anchors, gError.ptr)?.run {
                TlsFileDatabaseImpl(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Get the GType of TlsFileDatabase
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_file_database_get_type()
    }
}
