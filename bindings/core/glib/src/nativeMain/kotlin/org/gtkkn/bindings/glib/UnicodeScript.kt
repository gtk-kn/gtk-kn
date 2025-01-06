// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_30
import org.gtkkn.native.glib.GUnicodeScript
import org.gtkkn.native.glib.g_unicode_script_from_iso15924
import org.gtkkn.native.glib.g_unicode_script_to_iso15924
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_unicode_script_get_type

/**
 * The #GUnicodeScript enumeration identifies different writing
 * systems. The values correspond to the names as defined in the
 * Unicode standard. The enumeration has been added in GLib 2.14,
 * and is interchangeable with #PangoScript.
 *
 * Note that new types may be added in the future. Applications
 * should be ready to handle unknown values.
 * See [Unicode Standard Annex #24: Script names](http://www.unicode.org/reports/tr24/).
 */
public enum class UnicodeScript(public val nativeValue: GUnicodeScript) {
    /**
     * a value never returned from g_unichar_get_script()
     */
    INVALID_CODE(GUnicodeScript.G_UNICODE_SCRIPT_INVALID_CODE),

    /**
     * a character used by multiple different scripts
     */
    COMMON(GUnicodeScript.G_UNICODE_SCRIPT_COMMON),

    /**
     * a mark glyph that takes its script from the
     *                               base glyph to which it is attached
     */
    INHERITED(GUnicodeScript.G_UNICODE_SCRIPT_INHERITED),

    /**
     * Arabic
     */
    ARABIC(GUnicodeScript.G_UNICODE_SCRIPT_ARABIC),

    /**
     * Armenian
     */
    ARMENIAN(GUnicodeScript.G_UNICODE_SCRIPT_ARMENIAN),

    /**
     * Bengali
     */
    BENGALI(GUnicodeScript.G_UNICODE_SCRIPT_BENGALI),

    /**
     * Bopomofo
     */
    BOPOMOFO(GUnicodeScript.G_UNICODE_SCRIPT_BOPOMOFO),

    /**
     * Cherokee
     */
    CHEROKEE(GUnicodeScript.G_UNICODE_SCRIPT_CHEROKEE),

    /**
     * Coptic
     */
    COPTIC(GUnicodeScript.G_UNICODE_SCRIPT_COPTIC),

    /**
     * Cyrillic
     */
    CYRILLIC(GUnicodeScript.G_UNICODE_SCRIPT_CYRILLIC),

    /**
     * Deseret
     */
    DESERET(GUnicodeScript.G_UNICODE_SCRIPT_DESERET),

    /**
     * Devanagari
     */
    DEVANAGARI(GUnicodeScript.G_UNICODE_SCRIPT_DEVANAGARI),

    /**
     * Ethiopic
     */
    ETHIOPIC(GUnicodeScript.G_UNICODE_SCRIPT_ETHIOPIC),

    /**
     * Georgian
     */
    GEORGIAN(GUnicodeScript.G_UNICODE_SCRIPT_GEORGIAN),

    /**
     * Gothic
     */
    GOTHIC(GUnicodeScript.G_UNICODE_SCRIPT_GOTHIC),

    /**
     * Greek
     */
    GREEK(GUnicodeScript.G_UNICODE_SCRIPT_GREEK),

    /**
     * Gujarati
     */
    GUJARATI(GUnicodeScript.G_UNICODE_SCRIPT_GUJARATI),

    /**
     * Gurmukhi
     */
    GURMUKHI(GUnicodeScript.G_UNICODE_SCRIPT_GURMUKHI),

    /**
     * Han
     */
    HAN(GUnicodeScript.G_UNICODE_SCRIPT_HAN),

    /**
     * Hangul
     */
    HANGUL(GUnicodeScript.G_UNICODE_SCRIPT_HANGUL),

    /**
     * Hebrew
     */
    HEBREW(GUnicodeScript.G_UNICODE_SCRIPT_HEBREW),

    /**
     * Hiragana
     */
    HIRAGANA(GUnicodeScript.G_UNICODE_SCRIPT_HIRAGANA),

    /**
     * Kannada
     */
    KANNADA(GUnicodeScript.G_UNICODE_SCRIPT_KANNADA),

    /**
     * Katakana
     */
    KATAKANA(GUnicodeScript.G_UNICODE_SCRIPT_KATAKANA),

    /**
     * Khmer
     */
    KHMER(GUnicodeScript.G_UNICODE_SCRIPT_KHMER),

    /**
     * Lao
     */
    LAO(GUnicodeScript.G_UNICODE_SCRIPT_LAO),

    /**
     * Latin
     */
    LATIN(GUnicodeScript.G_UNICODE_SCRIPT_LATIN),

    /**
     * Malayalam
     */
    MALAYALAM(GUnicodeScript.G_UNICODE_SCRIPT_MALAYALAM),

    /**
     * Mongolian
     */
    MONGOLIAN(GUnicodeScript.G_UNICODE_SCRIPT_MONGOLIAN),

    /**
     * Myanmar
     */
    MYANMAR(GUnicodeScript.G_UNICODE_SCRIPT_MYANMAR),

    /**
     * Ogham
     */
    OGHAM(GUnicodeScript.G_UNICODE_SCRIPT_OGHAM),

    /**
     * Old Italic
     */
    OLD_ITALIC(GUnicodeScript.G_UNICODE_SCRIPT_OLD_ITALIC),

    /**
     * Oriya
     */
    ORIYA(GUnicodeScript.G_UNICODE_SCRIPT_ORIYA),

