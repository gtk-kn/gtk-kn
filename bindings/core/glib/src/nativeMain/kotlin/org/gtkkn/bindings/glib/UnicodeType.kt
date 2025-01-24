// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GUnicodeType
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_unicode_type_get_type

/**
 * These are the possible character classifications from the
 * Unicode specification.
 * See [Unicode Character Database](http://www.unicode.org/reports/tr44/#General_Category_Values).
 */
public enum class UnicodeType(public val nativeValue: GUnicodeType) {
    /**
     * General category "Other, Control" (Cc)
     */
    CONTROL(GUnicodeType.G_UNICODE_CONTROL),

    /**
     * General category "Other, Format" (Cf)
     */
    FORMAT(GUnicodeType.G_UNICODE_FORMAT),

    /**
     * General category "Other, Not Assigned" (Cn)
     */
    UNASSIGNED(GUnicodeType.G_UNICODE_UNASSIGNED),

    /**
     * General category "Other, Private Use" (Co)
     */
    PRIVATE_USE(GUnicodeType.G_UNICODE_PRIVATE_USE),

    /**
     * General category "Other, Surrogate" (Cs)
     */
    SURROGATE(GUnicodeType.G_UNICODE_SURROGATE),

    /**
     * General category "Letter, Lowercase" (Ll)
     */
    LOWERCASE_LETTER(GUnicodeType.G_UNICODE_LOWERCASE_LETTER),

    /**
     * General category "Letter, Modifier" (Lm)
     */
    MODIFIER_LETTER(GUnicodeType.G_UNICODE_MODIFIER_LETTER),

    /**
     * General category "Letter, Other" (Lo)
     */
    OTHER_LETTER(GUnicodeType.G_UNICODE_OTHER_LETTER),

    /**
     * General category "Letter, Titlecase" (Lt)
     */
    TITLECASE_LETTER(GUnicodeType.G_UNICODE_TITLECASE_LETTER),

    /**
     * General category "Letter, Uppercase" (Lu)
     */
    UPPERCASE_LETTER(GUnicodeType.G_UNICODE_UPPERCASE_LETTER),

    /**
     * General category "Mark, Spacing" (Mc)
     */
    SPACING_MARK(GUnicodeType.G_UNICODE_SPACING_MARK),

    /**
     * General category "Mark, Enclosing" (Me)
     */
    ENCLOSING_MARK(GUnicodeType.G_UNICODE_ENCLOSING_MARK),

    /**
     * General category "Mark, Nonspacing" (Mn)
     */
    NON_SPACING_MARK(GUnicodeType.G_UNICODE_NON_SPACING_MARK),

    /**
     * General category "Number, Decimal Digit" (Nd)
     */
    DECIMAL_NUMBER(GUnicodeType.G_UNICODE_DECIMAL_NUMBER),

    /**
     * General category "Number, Letter" (Nl)
     */
    LETTER_NUMBER(GUnicodeType.G_UNICODE_LETTER_NUMBER),

    /**
     * General category "Number, Other" (No)
     */
    OTHER_NUMBER(GUnicodeType.G_UNICODE_OTHER_NUMBER),

    /**
     * General category "Punctuation, Connector" (Pc)
     */
    CONNECT_PUNCTUATION(GUnicodeType.G_UNICODE_CONNECT_PUNCTUATION),

    /**
     * General category "Punctuation, Dash" (Pd)
     */
    DASH_PUNCTUATION(GUnicodeType.G_UNICODE_DASH_PUNCTUATION),

    /**
     * General category "Punctuation, Close" (Pe)
     */
    CLOSE_PUNCTUATION(GUnicodeType.G_UNICODE_CLOSE_PUNCTUATION),

    /**
     * General category "Punctuation, Final quote" (Pf)
     */
    FINAL_PUNCTUATION(GUnicodeType.G_UNICODE_FINAL_PUNCTUATION),

    /**
     * General category "Punctuation, Initial quote" (Pi)
     */
    INITIAL_PUNCTUATION(GUnicodeType.G_UNICODE_INITIAL_PUNCTUATION),

    /**
     * General category "Punctuation, Other" (Po)
     */
    OTHER_PUNCTUATION(GUnicodeType.G_UNICODE_OTHER_PUNCTUATION),

    /**
     * General category "Punctuation, Open" (Ps)
     */
    OPEN_PUNCTUATION(GUnicodeType.G_UNICODE_OPEN_PUNCTUATION),

