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
import org.gtkkn.bindings.gdk.ContentFormats
import org.gtkkn.bindings.gdk.DragAction
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkIconView
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.GtkTreePath
import org.gtkkn.native.gtk.gtk_icon_view_create_drag_icon
import org.gtkkn.native.gtk.gtk_icon_view_enable_model_drag_dest
import org.gtkkn.native.gtk.gtk_icon_view_enable_model_drag_source
import org.gtkkn.native.gtk.gtk_icon_view_get_activate_on_single_click
import org.gtkkn.native.gtk.gtk_icon_view_get_cell_rect
import org.gtkkn.native.gtk.gtk_icon_view_get_column_spacing
import org.gtkkn.native.gtk.gtk_icon_view_get_columns
import org.gtkkn.native.gtk.gtk_icon_view_get_item_column
import org.gtkkn.native.gtk.gtk_icon_view_get_item_orientation
import org.gtkkn.native.gtk.gtk_icon_view_get_item_padding
import org.gtkkn.native.gtk.gtk_icon_view_get_item_row
import org.gtkkn.native.gtk.gtk_icon_view_get_item_width
import org.gtkkn.native.gtk.gtk_icon_view_get_margin
import org.gtkkn.native.gtk.gtk_icon_view_get_markup_column
import org.gtkkn.native.gtk.gtk_icon_view_get_model
import org.gtkkn.native.gtk.gtk_icon_view_get_path_at_pos
import org.gtkkn.native.gtk.gtk_icon_view_get_pixbuf_column
import org.gtkkn.native.gtk.gtk_icon_view_get_reorderable
import org.gtkkn.native.gtk.gtk_icon_view_get_row_spacing
import org.gtkkn.native.gtk.gtk_icon_view_get_selected_items
import org.gtkkn.native.gtk.gtk_icon_view_get_selection_mode
import org.gtkkn.native.gtk.gtk_icon_view_get_spacing
import org.gtkkn.native.gtk.gtk_icon_view_get_text_column
import org.gtkkn.native.gtk.gtk_icon_view_get_tooltip_column
import org.gtkkn.native.gtk.gtk_icon_view_get_type
import org.gtkkn.native.gtk.gtk_icon_view_item_activated
import org.gtkkn.native.gtk.gtk_icon_view_new
import org.gtkkn.native.gtk.gtk_icon_view_new_with_area
import org.gtkkn.native.gtk.gtk_icon_view_new_with_model
import org.gtkkn.native.gtk.gtk_icon_view_path_is_selected
import org.gtkkn.native.gtk.gtk_icon_view_scroll_to_path
import org.gtkkn.native.gtk.gtk_icon_view_select_all
import org.gtkkn.native.gtk.gtk_icon_view_select_path
import org.gtkkn.native.gtk.gtk_icon_view_selected_foreach
import org.gtkkn.native.gtk.gtk_icon_view_set_activate_on_single_click
import org.gtkkn.native.gtk.gtk_icon_view_set_column_spacing
import org.gtkkn.native.gtk.gtk_icon_view_set_columns
import org.gtkkn.native.gtk.gtk_icon_view_set_cursor
import org.gtkkn.native.gtk.gtk_icon_view_set_drag_dest_item
import org.gtkkn.native.gtk.gtk_icon_view_set_item_orientation
import org.gtkkn.native.gtk.gtk_icon_view_set_item_padding
import org.gtkkn.native.gtk.gtk_icon_view_set_item_width
import org.gtkkn.native.gtk.gtk_icon_view_set_margin
import org.gtkkn.native.gtk.gtk_icon_view_set_markup_column
import org.gtkkn.native.gtk.gtk_icon_view_set_model
import org.gtkkn.native.gtk.gtk_icon_view_set_pixbuf_column
import org.gtkkn.native.gtk.gtk_icon_view_set_reorderable
import org.gtkkn.native.gtk.gtk_icon_view_set_row_spacing
import org.gtkkn.native.gtk.gtk_icon_view_set_selection_mode
import org.gtkkn.native.gtk.gtk_icon_view_set_spacing
import org.gtkkn.native.gtk.gtk_icon_view_set_text_column
import org.gtkkn.native.gtk.gtk_icon_view_set_tooltip_cell
import org.gtkkn.native.gtk.gtk_icon_view_set_tooltip_column
import org.gtkkn.native.gtk.gtk_icon_view_set_tooltip_item
import org.gtkkn.native.gtk.gtk_icon_view_unselect_all
import org.gtkkn.native.gtk.gtk_icon_view_unselect_path
import org.gtkkn.native.gtk.gtk_icon_view_unset_model_drag_dest
import org.gtkkn.native.gtk.gtk_icon_view_unset_model_drag_source
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkIconView` is a widget which displays data in a grid of icons.
 *
 * `GtkIconView` provides an alternative view on a `GtkTreeModel`.
 * It displays the model as a grid of icons with labels. Like
 * [class@Gtk.TreeView], it allows to select one or multiple items
 * (depending on the selection mode, see [method@Gtk.IconView.set_selection_mode]).
 * In addition to selection with the arrow keys, `GtkIconView` supports
 * rubberband selection, which is controlled by dragging the pointer.
 *
 * Note that if the tree model is backed by an actual tree store (as
 * opposed to a flat list where the mapping to icons is obvious),
 * `GtkIconView` will only display the first level of the tree and
 * ignore the tree’s branches.
 *
 * ## CSS nodes
 *
 * ```
 * iconview.view
 * ╰── [rubberband]
 * ```
 *
 * `GtkIconView` has a single CSS node with name iconview and style class .view.
 * For rubberband selection, a subnode with name rubberband is used.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `path`: path: Out parameter is not supported
 * - parameter `model`: model: Out parameter is not supported
 * - parameter `start_path`: start_path: Out parameter is not supported
 * - method `cell-area`: Property has no getter nor setter
 */
public open class IconView(public val gtkIconViewPointer: CPointer<GtkIconView>) :
    Widget(gtkIconViewPointer.reinterpret()),
    CellLayout,
    Scrollable,
    KGTyped {
    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The activate-on-single-click property specifies whether the "item-activated" signal
     * will be emitted after a single click.
     */
    public open var activateOnSingleClick: Boolean
        /**
         * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
         *
         * @return true if item-activated will be emitted on a single click
         */
        get() = gtk_icon_view_get_activate_on_single_click(gtkIconViewPointer).asBoolean()

        /**
         * Causes the `GtkIconView`::item-activated signal to be emitted on
         * a single click instead of a double click.
         *
         * @param single true to emit item-activated on a single click
         */
        set(single) = gtk_icon_view_set_activate_on_single_click(gtkIconViewPointer, single.asGBoolean())

    /**
     * The column-spacing property specifies the space which is inserted between
     * the columns of the icon view.
     */
    public open var columnSpacing: gint
        /**
         * Returns the value of the ::column-spacing property.
         *
         * @return the space between columns
         */
        get() = gtk_icon_view_get_column_spacing(gtkIconViewPointer)

        /**
         * Sets the ::column-spacing property which specifies the space
         * which is inserted between the columns of the icon view.
         *
         * @param columnSpacing the column spacing
         */
        set(columnSpacing) = gtk_icon_view_set_column_spacing(gtkIconViewPointer, columnSpacing)

    /**
     * The columns property contains the number of the columns in which the
     * items should be displayed. If it is -1, the number of columns will
     * be chosen automatically to fill the available area.
     */
    public open var columns: gint
        /**
         * Returns the value of the ::columns property.
         *
         * @return the number of columns, or -1
         */
        get() = gtk_icon_view_get_columns(gtkIconViewPointer)

        /**
         * Sets the ::columns property which determines in how
         * many columns the icons are arranged. If @columns is
         * -1, the number of columns will be chosen automatically
         * to fill the available area.
         *
         * @param columns the number of columns
         */
        set(columns) = gtk_icon_view_set_columns(gtkIconViewPointer, columns)

    /**
     * The item-orientation property specifies how the cells (i.e. the icon and
     * the text) of the item are positioned relative to each other.
     */
    public open var itemOrientation: Orientation
        /**
         * Returns the value of the ::item-orientation property which determines
         * whether the labels are drawn beside the icons instead of below.
         *
         * @return the relative position of texts and icons
         */
        get() = gtk_icon_view_get_item_orientation(gtkIconViewPointer).run {
            Orientation.fromNativeValue(this)
        }

        /**
         * Sets the ::item-orientation property which determines whether the labels
         * are drawn beside the icons instead of below.
         *
         * @param orientation the relative position of texts and icons
         */
        set(orientation) = gtk_icon_view_set_item_orientation(gtkIconViewPointer, orientation.nativeValue)

    /**
     * The item-padding property specifies the padding around each
     * of the icon view's item.
     */
    public open var itemPadding: gint
        /**
         * Returns the value of the ::item-padding property.
         *
         * @return the padding around items
         */
        get() = gtk_icon_view_get_item_padding(gtkIconViewPointer)

        /**
         * Sets the `GtkIconView`:item-padding property which specifies the padding
         * around each of the icon view’s items.
         *
         * @param itemPadding the item padding
         */
        set(itemPadding) = gtk_icon_view_set_item_padding(gtkIconViewPointer, itemPadding)

    /**
     * The item-width property specifies the width to use for each item.
     * If it is set to -1, the icon view will automatically determine a
     * suitable item size.
     */
    public open var itemWidth: gint
        /**
         * Returns the value of the ::item-width property.
         *
         * @return the width of a single item, or -1
         */
        get() = gtk_icon_view_get_item_width(gtkIconViewPointer)

        /**
         * Sets the ::item-width property which specifies the width
         * to use for each item. If it is set to -1, the icon view will
         * automatically determine a suitable item size.
         *
         * @param itemWidth the width for each item
         */
        set(itemWidth) = gtk_icon_view_set_item_width(gtkIconViewPointer, itemWidth)

    /**
     * The margin property specifies the space which is inserted
     * at the edges of the icon view.
     */
    public open var margin: gint
        /**
         * Returns the value of the ::margin property.
         *
         * @return the space at the borders
         */
        get() = gtk_icon_view_get_margin(gtkIconViewPointer)

        /**
         * Sets the ::margin property which specifies the space
         * which is inserted at the top, bottom, left and right
         * of the icon view.
         *
         * @param margin the margin
         */
        set(margin) = gtk_icon_view_set_margin(gtkIconViewPointer, margin)

    /**
     * The ::markup-column property contains the number of the model column
     * containing markup information to be displayed. The markup column must be
     * of type `G_TYPE_STRING`. If this property and the :text-column property
     * are both set to column numbers, it overrides the text column.
     * If both are set to -1, no texts are displayed.
     */
    public open var markupColumn: gint
        /**
         * Returns the column with markup text for @icon_view.
         *
         * @return the markup column, or -1 if it’s unset.
         */
        get() = gtk_icon_view_get_markup_column(gtkIconViewPointer)

        /**
         * Sets the column with markup information for @icon_view to be
         * @column. The markup column must be of type `G_TYPE_STRING`.
         * If the markup column is set to something, it overrides
         * the text column set by gtk_icon_view_set_text_column().
         *
         * @param column A column in the currently used model, or -1 to display no text
         */
        set(column) = gtk_icon_view_set_markup_column(gtkIconViewPointer, column)

    public open var model: TreeModel?
        /**
         * Returns the model the `GtkIconView` is based on.  Returns null if the
         * model is unset.
         *
         * @return The currently used `GtkTreeModel`
         */
        get() = gtk_icon_view_get_model(gtkIconViewPointer)?.run {
            TreeModel.TreeModelImpl(reinterpret())
        }

        /**
         * Sets the model for a `GtkIconView`.
         * If the @icon_view already has a model set, it will remove
         * it before setting the new model.  If @model is null, then
         * it will unset the old model.
         *
         * @param model The model.
         */
        set(model) = gtk_icon_view_set_model(gtkIconViewPointer, model?.gtkTreeModelPointer)

    /**
     * The ::pixbuf-column property contains the number of the model column
     * containing the pixbufs which are displayed. The pixbuf column must be
     * of type `GDK_TYPE_PIXBUF`. Setting this property to -1 turns off the
     * display of pixbufs.
     */
    public open var pixbufColumn: gint
        /**
         * Returns the column with pixbufs for @icon_view.
         *
         * @return the pixbuf column, or -1 if it’s unset.
         */
        get() = gtk_icon_view_get_pixbuf_column(gtkIconViewPointer)

        /**
         * Sets the column with pixbufs for @icon_view to be @column. The pixbuf
         * column must be of type `GDK_TYPE_PIXBUF`
         *
         * @param column A column in the currently used model, or -1 to disable
         */
        set(column) = gtk_icon_view_set_pixbuf_column(gtkIconViewPointer, column)

    /**
     * The reorderable property specifies if the items can be reordered
     * by DND.
     */
    public open var reorderable: Boolean
        /**
         * Retrieves whether the user can reorder the list via drag-and-drop.
         * See gtk_icon_view_set_reorderable().
         *
         * @return true if the list can be reordered.
         */
        get() = gtk_icon_view_get_reorderable(gtkIconViewPointer).asBoolean()

        /**
         * This function is a convenience function to allow you to reorder models that
         * support the `GtkTreeDragSourceIface` and the `GtkTreeDragDestIface`. Both
         * `GtkTreeStore` and `GtkListStore` support these. If @reorderable is true, then
         * the user can reorder the model by dragging and dropping rows.  The
         * developer can listen to these changes by connecting to the model's
         * row_inserted and row_deleted signals. The reordering is implemented by setting up
         * the icon view as a drag source and destination. Therefore, drag and
         * drop can not be used in a reorderable view for any other purpose.
         *
         * This function does not give you any degree of control over the order -- any
         * reordering is allowed.  If more control is needed, you should probably
         * handle drag and drop manually.
         *
         * @param reorderable true, if the list of items can be reordered.
         */
        set(reorderable) = gtk_icon_view_set_reorderable(gtkIconViewPointer, reorderable.asGBoolean())

    /**
     * The row-spacing property specifies the space which is inserted between
     * the rows of the icon view.
     */
    public open var rowSpacing: gint
        /**
         * Returns the value of the ::row-spacing property.
         *
         * @return the space between rows
         */
        get() = gtk_icon_view_get_row_spacing(gtkIconViewPointer)

        /**
         * Sets the ::row-spacing property which specifies the space
         * which is inserted between the rows of the icon view.
         *
         * @param rowSpacing the row spacing
         */
        set(rowSpacing) = gtk_icon_view_set_row_spacing(gtkIconViewPointer, rowSpacing)

    /**
     * The ::selection-mode property specifies the selection mode of
     * icon view. If the mode is %GTK_SELECTION_MULTIPLE, rubberband selection
     * is enabled, for the other modes, only keyboard selection is possible.
     */
    public open var selectionMode: SelectionMode
        /**
         * Gets the selection mode of the @icon_view.
         *
         * @return the current selection mode
         */
        get() = gtk_icon_view_get_selection_mode(gtkIconViewPointer).run {
            SelectionMode.fromNativeValue(this)
        }

        /**
         * Sets the selection mode of the @icon_view.
         *
         * @param mode The selection mode
         */
        set(mode) = gtk_icon_view_set_selection_mode(gtkIconViewPointer, mode.nativeValue)

    /**
     * The spacing property specifies the space which is inserted between
     * the cells (i.e. the icon and the text) of an item.
     */
    public open var spacing: gint
        /**
         * Returns the value of the ::spacing property.
         *
         * @return the space between cells
         */
        get() = gtk_icon_view_get_spacing(gtkIconViewPointer)

        /**
         * Sets the ::spacing property which specifies the space
         * which is inserted between the cells (i.e. the icon and
         * the text) of an item.
         *
         * @param spacing the spacing
         */
        set(spacing) = gtk_icon_view_set_spacing(gtkIconViewPointer, spacing)

    /**
     * The ::text-column property contains the number of the model column
     * containing the texts which are displayed. The text column must be
     * of type `G_TYPE_STRING`. If this property and the :markup-column
     * property are both set to -1, no texts are displayed.
     */
    public open var textColumn: gint
        /**
         * Returns the column with text for @icon_view.
         *
         * @return the text column, or -1 if it’s unset.
         */
        get() = gtk_icon_view_get_text_column(gtkIconViewPointer)

        /**
         * Sets the column with text for @icon_view to be @column. The text
         * column must be of type `G_TYPE_STRING`.
         *
         * @param column A column in the currently used model, or -1 to display no text
         */
        set(column) = gtk_icon_view_set_text_column(gtkIconViewPointer, column)

    public open var tooltipColumn: gint
        /**
         * Returns the column of @icon_view’s model which is being used for
         * displaying tooltips on @icon_view’s rows.
         *
         * @return the index of the tooltip column that is currently being
         * used, or -1 if this is disabled.
         */
        get() = gtk_icon_view_get_tooltip_column(gtkIconViewPointer)

        /**
         * If you only plan to have simple (text-only) tooltips on full items, you
         * can use this function to have `GtkIconView` handle these automatically
         * for you. @column should be set to the column in @icon_view’s model
         * containing the tooltip texts, or -1 to disable this feature.
         *
         * When enabled, `GtkWidget:has-tooltip` will be set to true and
         * @icon_view will connect a `GtkWidget::query-tooltip` signal handler.
         *
         * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
         * so &, <, etc have to be escaped in the text.
         *
         * @param column an integer, which is a valid column number for @icon_view’s model
         */
        set(column) = gtk_icon_view_set_tooltip_column(gtkIconViewPointer, column)

    /**
     * Creates a new `GtkIconView` widget
     *
     * @return A newly created `GtkIconView` widget
     */
    public constructor() : this(gtk_icon_view_new()!!.reinterpret())

    /**
     * Creates a new `GtkIconView` widget using the
     * specified @area to layout cells inside the icons.
     *
     * @param area the `GtkCellArea` to use to layout cells
     * @return A newly created `GtkIconView` widget
     */
    public constructor(area: CellArea) : this(gtk_icon_view_new_with_area(area.gtkCellAreaPointer)!!.reinterpret())

    /**
     * Creates a new `GtkIconView` widget with the model @model.
     *
     * @param model The model.
     * @return A newly created `GtkIconView` widget.
     */
    public constructor(model: TreeModel) : this(gtk_icon_view_new_with_model(model.gtkTreeModelPointer)!!.reinterpret())

    /**
     * Creates a `GdkPaintable` representation of the item at @path.
     * This image is used for a drag icon.
     *
     * @param path a `GtkTreePath` in @icon_view
     * @return a newly-allocated `GdkPaintable` of the drag icon.
     */
    public open fun createDragIcon(path: TreePath): Paintable? =
        gtk_icon_view_create_drag_icon(gtkIconViewPointer, path.gtkTreePathPointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

    /**
     * Turns @icon_view into a drop destination for automatic DND. Calling this
     * method sets `GtkIconView`:reorderable to false.
     *
     * @param formats the formats that the drag will support
     * @param actions the bitmask of possible actions for a drag to this
     *    widget
     */
    public open fun enableModelDragDest(formats: ContentFormats, actions: DragAction): Unit =
        gtk_icon_view_enable_model_drag_dest(gtkIconViewPointer, formats.gdkContentFormatsPointer, actions.mask)

    /**
     * Turns @icon_view into a drag source for automatic DND. Calling this
     * method sets `GtkIconView`:reorderable to false.
     *
     * @param startButtonMask Mask of allowed buttons to start drag
     * @param formats the formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this
     *    widget
     */
    public open fun enableModelDragSource(
        startButtonMask: ModifierType,
        formats: ContentFormats,
        actions: DragAction,
    ): Unit = gtk_icon_view_enable_model_drag_source(
        gtkIconViewPointer,
        startButtonMask.mask,
        formats.gdkContentFormatsPointer,
        actions.mask
    )

    /**
     * Fills the bounding rectangle in widget coordinates for the cell specified by
     * @path and @cell. If @cell is null the main cell area is used.
     *
     * This function is only valid if @icon_view is realized.
     *
     * @param path a `GtkTreePath`
     * @param cell a `GtkCellRenderer`
     * @param rect rectangle to fill with cell rect
     * @return false if there is no such item, true otherwise
     */
    public open fun getCellRect(path: TreePath, cell: CellRenderer? = null, rect: Rectangle): Boolean =
        gtk_icon_view_get_cell_rect(
            gtkIconViewPointer,
            path.gtkTreePathPointer,
            cell?.gtkCellRendererPointer,
            rect.gdkRectanglePointer
        ).asBoolean()

    /**
     * Gets the column in which the item @path is currently
     * displayed. Column numbers start at 0.
     *
     * @param path the `GtkTreePath` of the item
     * @return The column in which the item is displayed
     */
    public open fun getItemColumn(path: TreePath): gint =
        gtk_icon_view_get_item_column(gtkIconViewPointer, path.gtkTreePathPointer)

    /**
     * Gets the row in which the item @path is currently
     * displayed. Row numbers start at 0.
     *
     * @param path the `GtkTreePath` of the item
     * @return The row in which the item is displayed
     */
    public open fun getItemRow(path: TreePath): gint =
        gtk_icon_view_get_item_row(gtkIconViewPointer, path.gtkTreePathPointer)

    /**
     * Gets the path for the icon at the given position.
     *
     * @param x The x position to be identified
     * @param y The y position to be identified
     * @return The `GtkTreePath` corresponding
     * to the icon or null if no icon exists at that position.
     */
    public open fun getPathAtPos(x: gint, y: gint): TreePath? =
        gtk_icon_view_get_path_at_pos(gtkIconViewPointer, x, y)?.run {
            TreePath(this)
        }

    /**
     * Creates a list of paths of all selected items. Additionally, if you are
     * planning on modifying the model after calling this function, you may
     * want to convert the returned list into a list of `GtkTreeRowReferences`.
     * To do this, you can use gtk_tree_row_reference_new().
     *
     * To free the return value, use `g_list_free_full`:
     * |[<!-- language="C" -->
     * GtkWidget *icon_view = gtk_icon_view_new ();
     * // Use icon_view
     *
     * GList *list = gtk_icon_view_get_selected_items (GTK_ICON_VIEW (icon_view));
     *
     * // use list
     *
     * g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
     * ]|
     *
     * @return A `GList` containing a `GtkTreePath` for each selected row.
     */
    public open fun getSelectedItems(): List = gtk_icon_view_get_selected_items(gtkIconViewPointer)!!.run {
        List(this)
    }

    /**
     * Activates the item determined by @path.
     *
     * @param path The `GtkTreePath` to be activated
     */
    public open fun itemActivated(path: TreePath): Unit =
        gtk_icon_view_item_activated(gtkIconViewPointer, path.gtkTreePathPointer)

    /**
     * Returns true if the icon pointed to by @path is currently
     * selected. If @path does not point to a valid location, false is returned.
     *
     * @param path A `GtkTreePath` to check selection on.
     * @return true if @path is selected.
     */
    public open fun pathIsSelected(path: TreePath): Boolean =
        gtk_icon_view_path_is_selected(gtkIconViewPointer, path.gtkTreePathPointer).asBoolean()

    /**
     * Moves the alignments of @icon_view to the position specified by @path.
     * @row_align determines where the row is placed, and @col_align determines
     * where @column is placed.  Both are expected to be between 0.0 and 1.0.
     * 0.0 means left/top alignment, 1.0 means right/bottom alignment, 0.5 means
     * center.
     *
     * If @use_align is false, then the alignment arguments are ignored, and the
     * tree does the minimum amount of work to scroll the item onto the screen.
     * This means that the item will be scrolled to the edge closest to its current
     * position.  If the item is currently visible on the screen, nothing is done.
     *
     * This function only works if the model is set, and @path is a valid row on
     * the model. If the model changes before the @icon_view is realized, the
     * centered path will be modified to reflect this change.
     *
     * @param path The path of the item to move to.
     * @param useAlign whether to use alignment arguments, or false.
     * @param rowAlign The vertical alignment of the item specified by @path.
     * @param colAlign The horizontal alignment of the item specified by @path.
     */
    public open fun scrollToPath(path: TreePath, useAlign: Boolean, rowAlign: gfloat, colAlign: gfloat): Unit =
        gtk_icon_view_scroll_to_path(
            gtkIconViewPointer,
            path.gtkTreePathPointer,
            useAlign.asGBoolean(),
            rowAlign,
            colAlign
        )

    /**
     * Selects all the icons. @icon_view must has its selection mode set
     * to %GTK_SELECTION_MULTIPLE.
     */
    public open fun selectAll(): Unit = gtk_icon_view_select_all(gtkIconViewPointer)

    /**
     * Selects the row at @path.
     *
     * @param path The `GtkTreePath` to be selected.
     */
    public open fun selectPath(path: TreePath): Unit =
        gtk_icon_view_select_path(gtkIconViewPointer, path.gtkTreePathPointer)

    /**
     * Calls a function for each selected icon. Note that the model or
     * selection cannot be modified from within this function.
     *
     * @param func The function to call for each selected icon.
     */
    public open fun selectedForeach(func: IconViewForeachFunc): Unit = gtk_icon_view_selected_foreach(
        gtkIconViewPointer,
        IconViewForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Sets the current keyboard focus to be at @path, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular item.
     * If @cell is not null, then focus is given to the cell specified by
     * it. Additionally, if @start_editing is true, then editing should be
     * started in the specified cell.
     *
     * This function is often followed by `gtk_widget_grab_focus
     * (icon_view)` in order to give keyboard focus to the widget.
     * Please note that editing can only happen when the widget is realized.
     *
     * @param path A `GtkTreePath`
     * @param cell One of the cell renderers of @icon_view
     * @param startEditing true if the specified cell should start being edited.
     */
    public open fun setCursor(path: TreePath, cell: CellRenderer? = null, startEditing: Boolean): Unit =
        gtk_icon_view_set_cursor(
            gtkIconViewPointer,
            path.gtkTreePathPointer,
            cell?.gtkCellRendererPointer,
            startEditing.asGBoolean()
        )

    /**
     * Sets the item that is highlighted for feedback.
     *
     * @param path The path of the item to highlight
     * @param pos Specifies where to drop, relative to the item
     */
    public open fun setDragDestItem(path: TreePath? = null, pos: IconViewDropPosition): Unit =
        gtk_icon_view_set_drag_dest_item(gtkIconViewPointer, path?.gtkTreePathPointer, pos.nativeValue)

    /**
     * Sets the tip area of @tooltip to the area which @cell occupies in
     * the item pointed to by @path. See also gtk_tooltip_set_tip_area().
     *
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     *
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
     * @param cell a `GtkCellRenderer`
     */
    public open fun setTooltipCell(tooltip: Tooltip, path: TreePath, cell: CellRenderer? = null): Unit =
        gtk_icon_view_set_tooltip_cell(
            gtkIconViewPointer,
            tooltip.gtkTooltipPointer,
            path.gtkTreePathPointer,
            cell?.gtkCellRendererPointer
        )

    /**
     * Sets the tip area of @tooltip to be the area covered by the item at @path.
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     *
     * @param tooltip a `GtkTooltip`
     * @param path a `GtkTreePath`
     */
    public open fun setTooltipItem(tooltip: Tooltip, path: TreePath): Unit =
        gtk_icon_view_set_tooltip_item(gtkIconViewPointer, tooltip.gtkTooltipPointer, path.gtkTreePathPointer)

    /**
     * Unselects all the icons.
     */
    public open fun unselectAll(): Unit = gtk_icon_view_unselect_all(gtkIconViewPointer)

    /**
     * Unselects the row at @path.
     *
     * @param path The `GtkTreePath` to be unselected.
     */
    public open fun unselectPath(path: TreePath): Unit =
        gtk_icon_view_unselect_path(gtkIconViewPointer, path.gtkTreePathPointer)

    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
     * method sets `GtkIconView`:reorderable to false.
     */
    public open fun unsetModelDragDest(): Unit = gtk_icon_view_unset_model_drag_dest(gtkIconViewPointer)

    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling this
     * method sets `GtkIconView`:reorderable to false.
     */
    public open fun unsetModelDragSource(): Unit = gtk_icon_view_unset_model_drag_source(gtkIconViewPointer)

    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user activates the currently
     * focused item.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control activation
     * programmatically.
     *
     * The default bindings for this signal are Space, Return and Enter.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivateCursorItem(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gtkIconViewPointer,
            "activate-cursor-item",
            onActivateCursorItemFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The ::item-activated signal is emitted when the method
     * gtk_icon_view_item_activated() is called, when the user double
     * clicks an item with the "activate-on-single-click" property set
     * to false, or when the user single clicks an item when the
     * "activate-on-single-click" property set to true. It is also
     * emitted when a non-editable item is selected and one of the keys:
     * Space, Return or Enter is pressed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` the `GtkTreePath` for the activated item
     */
    public fun onItemActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: TreePath) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkIconViewPointer,
        "item-activated",
        onItemActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "item-activated" signal. See [onItemActivated].
     *
     * @param path the `GtkTreePath` for the activated item
     */
    public fun emitItemActivated(path: TreePath) {
        g_signal_emit_by_name(gtkIconViewPointer.reinterpret(), "item-activated", path.gtkTreePathPointer)
    }

    /**
     * The ::move-cursor signal is a
     * [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user initiates a cursor movement.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     *
     * The default bindings for this signal include
     * - Arrow keys which move by individual steps
     * - Home/End keys which move to the first/last item
     * - PageUp/PageDown which move by "pages"
     * All of these will extend the selection when combined with
     * the Shift modifier.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the move, as a `GtkMovementStep`; `count` the number of @step units to move; `extend` whether to extend the selection; `modify` whether to modify the selection
     */
    public fun onMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            step: MovementStep,
            count: gint,
            extend: Boolean,
            modify: Boolean,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkIconViewPointer,
        "move-cursor",
        onMoveCursorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user selects all items.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     *
     * The default binding for this signal is Ctrl-a.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkIconViewPointer,
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
        g_signal_emit_by_name(gtkIconViewPointer.reinterpret(), "select-all")
    }

    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user selects the item that is currently
     * focused.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     *
     * There is no default binding for this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectCursorItem(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkIconViewPointer,
            "select-cursor-item",
            onSelectCursorItemFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "select-cursor-item" signal. See [onSelectCursorItem].
     */
    public fun emitSelectCursorItem() {
        g_signal_emit_by_name(gtkIconViewPointer.reinterpret(), "select-cursor-item")
    }

    /**
     * The ::selection-changed signal is emitted when the selection
     * (i.e. the set of selected items) changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectionChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkIconViewPointer,
            "selection-changed",
            onSelectionChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "selection-changed" signal. See [onSelectionChanged].
     */
    public fun emitSelectionChanged() {
        g_signal_emit_by_name(gtkIconViewPointer.reinterpret(), "selection-changed")
    }

    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user toggles whether the currently
     * focused item is selected or not. The exact effect of this
     * depend on the selection mode.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     *
     * There is no default binding for this signal is Ctrl-Space.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggleCursorItem(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkIconViewPointer,
            "toggle-cursor-item",
            onToggleCursorItemFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggle-cursor-item" signal. See [onToggleCursorItem].
     */
    public fun emitToggleCursorItem() {
        g_signal_emit_by_name(gtkIconViewPointer.reinterpret(), "toggle-cursor-item")
    }

    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user unselects all items.
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     *
     * The default binding for this signal is Ctrl-Shift-a.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUnselectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkIconViewPointer,
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
        g_signal_emit_by_name(gtkIconViewPointer.reinterpret(), "unselect-all")
    }

    public companion object : TypeCompanion<IconView> {
        override val type: GeneratedClassKGType<IconView> =
            GeneratedClassKGType(getTypeOrNull("gtk_icon_view_get_type")!!) { IconView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of IconView
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_icon_view_get_type()
    }
}

private val onActivateCursorItemFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onItemActivatedFunc: CPointer<CFunction<(CPointer<GtkTreePath>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<GtkTreePath>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(path: TreePath) -> Unit>().get().invoke(
            path!!.run {
                TreePath(this)
            }
        )
    }
        .reinterpret()

private val onMoveCursorFunc: CPointer<
    CFunction<
        (
            GtkMovementStep,
            gint,
            gboolean,
            gboolean,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        step: GtkMovementStep,
        count: gint,
        extend: gboolean,
        modify: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            step: MovementStep,
            count: gint,
            extend: Boolean,
            modify: Boolean,
        ) -> Boolean
        >().get().invoke(
        step.run {
            MovementStep.fromNativeValue(this)
        },
        count,
        extend.asBoolean(),
        modify.asBoolean()
    ).asGBoolean()
}
    .reinterpret()

private val onSelectAllFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSelectCursorItemFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSelectionChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onToggleCursorItemFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
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
