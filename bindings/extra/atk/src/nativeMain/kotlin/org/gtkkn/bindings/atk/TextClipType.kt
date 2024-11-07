// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.native.atk.AtkTextClipType

/**
 * Describes the type of clipping required.
 */
public enum class TextClipType(
    public val nativeValue: AtkTextClipType,
) {
    /**
     * No clipping to be done
     */
    NONE(AtkTextClipType.ATK_TEXT_CLIP_NONE),

    /**
     * Text clipped by min coordinate is omitted
     */
    MIN(AtkTextClipType.ATK_TEXT_CLIP_MIN),

    /**
     * Text clipped by max coordinate is omitted
     */
    MAX(AtkTextClipType.ATK_TEXT_CLIP_MAX),

    /**
     * Only text fully within mix/max bound is retained
     */
    BOTH(AtkTextClipType.ATK_TEXT_CLIP_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkTextClipType): TextClipType =
            when (nativeValue) {
                AtkTextClipType.ATK_TEXT_CLIP_NONE -> NONE
                AtkTextClipType.ATK_TEXT_CLIP_MIN -> MIN
                AtkTextClipType.ATK_TEXT_CLIP_MAX -> MAX
                AtkTextClipType.ATK_TEXT_CLIP_BOTH -> BOTH
                else -> error("invalid nativeValue")
            }
    }
}
