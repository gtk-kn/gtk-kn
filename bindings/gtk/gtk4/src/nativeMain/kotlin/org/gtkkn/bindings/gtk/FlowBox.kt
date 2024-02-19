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
import org.gtkkn.native.gtk.GtkFlowBox
import org.gtkkn.native.gtk.GtkFlowBoxChild
import org.gtkkn.native.gtk.GtkMovementStep
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_flow_box_append
import org.gtkkn.native.gtk.gtk_flow_box_bind_model
import org.gtkkn.native.gtk.gtk_flow_box_get_activate_on_single_click
import org.gtkkn.native.gtk.gtk_flow_box_get_child_at_index
import org.gtkkn.native.gtk.gtk_flow_box_get_child_at_pos
import org.gtkkn.native.gtk.gtk_flow_box_get_column_spacing
import org.gtkkn.native.gtk.gtk_flow_box_get_homogeneous
import org.gtkkn.native.gtk.gtk_flow_box_get_max_children_per_line
import org.gtkkn.native.gtk.gtk_flow_box_get_min_children_per_line
import org.gtkkn.native.gtk.gtk_flow_box_get_row_spacing
import org.gtkkn.native.gtk.gtk_flow_box_get_selected_children
import org.gtkkn.native.gtk.gtk_flow_box_get_selection_mode
import org.gtkkn.native.gtk.gtk_flow_box_get_type
import org.gtkkn.native.gtk.gtk_flow_box_insert
import org.gtkkn.native.gtk.gtk_flow_box_invalidate_filter
import org.gtkkn.native.gtk.gtk_flow_box_invalidate_sort
import org.gtkkn.native.gtk.gtk_flow_box_new
import org.gtkkn.native.gtk.gtk_flow_box_prepend
import org.gtkkn.native.gtk.gtk_flow_box_remove
import org.gtkkn.native.gtk.gtk_flow_box_select_all
import org.gtkkn.native.gtk.gtk_flow_box_select_child
import org.gtkkn.native.gtk.gtk_flow_box_selected_foreach
import org.gtkkn.native.gtk.gtk_flow_box_set_activate_on_single_click
import org.gtkkn.native.gtk.gtk_flow_box_set_column_spacing
import org.gtkkn.native.gtk.gtk_flow_box_set_filter_func
import org.gtkkn.native.gtk.gtk_flow_box_set_hadjustment
import org.gtkkn.native.gtk.gtk_flow_box_set_homogeneous
import org.gtkkn.native.gtk.gtk_flow_box_set_max_children_per_line
import org.gtkkn.native.gtk.gtk_flow_box_set_min_children_per_line
import org.gtkkn.native.gtk.gtk_flow_box_set_row_spacing
import org.gtkkn.native.gtk.gtk_flow_box_set_selection_mode
import org.gtkkn.native.gtk.gtk_flow_box_set_sort_func
import org.gtkkn.native.gtk.gtk_flow_box_set_vadjustment
import org.gtkkn.native.gtk.gtk_flow_box_unselect_all
import org.gtkkn.native.gtk.gtk_flow_box_unselect_child
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkFlowBox` puts child widgets in reflowing grid.
 *
 * For instance, with the horizontal orientation, the widgets will be
 * arranged from left to right, starting a new row under the previous
 * row when necessary. Reducing the width in this case will require more
 * rows, so a larger height will be requested.
 *
 * Likewise, with the vertical orientation, the widgets will be arranged
 * from top to bottom, starting a new column to the right when necessary.
 * Reducing the height will require more columns, so a larger width will
 * be requested.
 *
 * The size request of a `GtkFlowBox` alone may not be what you expect;
 * if you need to be able to shrink it along both axes and dynamically
 * reflow its children, you may have to wrap it in a `GtkScrolledWindow`
 * to enable that.
 *
 * The children of a `GtkFlowBox` can be dynamically sorted and filtered.
 *
 * Although a `GtkFlowBox` must have only `GtkFlowBoxChild` children, you
 * can add any kind of widget to it via [method@Gtk.FlowBox.insert], and a
 * `GtkFlowBoxChild` widget will automatically be inserted between the box
 * and the widget.
 *
 * Also see [class@Gtk.ListBox].
 *
 * # CSS nodes
 *
 * ```
 * flowbox
 * ├── flowboxchild
 * │   ╰── <child>
 * ├── flowboxchild
 * │   ╰── <child>
 * ┊
 * ╰── [rubberband]
 * ```
 *
 * `GtkFlowBox` uses a single CSS node with name flowbox. `GtkFlowBoxChild`
 * uses a single CSS node with name flowboxchild. For rubberband selection,
 * a subnode with name rubberband is used.
 *
 * # Accessibility
 *
 * `GtkFlowBox` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and `GtkFlowBoxChild`
 * uses the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
 *
 * ## Skipped during bindings generation
 *
 * - method `accept-unpaired-release`: Property has no getter nor setter
 */
public open class FlowBox(
    pointer: CPointer<GtkFlowBox>,
) : Widget(pointer.reinterpret()), Orientable, KGTyped {
    public val gtkFlowBoxPointer: CPointer<GtkFlowBox>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
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
         * Returns whether children activate on single clicks.
         *
         * @return true if children are activated on single click,
         *   false otherwise
         */
        get() =
            gtk_flow_box_get_activate_on_single_click(gtkFlowBoxPointer.reinterpret()).asBoolean()

        /**
         * If @single is true, children will be activated when you click
         * on them, otherwise you need to double-click.
         *
         * @param single true to emit child-activated on a single click
         */
        set(single) =
            gtk_flow_box_set_activate_on_single_click(
                gtkFlowBoxPointer.reinterpret(),
                single.asGBoolean()
            )

    /**
     * The amount of horizontal space between two children.
     */
    public open var columnSpacing: UInt
        /**
         * Gets the horizontal spacing.
         *
         * @return the horizontal spacing
         */
        get() = gtk_flow_box_get_column_spacing(gtkFlowBoxPointer.reinterpret())

        /**
         * Sets the horizontal space to add between children.
         *
         * @param spacing the spacing to use
         */
        set(spacing) = gtk_flow_box_set_column_spacing(gtkFlowBoxPointer.reinterpret(), spacing)

    /**
     * Determines whether all children should be allocated the
     * same size.
     */
    public open var homogeneous: Boolean
        /**
         * Returns whether the box is homogeneous.
         *
         * @return true if the box is homogeneous.
         */
        get() = gtk_flow_box_get_homogeneous(gtkFlowBoxPointer.reinterpret()).asBoolean()

        /**
         * Sets whether or not all children of @box are given
         * equal space in the box.
         *
         * @param homogeneous true to create equal allotments,
         *   false for variable allotments
         */
        set(homogeneous) =
            gtk_flow_box_set_homogeneous(
                gtkFlowBoxPointer.reinterpret(),
                homogeneous.asGBoolean()
            )

    /**
     * The maximum amount of children to request space for consecutively
     * in the given orientation.
     */
    public open var maxChildrenPerLine: UInt
        /**
         * Gets the maximum number of children per line.
         *
         * @return the maximum number of children per line
         */
        get() = gtk_flow_box_get_max_children_per_line(gtkFlowBoxPointer.reinterpret())

        /**
         * Sets the maximum number of children to request and
         * allocate space for in @box’s orientation.
         *
         * Setting the maximum number of children per line
         * limits the overall natural size request to be no more
         * than @n_children children long in the given orientation.
         *
         * @param nChildren the maximum number of children per line
         */
        set(nChildren) =
            gtk_flow_box_set_max_children_per_line(
                gtkFlowBoxPointer.reinterpret(),
                nChildren
            )

    /**
     * The minimum number of children to allocate consecutively
     * in the given orientation.
     *
     * Setting the minimum children per line ensures
     * that a reasonably small height will be requested
     * for the overall minimum width of the box.
     */
    public open var minChildrenPerLine: UInt
        /**
         * Gets the minimum number of children per line.
         *
         * @return the minimum number of children per line
         */
        get() = gtk_flow_box_get_min_children_per_line(gtkFlowBoxPointer.reinterpret())

        /**
         * Sets the minimum number of children to line up
         * in @box’s orientation before flowing.
         *
         * @param nChildren the minimum number of children per line
         */
        set(nChildren) =
            gtk_flow_box_set_min_children_per_line(
                gtkFlowBoxPointer.reinterpret(),
                nChildren
            )

    /**
     * The amount of vertical space between two children.
     */
    public open var rowSpacing: UInt
        /**
         * Gets the vertical spacing.
         *
         * @return the vertical spacing
         */
        get() = gtk_flow_box_get_row_spacing(gtkFlowBoxPointer.reinterpret())

        /**
         * Sets the vertical space to add between children.
         *
         * @param spacing the spacing to use
         */
        set(spacing) = gtk_flow_box_set_row_spacing(gtkFlowBoxPointer.reinterpret(), spacing)

    /**
     * The selection mode used by the flow box.
     */
    public open var selectionMode: SelectionMode
        /**
         * Gets the selection mode of @box.
         *
         * @return the `GtkSelectionMode`
         */
        get() =
            gtk_flow_box_get_selection_mode(gtkFlowBoxPointer.reinterpret()).run {
                SelectionMode.fromNativeValue(this)
            }

        /**
         * Sets how selection works in @box.
         *
         * @param mode the new selection mode
         */
        set(mode) =
            gtk_flow_box_set_selection_mode(
                gtkFlowBoxPointer.reinterpret(),
                mode.nativeValue
            )

    /**
     * Creates a `GtkFlowBox`.
     *
     * @return a new `GtkFlowBox`
     */
    public constructor() : this(gtk_flow_box_new()!!.reinterpret())

    /**
     * Adds @child to the end of @self.
     *
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     *
     * See also: [method@Gtk.FlowBox.insert].
     *
     * @param child the `GtkWidget` to add
     * @since 4.6
     */
    public open fun append(child: Widget): Unit =
        gtk_flow_box_append(
            gtkFlowBoxPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

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
     * [method@Gtk.FlowBox.insert]) while @box is bound to a model.
     *
     * Note that using a model is incompatible with the filtering and sorting
     * functionality in `GtkFlowBox`. When using a model, filtering and sorting
     * should be implemented by the model.
     *
     * @param model the `GListModel` to be bound to @box
     * @param createWidgetFunc a function that creates widgets for items
     */
    public open fun bindModel(
        model: ListModel? = null,
        createWidgetFunc: FlowBoxCreateWidgetFunc,
    ): Unit =
        gtk_flow_box_bind_model(
            gtkFlowBoxPointer.reinterpret(),
            model?.gioListModelPointer,
            FlowBoxCreateWidgetFuncFunc.reinterpret(),
            StableRef.create(createWidgetFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Returns whether children activate on single clicks.
     *
     * @return true if children are activated on single click,
     *   false otherwise
     */
    public open fun getActivateOnSingleClick(): Boolean =
        gtk_flow_box_get_activate_on_single_click(gtkFlowBoxPointer.reinterpret()).asBoolean()

    /**
     * Gets the nth child in the @box.
     *
     * @param idx the position of the child
     * @return the child widget, which will
     *   always be a `GtkFlowBoxChild` or null in case no child widget
     *   with the given index exists.
     */
    public open fun getChildAtIndex(idx: Int): FlowBoxChild? =
        gtk_flow_box_get_child_at_index(gtkFlowBoxPointer.reinterpret(), idx)?.run {
            FlowBoxChild(reinterpret())
        }

    /**
     * Gets the child in the (@x, @y) position.
     *
     * Both @x and @y are assumed to be relative to the origin of @box.
     *
     * @param x the x coordinate of the child
     * @param y the y coordinate of the child
     * @return the child widget, which will
     *   always be a `GtkFlowBoxChild` or null in case no child widget
     *   exists for the given x and y coordinates.
     */
    public open fun getChildAtPos(
        x: Int,
        y: Int,
    ): FlowBoxChild? =
        gtk_flow_box_get_child_at_pos(gtkFlowBoxPointer.reinterpret(), x, y)?.run {
            FlowBoxChild(reinterpret())
        }

    /**
     * Gets the horizontal spacing.
     *
     * @return the horizontal spacing
     */
    public open fun getColumnSpacing(): UInt = gtk_flow_box_get_column_spacing(gtkFlowBoxPointer.reinterpret())

    /**
     * Returns whether the box is homogeneous.
     *
     * @return true if the box is homogeneous.
     */
    public open fun getHomogeneous(): Boolean =
        gtk_flow_box_get_homogeneous(gtkFlowBoxPointer.reinterpret()).asBoolean()

    /**
     * Gets the maximum number of children per line.
     *
     * @return the maximum number of children per line
     */
    public open fun getMaxChildrenPerLine(): UInt =
        gtk_flow_box_get_max_children_per_line(gtkFlowBoxPointer.reinterpret())

    /**
     * Gets the minimum number of children per line.
     *
     * @return the minimum number of children per line
     */
    public open fun getMinChildrenPerLine(): UInt =
        gtk_flow_box_get_min_children_per_line(gtkFlowBoxPointer.reinterpret())

    /**
     * Gets the vertical spacing.
     *
     * @return the vertical spacing
     */
    public open fun getRowSpacing(): UInt = gtk_flow_box_get_row_spacing(gtkFlowBoxPointer.reinterpret())

    /**
     * Creates a list of all selected children.
     *
     * @return
     *   A `GList` containing the `GtkWidget` for each selected child.
     *   Free with g_list_free() when done.
     */
    public open fun getSelectedChildren(): List =
        gtk_flow_box_get_selected_children(gtkFlowBoxPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    /**
     * Gets the selection mode of @box.
     *
     * @return the `GtkSelectionMode`
     */
    public open fun getSelectionMode(): SelectionMode =
        gtk_flow_box_get_selection_mode(gtkFlowBoxPointer.reinterpret()).run {
            SelectionMode.fromNativeValue(this)
        }

    /**
     * Inserts the @widget into @box at @position.
     *
     * If a sort function is set, the widget will actually be inserted
     * at the calculated position.
     *
     * If @position is -1, or larger than the total number of children
     * in the @box, then the @widget will be appended to the end.
     *
     * @param widget the `GtkWidget` to add
     * @param position the position to insert @child in
     */
    public open fun insert(
        widget: Widget,
        position: Int,
    ): Unit =
        gtk_flow_box_insert(
            gtkFlowBoxPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            position
        )

    /**
     * Updates the filtering for all children.
     *
     * Call this function when the result of the filter
     * function on the @box is changed due ot an external
     * factor. For instance, this would be used if the
     * filter function just looked for a specific search
     * term, and the entry with the string has changed.
     */
    public open fun invalidateFilter(): Unit = gtk_flow_box_invalidate_filter(gtkFlowBoxPointer.reinterpret())

    /**
     * Updates the sorting for all children.
     *
     * Call this when the result of the sort function on
     * @box is changed due to an external factor.
     */
    public open fun invalidateSort(): Unit = gtk_flow_box_invalidate_sort(gtkFlowBoxPointer.reinterpret())

    /**
     * Adds @child to the start of @self.
     *
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     *
     * See also: [method@Gtk.FlowBox.insert].
     *
     * @param child the `GtkWidget` to add
     * @since 4.6
     */
    public open fun prepend(child: Widget): Unit =
        gtk_flow_box_prepend(
            gtkFlowBoxPointer.reinterpret(),
            child.gtkWidgetPointer.reinterpret()
        )

    /**
     * Removes a child from @box.
     *
     * @param widget the child widget to remove
     */
    public open fun remove(widget: Widget): Unit =
        gtk_flow_box_remove(
            gtkFlowBoxPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Select all children of @box, if the selection
     * mode allows it.
     */
    public open fun selectAll(): Unit = gtk_flow_box_select_all(gtkFlowBoxPointer.reinterpret())

    /**
     * Selects a single child of @box, if the selection
     * mode allows it.
     *
     * @param child a child of @box
     */
    public open fun selectChild(child: FlowBoxChild): Unit =
        gtk_flow_box_select_child(
            gtkFlowBoxPointer.reinterpret(),
            child.gtkFlowBoxChildPointer.reinterpret()
        )

    /**
     * Calls a function for each selected child.
     *
     * Note that the selection cannot be modified from within
     * this function.
     *
     * @param func the function to call for each selected child
     */
    public open fun selectedForeach(func: FlowBoxForeachFunc): Unit =
        gtk_flow_box_selected_foreach(
            gtkFlowBoxPointer.reinterpret(),
            FlowBoxForeachFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * If @single is true, children will be activated when you click
     * on them, otherwise you need to double-click.
     *
     * @param single true to emit child-activated on a single click
     */
    public open fun setActivateOnSingleClick(single: Boolean): Unit =
        gtk_flow_box_set_activate_on_single_click(
            gtkFlowBoxPointer.reinterpret(),
            single.asGBoolean()
        )

    /**
     * Sets the horizontal space to add between children.
     *
     * @param spacing the spacing to use
     */
    public open fun setColumnSpacing(spacing: UInt): Unit =
        gtk_flow_box_set_column_spacing(gtkFlowBoxPointer.reinterpret(), spacing)

    /**
     * By setting a filter function on the @box one can decide dynamically
     * which of the children to show.
     *
     * For instance, to implement a search function that only shows the
     * children matching the search terms.
     *
     * The @filter_func will be called for each child after the call, and
     * it will continue to be called each time a child changes (via
     * [method@Gtk.FlowBoxChild.changed]) or when
     * [method@Gtk.FlowBox.invalidate_filter] is called.
     *
     * Note that using a filter function is incompatible with using a model
     * (see [method@Gtk.FlowBox.bind_model]).
     *
     * @param filterFunc callback that
     *   lets you filter which children to show
     */
    public open fun setFilterFunc(filterFunc: FlowBoxFilterFunc): Unit =
        gtk_flow_box_set_filter_func(
            gtkFlowBoxPointer.reinterpret(),
            FlowBoxFilterFuncFunc.reinterpret(),
            StableRef.create(filterFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Hooks up an adjustment to focus handling in @box.
     *
     * The adjustment is also used for autoscrolling during
     * rubberband selection. See [method@Gtk.ScrolledWindow.get_hadjustment]
     * for a typical way of obtaining the adjustment, and
     * [method@Gtk.FlowBox.set_vadjustment] for setting the vertical
     * adjustment.
     *
     * The adjustments have to be in pixel units and in the same
     * coordinate system as the allocation for immediate children
     * of the box.
     *
     * @param adjustment an adjustment which should be adjusted
     *    when the focus is moved among the descendents of @container
     */
    public open fun setHadjustment(adjustment: Adjustment): Unit =
        gtk_flow_box_set_hadjustment(
            gtkFlowBoxPointer.reinterpret(),
            adjustment.gtkAdjustmentPointer.reinterpret()
        )

    /**
     * Sets whether or not all children of @box are given
     * equal space in the box.
     *
     * @param homogeneous true to create equal allotments,
     *   false for variable allotments
     */
    public open fun setHomogeneous(homogeneous: Boolean): Unit =
        gtk_flow_box_set_homogeneous(gtkFlowBoxPointer.reinterpret(), homogeneous.asGBoolean())

    /**
     * Sets the maximum number of children to request and
     * allocate space for in @box’s orientation.
     *
     * Setting the maximum number of children per line
     * limits the overall natural size request to be no more
     * than @n_children children long in the given orientation.
     *
     * @param nChildren the maximum number of children per line
     */
    public open fun setMaxChildrenPerLine(nChildren: UInt): Unit =
        gtk_flow_box_set_max_children_per_line(gtkFlowBoxPointer.reinterpret(), nChildren)

    /**
     * Sets the minimum number of children to line up
     * in @box’s orientation before flowing.
     *
     * @param nChildren the minimum number of children per line
     */
    public open fun setMinChildrenPerLine(nChildren: UInt): Unit =
        gtk_flow_box_set_min_children_per_line(gtkFlowBoxPointer.reinterpret(), nChildren)

    /**
     * Sets the vertical space to add between children.
     *
     * @param spacing the spacing to use
     */
    public open fun setRowSpacing(spacing: UInt): Unit =
        gtk_flow_box_set_row_spacing(gtkFlowBoxPointer.reinterpret(), spacing)

    /**
     * Sets how selection works in @box.
     *
     * @param mode the new selection mode
     */
    public open fun setSelectionMode(mode: SelectionMode): Unit =
        gtk_flow_box_set_selection_mode(gtkFlowBoxPointer.reinterpret(), mode.nativeValue)

    /**
     * By setting a sort function on the @box, one can dynamically
     * reorder the children of the box, based on the contents of
     * the children.
     *
     * The @sort_func will be called for each child after the call,
     * and will continue to be called each time a child changes (via
     * [method@Gtk.FlowBoxChild.changed]) and when
     * [method@Gtk.FlowBox.invalidate_sort] is called.
     *
     * Note that using a sort function is incompatible with using a model
     * (see [method@Gtk.FlowBox.bind_model]).
     *
     * @param sortFunc the sort function
     */
    public open fun setSortFunc(sortFunc: FlowBoxSortFunc): Unit =
        gtk_flow_box_set_sort_func(
            gtkFlowBoxPointer.reinterpret(),
            FlowBoxSortFuncFunc.reinterpret(),
            StableRef.create(sortFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Hooks up an adjustment to focus handling in @box.
     *
     * The adjustment is also used for autoscrolling during
     * rubberband selection. See [method@Gtk.ScrolledWindow.get_vadjustment]
     * for a typical way of obtaining the adjustment, and
     * [method@Gtk.FlowBox.set_hadjustment] for setting the horizontal
     * adjustment.
     *
     * The adjustments have to be in pixel units and in the same
     * coordinate system as the allocation for immediate children
     * of the box.
     *
     * @param adjustment an adjustment which should be adjusted
     *    when the focus is moved among the descendents of @container
     */
    public open fun setVadjustment(adjustment: Adjustment): Unit =
        gtk_flow_box_set_vadjustment(
            gtkFlowBoxPointer.reinterpret(),
            adjustment.gtkAdjustmentPointer.reinterpret()
        )

    /**
     * Unselect all children of @box, if the selection
     * mode allows it.
     */
    public open fun unselectAll(): Unit = gtk_flow_box_unselect_all(gtkFlowBoxPointer.reinterpret())

    /**
     * Unselects a single child of @box, if the selection
     * mode allows it.
     *
     * @param child a child of @box
     */
    public open fun unselectChild(child: FlowBoxChild): Unit =
        gtk_flow_box_unselect_child(
            gtkFlowBoxPointer.reinterpret(),
            child.gtkFlowBoxChildPointer.reinterpret()
        )

    /**
     * Emitted when the user activates the @box.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivateCursorChild(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-cursor-child",
            connectActivateCursorChildFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a child has been activated by the user.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `child` the child that is activated
     */
    public fun connectChildActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (child: FlowBoxChild) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "child-activated",
            connectChildActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user initiates a cursor movement.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     *
     * The default bindings for this signal come in two variants,
     * the variant with the Shift modifier extends the selection,
     * the variant without the Shift modifier does not.
     * There are too many key combinations to list them all here.
     *
     * - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd>
     *   move by individual children
     * - <kbd>Home</kbd>, <kbd>End</kbd> move to the ends of the box
     * - <kbd>PgUp</kbd>, <kbd>PgDn</kbd> move vertically by pages
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity fo the move, as a
     * `GtkMovementStep`; `count` the number of @step units to move; `extend` whether to extend the
     * selection; `modify` whether to modify the selection. Returns true to stop other handlers from
     * being invoked for the event.
     * false to propagate the event further.
     */
    public fun connectMoveCursor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            step: MovementStep,
            count: Int,
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
     * Emitted to select all children of the box,
     * if the selection mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal is <kbd>Ctrl</kbd>-<kbd>a</kbd>.
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
     * Emitted when the set of selected children changes.
     *
     * Use [method@Gtk.FlowBox.selected_foreach] or
     * [method@Gtk.FlowBox.get_selected_children] to obtain the
     * selected children.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSelectedChildrenChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "selected-children-changed",
            connectSelectedChildrenChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to toggle the selection of the child that has the focus.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>Space</kbd>.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectToggleCursorChild(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "toggle-cursor-child",
            connectToggleCursorChildFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to unselect all children of the box,
     * if the selection mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal is <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
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

    public companion object : TypeCompanion<FlowBox> {
        override val type: GeneratedClassKGType<FlowBox> =
            GeneratedClassKGType(gtk_flow_box_get_type()) { FlowBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateCursorChildFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectChildActivatedFunc: CPointer<CFunction<(CPointer<GtkFlowBoxChild>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            child: CPointer<GtkFlowBoxChild>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(child: FlowBoxChild) -> Unit>().get().invoke(
            child!!.run {
                FlowBoxChild(reinterpret())
            }
        )
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
            count: Int,
            extend: Int,
            modify: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                step: MovementStep,
                count: Int,
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

private val connectSelectAllFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectSelectedChildrenChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectToggleCursorChildFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectUnselectAllFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
