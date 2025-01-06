// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTreeNode
import org.gtkkn.native.glib.g_tree_node_key
import org.gtkkn.native.glib.g_tree_node_next
import org.gtkkn.native.glib.g_tree_node_previous
import org.gtkkn.native.glib.g_tree_node_value
import org.gtkkn.native.glib.gpointer

/**
 * An opaque type which identifies a specific node in a #GTree.
 * @since 2.68
 */
@GLibVersion2_68
public class TreeNode(pointer: CPointer<GTreeNode>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTreeNode> = pointer

    /**
     * Gets the key stored at a particular tree node.
     *
     * @return the key at the node.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun key(): gpointer? = g_tree_node_key(gPointer.reinterpret())

    /**
     * Returns the next in-order node of the tree, or null
     * if the passed node was already the last one.
     *
     * @return the next node in the tree
     * @since 2.68
     */
    @GLibVersion2_68
    public fun next(): TreeNode? = g_tree_node_next(gPointer.reinterpret())?.run {
        TreeNode(reinterpret())
    }

    /**
     * Returns the previous in-order node of the tree, or null
     * if the passed node was already the first one.
     *
     * @return the previous node in the tree
     * @since 2.68
     */
    @GLibVersion2_68
    public fun previous(): TreeNode? = g_tree_node_previous(gPointer.reinterpret())?.run {
        TreeNode(reinterpret())
    }

    /**
     * Gets the value stored at a particular tree node.
     *
     * @return the value at the node.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun `value`(): gpointer? = g_tree_node_value(gPointer.reinterpret())
}
