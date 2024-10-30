// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Clipboard
import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkClipboard
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkTextBuffer
import org.gtkkn.native.gtk.GtkTextChildAnchor
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtk.GtkTextMark
import org.gtkkn.native.gtk.GtkTextTag
import org.gtkkn.native.gtk.gtk_text_buffer_add_mark
import org.gtkkn.native.gtk.gtk_text_buffer_add_selection_clipboard
import org.gtkkn.native.gtk.gtk_text_buffer_apply_tag
import org.gtkkn.native.gtk.gtk_text_buffer_apply_tag_by_name
import org.gtkkn.native.gtk.gtk_text_buffer_backspace
import org.gtkkn.native.gtk.gtk_text_buffer_begin_irreversible_action
import org.gtkkn.native.gtk.gtk_text_buffer_begin_user_action
import org.gtkkn.native.gtk.gtk_text_buffer_copy_clipboard
import org.gtkkn.native.gtk.gtk_text_buffer_create_child_anchor
import org.gtkkn.native.gtk.gtk_text_buffer_create_mark
import org.gtkkn.native.gtk.gtk_text_buffer_cut_clipboard
import org.gtkkn.native.gtk.gtk_text_buffer_delete
import org.gtkkn.native.gtk.gtk_text_buffer_delete_interactive
import org.gtkkn.native.gtk.gtk_text_buffer_delete_mark
import org.gtkkn.native.gtk.gtk_text_buffer_delete_mark_by_name
import org.gtkkn.native.gtk.gtk_text_buffer_delete_selection
import org.gtkkn.native.gtk.gtk_text_buffer_end_irreversible_action
import org.gtkkn.native.gtk.gtk_text_buffer_end_user_action
import org.gtkkn.native.gtk.gtk_text_buffer_get_bounds
import org.gtkkn.native.gtk.gtk_text_buffer_get_can_redo
import org.gtkkn.native.gtk.gtk_text_buffer_get_can_undo
import org.gtkkn.native.gtk.gtk_text_buffer_get_char_count
import org.gtkkn.native.gtk.gtk_text_buffer_get_enable_undo
import org.gtkkn.native.gtk.gtk_text_buffer_get_end_iter
import org.gtkkn.native.gtk.gtk_text_buffer_get_has_selection
import org.gtkkn.native.gtk.gtk_text_buffer_get_insert
import org.gtkkn.native.gtk.gtk_text_buffer_get_iter_at_child_anchor
import org.gtkkn.native.gtk.gtk_text_buffer_get_iter_at_line
import org.gtkkn.native.gtk.gtk_text_buffer_get_iter_at_line_index
import org.gtkkn.native.gtk.gtk_text_buffer_get_iter_at_line_offset
import org.gtkkn.native.gtk.gtk_text_buffer_get_iter_at_mark
import org.gtkkn.native.gtk.gtk_text_buffer_get_iter_at_offset
import org.gtkkn.native.gtk.gtk_text_buffer_get_line_count
import org.gtkkn.native.gtk.gtk_text_buffer_get_mark
import org.gtkkn.native.gtk.gtk_text_buffer_get_max_undo_levels
import org.gtkkn.native.gtk.gtk_text_buffer_get_modified
import org.gtkkn.native.gtk.gtk_text_buffer_get_selection_bound
import org.gtkkn.native.gtk.gtk_text_buffer_get_selection_bounds
import org.gtkkn.native.gtk.gtk_text_buffer_get_selection_content
import org.gtkkn.native.gtk.gtk_text_buffer_get_slice
import org.gtkkn.native.gtk.gtk_text_buffer_get_start_iter
import org.gtkkn.native.gtk.gtk_text_buffer_get_tag_table
import org.gtkkn.native.gtk.gtk_text_buffer_get_text
import org.gtkkn.native.gtk.gtk_text_buffer_get_type
import org.gtkkn.native.gtk.gtk_text_buffer_insert
import org.gtkkn.native.gtk.gtk_text_buffer_insert_at_cursor
import org.gtkkn.native.gtk.gtk_text_buffer_insert_child_anchor
import org.gtkkn.native.gtk.gtk_text_buffer_insert_interactive
import org.gtkkn.native.gtk.gtk_text_buffer_insert_interactive_at_cursor
import org.gtkkn.native.gtk.gtk_text_buffer_insert_markup
import org.gtkkn.native.gtk.gtk_text_buffer_insert_paintable
import org.gtkkn.native.gtk.gtk_text_buffer_insert_range
import org.gtkkn.native.gtk.gtk_text_buffer_insert_range_interactive
import org.gtkkn.native.gtk.gtk_text_buffer_move_mark
import org.gtkkn.native.gtk.gtk_text_buffer_move_mark_by_name
import org.gtkkn.native.gtk.gtk_text_buffer_new
import org.gtkkn.native.gtk.gtk_text_buffer_paste_clipboard
import org.gtkkn.native.gtk.gtk_text_buffer_place_cursor
import org.gtkkn.native.gtk.gtk_text_buffer_redo
import org.gtkkn.native.gtk.gtk_text_buffer_remove_all_tags
import org.gtkkn.native.gtk.gtk_text_buffer_remove_selection_clipboard
import org.gtkkn.native.gtk.gtk_text_buffer_remove_tag
import org.gtkkn.native.gtk.gtk_text_buffer_remove_tag_by_name
import org.gtkkn.native.gtk.gtk_text_buffer_select_range
import org.gtkkn.native.gtk.gtk_text_buffer_set_enable_undo
import org.gtkkn.native.gtk.gtk_text_buffer_set_max_undo_levels
import org.gtkkn.native.gtk.gtk_text_buffer_set_modified
import org.gtkkn.native.gtk.gtk_text_buffer_set_text
import org.gtkkn.native.gtk.gtk_text_buffer_undo
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * Stores text and attributes for display in a `GtkTextView`.
 *
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 *
 * GtkTextBuffer can support undoing changes to the buffer
 * content, see [method@Gtk.TextBuffer.set_enable_undo].
 *
 * ## Skipped during bindings generation
 *
 * - method `cursor-position`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 */
