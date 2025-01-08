// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_22
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.bindings.glib.annotations.GLibVersion2_70
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GTree
import org.gtkkn.native.glib.g_tree_destroy
import org.gtkkn.native.glib.g_tree_foreach
import org.gtkkn.native.glib.g_tree_foreach_node
import org.gtkkn.native.glib.g_tree_height
import org.gtkkn.native.glib.g_tree_insert
import org.gtkkn.native.glib.g_tree_insert_node
import org.gtkkn.native.glib.g_tree_lookup
import org.gtkkn.native.glib.g_tree_lookup_node
import org.gtkkn.native.glib.g_tree_lower_bound
import org.gtkkn.native.glib.g_tree_new_with_data
import org.gtkkn.native.glib.g_tree_nnodes
import org.gtkkn.native.glib.g_tree_node_first
import org.gtkkn.native.glib.g_tree_node_last
import org.gtkkn.native.glib.g_tree_ref
import org.gtkkn.native.glib.g_tree_remove
import org.gtkkn.native.glib.g_tree_remove_all
import org.gtkkn.native.glib.g_tree_replace
import org.gtkkn.native.glib.g_tree_replace_node
import org.gtkkn.native.glib.g_tree_search
import org.gtkkn.native.glib.g_tree_search_node
import org.gtkkn.native.glib.g_tree_steal
import org.gtkkn.native.glib.g_tree_unref
import org.gtkkn.native.glib.g_tree_upper_bound
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_tree_get_type
import kotlin.Boolean
import kotlin.Unit

/**
 * The GTree struct is an opaque data structure representing a
 * [balanced binary tree][glib-Balanced-Binary-Trees]. It should be
 * accessed only by using the following functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `orig_key`: orig_key: Out parameter is not supported
 * - method `traverse`: C function g_tree_traverse is ignored
 * - parameter `key_compare_func`: CompareFunc
 * - parameter `key_destroy_func`: DestroyNotify
 */
