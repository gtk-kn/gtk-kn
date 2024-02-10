// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GUnicodeBreakType
import org.gtkkn.native.glib.GUnicodeBreakType.Companion.G_UNICODE_BREAK_CLOSE_PARENTHESIS
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_AFTER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_ALPHABETIC
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_AMBIGUOUS
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_BEFORE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_BEFORE_AND_AFTER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_CARRIAGE_RETURN
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARANTHESIS
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_COMBINING_MARK
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_COMPLEX_CONTEXT
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_CONTINGENT
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_BASE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_MODIFIER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_EXCLAMATION
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LV_SYLLABLE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_L_JAMO
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_T_JAMO
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_V_JAMO
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HEBREW_LETTER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_HYPHEN
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_IDEOGRAPHIC
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_INFIX_SEPARATOR
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_INSEPARABLE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_LINE_FEED
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_MANDATORY
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_NEXT_LINE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_NON_BREAKING_GLUE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_NON_STARTER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_NUMERIC
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_OPEN_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_POSTFIX
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_PREFIX
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_QUOTATION
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_REGIONAL_INDICATOR
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_SPACE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_SURROGATE
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_SYMBOL
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_UNKNOWN
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_WORD_JOINER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_JOINER
import org.gtkkn.native.glib.GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_SPACE

/**
 * These are the possible line break classifications.
 *
 * Since new unicode versions may add new types here, applications should be ready
 * to handle unknown values. They may be regarded as %G_UNICODE_BREAK_UNKNOWN.
 *
 * See [Unicode Line Breaking Algorithm](http://www.unicode.org/unicode/reports/tr14/).
 */
