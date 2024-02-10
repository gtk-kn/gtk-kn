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
import org.gtkkn.native.gtk.GtkColumnView
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_column_view_append_column
import org.gtkkn.native.gtk.gtk_column_view_get_columns
import org.gtkkn.native.gtk.gtk_column_view_get_enable_rubberband
import org.gtkkn.native.gtk.gtk_column_view_get_model
import org.gtkkn.native.gtk.gtk_column_view_get_reorderable
import org.gtkkn.native.gtk.gtk_column_view_get_show_column_separators
import org.gtkkn.native.gtk.gtk_column_view_get_show_row_separators
import org.gtkkn.native.gtk.gtk_column_view_get_single_click_activate
import org.gtkkn.native.gtk.gtk_column_view_get_sorter
import org.gtkkn.native.gtk.gtk_column_view_get_type
import org.gtkkn.native.gtk.gtk_column_view_insert_column
import org.gtkkn.native.gtk.gtk_column_view_new
import org.gtkkn.native.gtk.gtk_column_view_remove_column
import org.gtkkn.native.gtk.gtk_column_view_set_enable_rubberband
import org.gtkkn.native.gtk.gtk_column_view_set_model
import org.gtkkn.native.gtk.gtk_column_view_set_reorderable
import org.gtkkn.native.gtk.gtk_column_view_set_show_column_separators
import org.gtkkn.native.gtk.gtk_column_view_set_show_row_separators
import org.gtkkn.native.gtk.gtk_column_view_set_single_click_activate
import org.gtkkn.native.gtk.gtk_column_view_sort_by_column
import kotlin.Boolean
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkColumnView` presents a large dynamic list of items using multiple columns
 * with headers.
 *
 * `GtkColumnView` uses the factories of its columns to generate a cell widget for
 * each column, for each visible item and displays them together as the row for
 * this item.
 *
 * The [property@Gtk.ColumnView:show-row-separators] and
 * [property@Gtk.ColumnView:show-column-separators] properties offer a simple way
 * to display separators between the rows or columns.
 *
 * `GtkColumnView` allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on *rubberband selection*, using
 * [property@Gtk.ColumnView:enable-rubberband].
 *
 * The column view supports sorting that can be customized by the user by
 * clicking on column headers. To set this up, the `GtkSorter` returned by
 * [method@Gtk.ColumnView.get_sorter] must be attached to a sort model for the
 * data that the view is showing, and the columns must have sorters attached to
 * them by calling [method@Gtk.ColumnViewColumn.set_sorter]. The initial sort
 * order can be set with [method@Gtk.ColumnView.sort_by_column].
 *
 * The column view also supports interactive resizing and reordering of
 * columns, via Drag-and-Drop of the column headers. This can be enabled or
 * disabled with the [property@Gtk.ColumnView:reorderable] and
 * [property@Gtk.ColumnViewColumn:resizable] properties.
 *
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 *
 * # CSS nodes
 *
 * ```
 * columnview[.column-separators][.rich-list][.navigation-sidebar][.data-table]
 * ├── header
 * │   ├── <column header>
 * ┊   ┊
 * │   ╰── <column header>
 * │
 * ├── listview
 * │
 * ┊
 * ╰── [rubberband]
 * ```
 *
 * `GtkColumnView` uses a single CSS node named columnview. It may carry the
 * .column-separators style class, when [property@Gtk.ColumnView:show-column-separators]
 * property is set. Header widgets appear below a node with name header.
 * The rows are contained in a `GtkListView` widget, so there is a listview
 * node with the same structure as for a standalone `GtkListView` widget.
 * If [property@Gtk.ColumnView:show-row-separators] is set, it will be passed
 * on to the list view, causing its CSS node to carry the .separators style class.
 * For rubberband selection, a node with name rubberband is used.
 *
 * The main columnview node may also carry style classes to select
 * the style of [list presentation](section-list-widget.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 *
 * # Accessibility
 *
 * `GtkColumnView` uses the %GTK_ACCESSIBLE_ROLE_TREE_GRID role, header title
 * widgets are using the %GTK_ACCESSIBLE_ROLE_COLUMN_HEADER role. The row widgets
 * are using the %GTK_ACCESSIBLE_ROLE_ROW role, and individual cells are using
 * the %GTK_ACCESSIBLE_ROLE_GRID_CELL role
 */
public open class ColumnView(
    pointer: CPointer<GtkColumnView>,
) : Widget(pointer.reinterpret()), Scrollable, KGTyped {
    public val gtkColumnViewPointer: CPointer<GtkColumnView>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The list of columns.
     */
    public open val columns: ListModel
        /**
         * Gets the list of columns in this column view.
         *
         * This list is constant over the lifetime of @self and can be used to
         * monitor changes to the columns of @self by connecting to the
         * ::items-changed signal.
         *
         * @return The list managing the columns
         */
        get() =
            gtk_column_view_get_columns(gtkColumnViewPointer.reinterpret())!!.run {
                ListModel.wrap(reinterpret())
            }

    /**
     * Allow rubberband selection.
     */
    public open var enableRubberband: Boolean
        /**
         * Returns whether rows can be selected by dragging with the mouse.
         *
         * @return true if rubberband selection is enabled
         */
        get() =
            gtk_column_view_get_enable_rubberband(gtkColumnViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether selections can be changed by dragging with the mouse.
         *
         * @param enableRubberband true to enable rubberband selection
         */
        set(enableRubberband) =
            gtk_column_view_set_enable_rubberband(
                gtkColumnViewPointer.reinterpret(),
                enableRubberband.asGBoolean()
            )

    /**
     * Model for the items displayed.
     */
    public open var model: SelectionModel?
        /**
         * Gets the model that's currently used to read the items displayed.
         *
         * @return The model in use
         */
        get() =
            gtk_column_view_get_model(gtkColumnViewPointer.reinterpret())?.run {
                SelectionModel.wrap(reinterpret())
            }

        /**
         * Sets the model to use.
         *
         * This must be a [iface@Gtk.SelectionModel].
         *
         * @param model the model to use
         */
        set(model) =
            gtk_column_view_set_model(
                gtkColumnViewPointer.reinterpret(),
                model?.gtkSelectionModelPointer
            )

    /**
     * Whether columns are reorderable.
     */
    public open var reorderable: Boolean
        /**
         * Returns whether columns are reorderable.
         *
         * @return true if columns are reorderable
         */
        get() = gtk_column_view_get_reorderable(gtkColumnViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether columns should be reorderable by dragging.
         *
         * @param reorderable whether columns should be reorderable
         */
        set(reorderable) =
            gtk_column_view_set_reorderable(
                gtkColumnViewPointer.reinterpret(),
                reorderable.asGBoolean()
            )

    /**
     * Show separators between columns.
     */
    public open var showColumnSeparators: Boolean
        /**
         * Returns whether the list should show separators
         * between columns.
         *
         * @return true if the list shows column separators
         */
        get() =
            gtk_column_view_get_show_column_separators(gtkColumnViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the list should show separators
         * between columns.
         *
         * @param showColumnSeparators true to show column separators
         */
        set(showColumnSeparators) =
            gtk_column_view_set_show_column_separators(
                gtkColumnViewPointer.reinterpret(),
                showColumnSeparators.asGBoolean()
            )

    /**
     * Show separators between rows.
     */
    public open var showRowSeparators: Boolean
        /**
         * Returns whether the list should show separators
         * between rows.
         *
         * @return true if the list shows separators
         */
        get() =
            gtk_column_view_get_show_row_separators(gtkColumnViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the list should show separators
         * between rows.
         *
         * @param showRowSeparators true to show row separators
         */
        set(showRowSeparators) =
            gtk_column_view_set_show_row_separators(
                gtkColumnViewPointer.reinterpret(),
                showRowSeparators.asGBoolean()
            )

    /**
     * Activate rows on single click and select them on hover.
     */
    public open var singleClickActivate: Boolean
        /**
         * Returns whether rows will be activated on single click and
         * selected on hover.
         *
         * @return true if rows are activated on single click
         */
        get() =
            gtk_column_view_get_single_click_activate(gtkColumnViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether rows should be activated on single click and
         * selected on hover.
         *
         * @param singleClickActivate true to activate items on single click
         */
        set(singleClickActivate) =
            gtk_column_view_set_single_click_activate(
                gtkColumnViewPointer.reinterpret(),
                singleClickActivate.asGBoolean()
            )

    /**
     * Sorter with the sorting choices of the user.
     */
    public open val sorter: Sorter?
        /**
         * Returns a special sorter that reflects the users sorting
         * choices in the column view.
         *
         * To allow users to customizable sorting by clicking on column
         * headers, this sorter needs to be set on the sort model underneath
         * the model that is displayed by the view.
         *
         * See [method@Gtk.ColumnViewColumn.set_sorter] for setting up
         * per-column sorting.
         *
         * Here is an example:
         * ```c
         * gtk_column_view_column_set_sorter (column, sorter);
         * gtk_column_view_append_column (view, column);
         * sorter = g_object_ref (gtk_column_view_get_sorter (view)));
         * model = gtk_sort_list_model_new (store, sorter);
         * selection = gtk_no_selection_new (model);
         * gtk_column_view_set_model (view, selection);
         * ```
         *
         * @return the `GtkSorter` of @self
         */
        get() =
            gtk_column_view_get_sorter(gtkColumnViewPointer.reinterpret())?.run {
                Sorter(reinterpret())
            }

    /**
     * Creates a new `GtkColumnView`.
     *
     * You most likely want to call [method@Gtk.ColumnView.append_column]
     * to add columns next.
     *
     * @param model the list model to use
     * @return a new `GtkColumnView`
     */
    public constructor(model: SelectionModel? = null) :
        this(gtk_column_view_new(model?.gtkSelectionModelPointer)!!.reinterpret())

    /**
     * Appends the @column to the end of the columns in @self.
     *
     * @param column a `GtkColumnViewColumn` that hasn't been added to a
     *   `GtkColumnView` yet
     */
    public open fun appendColumn(column: ColumnViewColumn): Unit =
        gtk_column_view_append_column(
            gtkColumnViewPointer.reinterpret(),
            column.gtkColumnViewColumnPointer.reinterpret()
        )

    /**
     * Gets the list of columns in this column view.
     *
     * This list is constant over the lifetime of @self and can be used to
     * monitor changes to the columns of @self by connecting to the
     * ::items-changed signal.
     *
     * @return The list managing the columns
     */
    public open fun getColumns(): ListModel =
        gtk_column_view_get_columns(gtkColumnViewPointer.reinterpret())!!.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Returns whether rows can be selected by dragging with the mouse.
     *
     * @return true if rubberband selection is enabled
     */
    public open fun getEnableRubberband(): Boolean =
        gtk_column_view_get_enable_rubberband(gtkColumnViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the model that's currently used to read the items displayed.
     *
     * @return The model in use
     */
    public open fun getModel(): SelectionModel? =
        gtk_column_view_get_model(gtkColumnViewPointer.reinterpret())?.run {
            SelectionModel.wrap(reinterpret())
        }

    /**
     * Returns whether columns are reorderable.
     *
     * @return true if columns are reorderable
     */
    public open fun getReorderable(): Boolean =
        gtk_column_view_get_reorderable(gtkColumnViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the list should show separators
     * between columns.
     *
     * @return true if the list shows column separators
     */
    public open fun getShowColumnSeparators(): Boolean =
        gtk_column_view_get_show_column_separators(gtkColumnViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the list should show separators
     * between rows.
     *
     * @return true if the list shows separators
     */
    public open fun getShowRowSeparators(): Boolean =
        gtk_column_view_get_show_row_separators(gtkColumnViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     *
     * @return true if rows are activated on single click
     */
    public open fun getSingleClickActivate(): Boolean =
        gtk_column_view_get_single_click_activate(gtkColumnViewPointer.reinterpret()).asBoolean()

    /**
     * Returns a special sorter that reflects the users sorting
     * choices in the column view.
     *
     * To allow users to customizable sorting by clicking on column
     * headers, this sorter needs to be set on the sort model underneath
     * the model that is displayed by the view.
     *
     * See [method@Gtk.ColumnViewColumn.set_sorter] for setting up
     * per-column sorting.
     *
     * Here is an example:
     * ```c
     * gtk_column_view_column_set_sorter (column, sorter);
     * gtk_column_view_append_column (view, column);
     * sorter = g_object_ref (gtk_column_view_get_sorter (view)));
     * model = gtk_sort_list_model_new (store, sorter);
     * selection = gtk_no_selection_new (model);
     * gtk_column_view_set_model (view, selection);
     * ```
     *
     * @return the `GtkSorter` of @self
     */
    public open fun getSorter(): Sorter? =
        gtk_column_view_get_sorter(gtkColumnViewPointer.reinterpret())?.run {
            Sorter(reinterpret())
        }

    /**
     * Inserts a column at the given position in the columns of @self.
     *
     * If @column is already a column of @self, it will be repositioned.
     *
     * @param position the position to insert @column at
     * @param column the `GtkColumnViewColumn` to insert
     */
    public open fun insertColumn(
        position: UInt,
        column: ColumnViewColumn,
    ): Unit =
        gtk_column_view_insert_column(
            gtkColumnViewPointer.reinterpret(),
            position,
            column.gtkColumnViewColumnPointer.reinterpret()
        )

    /**
     * Removes the @column from the list of columns of @self.
     *
     * @param column a `GtkColumnViewColumn` that's part of @self
     */
    public open fun removeColumn(column: ColumnViewColumn): Unit =
        gtk_column_view_remove_column(
            gtkColumnViewPointer.reinterpret(),
            column.gtkColumnViewColumnPointer.reinterpret()
        )

    /**
     * Sets whether selections can be changed by dragging with the mouse.
     *
     * @param enableRubberband true to enable rubberband selection
     */
    public open fun setEnableRubberband(enableRubberband: Boolean): Unit =
        gtk_column_view_set_enable_rubberband(
            gtkColumnViewPointer.reinterpret(),
            enableRubberband.asGBoolean()
        )

    /**
     * Sets the model to use.
     *
     * This must be a [iface@Gtk.SelectionModel].
     *
     * @param model the model to use
     */
    public open fun setModel(model: SelectionModel? = null): Unit =
        gtk_column_view_set_model(
            gtkColumnViewPointer.reinterpret(),
            model?.gtkSelectionModelPointer
        )

    /**
     * Sets whether columns should be reorderable by dragging.
     *
     * @param reorderable whether columns should be reorderable
     */
    public open fun setReorderable(reorderable: Boolean): Unit =
        gtk_column_view_set_reorderable(
            gtkColumnViewPointer.reinterpret(),
            reorderable.asGBoolean()
        )

    /**
     * Sets whether the list should show separators
     * between columns.
     *
     * @param showColumnSeparators true to show column separators
     */
    public open fun setShowColumnSeparators(showColumnSeparators: Boolean): Unit =
        gtk_column_view_set_show_column_separators(
            gtkColumnViewPointer.reinterpret(),
            showColumnSeparators.asGBoolean()
        )

    /**
     * Sets whether the list should show separators
     * between rows.
     *
     * @param showRowSeparators true to show row separators
     */
    public open fun setShowRowSeparators(showRowSeparators: Boolean): Unit =
        gtk_column_view_set_show_row_separators(
            gtkColumnViewPointer.reinterpret(),
            showRowSeparators.asGBoolean()
        )

    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     *
     * @param singleClickActivate true to activate items on single click
     */
    public open fun setSingleClickActivate(singleClickActivate: Boolean): Unit =
        gtk_column_view_set_single_click_activate(
            gtkColumnViewPointer.reinterpret(),
            singleClickActivate.asGBoolean()
        )

    /**
     * Sets the sorting of the view.
     *
     * This function should be used to set up the initial sorting.
     * At runtime, users can change the sorting of a column view
     * by clicking on the list headers.
     *
     * This call only has an effect if the sorter returned by
     * [method@Gtk.ColumnView.get_sorter] is set on a sort model,
     * and [method@Gtk.ColumnViewColumn.set_sorter] has been called
     * on @column to associate a sorter with the column.
     *
     * If @column is null, the view will be unsorted.
     *
     * @param column the `GtkColumnViewColumn` to sort by
     * @param direction the direction to sort in
     */
    public open fun sortByColumn(
        column: ColumnViewColumn? = null,
        direction: SortType,
    ): Unit =
        gtk_column_view_sort_by_column(
            gtkColumnViewPointer.reinterpret(),
            column?.gtkColumnViewColumnPointer?.reinterpret(),
            direction.nativeValue
        )

    /**
     * Emitted when a row has been activated by the user, usually via activating
     * the GtkListBase|list.activate-item action.
     *
     * This allows for a convenient way to handle activation in a columnview.
     * See [method@Gtk.ListItem.set_activatable] for details on how to use this
     * signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` position of item to activate
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (position: UInt) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ColumnView> {
        override val type: GeneratedClassKGType<ColumnView> =
            GeneratedClassKGType(gtk_column_view_get_type()) { ColumnView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<(UInt) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            position: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(position: UInt) -> Unit>().get().invoke(position)
    }
        .reinterpret()
