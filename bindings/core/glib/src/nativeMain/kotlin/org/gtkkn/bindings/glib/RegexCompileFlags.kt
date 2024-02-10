// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GRegexCompileFlags
import org.gtkkn.native.glib.G_REGEX_ANCHORED
import org.gtkkn.native.glib.G_REGEX_BSR_ANYCRLF
import org.gtkkn.native.glib.G_REGEX_CASELESS
import org.gtkkn.native.glib.G_REGEX_DOLLAR_ENDONLY
import org.gtkkn.native.glib.G_REGEX_DOTALL
import org.gtkkn.native.glib.G_REGEX_DUPNAMES
import org.gtkkn.native.glib.G_REGEX_EXTENDED
import org.gtkkn.native.glib.G_REGEX_FIRSTLINE
import org.gtkkn.native.glib.G_REGEX_JAVASCRIPT_COMPAT
import org.gtkkn.native.glib.G_REGEX_MULTILINE
import org.gtkkn.native.glib.G_REGEX_NEWLINE_ANYCRLF
import org.gtkkn.native.glib.G_REGEX_NEWLINE_CR
import org.gtkkn.native.glib.G_REGEX_NEWLINE_CRLF
import org.gtkkn.native.glib.G_REGEX_NEWLINE_LF
import org.gtkkn.native.glib.G_REGEX_NO_AUTO_CAPTURE
import org.gtkkn.native.glib.G_REGEX_OPTIMIZE
import org.gtkkn.native.glib.G_REGEX_RAW
import org.gtkkn.native.glib.G_REGEX_UNGREEDY

/**
 * Flags specifying compile-time options.
 * @since 2.14
 */
