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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkGridView
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_grid_view_get_enable_rubberband
import org.gtkkn.native.gtk.gtk_grid_view_get_factory
import org.gtkkn.native.gtk.gtk_grid_view_get_max_columns
import org.gtkkn.native.gtk.gtk_grid_view_get_min_columns
import org.gtkkn.native.gtk.gtk_grid_view_get_model
import org.gtkkn.native.gtk.gtk_grid_view_get_single_click_activate
import org.gtkkn.native.gtk.gtk_grid_view_get_tab_behavior
import org.gtkkn.native.gtk.gtk_grid_view_get_type
import org.gtkkn.native.gtk.gtk_grid_view_new
import org.gtkkn.native.gtk.gtk_grid_view_scroll_to
import org.gtkkn.native.gtk.gtk_grid_view_set_enable_rubberband
import org.gtkkn.native.gtk.gtk_grid_view_set_factory
import org.gtkkn.native.gtk.gtk_grid_view_set_max_columns
import org.gtkkn.native.gtk.gtk_grid_view_set_min_columns
import org.gtkkn.native.gtk.gtk_grid_view_set_model
import org.gtkkn.native.gtk.gtk_grid_view_set_single_click_activate
import org.gtkkn.native.gtk.gtk_grid_view_set_tab_behavior
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGridView` presents a large dynamic grid of items.
 *
 * `GtkGridView` uses its factory to generate one child widget for each
 * visible item and shows them in a grid. The orientation of the grid view
 * determines if the grid reflows vertically or horizontally.
 *
 * `GtkGridView` allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * [property@Gtk.GridView:enable-rubberband].
 *
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 *
 * # CSS nodes
 *
 * ```
 * gridview
 * ├── child[.activatable]
 * │
 * ├── child[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * ```
 *
 * `GtkGridView` uses a single CSS node with name `gridview`. Each child uses
 * a single CSS node with name `child`. If the [property@Gtk.ListItem:activatable]
 * property is set, the corresponding row will have the `.activatable` style
 * class. For rubberband selection, a subnode with name `rubberband` is used.
 *
 * # Accessibility
 *
 * `GtkGridView` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and the items
 * use the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
 */
public open class GridView(public val gtkGridViewPointer: CPointer<GtkGridView>) :
    ListBase(gtkGridViewPointer.reinterpret()),
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

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    /**
     * Allow rubberband selection.
     */
    public open var enableRubberband: Boolean
        /**
         * Returns whether rows can be selected by dragging with the mouse.
         *
         * @return true if rubberband selection is enabled
         */
        get() = gtk_grid_view_get_enable_rubberband(gtkGridViewPointer).asBoolean()

        /**
         * Sets whether selections can be changed by dragging with the mouse.
         *
         * @param enableRubberband true to enable rubberband selection
         */
        set(enableRubberband) = gtk_grid_view_set_enable_rubberband(gtkGridViewPointer, enableRubberband.asGBoolean())

    /**
     * Factory for populating list items.
     */
    public open var factory: ListItemFactory?
        /**
         * Gets the factory that's currently used to populate list items.
         *
         * @return The factory in use
         */
        get() = gtk_grid_view_get_factory(gtkGridViewPointer)?.run {
            InstanceCache.get(this, true) { ListItemFactory(reinterpret()) }!!
        }

        /**
         * Sets the `GtkListItemFactory` to use for populating list items.
         *
         * @param factory the factory to use
         */
        set(factory) = gtk_grid_view_set_factory(gtkGridViewPointer, factory?.gtkListItemFactoryPointer)

    /**
     * Maximum number of columns per row.
     *
     * If this number is smaller than [property@Gtk.GridView:min-columns],
     * that value is used instead.
     */
    public open var maxColumns: guint
        /**
         * Gets the maximum number of columns that the grid will use.
         *
         * @return The maximum number of columns
         */
        get() = gtk_grid_view_get_max_columns(gtkGridViewPointer)

        /**
         * Sets the maximum number of columns to use.
         *
         * This number must be at least 1.
         *
         * If @max_columns is smaller than the minimum set via
         * [method@Gtk.GridView.set_min_columns], that value is used instead.
         *
         * @param maxColumns The maximum number of columns
         */
        set(maxColumns) = gtk_grid_view_set_max_columns(gtkGridViewPointer, maxColumns)

    /**
     * Minimum number of columns per row.
     */
    public open var minColumns: guint
        /**
         * Gets the minimum number of columns that the grid will use.
         *
         * @return The minimum number of columns
         */
        get() = gtk_grid_view_get_min_columns(gtkGridViewPointer)

        /**
         * Sets the minimum number of columns to use.
         *
         * This number must be at least 1.
         *
         * If @min_columns is smaller than the minimum set via
         * [method@Gtk.GridView.set_max_columns], that value is ignored.
         *
         * @param minColumns The minimum number of columns
         */
        set(minColumns) = gtk_grid_view_set_min_columns(gtkGridViewPointer, minColumns)

    /**
     * Model for the items displayed.
     */
    public open var model: SelectionModel?
        /**
         * Gets the model that's currently used to read the items displayed.
         *
         * @return The model in use
         */
        get() = gtk_grid_view_get_model(gtkGridViewPointer)?.run {
            SelectionModel.SelectionModelImpl(reinterpret())
        }

        /**
         * Sets the model to use.
         *
         * This must be a [iface@Gtk.SelectionModel].
         *
         * @param model the model to use
         */
        set(model) = gtk_grid_view_set_model(gtkGridViewPointer, model?.gtkSelectionModelPointer)

    /**
     * Activate rows on single click and select them on hover.
     */
    public open var singleClickActivate: Boolean
        /**
         * Returns whether items will be activated on single click and
         * selected on hover.
         *
         * @return true if items are activated on single click
         */
        get() = gtk_grid_view_get_single_click_activate(gtkGridViewPointer).asBoolean()

        /**
         * Sets whether items should be activated on single click and
         * selected on hover.
         *
         * @param singleClickActivate true to activate items on single click
         */
        set(
            singleClickActivate
        ) = gtk_grid_view_set_single_click_activate(gtkGridViewPointer, singleClickActivate.asGBoolean())

    /**
     * Behavior of the <kbd>Tab</kbd> key
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var tabBehavior: ListTabBehavior
        /**
         * Gets the behavior set for the <kbd>Tab</kbd> key.
         *
         * @return The behavior of the <kbd>Tab</kbd> key
         * @since 4.12
         */
        get() = gtk_grid_view_get_tab_behavior(gtkGridViewPointer).run {
            ListTabBehavior.fromNativeValue(this)
        }

        /**
         * Sets the behavior of the <kbd>Tab</kbd> and <kbd>Shift</kbd>+<kbd>Tab</kbd> keys.
         *
         * @param tabBehavior The desired tab behavior
         * @since 4.12
         */
        @GtkVersion4_12
        set(tabBehavior) = gtk_grid_view_set_tab_behavior(gtkGridViewPointer, tabBehavior.nativeValue)

    /**
     * Creates a new `GtkGridView` that uses the given @factory for
     * mapping items to widgets.
     *
     * The function takes ownership of the
     * arguments, so you can write code like
     * ```c
     * grid_view = gtk_grid_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * ```
     *
     * @param model the model to use
     * @param factory The factory to populate items with
     * @return a new `GtkGridView` using the given @model and @factory
     */
    public constructor(
        model: SelectionModel? = null,
        factory: ListItemFactory? = null,
    ) : this(gtk_grid_view_new(model?.gtkSelectionModelPointer, factory?.gtkListItemFactoryPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Scrolls to the item at the given position and performs the actions
     * specified in @flags.
     *
     * This function works no matter if the gridview is shown or focused.
     * If it isn't, then the changes will take effect once that happens.
     *
     * @param pos position of the item
     * @param flags actions to perform
     * @param scroll details of how to perform
     *   the scroll operation or null to scroll into view
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun scrollTo(pos: guint, flags: ListScrollFlags, scroll: ScrollInfo? = null): Unit =
        gtk_grid_view_scroll_to(gtkGridViewPointer, pos, flags.mask, scroll?.gtkScrollInfoPointer)

    /**
     * Emitted when a cell has been activated by the user,
     * usually via activating the GtkGridView|list.activate-item action.
     *
     * This allows for a convenient way to handle activation in a gridview.
     * See [property@Gtk.ListItem:activatable] for details on how to use
     * this signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` position of item to activate
     */
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (position: guint) -> Unit): ULong =
        g_signal_connect_data(
            gtkGridViewPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     *
     * @param position position of item to activate
     */
    public fun emitActivate(position: guint) {
        g_signal_emit_by_name(gtkGridViewPointer.reinterpret(), "activate", position)
    }

    public companion object : TypeCompanion<GridView> {
        override val type: GeneratedClassKGType<GridView> =
            GeneratedClassKGType(getTypeOrNull()!!) { GridView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GridView
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_grid_view_get_type()

        /**
         * Gets the GType of from the symbol `gtk_grid_view_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_grid_view_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<(guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        position: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(position: guint) -> Unit>().get().invoke(position)
}
    .reinterpret()
