// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_30
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GMatchInfo
import org.gtkkn.native.glib.g_match_info_expand_references
import org.gtkkn.native.glib.g_match_info_fetch
import org.gtkkn.native.glib.g_match_info_fetch_all
import org.gtkkn.native.glib.g_match_info_fetch_named
import org.gtkkn.native.glib.g_match_info_free
import org.gtkkn.native.glib.g_match_info_get_match_count
import org.gtkkn.native.glib.g_match_info_get_regex
import org.gtkkn.native.glib.g_match_info_get_string
import org.gtkkn.native.glib.g_match_info_is_partial_match
import org.gtkkn.native.glib.g_match_info_matches
import org.gtkkn.native.glib.g_match_info_next
import org.gtkkn.native.glib.g_match_info_ref
import org.gtkkn.native.glib.g_match_info_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_match_info_get_type
import org.gtkkn.native.gobject.gint
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A GMatchInfo is an opaque struct used to return information about
 * matches.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `start_pos`: start_pos: Out parameter is not supported
 * - parameter `start_pos`: start_pos: Out parameter is not supported
 */
public class MatchInfo(pointer: CPointer<GMatchInfo>) : ProxyInstance(pointer) {
    public val glibMatchInfoPointer: CPointer<GMatchInfo> = pointer

    /**
     * Returns a new string containing the text in @string_to_expand with
     * references and escape sequences expanded. References refer to the last
     * match done with @string against @regex and have the same syntax used by
     * g_regex_replace().
     *
     * The @string_to_expand must be UTF-8 encoded even if %G_REGEX_RAW was
     * passed to g_regex_new().
     *
     * The backreferences are extracted from the string passed to the match
     * function, so you cannot call this function after freeing the string.
     *
     * @match_info may be null in which case @string_to_expand must not
     * contain references. For instance "foo\n" does not refer to an actual
     * pattern and '\n' merely will be replaced with \n character,
     * while to expand "\0" (whole match) one needs the result of a match.
     * Use g_regex_check_replacement() to find out whether @string_to_expand
     * contains references.
     *
     * @param stringToExpand the string to expand
     * @return the expanded string, or null if an error occurred
     * @since 2.14
     */
    @GLibVersion2_14
    public fun expandReferences(stringToExpand: String): Result<String?> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_match_info_expand_references(
            glibMatchInfoPointer.reinterpret(),
            stringToExpand,
            gError.ptr
        )?.toKString()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Retrieves the text matching the @match_num'th capturing
     * parentheses. 0 is the full text of the match, 1 is the first paren
     * set, 2 the second, and so on.
     *
     * If @match_num is a valid sub pattern but it didn't match anything
     * (e.g. sub pattern 1, matching "b" against "(a)?b") then an empty
     * string is returned.
     *
     * If the match was obtained using the DFA algorithm, that is using
     * g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * string is not that of a set of parentheses but that of a matched
     * substring. Substrings are matched in reverse order of length, so
     * 0 is the longest match.
     *
     * The string is fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     *
     * @param matchNum number of the sub expression
     * @return The matched substring, or null if an error
     *     occurred. You have to free the string yourself
     * @since 2.14
     */
    @GLibVersion2_14
    public fun fetch(matchNum: gint): String? =
        g_match_info_fetch(glibMatchInfoPointer.reinterpret(), matchNum)?.toKString()

    /**
     * Bundles up pointers to each of the matching substrings from a match
     * and stores them in an array of gchar pointers. The first element in
     * the returned array is the match number 0, i.e. the entire matched
     * text.
     *
     * If a sub pattern didn't match anything (e.g. sub pattern 1, matching
     * "b" against "(a)?b") then an empty string is inserted.
     *
     * If the last match was obtained using the DFA algorithm, that is using
     * g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * strings are not that matched by sets of parentheses but that of the
     * matched substring. Substrings are matched in reverse order of length,
     * so the first one is the longest match.
     *
     * The strings are fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     *
     * @return a null-terminated array of gchar *
     *     pointers.  It must be freed using g_strfreev(). If the previous
     *     match failed null is returned
     * @since 2.14
     */
    @GLibVersion2_14
    public fun fetchAll(): List<String> = g_match_info_fetch_all(glibMatchInfoPointer.reinterpret())?.toKStringList()
        ?: error("Expected not null string array")

    /**
     * Retrieves the text matching the capturing parentheses named @name.
     *
     * If @name is a valid sub pattern name but it didn't match anything
     * (e.g. sub pattern "X", matching "b" against "(?P<X>a)?b")
     * then an empty string is returned.
     *
     * The string is fetched from the string passed to the match function,
     * so you cannot call this function after freeing the string.
     *
     * @param name name of the subexpression
     * @return The matched substring, or null if an error
     *     occurred. You have to free the string yourself
     * @since 2.14
     */
    @GLibVersion2_14
    public fun fetchNamed(name: String): String? =
        g_match_info_fetch_named(glibMatchInfoPointer.reinterpret(), name)?.toKString()

