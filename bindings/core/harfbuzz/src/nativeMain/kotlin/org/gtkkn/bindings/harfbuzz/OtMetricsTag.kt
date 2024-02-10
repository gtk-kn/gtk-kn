// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_CAP_HEIGHT
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_ASCENDER
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_CARET_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_CARET_RISE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_CARET_RUN
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_DESCENDER
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_HORIZONTAL_LINE_GAP
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_STRIKEOUT_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_STRIKEOUT_SIZE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_SIZE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_SIZE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_SIZE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_UNDERLINE_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_UNDERLINE_SIZE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_VERTICAL_ASCENDER
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_VERTICAL_CARET_OFFSET
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_VERTICAL_CARET_RISE
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_VERTICAL_CARET_RUN
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_VERTICAL_DESCENDER
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_VERTICAL_LINE_GAP
import org.gtkkn.native.harfbuzz.hb_ot_metrics_tag_t.HB_OT_METRICS_TAG_X_HEIGHT

/**
 * From https://docs.microsoft.com/en-us/typography/opentype/spec/mvar#value-tags
 * @since 2.6.0
 */
public enum class OtMetricsTag(
    public val nativeValue: hb_ot_metrics_tag_t,
) {
    /**
     * horizontal ascender.
     */
    HORIZONTAL_ASCENDER(HB_OT_METRICS_TAG_HORIZONTAL_ASCENDER),

    /**
     * horizontal descender.
     */
    HORIZONTAL_DESCENDER(HB_OT_METRICS_TAG_HORIZONTAL_DESCENDER),

    /**
     * horizontal line gap.
     */
    HORIZONTAL_LINE_GAP(HB_OT_METRICS_TAG_HORIZONTAL_LINE_GAP),

    /**
     * horizontal clipping ascent.
     */
    HORIZONTAL_CLIPPING_ASCENT(HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT),

    /**
     * horizontal clipping descent.
     */
    HORIZONTAL_CLIPPING_DESCENT(HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT),

    /**
     * vertical ascender.
     */
    VERTICAL_ASCENDER(HB_OT_METRICS_TAG_VERTICAL_ASCENDER),

    /**
     * vertical descender.
     */
    VERTICAL_DESCENDER(HB_OT_METRICS_TAG_VERTICAL_DESCENDER),

    /**
     * vertical line gap.
     */
    VERTICAL_LINE_GAP(HB_OT_METRICS_TAG_VERTICAL_LINE_GAP),

    /**
     * horizontal caret rise.
     */
    HORIZONTAL_CARET_RISE(HB_OT_METRICS_TAG_HORIZONTAL_CARET_RISE),

    /**
     * horizontal caret run.
     */
    HORIZONTAL_CARET_RUN(HB_OT_METRICS_TAG_HORIZONTAL_CARET_RUN),

    /**
     * horizontal caret offset.
     */
    HORIZONTAL_CARET_OFFSET(HB_OT_METRICS_TAG_HORIZONTAL_CARET_OFFSET),

    /**
     * vertical caret rise.
     */
    VERTICAL_CARET_RISE(HB_OT_METRICS_TAG_VERTICAL_CARET_RISE),

    /**
     * vertical caret run.
     */
    VERTICAL_CARET_RUN(HB_OT_METRICS_TAG_VERTICAL_CARET_RUN),

    /**
     * vertical caret offset.
     */
    VERTICAL_CARET_OFFSET(HB_OT_METRICS_TAG_VERTICAL_CARET_OFFSET),

    /**
     * x height.
     */
    X_HEIGHT(HB_OT_METRICS_TAG_X_HEIGHT),

    /**
     * cap height.
     */
    CAP_HEIGHT(HB_OT_METRICS_TAG_CAP_HEIGHT),

    /**
     * subscript em x size.
     */
    SUBSCRIPT_EM_X_SIZE(HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_SIZE),

    /**
     * subscript em y size.
     */
    SUBSCRIPT_EM_Y_SIZE(HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_SIZE),

    /**
     * subscript em x offset.
     */
    SUBSCRIPT_EM_X_OFFSET(HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_OFFSET),

    /**
     * subscript em y offset.
     */
    SUBSCRIPT_EM_Y_OFFSET(HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET),

    /**
     * superscript em x size.
     */
    SUPERSCRIPT_EM_X_SIZE(HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_SIZE),

    /**
     * superscript em y size.
     */
    SUPERSCRIPT_EM_Y_SIZE(HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE),

    /**
     * superscript em x offset.
     */
    SUPERSCRIPT_EM_X_OFFSET(HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET),

    /**
     * superscript em y offset.
     */
    SUPERSCRIPT_EM_Y_OFFSET(HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET),

    /**
     * strikeout size.
     */
    STRIKEOUT_SIZE(HB_OT_METRICS_TAG_STRIKEOUT_SIZE),

    /**
     * strikeout offset.
     */
    STRIKEOUT_OFFSET(HB_OT_METRICS_TAG_STRIKEOUT_OFFSET),

    /**
     * underline size.
     */
    UNDERLINE_SIZE(HB_OT_METRICS_TAG_UNDERLINE_SIZE),

    /**
     * underline offset.
     */
    UNDERLINE_OFFSET(HB_OT_METRICS_TAG_UNDERLINE_OFFSET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_ot_metrics_tag_t): OtMetricsTag =
            when (nativeValue) {
                HB_OT_METRICS_TAG_HORIZONTAL_ASCENDER -> HORIZONTAL_ASCENDER
                HB_OT_METRICS_TAG_HORIZONTAL_DESCENDER -> HORIZONTAL_DESCENDER
                HB_OT_METRICS_TAG_HORIZONTAL_LINE_GAP -> HORIZONTAL_LINE_GAP
                HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_ASCENT -> HORIZONTAL_CLIPPING_ASCENT
                HB_OT_METRICS_TAG_HORIZONTAL_CLIPPING_DESCENT -> HORIZONTAL_CLIPPING_DESCENT
                HB_OT_METRICS_TAG_VERTICAL_ASCENDER -> VERTICAL_ASCENDER
                HB_OT_METRICS_TAG_VERTICAL_DESCENDER -> VERTICAL_DESCENDER
                HB_OT_METRICS_TAG_VERTICAL_LINE_GAP -> VERTICAL_LINE_GAP
                HB_OT_METRICS_TAG_HORIZONTAL_CARET_RISE -> HORIZONTAL_CARET_RISE
                HB_OT_METRICS_TAG_HORIZONTAL_CARET_RUN -> HORIZONTAL_CARET_RUN
                HB_OT_METRICS_TAG_HORIZONTAL_CARET_OFFSET -> HORIZONTAL_CARET_OFFSET
                HB_OT_METRICS_TAG_VERTICAL_CARET_RISE -> VERTICAL_CARET_RISE
                HB_OT_METRICS_TAG_VERTICAL_CARET_RUN -> VERTICAL_CARET_RUN
                HB_OT_METRICS_TAG_VERTICAL_CARET_OFFSET -> VERTICAL_CARET_OFFSET
                HB_OT_METRICS_TAG_X_HEIGHT -> X_HEIGHT
                HB_OT_METRICS_TAG_CAP_HEIGHT -> CAP_HEIGHT
                HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_SIZE -> SUBSCRIPT_EM_X_SIZE
                HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_SIZE -> SUBSCRIPT_EM_Y_SIZE
                HB_OT_METRICS_TAG_SUBSCRIPT_EM_X_OFFSET -> SUBSCRIPT_EM_X_OFFSET
                HB_OT_METRICS_TAG_SUBSCRIPT_EM_Y_OFFSET -> SUBSCRIPT_EM_Y_OFFSET
                HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_SIZE -> SUPERSCRIPT_EM_X_SIZE
                HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_SIZE -> SUPERSCRIPT_EM_Y_SIZE
                HB_OT_METRICS_TAG_SUPERSCRIPT_EM_X_OFFSET -> SUPERSCRIPT_EM_X_OFFSET
                HB_OT_METRICS_TAG_SUPERSCRIPT_EM_Y_OFFSET -> SUPERSCRIPT_EM_Y_OFFSET
                HB_OT_METRICS_TAG_STRIKEOUT_SIZE -> STRIKEOUT_SIZE
                HB_OT_METRICS_TAG_STRIKEOUT_OFFSET -> STRIKEOUT_OFFSET
                HB_OT_METRICS_TAG_UNDERLINE_SIZE -> UNDERLINE_SIZE
                HB_OT_METRICS_TAG_UNDERLINE_OFFSET -> UNDERLINE_OFFSET
                else -> error("invalid nativeValue")
            }
    }
}
