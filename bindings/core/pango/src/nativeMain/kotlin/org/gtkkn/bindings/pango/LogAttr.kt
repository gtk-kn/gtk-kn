// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.pango.PangoLogAttr
import kotlin.UInt

/**
 * The `PangoLogAttr` structure stores information about the attributes of a
 * single character.
 */
public class LogAttr(
    pointer: CPointer<PangoLogAttr>,
) : Record {
    public val pangoLogAttrPointer: CPointer<PangoLogAttr> = pointer

    /**
     * if set, can break line in front of character
     */
    public var isLineBreak: UInt
        get() = pangoLogAttrPointer.pointed.is_line_break
        set(`value`) {
            pangoLogAttrPointer.pointed.is_line_break = value
        }

    /**
     * if set, must break line in front of character
     */
    public var isMandatoryBreak: UInt
        get() = pangoLogAttrPointer.pointed.is_mandatory_break
        set(`value`) {
            pangoLogAttrPointer.pointed.is_mandatory_break = value
        }

    /**
     * if set, can break here when doing character wrapping
     */
    public var isCharBreak: UInt
        get() = pangoLogAttrPointer.pointed.is_char_break
        set(`value`) {
            pangoLogAttrPointer.pointed.is_char_break = value
        }

    /**
     * is whitespace character
     */
    public var isWhite: UInt
        get() = pangoLogAttrPointer.pointed.is_white
        set(`value`) {
            pangoLogAttrPointer.pointed.is_white = value
        }

    /**
     * if set, cursor can appear in front of character.
     *   i.e. this is a grapheme boundary, or the first character in the text.
     *   This flag implements Unicode's
     *   [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/)
     *   semantics.
     */
    public var isCursorPosition: UInt
        get() = pangoLogAttrPointer.pointed.is_cursor_position
        set(`value`) {
            pangoLogAttrPointer.pointed.is_cursor_position = value
        }

    /**
     * is first character in a word
     */
    public var isWordStart: UInt
        get() = pangoLogAttrPointer.pointed.is_word_start
        set(`value`) {
            pangoLogAttrPointer.pointed.is_word_start = value
        }

    /**
     * is first non-word char after a word
     *   Note that in degenerate cases, you could have both @is_word_start
     *   and @is_word_end set for some character.
     */
    public var isWordEnd: UInt
        get() = pangoLogAttrPointer.pointed.is_word_end
        set(`value`) {
            pangoLogAttrPointer.pointed.is_word_end = value
        }

    /**
     * is a sentence boundary.
     *   There are two ways to divide sentences. The first assigns all
     *   inter-sentence whitespace/control/format chars to some sentence,
     *   so all chars are in some sentence; @is_sentence_boundary denotes
     *   the boundaries there. The second way doesn't assign
     *   between-sentence spaces, etc. to any sentence, so
     *   @is_sentence_start/@is_sentence_end mark the boundaries of those sentences.
     */
    public var isSentenceBoundary: UInt
        get() = pangoLogAttrPointer.pointed.is_sentence_boundary
        set(`value`) {
            pangoLogAttrPointer.pointed.is_sentence_boundary = value
        }

    /**
     * is first character in a sentence
     */
    public var isSentenceStart: UInt
        get() = pangoLogAttrPointer.pointed.is_sentence_start
        set(`value`) {
            pangoLogAttrPointer.pointed.is_sentence_start = value
        }

    /**
     * is first char after a sentence.
     *   Note that in degenerate cases, you could have both @is_sentence_start
     *   and @is_sentence_end set for some character. (e.g. no space after a
     *   period, so the next sentence starts right away)
     */
    public var isSentenceEnd: UInt
        get() = pangoLogAttrPointer.pointed.is_sentence_end
        set(`value`) {
            pangoLogAttrPointer.pointed.is_sentence_end = value
        }

    /**
     * if set, backspace deletes one character
     *   rather than the entire grapheme cluster. This field is only meaningful
     *   on grapheme boundaries (where @is_cursor_position is set). In some languages,
     *   the full grapheme (e.g. letter + diacritics) is considered a unit, while in
     *   others, each decomposed character in the grapheme is a unit. In the default
     *   implementation of [func@break], this bit is set on all grapheme boundaries
     *   except those following Latin, Cyrillic or Greek base characters.
     */
    public var backspaceDeletesCharacter: UInt
        get() = pangoLogAttrPointer.pointed.backspace_deletes_character
        set(`value`) {
            pangoLogAttrPointer.pointed.backspace_deletes_character = value
        }

    /**
     * is a whitespace character that can possibly be
     *   expanded for justification purposes. (Since: 1.18)
     */
    public var isExpandableSpace: UInt
        get() = pangoLogAttrPointer.pointed.is_expandable_space
        set(`value`) {
            pangoLogAttrPointer.pointed.is_expandable_space = value
        }

    /**
     * is a word boundary, as defined by UAX#29.
     *   More specifically, means that this is not a position in the middle of a word.
     *   For example, both sides of a punctuation mark are considered word boundaries.
     *   This flag is particularly useful when selecting text word-by-word. This flag
     *   implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
     *   semantics. (Since: 1.22)
     */
    public var isWordBoundary: UInt
        get() = pangoLogAttrPointer.pointed.is_word_boundary
        set(`value`) {
            pangoLogAttrPointer.pointed.is_word_boundary = value
        }

    /**
     * when breaking lines before this char, insert a hyphen.
     *   Since: 1.50
     */
    public var breakInsertsHyphen: UInt
        get() = pangoLogAttrPointer.pointed.break_inserts_hyphen
        set(`value`) {
            pangoLogAttrPointer.pointed.break_inserts_hyphen = value
        }

    /**
     * when breaking lines before this char, remove the
     *   preceding char. Since 1.50
     */
    public var breakRemovesPreceding: UInt
        get() = pangoLogAttrPointer.pointed.break_removes_preceding
        set(`value`) {
            pangoLogAttrPointer.pointed.break_removes_preceding = value
        }

    public var reserved: UInt
        get() = pangoLogAttrPointer.pointed.reserved
        set(`value`) {
            pangoLogAttrPointer.pointed.reserved = value
        }

    public companion object : RecordCompanion<LogAttr, PangoLogAttr> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): LogAttr = LogAttr(pointer.reinterpret())
    }
}
