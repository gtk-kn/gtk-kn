// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.native.atk.AtkTextGranularity

/**
 * Text granularity types used for specifying the granularity of the region of
 * text we are interested in.
 */
public enum class TextGranularity(
    public val nativeValue: AtkTextGranularity,
) {
    /**
     * Granularity is defined by the boundaries between characters
     * (including non-printing characters)
     */
    CHAR(AtkTextGranularity.ATK_TEXT_GRANULARITY_CHAR),

    /**
     * Granularity is defined by the boundaries of a word,
     * starting at the beginning of the current word and finishing at the beginning of
     * the following one, if present.
     */
    WORD(AtkTextGranularity.ATK_TEXT_GRANULARITY_WORD),

    /**
     * Granularity is defined by the boundaries of a sentence,
     * starting at the beginning of the current sentence and finishing at the beginning of
     * the following one, if present.
     */
    SENTENCE(AtkTextGranularity.ATK_TEXT_GRANULARITY_SENTENCE),

    /**
     * Granularity is defined by the boundaries of a line,
     * starting at the beginning of the current line and finishing at the beginning of
     * the following one, if present.
     */
    LINE(AtkTextGranularity.ATK_TEXT_GRANULARITY_LINE),

    /**
     * Granularity is defined by the boundaries of a paragraph,
     * starting at the beginning of the current paragraph and finishing at the beginning of
     * the following one, if present.
     */
    PARAGRAPH(AtkTextGranularity.ATK_TEXT_GRANULARITY_PARAGRAPH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkTextGranularity): TextGranularity =
            when (nativeValue) {
                AtkTextGranularity.ATK_TEXT_GRANULARITY_CHAR -> CHAR
                AtkTextGranularity.ATK_TEXT_GRANULARITY_WORD -> WORD
                AtkTextGranularity.ATK_TEXT_GRANULARITY_SENTENCE -> SENTENCE
                AtkTextGranularity.ATK_TEXT_GRANULARITY_LINE -> LINE
                AtkTextGranularity.ATK_TEXT_GRANULARITY_PARAGRAPH -> PARAGRAPH
                else -> error("invalid nativeValue")
            }
    }
}
