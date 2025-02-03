// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_22
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoBidiType
import org.gtkkn.native.pango.pango_bidi_type_for_unichar
import org.gtkkn.native.pango.pango_bidi_type_get_type

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.44.
 *
 * Use fribidi for this information
 * ---
 *
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
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Left-to-Right
     */
    L(PangoBidiType.PANGO_BIDI_TYPE_L),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Left-to-Right Embedding
     */
    LRE(PangoBidiType.PANGO_BIDI_TYPE_LRE),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Left-to-Right Override
     */
    LRO(PangoBidiType.PANGO_BIDI_TYPE_LRO),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Right-to-Left
     */
    R(PangoBidiType.PANGO_BIDI_TYPE_R),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Right-to-Left Arabic
     */
    AL(PangoBidiType.PANGO_BIDI_TYPE_AL),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Right-to-Left Embedding
     */
    RLE(PangoBidiType.PANGO_BIDI_TYPE_RLE),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Right-to-Left Override
     */
    RLO(PangoBidiType.PANGO_BIDI_TYPE_RLO),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Pop Directional Format
     */
    PDF(PangoBidiType.PANGO_BIDI_TYPE_PDF),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * European Number
     */
    EN(PangoBidiType.PANGO_BIDI_TYPE_EN),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * European Number Separator
     */
    ES(PangoBidiType.PANGO_BIDI_TYPE_ES),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * European Number Terminator
     */
    ET(PangoBidiType.PANGO_BIDI_TYPE_ET),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Arabic Number
     */
    AN(PangoBidiType.PANGO_BIDI_TYPE_AN),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Common Number Separator
     */
    CS(PangoBidiType.PANGO_BIDI_TYPE_CS),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Nonspacing Mark
     */
    NSM(PangoBidiType.PANGO_BIDI_TYPE_NSM),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Boundary Neutral
     */
    BN(PangoBidiType.PANGO_BIDI_TYPE_BN),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Paragraph Separator
     */
    B(PangoBidiType.PANGO_BIDI_TYPE_B),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Segment Separator
     */
    S(PangoBidiType.PANGO_BIDI_TYPE_S),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Whitespace
     */
    WS(PangoBidiType.PANGO_BIDI_TYPE_WS),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Other Neutrals
     */
    ON(PangoBidiType.PANGO_BIDI_TYPE_ON),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Left-to-Right isolate. Since 1.48.6
     */
    LRI(PangoBidiType.PANGO_BIDI_TYPE_LRI),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * Right-to-Left isolate. Since 1.48.6
     */
    RLI(PangoBidiType.PANGO_BIDI_TYPE_RLI),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
     * First strong isolate. Since 1.48.6
     */
    FSI(PangoBidiType.PANGO_BIDI_TYPE_FSI),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.44.
     *
     * Use fribidi for this information
     * ---
     *
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
