// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkTreeDragSource
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.GtkTreeModelFilter
import org.gtkkn.native.gtk.gtk_tree_model_filter_clear_cache
import org.gtkkn.native.gtk.gtk_tree_model_filter_convert_child_iter_to_iter
import org.gtkkn.native.gtk.gtk_tree_model_filter_convert_child_path_to_path
import org.gtkkn.native.gtk.gtk_tree_model_filter_convert_iter_to_child_iter
import org.gtkkn.native.gtk.gtk_tree_model_filter_convert_path_to_child_path
import org.gtkkn.native.gtk.gtk_tree_model_filter_get_model
import org.gtkkn.native.gtk.gtk_tree_model_filter_get_type
import org.gtkkn.native.gtk.gtk_tree_model_filter_refilter
import org.gtkkn.native.gtk.gtk_tree_model_filter_set_visible_column
import org.gtkkn.native.gtk.gtk_tree_model_filter_set_visible_func
import kotlin.Boolean
import kotlin.Unit

/**
 * A `GtkTreeModel` which hides parts of an underlying tree model
 *
 * A `GtkTreeModelFilter` is a tree model which wraps another tree model,
 * and can do the following things:
 *
 * - Filter specific rows, based on data from a “visible column”, a column
 *   storing booleans indicating whether the row should be filtered or not,
 *   or based on the return value of a “visible function”, which gets a
 *   model, iter and user_data and returns a boolean indicating whether the
 *   row should be filtered or not.
 *
 * - Modify the “appearance” of the model, using a modify function.
 *   This is extremely powerful and allows for just changing some
 *   values and also for creating a completely different model based
 *   on the given child model.
 *
 * - Set a different root node, also known as a “virtual root”. You can pass
 *   in a `GtkTreePath` indicating the root node for the filter at construction
 *   time.
 *
 * The basic API is similar to `GtkTreeModelSort`. For an example on its usage,
 * see the section on `GtkTreeModelSort`.
 *
 * When using `GtkTreeModelFilter`, it is important to realize that
 * `GtkTreeModelFilter` maintains an internal cache of all nodes which are
 * visible in its clients. The cache is likely to be a subtree of the tree
 * exposed by the child model. `GtkTreeModelFilter` will not cache the entire
 * child model when unnecessary to not compromise the caching mechanism
 * that is exposed by the reference counting scheme. If the child model
 * implements reference counting, unnecessary signals may not be emitted
 * because of reference counting rule 3, see the `GtkTreeModel`
 * documentation. (Note that e.g. `GtkTreeStore` does not implement
 * reference counting and will always emit all signals, even when
 * the receiving node is not visible).
 *
 * Because of this, limitations for possible visible functions do apply.
 * In general, visible functions should only use data or properties from
 * the node for which the visibility state must be determined, its siblings
 * or its parents. Usually, having a dependency on the state of any child
 * node is not possible, unless references are taken on these explicitly.
 * When no such reference exists, no signals may be received for these child
 * nodes (see reference counting rule number 3 in the `GtkTreeModel` section).
 *
 * Determining the visibility state of a given node based on the state
 * of its child nodes is a frequently occurring use case. Therefore,
 * `GtkTreeModelFilter` explicitly supports this. For example, when a node
 * does not have any children, you might not want the node to be visible.
 * As soon as the first row is added to the node’s child level (or the
 * last row removed), the node’s visibility should be updated.
 *
 * This introduces a dependency from the node on its child nodes. In order
 * to accommodate this, `GtkTreeModelFilter` must make sure the necessary
 * signals are received from the child model. This is achieved by building,
 * for all nodes which are exposed as visible nodes to `GtkTreeModelFilter`'s
 * clients, the child level (if any) and take a reference on the first node
 * in this level. Furthermore, for every row-inserted, row-changed or
 * row-deleted signal (also these which were not handled because the node
 * was not cached), `GtkTreeModelFilter` will check if the visibility state
 * of any parent node has changed.
 *
 * Beware, however, that this explicit support is limited to these two
 * cases. For example, if you want a node to be visible only if two nodes
 * in a child’s child level (2 levels deeper) are visible, you are on your
 * own. In this case, either rely on `GtkTreeStore` to emit all signals
 * because it does not implement reference counting, or for models that
 * do implement reference counting, obtain references on these child levels
 * yourself.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `types`: Array parameter of type GType is not supported
 * - method `child-model`: Property has no getter nor setter
 * - method `virtual-root`: Property has no getter nor setter
 */
