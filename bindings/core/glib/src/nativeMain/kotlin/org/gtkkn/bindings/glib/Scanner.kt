// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GScanner
import org.gtkkn.native.glib.g_scanner_cur_line
import org.gtkkn.native.glib.g_scanner_cur_position
import org.gtkkn.native.glib.g_scanner_cur_token
import org.gtkkn.native.glib.g_scanner_destroy
import org.gtkkn.native.glib.g_scanner_eof
import org.gtkkn.native.glib.g_scanner_get_next_token
import org.gtkkn.native.glib.g_scanner_input_file
import org.gtkkn.native.glib.g_scanner_input_text
import org.gtkkn.native.glib.g_scanner_peek_next_token
import org.gtkkn.native.glib.g_scanner_scope_foreach_symbol
import org.gtkkn.native.glib.g_scanner_scope_remove_symbol
import org.gtkkn.native.glib.g_scanner_set_scope
import org.gtkkn.native.glib.g_scanner_sync_file_offset
import org.gtkkn.native.glib.g_scanner_unexp_token
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * `GScanner` provides a general-purpose lexical scanner.
 *
 * You should set @input_name after creating the scanner, since
 * it is used by the default message handler when displaying
 * warnings and errors. If you are scanning a file, the filename
 * would be a good choice.
 *
 * The @user_data and @max_parse_errors fields are not used.
 * If you need to associate extra data with the scanner you
 * can place them here.
 *
 * If you want to use your own message handler you can set the
 * @msg_handler field. The type of the message handler function
 * is declared by #GScannerMsgFunc.
 *
 * ## Skipped during bindings generation
 *
 * - method `lookup_symbol`: Return type gpointer is unsupported
 * - parameter `value`: gpointer
 * - method `scope_lookup_symbol`: Return type gpointer is unsupported
 * - field `user_data`: gpointer
 * - field `qdata`: Data
 * - field `value`: TokenValue
 * - field `next_value`: TokenValue
 * - field `symbol_table`: Record field symbol_table is private
 * - field `input_fd`: Record field input_fd is private
 * - field `text`: Record field text is private
 * - field `text_end`: Record field text_end is private
 * - field `buffer`: Record field buffer is private
 * - field `scope_id`: Record field scope_id is private
 * - field `msg_handler`: ScannerMsgFunc
 */
