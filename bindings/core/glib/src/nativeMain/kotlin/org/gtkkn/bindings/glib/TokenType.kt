// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTokenType

/**
 * The possible types of token returned from each
 * g_scanner_get_next_token() call.
 */
public enum class TokenType(public val nativeValue: GTokenType) {
    /**
     * the end of the file
     */
    EOF(GTokenType.G_TOKEN_EOF),

    /**
     * a '(' character
     */
    LEFT_PAREN(GTokenType.G_TOKEN_LEFT_PAREN),

    /**
     * a ')' character
     */
    RIGHT_PAREN(GTokenType.G_TOKEN_RIGHT_PAREN),

    /**
     * a '{' character
     */
    LEFT_CURLY(GTokenType.G_TOKEN_LEFT_CURLY),

    /**
     * a '}' character
     */
    RIGHT_CURLY(GTokenType.G_TOKEN_RIGHT_CURLY),

    /**
     * a '[' character
     */
    LEFT_BRACE(GTokenType.G_TOKEN_LEFT_BRACE),

    /**
     * a ']' character
     */
    RIGHT_BRACE(GTokenType.G_TOKEN_RIGHT_BRACE),

    /**
     * a '=' character
     */
    EQUAL_SIGN(GTokenType.G_TOKEN_EQUAL_SIGN),

    /**
     * a ',' character
     */
    COMMA(GTokenType.G_TOKEN_COMMA),

    /**
     * not a token
     */
    NONE(GTokenType.G_TOKEN_NONE),

    /**
     * an error occurred
     */
    ERROR(GTokenType.G_TOKEN_ERROR),

    /**
     * a character
     */
    CHAR(GTokenType.G_TOKEN_CHAR),

    /**
     * a binary integer
     */
    BINARY(GTokenType.G_TOKEN_BINARY),

    /**
     * an octal integer
     */
    OCTAL(GTokenType.G_TOKEN_OCTAL),

    /**
     * an integer
     */
    INT(GTokenType.G_TOKEN_INT),

    /**
     * a hex integer
     */
    HEX(GTokenType.G_TOKEN_HEX),

    /**
     * a floating point number
     */
    FLOAT(GTokenType.G_TOKEN_FLOAT),

    /**
     * a string
     */
    STRING(GTokenType.G_TOKEN_STRING),

    /**
     * a symbol
     */
    SYMBOL(GTokenType.G_TOKEN_SYMBOL),

    /**
     * an identifier
     */
    IDENTIFIER(GTokenType.G_TOKEN_IDENTIFIER),

    /**
     * a null identifier
     */
    IDENTIFIER_NULL(GTokenType.G_TOKEN_IDENTIFIER_NULL),

    /**
     * one line comment
     */
    COMMENT_SINGLE(GTokenType.G_TOKEN_COMMENT_SINGLE),

    /**
     * multi line comment
     */
    COMMENT_MULTI(GTokenType.G_TOKEN_COMMENT_MULTI),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTokenType): TokenType = when (nativeValue) {
            GTokenType.G_TOKEN_EOF -> EOF
            GTokenType.G_TOKEN_LEFT_PAREN -> LEFT_PAREN
            GTokenType.G_TOKEN_RIGHT_PAREN -> RIGHT_PAREN
            GTokenType.G_TOKEN_LEFT_CURLY -> LEFT_CURLY
            GTokenType.G_TOKEN_RIGHT_CURLY -> RIGHT_CURLY
            GTokenType.G_TOKEN_LEFT_BRACE -> LEFT_BRACE
            GTokenType.G_TOKEN_RIGHT_BRACE -> RIGHT_BRACE
            GTokenType.G_TOKEN_EQUAL_SIGN -> EQUAL_SIGN
            GTokenType.G_TOKEN_COMMA -> COMMA
            GTokenType.G_TOKEN_NONE -> NONE
            GTokenType.G_TOKEN_ERROR -> ERROR
            GTokenType.G_TOKEN_CHAR -> CHAR
            GTokenType.G_TOKEN_BINARY -> BINARY
            GTokenType.G_TOKEN_OCTAL -> OCTAL
            GTokenType.G_TOKEN_INT -> INT
            GTokenType.G_TOKEN_HEX -> HEX
            GTokenType.G_TOKEN_FLOAT -> FLOAT
            GTokenType.G_TOKEN_STRING -> STRING
            GTokenType.G_TOKEN_SYMBOL -> SYMBOL
            GTokenType.G_TOKEN_IDENTIFIER -> IDENTIFIER
            GTokenType.G_TOKEN_IDENTIFIER_NULL -> IDENTIFIER_NULL
            GTokenType.G_TOKEN_COMMENT_SINGLE -> COMMENT_SINGLE
            GTokenType.G_TOKEN_COMMENT_MULTI -> COMMENT_MULTI
            else -> error("invalid nativeValue")
        }
    }
}