    /**
     * Runic
     */
    RUNIC(GUnicodeScript.G_UNICODE_SCRIPT_RUNIC),

    /**
     * Sinhala
     */
    SINHALA(GUnicodeScript.G_UNICODE_SCRIPT_SINHALA),

    /**
     * Syriac
     */
    SYRIAC(GUnicodeScript.G_UNICODE_SCRIPT_SYRIAC),

    /**
     * Tamil
     */
    TAMIL(GUnicodeScript.G_UNICODE_SCRIPT_TAMIL),

    /**
     * Telugu
     */
    TELUGU(GUnicodeScript.G_UNICODE_SCRIPT_TELUGU),

    /**
     * Thaana
     */
    THAANA(GUnicodeScript.G_UNICODE_SCRIPT_THAANA),

    /**
     * Thai
     */
    THAI(GUnicodeScript.G_UNICODE_SCRIPT_THAI),

    /**
     * Tibetan
     */
    TIBETAN(GUnicodeScript.G_UNICODE_SCRIPT_TIBETAN),

    /**
     * Canadian Aboriginal
     */
    CANADIAN_ABORIGINAL(GUnicodeScript.G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL),

    /**
     * Yi
     */
    YI(GUnicodeScript.G_UNICODE_SCRIPT_YI),

    /**
     * Tagalog
     */
    TAGALOG(GUnicodeScript.G_UNICODE_SCRIPT_TAGALOG),

    /**
     * Hanunoo
     */
    HANUNOO(GUnicodeScript.G_UNICODE_SCRIPT_HANUNOO),

    /**
     * Buhid
     */
    BUHID(GUnicodeScript.G_UNICODE_SCRIPT_BUHID),

    /**
     * Tagbanwa
     */
    TAGBANWA(GUnicodeScript.G_UNICODE_SCRIPT_TAGBANWA),

    /**
     * Braille
     */
    BRAILLE(GUnicodeScript.G_UNICODE_SCRIPT_BRAILLE),

    /**
     * Cypriot
     */
    CYPRIOT(GUnicodeScript.G_UNICODE_SCRIPT_CYPRIOT),

    /**
     * Limbu
     */
    LIMBU(GUnicodeScript.G_UNICODE_SCRIPT_LIMBU),

    /**
     * Osmanya
     */
    OSMANYA(GUnicodeScript.G_UNICODE_SCRIPT_OSMANYA),

    /**
     * Shavian
     */
    SHAVIAN(GUnicodeScript.G_UNICODE_SCRIPT_SHAVIAN),

    /**
     * Linear B
     */
    LINEAR_B(GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_B),

    /**
     * Tai Le
     */
    TAI_LE(GUnicodeScript.G_UNICODE_SCRIPT_TAI_LE),

    /**
     * Ugaritic
     */
    UGARITIC(GUnicodeScript.G_UNICODE_SCRIPT_UGARITIC),

    /**
     * New Tai Lue
     */
    NEW_TAI_LUE(GUnicodeScript.G_UNICODE_SCRIPT_NEW_TAI_LUE),

    /**
     * Buginese
     */
    BUGINESE(GUnicodeScript.G_UNICODE_SCRIPT_BUGINESE),

    /**
     * Glagolitic
     */
    GLAGOLITIC(GUnicodeScript.G_UNICODE_SCRIPT_GLAGOLITIC),

    /**
     * Tifinagh
     */
    TIFINAGH(GUnicodeScript.G_UNICODE_SCRIPT_TIFINAGH),

    /**
     * Syloti Nagri
     */
    SYLOTI_NAGRI(GUnicodeScript.G_UNICODE_SCRIPT_SYLOTI_NAGRI),

    /**
     * Old Persian
     */
    OLD_PERSIAN(GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERSIAN),

    /**
     * Kharoshthi
     */
    KHAROSHTHI(GUnicodeScript.G_UNICODE_SCRIPT_KHAROSHTHI),

    /**
     * an unassigned code point
     */
    UNKNOWN(GUnicodeScript.G_UNICODE_SCRIPT_UNKNOWN),

    /**
     * Balinese
     */
    BALINESE(GUnicodeScript.G_UNICODE_SCRIPT_BALINESE),

    /**
     * Cuneiform
     */
    CUNEIFORM(GUnicodeScript.G_UNICODE_SCRIPT_CUNEIFORM),

    /**
     * Phoenician
     */
    PHOENICIAN(GUnicodeScript.G_UNICODE_SCRIPT_PHOENICIAN),

    /**
     * Phags-pa
     */
    PHAGS_PA(GUnicodeScript.G_UNICODE_SCRIPT_PHAGS_PA),

    /**
     * N'Ko
     */
    NKO(GUnicodeScript.G_UNICODE_SCRIPT_NKO),

    /**
     * Kayah Li. Since 2.16.3
     */
    KAYAH_LI(GUnicodeScript.G_UNICODE_SCRIPT_KAYAH_LI),

    /**
     * Lepcha. Since 2.16.3
     */
    LEPCHA(GUnicodeScript.G_UNICODE_SCRIPT_LEPCHA),

    /**
     * Rejang. Since 2.16.3
     */
    REJANG(GUnicodeScript.G_UNICODE_SCRIPT_REJANG),

    /**
     * Sundanese. Since 2.16.3
     */
    SUNDANESE(GUnicodeScript.G_UNICODE_SCRIPT_SUNDANESE),

    /**
     * Saurashtra. Since 2.16.3
     */
    SAURASHTRA(GUnicodeScript.G_UNICODE_SCRIPT_SAURASHTRA),

