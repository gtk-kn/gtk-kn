// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.pango.annotations.PangoVersion1_4
import org.gtkkn.native.pango.PangoScript
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
    INVALID_CODE(PangoScript.PANGO_SCRIPT_INVALID_CODE),

    /**
     * a character used by multiple different scripts
     */
    COMMON(PangoScript.PANGO_SCRIPT_COMMON),

    /**
     * a mark glyph that takes its script from the
     * base glyph to which it is attached
     */
    INHERITED(PangoScript.PANGO_SCRIPT_INHERITED),

    /**
     * Arabic
     */
    ARABIC(PangoScript.PANGO_SCRIPT_ARABIC),

    /**
     * Armenian
     */
    ARMENIAN(PangoScript.PANGO_SCRIPT_ARMENIAN),

    /**
     * Bengali
     */
    BENGALI(PangoScript.PANGO_SCRIPT_BENGALI),

    /**
     * Bopomofo
     */
    BOPOMOFO(PangoScript.PANGO_SCRIPT_BOPOMOFO),

    /**
     * Cherokee
     */
    CHEROKEE(PangoScript.PANGO_SCRIPT_CHEROKEE),

    /**
     * Coptic
     */
    COPTIC(PangoScript.PANGO_SCRIPT_COPTIC),

    /**
     * Cyrillic
     */
    CYRILLIC(PangoScript.PANGO_SCRIPT_CYRILLIC),

    /**
     * Deseret
     */
    DESERET(PangoScript.PANGO_SCRIPT_DESERET),

    /**
     * Devanagari
     */
    DEVANAGARI(PangoScript.PANGO_SCRIPT_DEVANAGARI),

    /**
     * Ethiopic
     */
    ETHIOPIC(PangoScript.PANGO_SCRIPT_ETHIOPIC),

    /**
     * Georgian
     */
    GEORGIAN(PangoScript.PANGO_SCRIPT_GEORGIAN),

    /**
     * Gothic
     */
    GOTHIC(PangoScript.PANGO_SCRIPT_GOTHIC),

    /**
     * Greek
     */
    GREEK(PangoScript.PANGO_SCRIPT_GREEK),

    /**
     * Gujarati
     */
    GUJARATI(PangoScript.PANGO_SCRIPT_GUJARATI),

    /**
     * Gurmukhi
     */
    GURMUKHI(PangoScript.PANGO_SCRIPT_GURMUKHI),

    /**
     * Han
     */
    HAN(PangoScript.PANGO_SCRIPT_HAN),

    /**
     * Hangul
     */
    HANGUL(PangoScript.PANGO_SCRIPT_HANGUL),

    /**
     * Hebrew
     */
    HEBREW(PangoScript.PANGO_SCRIPT_HEBREW),

    /**
     * Hiragana
     */
    HIRAGANA(PangoScript.PANGO_SCRIPT_HIRAGANA),

    /**
     * Kannada
     */
    KANNADA(PangoScript.PANGO_SCRIPT_KANNADA),

    /**
     * Katakana
     */
    KATAKANA(PangoScript.PANGO_SCRIPT_KATAKANA),

    /**
     * Khmer
     */
    KHMER(PangoScript.PANGO_SCRIPT_KHMER),

    /**
     * Lao
     */
    LAO(PangoScript.PANGO_SCRIPT_LAO),

    /**
     * Latin
     */
    LATIN(PangoScript.PANGO_SCRIPT_LATIN),

    /**
     * Malayalam
     */
    MALAYALAM(PangoScript.PANGO_SCRIPT_MALAYALAM),

    /**
     * Mongolian
     */
    MONGOLIAN(PangoScript.PANGO_SCRIPT_MONGOLIAN),

    /**
     * Myanmar
     */
    MYANMAR(PangoScript.PANGO_SCRIPT_MYANMAR),

    /**
     * Ogham
     */
    OGHAM(PangoScript.PANGO_SCRIPT_OGHAM),

    /**
     * Old Italic
     */
    OLD_ITALIC(PangoScript.PANGO_SCRIPT_OLD_ITALIC),

    /**
     * Oriya
     */
    ORIYA(PangoScript.PANGO_SCRIPT_ORIYA),

    /**
     * Runic
     */
    RUNIC(PangoScript.PANGO_SCRIPT_RUNIC),

    /**
     * Sinhala
     */
    SINHALA(PangoScript.PANGO_SCRIPT_SINHALA),

    /**
     * Syriac
     */
    SYRIAC(PangoScript.PANGO_SCRIPT_SYRIAC),

    /**
     * Tamil
     */
    TAMIL(PangoScript.PANGO_SCRIPT_TAMIL),

    /**
     * Telugu
     */
    TELUGU(PangoScript.PANGO_SCRIPT_TELUGU),

    /**
     * Thaana
     */
    THAANA(PangoScript.PANGO_SCRIPT_THAANA),

    /**
     * Thai
     */
    THAI(PangoScript.PANGO_SCRIPT_THAI),

    /**
     * Tibetan
     */
    TIBETAN(PangoScript.PANGO_SCRIPT_TIBETAN),

    /**
     * Canadian Aboriginal
     */
    CANADIAN_ABORIGINAL(PangoScript.PANGO_SCRIPT_CANADIAN_ABORIGINAL),

    /**
     * Yi
     */
    YI(PangoScript.PANGO_SCRIPT_YI),

    /**
     * Tagalog
     */
    TAGALOG(PangoScript.PANGO_SCRIPT_TAGALOG),

    /**
     * Hanunoo
     */
    HANUNOO(PangoScript.PANGO_SCRIPT_HANUNOO),

    /**
     * Buhid
     */
    BUHID(PangoScript.PANGO_SCRIPT_BUHID),

    /**
     * Tagbanwa
     */
    TAGBANWA(PangoScript.PANGO_SCRIPT_TAGBANWA),

    /**
     * Braille
     */
    BRAILLE(PangoScript.PANGO_SCRIPT_BRAILLE),

    /**
     * Cypriot
     */
    CYPRIOT(PangoScript.PANGO_SCRIPT_CYPRIOT),

    /**
     * Limbu
     */
    LIMBU(PangoScript.PANGO_SCRIPT_LIMBU),

    /**
     * Osmanya
     */
    OSMANYA(PangoScript.PANGO_SCRIPT_OSMANYA),

    /**
     * Shavian
     */
    SHAVIAN(PangoScript.PANGO_SCRIPT_SHAVIAN),

    /**
     * Linear B
     */
    LINEAR_B(PangoScript.PANGO_SCRIPT_LINEAR_B),

    /**
     * Tai Le
     */
    TAI_LE(PangoScript.PANGO_SCRIPT_TAI_LE),

    /**
     * Ugaritic
     */
    UGARITIC(PangoScript.PANGO_SCRIPT_UGARITIC),

    /**
     * New Tai Lue. Since 1.10
     */
    NEW_TAI_LUE(PangoScript.PANGO_SCRIPT_NEW_TAI_LUE),

    /**
     * Buginese. Since 1.10
     */
    BUGINESE(PangoScript.PANGO_SCRIPT_BUGINESE),

    /**
     * Glagolitic. Since 1.10
     */
    GLAGOLITIC(PangoScript.PANGO_SCRIPT_GLAGOLITIC),

    /**
     * Tifinagh. Since 1.10
     */
    TIFINAGH(PangoScript.PANGO_SCRIPT_TIFINAGH),

    /**
     * Syloti Nagri. Since 1.10
     */
    SYLOTI_NAGRI(PangoScript.PANGO_SCRIPT_SYLOTI_NAGRI),

    /**
     * Old Persian. Since 1.10
     */
    OLD_PERSIAN(PangoScript.PANGO_SCRIPT_OLD_PERSIAN),

    /**
     * Kharoshthi. Since 1.10
     */
    KHAROSHTHI(PangoScript.PANGO_SCRIPT_KHAROSHTHI),

    /**
     * an unassigned code point. Since 1.14
     */
    UNKNOWN(PangoScript.PANGO_SCRIPT_UNKNOWN),

    /**
     * Balinese. Since 1.14
     */
    BALINESE(PangoScript.PANGO_SCRIPT_BALINESE),

    /**
     * Cuneiform. Since 1.14
     */
    CUNEIFORM(PangoScript.PANGO_SCRIPT_CUNEIFORM),

    /**
     * Phoenician. Since 1.14
     */
    PHOENICIAN(PangoScript.PANGO_SCRIPT_PHOENICIAN),

    /**
     * Phags-pa. Since 1.14
     */
    PHAGS_PA(PangoScript.PANGO_SCRIPT_PHAGS_PA),

    /**
     * N'Ko. Since 1.14
     */
    NKO(PangoScript.PANGO_SCRIPT_NKO),

    /**
     * Kayah Li. Since 1.20.1
     */
    KAYAH_LI(PangoScript.PANGO_SCRIPT_KAYAH_LI),

    /**
     * Lepcha. Since 1.20.1
     */
    LEPCHA(PangoScript.PANGO_SCRIPT_LEPCHA),

    /**
     * Rejang. Since 1.20.1
     */
    REJANG(PangoScript.PANGO_SCRIPT_REJANG),

    /**
     * Sundanese. Since 1.20.1
     */
    SUNDANESE(PangoScript.PANGO_SCRIPT_SUNDANESE),

    /**
     * Saurashtra. Since 1.20.1
     */
    SAURASHTRA(PangoScript.PANGO_SCRIPT_SAURASHTRA),

    /**
     * Cham. Since 1.20.1
     */
    CHAM(PangoScript.PANGO_SCRIPT_CHAM),

    /**
     * Ol Chiki. Since 1.20.1
     */
    OL_CHIKI(PangoScript.PANGO_SCRIPT_OL_CHIKI),

    /**
     * Vai. Since 1.20.1
     */
    VAI(PangoScript.PANGO_SCRIPT_VAI),

    /**
     * Carian. Since 1.20.1
     */
    CARIAN(PangoScript.PANGO_SCRIPT_CARIAN),

    /**
     * Lycian. Since 1.20.1
     */
    LYCIAN(PangoScript.PANGO_SCRIPT_LYCIAN),

    /**
     * Lydian. Since 1.20.1
     */
    LYDIAN(PangoScript.PANGO_SCRIPT_LYDIAN),

    /**
     * Batak. Since 1.32
     */
    BATAK(PangoScript.PANGO_SCRIPT_BATAK),

    /**
     * Brahmi. Since 1.32
     */
    BRAHMI(PangoScript.PANGO_SCRIPT_BRAHMI),

    /**
     * Mandaic. Since 1.32
     */
    MANDAIC(PangoScript.PANGO_SCRIPT_MANDAIC),

    /**
     * Chakma. Since: 1.32
     */
    CHAKMA(PangoScript.PANGO_SCRIPT_CHAKMA),

    /**
     * Meroitic Cursive. Since: 1.32
     */
    MEROITIC_CURSIVE(PangoScript.PANGO_SCRIPT_MEROITIC_CURSIVE),

    /**
     * Meroitic Hieroglyphs. Since: 1.32
     */
    MEROITIC_HIEROGLYPHS(PangoScript.PANGO_SCRIPT_MEROITIC_HIEROGLYPHS),

    /**
     * Miao. Since: 1.32
     */
    MIAO(PangoScript.PANGO_SCRIPT_MIAO),

    /**
     * Sharada. Since: 1.32
     */
    SHARADA(PangoScript.PANGO_SCRIPT_SHARADA),

    /**
     * Sora Sompeng. Since: 1.32
     */
    SORA_SOMPENG(PangoScript.PANGO_SCRIPT_SORA_SOMPENG),

    /**
     * Takri. Since: 1.32
     */
    TAKRI(PangoScript.PANGO_SCRIPT_TAKRI),

    /**
     * Bassa. Since: 1.40
     */
    BASSA_VAH(PangoScript.PANGO_SCRIPT_BASSA_VAH),

    /**
     * Caucasian Albanian. Since: 1.40
     */
    CAUCASIAN_ALBANIAN(PangoScript.PANGO_SCRIPT_CAUCASIAN_ALBANIAN),

    /**
     * Duployan. Since: 1.40
     */
    DUPLOYAN(PangoScript.PANGO_SCRIPT_DUPLOYAN),

    /**
     * Elbasan. Since: 1.40
     */
    ELBASAN(PangoScript.PANGO_SCRIPT_ELBASAN),

    /**
     * Grantha. Since: 1.40
     */
    GRANTHA(PangoScript.PANGO_SCRIPT_GRANTHA),

    /**
     * Kjohki. Since: 1.40
     */
    KHOJKI(PangoScript.PANGO_SCRIPT_KHOJKI),

    /**
     * Khudawadi, Sindhi. Since: 1.40
     */
    KHUDAWADI(PangoScript.PANGO_SCRIPT_KHUDAWADI),

    /**
     * Linear A. Since: 1.40
     */
    LINEAR_A(PangoScript.PANGO_SCRIPT_LINEAR_A),

    /**
     * Mahajani. Since: 1.40
     */
    MAHAJANI(PangoScript.PANGO_SCRIPT_MAHAJANI),

    /**
     * Manichaean. Since: 1.40
     */
    MANICHAEAN(PangoScript.PANGO_SCRIPT_MANICHAEAN),

    /**
     * Mende Kikakui. Since: 1.40
     */
    MENDE_KIKAKUI(PangoScript.PANGO_SCRIPT_MENDE_KIKAKUI),

    /**
     * Modi. Since: 1.40
     */
    MODI(PangoScript.PANGO_SCRIPT_MODI),

    /**
     * Mro. Since: 1.40
     */
    MRO(PangoScript.PANGO_SCRIPT_MRO),

    /**
     * Nabataean. Since: 1.40
     */
    NABATAEAN(PangoScript.PANGO_SCRIPT_NABATAEAN),

    /**
     * Old North Arabian. Since: 1.40
     */
    OLD_NORTH_ARABIAN(PangoScript.PANGO_SCRIPT_OLD_NORTH_ARABIAN),

    /**
     * Old Permic. Since: 1.40
     */
    OLD_PERMIC(PangoScript.PANGO_SCRIPT_OLD_PERMIC),

    /**
     * Pahawh Hmong. Since: 1.40
     */
    PAHAWH_HMONG(PangoScript.PANGO_SCRIPT_PAHAWH_HMONG),

    /**
     * Palmyrene. Since: 1.40
     */
    PALMYRENE(PangoScript.PANGO_SCRIPT_PALMYRENE),

    /**
     * Pau Cin Hau. Since: 1.40
     */
    PAU_CIN_HAU(PangoScript.PANGO_SCRIPT_PAU_CIN_HAU),

    /**
     * Psalter Pahlavi. Since: 1.40
     */
    PSALTER_PAHLAVI(PangoScript.PANGO_SCRIPT_PSALTER_PAHLAVI),

    /**
     * Siddham. Since: 1.40
     */
    SIDDHAM(PangoScript.PANGO_SCRIPT_SIDDHAM),

    /**
     * Tirhuta. Since: 1.40
     */
    TIRHUTA(PangoScript.PANGO_SCRIPT_TIRHUTA),

    /**
     * Warang Citi. Since: 1.40
     */
    WARANG_CITI(PangoScript.PANGO_SCRIPT_WARANG_CITI),

    /**
     * Ahom. Since: 1.40
     */
    AHOM(PangoScript.PANGO_SCRIPT_AHOM),

    /**
     * Anatolian Hieroglyphs. Since: 1.40
     */
    ANATOLIAN_HIEROGLYPHS(PangoScript.PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS),

    /**
     * Hatran. Since: 1.40
     */
    HATRAN(PangoScript.PANGO_SCRIPT_HATRAN),

    /**
     * Multani. Since: 1.40
     */
    MULTANI(PangoScript.PANGO_SCRIPT_MULTANI),

    /**
     * Old Hungarian. Since: 1.40
     */
    OLD_HUNGARIAN(PangoScript.PANGO_SCRIPT_OLD_HUNGARIAN),

    /**
     * Signwriting. Since: 1.40
     */
    SIGNWRITING(PangoScript.PANGO_SCRIPT_SIGNWRITING),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoScript): Script =
            when (nativeValue) {
                PangoScript.PANGO_SCRIPT_INVALID_CODE -> INVALID_CODE
                PangoScript.PANGO_SCRIPT_COMMON -> COMMON
                PangoScript.PANGO_SCRIPT_INHERITED -> INHERITED
                PangoScript.PANGO_SCRIPT_ARABIC -> ARABIC
                PangoScript.PANGO_SCRIPT_ARMENIAN -> ARMENIAN
                PangoScript.PANGO_SCRIPT_BENGALI -> BENGALI
                PangoScript.PANGO_SCRIPT_BOPOMOFO -> BOPOMOFO
                PangoScript.PANGO_SCRIPT_CHEROKEE -> CHEROKEE
                PangoScript.PANGO_SCRIPT_COPTIC -> COPTIC
                PangoScript.PANGO_SCRIPT_CYRILLIC -> CYRILLIC
                PangoScript.PANGO_SCRIPT_DESERET -> DESERET
                PangoScript.PANGO_SCRIPT_DEVANAGARI -> DEVANAGARI
                PangoScript.PANGO_SCRIPT_ETHIOPIC -> ETHIOPIC
                PangoScript.PANGO_SCRIPT_GEORGIAN -> GEORGIAN
                PangoScript.PANGO_SCRIPT_GOTHIC -> GOTHIC
                PangoScript.PANGO_SCRIPT_GREEK -> GREEK
                PangoScript.PANGO_SCRIPT_GUJARATI -> GUJARATI
                PangoScript.PANGO_SCRIPT_GURMUKHI -> GURMUKHI
                PangoScript.PANGO_SCRIPT_HAN -> HAN
                PangoScript.PANGO_SCRIPT_HANGUL -> HANGUL
                PangoScript.PANGO_SCRIPT_HEBREW -> HEBREW
                PangoScript.PANGO_SCRIPT_HIRAGANA -> HIRAGANA
                PangoScript.PANGO_SCRIPT_KANNADA -> KANNADA
                PangoScript.PANGO_SCRIPT_KATAKANA -> KATAKANA
                PangoScript.PANGO_SCRIPT_KHMER -> KHMER
                PangoScript.PANGO_SCRIPT_LAO -> LAO
                PangoScript.PANGO_SCRIPT_LATIN -> LATIN
                PangoScript.PANGO_SCRIPT_MALAYALAM -> MALAYALAM
                PangoScript.PANGO_SCRIPT_MONGOLIAN -> MONGOLIAN
                PangoScript.PANGO_SCRIPT_MYANMAR -> MYANMAR
                PangoScript.PANGO_SCRIPT_OGHAM -> OGHAM
                PangoScript.PANGO_SCRIPT_OLD_ITALIC -> OLD_ITALIC
                PangoScript.PANGO_SCRIPT_ORIYA -> ORIYA
                PangoScript.PANGO_SCRIPT_RUNIC -> RUNIC
                PangoScript.PANGO_SCRIPT_SINHALA -> SINHALA
                PangoScript.PANGO_SCRIPT_SYRIAC -> SYRIAC
                PangoScript.PANGO_SCRIPT_TAMIL -> TAMIL
                PangoScript.PANGO_SCRIPT_TELUGU -> TELUGU
                PangoScript.PANGO_SCRIPT_THAANA -> THAANA
                PangoScript.PANGO_SCRIPT_THAI -> THAI
                PangoScript.PANGO_SCRIPT_TIBETAN -> TIBETAN
                PangoScript.PANGO_SCRIPT_CANADIAN_ABORIGINAL -> CANADIAN_ABORIGINAL
                PangoScript.PANGO_SCRIPT_YI -> YI
                PangoScript.PANGO_SCRIPT_TAGALOG -> TAGALOG
                PangoScript.PANGO_SCRIPT_HANUNOO -> HANUNOO
                PangoScript.PANGO_SCRIPT_BUHID -> BUHID
                PangoScript.PANGO_SCRIPT_TAGBANWA -> TAGBANWA
                PangoScript.PANGO_SCRIPT_BRAILLE -> BRAILLE
                PangoScript.PANGO_SCRIPT_CYPRIOT -> CYPRIOT
                PangoScript.PANGO_SCRIPT_LIMBU -> LIMBU
                PangoScript.PANGO_SCRIPT_OSMANYA -> OSMANYA
                PangoScript.PANGO_SCRIPT_SHAVIAN -> SHAVIAN
                PangoScript.PANGO_SCRIPT_LINEAR_B -> LINEAR_B
                PangoScript.PANGO_SCRIPT_TAI_LE -> TAI_LE
                PangoScript.PANGO_SCRIPT_UGARITIC -> UGARITIC
                PangoScript.PANGO_SCRIPT_NEW_TAI_LUE -> NEW_TAI_LUE
                PangoScript.PANGO_SCRIPT_BUGINESE -> BUGINESE
                PangoScript.PANGO_SCRIPT_GLAGOLITIC -> GLAGOLITIC
                PangoScript.PANGO_SCRIPT_TIFINAGH -> TIFINAGH
                PangoScript.PANGO_SCRIPT_SYLOTI_NAGRI -> SYLOTI_NAGRI
                PangoScript.PANGO_SCRIPT_OLD_PERSIAN -> OLD_PERSIAN
                PangoScript.PANGO_SCRIPT_KHAROSHTHI -> KHAROSHTHI
                PangoScript.PANGO_SCRIPT_UNKNOWN -> UNKNOWN
                PangoScript.PANGO_SCRIPT_BALINESE -> BALINESE
                PangoScript.PANGO_SCRIPT_CUNEIFORM -> CUNEIFORM
                PangoScript.PANGO_SCRIPT_PHOENICIAN -> PHOENICIAN
                PangoScript.PANGO_SCRIPT_PHAGS_PA -> PHAGS_PA
                PangoScript.PANGO_SCRIPT_NKO -> NKO
                PangoScript.PANGO_SCRIPT_KAYAH_LI -> KAYAH_LI
                PangoScript.PANGO_SCRIPT_LEPCHA -> LEPCHA
                PangoScript.PANGO_SCRIPT_REJANG -> REJANG
                PangoScript.PANGO_SCRIPT_SUNDANESE -> SUNDANESE
                PangoScript.PANGO_SCRIPT_SAURASHTRA -> SAURASHTRA
                PangoScript.PANGO_SCRIPT_CHAM -> CHAM
                PangoScript.PANGO_SCRIPT_OL_CHIKI -> OL_CHIKI
                PangoScript.PANGO_SCRIPT_VAI -> VAI
                PangoScript.PANGO_SCRIPT_CARIAN -> CARIAN
                PangoScript.PANGO_SCRIPT_LYCIAN -> LYCIAN
                PangoScript.PANGO_SCRIPT_LYDIAN -> LYDIAN
                PangoScript.PANGO_SCRIPT_BATAK -> BATAK
                PangoScript.PANGO_SCRIPT_BRAHMI -> BRAHMI
                PangoScript.PANGO_SCRIPT_MANDAIC -> MANDAIC
                PangoScript.PANGO_SCRIPT_CHAKMA -> CHAKMA
                PangoScript.PANGO_SCRIPT_MEROITIC_CURSIVE -> MEROITIC_CURSIVE
                PangoScript.PANGO_SCRIPT_MEROITIC_HIEROGLYPHS -> MEROITIC_HIEROGLYPHS
                PangoScript.PANGO_SCRIPT_MIAO -> MIAO
                PangoScript.PANGO_SCRIPT_SHARADA -> SHARADA
                PangoScript.PANGO_SCRIPT_SORA_SOMPENG -> SORA_SOMPENG
                PangoScript.PANGO_SCRIPT_TAKRI -> TAKRI
                PangoScript.PANGO_SCRIPT_BASSA_VAH -> BASSA_VAH
                PangoScript.PANGO_SCRIPT_CAUCASIAN_ALBANIAN -> CAUCASIAN_ALBANIAN
                PangoScript.PANGO_SCRIPT_DUPLOYAN -> DUPLOYAN
                PangoScript.PANGO_SCRIPT_ELBASAN -> ELBASAN
                PangoScript.PANGO_SCRIPT_GRANTHA -> GRANTHA
                PangoScript.PANGO_SCRIPT_KHOJKI -> KHOJKI
                PangoScript.PANGO_SCRIPT_KHUDAWADI -> KHUDAWADI
                PangoScript.PANGO_SCRIPT_LINEAR_A -> LINEAR_A
                PangoScript.PANGO_SCRIPT_MAHAJANI -> MAHAJANI
                PangoScript.PANGO_SCRIPT_MANICHAEAN -> MANICHAEAN
                PangoScript.PANGO_SCRIPT_MENDE_KIKAKUI -> MENDE_KIKAKUI
                PangoScript.PANGO_SCRIPT_MODI -> MODI
                PangoScript.PANGO_SCRIPT_MRO -> MRO
                PangoScript.PANGO_SCRIPT_NABATAEAN -> NABATAEAN
                PangoScript.PANGO_SCRIPT_OLD_NORTH_ARABIAN -> OLD_NORTH_ARABIAN
                PangoScript.PANGO_SCRIPT_OLD_PERMIC -> OLD_PERMIC
                PangoScript.PANGO_SCRIPT_PAHAWH_HMONG -> PAHAWH_HMONG
                PangoScript.PANGO_SCRIPT_PALMYRENE -> PALMYRENE
                PangoScript.PANGO_SCRIPT_PAU_CIN_HAU -> PAU_CIN_HAU
                PangoScript.PANGO_SCRIPT_PSALTER_PAHLAVI -> PSALTER_PAHLAVI
                PangoScript.PANGO_SCRIPT_SIDDHAM -> SIDDHAM
                PangoScript.PANGO_SCRIPT_TIRHUTA -> TIRHUTA
                PangoScript.PANGO_SCRIPT_WARANG_CITI -> WARANG_CITI
                PangoScript.PANGO_SCRIPT_AHOM -> AHOM
                PangoScript.PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS -> ANATOLIAN_HIEROGLYPHS
                PangoScript.PANGO_SCRIPT_HATRAN -> HATRAN
                PangoScript.PANGO_SCRIPT_MULTANI -> MULTANI
                PangoScript.PANGO_SCRIPT_OLD_HUNGARIAN -> OLD_HUNGARIAN
                PangoScript.PANGO_SCRIPT_SIGNWRITING -> SIGNWRITING
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
        @PangoVersion1_4
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
        @PangoVersion1_4
        public fun getSampleLanguage(script: Script): Language? =
            pango_script_get_sample_language(script.nativeValue)?.run {
                Language(reinterpret())
            }
    }
}
