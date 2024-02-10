// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTokenType
import org.gtkkn.native.glib.GTokenType.G_TOKEN_BINARY
import org.gtkkn.native.glib.GTokenType.G_TOKEN_CHAR
import org.gtkkn.native.glib.GTokenType.G_TOKEN_COMMA
import org.gtkkn.native.glib.GTokenType.G_TOKEN_COMMENT_MULTI
import org.gtkkn.native.glib.GTokenType.G_TOKEN_COMMENT_SINGLE
import org.gtkkn.native.glib.GTokenType.G_TOKEN_EOF
import org.gtkkn.native.glib.GTokenType.G_TOKEN_EQUAL_SIGN
import org.gtkkn.native.glib.GTokenType.G_TOKEN_ERROR
import org.gtkkn.native.glib.GTokenType.G_TOKEN_FLOAT
import org.gtkkn.native.glib.GTokenType.G_TOKEN_HEX
import org.gtkkn.native.glib.GTokenType.G_TOKEN_IDENTIFIER
import org.gtkkn.native.glib.GTokenType.G_TOKEN_IDENTIFIER_NULL
import org.gtkkn.native.glib.GTokenType.G_TOKEN_INT
import org.gtkkn.native.glib.GTokenType.G_TOKEN_LEFT_BRACE
import org.gtkkn.native.glib.GTokenType.G_TOKEN_LEFT_CURLY
import org.gtkkn.native.glib.GTokenType.G_TOKEN_LEFT_PAREN
import org.gtkkn.native.glib.GTokenType.G_TOKEN_NONE
import org.gtkkn.native.glib.GTokenType.G_TOKEN_OCTAL
import org.gtkkn.native.glib.GTokenType.G_TOKEN_RIGHT_BRACE
import org.gtkkn.native.glib.GTokenType.G_TOKEN_RIGHT_CURLY
import org.gtkkn.native.glib.GTokenType.G_TOKEN_RIGHT_PAREN
import org.gtkkn.native.glib.GTokenType.G_TOKEN_STRING
import org.gtkkn.native.glib.GTokenType.G_TOKEN_SYMBOL

/**
 * The possible types of token returned from each
 * g_scanner_get_next_token() call.
 */
public enum class TokenType(
    public val nativeValue: GTokenType,
) {
    /**
     * the end of the file
     */
    EOF(G_TOKEN_EOF),

    /**
     * a '(' character
     */
    LEFT_PAREN(G_TOKEN_LEFT_PAREN),

    /**
     * a ')' character
     */
    RIGHT_PAREN(G_TOKEN_RIGHT_PAREN),

    /**
     * a '{' character
     */
    LEFT_CURLY(G_TOKEN_LEFT_CURLY),

    /**
     * a '}' character
     */
    RIGHT_CURLY(G_TOKEN_RIGHT_CURLY),

    /**
     * a '[' character
     */
    LEFT_BRACE(G_TOKEN_LEFT_BRACE),

    /**
     * a ']' character
     */
    RIGHT_BRACE(G_TOKEN_RIGHT_BRACE),

    /**
     * a '=' character
     */
    EQUAL_SIGN(G_TOKEN_EQUAL_SIGN),

    /**
     * a ',' character
     */
    COMMA(G_TOKEN_COMMA),

    /**
     * not a token
     */
    NONE(G_TOKEN_NONE),

    /**
     * an error occurred
     */
    ERROR(G_TOKEN_ERROR),

    /**
     * a character
     */
    CHAR(G_TOKEN_CHAR),

    /**
     * a binary integer
     */
    BINARY(G_TOKEN_BINARY),

    /**
     * an octal integer
     */
    OCTAL(G_TOKEN_OCTAL),

    /**
     * an integer
     */
    INT(G_TOKEN_INT),

    /**
     * a hex integer
     */
    HEX(G_TOKEN_HEX),

    /**
     * a floating point number
     */
    FLOAT(G_TOKEN_FLOAT),

    /**
     * a string
     */
    STRING(G_TOKEN_STRING),

    /**
     * a symbol
     */
    SYMBOL(G_TOKEN_SYMBOL),

    /**
     * an identifier
     */
    IDENTIFIER(G_TOKEN_IDENTIFIER),

    /**
     * a null identifier
     */
    IDENTIFIER_NULL(G_TOKEN_IDENTIFIER_NULL),

    /**
     * one line comment
     */
    COMMENT_SINGLE(G_TOKEN_COMMENT_SINGLE),

    /**
     * multi line comment
     */
    COMMENT_MULTI(G_TOKEN_COMMENT_MULTI),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTokenType): TokenType =
            when (nativeValue) {
                G_TOKEN_EOF -> EOF
                G_TOKEN_LEFT_PAREN -> LEFT_PAREN
                G_TOKEN_RIGHT_PAREN -> RIGHT_PAREN
                G_TOKEN_LEFT_CURLY -> LEFT_CURLY
                G_TOKEN_RIGHT_CURLY -> RIGHT_CURLY
                G_TOKEN_LEFT_BRACE -> LEFT_BRACE
                G_TOKEN_RIGHT_BRACE -> RIGHT_BRACE
                G_TOKEN_EQUAL_SIGN -> EQUAL_SIGN
                G_TOKEN_COMMA -> COMMA
                G_TOKEN_NONE -> NONE
                G_TOKEN_ERROR -> ERROR
                G_TOKEN_CHAR -> CHAR
                G_TOKEN_BINARY -> BINARY
                G_TOKEN_OCTAL -> OCTAL
                G_TOKEN_INT -> INT
                G_TOKEN_HEX -> HEX
                G_TOKEN_FLOAT -> FLOAT
                G_TOKEN_STRING -> STRING
                G_TOKEN_SYMBOL -> SYMBOL
                G_TOKEN_IDENTIFIER -> IDENTIFIER
                G_TOKEN_IDENTIFIER_NULL -> IDENTIFIER_NULL
                G_TOKEN_COMMENT_SINGLE -> COMMENT_SINGLE
                G_TOKEN_COMMENT_MULTI -> COMMENT_MULTI
                else -> error("invalid nativeValue")
            }
    }
}