    /**
     * Cham. Since 2.16.3
     */
    CHAM(GUnicodeScript.G_UNICODE_SCRIPT_CHAM),

    /**
     * Ol Chiki. Since 2.16.3
     */
    OL_CHIKI(GUnicodeScript.G_UNICODE_SCRIPT_OL_CHIKI),

    /**
     * Vai. Since 2.16.3
     */
    VAI(GUnicodeScript.G_UNICODE_SCRIPT_VAI),

    /**
     * Carian. Since 2.16.3
     */
    CARIAN(GUnicodeScript.G_UNICODE_SCRIPT_CARIAN),

    /**
     * Lycian. Since 2.16.3
     */
    LYCIAN(GUnicodeScript.G_UNICODE_SCRIPT_LYCIAN),

    /**
     * Lydian. Since 2.16.3
     */
    LYDIAN(GUnicodeScript.G_UNICODE_SCRIPT_LYDIAN),

    /**
     * Avestan. Since 2.26
     */
    AVESTAN(GUnicodeScript.G_UNICODE_SCRIPT_AVESTAN),

    /**
     * Bamum. Since 2.26
     */
    BAMUM(GUnicodeScript.G_UNICODE_SCRIPT_BAMUM),

    /**
     * Egyptian Hieroglpyhs. Since 2.26
     */
    EGYPTIAN_HIEROGLYPHS(GUnicodeScript.G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS),

    /**
     * Imperial Aramaic. Since 2.26
     */
    IMPERIAL_ARAMAIC(GUnicodeScript.G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC),

    /**
     * Inscriptional Pahlavi. Since 2.26
     */
    INSCRIPTIONAL_PAHLAVI(GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI),

    /**
     * Inscriptional Parthian. Since 2.26
     */
    INSCRIPTIONAL_PARTHIAN(GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN),

    /**
     * Javanese. Since 2.26
     */
    JAVANESE(GUnicodeScript.G_UNICODE_SCRIPT_JAVANESE),

    /**
     * Kaithi. Since 2.26
     */
    KAITHI(GUnicodeScript.G_UNICODE_SCRIPT_KAITHI),

    /**
     * Lisu. Since 2.26
     */
    LISU(GUnicodeScript.G_UNICODE_SCRIPT_LISU),

    /**
     * Meetei Mayek. Since 2.26
     */
    MEETEI_MAYEK(GUnicodeScript.G_UNICODE_SCRIPT_MEETEI_MAYEK),

    /**
     * Old South Arabian. Since 2.26
     */
    OLD_SOUTH_ARABIAN(GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN),

    /**
     * Old Turkic. Since 2.28
     */
    OLD_TURKIC(GUnicodeScript.G_UNICODE_SCRIPT_OLD_TURKIC),

    /**
     * Samaritan. Since 2.26
     */
    SAMARITAN(GUnicodeScript.G_UNICODE_SCRIPT_SAMARITAN),

    /**
     * Tai Tham. Since 2.26
     */
    TAI_THAM(GUnicodeScript.G_UNICODE_SCRIPT_TAI_THAM),

    /**
     * Tai Viet. Since 2.26
     */
    TAI_VIET(GUnicodeScript.G_UNICODE_SCRIPT_TAI_VIET),

    /**
     * Batak. Since 2.28
     */
    BATAK(GUnicodeScript.G_UNICODE_SCRIPT_BATAK),

    /**
     * Brahmi. Since 2.28
     */
    BRAHMI(GUnicodeScript.G_UNICODE_SCRIPT_BRAHMI),

    /**
     * Mandaic. Since 2.28
     */
    MANDAIC(GUnicodeScript.G_UNICODE_SCRIPT_MANDAIC),

    /**
     * Chakma. Since: 2.32
     */
    CHAKMA(GUnicodeScript.G_UNICODE_SCRIPT_CHAKMA),

    /**
     * Meroitic Cursive. Since: 2.32
     */
    MEROITIC_CURSIVE(GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_CURSIVE),

    /**
     * Meroitic Hieroglyphs. Since: 2.32
     */
    MEROITIC_HIEROGLYPHS(GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS),

    /**
     * Miao. Since: 2.32
     */
    MIAO(GUnicodeScript.G_UNICODE_SCRIPT_MIAO),

    /**
     * Sharada. Since: 2.32
     */
    SHARADA(GUnicodeScript.G_UNICODE_SCRIPT_SHARADA),

    /**
     * Sora Sompeng. Since: 2.32
     */
    SORA_SOMPENG(GUnicodeScript.G_UNICODE_SCRIPT_SORA_SOMPENG),

    /**
     * Takri. Since: 2.32
     */
    TAKRI(GUnicodeScript.G_UNICODE_SCRIPT_TAKRI),

    /**
     * Bassa. Since: 2.42
     */
    BASSA_VAH(GUnicodeScript.G_UNICODE_SCRIPT_BASSA_VAH),

    /**
     * Caucasian Albanian. Since: 2.42
     */
    CAUCASIAN_ALBANIAN(GUnicodeScript.G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN),

    /**
     * Duployan. Since: 2.42
     */
    DUPLOYAN(GUnicodeScript.G_UNICODE_SCRIPT_DUPLOYAN),

    /**
     * Elbasan. Since: 2.42
     */
    ELBASAN(GUnicodeScript.G_UNICODE_SCRIPT_ELBASAN),

    /**
     * Grantha. Since: 2.42
     */
    GRANTHA(GUnicodeScript.G_UNICODE_SCRIPT_GRANTHA),

