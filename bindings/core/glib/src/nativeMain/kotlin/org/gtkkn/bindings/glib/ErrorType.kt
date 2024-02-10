// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GErrorType
import org.gtkkn.native.glib.GErrorType.G_ERR_DIGIT_RADIX
import org.gtkkn.native.glib.GErrorType.G_ERR_FLOAT_MALFORMED
import org.gtkkn.native.glib.GErrorType.G_ERR_FLOAT_RADIX
import org.gtkkn.native.glib.GErrorType.G_ERR_NON_DIGIT_IN_CONST
import org.gtkkn.native.glib.GErrorType.G_ERR_UNEXP_EOF
import org.gtkkn.native.glib.GErrorType.G_ERR_UNEXP_EOF_IN_COMMENT
import org.gtkkn.native.glib.GErrorType.G_ERR_UNEXP_EOF_IN_STRING
import org.gtkkn.native.glib.GErrorType.G_ERR_UNKNOWN

/**
 * The possible errors, used in the @v_error field
 * of #GTokenValue, when the token is a %G_TOKEN_ERROR.
 */
public enum class ErrorType(
    public val nativeValue: GErrorType,
) {
    /**
     * unknown error
     */
    UNKNOWN(G_ERR_UNKNOWN),

    /**
     * unexpected end of file
     */
    UNEXP_EOF(G_ERR_UNEXP_EOF),

    /**
     * unterminated string constant
     */
    UNEXP_EOF_IN_STRING(G_ERR_UNEXP_EOF_IN_STRING),

    /**
     * unterminated comment
     */
    UNEXP_EOF_IN_COMMENT(G_ERR_UNEXP_EOF_IN_COMMENT),

    /**
     * non-digit character in a number
     */
    NON_DIGIT_IN_CONST(G_ERR_NON_DIGIT_IN_CONST),

    /**
     * digit beyond radix in a number
     */
    DIGIT_RADIX(G_ERR_DIGIT_RADIX),

    /**
     * non-decimal floating point number
     */
    FLOAT_RADIX(G_ERR_FLOAT_RADIX),

    /**
     * malformed floating point number
     */
    FLOAT_MALFORMED(G_ERR_FLOAT_MALFORMED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GErrorType): ErrorType =
            when (nativeValue) {
                G_ERR_UNKNOWN -> UNKNOWN
                G_ERR_UNEXP_EOF -> UNEXP_EOF
                G_ERR_UNEXP_EOF_IN_STRING -> UNEXP_EOF_IN_STRING
                G_ERR_UNEXP_EOF_IN_COMMENT -> UNEXP_EOF_IN_COMMENT
                G_ERR_NON_DIGIT_IN_CONST -> NON_DIGIT_IN_CONST
                G_ERR_DIGIT_RADIX -> DIGIT_RADIX
                G_ERR_FLOAT_RADIX -> FLOAT_RADIX
                G_ERR_FLOAT_MALFORMED -> FLOAT_MALFORMED
                else -> error("invalid nativeValue")
            }
    }
}
