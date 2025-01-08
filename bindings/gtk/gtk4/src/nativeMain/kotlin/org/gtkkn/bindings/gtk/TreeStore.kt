// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkTreeDragDest
import org.gtkkn.native.gtk.GtkTreeDragSource
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.GtkTreeSortable
import org.gtkkn.native.gtk.GtkTreeStore
import org.gtkkn.native.gtk.gtk_tree_store_append
import org.gtkkn.native.gtk.gtk_tree_store_clear
import org.gtkkn.native.gtk.gtk_tree_store_get_type
import org.gtkkn.native.gtk.gtk_tree_store_insert
import org.gtkkn.native.gtk.gtk_tree_store_insert_after
import org.gtkkn.native.gtk.gtk_tree_store_insert_before
import org.gtkkn.native.gtk.gtk_tree_store_is_ancestor
import org.gtkkn.native.gtk.gtk_tree_store_iter_depth
import org.gtkkn.native.gtk.gtk_tree_store_iter_is_valid
import org.gtkkn.native.gtk.gtk_tree_store_move_after
import org.gtkkn.native.gtk.gtk_tree_store_move_before
import org.gtkkn.native.gtk.gtk_tree_store_prepend
import org.gtkkn.native.gtk.gtk_tree_store_remove
import org.gtkkn.native.gtk.gtk_tree_store_set_value
import org.gtkkn.native.gtk.gtk_tree_store_swap
import kotlin.Boolean
import kotlin.Unit

/**
 * A tree-like data structure that can be used with the [class@Gtk.TreeView].
 *
 * The `GtkTreeStore` object is a list model for use with a `GtkTreeView`
 * widget. It implements the [iface@Gtk.TreeModel] interface, and consequently,
 * can use all of the methods available there. It also implements the
 * [iface@Gtk.TreeSortable] interface so it can be sorted by the view.
 * Finally, it also implements the tree [drag][iface@Gtk.TreeDragSource]
 * and [drop][iface@Gtk.TreeDragDest] interfaces.
 *
 * `GtkTreeStore` is deprecated since GTK 4.10, and should not be used in newly
 * written code. You should use [class@Gtk.TreeListModel] for a tree-like model
 * object.
 *
 * ## GtkTreeStore as GtkBuildable
 *
 * The GtkTreeStore implementation of the `GtkBuildable` interface allows
 * to specify the model columns with a `<columns>` element that may contain
 * multiple `<column>` elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 *
 * An example of a UI Definition fragment for a tree store:
 *
 * ```xml
 * <object class="GtkTreeStore">
 *   <columns>
 *     <column type="gchararray"/>
 *     <column type="gchararray"/>
 *     <column type="gint"/>
 *   </columns>
 * </object>
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `columns`: Array parameter of type gint is not supported
 * - parameter `new_order`: Array parameter of type gint is not supported
 * - parameter `types`: Array parameter of type GType is not supported
 * - parameter `var_args`: va_list type is not supported
 * - parameter `columns`: Array parameter of type gint is not supported
 * - parameter `types`: Array parameter of type GType is not supported
 */
