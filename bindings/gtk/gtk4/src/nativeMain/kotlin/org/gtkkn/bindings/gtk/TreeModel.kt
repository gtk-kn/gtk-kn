// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.GtkTreePath
import org.gtkkn.native.gtk.gtk_tree_model_filter_new
import org.gtkkn.native.gtk.gtk_tree_model_foreach
import org.gtkkn.native.gtk.gtk_tree_model_get_column_type
import org.gtkkn.native.gtk.gtk_tree_model_get_flags
import org.gtkkn.native.gtk.gtk_tree_model_get_iter
import org.gtkkn.native.gtk.gtk_tree_model_get_iter_first
import org.gtkkn.native.gtk.gtk_tree_model_get_iter_from_string
import org.gtkkn.native.gtk.gtk_tree_model_get_n_columns
import org.gtkkn.native.gtk.gtk_tree_model_get_path
import org.gtkkn.native.gtk.gtk_tree_model_get_string_from_iter
import org.gtkkn.native.gtk.gtk_tree_model_get_type
import org.gtkkn.native.gtk.gtk_tree_model_get_value
import org.gtkkn.native.gtk.gtk_tree_model_iter_children
import org.gtkkn.native.gtk.gtk_tree_model_iter_has_child
import org.gtkkn.native.gtk.gtk_tree_model_iter_n_children
import org.gtkkn.native.gtk.gtk_tree_model_iter_next
import org.gtkkn.native.gtk.gtk_tree_model_iter_nth_child
import org.gtkkn.native.gtk.gtk_tree_model_iter_parent
import org.gtkkn.native.gtk.gtk_tree_model_iter_previous
import org.gtkkn.native.gtk.gtk_tree_model_ref_node
import org.gtkkn.native.gtk.gtk_tree_model_row_changed
import org.gtkkn.native.gtk.gtk_tree_model_row_deleted
import org.gtkkn.native.gtk.gtk_tree_model_row_has_child_toggled
import org.gtkkn.native.gtk.gtk_tree_model_row_inserted
import org.gtkkn.native.gtk.gtk_tree_model_unref_node
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The tree interface used by GtkTreeView
 *
 * The `GtkTreeModel` interface defines a generic tree interface for
 * use by the `GtkTreeView` widget. It is an abstract interface, and
 * is designed to be usable with any appropriate data structure. The
 * programmer just has to implement this interface on their own data
 * type for it to be viewable by a `GtkTreeView` widget.
 *
 * The model is represented as a hierarchical tree of strongly-typed,
 * columned data. In other words, the model can be seen as a tree where
 * every node has different values depending on which column is being
 * queried. The type of data found in a column is determined by using
 * the GType system (ie. %G_TYPE_INT, %GTK_TYPE_BUTTON, %G_TYPE_POINTER,
 * etc). The types are homogeneous per column across all nodes. It is
 * important to note that this interface only provides a way of examining
 * a model and observing changes. The implementation of each individual
 * model decides how and if changes are made.
 *
 * In order to make life simpler for programmers who do not need to
 * write their own specialized model, two generic models are provided
 * — the `GtkTreeStore` and the `GtkListStore`. To use these, the
 * developer simply pushes data into these models as necessary. These
 * models provide the data structure as well as all appropriate tree
 * interfaces. As a result, implementing drag and drop, sorting, and
 * storing data is trivial. For the vast majority of trees and lists,
 * these two models are sufficient.
 *
 * Models are accessed on a node/column level of granularity. One can
 * query for the value of a model at a certain node and a certain
 * column on that node. There are two structures used to reference a
 * particular node in a model. They are the [struct@Gtk.TreePath] and
 * the [struct@Gtk.TreeIter] (“iter” is short for iterator). Most of the
 * interface consists of operations on a [struct@Gtk.TreeIter].
 *
 * A path is essentially a potential node. It is a location on a model
 * that may or may not actually correspond to a node on a specific
 * model. A [struct@Gtk.TreePath] can be converted into either an
 * array of unsigned integers or a string. The string form is a list
 * of numbers separated by a colon. Each number refers to the offset
 * at that level. Thus, the path `0` refers to the root
 * node and the path `2:4` refers to the fifth child of
 * the third node.
 *
 * By contrast, a [struct@Gtk.TreeIter] is a reference to a specific node on
 * a specific model. It is a generic struct with an integer and three
 * generic pointers. These are filled in by the model in a model-specific
 * way. One can convert a path to an iterator by calling
 * gtk_tree_model_get_iter(). These iterators are the primary way
 * of accessing a model and are similar to the iterators used by
 * `GtkTextBuffer`. They are generally statically allocated on the
 * stack and only used for a short time. The model interface defines
 * a set of operations using them for navigating the model.
 *
 * It is expected that models fill in the iterator with private data.
 * For example, the `GtkListStore` model, which is internally a simple
 * linked list, stores a list node in one of the pointers. The
 * `GtkTreeModel`Sort stores an array and an offset in two of the
 * pointers. Additionally, there is an integer field. This field is
 * generally filled with a unique stamp per model. This stamp is for
 * catching errors resulting from using invalid iterators with a model.
 *
 * The lifecycle of an iterator can be a little confusing at first.
 * Iterators are expected to always be valid for as long as the model
 * is unchanged (and doesn’t emit a signal). The model is considered
 * to own all outstanding iterators and nothing needs to be done to
 * free them from the user’s point of view. Additionally, some models
 * guarantee that an iterator is valid for as long as the node it refers
 * to is valid (most notably the `GtkTreeStore` and `GtkListStore`).
 * Although generally uninteresting, as one always has to allow for
 * the case where iterators do not persist beyond a signal, some very
 * important performance enhancements were made in the sort model.
 * As a result, the %GTK_TREE_MODEL_ITERS_PERSIST flag was added to
 * indicate this behavior.
 *
 * To help show some common operation of a model, some examples are
 * provided. The first example shows three ways of getting the iter at
 * the location `3:2:5`. While the first method shown is
 * easier, the second is much more common, as you often get paths from
 * callbacks.
 *
 * ## Acquiring a `GtkTreeIter`
 *
 * ```c
 * // Three ways of getting the iter pointing to the location
 * GtkTreePath *path;
 * GtkTreeIter iter;
 * GtkTreeIter parent_iter;
 *
 * // get the iterator from a string
 * gtk_tree_model_get_iter_from_string (model,
 *                                      &iter,
 *                                      "3:2:5");
 *
 * // get the iterator from a path
 * path = gtk_tree_path_new_from_string ("3:2:5");
 * gtk_tree_model_get_iter (model, &iter, path);
 * gtk_tree_path_free (path);
 *
 * // walk the tree to find the iterator
 * gtk_tree_model_iter_nth_child (model, &iter,
 *                                NULL, 3);
 * parent_iter = iter;
 * gtk_tree_model_iter_nth_child (model, &iter,
 *                                &parent_iter, 2);
 * parent_iter = iter;
 * gtk_tree_model_iter_nth_child (model, &iter,
 *                                &parent_iter, 5);
 * ```
 *
 * This second example shows a quick way of iterating through a list
 * and getting a string and an integer from each row. The
 * populate_model() function used below is not
 * shown, as it is specific to the `GtkListStore`. For information on
 * how to write such a function, see the `GtkListStore` documentation.
 *
 * ## Reading data from a `GtkTreeModel`
 *
 * ```c
 * enum
 * {
 *   STRING_COLUMN,
 *   INT_COLUMN,
 *   N_COLUMNS
 * };
 *
 * ...
 *
 * GtkTreeModel *list_store;
 * GtkTreeIter iter;
 * gboolean valid;
 * int row_count = 0;
 *
 * // make a new list_store
 * list_store = gtk_list_store_new (N_COLUMNS,
 *                                  G_TYPE_STRING,
 *                                  G_TYPE_INT);
 *
 * // Fill the list store with data
 * populate_model (list_store);
 *
 * // Get the first iter in the list, check it is valid and walk
 * // through the list, reading each row.
 *
 * valid = gtk_tree_model_get_iter_first (list_store,
 *                                        &iter);
 * while (valid)
 *  {
 *    char *str_data;
 *    int    int_data;
 *
 *    // Make sure you terminate calls to gtk_tree_model_get() with a “-1” value
 *    gtk_tree_model_get (list_store, &iter,
 *                        STRING_COLUMN, &str_data,
 *                        INT_COLUMN, &int_data,
 *                        -1);
 *
 *    // Do something with the data
 *    g_print ("Row %d: (%s,%d)\n",
 *             row_count, str_data, int_data);
 *    g_free (str_data);
 *
 *    valid = gtk_tree_model_iter_next (list_store,
 *                                      &iter);
 *    row_count++;
 *  }
 * ```
 *
 * The `GtkTreeModel` interface contains two methods for reference
 * counting: gtk_tree_model_ref_node() and gtk_tree_model_unref_node().
 * These two methods are optional to implement. The reference counting
 * is meant as a way for views to let models know when nodes are being
 * displayed. `GtkTreeView` will take a reference on a node when it is
 * visible, which means the node is either in the toplevel or expanded.
 * Being displayed does not mean that the node is currently directly
 * visible to the user in the viewport. Based on this reference counting
 * scheme a caching model, for example, can decide whether or not to cache
 * a node based on the reference count. A file-system based model would
 * not want to keep the entire file hierarchy in memory, but just the
 * folders that are currently expanded in every current view.
 *
 * When working with reference counting, the following rules must be taken
 * into account:
 *
 * - Never take a reference on a node without owning a reference on its parent.
 *   This means that all parent nodes of a referenced node must be referenced
 *   as well.
 *
 * - Outstanding references on a deleted node are not released. This is not
 *   possible because the node has already been deleted by the time the
 *   row-deleted signal is received.
 *
 * - Models are not obligated to emit a signal on rows of which none of its
 *   siblings are referenced. To phrase this differently, signals are only
 *   required for levels in which nodes are referenced. For the root level
 *   however, signals must be emitted at all times (however the root level
 *   is always referenced when any view is attached).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `new_order`: Array parameter of type gint is not supported
 * - signal `rows-reordered`: Unsupported parameter `new_order` : gpointer
 */
