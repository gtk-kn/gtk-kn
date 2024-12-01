// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkTreeSelection
import org.gtkkn.native.gtk.gtk_tree_selection_count_selected_rows
import org.gtkkn.native.gtk.gtk_tree_selection_get_mode
import org.gtkkn.native.gtk.gtk_tree_selection_get_tree_view
import org.gtkkn.native.gtk.gtk_tree_selection_get_type
import org.gtkkn.native.gtk.gtk_tree_selection_iter_is_selected
import org.gtkkn.native.gtk.gtk_tree_selection_path_is_selected
import org.gtkkn.native.gtk.gtk_tree_selection_select_all
import org.gtkkn.native.gtk.gtk_tree_selection_select_iter
import org.gtkkn.native.gtk.gtk_tree_selection_select_path
import org.gtkkn.native.gtk.gtk_tree_selection_select_range
import org.gtkkn.native.gtk.gtk_tree_selection_selected_foreach
import org.gtkkn.native.gtk.gtk_tree_selection_set_mode
import org.gtkkn.native.gtk.gtk_tree_selection_set_select_function
import org.gtkkn.native.gtk.gtk_tree_selection_unselect_all
import org.gtkkn.native.gtk.gtk_tree_selection_unselect_iter
import org.gtkkn.native.gtk.gtk_tree_selection_unselect_path
import org.gtkkn.native.gtk.gtk_tree_selection_unselect_range
import kotlin.Boolean
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * The selection object for GtkTreeView
 *
 * The `GtkTreeSelection` object is a helper object to manage the selection
 * for a `GtkTreeView` widget.  The `GtkTreeSelection` object is
 * automatically created when a new `GtkTreeView` widget is created, and
 * cannot exist independently of this widget.  The primary reason the
 * `GtkTreeSelection` objects exists is for cleanliness of code and API.
 * That is, there is no conceptual reason all these functions could not be
 * methods on the `GtkTreeView` widget instead of a separate function.
 *
 * The `GtkTreeSelection` object is gotten from a `GtkTreeView` by calling
 * gtk_tree_view_get_selection().  It can be manipulated to check the
 * selection status of the tree, as well as select and deselect individual
 * rows.  Selection is done completely view side.  As a result, multiple
 * views of the same model can have completely different selections.
 * Additionally, you cannot change the selection of a row on the model that
 * is not currently displayed by the view without expanding its parents
 * first.
 *
 * One of the important things to remember when monitoring the selection of
 * a view is that the `GtkTreeSelection`::changed signal is mostly a hint.
 * That is, it may only emit one signal when a range of rows is selected.
 * Additionally, it may on occasion emit a `GtkTreeSelection`::changed signal
 * when nothing has happened (mostly as a result of programmers calling
 * select_row on an already selected row).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `model`: model: Out parameter is not supported
 * - parameter `model`: model: Out parameter is not supported
 */
