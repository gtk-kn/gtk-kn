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

import me.tatarka.inject.annotations.Inject
import org.gtkkn.gir.log.logger
import java.io.File

/**
 * Parses metadata from a given source string using a `SimpleScanner`.
 *
 * This parser processes the source content into a tree of `Metadata` objects. It supports
 * parsing patterns, arguments, expressions, and hierarchical structures.
 */
@Inject
class MetadataParser {
    private var scanner: SimpleScanner? = null
    private val tree = Metadata("")
    private var begin: SourceLocation? = null
    private var end: SourceLocation? = null
    private var oldEnd: SourceLocation? = null
    private var current: TokenType? = null
    private var currentLexeme: String = ""
    private var parentMetadata: Metadata? = null

    init {
        tree.used = true
    }

    fun parse(file: File): Metadata {
        logger.info { "Parsing GIR metadata file ${file.name}" }
        return parse(file.readText())
    }

    fun parse(metadataContent: String): Metadata {
        scanner = SimpleScanner(metadataContent)
        advanceToken()
        while (current != TokenType.EOF) {
            if (!parseMetadataRule()) {
                return Metadata.empty
            }
        }
        return tree
    }

    /**
     * Advances to the next token in the source content.
     *
     * @return The new current `TokenType`.
     */
    private fun advanceToken(): TokenType {
        oldEnd = end
        val tokenResult = checkNotNull(scanner).readToken()
        current = tokenResult.tokenType
        currentLexeme = tokenResult.lexeme
        begin = tokenResult.begin
        end = tokenResult.end
        return current as TokenType
    }

    private fun parseMetadataRule(): Boolean {
        val startEnd = end
        val metadata = parseMetadataPattern() ?: return false

        // If we've reached the end of the file or the next token is on a new line, treat as a complete rule.
        return if (current == TokenType.EOF || isOnNewLine(startEnd, end)) {
            true
        } else {
            parseMetadataArguments(metadata)
        }
    }

    /**
     * Parses a metadata pattern from the current token stream.
     *
     * This method handles both absolute and relative patterns. An absolute pattern begins
     * with an identifier or a wildcard (`*`), while a relative pattern starts with a dot (`.`).
     * The parsed pattern is used to create a hierarchy of `Metadata` objects, linked as parent
     * and child nodes.
     *
     * **Behavior**:
     * - If the pattern is absolute, it is anchored at the root of the metadata tree (`tree`).
     * - If the pattern is relative, it is anchored at the current `parentMetadata`.
     * - Patterns can consist of multiple hierarchical segments, separated by dots (`.`).
     *
     * @return The root `Metadata` object of the parsed pattern hierarchy, or `null` if parsing fails.
     */
    private fun parseMetadataPattern(): Metadata? {
        // Determine if the pattern is relative by checking for a leading dot (`.`).
        val isRelative = isPatternRelative()

        // If the pattern is absolute, ensure it starts with an identifier or a wildcard (`*`).
        if (!isRelative && current != TokenType.IDENTIFIER && current != TokenType.STAR) {
            Report.error(getCurrentSourceReference(), "expected pattern or '.', got `%s'", current.toString())
            return null
        }

        // For absolute patterns, reset the parent metadata to the root of the tree.
        if (!isRelative) {
            parentMetadata = tree
        }

        // Ensure that a valid parent metadata is available for relative patterns.
        if (parentMetadata == null) {
            Report.error(getCurrentSourceReference(), "cannot determine parent metadata")
            return null
        }

        val start = begin
        val pattern = parseIdentifier(true) ?: return null

        // Create the root metadata for the current pattern and attach it to the parent.
        var metadata = Metadata(pattern, parseSelector(), createSourceReference(start))
        checkNotNull(parentMetadata).addChild(metadata)

        // Parse subsequent segments of the pattern, separated by dots (`.`).
        while (current != TokenType.EOF && !hasTokenGap()) {
            // Ensure that the next segment is preceded by a dot (`.`).
            if (current != TokenType.DOT) {
                Report.error(getCurrentSourceReference(), "expected '.', got `%s'", current.toString())
                break
            }
            advanceToken() // Consume the dot.

            // Parse the next segment and create a child metadata for it.
            val childStart = this.begin
            val childPattern = parseIdentifier(true) ?: return null
            val child = Metadata(childPattern, parseSelector(), createSourceReference(childStart))

            // Add the child metadata to the current metadata and update the reference.
            metadata.addChild(child)
            metadata = child
        }

        // For absolute patterns, update the `parentMetadata` to the last metadata node in the hierarchy.
        if (!isRelative) {
            parentMetadata = metadata
        }

        // Return the root metadata of the parsed pattern hierarchy.
        return metadata
    }