public class RegexCompileFlags(
    public val mask: GRegexCompileFlags,
) : Bitfield<RegexCompileFlags> {
    override infix fun or(other: RegexCompileFlags): RegexCompileFlags = RegexCompileFlags(mask or other.mask)

    public companion object {
        /**
         * Letters in the pattern match both upper- and
         *     lowercase letters. This option can be changed within a pattern
         *     by a "(?i)" option setting.
         */
        public val CASELESS: RegexCompileFlags = RegexCompileFlags(G_REGEX_CASELESS)

        /**
         * By default, GRegex treats the strings as consisting
         *     of a single line of characters (even if it actually contains
         *     newlines). The "start of line" metacharacter ("^") matches only
         *     at the start of the string, while the "end of line" metacharacter
         *     ("$") matches only at the end of the string, or before a terminating
         *     newline (unless %G_REGEX_DOLLAR_ENDONLY is set). When
         *     %G_REGEX_MULTILINE is set, the "start of line" and "end of line"
         *     constructs match immediately following or immediately before any
         *     newline in the string, respectively, as well as at the very start
         *     and end. This can be changed within a pattern by a "(?m)" option
         *     setting.
         */
        public val MULTILINE: RegexCompileFlags = RegexCompileFlags(G_REGEX_MULTILINE)

        /**
         * A dot metacharacter (".") in the pattern matches all
         *     characters, including newlines. Without it, newlines are excluded.
         *     This option can be changed within a pattern by a ("?s") option setting.
         */
        public val DOTALL: RegexCompileFlags = RegexCompileFlags(G_REGEX_DOTALL)

        /**
         * Whitespace data characters in the pattern are
         *     totally ignored except when escaped or inside a character class.
         *     Whitespace does not include the VT character (code 11). In addition,
         *     characters between an unescaped "#" outside a character class and
         *     the next newline character, inclusive, are also ignored. This can
         *     be changed within a pattern by a "(?x)" option setting.
         */
        public val EXTENDED: RegexCompileFlags = RegexCompileFlags(G_REGEX_EXTENDED)

        /**
         * The pattern is forced to be "anchored", that is,
         *     it is constrained to match only at the first matching point in the
         *     string that is being searched. This effect can also be achieved by
         *     appropriate constructs in the pattern itself such as the "^"
         *     metacharacter.
         */
        public val ANCHORED: RegexCompileFlags = RegexCompileFlags(G_REGEX_ANCHORED)

        /**
         * A dollar metacharacter ("$") in the pattern
         *     matches only at the end of the string. Without this option, a
         *     dollar also matches immediately before the final character if
         *     it is a newline (but not before any other newlines). This option
         *     is ignored if %G_REGEX_MULTILINE is set.
         */
        public val DOLLAR_ENDONLY: RegexCompileFlags = RegexCompileFlags(G_REGEX_DOLLAR_ENDONLY)

        /**
         * Inverts the "greediness" of the quantifiers so that
         *     they are not greedy by default, but become greedy if followed by "?".
         *     It can also be set by a "(?U)" option setting within the pattern.
         */
        public val UNGREEDY: RegexCompileFlags = RegexCompileFlags(G_REGEX_UNGREEDY)

        /**
         * Usually strings must be valid UTF-8 strings, using this
         *     flag they are considered as a raw sequence of bytes.
         */
        public val RAW: RegexCompileFlags = RegexCompileFlags(G_REGEX_RAW)

        /**
         * Disables the use of numbered capturing
         *     parentheses in the pattern. Any opening parenthesis that is not
         *     followed by "?" behaves as if it were followed by "?:" but named
         *     parentheses can still be used for capturing (and they acquire numbers
         *     in the usual way).
         */
        public val NO_AUTO_CAPTURE: RegexCompileFlags = RegexCompileFlags(G_REGEX_NO_AUTO_CAPTURE)

        /**
         * Optimize the regular expression. If the pattern will
         *     be used many times, then it may be worth the effort to optimize it
         *     to improve the speed of matches.
         */
        public val OPTIMIZE: RegexCompileFlags = RegexCompileFlags(G_REGEX_OPTIMIZE)

        /**
         * Limits an unanchored pattern to match before (or at) the
         *     first newline. Since: 2.34
         */
        public val FIRSTLINE: RegexCompileFlags = RegexCompileFlags(G_REGEX_FIRSTLINE)

        /**
         * Names used to identify capturing subpatterns need not
         *     be unique. This can be helpful for certain types of pattern when it
         *     is known that only one instance of the named subpattern can ever be
         *     matched.
         */
        public val DUPNAMES: RegexCompileFlags = RegexCompileFlags(G_REGEX_DUPNAMES)

        /**
         * Usually any newline character or character sequence is
         *     recognized. If this option is set, the only recognized newline character
         *     is '\r'.
         */
        public val NEWLINE_CR: RegexCompileFlags = RegexCompileFlags(G_REGEX_NEWLINE_CR)

        /**
         * Usually any newline character or character sequence is
         *     recognized. If this option is set, the only recognized newline character
         *     is '\n'.
         */
        public val NEWLINE_LF: RegexCompileFlags = RegexCompileFlags(G_REGEX_NEWLINE_LF)

        /**
         * Usually any newline character or character sequence is
         *     recognized. If this option is set, the only recognized newline character
         *     sequence is '\r\n'.
         */
        public val NEWLINE_CRLF: RegexCompileFlags = RegexCompileFlags(G_REGEX_NEWLINE_CRLF)

        /**
         * Usually any newline character or character sequence
         *     is recognized. If this option is set, the only recognized newline character
         *     sequences are '\r', '\n', and '\r\n'. Since: 2.34
         */
        public val NEWLINE_ANYCRLF: RegexCompileFlags = RegexCompileFlags(G_REGEX_NEWLINE_ANYCRLF)

        /**
         * Usually any newline character or character sequence
         *     is recognised. If this option is set, then "\R" only recognizes the newline
         *    characters '\r', '\n' and '\r\n'. Since: 2.34
         */
        public val BSR_ANYCRLF: RegexCompileFlags = RegexCompileFlags(G_REGEX_BSR_ANYCRLF)

        /**
         * Changes behaviour so that it is compatible with
         *     JavaScript rather than PCRE. Since: 2.34
         */
        public val JAVASCRIPT_COMPAT: RegexCompileFlags =
            RegexCompileFlags(G_REGEX_JAVASCRIPT_COMPAT)
    }
}
