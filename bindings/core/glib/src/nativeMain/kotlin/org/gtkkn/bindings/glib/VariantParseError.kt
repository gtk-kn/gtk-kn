// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GVariantParseError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by parsing text-format GVariants.
 */
public enum class VariantParseError(public val nativeValue: GVariantParseError) {
    /**
     * generic error (unused)
     */
    FAILED(GVariantParseError.G_VARIANT_PARSE_ERROR_FAILED),

    /**
     * a non-basic #GVariantType was given where a basic type was expected
     */
    BASIC_TYPE_EXPECTED(GVariantParseError.G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED),

    /**
     * cannot infer the #GVariantType
     */
    CANNOT_INFER_TYPE(GVariantParseError.G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE),

    /**
     * an indefinite #GVariantType was given where a definite type was expected
     */
    DEFINITE_TYPE_EXPECTED(GVariantParseError.G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED),

    /**
     * extra data after parsing finished
     */
    INPUT_NOT_AT_END(GVariantParseError.G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END),

    /**
     * invalid character in number or unicode escape
     */
    INVALID_CHARACTER(GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_CHARACTER),

    /**
     * not a valid #GVariant format string
     */
    INVALID_FORMAT_STRING(GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING),

    /**
     * not a valid object path
     */
    INVALID_OBJECT_PATH(GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH),

    /**
     * not a valid type signature
     */
    INVALID_SIGNATURE(GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE),

    /**
     * not a valid #GVariant type string
     */
    INVALID_TYPE_STRING(GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING),

    /**
     * could not find a common type for array entries
     */
    NO_COMMON_TYPE(GVariantParseError.G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE),

    /**
     * the numerical value is out of range of the given type
     */
    NUMBER_OUT_OF_RANGE(GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE),

    /**
     * the numerical value is out of range for any type
     */
    NUMBER_TOO_BIG(GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG),

    /**
     * cannot parse as variant of the specified type
     */
    TYPE_ERROR(GVariantParseError.G_VARIANT_PARSE_ERROR_TYPE_ERROR),

    /**
     * an unexpected token was encountered
     */
    UNEXPECTED_TOKEN(GVariantParseError.G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN),

    /**
     * an unknown keyword was encountered
     */
    UNKNOWN_KEYWORD(GVariantParseError.G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD),

    /**
     * unterminated string constant
     */
    UNTERMINATED_STRING_CONSTANT(GVariantParseError.G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT),

    /**
     * no value given
     */
    VALUE_EXPECTED(GVariantParseError.G_VARIANT_PARSE_ERROR_VALUE_EXPECTED),

    /**
     * variant was too deeply nested; #GVariant is only guaranteed to handle nesting up to 64 levels (Since: 2.64)
     */
    RECURSION(GVariantParseError.G_VARIANT_PARSE_ERROR_RECURSION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GVariantParseError): VariantParseError = when (nativeValue) {
            GVariantParseError.G_VARIANT_PARSE_ERROR_FAILED -> FAILED
            GVariantParseError.G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED -> BASIC_TYPE_EXPECTED
            GVariantParseError.G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE -> CANNOT_INFER_TYPE
            GVariantParseError.G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED -> DEFINITE_TYPE_EXPECTED
            GVariantParseError.G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END -> INPUT_NOT_AT_END
            GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_CHARACTER -> INVALID_CHARACTER
            GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING -> INVALID_FORMAT_STRING
            GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH -> INVALID_OBJECT_PATH
            GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE -> INVALID_SIGNATURE
            GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING -> INVALID_TYPE_STRING
            GVariantParseError.G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE -> NO_COMMON_TYPE
            GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE -> NUMBER_OUT_OF_RANGE
            GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG -> NUMBER_TOO_BIG
            GVariantParseError.G_VARIANT_PARSE_ERROR_TYPE_ERROR -> TYPE_ERROR
            GVariantParseError.G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN -> UNEXPECTED_TOKEN
            GVariantParseError.G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD -> UNKNOWN_KEYWORD
            GVariantParseError.G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT -> UNTERMINATED_STRING_CONSTANT
            GVariantParseError.G_VARIANT_PARSE_ERROR_VALUE_EXPECTED -> VALUE_EXPECTED
            GVariantParseError.G_VARIANT_PARSE_ERROR_RECURSION -> RECURSION
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-variant-parse-error-quark")

        public fun fromErrorOrNull(error: Error): VariantParseError? = if (error.domain != quark()) {
            null
        } else {
            VariantParseError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
