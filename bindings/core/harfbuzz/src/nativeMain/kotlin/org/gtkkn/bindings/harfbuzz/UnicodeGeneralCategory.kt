// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONTROL
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FORMAT
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SURROGATE
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED
import org.gtkkn.native.harfbuzz.hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER

/**
 * Data type for the "General_Category" (gc) property from
 * the Unicode Character Database.
 */
public enum class UnicodeGeneralCategory(
    public val nativeValue: hb_unicode_general_category_t,
) {
    /**
     * [Cc]
     */
    CONTROL(HB_UNICODE_GENERAL_CATEGORY_CONTROL),

    /**
     * [Cf]
     */
    FORMAT(HB_UNICODE_GENERAL_CATEGORY_FORMAT),

    /**
     * [Cn]
     */
    UNASSIGNED(HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED),

    /**
     * [Co]
     */
    PRIVATE_USE(HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE),

    /**
     * [Cs]
     */
    SURROGATE(HB_UNICODE_GENERAL_CATEGORY_SURROGATE),

    /**
     * [Ll]
     */
    LOWERCASE_LETTER(HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER),

    /**
     * [Lm]
     */
    MODIFIER_LETTER(HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER),

    /**
     * [Lo]
     */
    OTHER_LETTER(HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER),

    /**
     * [Lt]
     */
    TITLECASE_LETTER(HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER),

    /**
     * [Lu]
     */
    UPPERCASE_LETTER(HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER),

    /**
     * [Mc]
     */
    SPACING_MARK(HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK),

    /**
     * [Me]
     */
    ENCLOSING_MARK(HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK),

    /**
     * [Mn]
     */
    NON_SPACING_MARK(HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK),

    /**
     * [Nd]
     */
    DECIMAL_NUMBER(HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER),

    /**
     * [Nl]
     */
    LETTER_NUMBER(HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER),

    /**
     * [No]
     */
    OTHER_NUMBER(HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER),

    /**
     * [Pc]
     */
    CONNECT_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION),

    /**
     * [Pd]
     */
    DASH_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION),

    /**
     * [Pe]
     */
    CLOSE_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION),

    /**
     * [Pf]
     */
    FINAL_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION),

    /**
     * [Pi]
     */
    INITIAL_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION),

    /**
     * [Po]
     */
    OTHER_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION),

    /**
     * [Ps]
     */
    OPEN_PUNCTUATION(HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION),

    /**
     * [Sc]
     */
    CURRENCY_SYMBOL(HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL),

    /**
     * [Sk]
     */
    MODIFIER_SYMBOL(HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL),

    /**
     * [Sm]
     */
    MATH_SYMBOL(HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL),

    /**
     * [So]
     */
    OTHER_SYMBOL(HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL),

    /**
     * [Zl]
     */
    LINE_SEPARATOR(HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR),

    /**
     * [Zp]
     */
    PARAGRAPH_SEPARATOR(HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR),

    /**
     * [Zs]
     */
    SPACE_SEPARATOR(HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_unicode_general_category_t): UnicodeGeneralCategory =
            when (nativeValue) {
                HB_UNICODE_GENERAL_CATEGORY_CONTROL -> CONTROL
                HB_UNICODE_GENERAL_CATEGORY_FORMAT -> FORMAT
                HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED -> UNASSIGNED
                HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE -> PRIVATE_USE
                HB_UNICODE_GENERAL_CATEGORY_SURROGATE -> SURROGATE
                HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER -> LOWERCASE_LETTER
                HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER -> MODIFIER_LETTER
                HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER -> OTHER_LETTER
                HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER -> TITLECASE_LETTER
                HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER -> UPPERCASE_LETTER
                HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK -> SPACING_MARK
                HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK -> ENCLOSING_MARK
                HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK -> NON_SPACING_MARK
                HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER -> DECIMAL_NUMBER
                HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER -> LETTER_NUMBER
                HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER -> OTHER_NUMBER
                HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION -> CONNECT_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION -> DASH_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION -> CLOSE_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION -> FINAL_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION -> INITIAL_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION -> OTHER_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION -> OPEN_PUNCTUATION
                HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL -> CURRENCY_SYMBOL
                HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL -> MODIFIER_SYMBOL
                HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL -> MATH_SYMBOL
                HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL -> OTHER_SYMBOL
                HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR -> LINE_SEPARATOR
                HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR -> PARAGRAPH_SEPARATOR
                HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR -> SPACE_SEPARATOR
                else -> error("invalid nativeValue")
            }
    }
}
