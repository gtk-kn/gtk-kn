// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gio.GResolverError
import org.gtkkn.native.gio.GResolverError.G_RESOLVER_ERROR_INTERNAL
import org.gtkkn.native.gio.GResolverError.G_RESOLVER_ERROR_NOT_FOUND
import org.gtkkn.native.gio.GResolverError.G_RESOLVER_ERROR_TEMPORARY_FAILURE
import org.gtkkn.native.gio.g_resolver_error_quark
import kotlin.UInt

/**
 * An error code used with %G_RESOLVER_ERROR in a #GError returned
 * from a #GResolver routine.
 * @since 2.22
 */
@GioVersion2_22
public enum class ResolverError(
    public val nativeValue: GResolverError,
) {
    /**
     * the requested name/address/service was not
     *     found
     */
    NOT_FOUND(G_RESOLVER_ERROR_NOT_FOUND),

    /**
     * the requested information could not
     *     be looked up due to a network error or similar problem
     */
    TEMPORARY_FAILURE(G_RESOLVER_ERROR_TEMPORARY_FAILURE),

    /**
     * unknown error
     */
    INTERNAL(G_RESOLVER_ERROR_INTERNAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GResolverError): ResolverError =
            when (nativeValue) {
                G_RESOLVER_ERROR_NOT_FOUND -> NOT_FOUND
                G_RESOLVER_ERROR_TEMPORARY_FAILURE -> TEMPORARY_FAILURE
                G_RESOLVER_ERROR_INTERNAL -> INTERNAL
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the #GResolver Error Quark.
         *
         * @return a #GQuark.
         * @since 2.22
         */
        @GioVersion2_22
        public fun quark(): UInt = g_resolver_error_quark()

        public fun fromErrorOrNull(error: Error): ResolverError? =
            if (error.domain != quark()) {
                null
            } else {
                ResolverError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
