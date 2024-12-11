// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GConvertError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by character set conversion routines.
 */
public enum class ConvertError(public val nativeValue: GConvertError) {
    /**
     * Conversion between the requested character
     *     sets is not supported.
     */
    NO_CONVERSION(GConvertError.G_CONVERT_ERROR_NO_CONVERSION),

    /**
     * Invalid byte sequence in conversion input;
     *    or the character sequence could not be represented in the target
     *    character set.
     */
    ILLEGAL_SEQUENCE(GConvertError.G_CONVERT_ERROR_ILLEGAL_SEQUENCE),

    /**
     * Conversion failed for some reason.
     */
    FAILED(GConvertError.G_CONVERT_ERROR_FAILED),

    /**
     * Partial character sequence at end of input.
     */
    PARTIAL_INPUT(GConvertError.G_CONVERT_ERROR_PARTIAL_INPUT),

    /**
     * URI is invalid.
     */
    BAD_URI(GConvertError.G_CONVERT_ERROR_BAD_URI),

    /**
     * Pathname is not an absolute path.
     */
    NOT_ABSOLUTE_PATH(GConvertError.G_CONVERT_ERROR_NOT_ABSOLUTE_PATH),

    /**
     * No memory available. Since: 2.40
     */
    NO_MEMORY(GConvertError.G_CONVERT_ERROR_NO_MEMORY),

    /**
     * An embedded NUL character is present in
     *     conversion output where a NUL-terminated string is expected.
     *     Since: 2.56
     */
    EMBEDDED_NUL(GConvertError.G_CONVERT_ERROR_EMBEDDED_NUL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GConvertError): ConvertError = when (nativeValue) {
            GConvertError.G_CONVERT_ERROR_NO_CONVERSION -> NO_CONVERSION
            GConvertError.G_CONVERT_ERROR_ILLEGAL_SEQUENCE -> ILLEGAL_SEQUENCE
            GConvertError.G_CONVERT_ERROR_FAILED -> FAILED
            GConvertError.G_CONVERT_ERROR_PARTIAL_INPUT -> PARTIAL_INPUT
            GConvertError.G_CONVERT_ERROR_BAD_URI -> BAD_URI
            GConvertError.G_CONVERT_ERROR_NOT_ABSOLUTE_PATH -> NOT_ABSOLUTE_PATH
            GConvertError.G_CONVERT_ERROR_NO_MEMORY -> NO_MEMORY
            GConvertError.G_CONVERT_ERROR_EMBEDDED_NUL -> EMBEDDED_NUL
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g_convert_error")

        public fun fromErrorOrNull(error: Error): ConvertError? = if (error.domain != quark()) {
            null
        } else {
            ConvertError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