    /**
     * Parses a sequence of arguments associated with a metadata rule.
     *
     * Arguments are key-value pairs, where the key is an identifier representing the argument type,
     * and the value is either:
     * - An expression following an assignment (`=`).
     * - A default `true` value if no assignment is provided.
     *
     * This method validates the argument type and associates the parsed arguments with the given
     * `Metadata` object. It iterates through tokens until the end of the file (EOF), a newline, or
     * a space that separates the argument list from the next token.
     *
     * **Behavior**:
     * - If an argument type is invalid, a warning is reported, and the argument is skipped.
     * - Arguments without a value are treated as boolean flags with a value of `true`.
     *
     * @param metadata The `Metadata` object to which parsed arguments will be added.
     * @return `true` if all arguments are successfully parsed, or `false` if an error occurs.
     */
    private fun parseMetadataArguments(metadata: Metadata): Boolean {
        // Loop through tokens until EOF, a newline, or a space separates the argument list.
        @Suppress("LoopWithTooManyJumpStatements")
        while (current != TokenType.EOF && hasTokenGap() && !isOnNewLine()) {
            val start = this.begin

            // Parse the argument identifier (key).
            val id = parseIdentifier(false) ?: return false

            // Validate the argument type.
            val argType = ArgumentType.fromString(id)
            if (argType == null) {
                // If the argument type is unknown, report a warning and skip this argument.
                Report.warning(createSourceReference(start, oldEnd), "unknown argument `%s'", id)
                continue
            }

            // Parse the argument value if an assignment (`=`) follows.
            val value = if (current == TokenType.ASSIGN) {
                advanceToken()
                parseExpressionValue() ?: return false
            } else {
                // If no assignment is present, treat the argument as a boolean flag with a value of `true`.
                BooleanLiteral(true)
            }

            // Add the parsed argument to the metadata object with its source reference.
            metadata.addArgument(argType, Argument(value, createSourceReference(start)))
        }

        // Return true if all arguments were successfully parsed.
        return true
    }

    /**
     * Parses an identifier or glob-style pattern.
     *
     * @param isGlob Indicates if a glob-style pattern should be parsed.
     * @return The parsed identifier or `null` if parsing fails.
     */
    private fun parseIdentifier(isGlob: Boolean): String? {
        val start = this.begin

        if (current == TokenType.DOT || current == TokenType.HASH) {
            val message = if (isGlob) "expected glob-style pattern" else "expected identifier"
            Report.error(createSourceReference(start), message)
            return null
        }

        val identifierBuilder = StringBuilder()
        identifierBuilder.append(currentLexeme)

        if (isGlob) {
            // For glob patterns, we might need to collect multiple tokens
            while (true) {
                advanceToken()
                if (current == TokenType.EOF ||
                    current == TokenType.DOT ||
                    current == TokenType.HASH ||
                    hasTokenGap()
                ) {
                    break
                }
                // Append the current lexeme to the identifier
                identifierBuilder.append(currentLexeme)
            }
        } else {
            advanceToken()
        }

        return identifierBuilder.toString()
    }

    /**
     * Parses a selector, starting with a `#` symbol.
     *
     * @return The parsed selector or `null` if none exists.
     */
    private fun parseSelector(): String? {
        if (current != TokenType.HASH || hasTokenGap()) {
            return null
        }
        advanceToken()
        return parseIdentifier(false)
    }