public open class TreeSelection(
    pointer: CPointer<GtkTreeSelection>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gtkTreeSelectionPointer: CPointer<GtkTreeSelection>
        get() = gPointer.reinterpret()

    /**
     * Selection mode.
     * See gtk_tree_selection_set_mode() for more information on this property.
     */
    public open var mode: SelectionMode
        /**
         * Gets the selection mode for @selection. See
         * gtk_tree_selection_set_mode().
         *
         * @return the current selection mode
         */
        get() =
            gtk_tree_selection_get_mode(gtkTreeSelectionPointer.reinterpret()).run {
                SelectionMode.fromNativeValue(this)
            }

        /**
         * Sets the selection mode of the @selection.  If the previous type was
         * %GTK_SELECTION_MULTIPLE, then the anchor is kept selected, if it was
         * previously selected.
         *
         * @param type The selection mode
         */
        set(type) = gtk_tree_selection_set_mode(gtkTreeSelectionPointer.reinterpret(), type.nativeValue)

    /**
     * Returns the number of rows that have been selected in @tree.
     *
     * @return The number of rows selected.
     */
    public open fun countSelectedRows(): Int =
        gtk_tree_selection_count_selected_rows(gtkTreeSelectionPointer.reinterpret())

    /**
     * Gets the selection mode for @selection. See
     * gtk_tree_selection_set_mode().
     *
     * @return the current selection mode
     */
    public open fun getMode(): SelectionMode =
        gtk_tree_selection_get_mode(gtkTreeSelectionPointer.reinterpret()).run {
            SelectionMode.fromNativeValue(this)
        }

    /**
     * Returns the tree view associated with @selection.
     *
     * @return A `GtkTreeView`
     */
    public open fun getTreeView(): TreeView =
        gtk_tree_selection_get_tree_view(gtkTreeSelectionPointer.reinterpret())!!.run {
            TreeView(reinterpret())
        }

    /**
     * Returns true if the row at @iter is currently selected.
     *
     * @param iter A valid `GtkTreeIter`
     * @return true, if @iter is selected
     */
    public open fun iterIsSelected(iter: TreeIter): Boolean =
        gtk_tree_selection_iter_is_selected(
            gtkTreeSelectionPointer.reinterpret(),
            iter.gtkTreeIterPointer.reinterpret()
        ).asBoolean()

    /**
     * Returns true if the row pointed to by @path is currently selected.  If @path
     * does not point to a valid location, false is returned
     *
     * @param path A `GtkTreePath` to check selection on.
     * @return true if @path is selected.
     */
    public open fun pathIsSelected(path: TreePath): Boolean =
        gtk_tree_selection_path_is_selected(
            gtkTreeSelectionPointer.reinterpret(),
            path.gtkTreePathPointer.reinterpret()
        ).asBoolean()

    /**
     * Selects all the nodes. @selection must be set to %GTK_SELECTION_MULTIPLE
     * mode.
     */
    public open fun selectAll(): Unit = gtk_tree_selection_select_all(gtkTreeSelectionPointer.reinterpret())

    /**
     * Selects the specified iterator.
     *
     * @param iter The `GtkTreeIter` to be selected.
     */
    public open fun selectIter(iter: TreeIter): Unit =
        gtk_tree_selection_select_iter(gtkTreeSelectionPointer.reinterpret(), iter.gtkTreeIterPointer.reinterpret())

    /**
     * Select the row at @path.
     *
     * @param path The `GtkTreePath` to be selected.
     */
    public open fun selectPath(path: TreePath): Unit =
        gtk_tree_selection_select_path(gtkTreeSelectionPointer.reinterpret(), path.gtkTreePathPointer.reinterpret())

    /**
     * Selects a range of nodes, determined by @start_path and @end_path inclusive.
     * @selection must be set to %GTK_SELECTION_MULTIPLE mode.
     *
     * @param startPath The initial node of the range.
     * @param endPath The final node of the range.
     */
    public open fun selectRange(
        startPath: TreePath,
        endPath: TreePath,
    ): Unit =
        gtk_tree_selection_select_range(
            gtkTreeSelectionPointer.reinterpret(),
            startPath.gtkTreePathPointer.reinterpret(),
            endPath.gtkTreePathPointer.reinterpret()
        )

    /**
     * Calls a function for each selected node. Note that you cannot modify
     * the tree or selection from within this function. As a result,
     * gtk_tree_selection_get_selected_rows() might be more useful.
     *
     * @param func The function to call for each selected node.
     */
    public open fun selectedForeach(func: TreeSelectionForeachFunc): Unit =
        gtk_tree_selection_selected_foreach(
            gtkTreeSelectionPointer.reinterpret(),
            TreeSelectionForeachFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Sets the selection mode of the @selection.  If the previous type was
     * %GTK_SELECTION_MULTIPLE, then the anchor is kept selected, if it was
     * previously selected.
     *
     * @param type The selection mode
     */
    public open fun setMode(type: SelectionMode): Unit =
        gtk_tree_selection_set_mode(gtkTreeSelectionPointer.reinterpret(), type.nativeValue)

    /**
     * Sets the selection function.
     *
     * If set, this function is called before any node is selected or unselected,
     * giving some control over which nodes are selected. The select function
     * should return true if the state of the node may be toggled, and false
     * if the state of the node should be left unchanged.
     *
     * @param func The selection function. May be null
     */
    public open fun setSelectFunction(func: TreeSelectionFunc): Unit =
        gtk_tree_selection_set_select_function(
            gtkTreeSelectionPointer.reinterpret(),
            TreeSelectionFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Unselects all the nodes.
     */
    public open fun unselectAll(): Unit = gtk_tree_selection_unselect_all(gtkTreeSelectionPointer.reinterpret())

    /**
     * Unselects the specified iterator.
     *
     * @param iter The `GtkTreeIter` to be unselected.
     */
    public open fun unselectIter(iter: TreeIter): Unit =
        gtk_tree_selection_unselect_iter(gtkTreeSelectionPointer.reinterpret(), iter.gtkTreeIterPointer.reinterpret())

    /**
     * Unselects the row at @path.
     *
     * @param path The `GtkTreePath` to be unselected.
     */
    public open fun unselectPath(path: TreePath): Unit =
        gtk_tree_selection_unselect_path(gtkTreeSelectionPointer.reinterpret(), path.gtkTreePathPointer.reinterpret())

    /**
     * Unselects a range of nodes, determined by @start_path and @end_path
     * inclusive.
     *
     * @param startPath The initial node of the range.
     * @param endPath The initial node of the range.
     */
    public open fun unselectRange(
        startPath: TreePath,
        endPath: TreePath,
    ): Unit =
        gtk_tree_selection_unselect_range(
            gtkTreeSelectionPointer.reinterpret(),
            startPath.gtkTreePathPointer.reinterpret(),
            endPath.gtkTreePathPointer.reinterpret()
        )

    /**
     * Emitted whenever the selection has (possibly) changed. Please note that
     * this signal is mostly a hint.  It may only be emitted once when a range
     * of rows are selected, and it may occasionally be emitted when nothing
     * has happened.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TreeSelection> {
        override val type: GeneratedClassKGType<TreeSelection> =
            GeneratedClassKGType(gtk_tree_selection_get_type()) { TreeSelection(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
