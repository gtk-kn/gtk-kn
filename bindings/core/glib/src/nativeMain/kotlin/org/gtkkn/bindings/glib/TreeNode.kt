// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTreeNode
import org.gtkkn.native.glib.g_tree_node_key
import org.gtkkn.native.glib.g_tree_node_value
import org.gtkkn.native.glib.gpointer

/**
 * An opaque type which identifies a specific node in a #GTree.
 *
 * ## Skipped during bindings generation
 *
 * - method `next`: Return type TreeNode is unsupported
 * - method `previous`: Return type TreeNode is unsupported
 *
 * @since 2.68
 */
@GLibVersion2_68
public class TreeNode(pointer: CPointer<GTreeNode>) : ProxyInstance(pointer) {
    public val glibTreeNodePointer: CPointer<GTreeNode> = pointer

    /**
     * Gets the key stored at a particular tree node.
     *
     * @return the key at the node.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun key(): gpointer? = g_tree_node_key(glibTreeNodePointer.reinterpret())

    /**
     * Gets the value stored at a particular tree node.
     *
     * @return the value at the node.
     * @since 2.68
     */
    @GLibVersion2_68
    public fun `value`(): gpointer? = g_tree_node_value(glibTreeNodePointer.reinterpret())
}
