// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gunichar
import org.gtkkn.native.pango.PangoBidiType
import org.gtkkn.native.pango.pango_bidi_type_for_unichar
import org.gtkkn.native.pango.pango_bidi_type_get_type

/**
 * `PangoBidiType` represents the bidirectional character
 * type of a Unicode character.
 *
 * The values in this enumeration are specified by the
 * [Unicode bidirectional algorithm](http://www.unicode.org/reports/tr9/).
 * @since 1.22
 */
@PangoVersion1_22
public enum class BidiType(public val nativeValue: PangoBidiType) {
    /**
     * Left-to-Right
     */
    L(PangoBidiType.PANGO_BIDI_TYPE_L),

    /**
     * Left-to-Right Embedding
     */
    LRE(PangoBidiType.PANGO_BIDI_TYPE_LRE),

    /**
     * Left-to-Right Override
     */
    LRO(PangoBidiType.PANGO_BIDI_TYPE_LRO),

    /**
     * Right-to-Left
     */
    R(PangoBidiType.PANGO_BIDI_TYPE_R),

    /**
     * Right-to-Left Arabic
     */
    AL(PangoBidiType.PANGO_BIDI_TYPE_AL),

    /**
     * Right-to-Left Embedding
     */
    RLE(PangoBidiType.PANGO_BIDI_TYPE_RLE),

    /**
     * Right-to-Left Override
     */
    RLO(PangoBidiType.PANGO_BIDI_TYPE_RLO),

    /**
     * Pop Directional Format
     */
    PDF(PangoBidiType.PANGO_BIDI_TYPE_PDF),

    /**
     * European Number
     */
    EN(PangoBidiType.PANGO_BIDI_TYPE_EN),

    /**
     * European Number Separator
     */
    ES(PangoBidiType.PANGO_BIDI_TYPE_ES),

    /**
     * European Number Terminator
     */
    ET(PangoBidiType.PANGO_BIDI_TYPE_ET),

    /**
     * Arabic Number
     */
    AN(PangoBidiType.PANGO_BIDI_TYPE_AN),

    /**
     * Common Number Separator
     */
    CS(PangoBidiType.PANGO_BIDI_TYPE_CS),

    /**
     * Nonspacing Mark
     */
    NSM(PangoBidiType.PANGO_BIDI_TYPE_NSM),

    /**
     * Boundary Neutral
     */
    BN(PangoBidiType.PANGO_BIDI_TYPE_BN),

    /**
     * Paragraph Separator
     */
    B(PangoBidiType.PANGO_BIDI_TYPE_B),

    /**
     * Segment Separator
     */
    S(PangoBidiType.PANGO_BIDI_TYPE_S),

    /**
     * Whitespace
     */
    WS(PangoBidiType.PANGO_BIDI_TYPE_WS),

    /**
     * Other Neutrals
     */
    ON(PangoBidiType.PANGO_BIDI_TYPE_ON),

    /**
     * Left-to-Right isolate. Since 1.48.6
     */
    LRI(PangoBidiType.PANGO_BIDI_TYPE_LRI),

    /**
     * Right-to-Left isolate. Since 1.48.6
     */
    RLI(PangoBidiType.PANGO_BIDI_TYPE_RLI),

    /**
     * First strong isolate. Since 1.48.6
     */
    FSI(PangoBidiType.PANGO_BIDI_TYPE_FSI),

    /**
     * Pop directional isolate. Since 1.48.6
     */
    PDI(PangoBidiType.PANGO_BIDI_TYPE_PDI),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoBidiType): BidiType = when (nativeValue) {
            PangoBidiType.PANGO_BIDI_TYPE_L -> L
            PangoBidiType.PANGO_BIDI_TYPE_LRE -> LRE
            PangoBidiType.PANGO_BIDI_TYPE_LRO -> LRO
            PangoBidiType.PANGO_BIDI_TYPE_R -> R
            PangoBidiType.PANGO_BIDI_TYPE_AL -> AL
            PangoBidiType.PANGO_BIDI_TYPE_RLE -> RLE
            PangoBidiType.PANGO_BIDI_TYPE_RLO -> RLO
            PangoBidiType.PANGO_BIDI_TYPE_PDF -> PDF
            PangoBidiType.PANGO_BIDI_TYPE_EN -> EN
            PangoBidiType.PANGO_BIDI_TYPE_ES -> ES
            PangoBidiType.PANGO_BIDI_TYPE_ET -> ET
            PangoBidiType.PANGO_BIDI_TYPE_AN -> AN
            PangoBidiType.PANGO_BIDI_TYPE_CS -> CS
            PangoBidiType.PANGO_BIDI_TYPE_NSM -> NSM
            PangoBidiType.PANGO_BIDI_TYPE_BN -> BN
            PangoBidiType.PANGO_BIDI_TYPE_B -> B
            PangoBidiType.PANGO_BIDI_TYPE_S -> S
            PangoBidiType.PANGO_BIDI_TYPE_WS -> WS
            PangoBidiType.PANGO_BIDI_TYPE_ON -> ON
            PangoBidiType.PANGO_BIDI_TYPE_LRI -> LRI
            PangoBidiType.PANGO_BIDI_TYPE_RLI -> RLI
            PangoBidiType.PANGO_BIDI_TYPE_FSI -> FSI
            PangoBidiType.PANGO_BIDI_TYPE_PDI -> PDI
            else -> error("invalid nativeValue")
        }

        /**
         * Determines the bidirectional type of a character.
         *
         * The bidirectional type is specified in the Unicode Character Database.
         *
         * A simplified version of this function is available as [func@unichar_direction].
         *
         * @param ch a Unicode character
         * @return the bidirectional character type, as used in the
         * Unicode bidirectional algorithm.
         * @since 1.22
         */
        @PangoVersion1_22
        public fun forUnichar(ch: gunichar): BidiType = pango_bidi_type_for_unichar(ch).run {
            BidiType.fromNativeValue(this)
        }

        /**
         * Get the GType of BidiType
         *
         * @return the GType
         */
        public fun getType(): GType = pango_bidi_type_get_type()
    }
}