public open class TextBuffer(
    pointer: CPointer<GtkTextBuffer>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkTextBufferPointer: CPointer<GtkTextBuffer>
        get() = gPointer.reinterpret()

    /**
     * Denotes that the buffer can reapply the last undone action.
     */
    public open val canRedo: Boolean
        /**
         * Gets whether there is a redoable action in the history.
         *
         * @return true if there is a redoable action
         */
        get() = gtk_text_buffer_get_can_redo(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Denotes that the buffer can undo the last applied action.
     */
    public open val canUndo: Boolean
        /**
         * Gets whether there is an undoable action in the history.
         *
         * @return true if there is an undoable action
         */
        get() = gtk_text_buffer_get_can_undo(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Denotes if support for undoing and redoing changes to the buffer is allowed.
     */
    public open var enableUndo: Boolean
        /**
         * Gets whether the buffer is saving modifications to the buffer
         * to allow for undo and redo actions.
         *
         * See [method@Gtk.TextBuffer.begin_irreversible_action] and
         * [method@Gtk.TextBuffer.end_irreversible_action] to create
         * changes to the buffer that cannot be undone.
         *
         * @return true if undoing and redoing changes to the buffer is allowed.
         */
        get() = gtk_text_buffer_get_enable_undo(gtkTextBufferPointer.reinterpret()).asBoolean()

        /**
         * Sets whether or not to enable undoable actions in the text buffer.
         *
         * Undoable actions in this context are changes to the text content of
         * the buffer. Changes to tags and marks are not tracked.
         *
         * If enabled, the user will be able to undo the last number of actions
         * up to [method@Gtk.TextBuffer.get_max_undo_levels].
         *
         * See [method@Gtk.TextBuffer.begin_irreversible_action] and
         * [method@Gtk.TextBuffer.end_irreversible_action] to create
         * changes to the buffer that cannot be undone.
         *
         * @param enableUndo true to enable undo
         */
        set(enableUndo) = gtk_text_buffer_set_enable_undo(gtkTextBufferPointer.reinterpret(), enableUndo.asGBoolean())

    /**
     * Whether the buffer has some text currently selected.
     */
    public open val hasSelection: Boolean
        /**
         * Indicates whether the buffer has some text currently selected.
         *
         * @return true if the there is text selected
         */
        get() = gtk_text_buffer_get_has_selection(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * The GtkTextTagTable for the buffer.
     */
    public open val tagTable: TextTagTable
        /**
         * Get the `GtkTextTagTable` associated with this buffer.
         *
         * @return the buffer’s tag table
         */
        get() =
            gtk_text_buffer_get_tag_table(gtkTextBufferPointer.reinterpret())!!.run {
                TextTagTable(reinterpret())
            }

    /**
     * Creates a new text buffer.
     *
     * @param table a tag table, or null to create a new one
     * @return a new text buffer
     */
    public constructor(
        table: TextTagTable? = null,
    ) : this(gtk_text_buffer_new(table?.gtkTextTagTablePointer?.reinterpret())!!.reinterpret())

    /**
     * Adds the mark at position @where.
     *
     * The mark must not be added to another buffer, and if its name
     * is not null then there must not be another mark in the buffer
     * with the same name.
     *
     * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification
     * of the mark's initial placement.
     *
     * @param mark the mark to add
     * @param where location to place mark
     */
    public open fun addMark(
        mark: TextMark,
        `where`: TextIter,
    ): Unit =
        gtk_text_buffer_add_mark(
            gtkTextBufferPointer.reinterpret(),
            mark.gtkTextMarkPointer.reinterpret(),
            `where`.gtkTextIterPointer
        )

    /**
     * Adds @clipboard to the list of clipboards in which the selection
     * contents of @buffer are available.
     *
     * In most cases, @clipboard will be the `GdkClipboard` returned by
     * [method@Gtk.Widget.get_primary_clipboard] for a view of @buffer.
     *
     * @param clipboard a `GdkClipboard`
     */
    public open fun addSelectionClipboard(clipboard: Clipboard): Unit =
        gtk_text_buffer_add_selection_clipboard(
            gtkTextBufferPointer.reinterpret(),
            clipboard.gdkClipboardPointer.reinterpret()
        )

    /**
     * Emits the “apply-tag” signal on @buffer.
     *
     * The default handler for the signal applies
     * @tag to the given range. @start and @end do
     * not have to be in order.
     *
     * @param tag a `GtkTextTag`
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
     */
    public open fun applyTag(
        tag: TextTag,
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_apply_tag(
            gtkTextBufferPointer.reinterpret(),
            tag.gtkTextTagPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Emits the “apply-tag” signal on @buffer.
     *
     * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s
     * tag table to get a `GtkTextTag`, then calls
     * [method@Gtk.TextBuffer.apply_tag].
     *
     * @param name name of a named `GtkTextTag`
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
     */
    public open fun applyTagByName(
        name: String,
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_apply_tag_by_name(
            gtkTextBufferPointer.reinterpret(),
            name,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Performs the appropriate action as if the user hit the delete
     * key with the cursor at the position specified by @iter.
     *
     * In the normal case a single character will be deleted, but when
     * combining accents are involved, more than one character can
     * be deleted, and when precomposed character and accent combinations
     * are involved, less than one character will be deleted.
     *
     * Because the buffer is modified, all outstanding iterators become
     * invalid after calling this function; however, the @iter will be
     * re-initialized to point to the location where text was deleted.
     *
     * @param iter a position in @buffer
     * @param interactive whether the deletion is caused by user interaction
     * @param defaultEditable whether the buffer is editable by default
     * @return true if the buffer was modified
     */
    public open fun backspace(
        iter: TextIter,
        interactive: Boolean,
        defaultEditable: Boolean,
    ): Boolean =
        gtk_text_buffer_backspace(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            interactive.asGBoolean(),
            defaultEditable.asGBoolean()
        ).asBoolean()

    /**
     * Denotes the beginning of an action that may not be undone.
     *
     * This will cause any previous operations in the undo/redo queue
     * to be cleared.
     *
     * This should be paired with a call to
     * [method@Gtk.TextBuffer.end_irreversible_action] after the irreversible
     * action has completed.
     *
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public open fun beginIrreversibleAction(): Unit =
        gtk_text_buffer_begin_irreversible_action(gtkTextBufferPointer.reinterpret())

    /**
     * Called to indicate that the buffer operations between here and a
     * call to gtk_text_buffer_end_user_action() are part of a single
     * user-visible operation.
     *
     * The operations between gtk_text_buffer_begin_user_action() and
     * gtk_text_buffer_end_user_action() can then be grouped when creating
     * an undo stack. `GtkTextBuffer` maintains a count of calls to
     * gtk_text_buffer_begin_user_action() that have not been closed with
     * a call to gtk_text_buffer_end_user_action(), and emits the
     * “begin-user-action” and “end-user-action” signals only for the
     * outermost pair of calls. This allows you to build user actions
     * from other user actions.
     *
     * The “interactive” buffer mutation functions, such as
     * [method@Gtk.TextBuffer.insert_interactive], automatically call
     * begin/end user action around the buffer operations they perform,
     * so there's no need to add extra calls if you user action consists
     * solely of a single call to one of those functions.
     */
    public open fun beginUserAction(): Unit = gtk_text_buffer_begin_user_action(gtkTextBufferPointer.reinterpret())

    /**
     * Copies the currently-selected text to a clipboard.
     *
     * @param clipboard the `GdkClipboard` object to copy to
     */
    public open fun copyClipboard(clipboard: Clipboard): Unit =
        gtk_text_buffer_copy_clipboard(gtkTextBufferPointer.reinterpret(), clipboard.gdkClipboardPointer.reinterpret())

    /**
     * Creates and inserts a child anchor.
     *
     * This is a convenience function which simply creates a child anchor
     * with [ctor@Gtk.TextChildAnchor.new] and inserts it into the buffer
     * with [method@Gtk.TextBuffer.insert_child_anchor].
     *
     * The new anchor is owned by the buffer; no reference count is
     * returned to the caller of this function.
     *
     * @param iter location in the buffer
     * @return the created child anchor
     */
    public open fun createChildAnchor(iter: TextIter): TextChildAnchor =
        gtk_text_buffer_create_child_anchor(gtkTextBufferPointer.reinterpret(), iter.gtkTextIterPointer)!!.run {
            TextChildAnchor(reinterpret())
        }

    /**
     * Creates a mark at position @where.
     *
     * If @mark_name is null, the mark is anonymous; otherwise, the mark
     * can be retrieved by name using [method@Gtk.TextBuffer.get_mark].
     * If a mark has left gravity, and text is inserted at the mark’s
     * current location, the mark will be moved to the left of the
     * newly-inserted text. If the mark has right gravity
     * (@left_gravity = false), the mark will end up on the right of
     * newly-inserted text. The standard left-to-right cursor is a mark
     * with right gravity (when you type, the cursor stays on the right
     * side of the text you’re typing).
     *
     * The caller of this function does not own a
     * reference to the returned `GtkTextMark`, so you can ignore the
     * return value if you like. Marks are owned by the buffer and go
     * away when the buffer does.
     *
     * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification
     * of the mark's initial placement.
     *
     * @param markName name for mark
     * @param where location to place mark
     * @param leftGravity whether the mark has left gravity
     * @return the new `GtkTextMark` object
     */
    public open fun createMark(
        markName: String? = null,
        `where`: TextIter,
        leftGravity: Boolean,
    ): TextMark =
        gtk_text_buffer_create_mark(
            gtkTextBufferPointer.reinterpret(),
            markName,
            `where`.gtkTextIterPointer,
            leftGravity.asGBoolean()
        )!!.run {
            TextMark(reinterpret())
        }

    /**
     * Copies the currently-selected text to a clipboard,
     * then deletes said text if it’s editable.
     *
     * @param clipboard the `GdkClipboard` object to cut to
     * @param defaultEditable default editability of the buffer
     */
    public open fun cutClipboard(
        clipboard: Clipboard,
        defaultEditable: Boolean,
    ): Unit =
        gtk_text_buffer_cut_clipboard(
            gtkTextBufferPointer.reinterpret(),
            clipboard.gdkClipboardPointer.reinterpret(),
            defaultEditable.asGBoolean()
        )

    /**
     * Deletes text between @start and @end.
     *
     * The order of @start and @end is not actually relevant;
     * gtk_text_buffer_delete() will reorder them.
     *
     * This function actually emits the “delete-range” signal, and
     * the default handler of that signal deletes the text. Because the
     * buffer is modified, all outstanding iterators become invalid after
     * calling this function; however, the @start and @end will be
     * re-initialized to point to the location where text was deleted.
     *
     * @param start a position in @buffer
     * @param end another position in @buffer
     */
    public open fun delete(
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_delete(gtkTextBufferPointer.reinterpret(), start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Deletes all editable text in the given range.
     *
     * Calls [method@Gtk.TextBuffer.delete] for each editable
     * sub-range of [@start,@end). @start and @end are revalidated
     * to point to the location of the last deleted range, or left
     * untouched if no text was deleted.
     *
     * @param startIter start of range to delete
     * @param endIter end of range
     * @param defaultEditable whether the buffer is editable by default
     * @return whether some text was actually deleted
     */
    public open fun deleteInteractive(
        startIter: TextIter,
        endIter: TextIter,
        defaultEditable: Boolean,
    ): Boolean =
        gtk_text_buffer_delete_interactive(
            gtkTextBufferPointer.reinterpret(),
            startIter.gtkTextIterPointer,
            endIter.gtkTextIterPointer,
            defaultEditable.asGBoolean()
        ).asBoolean()

    /**
     * Deletes @mark, so that it’s no longer located anywhere in the
     * buffer.
     *
     * Removes the reference the buffer holds to the mark, so if
     * you haven’t called g_object_ref() on the mark, it will be freed.
     * Even if the mark isn’t freed, most operations on @mark become
     * invalid, until it gets added to a buffer again with
     * [method@Gtk.TextBuffer.add_mark]. Use [method@Gtk.TextMark.get_deleted]
     * to find out if a mark has been removed from its buffer.
     *
     * The [signal@Gtk.TextBuffer::mark-deleted] signal will be emitted as
     * notification after the mark is deleted.
     *
     * @param mark a `GtkTextMark` in @buffer
     */
    public open fun deleteMark(mark: TextMark): Unit =
        gtk_text_buffer_delete_mark(gtkTextBufferPointer.reinterpret(), mark.gtkTextMarkPointer.reinterpret())

    /**
     * Deletes the mark named @name; the mark must exist.
     *
     * See [method@Gtk.TextBuffer.delete_mark] for details.
     *
     * @param name name of a mark in @buffer
     */
    public open fun deleteMarkByName(name: String): Unit =
        gtk_text_buffer_delete_mark_by_name(gtkTextBufferPointer.reinterpret(), name)

    /**
     * Deletes the range between the “insert” and “selection_bound” marks,
     * that is, the currently-selected text.
     *
     * If @interactive is true, the editability of the selection will be
     * considered (users can’t delete uneditable text).
     *
     * @param interactive whether the deletion is caused by user interaction
     * @param defaultEditable whether the buffer is editable by default
     * @return whether there was a non-empty selection to delete
     */
    public open fun deleteSelection(
        interactive: Boolean,
        defaultEditable: Boolean,
    ): Boolean =
        gtk_text_buffer_delete_selection(
            gtkTextBufferPointer.reinterpret(),
            interactive.asGBoolean(),
            defaultEditable.asGBoolean()
        ).asBoolean()

    /**
     * Denotes the end of an action that may not be undone.
     *
     * This will cause any previous operations in the undo/redo
     * queue to be cleared.
     *
     * This should be called after completing modifications to the
     * text buffer after [method@Gtk.TextBuffer.begin_irreversible_action]
     * was called.
     *
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public open fun endIrreversibleAction(): Unit =
        gtk_text_buffer_end_irreversible_action(gtkTextBufferPointer.reinterpret())

    /**
     * Ends a user-visible operation.
     *
     * Should be paired with a call to
     * [method@Gtk.TextBuffer.begin_user_action].
     * See that function for a full explanation.
     */
    public open fun endUserAction(): Unit = gtk_text_buffer_end_user_action(gtkTextBufferPointer.reinterpret())

    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range [@start,@end).
     *
     * @param start iterator to initialize with first position in the buffer
     * @param end iterator to initialize with the end iterator
     */
    public open fun getBounds(
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_get_bounds(gtkTextBufferPointer.reinterpret(), start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Gets whether there is a redoable action in the history.
     *
     * @return true if there is a redoable action
     */
    public open fun getCanRedo(): Boolean = gtk_text_buffer_get_can_redo(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Gets whether there is an undoable action in the history.
     *
     * @return true if there is an undoable action
     */
    public open fun getCanUndo(): Boolean = gtk_text_buffer_get_can_undo(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Gets the number of characters in the buffer.
     *
     * Note that characters and bytes are not the same, you can’t e.g.
     * expect the contents of the buffer in string form to be this
     * many bytes long.
     *
     * The character count is cached, so this function is very fast.
     *
     * @return number of characters in the buffer
     */
    public open fun getCharCount(): Int = gtk_text_buffer_get_char_count(gtkTextBufferPointer.reinterpret())

    /**
     * Gets whether the buffer is saving modifications to the buffer
     * to allow for undo and redo actions.
     *
     * See [method@Gtk.TextBuffer.begin_irreversible_action] and
     * [method@Gtk.TextBuffer.end_irreversible_action] to create
     * changes to the buffer that cannot be undone.
     *
     * @return true if undoing and redoing changes to the buffer is allowed.
     */
    public open fun getEnableUndo(): Boolean =
        gtk_text_buffer_get_enable_undo(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Initializes @iter with the “end iterator,” one past the last valid
     * character in the text buffer.
     *
     * If dereferenced with [method@Gtk.TextIter.get_char], the end
     * iterator has a character value of 0.
     * The entire buffer lies in the range from the first position in
     * the buffer (call [method@Gtk.TextBuffer.get_start_iter] to get
     * character position 0) to the end iterator.
     *
     * @param iter iterator to initialize
     */
    public open fun getEndIter(iter: TextIter): Unit =
        gtk_text_buffer_get_end_iter(gtkTextBufferPointer.reinterpret(), iter.gtkTextIterPointer)

    /**
     * Indicates whether the buffer has some text currently selected.
     *
     * @return true if the there is text selected
     */
    public open fun getHasSelection(): Boolean =
        gtk_text_buffer_get_has_selection(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Returns the mark that represents the cursor (insertion point).
     *
     * Equivalent to calling [method@Gtk.TextBuffer.get_mark]
     * to get the mark named “insert”, but very slightly more
     * efficient, and involves less typing.
     *
     * @return insertion point mark
     */
    public open fun getInsert(): TextMark =
        gtk_text_buffer_get_insert(gtkTextBufferPointer.reinterpret())!!.run {
            TextMark(reinterpret())
        }

    /**
     * Obtains the location of @anchor within @buffer.
     *
     * @param iter an iterator to be initialized
     * @param anchor a child anchor that appears in @buffer
     */
    public open fun getIterAtChildAnchor(
        iter: TextIter,
        anchor: TextChildAnchor,
    ): Unit =
        gtk_text_buffer_get_iter_at_child_anchor(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            anchor.gtkTextChildAnchorPointer.reinterpret()
        )

    /**
     * Initializes @iter to the start of the given line.
     *
     * If @line_number is greater than or equal to the number of lines
     * in the @buffer, the end iterator is returned.
     *
     * @param iter iterator to initialize
     * @param lineNumber line number counting from 0
     * @return whether the exact position has been found
     */
    public open fun getIterAtLine(
        iter: TextIter,
        lineNumber: Int,
    ): Boolean =
        gtk_text_buffer_get_iter_at_line(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            lineNumber
        ).asBoolean()

    /**
     * Obtains an iterator pointing to @byte_index within the given line.
     *
     * @byte_index must be the start of a UTF-8 character. Note bytes, not
     * characters; UTF-8 may encode one character as multiple bytes.
     *
     * If @line_number is greater than or equal to the number of lines in the @buffer,
     * the end iterator is returned. And if @byte_index is off the
     * end of the line, the iterator at the end of the line is returned.
     *
     * @param iter iterator to initialize
     * @param lineNumber line number counting from 0
     * @param byteIndex byte index from start of line
     * @return whether the exact position has been found
     */
    public open fun getIterAtLineIndex(
        iter: TextIter,
        lineNumber: Int,
        byteIndex: Int,
    ): Boolean =
        gtk_text_buffer_get_iter_at_line_index(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            lineNumber,
            byteIndex
        ).asBoolean()

    /**
     * Obtains an iterator pointing to @char_offset within the given line.
     *
     * Note characters, not bytes; UTF-8 may encode one character as multiple
     * bytes.
     *
     * If @line_number is greater than or equal to the number of lines in the @buffer,
     * the end iterator is returned. And if @char_offset is off the
     * end of the line, the iterator at the end of the line is returned.
     *
     * @param iter iterator to initialize
     * @param lineNumber line number counting from 0
     * @param charOffset char offset from start of line
     * @return whether the exact position has been found
     */
    public open fun getIterAtLineOffset(
        iter: TextIter,
        lineNumber: Int,
        charOffset: Int,
    ): Boolean =
        gtk_text_buffer_get_iter_at_line_offset(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            lineNumber,
            charOffset
        ).asBoolean()

    /**
     * Initializes @iter with the current position of @mark.
     *
     * @param iter iterator to initialize
     * @param mark a `GtkTextMark` in @buffer
     */
    public open fun getIterAtMark(
        iter: TextIter,
        mark: TextMark,
    ): Unit =
        gtk_text_buffer_get_iter_at_mark(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            mark.gtkTextMarkPointer.reinterpret()
        )

    /**
     * Initializes @iter to a position @char_offset chars from the start
     * of the entire buffer.
     *
     * If @char_offset is -1 or greater than the number
     * of characters in the buffer, @iter is initialized to the end iterator,
     * the iterator one past the last valid character in the buffer.
     *
     * @param iter iterator to initialize
     * @param charOffset char offset from start of buffer, counting from 0, or -1
     */
    public open fun getIterAtOffset(
        iter: TextIter,
        charOffset: Int,
    ): Unit =
        gtk_text_buffer_get_iter_at_offset(gtkTextBufferPointer.reinterpret(), iter.gtkTextIterPointer, charOffset)

    /**
     * Obtains the number of lines in the buffer.
     *
     * This value is cached, so the function is very fast.
     *
     * @return number of lines in the buffer
     */
    public open fun getLineCount(): Int = gtk_text_buffer_get_line_count(gtkTextBufferPointer.reinterpret())

    /**
     * Returns the mark named @name in buffer @buffer, or null if no such
     * mark exists in the buffer.
     *
     * @param name a mark name
     * @return a `GtkTextMark`
     */
    public open fun getMark(name: String): TextMark? =
        gtk_text_buffer_get_mark(gtkTextBufferPointer.reinterpret(), name)?.run {
            TextMark(reinterpret())
        }

    /**
     * Gets the maximum number of undo levels to perform.
     *
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     *
     * @return The max number of undo levels allowed (0 indicates unlimited).
     */
    public open fun getMaxUndoLevels(): UInt = gtk_text_buffer_get_max_undo_levels(gtkTextBufferPointer.reinterpret())

    /**
     * Indicates whether the buffer has been modified since the last call
     * to [method@Gtk.TextBuffer.set_modified] set the modification flag to
     * false.
     *
     * Used for example to enable a “save” function in a text editor.
     *
     * @return true if the buffer has been modified
     */
    public open fun getModified(): Boolean =
        gtk_text_buffer_get_modified(gtkTextBufferPointer.reinterpret()).asBoolean()

    /**
     * Returns the mark that represents the selection bound.
     *
     * Equivalent to calling [method@Gtk.TextBuffer.get_mark]
     * to get the mark named “selection_bound”, but very slightly
     * more efficient, and involves less typing.
     *
     * The currently-selected text in @buffer is the region between the
     * “selection_bound” and “insert” marks. If “selection_bound” and
     * “insert” are in the same place, then there is no current selection.
     * [method@Gtk.TextBuffer.get_selection_bounds] is another convenient
     * function for handling the selection, if you just want to know whether
     * there’s a selection and what its bounds are.
     *
     * @return selection bound mark
     */
    public open fun getSelectionBound(): TextMark =
        gtk_text_buffer_get_selection_bound(gtkTextBufferPointer.reinterpret())!!.run {
            TextMark(reinterpret())
        }

    /**
     * Returns true if some text is selected; places the bounds
     * of the selection in @start and @end.
     *
     * If the selection has length 0, then @start and @end are filled
     * in with the same value. @start and @end will be in ascending order.
     * If @start and @end are null, then they are not filled in, but the
     * return value still indicates whether text is selected.
     *
     * @param start iterator to initialize with selection start
     * @param end iterator to initialize with selection end
     * @return whether the selection has nonzero length
     */
    public open fun getSelectionBounds(
        start: TextIter,
        end: TextIter,
    ): Boolean =
        gtk_text_buffer_get_selection_bounds(
            gtkTextBufferPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        ).asBoolean()

    /**
     * Get a content provider for this buffer.
     *
     * It can be used to make the content of @buffer available
     * in a `GdkClipboard`, see [method@Gdk.Clipboard.set_content].
     *
     * @return a new `GdkContentProvider`.
     */
    public open fun getSelectionContent(): ContentProvider =
        gtk_text_buffer_get_selection_content(gtkTextBufferPointer.reinterpret())!!.run {
            ContentProvider(reinterpret())
        }

    /**
     * Returns the text in the range [@start,@end).
     *
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if @include_hidden_chars is false.
     * The returned string includes a 0xFFFC character whenever the
     * buffer contains embedded images, so byte and character indexes
     * into the returned string do correspond to byte and character
     * indexes into the buffer. Contrast with [method@Gtk.TextBuffer.get_text].
     * Note that 0xFFFC can occur in normal text as well, so it is not a
     * reliable indicator that a paintable or widget is in the buffer.
     *
     * @param start start of a range
     * @param end end of a range
     * @param includeHiddenChars whether to include invisible text
     * @return an allocated UTF-8 string
     */
    public open fun getSlice(
        start: TextIter,
        end: TextIter,
        includeHiddenChars: Boolean,
    ): String =
        gtk_text_buffer_get_slice(
            gtkTextBufferPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer,
            includeHiddenChars.asGBoolean()
        )?.toKString()
            ?: error("Expected not null string")

    /**
     * Initialized @iter with the first position in the text buffer.
     *
     * This is the same as using [method@Gtk.TextBuffer.get_iter_at_offset]
     * to get the iter at character offset 0.
     *
     * @param iter iterator to initialize
     */
    public open fun getStartIter(iter: TextIter): Unit =
        gtk_text_buffer_get_start_iter(gtkTextBufferPointer.reinterpret(), iter.gtkTextIterPointer)

    /**
     * Get the `GtkTextTagTable` associated with this buffer.
     *
     * @return the buffer’s tag table
     */
    public open fun getTagTable(): TextTagTable =
        gtk_text_buffer_get_tag_table(gtkTextBufferPointer.reinterpret())!!.run {
            TextTagTable(reinterpret())
        }

    /**
     * Returns the text in the range [@start,@end).
     *
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if @include_hidden_chars is false.
     * Does not include characters representing embedded images, so
     * byte and character indexes into the returned string do not
     * correspond to byte and character indexes into the buffer.
     * Contrast with [method@Gtk.TextBuffer.get_slice].
     *
     * @param start start of a range
     * @param end end of a range
     * @param includeHiddenChars whether to include invisible text
     * @return an allocated UTF-8 string
     */
    public open fun getText(
        start: TextIter,
        end: TextIter,
        includeHiddenChars: Boolean,
    ): String =
        gtk_text_buffer_get_text(
            gtkTextBufferPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer,
            includeHiddenChars.asGBoolean()
        )?.toKString()
            ?: error("Expected not null string")

    /**
     * Inserts @len bytes of @text at position @iter.
     *
     * If @len is -1, @text must be nul-terminated and will be inserted in its
     * entirety. Emits the “insert-text” signal; insertion actually occurs
     * in the default handler for the signal. @iter is invalidated when
     * insertion occurs (because the buffer contents change), but the
     * default signal handler revalidates it to point to the end of the
     * inserted text.
     *
     * @param iter a position in the buffer
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
     */
    public open fun insert(
        iter: TextIter,
        text: String,
        len: Int,
    ): Unit = gtk_text_buffer_insert(gtkTextBufferPointer.reinterpret(), iter.gtkTextIterPointer, text, len)

    /**
     * Inserts @text in @buffer.
     *
     * Simply calls [method@Gtk.TextBuffer.insert],
     * using the current cursor position as the insertion point.
     *
     * @param text text in UTF-8 format
     * @param len length of text, in bytes
     */
    public open fun insertAtCursor(
        text: String,
        len: Int,
    ): Unit = gtk_text_buffer_insert_at_cursor(gtkTextBufferPointer.reinterpret(), text, len)

    /**
     * Inserts a child widget anchor into the text buffer at @iter.
     *
     * The anchor will be counted as one character in character counts, and
     * when obtaining the buffer contents as a string, will be represented
     * by the Unicode “object replacement character” 0xFFFC. Note that the
     * “slice” variants for obtaining portions of the buffer as a string
     * include this character for child anchors, but the “text” variants do
     * not. E.g. see [method@Gtk.TextBuffer.get_slice] and
     * [method@Gtk.TextBuffer.get_text].
     *
     * Consider [method@Gtk.TextBuffer.create_child_anchor] as a more
     * convenient alternative to this function. The buffer will add a
     * reference to the anchor, so you can unref it after insertion.
     *
     * @param iter location to insert the anchor
     * @param anchor a `GtkTextChildAnchor`
     */
    public open fun insertChildAnchor(
        iter: TextIter,
        anchor: TextChildAnchor,
    ): Unit =
        gtk_text_buffer_insert_child_anchor(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            anchor.gtkTextChildAnchorPointer.reinterpret()
        )

    /**
     * Inserts @text in @buffer.
     *
     * Like [method@Gtk.TextBuffer.insert], but the insertion will not occur
     * if @iter is at a non-editable location in the buffer. Usually you
     * want to prevent insertions at ineditable locations if the insertion
     * results from a user action (is interactive).
     *
     * @default_editable indicates the editability of text that doesn't
     * have a tag affecting editability applied to it. Typically the
     * result of [method@Gtk.TextView.get_editable] is appropriate here.
     *
     * @param iter a position in @buffer
     * @param text some UTF-8 text
     * @param len length of text in bytes, or -1
     * @param defaultEditable default editability of buffer
     * @return whether text was actually inserted
     */
    public open fun insertInteractive(
        iter: TextIter,
        text: String,
        len: Int,
        defaultEditable: Boolean,
    ): Boolean =
        gtk_text_buffer_insert_interactive(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            text,
            len,
            defaultEditable.asGBoolean()
        ).asBoolean()

    /**
     * Inserts @text in @buffer.
     *
     * Calls [method@Gtk.TextBuffer.insert_interactive]
     * at the cursor position.
     *
     * @default_editable indicates the editability of text that doesn't
     * have a tag affecting editability applied to it. Typically the
     * result of [method@Gtk.TextView.get_editable] is appropriate here.
     *
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
     * @param defaultEditable default editability of buffer
     * @return whether text was actually inserted
     */
    public open fun insertInteractiveAtCursor(
        text: String,
        len: Int,
        defaultEditable: Boolean,
    ): Boolean =
        gtk_text_buffer_insert_interactive_at_cursor(
            gtkTextBufferPointer.reinterpret(),
            text,
            len,
            defaultEditable.asGBoolean()
        ).asBoolean()

    /**
     * Inserts the text in @markup at position @iter.
     *
     * @markup will be inserted in its entirety and must be nul-terminated
     * and valid UTF-8. Emits the [signal@Gtk.TextBuffer::insert-text] signal,
     * possibly multiple times; insertion actually occurs in the default handler
     * for the signal. @iter will point to the end of the inserted text on return.
     *
     * @param iter location to insert the markup
     * @param markup a nul-terminated UTF-8 string containing Pango markup
     * @param len length of @markup in bytes, or -1
     */
    public open fun insertMarkup(
        iter: TextIter,
        markup: String,
        len: Int,
    ): Unit = gtk_text_buffer_insert_markup(gtkTextBufferPointer.reinterpret(), iter.gtkTextIterPointer, markup, len)

    /**
     * Inserts an image into the text buffer at @iter.
     *
     * The image will be counted as one character in character counts,
     * and when obtaining the buffer contents as a string, will be
     * represented by the Unicode “object replacement character” 0xFFFC.
     * Note that the “slice” variants for obtaining portions of the buffer
     * as a string include this character for paintable, but the “text”
     * variants do not. e.g. see [method@Gtk.TextBuffer.get_slice] and
     * [method@Gtk.TextBuffer.get_text].
     *
     * @param iter location to insert the paintable
     * @param paintable a `GdkPaintable`
     */
    public open fun insertPaintable(
        iter: TextIter,
        paintable: Paintable,
    ): Unit =
        gtk_text_buffer_insert_paintable(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            paintable.gdkPaintablePointer
        )

    /**
     * Copies text, tags, and paintables between @start and @end
     * and inserts the copy at @iter.
     *
     * The order of @start and @end doesn’t matter.
     *
     * Used instead of simply getting/inserting text because it preserves
     * images and tags. If @start and @end are in a different buffer from
     * @buffer, the two buffers must share the same tag table.
     *
     * Implemented via emissions of the ::insert-text and ::apply-tag signals,
     * so expect those.
     *
     * @param iter a position in @buffer
     * @param start a position in a `GtkTextBuffer`
     * @param end another position in the same buffer as @start
     */
    public open fun insertRange(
        iter: TextIter,
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_insert_range(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Copies text, tags, and paintables between @start and @end
     * and inserts the copy at @iter.
     *
     * Same as [method@Gtk.TextBuffer.insert_range], but does nothing
     * if the insertion point isn’t editable. The @default_editable
     * parameter indicates whether the text is editable at @iter if
     * no tags enclosing @iter affect editability. Typically the result
     * of [method@Gtk.TextView.get_editable] is appropriate here.
     *
     * @param iter a position in @buffer
     * @param start a position in a `GtkTextBuffer`
     * @param end another position in the same buffer as @start
     * @param defaultEditable default editability of the buffer
     * @return whether an insertion was possible at @iter
     */
    public open fun insertRangeInteractive(
        iter: TextIter,
        start: TextIter,
        end: TextIter,
        defaultEditable: Boolean,
    ): Boolean =
        gtk_text_buffer_insert_range_interactive(
            gtkTextBufferPointer.reinterpret(),
            iter.gtkTextIterPointer,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer,
            defaultEditable.asGBoolean()
        ).asBoolean()

    /**
     * Moves @mark to the new location @where.
     *
     * Emits the [signal@Gtk.TextBuffer::mark-set] signal
     * as notification of the move.
     *
     * @param mark a `GtkTextMark`
     * @param where new location for @mark in @buffer
     */
    public open fun moveMark(
        mark: TextMark,
        `where`: TextIter,
    ): Unit =
        gtk_text_buffer_move_mark(
            gtkTextBufferPointer.reinterpret(),
            mark.gtkTextMarkPointer.reinterpret(),
            `where`.gtkTextIterPointer
        )

    /**
     * Moves the mark named @name (which must exist) to location @where.
     *
     * See [method@Gtk.TextBuffer.move_mark] for details.
     *
     * @param name name of a mark
     * @param where new location for mark
     */
    public open fun moveMarkByName(
        name: String,
        `where`: TextIter,
    ): Unit = gtk_text_buffer_move_mark_by_name(gtkTextBufferPointer.reinterpret(), name, `where`.gtkTextIterPointer)

    /**
     * Pastes the contents of a clipboard.
     *
     * If @override_location is null, the pasted text will be inserted
     * at the cursor position, or the buffer selection will be replaced
     * if the selection is non-empty.
     *
     * Note: pasting is asynchronous, that is, we’ll ask for the paste data
     * and return, and at some point later after the main loop runs, the paste
     * data will be inserted.
     *
     * @param clipboard the `GdkClipboard` to paste from
     * @param overrideLocation location to insert pasted text
     * @param defaultEditable whether the buffer is editable by default
     */
    public open fun pasteClipboard(
        clipboard: Clipboard,
        overrideLocation: TextIter? = null,
        defaultEditable: Boolean,
    ): Unit =
        gtk_text_buffer_paste_clipboard(
            gtkTextBufferPointer.reinterpret(),
            clipboard.gdkClipboardPointer.reinterpret(),
            overrideLocation?.gtkTextIterPointer,
            defaultEditable.asGBoolean()
        )

    /**
     * This function moves the “insert” and “selection_bound” marks
     * simultaneously.
     *
     * If you move them to the same place in two steps with
     * [method@Gtk.TextBuffer.move_mark], you will temporarily select a
     * region in between their old and new locations, which can be pretty
     * inefficient since the temporarily-selected region will force stuff
     * to be recalculated. This function moves them as a unit, which can
     * be optimized.
     *
     * @param where where to put the cursor
     */
    public open fun placeCursor(`where`: TextIter): Unit =
        gtk_text_buffer_place_cursor(gtkTextBufferPointer.reinterpret(), `where`.gtkTextIterPointer)

    /**
     * Redoes the next redoable action on the buffer, if there is one.
     */
    public open fun redo(): Unit = gtk_text_buffer_redo(gtkTextBufferPointer.reinterpret())

    /**
     * Removes all tags in the range between @start and @end.
     *
     * Be careful with this function; it could remove tags added in code
     * unrelated to the code you’re currently writing. That is, using this
     * function is probably a bad idea if you have two or more unrelated
     * code sections that add tags.
     *
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
     */
    public open fun removeAllTags(
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_remove_all_tags(
            gtkTextBufferPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Removes a `GdkClipboard` added with
     * [method@Gtk.TextBuffer.add_selection_clipboard]
     *
     * @param clipboard a `GdkClipboard` added to @buffer by
     *   [method@Gtk.TextBuffer.add_selection_clipboard]
     */
    public open fun removeSelectionClipboard(clipboard: Clipboard): Unit =
        gtk_text_buffer_remove_selection_clipboard(
            gtkTextBufferPointer.reinterpret(),
            clipboard.gdkClipboardPointer.reinterpret()
        )

    /**
     * Emits the “remove-tag” signal.
     *
     * The default handler for the signal removes all occurrences
     * of @tag from the given range. @start and @end don’t have
     * to be in order.
     *
     * @param tag a `GtkTextTag`
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
     */
    public open fun removeTag(
        tag: TextTag,
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_remove_tag(
            gtkTextBufferPointer.reinterpret(),
            tag.gtkTextTagPointer.reinterpret(),
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Emits the “remove-tag” signal.
     *
     * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s
     * tag table to get a `GtkTextTag`, then calls
     * [method@Gtk.TextBuffer.remove_tag].
     *
     * @param name name of a `GtkTextTag`
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
     */
    public open fun removeTagByName(
        name: String,
        start: TextIter,
        end: TextIter,
    ): Unit =
        gtk_text_buffer_remove_tag_by_name(
            gtkTextBufferPointer.reinterpret(),
            name,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * This function moves the “insert” and “selection_bound” marks
     * simultaneously.
     *
     * If you move them in two steps with
     * [method@Gtk.TextBuffer.move_mark], you will temporarily select a
     * region in between their old and new locations, which can be pretty
     * inefficient since the temporarily-selected region will force stuff
     * to be recalculated. This function moves them as a unit, which can
     * be optimized.
     *
     * @param ins where to put the “insert” mark
     * @param bound where to put the “selection_bound” mark
     */
    public open fun selectRange(
        ins: TextIter,
        bound: TextIter,
    ): Unit =
        gtk_text_buffer_select_range(
            gtkTextBufferPointer.reinterpret(),
            ins.gtkTextIterPointer,
            bound.gtkTextIterPointer
        )

    /**
     * Sets whether or not to enable undoable actions in the text buffer.
     *
     * Undoable actions in this context are changes to the text content of
     * the buffer. Changes to tags and marks are not tracked.
     *
     * If enabled, the user will be able to undo the last number of actions
     * up to [method@Gtk.TextBuffer.get_max_undo_levels].
     *
     * See [method@Gtk.TextBuffer.begin_irreversible_action] and
     * [method@Gtk.TextBuffer.end_irreversible_action] to create
     * changes to the buffer that cannot be undone.
     *
     * @param enableUndo true to enable undo
     */
    public open fun setEnableUndo(enableUndo: Boolean): Unit =
        gtk_text_buffer_set_enable_undo(gtkTextBufferPointer.reinterpret(), enableUndo.asGBoolean())

    /**
     * Sets the maximum number of undo levels to perform.
     *
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     *
     * @param maxUndoLevels the maximum number of undo actions to perform
     */
    public open fun setMaxUndoLevels(maxUndoLevels: UInt): Unit =
        gtk_text_buffer_set_max_undo_levels(gtkTextBufferPointer.reinterpret(), maxUndoLevels)

    /**
     * Used to keep track of whether the buffer has been
     * modified since the last time it was saved.
     *
     * Whenever the buffer is saved to disk, call
     * `gtk_text_buffer_set_modified (@buffer, FALSE)`.
     * When the buffer is modified, it will automatically
     * toggle on the modified bit again. When the modified
     * bit flips, the buffer emits the
     * [signal@Gtk.TextBuffer::modified-changed] signal.
     *
     * @param setting modification flag setting
     */
    public open fun setModified(setting: Boolean): Unit =
        gtk_text_buffer_set_modified(gtkTextBufferPointer.reinterpret(), setting.asGBoolean())

    /**
     * Deletes current contents of @buffer, and inserts @text instead. This is
     * automatically marked as an irreversible action in the undo stack. If you
     * wish to mark this action as part of a larger undo operation, call
     * [method@TextBuffer.delete] and [method@TextBuffer.insert] directly instead.
     *
     * If @len is -1, @text must be nul-terminated.
     * @text must be valid UTF-8.
     *
     * @param text UTF-8 text to insert
     * @param len length of @text in bytes
     */
    public open fun setText(
        text: String,
        len: Int,
    ): Unit = gtk_text_buffer_set_text(gtkTextBufferPointer.reinterpret(), text, len)

    /**
     * Undoes the last undoable action on the buffer, if there is one.
     */
    public open fun undo(): Unit = gtk_text_buffer_undo(gtkTextBufferPointer.reinterpret())

    /**
     * Emitted to apply a tag to a range of text in a `GtkTextBuffer`.
     *
     * Applying actually occurs in the default handler.
     *
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has to
     * revalidate them).
     *
     * See also:
     * [method@Gtk.TextBuffer.apply_tag],
     * [method@Gtk.TextBuffer.insert_with_tags],
     * [method@Gtk.TextBuffer.insert_range].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the applied tag; `start` the start of the range the tag is applied to; `end` the end of the range the tag is applied to
     */
    public fun connectApplyTag(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            tag: TextTag,
            start: TextIter,
            end: TextIter,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "apply-tag",
            connectApplyTagFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted at the beginning of a single user-visible
     * operation on a `GtkTextBuffer`.
     *
     * See also:
     * [method@Gtk.TextBuffer.begin_user_action],
     * [method@Gtk.TextBuffer.insert_interactive],
     * [method@Gtk.TextBuffer.insert_range_interactive],
     * [method@Gtk.TextBuffer.delete_interactive],
     * [method@Gtk.TextBuffer.backspace],
     * [method@Gtk.TextBuffer.delete_selection].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectBeginUserAction(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "begin-user-action",
            connectBeginUserActionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the content of a `GtkTextBuffer` has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to delete a range from a `GtkTextBuffer`.
     *
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has
     * to revalidate them). The default signal handler revalidates
     * the @start and @end iters to both point to the location
     * where text was deleted. Handlers which run after the default
     * handler (see g_signal_connect_after()) do not have access to
     * the deleted text.
     *
     * See also: [method@Gtk.TextBuffer.delete].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `start` the start of the range to be deleted; `end` the end of the range to be deleted
     */
    public fun connectDeleteRange(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (start: TextIter, end: TextIter) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "delete-range",
            connectDeleteRangeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted at the end of a single user-visible
     * operation on the `GtkTextBuffer`.
     *
     * See also:
     * [method@Gtk.TextBuffer.end_user_action],
     * [method@Gtk.TextBuffer.insert_interactive],
     * [method@Gtk.TextBuffer.insert_range_interactive],
     * [method@Gtk.TextBuffer.delete_interactive],
     * [method@Gtk.TextBuffer.backspace],
     * [method@Gtk.TextBuffer.delete_selection],
     * [method@Gtk.TextBuffer.backspace].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectEndUserAction(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "end-user-action",
            connectEndUserActionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to insert a `GtkTextChildAnchor` in a `GtkTextBuffer`.
     *
     * Insertion actually occurs in the default handler.
     *
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted @anchor.
     *
     * See also: [method@Gtk.TextBuffer.insert_child_anchor].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `location` position to insert @anchor in @textbuffer; `anchor` the `GtkTextChildAnchor` to be inserted
     */
    public fun connectInsertChildAnchor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (location: TextIter, anchor: TextChildAnchor) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "insert-child-anchor",
            connectInsertChildAnchorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to insert a `GdkPaintable` in a `GtkTextBuffer`.
     *
     * Insertion actually occurs in the default handler.
     *
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted @paintable.
     *
     * See also: [method@Gtk.TextBuffer.insert_paintable].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `location` position to insert @paintable in @textbuffer; `paintable` the `GdkPaintable` to be inserted
     */
    public fun connectInsertPaintable(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (location: TextIter, paintable: Paintable) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "insert-paintable",
            connectInsertPaintableFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to insert text in a `GtkTextBuffer`.
     *
     * Insertion actually occurs in the default handler.
     *
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to point to the end of the inserted text.
     *
     * See also: [method@Gtk.TextBuffer.insert],
     * [method@Gtk.TextBuffer.insert_range].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `location` position to insert @text in @textbuffer; `text` the UTF-8 text to be inserted; `len` length of the inserted text in bytes
     */
    public fun connectInsertText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            location: TextIter,
            text: String,
            len: Int,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "insert-text",
            connectInsertTextFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted as notification after a `GtkTextMark` is deleted.
     *
     * See also: [method@Gtk.TextBuffer.delete_mark].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mark` The mark that was deleted
     */
    public fun connectMarkDeleted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mark: TextMark) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mark-deleted",
            connectMarkDeletedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted as notification after a `GtkTextMark` is set.
     *
     * See also:
     * [method@Gtk.TextBuffer.create_mark],
     * [method@Gtk.TextBuffer.move_mark].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `location` The location of @mark in @textbuffer; `mark` The mark that is set
     */
    public fun connectMarkSet(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (location: TextIter, mark: TextMark) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "mark-set",
            connectMarkSetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the modified bit of a `GtkTextBuffer` flips.
     *
     * See also: [method@Gtk.TextBuffer.set_modified].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectModifiedChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "modified-changed",
            connectModifiedChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted after paste operation has been completed.
     *
     * This is useful to properly scroll the view to the end
     * of the pasted text. See [method@Gtk.TextBuffer.paste_clipboard]
     * for more details.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `clipboard` the `GdkClipboard` pasted from
     */
    public fun connectPasteDone(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (clipboard: Clipboard) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "paste-done",
            connectPasteDoneFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a request has been made to redo the
     * previously undone operation.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectRedo(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "redo",
            connectRedoFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to remove all occurrences of @tag from a range
     * of text in a `GtkTextBuffer`.
     *
     * Removal actually occurs in the default handler.
     *
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has
     * to revalidate them).
     *
     * See also: [method@Gtk.TextBuffer.remove_tag].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the tag to be removed; `start` the start of the range the tag is removed from; `end` the end of the range the tag is removed from
     */
    public fun connectRemoveTag(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            tag: TextTag,
            start: TextIter,
            end: TextIter,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "remove-tag",
            connectRemoveTagFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a request has been made to undo the
     * previous operation or set of operations that have
     * been grouped together.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectUndo(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "undo",
            connectUndoFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TextBuffer> {
        override val type: GeneratedClassKGType<TextBuffer> =
            GeneratedClassKGType(gtk_text_buffer_get_type()) { TextBuffer(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectApplyTagFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTextTag>,
            CPointer<GtkTextIter>,
            CPointer<GtkTextIter>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            start: CPointer<GtkTextIter>?,
            end: CPointer<GtkTextIter>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    tag: TextTag,
                    start: TextIter,
                    end: TextIter,
                ) -> Unit
            >()
            .get()
            .invoke(
                tag!!.run {
                    TextTag(reinterpret())
                },
                start!!.run {
                    TextIter(reinterpret())
                },
                end!!.run {
                    TextIter(reinterpret())
                }
            )
    }.reinterpret()

private val connectBeginUserActionFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectDeleteRangeFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GtkTextIter>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            start: CPointer<GtkTextIter>?,
            end: CPointer<GtkTextIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(start: TextIter, end: TextIter) -> Unit>().get().invoke(
            start!!.run {
                TextIter(reinterpret())
            },
            end!!.run {
                TextIter(reinterpret())
            }
        )
    }.reinterpret()

private val connectEndUserActionFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectInsertChildAnchorFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GtkTextChildAnchor>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            location: CPointer<GtkTextIter>?,
            anchor: CPointer<GtkTextChildAnchor>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(location: TextIter, anchor: TextChildAnchor) -> Unit>().get().invoke(
            location!!.run {
                TextIter(reinterpret())
            },
            anchor!!.run {
                TextChildAnchor(reinterpret())
            }
        )
    }.reinterpret()

private val connectInsertPaintableFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GdkPaintable>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            location: CPointer<GtkTextIter>?,
            paintable: CPointer<GdkPaintable>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(location: TextIter, paintable: Paintable) -> Unit>().get().invoke(
            location!!.run {
                TextIter(reinterpret())
            },
            paintable!!.run {
                Paintable.wrap(reinterpret())
            }
        )
    }.reinterpret()

private val connectInsertTextFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTextIter>,
            CPointer<ByteVar>,
            Int,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            location: CPointer<GtkTextIter>?,
            text: CPointer<ByteVar>?,
            len: Int,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    location: TextIter,
                    text: String,
                    len: Int,
                ) -> Unit
            >()
            .get()
            .invoke(
                location!!.run {
                    TextIter(reinterpret())
                },
                text?.toKString() ?: error("Expected not null string"),
                len
            )
    }.reinterpret()

private val connectMarkDeletedFunc: CPointer<CFunction<(CPointer<GtkTextMark>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mark: CPointer<GtkTextMark>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mark: TextMark) -> Unit>().get().invoke(
            mark!!.run {
                TextMark(reinterpret())
            }
        )
    }.reinterpret()

private val connectMarkSetFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GtkTextMark>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            location: CPointer<GtkTextIter>?,
            mark: CPointer<GtkTextMark>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(location: TextIter, mark: TextMark) -> Unit>().get().invoke(
            location!!.run {
                TextIter(reinterpret())
            },
            mark!!.run {
                TextMark(reinterpret())
            }
        )
    }.reinterpret()

private val connectModifiedChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectPasteDoneFunc: CPointer<CFunction<(CPointer<GdkClipboard>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            clipboard: CPointer<GdkClipboard>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(clipboard: Clipboard) -> Unit>().get().invoke(
            clipboard!!.run {
                Clipboard(reinterpret())
            }
        )
    }.reinterpret()

private val connectRedoFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectRemoveTagFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTextTag>,
            CPointer<GtkTextIter>,
            CPointer<GtkTextIter>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            start: CPointer<GtkTextIter>?,
            end: CPointer<GtkTextIter>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    tag: TextTag,
                    start: TextIter,
                    end: TextIter,
                ) -> Unit
            >()
            .get()
            .invoke(
                tag!!.run {
                    TextTag(reinterpret())
                },
                start!!.run {
                    TextIter(reinterpret())
                },
                end!!.run {
                    TextIter(reinterpret())
                }
            )
    }.reinterpret()

private val connectUndoFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