public class Scanner(
    pointer: CPointer<GScanner>,
) : Record {
    public val glibScannerPointer: CPointer<GScanner> = pointer

    /**
     * unused
     */
    public var maxParseErrors: UInt
        get() = glibScannerPointer.pointed.max_parse_errors
        set(`value`) {
            glibScannerPointer.pointed.max_parse_errors = value
        }

    /**
     * g_scanner_error() increments this field
     */
    public var parseErrors: UInt
        get() = glibScannerPointer.pointed.parse_errors
        set(`value`) {
            glibScannerPointer.pointed.parse_errors = value
        }

    /**
     * name of input stream, featured by the default message handler
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val inputName: String?
        get() = glibScannerPointer.pointed.input_name?.toKString()

    /**
     * link into the scanner configuration
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val config: ScannerConfig?
        get() =
            glibScannerPointer.pointed.config?.run {
                ScannerConfig(reinterpret())
            }

    /**
     * token parsed by the last g_scanner_get_next_token()
     */
    public var token: TokenType
        get() =
            glibScannerPointer.pointed.token.run {
                TokenType.fromNativeValue(this)
            }
        set(`value`) {
            glibScannerPointer.pointed.token = value.nativeValue
        }

    /**
     * line number of the last token from g_scanner_get_next_token()
     */
    public var line: UInt
        get() = glibScannerPointer.pointed.line
        set(`value`) {
            glibScannerPointer.pointed.line = value
        }

    /**
     * char number of the last token from g_scanner_get_next_token()
     */
    public var position: UInt
        get() = glibScannerPointer.pointed.position
        set(`value`) {
            glibScannerPointer.pointed.position = value
        }

    /**
     * token parsed by the last g_scanner_peek_next_token()
     */
    public var nextToken: TokenType
        get() =
            glibScannerPointer.pointed.next_token.run {
                TokenType.fromNativeValue(this)
            }
        set(`value`) {
            glibScannerPointer.pointed.next_token = value.nativeValue
        }

    /**
     * line number of the last token from g_scanner_peek_next_token()
     */
    public var nextLine: UInt
        get() = glibScannerPointer.pointed.next_line
        set(`value`) {
            glibScannerPointer.pointed.next_line = value
        }

    /**
     * char number of the last token from g_scanner_peek_next_token()
     */
    public var nextPosition: UInt
        get() = glibScannerPointer.pointed.next_position
        set(`value`) {
            glibScannerPointer.pointed.next_position = value
        }

    /**
     * Returns the current line in the input stream (counting
     * from 1). This is the line of the last token parsed via
     * g_scanner_get_next_token().
     *
     * @return the current line
     */
    public fun curLine(): UInt = g_scanner_cur_line(glibScannerPointer.reinterpret())

    /**
     * Returns the current position in the current line (counting
     * from 0). This is the position of the last token parsed via
     * g_scanner_get_next_token().
     *
     * @return the current position on the line
     */
    public fun curPosition(): UInt = g_scanner_cur_position(glibScannerPointer.reinterpret())

    /**
     * Gets the current token type. This is simply the @token
     * field in the #GScanner structure.
     *
     * @return the current token type
     */
    public fun curToken(): TokenType =
        g_scanner_cur_token(glibScannerPointer.reinterpret()).run {
            TokenType.fromNativeValue(this)
        }

    /**
     * Frees all memory used by the #GScanner.
     */
    public fun destroy(): Unit = g_scanner_destroy(glibScannerPointer.reinterpret())

    /**
     * Returns true if the scanner has reached the end of
     * the file or text buffer.
     *
     * @return true if the scanner has reached the end of
     *     the file or text buffer
     */
    public fun eof(): Boolean = g_scanner_eof(glibScannerPointer.reinterpret()).asBoolean()

    /**
     * Parses the next token just like g_scanner_peek_next_token()
     * and also removes it from the input stream. The token data is
     * placed in the @token, @value, @line, and @position fields of
     * the #GScanner structure.
     *
     * @return the type of the token
     */
    public fun getNextToken(): TokenType =
        g_scanner_get_next_token(glibScannerPointer.reinterpret()).run {
            TokenType.fromNativeValue(this)
        }

    /**
     * Prepares to scan a file.
     *
     * @param inputFd a file descriptor
     */
    public fun inputFile(inputFd: Int): Unit = g_scanner_input_file(glibScannerPointer.reinterpret(), inputFd)

    /**
     * Prepares to scan a text buffer.
     *
     * @param text the text buffer to scan
     * @param textLen the length of the text buffer
     */
    public fun inputText(
        text: String,
        textLen: UInt,
    ): Unit = g_scanner_input_text(glibScannerPointer.reinterpret(), text, textLen)

    /**
     * Parses the next token, without removing it from the input stream.
     * The token data is placed in the @next_token, @next_value, @next_line,
     * and @next_position fields of the #GScanner structure.
     *
     * Note that, while the token is not removed from the input stream
     * (i.e. the next call to g_scanner_get_next_token() will return the
     * same token), it will not be reevaluated. This can lead to surprising
     * results when changing scope or the scanner configuration after peeking
     * the next token. Getting the next token after switching the scope or
     * configuration will return whatever was peeked before, regardless of
     * any symbols that may have been added or removed in the new scope.
     *
     * @return the type of the token
     */
    public fun peekNextToken(): TokenType =
        g_scanner_peek_next_token(glibScannerPointer.reinterpret()).run {
            TokenType.fromNativeValue(this)
        }

    /**
     * Calls the given function for each of the symbol/value pairs
     * in the given scope of the #GScanner. The function is passed
     * the symbol and value of each pair, and the given @user_data
     * parameter.
     *
     * @param scopeId the scope id
     * @param func the function to call for each symbol/value pair
     */
    public fun scopeForeachSymbol(
        scopeId: UInt,
        func: HFunc,
    ): Unit =
        g_scanner_scope_foreach_symbol(
            glibScannerPointer.reinterpret(),
            scopeId,
            HFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Removes a symbol from a scope.
     *
     * @param scopeId the scope id
     * @param symbol the symbol to remove
     */
    public fun scopeRemoveSymbol(
        scopeId: UInt,
        symbol: String,
    ): Unit = g_scanner_scope_remove_symbol(glibScannerPointer.reinterpret(), scopeId, symbol)

    /**
     * Sets the current scope.
     *
     * @param scopeId the new scope id
     * @return the old scope id
     */
    public fun setScope(scopeId: UInt): UInt = g_scanner_set_scope(glibScannerPointer.reinterpret(), scopeId)

    /**
     * Rewinds the filedescriptor to the current buffer position
     * and blows the file read ahead buffer. This is useful for
     * third party uses of the scanners filedescriptor, which hooks
     * onto the current scanning position.
     */
    public fun syncFileOffset(): Unit = g_scanner_sync_file_offset(glibScannerPointer.reinterpret())

    /**
     * Outputs a message through the scanner's msg_handler,
     * resulting from an unexpected token in the input stream.
     * Note that you should not call g_scanner_peek_next_token()
     * followed by g_scanner_unexp_token() without an intermediate
     * call to g_scanner_get_next_token(), as g_scanner_unexp_token()
     * evaluates the scanner's current token (not the peeked token)
     * to construct part of the message.
     *
     * @param expectedToken the expected token
     * @param identifierSpec a string describing how the scanner's user
     *     refers to identifiers (null defaults to "identifier").
     *     This is used if @expected_token is %G_TOKEN_IDENTIFIER or
     *     %G_TOKEN_IDENTIFIER_NULL.
     * @param symbolSpec a string describing how the scanner's user refers
     *     to symbols (null defaults to "symbol"). This is used if
     *     @expected_token is %G_TOKEN_SYMBOL or any token value greater
     *     than %G_TOKEN_LAST.
     * @param symbolName the name of the symbol, if the scanner's current
     *     token is a symbol.
     * @param message a message string to output at the end of the
     *     warning/error, or null.
     * @param isError if true it is output as an error. If false it is
     *     output as a warning.
     */
    public fun unexpToken(
        expectedToken: TokenType,
        identifierSpec: String,
        symbolSpec: String,
        symbolName: String,
        message: String,
        isError: Int,
    ): Unit =
        g_scanner_unexp_token(
            glibScannerPointer.reinterpret(),
            expectedToken.nativeValue,
            identifierSpec,
            symbolSpec,
            symbolName,
            message,
            isError
        )

    public companion object : RecordCompanion<Scanner, GScanner> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Scanner = Scanner(pointer.reinterpret())
    }
}