public open class TreeModelFilter(pointer: CPointer<GtkTreeModelFilter>) :
    Object(pointer.reinterpret()),
    TreeDragSource,
    TreeModel,
    KGTyped {
    public val gtkTreeModelFilterPointer: CPointer<GtkTreeModelFilter>
        get() = gPointer.reinterpret()

    override val gtkTreeDragSourcePointer: CPointer<GtkTreeDragSource>
        get() = gPointer.reinterpret()

    override val gtkTreeModelPointer: CPointer<GtkTreeModel>
        get() = gPointer.reinterpret()

    /**
     * This function should almost never be called. It clears the @filter
     * of any cached iterators that haven’t been reffed with
     * gtk_tree_model_ref_node(). This might be useful if the child model
     * being filtered is static (and doesn’t change often) and there has been
     * a lot of unreffed access to nodes. As a side effect of this function,
     * all unreffed iters will be invalid.
     */
    public open fun clearCache(): Unit = gtk_tree_model_filter_clear_cache(gtkTreeModelFilterPointer.reinterpret())

    /**
     * Sets @filter_iter to point to the row in @filter that corresponds to the
     * row pointed at by @child_iter.  If @filter_iter was not set, false is
     * returned.
     *
     * @param filterIter An uninitialized `GtkTreeIter`
     * @param childIter A valid `GtkTreeIter` pointing to a row on the child model.
     * @return true, if @filter_iter was set, i.e. if @child_iter is a
     * valid iterator pointing to a visible row in child model.
     */
    public open fun convertChildIterToIter(filterIter: TreeIter, childIter: TreeIter): Boolean =
        gtk_tree_model_filter_convert_child_iter_to_iter(
            gtkTreeModelFilterPointer.reinterpret(),
            filterIter.gtkTreeIterPointer.reinterpret(),
            childIter.gtkTreeIterPointer.reinterpret()
        ).asBoolean()

    /**
     * Converts @child_path to a path relative to @filter. That is, @child_path
     * points to a path in the child model. The rerturned path will point to the
     * same row in the filtered model. If @child_path isn’t a valid path on the
     * child model or points to a row which is not visible in @filter, then null
     * is returned.
     *
     * @param childPath A `GtkTreePath` to convert.
     * @return A newly allocated `GtkTreePath`
     */
    public open fun convertChildPathToPath(childPath: TreePath): TreePath? =
        gtk_tree_model_filter_convert_child_path_to_path(
            gtkTreeModelFilterPointer.reinterpret(),
            childPath.gtkTreePathPointer.reinterpret()
        )?.run {
            TreePath(reinterpret())
        }

    /**
     * Sets @child_iter to point to the row pointed to by @filter_iter.
     *
     * @param childIter An uninitialized `GtkTreeIter`
     * @param filterIter A valid `GtkTreeIter` pointing to a row on @filter.
     */
    public open fun convertIterToChildIter(childIter: TreeIter, filterIter: TreeIter): Unit =
        gtk_tree_model_filter_convert_iter_to_child_iter(
            gtkTreeModelFilterPointer.reinterpret(),
            childIter.gtkTreeIterPointer.reinterpret(),
            filterIter.gtkTreeIterPointer.reinterpret()
        )

    /**
     * Converts @filter_path to a path on the child model of @filter. That is,
     * @filter_path points to a location in @filter. The returned path will
     * point to the same location in the model not being filtered. If @filter_path
     * does not point to a location in the child model, null is returned.
     *
     * @param filterPath A `GtkTreePath` to convert.
     * @return A newly allocated `GtkTreePath`
     */
    public open fun convertPathToChildPath(filterPath: TreePath): TreePath? =
        gtk_tree_model_filter_convert_path_to_child_path(
            gtkTreeModelFilterPointer.reinterpret(),
            filterPath.gtkTreePathPointer.reinterpret()
        )?.run {
            TreePath(reinterpret())
        }

    /**
     * Returns a pointer to the child model of @filter.
     *
     * @return A pointer to a `GtkTreeModel`
     */
    public open fun getModel(): TreeModel =
        gtk_tree_model_filter_get_model(gtkTreeModelFilterPointer.reinterpret())!!.run {
            TreeModel.wrap(reinterpret())
        }

    /**
     * Emits ::row_changed for each row in the child model, which causes
     * the filter to re-evaluate whether a row is visible or not.
     */
    public open fun refilter(): Unit = gtk_tree_model_filter_refilter(gtkTreeModelFilterPointer.reinterpret())

    /**
     * Sets @column of the child_model to be the column where @filter should
     * look for visibility information. @columns should be a column of type
     * %G_TYPE_BOOLEAN, where true means that a row is visible, and false
     * if not.
     *
     * Note that gtk_tree_model_filter_set_visible_func() or
     * gtk_tree_model_filter_set_visible_column() can only be called
     * once for a given filter model.
     *
     * @param column A `int` which is the column containing the visible information
     */
    public open fun setVisibleColumn(column: gint): Unit =
        gtk_tree_model_filter_set_visible_column(gtkTreeModelFilterPointer.reinterpret(), column)

    /**
     * Sets the visible function used when filtering the @filter to be @func.
     * The function should return true if the given row should be visible and
     * false otherwise.
     *
     * If the condition calculated by the function changes over time (e.g.
     * because it depends on some global parameters), you must call
     * gtk_tree_model_filter_refilter() to keep the visibility information
     * of the model up-to-date.
     *
     * Note that @func is called whenever a row is inserted, when it may still
     * be empty. The visible function should therefore take special care of empty
     * rows, like in the example below.
     *
     * |[<!-- language="C" -->
     * static gboolean
     * visible_func (GtkTreeModel *model,
     *               GtkTreeIter  *iter,
     *               gpointer      data)
     * {
     *   // Visible if row is non-empty and first column is “HI”
     *   char *str;
     *   gboolean visible = FALSE;
     *
     *   gtk_tree_model_get (model, iter, 0, &str, -1);
     *   if (str && strcmp (str, "HI") == 0)
     *     visible = TRUE;
     *   g_free (str);
     *
     *   return visible;
     * }
     * ]|
     *
     * Note that gtk_tree_model_filter_set_visible_func() or
     * gtk_tree_model_filter_set_visible_column() can only be called
     * once for a given filter model.
     *
     * @param func A `GtkTreeModelFilterVisibleFunc`, the visible function
     */
    public open fun setVisibleFunc(func: TreeModelFilterVisibleFunc): Unit = gtk_tree_model_filter_set_visible_func(
        gtkTreeModelFilterPointer.reinterpret(),
        TreeModelFilterVisibleFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    public companion object : TypeCompanion<TreeModelFilter> {
        override val type: GeneratedClassKGType<TreeModelFilter> =
            GeneratedClassKGType(gtk_tree_model_filter_get_type()) { TreeModelFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TreeModelFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_model_filter_get_type()
    }
}
