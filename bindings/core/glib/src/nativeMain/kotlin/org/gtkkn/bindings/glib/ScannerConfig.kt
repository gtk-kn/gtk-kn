// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GScannerConfig
import kotlin.String
import kotlin.UInt

/**
 * Specifies the #GScanner parser configuration. Most settings can
 * be changed during the parsing phase and will affect the lexical
 * parsing of the next unpeeked token.
 *
 * ## Skipped during bindings generation
 *
 * - field `padding_dummy`: Record field padding_dummy is private
 */
public class ScannerConfig(
    pointer: CPointer<GScannerConfig>,
) : Record {
    public val glibScannerConfigPointer: CPointer<GScannerConfig> = pointer

    /**
     * specifies which characters should be skipped
     *     by the scanner (the default is the whitespace characters: space,
     *     tab, carriage-return and line-feed).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val csetSkipCharacters: String?
        get() = glibScannerConfigPointer.pointed.cset_skip_characters?.toKString()

    /**
     * specifies the characters which can start
     *     identifiers (the default is %G_CSET_a_2_z, "_", and %G_CSET_A_2_Z).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val csetIdentifierFirst: String?
        get() = glibScannerConfigPointer.pointed.cset_identifier_first?.toKString()

    /**
     * specifies the characters which can be used
     *     in identifiers, after the first character (the default is
     *     %G_CSET_a_2_z, "_0123456789", %G_CSET_A_2_Z, %G_CSET_LATINS,
     *     %G_CSET_LATINC).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val csetIdentifierNth: String?
        get() = glibScannerConfigPointer.pointed.cset_identifier_nth?.toKString()

    /**
     * specifies the characters at the start and
     *     end of single-line comments. The default is "#\n" which means
     *     that single-line comments start with a '#' and continue until
     *     a '\n' (end of line).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val cpairCommentSingle: String?
        get() = glibScannerConfigPointer.pointed.cpair_comment_single?.toKString()

    /**
     * specifies if symbols are case sensitive (the
     *     default is false).
     */
    public var caseSensitive: UInt
        get() = glibScannerConfigPointer.pointed.case_sensitive
        set(`value`) {
            glibScannerConfigPointer.pointed.case_sensitive = value
        }

    /**
     * specifies if multi-line comments are skipped
     *     and not returned as tokens (the default is true).
     */
    public var skipCommentMulti: UInt
        get() = glibScannerConfigPointer.pointed.skip_comment_multi
        set(`value`) {
            glibScannerConfigPointer.pointed.skip_comment_multi = value
        }

    /**
     * specifies if single-line comments are skipped
     *     and not returned as tokens (the default is true).
     */
    public var skipCommentSingle: UInt
        get() = glibScannerConfigPointer.pointed.skip_comment_single
        set(`value`) {
            glibScannerConfigPointer.pointed.skip_comment_single = value
        }

    /**
     * specifies if multi-line comments are recognized
     *     (the default is true).
     */
    public var scanCommentMulti: UInt
        get() = glibScannerConfigPointer.pointed.scan_comment_multi
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_comment_multi = value
        }

    /**
     * specifies if identifiers are recognized (the
     *     default is true).
     */
    public var scanIdentifier: UInt
        get() = glibScannerConfigPointer.pointed.scan_identifier
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_identifier = value
        }

    /**
     * specifies if single-character
     *     identifiers are recognized (the default is false).
     */
    public var scanIdentifier1char: UInt
        get() = glibScannerConfigPointer.pointed.scan_identifier_1char
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_identifier_1char = value
        }

    /**
     * specifies if null is reported as
     *     %G_TOKEN_IDENTIFIER_NULL (the default is false).
     */
    public var scanIdentifierNull: UInt
        get() = glibScannerConfigPointer.pointed.scan_identifier_NULL
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_identifier_NULL = value
        }

    /**
     * specifies if symbols are recognized (the default
     *     is true).
     */
    public var scanSymbols: UInt
        get() = glibScannerConfigPointer.pointed.scan_symbols
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_symbols = value
        }

    /**
     * specifies if binary numbers are recognized (the
     *     default is false).
     */
    public var scanBinary: UInt
        get() = glibScannerConfigPointer.pointed.scan_binary
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_binary = value
        }

    /**
     * specifies if octal numbers are recognized (the
     *     default is true).
     */
    public var scanOctal: UInt
        get() = glibScannerConfigPointer.pointed.scan_octal
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_octal = value
        }

    /**
     * specifies if floating point numbers are recognized
     *     (the default is true).
     */
    public var scanFloat: UInt
        get() = glibScannerConfigPointer.pointed.scan_float
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_float = value
        }

    /**
     * specifies if hexadecimal numbers are recognized (the
     *     default is true).
     */
    public var scanHex: UInt
        get() = glibScannerConfigPointer.pointed.scan_hex
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_hex = value
        }

    /**
     * specifies if '$' is recognized as a prefix for
     *     hexadecimal numbers (the default is false).
     */
    public var scanHexDollar: UInt
        get() = glibScannerConfigPointer.pointed.scan_hex_dollar
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_hex_dollar = value
        }

    /**
     * specifies if strings can be enclosed in single
     *     quotes (the default is true).
     */
    public var scanStringSq: UInt
        get() = glibScannerConfigPointer.pointed.scan_string_sq
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_string_sq = value
        }

    /**
     * specifies if strings can be enclosed in double
     *     quotes (the default is true).
     */
    public var scanStringDq: UInt
        get() = glibScannerConfigPointer.pointed.scan_string_dq
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_string_dq = value
        }

    /**
     * specifies if binary, octal and hexadecimal numbers
     *     are reported as %G_TOKEN_INT (the default is true).
     */
    public var numbers2Int: UInt
        get() = glibScannerConfigPointer.pointed.numbers_2_int
        set(`value`) {
            glibScannerConfigPointer.pointed.numbers_2_int = value
        }

    /**
     * specifies if all numbers are reported as %G_TOKEN_FLOAT
     *     (the default is false).
     */
    public var int2Float: UInt
        get() = glibScannerConfigPointer.pointed.int_2_float
        set(`value`) {
            glibScannerConfigPointer.pointed.int_2_float = value
        }

    /**
     * specifies if identifiers are reported as strings
     *     (the default is false).
     */
    public var identifier2String: UInt
        get() = glibScannerConfigPointer.pointed.identifier_2_string
        set(`value`) {
            glibScannerConfigPointer.pointed.identifier_2_string = value
        }

    /**
     * specifies if characters are reported by setting
     *     `token = ch` or as %G_TOKEN_CHAR (the default is true).
     */
    public var char2Token: UInt
        get() = glibScannerConfigPointer.pointed.char_2_token
        set(`value`) {
            glibScannerConfigPointer.pointed.char_2_token = value
        }

    /**
     * specifies if symbols are reported by setting
     *     `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is false).
     */
    public var symbol2Token: UInt
        get() = glibScannerConfigPointer.pointed.symbol_2_token
        set(`value`) {
            glibScannerConfigPointer.pointed.symbol_2_token = value
        }

    /**
     * specifies if a symbol is searched for in the
     *     default scope in addition to the current scope (the default is false).
     */
    public var scope0Fallback: UInt
        get() = glibScannerConfigPointer.pointed.scope_0_fallback
        set(`value`) {
            glibScannerConfigPointer.pointed.scope_0_fallback = value
        }

    /**
     * use value.v_int64 rather than v_int
     */
    public var storeInt64: UInt
        get() = glibScannerConfigPointer.pointed.store_int64
        set(`value`) {
            glibScannerConfigPointer.pointed.store_int64 = value
        }

    public companion object : RecordCompanion<ScannerConfig, GScannerConfig> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ScannerConfig =
            ScannerConfig(pointer.reinterpret())
    }
}
