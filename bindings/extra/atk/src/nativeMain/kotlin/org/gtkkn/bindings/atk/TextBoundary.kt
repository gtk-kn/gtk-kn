// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.native.atk.AtkTextBoundary

/**
 * Text boundary types used for specifying boundaries for regions of text.
 * This enumeration is deprecated since 2.9.4 and should not be used. Use
 * AtkTextGranularity with #atk_text_get_string_at_offset instead.
 */
public enum class TextBoundary(
    public val nativeValue: AtkTextBoundary,
) {
    /**
     * Boundary is the boundary between characters
     * (including non-printing characters)
     */
    CHAR(AtkTextBoundary.ATK_TEXT_BOUNDARY_CHAR),

    /**
     * Boundary is the start (i.e. first character) of a word.
     */
    WORD_START(AtkTextBoundary.ATK_TEXT_BOUNDARY_WORD_START),

    /**
     * Boundary is the end (i.e. last
     * character) of a word.
     */
    WORD_END(AtkTextBoundary.ATK_TEXT_BOUNDARY_WORD_END),

    /**
     * Boundary is the first character in a sentence.
     */
    SENTENCE_START(AtkTextBoundary.ATK_TEXT_BOUNDARY_SENTENCE_START),

    /**
     * Boundary is the last (terminal)
     * character in a sentence; in languages which use "sentence stop"
     * punctuation such as English, the boundary is thus the '.', '?', or
     * similar terminal punctuation character.
     */
    SENTENCE_END(AtkTextBoundary.ATK_TEXT_BOUNDARY_SENTENCE_END),

    /**
     * Boundary is the initial character of the content or a
     * character immediately following a newline, linefeed, or return character.
     */
    LINE_START(AtkTextBoundary.ATK_TEXT_BOUNDARY_LINE_START),

    /**
     * Boundary is the linefeed, or return
     * character.
     */
    LINE_END(AtkTextBoundary.ATK_TEXT_BOUNDARY_LINE_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkTextBoundary): TextBoundary =
            when (nativeValue) {
                AtkTextBoundary.ATK_TEXT_BOUNDARY_CHAR -> CHAR
                AtkTextBoundary.ATK_TEXT_BOUNDARY_WORD_START -> WORD_START
                AtkTextBoundary.ATK_TEXT_BOUNDARY_WORD_END -> WORD_END
                AtkTextBoundary.ATK_TEXT_BOUNDARY_SENTENCE_START -> SENTENCE_START
                AtkTextBoundary.ATK_TEXT_BOUNDARY_SENTENCE_END -> SENTENCE_END
                AtkTextBoundary.ATK_TEXT_BOUNDARY_LINE_START -> LINE_START
                AtkTextBoundary.ATK_TEXT_BOUNDARY_LINE_END -> LINE_END
                else -> error("invalid nativeValue")
            }
    }
}
