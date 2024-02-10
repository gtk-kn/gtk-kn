// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.reinterpret
import org.gtkkn.native.pango.PangoScript
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_AHOM
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_ARABIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_ARMENIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BALINESE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BASSA_VAH
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BATAK
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BENGALI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BOPOMOFO
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BRAHMI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BRAILLE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BUGINESE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_BUHID
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CANADIAN_ABORIGINAL
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CARIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CAUCASIAN_ALBANIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CHAKMA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CHAM
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CHEROKEE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_COMMON
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_COPTIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CUNEIFORM
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CYPRIOT
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_CYRILLIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_DESERET
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_DEVANAGARI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_DUPLOYAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_ELBASAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_ETHIOPIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GEORGIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GLAGOLITIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GOTHIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GRANTHA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GREEK
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GUJARATI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_GURMUKHI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_HAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_HANGUL
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_HANUNOO
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_HATRAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_HEBREW
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_HIRAGANA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_INHERITED
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_INVALID_CODE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KANNADA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KATAKANA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KAYAH_LI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KHAROSHTHI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KHMER
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KHOJKI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_KHUDAWADI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LAO
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LATIN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LEPCHA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LIMBU
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LINEAR_A
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LINEAR_B
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LYCIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_LYDIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MAHAJANI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MALAYALAM
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MANDAIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MANICHAEAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MENDE_KIKAKUI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MEROITIC_CURSIVE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MEROITIC_HIEROGLYPHS
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MIAO
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MODI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MONGOLIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MRO
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MULTANI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_MYANMAR
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_NABATAEAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_NEW_TAI_LUE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_NKO
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OGHAM
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OLD_HUNGARIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OLD_ITALIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OLD_NORTH_ARABIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OLD_PERMIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OLD_PERSIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OL_CHIKI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_ORIYA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_OSMANYA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_PAHAWH_HMONG
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_PALMYRENE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_PAU_CIN_HAU
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_PHAGS_PA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_PHOENICIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_PSALTER_PAHLAVI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_REJANG
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_RUNIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SAURASHTRA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SHARADA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SHAVIAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SIDDHAM
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SIGNWRITING
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SINHALA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SORA_SOMPENG
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SUNDANESE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SYLOTI_NAGRI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_SYRIAC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TAGALOG
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TAGBANWA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TAI_LE
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TAKRI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TAMIL
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TELUGU
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_THAANA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_THAI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TIBETAN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TIFINAGH
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_TIRHUTA
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_UGARITIC
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_UNKNOWN
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_VAI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_WARANG_CITI
import org.gtkkn.native.pango.PangoScript.PANGO_SCRIPT_YI
import org.gtkkn.native.pango.pango_script_for_unichar
import org.gtkkn.native.pango.pango_script_get_sample_language
import kotlin.UInt

/**
 * The `PangoScript` enumeration identifies different writing
 * systems.
 *
 * The values correspond to the names as defined in the Unicode standard. See
 * [Unicode Standard Annex 24: Script names](http://www.unicode.org/reports/tr24/)
 *
 * Note that this enumeration is deprecated and will not be updated to include values
 * in newer versions of the Unicode standard. Applications should use the
 * [enum@GLib.UnicodeScript] enumeration instead,
 * whose values are interchangeable with `PangoScript`.
 */