    /**
     * General category "Symbol, Currency" (Sc)
     */
    CURRENCY_SYMBOL(GUnicodeType.G_UNICODE_CURRENCY_SYMBOL),

    /**
     * General category "Symbol, Modifier" (Sk)
     */
    MODIFIER_SYMBOL(GUnicodeType.G_UNICODE_MODIFIER_SYMBOL),

    /**
     * General category "Symbol, Math" (Sm)
     */
    MATH_SYMBOL(GUnicodeType.G_UNICODE_MATH_SYMBOL),

    /**
     * General category "Symbol, Other" (So)
     */
    OTHER_SYMBOL(GUnicodeType.G_UNICODE_OTHER_SYMBOL),

    /**
     * General category "Separator, Line" (Zl)
     */
    LINE_SEPARATOR(GUnicodeType.G_UNICODE_LINE_SEPARATOR),

    /**
     * General category "Separator, Paragraph" (Zp)
     */
    PARAGRAPH_SEPARATOR(GUnicodeType.G_UNICODE_PARAGRAPH_SEPARATOR),

    /**
     * General category "Separator, Space" (Zs)
     */
    SPACE_SEPARATOR(GUnicodeType.G_UNICODE_SPACE_SEPARATOR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnicodeType): UnicodeType = when (nativeValue) {
            GUnicodeType.G_UNICODE_CONTROL -> CONTROL
            GUnicodeType.G_UNICODE_FORMAT -> FORMAT
            GUnicodeType.G_UNICODE_UNASSIGNED -> UNASSIGNED
            GUnicodeType.G_UNICODE_PRIVATE_USE -> PRIVATE_USE
            GUnicodeType.G_UNICODE_SURROGATE -> SURROGATE
            GUnicodeType.G_UNICODE_LOWERCASE_LETTER -> LOWERCASE_LETTER
            GUnicodeType.G_UNICODE_MODIFIER_LETTER -> MODIFIER_LETTER
            GUnicodeType.G_UNICODE_OTHER_LETTER -> OTHER_LETTER
            GUnicodeType.G_UNICODE_TITLECASE_LETTER -> TITLECASE_LETTER
            GUnicodeType.G_UNICODE_UPPERCASE_LETTER -> UPPERCASE_LETTER
            GUnicodeType.G_UNICODE_SPACING_MARK -> SPACING_MARK
            GUnicodeType.G_UNICODE_ENCLOSING_MARK -> ENCLOSING_MARK
            GUnicodeType.G_UNICODE_NON_SPACING_MARK -> NON_SPACING_MARK
            GUnicodeType.G_UNICODE_DECIMAL_NUMBER -> DECIMAL_NUMBER
            GUnicodeType.G_UNICODE_LETTER_NUMBER -> LETTER_NUMBER
            GUnicodeType.G_UNICODE_OTHER_NUMBER -> OTHER_NUMBER
            GUnicodeType.G_UNICODE_CONNECT_PUNCTUATION -> CONNECT_PUNCTUATION
            GUnicodeType.G_UNICODE_DASH_PUNCTUATION -> DASH_PUNCTUATION
            GUnicodeType.G_UNICODE_CLOSE_PUNCTUATION -> CLOSE_PUNCTUATION
            GUnicodeType.G_UNICODE_FINAL_PUNCTUATION -> FINAL_PUNCTUATION
            GUnicodeType.G_UNICODE_INITIAL_PUNCTUATION -> INITIAL_PUNCTUATION
            GUnicodeType.G_UNICODE_OTHER_PUNCTUATION -> OTHER_PUNCTUATION
            GUnicodeType.G_UNICODE_OPEN_PUNCTUATION -> OPEN_PUNCTUATION
            GUnicodeType.G_UNICODE_CURRENCY_SYMBOL -> CURRENCY_SYMBOL
            GUnicodeType.G_UNICODE_MODIFIER_SYMBOL -> MODIFIER_SYMBOL
            GUnicodeType.G_UNICODE_MATH_SYMBOL -> MATH_SYMBOL
            GUnicodeType.G_UNICODE_OTHER_SYMBOL -> OTHER_SYMBOL
            GUnicodeType.G_UNICODE_LINE_SEPARATOR -> LINE_SEPARATOR
            GUnicodeType.G_UNICODE_PARAGRAPH_SEPARATOR -> PARAGRAPH_SEPARATOR
            GUnicodeType.G_UNICODE_SPACE_SEPARATOR -> SPACE_SEPARATOR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of UnicodeType
         *
         * @return the GType
         */
        public fun getType(): GType = g_unicode_type_get_type()
    }
}
