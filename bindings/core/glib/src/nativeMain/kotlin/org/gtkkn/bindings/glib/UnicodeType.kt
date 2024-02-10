// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GUnicodeType
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_CLOSE_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_CONNECT_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_CONTROL
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_CURRENCY_SYMBOL
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_DASH_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_DECIMAL_NUMBER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_ENCLOSING_MARK
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_FINAL_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_FORMAT
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_INITIAL_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_LETTER_NUMBER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_LINE_SEPARATOR
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_LOWERCASE_LETTER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_MATH_SYMBOL
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_MODIFIER_LETTER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_MODIFIER_SYMBOL
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_NON_SPACING_MARK
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_OPEN_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_OTHER_LETTER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_OTHER_NUMBER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_OTHER_PUNCTUATION
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_OTHER_SYMBOL
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_PARAGRAPH_SEPARATOR
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_PRIVATE_USE
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_SPACE_SEPARATOR
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_SPACING_MARK
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_SURROGATE
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_TITLECASE_LETTER
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_UNASSIGNED
import org.gtkkn.native.glib.GUnicodeType.G_UNICODE_UPPERCASE_LETTER

/**
 * These are the possible character classifications from the
 * Unicode specification.
 * See [Unicode Character Database](http://www.unicode.org/reports/tr44/#General_Category_Values).
 */
