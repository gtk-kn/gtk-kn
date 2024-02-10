// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_HANGING
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_MATH
import org.gtkkn.native.harfbuzz.hb_ot_layout_baseline_tag_t.HB_OT_LAYOUT_BASELINE_TAG_ROMAN

/**
 * Baseline tags from https://docs.microsoft.com/en-us/typography/opentype/spec/baselinetags
 * @since 2.6.0
 */
public enum class OtLayoutBaselineTag(
    public val nativeValue: hb_ot_layout_baseline_tag_t,
) {
    /**
     * The baseline used by alphabetic scripts such as Latin, Cyrillic and Greek.
     * In vertical writing mode, the alphabetic baseline for characters rotated 90 degrees
     * clockwise.
     * (This would not apply to alphabetic characters that remain upright in vertical writing mode,
     * since these
     * characters are not rotated.)
     */
    ROMAN(HB_OT_LAYOUT_BASELINE_TAG_ROMAN),

    /**
     * The hanging baseline. In horizontal direction, this is the horizontal
     * line from which syllables seem, to hang in Tibetan and other similar scripts. In vertical
     * writing mode,
     * for Tibetan (or some other similar script) characters rotated 90 degrees clockwise.
     */
    HANGING(HB_OT_LAYOUT_BASELINE_TAG_HANGING),

    /**
     * Ideographic character face bottom or left edge,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_FACE_BOTTOM_OR_LEFT(HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT),

    /**
     * Ideographic character face top or right edge,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_FACE_TOP_OR_RIGHT(HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT),

    /**
     * Ideographic em-box bottom or left edge,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_EMBOX_BOTTOM_OR_LEFT(HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT),

    /**
     * Ideographic em-box top or right edge baseline,
     * if the direction is horizontal or vertical, respectively.
     */
    IDEO_EMBOX_TOP_OR_RIGHT(HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT),

    /**
     * The baseline about which mathematical characters are centered.
     * In vertical writing mode when mathematical characters rotated 90 degrees clockwise, are
     * centered.
     */
    MATH(HB_OT_LAYOUT_BASELINE_TAG_MATH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_ot_layout_baseline_tag_t): OtLayoutBaselineTag =
            when (nativeValue) {
                HB_OT_LAYOUT_BASELINE_TAG_ROMAN -> ROMAN
                HB_OT_LAYOUT_BASELINE_TAG_HANGING -> HANGING
                HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_BOTTOM_OR_LEFT -> IDEO_FACE_BOTTOM_OR_LEFT
                HB_OT_LAYOUT_BASELINE_TAG_IDEO_FACE_TOP_OR_RIGHT -> IDEO_FACE_TOP_OR_RIGHT
                HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_BOTTOM_OR_LEFT -> IDEO_EMBOX_BOTTOM_OR_LEFT
                HB_OT_LAYOUT_BASELINE_TAG_IDEO_EMBOX_TOP_OR_RIGHT -> IDEO_EMBOX_TOP_OR_RIGHT
                HB_OT_LAYOUT_BASELINE_TAG_MATH -> MATH
                else -> error("invalid nativeValue")
            }
    }
}
