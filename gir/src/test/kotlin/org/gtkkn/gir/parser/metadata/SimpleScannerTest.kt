/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gir.parser.metadata

import kotlin.test.Test
import kotlin.test.assertEquals

class SimpleScannerTest {
    private fun scan(source: String): List<TokenResult> {
        val scanner = SimpleScanner(source)
        val tokens = mutableListOf<TokenResult>()
        var token: TokenResult
        do {
            token = scanner.readToken()
            tokens.add(token)
        } while (token.tokenType != TokenType.EOF)
        return tokens
    }

    @Test
    fun `test identifiers and keywords`() {
        val source = "true false null identifier_name"
        val tokens = scan(source)

        assertEquals(TokenType.TRUE, tokens[0].tokenType)
        assertEquals("true", tokens[0].lexeme)

        assertEquals(TokenType.FALSE, tokens[1].tokenType)
        assertEquals("false", tokens[1].lexeme)

        assertEquals(TokenType.NULL, tokens[2].tokenType)
        assertEquals("null", tokens[2].lexeme)

        assertEquals(TokenType.IDENTIFIER, tokens[3].tokenType)
        assertEquals("identifier_name", tokens[3].lexeme)

        assertEquals(TokenType.EOF, tokens[4].tokenType)
    }

    @Test
    fun `test numeric literals`() {
        val source = "123 45.67"
        val tokens = scan(source)

        assertEquals(TokenType.INTEGER_LITERAL, tokens[0].tokenType)
        assertEquals("123", tokens[0].lexeme)

        assertEquals(TokenType.REAL_LITERAL, tokens[1].tokenType)
        assertEquals("45.67", tokens[1].lexeme)

        assertEquals(TokenType.EOF, tokens[2].tokenType)
    }

    @Test
    fun `test single-character tokens`() {
        val source = ".#-*="
        val tokens = scan(source)

        assertEquals(TokenType.DOT, tokens[0].tokenType)
        assertEquals(".", tokens[0].lexeme)

        assertEquals(TokenType.HASH, tokens[1].tokenType)
        assertEquals("#", tokens[1].lexeme)

        assertEquals(TokenType.MINUS, tokens[2].tokenType)
        assertEquals("-", tokens[2].lexeme)

        assertEquals(TokenType.STAR, tokens[3].tokenType)
        assertEquals("*", tokens[3].lexeme)

        assertEquals(TokenType.ASSIGN, tokens[4].tokenType)
        assertEquals("=", tokens[4].lexeme)

        assertEquals(TokenType.EOF, tokens[5].tokenType)
    }

    @Test
    fun `test string literals`() {
        val source = "\"hello\" 'c'"
        val tokens = scan(source)

        assertEquals(TokenType.STRING_LITERAL, tokens[0].tokenType)
        assertEquals("\"hello\"", tokens[0].lexeme)

        assertEquals(TokenType.CHARACTER_LITERAL, tokens[1].tokenType)
        assertEquals("'c'", tokens[1].lexeme)

        assertEquals(TokenType.EOF, tokens[2].tokenType)
    }

    @Test
    fun `test newlines`() {
        val source = "line1\nline2"
        val tokens = scan(source)

        assertEquals(TokenType.IDENTIFIER, tokens[0].tokenType)
        assertEquals("line1", tokens[0].lexeme)

        assertEquals(TokenType.IDENTIFIER, tokens[1].tokenType)
        assertEquals("line2", tokens[1].lexeme)

        assertEquals(TokenType.EOF, tokens[2].tokenType)
    }

    @Test
    fun `test comments`() {
        val source = """
            // This is a line comment
            /* This is a
               block comment */
            identifier
        """.trimIndent()
        val tokens = scan(source)

        assertEquals(TokenType.IDENTIFIER, tokens[0].tokenType)
        assertEquals("identifier", tokens[0].lexeme)

        assertEquals(TokenType.EOF, tokens[1].tokenType)
    }

    @Test
    fun `test unexpected characters`() {
        val source = "@"
        val tokens = scan(source)

        assertEquals(TokenType.UNKNOWN, tokens[0].tokenType)
        assertEquals("@", tokens[0].lexeme)

        assertEquals(TokenType.EOF, tokens[1].tokenType)
    }

    @Test
    fun `test mixed tokens`() {
        val source = """
            true 123 . # "hello"
            false 45.67 * null identifier_name
        """.trimIndent()
        val tokens = scan(source)

        assertEquals(TokenType.TRUE, tokens[0].tokenType)
        assertEquals("true", tokens[0].lexeme)

        assertEquals(TokenType.INTEGER_LITERAL, tokens[1].tokenType)
        assertEquals("123", tokens[1].lexeme)

        assertEquals(TokenType.DOT, tokens[2].tokenType)
        assertEquals(".", tokens[2].lexeme)

        assertEquals(TokenType.HASH, tokens[3].tokenType)
        assertEquals("#", tokens[3].lexeme)

        assertEquals(TokenType.STRING_LITERAL, tokens[4].tokenType)
        assertEquals("\"hello\"", tokens[4].lexeme)

        assertEquals(TokenType.FALSE, tokens[5].tokenType)
        assertEquals("false", tokens[5].lexeme)

        assertEquals(TokenType.REAL_LITERAL, tokens[6].tokenType)
        assertEquals("45.67", tokens[6].lexeme)

        assertEquals(TokenType.STAR, tokens[7].tokenType)
        assertEquals("*", tokens[7].lexeme)

        assertEquals(TokenType.NULL, tokens[8].tokenType)
        assertEquals("null", tokens[8].lexeme)

        assertEquals(TokenType.IDENTIFIER, tokens[9].tokenType)
        assertEquals("identifier_name", tokens[9].lexeme)

        assertEquals(TokenType.EOF, tokens[10].tokenType)
    }

    @Test
    fun `test indentation and dedentation`() {
        val source = """
            line1
                line2
                    line3
            line4
        """.trimIndent()
        val tokens = scan(source)

        assertEquals(TokenType.IDENTIFIER, tokens[0].tokenType)
        assertEquals("line1", tokens[0].lexeme)

        // Indentation level 1
        assertEquals(TokenType.IDENTIFIER, tokens[1].tokenType)
        assertEquals("line2", tokens[1].lexeme)

        // Indentation level 2
        assertEquals(TokenType.IDENTIFIER, tokens[2].tokenType)
        assertEquals("line3", tokens[2].lexeme)

        // Dedentation back to level 0
        assertEquals(TokenType.IDENTIFIER, tokens[3].tokenType)
        assertEquals("line4", tokens[3].lexeme)

        assertEquals(TokenType.EOF, tokens[4].tokenType)
    }
}