public interface TreeModel : Interface, KGTyped {
    public val gtkTreeModelPointer: CPointer<GtkTreeModel>

    /**
     * Creates a new `GtkTreeModel`, with @child_model as the child_model
     * and @root as the virtual root.
     *
     * @param root A `GtkTreePath`
     * @return A new `GtkTreeModel`.
     */
    public fun filterNew(root: TreePath? = null): TreeModel =
        gtk_tree_model_filter_new(
            gtkTreeModelPointer.reinterpret(),
            root?.gtkTreePathPointer
        )!!.run {
            TreeModel.wrap(reinterpret())
        }

    /**
     * Calls @func on each node in model in a depth-first fashion.
     *
     * If @func returns true, then the tree ceases to be walked,
     * and gtk_tree_model_foreach() returns.
     *
     * @param func a function to be called on each row
     */
    public fun foreach(func: TreeModelForeachFunc): Unit =
        gtk_tree_model_foreach(
            gtkTreeModelPointer.reinterpret(),
            TreeModelForeachFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Returns the type of the column.
     *
     * @param index the column index
     * @return the type of the column
     */
    public fun getColumnType(index: Int): ULong =
        gtk_tree_model_get_column_type(gtkTreeModelPointer.reinterpret(), index)

    /**
     * Returns a set of flags supported by this interface.
     *
     * The flags are a bitwise combination of `GtkTreeModel`Flags.
     * The flags supported should not change during the lifetime
     * of the @tree_model.
     *
     * @return the flags supported by this interface
     */
    public fun getFlags(): TreeModelFlags =
        gtk_tree_model_get_flags(gtkTreeModelPointer.reinterpret()).run {
            TreeModelFlags(this)
        }

    /**
     * Sets @iter to a valid iterator pointing to @path.
     *
     * If @path does not exist, @iter is set to an invalid
     * iterator and false is returned.
     *
     * @param iter the uninitialized `GtkTreeIter`
     * @param path the `GtkTreePath`
     * @return true, if @iter was set
     */
    public fun getIter(
        iter: TreeIter,
        path: TreePath,
    ): Boolean =
        gtk_tree_model_get_iter(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer,
            path.gtkTreePathPointer
        ).asBoolean()

    /**
     * Initializes @iter with the first iterator in the tree
     * (the one at the path "0").
     *
     * Returns false if the tree is empty, true otherwise.
     *
     * @param iter the uninitialized `GtkTreeIter`
     * @return true, if @iter was set
     */
    public fun getIterFirst(iter: TreeIter): Boolean =
        gtk_tree_model_get_iter_first(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer
        ).asBoolean()

    /**
     * Sets @iter to a valid iterator pointing to @path_string, if it
     * exists.
     *
     * Otherwise, @iter is left invalid and false is returned.
     *
     * @param iter an uninitialized `GtkTreeIter`
     * @param pathString a string representation of a `GtkTreePath`
     * @return true, if @iter was set
     */
    public fun getIterFromString(
        iter: TreeIter,
        pathString: String,
    ): Boolean =
        gtk_tree_model_get_iter_from_string(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer,
            pathString
        ).asBoolean()

    /**
     * Returns the number of columns supported by @tree_model.
     *
     * @return the number of columns
     */
    public fun getNColumns(): Int = gtk_tree_model_get_n_columns(gtkTreeModelPointer.reinterpret())

    /**
     * Returns a newly-created `GtkTreePath` referenced by @iter.
     *
     * This path should be freed with gtk_tree_path_free().
     *
     * @param iter the `GtkTreeIter`
     * @return a newly-created `GtkTreePath`
     */
    public fun getPath(iter: TreeIter): TreePath =
        gtk_tree_model_get_path(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer
        )!!.run {
            TreePath(reinterpret())
        }

    /**
     * Generates a string representation of the iter.
     *
     * This string is a “:” separated list of numbers.
     * For example, “4:10:0:3” would be an acceptable
     * return value for this string.
     *
     * @param iter a `GtkTreeIter`
     * @return a newly-allocated string
     */
    public fun getStringFromIter(iter: TreeIter): String? =
        gtk_tree_model_get_string_from_iter(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer
        )?.toKString()

    /**
     * Initializes and sets @value to that at @column.
     *
     * When done with @value, g_value_unset() needs to be called
     * to free any allocated memory.
     *
     * @param iter the `GtkTreeIter`
     * @param column the column to lookup the value at
     * @param value an empty `GValue` to set
     */
    public fun getValue(
        iter: TreeIter,
        column: Int,
        `value`: Value,
    ): Unit =
        gtk_tree_model_get_value(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer,
            column,
            `value`.gobjectValuePointer
        )

    /**
     * Sets @iter to point to the first child of @parent.
     *
     * If @parent has no children, false is returned and @iter is
     * set to be invalid. @parent will remain a valid node after this
     * function has been called.
     *
     * If @parent is null returns the first node, equivalent to
     * `gtk_tree_model_get_iter_first (tree_model, iter);`
     *
     * @param iter the new `GtkTreeIter` to be set to the child
     * @param parent the `GtkTreeIter`
     * @return true, if @iter has been set to the first child
     */
    public fun iterChildren(
        iter: TreeIter,
        parent: TreeIter? = null,
    ): Boolean =
        gtk_tree_model_iter_children(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer,
            parent?.gtkTreeIterPointer
        ).asBoolean()

    /**
     * Returns true if @iter has children, false otherwise.
     *
     * @param iter the `GtkTreeIter` to test for children
     * @return true if @iter has children
     */
    public fun iterHasChild(iter: TreeIter): Boolean =
        gtk_tree_model_iter_has_child(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer
        ).asBoolean()

    /**
     * Returns the number of children that @iter has.
     *
     * As a special case, if @iter is null, then the number
     * of toplevel nodes is returned.
     *
     * @param iter the `GtkTreeIter`
     * @return the number of children of @iter
     */
    public fun iterNChildren(iter: TreeIter? = null): Int =
        gtk_tree_model_iter_n_children(
            gtkTreeModelPointer.reinterpret(),
            iter?.gtkTreeIterPointer
        )

    /**
     * Sets @iter to point to the node following it at the current level.
     *
     * If there is no next @iter, false is returned and @iter is set
     * to be invalid.
     *
     * @param iter the `GtkTreeIter`
     * @return true if @iter has been changed to the next node
     */
    public fun iterNext(iter: TreeIter): Boolean =
        gtk_tree_model_iter_next(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer
        ).asBoolean()

    /**
     * Sets @iter to be the child of @parent, using the given index.
     *
     * The first index is 0. If @n is too big, or @parent has no children,
     * @iter is set to an invalid iterator and false is returned. @parent
     * will remain a valid node after this function has been called. As a
     * special case, if @parent is null, then the @n-th root node
     * is set.
     *
     * @param iter the `GtkTreeIter` to set to the nth child
     * @param parent the `GtkTreeIter` to get the child from
     * @param n the index of the desired child
     * @return true, if @parent has an @n-th child
     */
    public fun iterNthChild(
        iter: TreeIter,
        parent: TreeIter? = null,
        n: Int,
    ): Boolean =
        gtk_tree_model_iter_nth_child(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer,
            parent?.gtkTreeIterPointer,
            n
        ).asBoolean()

    /**
     * Sets @iter to be the parent of @child.
     *
     * If @child is at the toplevel, and doesn’t have a parent, then
     * @iter is set to an invalid iterator and false is returned.
     * @child will remain a valid node after this function has been
     * called.
     *
     * @iter will be initialized before the lookup is performed, so @child
     * and @iter cannot point to the same memory location.
     *
     * @param iter the new `GtkTreeIter` to set to the parent
     * @param child the `GtkTreeIter`
     * @return true, if @iter is set to the parent of @child
     */
    public fun iterParent(
        iter: TreeIter,
        child: TreeIter,
    ): Boolean =
        gtk_tree_model_iter_parent(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer,
            child.gtkTreeIterPointer
        ).asBoolean()

    /**
     * Sets @iter to point to the previous node at the current level.
     *
     * If there is no previous @iter, false is returned and @iter is
     * set to be invalid.
     *
     * @param iter the `GtkTreeIter`
     * @return true if @iter has been changed to the previous node
     */
    public fun iterPrevious(iter: TreeIter): Boolean =
        gtk_tree_model_iter_previous(
            gtkTreeModelPointer.reinterpret(),
            iter.gtkTreeIterPointer
        ).asBoolean()

    /**
     * Lets the tree ref the node.
     *
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons.
     *
     * This function is primarily meant as a way for views to let
     * caching models know when nodes are being displayed (and hence,
     * whether or not to cache that node). Being displayed means a node
     * is in an expanded branch, regardless of whether the node is currently
     * visible in the viewport. For example, a file-system based model
     * would not want to keep the entire file-hierarchy in memory,
     * just the sections that are currently being displayed by
     * every current view.
     *
     * A model should be expected to be able to get an iter independent
     * of its reffed state.
     *
     * @param iter the `GtkTreeIter`
     */
    public fun refNode(iter: TreeIter): Unit =
        gtk_tree_model_ref_node(gtkTreeModelPointer.reinterpret(), iter.gtkTreeIterPointer)

    /**
     * Emits the ::row-changed signal on @tree_model.
     *
     * See [signal@Gtk.TreeModel::row-changed].
     *
     * @param path a `GtkTreePath` pointing to the changed row
     * @param iter a valid `GtkTreeIter` pointing to the changed row
     */
    public fun rowChanged(
        path: TreePath,
        iter: TreeIter,
    ): Unit =
        gtk_tree_model_row_changed(
            gtkTreeModelPointer.reinterpret(),
            path.gtkTreePathPointer,
            iter.gtkTreeIterPointer
        )

    /**
     * Emits the ::row-deleted signal on @tree_model.
     *
     * See [signal@Gtk.TreeModel::row-deleted].
     *
     * This should be called by models after a row has been removed.
     * The location pointed to by @path should be the location that
     * the row previously was at. It may not be a valid location anymore.
     *
     * Nodes that are deleted are not unreffed, this means that any
     * outstanding references on the deleted node should not be released.
     *
     * @param path a `GtkTreePath` pointing to the previous location of
     *   the deleted row
     */
    public fun rowDeleted(path: TreePath): Unit =
        gtk_tree_model_row_deleted(gtkTreeModelPointer.reinterpret(), path.gtkTreePathPointer)

    /**
     * Emits the ::row-has-child-toggled signal on @tree_model.
     *
     * See [signal@Gtk.TreeModel::row-has-child-toggled].
     *
     * This should be called by models after the child
     * state of a node changes.
     *
     * @param path a `GtkTreePath` pointing to the changed row
     * @param iter a valid `GtkTreeIter` pointing to the changed row
     */
    public fun rowHasChildToggled(
        path: TreePath,
        iter: TreeIter,
    ): Unit =
        gtk_tree_model_row_has_child_toggled(
            gtkTreeModelPointer.reinterpret(),
            path.gtkTreePathPointer,
            iter.gtkTreeIterPointer
        )

    /**
     * Emits the ::row-inserted signal on @tree_model.
     *
     * See [signal@Gtk.TreeModel::row-inserted].
     *
     * @param path a `GtkTreePath` pointing to the inserted row
     * @param iter a valid `GtkTreeIter` pointing to the inserted row
     */
    public fun rowInserted(
        path: TreePath,
        iter: TreeIter,
    ): Unit =
        gtk_tree_model_row_inserted(
            gtkTreeModelPointer.reinterpret(),
            path.gtkTreePathPointer,
            iter.gtkTreeIterPointer
        )

    /**
     * Lets the tree unref the node.
     *
     * This is an optional method for models to implement.
     * To be more specific, models may ignore this call as it exists
     * primarily for performance reasons. For more information on what
     * this means, see gtk_tree_model_ref_node().
     *
     * Please note that nodes that are deleted are not unreffed.
     *
     * @param iter the `GtkTreeIter`
     */
    public fun unrefNode(iter: TreeIter): Unit =
        gtk_tree_model_unref_node(gtkTreeModelPointer.reinterpret(), iter.gtkTreeIterPointer)

    /**
     * This signal is emitted when a row in the model has changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` a `GtkTreePath` identifying the
     * changed row; `iter` a valid `GtkTreeIter` pointing to the changed row
     */
    public fun connectRowChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: TreePath, iter: TreeIter) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkTreeModelPointer.reinterpret(),
            "row-changed",
            connectRowChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when a row has been deleted.
     *
     * Note that no iterator is passed to the signal handler,
     * since the row is already deleted.
     *
     * This should be called by models after a row has been removed.
     * The location pointed to by @path should be the location that
     * the row previously was at. It may not be a valid location anymore.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` a `GtkTreePath` identifying the row
     */
    public fun connectRowDeleted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: TreePath) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkTreeModelPointer.reinterpret(),
            "row-deleted",
            connectRowDeletedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when a row has gotten the first child
     * row or lost its last child row.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` a `GtkTreePath` identifying the row;
     * `iter` a valid `GtkTreeIter` pointing to the row
     */
    public fun connectRowHasChildToggled(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: TreePath, iter: TreeIter) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkTreeModelPointer.reinterpret(),
            "row-has-child-toggled",
            connectRowHasChildToggledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is emitted when a new row has been inserted in
     * the model.
     *
     * Note that the row may still be empty at this point, since
     * it is a common pattern to first insert an empty row, and
     * then fill it with the desired values.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` a `GtkTreePath` identifying the new
     * row; `iter` a valid `GtkTreeIter` pointing to the new row
     */
    public fun connectRowInserted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (path: TreePath, iter: TreeIter) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkTreeModelPointer.reinterpret(),
            "row-inserted",
            connectRowInsertedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkTreeModel>,
    ) : TreeModel {
        override val gtkTreeModelPointer: CPointer<GtkTreeModel> = pointer
    }

    public companion object : TypeCompanion<TreeModel> {
        override val type: GeneratedInterfaceKGType<TreeModel> =
            GeneratedInterfaceKGType(gtk_tree_model_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkTreeModel>): TreeModel = Wrapper(pointer)
    }
}

private val connectRowChangedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreePath>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<GtkTreePath>?,
            iter: CPointer<GtkTreeIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(path: TreePath, iter: TreeIter) -> Unit>().get().invoke(
            path!!.run {
                TreePath(reinterpret())
            },
            iter!!.run {
                TreeIter(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRowDeletedFunc: CPointer<CFunction<(CPointer<GtkTreePath>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<GtkTreePath>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(path: TreePath) -> Unit>().get().invoke(
            path!!.run {
                TreePath(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRowHasChildToggledFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreePath>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<GtkTreePath>?,
            iter: CPointer<GtkTreeIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(path: TreePath, iter: TreeIter) -> Unit>().get().invoke(
            path!!.run {
                TreePath(reinterpret())
            },
            iter!!.run {
                TreeIter(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectRowInsertedFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreePath>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<GtkTreePath>?,
            iter: CPointer<GtkTreeIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(path: TreePath, iter: TreeIter) -> Unit>().get().invoke(
            path!!.run {
                TreePath(reinterpret())
            },
            iter!!.run {
                TreeIter(reinterpret())
            }
        )
    }
        .reinterpret()
