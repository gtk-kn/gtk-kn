// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ContentFormats
import org.gtkkn.bindings.gdk.DragAction
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Rectangle
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
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.GtkTreePath
import org.gtkkn.native.gtk.GtkTreeView
import org.gtkkn.native.gtk.GtkTreeViewColumn
import org.gtkkn.native.gtk.gtk_tree_view_append_column
import org.gtkkn.native.gtk.gtk_tree_view_collapse_all
import org.gtkkn.native.gtk.gtk_tree_view_collapse_row
import org.gtkkn.native.gtk.gtk_tree_view_columns_autosize
import org.gtkkn.native.gtk.gtk_tree_view_create_row_drag_icon
import org.gtkkn.native.gtk.gtk_tree_view_enable_model_drag_dest
import org.gtkkn.native.gtk.gtk_tree_view_enable_model_drag_source
import org.gtkkn.native.gtk.gtk_tree_view_expand_all
import org.gtkkn.native.gtk.gtk_tree_view_expand_row
import org.gtkkn.native.gtk.gtk_tree_view_expand_to_path
import org.gtkkn.native.gtk.gtk_tree_view_get_activate_on_single_click
import org.gtkkn.native.gtk.gtk_tree_view_get_background_area
import org.gtkkn.native.gtk.gtk_tree_view_get_cell_area
import org.gtkkn.native.gtk.gtk_tree_view_get_column
import org.gtkkn.native.gtk.gtk_tree_view_get_columns
import org.gtkkn.native.gtk.gtk_tree_view_get_enable_search
import org.gtkkn.native.gtk.gtk_tree_view_get_enable_tree_lines
import org.gtkkn.native.gtk.gtk_tree_view_get_expander_column
import org.gtkkn.native.gtk.gtk_tree_view_get_fixed_height_mode
import org.gtkkn.native.gtk.gtk_tree_view_get_grid_lines
import org.gtkkn.native.gtk.gtk_tree_view_get_headers_clickable
import org.gtkkn.native.gtk.gtk_tree_view_get_headers_visible
import org.gtkkn.native.gtk.gtk_tree_view_get_hover_expand
import org.gtkkn.native.gtk.gtk_tree_view_get_hover_selection
import org.gtkkn.native.gtk.gtk_tree_view_get_level_indentation
import org.gtkkn.native.gtk.gtk_tree_view_get_model
import org.gtkkn.native.gtk.gtk_tree_view_get_n_columns
import org.gtkkn.native.gtk.gtk_tree_view_get_reorderable
import org.gtkkn.native.gtk.gtk_tree_view_get_rubber_banding
import org.gtkkn.native.gtk.gtk_tree_view_get_search_column
import org.gtkkn.native.gtk.gtk_tree_view_get_search_entry
import org.gtkkn.native.gtk.gtk_tree_view_get_selection
import org.gtkkn.native.gtk.gtk_tree_view_get_show_expanders
import org.gtkkn.native.gtk.gtk_tree_view_get_tooltip_column
import org.gtkkn.native.gtk.gtk_tree_view_get_type
import org.gtkkn.native.gtk.gtk_tree_view_get_visible_rect
import org.gtkkn.native.gtk.gtk_tree_view_insert_column
import org.gtkkn.native.gtk.gtk_tree_view_insert_column_with_data_func
import org.gtkkn.native.gtk.gtk_tree_view_is_rubber_banding_active
import org.gtkkn.native.gtk.gtk_tree_view_map_expanded_rows
import org.gtkkn.native.gtk.gtk_tree_view_move_column_after
import org.gtkkn.native.gtk.gtk_tree_view_new
import org.gtkkn.native.gtk.gtk_tree_view_new_with_model
import org.gtkkn.native.gtk.gtk_tree_view_remove_column
import org.gtkkn.native.gtk.gtk_tree_view_row_activated
import org.gtkkn.native.gtk.gtk_tree_view_row_expanded
import org.gtkkn.native.gtk.gtk_tree_view_scroll_to_cell
import org.gtkkn.native.gtk.gtk_tree_view_scroll_to_point
import org.gtkkn.native.gtk.gtk_tree_view_set_activate_on_single_click
import org.gtkkn.native.gtk.gtk_tree_view_set_column_drag_function
import org.gtkkn.native.gtk.gtk_tree_view_set_cursor
import org.gtkkn.native.gtk.gtk_tree_view_set_cursor_on_cell
import org.gtkkn.native.gtk.gtk_tree_view_set_drag_dest_row
import org.gtkkn.native.gtk.gtk_tree_view_set_enable_search
import org.gtkkn.native.gtk.gtk_tree_view_set_enable_tree_lines
import org.gtkkn.native.gtk.gtk_tree_view_set_expander_column
import org.gtkkn.native.gtk.gtk_tree_view_set_fixed_height_mode
import org.gtkkn.native.gtk.gtk_tree_view_set_grid_lines
import org.gtkkn.native.gtk.gtk_tree_view_set_headers_clickable
import org.gtkkn.native.gtk.gtk_tree_view_set_headers_visible
import org.gtkkn.native.gtk.gtk_tree_view_set_hover_expand
import org.gtkkn.native.gtk.gtk_tree_view_set_hover_selection
import org.gtkkn.native.gtk.gtk_tree_view_set_level_indentation
import org.gtkkn.native.gtk.gtk_tree_view_set_model
import org.gtkkn.native.gtk.gtk_tree_view_set_reorderable
import org.gtkkn.native.gtk.gtk_tree_view_set_row_separator_func
import org.gtkkn.native.gtk.gtk_tree_view_set_rubber_banding
import org.gtkkn.native.gtk.gtk_tree_view_set_search_column
import org.gtkkn.native.gtk.gtk_tree_view_set_search_entry
import org.gtkkn.native.gtk.gtk_tree_view_set_search_equal_func
import org.gtkkn.native.gtk.gtk_tree_view_set_show_expanders
import org.gtkkn.native.gtk.gtk_tree_view_set_tooltip_cell
import org.gtkkn.native.gtk.gtk_tree_view_set_tooltip_column
import org.gtkkn.native.gtk.gtk_tree_view_set_tooltip_row
import org.gtkkn.native.gtk.gtk_tree_view_unset_rows_drag_dest
import org.gtkkn.native.gtk.gtk_tree_view_unset_rows_drag_source
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A widget for displaying both trees and lists
 *
 * Widget that displays any object that implements the [iface@Gtk.TreeModel] interface.
 *
 * Please refer to the [tree widget conceptual overview](section-tree-widget.html)
 * for an overview of all the objects and data types related to the tree
 * widget and how they work together.
 *
 * ## Coordinate systems in GtkTreeView API
 *
 * Several different coordinate systems are exposed in the `GtkTreeView` API.
 * These are:
 *
 * ![](tree-view-coordinates.png)
 *
 * - Widget coordinates: Coordinates relative to the widget (usually `widget->window`).
 *
 * - Bin window coordinates: Coordinates relative to the window that GtkTreeView renders to.
 *
 * - Tree coordinates: Coordinates relative to the entire scrollable area of GtkTreeView. These
 *   coordinates start at (0, 0) for row 0 of the tree.
 *
 * Several functions are available for converting between the different
 * coordinate systems.  The most common translations are between widget and bin
 * window coordinates and between bin window and tree coordinates. For the
 * former you can use [method@Gtk.TreeView.convert_widget_to_bin_window_coords]
 * (and vice versa), for the latter [method@Gtk.TreeView.convert_bin_window_to_tree_coords]
 * (and vice versa).
 *
 * ## `GtkTreeView` as `GtkBuildable`
 *
 * The `GtkTreeView` implementation of the `GtkBuildable` interface accepts
 * [class@Gtk.TreeViewColumn] objects as `<child>` elements and exposes the
 * internal [class@Gtk.TreeSelection] in UI definitions.
 *
 * An example of a UI definition fragment with `GtkTreeView`:
 *
 * ```xml
 * <object class="GtkTreeView" id="treeview">
 *   <property name="model">liststore1</property>
 *   <child>
 *     <object class="GtkTreeViewColumn" id="test-column">
 *       <property name="title">Test</property>
 *       <child>
 *         <object class="GtkCellRendererText" id="test-renderer"/>
 *         <attributes>
 *           <attribute name="text">1</attribute>
 *         </attributes>
 *       </child>
 *     </object>
 *   </child>
 *   <child internal-child="selection">
 *     <object class="GtkTreeSelection" id="selection">
 *       <signal name="changed" handler="on_treeview_selection_changed"/>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * ## CSS nodes
 *
 * ```
 * treeview.view
 * ├── header
 * │   ├── button
 * │   │   ╰── [sort-indicator]
 * ┊   ┊
 * │   ╰── button
 * │       ╰── [sort-indicator]
 * │
 * ├── [rubberband]
 * ╰── [dndtarget]
 * ```
 *
 * `GtkTreeView` has a main CSS node with name `treeview` and style class `.view`.
 * It has a subnode with name `header`, which is the parent for all the column
 * header widgets' CSS nodes.
 *
 * Each column header consists of a `button`, which among other content, has a
 * child with name `sort-indicator`, which carries the `.ascending` or `.descending`
 * style classes when the column header should show a sort indicator. The CSS
 * is expected to provide a suitable image using the `-gtk-icon-source` property.
 *
 * For rubberband selection, a subnode with name `rubberband` is used.
 *
 * For the drop target location during DND, a subnode with name `dndtarget` is used.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `tx`: tx: Out parameter is not supported
 * - parameter `wx`: wx: Out parameter is not supported
 * - parameter `bx`: bx: Out parameter is not supported
 * - parameter `wx`: wx: Out parameter is not supported
 * - parameter `bx`: bx: Out parameter is not supported
 * - parameter `tx`: tx: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `model`: model: Out parameter is not supported
 * - parameter `start_path`: start_path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - method `enable-grid-lines`: Property has no getter nor setter
 */
public open class TreeView(
    pointer: CPointer<GtkTreeView>,
) : Widget(pointer.reinterpret()), Scrollable, KGTyped {
    public val gtkTreeViewPointer: CPointer<GtkTreeView>
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
     * The activate-on-single-click property specifies whether the "row-activated" signal
     * will be emitted after a single click.
     */
    public open var activateOnSingleClick: Boolean
        /**
         * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
         *
         * @return true if row-activated will be emitted on a single click
         */
        get() =
            gtk_tree_view_get_activate_on_single_click(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Cause the `GtkTreeView`::row-activated signal to be emitted
         * on a single click instead of a double click.
         *
         * @param single true to emit row-activated on a single click
         */
        set(single) =
            gtk_tree_view_set_activate_on_single_click(
                gtkTreeViewPointer.reinterpret(),
                single.asGBoolean()
            )

    public open var enableSearch: Boolean
        /**
         * Returns whether or not the tree allows to start interactive searching
         * by typing in text.
         *
         * @return whether or not to let the user search interactively
         */
        get() = gtk_tree_view_get_enable_search(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * If @enable_search is set, then the user can type in text to search through
         * the tree interactively (this is sometimes called "typeahead find").
         *
         * Note that even if this is false, the user can still initiate a search
         * using the “start-interactive-search” key binding.
         *
         * @param enableSearch true, if the user can search interactively
         */
        set(enableSearch) =
            gtk_tree_view_set_enable_search(
                gtkTreeViewPointer.reinterpret(),
                enableSearch.asGBoolean()
            )

    public open var enableTreeLines: Boolean
        /**
         * Returns whether or not tree lines are drawn in @tree_view.
         *
         * @return true if tree lines are drawn in @tree_view, false
         * otherwise.
         */
        get() = gtk_tree_view_get_enable_tree_lines(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to draw lines interconnecting the expanders in @tree_view.
         * This does not have any visible effects for lists.
         *
         * @param enabled true to enable tree line drawing, false otherwise.
         */
        set(enabled) =
            gtk_tree_view_set_enable_tree_lines(
                gtkTreeViewPointer.reinterpret(),
                enabled.asGBoolean()
            )

    public open var expanderColumn: TreeViewColumn?
        /**
         * Returns the column that is the current expander column,
         * or null if none has been set.
         * This column has the expander arrow drawn next to it.
         *
         * @return The expander column.
         */
        get() =
            gtk_tree_view_get_expander_column(gtkTreeViewPointer.reinterpret())?.run {
                TreeViewColumn(reinterpret())
            }

        /**
         * Sets the column to draw the expander arrow at. It must be in @tree_view.
         * If @column is null, then the expander arrow is always at the first
         * visible column.
         *
         * If you do not want expander arrow to appear in your tree, set the
         * expander column to a hidden column.
         *
         * @param column null, or the column to draw the expander arrow at.
         */
        set(column) =
            gtk_tree_view_set_expander_column(
                gtkTreeViewPointer.reinterpret(),
                column?.gtkTreeViewColumnPointer?.reinterpret()
            )

    /**
     * Setting the ::fixed-height-mode property to true speeds up
     * `GtkTreeView` by assuming that all rows have the same height.
     * Only enable this option if all rows are the same height.
     * Please see gtk_tree_view_set_fixed_height_mode() for more
     * information on this option.
     */
    public open var fixedHeightMode: Boolean
        /**
         * Returns whether fixed height mode is turned on for @tree_view.
         *
         * @return true if @tree_view is in fixed height mode
         */
        get() = gtk_tree_view_get_fixed_height_mode(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables the fixed height mode of @tree_view.
         * Fixed height mode speeds up `GtkTreeView` by assuming that all
         * rows have the same height.
         * Only enable this option if all rows are the same height and all
         * columns are of type %GTK_TREE_VIEW_COLUMN_FIXED.
         *
         * @param enable true to enable fixed height mode
         */
        set(enable) =
            gtk_tree_view_set_fixed_height_mode(
                gtkTreeViewPointer.reinterpret(),
                enable.asGBoolean()
            )

    public open var headersClickable: Boolean
        /**
         * Returns whether all header columns are clickable.
         *
         * @return true if all header columns are clickable, otherwise false
         */
        get() = gtk_tree_view_get_headers_clickable(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Allow the column title buttons to be clicked.
         *
         * @param setting true if the columns are clickable.
         */
        set(setting) =
            gtk_tree_view_set_headers_clickable(
                gtkTreeViewPointer.reinterpret(),
                setting.asGBoolean()
            )

    public open var headersVisible: Boolean
        /**
         * Returns true if the headers on the @tree_view are visible.
         *
         * @return Whether the headers are visible or not.
         */
        get() = gtk_tree_view_get_headers_visible(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Sets the visibility state of the headers.
         *
         * @param headersVisible true if the headers are visible
         */
        set(headersVisible) =
            gtk_tree_view_set_headers_visible(
                gtkTreeViewPointer.reinterpret(),
                headersVisible.asGBoolean()
            )

    /**
     * Enables or disables the hover expansion mode of @tree_view.
     * Hover expansion makes rows expand or collapse if the pointer moves
     * over them.
     *
     * This mode is primarily intended for treeviews in popups, e.g.
     * in `GtkComboBox` or `GtkEntryCompletion`.
     */
    public open var hoverExpand: Boolean
        /**
         * Returns whether hover expansion mode is turned on for @tree_view.
         *
         * @return true if @tree_view is in hover expansion mode
         */
        get() = gtk_tree_view_get_hover_expand(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables the hover expansion mode of @tree_view.
         * Hover expansion makes rows expand or collapse if the pointer
         * moves over them.
         *
         * @param expand true to enable hover selection mode
         */
        set(expand) =
            gtk_tree_view_set_hover_expand(
                gtkTreeViewPointer.reinterpret(),
                expand.asGBoolean()
            )

    /**
     * Enables or disables the hover selection mode of @tree_view.
     * Hover selection makes the selected row follow the pointer.
     * Currently, this works only for the selection modes
     * %GTK_SELECTION_SINGLE and %GTK_SELECTION_BROWSE.
     *
     * This mode is primarily intended for treeviews in popups, e.g.
     * in `GtkComboBox` or `GtkEntryCompletion`.
     */
    public open var hoverSelection: Boolean
        /**
         * Returns whether hover selection mode is turned on for @tree_view.
         *
         * @return true if @tree_view is in hover selection mode
         */
        get() = gtk_tree_view_get_hover_selection(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables the hover selection mode of @tree_view.
         * Hover selection makes the selected row follow the pointer.
         * Currently, this works only for the selection modes
         * %GTK_SELECTION_SINGLE and %GTK_SELECTION_BROWSE.
         *
         * @param hover true to enable hover selection mode
         */
        set(hover) =
            gtk_tree_view_set_hover_selection(
                gtkTreeViewPointer.reinterpret(),
                hover.asGBoolean()
            )

    /**
     * Extra indentation for each level.
     */
    public open var levelIndentation: Int
        /**
         * Returns the amount, in pixels, of extra indentation for child levels
         * in @tree_view.
         *
         * @return the amount of extra indentation for child levels in
         * @tree_view.  A return value of 0 means that this feature is disabled.
         */
        get() = gtk_tree_view_get_level_indentation(gtkTreeViewPointer.reinterpret())

        /**
         * Sets the amount of extra indentation for child levels to use in @tree_view
         * in addition to the default indentation.  The value should be specified in
         * pixels, a value of 0 disables this feature and in this case only the default
         * indentation will be used.
         * This does not have any visible effects for lists.
         *
         * @param indentation the amount, in pixels, of extra indentation in @tree_view.
         */
        set(indentation) =
            gtk_tree_view_set_level_indentation(
                gtkTreeViewPointer.reinterpret(),
                indentation
            )

    public open var model: TreeModel?
        /**
         * Returns the model the `GtkTreeView` is based on.  Returns null if the
         * model is unset.
         *
         * @return A `GtkTreeModel`
         */
        get() =
            gtk_tree_view_get_model(gtkTreeViewPointer.reinterpret())?.run {
                TreeModel.wrap(reinterpret())
            }

        /**
         * Sets the model for a `GtkTreeView`.  If the @tree_view already has a model
         * set, it will remove it before setting the new model.  If @model is null,
         * then it will unset the old model.
         *
         * @param model The model.
         */
        set(model) =
            gtk_tree_view_set_model(
                gtkTreeViewPointer.reinterpret(),
                model?.gtkTreeModelPointer
            )

    public open var reorderable: Boolean
        /**
         * Retrieves whether the user can reorder the tree via drag-and-drop. See
         * gtk_tree_view_set_reorderable().
         *
         * @return true if the tree can be reordered.
         */
        get() = gtk_tree_view_get_reorderable(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * This function is a convenience function to allow you to reorder
         * models that support the `GtkTreeDragSourceIface` and the
         * `GtkTreeDragDestIface`.  Both `GtkTreeStore` and `GtkListStore` support
         * these.  If @reorderable is true, then the user can reorder the
         * model by dragging and dropping rows. The developer can listen to
         * these changes by connecting to the model’s `GtkTreeModel::row-inserted`
         * and `GtkTreeModel::row-deleted` signals. The reordering is implemented
         * by setting up the tree view as a drag source and destination.
         * Therefore, drag and drop can not be used in a reorderable view for any
         * other purpose.
         *
         * This function does not give you any degree of control over the order -- any
         * reordering is allowed.  If more control is needed, you should probably
         * handle drag and drop manually.
         *
         * @param reorderable true, if the tree can be reordered.
         */
        set(reorderable) =
            gtk_tree_view_set_reorderable(
                gtkTreeViewPointer.reinterpret(),
                reorderable.asGBoolean()
            )

    public open var rubberBanding: Boolean
        /**
         * Returns whether rubber banding is turned on for @tree_view.  If the
         * selection mode is %GTK_SELECTION_MULTIPLE, rubber banding will allow the
         * user to select multiple rows by dragging the mouse.
         *
         * @return true if rubber banding in @tree_view is enabled.
         */
        get() = gtk_tree_view_get_rubber_banding(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Enables or disables rubber banding in @tree_view.  If the selection mode
         * is %GTK_SELECTION_MULTIPLE, rubber banding will allow the user to select
         * multiple rows by dragging the mouse.
         *
         * @param enable true to enable rubber banding
         */
        set(enable) =
            gtk_tree_view_set_rubber_banding(
                gtkTreeViewPointer.reinterpret(),
                enable.asGBoolean()
            )

    public open var searchColumn: Int
        /**
         * Gets the column searched on by the interactive search code.
         *
         * @return the column the interactive search code searches in.
         */
        get() = gtk_tree_view_get_search_column(gtkTreeViewPointer.reinterpret())

        /**
         * Sets @column as the column where the interactive search code should
         * search in for the current model.
         *
         * If the search column is set, users can use the “start-interactive-search”
         * key binding to bring up search popup. The enable-search property controls
         * whether simply typing text will also start an interactive search.
         *
         * Note that @column refers to a column of the current model. The search
         * column is reset to -1 when the model is changed.
         *
         * @param column the column of the model to search in, or -1 to disable searching
         */
        set(column) = gtk_tree_view_set_search_column(gtkTreeViewPointer.reinterpret(), column)

    /**
     * true if the view has expanders.
     */
    public open var showExpanders: Boolean
        /**
         * Returns whether or not expanders are drawn in @tree_view.
         *
         * @return true if expanders are drawn in @tree_view, false
         * otherwise.
         */
        get() = gtk_tree_view_get_show_expanders(gtkTreeViewPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to draw and enable expanders and indent child rows in
         * @tree_view.  When disabled there will be no expanders visible in trees
         * and there will be no way to expand and collapse rows by default.  Also
         * note that hiding the expanders will disable the default indentation.  You
         * can set a custom indentation in this case using
         * gtk_tree_view_set_level_indentation().
         * This does not have any visible effects for lists.
         *
         * @param enabled true to enable expander drawing, false otherwise.
         */
        set(enabled) =
            gtk_tree_view_set_show_expanders(
                gtkTreeViewPointer.reinterpret(),
                enabled.asGBoolean()
            )

    public open var tooltipColumn: Int
        /**
         * Returns the column of @tree_view’s model which is being used for
         * displaying tooltips on @tree_view’s rows.
         *
         * @return the index of the tooltip column that is currently being
         * used, or -1 if this is disabled.
         */
        get() = gtk_tree_view_get_tooltip_column(gtkTreeViewPointer.reinterpret())

        /**
         * If you only plan to have simple (text-only) tooltips on full rows, you
         * can use this function to have `GtkTreeView` handle these automatically
         * for you. @column should be set to the column in @tree_view’s model
         * containing the tooltip texts, or -1 to disable this feature.
         *
         * When enabled, `GtkWidget:has-tooltip` will be set to true and
         * @tree_view will connect a `GtkWidget::query-tooltip` signal handler.
         *
         * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
         * so &, <, etc have to be escaped in the text.
         *
         * @param column an integer, which is a valid column number for @tree_view’s model
         */
        set(column) = gtk_tree_view_set_tooltip_column(gtkTreeViewPointer.reinterpret(), column)

    /**
     * Creates a new `GtkTreeView` widget.
     *
     * @return A newly created `GtkTreeView` widget.
     */
    public constructor() : this(gtk_tree_view_new()!!.reinterpret())

    /**
     * Creates a new `GtkTreeView` widget with the model initialized to @model.
     *
     * @param model the model.
     * @return A newly created `GtkTreeView` widget.
     */
    public constructor(model: TreeModel) :
        this(gtk_tree_view_new_with_model(model.gtkTreeModelPointer)!!.reinterpret())

    /**
     * Appends @column to the list of columns. If @tree_view has “fixed_height”
     * mode enabled, then @column must have its “sizing” property set to be
     * GTK_TREE_VIEW_COLUMN_FIXED.
     *
     * @param column The `GtkTreeViewColumn` to add.
     * @return The number of columns in @tree_view after appending.
     */
    public open fun appendColumn(column: TreeViewColumn): Int =
        gtk_tree_view_append_column(
            gtkTreeViewPointer.reinterpret(),
            column.gtkTreeViewColumnPointer.reinterpret()
        )

    /**
     * Recursively collapses all visible, expanded nodes in @tree_view.
     */
    public open fun collapseAll(): Unit = gtk_tree_view_collapse_all(gtkTreeViewPointer.reinterpret())

    /**
     * Collapses a row (hides its child rows, if they exist).
     *
     * @param path path to a row in the @tree_view
     * @return true if the row was collapsed.
     */
    public open fun collapseRow(path: TreePath): Boolean =
        gtk_tree_view_collapse_row(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer
        ).asBoolean()

    /**
     * Resizes all columns to their optimal width. Only works after the
     * treeview has been realized.
     */
    public open fun columnsAutosize(): Unit = gtk_tree_view_columns_autosize(gtkTreeViewPointer.reinterpret())

    /**
     * Creates a `cairo_surface_t` representation of the row at @path.
     * This image is used for a drag icon.
     *
     * @param path a `GtkTreePath` in @tree_view
     * @return a newly-allocated surface of the drag icon.
     */
    public open fun createRowDragIcon(path: TreePath): Paintable? =
        gtk_tree_view_create_row_drag_icon(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer
        )?.run {
            Paintable.wrap(reinterpret())
        }

    /**
     * Turns @tree_view into a drop destination for automatic DND. Calling
     * this method sets `GtkTreeView`:reorderable to false.
     *
     * @param formats the target formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this
     *    widget
     */
    public open fun enableModelDragDest(
        formats: ContentFormats,
        actions: DragAction,
    ): Unit =
        gtk_tree_view_enable_model_drag_dest(
            gtkTreeViewPointer.reinterpret(),
            formats.gdkContentFormatsPointer,
            actions.mask
        )

    /**
     * Turns @tree_view into a drag source for automatic DND. Calling this
     * method sets `GtkTreeView`:reorderable to false.
     *
     * @param startButtonMask Mask of allowed buttons to start drag
     * @param formats the target formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this
     *    widget
     */
    public open fun enableModelDragSource(
        startButtonMask: ModifierType,
        formats: ContentFormats,
        actions: DragAction,
    ): Unit =
        gtk_tree_view_enable_model_drag_source(
            gtkTreeViewPointer.reinterpret(),
            startButtonMask.mask,
            formats.gdkContentFormatsPointer,
            actions.mask
        )

    /**
     * Recursively expands all nodes in the @tree_view.
     */
    public open fun expandAll(): Unit = gtk_tree_view_expand_all(gtkTreeViewPointer.reinterpret())

    /**
     * Opens the row so its children are visible.
     *
     * @param path path to a row
     * @param openAll whether to recursively expand, or just expand immediate children
     * @return true if the row existed and had children
     */
    public open fun expandRow(
        path: TreePath,
        openAll: Boolean,
    ): Boolean =
        gtk_tree_view_expand_row(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer,
            openAll.asGBoolean()
        ).asBoolean()

    /**
     * Expands the row at @path. This will also expand all parent rows of
     * @path as necessary.
     *
     * @param path path to a row.
     */
    public open fun expandToPath(path: TreePath): Unit =
        gtk_tree_view_expand_to_path(gtkTreeViewPointer.reinterpret(), path.gtkTreePathPointer)

    /**
     * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
     *
     * @return true if row-activated will be emitted on a single click
     */
    public open fun getActivateOnSingleClick(): Boolean =
        gtk_tree_view_get_activate_on_single_click(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by @path and the column specified by @column.  If @path is
     * null, or points to a node not found in the tree, the @y and @height fields of
     * the rectangle will be filled with 0. If @column is null, the @x and @width
     * fields will be filled with 0.  The returned rectangle is equivalent to the
     * @background_area passed to gtk_cell_renderer_render().  These background
     * areas tile to cover the entire bin window.  Contrast with the @cell_area,
     * returned by gtk_tree_view_get_cell_area(), which returns only the cell
     * itself, excluding surrounding borders and the tree expander area.
     *
     * @param path a `GtkTreePath` for the row, or null to get only horizontal coordinates
     * @param column a `GtkTreeViewColumn` for the column, or null to get only vertical coordinates
     * @param rect rectangle to fill with cell background rect
     */
    public open fun getBackgroundArea(
        path: TreePath? = null,
        column: TreeViewColumn? = null,
        rect: Rectangle,
    ): Unit =
        gtk_tree_view_get_background_area(
            gtkTreeViewPointer.reinterpret(),
            path?.gtkTreePathPointer,
            column?.gtkTreeViewColumnPointer?.reinterpret(),
            rect.gdkRectanglePointer
        )

    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by @path and the column specified by @column.  If @path is
     * null, or points to a path not currently displayed, the @y and @height fields
     * of the rectangle will be filled with 0. If @column is null, the @x and @width
     * fields will be filled with 0.  The sum of all cell rects does not cover the
     * entire tree; there are extra pixels in between rows, for example. The
     * returned rectangle is equivalent to the @cell_area passed to
     * gtk_cell_renderer_render().  This function is only valid if @tree_view is
     * realized.
     *
     * @param path a `GtkTreePath` for the row, or null to get only horizontal coordinates
     * @param column a `GtkTreeViewColumn` for the column, or null to get only vertical coordinates
     * @param rect rectangle to fill with cell rect
     */
    public open fun getCellArea(
        path: TreePath? = null,
        column: TreeViewColumn? = null,
        rect: Rectangle,
    ): Unit =
        gtk_tree_view_get_cell_area(
            gtkTreeViewPointer.reinterpret(),
            path?.gtkTreePathPointer,
            column?.gtkTreeViewColumnPointer?.reinterpret(),
            rect.gdkRectanglePointer
        )

    /**
     * Gets the `GtkTreeViewColumn` at the given position in the #tree_view.
     *
     * @param n The position of the column, counting from 0.
     * @return The `GtkTreeViewColumn`, or null if the
     * position is outside the range of columns.
     */
    public open fun getColumn(n: Int): TreeViewColumn? =
        gtk_tree_view_get_column(gtkTreeViewPointer.reinterpret(), n)?.run {
            TreeViewColumn(reinterpret())
        }

    /**
     * Returns a `GList` of all the `GtkTreeViewColumn`s currently in @tree_view.
     * The returned list must be freed with g_list_free ().
     *
     * @return A list of `GtkTreeViewColumn`s
     */
    public open fun getColumns(): List =
        gtk_tree_view_get_columns(gtkTreeViewPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Returns whether or not the tree allows to start interactive searching
     * by typing in text.
     *
     * @return whether or not to let the user search interactively
     */
    public open fun getEnableSearch(): Boolean =
        gtk_tree_view_get_enable_search(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether or not tree lines are drawn in @tree_view.
     *
     * @return true if tree lines are drawn in @tree_view, false
     * otherwise.
     */
    public open fun getEnableTreeLines(): Boolean =
        gtk_tree_view_get_enable_tree_lines(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns the column that is the current expander column,
     * or null if none has been set.
     * This column has the expander arrow drawn next to it.
     *
     * @return The expander column.
     */
    public open fun getExpanderColumn(): TreeViewColumn? =
        gtk_tree_view_get_expander_column(gtkTreeViewPointer.reinterpret())?.run {
            TreeViewColumn(reinterpret())
        }

    /**
     * Returns whether fixed height mode is turned on for @tree_view.
     *
     * @return true if @tree_view is in fixed height mode
     */
    public open fun getFixedHeightMode(): Boolean =
        gtk_tree_view_get_fixed_height_mode(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns which grid lines are enabled in @tree_view.
     *
     * @return a `GtkTreeView`GridLines value indicating which grid lines
     * are enabled.
     */
    public open fun getGridLines(): TreeViewGridLines =
        gtk_tree_view_get_grid_lines(gtkTreeViewPointer.reinterpret()).run {
            TreeViewGridLines.fromNativeValue(this)
        }

    /**
     * Returns whether all header columns are clickable.
     *
     * @return true if all header columns are clickable, otherwise false
     */
    public open fun getHeadersClickable(): Boolean =
        gtk_tree_view_get_headers_clickable(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns true if the headers on the @tree_view are visible.
     *
     * @return Whether the headers are visible or not.
     */
    public open fun getHeadersVisible(): Boolean =
        gtk_tree_view_get_headers_visible(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether hover expansion mode is turned on for @tree_view.
     *
     * @return true if @tree_view is in hover expansion mode
     */
    public open fun getHoverExpand(): Boolean =
        gtk_tree_view_get_hover_expand(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether hover selection mode is turned on for @tree_view.
     *
     * @return true if @tree_view is in hover selection mode
     */
    public open fun getHoverSelection(): Boolean =
        gtk_tree_view_get_hover_selection(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns the amount, in pixels, of extra indentation for child levels
     * in @tree_view.
     *
     * @return the amount of extra indentation for child levels in
     * @tree_view.  A return value of 0 means that this feature is disabled.
     */
    public open fun getLevelIndentation(): Int = gtk_tree_view_get_level_indentation(gtkTreeViewPointer.reinterpret())

    /**
     * Returns the model the `GtkTreeView` is based on.  Returns null if the
     * model is unset.
     *
     * @return A `GtkTreeModel`
     */
    public open fun getModel(): TreeModel? =
        gtk_tree_view_get_model(gtkTreeViewPointer.reinterpret())?.run {
            TreeModel.wrap(reinterpret())
        }

    /**
     * Queries the number of columns in the given @tree_view.
     *
     * @return The number of columns in the @tree_view
     */
    public open fun getNColumns(): UInt = gtk_tree_view_get_n_columns(gtkTreeViewPointer.reinterpret())

    /**
     * Retrieves whether the user can reorder the tree via drag-and-drop. See
     * gtk_tree_view_set_reorderable().
     *
     * @return true if the tree can be reordered.
     */
    public open fun getReorderable(): Boolean =
        gtk_tree_view_get_reorderable(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns whether rubber banding is turned on for @tree_view.  If the
     * selection mode is %GTK_SELECTION_MULTIPLE, rubber banding will allow the
     * user to select multiple rows by dragging the mouse.
     *
     * @return true if rubber banding in @tree_view is enabled.
     */
    public open fun getRubberBanding(): Boolean =
        gtk_tree_view_get_rubber_banding(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Gets the column searched on by the interactive search code.
     *
     * @return the column the interactive search code searches in.
     */
    public open fun getSearchColumn(): Int = gtk_tree_view_get_search_column(gtkTreeViewPointer.reinterpret())

    /**
     * Returns the `GtkEntry` which is currently in use as interactive search
     * entry for @tree_view.  In case the built-in entry is being used, null
     * will be returned.
     *
     * @return the entry currently in use as search entry.
     */
    public open fun getSearchEntry(): Editable? =
        gtk_tree_view_get_search_entry(gtkTreeViewPointer.reinterpret())?.run {
            Editable.wrap(reinterpret())
        }

    /**
     * Gets the `GtkTreeSelection` associated with @tree_view.
     *
     * @return A `GtkTreeSelection` object.
     */
    public open fun getSelection(): TreeSelection =
        gtk_tree_view_get_selection(gtkTreeViewPointer.reinterpret())!!.run {
            TreeSelection(reinterpret())
        }

    /**
     * Returns whether or not expanders are drawn in @tree_view.
     *
     * @return true if expanders are drawn in @tree_view, false
     * otherwise.
     */
    public open fun getShowExpanders(): Boolean =
        gtk_tree_view_get_show_expanders(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Returns the column of @tree_view’s model which is being used for
     * displaying tooltips on @tree_view’s rows.
     *
     * @return the index of the tooltip column that is currently being
     * used, or -1 if this is disabled.
     */
    public open fun getTooltipColumn(): Int = gtk_tree_view_get_tooltip_column(gtkTreeViewPointer.reinterpret())

    /**
     * Fills @visible_rect with the currently-visible region of the
     * buffer, in tree coordinates. Convert to bin_window coordinates with
     * gtk_tree_view_convert_tree_to_bin_window_coords().
     * Tree coordinates start at 0,0 for row 0 of the tree, and cover the entire
     * scrollable area of the tree.
     *
     * @param visibleRect rectangle to fill
     */
    public open fun getVisibleRect(visibleRect: Rectangle): Unit =
        gtk_tree_view_get_visible_rect(
            gtkTreeViewPointer.reinterpret(),
            visibleRect.gdkRectanglePointer
        )

    /**
     * This inserts the @column into the @tree_view at @position.  If @position is
     * -1, then the column is inserted at the end. If @tree_view has
     * “fixed_height” mode enabled, then @column must have its “sizing” property
     * set to be GTK_TREE_VIEW_COLUMN_FIXED.
     *
     * @param column The `GtkTreeViewColumn` to be inserted.
     * @param position The position to insert @column in.
     * @return The number of columns in @tree_view after insertion.
     */
    public open fun insertColumn(
        column: TreeViewColumn,
        position: Int,
    ): Int =
        gtk_tree_view_insert_column(
            gtkTreeViewPointer.reinterpret(),
            column.gtkTreeViewColumnPointer.reinterpret(),
            position
        )

    /**
     * Convenience function that inserts a new column into the `GtkTreeView`
     * with the given cell renderer and a `GtkTreeCellDataFunc` to set cell renderer
     * attributes (normally using data from the model). See also
     * gtk_tree_view_column_set_cell_data_func(), gtk_tree_view_column_pack_start().
     * If @tree_view has “fixed_height” mode enabled, then the new column will have its
     * “sizing” property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     *
     * @param position Position to insert, -1 for append
     * @param title column title
     * @param cell cell renderer for column
     * @param func function to set attributes of cell renderer
     * @return number of columns in the tree view post-insert
     */
    public open fun insertColumnWithDataFunc(
        position: Int,
        title: String,
        cell: CellRenderer,
        func: TreeCellDataFunc,
    ): Int =
        gtk_tree_view_insert_column_with_data_func(
            gtkTreeViewPointer.reinterpret(),
            position,
            title,
            cell.gtkCellRendererPointer.reinterpret(),
            TreeCellDataFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Returns whether a rubber banding operation is currently being done
     * in @tree_view.
     *
     * @return true if a rubber banding operation is currently being
     * done in @tree_view.
     */
    public open fun isRubberBandingActive(): Boolean =
        gtk_tree_view_is_rubber_banding_active(gtkTreeViewPointer.reinterpret()).asBoolean()

    /**
     * Calls @func on all expanded rows.
     *
     * @param func A function to be called
     */
    public open fun mapExpandedRows(func: TreeViewMappingFunc): Unit =
        gtk_tree_view_map_expanded_rows(
            gtkTreeViewPointer.reinterpret(),
            TreeViewMappingFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Moves @column to be after to @base_column.  If @base_column is null, then
     * @column is placed in the first position.
     *
     * @param column The `GtkTreeViewColumn` to be moved.
     * @param baseColumn The `GtkTreeViewColumn` to be moved relative to
     */
    public open fun moveColumnAfter(
        column: TreeViewColumn,
        baseColumn: TreeViewColumn? = null,
    ): Unit =
        gtk_tree_view_move_column_after(
            gtkTreeViewPointer.reinterpret(),
            column.gtkTreeViewColumnPointer.reinterpret(),
            baseColumn?.gtkTreeViewColumnPointer?.reinterpret()
        )

    /**
     * Removes @column from @tree_view.
     *
     * @param column The `GtkTreeViewColumn` to remove.
     * @return The number of columns in @tree_view after removing.
     */
    public open fun removeColumn(column: TreeViewColumn): Int =
        gtk_tree_view_remove_column(
            gtkTreeViewPointer.reinterpret(),
            column.gtkTreeViewColumnPointer.reinterpret()
        )

    /**
     * Activates the cell determined by @path and @column.
     *
     * @param path The `GtkTreePath` to be activated.
     * @param column The `GtkTreeViewColumn` to be activated.
     */
    public open fun rowActivated(
        path: TreePath,
        column: TreeViewColumn? = null,
    ): Unit =
        gtk_tree_view_row_activated(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer,
            column?.gtkTreeViewColumnPointer?.reinterpret()
        )

    /**
     * Returns true if the node pointed to by @path is expanded in @tree_view.
     *
     * @param path A `GtkTreePath` to test expansion state.
     * @return true if #path is expanded.
     */
    public open fun rowExpanded(path: TreePath): Boolean =
        gtk_tree_view_row_expanded(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer
        ).asBoolean()

    /**
     * Moves the alignments of @tree_view to the position specified by @column and
     * @path.  If @column is null, then no horizontal scrolling occurs.  Likewise,
     * if @path is null no vertical scrolling occurs.  At a minimum, one of @column
     * or @path need to be non-null.  @row_align determines where the row is
     * placed, and @col_align determines where @column is placed.  Both are expected
     * to be between 0.0 and 1.0. 0.0 means left/top alignment, 1.0 means
     * right/bottom alignment, 0.5 means center.
     *
     * If @use_align is false, then the alignment arguments are ignored, and the
     * tree does the minimum amount of work to scroll the cell onto the screen.
     * This means that the cell will be scrolled to the edge closest to its current
     * position.  If the cell is currently visible on the screen, nothing is done.
     *
     * This function only works if the model is set, and @path is a valid row on the
     * model.  If the model changes before the @tree_view is realized, the centered
     * path will be modified to reflect this change.
     *
     * @param path The path of the row to move to
     * @param column The `GtkTreeViewColumn` to move horizontally to
     * @param useAlign whether to use alignment arguments, or false.
     * @param rowAlign The vertical alignment of the row specified by @path.
     * @param colAlign The horizontal alignment of the column specified by @column.
     */
    public open fun scrollToCell(
        path: TreePath? = null,
        column: TreeViewColumn? = null,
        useAlign: Boolean,
        rowAlign: Float,
        colAlign: Float,
    ): Unit =
        gtk_tree_view_scroll_to_cell(
            gtkTreeViewPointer.reinterpret(),
            path?.gtkTreePathPointer,
            column?.gtkTreeViewColumnPointer?.reinterpret(),
            useAlign.asGBoolean(),
            rowAlign,
            colAlign
        )

    /**
     * Scrolls the tree view such that the top-left corner of the visible
     * area is @tree_x, @tree_y, where @tree_x and @tree_y are specified
     * in tree coordinates.  The @tree_view must be realized before
     * this function is called.  If it isn't, you probably want to be
     * using gtk_tree_view_scroll_to_cell().
     *
     * If either @tree_x or @tree_y are -1, then that direction isn’t scrolled.
     *
     * @param treeX X coordinate of new top-left pixel of visible area, or -1
     * @param treeY Y coordinate of new top-left pixel of visible area, or -1
     */
    public open fun scrollToPoint(
        treeX: Int,
        treeY: Int,
    ): Unit = gtk_tree_view_scroll_to_point(gtkTreeViewPointer.reinterpret(), treeX, treeY)

    /**
     * Cause the `GtkTreeView`::row-activated signal to be emitted
     * on a single click instead of a double click.
     *
     * @param single true to emit row-activated on a single click
     */
    public open fun setActivateOnSingleClick(single: Boolean): Unit =
        gtk_tree_view_set_activate_on_single_click(
            gtkTreeViewPointer.reinterpret(),
            single.asGBoolean()
        )

    /**
     * Sets a user function for determining where a column may be dropped when
     * dragged.  This function is called on every column pair in turn at the
     * beginning of a column drag to determine where a drop can take place.  The
     * arguments passed to @func are: the @tree_view, the `GtkTreeViewColumn` being
     * dragged, the two `GtkTreeViewColumn`s determining the drop spot, and
     * @user_data.  If either of the `GtkTreeViewColumn` arguments for the drop spot
     * are null, then they indicate an edge.  If @func is set to be null, then
     * @tree_view reverts to the default behavior of allowing all columns to be
     * dropped everywhere.
     *
     * @param func A function to determine which columns are reorderable
     */
    public open fun setColumnDragFunction(func: TreeViewColumnDropFunc): Unit =
        gtk_tree_view_set_column_drag_function(
            gtkTreeViewPointer.reinterpret(),
            TreeViewColumnDropFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets the current keyboard focus to be at @path, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular row.  If
     * @focus_column is not null, then focus is given to the column specified by
     * it. Additionally, if @focus_column is specified, and @start_editing is
     * true, then editing should be started in the specified cell.
     * This function is often followed by @gtk_widget_grab_focus (@tree_view)
     * in order to give keyboard focus to the widget.  Please note that editing
     * can only happen when the widget is realized.
     *
     * If @path is invalid for @model, the current cursor (if any) will be unset
     * and the function will return without failing.
     *
     * @param path A `GtkTreePath`
     * @param focusColumn A `GtkTreeViewColumn`
     * @param startEditing true if the specified cell should start being edited.
     */
    public open fun setCursor_(
        path: TreePath,
        focusColumn: TreeViewColumn? = null,
        startEditing: Boolean,
    ): Unit =
        gtk_tree_view_set_cursor(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer,
            focusColumn?.gtkTreeViewColumnPointer?.reinterpret(),
            startEditing.asGBoolean()
        )

    /**
     * Sets the current keyboard focus to be at @path, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular row.  If
     * @focus_column is not null, then focus is given to the column specified by
     * it. If @focus_column and @focus_cell are not null, and @focus_column
     * contains 2 or more editable or activatable cells, then focus is given to
     * the cell specified by @focus_cell. Additionally, if @focus_column is
     * specified, and @start_editing is true, then editing should be started in
     * the specified cell.  This function is often followed by
     * @gtk_widget_grab_focus (@tree_view) in order to give keyboard focus to the
     * widget.  Please note that editing can only happen when the widget is
     * realized.
     *
     * If @path is invalid for @model, the current cursor (if any) will be unset
     * and the function will return without failing.
     *
     * @param path A `GtkTreePath`
     * @param focusColumn A `GtkTreeViewColumn`
     * @param focusCell A `GtkCellRenderer`
     * @param startEditing true if the specified cell should start being edited.
     */
    public open fun setCursorOnCell(
        path: TreePath,
        focusColumn: TreeViewColumn? = null,
        focusCell: CellRenderer? = null,
        startEditing: Boolean,
    ): Unit =
        gtk_tree_view_set_cursor_on_cell(
            gtkTreeViewPointer.reinterpret(),
            path.gtkTreePathPointer,
            focusColumn?.gtkTreeViewColumnPointer?.reinterpret(),
            focusCell?.gtkCellRendererPointer?.reinterpret(),
            startEditing.asGBoolean()
        )

    /**
     * Sets the row that is highlighted for feedback.
     * If @path is null, an existing highlight is removed.
     *
     * @param path The path of the row to highlight
     * @param pos Specifies whether to drop before, after or into the row
     */
    public open fun setDragDestRow(
        path: TreePath? = null,
        pos: TreeViewDropPosition,
    ): Unit =
        gtk_tree_view_set_drag_dest_row(
            gtkTreeViewPointer.reinterpret(),
            path?.gtkTreePathPointer,
            pos.nativeValue
        )

    /**
     * If @enable_search is set, then the user can type in text to search through
     * the tree interactively (this is sometimes called "typeahead find").
     *
     * Note that even if this is false, the user can still initiate a search
     * using the “start-interactive-search” key binding.
     *
     * @param enableSearch true, if the user can search interactively
     */
    public open fun setEnableSearch(enableSearch: Boolean): Unit =
        gtk_tree_view_set_enable_search(
            gtkTreeViewPointer.reinterpret(),
            enableSearch.asGBoolean()
        )

    /**
     * Sets whether to draw lines interconnecting the expanders in @tree_view.
     * This does not have any visible effects for lists.
     *
     * @param enabled true to enable tree line drawing, false otherwise.
     */
    public open fun setEnableTreeLines(enabled: Boolean): Unit =
        gtk_tree_view_set_enable_tree_lines(
            gtkTreeViewPointer.reinterpret(),
            enabled.asGBoolean()
        )

    /**
     * Sets the column to draw the expander arrow at. It must be in @tree_view.
     * If @column is null, then the expander arrow is always at the first
     * visible column.
     *
     * If you do not want expander arrow to appear in your tree, set the
     * expander column to a hidden column.
     *
     * @param column null, or the column to draw the expander arrow at.
     */
    public open fun setExpanderColumn(column: TreeViewColumn? = null): Unit =
        gtk_tree_view_set_expander_column(
            gtkTreeViewPointer.reinterpret(),
            column?.gtkTreeViewColumnPointer?.reinterpret()
        )

    /**
     * Enables or disables the fixed height mode of @tree_view.
     * Fixed height mode speeds up `GtkTreeView` by assuming that all
     * rows have the same height.
     * Only enable this option if all rows are the same height and all
     * columns are of type %GTK_TREE_VIEW_COLUMN_FIXED.
     *
     * @param enable true to enable fixed height mode
     */
    public open fun setFixedHeightMode(enable: Boolean): Unit =
        gtk_tree_view_set_fixed_height_mode(
            gtkTreeViewPointer.reinterpret(),
            enable.asGBoolean()
        )

    /**
     * Sets which grid lines to draw in @tree_view.
     *
     * @param gridLines a `GtkTreeView`GridLines value indicating which grid lines to
     * enable.
     */
    public open fun setGridLines(gridLines: TreeViewGridLines): Unit =
        gtk_tree_view_set_grid_lines(gtkTreeViewPointer.reinterpret(), gridLines.nativeValue)

    /**
     * Allow the column title buttons to be clicked.
     *
     * @param setting true if the columns are clickable.
     */
    public open fun setHeadersClickable(setting: Boolean): Unit =
        gtk_tree_view_set_headers_clickable(
            gtkTreeViewPointer.reinterpret(),
            setting.asGBoolean()
        )

    /**
     * Sets the visibility state of the headers.
     *
     * @param headersVisible true if the headers are visible
     */
    public open fun setHeadersVisible(headersVisible: Boolean): Unit =
        gtk_tree_view_set_headers_visible(
            gtkTreeViewPointer.reinterpret(),
            headersVisible.asGBoolean()
        )

    /**
     * Enables or disables the hover expansion mode of @tree_view.
     * Hover expansion makes rows expand or collapse if the pointer
     * moves over them.
     *
     * @param expand true to enable hover selection mode
     */
    public open fun setHoverExpand(expand: Boolean): Unit =
        gtk_tree_view_set_hover_expand(gtkTreeViewPointer.reinterpret(), expand.asGBoolean())

    /**
     * Enables or disables the hover selection mode of @tree_view.
     * Hover selection makes the selected row follow the pointer.
     * Currently, this works only for the selection modes
     * %GTK_SELECTION_SINGLE and %GTK_SELECTION_BROWSE.
     *
     * @param hover true to enable hover selection mode
     */
    public open fun setHoverSelection(hover: Boolean): Unit =
        gtk_tree_view_set_hover_selection(gtkTreeViewPointer.reinterpret(), hover.asGBoolean())

    /**
     * Sets the amount of extra indentation for child levels to use in @tree_view
     * in addition to the default indentation.  The value should be specified in
     * pixels, a value of 0 disables this feature and in this case only the default
     * indentation will be used.
     * This does not have any visible effects for lists.
     *
     * @param indentation the amount, in pixels, of extra indentation in @tree_view.
     */
    public open fun setLevelIndentation(indentation: Int): Unit =
        gtk_tree_view_set_level_indentation(gtkTreeViewPointer.reinterpret(), indentation)

    /**
     * Sets the model for a `GtkTreeView`.  If the @tree_view already has a model
     * set, it will remove it before setting the new model.  If @model is null,
     * then it will unset the old model.
     *
     * @param model The model.
     */
    public open fun setModel(model: TreeModel? = null): Unit =
        gtk_tree_view_set_model(gtkTreeViewPointer.reinterpret(), model?.gtkTreeModelPointer)

    /**
     * This function is a convenience function to allow you to reorder
     * models that support the `GtkTreeDragSourceIface` and the
     * `GtkTreeDragDestIface`.  Both `GtkTreeStore` and `GtkListStore` support
     * these.  If @reorderable is true, then the user can reorder the
     * model by dragging and dropping rows. The developer can listen to
     * these changes by connecting to the model’s `GtkTreeModel::row-inserted`
     * and `GtkTreeModel::row-deleted` signals. The reordering is implemented
     * by setting up the tree view as a drag source and destination.
     * Therefore, drag and drop can not be used in a reorderable view for any
     * other purpose.
     *
     * This function does not give you any degree of control over the order -- any
     * reordering is allowed.  If more control is needed, you should probably
     * handle drag and drop manually.
     *
     * @param reorderable true, if the tree can be reordered.
     */
    public open fun setReorderable(reorderable: Boolean): Unit =
        gtk_tree_view_set_reorderable(
            gtkTreeViewPointer.reinterpret(),
            reorderable.asGBoolean()
        )

    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator. If the row separator
     * function is null, no separators are drawn. This is the default value.
     *
     * @param func a `GtkTreeView`RowSeparatorFunc
     */
    public open fun setRowSeparatorFunc(func: TreeViewRowSeparatorFunc): Unit =
        gtk_tree_view_set_row_separator_func(
            gtkTreeViewPointer.reinterpret(),
            TreeViewRowSeparatorFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Enables or disables rubber banding in @tree_view.  If the selection mode
     * is %GTK_SELECTION_MULTIPLE, rubber banding will allow the user to select
     * multiple rows by dragging the mouse.
     *
     * @param enable true to enable rubber banding
     */
    public open fun setRubberBanding(enable: Boolean): Unit =
        gtk_tree_view_set_rubber_banding(gtkTreeViewPointer.reinterpret(), enable.asGBoolean())

    /**
     * Sets @column as the column where the interactive search code should
     * search in for the current model.
     *
     * If the search column is set, users can use the “start-interactive-search”
     * key binding to bring up search popup. The enable-search property controls
     * whether simply typing text will also start an interactive search.
     *
     * Note that @column refers to a column of the current model. The search
     * column is reset to -1 when the model is changed.
     *
     * @param column the column of the model to search in, or -1 to disable searching
     */
    public open fun setSearchColumn(column: Int): Unit =
        gtk_tree_view_set_search_column(gtkTreeViewPointer.reinterpret(), column)

    /**
     * Sets the entry which the interactive search code will use for this
     * @tree_view.  This is useful when you want to provide a search entry
     * in our interface at all time at a fixed position.  Passing null for
     * @entry will make the interactive search code use the built-in popup
     * entry again.
     *
     * @param entry the entry the interactive search code of @tree_view should use
     */
    public open fun setSearchEntry(entry: Editable? = null): Unit =
        gtk_tree_view_set_search_entry(
            gtkTreeViewPointer.reinterpret(),
            entry?.gtkEditablePointer
        )

    /**
     * Sets the compare function for the interactive search capabilities; note
     * that somewhat like strcmp() returning 0 for equality
     * `GtkTreeView`SearchEqualFunc returns false on matches.
     *
     * @param searchEqualFunc the compare function to use during the search
     */
    public open fun setSearchEqualFunc(searchEqualFunc: TreeViewSearchEqualFunc): Unit =
        gtk_tree_view_set_search_equal_func(
            gtkTreeViewPointer.reinterpret(),
            TreeViewSearchEqualFuncFunc.reinterpret(),
            StableRef.create(searchEqualFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets whether to draw and enable expanders and indent child rows in
     * @tree_view.  When disabled there will be no expanders visible in trees
     * and there will be no way to expand and collapse rows by default.  Also
     * note that hiding the expanders will disable the default indentation.  You
     * can set a custom indentation in this case using
     * gtk_tree_view_set_level_indentation().
     * This does not have any visible effects for lists.
     *
     * @param enabled true to enable expander drawing, false otherwise.
     */
    public open fun setShowExpanders(enabled: Boolean): Unit =
        gtk_tree_view_set_show_expanders(gtkTreeViewPointer.reinterpret(), enabled.asGBoolean())

    /**
     * Sets the tip area of @tooltip to the area @path, @column and @cell have
     * in common.  For example if @path is null and @column is set, the tip
     * area will be set to the full area covered by @column.  See also
     * gtk_tooltip_set_tip_area().
     *
     * Note that if @path is not specified and @cell is set and part of a column
     * containing the expander, the tooltip might not show and hide at the correct
     * position.  In such cases @path must be set to the current node under the
     * mouse cursor for this function to operate correctly.
     *
     * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     *
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
     * @param column a `GtkTreeViewColumn`
     * @param cell a `GtkCellRenderer`
     */
    public open fun setTooltipCell(
        tooltip: Tooltip,
        path: TreePath? = null,
        column: TreeViewColumn? = null,
        cell: CellRenderer? = null,
    ): Unit =
        gtk_tree_view_set_tooltip_cell(
            gtkTreeViewPointer.reinterpret(),
            tooltip.gtkTooltipPointer.reinterpret(),
            path?.gtkTreePathPointer,
            column?.gtkTreeViewColumnPointer?.reinterpret(),
            cell?.gtkCellRendererPointer?.reinterpret()
        )

    /**
     * If you only plan to have simple (text-only) tooltips on full rows, you
     * can use this function to have `GtkTreeView` handle these automatically
     * for you. @column should be set to the column in @tree_view’s model
     * containing the tooltip texts, or -1 to disable this feature.
     *
     * When enabled, `GtkWidget:has-tooltip` will be set to true and
     * @tree_view will connect a `GtkWidget::query-tooltip` signal handler.
     *
     * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * so &, <, etc have to be escaped in the text.
     *
     * @param column an integer, which is a valid column number for @tree_view’s model
     */
    public open fun setTooltipColumn(column: Int): Unit =
        gtk_tree_view_set_tooltip_column(gtkTreeViewPointer.reinterpret(), column)

    /**
     * Sets the tip area of @tooltip to be the area covered by the row at @path.
     * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     *
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
     */
    public open fun setTooltipRow(
        tooltip: Tooltip,
        path: TreePath,
    ): Unit =
        gtk_tree_view_set_tooltip_row(
            gtkTreeViewPointer.reinterpret(),
            tooltip.gtkTooltipPointer.reinterpret(),
            path.gtkTreePathPointer
        )

    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_dest(). Calling this method sets
     * `GtkTreeView`:reorderable to false.
     */
    public open fun unsetRowsDragDest(): Unit = gtk_tree_view_unset_rows_drag_dest(gtkTreeViewPointer.reinterpret())

    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_source(). Calling this method sets
     * `GtkTreeView`:reorderable to false.
     */
    public open fun unsetRowsDragSource(): Unit = gtk_tree_view_unset_rows_drag_source(gtkTreeViewPointer.reinterpret())

    /**
     * The number of columns of the treeview has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectColumnsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "columns-changed",
            connectColumnsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The position of the cursor (focused cell) has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectCursorChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cursor-changed",
            connectCursorChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` ; `p0` ; `p1`
     */
    public fun connectExpandCollapseCursorRow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            `object`: Boolean,
            p0: Boolean,
            p1: Boolean,
        ) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "expand-collapse-cursor-row",
            connectExpandCollapseCursorRowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The `GtkTreeView`::move-cursor signal is a [keybinding
     * signal][class@Gtk.SignalAction] which gets emitted when the user
     * presses one of the cursor keys.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically. In contrast to gtk_tree_view_set_cursor() and
     * gtk_tree_view_set_cursor_on_cell() when moving horizontally
     * `GtkTreeView`::move-cursor does not reset the current selection.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the move, as a
     * `GtkMovementStep`.
     *     %GTK_MOVEMENT_LOGICAL_POSITIONS, %GTK_MOVEMENT_VISUAL_POSITIONS,
     *     %GTK_MOVEMENT_DISPLAY_LINES, %GTK_MOVEMENT_PAGES and
     *     %GTK_MOVEMENT_BUFFER_ENDS are supported.
     *     %GTK_MOVEMENT_LOGICAL_POSITIONS and %GTK_MOVEMENT_VISUAL_POSITIONS
     *     are treated identically.; `direction` the direction to move: +1 to move forwards; -1 to
     * move
     *     backwards. The resulting movement is undefined for all other values.; `extend` whether to
     * extend the selection; `modify` whether to modify the selection. Returns true if @step is
     * supported, false otherwise.
     */
    public fun connectMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            step: MovementStep,
            direction: Int,
            extend: Boolean,
            modify: Boolean,
        ) -> Boolean,
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
     * The "row-activated" signal is emitted when the method
     * [`method@Gtk.TreeView.row_activated`] is called.
     *
     * This signal is emitted when the user double-clicks a treeview row with the
     * [property@Gtk.TreeView:activate-on-single-click] property set to false,
     * or when the user single-clicks a row when that property set to true.
     *
     * This signal is also emitted when a non-editable row is selected and one
     * of the keys: <kbd>Space</kbd>, <kbd>Shift</kbd>+<kbd>Space</kbd>,
     * <kbd>Return</kbd> or <kbd>Enter</kbd> is pressed.
     *
     * For selection handling refer to the
     * [tree widget conceptual overview](section-tree-widget.html)
     * as well as `GtkTreeSelection`.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` the `GtkTreePath` for the activated
     * row; `column` the `GtkTreeViewColumn` in which the activation occurred
     */
    public fun connectRowActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: TreePath, column: TreeViewColumn?) -> Unit,
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
     * The given row has been collapsed (child nodes are hidden).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` the tree iter of the collapsed row;
     * `path` a tree path that points to the row
     */
    public fun connectRowCollapsed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TreeIter, path: TreePath) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "row-collapsed",
            connectRowCollapsedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The given row has been expanded (child nodes are shown).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` the tree iter of the expanded row;
     * `path` a tree path that points to the row
     */
    public fun connectRowExpanded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TreeIter, path: TreePath) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "row-expanded",
            connectRowExpandedFunc.reinterpret(),
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
    public fun connectSelectAll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
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
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSelectCursorParent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "select-cursor-parent",
            connectSelectCursorParentFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object`
     */
    public fun connectSelectCursorRow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: Boolean) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "select-cursor-row",
            connectSelectCursorRowFunc.reinterpret(),
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
    public fun connectStartInteractiveSearch(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "start-interactive-search",
            connectStartInteractiveSearchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The given row is about to be collapsed (hide its children nodes). Use this
     * signal if you need to control the collapsibility of individual rows.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` the tree iter of the row to collapse;
     * `path` a tree path that points to the row. Returns false to allow collapsing, true to reject
     */
    public fun connectTestCollapseRow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TreeIter, path: TreePath) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "test-collapse-row",
            connectTestCollapseRowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The given row is about to be expanded (show its children nodes). Use this
     * signal if you need to control the expandability of individual rows.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` the tree iter of the row to expand;
     * `path` a tree path that points to the row. Returns false to allow expansion, true to reject
     */
    public fun connectTestExpandRow(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TreeIter, path: TreePath) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "test-expand-row",
            connectTestExpandRowFunc.reinterpret(),
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
        handler: () -> Boolean,
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
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectUnselectAll(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "unselect-all",
            connectUnselectAllFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TreeView> {
        override val type: GeneratedClassKGType<TreeView> =
            GeneratedClassKGType(gtk_tree_view_get_type()) { TreeView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectColumnsChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectCursorChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectExpandCollapseCursorRowFunc: CPointer<
    CFunction<
        (
            Int,
            Int,
            Int,
        ) -> Int
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            `object`: Int,
            p0: Int,
            p1: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                `object`: Boolean,
                p0: Boolean,
                p1: Boolean,
            ) -> Boolean
            >().get().invoke(`object`.asBoolean(), p0.asBoolean(), p1.asBoolean()).asGBoolean()
    }
        .reinterpret()

private val connectMoveCursorFunc: CPointer<
    CFunction<
        (
            GtkMovementStep,
            Int,
            Int,
            Int,
        ) -> Int
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            step: GtkMovementStep,
            direction: Int,
            extend: Int,
            modify: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                step: MovementStep,
                direction: Int,
                extend: Boolean,
                modify: Boolean,
            ) -> Boolean
            >().get().invoke(
            step.run {
                MovementStep.fromNativeValue(this)
            },
            direction,
            extend.asBoolean(),
            modify.asBoolean()
        ).asGBoolean()
    }
        .reinterpret()

