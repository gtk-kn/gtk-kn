// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GErrorType

/**
 * The possible errors, used in the @v_error field
 * of #GTokenValue, when the token is a %G_TOKEN_ERROR.
 */
public enum class ErrorType(public val nativeValue: GErrorType) {
    /**
     * unknown error
     */
    UNKNOWN(GErrorType.G_ERR_UNKNOWN),

    /**
     * unexpected end of file
     */
    UNEXP_EOF(GErrorType.G_ERR_UNEXP_EOF),

    /**
     * unterminated string constant
     */
    UNEXP_EOF_IN_STRING(GErrorType.G_ERR_UNEXP_EOF_IN_STRING),

    /**
     * unterminated comment
     */
    UNEXP_EOF_IN_COMMENT(GErrorType.G_ERR_UNEXP_EOF_IN_COMMENT),

    /**
     * non-digit character in a number
     */
    NON_DIGIT_IN_CONST(GErrorType.G_ERR_NON_DIGIT_IN_CONST),

    /**
     * digit beyond radix in a number
     */
    DIGIT_RADIX(GErrorType.G_ERR_DIGIT_RADIX),

    /**
     * non-decimal floating point number
     */
    FLOAT_RADIX(GErrorType.G_ERR_FLOAT_RADIX),

    /**
     * malformed floating point number
     */
    FLOAT_MALFORMED(GErrorType.G_ERR_FLOAT_MALFORMED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GErrorType): ErrorType = when (nativeValue) {
            GErrorType.G_ERR_UNKNOWN -> UNKNOWN
            GErrorType.G_ERR_UNEXP_EOF -> UNEXP_EOF
            GErrorType.G_ERR_UNEXP_EOF_IN_STRING -> UNEXP_EOF_IN_STRING
            GErrorType.G_ERR_UNEXP_EOF_IN_COMMENT -> UNEXP_EOF_IN_COMMENT
            GErrorType.G_ERR_NON_DIGIT_IN_CONST -> NON_DIGIT_IN_CONST
            GErrorType.G_ERR_DIGIT_RADIX -> DIGIT_RADIX
            GErrorType.G_ERR_FLOAT_RADIX -> FLOAT_RADIX
            GErrorType.G_ERR_FLOAT_MALFORMED -> FLOAT_MALFORMED
            else -> error("invalid nativeValue")
        }
    }
}
