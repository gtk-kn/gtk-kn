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
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkListStore
import org.gtkkn.native.gtk.GtkTreeDragDest
import org.gtkkn.native.gtk.GtkTreeDragSource
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.GtkTreeSortable
import org.gtkkn.native.gtk.gtk_list_store_append
import org.gtkkn.native.gtk.gtk_list_store_clear
import org.gtkkn.native.gtk.gtk_list_store_get_type
import org.gtkkn.native.gtk.gtk_list_store_insert
import org.gtkkn.native.gtk.gtk_list_store_insert_after
import org.gtkkn.native.gtk.gtk_list_store_insert_before
import org.gtkkn.native.gtk.gtk_list_store_iter_is_valid
import org.gtkkn.native.gtk.gtk_list_store_move_after
import org.gtkkn.native.gtk.gtk_list_store_move_before
import org.gtkkn.native.gtk.gtk_list_store_prepend
import org.gtkkn.native.gtk.gtk_list_store_remove
import org.gtkkn.native.gtk.gtk_list_store_set_value
import org.gtkkn.native.gtk.gtk_list_store_swap
import kotlin.Boolean
import kotlin.Unit

/**
 * A list-like data structure that can be used with the [class@Gtk.TreeView].
 *
 * The `GtkListStore` object is a list model for use with a `GtkTreeView`
 * widget.  It implements the `GtkTreeModel` interface, and consequentialy,
 * can use all of the methods available there.  It also implements the
 * `GtkTreeSortable` interface so it can be sorted by the view.
 * Finally, it also implements the tree
 * [drag](iface.TreeDragSource.html) and [drop](iface.TreeDragDest.html)
 * interfaces.
 *
 * The `GtkListStore` can accept most `GType`s as a column type, though
 * it can’t accept all custom types.  Internally, it will keep a copy of
 * data passed in (such as a string or a boxed pointer).  Columns that
 * accept `GObject`s are handled a little differently.  The
 * `GtkListStore` will keep a reference to the object instead of copying the
 * value.  As a result, if the object is modified, it is up to the
 * application writer to call [method@Gtk.TreeModel.row_changed] to emit the
 * [signal@Gtk.TreeModel::row_changed] signal. This most commonly affects lists
 * with [class@Gdk.Texture]s stored.
 *
 * An example for creating a simple list store:
 *
 * ```c
 * enum {
 *   COLUMN_STRING,
 *   COLUMN_INT,
 *   COLUMN_BOOLEAN,
 *   N_COLUMNS
 * };
 *
 * {
 *   GtkListStore *list_store;
 *   GtkTreePath *path;
 *   GtkTreeIter iter;
 *   int i;
 *
 *   list_store = gtk_list_store_new (N_COLUMNS,
 *                                    G_TYPE_STRING,
 *                                    G_TYPE_INT,
 *                                    G_TYPE_BOOLEAN);
 *
 *   for (i = 0; i < 10; i++)
 *     {
 *       char *some_data;
 *
 *       some_data = get_some_data (i);
 *
 *       // Add a new row to the model
 *       gtk_list_store_append (list_store, &iter);
 *       gtk_list_store_set (list_store, &iter,
 *                           COLUMN_STRING, some_data,
 *                           COLUMN_INT, i,
 *                           COLUMN_BOOLEAN,  FALSE,
 *                           -1);
 *
 *       // As the store will keep a copy of the string internally,
 *       // we free some_data.
 *       g_free (some_data);
 *     }
 *
 *   // Modify a particular row
 *   path = gtk_tree_path_new_from_string ("4");
 *   gtk_tree_model_get_iter (GTK_TREE_MODEL (list_store),
 *                            &iter,
 *                            path);
 *   gtk_tree_path_free (path);
 *   gtk_list_store_set (list_store, &iter,
 *                       COLUMN_BOOLEAN, TRUE,
 *                       -1);
 * }
 * ```
 *
 * `GtkListStore` is deprecated since GTK 4.10, and should not be used in newly
 * written code. You should use [class@Gio.ListStore] instead, and the various
 * list models provided by GTK.
 *
 * ## Performance Considerations
 *
 * Internally, the `GtkListStore` was originally implemented with a linked list
 * with a tail pointer.  As a result, it was fast at data insertion and deletion,
 * and not fast at random data access.  The `GtkListStore` sets the
 * `GTK_TREE_MODEL_ITERS_PERSIST` flag, which means that `GtkTreeIter`s can be
 * cached while the row exists.  Thus, if access to a particular row is needed
 * often and your code is expected to run on older versions of GTK, it is worth
 * keeping the iter around.
 *
 * ## Atomic Operations
 *
 * It is important to note that only the methods
 * gtk_list_store_insert_with_values() and gtk_list_store_insert_with_valuesv()
 * are atomic, in the sense that the row is being appended to the store and the
 * values filled in in a single operation with regard to `GtkTreeModel` signaling.
 * In contrast, using e.g. gtk_list_store_append() and then gtk_list_store_set()
 * will first create a row, which triggers the `GtkTreeModel::row-inserted` signal
 * on `GtkListStore`. The row, however, is still empty, and any signal handler
 * connecting to `GtkTreeModel::row-inserted` on this particular store should be prepared
 * for the situation that the row might be empty. This is especially important
 * if you are wrapping the `GtkListStore` inside a `GtkTreeModel`Filter and are
 * using a `GtkTreeModel`FilterVisibleFunc. Using any of the non-atomic operations
 * to append rows to the `GtkListStore` will cause the
 * `GtkTreeModel`FilterVisibleFunc to be visited with an empty row first; the
 * function must be prepared for that.
 *
 * ## GtkListStore as GtkBuildable
 *
 * The GtkListStore implementation of the [iface@Gtk.Buildable] interface allows
 * to specify the model columns with a `<columns>` element that may contain
 * multiple `<column>` elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 *
 * Additionally, it is possible to specify content for the list store
 * in the UI definition, with the `<data>` element. It can contain multiple
 * `<row>` elements, each specifying to content for one row of the list model.
 * Inside a `<row>`, the `<col>` elements specify the content for individual cells.
 *
 * Note that it is probably more common to define your models in the code,
 * and one might consider it a layering violation to specify the content of
 * a list store in a UI definition, data, not presentation, and common wisdom
 * is to separate the two, as far as possible.
 *
 * An example of a UI Definition fragment for a list store:
 *
 * ```xml
 * <object class="GtkListStore">
 *   <columns>
 *     <column type="gchararray"/>
 *     <column type="gchararray"/>
 *     <column type="gint"/>
 *   </columns>
 *   <data>
 *     <row>
 *       <col id="0">John</col>
 *       <col id="1">Doe</col>
 *       <col id="2">25</col>
 *     </row>
 *     <row>
 *       <col id="0">Johan</col>
 *       <col id="1">Dahlin</col>
 *       <col id="2">50</col>
 *     </row>
 *   </data>
 * </object>
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `columns`: Array parameter of type gint is not supported
 * - parameter `new_order`: Array parameter of type gint is not supported
 * - parameter `types`: Array parameter of type GType is not supported
 * - parameter `var_args`: va_list
 * - parameter `columns`: Array parameter of type gint is not supported
 * - parameter `types`: Array parameter of type GType is not supported
 */