private val connectRowActivatedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreePath>,
            CPointer<GtkTreeViewColumn>?,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<GtkTreePath>?,
            column: CPointer<GtkTreeViewColumn>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                path: TreePath,
                column: TreeViewColumn?,
            ) -> Unit
            >().get().invoke(
            path!!.run {
                TreePath(reinterpret())
            },
            column?.run {
                TreeViewColumn(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRowCollapsedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeIter>,
            CPointer<GtkTreePath>,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTreeIter>?,
            path: CPointer<GtkTreePath>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TreeIter, path: TreePath) -> Unit>().get().invoke(
            iter!!.run {
                TreeIter(reinterpret())
            },
            path!!.run {
                TreePath(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRowExpandedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeIter>,
            CPointer<GtkTreePath>,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTreeIter>?,
            path: CPointer<GtkTreePath>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TreeIter, path: TreePath) -> Unit>().get().invoke(
            iter!!.run {
                TreeIter(reinterpret())
            },
            path!!.run {
                TreePath(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectSelectAllFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

private val connectSelectCursorParentFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

private val connectSelectCursorRowFunc: CPointer<CFunction<(Int) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: Boolean) -> Boolean>().get().invoke(`object`.asBoolean()).asGBoolean()
    }
        .reinterpret()

private val connectStartInteractiveSearchFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

private val connectTestCollapseRowFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeIter>,
            CPointer<GtkTreePath>,
        ) -> Int
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTreeIter>?,
            path: CPointer<GtkTreePath>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TreeIter, path: TreePath) -> Boolean>().get().invoke(
            iter!!.run {
                TreeIter(reinterpret())
            },
            path!!.run {
                TreePath(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectTestExpandRowFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeIter>,
            CPointer<GtkTreePath>,
        ) -> Int
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTreeIter>?,
            path: CPointer<GtkTreePath>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TreeIter, path: TreePath) -> Boolean>().get().invoke(
            iter!!.run {
                TreeIter(reinterpret())
            },
            path!!.run {
                TreePath(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectToggleCursorRowFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

private val connectUnselectAllFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()
