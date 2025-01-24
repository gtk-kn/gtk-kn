// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gio.GResolverError
import org.gtkkn.native.gio.g_resolver_error_get_type
import org.gtkkn.native.gio.g_resolver_error_quark
import org.gtkkn.native.gobject.GType

/**
 * An error code used with %G_RESOLVER_ERROR in a #GError returned
 * from a #GResolver routine.
 * @since 2.22
 */
@GioVersion2_22
public enum class ResolverError(public val nativeValue: GResolverError) {
    /**
     * the requested name/address/service was not
     *     found
     */
    NOT_FOUND(GResolverError.G_RESOLVER_ERROR_NOT_FOUND),

    /**
     * the requested information could not
     *     be looked up due to a network error or similar problem
     */
    TEMPORARY_FAILURE(GResolverError.G_RESOLVER_ERROR_TEMPORARY_FAILURE),

    /**
     * unknown error
     */
    INTERNAL(GResolverError.G_RESOLVER_ERROR_INTERNAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GResolverError): ResolverError = when (nativeValue) {
            GResolverError.G_RESOLVER_ERROR_NOT_FOUND -> NOT_FOUND
            GResolverError.G_RESOLVER_ERROR_TEMPORARY_FAILURE -> TEMPORARY_FAILURE
            GResolverError.G_RESOLVER_ERROR_INTERNAL -> INTERNAL
            else -> error("invalid nativeValue")
        }

        /**
         * Gets the #GResolver Error Quark.
         *
         * @return a #GQuark.
         * @since 2.22
         */
        @GioVersion2_22
        public fun quark(): Quark = g_resolver_error_quark()

        /**
         * Get the GType of ResolverError
         *
         * @return the GType
         */
        public fun getType(): GType = g_resolver_error_get_type()

        public fun fromErrorOrNull(error: Error): ResolverError? = if (error.domain != quark()) {
            null
        } else {
            ResolverError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
