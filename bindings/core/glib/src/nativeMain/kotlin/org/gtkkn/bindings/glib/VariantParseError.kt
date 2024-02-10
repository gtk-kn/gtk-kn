// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GVariantParseError
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_FAILED
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_CHARACTER
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_RECURSION
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_TYPE_ERROR
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT
import org.gtkkn.native.glib.GVariantParseError.G_VARIANT_PARSE_ERROR_VALUE_EXPECTED
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by parsing text-format GVariants.
 */
public enum class VariantParseError(
    public val nativeValue: GVariantParseError,
) {
    /**
     * generic error (unused)
     */
    FAILED(G_VARIANT_PARSE_ERROR_FAILED),

    /**
     * a non-basic #GVariantType was given where a basic type was expected
     */
    BASIC_TYPE_EXPECTED(G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED),

    /**
     * cannot infer the #GVariantType
     */
    CANNOT_INFER_TYPE(G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE),

    /**
     * an indefinite #GVariantType was given where a definite type was expected
     */
    DEFINITE_TYPE_EXPECTED(G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED),

    /**
     * extra data after parsing finished
     */
    INPUT_NOT_AT_END(G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END),

    /**
     * invalid character in number or unicode escape
     */
    INVALID_CHARACTER(G_VARIANT_PARSE_ERROR_INVALID_CHARACTER),

    /**
     * not a valid #GVariant format string
     */
    INVALID_FORMAT_STRING(G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING),

    /**
     * not a valid object path
     */
    INVALID_OBJECT_PATH(G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH),

    /**
     * not a valid type signature
     */
    INVALID_SIGNATURE(G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE),

    /**
     * not a valid #GVariant type string
     */
    INVALID_TYPE_STRING(G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING),

    /**
     * could not find a common type for array entries
     */
    NO_COMMON_TYPE(G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE),

    /**
     * the numerical value is out of range of the given type
     */
    NUMBER_OUT_OF_RANGE(G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE),

    /**
     * the numerical value is out of range for any type
     */
    NUMBER_TOO_BIG(G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG),

    /**
     * cannot parse as variant of the specified type
     */
    TYPE_ERROR(G_VARIANT_PARSE_ERROR_TYPE_ERROR),

    /**
     * an unexpected token was encountered
     */
    UNEXPECTED_TOKEN(G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN),

    /**
     * an unknown keyword was encountered
     */
    UNKNOWN_KEYWORD(G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD),

    /**
     * unterminated string constant
     */
    UNTERMINATED_STRING_CONSTANT(G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT),

    /**
     * no value given
     */
    VALUE_EXPECTED(G_VARIANT_PARSE_ERROR_VALUE_EXPECTED),

    /**
     * variant was too deeply nested; #GVariant is only guaranteed to handle nesting up to 64 levels
     * (Since: 2.64)
     */
    RECURSION(G_VARIANT_PARSE_ERROR_RECURSION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GVariantParseError): VariantParseError =
            when (nativeValue) {
                G_VARIANT_PARSE_ERROR_FAILED -> FAILED
                G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED -> BASIC_TYPE_EXPECTED
                G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE -> CANNOT_INFER_TYPE
                G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED -> DEFINITE_TYPE_EXPECTED
                G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END -> INPUT_NOT_AT_END
                G_VARIANT_PARSE_ERROR_INVALID_CHARACTER -> INVALID_CHARACTER
                G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING -> INVALID_FORMAT_STRING
                G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH -> INVALID_OBJECT_PATH
                G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE -> INVALID_SIGNATURE
                G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING -> INVALID_TYPE_STRING
                G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE -> NO_COMMON_TYPE
                G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE -> NUMBER_OUT_OF_RANGE
                G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG -> NUMBER_TOO_BIG
                G_VARIANT_PARSE_ERROR_TYPE_ERROR -> TYPE_ERROR
                G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN -> UNEXPECTED_TOKEN
                G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD -> UNKNOWN_KEYWORD
                G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT -> UNTERMINATED_STRING_CONSTANT
                G_VARIANT_PARSE_ERROR_VALUE_EXPECTED -> VALUE_EXPECTED
                G_VARIANT_PARSE_ERROR_RECURSION -> RECURSION
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-variant-parse-error-quark")

        public fun fromErrorOrNull(error: Error): VariantParseError? =
            if (error.domain !=
                quark()
            ) {
                null
            } else {
                VariantParseError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
