// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkTreeViewColumn
import org.gtkkn.native.gtk.gtk_tree_view_column_add_attribute
import org.gtkkn.native.gtk.gtk_tree_view_column_cell_is_visible
import org.gtkkn.native.gtk.gtk_tree_view_column_cell_set_cell_data
import org.gtkkn.native.gtk.gtk_tree_view_column_clear
import org.gtkkn.native.gtk.gtk_tree_view_column_clear_attributes
import org.gtkkn.native.gtk.gtk_tree_view_column_clicked
import org.gtkkn.native.gtk.gtk_tree_view_column_focus_cell
import org.gtkkn.native.gtk.gtk_tree_view_column_get_alignment
import org.gtkkn.native.gtk.gtk_tree_view_column_get_button
import org.gtkkn.native.gtk.gtk_tree_view_column_get_clickable
import org.gtkkn.native.gtk.gtk_tree_view_column_get_expand
import org.gtkkn.native.gtk.gtk_tree_view_column_get_fixed_width
import org.gtkkn.native.gtk.gtk_tree_view_column_get_max_width
import org.gtkkn.native.gtk.gtk_tree_view_column_get_min_width
import org.gtkkn.native.gtk.gtk_tree_view_column_get_reorderable
import org.gtkkn.native.gtk.gtk_tree_view_column_get_resizable
import org.gtkkn.native.gtk.gtk_tree_view_column_get_sizing
import org.gtkkn.native.gtk.gtk_tree_view_column_get_sort_column_id
import org.gtkkn.native.gtk.gtk_tree_view_column_get_sort_indicator
import org.gtkkn.native.gtk.gtk_tree_view_column_get_sort_order
import org.gtkkn.native.gtk.gtk_tree_view_column_get_spacing
import org.gtkkn.native.gtk.gtk_tree_view_column_get_title
import org.gtkkn.native.gtk.gtk_tree_view_column_get_tree_view
import org.gtkkn.native.gtk.gtk_tree_view_column_get_type
import org.gtkkn.native.gtk.gtk_tree_view_column_get_visible
import org.gtkkn.native.gtk.gtk_tree_view_column_get_widget
import org.gtkkn.native.gtk.gtk_tree_view_column_get_width
import org.gtkkn.native.gtk.gtk_tree_view_column_get_x_offset
import org.gtkkn.native.gtk.gtk_tree_view_column_new
import org.gtkkn.native.gtk.gtk_tree_view_column_new_with_area
import org.gtkkn.native.gtk.gtk_tree_view_column_pack_end
import org.gtkkn.native.gtk.gtk_tree_view_column_pack_start
import org.gtkkn.native.gtk.gtk_tree_view_column_queue_resize
import org.gtkkn.native.gtk.gtk_tree_view_column_set_alignment
import org.gtkkn.native.gtk.gtk_tree_view_column_set_cell_data_func
import org.gtkkn.native.gtk.gtk_tree_view_column_set_clickable
import org.gtkkn.native.gtk.gtk_tree_view_column_set_expand
import org.gtkkn.native.gtk.gtk_tree_view_column_set_fixed_width
import org.gtkkn.native.gtk.gtk_tree_view_column_set_max_width
import org.gtkkn.native.gtk.gtk_tree_view_column_set_min_width
import org.gtkkn.native.gtk.gtk_tree_view_column_set_reorderable
import org.gtkkn.native.gtk.gtk_tree_view_column_set_resizable
import org.gtkkn.native.gtk.gtk_tree_view_column_set_sizing
import org.gtkkn.native.gtk.gtk_tree_view_column_set_sort_column_id
import org.gtkkn.native.gtk.gtk_tree_view_column_set_sort_indicator
import org.gtkkn.native.gtk.gtk_tree_view_column_set_sort_order
import org.gtkkn.native.gtk.gtk_tree_view_column_set_spacing
import org.gtkkn.native.gtk.gtk_tree_view_column_set_title
import org.gtkkn.native.gtk.gtk_tree_view_column_set_visible
import org.gtkkn.native.gtk.gtk_tree_view_column_set_widget
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A visible column in a [class@Gtk.TreeView] widget
 *
 * The `GtkTreeViewColumn` object represents a visible column in a `GtkTreeView` widget.
 * It allows to set properties of the column header, and functions as a holding pen
 * for the cell renderers which determine how the data in the column is displayed.
 *
 * Please refer to the [tree widget conceptual overview](section-tree-widget.html)
 * for an overview of all the objects and data types related to the tree widget and
 * how they work together, and to the [class@Gtk.TreeView] documentation for specifics
 * about the CSS node structure for treeviews and their headers.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x_offset`: x_offset: Out parameter is not supported
 * - parameter `x_offset`: x_offset: Out parameter is not supported
 * - method `cell-area`: Property has no getter nor setter
 */
public open class TreeViewColumn(
    pointer: CPointer<GtkTreeViewColumn>,
) : InitiallyUnowned(pointer.reinterpret()),
    Buildable,
    CellLayout,
    KGTyped {
    public val gtkTreeViewColumnPointer: CPointer<GtkTreeViewColumn>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = gPointer.reinterpret()

    public open var alignment: Float
        /**
         * Returns the current x alignment of @tree_column.  This value can range
         * between 0.0 and 1.0.
         *
         * @return The current alignent of @tree_column.
         */
        get() = gtk_tree_view_column_get_alignment(gtkTreeViewColumnPointer.reinterpret())

        /**
         * Sets the alignment of the title or custom widget inside the column header.
         * The alignment determines its location inside the button -- 0.0 for left, 0.5
         * for center, 1.0 for right.
         *
         * @param xalign The alignment, which is between [0.0 and 1.0] inclusive.
         */
        set(xalign) = gtk_tree_view_column_set_alignment(gtkTreeViewColumnPointer.reinterpret(), xalign)

    public open var clickable: Boolean
        /**
         * Returns true if the user can click on the header for the column.
         *
         * @return true if user can click the column header.
         */
        get() = gtk_tree_view_column_get_clickable(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Sets the header to be active if @clickable is true.  When the header is
         * active, then it can take keyboard focus, and can be clicked.
         *
         * @param clickable true if the header is active.
         */
        set(
            clickable
        ) = gtk_tree_view_column_set_clickable(gtkTreeViewColumnPointer.reinterpret(), clickable.asGBoolean())

    public open var expand: Boolean
        /**
         * Returns true if the column expands to fill available space.
         *
         * @return true if the column expands to fill available space.
         */
        get() = gtk_tree_view_column_get_expand(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Sets the column to take available extra space.  This space is shared equally
         * amongst all columns that have the expand set to true.  If no column has this
         * option set, then the last column gets all extra space.  By default, every
         * column is created with this false.
         *
         * Along with “fixed-width”, the “expand” property changes when the column is
         * resized by the user.
         *
         * @param expand true if the column should expand to fill available space.
         */
        set(expand) = gtk_tree_view_column_set_expand(gtkTreeViewColumnPointer.reinterpret(), expand.asGBoolean())

    public open var fixedWidth: Int
        /**
         * Gets the fixed width of the column.  This may not be the actual displayed
         * width of the column; for that, use gtk_tree_view_column_get_width().
         *
         * @return The fixed width of the column.
         */
        get() = gtk_tree_view_column_get_fixed_width(gtkTreeViewColumnPointer.reinterpret())

        /**
         * If @fixed_width is not -1, sets the fixed width of @tree_column; otherwise
         * unsets it.  The effective value of @fixed_width is clamped between the
         * minimum and maximum width of the column; however, the value stored in the
         * “fixed-width” property is not clamped.  If the column sizing is
         * %GTK_TREE_VIEW_COLUMN_GROW_ONLY or %GTK_TREE_VIEW_COLUMN_AUTOSIZE, setting
         * a fixed width overrides the automatically calculated width.  Note that
         * @fixed_width is only a hint to GTK; the width actually allocated to the
         * column may be greater or less than requested.
         *
         * Along with “expand”, the “fixed-width” property changes when the column is
         * resized by the user.
         *
         * @param fixedWidth The new fixed width, in pixels, or -1.
         */
        set(fixedWidth) = gtk_tree_view_column_set_fixed_width(gtkTreeViewColumnPointer.reinterpret(), fixedWidth)

    public open var maxWidth: Int
        /**
         * Returns the maximum width in pixels of the @tree_column, or -1 if no maximum
         * width is set.
         *
         * @return The maximum width of the @tree_column.
         */
        get() = gtk_tree_view_column_get_max_width(gtkTreeViewColumnPointer.reinterpret())

        /**
         * Sets the maximum width of the @tree_column.  If @max_width is -1, then the
         * maximum width is unset.  Note, the column can actually be wider than max
         * width if it’s the last column in a view.  In this case, the column expands to
         * fill any extra space.
         *
         * @param maxWidth The maximum width of the column in pixels, or -1.
         */
        set(maxWidth) = gtk_tree_view_column_set_max_width(gtkTreeViewColumnPointer.reinterpret(), maxWidth)

    public open var minWidth: Int
        /**
         * Returns the minimum width in pixels of the @tree_column, or -1 if no minimum
         * width is set.
         *
         * @return The minimum width of the @tree_column.
         */
        get() = gtk_tree_view_column_get_min_width(gtkTreeViewColumnPointer.reinterpret())

        /**
         * Sets the minimum width of the @tree_column.  If @min_width is -1, then the
         * minimum width is unset.
         *
         * @param minWidth The minimum width of the column in pixels, or -1.
         */
        set(minWidth) = gtk_tree_view_column_set_min_width(gtkTreeViewColumnPointer.reinterpret(), minWidth)

    public open var reorderable: Boolean
        /**
         * Returns true if the @tree_column can be reordered by the user.
         *
         * @return true if the @tree_column can be reordered by the user.
         */
        get() = gtk_tree_view_column_get_reorderable(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

        /**
         * If @reorderable is true, then the column can be reordered by the end user
         * dragging the header.
         *
         * @param reorderable true, if the column can be reordered.
         */
        set(
            reorderable
        ) = gtk_tree_view_column_set_reorderable(gtkTreeViewColumnPointer.reinterpret(), reorderable.asGBoolean())

    public open var resizable: Boolean
        /**
         * Returns true if the @tree_column can be resized by the end user.
         *
         * @return true, if the @tree_column can be resized.
         */
        get() = gtk_tree_view_column_get_resizable(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

        /**
         * If @resizable is true, then the user can explicitly resize the column by
         * grabbing the outer edge of the column button.
         *
         * If resizable is true and
         * sizing mode of the column is %GTK_TREE_VIEW_COLUMN_AUTOSIZE, then the sizing
         * mode is changed to %GTK_TREE_VIEW_COLUMN_GROW_ONLY.
         *
         * @param resizable true, if the column can be resized
         */
        set(
            resizable
        ) = gtk_tree_view_column_set_resizable(gtkTreeViewColumnPointer.reinterpret(), resizable.asGBoolean())

    public open var sizing: TreeViewColumnSizing
        /**
         * Returns the current type of @tree_column.
         *
         * @return The type of @tree_column.
         */
        get() =
            gtk_tree_view_column_get_sizing(gtkTreeViewColumnPointer.reinterpret()).run {
                TreeViewColumnSizing.fromNativeValue(this)
            }

        /**
         * Sets the growth behavior of @tree_column to @type.
         *
         * @param type The `GtkTreeViewColumn`Sizing.
         */
        set(type) = gtk_tree_view_column_set_sizing(gtkTreeViewColumnPointer.reinterpret(), type.nativeValue)

    /**
     * Logical sort column ID this column sorts on when selected for sorting. Setting the sort column ID makes the column header
     * clickable. Set to -1 to make the column unsortable.
     */
    public open var sortColumnId: Int
        /**
         * Gets the logical @sort_column_id that the model sorts on
         * when this column is selected for sorting.
         *
         * See [method@Gtk.TreeViewColumn.set_sort_column_id].
         *
         * @return the current @sort_column_id for this column, or -1 if
         *   this column can’t be used for sorting
         */
        get() = gtk_tree_view_column_get_sort_column_id(gtkTreeViewColumnPointer.reinterpret())

        /**
         * Sets the logical @sort_column_id that this column sorts on when this column
         * is selected for sorting.  Doing so makes the column header clickable.
         *
         * @param sortColumnId The @sort_column_id of the model to sort on.
         */
        set(
            sortColumnId
        ) = gtk_tree_view_column_set_sort_column_id(gtkTreeViewColumnPointer.reinterpret(), sortColumnId)

    public open var sortIndicator: Boolean
        /**
         * Gets the value set by gtk_tree_view_column_set_sort_indicator().
         *
         * @return whether the sort indicator arrow is displayed
         */
        get() = gtk_tree_view_column_get_sort_indicator(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Call this function with a @setting of true to display an arrow in
         * the header button indicating the column is sorted. Call
         * gtk_tree_view_column_set_sort_order() to change the direction of
         * the arrow.
         *
         * @param setting true to display an indicator that the column is sorted
         */
        set(
            setting
        ) = gtk_tree_view_column_set_sort_indicator(gtkTreeViewColumnPointer.reinterpret(), setting.asGBoolean())

    public open var sortOrder: SortType
        /**
         * Gets the value set by gtk_tree_view_column_set_sort_order().
         *
         * @return the sort order the sort indicator is indicating
         */
        get() =
            gtk_tree_view_column_get_sort_order(gtkTreeViewColumnPointer.reinterpret()).run {
                SortType.fromNativeValue(this)
            }

        /**
         * Changes the appearance of the sort indicator.
         *
         * This does not actually sort the model.  Use
         * gtk_tree_view_column_set_sort_column_id() if you want automatic sorting
         * support.  This function is primarily for custom sorting behavior, and should
         * be used in conjunction with gtk_tree_sortable_set_sort_column_id() to do
         * that. For custom models, the mechanism will vary.
         *
         * The sort indicator changes direction to indicate normal sort or reverse sort.
         * Note that you must have the sort indicator enabled to see anything when
         * calling this function; see gtk_tree_view_column_set_sort_indicator().
         *
         * @param order sort order that the sort indicator should indicate
         */
        set(order) = gtk_tree_view_column_set_sort_order(gtkTreeViewColumnPointer.reinterpret(), order.nativeValue)

    public open var spacing: Int
        /**
         * Returns the spacing of @tree_column.
         *
         * @return the spacing of @tree_column.
         */
        get() = gtk_tree_view_column_get_spacing(gtkTreeViewColumnPointer.reinterpret())

        /**
         * Sets the spacing field of @tree_column, which is the number of pixels to
         * place between cell renderers packed into it.
         *
         * @param spacing distance between cell renderers in pixels.
         */
        set(spacing) = gtk_tree_view_column_set_spacing(gtkTreeViewColumnPointer.reinterpret(), spacing)

    public open var title: String
        /**
         * Returns the title of the widget.
         *
         * @return the title of the column. This string should not be
         * modified or freed.
         */
        get() =
            gtk_tree_view_column_get_title(gtkTreeViewColumnPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title of the @tree_column.  If a custom widget has been set, then
         * this value is ignored.
         *
         * @param title The title of the @tree_column.
         */
        set(title) = gtk_tree_view_column_set_title(gtkTreeViewColumnPointer.reinterpret(), title)

    public open var visible: Boolean
        /**
         * Returns true if @tree_column is visible.
         *
         * @return whether the column is visible or not.  If it is visible, then
         * the tree will show the column.
         */
        get() = gtk_tree_view_column_get_visible(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

        /**
         * Sets the visibility of @tree_column.
         *
         * @param visible true if the @tree_column is visible.
         */
        set(visible) = gtk_tree_view_column_set_visible(gtkTreeViewColumnPointer.reinterpret(), visible.asGBoolean())

    public open var widget: Widget?
        /**
         * Returns the `GtkWidget` in the button on the column header.
         *
         * If a custom widget has not been set then null is returned.
         *
         * @return The `GtkWidget` in the column header
         */
        get() =
            gtk_tree_view_column_get_widget(gtkTreeViewColumnPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the widget in the header to be @widget.  If widget is null, then the
         * header button is set with a `GtkLabel` set to the title of @tree_column.
         *
         * @param widget A child `GtkWidget`
         */
        set(
            widget
        ) =
            gtk_tree_view_column_set_widget(
                gtkTreeViewColumnPointer.reinterpret(),
                widget?.gtkWidgetPointer?.reinterpret()
            )

    public open val width: Int
        /**
         * Returns the current size of @tree_column in pixels.
         *
         * @return The current width of @tree_column.
         */
        get() = gtk_tree_view_column_get_width(gtkTreeViewColumnPointer.reinterpret())

    public open val xOffset: Int
        /**
         * Returns the current X offset of @tree_column in pixels.
         *
         * @return The current X offset of @tree_column.
         */
        get() = gtk_tree_view_column_get_x_offset(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Creates a new `GtkTreeViewColumn`.
     *
     * @return A newly created `GtkTreeViewColumn`.
     */
    public constructor() : this(gtk_tree_view_column_new()!!.reinterpret())

    /**
     * Creates a new `GtkTreeViewColumn` using @area to render its cells.
     *
     * @param area the `GtkCellArea` that the newly created column should use to layout cells.
     * @return A newly created `GtkTreeViewColumn`.
     */
    public constructor(
        area: CellArea,
    ) : this(gtk_tree_view_column_new_with_area(area.gtkCellAreaPointer.reinterpret())!!.reinterpret())

    /**
     * Adds an attribute mapping to the list in @tree_column.
     *
     * The @column is the
     * column of the model to get a value from, and the @attribute is the
     * parameter on @cell_renderer to be set from the value. So for example
     * if column 2 of the model contains strings, you could have the
     * “text” attribute of a `GtkCellRendererText` get its values from
     * column 2.
     *
     * @param cellRenderer the `GtkCellRenderer` to set attributes on
     * @param attribute An attribute on the renderer
     * @param column The column position on the model to get the attribute from.
     */
    open override fun addAttribute(
        cellRenderer: CellRenderer,
        attribute: String,
        column: Int,
    ): Unit =
        gtk_tree_view_column_add_attribute(
            gtkTreeViewColumnPointer.reinterpret(),
            cellRenderer.gtkCellRendererPointer.reinterpret(),
            attribute,
            column
        )

    /**
     * Returns true if any of the cells packed into the @tree_column are visible.
     * For this to be meaningful, you must first initialize the cells with
     * gtk_tree_view_column_cell_set_cell_data()
     *
     * @return true, if any of the cells packed into the @tree_column are currently visible
     */
    public open fun cellIsVisible(): Boolean =
        gtk_tree_view_column_cell_is_visible(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Sets the cell renderer based on the @tree_model and @iter.  That is, for
     * every attribute mapping in @tree_column, it will get a value from the set
     * column on the @iter, and use that value to set the attribute on the cell
     * renderer.  This is used primarily by the `GtkTreeView`.
     *
     * @param treeModel The `GtkTreeModel` to get the cell renderers attributes from.
     * @param iter The `GtkTreeIter` to get the cell renderer’s attributes from.
     * @param isExpander true, if the row has children
     * @param isExpanded true, if the row has visible children
     */
    public open fun cellSetCellData(
        treeModel: TreeModel,
        iter: TreeIter,
        isExpander: Boolean,
        isExpanded: Boolean,
    ): Unit =
        gtk_tree_view_column_cell_set_cell_data(
            gtkTreeViewColumnPointer.reinterpret(),
            treeModel.gtkTreeModelPointer,
            iter.gtkTreeIterPointer,
            isExpander.asGBoolean(),
            isExpanded.asGBoolean()
        )

    /**
     * Unsets all the mappings on all renderers on the @tree_column.
     */
    open override fun clear(): Unit = gtk_tree_view_column_clear(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Clears all existing attributes previously set with
     * gtk_tree_view_column_set_attributes().
     *
     * @param cellRenderer a `GtkCellRenderer` to clear the attribute mapping on.
     */
    open override fun clearAttributes(cellRenderer: CellRenderer): Unit =
        gtk_tree_view_column_clear_attributes(
            gtkTreeViewColumnPointer.reinterpret(),
            cellRenderer.gtkCellRendererPointer.reinterpret()
        )

    /**
     * Emits the “clicked” signal on the column.  This function will only work if
     * @tree_column is clickable.
     */
    public open fun clicked(): Unit = gtk_tree_view_column_clicked(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Sets the current keyboard focus to be at @cell, if the column contains
     * 2 or more editable and activatable cells.
     *
     * @param cell A `GtkCellRenderer`
     */
    public open fun focusCell(cell: CellRenderer): Unit =
        gtk_tree_view_column_focus_cell(
            gtkTreeViewColumnPointer.reinterpret(),
            cell.gtkCellRendererPointer.reinterpret()
        )

    /**
     * Returns the current x alignment of @tree_column.  This value can range
     * between 0.0 and 1.0.
     *
     * @return The current alignent of @tree_column.
     */
    public open fun getAlignment(): Float = gtk_tree_view_column_get_alignment(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Returns the button used in the treeview column header
     *
     * @return The button for the column header.
     */
    public open fun getButton(): Widget =
        gtk_tree_view_column_get_button(gtkTreeViewColumnPointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * Returns true if the user can click on the header for the column.
     *
     * @return true if user can click the column header.
     */
    public open fun getClickable(): Boolean =
        gtk_tree_view_column_get_clickable(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Returns true if the column expands to fill available space.
     *
     * @return true if the column expands to fill available space.
     */
    public open fun getExpand(): Boolean =
        gtk_tree_view_column_get_expand(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Gets the fixed width of the column.  This may not be the actual displayed
     * width of the column; for that, use gtk_tree_view_column_get_width().
     *
     * @return The fixed width of the column.
     */
    public open fun getFixedWidth(): Int = gtk_tree_view_column_get_fixed_width(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Returns the maximum width in pixels of the @tree_column, or -1 if no maximum
     * width is set.
     *
     * @return The maximum width of the @tree_column.
     */
    public open fun getMaxWidth(): Int = gtk_tree_view_column_get_max_width(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Returns the minimum width in pixels of the @tree_column, or -1 if no minimum
     * width is set.
     *
     * @return The minimum width of the @tree_column.
     */
    public open fun getMinWidth(): Int = gtk_tree_view_column_get_min_width(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Returns true if the @tree_column can be reordered by the user.
     *
     * @return true if the @tree_column can be reordered by the user.
     */
    public open fun getReorderable(): Boolean =
        gtk_tree_view_column_get_reorderable(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Returns true if the @tree_column can be resized by the end user.
     *
     * @return true, if the @tree_column can be resized.
     */
    public open fun getResizable(): Boolean =
        gtk_tree_view_column_get_resizable(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Returns the current type of @tree_column.
     *
     * @return The type of @tree_column.
     */
    public open fun getSizing(): TreeViewColumnSizing =
        gtk_tree_view_column_get_sizing(gtkTreeViewColumnPointer.reinterpret()).run {
            TreeViewColumnSizing.fromNativeValue(this)
        }

    /**
     * Gets the logical @sort_column_id that the model sorts on
     * when this column is selected for sorting.
     *
     * See [method@Gtk.TreeViewColumn.set_sort_column_id].
     *
     * @return the current @sort_column_id for this column, or -1 if
     *   this column can’t be used for sorting
     */
    public open fun getSortColumnId(): Int =
        gtk_tree_view_column_get_sort_column_id(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Gets the value set by gtk_tree_view_column_set_sort_indicator().
     *
     * @return whether the sort indicator arrow is displayed
     */
    public open fun getSortIndicator(): Boolean =
        gtk_tree_view_column_get_sort_indicator(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Gets the value set by gtk_tree_view_column_set_sort_order().
     *
     * @return the sort order the sort indicator is indicating
     */
    public open fun getSortOrder(): SortType =
        gtk_tree_view_column_get_sort_order(gtkTreeViewColumnPointer.reinterpret()).run {
            SortType.fromNativeValue(this)
        }

    /**
     * Returns the spacing of @tree_column.
     *
     * @return the spacing of @tree_column.
     */
    public open fun getSpacing(): Int = gtk_tree_view_column_get_spacing(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Returns the title of the widget.
     *
     * @return the title of the column. This string should not be
     * modified or freed.
     */
    public open fun getTitle(): String =
        gtk_tree_view_column_get_title(gtkTreeViewColumnPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the `GtkTreeView` wherein @tree_column has been inserted.
     * If @column is currently not inserted in any tree view, null is
     * returned.
     *
     * @return The tree view wherein @column
     *   has been inserted
     */
    public open fun getTreeView(): Widget? =
        gtk_tree_view_column_get_tree_view(gtkTreeViewColumnPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns true if @tree_column is visible.
     *
     * @return whether the column is visible or not.  If it is visible, then
     * the tree will show the column.
     */
    public open fun getVisible(): Boolean =
        gtk_tree_view_column_get_visible(gtkTreeViewColumnPointer.reinterpret()).asBoolean()

    /**
     * Returns the `GtkWidget` in the button on the column header.
     *
     * If a custom widget has not been set then null is returned.
     *
     * @return The `GtkWidget` in the column header
     */
    public open fun getWidget(): Widget? =
        gtk_tree_view_column_get_widget(gtkTreeViewColumnPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the current size of @tree_column in pixels.
     *
     * @return The current width of @tree_column.
     */
    public open fun getWidth(): Int = gtk_tree_view_column_get_width(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Returns the current X offset of @tree_column in pixels.
     *
     * @return The current X offset of @tree_column.
     */
    public open fun getXOffset(): Int = gtk_tree_view_column_get_x_offset(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Adds the @cell to end of the column. If @expand is false, then the @cell
     * is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which @expand is true.
     *
     * @param cell The `GtkCellRenderer`
     * @param expand true if @cell is to be given extra space allocated to @tree_column.
     */
    open override fun packEnd(
        cell: CellRenderer,
        expand: Boolean,
    ): Unit =
        gtk_tree_view_column_pack_end(
            gtkTreeViewColumnPointer.reinterpret(),
            cell.gtkCellRendererPointer.reinterpret(),
            expand.asGBoolean()
        )

    /**
     * Packs the @cell into the beginning of the column. If @expand is false, then
     * the @cell is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which @expand is true.
     *
     * @param cell The `GtkCellRenderer`
     * @param expand true if @cell is to be given extra space allocated to @tree_column.
     */
    open override fun packStart(
        cell: CellRenderer,
        expand: Boolean,
    ): Unit =
        gtk_tree_view_column_pack_start(
            gtkTreeViewColumnPointer.reinterpret(),
            cell.gtkCellRendererPointer.reinterpret(),
            expand.asGBoolean()
        )

    /**
     * Flags the column, and the cell renderers added to this column, to have
     * their sizes renegotiated.
     */
    public open fun queueResize(): Unit = gtk_tree_view_column_queue_resize(gtkTreeViewColumnPointer.reinterpret())

    /**
     * Sets the alignment of the title or custom widget inside the column header.
     * The alignment determines its location inside the button -- 0.0 for left, 0.5
     * for center, 1.0 for right.
     *
     * @param xalign The alignment, which is between [0.0 and 1.0] inclusive.
     */
    public open fun setAlignment(xalign: Float): Unit =
        gtk_tree_view_column_set_alignment(gtkTreeViewColumnPointer.reinterpret(), xalign)

    /**
     * Sets the `GtkTreeCellDataFunc` to use for the column.
     *
     * This
     * function is used instead of the standard attributes mapping for
     * setting the column value, and should set the value of @tree_column's
     * cell renderer as appropriate.  @func may be null to remove an
     * older one.
     *
     * @param cellRenderer A `GtkCellRenderer`
     * @param func The `GtkTreeCellDataFunc` to use.
     */
    public open fun setCellDataFunc_(
        cellRenderer: CellRenderer,
        func: TreeCellDataFunc,
    ): Unit =
        gtk_tree_view_column_set_cell_data_func(
            gtkTreeViewColumnPointer.reinterpret(),
            cellRenderer.gtkCellRendererPointer.reinterpret(),
            TreeCellDataFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Sets the header to be active if @clickable is true.  When the header is
     * active, then it can take keyboard focus, and can be clicked.
     *
     * @param clickable true if the header is active.
     */
    public open fun setClickable(clickable: Boolean): Unit =
        gtk_tree_view_column_set_clickable(gtkTreeViewColumnPointer.reinterpret(), clickable.asGBoolean())

    /**
     * Sets the column to take available extra space.  This space is shared equally
     * amongst all columns that have the expand set to true.  If no column has this
     * option set, then the last column gets all extra space.  By default, every
     * column is created with this false.
     *
     * Along with “fixed-width”, the “expand” property changes when the column is
     * resized by the user.
     *
     * @param expand true if the column should expand to fill available space.
     */
    public open fun setExpand(expand: Boolean): Unit =
        gtk_tree_view_column_set_expand(gtkTreeViewColumnPointer.reinterpret(), expand.asGBoolean())

    /**
     * If @fixed_width is not -1, sets the fixed width of @tree_column; otherwise
     * unsets it.  The effective value of @fixed_width is clamped between the
     * minimum and maximum width of the column; however, the value stored in the
     * “fixed-width” property is not clamped.  If the column sizing is
     * %GTK_TREE_VIEW_COLUMN_GROW_ONLY or %GTK_TREE_VIEW_COLUMN_AUTOSIZE, setting
     * a fixed width overrides the automatically calculated width.  Note that
     * @fixed_width is only a hint to GTK; the width actually allocated to the
     * column may be greater or less than requested.
     *
     * Along with “expand”, the “fixed-width” property changes when the column is
     * resized by the user.
     *
     * @param fixedWidth The new fixed width, in pixels, or -1.
     */
    public open fun setFixedWidth(fixedWidth: Int): Unit =
        gtk_tree_view_column_set_fixed_width(gtkTreeViewColumnPointer.reinterpret(), fixedWidth)

    /**
     * Sets the maximum width of the @tree_column.  If @max_width is -1, then the
     * maximum width is unset.  Note, the column can actually be wider than max
     * width if it’s the last column in a view.  In this case, the column expands to
     * fill any extra space.
     *
     * @param maxWidth The maximum width of the column in pixels, or -1.
     */
    public open fun setMaxWidth(maxWidth: Int): Unit =
        gtk_tree_view_column_set_max_width(gtkTreeViewColumnPointer.reinterpret(), maxWidth)

    /**
     * Sets the minimum width of the @tree_column.  If @min_width is -1, then the
     * minimum width is unset.
     *
     * @param minWidth The minimum width of the column in pixels, or -1.
     */
    public open fun setMinWidth(minWidth: Int): Unit =
        gtk_tree_view_column_set_min_width(gtkTreeViewColumnPointer.reinterpret(), minWidth)

    /**
     * If @reorderable is true, then the column can be reordered by the end user
     * dragging the header.
     *
     * @param reorderable true, if the column can be reordered.
     */
    public open fun setReorderable(reorderable: Boolean): Unit =
        gtk_tree_view_column_set_reorderable(gtkTreeViewColumnPointer.reinterpret(), reorderable.asGBoolean())

    /**
     * If @resizable is true, then the user can explicitly resize the column by
     * grabbing the outer edge of the column button.
     *
     * If resizable is true and
     * sizing mode of the column is %GTK_TREE_VIEW_COLUMN_AUTOSIZE, then the sizing
     * mode is changed to %GTK_TREE_VIEW_COLUMN_GROW_ONLY.
     *
     * @param resizable true, if the column can be resized
     */
    public open fun setResizable(resizable: Boolean): Unit =
        gtk_tree_view_column_set_resizable(gtkTreeViewColumnPointer.reinterpret(), resizable.asGBoolean())

    /**
     * Sets the growth behavior of @tree_column to @type.
     *
     * @param type The `GtkTreeViewColumn`Sizing.
     */
    public open fun setSizing(type: TreeViewColumnSizing): Unit =
        gtk_tree_view_column_set_sizing(gtkTreeViewColumnPointer.reinterpret(), type.nativeValue)

    /**
     * Sets the logical @sort_column_id that this column sorts on when this column
     * is selected for sorting.  Doing so makes the column header clickable.
     *
     * @param sortColumnId The @sort_column_id of the model to sort on.
     */
    public open fun setSortColumnId(sortColumnId: Int): Unit =
        gtk_tree_view_column_set_sort_column_id(gtkTreeViewColumnPointer.reinterpret(), sortColumnId)

    /**
     * Call this function with a @setting of true to display an arrow in
     * the header button indicating the column is sorted. Call
     * gtk_tree_view_column_set_sort_order() to change the direction of
     * the arrow.
     *
     * @param setting true to display an indicator that the column is sorted
     */
    public open fun setSortIndicator(setting: Boolean): Unit =
        gtk_tree_view_column_set_sort_indicator(gtkTreeViewColumnPointer.reinterpret(), setting.asGBoolean())

    /**
     * Changes the appearance of the sort indicator.
     *
     * This does not actually sort the model.  Use
     * gtk_tree_view_column_set_sort_column_id() if you want automatic sorting
     * support.  This function is primarily for custom sorting behavior, and should
     * be used in conjunction with gtk_tree_sortable_set_sort_column_id() to do
     * that. For custom models, the mechanism will vary.
     *
     * The sort indicator changes direction to indicate normal sort or reverse sort.
     * Note that you must have the sort indicator enabled to see anything when
     * calling this function; see gtk_tree_view_column_set_sort_indicator().
     *
     * @param order sort order that the sort indicator should indicate
     */
    public open fun setSortOrder(order: SortType): Unit =
        gtk_tree_view_column_set_sort_order(gtkTreeViewColumnPointer.reinterpret(), order.nativeValue)

    /**
     * Sets the spacing field of @tree_column, which is the number of pixels to
     * place between cell renderers packed into it.
     *
     * @param spacing distance between cell renderers in pixels.
     */
    public open fun setSpacing(spacing: Int): Unit =
        gtk_tree_view_column_set_spacing(gtkTreeViewColumnPointer.reinterpret(), spacing)

    /**
     * Sets the title of the @tree_column.  If a custom widget has been set, then
     * this value is ignored.
     *
     * @param title The title of the @tree_column.
     */
    public open fun setTitle(title: String): Unit =
        gtk_tree_view_column_set_title(gtkTreeViewColumnPointer.reinterpret(), title)

    /**
     * Sets the visibility of @tree_column.
     *
     * @param visible true if the @tree_column is visible.
     */
    public open fun setVisible(visible: Boolean): Unit =
        gtk_tree_view_column_set_visible(gtkTreeViewColumnPointer.reinterpret(), visible.asGBoolean())

    /**
     * Sets the widget in the header to be @widget.  If widget is null, then the
     * header button is set with a `GtkLabel` set to the title of @tree_column.
     *
     * @param widget A child `GtkWidget`
     */
    public open fun setWidget(widget: Widget? = null): Unit =
        gtk_tree_view_column_set_widget(gtkTreeViewColumnPointer.reinterpret(), widget?.gtkWidgetPointer?.reinterpret())

    /**
     * Emitted when the column's header has been clicked.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "clicked",
            connectClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TreeViewColumn> {
        override val type: GeneratedClassKGType<TreeViewColumn> =
            GeneratedClassKGType(gtk_tree_view_column_get_type()) { TreeViewColumn(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectClickedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
