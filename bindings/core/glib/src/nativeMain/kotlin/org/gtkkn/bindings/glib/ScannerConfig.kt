// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GScannerConfig
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Specifies the #GScanner parser configuration. Most settings can
 * be changed during the parsing phase and will affect the lexical
 * parsing of the next unpeeked token.
 *
 * ## Skipped during bindings generation
 *
 * - field `padding_dummy`: Record field padding_dummy is private
 */
public class ScannerConfig(pointer: CPointer<GScannerConfig>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibScannerConfigPointer: CPointer<GScannerConfig> = pointer

    /**
     * specifies which characters should be skipped
     *     by the scanner (the default is the whitespace characters: space,
     *     tab, carriage-return and line-feed).
     */
    public var csetSkipCharacters: String?
        get() = glibScannerConfigPointer.pointed.cset_skip_characters?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.cset_skip_characters?.let { g_free(it) }
            glibScannerConfigPointer.pointed.cset_skip_characters = value?.let { g_strdup(it) }
        }

    /**
     * specifies the characters which can start
     *     identifiers (the default is %G_CSET_a_2_z, "_", and %G_CSET_A_2_Z).
     */
    public var csetIdentifierFirst: String?
        get() = glibScannerConfigPointer.pointed.cset_identifier_first?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.cset_identifier_first?.let { g_free(it) }
            glibScannerConfigPointer.pointed.cset_identifier_first = value?.let { g_strdup(it) }
        }

    /**
     * specifies the characters which can be used
     *     in identifiers, after the first character (the default is
     *     %G_CSET_a_2_z, "_0123456789", %G_CSET_A_2_Z, %G_CSET_LATINS,
     *     %G_CSET_LATINC).
     */
    public var csetIdentifierNth: String?
        get() = glibScannerConfigPointer.pointed.cset_identifier_nth?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.cset_identifier_nth?.let { g_free(it) }
            glibScannerConfigPointer.pointed.cset_identifier_nth = value?.let { g_strdup(it) }
        }

    /**
     * specifies the characters at the start and
     *     end of single-line comments. The default is "#\n" which means
     *     that single-line comments start with a '#' and continue until
     *     a '\n' (end of line).
     */
    public var cpairCommentSingle: String?
        get() = glibScannerConfigPointer.pointed.cpair_comment_single?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.cpair_comment_single?.let { g_free(it) }
            glibScannerConfigPointer.pointed.cpair_comment_single = value?.let { g_strdup(it) }
        }

    /**
     * specifies if symbols are case sensitive (the
     *     default is false).
     */
    public var caseSensitive: guint
        get() = glibScannerConfigPointer.pointed.case_sensitive

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.case_sensitive = value
        }

    /**
     * specifies if multi-line comments are skipped
     *     and not returned as tokens (the default is true).
     */
    public var skipCommentMulti: guint
        get() = glibScannerConfigPointer.pointed.skip_comment_multi

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.skip_comment_multi = value
        }

    /**
     * specifies if single-line comments are skipped
     *     and not returned as tokens (the default is true).
     */
    public var skipCommentSingle: guint
        get() = glibScannerConfigPointer.pointed.skip_comment_single

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.skip_comment_single = value
        }

    /**
     * specifies if multi-line comments are recognized
     *     (the default is true).
     */
    public var scanCommentMulti: guint
        get() = glibScannerConfigPointer.pointed.scan_comment_multi

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_comment_multi = value
        }

    /**
     * specifies if identifiers are recognized (the
     *     default is true).
     */
    public var scanIdentifier: guint
        get() = glibScannerConfigPointer.pointed.scan_identifier

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_identifier = value
        }

    /**
     * specifies if single-character
     *     identifiers are recognized (the default is false).
     */
    public var scanIdentifier1char: guint
        get() = glibScannerConfigPointer.pointed.scan_identifier_1char

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_identifier_1char = value
        }

    /**
     * specifies if null is reported as
     *     %G_TOKEN_IDENTIFIER_NULL (the default is false).
     */
    public var scanIdentifierNull: guint
        get() = glibScannerConfigPointer.pointed.scan_identifier_NULL

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_identifier_NULL = value
        }

    /**
     * specifies if symbols are recognized (the default
     *     is true).
     */
    public var scanSymbols: guint
        get() = glibScannerConfigPointer.pointed.scan_symbols

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_symbols = value
        }

    /**
     * specifies if binary numbers are recognized (the
     *     default is false).
     */
    public var scanBinary: guint
        get() = glibScannerConfigPointer.pointed.scan_binary

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_binary = value
        }

    /**
     * specifies if octal numbers are recognized (the
     *     default is true).
     */
    public var scanOctal: guint
        get() = glibScannerConfigPointer.pointed.scan_octal

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_octal = value
        }

    /**
     * specifies if floating point numbers are recognized
     *     (the default is true).
     */
    public var scanFloat: guint
        get() = glibScannerConfigPointer.pointed.scan_float

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_float = value
        }

    /**
     * specifies if hexadecimal numbers are recognized (the
     *     default is true).
     */
    public var scanHex: guint
        get() = glibScannerConfigPointer.pointed.scan_hex

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_hex = value
        }

    /**
     * specifies if '$' is recognized as a prefix for
     *     hexadecimal numbers (the default is false).
     */
    public var scanHexDollar: guint
        get() = glibScannerConfigPointer.pointed.scan_hex_dollar

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_hex_dollar = value
        }

    /**
     * specifies if strings can be enclosed in single
     *     quotes (the default is true).
     */
    public var scanStringSq: guint
        get() = glibScannerConfigPointer.pointed.scan_string_sq

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_string_sq = value
        }

    /**
     * specifies if strings can be enclosed in double
     *     quotes (the default is true).
     */
    public var scanStringDq: guint
        get() = glibScannerConfigPointer.pointed.scan_string_dq

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scan_string_dq = value
        }

    /**
     * specifies if binary, octal and hexadecimal numbers
     *     are reported as %G_TOKEN_INT (the default is true).
     */
    public var numbers2Int: guint
        get() = glibScannerConfigPointer.pointed.numbers_2_int

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.numbers_2_int = value
        }

    /**
     * specifies if all numbers are reported as %G_TOKEN_FLOAT
     *     (the default is false).
     */
    public var int2Float: guint
        get() = glibScannerConfigPointer.pointed.int_2_float

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.int_2_float = value
        }

    /**
     * specifies if identifiers are reported as strings
     *     (the default is false).
     */
    public var identifier2String: guint
        get() = glibScannerConfigPointer.pointed.identifier_2_string

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.identifier_2_string = value
        }

    /**
     * specifies if characters are reported by setting
     *     `token = ch` or as %G_TOKEN_CHAR (the default is true).
     */
    public var char2Token: guint
        get() = glibScannerConfigPointer.pointed.char_2_token

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.char_2_token = value
        }

    /**
     * specifies if symbols are reported by setting
     *     `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is false).
     */
    public var symbol2Token: guint
        get() = glibScannerConfigPointer.pointed.symbol_2_token

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.symbol_2_token = value
        }

    /**
     * specifies if a symbol is searched for in the
     *     default scope in addition to the current scope (the default is false).
     */
    public var scope0Fallback: guint
        get() = glibScannerConfigPointer.pointed.scope_0_fallback

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.scope_0_fallback = value
        }

    /**
     * use value.v_int64 rather than v_int
     */
    public var storeInt64: guint
        get() = glibScannerConfigPointer.pointed.store_int64

        @UnsafeFieldSetter
        set(`value`) {
            glibScannerConfigPointer.pointed.store_int64 = value
        }

    /**
     * Allocate a new ScannerConfig.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GScannerConfig>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ScannerConfig and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GScannerConfig>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ScannerConfig using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GScannerConfig>().ptr)

    /**
     * Allocate a new ScannerConfig.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param csetSkipCharacters specifies which characters should be skipped
     *     by the scanner (the default is the whitespace characters: space,
     *     tab, carriage-return and line-feed).
     * @param csetIdentifierFirst specifies the characters which can start
     *     identifiers (the default is %G_CSET_a_2_z, "_", and %G_CSET_A_2_Z).
     * @param csetIdentifierNth specifies the characters which can be used
     *     in identifiers, after the first character (the default is
     *     %G_CSET_a_2_z, "_0123456789", %G_CSET_A_2_Z, %G_CSET_LATINS,
     *     %G_CSET_LATINC).
     * @param cpairCommentSingle specifies the characters at the start and
     *     end of single-line comments. The default is "#\n" which means
     *     that single-line comments start with a '#' and continue until
     *     a '\n' (end of line).
     * @param caseSensitive specifies if symbols are case sensitive (the
     *     default is false).
     * @param skipCommentMulti specifies if multi-line comments are skipped
     *     and not returned as tokens (the default is true).
     * @param skipCommentSingle specifies if single-line comments are skipped
     *     and not returned as tokens (the default is true).
     * @param scanCommentMulti specifies if multi-line comments are recognized
     *     (the default is true).
     * @param scanIdentifier specifies if identifiers are recognized (the
     *     default is true).
     * @param scanIdentifier1char specifies if single-character
     *     identifiers are recognized (the default is false).
     * @param scanIdentifierNull specifies if null is reported as
     *     %G_TOKEN_IDENTIFIER_NULL (the default is false).
     * @param scanSymbols specifies if symbols are recognized (the default
     *     is true).
     * @param scanBinary specifies if binary numbers are recognized (the
     *     default is false).
     * @param scanOctal specifies if octal numbers are recognized (the
     *     default is true).
     * @param scanFloat specifies if floating point numbers are recognized
     *     (the default is true).
     * @param scanHex specifies if hexadecimal numbers are recognized (the
     *     default is true).
     * @param scanHexDollar specifies if '$' is recognized as a prefix for
     *     hexadecimal numbers (the default is false).
     * @param scanStringSq specifies if strings can be enclosed in single
     *     quotes (the default is true).
     * @param scanStringDq specifies if strings can be enclosed in double
     *     quotes (the default is true).
     * @param numbers2Int specifies if binary, octal and hexadecimal numbers
     *     are reported as %G_TOKEN_INT (the default is true).
     * @param int2Float specifies if all numbers are reported as %G_TOKEN_FLOAT
     *     (the default is false).
     * @param identifier2String specifies if identifiers are reported as strings
     *     (the default is false).
     * @param char2Token specifies if characters are reported by setting
     *     `token = ch` or as %G_TOKEN_CHAR (the default is true).
     * @param symbol2Token specifies if symbols are reported by setting
     *     `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is false).
     * @param scope0Fallback specifies if a symbol is searched for in the
     *     default scope in addition to the current scope (the default is false).
     * @param storeInt64 use value.v_int64 rather than v_int
     */
    public constructor(
        csetSkipCharacters: String?,
        csetIdentifierFirst: String?,
        csetIdentifierNth: String?,
        cpairCommentSingle: String?,
        caseSensitive: guint,
        skipCommentMulti: guint,
        skipCommentSingle: guint,
        scanCommentMulti: guint,
        scanIdentifier: guint,
        scanIdentifier1char: guint,
        scanIdentifierNull: guint,
        scanSymbols: guint,
        scanBinary: guint,
        scanOctal: guint,
        scanFloat: guint,
        scanHex: guint,
        scanHexDollar: guint,
        scanStringSq: guint,
        scanStringDq: guint,
        numbers2Int: guint,
        int2Float: guint,
        identifier2String: guint,
        char2Token: guint,
        symbol2Token: guint,
        scope0Fallback: guint,
        storeInt64: guint,
    ) : this() {
        this.csetSkipCharacters = csetSkipCharacters
        this.csetIdentifierFirst = csetIdentifierFirst
        this.csetIdentifierNth = csetIdentifierNth
        this.cpairCommentSingle = cpairCommentSingle
        this.caseSensitive = caseSensitive
        this.skipCommentMulti = skipCommentMulti
        this.skipCommentSingle = skipCommentSingle
        this.scanCommentMulti = scanCommentMulti
        this.scanIdentifier = scanIdentifier
        this.scanIdentifier1char = scanIdentifier1char
        this.scanIdentifierNull = scanIdentifierNull
        this.scanSymbols = scanSymbols
        this.scanBinary = scanBinary
        this.scanOctal = scanOctal
        this.scanFloat = scanFloat
        this.scanHex = scanHex
        this.scanHexDollar = scanHexDollar
        this.scanStringSq = scanStringSq
        this.scanStringDq = scanStringDq
        this.numbers2Int = numbers2Int
        this.int2Float = int2Float
        this.identifier2String = identifier2String
        this.char2Token = char2Token
        this.symbol2Token = symbol2Token
        this.scope0Fallback = scope0Fallback
        this.storeInt64 = storeInt64
    }

    /**
     * Allocate a new ScannerConfig using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param csetSkipCharacters specifies which characters should be skipped
     *     by the scanner (the default is the whitespace characters: space,
     *     tab, carriage-return and line-feed).
     * @param csetIdentifierFirst specifies the characters which can start
     *     identifiers (the default is %G_CSET_a_2_z, "_", and %G_CSET_A_2_Z).
     * @param csetIdentifierNth specifies the characters which can be used
     *     in identifiers, after the first character (the default is
     *     %G_CSET_a_2_z, "_0123456789", %G_CSET_A_2_Z, %G_CSET_LATINS,
     *     %G_CSET_LATINC).
     * @param cpairCommentSingle specifies the characters at the start and
     *     end of single-line comments. The default is "#\n" which means
     *     that single-line comments start with a '#' and continue until
     *     a '\n' (end of line).
     * @param caseSensitive specifies if symbols are case sensitive (the
     *     default is false).
     * @param skipCommentMulti specifies if multi-line comments are skipped
     *     and not returned as tokens (the default is true).
     * @param skipCommentSingle specifies if single-line comments are skipped
     *     and not returned as tokens (the default is true).
     * @param scanCommentMulti specifies if multi-line comments are recognized
     *     (the default is true).
     * @param scanIdentifier specifies if identifiers are recognized (the
     *     default is true).
     * @param scanIdentifier1char specifies if single-character
     *     identifiers are recognized (the default is false).
     * @param scanIdentifierNull specifies if null is reported as
     *     %G_TOKEN_IDENTIFIER_NULL (the default is false).
     * @param scanSymbols specifies if symbols are recognized (the default
     *     is true).
     * @param scanBinary specifies if binary numbers are recognized (the
     *     default is false).
     * @param scanOctal specifies if octal numbers are recognized (the
     *     default is true).
     * @param scanFloat specifies if floating point numbers are recognized
     *     (the default is true).
     * @param scanHex specifies if hexadecimal numbers are recognized (the
     *     default is true).
     * @param scanHexDollar specifies if '$' is recognized as a prefix for
     *     hexadecimal numbers (the default is false).
     * @param scanStringSq specifies if strings can be enclosed in single
     *     quotes (the default is true).
     * @param scanStringDq specifies if strings can be enclosed in double
     *     quotes (the default is true).
     * @param numbers2Int specifies if binary, octal and hexadecimal numbers
     *     are reported as %G_TOKEN_INT (the default is true).
     * @param int2Float specifies if all numbers are reported as %G_TOKEN_FLOAT
     *     (the default is false).
     * @param identifier2String specifies if identifiers are reported as strings
     *     (the default is false).
     * @param char2Token specifies if characters are reported by setting
     *     `token = ch` or as %G_TOKEN_CHAR (the default is true).
     * @param symbol2Token specifies if symbols are reported by setting
     *     `token = v_symbol` or as %G_TOKEN_SYMBOL (the default is false).
     * @param scope0Fallback specifies if a symbol is searched for in the
     *     default scope in addition to the current scope (the default is false).
     * @param storeInt64 use value.v_int64 rather than v_int
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        csetSkipCharacters: String?,
        csetIdentifierFirst: String?,
        csetIdentifierNth: String?,
        cpairCommentSingle: String?,
        caseSensitive: guint,
        skipCommentMulti: guint,
        skipCommentSingle: guint,
        scanCommentMulti: guint,
        scanIdentifier: guint,
        scanIdentifier1char: guint,
        scanIdentifierNull: guint,
        scanSymbols: guint,
        scanBinary: guint,
        scanOctal: guint,
        scanFloat: guint,
        scanHex: guint,
        scanHexDollar: guint,
        scanStringSq: guint,
        scanStringDq: guint,
        numbers2Int: guint,
        int2Float: guint,
        identifier2String: guint,
        char2Token: guint,
        symbol2Token: guint,
        scope0Fallback: guint,
        storeInt64: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.csetSkipCharacters = csetSkipCharacters
        this.csetIdentifierFirst = csetIdentifierFirst
        this.csetIdentifierNth = csetIdentifierNth
        this.cpairCommentSingle = cpairCommentSingle
        this.caseSensitive = caseSensitive
        this.skipCommentMulti = skipCommentMulti
        this.skipCommentSingle = skipCommentSingle
        this.scanCommentMulti = scanCommentMulti
        this.scanIdentifier = scanIdentifier
        this.scanIdentifier1char = scanIdentifier1char
        this.scanIdentifierNull = scanIdentifierNull
        this.scanSymbols = scanSymbols
        this.scanBinary = scanBinary
        this.scanOctal = scanOctal
        this.scanFloat = scanFloat
        this.scanHex = scanHex
        this.scanHexDollar = scanHexDollar
        this.scanStringSq = scanStringSq
        this.scanStringDq = scanStringDq
        this.numbers2Int = numbers2Int
        this.int2Float = int2Float
        this.identifier2String = identifier2String
        this.char2Token = char2Token
        this.symbol2Token = symbol2Token
        this.scope0Fallback = scope0Fallback
        this.storeInt64 = storeInt64
    }

    override fun toString(): String =
        "ScannerConfig(csetSkipCharacters=$csetSkipCharacters, csetIdentifierFirst=$csetIdentifierFirst, csetIdentifierNth=$csetIdentifierNth, cpairCommentSingle=$cpairCommentSingle, caseSensitive=$caseSensitive, skipCommentMulti=$skipCommentMulti, skipCommentSingle=$skipCommentSingle, scanCommentMulti=$scanCommentMulti, scanIdentifier=$scanIdentifier, scanIdentifier1char=$scanIdentifier1char, scanIdentifierNull=$scanIdentifierNull, scanSymbols=$scanSymbols, scanBinary=$scanBinary, scanOctal=$scanOctal, scanFloat=$scanFloat, scanHex=$scanHex, scanHexDollar=$scanHexDollar, scanStringSq=$scanStringSq, scanStringDq=$scanStringDq, numbers2Int=$numbers2Int, int2Float=$int2Float, identifier2String=$identifier2String, char2Token=$char2Token, symbol2Token=$symbol2Token, scope0Fallback=$scope0Fallback, storeInt64=$storeInt64)"
}
