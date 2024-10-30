// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
import kotlin.Int
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
public open class ListBox(
    pointer: CPointer<GtkListBox>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkListBoxPointer: CPointer<GtkListBox>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

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
        get() = gtk_list_box_get_activate_on_single_click(gtkListBoxPointer.reinterpret()).asBoolean()

        /**
         * If @single is true, rows will be activated when you click on them,
         * otherwise you need to double-click.
         *
         * @param single a boolean
         */
        set(single) = gtk_list_box_set_activate_on_single_click(gtkListBoxPointer.reinterpret(), single.asGBoolean())

    /**
     * The selection mode used by the list box.
     */
    public open var selectionMode: SelectionMode
        /**
         * Gets the selection mode of the listbox.
         *
         * @return a `GtkSelectionMode`
         */
        get() =
            gtk_list_box_get_selection_mode(gtkListBoxPointer.reinterpret()).run {
                SelectionMode.fromNativeValue(this)
            }

        /**
         * Sets how selection works in the listbox.
         *
         * @param mode The `GtkSelectionMode`
         */
        set(mode) = gtk_list_box_set_selection_mode(gtkListBoxPointer.reinterpret(), mode.nativeValue)

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
        get() = gtk_list_box_get_show_separators(gtkListBoxPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the list box should show separators
         * between rows.
         *
         * @param showSeparators true to show separators
         */
        set(
            showSeparators
        ) = gtk_list_box_set_show_separators(gtkListBoxPointer.reinterpret(), showSeparators.asGBoolean())

    /**
     * Creates a new `GtkListBox` container.
     *
     * @return a new `GtkListBox`
     */
    public constructor() : this(gtk_list_box_new()!!.reinterpret())

    /**
     * Append a widget to the list.
     *
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     *
     * @param child the `GtkWidget` to add
     */
    public open fun append(child: Widget): Unit =
        gtk_list_box_append(gtkListBoxPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

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
    public open fun bindModel(
        model: ListModel? = null,
        createWidgetFunc: ListBoxCreateWidgetFunc,
    ): Unit =
        gtk_list_box_bind_model(
            gtkListBoxPointer.reinterpret(),
            model?.gioListModelPointer,
            ListBoxCreateWidgetFuncFunc.reinterpret(),
            StableRef.create(createWidgetFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
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
        gtk_list_box_drag_highlight_row(gtkListBoxPointer.reinterpret(), row.gtkListBoxRowPointer.reinterpret())

    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * it will have the highlight removed.
     */
    public open fun dragUnhighlightRow(): Unit = gtk_list_box_drag_unhighlight_row(gtkListBoxPointer.reinterpret())

    /**
     * Returns whether rows activate on single clicks.
     *
     * @return true if rows are activated on single click, false otherwise
     */
    public open fun getActivateOnSingleClick(): Boolean =
        gtk_list_box_get_activate_on_single_click(gtkListBoxPointer.reinterpret()).asBoolean()

    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     *
     * @return the adjustment
     */
    public open fun getAdjustment(): Adjustment? =
        gtk_list_box_get_adjustment(gtkListBoxPointer.reinterpret())?.run {
            Adjustment(reinterpret())
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
    public open fun getRowAtIndex(index: Int): ListBoxRow? =
        gtk_list_box_get_row_at_index(gtkListBoxPointer.reinterpret(), index)?.run {
            ListBoxRow(reinterpret())
        }

    /**
     * Gets the row at the @y position.
     *
     * @param y position
     * @return the row
     */
    public open fun getRowAtY(y: Int): ListBoxRow? =
        gtk_list_box_get_row_at_y(gtkListBoxPointer.reinterpret(), y)?.run {
            ListBoxRow(reinterpret())
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
    public open fun getSelectedRow(): ListBoxRow? =
        gtk_list_box_get_selected_row(gtkListBoxPointer.reinterpret())?.run {
            ListBoxRow(reinterpret())
        }

    /**
     * Creates a list of all selected children.
     *
     * @return
     *   A `GList` containing the `GtkWidget` for each selected child.
     *   Free with g_list_free() when done.
     */
    public open fun getSelectedRows(): List =
        gtk_list_box_get_selected_rows(gtkListBoxPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Gets the selection mode of the listbox.
     *
     * @return a `GtkSelectionMode`
     */
    public open fun getSelectionMode(): SelectionMode =
        gtk_list_box_get_selection_mode(gtkListBoxPointer.reinterpret()).run {
            SelectionMode.fromNativeValue(this)
        }

    /**
     * Returns whether the list box should show separators
     * between rows.
     *
     * @return true if the list box shows separators
     */
    public open fun getShowSeparators(): Boolean =
        gtk_list_box_get_show_separators(gtkListBoxPointer.reinterpret()).asBoolean()

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
    public open fun insert(
        child: Widget,
        position: Int,
    ): Unit = gtk_list_box_insert(gtkListBoxPointer.reinterpret(), child.gtkWidgetPointer.reinterpret(), position)

    /**
     * Update the filtering for all rows.
     *
     * Call this when result
     * of the filter function on the @box is changed due
     * to an external factor. For instance, this would be used
     * if the filter function just looked for a specific search
     * string and the entry with the search string has changed.
     */
    public open fun invalidateFilter(): Unit = gtk_list_box_invalidate_filter(gtkListBoxPointer.reinterpret())

    /**
     * Update the separators for all rows.
     *
     * Call this when result
     * of the header function on the @box is changed due
     * to an external factor.
     */
    public open fun invalidateHeaders(): Unit = gtk_list_box_invalidate_headers(gtkListBoxPointer.reinterpret())

    /**
     * Update the sorting for all rows.
     *
     * Call this when result
     * of the sort function on the @box is changed due
     * to an external factor.
     */
    public open fun invalidateSort(): Unit = gtk_list_box_invalidate_sort(gtkListBoxPointer.reinterpret())

    /**
     * Prepend a widget to the list.
     *
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     *
     * @param child the `GtkWidget` to add
     */
    public open fun prepend(child: Widget): Unit =
        gtk_list_box_prepend(gtkListBoxPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Removes a child from @box.
     *
     * @param child the child to remove
     */
    public open fun remove(child: Widget): Unit =
        gtk_list_box_remove(gtkListBoxPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Removes all rows from @box.
     *
     * This function does nothing if @box is backed by a model.
     *
     * @since 4.12
     */
    public open fun removeAll(): Unit = gtk_list_box_remove_all(gtkListBoxPointer.reinterpret())

    /**
     * Select all children of @box, if the selection mode allows it.
     */
    public open fun selectAll(): Unit = gtk_list_box_select_all(gtkListBoxPointer.reinterpret())

    /**
     * Make @row the currently selected row.
     *
     * @param row The row to select
     */
    public open fun selectRow(row: ListBoxRow? = null): Unit =
        gtk_list_box_select_row(gtkListBoxPointer.reinterpret(), row?.gtkListBoxRowPointer?.reinterpret())

    /**
     * Calls a function for each selected child.
     *
     * Note that the selection cannot be modified from within this function.
     *
     * @param func the function to call for each selected child
     */
    public open fun selectedForeach(func: ListBoxForeachFunc): Unit =
        gtk_list_box_selected_foreach(
            gtkListBoxPointer.reinterpret(),
            ListBoxForeachFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * If @single is true, rows will be activated when you click on them,
     * otherwise you need to double-click.
     *
     * @param single a boolean
     */
    public open fun setActivateOnSingleClick(single: Boolean): Unit =
        gtk_list_box_set_activate_on_single_click(gtkListBoxPointer.reinterpret(), single.asGBoolean())

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
        gtk_list_box_set_adjustment(gtkListBoxPointer.reinterpret(), adjustment?.gtkAdjustmentPointer?.reinterpret())

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
    public open fun setFilterFunc(filterFunc: ListBoxFilterFunc): Unit =
        gtk_list_box_set_filter_func(
            gtkListBoxPointer.reinterpret(),
            ListBoxFilterFuncFunc.reinterpret(),
            StableRef.create(filterFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
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
    public open fun setHeaderFunc(updateHeader: ListBoxUpdateHeaderFunc): Unit =
        gtk_list_box_set_header_func(
            gtkListBoxPointer.reinterpret(),
            ListBoxUpdateHeaderFuncFunc.reinterpret(),
            StableRef.create(updateHeader).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets the placeholder widget that is shown in the list when
     * it doesn't display any visible children.
     *
     * @param placeholder a `GtkWidget`
     */
    public open fun setPlaceholder(placeholder: Widget? = null): Unit =
        gtk_list_box_set_placeholder(gtkListBoxPointer.reinterpret(), placeholder?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets how selection works in the listbox.
     *
     * @param mode The `GtkSelectionMode`
     */
    public open fun setSelectionMode(mode: SelectionMode): Unit =
        gtk_list_box_set_selection_mode(gtkListBoxPointer.reinterpret(), mode.nativeValue)

    /**
     * Sets whether the list box should show separators
     * between rows.
     *
     * @param showSeparators true to show separators
     */
    public open fun setShowSeparators(showSeparators: Boolean): Unit =
        gtk_list_box_set_show_separators(gtkListBoxPointer.reinterpret(), showSeparators.asGBoolean())

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
    public open fun setSortFunc(sortFunc: ListBoxSortFunc): Unit =
        gtk_list_box_set_sort_func(
            gtkListBoxPointer.reinterpret(),
            ListBoxSortFuncFunc.reinterpret(),
            StableRef.create(sortFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Unselect all children of @box, if the selection mode allows it.
     */
    public open fun unselectAll(): Unit = gtk_list_box_unselect_all(gtkListBoxPointer.reinterpret())

    /**
     * Unselects a single row of @box, if the selection mode allows it.
     *
     * @param row the row to unselect
     */
    public open fun unselectRow(row: ListBoxRow): Unit =
        gtk_list_box_unselect_row(gtkListBoxPointer.reinterpret(), row.gtkListBoxRowPointer.reinterpret())

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivateCursorRow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-cursor-row",
            connectActivateCursorRowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` ; `p0` ; `p1` ; `p2`
     */
    public fun connectMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            `object`: MovementStep,
            p0: Int,
            p1: Boolean,
            p2: Boolean,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "move-cursor",
            connectMoveCursorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a row has been activated by the user.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `row` the activated row
     */
    public fun connectRowActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (row: ListBoxRow) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "row-activated",
            connectRowActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a new row is selected, or (with a null @row)
     * when the selection is cleared.
     *
     * When the @box is using %GTK_SELECTION_MULTIPLE, this signal will not
     * give you the full picture of selection changes, and you should use
     * the [signal@Gtk.ListBox::selected-rows-changed] signal instead.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `row` the selected row
     */
    public fun connectRowSelected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (row: ListBoxRow?) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "row-selected",
            connectRowSelectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to select all children of the box, if the selection
     * mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>a</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSelectAll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "select-all",
            connectSelectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the set of selected rows changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSelectedRowsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "selected-rows-changed",
            connectSelectedRowsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectToggleCursorRow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "toggle-cursor-row",
            connectToggleCursorRowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to unselect all children of the box, if the selection
     * mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is
     * <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectUnselectAll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "unselect-all",
            connectUnselectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ListBox> {
        override val type: GeneratedClassKGType<ListBox> =
            GeneratedClassKGType(gtk_list_box_get_type()) { ListBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateCursorRowFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectMoveCursorFunc: CPointer<
    CFunction<
        (
            GtkMovementStep,
            Int,
            Int,
            Int,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            `object`: GtkMovementStep,
            p0: Int,
            p1: Int,
            p2: Int,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    `object`: MovementStep,
                    p0: Int,
                    p1: Boolean,
                    p2: Boolean,
                ) -> Unit
            >()
            .get()
            .invoke(
                `object`.run {
                    MovementStep.fromNativeValue(this)
                },
                p0,
                p1.asBoolean(),
                p2.asBoolean()
            )
    }.reinterpret()

private val connectRowActivatedFunc: CPointer<CFunction<(CPointer<GtkListBoxRow>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            row: CPointer<GtkListBoxRow>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(row: ListBoxRow) -> Unit>().get().invoke(
            row!!.run {
                ListBoxRow(reinterpret())
            }
        )
    }.reinterpret()

private val connectRowSelectedFunc: CPointer<CFunction<(CPointer<GtkListBoxRow>?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            row: CPointer<GtkListBoxRow>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(row: ListBoxRow?) -> Unit>().get().invoke(
            row?.run {
                ListBoxRow(reinterpret())
            }
        )
    }.reinterpret()

private val connectSelectAllFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectSelectedRowsChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectToggleCursorRowFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectUnselectAllFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