public open class ListStore(pointer: CPointer<GtkListStore>) :
    Object(pointer.reinterpret()),
    Buildable,
    TreeDragDest,
    TreeDragSource,
    TreeModel,
    TreeSortable,
    KGTyped {
    public val gtkListStorePointer: CPointer<GtkListStore>
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
     * Appends a new row to @list_store.  @iter will be changed to point to this new
     * row.  The row will be empty after this function is called.  To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the appended row
     */
    public open fun append(iter: TreeIter): Unit =
        gtk_list_store_append(gtkListStorePointer.reinterpret(), iter.gtkTreeIterPointer.reinterpret())

    /**
     * Removes all rows from the list store.
     */
    public open fun clear(): Unit = gtk_list_store_clear(gtkListStorePointer.reinterpret())

    /**
     * Creates a new row at @position.  @iter will be changed to point to this new
     * row.  If @position is -1 or is larger than the number of rows on the list,
     * then the new row will be appended to the list. The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_list_store_set() or gtk_list_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param position position to insert the new row, or -1 for last
     */
    public open fun insert(iter: TreeIter, position: gint): Unit =
        gtk_list_store_insert(gtkListStorePointer.reinterpret(), iter.gtkTreeIterPointer.reinterpret(), position)

    /**
     * Inserts a new row after @sibling. If @sibling is null, then the row will be
     * prepended to the beginning of the list. @iter will be changed to point to
     * this new row. The row will be empty after this function is called. To fill
     * in values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param sibling A valid `GtkTreeIter`
     */
    public open fun insertAfter(iter: TreeIter, sibling: TreeIter? = null): Unit = gtk_list_store_insert_after(
        gtkListStorePointer.reinterpret(),
        iter.gtkTreeIterPointer.reinterpret(),
        sibling?.gtkTreeIterPointer?.reinterpret()
    )

    /**
     * Inserts a new row before @sibling. If @sibling is null, then the row will
     * be appended to the end of the list. @iter will be changed to point to this
     * new row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the new row
     * @param sibling A valid `GtkTreeIter`
     */
    public open fun insertBefore(iter: TreeIter, sibling: TreeIter? = null): Unit = gtk_list_store_insert_before(
        gtkListStorePointer.reinterpret(),
        iter.gtkTreeIterPointer.reinterpret(),
        sibling?.gtkTreeIterPointer?.reinterpret()
    )

    /**
     * Checks if the given iter is a valid iter for this `GtkListStore`.
     *
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     *
     * @param iter the iterator to check
     * @return true if the iter is valid, false if the iter is invalid.
     */
    public open fun iterIsValid(iter: TreeIter): Boolean = gtk_list_store_iter_is_valid(
        gtkListStorePointer.reinterpret(),
        iter.gtkTreeIterPointer.reinterpret()
    ).asBoolean()

    /**
     * Moves @iter in @store to the position after @position. Note that this
     * function only works with unsorted stores. If @position is null, @iter
     * will be moved to the start of the list.
     *
     * @param iter A `GtkTreeIter`
     * @param position A `GtkTreeIter`
     */
    public open fun moveAfter(iter: TreeIter, position: TreeIter? = null): Unit = gtk_list_store_move_after(
        gtkListStorePointer.reinterpret(),
        iter.gtkTreeIterPointer.reinterpret(),
        position?.gtkTreeIterPointer?.reinterpret()
    )

    /**
     * Moves @iter in @store to the position before @position. Note that this
     * function only works with unsorted stores. If @position is null, @iter
     * will be moved to the end of the list.
     *
     * @param iter A `GtkTreeIter`
     * @param position A `GtkTreeIter`
     */
    public open fun moveBefore(iter: TreeIter, position: TreeIter? = null): Unit = gtk_list_store_move_before(
        gtkListStorePointer.reinterpret(),
        iter.gtkTreeIterPointer.reinterpret(),
        position?.gtkTreeIterPointer?.reinterpret()
    )

    /**
     * Prepends a new row to @list_store. @iter will be changed to point to this new
     * row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     *
     * @param iter An unset `GtkTreeIter` to set to the prepend row
     */
    public open fun prepend(iter: TreeIter): Unit =
        gtk_list_store_prepend(gtkListStorePointer.reinterpret(), iter.gtkTreeIterPointer.reinterpret())

    /**
     * Removes the given row from the list store.  After being removed,
     * @iter is set to be the next valid row, or invalidated if it pointed
     * to the last row in @list_store.
     *
     * @param iter A valid `GtkTreeIter`
     * @return true if @iter is valid, false if not.
     */
    public open fun remove(iter: TreeIter): Boolean =
        gtk_list_store_remove(gtkListStorePointer.reinterpret(), iter.gtkTreeIterPointer.reinterpret()).asBoolean()

    /**
     * Sets the data in the cell specified by @iter and @column.
     * The type of @value must be convertible to the type of the
     * column.
     *
     * @param iter A valid `GtkTreeIter` for the row being modified
     * @param column column number to modify
     * @param value new value for the cell
     */
    public open fun setValue(iter: TreeIter, column: gint, `value`: Value): Unit = gtk_list_store_set_value(
        gtkListStorePointer.reinterpret(),
        iter.gtkTreeIterPointer.reinterpret(),
        column,
        `value`.gobjectValuePointer.reinterpret()
    )

    /**
     * Swaps @a and @b in @store. Note that this function only works with
     * unsorted stores.
     *
     * @param a A `GtkTreeIter`
     * @param b Another `GtkTreeIter`
     */
    public open fun swap(a: TreeIter, b: TreeIter): Unit = gtk_list_store_swap(
        gtkListStorePointer.reinterpret(),
        a.gtkTreeIterPointer.reinterpret(),
        b.gtkTreeIterPointer.reinterpret()
    )

    public companion object : TypeCompanion<ListStore> {
        override val type: GeneratedClassKGType<ListStore> =
            GeneratedClassKGType(gtk_list_store_get_type()) { ListStore(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListStore
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_store_get_type()
    }
}
