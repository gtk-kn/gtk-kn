// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.TextBuffer
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtk.TextMark
import org.gtkkn.bindings.gtk.TextTagTable
import org.gtkkn.bindings.gtksource.annotations.GtkSourceVersion5_10
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtk.GtkTextMark
import org.gtkkn.native.gtksource.GtkSourceBracketMatchType
import org.gtkkn.native.gtksource.GtkSourceBuffer
import org.gtkkn.native.gtksource.gtk_source_buffer_change_case
import org.gtkkn.native.gtksource.gtk_source_buffer_create_source_mark
import org.gtkkn.native.gtksource.gtk_source_buffer_ensure_highlight
import org.gtkkn.native.gtksource.gtk_source_buffer_get_context_classes_at_iter
import org.gtkkn.native.gtksource.gtk_source_buffer_get_highlight_matching_brackets
import org.gtkkn.native.gtksource.gtk_source_buffer_get_highlight_syntax
import org.gtkkn.native.gtksource.gtk_source_buffer_get_implicit_trailing_newline
import org.gtkkn.native.gtksource.gtk_source_buffer_get_language
import org.gtkkn.native.gtksource.gtk_source_buffer_get_loading
import org.gtkkn.native.gtksource.gtk_source_buffer_get_source_marks_at_iter
import org.gtkkn.native.gtksource.gtk_source_buffer_get_source_marks_at_line
import org.gtkkn.native.gtksource.gtk_source_buffer_get_style_scheme
import org.gtkkn.native.gtksource.gtk_source_buffer_get_type
import org.gtkkn.native.gtksource.gtk_source_buffer_iter_has_context_class
import org.gtkkn.native.gtksource.gtk_source_buffer_join_lines
import org.gtkkn.native.gtksource.gtk_source_buffer_new
import org.gtkkn.native.gtksource.gtk_source_buffer_new_with_language
import org.gtkkn.native.gtksource.gtk_source_buffer_remove_source_marks
import org.gtkkn.native.gtksource.gtk_source_buffer_set_highlight_matching_brackets
import org.gtkkn.native.gtksource.gtk_source_buffer_set_highlight_syntax
import org.gtkkn.native.gtksource.gtk_source_buffer_set_implicit_trailing_newline
import org.gtkkn.native.gtksource.gtk_source_buffer_set_language
import org.gtkkn.native.gtksource.gtk_source_buffer_set_style_scheme
import org.gtkkn.native.gtksource.gtk_source_buffer_sort_lines
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * Subclass of [class@Gtk.TextBuffer].
 *
 * A `GtkSourceBuffer` object is the model for [class@View] widgets.
 * It extends the [class@Gtk.TextBuffer] class by adding features useful to display
 * and edit source code such as syntax highlighting and bracket matching.
 *
 * To create a `GtkSourceBuffer` use [ctor@GtkSource.Buffer.new] or
 * [ctor@GtkSource.Buffer.new_with_language]. The second form is just a convenience
 * function which allows you to initially set a [class@Language]. You can also
 * directly create a [class@View] and get its [class@Buffer] with
 * [method@Gtk.TextView.get_buffer].
 *
 * The highlighting is enabled by default, but you can disable it with
 * [method@Buffer.set_highlight_syntax].
 *
 * # Context Classes:
 *
 * It is possible to retrieve some information from the syntax highlighting
 * engine. The default context classes that are applied to regions of a
 * `GtkSourceBuffer`:
 *
 *  - **comment**: the region delimits a comment;
 *  - **no-spell-check**: the region should not be spell checked;
 *  - **path**: the region delimits a path to a file;
 *  - **string**: the region delimits a string.
 *
 * Custom language definition files can create their own context classes,
 * since the functions like [method@Buffer.iter_has_context_class] take
 * a string parameter as the context class.
 *
 * `GtkSourceBuffer` provides an API to access the context classes:
 * [method@Buffer.iter_has_context_class],
 * [method@Buffer.get_context_classes_at_iter],
 * [method@Buffer.iter_forward_to_context_class_toggle] and
 * [method@Buffer.iter_backward_to_context_class_toggle].
 *
 * And the [signal@GtkSource.Buffer::highlight-updated] signal permits to be notified
 * when a context class region changes.
 *
 * Each context class has also an associated [class@Gtk.TextTag] with the name
 * `gtksourceview:context-classes:<name>`. For example to
 * retrieve the [class@Gtk.TextTag] for the string context class, one can write:
 * ```c
 * GtkTextTagTable *tag_table;
 * GtkTextTag *tag;
 *
 * tag_table = gtk_text_buffer_get_tag_table (buffer);
 * tag = gtk_text_tag_table_lookup (tag_table, "gtksourceview:context-classes:string");
 * ```
 *
 * The tag must be used for read-only purposes.
 *
 * Accessing a context class via the associated [class@Gtk.TextTag] is less
 * convenient than the `GtkSourceBuffer` API, because:
 *
 *  - The tag doesn't always exist, you need to listen to the
 *    [signal@Gtk.TextTagTable::tag-added] and [signal@Gtk.TextTagTable::tag-removed] signals.
 *  - Instead of the [signal@GtkSource.Buffer::highlight-updated] signal, you can listen
 *    to the [signal@Gtk.TextBuffer::apply-tag] and [signal@Gtk.TextBuffer::remove-tag] signals.
 *
 * A possible use-case for accessing a context class via the associated
 * [class@Gtk.TextTag] is to read the region but without adding a hard dependency on the
 * GtkSourceView library (for example for a spell-checking library that wants to
 * read the no-spell-check region).
 *
 * ## Skipped during bindings generation
 *
 * - method `backward_iter_to_source_mark`: In/Out parameter is not supported
 * - method `create_source_tag`: Varargs parameter is not supported
 * - method `forward_iter_to_source_mark`: In/Out parameter is not supported
 * - method `iter_backward_to_context_class_toggle`: In/Out parameter is not supported
 * - method `iter_forward_to_context_class_toggle`: In/Out parameter is not supported
 */
