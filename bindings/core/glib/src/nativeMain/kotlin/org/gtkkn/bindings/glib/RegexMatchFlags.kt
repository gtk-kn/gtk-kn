// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GRegexMatchFlags
import org.gtkkn.native.glib.G_REGEX_MATCH_ANCHORED
import org.gtkkn.native.glib.G_REGEX_MATCH_BSR_ANY
import org.gtkkn.native.glib.G_REGEX_MATCH_BSR_ANYCRLF
import org.gtkkn.native.glib.G_REGEX_MATCH_NEWLINE_ANY
import org.gtkkn.native.glib.G_REGEX_MATCH_NEWLINE_ANYCRLF
import org.gtkkn.native.glib.G_REGEX_MATCH_NEWLINE_CR
import org.gtkkn.native.glib.G_REGEX_MATCH_NEWLINE_CRLF
import org.gtkkn.native.glib.G_REGEX_MATCH_NEWLINE_LF
import org.gtkkn.native.glib.G_REGEX_MATCH_NOTBOL
import org.gtkkn.native.glib.G_REGEX_MATCH_NOTEMPTY
import org.gtkkn.native.glib.G_REGEX_MATCH_NOTEMPTY_ATSTART
import org.gtkkn.native.glib.G_REGEX_MATCH_NOTEOL
import org.gtkkn.native.glib.G_REGEX_MATCH_PARTIAL
import org.gtkkn.native.glib.G_REGEX_MATCH_PARTIAL_HARD
import org.gtkkn.native.glib.G_REGEX_MATCH_PARTIAL_SOFT

/**
 * Flags specifying match-time options.
 * @since 2.14
 */
public class RegexMatchFlags(
    public val mask: GRegexMatchFlags,
) : Bitfield<RegexMatchFlags> {
    override infix fun or(other: RegexMatchFlags): RegexMatchFlags = RegexMatchFlags(mask or other.mask)

    public companion object {
        /**
         * The pattern is forced to be "anchored", that is,
         *     it is constrained to match only at the first matching point in the
         *     string that is being searched. This effect can also be achieved by
         *     appropriate constructs in the pattern itself such as the "^"
         *     metacharacter.
         */
        public val ANCHORED: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_ANCHORED)

        /**
         * Specifies that first character of the string is
         *     not the beginning of a line, so the circumflex metacharacter should
         *     not match before it. Setting this without %G_REGEX_MULTILINE (at
         *     compile time) causes circumflex never to match. This option affects
         *     only the behaviour of the circumflex metacharacter, it does not
         *     affect "\A".
         */
        public val NOTBOL: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NOTBOL)

        /**
         * Specifies that the end of the subject string is
         *     not the end of a line, so the dollar metacharacter should not match
         *     it nor (except in multiline mode) a newline immediately before it.
         *     Setting this without %G_REGEX_MULTILINE (at compile time) causes
         *     dollar never to match. This option affects only the behaviour of
         *     the dollar metacharacter, it does not affect "\Z" or "\z".
         */
        public val NOTEOL: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NOTEOL)

        /**
         * An empty string is not considered to be a valid
         *     match if this option is set. If there are alternatives in the pattern,
         *     they are tried. If all the alternatives match the empty string, the
         *     entire match fails. For example, if the pattern "a?b?" is applied to
         *     a string not beginning with "a" or "b", it matches the empty string
         *     at the start of the string. With this flag set, this match is not
         *     valid, so GRegex searches further into the string for occurrences
         *     of "a" or "b".
         */
        public val NOTEMPTY: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NOTEMPTY)

        /**
         * Turns on the partial matching feature, for more
         *     documentation on partial matching see g_match_info_is_partial_match().
         */
        public val PARTIAL: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_PARTIAL)

        /**
         * Overrides the newline definition set when
         *     creating a new #GRegex, setting the '\r' character as line terminator.
         */
        public val NEWLINE_CR: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NEWLINE_CR)

        /**
         * Overrides the newline definition set when
         *     creating a new #GRegex, setting the '\n' character as line terminator.
         */
        public val NEWLINE_LF: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NEWLINE_LF)

        /**
         * Overrides the newline definition set when
         *     creating a new #GRegex, setting the '\r\n' characters sequence as line terminator.
         */
        public val NEWLINE_CRLF: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NEWLINE_CRLF)

        /**
         * Overrides the newline definition set when
         *     creating a new #GRegex, any Unicode newline sequence
         *     is recognised as a newline. These are '\r', '\n' and '\rn', and the
         *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
         *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
         *     U+2029 PARAGRAPH SEPARATOR.
         */
        public val NEWLINE_ANY: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NEWLINE_ANY)

        /**
         * Overrides the newline definition set when
         *     creating a new #GRegex; any '\r', '\n', or '\r\n' character sequence
         *     is recognized as a newline. Since: 2.34
         */
        public val NEWLINE_ANYCRLF: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_NEWLINE_ANYCRLF)

        /**
         * Overrides the newline definition for "\R" set when
         *     creating a new #GRegex; only '\r', '\n', or '\r\n' character sequences
         *     are recognized as a newline by "\R". Since: 2.34
         */
        public val BSR_ANYCRLF: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_BSR_ANYCRLF)

        /**
         * Overrides the newline definition for "\R" set when
         *     creating a new #GRegex; any Unicode newline character or character sequence
         *     are recognized as a newline by "\R". These are '\r', '\n' and '\rn', and the
         *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
         *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
         *     U+2029 PARAGRAPH SEPARATOR. Since: 2.34
         */
        public val BSR_ANY: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_BSR_ANY)

        /**
         * An alias for %G_REGEX_MATCH_PARTIAL. Since: 2.34
         */
        public val PARTIAL_SOFT: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_PARTIAL_SOFT)

        /**
         * Turns on the partial matching feature. In contrast to
         *     to %G_REGEX_MATCH_PARTIAL_SOFT, this stops matching as soon as a partial match
         *     is found, without continuing to search for a possible complete match. See
         *     g_match_info_is_partial_match() for more information. Since: 2.34
         */
        public val PARTIAL_HARD: RegexMatchFlags = RegexMatchFlags(G_REGEX_MATCH_PARTIAL_HARD)

        /**
         * Like %G_REGEX_MATCH_NOTEMPTY, but only applied to
         *     the start of the matched string. For anchored
         *     patterns this can only happen for pattern containing "\K". Since: 2.34
         */
        public val NOTEMPTY_ATSTART: RegexMatchFlags =
            RegexMatchFlags(G_REGEX_MATCH_NOTEMPTY_ATSTART)
    }
}