public open class TreeStore(pointer: CPointer<GtkTreeStore>) :
    Object(pointer.reinterpret()),
    Buildable,
    TreeDragDest,
    TreeDragSource,
    TreeModel,
    TreeSortable,
    KGTyped {
    public val gtkTreeStorePointer: CPointer<GtkTreeStore>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkTreeDragDestPointer: CPointer<GtkTreeDragDest>
        get() = gPointer.reinterpret()

    override val gtkTreeDragSourcePointer: CPointer<GtkTreeDragSource>
        get() = gPointer.reinterpret()

    override val gtkTreeModelPointer: CPointer<GtkTreeModel>
        get() = gPointer.reinterpret()

    override val gtkTreeSortablePointer: CPointer<GtkTreeSortable>
        get() = gPointer.reinterpret()

    /**
     * Appends a new row to @tree_store.
     *
     * If @parent is non-null, then it will append the new row after the last
     * child of @parent, otherwise it will append a row to the top level.
     *
     * The @iter parameter will be changed to point to this new row. The row will
     * be empty after this function is called. To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the appended row
     * @param parent A valid `GtkTreeIter`
     */
    public open fun append(iter: TreeIter, parent: TreeIter? = null): Unit =
        gtk_tree_store_append(gtkTreeStorePointer, iter.gPointer, parent?.gPointer)

    /**
     * Removes all rows from @tree_store
     */
    public open fun clear(): Unit = gtk_tree_store_clear(gtkTreeStorePointer)

    /**
     * Creates a new row at @position.
     *
     * If parent is non-null, then the row will be made a child of @parent.
     * Otherwise, the row will be created at the toplevel.
     *
     * If @position is `-1` or is larger than the number of rows at that level,
     * then the new row will be inserted to the end of the list.
     *
     * The @iter parameter will be changed to point to this new row. The row
     * will be empty after this function is called. To fill in values, you
     * need to call gtk_tree_store_set() or gtk_tree_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param parent A valid `GtkTreeIter`
     * @param position position to insert the new row, or -1 for last
     */
    public open fun insert(iter: TreeIter, parent: TreeIter? = null, position: gint): Unit =
        gtk_tree_store_insert(gtkTreeStorePointer, iter.gPointer, parent?.gPointer, position)

    /**
     * Inserts a new row after @sibling.
     *
     * If @sibling is null, then the row will be prepended to @parent’s children.
     *
     * If @parent and @sibling are null, then the row will be prepended to the
     * toplevel.
     *
     * If both @sibling and @parent are set, then @parent must be the parent
     * of @sibling. When @sibling is set, @parent is optional.
     *
     * The @iter parameter will be changed to point to this new row. The row will
     * be empty after this function is called. To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param parent A valid `GtkTreeIter`
     * @param sibling A valid `GtkTreeIter`
     */
    public open fun insertAfter(iter: TreeIter, parent: TreeIter? = null, sibling: TreeIter? = null): Unit =
        gtk_tree_store_insert_after(gtkTreeStorePointer, iter.gPointer, parent?.gPointer, sibling?.gPointer)

    /**
     * Inserts a new row before @sibling.
     *
     * If @sibling is null, then the row will be appended to @parent’s children.
     *
     * If @parent and @sibling are null, then the row will be appended to the
     * toplevel.
     *
     * If both @sibling and @parent are set, then @parent must be the parent
     * of @sibling. When @sibling is set, @parent is optional.
     *
     * The @iter parameter will be changed to point to this new row. The row will
     * be empty after this function is called. To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param parent A valid `GtkTreeIter`
     * @param sibling A valid `GtkTreeIter`
     */
    public open fun insertBefore(iter: TreeIter, parent: TreeIter? = null, sibling: TreeIter? = null): Unit =
        gtk_tree_store_insert_before(gtkTreeStorePointer, iter.gPointer, parent?.gPointer, sibling?.gPointer)

    /**
     * Checks if @iter is an ancestor of @descendant.
     *
     * @param iter A valid `GtkTreeIter`
     * @param descendant A valid `GtkTreeIter`
     * @return true if @iter is an ancestor of @descendant, and false otherwise
     */
    public open fun isAncestor(iter: TreeIter, descendant: TreeIter): Boolean =
        gtk_tree_store_is_ancestor(gtkTreeStorePointer, iter.gPointer, descendant.gPointer).asBoolean()

    /**
     * Returns the depth of the position pointed by the iterator
     *
     * The depth will be 0 for anything on the root level, 1 for anything down
     * a level, etc.
     *
     * @param iter A valid `GtkTreeIter`
     * @return The depth of the position pointed by the iterator
     */
    public open fun iterDepth(iter: TreeIter): gint = gtk_tree_store_iter_depth(gtkTreeStorePointer, iter.gPointer)

    /**
     * Checks if the given iter is a valid iter for this `GtkTreeStore`.
     *
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     *
     * @param iter the iterator to check
     * @return true if the iter is valid, and false otherwise
     */
    public open fun iterIsValid(iter: TreeIter): Boolean =
        gtk_tree_store_iter_is_valid(gtkTreeStorePointer, iter.gPointer).asBoolean()

    /**
     * Moves @iter in @tree_store to the position after @position.
     *
     * @iter and @position should be in the same level.
     *
     * Note that this function only works with unsorted stores.
     *
     * If @position is null, @iter will be moved to the start of the level.
     *
     * @param iter A `GtkTreeIter`.
     * @param position A `GtkTreeIter`.
     */
    public open fun moveAfter(iter: TreeIter, position: TreeIter? = null): Unit =
        gtk_tree_store_move_after(gtkTreeStorePointer, iter.gPointer, position?.gPointer)

    /**
     * Moves @iter in @tree_store to the position before @position.
     *
     * @iter and @position should be in the same level.
     *
     * Note that this function only works with unsorted stores.
     *
     * If @position is null, @iter will be moved to the end of the level.
     *
     * @param iter A `GtkTreeIter`
     * @param position A `GtkTreeIter`
     */
    public open fun moveBefore(iter: TreeIter, position: TreeIter? = null): Unit =
        gtk_tree_store_move_before(gtkTreeStorePointer, iter.gPointer, position?.gPointer)

    /**
     * Prepends a new row to @tree_store.
     *
     * If @parent is non-null, then it will prepend the new row before the first
     * child of @parent, otherwise it will prepend a row to the top level. The
     * `iter` parameter will be changed to point to this new row.  The row will
     * be empty after this function is called. To fill in values, you need to
     * call gtk_tree_store_set() or gtk_tree_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the prepended row
     * @param parent A valid `GtkTreeIter`
     */
    public open fun prepend(iter: TreeIter, parent: TreeIter? = null): Unit =
        gtk_tree_store_prepend(gtkTreeStorePointer, iter.gPointer, parent?.gPointer)

    /**
     * Removes @iter from @tree_store.
     *
     * After being removed, @iter is set to the next valid row at that level, or
     * invalidated if it previously pointed to the last one.
     *
     * @param iter A valid `GtkTreeIter`
     * @return true if @iter is still valid, and false otherwise
     */
    public open fun remove(iter: TreeIter): Boolean =
        gtk_tree_store_remove(gtkTreeStorePointer, iter.gPointer).asBoolean()

    /**
     * Sets the data in the cell specified by @iter and @column.
     *
     * The type of @value must be convertible to the type of the
     * column.
     *
     * @param iter A valid `GtkTreeIter` for the row being modified
     * @param column column number to modify
     * @param value new value for the cell
     */
    public open fun setValue(iter: TreeIter, column: gint, `value`: Value): Unit =
        gtk_tree_store_set_value(gtkTreeStorePointer, iter.gPointer, column, `value`.gPointer)

    /**
     * Swaps @a and @b in the same level of @tree_store.
     *
     * Note that this function only works with unsorted stores.
     *
     * @param a A `GtkTreeIter`.
     * @param b Another `GtkTreeIter`.
     */
    public open fun swap(a: TreeIter, b: TreeIter): Unit =
        gtk_tree_store_swap(gtkTreeStorePointer, a.gPointer, b.gPointer)

    public companion object : TypeCompanion<TreeStore> {
        override val type: GeneratedClassKGType<TreeStore> =
            GeneratedClassKGType(gtk_tree_store_get_type()) { TreeStore(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeStore
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_store_get_type()
    }
}