    /**
     * Kjohki. Since: 2.42
     */
    KHOJKI(GUnicodeScript.G_UNICODE_SCRIPT_KHOJKI),

    /**
     * Khudawadi, Sindhi. Since: 2.42
     */
    KHUDAWADI(GUnicodeScript.G_UNICODE_SCRIPT_KHUDAWADI),

    /**
     * Linear A. Since: 2.42
     */
    LINEAR_A(GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_A),

    /**
     * Mahajani. Since: 2.42
     */
    MAHAJANI(GUnicodeScript.G_UNICODE_SCRIPT_MAHAJANI),

    /**
     * Manichaean. Since: 2.42
     */
    MANICHAEAN(GUnicodeScript.G_UNICODE_SCRIPT_MANICHAEAN),

    /**
     * Mende Kikakui. Since: 2.42
     */
    MENDE_KIKAKUI(GUnicodeScript.G_UNICODE_SCRIPT_MENDE_KIKAKUI),

    /**
     * Modi. Since: 2.42
     */
    MODI(GUnicodeScript.G_UNICODE_SCRIPT_MODI),

    /**
     * Mro. Since: 2.42
     */
    MRO(GUnicodeScript.G_UNICODE_SCRIPT_MRO),

    /**
     * Nabataean. Since: 2.42
     */
    NABATAEAN(GUnicodeScript.G_UNICODE_SCRIPT_NABATAEAN),

    /**
     * Old North Arabian. Since: 2.42
     */
    OLD_NORTH_ARABIAN(GUnicodeScript.G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN),

    /**
     * Old Permic. Since: 2.42
     */
    OLD_PERMIC(GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERMIC),

    /**
     * Pahawh Hmong. Since: 2.42
     */
    PAHAWH_HMONG(GUnicodeScript.G_UNICODE_SCRIPT_PAHAWH_HMONG),

    /**
     * Palmyrene. Since: 2.42
     */
    PALMYRENE(GUnicodeScript.G_UNICODE_SCRIPT_PALMYRENE),

    /**
     * Pau Cin Hau. Since: 2.42
     */
    PAU_CIN_HAU(GUnicodeScript.G_UNICODE_SCRIPT_PAU_CIN_HAU),

    /**
     * Psalter Pahlavi. Since: 2.42
     */
    PSALTER_PAHLAVI(GUnicodeScript.G_UNICODE_SCRIPT_PSALTER_PAHLAVI),

    /**
     * Siddham. Since: 2.42
     */
    SIDDHAM(GUnicodeScript.G_UNICODE_SCRIPT_SIDDHAM),

    /**
     * Tirhuta. Since: 2.42
     */
    TIRHUTA(GUnicodeScript.G_UNICODE_SCRIPT_TIRHUTA),

    /**
     * Warang Citi. Since: 2.42
     */
    WARANG_CITI(GUnicodeScript.G_UNICODE_SCRIPT_WARANG_CITI),

    /**
     * Ahom. Since: 2.48
     */
    AHOM(GUnicodeScript.G_UNICODE_SCRIPT_AHOM),

    /**
     * Anatolian Hieroglyphs. Since: 2.48
     */
    ANATOLIAN_HIEROGLYPHS(GUnicodeScript.G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS),

    /**
     * Hatran. Since: 2.48
     */
    HATRAN(GUnicodeScript.G_UNICODE_SCRIPT_HATRAN),

    /**
     * Multani. Since: 2.48
     */
    MULTANI(GUnicodeScript.G_UNICODE_SCRIPT_MULTANI),

    /**
     * Old Hungarian. Since: 2.48
     */
    OLD_HUNGARIAN(GUnicodeScript.G_UNICODE_SCRIPT_OLD_HUNGARIAN),

    /**
     * Signwriting. Since: 2.48
     */
    SIGNWRITING(GUnicodeScript.G_UNICODE_SCRIPT_SIGNWRITING),

    /**
     * Adlam. Since: 2.50
     */
    ADLAM(GUnicodeScript.G_UNICODE_SCRIPT_ADLAM),

    /**
     * Bhaiksuki. Since: 2.50
     */
    BHAIKSUKI(GUnicodeScript.G_UNICODE_SCRIPT_BHAIKSUKI),

    /**
     * Marchen. Since: 2.50
     */
    MARCHEN(GUnicodeScript.G_UNICODE_SCRIPT_MARCHEN),

    /**
     * Newa. Since: 2.50
     */
    NEWA(GUnicodeScript.G_UNICODE_SCRIPT_NEWA),

    /**
     * Osage. Since: 2.50
     */
    OSAGE(GUnicodeScript.G_UNICODE_SCRIPT_OSAGE),

    /**
     * Tangut. Since: 2.50
     */
    TANGUT(GUnicodeScript.G_UNICODE_SCRIPT_TANGUT),

    /**
     * Masaram Gondi. Since: 2.54
     */
    MASARAM_GONDI(GUnicodeScript.G_UNICODE_SCRIPT_MASARAM_GONDI),

    /**
     * Nushu. Since: 2.54
     */
    NUSHU(GUnicodeScript.G_UNICODE_SCRIPT_NUSHU),

    /**
     * Soyombo. Since: 2.54
     */
    SOYOMBO(GUnicodeScript.G_UNICODE_SCRIPT_SOYOMBO),

    /**
     * Zanabazar Square. Since: 2.54
     */
    ZANABAZAR_SQUARE(GUnicodeScript.G_UNICODE_SCRIPT_ZANABAZAR_SQUARE),

