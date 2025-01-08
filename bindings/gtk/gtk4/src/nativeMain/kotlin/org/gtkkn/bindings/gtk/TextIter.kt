// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.pango.Language
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtk.gtk_text_iter_assign
import org.gtkkn.native.gtk.gtk_text_iter_backward_char
import org.gtkkn.native.gtk.gtk_text_iter_backward_chars
import org.gtkkn.native.gtk.gtk_text_iter_backward_cursor_position
import org.gtkkn.native.gtk.gtk_text_iter_backward_cursor_positions
import org.gtkkn.native.gtk.gtk_text_iter_backward_find_char
import org.gtkkn.native.gtk.gtk_text_iter_backward_line
import org.gtkkn.native.gtk.gtk_text_iter_backward_lines
import org.gtkkn.native.gtk.gtk_text_iter_backward_search
import org.gtkkn.native.gtk.gtk_text_iter_backward_sentence_start
import org.gtkkn.native.gtk.gtk_text_iter_backward_sentence_starts
import org.gtkkn.native.gtk.gtk_text_iter_backward_to_tag_toggle
import org.gtkkn.native.gtk.gtk_text_iter_backward_visible_cursor_position
import org.gtkkn.native.gtk.gtk_text_iter_backward_visible_cursor_positions
import org.gtkkn.native.gtk.gtk_text_iter_backward_visible_line
import org.gtkkn.native.gtk.gtk_text_iter_backward_visible_lines
import org.gtkkn.native.gtk.gtk_text_iter_backward_visible_word_start
import org.gtkkn.native.gtk.gtk_text_iter_backward_visible_word_starts
import org.gtkkn.native.gtk.gtk_text_iter_backward_word_start
import org.gtkkn.native.gtk.gtk_text_iter_backward_word_starts
import org.gtkkn.native.gtk.gtk_text_iter_can_insert
import org.gtkkn.native.gtk.gtk_text_iter_compare
import org.gtkkn.native.gtk.gtk_text_iter_copy
import org.gtkkn.native.gtk.gtk_text_iter_editable
import org.gtkkn.native.gtk.gtk_text_iter_ends_line
import org.gtkkn.native.gtk.gtk_text_iter_ends_sentence
import org.gtkkn.native.gtk.gtk_text_iter_ends_tag
import org.gtkkn.native.gtk.gtk_text_iter_ends_word
import org.gtkkn.native.gtk.gtk_text_iter_equal
import org.gtkkn.native.gtk.gtk_text_iter_forward_char
import org.gtkkn.native.gtk.gtk_text_iter_forward_chars
import org.gtkkn.native.gtk.gtk_text_iter_forward_cursor_position
import org.gtkkn.native.gtk.gtk_text_iter_forward_cursor_positions
import org.gtkkn.native.gtk.gtk_text_iter_forward_find_char
import org.gtkkn.native.gtk.gtk_text_iter_forward_line
import org.gtkkn.native.gtk.gtk_text_iter_forward_lines
import org.gtkkn.native.gtk.gtk_text_iter_forward_search
import org.gtkkn.native.gtk.gtk_text_iter_forward_sentence_end
import org.gtkkn.native.gtk.gtk_text_iter_forward_sentence_ends
import org.gtkkn.native.gtk.gtk_text_iter_forward_to_end
import org.gtkkn.native.gtk.gtk_text_iter_forward_to_line_end
import org.gtkkn.native.gtk.gtk_text_iter_forward_to_tag_toggle
import org.gtkkn.native.gtk.gtk_text_iter_forward_visible_cursor_position
import org.gtkkn.native.gtk.gtk_text_iter_forward_visible_cursor_positions
import org.gtkkn.native.gtk.gtk_text_iter_forward_visible_line
import org.gtkkn.native.gtk.gtk_text_iter_forward_visible_lines
import org.gtkkn.native.gtk.gtk_text_iter_forward_visible_word_end
import org.gtkkn.native.gtk.gtk_text_iter_forward_visible_word_ends
import org.gtkkn.native.gtk.gtk_text_iter_forward_word_end
import org.gtkkn.native.gtk.gtk_text_iter_forward_word_ends
import org.gtkkn.native.gtk.gtk_text_iter_free
import org.gtkkn.native.gtk.gtk_text_iter_get_buffer
import org.gtkkn.native.gtk.gtk_text_iter_get_bytes_in_line
import org.gtkkn.native.gtk.gtk_text_iter_get_char
import org.gtkkn.native.gtk.gtk_text_iter_get_chars_in_line
import org.gtkkn.native.gtk.gtk_text_iter_get_child_anchor
import org.gtkkn.native.gtk.gtk_text_iter_get_language
import org.gtkkn.native.gtk.gtk_text_iter_get_line
import org.gtkkn.native.gtk.gtk_text_iter_get_line_index
import org.gtkkn.native.gtk.gtk_text_iter_get_line_offset
import org.gtkkn.native.gtk.gtk_text_iter_get_marks
import org.gtkkn.native.gtk.gtk_text_iter_get_offset
import org.gtkkn.native.gtk.gtk_text_iter_get_paintable
import org.gtkkn.native.gtk.gtk_text_iter_get_slice
import org.gtkkn.native.gtk.gtk_text_iter_get_tags
import org.gtkkn.native.gtk.gtk_text_iter_get_text
import org.gtkkn.native.gtk.gtk_text_iter_get_toggled_tags
import org.gtkkn.native.gtk.gtk_text_iter_get_type
import org.gtkkn.native.gtk.gtk_text_iter_get_visible_line_index
import org.gtkkn.native.gtk.gtk_text_iter_get_visible_line_offset
import org.gtkkn.native.gtk.gtk_text_iter_get_visible_slice
import org.gtkkn.native.gtk.gtk_text_iter_get_visible_text
import org.gtkkn.native.gtk.gtk_text_iter_has_tag
import org.gtkkn.native.gtk.gtk_text_iter_in_range
import org.gtkkn.native.gtk.gtk_text_iter_inside_sentence
import org.gtkkn.native.gtk.gtk_text_iter_inside_word
import org.gtkkn.native.gtk.gtk_text_iter_is_cursor_position
import org.gtkkn.native.gtk.gtk_text_iter_is_end
import org.gtkkn.native.gtk.gtk_text_iter_is_start
import org.gtkkn.native.gtk.gtk_text_iter_order
import org.gtkkn.native.gtk.gtk_text_iter_set_line
import org.gtkkn.native.gtk.gtk_text_iter_set_line_index
import org.gtkkn.native.gtk.gtk_text_iter_set_line_offset
import org.gtkkn.native.gtk.gtk_text_iter_set_offset
import org.gtkkn.native.gtk.gtk_text_iter_set_visible_line_index
import org.gtkkn.native.gtk.gtk_text_iter_set_visible_line_offset
import org.gtkkn.native.gtk.gtk_text_iter_starts_line
import org.gtkkn.native.gtk.gtk_text_iter_starts_sentence
import org.gtkkn.native.gtk.gtk_text_iter_starts_tag
import org.gtkkn.native.gtk.gtk_text_iter_starts_word
import org.gtkkn.native.gtk.gtk_text_iter_toggles_tag
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * An iterator for the contents of a `GtkTextBuffer`.
 *
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 */
public class TextIter(pointer: CPointer<GtkTextIter>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkTextIter> = pointer

    /**
     * Allocate a new TextIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkTextIter>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TextIter and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GtkTextIter>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TextIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkTextIter>().ptr)

    /**
     * Assigns the value of @other to @iter.
     *
     * This function is not useful in applications, because
     * iterators can be assigned with `GtkTextIter i = j;`.
     *
     * The function is used by language bindings.
     *
     * @param other another `GtkTextIter`
     */
    public fun assign(other: TextIter): Unit = gtk_text_iter_assign(gPointer, other.gPointer)

    /**
     * Moves backward by one character offset.
     *
     * Returns true if movement was possible; if @iter was the first
     * in the buffer (character offset 0), this function returns false
     * for convenience when writing loops.
     *
     * @return whether movement was possible
     */
    public fun backwardChar(): Boolean = gtk_text_iter_backward_char(gPointer).asBoolean()

    /**
     * Moves @count characters backward, if possible.
     *
     * If @count would move past the start or end of the buffer, moves
     * to the start or end of the buffer.
     *
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then false is returned. If @count is 0,
     * the function does nothing and returns false.
     *
     * @param count number of characters to move
     * @return whether @iter moved and is dereferenceable
     */
    public fun backwardChars(count: gint): Boolean = gtk_text_iter_backward_chars(gPointer, count).asBoolean()

    /**
     * Like [method@Gtk.TextIter.forward_cursor_position], but moves backward.
     *
     * @return true if we moved
     */
    public fun backwardCursorPosition(): Boolean = gtk_text_iter_backward_cursor_position(gPointer).asBoolean()

    /**
     * Moves up to @count cursor positions.
     *
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     *
     * @param count number of positions to move
     * @return true if we moved and the new position is dereferenceable
     */
    public fun backwardCursorPositions(count: gint): Boolean =
        gtk_text_iter_backward_cursor_positions(gPointer, count).asBoolean()

    /**
     * Same as [method@Gtk.TextIter.forward_find_char],
     * but goes backward from @iter.
     *
     * @param pred function to be called on each character
     * @param limit search limit
     * @return whether a match was found
     */
    public fun backwardFindChar(pred: TextCharPredicate, limit: TextIter? = null): Boolean =
        gtk_text_iter_backward_find_char(
            gPointer,
            TextCharPredicateFunc.reinterpret(),
            StableRef.create(pred).asCPointer(),
            limit?.gPointer
        ).asBoolean()

    /**
     * Moves @iter to the start of the previous line.
     *
     * Returns true if @iter could be moved; i.e. if @iter was at
     * character offset 0, this function returns false. Therefore,
     * if @iter was already on line 0, but not at the start of the line,
     * @iter is snapped to the start of the line and the function returns
     * true. (Note that this implies that
     * in a loop calling this function, the line number may not change on
     * every iteration, if your first iteration is on line 0.)
     *
     * @return whether @iter moved
     */
    public fun backwardLine(): Boolean = gtk_text_iter_backward_line(gPointer).asBoolean()

    /**
     * Moves @count lines backward, if possible.
     *
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     *
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then false is returned. If @count is 0,
     * the function does nothing and returns false. If @count is negative,
     * moves forward by 0 - @count lines.
     *
     * @param count number of lines to move backward
     * @return whether @iter moved and is dereferenceable
     */
    public fun backwardLines(count: gint): Boolean = gtk_text_iter_backward_lines(gPointer, count).asBoolean()

    /**
     * Same as [method@Gtk.TextIter.forward_search], but moves backward.
     *
     * @match_end will never be set to a `GtkTextIter` located after @iter,
     * even if there is a possible @match_start before or at @iter.
     *
     * @param str search string
     * @param flags bitmask of flags affecting the search
     * @param matchStart return location for start of match
     * @param matchEnd return location for end of match
     * @param limit location of last possible @match_start, or null for start of buffer
     * @return whether a match was found
     */
    public fun backwardSearch(
        str: String,
        flags: TextSearchFlags,
        matchStart: TextIter?,
        matchEnd: TextIter?,
        limit: TextIter? = null,
    ): Boolean = gtk_text_iter_backward_search(
        gPointer,
        str,
        flags.mask,
        matchStart?.gPointer,
        matchEnd?.gPointer,
        limit?.gPointer
    ).asBoolean()

    /**
     * Moves backward to the previous sentence start.
     *
     * If @iter is already at the start of a sentence, moves backward
     * to the next one.
     *
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     *
     * @return true if @iter moved and is not the end iterator
     */
    public fun backwardSentenceStart(): Boolean = gtk_text_iter_backward_sentence_start(gPointer).asBoolean()

    /**
     * Calls [method@Gtk.TextIter.backward_sentence_start] up to @count times.
     *
     * If @count is negative, moves forward instead of backward.
     *
     * @param count number of sentences to move
     * @return true if @iter moved and is not the end iterator
     */
    public fun backwardSentenceStarts(count: gint): Boolean =
        gtk_text_iter_backward_sentence_starts(gPointer, count).asBoolean()

    /**
     * Moves backward to the next toggle (on or off) of the
     * @tag, or to the next toggle of any tag if
     * @tag is null.
     *
     * If no matching tag toggles are found,
     * returns false, otherwise true. Does not return toggles
     * located at @iter, only toggles before @iter. Sets @iter
     * to the location of the toggle, or the start of the buffer
     * if no toggle is found.
     *
     * @param tag a `GtkTextTag`
     * @return whether we found a tag toggle before @iter
     */
    public fun backwardToTagToggle(tag: TextTag? = null): Boolean =
        gtk_text_iter_backward_to_tag_toggle(gPointer, tag?.gtkTextTagPointer).asBoolean()

    /**
     * Moves @iter backward to the previous visible cursor position.
     *
     * See [method@Gtk.TextIter.backward_cursor_position] for details.
     *
     * @return true if we moved and the new position is dereferenceable
     */
    public fun backwardVisibleCursorPosition(): Boolean =
        gtk_text_iter_backward_visible_cursor_position(gPointer).asBoolean()

    /**
     * Moves up to @count visible cursor positions.
     *
     * See [method@Gtk.TextIter.backward_cursor_position] for details.
     *
     * @param count number of positions to move
     * @return true if we moved and the new position is dereferenceable
     */
    public fun backwardVisibleCursorPositions(count: gint): Boolean =
        gtk_text_iter_backward_visible_cursor_positions(gPointer, count).asBoolean()

    /**
     * Moves @iter to the start of the previous visible line.
     *
     * Returns true if
     * @iter could be moved; i.e. if @iter was at character offset 0, this
     * function returns false. Therefore if @iter was already on line 0,
     * but not at the start of the line, @iter is snapped to the start of
     * the line and the function returns true. (Note that this implies that
     * in a loop calling this function, the line number may not change on
     * every iteration, if your first iteration is on line 0.)
     *
     * @return whether @iter moved
     */
    public fun backwardVisibleLine(): Boolean = gtk_text_iter_backward_visible_line(gPointer).asBoolean()

    /**
     * Moves @count visible lines backward, if possible.
     *
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     *
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then false is returned. If @count is 0,
     * the function does nothing and returns false. If @count is negative,
     * moves forward by 0 - @count lines.
     *
     * @param count number of lines to move backward
     * @return whether @iter moved and is dereferenceable
     */
    public fun backwardVisibleLines(count: gint): Boolean =
        gtk_text_iter_backward_visible_lines(gPointer, count).asBoolean()

    /**
     * Moves backward to the previous visible word start.
     *
     * If @iter is currently on a word start, moves backward to the
     * next one after that.
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     *
     * @return true if @iter moved and is not the end iterator
     */
    public fun backwardVisibleWordStart(): Boolean = gtk_text_iter_backward_visible_word_start(gPointer).asBoolean()

    /**
     * Calls [method@Gtk.TextIter.backward_visible_word_start] up to @count times.
     *
     * @param count number of times to move
     * @return true if @iter moved and is not the end iterator
     */
    public fun backwardVisibleWordStarts(count: gint): Boolean =
        gtk_text_iter_backward_visible_word_starts(gPointer, count).asBoolean()

    /**
     * Moves backward to the previous word start.
     *
     * If @iter is currently on a word start, moves backward to the
     * next one after that.
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     *
     * @return true if @iter moved and is not the end iterator
     */
    public fun backwardWordStart(): Boolean = gtk_text_iter_backward_word_start(gPointer).asBoolean()

    /**
     * Calls [method@Gtk.TextIter.backward_word_start] up to @count times.
     *
     * @param count number of times to move
     * @return true if @iter moved and is not the end iterator
     */
    public fun backwardWordStarts(count: gint): Boolean =
        gtk_text_iter_backward_word_starts(gPointer, count).asBoolean()

    /**
     * Considering the default editability of the buffer, and tags that
     * affect editability, determines whether text inserted at @iter would
     * be editable.
     *
     * If text inserted at @iter would be editable then the
     * user should be allowed to insert text at @iter.
     * [method@Gtk.TextBuffer.insert_interactive] uses this function
     * to decide whether insertions are allowed at a given position.
     *
     * @param defaultEditability true if text is editable by default
     * @return whether text inserted at @iter would be editable
     */
    public fun canInsert(defaultEditability: Boolean): Boolean =
        gtk_text_iter_can_insert(gPointer, defaultEditability.asGBoolean()).asBoolean()

    /**
     * A qsort()-style function that returns negative if @lhs is less than
     * @rhs, positive if @lhs is greater than @rhs, and 0 if they’re equal.
     *
     * Ordering is in character offset order, i.e. the first character
     * in the buffer is less than the second character in the buffer.
     *
     * @param rhs another `GtkTextIter`
     * @return -1 if @lhs is less than @rhs, 1 if @lhs is greater, 0 if they are equal
     */
    public fun compare(rhs: TextIter): gint = gtk_text_iter_compare(gPointer, rhs.gPointer)

    /**
     * Creates a dynamically-allocated copy of an iterator.
     *
     * This function is not useful in applications, because
     * iterators can be copied with a simple assignment
     * (`GtkTextIter i = j;`).
     *
     * The function is used by language bindings.
     *
     * @return a copy of the @iter, free with [method@Gtk.TextIter.free]
     */
    public fun copy(): TextIter = gtk_text_iter_copy(gPointer)!!.run {
        TextIter(this)
    }

    /**
     * Returns whether the character at @iter is within an editable region
     * of text.
     *
     * Non-editable text is “locked” and can’t be changed by the
     * user via `GtkTextView`. If no tags applied to this text affect
     * editability, @default_setting will be returned.
     *
     * You don’t want to use this function to decide whether text can be
     * inserted at @iter, because for insertion you don’t want to know
     * whether the char at @iter is inside an editable range, you want to
     * know whether a new character inserted at @iter would be inside an
     * editable range. Use [method@Gtk.TextIter.can_insert] to handle this
     * case.
     *
     * @param defaultSetting true if text is editable by default
     * @return whether @iter is inside an editable range
     */
    public fun editable(defaultSetting: Boolean): Boolean =
        gtk_text_iter_editable(gPointer, defaultSetting.asGBoolean()).asBoolean()

    /**
     * Returns true if @iter points to the start of the paragraph
     * delimiter characters for a line.
     *
     * Delimiters will be either a newline, a carriage return, a carriage
     * return followed by a newline, or a Unicode paragraph separator
     * character.
     *
     * Note that an iterator pointing to the \n of a \r\n pair will not be
     * counted as the end of a line, the line ends before the \r. The end
     * iterator is considered to be at the end of a line, even though there
     * are no paragraph delimiter chars there.
     *
     * @return whether @iter is at the end of a line
     */
    public fun endsLine(): Boolean = gtk_text_iter_ends_line(gPointer).asBoolean()

    /**
     * Determines whether @iter ends a sentence.
     *
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     *
     * @return true if @iter is at the end of a sentence.
     */
    public fun endsSentence(): Boolean = gtk_text_iter_ends_sentence(gPointer).asBoolean()

    /**
     * Returns true if @tag is toggled off at exactly this point.
     *
     * If @tag is null, returns true if any tag is toggled off at this point.
     *
     * Note that if this function returns true, it means that
     * @iter is at the end of the tagged range, but that the character
     * at @iter is outside the tagged range. In other words,
     * unlike [method@Gtk.TextIter.starts_tag], if this function
     * returns true, [method@Gtk.TextIter.has_tag] will return
     * false for the same parameters.
     *
     * @param tag a `GtkTextTag`
     * @return whether @iter is the end of a range tagged with @tag
     */
    public fun endsTag(tag: TextTag? = null): Boolean =
        gtk_text_iter_ends_tag(gPointer, tag?.gtkTextTagPointer).asBoolean()

    /**
     * Determines whether @iter ends a natural-language word.
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     *
     * @return true if @iter is at the end of a word
     */
    public fun endsWord(): Boolean = gtk_text_iter_ends_word(gPointer).asBoolean()

    /**
     * Tests whether two iterators are equal, using the fastest possible
     * mechanism.
     *
     * This function is very fast; you can expect it to perform
     * better than e.g. getting the character offset for each
     * iterator and comparing the offsets yourself. Also, it’s a
     * bit faster than [method@Gtk.TextIter.compare].
     *
     * @param rhs another `GtkTextIter`
     * @return true if the iterators point to the same place in the buffer
     */
    public fun equal(rhs: TextIter): Boolean = gtk_text_iter_equal(gPointer, rhs.gPointer).asBoolean()

    /**
     * Moves @iter forward by one character offset.
     *
     * Note that images embedded in the buffer occupy 1 character slot, so
     * this function may actually move onto an image instead of a character,
     * if you have images in your buffer. If @iter is the end iterator or
     * one character before it, @iter will now point at the end iterator,
     * and this function returns false for convenience when writing loops.
     *
     * @return whether @iter moved and is dereferenceable
     */
    public fun forwardChar(): Boolean = gtk_text_iter_forward_char(gPointer).asBoolean()

    /**
     * Moves @count characters if possible.
     *
     * If @count would move past the start or end of the buffer,
     * moves to the start or end of the buffer.
     *
     * The return value indicates whether the new position of
     * @iter is different from its original position, and dereferenceable
     * (the last iterator in the buffer is not dereferenceable). If @count
     * is 0, the function does nothing and returns false.
     *
     * @param count number of characters to move, may be negative
     * @return whether @iter moved and is dereferenceable
     */
    public fun forwardChars(count: gint): Boolean = gtk_text_iter_forward_chars(gPointer, count).asBoolean()

    /**
     * Moves @iter forward by a single cursor position.
     *
     * Cursor positions are (unsurprisingly) positions where the
     * cursor can appear. Perhaps surprisingly, there may not be
     * a cursor position between all characters. The most common
     * example for European languages would be a carriage return/newline
     * sequence.
     *
     * For some Unicode characters, the equivalent of say the letter “a”
     * with an accent mark will be represented as two characters, first
     * the letter then a "combining mark" that causes the accent to be
     * rendered; so the cursor can’t go between those two characters.
     *
     * See also the [struct@Pango.LogAttr] struct and the [func@Pango.break]
     * function.
     *
     * @return true if we moved and the new position is dereferenceable
     */
    public fun forwardCursorPosition(): Boolean = gtk_text_iter_forward_cursor_position(gPointer).asBoolean()

    /**
     * Moves up to @count cursor positions.
     *
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     *
     * @param count number of positions to move
     * @return true if we moved and the new position is dereferenceable
     */
    public fun forwardCursorPositions(count: gint): Boolean =
        gtk_text_iter_forward_cursor_positions(gPointer, count).asBoolean()

    /**
     * Advances @iter, calling @pred on each character.
     *
     * If @pred returns true, returns true and stops scanning.
     * If @pred never returns true, @iter is set to @limit if
     * @limit is non-null, otherwise to the end iterator.
     *
     * @param pred a function to be called on each character
     * @param limit search limit
     * @return whether a match was found
     */
    public fun forwardFindChar(pred: TextCharPredicate, limit: TextIter? = null): Boolean =
        gtk_text_iter_forward_find_char(
            gPointer,
            TextCharPredicateFunc.reinterpret(),
            StableRef.create(pred).asCPointer(),
            limit?.gPointer
        ).asBoolean()

    /**
     * Moves @iter to the start of the next line.
     *
     * If the iter is already on the last line of the buffer,
     * moves the iter to the end of the current line. If after
     * the operation, the iter is at the end of the buffer and not
     * dereferenceable, returns false. Otherwise, returns true.
     *
     * @return whether @iter can be dereferenced
     */
    public fun forwardLine(): Boolean = gtk_text_iter_forward_line(gPointer).asBoolean()

    /**
     * Moves @count lines forward, if possible.
     *
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     *
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then false is returned. If @count is 0,
     * the function does nothing and returns false. If @count is negative,
     * moves backward by 0 - @count lines.
     *
     * @param count number of lines to move forward
     * @return whether @iter moved and is dereferenceable
     */
    public fun forwardLines(count: gint): Boolean = gtk_text_iter_forward_lines(gPointer, count).asBoolean()

    /**
     * Searches forward for @str.
     *
     * Any match is returned by setting @match_start to the first character
     * of the match and @match_end to the first character after the match.
     * The search will not continue past @limit. Note that a search is a
     * linear or O(n) operation, so you may wish to use @limit to avoid
     * locking up your UI on large buffers.
     *
     * @match_start will never be set to a `GtkTextIter` located before @iter,
     * even if there is a possible @match_end after or at @iter.
     *
     * @param str a search string
     * @param flags flags affecting how the search is done
     * @param matchStart return location for start of match
     * @param matchEnd return location for end of match
     * @param limit location of last possible @match_end, or null for the end of the buffer
     * @return whether a match was found
     */
    public fun forwardSearch(
        str: String,
        flags: TextSearchFlags,
        matchStart: TextIter?,
        matchEnd: TextIter?,
        limit: TextIter? = null,
    ): Boolean = gtk_text_iter_forward_search(
        gPointer,
        str,
        flags.mask,
        matchStart?.gPointer,
        matchEnd?.gPointer,
        limit?.gPointer
    ).asBoolean()

    /**
     * Moves forward to the next sentence end.
     *
     * If @iter is at the end of a sentence, moves to the next
     * end of sentence.
     *
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     *
     * @return true if @iter moved and is not the end iterator
     */
    public fun forwardSentenceEnd(): Boolean = gtk_text_iter_forward_sentence_end(gPointer).asBoolean()

    /**
     * Calls [method@Gtk.TextIter.forward_sentence_end] @count times.
     *
     * If @count is negative, moves backward instead of forward.
     *
     * @param count number of sentences to move
     * @return true if @iter moved and is not the end iterator
     */
    public fun forwardSentenceEnds(count: gint): Boolean =
        gtk_text_iter_forward_sentence_ends(gPointer, count).asBoolean()

    /**
     * Moves @iter forward to the “end iterator”, which points
     * one past the last valid character in the buffer.
     *
     * [method@Gtk.TextIter.get_char] called on the end iterator
     * returns 0, which is convenient for writing loops.
     */
    public fun forwardToEnd(): Unit = gtk_text_iter_forward_to_end(gPointer)

    /**
     * Moves the iterator to point to the paragraph delimiter characters.
     *
     * The possible characters are either a newline, a carriage return,
     * a carriage return/newline in sequence, or the Unicode paragraph
     * separator character.
     *
     * If the iterator is already at the paragraph delimiter
     * characters, moves to the paragraph delimiter characters for the
     * next line. If @iter is on the last line in the buffer, which does
     * not end in paragraph delimiters, moves to the end iterator (end of
     * the last line), and returns false.
     *
     * @return true if we moved and the new location is not the end iterator
     */
    public fun forwardToLineEnd(): Boolean = gtk_text_iter_forward_to_line_end(gPointer).asBoolean()

    /**
     * Moves forward to the next toggle (on or off) of the
     * @tag, or to the next toggle of any tag if
     * @tag is null.
     *
     * If no matching tag toggles are found,
     * returns false, otherwise true. Does not return toggles
     * located at @iter, only toggles after @iter. Sets @iter to
     * the location of the toggle, or to the end of the buffer
     * if no toggle is found.
     *
     * @param tag a `GtkTextTag`
     * @return whether we found a tag toggle after @iter
     */
    public fun forwardToTagToggle(tag: TextTag? = null): Boolean =
        gtk_text_iter_forward_to_tag_toggle(gPointer, tag?.gtkTextTagPointer).asBoolean()

    /**
     * Moves @iter forward to the next visible cursor position.
     *
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     *
     * @return true if we moved and the new position is dereferenceable
     */
    public fun forwardVisibleCursorPosition(): Boolean =
        gtk_text_iter_forward_visible_cursor_position(gPointer).asBoolean()

    /**
     * Moves up to @count visible cursor positions.
     *
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     *
     * @param count number of positions to move
     * @return true if we moved and the new position is dereferenceable
     */
    public fun forwardVisibleCursorPositions(count: gint): Boolean =
        gtk_text_iter_forward_visible_cursor_positions(gPointer, count).asBoolean()

    /**
     * Moves @iter to the start of the next visible line.
     *
     * Returns true if there
     * was a next line to move to, and false if @iter was simply moved to
     * the end of the buffer and is now not dereferenceable, or if @iter was
     * already at the end of the buffer.
     *
     * @return whether @iter can be dereferenced
     */
    public fun forwardVisibleLine(): Boolean = gtk_text_iter_forward_visible_line(gPointer).asBoolean()

    /**
     * Moves @count visible lines forward, if possible.
     *
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     *
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then false is returned. If @count is 0,
     * the function does nothing and returns false. If @count is negative,
     * moves backward by 0 - @count lines.
     *
     * @param count number of lines to move forward
     * @return whether @iter moved and is dereferenceable
     */
    public fun forwardVisibleLines(count: gint): Boolean =
        gtk_text_iter_forward_visible_lines(gPointer, count).asBoolean()

    /**
     * Moves forward to the next visible word end.
     *
     * If @iter is currently on a word end, moves forward to the
     * next one after that.
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     *
     * @return true if @iter moved and is not the end iterator
     */
    public fun forwardVisibleWordEnd(): Boolean = gtk_text_iter_forward_visible_word_end(gPointer).asBoolean()

    /**
     * Calls [method@Gtk.TextIter.forward_visible_word_end] up to @count times.
     *
     * @param count number of times to move
     * @return true if @iter moved and is not the end iterator
     */
    public fun forwardVisibleWordEnds(count: gint): Boolean =
        gtk_text_iter_forward_visible_word_ends(gPointer, count).asBoolean()

    /**
     * Moves forward to the next word end.
     *
     * If @iter is currently on a word end, moves forward to the
     * next one after that.
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     *
     * @return true if @iter moved and is not the end iterator
     */
    public fun forwardWordEnd(): Boolean = gtk_text_iter_forward_word_end(gPointer).asBoolean()

    /**
     * Calls [method@Gtk.TextIter.forward_word_end] up to @count times.
     *
     * @param count number of times to move
     * @return true if @iter moved and is not the end iterator
     */
    public fun forwardWordEnds(count: gint): Boolean = gtk_text_iter_forward_word_ends(gPointer, count).asBoolean()

    /**
     * Free an iterator allocated on the heap.
     *
     * This function is intended for use in language bindings,
     * and is not especially useful for applications, because
     * iterators can simply be allocated on the stack.
     */
    public fun free(): Unit = gtk_text_iter_free(gPointer)

    /**
     * Returns the `GtkTextBuffer` this iterator is associated with.
     *
     * @return the buffer
     */
    public fun getBuffer(): TextBuffer = gtk_text_iter_get_buffer(gPointer)!!.run {
        TextBuffer(this)
    }

    /**
     * Returns the number of bytes in the line containing @iter,
     * including the paragraph delimiters.
     *
     * @return number of bytes in the line
     */
    public fun getBytesInLine(): gint = gtk_text_iter_get_bytes_in_line(gPointer)

    /**
     * The Unicode character at this iterator is returned.
     *
     * Equivalent to operator* on a C++ iterator. If the element at
     * this iterator is a non-character element, such as an image
     * embedded in the buffer, the Unicode “unknown” character 0xFFFC
     * is returned. If invoked on the end iterator, zero is returned;
     * zero is not a valid Unicode character.
     *
     * So you can write a loop which ends when this function returns 0.
     *
     * @return a Unicode character, or 0 if @iter is not dereferenceable
     */
    public fun getChar(): gunichar = gtk_text_iter_get_char(gPointer)

    /**
     * Returns the number of characters in the line containing @iter,
     * including the paragraph delimiters.
     *
     * @return number of characters in the line
     */
    public fun getCharsInLine(): gint = gtk_text_iter_get_chars_in_line(gPointer)

    /**
     * If the location at @iter contains a child anchor, the
     * anchor is returned.
     *
     * Otherwise, null is returned.
     *
     * @return the anchor at @iter
     */
    public fun getChildAnchor(): TextChildAnchor? = gtk_text_iter_get_child_anchor(gPointer)?.run {
        TextChildAnchor(this)
    }

    /**
     * Returns the language in effect at @iter.
     *
     * If no tags affecting language apply to @iter, the return
     * value is identical to that of [func@Gtk.get_default_language].
     *
     * @return language in effect at @iter
     */
    public fun getLanguage(): Language = gtk_text_iter_get_language(gPointer)!!.run {
        Language(this)
    }

    /**
     * Returns the line number containing the iterator.
     *
     * Lines in a `GtkTextBuffer` are numbered beginning
     * with 0 for the first line in the buffer.
     *
     * @return a line number
     */
    public fun getLine(): gint = gtk_text_iter_get_line(gPointer)

    /**
     * Returns the byte index of the iterator, counting
     * from the start of a newline-terminated line.
     *
     * Remember that `GtkTextBuffer` encodes text in
     * UTF-8, and that characters can require a variable
     * number of bytes to represent.
     *
     * @return distance from start of line, in bytes
     */
    public fun getLineIndex(): gint = gtk_text_iter_get_line_index(gPointer)

    /**
     * Returns the character offset of the iterator,
     * counting from the start of a newline-terminated line.
     *
     * The first character on the line has offset 0.
     *
     * @return offset from start of line
     */
    public fun getLineOffset(): gint = gtk_text_iter_get_line_offset(gPointer)

    /**
     * Returns a list of all `GtkTextMark` at this location.
     *
     * Because marks are not iterable (they don’t take up any "space"
     * in the buffer, they are just marks in between iterable locations),
     * multiple marks can exist in the same place.
     *
     * The returned list is not in any meaningful order.
     *
     * @return list of `GtkTextMark`
     */
    public fun getMarks(): SList = gtk_text_iter_get_marks(gPointer)!!.run {
        SList(this)
    }

    /**
     * Returns the character offset of an iterator.
     *
     * Each character in a `GtkTextBuffer` has an offset,
     * starting with 0 for the first character in the buffer.
     * Use [method@Gtk.TextBuffer.get_iter_at_offset] to convert
     * an offset back into an iterator.
     *
     * @return a character offset
     */
    public fun getOffset(): gint = gtk_text_iter_get_offset(gPointer)

    /**
     * If the element at @iter is a paintable, the paintable is returned.
     *
     * Otherwise, null is returned.
     *
     * @return the paintable at @iter
     */
    public fun getPaintable(): Paintable? = gtk_text_iter_get_paintable(gPointer)?.run {
        Paintable.wrap(reinterpret())
    }

    /**
     * Returns the text in the given range.
     *
     * A “slice” is an array of characters encoded in UTF-8 format,
     * including the Unicode “unknown” character 0xFFFC for iterable
     * non-character elements in the buffer, such as images.
     * Because images are encoded in the slice, byte and
     * character offsets in the returned array will correspond to byte
     * offsets in the text buffer. Note that 0xFFFC can occur in normal
     * text as well, so it is not a reliable indicator that a paintable or
     * widget is in the buffer.
     *
     * @param end iterator at end of a range
     * @return slice of text from the buffer
     */
    public fun getSlice(end: TextIter): String =
        gtk_text_iter_get_slice(gPointer, end.gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns a list of tags that apply to @iter, in ascending order of
     * priority.
     *
     * The highest-priority tags are last.
     *
     * The `GtkTextTag`s in the list don’t have a reference added,
     * but you have to free the list itself.
     *
     * @return list of
     *   `GtkTextTag`
     */
    public fun getTags(): SList = gtk_text_iter_get_tags(gPointer)!!.run {
        SList(this)
    }

    /**
     * Returns text in the given range.
     *
     * If the range
     * contains non-text elements such as images, the character and byte
     * offsets in the returned string will not correspond to character and
     * byte offsets in the buffer. If you want offsets to correspond, see
     * [method@Gtk.TextIter.get_slice].
     *
     * @param end iterator at end of a range
     * @return array of characters from the buffer
     */
    public fun getText(end: TextIter): String =
        gtk_text_iter_get_text(gPointer, end.gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns a list of `GtkTextTag` that are toggled on or off at this
     * point.
     *
     * If @toggled_on is true, the list contains tags that are
     * toggled on. If a tag is toggled on at @iter, then some non-empty
     * range of characters following @iter has that tag applied to it.  If
     * a tag is toggled off, then some non-empty range following @iter
     * does not have the tag applied to it.
     *
     * @param toggledOn true to get toggled-on tags
     * @return tags
     *   toggled at this point
     */
    public fun getToggledTags(toggledOn: Boolean): SList =
        gtk_text_iter_get_toggled_tags(gPointer, toggledOn.asGBoolean())!!.run {
            SList(this)
        }

    /**
     * Returns the number of bytes from the start of the
     * line to the given @iter, not counting bytes that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     *
     * @return byte index of @iter with respect to the start of the line
     */
    public fun getVisibleLineIndex(): gint = gtk_text_iter_get_visible_line_index(gPointer)

    /**
     * Returns the offset in characters from the start of the
     * line to the given @iter, not counting characters that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     *
     * @return offset in visible characters from the start of the line
     */
    public fun getVisibleLineOffset(): gint = gtk_text_iter_get_visible_line_offset(gPointer)

    /**
     * Returns visible text in the given range.
     *
     * Like [method@Gtk.TextIter.get_slice], but invisible text
     * is not included. Invisible text is usually invisible because
     * a `GtkTextTag` with the “invisible” attribute turned on has
     * been applied to it.
     *
     * @param end iterator at end of range
     * @return slice of text from the buffer
     */
    public fun getVisibleSlice(end: TextIter): String =
        gtk_text_iter_get_visible_slice(gPointer, end.gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns visible text in the given range.
     *
     * Like [method@Gtk.TextIter.get_text], but invisible text
     * is not included. Invisible text is usually invisible because
     * a `GtkTextTag` with the “invisible” attribute turned on has
     * been applied to it.
     *
     * @param end iterator at end of range
     * @return string containing visible text in the
     * range
     */
    public fun getVisibleText(end: TextIter): String =
        gtk_text_iter_get_visible_text(gPointer, end.gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns true if @iter points to a character that is part
     * of a range tagged with @tag.
     *
     * See also [method@Gtk.TextIter.starts_tag] and
     * [method@Gtk.TextIter.ends_tag].
     *
     * @param tag a `GtkTextTag`
     * @return whether @iter is tagged with @tag
     */
    public fun hasTag(tag: TextTag): Boolean = gtk_text_iter_has_tag(gPointer, tag.gtkTextTagPointer).asBoolean()

    /**
     * Checks whether @iter falls in the range [@start, @end).
     *
     * @start and @end must be in ascending order.
     *
     * @param start start of range
     * @param end end of range
     * @return true if @iter is in the range
     */
    public fun inRange(start: TextIter, end: TextIter): Boolean =
        gtk_text_iter_in_range(gPointer, start.gPointer, end.gPointer).asBoolean()

    /**
     * Determines whether @iter is inside a sentence (as opposed to in
     * between two sentences, e.g. after a period and before the first
     * letter of the next sentence).
     *
     * Sentence boundaries are determined by Pango and should be correct
     * for nearly any language.
     *
     * @return true if @iter is inside a sentence.
     */
    public fun insideSentence(): Boolean = gtk_text_iter_inside_sentence(gPointer).asBoolean()

    /**
     * Determines whether the character pointed by @iter is part of a
     * natural-language word (as opposed to say inside some whitespace).
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     *
     * Note that if [method@Gtk.TextIter.starts_word] returns true,
     * then this function returns true too, since @iter points to
     * the first character of the word.
     *
     * @return true if @iter is inside a word
     */
    public fun insideWord(): Boolean = gtk_text_iter_inside_word(gPointer).asBoolean()

    /**
     * Determine if @iter is at a cursor position.
     *
     * See [method@Gtk.TextIter.forward_cursor_position] or
     * [struct@Pango.LogAttr] or [func@Pango.break] for details
     * on what a cursor position is.
     *
     * @return true if the cursor can be placed at @iter
     */
    public fun isCursorPosition(): Boolean = gtk_text_iter_is_cursor_position(gPointer).asBoolean()

    /**
     * Returns true if @iter is the end iterator.
     *
     * This means it is one past the last dereferenceable iterator
     * in the buffer. [method@Gtk.TextIter.is_end] is the most efficient
     * way to check whether an iterator is the end iterator.
     *
     * @return whether @iter is the end iterator
     */
    public fun isEnd(): Boolean = gtk_text_iter_is_end(gPointer).asBoolean()

    /**
     * Returns true if @iter is the first iterator in the buffer.
     *
     * @return whether @iter is the first in the buffer
     */
    public fun isStart(): Boolean = gtk_text_iter_is_start(gPointer).asBoolean()

    /**
     * Swaps the value of @first and @second if @second comes before
     * @first in the buffer.
     *
     * That is, ensures that @first and @second are in sequence.
     * Most text buffer functions that take a range call this
     * automatically on your behalf, so there’s no real reason to
     * call it yourself in those cases. There are some exceptions,
     * such as [method@Gtk.TextIter.in_range], that expect a
     * pre-sorted range.
     *
     * @param second another `GtkTextIter`
     */
    public fun order(second: TextIter): Unit = gtk_text_iter_order(gPointer, second.gPointer)

    /**
     * Moves iterator @iter to the start of the line @line_number.
     *
     * If @line_number is negative or larger than or equal to the number of lines
     * in the buffer, moves @iter to the start of the last line in the buffer.
     *
     * @param lineNumber line number (counted from 0)
     */
    public fun setLine(lineNumber: gint): Unit = gtk_text_iter_set_line(gPointer, lineNumber)

    /**
     * Same as [method@Gtk.TextIter.set_line_offset], but works with a
     * byte index. The given byte index must be at
     * the start of a character, it can’t be in the middle of a UTF-8
     * encoded character.
     *
     * @param byteOnLine a byte index relative to the start of @iter’s current line
     */
    public fun setLineIndex(byteOnLine: gint): Unit = gtk_text_iter_set_line_index(gPointer, byteOnLine)

    /**
     * Moves @iter within a line, to a new character (not byte) offset.
     *
     * The given character offset must be less than or equal to the number
     * of characters in the line; if equal, @iter moves to the start of the
     * next line. See [method@Gtk.TextIter.set_line_index] if you have a byte
     * index rather than a character offset.
     *
     * @param charOnLine a character offset relative to the start of @iter’s current line
     */
    public fun setLineOffset(charOnLine: gint): Unit = gtk_text_iter_set_line_offset(gPointer, charOnLine)

    /**
     * Sets @iter to point to @char_offset.
     *
     * @char_offset counts from the start
     * of the entire text buffer, starting with 0.
     *
     * @param charOffset a character number
     */
    public fun setOffset(charOffset: gint): Unit = gtk_text_iter_set_offset(gPointer, charOffset)

    /**
     * Like [method@Gtk.TextIter.set_line_index], but the index is in visible
     * bytes, i.e. text with a tag making it invisible is not counted
     * in the index.
     *
     * @param byteOnLine a byte index
     */
    public fun setVisibleLineIndex(byteOnLine: gint): Unit = gtk_text_iter_set_visible_line_index(gPointer, byteOnLine)

    /**
     * Like [method@Gtk.TextIter.set_line_offset], but the offset is in visible
     * characters, i.e. text with a tag making it invisible is not
     * counted in the offset.
     *
     * @param charOnLine a character offset
     */
    public fun setVisibleLineOffset(charOnLine: gint): Unit =
        gtk_text_iter_set_visible_line_offset(gPointer, charOnLine)

    /**
     * Returns true if @iter begins a paragraph.
     *
     * This is the case if [method@Gtk.TextIter.get_line_offset]
     * would return 0. However this function is potentially more
     * efficient than [method@Gtk.TextIter.get_line_offset], because
     * it doesn’t have to compute the offset, it just has to see
     * whether it’s 0.
     *
     * @return whether @iter begins a line
     */
    public fun startsLine(): Boolean = gtk_text_iter_starts_line(gPointer).asBoolean()

    /**
     * Determines whether @iter begins a sentence.
     *
     * Sentence boundaries are determined by Pango and
     * should be correct for nearly any language.
     *
     * @return true if @iter is at the start of a sentence.
     */
    public fun startsSentence(): Boolean = gtk_text_iter_starts_sentence(gPointer).asBoolean()

    /**
     * Returns true if @tag is toggled on at exactly this point.
     *
     * If @tag is null, returns true if any tag is toggled on at this point.
     *
     * Note that if this function returns true, it means that
     * @iter is at the beginning of the tagged range, and that the
     * character at @iter is inside the tagged range. In other
     * words, unlike [method@Gtk.TextIter.ends_tag], if
     * this function returns true, [method@Gtk.TextIter.has_tag]
     * will also return true for the same parameters.
     *
     * @param tag a `GtkTextTag`
     * @return whether @iter is the start of a range tagged with @tag
     */
    public fun startsTag(tag: TextTag? = null): Boolean =
        gtk_text_iter_starts_tag(gPointer, tag?.gtkTextTagPointer).asBoolean()

    /**
     * Determines whether @iter begins a natural-language word.
     *
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     *
     * @return true if @iter is at the start of a word
     */
    public fun startsWord(): Boolean = gtk_text_iter_starts_word(gPointer).asBoolean()

    /**
     * Gets whether a range with @tag applied to it begins
     * or ends at @iter.
     *
     * This is equivalent to (gtk_text_iter_starts_tag() ||
     * gtk_text_iter_ends_tag())
     *
     * @param tag a `GtkTextTag`
     * @return whether @tag is toggled on or off at @iter
     */
    public fun togglesTag(tag: TextTag? = null): Boolean =
        gtk_text_iter_toggles_tag(gPointer, tag?.gtkTextTagPointer).asBoolean()

    public companion object {
        /**
         * Get the GType of TextIter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_iter_get_type()
    }
}
