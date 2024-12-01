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

/**
 * A simple lexical scanner for parsing a source string into tokens.
 *
 * This scanner is designed to tokenize source code strings based on a predefined
 * set of token types, handling various types of literals, keywords, comments, and other constructs.
 *
 * @property source The input source code string to tokenize.
 */
class SimpleScanner(val source: String) {
    private var pos = 0
    private var line = 1
    private var column = 1
    private var indentLevel = 0
    private var pendingDedents = 0

    /**
     * Reads the next token from the source code.
     *
     * This function processes the source code to identify the next token and updates
     * the scanner's state accordingly. It handles:
     * - Whitespace and comments.
     * - Keywords, identifiers, literals, and special characters.
     * - Indentation and dedentation.
     *
     * @return The next [TokenResult] representing the identified token.
     */
    @Suppress("CyclomaticComplexMethod", "LongMethod")
    fun readToken(): TokenResult {
        // Handle EOF and dedentation when reaching the end of the source.
        if (pos >= source.length) {
            return if (indentLevel > 0) {
                indentLevel--
                pendingDedents = indentLevel
                createToken(TokenType.DEDENT, "", pos, line, column)
            } else {
                createToken(TokenType.EOF, "", pos, line, column)
            }
        }

        skipWhitespaceAndComments()

        // Handle pending dedentation.
        if (pendingDedents > 0) {
            pendingDedents--
            indentLevel--
            return createToken(TokenType.DEDENT, "", pos, line, column)
        }

        // Record the start position of the current token.
        val beginPos = pos
        val beginLine = line
        val beginColumn = column

        // Handle EOF after processing whitespace and comments.
        return if (isAtEnd()) {
            createToken(TokenType.EOF, "", pos, line, column)
        } else {
            // Determine the token type based on the next character.
            when (val c = advance()) {
                in 'a'..'z', in 'A'..'Z', '_' -> readIdentifierOrKeyword(beginPos, beginLine, beginColumn)
                in '0'..'9' -> readNumberLiteral(beginPos, beginLine, beginColumn)
                '.' -> createSingleCharToken(TokenType.DOT, c, beginPos, beginLine, beginColumn)
                '#' -> createSingleCharToken(TokenType.HASH, c, beginPos, beginLine, beginColumn)
                '-' -> createSingleCharToken(TokenType.MINUS, c, beginPos, beginLine, beginColumn)
                '*' -> createSingleCharToken(TokenType.STAR, c, beginPos, beginLine, beginColumn)
                '=' -> createSingleCharToken(TokenType.ASSIGN, c, beginPos, beginLine, beginColumn)
                '"', '\'' -> readStringOrCharLiteral(c, beginPos, beginLine, beginColumn)
                else -> handleUnknownChar(c, beginPos, beginLine, beginColumn)
            }
        }
    }

    /**
     * Creates a token with the given attributes.
     *
     * @param type The type of the token.
     * @param lexeme The string representation of the token.
     * @param beginPos The start position of the token.
     * @param beginLine The line number where the token starts.
     * @param beginColumn The column number where the token starts.
     * @return A [TokenResult] representing the token.
     */
    private fun createToken(
        type: TokenType,
        lexeme: String,
        beginPos: Int,
        beginLine: Int,
        beginColumn: Int,
    ) = TokenResult(
        type,
        lexeme,
        sourceLocation(beginPos, beginLine, beginColumn),
        currentLocation(),
    )

    /**
     * Reads an identifier or keyword from the source.
     *
     * Identifies whether the sequence of characters starting at [beginPos] represents
     * a keyword or an identifier.
     *
     * @param beginPos The starting position of the sequence.
     * @param beginLine The starting line number.
     * @param beginColumn The starting column number.
     * @return A [TokenResult] for the identifier or keyword.
     */
    private fun readIdentifierOrKeyword(beginPos: Int, beginLine: Int, beginColumn: Int): TokenResult {
        while (!isAtEnd() && (peek().isLetterOrDigit() || peek() == '_')) {
            advance()
        }
        val lexeme = source.substring(beginPos, pos)
        val tokenType = keywords[lexeme] ?: TokenType.IDENTIFIER
        return createToken(tokenType, lexeme, beginPos, beginLine, beginColumn)
    }

    /**
     * Parses a numeric literal, including integers and real numbers.
     *
     * @param beginPos The starting position of the literal.
     * @param beginLine The starting line number.
     * @param beginColumn The starting column number.
     * @return A [TokenResult] for the numeric literal.
     */
    private fun readNumberLiteral(beginPos: Int, beginLine: Int, beginColumn: Int): TokenResult {
        parseDigits()
        val isReal = if (!isAtEnd() && peek() == '.') {
            advance()
            parseDigits()
            true
        } else {
            false
        }
        val lexeme = source.substring(beginPos, pos)
        val tokenType = if (isReal) TokenType.REAL_LITERAL else TokenType.INTEGER_LITERAL
        return createToken(tokenType, lexeme, beginPos, beginLine, beginColumn)
    }

