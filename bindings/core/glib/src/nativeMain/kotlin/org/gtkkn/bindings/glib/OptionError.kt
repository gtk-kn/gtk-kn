// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GOptionError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by option parsing.
 */
public enum class OptionError(
    public val nativeValue: GOptionError,
) {
    /**
     * An option was not known to the parser.
     *  This error will only be reported, if the parser hasn't been instructed
     *  to ignore unknown options, see g_option_context_set_ignore_unknown_options().
     */
    UNKNOWN_OPTION(GOptionError.G_OPTION_ERROR_UNKNOWN_OPTION),

    /**
     * A value couldn't be parsed.
     */
    BAD_VALUE(GOptionError.G_OPTION_ERROR_BAD_VALUE),

    /**
     * A #GOptionArgFunc callback failed.
     */
    FAILED(GOptionError.G_OPTION_ERROR_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GOptionError): OptionError =
            when (nativeValue) {
                GOptionError.G_OPTION_ERROR_UNKNOWN_OPTION -> UNKNOWN_OPTION
                GOptionError.G_OPTION_ERROR_BAD_VALUE -> BAD_VALUE
                GOptionError.G_OPTION_ERROR_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-option-context-error-quark")

        public fun fromErrorOrNull(error: Error): OptionError? =
            if (error.domain != quark()) {
                null
            } else {
                OptionError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
