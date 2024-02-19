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
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellArea
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkCellRenderer
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.gtk_cell_area_activate
import org.gtkkn.native.gtk.gtk_cell_area_activate_cell
import org.gtkkn.native.gtk.gtk_cell_area_add
import org.gtkkn.native.gtk.gtk_cell_area_add_focus_sibling
import org.gtkkn.native.gtk.gtk_cell_area_apply_attributes
import org.gtkkn.native.gtk.gtk_cell_area_attribute_connect
import org.gtkkn.native.gtk.gtk_cell_area_attribute_disconnect
import org.gtkkn.native.gtk.gtk_cell_area_attribute_get_column
import org.gtkkn.native.gtk.gtk_cell_area_cell_get_property
import org.gtkkn.native.gtk.gtk_cell_area_cell_set_property
import org.gtkkn.native.gtk.gtk_cell_area_copy_context
import org.gtkkn.native.gtk.gtk_cell_area_create_context
import org.gtkkn.native.gtk.gtk_cell_area_event
import org.gtkkn.native.gtk.gtk_cell_area_focus
import org.gtkkn.native.gtk.gtk_cell_area_foreach
import org.gtkkn.native.gtk.gtk_cell_area_foreach_alloc
import org.gtkkn.native.gtk.gtk_cell_area_get_cell_allocation
import org.gtkkn.native.gtk.gtk_cell_area_get_cell_at_position
import org.gtkkn.native.gtk.gtk_cell_area_get_current_path_string
import org.gtkkn.native.gtk.gtk_cell_area_get_edit_widget
import org.gtkkn.native.gtk.gtk_cell_area_get_edited_cell
import org.gtkkn.native.gtk.gtk_cell_area_get_focus_cell
import org.gtkkn.native.gtk.gtk_cell_area_get_focus_from_sibling
import org.gtkkn.native.gtk.gtk_cell_area_get_focus_siblings
import org.gtkkn.native.gtk.gtk_cell_area_get_request_mode
import org.gtkkn.native.gtk.gtk_cell_area_get_type
import org.gtkkn.native.gtk.gtk_cell_area_has_renderer
import org.gtkkn.native.gtk.gtk_cell_area_inner_cell_area
import org.gtkkn.native.gtk.gtk_cell_area_is_activatable
import org.gtkkn.native.gtk.gtk_cell_area_is_focus_sibling
import org.gtkkn.native.gtk.gtk_cell_area_remove
import org.gtkkn.native.gtk.gtk_cell_area_remove_focus_sibling
import org.gtkkn.native.gtk.gtk_cell_area_set_focus_cell
import org.gtkkn.native.gtk.gtk_cell_area_stop_editing
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * An abstract class for laying out `GtkCellRenderer`s
 *
 * The `GtkCellArea` is an abstract class for [iface@Gtk.CellLayout]
 * widgets (also referred to as "layouting widgets") to interface with
 * an arbitrary number of [class@Gtk.CellRenderer]s and interact with the user
 * for a given [iface@Gtk.TreeModel] row.
 *
 * The cell area handles events, focus navigation, drawing and
 * size requests and allocations for a given row of data.
 *
 * Usually users dont have to interact with the `GtkCellArea` directly
 * unless they are implementing a cell-layouting widget themselves.
 *
 * # Requesting area sizes
 *
 * As outlined in
 * [GtkWidget’s geometry management
 * section](class.Widget.html#height-for-width-geometry-management),
 * GTK uses a height-for-width
 * geometry management system to compute the sizes of widgets and user
 * interfaces. `GtkCellArea` uses the same semantics to calculate the
 * size of an area for an arbitrary number of `GtkTreeModel` rows.
 *
 * When requesting the size of a cell area one needs to calculate
 * the size for a handful of rows, and this will be done differently by
 * different layouting widgets. For instance a [class@Gtk.TreeViewColumn]
 * always lines up the areas from top to bottom while a [class@Gtk.IconView]
 * on the other hand might enforce that all areas received the same
 * width and wrap the areas around, requesting height for more cell
 * areas when allocated less width.
 *
 * It’s also important for areas to maintain some cell
 * alignments with areas rendered for adjacent rows (cells can
 * appear “columnized” inside an area even when the size of
 * cells are different in each row). For this reason the `GtkCellArea`
 * uses a [class@Gtk.CellAreaContext] object to store the alignments
 * and sizes along the way (as well as the overall largest minimum
 * and natural size for all the rows which have been calculated
 * with the said context).
 *
 * The [class@Gtk.CellAreaContext] is an opaque object specific to the
 * `GtkCellArea` which created it (see [method@Gtk.CellArea.create_context]).
 *
 * The owning cell-layouting widget can create as many contexts as
 * it wishes to calculate sizes of rows which should receive the
 * same size in at least one orientation (horizontally or vertically),
 * However, it’s important that the same [class@Gtk.CellAreaContext] which
 * was used to request the sizes for a given `GtkTreeModel` row be
 * used when rendering or processing events for that row.
 *
 * In order to request the width of all the rows at the root level
 * of a `GtkTreeModel` one would do the following:
 *
 * ```c
 * GtkTreeIter iter;
 * int minimum_width;
 * int natural_width;
 *
 * valid = gtk_tree_model_get_iter_first (model, &iter);
 * while (valid)
 *   {
 *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
 *     gtk_cell_area_get_preferred_width (area, context, widget, NULL, NULL);
 *
 *     valid = gtk_tree_model_iter_next (model, &iter);
 *   }
 *
 * gtk_cell_area_context_get_preferred_width (context, &minimum_width, &natural_width);
 * ```
 *
 * Note that in this example it’s not important to observe the
 * returned minimum and natural width of the area for each row
 * unless the cell-layouting object is actually interested in the
 * widths of individual rows. The overall width is however stored
 * in the accompanying `GtkCellAreaContext` object and can be consulted
 * at any time.
 *
 * This can be useful since `GtkCellLayout` widgets usually have to
 * support requesting and rendering rows in treemodels with an
 * exceedingly large amount of rows. The `GtkCellLayout` widget in
 * that case would calculate the required width of the rows in an
 * idle or timeout source (see [func@GLib.timeout_add]) and when the widget
 * is requested its actual width in [vfunc@Gtk.Widget.measure]
 * it can simply consult the width accumulated so far in the
 * `GtkCellAreaContext` object.
 *
 * A simple example where rows are rendered from top to bottom and
 * take up the full width of the layouting widget would look like:
 *
 * ```c
 * static void
 * foo_get_preferred_width (GtkWidget *widget,
 *                          int       *minimum_size,
 *                          int       *natural_size)
 * {
 *   Foo *self = FOO (widget);
 *   FooPrivate *priv = foo_get_instance_private (self);
 *
 *   foo_ensure_at_least_one_handfull_of_rows_have_been_requested (self);
 *
 *   gtk_cell_area_context_get_preferred_width (priv->context, minimum_size, natural_size);
 * }
 * ```
 *
 * In the above example the `Foo` widget has to make sure that some
 * row sizes have been calculated (the amount of rows that `Foo` judged
 * was appropriate to request space for in a single timeout iteration)
 * before simply returning the amount of space required by the area via
 * the `GtkCellAreaContext`.
 *
 * Requesting the height for width (or width for height) of an area is
 * a similar task except in this case the `GtkCellAreaContext` does not
 * store the data (actually, it does not know how much space the layouting
 * widget plans to allocate it for every row. It’s up to the layouting
 * widget to render each row of data with the appropriate height and
 * width which was requested by the `GtkCellArea`).
 *
 * In order to request the height for width of all the rows at the
 * root level of a `GtkTreeModel` one would do the following:
 *
 * ```c
 * GtkTreeIter iter;
 * int minimum_height;
 * int natural_height;
 * int full_minimum_height = 0;
 * int full_natural_height = 0;
 *
 * valid = gtk_tree_model_get_iter_first (model, &iter);
 * while (valid)
 *   {
 *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
 *     gtk_cell_area_get_preferred_height_for_width (area, context, widget,
 *                                                   width, &minimum_height, &natural_height);
 *
 *     if (width_is_for_allocation)
 *        cache_row_height (&iter, minimum_height, natural_height);
 *
 *     full_minimum_height += minimum_height;
 *     full_natural_height += natural_height;
 *
 *     valid = gtk_tree_model_iter_next (model, &iter);
 *   }
 * ```
 *
 * Note that in the above example we would need to cache the heights
 * returned for each row so that we would know what sizes to render the
 * areas for each row. However we would only want to really cache the
 * heights if the request is intended for the layouting widgets real
 * allocation.
 *
 * In some cases the layouting widget is requested the height for an
 * arbitrary for_width, this is a special case for layouting widgets
 * who need to request size for tens of thousands  of rows. For this
 * case it’s only important that the layouting widget calculate
 * one reasonably sized chunk of rows and return that height
 * synchronously. The reasoning here is that any layouting widget is
 * at least capable of synchronously calculating enough height to fill
 * the screen height (or scrolled window height) in response to a single
 * call to [vfunc@Gtk.Widget.measure]. Returning
 * a perfect height for width that is larger than the screen area is
 * inconsequential since after the layouting receives an allocation
 * from a scrolled window it simply continues to drive the scrollbar
 * values while more and more height is required for the row heights
 * that are calculated in the background.
 *
 * # Rendering Areas
 *
 * Once area sizes have been acquired at least for the rows in the
 * visible area of the layouting widget they can be rendered at
 * [vfunc@Gtk.Widget.snapshot] time.
 *
 * A crude example of how to render all the rows at the root level
 * runs as follows:
 *
 * ```c
 * GtkAllocation allocation;
 * GdkRectangle cell_area = { 0, };
 * GtkTreeIter iter;
 * int minimum_width;
 * int natural_width;
 *
 * gtk_widget_get_allocation (widget, &allocation);
 * cell_area.width = allocation.width;
 *
 * valid = gtk_tree_model_get_iter_first (model, &iter);
 * while (valid)
 *   {
 *     cell_area.height = get_cached_height_for_row (&iter);
 *
 *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
 *     gtk_cell_area_render (area, context, widget, cr,
 *                           &cell_area, &cell_area, state_flags, FALSE);
 *
 *     cell_area.y += cell_area.height;
 *
 *     valid = gtk_tree_model_iter_next (model, &iter);
 *   }
 * ```
 *
 * Note that the cached height in this example really depends on how
 * the layouting widget works. The layouting widget might decide to
 * give every row its minimum or natural height or, if the model content
 * is expected to fit inside the layouting widget without scrolling, it
 * would make sense to calculate the allocation for each row at
 * the time the widget is allocated using [func@Gtk.distribute_natural_allocation].
 *
 * # Handling Events and Driving Keyboard Focus
 *
 * Passing events to the area is as simple as handling events on any
 * normal widget and then passing them to the [method@Gtk.CellArea.event]
 * API as they come in. Usually `GtkCellArea` is only interested in
 * button events, however some customized derived areas can be implemented
 * who are interested in handling other events. Handling an event can
 * trigger the [`signal@Gtk.CellArea::focus-changed`] signal to fire; as well
 * as [`signal@GtkCellArea::add-editable`] in the case that an editable cell
 * was clicked and needs to start editing. You can call
 * [method@Gtk.CellArea.stop_editing] at any time to cancel any cell editing
 * that is currently in progress.
 *
 * The `GtkCellArea` drives keyboard focus from cell to cell in a way
 * similar to `GtkWidget`. For layouting widgets that support giving
 * focus to cells it’s important to remember to pass `GTK_CELL_RENDERER_FOCUSED`
 * to the area functions for the row that has focus and to tell the
 * area to paint the focus at render time.
 *
 * Layouting widgets that accept focus on cells should implement the
 * [vfunc@Gtk.Widget.focus] virtual method. The layouting widget is always
 * responsible for knowing where `GtkTreeModel` rows are rendered inside
 * the widget, so at [vfunc@Gtk.Widget.focus] time the layouting widget
 * should use the `GtkCellArea` methods to navigate focus inside the area
 * and then observe the [enum@Gtk.DirectionType] to pass the focus to adjacent
 * rows and areas.
 *
 * A basic example of how the [vfunc@Gtk.Widget.focus] virtual method
 * should be implemented:
 *
 * ```
 * static gboolean
 * foo_focus (GtkWidget       *widget,
 *            GtkDirectionType direction)
 * {
 *   Foo *self = FOO (widget);
 *   FooPrivate *priv = foo_get_instance_private (self);
 *   int focus_row = priv->focus_row;
 *   gboolean have_focus = FALSE;
 *
 *   if (!gtk_widget_has_focus (widget))
 *     gtk_widget_grab_focus (widget);
 *
 *   valid = gtk_tree_model_iter_nth_child (priv->model, &iter, NULL, priv->focus_row);
 *   while (valid)
 *     {
 *       gtk_cell_area_apply_attributes (priv->area, priv->model, &iter, FALSE, FALSE);
 *
 *       if (gtk_cell_area_focus (priv->area, direction))
 *         {
 *            priv->focus_row = focus_row;
 *            have_focus = TRUE;
 *            break;
 *         }
 *       else
 *         {
 *           if (direction == GTK_DIR_RIGHT ||
 *               direction == GTK_DIR_LEFT)
 *             break;
 *           else if (direction == GTK_DIR_UP ||
 *                    direction == GTK_DIR_TAB_BACKWARD)
 *            {
 *               if (focus_row == 0)
 *                 break;
 *               else
 *                {
 *                   focus_row--;
 *                   valid = gtk_tree_model_iter_nth_child (priv->model, &iter, NULL, focus_row);
 *                }
 *             }
 *           else
 *             {
 *               if (focus_row == last_row)
 *                 break;
 *               else
 *                 {
 *                   focus_row++;
 *                   valid = gtk_tree_model_iter_next (priv->model, &iter);
 *                 }
 *             }
 *         }
 *     }
 *     return have_focus;
 * }
 * ```
 *
 * Note that the layouting widget is responsible for matching the
 * `GtkDirectionType` values to the way it lays out its cells.
 *
 * # Cell Properties
 *
 * The `GtkCellArea` introduces cell properties for `GtkCellRenderer`s.
 * This provides some general interfaces for defining the relationship
 * cell areas have with their cells. For instance in a [class@Gtk.CellAreaBox]
 * a cell might “expand” and receive extra space when the area is allocated
 * more than its full natural request, or a cell might be configured to “align”
 * with adjacent rows which were requested and rendered with the same
 * `GtkCellAreaContext`.
 *
 * Use [method@Gtk.CellAreaClass.install_cell_property] to install cell
 * properties for a cell area class and [method@Gtk.CellAreaClass.find_cell_property]
 * or [method@Gtk.CellAreaClass.list_cell_properties] to get information about
 * existing cell properties.
 *
 * To set the value of a cell property, use [method@Gtk.CellArea.cell_set_property],
 * [method@Gtk.CellArea.cell_set] or [method@Gtk.CellArea.cell_set_valist]. To obtain
 * the value of a cell property, use [method@Gtk.CellArea.cell_get_property]
 * [method@Gtk.CellArea.cell_get] or [method@Gtk.CellArea.cell_get_valist].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `minimum_height`: minimum_height: Out parameter is not supported
 * - parameter `minimum_height`: minimum_height: Out parameter is not supported
 * - parameter `minimum_width`: minimum_width: Out parameter is not supported
 * - parameter `minimum_width`: minimum_width: Out parameter is not supported
 * - parameter `minimum_size`: minimum_size: Out parameter is not supported
 * - parameter `snapshot`: Snapshot
 */
public open class CellArea(
    pointer: CPointer<GtkCellArea>,
) : InitiallyUnowned(pointer.reinterpret()), Buildable, CellLayout, KGTyped {
    public val gtkCellAreaPointer: CPointer<GtkCellArea>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = gPointer.reinterpret()

    /**
     * The widget currently editing the edited cell
     *
     * This property is read-only and only changes as
     * a result of a call gtk_cell_area_activate_cell().
     */
    public open val editWidget: CellEditable?
        /**
         * Gets the `GtkCellEditable` widget currently used
         * to edit the currently edited cell.
         *
         * @return The currently active `GtkCellEditable` widget
         */
        get() =
            gtk_cell_area_get_edit_widget(gtkCellAreaPointer.reinterpret())?.run {
                CellEditable.wrap(reinterpret())
            }

    /**
     * The cell in the area that is currently edited
     *
     * This property is read-only and only changes as
     * a result of a call gtk_cell_area_activate_cell().
     */
    public open val editedCell: CellRenderer?
        /**
         * Gets the `GtkCellRenderer` in @area that is currently
         * being edited.
         *
         * @return The currently edited `GtkCellRenderer`
         */
        get() =
            gtk_cell_area_get_edited_cell(gtkCellAreaPointer.reinterpret())?.run {
                CellRenderer(reinterpret())
            }

    /**
     * The cell in the area that currently has focus
     */
    public open var focusCell: CellRenderer?
        /**
         * Retrieves the currently focused cell for @area
         *
         * @return the currently focused cell in @area.
         */
        get() =
            gtk_cell_area_get_focus_cell(gtkCellAreaPointer.reinterpret())?.run {
                CellRenderer(reinterpret())
            }

        /**
         * Explicitly sets the currently focused cell to @renderer.
         *
         * This is generally called by implementations of
         * `GtkCellAreaClass.focus()` or `GtkCellAreaClass.event()`,
         * however it can also be used to implement functions such
         * as gtk_tree_view_set_cursor_on_cell().
         *
         * @param renderer the `GtkCellRenderer` to give focus to
         */
        set(renderer) =
            gtk_cell_area_set_focus_cell(
                gtkCellAreaPointer.reinterpret(),
                renderer?.gtkCellRendererPointer?.reinterpret()
            )

    /**
     * Activates @area, usually by activating the currently focused
     * cell, however some subclasses which embed widgets in the area
     * can also activate a widget if it currently has the focus.
     *
     * @param context the `GtkCellArea`Context in context with the current row data
     * @param widget the `GtkWidget` that @area is rendering on
     * @param cellArea the size and location of @area relative to @widget’s allocation
     * @param flags the `GtkCellRenderer`State flags for @area for this row of data.
     * @param editOnly if true then only cell renderers that are %GTK_CELL_RENDERER_MODE_EDITABLE
     *             will be activated.
     * @return Whether @area was successfully activated.
     */
    public open fun activate(
        context: CellAreaContext,
        widget: Widget,
        cellArea: Rectangle,
        flags: CellRendererState,
        editOnly: Boolean,
    ): Boolean =
        gtk_cell_area_activate(
            gtkCellAreaPointer.reinterpret(),
            context.gtkCellAreaContextPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            flags.mask,
            editOnly.asGBoolean()
        ).asBoolean()

    /**
     * This is used by `GtkCellArea` subclasses when handling events
     * to activate cells, the base `GtkCellArea` class activates cells
     * for keyboard events for free in its own GtkCellArea->activate()
     * implementation.
     *
     * @param widget the `GtkWidget` that @area is rendering onto
     * @param renderer the `GtkCellRenderer` in @area to activate
     * @param event the `GdkEvent` for which cell activation should occur
     * @param cellArea the `GdkRectangle` in @widget relative coordinates
     *             of @renderer for the current row.
     * @param flags the `GtkCellRenderer`State for @renderer
     * @return whether cell activation was successful
     */
    public open fun activateCell(
        widget: Widget,
        renderer: CellRenderer,
        event: Event,
        cellArea: Rectangle,
        flags: CellRendererState,
    ): Boolean =
        gtk_cell_area_activate_cell(
            gtkCellAreaPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            event.gPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            flags.mask
        ).asBoolean()

    /**
     * Adds @renderer to @area with the default child cell properties.
     *
     * @param renderer the `GtkCellRenderer` to add to @area
     */
    public open fun add(renderer: CellRenderer): Unit =
        gtk_cell_area_add(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret()
        )

    /**
     * Adds @sibling to @renderer’s focusable area, focus will be drawn
     * around @renderer and all of its siblings if @renderer can
     * focus for a given row.
     *
     * Events handled by focus siblings can also activate the given
     * focusable @renderer.
     *
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @param sibling the `GtkCellRenderer` to add to @renderer’s focus area
     */
    public open fun addFocusSibling(
        renderer: CellRenderer,
        sibling: CellRenderer,
    ): Unit =
        gtk_cell_area_add_focus_sibling(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            sibling.gtkCellRendererPointer.reinterpret()
        )

    /**
     * Applies any connected attributes to the renderers in
     * @area by pulling the values from @tree_model.
     *
     * @param treeModel the `GtkTreeModel` to pull values from
     * @param iter the `GtkTreeIter` in @tree_model to apply values for
     * @param isExpander whether @iter has children
     * @param isExpanded whether @iter is expanded in the view and
     *               children are visible
     */
    public open fun applyAttributes(
        treeModel: TreeModel,
        iter: TreeIter,
        isExpander: Boolean,
        isExpanded: Boolean,
    ): Unit =
        gtk_cell_area_apply_attributes(
            gtkCellAreaPointer.reinterpret(),
            treeModel.gtkTreeModelPointer,
            iter.gtkTreeIterPointer,
            isExpander.asGBoolean(),
            isExpanded.asGBoolean()
        )

    /**
     * Connects an @attribute to apply values from @column for the
     * `GtkTreeModel` in use.
     *
     * @param renderer the `GtkCellRenderer` to connect an attribute for
     * @param attribute the attribute name
     * @param column the `GtkTreeModel` column to fetch attribute values from
     */
    public open fun attributeConnect(
        renderer: CellRenderer,
        attribute: String,
        column: Int,
    ): Unit =
        gtk_cell_area_attribute_connect(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            attribute,
            column
        )

    /**
     * Disconnects @attribute for the @renderer in @area so that
     * attribute will no longer be updated with values from the
     * model.
     *
     * @param renderer the `GtkCellRenderer` to disconnect an attribute for
     * @param attribute the attribute name
     */
    public open fun attributeDisconnect(
        renderer: CellRenderer,
        attribute: String,
    ): Unit =
        gtk_cell_area_attribute_disconnect(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            attribute
        )

    /**
     * Returns the model column that an attribute has been mapped to,
     * or -1 if the attribute is not mapped.
     *
     * @param renderer a `GtkCellRenderer`
     * @param attribute an attribute on the renderer
     * @return the model column, or -1
     */
    public open fun attributeGetColumn(
        renderer: CellRenderer,
        attribute: String,
    ): Int =
        gtk_cell_area_attribute_get_column(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            attribute
        )

    /**
     * Gets the value of a cell property for @renderer in @area.
     *
     * @param renderer a `GtkCellRenderer` inside @area
     * @param propertyName the name of the property to get
     * @param value a location to return the value
     */
    public open fun cellGetProperty(
        renderer: CellRenderer,
        propertyName: String,
        `value`: Value,
    ): Unit =
        gtk_cell_area_cell_get_property(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            propertyName,
            `value`.gobjectValuePointer
        )

    /**
     * Sets a cell property for @renderer in @area.
     *
     * @param renderer a `GtkCellRenderer` inside @area
     * @param propertyName the name of the cell property to set
     * @param value the value to set the cell property to
     */
    public open fun cellSetProperty(
        renderer: CellRenderer,
        propertyName: String,
        `value`: Value,
    ): Unit =
        gtk_cell_area_cell_set_property(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            propertyName,
            `value`.gobjectValuePointer
        )

    /**
     * This is sometimes needed for cases where rows need to share
     * alignments in one orientation but may be separately grouped
     * in the opposing orientation.
     *
     * For instance, `GtkIconView` creates all icons (rows) to have
     * the same width and the cells theirin to have the same
     * horizontal alignments. However each row of icons may have
     * a separate collective height. `GtkIconView` uses this to
     * request the heights of each row based on a context which
     * was already used to request all the row widths that are
     * to be displayed.
     *
     * @param context the `GtkCellArea`Context to copy
     * @return a newly created `GtkCellArea`Context copy of @context.
     */
    public open fun copyContext(context: CellAreaContext): CellAreaContext =
        gtk_cell_area_copy_context(
            gtkCellAreaPointer.reinterpret(),
            context.gtkCellAreaContextPointer.reinterpret()
        )!!.run {
            CellAreaContext(reinterpret())
        }

    /**
     * Creates a `GtkCellArea`Context to be used with @area for
     * all purposes. `GtkCellArea`Context stores geometry information
     * for rows for which it was operated on, it is important to use
     * the same context for the same row of data at all times (i.e.
     * one should render and handle events with the same `GtkCellArea`Context
     * which was used to request the size of those rows of data).
     *
     * @return a newly created `GtkCellArea`Context which can be used with @area.
     */
    public open fun createContext(): CellAreaContext =
        gtk_cell_area_create_context(gtkCellAreaPointer.reinterpret())!!.run {
            CellAreaContext(reinterpret())
        }

    /**
     * Delegates event handling to a `GtkCellArea`.
     *
     * @param context the `GtkCellArea`Context for this row of data.
     * @param widget the `GtkWidget` that @area is rendering to
     * @param event the `GdkEvent` to handle
     * @param cellArea the @widget relative coordinates for @area
     * @param flags the `GtkCellRenderer`State for @area in this row.
     * @return true if the event was handled by @area.
     */
    public open fun event(
        context: CellAreaContext,
        widget: Widget,
        event: Event,
        cellArea: Rectangle,
        flags: CellRendererState,
    ): Int =
        gtk_cell_area_event(
            gtkCellAreaPointer.reinterpret(),
            context.gtkCellAreaContextPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            event.gPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            flags.mask
        )

    /**
     * This should be called by the @area’s owning layout widget
     * when focus is to be passed to @area, or moved within @area
     * for a given @direction and row data.
     *
     * Implementing `GtkCellArea` classes should implement this
     * method to receive and navigate focus in its own way particular
     * to how it lays out cells.
     *
     * @param direction the `GtkDirectionType`
     * @return true if focus remains inside @area as a result of this call.
     */
    public open fun focus(direction: DirectionType): Boolean =
        gtk_cell_area_focus(gtkCellAreaPointer.reinterpret(), direction.nativeValue).asBoolean()

    /**
     * Calls @callback for every `GtkCellRenderer` in @area.
     *
     * @param callback the `GtkCellCallback` to call
     */
    public open fun foreach(callback: CellCallback): Unit =
        gtk_cell_area_foreach(
            gtkCellAreaPointer.reinterpret(),
            CellCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Calls @callback for every `GtkCellRenderer` in @area with the
     * allocated rectangle inside @cell_area.
     *
     * @param context the `GtkCellArea`Context for this row of data.
     * @param widget the `GtkWidget` that @area is rendering to
     * @param cellArea the @widget relative coordinates and size for @area
     * @param backgroundArea the @widget relative coordinates of the background area
     * @param callback the `GtkCellAllocCallback` to call
     */
    public open fun foreachAlloc(
        context: CellAreaContext,
        widget: Widget,
        cellArea: Rectangle,
        backgroundArea: Rectangle,
        callback: CellAllocCallback,
    ): Unit =
        gtk_cell_area_foreach_alloc(
            gtkCellAreaPointer.reinterpret(),
            context.gtkCellAreaContextPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            backgroundArea.gdkRectanglePointer,
            CellAllocCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Derives the allocation of @renderer inside @area if @area
     * were to be renderered in @cell_area.
     *
     * @param context the `GtkCellArea`Context used to hold sizes for @area.
     * @param widget the `GtkWidget` that @area is rendering on
     * @param renderer the `GtkCellRenderer` to get the allocation for
     * @param cellArea the whole allocated area for @area in @widget
     *             for this row
     * @param allocation where to store the allocation for @renderer
     */
    public open fun getCellAllocation(
        context: CellAreaContext,
        widget: Widget,
        renderer: CellRenderer,
        cellArea: Rectangle,
        allocation: Rectangle,
    ): Unit =
        gtk_cell_area_get_cell_allocation(
            gtkCellAreaPointer.reinterpret(),
            context.gtkCellAreaContextPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            allocation.gdkRectanglePointer
        )

    /**
     * Gets the `GtkCellRenderer` at @x and @y coordinates inside @area and optionally
     * returns the full cell allocation for it inside @cell_area.
     *
     * @param context the `GtkCellArea`Context used to hold sizes for @area.
     * @param widget the `GtkWidget` that @area is rendering on
     * @param cellArea the whole allocated area for @area in @widget
     *   for this row
     * @param x the x position
     * @param y the y position
     * @param allocArea where to store the inner allocated area of the
     *   returned cell renderer
     * @return the `GtkCellRenderer` at @x and @y.
     */
    public open fun getCellAtPosition(
        context: CellAreaContext,
        widget: Widget,
        cellArea: Rectangle,
        x: Int,
        y: Int,
        allocArea: Rectangle?,
    ): CellRenderer =
        gtk_cell_area_get_cell_at_position(
            gtkCellAreaPointer.reinterpret(),
            context.gtkCellAreaContextPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            x,
            y,
            allocArea?.gdkRectanglePointer
        )!!.run {
            CellRenderer(reinterpret())
        }

    /**
     * Gets the current `GtkTreePath` string for the currently
     * applied `GtkTreeIter`, this is implicitly updated when
     * gtk_cell_area_apply_attributes() is called and can be
     * used to interact with renderers from `GtkCellArea`
     * subclasses.
     *
     * @return The current `GtkTreePath` string for the current
     * attributes applied to @area. This string belongs to the area and
     * should not be freed.
     */
    public open fun getCurrentPathString(): String =
        gtk_cell_area_get_current_path_string(gtkCellAreaPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the `GtkCellEditable` widget currently used
     * to edit the currently edited cell.
     *
     * @return The currently active `GtkCellEditable` widget
     */
    public open fun getEditWidget(): CellEditable? =
        gtk_cell_area_get_edit_widget(gtkCellAreaPointer.reinterpret())?.run {
            CellEditable.wrap(reinterpret())
        }

    /**
     * Gets the `GtkCellRenderer` in @area that is currently
     * being edited.
     *
     * @return The currently edited `GtkCellRenderer`
     */
    public open fun getEditedCell(): CellRenderer? =
        gtk_cell_area_get_edited_cell(gtkCellAreaPointer.reinterpret())?.run {
            CellRenderer(reinterpret())
        }

    /**
     * Retrieves the currently focused cell for @area
     *
     * @return the currently focused cell in @area.
     */
    public open fun getFocusCell(): CellRenderer? =
        gtk_cell_area_get_focus_cell(gtkCellAreaPointer.reinterpret())?.run {
            CellRenderer(reinterpret())
        }

    /**
     * Gets the `GtkCellRenderer` which is expected to be focusable
     * for which @renderer is, or may be a sibling.
     *
     * This is handy for `GtkCellArea` subclasses when handling events,
     * after determining the renderer at the event location it can
     * then chose to activate the focus cell for which the event
     * cell may have been a sibling.
     *
     * @param renderer the `GtkCellRenderer`
     * @return the `GtkCellRenderer`
     *   for which @renderer is a sibling
     */
    public open fun getFocusFromSibling(renderer: CellRenderer): CellRenderer? =
        gtk_cell_area_get_focus_from_sibling(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret()
        )?.run {
            CellRenderer(reinterpret())
        }

    /**
     * Gets the focus sibling cell renderers for @renderer.
     *
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @return A `GList` of `GtkCellRenderer`s.
     *       The returned list is internal and should not be freed.
     */
    public open fun getFocusSiblings(renderer: CellRenderer): List =
        gtk_cell_area_get_focus_siblings(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret()
        )!!.run {
            List(reinterpret())
        }

    /**
     * Gets whether the area prefers a height-for-width layout
     * or a width-for-height layout.
     *
     * @return The `GtkSizeRequestMode` preferred by @area.
     */
    public open fun getRequestMode(): SizeRequestMode =
        gtk_cell_area_get_request_mode(gtkCellAreaPointer.reinterpret()).run {
            SizeRequestMode.fromNativeValue(this)
        }

    /**
     * Checks if @area contains @renderer.
     *
     * @param renderer the `GtkCellRenderer` to check
     * @return true if @renderer is in the @area.
     */
    public open fun hasRenderer(renderer: CellRenderer): Boolean =
        gtk_cell_area_has_renderer(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret()
        ).asBoolean()

    /**
     * This is a convenience function for `GtkCellArea` implementations
     * to get the inner area where a given `GtkCellRenderer` will be
     * rendered. It removes any padding previously added by gtk_cell_area_request_renderer().
     *
     * @param widget the `GtkWidget` that @area is rendering onto
     * @param cellArea the @widget relative coordinates where one of @area’s cells
     *             is to be placed
     * @param innerArea the return location for the inner cell area
     */
    public open fun innerCellArea(
        widget: Widget,
        cellArea: Rectangle,
        innerArea: Rectangle,
    ): Unit =
        gtk_cell_area_inner_cell_area(
            gtkCellAreaPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            cellArea.gdkRectanglePointer,
            innerArea.gdkRectanglePointer
        )

    /**
     * Returns whether the area can do anything when activated,
     * after applying new attributes to @area.
     *
     * @return whether @area can do anything when activated.
     */
    public open fun isActivatable(): Boolean =
        gtk_cell_area_is_activatable(gtkCellAreaPointer.reinterpret()).asBoolean()

    /**
     * Returns whether @sibling is one of @renderer’s focus siblings
     * (see gtk_cell_area_add_focus_sibling()).
     *
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @param sibling the `GtkCellRenderer` to check against @renderer’s sibling list
     * @return true if @sibling is a focus sibling of @renderer
     */
    public open fun isFocusSibling(
        renderer: CellRenderer,
        sibling: CellRenderer,
    ): Boolean =
        gtk_cell_area_is_focus_sibling(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            sibling.gtkCellRendererPointer.reinterpret()
        ).asBoolean()

    /**
     * Removes @renderer from @area.
     *
     * @param renderer the `GtkCellRenderer` to remove from @area
     */
    public open fun remove(renderer: CellRenderer): Unit =
        gtk_cell_area_remove(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret()
        )

    /**
     * Removes @sibling from @renderer’s focus sibling list
     * (see gtk_cell_area_add_focus_sibling()).
     *
     * @param renderer the `GtkCellRenderer` expected to have focus
     * @param sibling the `GtkCellRenderer` to remove from @renderer’s focus area
     */
    public open fun removeFocusSibling(
        renderer: CellRenderer,
        sibling: CellRenderer,
    ): Unit =
        gtk_cell_area_remove_focus_sibling(
            gtkCellAreaPointer.reinterpret(),
            renderer.gtkCellRendererPointer.reinterpret(),
            sibling.gtkCellRendererPointer.reinterpret()
        )

    /**
     * Explicitly sets the currently focused cell to @renderer.
     *
     * This is generally called by implementations of
     * `GtkCellAreaClass.focus()` or `GtkCellAreaClass.event()`,
     * however it can also be used to implement functions such
     * as gtk_tree_view_set_cursor_on_cell().
     *
     * @param renderer the `GtkCellRenderer` to give focus to
     */
    public open fun setFocusCell(renderer: CellRenderer? = null): Unit =
        gtk_cell_area_set_focus_cell(
            gtkCellAreaPointer.reinterpret(),
            renderer?.gtkCellRendererPointer?.reinterpret()
        )

    /**
     * Explicitly stops the editing of the currently edited cell.
     *
     * If @canceled is true, the currently edited cell renderer
     * will emit the ::editing-canceled signal, otherwise the
     * the ::editing-done signal will be emitted on the current
     * edit widget.
     *
     * See gtk_cell_area_get_edited_cell() and gtk_cell_area_get_edit_widget().
     *
     * @param canceled whether editing was canceled.
     */
    public open fun stopEditing(canceled: Boolean): Unit =
        gtk_cell_area_stop_editing(gtkCellAreaPointer.reinterpret(), canceled.asGBoolean())

    /**
     * Indicates that editing has started on @renderer and that @editable
     * should be added to the owning cell-layouting widget at @cell_area.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `renderer` the `GtkCellRenderer` that started
     * the edited; `editable` the `GtkCellEditable` widget to add; `cellArea` the `GtkWidget` relative
     * `GdkRectangle` coordinates
     *             where @editable should be added; `path` the `GtkTreePath` string this edit was
     * initiated for
     */
    public fun connectAddEditable(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            renderer: CellRenderer,
            editable: CellEditable,
            cellArea: Rectangle,
            path: String,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "add-editable",
            connectAddEditableFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted whenever applying attributes to @area from @model
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `model` the `GtkTreeModel` to apply the
     * attributes from; `iter` the `GtkTreeIter` indicating which row to apply the attributes of;
     * `isExpander` whether the view shows children for this row; `isExpanded` whether the view is
     * currently showing the children of this row
     */
    public fun connectApplyAttributes(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            model: TreeModel,
            iter: TreeIter,
            isExpander: Boolean,
            isExpanded: Boolean,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "apply-attributes",
            connectApplyAttributesFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Indicates that focus changed on this @area. This signal
     * is emitted either as a result of focus handling or event
     * handling.
     *
     * It's possible that the signal is emitted even if the
     * currently focused renderer did not change, this is
     * because focus may change to the same renderer in the
     * same cell area for a different row of data.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `renderer` the `GtkCellRenderer` that has
     * focus; `path` the current `GtkTreePath` string set for @area
     */
    public fun connectFocusChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (renderer: CellRenderer, path: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "focus-changed",
            connectFocusChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Indicates that editing finished on @renderer and that @editable
     * should be removed from the owning cell-layouting widget.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `renderer` the `GtkCellRenderer` that
     * finished editeding; `editable` the `GtkCellEditable` widget to remove
     */
    public fun connectRemoveEditable(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (renderer: CellRenderer, editable: CellEditable) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "remove-editable",
            connectRemoveEditableFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<CellArea> {
        override val type: GeneratedClassKGType<CellArea> =
            GeneratedClassKGType(gtk_cell_area_get_type()) { CellArea(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectAddEditableFunc: CPointer<
    CFunction<
        (
            CPointer<GtkCellRenderer>,
            CPointer<GtkCellEditable>,
            CPointer<GdkRectangle>,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            renderer: CPointer<GtkCellRenderer>?,
            editable: CPointer<GtkCellEditable>?,
            cellArea: CPointer<GdkRectangle>?,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                renderer: CellRenderer,
                editable: CellEditable,
                cellArea: Rectangle,
                path: String,
            ) -> Unit
        >().get().invoke(
            renderer!!.run {
                CellRenderer(reinterpret())
            },
            editable!!.run {
                CellEditable.wrap(reinterpret())
            },
            cellArea!!.run {
                Rectangle(reinterpret())
            },
            path?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectApplyAttributesFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeModel>,
            CPointer<GtkTreeIter>,
            Int,
            Int,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            model: CPointer<GtkTreeModel>?,
            iter: CPointer<GtkTreeIter>?,
            isExpander: Int,
            isExpanded: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                model: TreeModel,
                iter: TreeIter,
                isExpander: Boolean,
                isExpanded: Boolean,
            ) -> Unit
        >().get().invoke(
            model!!.run {
                TreeModel.wrap(reinterpret())
            },
            iter!!.run {
                TreeIter(reinterpret())
            },
            isExpander.asBoolean(),
            isExpanded.asBoolean()
        )
    }
        .reinterpret()

private val connectFocusChangedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkCellRenderer>,
            CPointer<ByteVar>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            renderer: CPointer<GtkCellRenderer>?,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                renderer: CellRenderer,
                path: String,
            ) -> Unit
        >().get().invoke(
            renderer!!.run {
                CellRenderer(reinterpret())
            },
            path?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

private val connectRemoveEditableFunc: CPointer<
    CFunction<
        (
            CPointer<GtkCellRenderer>,
            CPointer<GtkCellEditable>,
        ) -> Unit
    >
> =
    staticCFunction {
            _: COpaquePointer,
            renderer: CPointer<GtkCellRenderer>?,
            editable: CPointer<GtkCellEditable>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                renderer: CellRenderer,
                editable: CellEditable,
            ) -> Unit
        >().get().invoke(
            renderer!!.run {
                CellRenderer(reinterpret())
            },
            editable!!.run {
                CellEditable.wrap(reinterpret())
            }
        )
    }
        .reinterpret()
