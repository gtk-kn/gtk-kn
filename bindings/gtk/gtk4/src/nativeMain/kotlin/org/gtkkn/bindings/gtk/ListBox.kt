// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkListBox
import org.gtkkn.native.gtk.GtkListBoxRow
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.gtk_list_box_append
import org.gtkkn.native.gtk.gtk_list_box_bind_model
import org.gtkkn.native.gtk.gtk_list_box_drag_highlight_row
import org.gtkkn.native.gtk.gtk_list_box_drag_unhighlight_row
import org.gtkkn.native.gtk.gtk_list_box_get_activate_on_single_click
import org.gtkkn.native.gtk.gtk_list_box_get_adjustment
import org.gtkkn.native.gtk.gtk_list_box_get_row_at_index
import org.gtkkn.native.gtk.gtk_list_box_get_row_at_y
import org.gtkkn.native.gtk.gtk_list_box_get_selected_row
import org.gtkkn.native.gtk.gtk_list_box_get_selected_rows
import org.gtkkn.native.gtk.gtk_list_box_get_selection_mode
import org.gtkkn.native.gtk.gtk_list_box_get_show_separators
import org.gtkkn.native.gtk.gtk_list_box_get_type
import org.gtkkn.native.gtk.gtk_list_box_insert
import org.gtkkn.native.gtk.gtk_list_box_invalidate_filter
import org.gtkkn.native.gtk.gtk_list_box_invalidate_headers
import org.gtkkn.native.gtk.gtk_list_box_invalidate_sort
import org.gtkkn.native.gtk.gtk_list_box_new
import org.gtkkn.native.gtk.gtk_list_box_prepend
import org.gtkkn.native.gtk.gtk_list_box_remove
import org.gtkkn.native.gtk.gtk_list_box_remove_all
import org.gtkkn.native.gtk.gtk_list_box_select_all
import org.gtkkn.native.gtk.gtk_list_box_select_row
import org.gtkkn.native.gtk.gtk_list_box_selected_foreach
import org.gtkkn.native.gtk.gtk_list_box_set_activate_on_single_click
import org.gtkkn.native.gtk.gtk_list_box_set_adjustment
import org.gtkkn.native.gtk.gtk_list_box_set_filter_func
import org.gtkkn.native.gtk.gtk_list_box_set_header_func
import org.gtkkn.native.gtk.gtk_list_box_set_placeholder
import org.gtkkn.native.gtk.gtk_list_box_set_selection_mode
import org.gtkkn.native.gtk.gtk_list_box_set_show_separators
import org.gtkkn.native.gtk.gtk_list_box_set_sort_func
import org.gtkkn.native.gtk.gtk_list_box_unselect_all
import org.gtkkn.native.gtk.gtk_list_box_unselect_row
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkListBox` is a vertical list.
 *
 * A `GtkListBox` only contains `GtkListBoxRow` children. These rows can
 * by dynamically sorted and filtered, and headers can be added dynamically
 * depending on the row content. It also allows keyboard and mouse navigation
 * and selection like a typical list.
 *
 * Using `GtkListBox` is often an alternative to `GtkTreeView`, especially
 * when the list contents has a more complicated layout than what is allowed
 * by a `GtkCellRenderer`, or when the contents is interactive (i.e. has a
 * button in it).
 *
 * Although a `GtkListBox` must have only `GtkListBoxRow` children, you can
 * add any kind of widget to it via [method@Gtk.ListBox.prepend],
 * [method@Gtk.ListBox.append] and [method@Gtk.ListBox.insert] and a
 * `GtkListBoxRow` widget will automatically be inserted between the list
 * and the widget.
 *
 * `GtkListBoxRows` can be marked as activatable or selectable. If a row is
 * activatable, [signal@Gtk.ListBox::row-activated] will be emitted for it when
 * the user tries to activate it. If it is selectable, the row will be marked
 * as selected when the user tries to select it.
 *
 * # GtkListBox as GtkBuildable
 *
 * The `GtkListBox` implementation of the `GtkBuildable` interface supports
 * setting a child as the placeholder by specifying “placeholder” as the “type”
 * attribute of a `<child>` element. See [method@Gtk.ListBox.set_placeholder]
 * for info.
 *
 * # CSS nodes
 *
 * |[<!-- language="plain" -->
 * list[.separators][.rich-list][.navigation-sidebar][.boxed-list]
 * ╰── row[.activatable]
 * ]|
 *
 * `GtkListBox` uses a single CSS node named list. It may carry the .separators
 * style class, when the [property@Gtk.ListBox:show-separators] property is set.
 * Each `GtkListBoxRow` uses a single CSS node named row. The row nodes get the
 * .activatable style class added when appropriate.
 *
 * It may also carry the .boxed-list style class. In this case, the list will be
 * automatically surrounded by a frame and have separators.
 *
 * The main list node may also carry style classes to select
 * the style of [list presentation](section-list-widget.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 *
 * # Accessibility
 *
 * `GtkListBox` uses the %GTK_ACCESSIBLE_ROLE_LIST role and `GtkListBoxRow` uses
 * the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
 *
 * ## Skipped during bindings generation
 *
 * - method `accept-unpaired-release`: Property has no getter nor setter
 */
public open class ListBox(public val gtkListBoxPointer: CPointer<GtkListBox>) :
    Widget(gtkListBoxPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Determines whether children can be activated with a single
     * click, or require a double-click.
     */
    public open var activateOnSingleClick: Boolean
        /**
         * Returns whether rows activate on single clicks.
         *
         * @return true if rows are activated on single click, false otherwise
         */
        get() = gtk_list_box_get_activate_on_single_click(gtkListBoxPointer).asBoolean()

        /**
         * If @single is true, rows will be activated when you click on them,
         * otherwise you need to double-click.
         *
         * @param single a boolean
         */
        set(single) = gtk_list_box_set_activate_on_single_click(gtkListBoxPointer, single.asGBoolean())

    /**
     * The selection mode used by the list box.
     */
    public open var selectionMode: SelectionMode
        /**
         * Gets the selection mode of the listbox.
         *
         * @return a `GtkSelectionMode`
         */
        get() = gtk_list_box_get_selection_mode(gtkListBoxPointer).run {
            SelectionMode.fromNativeValue(this)
        }

        /**
         * Sets how selection works in the listbox.
         *
         * @param mode The `GtkSelectionMode`
         */
        set(mode) = gtk_list_box_set_selection_mode(gtkListBoxPointer, mode.nativeValue)

    /**
     * Whether to show separators between rows.
     */
    public open var showSeparators: Boolean
        /**
         * Returns whether the list box should show separators
         * between rows.
         *
         * @return true if the list box shows separators
         */
        get() = gtk_list_box_get_show_separators(gtkListBoxPointer).asBoolean()

        /**
         * Sets whether the list box should show separators
         * between rows.
         *
         * @param showSeparators true to show separators
         */
        set(showSeparators) = gtk_list_box_set_show_separators(gtkListBoxPointer, showSeparators.asGBoolean())

    /**
     * Creates a new `GtkListBox` container.
     *
     * @return a new `GtkListBox`
     */
    public constructor() : this(gtk_list_box_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Append a widget to the list.
     *
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     *
     * @param child the `GtkWidget` to add
     */
    public open fun append(child: Widget): Unit = gtk_list_box_append(gtkListBoxPointer, child.gtkWidgetPointer)

    /**
     * Binds @model to @box.
     *
     * If @box was already bound to a model, that previous binding is
     * destroyed.
     *
     * The contents of @box are cleared and then filled with widgets that
     * represent items from @model. @box is updated whenever @model changes.
     * If @model is null, @box is left empty.
     *
     * It is undefined to add or remove widgets directly (for example, with
     * [method@Gtk.ListBox.insert]) while @box is bound to a model.
     *
     * Note that using a model is incompatible with the filtering and sorting
     * functionality in `GtkListBox`. When using a model, filtering and sorting
     * should be implemented by the model.
     *
     * @param model the `GListModel` to be bound to @box
     * @param createWidgetFunc a function that creates widgets for items
     *   or null in case you also passed null as @model
     */
    public open fun bindModel(model: ListModel? = null, createWidgetFunc: ListBoxCreateWidgetFunc?): Unit =
        gtk_list_box_bind_model(
            gtkListBoxPointer,
            model?.gioListModelPointer,
            createWidgetFunc?.let {
                ListBoxCreateWidgetFuncFunc.reinterpret()
            },
            createWidgetFunc?.let {
                StableRef.create(createWidgetFunc).asCPointer()
            },
            createWidgetFunc?.let { staticStableRefDestroy.reinterpret() }
        )

    /**
     * Add a drag highlight to a row.
     *
     * This is a helper function for implementing DnD onto a `GtkListBox`.
     * The passed in @row will be highlighted by setting the
     * %GTK_STATE_FLAG_DROP_ACTIVE state and any previously highlighted
     * row will be unhighlighted.
     *
     * The row will also be unhighlighted when the widget gets
     * a drag leave event.
     *
     * @param row a `GtkListBoxRow`
     */
    public open fun dragHighlightRow(row: ListBoxRow): Unit =
        gtk_list_box_drag_highlight_row(gtkListBoxPointer, row.gtkListBoxRowPointer)

    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * it will have the highlight removed.
     */
    public open fun dragUnhighlightRow(): Unit = gtk_list_box_drag_unhighlight_row(gtkListBoxPointer)

    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     *
     * @return the adjustment
     */
    public open fun getAdjustment(): Adjustment? = gtk_list_box_get_adjustment(gtkListBoxPointer)?.run {
        InstanceCache.get(this, true) { Adjustment(reinterpret()) }!!
    }

    /**
     * Gets the n-th child in the list (not counting headers).
     *
     * If @index_ is negative or larger than the number of items in the
     * list, null is returned.
     *
     * @param index the index of the row
     * @return the child `GtkWidget`
     */
    public open fun getRowAtIndex(index: gint): ListBoxRow? =
        gtk_list_box_get_row_at_index(gtkListBoxPointer, index)?.run {
            InstanceCache.get(this, true) { ListBoxRow(reinterpret()) }!!
        }

    /**
     * Gets the row at the @y position.
     *
     * @param y position
     * @return the row
     */
    public open fun getRowAtY(y: gint): ListBoxRow? = gtk_list_box_get_row_at_y(gtkListBoxPointer, y)?.run {
        InstanceCache.get(this, true) { ListBoxRow(reinterpret()) }!!
    }

    /**
     * Gets the selected row, or null if no rows are selected.
     *
     * Note that the box may allow multiple selection, in which
     * case you should use [method@Gtk.ListBox.selected_foreach] to
     * find all selected rows.
     *
     * @return the selected row
     */
    public open fun getSelectedRow(): ListBoxRow? = gtk_list_box_get_selected_row(gtkListBoxPointer)?.run {
        InstanceCache.get(this, true) { ListBoxRow(reinterpret()) }!!
    }

    /**
     * Creates a list of all selected children.
     *
     * @return A `GList` containing the `GtkWidget` for each selected child.
     *   Free with g_list_free() when done.
     */
    public open fun getSelectedRows(): List = gtk_list_box_get_selected_rows(gtkListBoxPointer)!!.run {
        List(this)
    }

    /**
     * Insert the @child into the @box at @position.
     *
     * If a sort function is
     * set, the widget will actually be inserted at the calculated position.
     *
     * If @position is -1, or larger than the total number of items in the
     * @box, then the @child will be appended to the end.
     *
     * @param child the `GtkWidget` to add
     * @param position the position to insert @child in
     */
    public open fun insert(child: Widget, position: gint): Unit =
        gtk_list_box_insert(gtkListBoxPointer, child.gtkWidgetPointer, position)

    /**
     * Update the filtering for all rows.
     *
     * Call this when result
     * of the filter function on the @box is changed due
     * to an external factor. For instance, this would be used
     * if the filter function just looked for a specific search
     * string and the entry with the search string has changed.
     */
    public open fun invalidateFilter(): Unit = gtk_list_box_invalidate_filter(gtkListBoxPointer)

    /**
     * Update the separators for all rows.
     *
     * Call this when result
     * of the header function on the @box is changed due
     * to an external factor.
     */
    public open fun invalidateHeaders(): Unit = gtk_list_box_invalidate_headers(gtkListBoxPointer)

    /**
     * Update the sorting for all rows.
     *
     * Call this when result
     * of the sort function on the @box is changed due
     * to an external factor.
     */
    public open fun invalidateSort(): Unit = gtk_list_box_invalidate_sort(gtkListBoxPointer)

    /**
     * Prepend a widget to the list.
     *
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     *
     * @param child the `GtkWidget` to add
     */
    public open fun prepend(child: Widget): Unit = gtk_list_box_prepend(gtkListBoxPointer, child.gtkWidgetPointer)

    /**
     * Removes a child from @box.
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit = gtk_list_box_remove(gtkListBoxPointer, child.gtkWidgetPointer)

    /**
     * Removes all rows from @box.
     *
     * This function does nothing if @box is backed by a model.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun removeAll(): Unit = gtk_list_box_remove_all(gtkListBoxPointer)

    /**
     * Select all children of @box, if the selection mode allows it.
     */
    public open fun selectAll(): Unit = gtk_list_box_select_all(gtkListBoxPointer)

    /**
     * Make @row the currently selected row.
     *
     * @param row The row to select
     */
    public open fun selectRow(row: ListBoxRow? = null): Unit =
        gtk_list_box_select_row(gtkListBoxPointer, row?.gtkListBoxRowPointer)

    /**
     * Calls a function for each selected child.
     *
     * Note that the selection cannot be modified from within this function.
     *
     * @param func the function to call for each selected child
     */
    public open fun selectedForeach(func: ListBoxForeachFunc): Unit = gtk_list_box_selected_foreach(
        gtkListBoxPointer,
        ListBoxForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Sets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     *
     * For instance, this is used to get the page size for
     * PageUp/Down key handling.
     *
     * In the normal case when the @box is packed inside
     * a `GtkScrolledWindow` the adjustment from that will
     * be picked up automatically, so there is no need
     * to manually do that.
     *
     * @param adjustment the adjustment
     */
    public open fun setAdjustment(adjustment: Adjustment? = null): Unit =
        gtk_list_box_set_adjustment(gtkListBoxPointer, adjustment?.gtkAdjustmentPointer)

    /**
     * By setting a filter function on the @box one can decide dynamically which
     * of the rows to show.
     *
     * For instance, to implement a search function on a list that
     * filters the original list to only show the matching rows.
     *
     * The @filter_func will be called for each row after the call, and
     * it will continue to be called each time a row changes (via
     * [method@Gtk.ListBoxRow.changed]) or when [method@Gtk.ListBox.invalidate_filter]
     * is called.
     *
     * Note that using a filter function is incompatible with using a model
     * (see [method@Gtk.ListBox.bind_model]).
     *
     * @param filterFunc callback that lets you filter which rows to show
     */
    public open fun setFilterFunc(filterFunc: ListBoxFilterFunc?): Unit = gtk_list_box_set_filter_func(
        gtkListBoxPointer,
        filterFunc?.let {
            ListBoxFilterFuncFunc.reinterpret()
        },
        filterFunc?.let {
            StableRef.create(filterFunc).asCPointer()
        },
        filterFunc?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Sets a header function.
     *
     * By setting a header function on the @box one can dynamically add headers
     * in front of rows, depending on the contents of the row and its position
     * in the list.
     *
     * For instance, one could use it to add headers in front of the first item
     * of a new kind, in a list sorted by the kind.
     *
     * The @update_header can look at the current header widget using
     * [method@Gtk.ListBoxRow.get_header] and either update the state of the widget
     * as needed, or set a new one using [method@Gtk.ListBoxRow.set_header]. If no
     * header is needed, set the header to null.
     *
     * Note that you may get many calls @update_header to this for a particular
     * row when e.g. changing things that don’t affect the header. In this case
     * it is important for performance to not blindly replace an existing header
     * with an identical one.
     *
     * The @update_header function will be called for each row after the call,
     * and it will continue to be called each time a row changes (via
     * [method@Gtk.ListBoxRow.changed]) and when the row before changes (either
     * by [method@Gtk.ListBoxRow.changed] on the previous row, or when the previous
     * row becomes a different row). It is also called for all rows when
     * [method@Gtk.ListBox.invalidate_headers] is called.
     *
     * @param updateHeader callback that lets you add row headers
     */
    public open fun setHeaderFunc(updateHeader: ListBoxUpdateHeaderFunc?): Unit = gtk_list_box_set_header_func(
        gtkListBoxPointer,
        updateHeader?.let {
            ListBoxUpdateHeaderFuncFunc.reinterpret()
        },
        updateHeader?.let {
            StableRef.create(updateHeader).asCPointer()
        },
        updateHeader?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Sets the placeholder widget that is shown in the list when
     * it doesn't display any visible children.
     *
     * @param placeholder a `GtkWidget`
     */
    public open fun setPlaceholder(placeholder: Widget? = null): Unit =
        gtk_list_box_set_placeholder(gtkListBoxPointer, placeholder?.gtkWidgetPointer)

    /**
     * Sets a sort function.
     *
     * By setting a sort function on the @box one can dynamically reorder
     * the rows of the list, based on the contents of the rows.
     *
     * The @sort_func will be called for each row after the call, and will
     * continue to be called each time a row changes (via
     * [method@Gtk.ListBoxRow.changed]) and when [method@Gtk.ListBox.invalidate_sort]
     * is called.
     *
     * Note that using a sort function is incompatible with using a model
     * (see [method@Gtk.ListBox.bind_model]).
     *
     * @param sortFunc the sort function
     */
    public open fun setSortFunc(sortFunc: ListBoxSortFunc?): Unit = gtk_list_box_set_sort_func(
        gtkListBoxPointer,
        sortFunc?.let {
            ListBoxSortFuncFunc.reinterpret()
        },
        sortFunc?.let {
            StableRef.create(sortFunc).asCPointer()
        },
        sortFunc?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * Unselect all children of @box, if the selection mode allows it.
     */
    public open fun unselectAll(): Unit = gtk_list_box_unselect_all(gtkListBoxPointer)

    /**
     * Unselects a single row of @box, if the selection mode allows it.
     *
     * @param row the row to unselect
     */
    public open fun unselectRow(row: ListBoxRow): Unit =
        gtk_list_box_unselect_row(gtkListBoxPointer, row.gtkListBoxRowPointer)

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivateCursorRow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkListBoxPointer,
            "activate-cursor-row",
            onActivateCursorRowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate-cursor-row" signal. See [onActivateCursorRow].
     */
    public fun emitActivateCursorRow() {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "activate-cursor-row")
    }

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` ; `p0` ; `p1` ; `p2`
     */
    public fun onMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            `object`: MovementStep,
            p0: gint,
            p1: Boolean,
            p2: Boolean,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkListBoxPointer,
        "move-cursor",
        onMoveCursorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-cursor" signal. See [onMoveCursor].
     *
     * @param object
     * @param p0
     * @param p1
     * @param p2
     */
    public fun emitMoveCursor(`object`: MovementStep, p0: gint, p1: Boolean, p2: Boolean) {
        g_signal_emit_by_name(
            gtkListBoxPointer.reinterpret(),
            "move-cursor",
            `object`.nativeValue,
            p0,
            p1.asGBoolean(),
            p2.asGBoolean()
        )
    }

    /**
     * Emitted when a row has been activated by the user.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `row` the activated row
     */
    public fun onRowActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (row: ListBoxRow) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkListBoxPointer,
        "row-activated",
        onRowActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "row-activated" signal. See [onRowActivated].
     *
     * @param row the activated row
     */
    public fun emitRowActivated(row: ListBoxRow) {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "row-activated", row.gtkListBoxRowPointer)
    }

    /**
     * Emitted when a new row is selected, or (with a null @row)
     * when the selection is cleared.
     *
     * When the @box is using %GTK_SELECTION_MULTIPLE, this signal will not
     * give you the full picture of selection changes, and you should use
     * the [signal@Gtk.ListBox::selected-rows-changed] signal instead.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `row` the selected row
     */
    public fun onRowSelected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (row: ListBoxRow?) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkListBoxPointer,
        "row-selected",
        onRowSelectedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "row-selected" signal. See [onRowSelected].
     *
     * @param row the selected row
     */
    public fun emitRowSelected(row: ListBoxRow?) {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "row-selected", row?.gtkListBoxRowPointer)
    }

    /**
     * Emitted to select all children of the box, if the selection
     * mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>a</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkListBoxPointer,
            "select-all",
            onSelectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "select-all" signal. See [onSelectAll].
     */
    public fun emitSelectAll() {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "select-all")
    }

    /**
     * Emitted when the set of selected rows changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectedRowsChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkListBoxPointer,
            "selected-rows-changed",
            onSelectedRowsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "selected-rows-changed" signal. See [onSelectedRowsChanged].
     */
    public fun emitSelectedRowsChanged() {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "selected-rows-changed")
    }

    /**
     *
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggleCursorRow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkListBoxPointer,
            "toggle-cursor-row",
            onToggleCursorRowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggle-cursor-row" signal. See [onToggleCursorRow].
     */
    public fun emitToggleCursorRow() {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "toggle-cursor-row")
    }

    /**
     * Emitted to unselect all children of the box, if the selection
     * mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is
     * <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUnselectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkListBoxPointer,
            "unselect-all",
            onUnselectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "unselect-all" signal. See [onUnselectAll].
     */
    public fun emitUnselectAll() {
        g_signal_emit_by_name(gtkListBoxPointer.reinterpret(), "unselect-all")
    }

    public companion object : TypeCompanion<ListBox> {
        override val type: GeneratedClassKGType<ListBox> =
            GeneratedClassKGType(getTypeOrNull()!!) { ListBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListBox
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_box_get_type()

        /**
         * Gets the GType of from the symbol `gtk_list_box_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_list_box_get_type")
    }
}

private val onActivateCursorRowFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onMoveCursorFunc: CPointer<
    CFunction<
        (
            GtkMovementStep,
            gint,
            gboolean,
            gboolean,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        `object`: GtkMovementStep,
        p0: gint,
        p1: gboolean,
        p2: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            `object`: MovementStep,
            p0: gint,
            p1: Boolean,
            p2: Boolean,
        ) -> Unit
        >().get().invoke(
        `object`.run {
            MovementStep.fromNativeValue(this)
        },
        p0,
        p1.asBoolean(),
        p2.asBoolean()
    )
}
    .reinterpret()

private val onRowActivatedFunc: CPointer<CFunction<(CPointer<GtkListBoxRow>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            row: CPointer<GtkListBoxRow>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(row: ListBoxRow) -> Unit>().get().invoke(
            row!!.run {
                InstanceCache.get(this, false) { ListBoxRow(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

private val onRowSelectedFunc: CPointer<CFunction<(CPointer<GtkListBoxRow>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            row: CPointer<GtkListBoxRow>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(row: ListBoxRow?) -> Unit>().get().invoke(
            row?.run {
                InstanceCache.get(this, false) { ListBoxRow(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

private val onSelectAllFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSelectedRowsChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onToggleCursorRowFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onUnselectAllFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