    private fun parseDigits() {
        while (!isAtEnd() && peek().isDigit()) {
            advance()
        }
    }

    private fun createSingleCharToken(
        type: TokenType,
        lexeme: Char,
        beginPos: Int,
        beginLine: Int,
        beginColumn: Int
    ): TokenResult = createToken(type, lexeme.toString(), beginPos, beginLine, beginColumn)

    /**
     * Reads a string or character literal from the source.
     *
     * @param quoteChar The quote character that starts the literal.
     * @param beginPos The starting position of the literal.
     * @param beginLine The starting line number.
     * @param beginColumn The starting column number.
     * @return A [TokenResult] for the string or character literal.
     */
    private fun readStringOrCharLiteral(
        quoteChar: Char,
        beginPos: Int,
        beginLine: Int,
        beginColumn: Int,
    ): TokenResult {
        while (!isAtEnd() && peek() != quoteChar) {
            advance()
        }
        if (!isAtEnd()) {
            advance() // Consume closing quote
        } else {
            Report.error(
                source = createSourceReference(beginPos, beginLine, beginColumn),
                message = "Unterminated string or character literal",
            )
        }
        val lexeme = source.substring(beginPos, pos)
        val tokenType = if (quoteChar == '"') TokenType.STRING_LITERAL else TokenType.CHARACTER_LITERAL
        return createToken(tokenType, lexeme, beginPos, beginLine, beginColumn)
    }

    /**
     * Handles unknown or unexpected characters in the source.
     *
     * @param c The unexpected character.
     * @param beginPos The position of the character.
     * @param beginLine The line number of the character.
     * @param beginColumn The column number of the character.
     * @return A [TokenResult] for the unknown character.
     */
    private fun handleUnknownChar(
        c: Char,
        beginPos: Int,
        beginLine: Int,
        beginColumn: Int
    ): TokenResult {
        Report.error(
            source = createSourceReference(beginPos, beginLine, beginColumn),
            message = "Unexpected character: '$c'",
        )
        return createToken(TokenType.UNKNOWN, c.toString(), beginPos, beginLine, beginColumn)
    }

    private fun skipWhitespaceAndComments() {
        while (!isAtEnd()) {
            when {
                peek() == '/' && peekNext() == '/' -> skipLineComment()
                peek() == '/' && peekNext() == '*' -> skipBlockComment()
                peek().isWhitespace() -> skipWhitespace()
                else -> break
            }
        }
    }

    private fun skipLineComment() {
        while (!isAtEnd() && peek() != '\n') {
            advance()
        }
    }

    private fun skipBlockComment() {
        advance() // Consume '/'
        advance() // Consume '*'
        while (!isAtEnd() && !(peek() == '*' && peekNext() == '/')) {
            if (peek() == '\n') {
                line++
                column = 1
            }
            advance()
        }
        if (!isAtEnd()) {
            advance() // Consume '*'
            advance() // Consume '/'
        }
    }

    private fun skipWhitespace() {
        if (peek() == '\n') {
            line++
            column = 1
        }
        advance()
    }

    private fun advance(): Char {
        check(!isAtEnd()) { "Attempted to advance past end of input at position $pos" }
        return source[pos++].also { column++ }
    }

    private fun peek(): Char = if (isAtEnd()) '\u0000' else source[pos]

    private fun peekNext(): Char = if (pos + 1 >= source.length) '\u0000' else source[pos + 1]

    private fun isAtEnd(): Boolean = pos >= source.length

    private fun sourceLocation(pos: Int, line: Int, column: Int): SourceLocation = SourceLocation(pos, line, column)

    private fun currentLocation(): SourceLocation = SourceLocation(pos, line, column)

    /**
     * Creates a SourceReference for the given start position, line, and column.
     *
     * @param beginPos The starting position in the source.
     * @param beginLine The starting line number.
     * @param beginColumn The starting column number.
     * @return A [SourceReference] representing the range in the source code.
     */
    private fun createSourceReference(beginPos: Int, beginLine: Int, beginColumn: Int): SourceReference =
        SourceReference(
            source = source,
            begin = sourceLocation(beginPos, beginLine, beginColumn),
            end = currentLocation(),
        )

    companion object {
        /**
         * Keywords recognized by the scanner.
         */
        private val keywords = mapOf(
            "true" to TokenType.TRUE,
            "false" to TokenType.FALSE,
            "null" to TokenType.NULL,
        )
    }
}
