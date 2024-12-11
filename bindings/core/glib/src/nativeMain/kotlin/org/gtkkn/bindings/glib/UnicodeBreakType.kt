// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GUnicodeBreakType
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_unicode_break_type_get_type

/**
 * These are the possible line break classifications.
 *
 * Since new Unicode versions may add new types here, applications should be ready
 * to handle unknown values. They may be regarded as %G_UNICODE_BREAK_UNKNOWN.
 *
 * See [Unicode Line Breaking Algorithm](https://www.unicode.org/reports/tr14/).
 */
public enum class UnicodeBreakType(public val nativeValue: GUnicodeBreakType) {
    /**
     * Mandatory Break (BK)
     */
    MANDATORY(GUnicodeBreakType.G_UNICODE_BREAK_MANDATORY),

    /**
     * Carriage Return (CR)
     */
    CARRIAGE_RETURN(GUnicodeBreakType.G_UNICODE_BREAK_CARRIAGE_RETURN),

    /**
     * Line Feed (LF)
     */
    LINE_FEED(GUnicodeBreakType.G_UNICODE_BREAK_LINE_FEED),

    /**
     * Attached Characters and Combining Marks (CM)
     */
    COMBINING_MARK(GUnicodeBreakType.G_UNICODE_BREAK_COMBINING_MARK),

    /**
     * Surrogates (SG)
     */
    SURROGATE(GUnicodeBreakType.G_UNICODE_BREAK_SURROGATE),

    /**
     * Zero Width Space (ZW)
     */
    ZERO_WIDTH_SPACE(GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_SPACE),

    /**
     * Inseparable (IN)
     */
    INSEPARABLE(GUnicodeBreakType.G_UNICODE_BREAK_INSEPARABLE),

    /**
     * Non-breaking ("Glue") (GL)
     */
    NON_BREAKING_GLUE(GUnicodeBreakType.G_UNICODE_BREAK_NON_BREAKING_GLUE),

    /**
     * Contingent Break Opportunity (CB)
     */
    CONTINGENT(GUnicodeBreakType.G_UNICODE_BREAK_CONTINGENT),

    /**
     * Space (SP)
     */
    SPACE(GUnicodeBreakType.G_UNICODE_BREAK_SPACE),

    /**
     * Break Opportunity After (BA)
     */
    AFTER(GUnicodeBreakType.G_UNICODE_BREAK_AFTER),

    /**
     * Break Opportunity Before (BB)
     */
    BEFORE(GUnicodeBreakType.G_UNICODE_BREAK_BEFORE),

    /**
     * Break Opportunity Before and After (B2)
     */
    BEFORE_AND_AFTER(GUnicodeBreakType.G_UNICODE_BREAK_BEFORE_AND_AFTER),

    /**
     * Hyphen (HY)
     */
    HYPHEN(GUnicodeBreakType.G_UNICODE_BREAK_HYPHEN),

    /**
     * Nonstarter (NS)
     */
    NON_STARTER(GUnicodeBreakType.G_UNICODE_BREAK_NON_STARTER),

    /**
     * Opening Punctuation (OP)
     */
    OPEN_PUNCTUATION(GUnicodeBreakType.G_UNICODE_BREAK_OPEN_PUNCTUATION),

    /**
     * Closing Punctuation (CL)
     */
    CLOSE_PUNCTUATION(GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PUNCTUATION),

    /**
     * Ambiguous Quotation (QU)
     */
    QUOTATION(GUnicodeBreakType.G_UNICODE_BREAK_QUOTATION),

    /**
     * Exclamation/Interrogation (EX)
     */
    EXCLAMATION(GUnicodeBreakType.G_UNICODE_BREAK_EXCLAMATION),

    /**
     * Ideographic (ID)
     */
    IDEOGRAPHIC(GUnicodeBreakType.G_UNICODE_BREAK_IDEOGRAPHIC),

    /**
     * Numeric (NU)
     */
    NUMERIC(GUnicodeBreakType.G_UNICODE_BREAK_NUMERIC),

    /**
     * Infix Separator (Numeric) (IS)
     */
    INFIX_SEPARATOR(GUnicodeBreakType.G_UNICODE_BREAK_INFIX_SEPARATOR),

    /**
     * Symbols Allowing Break After (SY)
     */
    SYMBOL(GUnicodeBreakType.G_UNICODE_BREAK_SYMBOL),

    /**
     * Ordinary Alphabetic and Symbol Characters (AL)
     */
    ALPHABETIC(GUnicodeBreakType.G_UNICODE_BREAK_ALPHABETIC),

