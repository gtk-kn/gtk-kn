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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkEntryCompletion
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.gtk_entry_completion_complete
import org.gtkkn.native.gtk.gtk_entry_completion_compute_prefix
import org.gtkkn.native.gtk.gtk_entry_completion_get_completion_prefix
import org.gtkkn.native.gtk.gtk_entry_completion_get_entry
import org.gtkkn.native.gtk.gtk_entry_completion_get_inline_completion
import org.gtkkn.native.gtk.gtk_entry_completion_get_inline_selection
import org.gtkkn.native.gtk.gtk_entry_completion_get_minimum_key_length
import org.gtkkn.native.gtk.gtk_entry_completion_get_model
import org.gtkkn.native.gtk.gtk_entry_completion_get_popup_completion
import org.gtkkn.native.gtk.gtk_entry_completion_get_popup_set_width
import org.gtkkn.native.gtk.gtk_entry_completion_get_popup_single_match
import org.gtkkn.native.gtk.gtk_entry_completion_get_text_column
import org.gtkkn.native.gtk.gtk_entry_completion_get_type
import org.gtkkn.native.gtk.gtk_entry_completion_insert_prefix
import org.gtkkn.native.gtk.gtk_entry_completion_new
import org.gtkkn.native.gtk.gtk_entry_completion_new_with_area
import org.gtkkn.native.gtk.gtk_entry_completion_set_inline_completion
import org.gtkkn.native.gtk.gtk_entry_completion_set_inline_selection
import org.gtkkn.native.gtk.gtk_entry_completion_set_match_func
import org.gtkkn.native.gtk.gtk_entry_completion_set_minimum_key_length
import org.gtkkn.native.gtk.gtk_entry_completion_set_model
import org.gtkkn.native.gtk.gtk_entry_completion_set_popup_completion
import org.gtkkn.native.gtk.gtk_entry_completion_set_popup_set_width
import org.gtkkn.native.gtk.gtk_entry_completion_set_popup_single_match
import org.gtkkn.native.gtk.gtk_entry_completion_set_text_column
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkEntryCompletion` is an auxiliary object to provide completion functionality
 * for `GtkEntry`.
 *
 * It implements the [iface@Gtk.CellLayout] interface, to allow the user
 * to add extra cells to the `GtkTreeView` with completion matches.
 *
 * “Completion functionality” means that when the user modifies the text
 * in the entry, `GtkEntryCompletion` checks which rows in the model match
 * the current content of the entry, and displays a list of matches.
 * By default, the matching is done by comparing the entry text
 * case-insensitively against the text column of the model (see
 * [method@Gtk.EntryCompletion.set_text_column]), but this can be overridden
 * with a custom match function (see [method@Gtk.EntryCompletion.set_match_func]).
 *
 * When the user selects a completion, the content of the entry is
 * updated. By default, the content of the entry is replaced by the
 * text column of the model, but this can be overridden by connecting
 * to the [signal@Gtk.EntryCompletion::match-selected] signal and updating the
 * entry in the signal handler. Note that you should return true from
 * the signal handler to suppress the default behaviour.
 *
 * To add completion functionality to an entry, use
 * [method@Gtk.Entry.set_completion].
 *
 * `GtkEntryCompletion` uses a [class@Gtk.TreeModelFilter] model to
 * represent the subset of the entire model that is currently matching.
 * While the `GtkEntryCompletion` signals
 * [signal@Gtk.EntryCompletion::match-selected] and
 * [signal@Gtk.EntryCompletion::cursor-on-match] take the original model
 * and an iter pointing to that model as arguments, other callbacks and
 * signals (such as `GtkCellLayoutDataFunc` or
 * [signal@Gtk.CellArea::apply-attributes)]
 * will generally take the filter model as argument. As long as you are
 * only calling [method@Gtk.TreeModel.get], this will make no difference to
 * you. If for some reason, you need the original model, use
 * [method@Gtk.TreeModelFilter.get_model]. Don’t forget to use
 * [method@Gtk.TreeModelFilter.convert_iter_to_child_iter] to obtain a
 * matching iter.
 *
 * ## Skipped during bindings generation
 *
 * - method `cell-area`: Property has no getter nor setter
 */
public open class EntryCompletion(pointer: CPointer<GtkEntryCompletion>) :
    Object(pointer.reinterpret()),
    Buildable,
    CellLayout,
    KGTyped {
    public val gtkEntryCompletionPointer: CPointer<GtkEntryCompletion>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = gPointer.reinterpret()

    /**
     * Determines whether the common prefix of the possible completions
     * should be inserted automatically in the entry.
     *
     * Note that this requires text-column to be set, even if you are
     * using a custom match function.
     */
    public open var inlineCompletion: Boolean
        /**
         * Returns whether the common prefix of the possible completions should
         * be automatically inserted in the entry.
         *
         * @return true if inline completion is turned on
         */
        get() = gtk_entry_completion_get_inline_completion(gtkEntryCompletionPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the common prefix of the possible completions should
         * be automatically inserted in the entry.
         *
         * @param inlineCompletion true to do inline completion
         */
        set(
            inlineCompletion
        ) = gtk_entry_completion_set_inline_completion(
            gtkEntryCompletionPointer.reinterpret(),
            inlineCompletion.asGBoolean()
        )

    /**
     * Determines whether the possible completions on the popup
     * will appear in the entry as you navigate through them.
     */
    public open var inlineSelection: Boolean
        /**
         * Returns true if inline-selection mode is turned on.
         *
         * @return true if inline-selection mode is on
         */
        get() = gtk_entry_completion_get_inline_selection(gtkEntryCompletionPointer.reinterpret()).asBoolean()

        /**
         * Sets whether it is possible to cycle through the possible completions
         * inside the entry.
         *
         * @param inlineSelection true to do inline selection
         */
        set(
            inlineSelection
        ) = gtk_entry_completion_set_inline_selection(
            gtkEntryCompletionPointer.reinterpret(),
            inlineSelection.asGBoolean()
        )

    public open var minimumKeyLength: gint
        /**
         * Returns the minimum key length as set for @completion.
         *
         * @return The currently used minimum key length
         */
        get() = gtk_entry_completion_get_minimum_key_length(gtkEntryCompletionPointer.reinterpret())

        /**
         * Requires the length of the search key for @completion to be at least
         * @length.
         *
         * This is useful for long lists, where completing using a small
         * key takes a lot of time and will come up with meaningless results anyway
         * (ie, a too large dataset).
         *
         * @param length the minimum length of the key in order to start completing
         */
        set(length) = gtk_entry_completion_set_minimum_key_length(gtkEntryCompletionPointer.reinterpret(), length)

    public open var model: TreeModel?
        /**
         * Returns the model the `GtkEntryCompletion` is using as data source.
         *
         * Returns null if the model is unset.
         *
         * @return A `GtkTreeModel`
         */
        get() = gtk_entry_completion_get_model(gtkEntryCompletionPointer.reinterpret())?.run {
            TreeModel.wrap(reinterpret())
        }

        /**
         * Sets the model for a `GtkEntryCompletion`.
         *
         * If @completion already has a model set, it will remove it
         * before setting the new model. If model is null, then it
         * will unset the model.
         *
         * @param model the `GtkTreeModel`
         */
        set(model) = gtk_entry_completion_set_model(gtkEntryCompletionPointer.reinterpret(), model?.gtkTreeModelPointer)

    /**
     * Determines whether the possible completions should be
     * shown in a popup window.
     */
    public open var popupCompletion: Boolean
        /**
         * Returns whether the completions should be presented in a popup window.
         *
         * @return true if popup completion is turned on
         */
        get() = gtk_entry_completion_get_popup_completion(gtkEntryCompletionPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the completions should be presented in a popup window.
         *
         * @param popupCompletion true to do popup completion
         */
        set(
            popupCompletion
        ) = gtk_entry_completion_set_popup_completion(
            gtkEntryCompletionPointer.reinterpret(),
            popupCompletion.asGBoolean()
        )

    /**
     * Determines whether the completions popup window will be
     * resized to the width of the entry.
     */
    public open var popupSetWidth: Boolean
        /**
         * Returns whether the completion popup window will be resized to the
         * width of the entry.
         *
         * @return true if the popup window will be resized to the width of
         *   the entry
         */
        get() = gtk_entry_completion_get_popup_set_width(gtkEntryCompletionPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the completion popup window will be resized to be the same
         * width as the entry.
         *
         * @param popupSetWidth true to make the width of the popup the same as the entry
         */
        set(
            popupSetWidth
        ) = gtk_entry_completion_set_popup_set_width(
            gtkEntryCompletionPointer.reinterpret(),
            popupSetWidth.asGBoolean()
        )

    /**
     * Determines whether the completions popup window will shown
     * for a single possible completion.
     *
     * You probably want to set this to false if you are using
     * [property@Gtk.EntryCompletion:inline-completion].
     */
    public open var popupSingleMatch: Boolean
        /**
         * Returns whether the completion popup window will appear even if there is
         * only a single match.
         *
         * @return true if the popup window will appear regardless of the
         *    number of matches
         */
        get() = gtk_entry_completion_get_popup_single_match(gtkEntryCompletionPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the completion popup window will appear even if there is
         * only a single match.
         *
         * You may want to set this to false if you
         * are using [property@Gtk.EntryCompletion:inline-completion].
         *
         * @param popupSingleMatch true if the popup should appear even for a single match
         */
        set(
            popupSingleMatch
        ) = gtk_entry_completion_set_popup_single_match(
            gtkEntryCompletionPointer.reinterpret(),
            popupSingleMatch.asGBoolean()
        )

    /**
     * The column of the model containing the strings.
     *
     * Note that the strings must be UTF-8.
     */
    public open var textColumn: gint
        /**
         * Returns the column in the model of @completion to get strings from.
         *
         * @return the column containing the strings
         */
        get() = gtk_entry_completion_get_text_column(gtkEntryCompletionPointer.reinterpret())

        /**
         * Convenience function for setting up the most used case of this code: a
         * completion list with just strings.
         *
         * This function will set up @completion
         * to have a list displaying all (and just) strings in the completion list,
         * and to get those strings from @column in the model of @completion.
         *
         * This functions creates and adds a `GtkCellRendererText` for the selected
         * column. If you need to set the text column, but don't want the cell
         * renderer, use g_object_set() to set the
         * [property@Gtk.EntryCompletion:text-column] property directly.
         *
         * @param column the column in the model of @completion to get strings from
         */
        set(column) = gtk_entry_completion_set_text_column(gtkEntryCompletionPointer.reinterpret(), column)

    /**
     * Creates a new `GtkEntryCompletion` object.
     *
     * @return A newly created `GtkEntryCompletion` object
     */
    public constructor() : this(gtk_entry_completion_new()!!.reinterpret())

    /**
     * Creates a new `GtkEntryCompletion` object using the
     * specified @area.
     *
     * The `GtkCellArea` is used to layout cells in the underlying
     * `GtkTreeViewColumn` for the drop-down menu.
     *
     * @param area the `GtkCellArea` used to layout cells
     * @return A newly created `GtkEntryCompletion` object
     */
    public constructor(
        area: CellArea,
    ) : this(gtk_entry_completion_new_with_area(area.gtkCellAreaPointer.reinterpret())!!.reinterpret())

    /**
     * Requests a completion operation, or in other words a refiltering of the
     * current list with completions, using the current key.
     *
     * The completion list view will be updated accordingly.
     */
    public open fun complete(): Unit = gtk_entry_completion_complete(gtkEntryCompletionPointer.reinterpret())

    /**
     * Computes the common prefix that is shared by all rows in @completion
     * that start with @key.
     *
     * If no row matches @key, null will be returned.
     * Note that a text column must have been set for this function to work,
     * see [method@Gtk.EntryCompletion.set_text_column] for details.
     *
     * @param key The text to complete for
     * @return The common prefix all rows
     *   starting with @key
     */
    public open fun computePrefix(key: String): String? =
        gtk_entry_completion_compute_prefix(gtkEntryCompletionPointer.reinterpret(), key)?.toKString()

    /**
     * Get the original text entered by the user that triggered
     * the completion or null if there’s no completion ongoing.
     *
     * @return the prefix for the current completion
     */
    public open fun getCompletionPrefix(): String? =
        gtk_entry_completion_get_completion_prefix(gtkEntryCompletionPointer.reinterpret())?.toKString()

    /**
     * Gets the entry @completion has been attached to.
     *
     * @return The entry @completion has been attached to
     */
    public open fun getEntry(): Widget = gtk_entry_completion_get_entry(gtkEntryCompletionPointer.reinterpret())!!.run {
        Widget(reinterpret())
    }

    /**
     * Requests a prefix insertion.
     */
    public open fun insertPrefix(): Unit = gtk_entry_completion_insert_prefix(gtkEntryCompletionPointer.reinterpret())

    /**
     * Sets the match function for @completion to be @func.
     *
     * The match function is used to determine if a row should or
     * should not be in the completion list.
     *
     * @param func the `GtkEntryCompletion`MatchFunc to use
     */
    public open fun setMatchFunc(func: EntryCompletionMatchFunc): Unit = gtk_entry_completion_set_match_func(
        gtkEntryCompletionPointer.reinterpret(),
        EntryCompletionMatchFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Emitted when a match from the cursor is on a match of the list.
     *
     * The default behaviour is to replace the contents
     * of the entry with the contents of the text column in the row
     * pointed to by @iter.
     *
     * Note that @model is the model that was passed to
     * [method@Gtk.EntryCompletion.set_model].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `model` the `GtkTreeModel` containing the matches; `iter` a `GtkTreeIter` positioned at the selected match. Returns true if the signal has been handled
     */
    public fun connectCursorOnMatch(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (model: TreeModel, iter: TreeIter) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "cursor-on-match",
        connectCursorOnMatchFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the inline autocompletion is triggered.
     *
     * The default behaviour is to make the entry display the
     * whole prefix and select the newly inserted part.
     *
     * Applications may connect to this signal in order to insert only a
     * smaller part of the @prefix into the entry - e.g. the entry used in
     * the `GtkFileChooser` inserts only the part of the prefix up to the
     * next '/'.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `prefix` the common prefix of all possible completions. Returns true if the signal has been handled
     */
    public fun connectInsertPrefix(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (prefix: String) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "insert-prefix",
        connectInsertPrefixFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a match from the list is selected.
     *
     * The default behaviour is to replace the contents of the
     * entry with the contents of the text column in the row
     * pointed to by @iter.
     *
     * Note that @model is the model that was passed to
     * [method@Gtk.EntryCompletion.set_model].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `model` the `GtkTreeModel` containing the matches; `iter` a `GtkTreeIter` positioned at the selected match. Returns true if the signal has been handled
     */
    public fun connectMatchSelected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (model: TreeModel, iter: TreeIter) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "match-selected",
        connectMatchSelectedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the filter model has zero
     * number of rows in completion_complete method.
     *
     * In other words when `GtkEntryCompletion` is out of suggestions.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectNoMatches(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "no-matches",
            connectNoMatchesFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EntryCompletion> {
        override val type: GeneratedClassKGType<EntryCompletion> =
            GeneratedClassKGType(gtk_entry_completion_get_type()) { EntryCompletion(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EntryCompletion
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_entry_completion_get_type()
    }
}

private val connectCursorOnMatchFunc:
    CPointer<CFunction<(CPointer<GtkTreeModel>, CPointer<GtkTreeIter>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            model: CPointer<GtkTreeModel>?,
            iter: CPointer<GtkTreeIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(model: TreeModel, iter: TreeIter) -> Boolean>().get().invoke(
            model!!.run {
                TreeModel.wrap(reinterpret())
            },
            iter!!.run {
                TreeIter(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectInsertPrefixFunc: CPointer<CFunction<(CPointer<ByteVar>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            prefix: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(prefix: String) -> Boolean>().get().invoke(
            prefix?.toKString() ?: error("Expected not null string")
        ).asGBoolean()
    }
        .reinterpret()

private val connectMatchSelectedFunc:
    CPointer<CFunction<(CPointer<GtkTreeModel>, CPointer<GtkTreeIter>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            model: CPointer<GtkTreeModel>?,
            iter: CPointer<GtkTreeIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(model: TreeModel, iter: TreeIter) -> Boolean>().get().invoke(
            model!!.run {
                TreeModel.wrap(reinterpret())
            },
            iter!!.run {
                TreeIter(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectNoMatchesFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
