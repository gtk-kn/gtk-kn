// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeListRowSorter
import org.gtkkn.native.gtk.gtk_tree_list_row_sorter_get_sorter
import org.gtkkn.native.gtk.gtk_tree_list_row_sorter_get_type
import org.gtkkn.native.gtk.gtk_tree_list_row_sorter_new
import org.gtkkn.native.gtk.gtk_tree_list_row_sorter_set_sorter

/**
 * `GtkTreeListRowSorter` is a special-purpose sorter that will apply a given
 * sorter to the levels in a tree.
 *
 * Here is an example for setting up a column view with a tree model and
 * a `GtkTreeListSorter`:
 *
 * ```c
 * column_sorter = gtk_column_view_get_sorter (view);
 * sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
 * sort_model = gtk_sort_list_model_new (tree_model, sorter);
 * selection = gtk_single_selection_new (sort_model);
 * gtk_column_view_set_model (view, G_LIST_MODEL (selection));
 * ```
 */
public open class TreeListRowSorter(pointer: CPointer<GtkTreeListRowSorter>) :
    Sorter(pointer.reinterpret()),
    KGTyped {
    public val gtkTreeListRowSorterPointer: CPointer<GtkTreeListRowSorter>
        get() = gPointer.reinterpret()

    /**
     * The underlying sorter
     */
    public open var sorter: Sorter?
        /**
         * Returns the sorter used by @self.
         *
         * @return the sorter used
         */
        get() = gtk_tree_list_row_sorter_get_sorter(gtkTreeListRowSorterPointer)?.run {
            Sorter(this)
        }

        /**
         * Sets the sorter to use for items with the same parent.
         *
         * This sorter will be passed the [property@Gtk.TreeListRow:item] of
         * the tree list rows passed to @self.
         *
         * @param sorter The sorter to use
         */
        set(sorter) = gtk_tree_list_row_sorter_set_sorter(gtkTreeListRowSorterPointer, sorter?.gtkSorterPointer)

    /**
     * Create a special-purpose sorter that applies the sorting
     * of @sorter to the levels of a `GtkTreeListModel`.
     *
     * Note that this sorter relies on [property@Gtk.TreeListModel:passthrough]
     * being false as it can only sort [class@Gtk.TreeListRow]s.
     *
     * @param sorter a `GtkSorter`
     * @return a new `GtkTreeListRowSorter`
     */
    public constructor(
        sorter: Sorter? = null,
    ) : this(gtk_tree_list_row_sorter_new(sorter?.gtkSorterPointer)!!.reinterpret())

    public companion object : TypeCompanion<TreeListRowSorter> {
        override val type: GeneratedClassKGType<TreeListRowSorter> =
            GeneratedClassKGType(gtk_tree_list_row_sorter_get_type()) { TreeListRowSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeListRowSorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_list_row_sorter_get_type()
    }
}