    /**
     * Prefix (Numeric) (PR)
     */
    PREFIX(GUnicodeBreakType.G_UNICODE_BREAK_PREFIX),

    /**
     * Postfix (Numeric) (PO)
     */
    POSTFIX(GUnicodeBreakType.G_UNICODE_BREAK_POSTFIX),

    /**
     * Complex Content Dependent (South East Asian) (SA)
     */
    COMPLEX_CONTEXT(GUnicodeBreakType.G_UNICODE_BREAK_COMPLEX_CONTEXT),

    /**
     * Ambiguous (Alphabetic or Ideographic) (AI)
     */
    AMBIGUOUS(GUnicodeBreakType.G_UNICODE_BREAK_AMBIGUOUS),

    /**
     * Unknown (XX)
     */
    UNKNOWN(GUnicodeBreakType.G_UNICODE_BREAK_UNKNOWN),

    /**
     * Next Line (NL)
     */
    NEXT_LINE(GUnicodeBreakType.G_UNICODE_BREAK_NEXT_LINE),

    /**
     * Word Joiner (WJ)
     */
    WORD_JOINER(GUnicodeBreakType.G_UNICODE_BREAK_WORD_JOINER),

    /**
     * Hangul L Jamo (JL)
     */
    HANGUL_L_JAMO(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_L_JAMO),

    /**
     * Hangul V Jamo (JV)
     */
    HANGUL_V_JAMO(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_V_JAMO),

    /**
     * Hangul T Jamo (JT)
     */
    HANGUL_T_JAMO(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_T_JAMO),

    /**
     * Hangul LV Syllable (H2)
     */
    HANGUL_LV_SYLLABLE(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LV_SYLLABLE),

    /**
     * Hangul LVT Syllable (H3)
     */
    HANGUL_LVT_SYLLABLE(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE),

    /**
     * Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead.
     */
    CLOSE_PARANTHESIS(GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARANTHESIS),

    /**
     * Closing Parenthesis (CP). Since 2.70
     */
    CLOSE_PARENTHESIS(GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARENTHESIS),

    /**
     * Conditional Japanese Starter (CJ). Since: 2.32
     */
    CONDITIONAL_JAPANESE_STARTER(GUnicodeBreakType.G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER),

    /**
     * Hebrew Letter (HL). Since: 2.32
     */
    HEBREW_LETTER(GUnicodeBreakType.G_UNICODE_BREAK_HEBREW_LETTER),

    /**
     * Regional Indicator (RI). Since: 2.36
     */
    REGIONAL_INDICATOR(GUnicodeBreakType.G_UNICODE_BREAK_REGIONAL_INDICATOR),

    /**
     * Emoji Base (EB). Since: 2.50
     */
    EMOJI_BASE(GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_BASE),

    /**
     * Emoji Modifier (EM). Since: 2.50
     */
    EMOJI_MODIFIER(GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_MODIFIER),

    /**
     * Zero Width Joiner (ZWJ). Since: 2.50
     */
    ZERO_WIDTH_JOINER(GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_JOINER),

