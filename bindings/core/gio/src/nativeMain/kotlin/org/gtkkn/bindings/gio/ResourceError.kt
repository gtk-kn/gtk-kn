// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gio.GResourceError
import org.gtkkn.native.gio.GResourceError.G_RESOURCE_ERROR_INTERNAL
import org.gtkkn.native.gio.GResourceError.G_RESOURCE_ERROR_NOT_FOUND
import org.gtkkn.native.gio.g_resource_error_quark
import kotlin.UInt

/**
 * An error code used with %G_RESOURCE_ERROR in a #GError returned
 * from a #GResource routine.
 * @since 2.32
 */
public enum class ResourceError(
    public val nativeValue: GResourceError,
) {
    /**
     * no file was found at the requested path
     */
    NOT_FOUND(G_RESOURCE_ERROR_NOT_FOUND),

    /**
     * unknown error
     */
    INTERNAL(G_RESOURCE_ERROR_INTERNAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GResourceError): ResourceError =
            when (nativeValue) {
                G_RESOURCE_ERROR_NOT_FOUND -> NOT_FOUND
                G_RESOURCE_ERROR_INTERNAL -> INTERNAL
                else -> error("invalid nativeValue")
            }

        /**
         * Gets the #GResource Error Quark.
         *
         * @return a #GQuark
         * @since 2.32
         */
        public fun quark(): UInt = g_resource_error_quark()

        public fun fromErrorOrNull(error: Error): ResourceError? =
            if (error.domain != quark()) {
                null
            } else {
                ResourceError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