public class Tree(pointer: CPointer<GTree>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTree> = pointer

    /**
     * Removes all keys and values from the #GTree and decreases its
     * reference count by one. If keys and/or values are dynamically
     * allocated, you should either free them first or create the #GTree
     * using g_tree_new_full(). In the latter case the destroy functions
     * you supplied will be called on all keys and values before destroying
     * the #GTree.
     */
    public fun destroy(): Unit = g_tree_destroy(gPointer)

    /**
     * Calls the given function for each of the key/value pairs in the #GTree.
     * The function is passed the key and value of each pair, and the given
     * @data parameter. The tree is traversed in sorted order.
     *
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your #GTraverseFunc as you walk over
     * the tree, then walk the list and remove each item.
     *
     * @param func the function to call for each node visited.
     *     If this function returns true, the traversal is stopped.
     */
    public fun foreach(func: TraverseFunc): Unit =
        g_tree_foreach(gPointer, TraverseFuncFunc.reinterpret(), StableRef.create(func).asCPointer())

    /**
     * Calls the given function for each of the nodes in the #GTree.
     * The function is passed the pointer to the particular node, and the given
     * @data parameter. The tree traversal happens in-order.
     *
     * The tree may not be modified while iterating over it (you can't
     * add/remove items). To remove all items matching a predicate, you need
     * to add each item to a list in your #GTraverseFunc as you walk over
     * the tree, then walk the list and remove each item.
     *
     * @param func the function to call for each node visited.
     *     If this function returns true, the traversal is stopped.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun foreachNode(func: TraverseNodeFunc): Unit =
        g_tree_foreach_node(gPointer, TraverseNodeFuncFunc.reinterpret(), StableRef.create(func).asCPointer())

    /**
     * Gets the height of a #GTree.
     *
     * If the #GTree contains no nodes, the height is 0.
     * If the #GTree contains only one root node the height is 1.
     * If the root node has children the height is 2, etc.
     *
     * @return the height of @tree
     */
    public fun height(): gint = g_tree_height(gPointer)

    /**
     * Inserts a key/value pair into a #GTree.
     *
     * Inserts a new key and value into a #GTree as g_tree_insert_node() does,
     * only this function does not return the inserted or set node.
     *
     * @param key the key to insert
     * @param value the value corresponding to the key
     */
    public fun insert(key: gpointer? = null, `value`: gpointer? = null): Unit = g_tree_insert(gPointer, key, `value`)

    /**
     * Inserts a key/value pair into a #GTree.
     *
     * If the given key already exists in the #GTree its corresponding value
     * is set to the new value. If you supplied a @value_destroy_func when
     * creating the #GTree, the old value is freed using that function. If
     * you supplied a @key_destroy_func when creating the #GTree, the passed
     * key is freed using that function.
     *
     * The tree is automatically 'balanced' as new key/value pairs are added,
     * so that the distance from the root to every leaf is as small as possible.
     * The cost of maintaining a balanced tree while inserting new key/value
     * result in a O(n log(n)) operation where most of the other operations
     * are O(log(n)).
     *
     * @param key the key to insert
     * @param value the value corresponding to the key
     * @return the inserted (or set) node or null
     * if insertion would overflow the tree node counter.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun insertNode(key: gpointer? = null, `value`: gpointer? = null): TreeNode? =
        g_tree_insert_node(gPointer, key, `value`)?.run {
            TreeNode(this)
        }

    /**
     * Gets the value corresponding to the given key. Since a #GTree is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     *
     * @param key the key to look up
     * @return the value corresponding to the key, or null
     *     if the key was not found
     */
    public fun lookup(key: gpointer? = null): gpointer? = g_tree_lookup(gPointer, key)

    /**
     * Gets the tree node corresponding to the given key. Since a #GTree is
     * automatically balanced as key/value pairs are added, key lookup
     * is O(log n) (where n is the number of key/value pairs in the tree).
     *
     * @param key the key to look up
     * @return the tree node corresponding to
     *          the key, or null if the key was not found
     * @since 2.68
     */
    @GLibVersion2_68
    public fun lookupNode(key: gpointer? = null): TreeNode? = g_tree_lookup_node(gPointer, key)?.run {
        TreeNode(this)
    }

    /**
     * Gets the lower bound node corresponding to the given key,
     * or null if the tree is empty or all the nodes in the tree
     * have keys that are strictly lower than the searched key.
     *
     * The lower bound is the first node that has its key greater
     * than or equal to the searched key.
     *
     * @param key the key to calculate the lower bound for
     * @return the tree node corresponding to
     *          the lower bound, or null if the tree is empty or has only
     *          keys strictly lower than the searched key.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun lowerBound(key: gpointer? = null): TreeNode? = g_tree_lower_bound(gPointer, key)?.run {
        TreeNode(this)
    }

    /**
     * Gets the number of nodes in a #GTree.
     *
     * @return the number of nodes in @tree
     *
     * The node counter value type is really a #guint,
     * but it is returned as a #gint due to backward
     * compatibility issues (can be cast back to #guint to
     * support its full range of values).
     */
    public fun nnodes(): gint = g_tree_nnodes(gPointer)

    /**
     * Returns the first in-order node of the tree, or null
     * for an empty tree.
     *
     * @return the first node in the tree
     * @since 2.68
     */
    @GLibVersion2_68
    public fun nodeFirst(): TreeNode? = g_tree_node_first(gPointer)?.run {
        TreeNode(this)
    }

    /**
     * Returns the last in-order node of the tree, or null
     * for an empty tree.
     *
     * @return the last node in the tree
     * @since 2.68
     */
    @GLibVersion2_68
    public fun nodeLast(): TreeNode? = g_tree_node_last(gPointer)?.run {
        TreeNode(this)
    }

    /**
     * Increments the reference count of @tree by one.
     *
     * It is safe to call this function from any thread.
     *
     * @return the passed in #GTree
     * @since 2.22
     */
    @GLibVersion2_22
    public fun ref(): Tree = g_tree_ref(gPointer)!!.run {
        Tree(this)
    }

    /**
     * Removes a key/value pair from a #GTree.
     *
     * If the #GTree was created using g_tree_new_full(), the key and value
     * are freed using the supplied destroy functions, otherwise you have to
     * make sure that any dynamically allocated values are freed yourself.
     * If the key does not exist in the #GTree, the function does nothing.
     *
     * The cost of maintaining a balanced tree while removing a key/value
     * result in a O(n log(n)) operation where most of the other operations
     * are O(log(n)).
     *
     * @param key the key to remove
     * @return true if the key was found (prior to 2.8, this function
     *     returned nothing)
     */
    public fun remove(key: gpointer? = null): Boolean = g_tree_remove(gPointer, key).asBoolean()

    /**
     * Removes all nodes from a #GTree and destroys their keys and values,
     * then resets the #GTree’s root to null.
     *
     * @since 2.70
     */
    @GLibVersion2_70
    public fun removeAll(): Unit = g_tree_remove_all(gPointer)

    /**
     * Inserts a new key and value into a #GTree as g_tree_replace_node() does,
     * only this function does not return the inserted or set node.
     *
     * @param key the key to insert
     * @param value the value corresponding to the key
     */
    public fun replace(key: gpointer? = null, `value`: gpointer? = null): Unit = g_tree_replace(gPointer, key, `value`)

    /**
     * Inserts a new key and value into a #GTree similar to g_tree_insert_node().
     * The difference is that if the key already exists in the #GTree, it gets
     * replaced by the new key. If you supplied a @value_destroy_func when
     * creating the #GTree, the old value is freed using that function. If you
     * supplied a @key_destroy_func when creating the #GTree, the old key is
     * freed using that function.
     *
     * The tree is automatically 'balanced' as new key/value pairs are added,
     * so that the distance from the root to every leaf is as small as possible.
     *
     * @param key the key to insert
     * @param value the value corresponding to the key
     * @return the inserted (or set) node or null
     * if insertion would overflow the tree node counter.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun replaceNode(key: gpointer? = null, `value`: gpointer? = null): TreeNode? =
        g_tree_replace_node(gPointer, key, `value`)?.run {
            TreeNode(this)
        }

    /**
     * Searches a #GTree using @search_func.
     *
     * The @search_func is called with a pointer to the key of a key/value
     * pair in the tree, and the passed in @user_data. If @search_func returns
     * 0 for a key/value pair, then the corresponding value is returned as
     * the result of g_tree_search(). If @search_func returns -1, searching
     * will proceed among the key/value pairs that have a smaller key; if
     * @search_func returns 1, searching will proceed among the key/value
     * pairs that have a larger key.
     *
     * @param searchFunc a function used to search the #GTree
     * @return the value corresponding to the found key, or null
     *     if the key was not found
     */
    public fun search(searchFunc: CompareFunc): gpointer? =
        g_tree_search(gPointer, CompareFuncFunc.reinterpret(), StableRef.create(searchFunc).asCPointer())

    /**
     * Searches a #GTree using @search_func.
     *
     * The @search_func is called with a pointer to the key of a key/value
     * pair in the tree, and the passed in @user_data. If @search_func returns
     * 0 for a key/value pair, then the corresponding node is returned as
     * the result of g_tree_search(). If @search_func returns -1, searching
     * will proceed among the key/value pairs that have a smaller key; if
     * @search_func returns 1, searching will proceed among the key/value
     * pairs that have a larger key.
     *
     * @param searchFunc a function used to search the #GTree
     * @return the node corresponding to the
     *          found key, or null if the key was not found
     * @since 2.68
     */
    @GLibVersion2_68
    public fun searchNode(searchFunc: CompareFunc): TreeNode? =
        g_tree_search_node(gPointer, CompareFuncFunc.reinterpret(), StableRef.create(searchFunc).asCPointer())?.run {
            TreeNode(this)
        }

    /**
     * Removes a key and its associated value from a #GTree without calling
     * the key and value destroy functions.
     *
     * If the key does not exist in the #GTree, the function does nothing.
     *
     * @param key the key to remove
     * @return true if the key was found (prior to 2.8, this function
     *     returned nothing)
     */
    public fun steal(key: gpointer? = null): Boolean = g_tree_steal(gPointer, key).asBoolean()

    /**
     * Decrements the reference count of @tree by one.
     * If the reference count drops to 0, all keys and values will
     * be destroyed (if destroy functions were specified) and all
     * memory allocated by @tree will be released.
     *
     * It is safe to call this function from any thread.
     *
     * @since 2.22
     */
    @GLibVersion2_22
    public fun unref(): Unit = g_tree_unref(gPointer)

    /**
     * Gets the upper bound node corresponding to the given key,
     * or null if the tree is empty or all the nodes in the tree
     * have keys that are lower than or equal to the searched key.
     *
     * The upper bound is the first node that has its key strictly greater
     * than the searched key.
     *
     * @param key the key to calculate the upper bound for
     * @return the tree node corresponding to the
     *          upper bound, or null if the tree is empty or has only keys
     *          lower than or equal to the searched key.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun upperBound(key: gpointer? = null): TreeNode? = g_tree_upper_bound(gPointer, key)?.run {
        TreeNode(this)
    }

    public companion object {
        /**
         * Creates a new #GTree with a comparison function that accepts user data.
         * See g_tree_new() for more details.
         *
         * @param keyCompareFunc qsort()-style comparison function
         * @return a newly allocated #GTree
         */
        public fun newWithData(keyCompareFunc: CompareDataFunc): Tree = Tree(
            g_tree_new_with_data(
                CompareDataFuncFunc.reinterpret(),
                StableRef.create(keyCompareFunc).asCPointer()
            )!!.reinterpret()
        )

        /**
         * Get the GType of Tree
         *
         * @return the GType
         */
        public fun getType(): GType = g_tree_get_type()
    }
}