    /**
     * If @match_info is not null, calls g_match_info_unref(); otherwise does
     * nothing.
     *
     * @since 2.14
     */
    @GLibVersion2_14
    public fun free(): Unit = g_match_info_free(glibMatchInfoPointer.reinterpret())

    /**
     * Retrieves the number of matched substrings (including substring 0,
     * that is the whole matched text), so 1 is returned if the pattern
     * has no substrings in it and 0 is returned if the match failed.
     *
     * If the last match was obtained using the DFA algorithm, that is
     * using g_regex_match_all() or g_regex_match_all_full(), the retrieved
     * count is not that of the number of capturing parentheses but that of
     * the number of matched substrings.
     *
     * @return Number of matched substrings, or -1 if an error occurred
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getMatchCount(): gint = g_match_info_get_match_count(glibMatchInfoPointer.reinterpret())

    /**
     * Returns #GRegex object used in @match_info. It belongs to Glib
     * and must not be freed. Use g_regex_ref() if you need to keep it
     * after you free @match_info object.
     *
     * @return #GRegex object used in @match_info
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getRegex(): Regex = g_match_info_get_regex(glibMatchInfoPointer.reinterpret())!!.run {
        Regex(reinterpret())
    }

    /**
     * Returns the string searched with @match_info. This is the
     * string passed to g_regex_match() or g_regex_replace() so
     * you may not free it before calling this function.
     *
     * @return the string searched with @match_info
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getString(): String =
        g_match_info_get_string(glibMatchInfoPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Usually if the string passed to g_regex_match*() matches as far as
     * it goes, but is too short to match the entire pattern, false is
     * returned. There are circumstances where it might be helpful to
     * distinguish this case from other cases in which there is no match.
     *
     * Consider, for example, an application where a human is required to
     * type in data for a field with specific formatting requirements. An
     * example might be a date in the form ddmmmyy, defined by the pattern
     * "^\d?\d(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\d\d$".
     * If the application sees the user’s keystrokes one by one, and can
     * check that what has been typed so far is potentially valid, it is
     * able to raise an error as soon as a mistake is made.
     *
     * GRegex supports the concept of partial matching by means of the
     * %G_REGEX_MATCH_PARTIAL_SOFT and %G_REGEX_MATCH_PARTIAL_HARD flags.
     * When they are used, the return code for
     * g_regex_match() or g_regex_match_full() is, as usual, true
     * for a complete match, false otherwise. But, when these functions
     * return false, you can check if the match was partial calling
     * g_match_info_is_partial_match().
     *
     * The difference between %G_REGEX_MATCH_PARTIAL_SOFT and
     * %G_REGEX_MATCH_PARTIAL_HARD is that when a partial match is encountered
     * with %G_REGEX_MATCH_PARTIAL_SOFT, matching continues to search for a
     * possible complete match, while with %G_REGEX_MATCH_PARTIAL_HARD matching
     * stops at the partial match.
     * When both %G_REGEX_MATCH_PARTIAL_SOFT and %G_REGEX_MATCH_PARTIAL_HARD
     * are set, the latter takes precedence.
     *
     * There were formerly some restrictions on the pattern for partial matching.
     * The restrictions no longer apply.
     *
     * See pcrepartial(3) for more information on partial matching.
     *
     * @return true if the match was partial, false otherwise
     * @since 2.14
     */
    @GLibVersion2_14
    public fun isPartialMatch(): Boolean = g_match_info_is_partial_match(glibMatchInfoPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the previous match operation succeeded.
     *
     * @return true if the previous match operation succeeded,
     *   false otherwise
     * @since 2.14
     */
    @GLibVersion2_14
    public fun matches(): Boolean = g_match_info_matches(glibMatchInfoPointer.reinterpret()).asBoolean()

    /**
     * Scans for the next match using the same parameters of the previous
     * call to g_regex_match_full() or g_regex_match() that returned
     * @match_info.
     *
     * The match is done on the string passed to the match function, so you
     * cannot free it before calling this function.
     *
     * @return true is the string matched, false otherwise
     * @since 2.14
     */
    @GLibVersion2_14
    public fun next(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_match_info_next(glibMatchInfoPointer.reinterpret(), gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Increases reference count of @match_info by 1.
     *
     * @return @match_info
     * @since 2.30
     */
    @GLibVersion2_30
    public fun ref(): MatchInfo = g_match_info_ref(glibMatchInfoPointer.reinterpret())!!.run {
        MatchInfo(reinterpret())
    }

    /**
     * Decreases reference count of @match_info by 1. When reference count drops
     * to zero, it frees all the memory associated with the match_info structure.
     *
     * @since 2.30
     */
    @GLibVersion2_30
    public fun unref(): Unit = g_match_info_unref(glibMatchInfoPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of MatchInfo
         *
         * @return the GType
         */
        public fun getType(): GType = g_match_info_get_type()
    }
}