public open class Buffer(public val gtksourceBufferPointer: CPointer<GtkSourceBuffer>) :
    TextBuffer(gtksourceBufferPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    /**
     * Whether to highlight matching brackets in the buffer.
     */
    public open var highlightMatchingBrackets: Boolean
        /**
         * Determines whether bracket match highlighting is activated for the
         * source buffer.
         *
         * @return true if the source buffer will highlight matching
         * brackets.
         */
        get() = gtk_source_buffer_get_highlight_matching_brackets(gtksourceBufferPointer).asBoolean()

        /**
         * Controls the bracket match highlighting function in the buffer.
         *
         * If activated, when you position your cursor over a bracket character
         * (a parenthesis, a square bracket, etc.) the matching opening or
         * closing bracket character will be highlighted.
         *
         * @param highlight true if you want matching brackets highlighted.
         */
        set(
            highlight
        ) = gtk_source_buffer_set_highlight_matching_brackets(gtksourceBufferPointer, highlight.asGBoolean())

    /**
     * Whether to highlight syntax in the buffer.
     */
    public open var highlightSyntax: Boolean
        /**
         * Determines whether syntax highlighting is activated in the source
         * buffer.
         *
         * @return true if syntax highlighting is enabled, false otherwise.
         */
        get() = gtk_source_buffer_get_highlight_syntax(gtksourceBufferPointer).asBoolean()

        /**
         * Controls whether syntax is highlighted in the buffer.
         *
         * If @highlight is true, the text will be highlighted according to the syntax
         * patterns specified in the [class@Language] set with [method@Buffer.set_language].
         *
         * If @highlight is false, syntax highlighting is disabled and all the
         * [class@Gtk.TextTag] objects that have been added by the syntax highlighting engine
         * are removed from the buffer.
         *
         * @param highlight true to enable syntax highlighting, false to disable it.
         */
        set(highlight) = gtk_source_buffer_set_highlight_syntax(gtksourceBufferPointer, highlight.asGBoolean())

    /**
     * Whether the buffer has an implicit trailing newline. See
     * [method@Buffer.set_implicit_trailing_newline].
     */
    public open var implicitTrailingNewline: Boolean
        /**
         *
         *
         * @return whether the @buffer has an implicit trailing newline.
         */
        get() = gtk_source_buffer_get_implicit_trailing_newline(gtksourceBufferPointer).asBoolean()

        /**
         * Sets whether the @buffer has an implicit trailing newline.
         *
         * If an explicit trailing newline is present in a [class@Gtk.TextBuffer], [class@Gtk.TextView]
         * shows it as an empty line. This is generally not what the user expects.
         *
         * If @implicit_trailing_newline is true (the default value):
         *  - when a [class@FileLoader] loads the content of a file into the @buffer,
         *    the trailing newline (if present in the file) is not inserted into the
         *    @buffer.
         *  - when a [class@FileSaver] saves the content of the @buffer into a file, a
         *    trailing newline is added to the file.
         *
         * On the other hand, if @implicit_trailing_newline is false, the file's
         * content is not modified when loaded into the @buffer, and the @buffer's
         * content is not modified when saved into a file.
         *
         * @param implicitTrailingNewline the new value.
         */
        set(
            implicitTrailingNewline
        ) = gtk_source_buffer_set_implicit_trailing_newline(
            gtksourceBufferPointer,
            implicitTrailingNewline.asGBoolean()
        )

    public open var language: Language?
        /**
         * Returns the [class@Language] associated with the buffer,
         * see [method@Buffer.set_language].
         *
         * The returned object should not be unreferenced by the user.
         *
         * @return the [class@Language] associated
         * with the buffer, or null.
         */
        get() = gtk_source_buffer_get_language(gtksourceBufferPointer)?.run {
            InstanceCache.get(this, true) { Language(reinterpret()) }!!
        }

        /**
         * Associates a [class@Language] with the buffer.
         *
         * Note that a [class@Language] affects not only the syntax highlighting, but
         * also the [context classes](./class.Buffer.html#context-classes). If you want to disable just the
         * syntax highlighting, see [method@Buffer.set_highlight_syntax].
         *
         * The buffer holds a reference to @language.
         *
         * @param language a #GtkSourceLanguage to set, or null.
         */
        set(language) = gtk_source_buffer_set_language(gtksourceBufferPointer, language?.gtksourceLanguagePointer)

    /**
     * The "loading" property denotes that a `GtkSourceFileLoader` is
     * currently loading the buffer.
     *
     * Applications may want to use this setting to avoid doing work
     * while the buffer is loading such as spellchecking.
     *
     * @since 5.10
     */
    @GtkSourceVersion5_10
    public open val loading: Boolean
        get() = gtk_source_buffer_get_loading(gtksourceBufferPointer).asBoolean()

    /**
     * Style scheme. It contains styles for syntax highlighting, optionally
     * foreground, background, cursor color, current line color, and matching
     * brackets style.
     */
    public open var styleScheme: StyleScheme?
        /**
         * Returns the [class@StyleScheme] associated with the buffer,
         * see [method@Buffer.set_style_scheme].
         *
         * The returned object should not be unreferenced by the user.
         *
         * @return the [class@StyleScheme]
         * associated with the buffer, or null.
         */
        get() = gtk_source_buffer_get_style_scheme(gtksourceBufferPointer)?.run {
            InstanceCache.get(this, true) { StyleScheme(reinterpret()) }!!
        }

        /**
         * Sets a [class@StyleScheme] to be used by the buffer and the view.
         *
         * Note that a [class@StyleScheme] affects not only the syntax highlighting,
         * but also other [class@View] features such as highlighting the current line,
         * matching brackets, the line numbers, etc.
         *
         * Instead of setting a null @scheme, it is better to disable syntax
         * highlighting with [method@Buffer.set_highlight_syntax], and setting the
         * [class@StyleScheme] with the "classic" or "tango" ID, because those two
         * style schemes follow more closely the GTK theme (for example for the
         * background color).
         *
         * The buffer holds a reference to @scheme.
         *
         * @param scheme a #GtkSourceStyleScheme or null.
         */
        set(scheme) = gtk_source_buffer_set_style_scheme(gtksourceBufferPointer, scheme?.gtksourceStyleSchemePointer)

    /**
     * Creates a new source buffer.
     *
     * @param table a #GtkTextTagTable, or null to create a new one.
     * @return a new source buffer.
     */
    public constructor(table: TextTagTable? = null) : this(gtk_source_buffer_new(table?.gtkTextTagTablePointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new source buffer using the highlighting patterns in `language`.
     *
     * This is equivalent to creating a new source buffer with
     * a new tag table and then calling [method@Buffer.set_language].
     *
     * @param language a #GtkSourceLanguage.
     * @return a new source buffer which will highlight text
     * according to the highlighting patterns in `language`.
     */
    public constructor(
        language: Language,
    ) : this(gtk_source_buffer_new_with_language(language.gtksourceLanguagePointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Changes the case of the text between the specified iterators.
     *
     * Since 5.4, this function will update the position of `start` and
     * `end` to surround the modified text.
     *
     * @param caseType how to change the case.
     * @param start a #GtkTextIter.
     * @param end a #GtkTextIter.
     */
    public open fun changeCase(caseType: ChangeCaseType, start: TextIter, end: TextIter): Unit =
        gtk_source_buffer_change_case(
            gtksourceBufferPointer,
            caseType.nativeValue,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )

    /**
     * Creates a source mark in the `buffer` of category `category`.
     *
     * A source mark is a [class@Gtk.TextMark] but organized into categories.
     * Depending on the category a pixbuf can be specified that will be displayed
     * along the line of the mark.
     *
     * Like a [class@Gtk.TextMark], a [class@Mark] can be anonymous if the
     * passed `name` is null.  Also, the buffer owns the marks so you
     * shouldn't unreference it.
     *
     * Marks always have left gravity and are moved to the beginning of
     * the line when the user deletes the line they were in.
     *
     * Typical uses for a source mark are bookmarks, breakpoints, current
     * executing instruction indication in a source file, etc..
     *
     * @param name the name of the mark, or null.
     * @param category a string defining the mark category.
     * @param where location to place the mark.
     * @return a new [class@Mark], owned by the buffer.
     */
    public open fun createSourceMark(name: String? = null, category: String, `where`: TextIter): Mark =
        gtk_source_buffer_create_source_mark(gtksourceBufferPointer, name, category, `where`.gtkTextIterPointer)!!.run {
            InstanceCache.get(this, true) { Mark(reinterpret()) }!!
        }

    /**
     * Forces buffer to analyze and highlight the given area synchronously.
     *
     * **Note**:
     *
     * This is a potentially slow operation and should be used only
     * when you need to make sure that some text not currently
     * visible is highlighted, for instance before printing.
     *
     * @param start start of the area to highlight.
     * @param end end of the area to highlight.
     */
    public open fun ensureHighlight(start: TextIter, end: TextIter): Unit =
        gtk_source_buffer_ensure_highlight(gtksourceBufferPointer, start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Get all defined context classes at @iter.
     *
     * See the [class@Buffer] description for the list of default context classes.
     *
     * @param iter a #GtkTextIter.
     * @return a new null
     * terminated array of context class names.
     * Use g_strfreev() to free the array if it is no longer needed.
     */
    public open fun getContextClassesAtIter(iter: TextIter): List<String> =
        gtk_source_buffer_get_context_classes_at_iter(gtksourceBufferPointer, iter.gtkTextIterPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Returns the list of marks of the given category at @iter.
     *
     * If @category is null it returns all marks at @iter.
     *
     * @param iter an iterator.
     * @param category category to search for, or null
     * @return a newly allocated #GSList.
     */
    public open fun getSourceMarksAtIter(iter: TextIter, category: String? = null): SList =
        gtk_source_buffer_get_source_marks_at_iter(gtksourceBufferPointer, iter.gtkTextIterPointer, category)!!.run {
            SList(this)
        }

    /**
     * Returns the list of marks of the given category at @line.
     *
     * If @category is null, all marks at @line are returned.
     *
     * @param line a line number.
     * @param category category to search for, or null
     * @return a newly allocated #GSList.
     */
    public open fun getSourceMarksAtLine(line: gint, category: String? = null): SList =
        gtk_source_buffer_get_source_marks_at_line(gtksourceBufferPointer, line, category)!!.run {
            SList(this)
        }

    /**
     * Check if the class @context_class is set on @iter.
     *
     * See the [class@Buffer] description for the list of default context classes.
     *
     * @param iter a #GtkTextIter.
     * @param contextClass class to search for.
     * @return whether @iter has the context class.
     */
    public open fun iterHasContextClass(iter: TextIter, contextClass: String): Boolean =
        gtk_source_buffer_iter_has_context_class(
            gtksourceBufferPointer,
            iter.gtkTextIterPointer,
            contextClass
        ).asBoolean()

    /**
     * Joins the lines of text between the specified iterators.
     *
     * @param start a #GtkTextIter.
     * @param end a #GtkTextIter.
     */
    public open fun joinLines(start: TextIter, end: TextIter): Unit =
        gtk_source_buffer_join_lines(gtksourceBufferPointer, start.gtkTextIterPointer, end.gtkTextIterPointer)

    /**
     * Remove all marks of @category between @start and @end from the buffer.
     *
     * If @category is NULL, all marks in the range will be removed.
     *
     * @param start a #GtkTextIter.
     * @param end a #GtkTextIter.
     * @param category category to search for, or null.
     */
    public open fun removeSourceMarks(start: TextIter, end: TextIter, category: String? = null): Unit =
        gtk_source_buffer_remove_source_marks(
            gtksourceBufferPointer,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer,
            category
        )

    /**
     * Sort the lines of text between the specified iterators.
     *
     * @param start a #GtkTextIter.
     * @param end a #GtkTextIter.
     * @param flags #GtkSourceSortFlags specifying how the sort should behave
     * @param column sort considering the text starting at the given column
     */
    public open fun sortLines(start: TextIter, end: TextIter, flags: SortFlags, column: gint): Unit =
        gtk_source_buffer_sort_lines(
            gtksourceBufferPointer,
            start.gtkTextIterPointer,
            end.gtkTextIterPointer,
            flags.mask,
            column
        )

    /**
     * @iter is set to a valid iterator pointing to the matching bracket
     * if @state is %GTK_SOURCE_BRACKET_MATCH_FOUND. Otherwise @iter is
     * meaningless.
     *
     * The signal is emitted only when the @state changes, typically when
     * the cursor moves.
     *
     * A use-case for this signal is to show messages in a [class@Gtk.Statusbar].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` if found, the location of the matching bracket.; `state` state of bracket matching.
     */
    public fun onBracketMatched(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TextIter?, state: BracketMatchType) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceBufferPointer,
        "bracket-matched",
        onBracketMatchedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "bracket-matched" signal. See [onBracketMatched].
     *
     * @param iter if found, the location of the matching bracket.
     * @param state state of bracket matching.
     */
    public fun emitBracketMatched(iter: TextIter?, state: BracketMatchType) {
        g_signal_emit_by_name(
            gtksourceBufferPointer.reinterpret(),
            "bracket-matched",
            iter?.gtkTextIterPointer,
            state.nativeValue
        )
    }

    /**
     * The "cursor-moved" signal is emitted when then insertion mark has moved.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCursorMoved(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtksourceBufferPointer,
            "cursor-moved",
            onCursorMovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "cursor-moved" signal. See [onCursorMoved].
     */
    public fun emitCursorMoved() {
        g_signal_emit_by_name(gtksourceBufferPointer.reinterpret(), "cursor-moved")
    }

    /**
     * The ::highlight-updated signal is emitted when the syntax
     * highlighting and [context classes](./class.Buffer.html#context-classes) are updated in a
     * certain region of the @buffer.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `start` the start of the updated region; `end` the end of the updated region
     */
    public fun onHighlightUpdated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (start: TextIter, end: TextIter) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceBufferPointer,
        "highlight-updated",
        onHighlightUpdatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "highlight-updated" signal. See [onHighlightUpdated].
     *
     * @param start the start of the updated region
     * @param end the end of the updated region
     */
    public fun emitHighlightUpdated(start: TextIter, end: TextIter) {
        g_signal_emit_by_name(
            gtksourceBufferPointer.reinterpret(),
            "highlight-updated",
            start.gtkTextIterPointer,
            end.gtkTextIterPointer
        )
    }

    /**
     * The ::source-mark-updated signal is emitted each time
     * a mark is added to, moved or removed from the @buffer.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `mark` the [class@Mark]
     */
    public fun onSourceMarkUpdated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (mark: TextMark) -> Unit,
    ): ULong = g_signal_connect_data(
        gtksourceBufferPointer,
        "source-mark-updated",
        onSourceMarkUpdatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "source-mark-updated" signal. See [onSourceMarkUpdated].
     *
     * @param mark the [class@Mark]
     */
    public fun emitSourceMarkUpdated(mark: TextMark) {
        g_signal_emit_by_name(gtksourceBufferPointer.reinterpret(), "source-mark-updated", mark.gtkTextMarkPointer)
    }

    public companion object : TypeCompanion<Buffer> {
        override val type: GeneratedClassKGType<Buffer> =
            GeneratedClassKGType(getTypeOrNull()!!) { Buffer(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of Buffer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_buffer_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_buffer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_buffer_get_type")
    }
}

private val onBracketMatchedFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>?, GtkSourceBracketMatchType) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTextIter>?,
            state: GtkSourceBracketMatchType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TextIter?, state: BracketMatchType) -> Unit>().get().invoke(
            iter?.run {
                TextIter(this)
            },
            state.run {
                BracketMatchType.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val onCursorMovedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onHighlightUpdatedFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GtkTextIter>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            start: CPointer<GtkTextIter>?,
            end: CPointer<GtkTextIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(start: TextIter, end: TextIter) -> Unit>().get().invoke(
            start!!.run {
                TextIter(this)
            },
            end!!.run {
                TextIter(this)
            }
        )
    }
        .reinterpret()

private val onSourceMarkUpdatedFunc: CPointer<CFunction<(CPointer<GtkTextMark>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            mark: CPointer<GtkTextMark>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(mark: TextMark) -> Unit>().get().invoke(
            mark!!.run {
                InstanceCache.get(this, false) { TextMark(reinterpret()) }!!
            }
        )
    }
        .reinterpret()
