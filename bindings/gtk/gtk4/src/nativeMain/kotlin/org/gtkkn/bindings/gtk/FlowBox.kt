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
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
import org.gtkkn.native.gtk.gtk_flow_box_remove_all
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
public open class FlowBox(public val gtkFlowBoxPointer: CPointer<GtkFlowBox>) :
    Widget(gtkFlowBoxPointer.reinterpret()),
    Orientable,
    KGTyped {
    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

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
         * Returns whether children activate on single clicks.
         *
         * @return true if children are activated on single click,
         *   false otherwise
         */
        get() = gtk_flow_box_get_activate_on_single_click(gtkFlowBoxPointer).asBoolean()

        /**
         * If @single is true, children will be activated when you click
         * on them, otherwise you need to double-click.
         *
         * @param single true to emit child-activated on a single click
         */
        set(single) = gtk_flow_box_set_activate_on_single_click(gtkFlowBoxPointer, single.asGBoolean())

    /**
     * The amount of horizontal space between two children.
     */
    public open var columnSpacing: guint
        /**
         * Gets the horizontal spacing.
         *
         * @return the horizontal spacing
         */
        get() = gtk_flow_box_get_column_spacing(gtkFlowBoxPointer)

        /**
         * Sets the horizontal space to add between children.
         *
         * @param spacing the spacing to use
         */
        set(spacing) = gtk_flow_box_set_column_spacing(gtkFlowBoxPointer, spacing)

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
        get() = gtk_flow_box_get_homogeneous(gtkFlowBoxPointer).asBoolean()

        /**
         * Sets whether or not all children of @box are given
         * equal space in the box.
         *
         * @param homogeneous true to create equal allotments,
         *   false for variable allotments
         */
        set(homogeneous) = gtk_flow_box_set_homogeneous(gtkFlowBoxPointer, homogeneous.asGBoolean())

    /**
     * The maximum amount of children to request space for consecutively
     * in the given orientation.
     */
    public open var maxChildrenPerLine: guint
        /**
         * Gets the maximum number of children per line.
         *
         * @return the maximum number of children per line
         */
        get() = gtk_flow_box_get_max_children_per_line(gtkFlowBoxPointer)

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
        set(nChildren) = gtk_flow_box_set_max_children_per_line(gtkFlowBoxPointer, nChildren)

    /**
     * The minimum number of children to allocate consecutively
     * in the given orientation.
     *
     * Setting the minimum children per line ensures
     * that a reasonably small height will be requested
     * for the overall minimum width of the box.
     */
    public open var minChildrenPerLine: guint
        /**
         * Gets the minimum number of children per line.
         *
         * @return the minimum number of children per line
         */
        get() = gtk_flow_box_get_min_children_per_line(gtkFlowBoxPointer)

        /**
         * Sets the minimum number of children to line up
         * in @box’s orientation before flowing.
         *
         * @param nChildren the minimum number of children per line
         */
        set(nChildren) = gtk_flow_box_set_min_children_per_line(gtkFlowBoxPointer, nChildren)

    /**
     * The amount of vertical space between two children.
     */
    public open var rowSpacing: guint
        /**
         * Gets the vertical spacing.
         *
         * @return the vertical spacing
         */
        get() = gtk_flow_box_get_row_spacing(gtkFlowBoxPointer)

        /**
         * Sets the vertical space to add between children.
         *
         * @param spacing the spacing to use
         */
        set(spacing) = gtk_flow_box_set_row_spacing(gtkFlowBoxPointer, spacing)

    /**
     * The selection mode used by the flow box.
     */
    public open var selectionMode: SelectionMode
        /**
         * Gets the selection mode of @box.
         *
         * @return the `GtkSelectionMode`
         */
        get() = gtk_flow_box_get_selection_mode(gtkFlowBoxPointer).run {
            SelectionMode.fromNativeValue(this)
        }

        /**
         * Sets how selection works in @box.
         *
         * @param mode the new selection mode
         */
        set(mode) = gtk_flow_box_set_selection_mode(gtkFlowBoxPointer, mode.nativeValue)

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
    @GtkVersion4_6
    public open fun append(child: Widget): Unit = gtk_flow_box_append(gtkFlowBoxPointer, child.gtkWidgetPointer)

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
    public open fun bindModel(model: ListModel? = null, createWidgetFunc: FlowBoxCreateWidgetFunc): Unit =
        gtk_flow_box_bind_model(
            gtkFlowBoxPointer,
            model?.gioListModelPointer,
            FlowBoxCreateWidgetFuncFunc.reinterpret(),
            StableRef.create(createWidgetFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Gets the nth child in the @box.
     *
     * @param idx the position of the child
     * @return the child widget, which will
     *   always be a `GtkFlowBoxChild` or null in case no child widget
     *   with the given index exists.
     */
    public open fun getChildAtIndex(idx: gint): FlowBoxChild? =
        gtk_flow_box_get_child_at_index(gtkFlowBoxPointer, idx)?.run {
            FlowBoxChild(this)
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
    public open fun getChildAtPos(x: gint, y: gint): FlowBoxChild? =
        gtk_flow_box_get_child_at_pos(gtkFlowBoxPointer, x, y)?.run {
            FlowBoxChild(this)
        }

    /**
     * Creates a list of all selected children.
     *
     * @return A `GList` containing the `GtkWidget` for each selected child.
     *   Free with g_list_free() when done.
     */
    public open fun getSelectedChildren(): List = gtk_flow_box_get_selected_children(gtkFlowBoxPointer)!!.run {
        List(this)
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
    public open fun insert(widget: Widget, position: gint): Unit =
        gtk_flow_box_insert(gtkFlowBoxPointer, widget.gtkWidgetPointer, position)

    /**
     * Updates the filtering for all children.
     *
     * Call this function when the result of the filter
     * function on the @box is changed due to an external
     * factor. For instance, this would be used if the
     * filter function just looked for a specific search
     * term, and the entry with the string has changed.
     */
    public open fun invalidateFilter(): Unit = gtk_flow_box_invalidate_filter(gtkFlowBoxPointer)

    /**
     * Updates the sorting for all children.
     *
     * Call this when the result of the sort function on
     * @box is changed due to an external factor.
     */
    public open fun invalidateSort(): Unit = gtk_flow_box_invalidate_sort(gtkFlowBoxPointer)

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
    @GtkVersion4_6
    public open fun prepend(child: Widget): Unit = gtk_flow_box_prepend(gtkFlowBoxPointer, child.gtkWidgetPointer)

    /**
     * Removes a child from @box.
     *
     * @param widget the child widget to remove
     */
    public open fun remove(widget: Widget): Unit = gtk_flow_box_remove(gtkFlowBoxPointer, widget.gtkWidgetPointer)

    /**
     * Removes all children from @box.
     *
     * This function does nothing if @box is backed by a model.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun removeAll(): Unit = gtk_flow_box_remove_all(gtkFlowBoxPointer)

    /**
     * Select all children of @box, if the selection
     * mode allows it.
     */
    public open fun selectAll(): Unit = gtk_flow_box_select_all(gtkFlowBoxPointer)

    /**
     * Selects a single child of @box, if the selection
     * mode allows it.
     *
     * @param child a child of @box
     */
    public open fun selectChild(child: FlowBoxChild): Unit =
        gtk_flow_box_select_child(gtkFlowBoxPointer, child.gtkFlowBoxChildPointer)

    /**
     * Calls a function for each selected child.
     *
     * Note that the selection cannot be modified from within
     * this function.
     *
     * @param func the function to call for each selected child
     */
    public open fun selectedForeach(func: FlowBoxForeachFunc): Unit = gtk_flow_box_selected_foreach(
        gtkFlowBoxPointer,
        FlowBoxForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

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
    public open fun setFilterFunc(filterFunc: FlowBoxFilterFunc?): Unit = gtk_flow_box_set_filter_func(
        gtkFlowBoxPointer,
        filterFunc?.let {
            FlowBoxFilterFuncFunc.reinterpret()
        },
        filterFunc?.let {
            StableRef.create(filterFunc).asCPointer()
        },
        filterFunc?.let { staticStableRefDestroy.reinterpret() }
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
        gtk_flow_box_set_hadjustment(gtkFlowBoxPointer, adjustment.gtkAdjustmentPointer)

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
    public open fun setSortFunc(sortFunc: FlowBoxSortFunc?): Unit = gtk_flow_box_set_sort_func(
        gtkFlowBoxPointer,
        sortFunc?.let {
            FlowBoxSortFuncFunc.reinterpret()
        },
        sortFunc?.let {
            StableRef.create(sortFunc).asCPointer()
        },
        sortFunc?.let { staticStableRefDestroy.reinterpret() }
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
        gtk_flow_box_set_vadjustment(gtkFlowBoxPointer, adjustment.gtkAdjustmentPointer)

    /**
     * Unselect all children of @box, if the selection
     * mode allows it.
     */
    public open fun unselectAll(): Unit = gtk_flow_box_unselect_all(gtkFlowBoxPointer)

    /**
     * Unselects a single child of @box, if the selection
     * mode allows it.
     *
     * @param child a child of @box
     */
    public open fun unselectChild(child: FlowBoxChild): Unit =
        gtk_flow_box_unselect_child(gtkFlowBoxPointer, child.gtkFlowBoxChildPointer)

    /**
     * Emitted when the user activates the @box.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onActivateCursorChild(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFlowBoxPointer,
            "activate-cursor-child",
            onActivateCursorChildFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate-cursor-child" signal. See [onActivateCursorChild].
     */
    public fun emitActivateCursorChild() {
        g_signal_emit_by_name(gtkFlowBoxPointer.reinterpret(), "activate-cursor-child")
    }

    /**
     * Emitted when a child has been activated by the user.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `child` the child that is activated
     */
    public fun onChildActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (child: FlowBoxChild) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkFlowBoxPointer,
        "child-activated",
        onChildActivatedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "child-activated" signal. See [onChildActivated].
     *
     * @param child the child that is activated
     */
    public fun emitChildActivated(child: FlowBoxChild) {
        g_signal_emit_by_name(gtkFlowBoxPointer.reinterpret(), "child-activated", child.gtkFlowBoxChildPointer)
    }

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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` the granularity of the move, as a `GtkMovementStep`; `count` the number of @step units to move; `extend` whether to extend the selection; `modify` whether to modify the selection. Returns true to stop other handlers from being invoked for the event.
     * false to propagate the event further.
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
        gtkFlowBoxPointer,
        "move-cursor",
        onMoveCursorFunc.reinterpret(),
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
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFlowBoxPointer,
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
        g_signal_emit_by_name(gtkFlowBoxPointer.reinterpret(), "select-all")
    }

    /**
     * Emitted when the set of selected children changes.
     *
     * Use [method@Gtk.FlowBox.selected_foreach] or
     * [method@Gtk.FlowBox.get_selected_children] to obtain the
     * selected children.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSelectedChildrenChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFlowBoxPointer,
            "selected-children-changed",
            onSelectedChildrenChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "selected-children-changed" signal. See [onSelectedChildrenChanged].
     */
    public fun emitSelectedChildrenChanged() {
        g_signal_emit_by_name(gtkFlowBoxPointer.reinterpret(), "selected-children-changed")
    }

    /**
     * Emitted to toggle the selection of the child that has the focus.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>Space</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onToggleCursorChild(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFlowBoxPointer,
            "toggle-cursor-child",
            onToggleCursorChildFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "toggle-cursor-child" signal. See [onToggleCursorChild].
     */
    public fun emitToggleCursorChild() {
        g_signal_emit_by_name(gtkFlowBoxPointer.reinterpret(), "toggle-cursor-child")
    }

    /**
     * Emitted to unselect all children of the box,
     * if the selection mode permits it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal is <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUnselectAll(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFlowBoxPointer,
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
        g_signal_emit_by_name(gtkFlowBoxPointer.reinterpret(), "unselect-all")
    }

    public companion object : TypeCompanion<FlowBox> {
        override val type: GeneratedClassKGType<FlowBox> =
            GeneratedClassKGType(gtk_flow_box_get_type()) { FlowBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FlowBox
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_flow_box_get_type()
    }
}

private val onActivateCursorChildFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onChildActivatedFunc: CPointer<CFunction<(CPointer<GtkFlowBoxChild>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            child: CPointer<GtkFlowBoxChild>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(child: FlowBoxChild) -> Unit>().get().invoke(
            child!!.run {
                FlowBoxChild(this)
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

private val onSelectedChildrenChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onToggleCursorChildFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
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
