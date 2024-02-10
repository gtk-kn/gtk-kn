// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_ot_meta_tag_t
import org.gtkkn.native.harfbuzz.hb_ot_meta_tag_t.HB_OT_META_TAG_DESIGN_LANGUAGES
import org.gtkkn.native.harfbuzz.hb_ot_meta_tag_t.HB_OT_META_TAG_SUPPORTED_LANGUAGES

/**
 * Known metadata tags from https://docs.microsoft.com/en-us/typography/opentype/spec/meta
 * @since 2.6.0
 */
public enum class OtMetaTag(
    public val nativeValue: hb_ot_meta_tag_t,
) {
    /**
     * Design languages. Text, using only
     * Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * for the user audiences that the font was primarily designed for.
     */
    DESIGN_LANGUAGES(HB_OT_META_TAG_DESIGN_LANGUAGES),

    /**
     * Supported languages. Text, using
     * only Basic Latin (ASCII) characters. Indicates languages and/or scripts
     * that the font is declared to be capable of supporting.
     */
    SUPPORTED_LANGUAGES(HB_OT_META_TAG_SUPPORTED_LANGUAGES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_ot_meta_tag_t): OtMetaTag =
            when (nativeValue) {
                HB_OT_META_TAG_DESIGN_LANGUAGES -> DESIGN_LANGUAGES
                HB_OT_META_TAG_SUPPORTED_LANGUAGES -> SUPPORTED_LANGUAGES
                else -> error("invalid nativeValue")
            }
    }
}