    /**
     * Dogra. Since: 2.58
     */
    DOGRA(GUnicodeScript.G_UNICODE_SCRIPT_DOGRA),

    /**
     * Gunjala Gondi. Since: 2.58
     */
    GUNJALA_GONDI(GUnicodeScript.G_UNICODE_SCRIPT_GUNJALA_GONDI),

    /**
     * Hanifi Rohingya. Since: 2.58
     */
    HANIFI_ROHINGYA(GUnicodeScript.G_UNICODE_SCRIPT_HANIFI_ROHINGYA),

    /**
     * Makasar. Since: 2.58
     */
    MAKASAR(GUnicodeScript.G_UNICODE_SCRIPT_MAKASAR),

    /**
     * Medefaidrin. Since: 2.58
     */
    MEDEFAIDRIN(GUnicodeScript.G_UNICODE_SCRIPT_MEDEFAIDRIN),

    /**
     * Old Sogdian. Since: 2.58
     */
    OLD_SOGDIAN(GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOGDIAN),

    /**
     * Sogdian. Since: 2.58
     */
    SOGDIAN(GUnicodeScript.G_UNICODE_SCRIPT_SOGDIAN),

    /**
     * Elym. Since: 2.62
     */
    ELYMAIC(GUnicodeScript.G_UNICODE_SCRIPT_ELYMAIC),

    /**
     * Nand. Since: 2.62
     */
    NANDINAGARI(GUnicodeScript.G_UNICODE_SCRIPT_NANDINAGARI),

    /**
     * Rohg. Since: 2.62
     */
    NYIAKENG_PUACHUE_HMONG(GUnicodeScript.G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG),

    /**
     * Wcho. Since: 2.62
     */
    WANCHO(GUnicodeScript.G_UNICODE_SCRIPT_WANCHO),

    /**
     * Chorasmian. Since: 2.66
     */
    CHORASMIAN(GUnicodeScript.G_UNICODE_SCRIPT_CHORASMIAN),

    /**
     * Dives Akuru. Since: 2.66
     */
    DIVES_AKURU(GUnicodeScript.G_UNICODE_SCRIPT_DIVES_AKURU),

    /**
     * Khitan small script. Since: 2.66
     */
    KHITAN_SMALL_SCRIPT(GUnicodeScript.G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT),

    /**
     * Yezidi. Since: 2.66
     */
    YEZIDI(GUnicodeScript.G_UNICODE_SCRIPT_YEZIDI),

    /**
     * Cypro-Minoan. Since: 2.72
     */
    CYPRO_MINOAN(GUnicodeScript.G_UNICODE_SCRIPT_CYPRO_MINOAN),

    /**
     * Old Uyghur. Since: 2.72
     */
    OLD_UYGHUR(GUnicodeScript.G_UNICODE_SCRIPT_OLD_UYGHUR),

    /**
     * Tangsa. Since: 2.72
     */
    TANGSA(GUnicodeScript.G_UNICODE_SCRIPT_TANGSA),

    /**
     * Toto. Since: 2.72
     */
    TOTO(GUnicodeScript.G_UNICODE_SCRIPT_TOTO),

    /**
     * Vithkuqi. Since: 2.72
     */
    VITHKUQI(GUnicodeScript.G_UNICODE_SCRIPT_VITHKUQI),

    /**
     * Mathematical notation. Since: 2.72
     */
    MATH(GUnicodeScript.G_UNICODE_SCRIPT_MATH),

    /**
     * Kawi. Since 2.74
     */
    KAWI(GUnicodeScript.G_UNICODE_SCRIPT_KAWI),

