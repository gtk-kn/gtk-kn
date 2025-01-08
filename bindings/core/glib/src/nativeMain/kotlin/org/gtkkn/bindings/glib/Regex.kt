// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_26
import org.gtkkn.bindings.glib.annotations.GLibVersion2_30
import org.gtkkn.bindings.glib.annotations.GLibVersion2_34
import org.gtkkn.bindings.glib.annotations.GLibVersion2_38
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GRegex
import org.gtkkn.native.glib.g_regex_error_quark
import org.gtkkn.native.glib.g_regex_escape_nul
import org.gtkkn.native.glib.g_regex_escape_string
import org.gtkkn.native.glib.g_regex_get_capture_count
import org.gtkkn.native.glib.g_regex_get_compile_flags
import org.gtkkn.native.glib.g_regex_get_has_cr_or_lf
import org.gtkkn.native.glib.g_regex_get_match_flags
import org.gtkkn.native.glib.g_regex_get_max_backref
import org.gtkkn.native.glib.g_regex_get_max_lookbehind
import org.gtkkn.native.glib.g_regex_get_pattern
import org.gtkkn.native.glib.g_regex_get_string_number
import org.gtkkn.native.glib.g_regex_match_simple
import org.gtkkn.native.glib.g_regex_new
import org.gtkkn.native.glib.g_regex_ref
import org.gtkkn.native.glib.g_regex_split
import org.gtkkn.native.glib.g_regex_split_simple
import org.gtkkn.native.glib.g_regex_unref
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_regex_get_type
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A `GRegex` is the "compiled" form of a regular expression pattern.
 *
 * `GRegex` implements regular expression pattern matching using syntax and
 * semantics similar to Perl regular expression. See the
 * [PCRE documentation](man:pcrepattern(3)) for the syntax definition.
 *
 * Some functions accept a @start_position argument, setting it differs
 * from just passing over a shortened string and setting %G_REGEX_MATCH_NOTBOL
 * in the case of a pattern that begins with any kind of lookbehind assertion.
 * For example, consider the pattern "\Biss\B" which finds occurrences of "iss"
 * in the middle of words. ("\B" matches only if the current position in the
 * subject is not a word boundary.) When applied to the string "Mississipi"
 * from the fourth byte, namely "issipi", it does not match, because "\B" is
 * always false at the start of the subject, which is deemed to be a word
 * boundary. However, if the entire string is passed , but with
 * @start_position set to 4, it finds the second occurrence of "iss" because
 * it is able to look behind the starting point to discover that it is
 * preceded by a letter.
 *
 * Note that, unless you set the %G_REGEX_RAW flag, all the strings passed
 * to these functions must be encoded in UTF-8. The lengths and the positions
 * inside the strings are in bytes and not in characters, so, for instance,
 * "\xc3\xa0" (i.e. "à") is two bytes long but it is treated as a
 * single character. If you set %G_REGEX_RAW the strings can be non-valid
 * UTF-8 strings and a byte is treated as a character, so "\xc3\xa0" is two
 * bytes and two characters long.
 *
 * When matching a pattern, "\n" matches only against a "\n" character in
 * the string, and "\r" matches only a "\r" character. To match any newline
 * sequence use "\R". This particular group matches either the two-character
 * sequence CR + LF ("\r\n"), or one of the single characters LF (linefeed,
 * U+000A, "\n"), VT vertical tab, U+000B, "\v"), FF (formfeed, U+000C, "\f"),
 * CR (carriage return, U+000D, "\r"), NEL (next line, U+0085), LS (line
 * separator, U+2028), or PS (paragraph separator, U+2029).
 *
 * The behaviour of the dot, circumflex, and dollar metacharacters are
 * affected by newline characters, the default is to recognize any newline
 * character (the same characters recognized by "\R"). This can be changed
 * with `G_REGEX_NEWLINE_CR`, `G_REGEX_NEWLINE_LF` and `G_REGEX_NEWLINE_CRLF`
 * compile options, and with `G_REGEX_MATCH_NEWLINE_ANY`,
 * `G_REGEX_MATCH_NEWLINE_CR`, `G_REGEX_MATCH_NEWLINE_LF` and
 * `G_REGEX_MATCH_NEWLINE_CRLF` match options. These settings are also
 * relevant when compiling a pattern if `G_REGEX_EXTENDED` is set, and an
 * unescaped "#" outside a character class is encountered. This indicates
 * a comment that lasts until after the next newline.
 *
 * Creating and manipulating the same `GRegex` structure from different
 * threads is not a problem as `GRegex` does not modify its internal
 * state between creation and destruction, on the other hand `GMatchInfo`
 * is not threadsafe.
 *
 * The regular expressions low-level functionalities are obtained through
 * the excellent [PCRE](http://www.pcre.org/) library written by Philip Hazel.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `match_info`: match_info: Out parameter is not supported
 * - parameter `match_info`: match_info: Out parameter is not supported
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `string`: Unsupported string with cType gchar
 * - parameter `has_references`: has_references: Out parameter is not supported
 *
 * @since 2.14
 */
@GLibVersion2_14
public class Regex(pointer: CPointer<GRegex>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GRegex> = pointer

    /**
     * Returns the number of capturing subpatterns in the pattern.
     *
     * @return the number of capturing subpatterns
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getCaptureCount(): gint = g_regex_get_capture_count(gPointer)

    /**
     * Returns the compile options that @regex was created with.
     *
     * Depending on the version of PCRE that is used, this may or may not
     * include flags set by option expressions such as `(?i)` found at the
     * top-level within the compiled pattern.
     *
     * @return flags from #GRegexCompileFlags
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getCompileFlags(): RegexCompileFlags = g_regex_get_compile_flags(gPointer).run {
        RegexCompileFlags(this)
    }

    /**
     * Checks whether the pattern contains explicit CR or LF references.
     *
     * @return true if the pattern contains explicit CR or LF references
     * @since 2.34
     */
    @GLibVersion2_34
    public fun getHasCrOrLf(): Boolean = g_regex_get_has_cr_or_lf(gPointer).asBoolean()

    /**
     * Returns the match options that @regex was created with.
     *
     * @return flags from #GRegexMatchFlags
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getMatchFlags(): RegexMatchFlags = g_regex_get_match_flags(gPointer).run {
        RegexMatchFlags(this)
    }

    /**
     * Returns the number of the highest back reference
     * in the pattern, or 0 if the pattern does not contain
     * back references.
     *
     * @return the number of the highest back reference
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getMaxBackref(): gint = g_regex_get_max_backref(gPointer)

    /**
     * Gets the number of characters in the longest lookbehind assertion in the
     * pattern. This information is useful when doing multi-segment matching using
     * the partial matching facilities.
     *
     * @return the number of characters in the longest lookbehind assertion.
     * @since 2.38
     */
    @GLibVersion2_38
    public fun getMaxLookbehind(): gint = g_regex_get_max_lookbehind(gPointer)

    /**
     * Gets the pattern string associated with @regex, i.e. a copy of
     * the string passed to g_regex_new().
     *
     * @return the pattern of @regex
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getPattern(): String = g_regex_get_pattern(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Retrieves the number of the subexpression named @name.
     *
     * @param name name of the subexpression
     * @return The number of the subexpression or -1 if @name
     *   does not exists
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getStringNumber(name: String): gint = g_regex_get_string_number(gPointer, name)

    /**
     * Increases reference count of @regex by 1.
     *
     * @return @regex
     * @since 2.14
     */
    @GLibVersion2_14
    public fun ref(): Regex = g_regex_ref(gPointer)!!.run {
        Regex(this)
    }

    /**
     * Breaks the string on the pattern, and returns an array of the tokens.
     * If the pattern contains capturing parentheses, then the text for each
     * of the substrings will also be returned. If the pattern does not match
     * anywhere in the string, then the whole string is returned as the first
     * token.
     *
     * As a special case, the result of splitting the empty string "" is an
     * empty vector, not a vector containing a single string. The reason for
     * this special case is that being able to represent an empty vector is
     * typically more useful than consistent handling of empty elements. If
     * you do need to represent empty elements, you'll need to check for the
     * empty string before calling this function.
     *
     * A pattern that can match empty strings splits @string into separate
     * characters wherever it matches the empty string between characters.
     * For example splitting "ab c" using as a separator "\s*", you will get
     * "a", "b" and "c".
     *
     * @param string the string to split with the pattern
     * @param matchOptions match time option flags
     * @return a null-terminated gchar ** array. Free
     * it using g_strfreev()
     * @since 2.14
     */
    @GLibVersion2_14
    public fun split(string: String, matchOptions: RegexMatchFlags): List<String> =
        g_regex_split(gPointer, string, matchOptions.mask)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Decreases reference count of @regex by 1. When reference count drops
     * to zero, it frees all the memory associated with the regex structure.
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun unref(): Unit = g_regex_unref(gPointer)

    public companion object {
        /**
         * Compiles the regular expression to an internal form, and does
         * the initial setup of the #GRegex structure.
         *
         * @param pattern the regular expression
         * @param compileOptions compile options for the regular expression, or 0
         * @param matchOptions match options for the regular expression, or 0
         * @return a #GRegex structure or null if an error occurred. Call
         *   g_regex_unref() when you are done with it
         * @since 2.14
         */
        public fun new(
            pattern: String,
            compileOptions: RegexCompileFlags,
            matchOptions: RegexMatchFlags,
        ): Result<Regex?> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult = g_regex_new(pattern, compileOptions.mask, matchOptions.mask, gError.ptr)
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(Regex(checkNotNull(gResult)))
                }
            }
        }

        public fun errorQuark(): Quark = g_regex_error_quark()

        /**
         * Escapes the nul characters in @string to "\x00".  It can be used
         * to compile a regex with embedded nul characters.
         *
         * For completeness, @length can be -1 for a nul-terminated string.
         * In this case the output string will be of course equal to @string.
         *
         * @param string the string to escape
         * @param length the length of @string
         * @return a newly-allocated escaped string
         * @since 2.30
         */
        @GLibVersion2_30
        public fun escapeNul(string: String, length: gint): String =
            g_regex_escape_nul(string, length)?.toKString() ?: error("Expected not null string")

        /**
         * Escapes the special characters used for regular expressions
         * in @string, for instance "a.b*c" becomes "a\.b\*c". This
         * function is useful to dynamically generate regular expressions.
         *
         * @string can contain nul characters that are replaced with "\0",
         * in this case remember to specify the correct length of @string
         * in @length.
         *
         * @param string the string to escape
         * @param length the length of @string, in bytes, or -1 if @string is nul-terminated
         * @return a newly-allocated escaped string
         * @since 2.14
         */
        @GLibVersion2_14
        public fun escapeString(string: String, length: gint): String =
            g_regex_escape_string(string, length)?.toKString() ?: error("Expected not null string")

        /**
         * Scans for a match in @string for @pattern.
         *
         * This function is equivalent to g_regex_match() but it does not
         * require to compile the pattern with g_regex_new(), avoiding some
         * lines of code when you need just to do a match without extracting
         * substrings, capture counts, and so on.
         *
         * If this function is to be called on the same @pattern more than
         * once, it's more efficient to compile the pattern once with
         * g_regex_new() and then use g_regex_match().
         *
         * @param pattern the regular expression
         * @param string the string to scan for matches
         * @param compileOptions compile options for the regular expression, or 0
         * @param matchOptions match options, or 0
         * @return true if the string matched, false otherwise
         * @since 2.14
         */
        @GLibVersion2_14
        public fun matchSimple(
            pattern: String,
            string: String,
            compileOptions: RegexCompileFlags,
            matchOptions: RegexMatchFlags,
        ): Boolean = g_regex_match_simple(pattern, string, compileOptions.mask, matchOptions.mask).asBoolean()

        /**
         * Breaks the string on the pattern, and returns an array of
         * the tokens. If the pattern contains capturing parentheses,
         * then the text for each of the substrings will also be returned.
         * If the pattern does not match anywhere in the string, then the
         * whole string is returned as the first token.
         *
         * This function is equivalent to g_regex_split() but it does
         * not require to compile the pattern with g_regex_new(), avoiding
         * some lines of code when you need just to do a split without
         * extracting substrings, capture counts, and so on.
         *
         * If this function is to be called on the same @pattern more than
         * once, it's more efficient to compile the pattern once with
         * g_regex_new() and then use g_regex_split().
         *
         * As a special case, the result of splitting the empty string ""
         * is an empty vector, not a vector containing a single string.
         * The reason for this special case is that being able to represent
         * an empty vector is typically more useful than consistent handling
         * of empty elements. If you do need to represent empty elements,
         * you'll need to check for the empty string before calling this
         * function.
         *
         * A pattern that can match empty strings splits @string into
         * separate characters wherever it matches the empty string between
         * characters. For example splitting "ab c" using as a separator
         * "\s*", you will get "a", "b" and "c".
         *
         * @param pattern the regular expression
         * @param string the string to scan for matches
         * @param compileOptions compile options for the regular expression, or 0
         * @param matchOptions match options, or 0
         * @return a null-terminated array of strings. Free
         * it using g_strfreev()
         * @since 2.14
         */
        @GLibVersion2_14
        public fun splitSimple(
            pattern: String,
            string: String,
            compileOptions: RegexCompileFlags,
            matchOptions: RegexMatchFlags,
        ): List<String> = g_regex_split_simple(pattern, string, compileOptions.mask, matchOptions.mask)?.toKStringList()
            ?: error("Expected not null string array")

        /**
         * Get the GType of Regex
         *
         * @return the GType
         */
        public fun getType(): GType = g_regex_get_type()
    }
}
