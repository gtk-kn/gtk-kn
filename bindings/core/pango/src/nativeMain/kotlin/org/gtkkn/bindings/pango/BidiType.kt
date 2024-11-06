// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.native.pango.PangoBidiType
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_AL
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_AN
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_B
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_BN
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_CS
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_EN
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_ES
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_ET
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_FSI
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_L
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_LRE
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_LRI
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_LRO
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_NSM
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_ON
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_PDF
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_PDI
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_R
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_RLE
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_RLI
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_RLO
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_S
import org.gtkkn.native.pango.PangoBidiType.PANGO_BIDI_TYPE_WS
import org.gtkkn.native.pango.pango_bidi_type_for_unichar
import kotlin.UInt

/**
 * `PangoBidiType` represents the bidirectional character
 * type of a Unicode character.
 *
 * The values in this enumeration are specified by the
 * [Unicode bidirectional algorithm](http://www.unicode.org/reports/tr9/).
 * @since 1.22
 */
@PangoVersion1_22
public enum class BidiType(
    public val nativeValue: PangoBidiType,
) {
    /**
     * Left-to-Right
     */
    L(PANGO_BIDI_TYPE_L),

    /**
     * Left-to-Right Embedding
     */
    LRE(PANGO_BIDI_TYPE_LRE),

    /**
     * Left-to-Right Override
     */
    LRO(PANGO_BIDI_TYPE_LRO),

    /**
     * Right-to-Left
     */
    R(PANGO_BIDI_TYPE_R),

    /**
     * Right-to-Left Arabic
     */
    AL(PANGO_BIDI_TYPE_AL),

    /**
     * Right-to-Left Embedding
     */
    RLE(PANGO_BIDI_TYPE_RLE),

    /**
     * Right-to-Left Override
     */
    RLO(PANGO_BIDI_TYPE_RLO),

    /**
     * Pop Directional Format
     */
    PDF(PANGO_BIDI_TYPE_PDF),

    /**
     * European Number
     */
    EN(PANGO_BIDI_TYPE_EN),

    /**
     * European Number Separator
     */
    ES(PANGO_BIDI_TYPE_ES),

    /**
     * European Number Terminator
     */
    ET(PANGO_BIDI_TYPE_ET),

    /**
     * Arabic Number
     */
    AN(PANGO_BIDI_TYPE_AN),

    /**
     * Common Number Separator
     */
    CS(PANGO_BIDI_TYPE_CS),

    /**
     * Nonspacing Mark
     */
    NSM(PANGO_BIDI_TYPE_NSM),

    /**
     * Boundary Neutral
     */
    BN(PANGO_BIDI_TYPE_BN),

    /**
     * Paragraph Separator
     */
    B(PANGO_BIDI_TYPE_B),

    /**
     * Segment Separator
     */
    S(PANGO_BIDI_TYPE_S),

    /**
     * Whitespace
     */
    WS(PANGO_BIDI_TYPE_WS),

    /**
     * Other Neutrals
     */
    ON(PANGO_BIDI_TYPE_ON),

    /**
     * Left-to-Right isolate. Since 1.48.6
     */
    LRI(PANGO_BIDI_TYPE_LRI),

    /**
     * Right-to-Left isolate. Since 1.48.6
     */
    RLI(PANGO_BIDI_TYPE_RLI),

    /**
     * First strong isolate. Since 1.48.6
     */
    FSI(PANGO_BIDI_TYPE_FSI),

    /**
     * Pop directional isolate. Since 1.48.6
     */
    PDI(PANGO_BIDI_TYPE_PDI),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoBidiType): BidiType =
            when (nativeValue) {
                PANGO_BIDI_TYPE_L -> L
                PANGO_BIDI_TYPE_LRE -> LRE
                PANGO_BIDI_TYPE_LRO -> LRO
                PANGO_BIDI_TYPE_R -> R
                PANGO_BIDI_TYPE_AL -> AL
                PANGO_BIDI_TYPE_RLE -> RLE
                PANGO_BIDI_TYPE_RLO -> RLO
                PANGO_BIDI_TYPE_PDF -> PDF
                PANGO_BIDI_TYPE_EN -> EN
                PANGO_BIDI_TYPE_ES -> ES
                PANGO_BIDI_TYPE_ET -> ET
                PANGO_BIDI_TYPE_AN -> AN
                PANGO_BIDI_TYPE_CS -> CS
                PANGO_BIDI_TYPE_NSM -> NSM
                PANGO_BIDI_TYPE_BN -> BN
                PANGO_BIDI_TYPE_B -> B
                PANGO_BIDI_TYPE_S -> S
                PANGO_BIDI_TYPE_WS -> WS
                PANGO_BIDI_TYPE_ON -> ON
                PANGO_BIDI_TYPE_LRI -> LRI
                PANGO_BIDI_TYPE_RLI -> RLI
                PANGO_BIDI_TYPE_FSI -> FSI
                PANGO_BIDI_TYPE_PDI -> PDI
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
        public fun forUnichar(ch: UInt): BidiType =
            pango_bidi_type_for_unichar(ch).run {
                BidiType.fromNativeValue(this)
            }
    }
}