    /**
     * Aksara (AK). Since: 2.80
     * @G_UNICODE_BREAK_AKSARA_PRE_BASE (AP). Since: 2.80
     * @G_UNICODE_BREAK_AKSARA_START (AS). Since: 2.80
     * @G_UNICODE_BREAK_VIRAMA_FINAL (VF). Since: 2.80
     * @G_UNICODE_BREAK_VIRAMA (VI). Since: 2.80
     */
    AKSARA(GUnicodeBreakType.G_UNICODE_BREAK_AKSARA),
    AKSARA_PRE_BASE(GUnicodeBreakType.G_UNICODE_BREAK_AKSARA_PRE_BASE),
    AKSARA_START(GUnicodeBreakType.G_UNICODE_BREAK_AKSARA_START),
    VIRAMA_FINAL(GUnicodeBreakType.G_UNICODE_BREAK_VIRAMA_FINAL),
    VIRAMA(GUnicodeBreakType.G_UNICODE_BREAK_VIRAMA),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnicodeBreakType): UnicodeBreakType = when (nativeValue) {
            GUnicodeBreakType.G_UNICODE_BREAK_MANDATORY -> MANDATORY
            GUnicodeBreakType.G_UNICODE_BREAK_CARRIAGE_RETURN -> CARRIAGE_RETURN
            GUnicodeBreakType.G_UNICODE_BREAK_LINE_FEED -> LINE_FEED
            GUnicodeBreakType.G_UNICODE_BREAK_COMBINING_MARK -> COMBINING_MARK
            GUnicodeBreakType.G_UNICODE_BREAK_SURROGATE -> SURROGATE
            GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_SPACE -> ZERO_WIDTH_SPACE
            GUnicodeBreakType.G_UNICODE_BREAK_INSEPARABLE -> INSEPARABLE
            GUnicodeBreakType.G_UNICODE_BREAK_NON_BREAKING_GLUE -> NON_BREAKING_GLUE
            GUnicodeBreakType.G_UNICODE_BREAK_CONTINGENT -> CONTINGENT
            GUnicodeBreakType.G_UNICODE_BREAK_SPACE -> SPACE
            GUnicodeBreakType.G_UNICODE_BREAK_AFTER -> AFTER
            GUnicodeBreakType.G_UNICODE_BREAK_BEFORE -> BEFORE
            GUnicodeBreakType.G_UNICODE_BREAK_BEFORE_AND_AFTER -> BEFORE_AND_AFTER
            GUnicodeBreakType.G_UNICODE_BREAK_HYPHEN -> HYPHEN
            GUnicodeBreakType.G_UNICODE_BREAK_NON_STARTER -> NON_STARTER
            GUnicodeBreakType.G_UNICODE_BREAK_OPEN_PUNCTUATION -> OPEN_PUNCTUATION
            GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PUNCTUATION -> CLOSE_PUNCTUATION
            GUnicodeBreakType.G_UNICODE_BREAK_QUOTATION -> QUOTATION
            GUnicodeBreakType.G_UNICODE_BREAK_EXCLAMATION -> EXCLAMATION
            GUnicodeBreakType.G_UNICODE_BREAK_IDEOGRAPHIC -> IDEOGRAPHIC
            GUnicodeBreakType.G_UNICODE_BREAK_NUMERIC -> NUMERIC
            GUnicodeBreakType.G_UNICODE_BREAK_INFIX_SEPARATOR -> INFIX_SEPARATOR
            GUnicodeBreakType.G_UNICODE_BREAK_SYMBOL -> SYMBOL
            GUnicodeBreakType.G_UNICODE_BREAK_ALPHABETIC -> ALPHABETIC
            GUnicodeBreakType.G_UNICODE_BREAK_PREFIX -> PREFIX
            GUnicodeBreakType.G_UNICODE_BREAK_POSTFIX -> POSTFIX
            GUnicodeBreakType.G_UNICODE_BREAK_COMPLEX_CONTEXT -> COMPLEX_CONTEXT
            GUnicodeBreakType.G_UNICODE_BREAK_AMBIGUOUS -> AMBIGUOUS
            GUnicodeBreakType.G_UNICODE_BREAK_UNKNOWN -> UNKNOWN
            GUnicodeBreakType.G_UNICODE_BREAK_NEXT_LINE -> NEXT_LINE
            GUnicodeBreakType.G_UNICODE_BREAK_WORD_JOINER -> WORD_JOINER
            GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_L_JAMO -> HANGUL_L_JAMO
            GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_V_JAMO -> HANGUL_V_JAMO
            GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_T_JAMO -> HANGUL_T_JAMO
            GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LV_SYLLABLE -> HANGUL_LV_SYLLABLE
            GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE -> HANGUL_LVT_SYLLABLE
            GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARANTHESIS -> CLOSE_PARANTHESIS
            GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARENTHESIS -> CLOSE_PARENTHESIS
            GUnicodeBreakType.G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER -> CONDITIONAL_JAPANESE_STARTER
            GUnicodeBreakType.G_UNICODE_BREAK_HEBREW_LETTER -> HEBREW_LETTER
            GUnicodeBreakType.G_UNICODE_BREAK_REGIONAL_INDICATOR -> REGIONAL_INDICATOR
            GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_BASE -> EMOJI_BASE
            GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_MODIFIER -> EMOJI_MODIFIER
            GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_JOINER -> ZERO_WIDTH_JOINER
            GUnicodeBreakType.G_UNICODE_BREAK_AKSARA -> AKSARA
            GUnicodeBreakType.G_UNICODE_BREAK_AKSARA_PRE_BASE -> AKSARA_PRE_BASE
            GUnicodeBreakType.G_UNICODE_BREAK_AKSARA_START -> AKSARA_START
            GUnicodeBreakType.G_UNICODE_BREAK_VIRAMA_FINAL -> VIRAMA_FINAL
            GUnicodeBreakType.G_UNICODE_BREAK_VIRAMA -> VIRAMA
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of UnicodeBreakType
         *
         * @return the GType
         */
        public fun getType(): GType = g_unicode_break_type_get_type()
    }
}
