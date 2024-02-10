// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoLanguage
import org.gtkkn.native.pango.pango_language_from_string
import org.gtkkn.native.pango.pango_language_get_default
import org.gtkkn.native.pango.pango_language_get_preferred
import org.gtkkn.native.pango.pango_language_get_sample_string
import org.gtkkn.native.pango.pango_language_includes_script
import org.gtkkn.native.pango.pango_language_matches
import kotlin.Boolean
import kotlin.String

/**
 * The `PangoLanguage` structure is used to
 * represent a language.
 *
 * `PangoLanguage` pointers can be efficiently
 * copied and compared with each other.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `num_scripts`: num_scripts: Out parameter is not supported
 * - method `to_string`: C function pango_language_to_string is ignored
 */
public class Language(
    pointer: CPointer<PangoLanguage>,
) : Record {
    public val pangoLanguagePointer: CPointer<PangoLanguage> = pointer

    /**
     * Get a string that is representative of the characters needed to
     * render a particular language.
     *
     * The sample text may be a pangram, but is not necessarily. It is chosen
     * to be demonstrative of normal text in the language, as well as exposing
     * font feature requirements unique to the language. It is suitable for use
     * as sample text in a font selection dialog.
     *
     * If @language is null, the default language as found by
     * [func@Pango.Language.get_default] is used.
     *
     * If Pango does not have a sample string for @language, the classic
     * "The quick brown fox..." is returned.  This can be detected by
     * comparing the returned pointer value to that returned for (non-existent)
     * language code "xx".  That is, compare to:
     *
     * ```
     * pango_language_get_sample_string (pango_language_from_string ("xx"))
     * ```
     *
     * @return the sample string
     */
    public fun getSampleString(): String =
        pango_language_get_sample_string(pangoLanguagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Determines if @script is one of the scripts used to
     * write @language.
     *
     * The returned value is conservative; if nothing is known about
     * the language tag @language, true will be returned, since, as
     * far as Pango knows, @script might be used to write @language.
     *
     * This routine is used in Pango's itemization process when
     * determining if a supplied language tag is relevant to
     * a particular section of text. It probably is not useful
     * for applications in most circumstances.
     *
     * This function uses [method@Pango.Language.get_scripts] internally.
     *
     * @param script a `PangoScript`
     * @return true if @script is one of the scripts used
     *   to write @language or if nothing is known about @language
     *   (including the case that @language is null), false otherwise.
     * @since 1.4
     */
    public fun includesScript(script: Script): Boolean =
        pango_language_includes_script(
            pangoLanguagePointer.reinterpret(),
            script.nativeValue
        ).asBoolean()

    /**
     * Checks if a language tag matches one of the elements in a list of
     * language ranges.
     *
     * A language tag is considered to match a range in the list if the
     * range is '*', the range is exactly the tag, or the range is a prefix
     * of the tag, and the character after it in the tag is '-'.
     *
     * @param rangeList a list of language ranges, separated by ';', ':',
     *   ',', or space characters.
     *   Each element must either be '*', or a RFC 3066 language range
     *   canonicalized as by [func@Pango.Language.from_string]
     * @return true if a match was found
     */
    public fun matches(rangeList: String): Boolean =
        pango_language_matches(pangoLanguagePointer.reinterpret(), rangeList).asBoolean()

    public companion object : RecordCompanion<Language, PangoLanguage> {
        /**
         * Convert a language tag to a `PangoLanguage`.
         *
         * The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
         * can be efficiently copied (copy the pointer) and compared with other
         * language tags (compare the pointer.)
         *
         * This function first canonicalizes the string by converting it to
         * lowercase, mapping '_' to '-', and stripping all characters other
         * than letters and '-'.
         *
         * Use [func@Pango.Language.get_default] if you want to get the
         * `PangoLanguage` for the current locale of the process.
         *
         * @param language a string representing a language tag
         * @return a `PangoLanguage`
         */
        public fun fromString(language: String? = null): Language? =
            pango_language_from_string(language)?.run {
                Language(reinterpret())
            }

        /**
         * Returns the `PangoLanguage` for the current locale of the process.
         *
         * On Unix systems, this is the return value is derived from
         * `setlocale (LC_CTYPE, NULL)`, and the user can
         * affect this through the environment variables LC_ALL, LC_CTYPE or
         * LANG (checked in that order). The locale string typically is in
         * the form lang_COUNTRY, where lang is an ISO-639 language code, and
         * COUNTRY is an ISO-3166 country code. For instance, sv_FI for
         * Swedish as written in Finland or pt_BR for Portuguese as written in
         * Brazil.
         *
         * On Windows, the C library does not use any such environment
         * variables, and setting them won't affect the behavior of functions
         * like ctime(). The user sets the locale through the Regional Options
         * in the Control Panel. The C library (in the setlocale() function)
         * does not use country and language codes, but country and language
         * names spelled out in English.
         * However, this function does check the above environment
         * variables, and does return a Unix-style locale string based on
         * either said environment variables or the thread's current locale.
         *
         * Your application should call `setlocale(LC_ALL, "")` for the user
         * settings to take effect. GTK does this in its initialization
         * functions automatically (by calling gtk_set_locale()).
         * See the setlocale() manpage for more details.
         *
         * Note that the default language can change over the life of an application.
         *
         * Also note that this function will not do the right thing if you
         * use per-thread locales with uselocale(). In that case, you should
         * just call pango_language_from_string() yourself.
         *
         * @return the default language as a `PangoLanguage`
         * @since 1.16
         */
        public fun getDefault(): Language =
            pango_language_get_default()!!.run {
                Language(reinterpret())
            }

        /**
         * Returns the list of languages that the user prefers.
         *
         * The list is specified by the `PANGO_LANGUAGE` or `LANGUAGE`
         * environment variables, in order of preference. Note that this
         * list does not necessarily include the language returned by
         * [func@Pango.Language.get_default].
         *
         * When choosing language-specific resources, such as the sample
         * text returned by [method@Pango.Language.get_sample_string],
         * you should first try the default language, followed by the
         * languages returned by this function.
         *
         * @return a null-terminated array
         *   of `PangoLanguage`*
         * @since 1.48
         */
        public fun getPreferred(): Language? =
            pango_language_get_preferred()?.run {
                Language(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Language = Language(pointer.reinterpret())
    }
}