    /**
     * Nag Mundari. Since 2.74
     */
    NAG_MUNDARI(GUnicodeScript.G_UNICODE_SCRIPT_NAG_MUNDARI),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GUnicodeScript): UnicodeScript = when (nativeValue) {
            GUnicodeScript.G_UNICODE_SCRIPT_INVALID_CODE -> INVALID_CODE
            GUnicodeScript.G_UNICODE_SCRIPT_COMMON -> COMMON
            GUnicodeScript.G_UNICODE_SCRIPT_INHERITED -> INHERITED
            GUnicodeScript.G_UNICODE_SCRIPT_ARABIC -> ARABIC
            GUnicodeScript.G_UNICODE_SCRIPT_ARMENIAN -> ARMENIAN
            GUnicodeScript.G_UNICODE_SCRIPT_BENGALI -> BENGALI
            GUnicodeScript.G_UNICODE_SCRIPT_BOPOMOFO -> BOPOMOFO
            GUnicodeScript.G_UNICODE_SCRIPT_CHEROKEE -> CHEROKEE
            GUnicodeScript.G_UNICODE_SCRIPT_COPTIC -> COPTIC
            GUnicodeScript.G_UNICODE_SCRIPT_CYRILLIC -> CYRILLIC
            GUnicodeScript.G_UNICODE_SCRIPT_DESERET -> DESERET
            GUnicodeScript.G_UNICODE_SCRIPT_DEVANAGARI -> DEVANAGARI
            GUnicodeScript.G_UNICODE_SCRIPT_ETHIOPIC -> ETHIOPIC
            GUnicodeScript.G_UNICODE_SCRIPT_GEORGIAN -> GEORGIAN
            GUnicodeScript.G_UNICODE_SCRIPT_GOTHIC -> GOTHIC
            GUnicodeScript.G_UNICODE_SCRIPT_GREEK -> GREEK
            GUnicodeScript.G_UNICODE_SCRIPT_GUJARATI -> GUJARATI
            GUnicodeScript.G_UNICODE_SCRIPT_GURMUKHI -> GURMUKHI
            GUnicodeScript.G_UNICODE_SCRIPT_HAN -> HAN
            GUnicodeScript.G_UNICODE_SCRIPT_HANGUL -> HANGUL
            GUnicodeScript.G_UNICODE_SCRIPT_HEBREW -> HEBREW
            GUnicodeScript.G_UNICODE_SCRIPT_HIRAGANA -> HIRAGANA
            GUnicodeScript.G_UNICODE_SCRIPT_KANNADA -> KANNADA
            GUnicodeScript.G_UNICODE_SCRIPT_KATAKANA -> KATAKANA
            GUnicodeScript.G_UNICODE_SCRIPT_KHMER -> KHMER
            GUnicodeScript.G_UNICODE_SCRIPT_LAO -> LAO
            GUnicodeScript.G_UNICODE_SCRIPT_LATIN -> LATIN
            GUnicodeScript.G_UNICODE_SCRIPT_MALAYALAM -> MALAYALAM
            GUnicodeScript.G_UNICODE_SCRIPT_MONGOLIAN -> MONGOLIAN
            GUnicodeScript.G_UNICODE_SCRIPT_MYANMAR -> MYANMAR
            GUnicodeScript.G_UNICODE_SCRIPT_OGHAM -> OGHAM
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_ITALIC -> OLD_ITALIC
            GUnicodeScript.G_UNICODE_SCRIPT_ORIYA -> ORIYA
            GUnicodeScript.G_UNICODE_SCRIPT_RUNIC -> RUNIC
            GUnicodeScript.G_UNICODE_SCRIPT_SINHALA -> SINHALA
            GUnicodeScript.G_UNICODE_SCRIPT_SYRIAC -> SYRIAC
            GUnicodeScript.G_UNICODE_SCRIPT_TAMIL -> TAMIL
            GUnicodeScript.G_UNICODE_SCRIPT_TELUGU -> TELUGU
            GUnicodeScript.G_UNICODE_SCRIPT_THAANA -> THAANA
            GUnicodeScript.G_UNICODE_SCRIPT_THAI -> THAI
            GUnicodeScript.G_UNICODE_SCRIPT_TIBETAN -> TIBETAN
            GUnicodeScript.G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL -> CANADIAN_ABORIGINAL
            GUnicodeScript.G_UNICODE_SCRIPT_YI -> YI
            GUnicodeScript.G_UNICODE_SCRIPT_TAGALOG -> TAGALOG
            GUnicodeScript.G_UNICODE_SCRIPT_HANUNOO -> HANUNOO
            GUnicodeScript.G_UNICODE_SCRIPT_BUHID -> BUHID
            GUnicodeScript.G_UNICODE_SCRIPT_TAGBANWA -> TAGBANWA
            GUnicodeScript.G_UNICODE_SCRIPT_BRAILLE -> BRAILLE
            GUnicodeScript.G_UNICODE_SCRIPT_CYPRIOT -> CYPRIOT
            GUnicodeScript.G_UNICODE_SCRIPT_LIMBU -> LIMBU
            GUnicodeScript.G_UNICODE_SCRIPT_OSMANYA -> OSMANYA
            GUnicodeScript.G_UNICODE_SCRIPT_SHAVIAN -> SHAVIAN
            GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_B -> LINEAR_B
            GUnicodeScript.G_UNICODE_SCRIPT_TAI_LE -> TAI_LE
            GUnicodeScript.G_UNICODE_SCRIPT_UGARITIC -> UGARITIC
            GUnicodeScript.G_UNICODE_SCRIPT_NEW_TAI_LUE -> NEW_TAI_LUE
            GUnicodeScript.G_UNICODE_SCRIPT_BUGINESE -> BUGINESE
            GUnicodeScript.G_UNICODE_SCRIPT_GLAGOLITIC -> GLAGOLITIC
            GUnicodeScript.G_UNICODE_SCRIPT_TIFINAGH -> TIFINAGH
            GUnicodeScript.G_UNICODE_SCRIPT_SYLOTI_NAGRI -> SYLOTI_NAGRI
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERSIAN -> OLD_PERSIAN
            GUnicodeScript.G_UNICODE_SCRIPT_KHAROSHTHI -> KHAROSHTHI
            GUnicodeScript.G_UNICODE_SCRIPT_UNKNOWN -> UNKNOWN
            GUnicodeScript.G_UNICODE_SCRIPT_BALINESE -> BALINESE
            GUnicodeScript.G_UNICODE_SCRIPT_CUNEIFORM -> CUNEIFORM
            GUnicodeScript.G_UNICODE_SCRIPT_PHOENICIAN -> PHOENICIAN
            GUnicodeScript.G_UNICODE_SCRIPT_PHAGS_PA -> PHAGS_PA
            GUnicodeScript.G_UNICODE_SCRIPT_NKO -> NKO
            GUnicodeScript.G_UNICODE_SCRIPT_KAYAH_LI -> KAYAH_LI
            GUnicodeScript.G_UNICODE_SCRIPT_LEPCHA -> LEPCHA
            GUnicodeScript.G_UNICODE_SCRIPT_REJANG -> REJANG
            GUnicodeScript.G_UNICODE_SCRIPT_SUNDANESE -> SUNDANESE
            GUnicodeScript.G_UNICODE_SCRIPT_SAURASHTRA -> SAURASHTRA
            GUnicodeScript.G_UNICODE_SCRIPT_CHAM -> CHAM
            GUnicodeScript.G_UNICODE_SCRIPT_OL_CHIKI -> OL_CHIKI
            GUnicodeScript.G_UNICODE_SCRIPT_VAI -> VAI
            GUnicodeScript.G_UNICODE_SCRIPT_CARIAN -> CARIAN
            GUnicodeScript.G_UNICODE_SCRIPT_LYCIAN -> LYCIAN
            GUnicodeScript.G_UNICODE_SCRIPT_LYDIAN -> LYDIAN
            GUnicodeScript.G_UNICODE_SCRIPT_AVESTAN -> AVESTAN
            GUnicodeScript.G_UNICODE_SCRIPT_BAMUM -> BAMUM
            GUnicodeScript.G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS -> EGYPTIAN_HIEROGLYPHS
            GUnicodeScript.G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC -> IMPERIAL_ARAMAIC
            GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI -> INSCRIPTIONAL_PAHLAVI
            GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN -> INSCRIPTIONAL_PARTHIAN
            GUnicodeScript.G_UNICODE_SCRIPT_JAVANESE -> JAVANESE
            GUnicodeScript.G_UNICODE_SCRIPT_KAITHI -> KAITHI
            GUnicodeScript.G_UNICODE_SCRIPT_LISU -> LISU
            GUnicodeScript.G_UNICODE_SCRIPT_MEETEI_MAYEK -> MEETEI_MAYEK
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN -> OLD_SOUTH_ARABIAN
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_TURKIC -> OLD_TURKIC
            GUnicodeScript.G_UNICODE_SCRIPT_SAMARITAN -> SAMARITAN
            GUnicodeScript.G_UNICODE_SCRIPT_TAI_THAM -> TAI_THAM
            GUnicodeScript.G_UNICODE_SCRIPT_TAI_VIET -> TAI_VIET
            GUnicodeScript.G_UNICODE_SCRIPT_BATAK -> BATAK
            GUnicodeScript.G_UNICODE_SCRIPT_BRAHMI -> BRAHMI
            GUnicodeScript.G_UNICODE_SCRIPT_MANDAIC -> MANDAIC
            GUnicodeScript.G_UNICODE_SCRIPT_CHAKMA -> CHAKMA
            GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_CURSIVE -> MEROITIC_CURSIVE
            GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS -> MEROITIC_HIEROGLYPHS
            GUnicodeScript.G_UNICODE_SCRIPT_MIAO -> MIAO
            GUnicodeScript.G_UNICODE_SCRIPT_SHARADA -> SHARADA
            GUnicodeScript.G_UNICODE_SCRIPT_SORA_SOMPENG -> SORA_SOMPENG
            GUnicodeScript.G_UNICODE_SCRIPT_TAKRI -> TAKRI
            GUnicodeScript.G_UNICODE_SCRIPT_BASSA_VAH -> BASSA_VAH
            GUnicodeScript.G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN -> CAUCASIAN_ALBANIAN
            GUnicodeScript.G_UNICODE_SCRIPT_DUPLOYAN -> DUPLOYAN
            GUnicodeScript.G_UNICODE_SCRIPT_ELBASAN -> ELBASAN
            GUnicodeScript.G_UNICODE_SCRIPT_GRANTHA -> GRANTHA
            GUnicodeScript.G_UNICODE_SCRIPT_KHOJKI -> KHOJKI
            GUnicodeScript.G_UNICODE_SCRIPT_KHUDAWADI -> KHUDAWADI
            GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_A -> LINEAR_A
            GUnicodeScript.G_UNICODE_SCRIPT_MAHAJANI -> MAHAJANI
            GUnicodeScript.G_UNICODE_SCRIPT_MANICHAEAN -> MANICHAEAN
            GUnicodeScript.G_UNICODE_SCRIPT_MENDE_KIKAKUI -> MENDE_KIKAKUI
            GUnicodeScript.G_UNICODE_SCRIPT_MODI -> MODI
            GUnicodeScript.G_UNICODE_SCRIPT_MRO -> MRO
            GUnicodeScript.G_UNICODE_SCRIPT_NABATAEAN -> NABATAEAN
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN -> OLD_NORTH_ARABIAN
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERMIC -> OLD_PERMIC
            GUnicodeScript.G_UNICODE_SCRIPT_PAHAWH_HMONG -> PAHAWH_HMONG
            GUnicodeScript.G_UNICODE_SCRIPT_PALMYRENE -> PALMYRENE
            GUnicodeScript.G_UNICODE_SCRIPT_PAU_CIN_HAU -> PAU_CIN_HAU
            GUnicodeScript.G_UNICODE_SCRIPT_PSALTER_PAHLAVI -> PSALTER_PAHLAVI
            GUnicodeScript.G_UNICODE_SCRIPT_SIDDHAM -> SIDDHAM
            GUnicodeScript.G_UNICODE_SCRIPT_TIRHUTA -> TIRHUTA
            GUnicodeScript.G_UNICODE_SCRIPT_WARANG_CITI -> WARANG_CITI
            GUnicodeScript.G_UNICODE_SCRIPT_AHOM -> AHOM
            GUnicodeScript.G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS -> ANATOLIAN_HIEROGLYPHS
            GUnicodeScript.G_UNICODE_SCRIPT_HATRAN -> HATRAN
            GUnicodeScript.G_UNICODE_SCRIPT_MULTANI -> MULTANI
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_HUNGARIAN -> OLD_HUNGARIAN
            GUnicodeScript.G_UNICODE_SCRIPT_SIGNWRITING -> SIGNWRITING
            GUnicodeScript.G_UNICODE_SCRIPT_ADLAM -> ADLAM
            GUnicodeScript.G_UNICODE_SCRIPT_BHAIKSUKI -> BHAIKSUKI
            GUnicodeScript.G_UNICODE_SCRIPT_MARCHEN -> MARCHEN
            GUnicodeScript.G_UNICODE_SCRIPT_NEWA -> NEWA
            GUnicodeScript.G_UNICODE_SCRIPT_OSAGE -> OSAGE
            GUnicodeScript.G_UNICODE_SCRIPT_TANGUT -> TANGUT
            GUnicodeScript.G_UNICODE_SCRIPT_MASARAM_GONDI -> MASARAM_GONDI
            GUnicodeScript.G_UNICODE_SCRIPT_NUSHU -> NUSHU
            GUnicodeScript.G_UNICODE_SCRIPT_SOYOMBO -> SOYOMBO
            GUnicodeScript.G_UNICODE_SCRIPT_ZANABAZAR_SQUARE -> ZANABAZAR_SQUARE
            GUnicodeScript.G_UNICODE_SCRIPT_DOGRA -> DOGRA
            GUnicodeScript.G_UNICODE_SCRIPT_GUNJALA_GONDI -> GUNJALA_GONDI
            GUnicodeScript.G_UNICODE_SCRIPT_HANIFI_ROHINGYA -> HANIFI_ROHINGYA
            GUnicodeScript.G_UNICODE_SCRIPT_MAKASAR -> MAKASAR
            GUnicodeScript.G_UNICODE_SCRIPT_MEDEFAIDRIN -> MEDEFAIDRIN
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOGDIAN -> OLD_SOGDIAN
            GUnicodeScript.G_UNICODE_SCRIPT_SOGDIAN -> SOGDIAN
            GUnicodeScript.G_UNICODE_SCRIPT_ELYMAIC -> ELYMAIC
            GUnicodeScript.G_UNICODE_SCRIPT_NANDINAGARI -> NANDINAGARI
            GUnicodeScript.G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG -> NYIAKENG_PUACHUE_HMONG
            GUnicodeScript.G_UNICODE_SCRIPT_WANCHO -> WANCHO
            GUnicodeScript.G_UNICODE_SCRIPT_CHORASMIAN -> CHORASMIAN
            GUnicodeScript.G_UNICODE_SCRIPT_DIVES_AKURU -> DIVES_AKURU
            GUnicodeScript.G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT -> KHITAN_SMALL_SCRIPT
            GUnicodeScript.G_UNICODE_SCRIPT_YEZIDI -> YEZIDI
            GUnicodeScript.G_UNICODE_SCRIPT_CYPRO_MINOAN -> CYPRO_MINOAN
            GUnicodeScript.G_UNICODE_SCRIPT_OLD_UYGHUR -> OLD_UYGHUR
            GUnicodeScript.G_UNICODE_SCRIPT_TANGSA -> TANGSA
            GUnicodeScript.G_UNICODE_SCRIPT_TOTO -> TOTO
            GUnicodeScript.G_UNICODE_SCRIPT_VITHKUQI -> VITHKUQI
            GUnicodeScript.G_UNICODE_SCRIPT_MATH -> MATH
            GUnicodeScript.G_UNICODE_SCRIPT_KAWI -> KAWI
            GUnicodeScript.G_UNICODE_SCRIPT_NAG_MUNDARI -> NAG_MUNDARI
            else -> error("invalid nativeValue")
        }

        /**
         * Looks up the Unicode script for @iso15924.  ISO 15924 assigns four-letter
         * codes to scripts.  For example, the code for Arabic is 'Arab'.
         * This function accepts four letter codes encoded as a @guint32 in a
         * big-endian fashion.  That is, the code expected for Arabic is
         * 0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
         *
         * See
         * [Codes for the representation of names of scripts](http://unicode.org/iso15924/codelists.html)
         * for details.
         *
         * @param iso15924 a Unicode script
         * @return the Unicode script for @iso15924, or
         *   of %G_UNICODE_SCRIPT_INVALID_CODE if @iso15924 is zero and
         *   %G_UNICODE_SCRIPT_UNKNOWN if @iso15924 is unknown.
         * @since 2.30
         */
        @GLibVersion2_30
        public fun fromIso15924(iso15924: guint): UnicodeScript = g_unicode_script_from_iso15924(iso15924).run {
            UnicodeScript.fromNativeValue(this)
        }

        /**
         * Looks up the ISO 15924 code for @script.  ISO 15924 assigns four-letter
         * codes to scripts.  For example, the code for Arabic is 'Arab'.  The
         * four letter codes are encoded as a @guint32 by this function in a
         * big-endian fashion.  That is, the code returned for Arabic is
         * 0x41726162 (0x41 is ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
         *
         * See
         * [Codes for the representation of names of scripts](http://unicode.org/iso15924/codelists.html)
         * for details.
         *
         * @param script a Unicode script
         * @return the ISO 15924 code for @script, encoded as an integer,
         *   of zero if @script is %G_UNICODE_SCRIPT_INVALID_CODE or
         *   ISO 15924 code 'Zzzz' (script code for UNKNOWN) if @script is not understood.
         * @since 2.30
         */
        @GLibVersion2_30
        public fun toIso15924(script: UnicodeScript): guint = g_unicode_script_to_iso15924(script.nativeValue)

        /**
         * Get the GType of UnicodeScript
         *
         * @return the GType
         */
        public fun getType(): GType = g_unicode_script_get_type()
    }
}
