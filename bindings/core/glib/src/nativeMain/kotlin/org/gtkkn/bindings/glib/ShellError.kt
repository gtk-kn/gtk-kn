// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GShellError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by shell functions.
 */
public enum class ShellError(
    public val nativeValue: GShellError,
) {
    /**
     * Mismatched or otherwise mangled quoting.
     */
    BAD_QUOTING(GShellError.G_SHELL_ERROR_BAD_QUOTING),

    /**
     * String to be parsed was empty.
     */
    EMPTY_STRING(GShellError.G_SHELL_ERROR_EMPTY_STRING),

    /**
     * Some other error.
     */
    FAILED(GShellError.G_SHELL_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GShellError): ShellError =
            when (nativeValue) {
                GShellError.G_SHELL_ERROR_BAD_QUOTING -> BAD_QUOTING
                GShellError.G_SHELL_ERROR_EMPTY_STRING -> EMPTY_STRING
                GShellError.G_SHELL_ERROR_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-shell-error-quark")

        public fun fromErrorOrNull(error: Error): ShellError? =
            if (error.domain != quark()) {
                null
            } else {
                ShellError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