public enum class Script(
    public val nativeValue: PangoScript,
) {
    /**
     * a value never returned from pango_script_for_unichar()
     */
    INVALID_CODE(PANGO_SCRIPT_INVALID_CODE),

    /**
     * a character used by multiple different scripts
     */
    COMMON(PANGO_SCRIPT_COMMON),

    /**
     * a mark glyph that takes its script from the
     * base glyph to which it is attached
     */
    INHERITED(PANGO_SCRIPT_INHERITED),

    /**
     * Arabic
     */
    ARABIC(PANGO_SCRIPT_ARABIC),

    /**
     * Armenian
     */
    ARMENIAN(PANGO_SCRIPT_ARMENIAN),

    /**
     * Bengali
     */
    BENGALI(PANGO_SCRIPT_BENGALI),

    /**
     * Bopomofo
     */
    BOPOMOFO(PANGO_SCRIPT_BOPOMOFO),

    /**
     * Cherokee
     */
    CHEROKEE(PANGO_SCRIPT_CHEROKEE),

    /**
     * Coptic
     */
    COPTIC(PANGO_SCRIPT_COPTIC),

    /**
     * Cyrillic
     */
    CYRILLIC(PANGO_SCRIPT_CYRILLIC),

    /**
     * Deseret
     */
    DESERET(PANGO_SCRIPT_DESERET),

    /**
     * Devanagari
     */
    DEVANAGARI(PANGO_SCRIPT_DEVANAGARI),

    /**
     * Ethiopic
     */
    ETHIOPIC(PANGO_SCRIPT_ETHIOPIC),

    /**
     * Georgian
     */
    GEORGIAN(PANGO_SCRIPT_GEORGIAN),

    /**
     * Gothic
     */
    GOTHIC(PANGO_SCRIPT_GOTHIC),

    /**
     * Greek
     */
    GREEK(PANGO_SCRIPT_GREEK),

    /**
     * Gujarati
     */
    GUJARATI(PANGO_SCRIPT_GUJARATI),

    /**
     * Gurmukhi
     */
    GURMUKHI(PANGO_SCRIPT_GURMUKHI),

    /**
     * Han
     */
    HAN(PANGO_SCRIPT_HAN),

    /**
     * Hangul
     */
    HANGUL(PANGO_SCRIPT_HANGUL),

    /**
     * Hebrew
     */
    HEBREW(PANGO_SCRIPT_HEBREW),

    /**
     * Hiragana
     */
    HIRAGANA(PANGO_SCRIPT_HIRAGANA),

    /**
     * Kannada
     */
    KANNADA(PANGO_SCRIPT_KANNADA),

    /**
     * Katakana
     */
    KATAKANA(PANGO_SCRIPT_KATAKANA),

    /**
     * Khmer
     */
    KHMER(PANGO_SCRIPT_KHMER),

    /**
     * Lao
     */
    LAO(PANGO_SCRIPT_LAO),

    /**
     * Latin
     */
    LATIN(PANGO_SCRIPT_LATIN),

    /**
     * Malayalam
     */
    MALAYALAM(PANGO_SCRIPT_MALAYALAM),

    /**
     * Mongolian
     */
    MONGOLIAN(PANGO_SCRIPT_MONGOLIAN),

    /**
     * Myanmar
     */
    MYANMAR(PANGO_SCRIPT_MYANMAR),

    /**
     * Ogham
     */
    OGHAM(PANGO_SCRIPT_OGHAM),

    /**
     * Old Italic
     */
    OLD_ITALIC(PANGO_SCRIPT_OLD_ITALIC),

    /**
     * Oriya
     */
    ORIYA(PANGO_SCRIPT_ORIYA),

    /**
     * Runic
     */
    RUNIC(PANGO_SCRIPT_RUNIC),

    /**
     * Sinhala
     */
    SINHALA(PANGO_SCRIPT_SINHALA),

    /**
     * Syriac
     */
    SYRIAC(PANGO_SCRIPT_SYRIAC),

    /**
     * Tamil
     */
    TAMIL(PANGO_SCRIPT_TAMIL),

    /**
     * Telugu
     */
    TELUGU(PANGO_SCRIPT_TELUGU),

    /**
     * Thaana
     */
    THAANA(PANGO_SCRIPT_THAANA),

    /**
     * Thai
     */
    THAI(PANGO_SCRIPT_THAI),

    /**
     * Tibetan
     */
    TIBETAN(PANGO_SCRIPT_TIBETAN),

    /**
     * Canadian Aboriginal
     */
    CANADIAN_ABORIGINAL(PANGO_SCRIPT_CANADIAN_ABORIGINAL),

    /**
     * Yi
     */
    YI(PANGO_SCRIPT_YI),

    /**
     * Tagalog
     */
    TAGALOG(PANGO_SCRIPT_TAGALOG),

    /**
     * Hanunoo
     */
    HANUNOO(PANGO_SCRIPT_HANUNOO),

    /**
     * Buhid
     */
    BUHID(PANGO_SCRIPT_BUHID),

    /**
     * Tagbanwa
     */
    TAGBANWA(PANGO_SCRIPT_TAGBANWA),

    /**
     * Braille
     */
    BRAILLE(PANGO_SCRIPT_BRAILLE),

    /**
     * Cypriot
     */
    CYPRIOT(PANGO_SCRIPT_CYPRIOT),

    /**
     * Limbu
     */
    LIMBU(PANGO_SCRIPT_LIMBU),

    /**
     * Osmanya
     */
    OSMANYA(PANGO_SCRIPT_OSMANYA),

    /**
     * Shavian
     */
    SHAVIAN(PANGO_SCRIPT_SHAVIAN),

    /**
     * Linear B
     */
    LINEAR_B(PANGO_SCRIPT_LINEAR_B),

    /**
     * Tai Le
     */
    TAI_LE(PANGO_SCRIPT_TAI_LE),

    /**
     * Ugaritic
     */
    UGARITIC(PANGO_SCRIPT_UGARITIC),

    /**
     * New Tai Lue. Since 1.10
     */
    NEW_TAI_LUE(PANGO_SCRIPT_NEW_TAI_LUE),

    /**
     * Buginese. Since 1.10
     */
    BUGINESE(PANGO_SCRIPT_BUGINESE),

    /**
     * Glagolitic. Since 1.10
     */
    GLAGOLITIC(PANGO_SCRIPT_GLAGOLITIC),

    /**
     * Tifinagh. Since 1.10
     */
    TIFINAGH(PANGO_SCRIPT_TIFINAGH),

    /**
     * Syloti Nagri. Since 1.10
     */
    SYLOTI_NAGRI(PANGO_SCRIPT_SYLOTI_NAGRI),

    /**
     * Old Persian. Since 1.10
     */
    OLD_PERSIAN(PANGO_SCRIPT_OLD_PERSIAN),

    /**
     * Kharoshthi. Since 1.10
     */
    KHAROSHTHI(PANGO_SCRIPT_KHAROSHTHI),

    /**
     * an unassigned code point. Since 1.14
     */
    UNKNOWN(PANGO_SCRIPT_UNKNOWN),

    /**
     * Balinese. Since 1.14
     */
    BALINESE(PANGO_SCRIPT_BALINESE),

    /**
     * Cuneiform. Since 1.14
     */
    CUNEIFORM(PANGO_SCRIPT_CUNEIFORM),

    /**
     * Phoenician. Since 1.14
     */
    PHOENICIAN(PANGO_SCRIPT_PHOENICIAN),

    /**
     * Phags-pa. Since 1.14
     */
    PHAGS_PA(PANGO_SCRIPT_PHAGS_PA),

    /**
     * N'Ko. Since 1.14
     */
    NKO(PANGO_SCRIPT_NKO),

    /**
     * Kayah Li. Since 1.20.1
     */
    KAYAH_LI(PANGO_SCRIPT_KAYAH_LI),

    /**
     * Lepcha. Since 1.20.1
     */
    LEPCHA(PANGO_SCRIPT_LEPCHA),

    /**
     * Rejang. Since 1.20.1
     */
    REJANG(PANGO_SCRIPT_REJANG),

    /**
     * Sundanese. Since 1.20.1
     */
    SUNDANESE(PANGO_SCRIPT_SUNDANESE),

    /**
     * Saurashtra. Since 1.20.1
     */
    SAURASHTRA(PANGO_SCRIPT_SAURASHTRA),

    /**
     * Cham. Since 1.20.1
     */
    CHAM(PANGO_SCRIPT_CHAM),

    /**
     * Ol Chiki. Since 1.20.1
     */
    OL_CHIKI(PANGO_SCRIPT_OL_CHIKI),

    /**
     * Vai. Since 1.20.1
     */
    VAI(PANGO_SCRIPT_VAI),

    /**
     * Carian. Since 1.20.1
     */
    CARIAN(PANGO_SCRIPT_CARIAN),

    /**
     * Lycian. Since 1.20.1
     */
    LYCIAN(PANGO_SCRIPT_LYCIAN),

    /**
     * Lydian. Since 1.20.1
     */
    LYDIAN(PANGO_SCRIPT_LYDIAN),

    /**
     * Batak. Since 1.32
     */
    BATAK(PANGO_SCRIPT_BATAK),

    /**
     * Brahmi. Since 1.32
     */
    BRAHMI(PANGO_SCRIPT_BRAHMI),

    /**
     * Mandaic. Since 1.32
     */
    MANDAIC(PANGO_SCRIPT_MANDAIC),

    /**
     * Chakma. Since: 1.32
     */
    CHAKMA(PANGO_SCRIPT_CHAKMA),

    /**
     * Meroitic Cursive. Since: 1.32
     */
    MEROITIC_CURSIVE(PANGO_SCRIPT_MEROITIC_CURSIVE),

    /**
     * Meroitic Hieroglyphs. Since: 1.32
     */
    MEROITIC_HIEROGLYPHS(PANGO_SCRIPT_MEROITIC_HIEROGLYPHS),

    /**
     * Miao. Since: 1.32
     */
    MIAO(PANGO_SCRIPT_MIAO),

    /**
     * Sharada. Since: 1.32
     */
    SHARADA(PANGO_SCRIPT_SHARADA),

    /**
     * Sora Sompeng. Since: 1.32
     */
    SORA_SOMPENG(PANGO_SCRIPT_SORA_SOMPENG),

    /**
     * Takri. Since: 1.32
     */
    TAKRI(PANGO_SCRIPT_TAKRI),

    /**
     * Bassa. Since: 1.40
     */
    BASSA_VAH(PANGO_SCRIPT_BASSA_VAH),

    /**
     * Caucasian Albanian. Since: 1.40
     */
    CAUCASIAN_ALBANIAN(PANGO_SCRIPT_CAUCASIAN_ALBANIAN),

    /**
     * Duployan. Since: 1.40
     */
    DUPLOYAN(PANGO_SCRIPT_DUPLOYAN),

    /**
     * Elbasan. Since: 1.40
     */
    ELBASAN(PANGO_SCRIPT_ELBASAN),

    /**
     * Grantha. Since: 1.40
     */
    GRANTHA(PANGO_SCRIPT_GRANTHA),

    /**
     * Kjohki. Since: 1.40
     */
    KHOJKI(PANGO_SCRIPT_KHOJKI),

    /**
     * Khudawadi, Sindhi. Since: 1.40
     */
    KHUDAWADI(PANGO_SCRIPT_KHUDAWADI),

    /**
     * Linear A. Since: 1.40
     */
    LINEAR_A(PANGO_SCRIPT_LINEAR_A),

    /**
     * Mahajani. Since: 1.40
     */
    MAHAJANI(PANGO_SCRIPT_MAHAJANI),

    /**
     * Manichaean. Since: 1.40
     */
    MANICHAEAN(PANGO_SCRIPT_MANICHAEAN),

    /**
     * Mende Kikakui. Since: 1.40
     */
    MENDE_KIKAKUI(PANGO_SCRIPT_MENDE_KIKAKUI),

    /**
     * Modi. Since: 1.40
     */
    MODI(PANGO_SCRIPT_MODI),

    /**
     * Mro. Since: 1.40
     */
    MRO(PANGO_SCRIPT_MRO),

    /**
     * Nabataean. Since: 1.40
     */
    NABATAEAN(PANGO_SCRIPT_NABATAEAN),

    /**
     * Old North Arabian. Since: 1.40
     */
    OLD_NORTH_ARABIAN(PANGO_SCRIPT_OLD_NORTH_ARABIAN),

    /**
     * Old Permic. Since: 1.40
     */
    OLD_PERMIC(PANGO_SCRIPT_OLD_PERMIC),

    /**
     * Pahawh Hmong. Since: 1.40
     */
    PAHAWH_HMONG(PANGO_SCRIPT_PAHAWH_HMONG),

    /**
     * Palmyrene. Since: 1.40
     */
    PALMYRENE(PANGO_SCRIPT_PALMYRENE),

    /**
     * Pau Cin Hau. Since: 1.40
     */
    PAU_CIN_HAU(PANGO_SCRIPT_PAU_CIN_HAU),

    /**
     * Psalter Pahlavi. Since: 1.40
     */
    PSALTER_PAHLAVI(PANGO_SCRIPT_PSALTER_PAHLAVI),

    /**
     * Siddham. Since: 1.40
     */
    SIDDHAM(PANGO_SCRIPT_SIDDHAM),

    /**
     * Tirhuta. Since: 1.40
     */
    TIRHUTA(PANGO_SCRIPT_TIRHUTA),

    /**
     * Warang Citi. Since: 1.40
     */
    WARANG_CITI(PANGO_SCRIPT_WARANG_CITI),

    /**
     * Ahom. Since: 1.40
     */
    AHOM(PANGO_SCRIPT_AHOM),

    /**
     * Anatolian Hieroglyphs. Since: 1.40
     */
    ANATOLIAN_HIEROGLYPHS(PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS),

    /**
     * Hatran. Since: 1.40
     */
    HATRAN(PANGO_SCRIPT_HATRAN),

    /**
     * Multani. Since: 1.40
     */
    MULTANI(PANGO_SCRIPT_MULTANI),

    /**
     * Old Hungarian. Since: 1.40
     */
    OLD_HUNGARIAN(PANGO_SCRIPT_OLD_HUNGARIAN),

    /**
     * Signwriting. Since: 1.40
     */
    SIGNWRITING(PANGO_SCRIPT_SIGNWRITING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoScript): Script =
            when (nativeValue) {
                PANGO_SCRIPT_INVALID_CODE -> INVALID_CODE
                PANGO_SCRIPT_COMMON -> COMMON
                PANGO_SCRIPT_INHERITED -> INHERITED
                PANGO_SCRIPT_ARABIC -> ARABIC
                PANGO_SCRIPT_ARMENIAN -> ARMENIAN
                PANGO_SCRIPT_BENGALI -> BENGALI
                PANGO_SCRIPT_BOPOMOFO -> BOPOMOFO
                PANGO_SCRIPT_CHEROKEE -> CHEROKEE
                PANGO_SCRIPT_COPTIC -> COPTIC
                PANGO_SCRIPT_CYRILLIC -> CYRILLIC
                PANGO_SCRIPT_DESERET -> DESERET
                PANGO_SCRIPT_DEVANAGARI -> DEVANAGARI
                PANGO_SCRIPT_ETHIOPIC -> ETHIOPIC
                PANGO_SCRIPT_GEORGIAN -> GEORGIAN
                PANGO_SCRIPT_GOTHIC -> GOTHIC
                PANGO_SCRIPT_GREEK -> GREEK
                PANGO_SCRIPT_GUJARATI -> GUJARATI
                PANGO_SCRIPT_GURMUKHI -> GURMUKHI
                PANGO_SCRIPT_HAN -> HAN
                PANGO_SCRIPT_HANGUL -> HANGUL
                PANGO_SCRIPT_HEBREW -> HEBREW
                PANGO_SCRIPT_HIRAGANA -> HIRAGANA
                PANGO_SCRIPT_KANNADA -> KANNADA
                PANGO_SCRIPT_KATAKANA -> KATAKANA
                PANGO_SCRIPT_KHMER -> KHMER
                PANGO_SCRIPT_LAO -> LAO
                PANGO_SCRIPT_LATIN -> LATIN
                PANGO_SCRIPT_MALAYALAM -> MALAYALAM
                PANGO_SCRIPT_MONGOLIAN -> MONGOLIAN
                PANGO_SCRIPT_MYANMAR -> MYANMAR
                PANGO_SCRIPT_OGHAM -> OGHAM
                PANGO_SCRIPT_OLD_ITALIC -> OLD_ITALIC
                PANGO_SCRIPT_ORIYA -> ORIYA
                PANGO_SCRIPT_RUNIC -> RUNIC
                PANGO_SCRIPT_SINHALA -> SINHALA
                PANGO_SCRIPT_SYRIAC -> SYRIAC
                PANGO_SCRIPT_TAMIL -> TAMIL
                PANGO_SCRIPT_TELUGU -> TELUGU
                PANGO_SCRIPT_THAANA -> THAANA
                PANGO_SCRIPT_THAI -> THAI
                PANGO_SCRIPT_TIBETAN -> TIBETAN
                PANGO_SCRIPT_CANADIAN_ABORIGINAL -> CANADIAN_ABORIGINAL
                PANGO_SCRIPT_YI -> YI
                PANGO_SCRIPT_TAGALOG -> TAGALOG
                PANGO_SCRIPT_HANUNOO -> HANUNOO
                PANGO_SCRIPT_BUHID -> BUHID
                PANGO_SCRIPT_TAGBANWA -> TAGBANWA
                PANGO_SCRIPT_BRAILLE -> BRAILLE
                PANGO_SCRIPT_CYPRIOT -> CYPRIOT
                PANGO_SCRIPT_LIMBU -> LIMBU
                PANGO_SCRIPT_OSMANYA -> OSMANYA
                PANGO_SCRIPT_SHAVIAN -> SHAVIAN
                PANGO_SCRIPT_LINEAR_B -> LINEAR_B
                PANGO_SCRIPT_TAI_LE -> TAI_LE
                PANGO_SCRIPT_UGARITIC -> UGARITIC
                PANGO_SCRIPT_NEW_TAI_LUE -> NEW_TAI_LUE
                PANGO_SCRIPT_BUGINESE -> BUGINESE
                PANGO_SCRIPT_GLAGOLITIC -> GLAGOLITIC
                PANGO_SCRIPT_TIFINAGH -> TIFINAGH
                PANGO_SCRIPT_SYLOTI_NAGRI -> SYLOTI_NAGRI
                PANGO_SCRIPT_OLD_PERSIAN -> OLD_PERSIAN
                PANGO_SCRIPT_KHAROSHTHI -> KHAROSHTHI
                PANGO_SCRIPT_UNKNOWN -> UNKNOWN
                PANGO_SCRIPT_BALINESE -> BALINESE
                PANGO_SCRIPT_CUNEIFORM -> CUNEIFORM
                PANGO_SCRIPT_PHOENICIAN -> PHOENICIAN
                PANGO_SCRIPT_PHAGS_PA -> PHAGS_PA
                PANGO_SCRIPT_NKO -> NKO
                PANGO_SCRIPT_KAYAH_LI -> KAYAH_LI
                PANGO_SCRIPT_LEPCHA -> LEPCHA
                PANGO_SCRIPT_REJANG -> REJANG
                PANGO_SCRIPT_SUNDANESE -> SUNDANESE
                PANGO_SCRIPT_SAURASHTRA -> SAURASHTRA
                PANGO_SCRIPT_CHAM -> CHAM
                PANGO_SCRIPT_OL_CHIKI -> OL_CHIKI
                PANGO_SCRIPT_VAI -> VAI
                PANGO_SCRIPT_CARIAN -> CARIAN
                PANGO_SCRIPT_LYCIAN -> LYCIAN
                PANGO_SCRIPT_LYDIAN -> LYDIAN
                PANGO_SCRIPT_BATAK -> BATAK
                PANGO_SCRIPT_BRAHMI -> BRAHMI
                PANGO_SCRIPT_MANDAIC -> MANDAIC
                PANGO_SCRIPT_CHAKMA -> CHAKMA
                PANGO_SCRIPT_MEROITIC_CURSIVE -> MEROITIC_CURSIVE
                PANGO_SCRIPT_MEROITIC_HIEROGLYPHS -> MEROITIC_HIEROGLYPHS
                PANGO_SCRIPT_MIAO -> MIAO
                PANGO_SCRIPT_SHARADA -> SHARADA
                PANGO_SCRIPT_SORA_SOMPENG -> SORA_SOMPENG
                PANGO_SCRIPT_TAKRI -> TAKRI
                PANGO_SCRIPT_BASSA_VAH -> BASSA_VAH
                PANGO_SCRIPT_CAUCASIAN_ALBANIAN -> CAUCASIAN_ALBANIAN
                PANGO_SCRIPT_DUPLOYAN -> DUPLOYAN
                PANGO_SCRIPT_ELBASAN -> ELBASAN
                PANGO_SCRIPT_GRANTHA -> GRANTHA
                PANGO_SCRIPT_KHOJKI -> KHOJKI
                PANGO_SCRIPT_KHUDAWADI -> KHUDAWADI
                PANGO_SCRIPT_LINEAR_A -> LINEAR_A
                PANGO_SCRIPT_MAHAJANI -> MAHAJANI
                PANGO_SCRIPT_MANICHAEAN -> MANICHAEAN
                PANGO_SCRIPT_MENDE_KIKAKUI -> MENDE_KIKAKUI
                PANGO_SCRIPT_MODI -> MODI
                PANGO_SCRIPT_MRO -> MRO
                PANGO_SCRIPT_NABATAEAN -> NABATAEAN
                PANGO_SCRIPT_OLD_NORTH_ARABIAN -> OLD_NORTH_ARABIAN
                PANGO_SCRIPT_OLD_PERMIC -> OLD_PERMIC
                PANGO_SCRIPT_PAHAWH_HMONG -> PAHAWH_HMONG
                PANGO_SCRIPT_PALMYRENE -> PALMYRENE
                PANGO_SCRIPT_PAU_CIN_HAU -> PAU_CIN_HAU
                PANGO_SCRIPT_PSALTER_PAHLAVI -> PSALTER_PAHLAVI
                PANGO_SCRIPT_SIDDHAM -> SIDDHAM
                PANGO_SCRIPT_TIRHUTA -> TIRHUTA
                PANGO_SCRIPT_WARANG_CITI -> WARANG_CITI
                PANGO_SCRIPT_AHOM -> AHOM
                PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS -> ANATOLIAN_HIEROGLYPHS
                PANGO_SCRIPT_HATRAN -> HATRAN
                PANGO_SCRIPT_MULTANI -> MULTANI
                PANGO_SCRIPT_OLD_HUNGARIAN -> OLD_HUNGARIAN
                PANGO_SCRIPT_SIGNWRITING -> SIGNWRITING
                else -> error("invalid nativeValue")
            }

        /**
         * Looks up the script for a particular character.
         *
         * The script of a character is defined by
         * [Unicode Standard Annex 24: Script names](http://www.unicode.org/reports/tr24/).
         *
         * No check is made for @ch being a valid Unicode character; if you pass
         * in invalid character, the result is undefined.
         *
         * Note that while the return type of this function is declared
         * as `PangoScript`, as of Pango 1.18, this function simply returns
         * the return value of [func@GLib.unichar_get_script]. Callers must be
         * prepared to handle unknown values.
         *
         * @param ch a Unicode character
         * @return the `PangoScript` for the character.
         * @since 1.4
         */
        public fun forUnichar(ch: UInt): Script =
            pango_script_for_unichar(ch).run {
                Script.fromNativeValue(this)
            }

        /**
         * Finds a language tag that is reasonably representative of @script.
         *
         * The language will usually be the most widely spoken or used language
         * written in that script: for instance, the sample language for
         * %PANGO_SCRIPT_CYRILLIC is ru (Russian), the sample language for
         * %PANGO_SCRIPT_ARABIC is ar.
         *
         * For some scripts, no sample language will be returned because
         * there is no language that is sufficiently representative. The
         * best example of this is %PANGO_SCRIPT_HAN, where various different
         * variants of written Chinese, Japanese, and Korean all use
         * significantly different sets of Han characters and forms
         * of shared characters. No sample language can be provided
         * for many historical scripts as well.
         *
         * As of 1.18, this function checks the environment variables
         * `PANGO_LANGUAGE` and `LANGUAGE` (checked in that order) first.
         * If one of them is set, it is parsed as a list of language tags
         * separated by colons or other separators. This function
         * will return the first language in the parsed list that Pango
         * believes may use @script for writing. This last predicate
         * is tested using [method@Pango.Language.includes_script]. This can
         * be used to control Pango's font selection for non-primary
         * languages. For example, a `PANGO_LANGUAGE` enviroment variable
         * set to "en:fa" makes Pango choose fonts suitable for Persian (fa)
         * instead of Arabic (ar) when a segment of Arabic text is found
         * in an otherwise non-Arabic text. The same trick can be used to
         * choose a default language for %PANGO_SCRIPT_HAN when setting
         * context language is not feasible.
         *
         * @param script a `PangoScript`
         * @return a `PangoLanguage` that is representative
         *   of the script
         * @since 1.4
         */
        public fun getSampleLanguage(script: Script): Language? =
            pango_script_get_sample_language(script.nativeValue)?.run {
                Language(reinterpret())
            }
    }
}
