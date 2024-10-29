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
import org.gtkkn.native.gio.GTlsFileDatabase
import org.gtkkn.native.gio.g_tls_file_database_get_type
import org.gtkkn.native.gio.g_tls_file_database_new
import org.gtkkn.native.glib.GError
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
public interface TlsFileDatabase : Interface, KGTyped {
    public val gioTlsFileDatabasePointer: CPointer<GTlsFileDatabase>

    private data class Wrapper(
        private val pointer: CPointer<GTlsFileDatabase>,
    ) : TlsFileDatabase {
        override val gioTlsFileDatabasePointer: CPointer<GTlsFileDatabase> = pointer
    }

    public companion object : TypeCompanion<TlsFileDatabase> {
        override val type: GeneratedInterfaceKGType<TlsFileDatabase> =
            GeneratedInterfaceKGType(g_tls_file_database_get_type()) {
                Wrapper(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GTlsFileDatabase>): TlsFileDatabase = Wrapper(pointer)

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
        public fun new(anchors: String): Result<TlsFileDatabase> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_tls_file_database_new(anchors, gError.ptr)?.run {
                        TlsFileDatabase.wrap(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }
    }
}
