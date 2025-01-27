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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.GtkTreeSortable
import org.gtkkn.native.gtk.gtk_tree_sortable_get_type
import org.gtkkn.native.gtk.gtk_tree_sortable_has_default_sort_func
import org.gtkkn.native.gtk.gtk_tree_sortable_set_default_sort_func
import org.gtkkn.native.gtk.gtk_tree_sortable_set_sort_column_id
import org.gtkkn.native.gtk.gtk_tree_sortable_set_sort_func
import org.gtkkn.native.gtk.gtk_tree_sortable_sort_column_changed
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * The interface for sortable models used by GtkTreeView
 *
 * `GtkTreeSortable` is an interface to be implemented by tree models which
 * support sorting. The `GtkTreeView` uses the methods provided by this interface
 * to sort the model.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `sort_column_id`: sort_column_id: Out parameter is not supported
 */
public interface TreeSortable :
    Proxy,
    TreeModel,
    KGTyped {
    public val gtkTreeSortablePointer: CPointer<GtkTreeSortable>

    override val gtkTreeModelPointer: CPointer<GtkTreeModel>
        get() = gtkTreeSortablePointer.reinterpret()

    /**
     * Returns true if the model has a default sort function. This is used
     * primarily by GtkTreeViewColumns in order to determine if a model can
     * go back to the default state, or not.
     *
     * @return true, if the model has a default sort function
     */
    public fun hasDefaultSortFunc(): Boolean =
        gtk_tree_sortable_has_default_sort_func(gtkTreeSortablePointer).asBoolean()

    /**
     * Sets the default comparison function used when sorting to be @sort_func.
     * If the current sort column id of @sortable is
     * %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID, then the model will sort using
     * this function.
     *
     * If @sort_func is null, then there will be no default comparison function.
     * This means that once the model  has been sorted, it can’t go back to the
     * default state. In this case, when the current sort column id of @sortable
     * is %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID, the model will be unsorted.
     *
     * @param sortFunc The comparison function
     */
    public fun setDefaultSortFunc(sortFunc: TreeIterCompareFunc): Unit = gtk_tree_sortable_set_default_sort_func(
        gtkTreeSortablePointer,
        TreeIterCompareFuncFunc.reinterpret(),
        StableRef.create(sortFunc).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Sets the current sort column to be @sort_column_id. The @sortable will
     * resort itself to reflect this change, after emitting a
     * `GtkTreeSortable::sort-column-changed` signal. @sort_column_id may either be
     * a regular column id, or one of the following special values:
     *
     * - %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: the default sort function
     *   will be used, if it is set
     *
     * - %GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: no sorting will occur
     *
     * @param sortColumnId the sort column id to set
     * @param order The sort order of the column
     */
    public fun setSortColumnId(sortColumnId: gint, order: SortType): Unit =
        gtk_tree_sortable_set_sort_column_id(gtkTreeSortablePointer, sortColumnId, order.nativeValue)

    /**
     * Sets the comparison function used when sorting to be @sort_func. If the
     * current sort column id of @sortable is the same as @sort_column_id, then
     * the model will sort using this function.
     *
     * @param sortColumnId the sort column id to set the function for
     * @param sortFunc The comparison function
     */
    public fun setSortFunc(sortColumnId: gint, sortFunc: TreeIterCompareFunc): Unit = gtk_tree_sortable_set_sort_func(
        gtkTreeSortablePointer,
        sortColumnId,
        TreeIterCompareFuncFunc.reinterpret(),
        StableRef.create(sortFunc).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Emits a `GtkTreeSortable::sort-column-changed` signal on @sortable.
     */
    public fun sortColumnChanged(): Unit = gtk_tree_sortable_sort_column_changed(gtkTreeSortablePointer)

    /**
     * The ::sort-column-changed signal is emitted when the sort column
     * or sort order of @sortable is changed. The signal is emitted before
     * the contents of @sortable are resorted.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSortColumnChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkTreeSortablePointer,
            "sort-column-changed",
            onSortColumnChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The TreeSortableImpl type represents a native instance of the TreeSortable interface.
     *
     * @constructor Creates a new instance of TreeSortable for the provided [CPointer].
     */
    public data class TreeSortableImpl(override val gtkTreeSortablePointer: CPointer<GtkTreeSortable>) :
        Object(gtkTreeSortablePointer.reinterpret()),
        TreeSortable

    public companion object : TypeCompanion<TreeSortable> {
        override val type: GeneratedInterfaceKGType<TreeSortable> =
            GeneratedInterfaceKGType(getTypeOrNull("gtk_tree_sortable_get_type")!!) {
                TreeSortableImpl(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeSortable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_sortable_get_type()
    }
}

private val onSortColumnChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