public enum class UnicodeBreakType(
    public val nativeValue: GUnicodeBreakType,
) {
    /**
     * Mandatory Break (BK)
     */
    MANDATORY(G_UNICODE_BREAK_MANDATORY),

    /**
     * Carriage Return (CR)
     */
    CARRIAGE_RETURN(G_UNICODE_BREAK_CARRIAGE_RETURN),

    /**
     * Line Feed (LF)
     */
    LINE_FEED(G_UNICODE_BREAK_LINE_FEED),

    /**
     * Attached Characters and Combining Marks (CM)
     */
    COMBINING_MARK(G_UNICODE_BREAK_COMBINING_MARK),

    /**
     * Surrogates (SG)
     */
    SURROGATE(G_UNICODE_BREAK_SURROGATE),

    /**
     * Zero Width Space (ZW)
     */
    ZERO_WIDTH_SPACE(G_UNICODE_BREAK_ZERO_WIDTH_SPACE),

    /**
     * Inseparable (IN)
     */
    INSEPARABLE(G_UNICODE_BREAK_INSEPARABLE),

    /**
     * Non-breaking ("Glue") (GL)
     */
    NON_BREAKING_GLUE(G_UNICODE_BREAK_NON_BREAKING_GLUE),

    /**
     * Contingent Break Opportunity (CB)
     */
    CONTINGENT(G_UNICODE_BREAK_CONTINGENT),

    /**
     * Space (SP)
     */
    SPACE(G_UNICODE_BREAK_SPACE),

    /**
     * Break Opportunity After (BA)
     */
    AFTER(G_UNICODE_BREAK_AFTER),

    /**
     * Break Opportunity Before (BB)
     */
    BEFORE(G_UNICODE_BREAK_BEFORE),

    /**
     * Break Opportunity Before and After (B2)
     */
    BEFORE_AND_AFTER(G_UNICODE_BREAK_BEFORE_AND_AFTER),

    /**
     * Hyphen (HY)
     */
    HYPHEN(G_UNICODE_BREAK_HYPHEN),

    /**
     * Nonstarter (NS)
     */
    NON_STARTER(G_UNICODE_BREAK_NON_STARTER),

    /**
     * Opening Punctuation (OP)
     */
    OPEN_PUNCTUATION(G_UNICODE_BREAK_OPEN_PUNCTUATION),

    /**
     * Closing Punctuation (CL)
     */
    CLOSE_PUNCTUATION(G_UNICODE_BREAK_CLOSE_PUNCTUATION),

    /**
     * Ambiguous Quotation (QU)
     */
    QUOTATION(G_UNICODE_BREAK_QUOTATION),

    /**
     * Exclamation/Interrogation (EX)
     */
    EXCLAMATION(G_UNICODE_BREAK_EXCLAMATION),

    /**
     * Ideographic (ID)
     */
    IDEOGRAPHIC(G_UNICODE_BREAK_IDEOGRAPHIC),

    /**
     * Numeric (NU)
     */
    NUMERIC(G_UNICODE_BREAK_NUMERIC),

    /**
     * Infix Separator (Numeric) (IS)
     */
    INFIX_SEPARATOR(G_UNICODE_BREAK_INFIX_SEPARATOR),

    /**
     * Symbols Allowing Break After (SY)
     */
    SYMBOL(G_UNICODE_BREAK_SYMBOL),

    /**
     * Ordinary Alphabetic and Symbol Characters (AL)
     */
    ALPHABETIC(G_UNICODE_BREAK_ALPHABETIC),

    /**
     * Prefix (Numeric) (PR)
     */
    PREFIX(G_UNICODE_BREAK_PREFIX),

    /**
     * Postfix (Numeric) (PO)
     */
    POSTFIX(G_UNICODE_BREAK_POSTFIX),

    /**
     * Complex Content Dependent (South East Asian) (SA)
     */
    COMPLEX_CONTEXT(G_UNICODE_BREAK_COMPLEX_CONTEXT),

    /**
     * Ambiguous (Alphabetic or Ideographic) (AI)
     */
    AMBIGUOUS(G_UNICODE_BREAK_AMBIGUOUS),

    /**
     * Unknown (XX)
     */
    UNKNOWN(G_UNICODE_BREAK_UNKNOWN),

    /**
     * Next Line (NL)
     */
    NEXT_LINE(G_UNICODE_BREAK_NEXT_LINE),

    /**
     * Word Joiner (WJ)
     */
    WORD_JOINER(G_UNICODE_BREAK_WORD_JOINER),

    /**
     * Hangul L Jamo (JL)
     */
    HANGUL_L_JAMO(G_UNICODE_BREAK_HANGUL_L_JAMO),

    /**
     * Hangul V Jamo (JV)
     */
    HANGUL_V_JAMO(G_UNICODE_BREAK_HANGUL_V_JAMO),

    /**
     * Hangul T Jamo (JT)
     */
    HANGUL_T_JAMO(G_UNICODE_BREAK_HANGUL_T_JAMO),

    /**
     * Hangul LV Syllable (H2)
     */
    HANGUL_LV_SYLLABLE(G_UNICODE_BREAK_HANGUL_LV_SYLLABLE),

    /**
     * Hangul LVT Syllable (H3)
     */
    HANGUL_LVT_SYLLABLE(G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE),

    /**
     * Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use
     * %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead.
     */
    CLOSE_PARANTHESIS(G_UNICODE_BREAK_CLOSE_PARANTHESIS),

    /**
     * Closing Parenthesis (CP). Since 2.70
     */
    CLOSE_PARENTHESIS(G_UNICODE_BREAK_CLOSE_PARENTHESIS),

    /**
     * Conditional Japanese Starter (CJ). Since: 2.32
     */
    CONDITIONAL_JAPANESE_STARTER(G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER),

    /**
     * Hebrew Letter (HL). Since: 2.32
     */
    HEBREW_LETTER(G_UNICODE_BREAK_HEBREW_LETTER),

    /**
     * Regional Indicator (RI). Since: 2.36
     */
    REGIONAL_INDICATOR(G_UNICODE_BREAK_REGIONAL_INDICATOR),

    /**
     * Emoji Base (EB). Since: 2.50
     */
    EMOJI_BASE(G_UNICODE_BREAK_EMOJI_BASE),

    /**
     * Emoji Modifier (EM). Since: 2.50
     */
    EMOJI_MODIFIER(G_UNICODE_BREAK_EMOJI_MODIFIER),

    /**
     * Zero Width Joiner (ZWJ). Since: 2.50
     */
    ZERO_WIDTH_JOINER(G_UNICODE_BREAK_ZERO_WIDTH_JOINER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnicodeBreakType): UnicodeBreakType =
            when (nativeValue) {
                G_UNICODE_BREAK_MANDATORY -> MANDATORY
                G_UNICODE_BREAK_CARRIAGE_RETURN -> CARRIAGE_RETURN
                G_UNICODE_BREAK_LINE_FEED -> LINE_FEED
                G_UNICODE_BREAK_COMBINING_MARK -> COMBINING_MARK
                G_UNICODE_BREAK_SURROGATE -> SURROGATE
                G_UNICODE_BREAK_ZERO_WIDTH_SPACE -> ZERO_WIDTH_SPACE
                G_UNICODE_BREAK_INSEPARABLE -> INSEPARABLE
                G_UNICODE_BREAK_NON_BREAKING_GLUE -> NON_BREAKING_GLUE
                G_UNICODE_BREAK_CONTINGENT -> CONTINGENT
                G_UNICODE_BREAK_SPACE -> SPACE
                G_UNICODE_BREAK_AFTER -> AFTER
                G_UNICODE_BREAK_BEFORE -> BEFORE
                G_UNICODE_BREAK_BEFORE_AND_AFTER -> BEFORE_AND_AFTER
                G_UNICODE_BREAK_HYPHEN -> HYPHEN
                G_UNICODE_BREAK_NON_STARTER -> NON_STARTER
                G_UNICODE_BREAK_OPEN_PUNCTUATION -> OPEN_PUNCTUATION
                G_UNICODE_BREAK_CLOSE_PUNCTUATION -> CLOSE_PUNCTUATION
                G_UNICODE_BREAK_QUOTATION -> QUOTATION
                G_UNICODE_BREAK_EXCLAMATION -> EXCLAMATION
                G_UNICODE_BREAK_IDEOGRAPHIC -> IDEOGRAPHIC
                G_UNICODE_BREAK_NUMERIC -> NUMERIC
                G_UNICODE_BREAK_INFIX_SEPARATOR -> INFIX_SEPARATOR
                G_UNICODE_BREAK_SYMBOL -> SYMBOL
                G_UNICODE_BREAK_ALPHABETIC -> ALPHABETIC
                G_UNICODE_BREAK_PREFIX -> PREFIX
                G_UNICODE_BREAK_POSTFIX -> POSTFIX
                G_UNICODE_BREAK_COMPLEX_CONTEXT -> COMPLEX_CONTEXT
                G_UNICODE_BREAK_AMBIGUOUS -> AMBIGUOUS
                G_UNICODE_BREAK_UNKNOWN -> UNKNOWN
                G_UNICODE_BREAK_NEXT_LINE -> NEXT_LINE
                G_UNICODE_BREAK_WORD_JOINER -> WORD_JOINER
                G_UNICODE_BREAK_HANGUL_L_JAMO -> HANGUL_L_JAMO
                G_UNICODE_BREAK_HANGUL_V_JAMO -> HANGUL_V_JAMO
                G_UNICODE_BREAK_HANGUL_T_JAMO -> HANGUL_T_JAMO
                G_UNICODE_BREAK_HANGUL_LV_SYLLABLE -> HANGUL_LV_SYLLABLE
                G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE -> HANGUL_LVT_SYLLABLE
                G_UNICODE_BREAK_CLOSE_PARANTHESIS -> CLOSE_PARANTHESIS
                G_UNICODE_BREAK_CLOSE_PARENTHESIS -> CLOSE_PARENTHESIS
                G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER -> CONDITIONAL_JAPANESE_STARTER
                G_UNICODE_BREAK_HEBREW_LETTER -> HEBREW_LETTER
                G_UNICODE_BREAK_REGIONAL_INDICATOR -> REGIONAL_INDICATOR
                G_UNICODE_BREAK_EMOJI_BASE -> EMOJI_BASE
                G_UNICODE_BREAK_EMOJI_MODIFIER -> EMOJI_MODIFIER
                G_UNICODE_BREAK_ZERO_WIDTH_JOINER -> ZERO_WIDTH_JOINER
                else -> error("invalid nativeValue")
            }
    }
}