    private fun parseExpressionValue(): Expression? {
        val start = this.begin ?: return null
        val src = createSourceReference(start)

        return when (current) {
            TokenType.NULL -> NullLiteral.also { advanceToken() }
            TokenType.TRUE -> BooleanLiteral(true).also { advanceToken() }
            TokenType.FALSE -> BooleanLiteral(false).also { advanceToken() }
            TokenType.MINUS -> parseUnaryExpression(src)
            TokenType.INTEGER_LITERAL -> IntegerLiteral(currentLexeme).also { advanceToken() }
            TokenType.REAL_LITERAL -> RealLiteral(currentLexeme).also { advanceToken() }
            TokenType.STRING_LITERAL -> StringLiteral(currentLexeme).also { advanceToken() }
            TokenType.IDENTIFIER -> parseMemberAccessExpression(src)
            TokenType.OPEN_PARENS -> parseTuple(src)
            else -> {
                Report.error(src, "expected literal or symbol, got `%s'", current.toString())
                null
            }
        }
    }

    private fun parseUnaryExpression(src: SourceReference): UnaryExpression? {
        advanceToken()
        val inner = parseExpressionValue()
        return if (inner == null) {
            Report.error(src, "expected expression after `-', got `%s'", current.toString())
            null
        } else {
            UnaryExpression(UnaryOperator.MINUS, inner, src)
        }
    }

    /**
     * Parses a member access expression.
     *
     * A member access expression represents a hierarchical or chained structure, such as
     * `object.property` or `object.property.subproperty`. This method builds an expression
     * by consuming tokens until the chain is exhausted.
     *
     * **Behavior**:
     * - Starts with an initial identifier representing the base object or namespace.
     * - Consumes a sequence of `.` (dot) tokens, followed by valid identifiers, to construct
     *   a chain of member accesses.
     *
     * **Error Handling**:
     * - If a `.` is not followed by an identifier, an error is reported, and the parsing stops.
     * - The method gracefully terminates and returns the partial expression if an error occurs.
     *
     * @param src The source reference indicating the location in the source code where the
     *            member access expression starts.
     * @return An `Expression` representing the parsed member access.
     */
    private fun parseMemberAccessExpression(src: SourceReference): Expression {
        // Initialize the member access expression with the current identifier.
        var expr: Expression = MemberAccess(null, currentLexeme, src)

        // Loop to consume chained member accesses separated by `.`
        while (advanceToken() == TokenType.DOT) {
            // Consume the next token and ensure it is an identifier.
            if (advanceToken() != TokenType.IDENTIFIER) {
                Report.error(getCurrentSourceReference(), "expected identifier, got `%s'", current.toString())
                break
            }
            // Extend the current member access chain.
            expr = MemberAccess(expr, currentLexeme, src)
        }

        // Return the constructed member access expression.
        return expr
    }

    private fun parseTuple(src: SourceReference): Expression? {
        if (advanceToken() == TokenType.CLOSE_PARENS) {
            advanceToken()
            return Tuple(src)
        } else {
            Report.error(getCurrentSourceReference(), "expected `)', got `%s'", current.toString())
            return null
        }
    }

    /**
     * Creates a source reference for the current or provided range.
     *
     * @param start The starting location of the reference.
     * @param end The ending location of the reference, defaults to the current token's end.
     * @return A `SourceReference` object representing the range.
     */
    private fun createSourceReference(start: SourceLocation?, end: SourceLocation? = this.end): SourceReference =
        SourceReference(checkNotNull(scanner).source, start, end)

    private fun getCurrentSourceReference(): SourceReference = createSourceReference(begin)

    private fun isPatternRelative(): Boolean =
        if (current == TokenType.DOT) {
            advanceToken() // Consume the `.`
            true
        } else {
            false
        }

    /**
     * Checks if there is a gap between the previous and current tokens.
     *
     * This method determines whether the `pos` (position) values of the previous
     * token's end (`oldEnd`) and the current token's start (`begin`) are different.
     * Note that this does not explicitly confirm the type of gap (e.g., space or newline),
     * only that the tokens are not adjacent.
     *
     * @return `true` if there is a gap between the tokens, `false` otherwise.
     */
    private fun hasTokenGap(): Boolean = oldEnd?.pos != begin?.pos

    /**
     * Checks if the current token starts on a new line compared to the previous token.
     *
     * @return `true` if the tokens are on different lines, `false` otherwise.
     */
    private fun isOnNewLine(): Boolean =
        oldEnd?.line != begin?.line

    private fun isOnNewLine(oldEnd: SourceLocation?, newEnd: SourceLocation?): Boolean =
        oldEnd?.line != newEnd?.line
}