public enum class UnicodeType(
    public val nativeValue: GUnicodeType,
) {
    /**
     * General category "Other, Control" (Cc)
     */
    CONTROL(G_UNICODE_CONTROL),

    /**
     * General category "Other, Format" (Cf)
     */
    FORMAT(G_UNICODE_FORMAT),

    /**
     * General category "Other, Not Assigned" (Cn)
     */
    UNASSIGNED(G_UNICODE_UNASSIGNED),

    /**
     * General category "Other, Private Use" (Co)
     */
    PRIVATE_USE(G_UNICODE_PRIVATE_USE),

    /**
     * General category "Other, Surrogate" (Cs)
     */
    SURROGATE(G_UNICODE_SURROGATE),

    /**
     * General category "Letter, Lowercase" (Ll)
     */
    LOWERCASE_LETTER(G_UNICODE_LOWERCASE_LETTER),

    /**
     * General category "Letter, Modifier" (Lm)
     */
    MODIFIER_LETTER(G_UNICODE_MODIFIER_LETTER),

    /**
     * General category "Letter, Other" (Lo)
     */
    OTHER_LETTER(G_UNICODE_OTHER_LETTER),

    /**
     * General category "Letter, Titlecase" (Lt)
     */
    TITLECASE_LETTER(G_UNICODE_TITLECASE_LETTER),

    /**
     * General category "Letter, Uppercase" (Lu)
     */
    UPPERCASE_LETTER(G_UNICODE_UPPERCASE_LETTER),

    /**
     * General category "Mark, Spacing" (Mc)
     */
    SPACING_MARK(G_UNICODE_SPACING_MARK),

    /**
     * General category "Mark, Enclosing" (Me)
     */
    ENCLOSING_MARK(G_UNICODE_ENCLOSING_MARK),

    /**
     * General category "Mark, Nonspacing" (Mn)
     */
    NON_SPACING_MARK(G_UNICODE_NON_SPACING_MARK),

    /**
     * General category "Number, Decimal Digit" (Nd)
     */
    DECIMAL_NUMBER(G_UNICODE_DECIMAL_NUMBER),

    /**
     * General category "Number, Letter" (Nl)
     */
    LETTER_NUMBER(G_UNICODE_LETTER_NUMBER),

    /**
     * General category "Number, Other" (No)
     */
    OTHER_NUMBER(G_UNICODE_OTHER_NUMBER),

    /**
     * General category "Punctuation, Connector" (Pc)
     */
    CONNECT_PUNCTUATION(G_UNICODE_CONNECT_PUNCTUATION),

    /**
     * General category "Punctuation, Dash" (Pd)
     */
    DASH_PUNCTUATION(G_UNICODE_DASH_PUNCTUATION),

    /**
     * General category "Punctuation, Close" (Pe)
     */
    CLOSE_PUNCTUATION(G_UNICODE_CLOSE_PUNCTUATION),

    /**
     * General category "Punctuation, Final quote" (Pf)
     */
    FINAL_PUNCTUATION(G_UNICODE_FINAL_PUNCTUATION),

    /**
     * General category "Punctuation, Initial quote" (Pi)
     */
    INITIAL_PUNCTUATION(G_UNICODE_INITIAL_PUNCTUATION),

    /**
     * General category "Punctuation, Other" (Po)
     */
    OTHER_PUNCTUATION(G_UNICODE_OTHER_PUNCTUATION),

    /**
     * General category "Punctuation, Open" (Ps)
     */
    OPEN_PUNCTUATION(G_UNICODE_OPEN_PUNCTUATION),

    /**
     * General category "Symbol, Currency" (Sc)
     */
    CURRENCY_SYMBOL(G_UNICODE_CURRENCY_SYMBOL),

    /**
     * General category "Symbol, Modifier" (Sk)
     */
    MODIFIER_SYMBOL(G_UNICODE_MODIFIER_SYMBOL),

    /**
     * General category "Symbol, Math" (Sm)
     */
    MATH_SYMBOL(G_UNICODE_MATH_SYMBOL),

    /**
     * General category "Symbol, Other" (So)
     */
    OTHER_SYMBOL(G_UNICODE_OTHER_SYMBOL),

    /**
     * General category "Separator, Line" (Zl)
     */
    LINE_SEPARATOR(G_UNICODE_LINE_SEPARATOR),

    /**
     * General category "Separator, Paragraph" (Zp)
     */
    PARAGRAPH_SEPARATOR(G_UNICODE_PARAGRAPH_SEPARATOR),

    /**
     * General category "Separator, Space" (Zs)
     */
    SPACE_SEPARATOR(G_UNICODE_SPACE_SEPARATOR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnicodeType): UnicodeType =
            when (nativeValue) {
                G_UNICODE_CONTROL -> CONTROL
                G_UNICODE_FORMAT -> FORMAT
                G_UNICODE_UNASSIGNED -> UNASSIGNED
                G_UNICODE_PRIVATE_USE -> PRIVATE_USE
                G_UNICODE_SURROGATE -> SURROGATE
                G_UNICODE_LOWERCASE_LETTER -> LOWERCASE_LETTER
                G_UNICODE_MODIFIER_LETTER -> MODIFIER_LETTER
                G_UNICODE_OTHER_LETTER -> OTHER_LETTER
                G_UNICODE_TITLECASE_LETTER -> TITLECASE_LETTER
                G_UNICODE_UPPERCASE_LETTER -> UPPERCASE_LETTER
                G_UNICODE_SPACING_MARK -> SPACING_MARK
                G_UNICODE_ENCLOSING_MARK -> ENCLOSING_MARK
                G_UNICODE_NON_SPACING_MARK -> NON_SPACING_MARK
                G_UNICODE_DECIMAL_NUMBER -> DECIMAL_NUMBER
                G_UNICODE_LETTER_NUMBER -> LETTER_NUMBER
                G_UNICODE_OTHER_NUMBER -> OTHER_NUMBER
                G_UNICODE_CONNECT_PUNCTUATION -> CONNECT_PUNCTUATION
                G_UNICODE_DASH_PUNCTUATION -> DASH_PUNCTUATION
                G_UNICODE_CLOSE_PUNCTUATION -> CLOSE_PUNCTUATION
                G_UNICODE_FINAL_PUNCTUATION -> FINAL_PUNCTUATION
                G_UNICODE_INITIAL_PUNCTUATION -> INITIAL_PUNCTUATION
                G_UNICODE_OTHER_PUNCTUATION -> OTHER_PUNCTUATION
                G_UNICODE_OPEN_PUNCTUATION -> OPEN_PUNCTUATION
                G_UNICODE_CURRENCY_SYMBOL -> CURRENCY_SYMBOL
                G_UNICODE_MODIFIER_SYMBOL -> MODIFIER_SYMBOL
                G_UNICODE_MATH_SYMBOL -> MATH_SYMBOL
                G_UNICODE_OTHER_SYMBOL -> OTHER_SYMBOL
                G_UNICODE_LINE_SEPARATOR -> LINE_SEPARATOR
                G_UNICODE_PARAGRAPH_SEPARATOR -> PARAGRAPH_SEPARATOR
                G_UNICODE_SPACE_SEPARATOR -> SPACE_SEPARATOR
                else -> error("invalid nativeValue")
            }
    }
}
