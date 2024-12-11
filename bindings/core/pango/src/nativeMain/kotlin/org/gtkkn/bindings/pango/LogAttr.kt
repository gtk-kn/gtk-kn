// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.pango.PangoLogAttr
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoLogAttr` structure stores information about the attributes of a
 * single character.
 */
public class LogAttr(pointer: CPointer<PangoLogAttr>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val pangoLogAttrPointer: CPointer<PangoLogAttr> = pointer

    /**
     * if set, can break line in front of character
     */
    public var isLineBreak: guint
        get() = pangoLogAttrPointer.pointed.is_line_break

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_line_break = value
        }

    /**
     * if set, must break line in front of character
     */
    public var isMandatoryBreak: guint
        get() = pangoLogAttrPointer.pointed.is_mandatory_break

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_mandatory_break = value
        }

    /**
     * if set, can break here when doing character wrapping
     */
    public var isCharBreak: guint
        get() = pangoLogAttrPointer.pointed.is_char_break

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_char_break = value
        }

    /**
     * is whitespace character
     */
    public var isWhite: guint
        get() = pangoLogAttrPointer.pointed.is_white

        @UnsafeFieldSetter
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
    public var isCursorPosition: guint
        get() = pangoLogAttrPointer.pointed.is_cursor_position

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_cursor_position = value
        }

    /**
     * is first character in a word
     */
    public var isWordStart: guint
        get() = pangoLogAttrPointer.pointed.is_word_start

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_word_start = value
        }

    /**
     * is first non-word char after a word
     *   Note that in degenerate cases, you could have both @is_word_start
     *   and @is_word_end set for some character.
     */
    public var isWordEnd: guint
        get() = pangoLogAttrPointer.pointed.is_word_end

        @UnsafeFieldSetter
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
    public var isSentenceBoundary: guint
        get() = pangoLogAttrPointer.pointed.is_sentence_boundary

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_sentence_boundary = value
        }

    /**
     * is first character in a sentence
     */
    public var isSentenceStart: guint
        get() = pangoLogAttrPointer.pointed.is_sentence_start

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_sentence_start = value
        }

    /**
     * is first char after a sentence.
     *   Note that in degenerate cases, you could have both @is_sentence_start
     *   and @is_sentence_end set for some character. (e.g. no space after a
     *   period, so the next sentence starts right away)
     */
    public var isSentenceEnd: guint
        get() = pangoLogAttrPointer.pointed.is_sentence_end

        @UnsafeFieldSetter
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
    public var backspaceDeletesCharacter: guint
        get() = pangoLogAttrPointer.pointed.backspace_deletes_character

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.backspace_deletes_character = value
        }

    /**
     * is a whitespace character that can possibly be
     *   expanded for justification purposes. (Since: 1.18)
     */
    public var isExpandableSpace: guint
        get() = pangoLogAttrPointer.pointed.is_expandable_space

        @UnsafeFieldSetter
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
    public var isWordBoundary: guint
        get() = pangoLogAttrPointer.pointed.is_word_boundary

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.is_word_boundary = value
        }

    /**
     * when breaking lines before this char, insert a hyphen.
     *   Since: 1.50
     */
    public var breakInsertsHyphen: guint
        get() = pangoLogAttrPointer.pointed.break_inserts_hyphen

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.break_inserts_hyphen = value
        }

    /**
     * when breaking lines before this char, remove the
     *   preceding char. Since 1.50
     */
    public var breakRemovesPreceding: guint
        get() = pangoLogAttrPointer.pointed.break_removes_preceding

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.break_removes_preceding = value
        }

    public var reserved: guint
        get() = pangoLogAttrPointer.pointed.reserved

        @UnsafeFieldSetter
        set(`value`) {
            pangoLogAttrPointer.pointed.reserved = value
        }

    /**
     * Allocate a new LogAttr.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoLogAttr>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to LogAttr and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<PangoLogAttr>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new LogAttr using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoLogAttr>().ptr)

    /**
     * Allocate a new LogAttr.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param isLineBreak if set, can break line in front of character
     * @param isMandatoryBreak if set, must break line in front of character
     * @param isCharBreak if set, can break here when doing character wrapping
     * @param isWhite is whitespace character
     * @param isCursorPosition if set, cursor can appear in front of character.
     *   i.e. this is a grapheme boundary, or the first character in the text.
     *   This flag implements Unicode's
     *   [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/)
     *   semantics.
     * @param isWordStart is first character in a word
     * @param isWordEnd is first non-word char after a word
     *   Note that in degenerate cases, you could have both @is_word_start
     *   and @is_word_end set for some character.
     * @param isSentenceBoundary is a sentence boundary.
     *   There are two ways to divide sentences. The first assigns all
     *   inter-sentence whitespace/control/format chars to some sentence,
     *   so all chars are in some sentence; @is_sentence_boundary denotes
     *   the boundaries there. The second way doesn't assign
     *   between-sentence spaces, etc. to any sentence, so
     *   @is_sentence_start/@is_sentence_end mark the boundaries of those sentences.
     * @param isSentenceStart is first character in a sentence
     * @param isSentenceEnd is first char after a sentence.
     *   Note that in degenerate cases, you could have both @is_sentence_start
     *   and @is_sentence_end set for some character. (e.g. no space after a
     *   period, so the next sentence starts right away)
     * @param backspaceDeletesCharacter if set, backspace deletes one character
     *   rather than the entire grapheme cluster. This field is only meaningful
     *   on grapheme boundaries (where @is_cursor_position is set). In some languages,
     *   the full grapheme (e.g. letter + diacritics) is considered a unit, while in
     *   others, each decomposed character in the grapheme is a unit. In the default
     *   implementation of [func@break], this bit is set on all grapheme boundaries
     *   except those following Latin, Cyrillic or Greek base characters.
     * @param isExpandableSpace is a whitespace character that can possibly be
     *   expanded for justification purposes. (Since: 1.18)
     * @param isWordBoundary is a word boundary, as defined by UAX#29.
     *   More specifically, means that this is not a position in the middle of a word.
     *   For example, both sides of a punctuation mark are considered word boundaries.
     *   This flag is particularly useful when selecting text word-by-word. This flag
     *   implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
     *   semantics. (Since: 1.22)
     * @param breakInsertsHyphen when breaking lines before this char, insert a hyphen.
     *   Since: 1.50
     * @param breakRemovesPreceding when breaking lines before this char, remove the
     *   preceding char. Since 1.50
     * @param reserved
     */
    public constructor(
        isLineBreak: guint,
        isMandatoryBreak: guint,
        isCharBreak: guint,
        isWhite: guint,
        isCursorPosition: guint,
        isWordStart: guint,
        isWordEnd: guint,
        isSentenceBoundary: guint,
        isSentenceStart: guint,
        isSentenceEnd: guint,
        backspaceDeletesCharacter: guint,
        isExpandableSpace: guint,
        isWordBoundary: guint,
        breakInsertsHyphen: guint,
        breakRemovesPreceding: guint,
        reserved: guint,
    ) : this() {
        this.isLineBreak = isLineBreak
        this.isMandatoryBreak = isMandatoryBreak
        this.isCharBreak = isCharBreak
        this.isWhite = isWhite
        this.isCursorPosition = isCursorPosition
        this.isWordStart = isWordStart
        this.isWordEnd = isWordEnd
        this.isSentenceBoundary = isSentenceBoundary
        this.isSentenceStart = isSentenceStart
        this.isSentenceEnd = isSentenceEnd
        this.backspaceDeletesCharacter = backspaceDeletesCharacter
        this.isExpandableSpace = isExpandableSpace
        this.isWordBoundary = isWordBoundary
        this.breakInsertsHyphen = breakInsertsHyphen
        this.breakRemovesPreceding = breakRemovesPreceding
        this.reserved = reserved
    }

    /**
     * Allocate a new LogAttr using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param isLineBreak if set, can break line in front of character
     * @param isMandatoryBreak if set, must break line in front of character
     * @param isCharBreak if set, can break here when doing character wrapping
     * @param isWhite is whitespace character
     * @param isCursorPosition if set, cursor can appear in front of character.
     *   i.e. this is a grapheme boundary, or the first character in the text.
     *   This flag implements Unicode's
     *   [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/)
     *   semantics.
     * @param isWordStart is first character in a word
     * @param isWordEnd is first non-word char after a word
     *   Note that in degenerate cases, you could have both @is_word_start
     *   and @is_word_end set for some character.
     * @param isSentenceBoundary is a sentence boundary.
     *   There are two ways to divide sentences. The first assigns all
     *   inter-sentence whitespace/control/format chars to some sentence,
     *   so all chars are in some sentence; @is_sentence_boundary denotes
     *   the boundaries there. The second way doesn't assign
     *   between-sentence spaces, etc. to any sentence, so
     *   @is_sentence_start/@is_sentence_end mark the boundaries of those sentences.
     * @param isSentenceStart is first character in a sentence
     * @param isSentenceEnd is first char after a sentence.
     *   Note that in degenerate cases, you could have both @is_sentence_start
     *   and @is_sentence_end set for some character. (e.g. no space after a
     *   period, so the next sentence starts right away)
     * @param backspaceDeletesCharacter if set, backspace deletes one character
     *   rather than the entire grapheme cluster. This field is only meaningful
     *   on grapheme boundaries (where @is_cursor_position is set). In some languages,
     *   the full grapheme (e.g. letter + diacritics) is considered a unit, while in
     *   others, each decomposed character in the grapheme is a unit. In the default
     *   implementation of [func@break], this bit is set on all grapheme boundaries
     *   except those following Latin, Cyrillic or Greek base characters.
     * @param isExpandableSpace is a whitespace character that can possibly be
     *   expanded for justification purposes. (Since: 1.18)
     * @param isWordBoundary is a word boundary, as defined by UAX#29.
     *   More specifically, means that this is not a position in the middle of a word.
     *   For example, both sides of a punctuation mark are considered word boundaries.
     *   This flag is particularly useful when selecting text word-by-word. This flag
     *   implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
     *   semantics. (Since: 1.22)
     * @param breakInsertsHyphen when breaking lines before this char, insert a hyphen.
     *   Since: 1.50
     * @param breakRemovesPreceding when breaking lines before this char, remove the
     *   preceding char. Since 1.50
     * @param reserved
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        isLineBreak: guint,
        isMandatoryBreak: guint,
        isCharBreak: guint,
        isWhite: guint,
        isCursorPosition: guint,
        isWordStart: guint,
        isWordEnd: guint,
        isSentenceBoundary: guint,
        isSentenceStart: guint,
        isSentenceEnd: guint,
        backspaceDeletesCharacter: guint,
        isExpandableSpace: guint,
        isWordBoundary: guint,
        breakInsertsHyphen: guint,
        breakRemovesPreceding: guint,
        reserved: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.isLineBreak = isLineBreak
        this.isMandatoryBreak = isMandatoryBreak
        this.isCharBreak = isCharBreak
        this.isWhite = isWhite
        this.isCursorPosition = isCursorPosition
        this.isWordStart = isWordStart
        this.isWordEnd = isWordEnd
        this.isSentenceBoundary = isSentenceBoundary
        this.isSentenceStart = isSentenceStart
        this.isSentenceEnd = isSentenceEnd
        this.backspaceDeletesCharacter = backspaceDeletesCharacter
        this.isExpandableSpace = isExpandableSpace
        this.isWordBoundary = isWordBoundary
        this.breakInsertsHyphen = breakInsertsHyphen
        this.breakRemovesPreceding = breakRemovesPreceding
        this.reserved = reserved
    }

    override fun toString(): String =
        "LogAttr(isLineBreak=$isLineBreak, isMandatoryBreak=$isMandatoryBreak, isCharBreak=$isCharBreak, isWhite=$isWhite, isCursorPosition=$isCursorPosition, isWordStart=$isWordStart, isWordEnd=$isWordEnd, isSentenceBoundary=$isSentenceBoundary, isSentenceStart=$isSentenceStart, isSentenceEnd=$isSentenceEnd, backspaceDeletesCharacter=$backspaceDeletesCharacter, isExpandableSpace=$isExpandableSpace, isWordBoundary=$isWordBoundary, breakInsertsHyphen=$breakInsertsHyphen, breakRemovesPreceding=$breakRemovesPreceding, reserved=$reserved)"
}
