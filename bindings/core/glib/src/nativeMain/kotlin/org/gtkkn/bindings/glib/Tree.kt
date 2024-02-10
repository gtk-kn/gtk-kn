// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GTree
import org.gtkkn.native.glib.g_tree_destroy
import org.gtkkn.native.glib.g_tree_height
import org.gtkkn.native.glib.g_tree_nnodes
import org.gtkkn.native.glib.g_tree_ref
import org.gtkkn.native.glib.g_tree_remove_all
import org.gtkkn.native.glib.g_tree_unref
import kotlin.Int
import kotlin.Unit

/**
 * The GTree struct is an opaque data structure representing a
 * [balanced binary tree][glib-Balanced-Binary-Trees]. It should be
 * accessed only by using the following functions.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `lookup_key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - method `node_first`: Return type TreeNode is unsupported
 * - method `node_last`: Return type TreeNode is unsupported
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `key`: gpointer
 * - parameter `value_destroy_func`: DestroyNotify
 */
public class Tree(
    pointer: CPointer<GTree>,
) : Record {
    public val glibTreePointer: CPointer<GTree> = pointer

    /**
     * Removes all keys and values from the #GTree and decreases its
     * reference count by one. If keys and/or values are dynamically
     * allocated, you should either free them first or create the #GTree
     * using g_tree_new_full(). In the latter case the destroy functions
     * you supplied will be called on all keys and values before destroying
     * the #GTree.
     */
    public fun destroy(): Unit = g_tree_destroy(glibTreePointer.reinterpret())

    /**
     * Gets the height of a #GTree.
     *
     * If the #GTree contains no nodes, the height is 0.
     * If the #GTree contains only one root node the height is 1.
     * If the root node has children the height is 2, etc.
     *
     * @return the height of @tree
     */
    public fun height(): Int = g_tree_height(glibTreePointer.reinterpret())

    /**
     * Gets the number of nodes in a #GTree.
     *
     * @return the number of nodes in @tree
     */
    public fun nnodes(): Int = g_tree_nnodes(glibTreePointer.reinterpret())

    /**
     * Increments the reference count of @tree by one.
     *
     * It is safe to call this function from any thread.
     *
     * @return the passed in #GTree
     * @since 2.22
     */
    public fun ref(): Tree =
        g_tree_ref(glibTreePointer.reinterpret())!!.run {
            Tree(reinterpret())
        }

    /**
     * Removes all nodes from a #GTree and destroys their keys and values,
     * then resets the #GTree’s root to null.
     *
     * @since 2.70
     */
    public fun removeAll(): Unit = g_tree_remove_all(glibTreePointer.reinterpret())

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
    public fun unref(): Unit = g_tree_unref(glibTreePointer.reinterpret())

    public companion object : RecordCompanion<Tree, GTree> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Tree = Tree(pointer.reinterpret())
    }
}
