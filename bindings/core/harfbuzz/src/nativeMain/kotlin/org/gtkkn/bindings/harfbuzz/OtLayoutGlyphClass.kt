// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_ot_layout_glyph_class_t
import org.gtkkn.native.harfbuzz.hb_ot_layout_glyph_class_t.HB_OT_LAYOUT_GLYPH_CLASS_BASE_GLYPH
import org.gtkkn.native.harfbuzz.hb_ot_layout_glyph_class_t.HB_OT_LAYOUT_GLYPH_CLASS_COMPONENT
import org.gtkkn.native.harfbuzz.hb_ot_layout_glyph_class_t.HB_OT_LAYOUT_GLYPH_CLASS_LIGATURE
import org.gtkkn.native.harfbuzz.hb_ot_layout_glyph_class_t.HB_OT_LAYOUT_GLYPH_CLASS_MARK
import org.gtkkn.native.harfbuzz.hb_ot_layout_glyph_class_t.HB_OT_LAYOUT_GLYPH_CLASS_UNCLASSIFIED

/**
 * The GDEF classes defined for glyphs.
 */
public enum class OtLayoutGlyphClass(
    public val nativeValue: hb_ot_layout_glyph_class_t,
) {
    /**
     * Glyphs not matching the other classifications
     */
    UNCLASSIFIED(HB_OT_LAYOUT_GLYPH_CLASS_UNCLASSIFIED),

    /**
     * Spacing, single characters, capable of accepting marks
     */
    BASE_GLYPH(HB_OT_LAYOUT_GLYPH_CLASS_BASE_GLYPH),

    /**
     * Glyphs that represent ligation of multiple characters
     */
    LIGATURE(HB_OT_LAYOUT_GLYPH_CLASS_LIGATURE),

    /**
     * Non-spacing, combining glyphs that represent marks
     */
    MARK(HB_OT_LAYOUT_GLYPH_CLASS_MARK),

    /**
     * Spacing glyphs that represent part of a single character
     */
    COMPONENT(HB_OT_LAYOUT_GLYPH_CLASS_COMPONENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_ot_layout_glyph_class_t): OtLayoutGlyphClass =
            when (nativeValue) {
                HB_OT_LAYOUT_GLYPH_CLASS_UNCLASSIFIED -> UNCLASSIFIED
                HB_OT_LAYOUT_GLYPH_CLASS_BASE_GLYPH -> BASE_GLYPH
                HB_OT_LAYOUT_GLYPH_CLASS_LIGATURE -> LIGATURE
                HB_OT_LAYOUT_GLYPH_CLASS_MARK -> MARK
                HB_OT_LAYOUT_GLYPH_CLASS_COMPONENT -> COMPONENT
                else -> error("invalid nativeValue")
            }
    }
}
