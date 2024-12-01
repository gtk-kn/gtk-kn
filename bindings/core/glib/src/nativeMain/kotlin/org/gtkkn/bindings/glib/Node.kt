// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GNode
import org.gtkkn.native.glib.g_node_child_position
import org.gtkkn.native.glib.g_node_children_foreach
import org.gtkkn.native.glib.g_node_depth
import org.gtkkn.native.glib.g_node_destroy
import org.gtkkn.native.glib.g_node_is_ancestor
import org.gtkkn.native.glib.g_node_max_height
import org.gtkkn.native.glib.g_node_n_children
import org.gtkkn.native.glib.g_node_n_nodes
import org.gtkkn.native.glib.g_node_pop_allocator
import org.gtkkn.native.glib.g_node_reverse_children
import org.gtkkn.native.glib.g_node_traverse
import org.gtkkn.native.glib.g_node_unlink
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit

/**
 * The #GNode struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: gpointer
 * - parameter `allocator`: Allocator
 * - field `data`: gpointer
 */
public class Node(
    pointer: CPointer<GNode>,
) : Record {
    public val glibNodePointer: CPointer<GNode> = pointer

    /**
     * points to the node's next sibling (a sibling is another
     *        #GNode with the same parent).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val next: Node?
        get() =
            glibNodePointer.pointed.next?.run {
                Node(reinterpret())
            }

    /**
     * points to the node's previous sibling.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val prev: Node?
        get() =
            glibNodePointer.pointed.prev?.run {
                Node(reinterpret())
            }

    /**
     * points to the parent of the #GNode, or is null if the
     *          #GNode is the root of the tree.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val parent: Node?
        get() =
            glibNodePointer.pointed.parent?.run {
                Node(reinterpret())
            }

    /**
     * points to the first child of the #GNode.  The other
     *            children are accessed by using the @next pointer of each
     *            child.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val children: Node?
        get() =
            glibNodePointer.pointed.children?.run {
                Node(reinterpret())
            }

    /**
     * Gets the position of a #GNode with respect to its siblings.
     * @child must be a child of @node. The first child is numbered 0,
     * the second 1, and so on.
     *
     * @param child a child of @node
     * @return the position of @child with respect to its siblings
     */
    public fun childPosition(child: Node): Int =
        g_node_child_position(glibNodePointer.reinterpret(), child.glibNodePointer.reinterpret())

    /**
     * Calls a function for each of the children of a #GNode. Note that it
     * doesn't descend beneath the child nodes. @func must not do anything
     * that would modify the structure of the tree.
     *
     * @param flags which types of children are to be visited, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param func the function to call for each visited node
     */
    public fun childrenForeach(
        flags: TraverseFlags,
        func: NodeForeachFunc,
    ): Unit =
        g_node_children_foreach(
            glibNodePointer.reinterpret(),
            flags.mask,
            NodeForeachFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Gets the depth of a #GNode.
     *
     * If @node is null the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     *
     * @return the depth of the #GNode
     */
    public fun depth(): UInt = g_node_depth(glibNodePointer.reinterpret())

    /**
     * Removes @root and its children from the tree, freeing any memory
     * allocated.
     */
    public fun destroy(): Unit = g_node_destroy(glibNodePointer.reinterpret())

    /**
     * Returns true if @node is an ancestor of @descendant.
     * This is true if node is the parent of @descendant,
     * or if node is the grandparent of @descendant etc.
     *
     * @param descendant a #GNode
     * @return true if @node is an ancestor of @descendant
     */
    public fun isAncestor(descendant: Node): Boolean =
        g_node_is_ancestor(glibNodePointer.reinterpret(), descendant.glibNodePointer.reinterpret()).asBoolean()

    /**
     * Gets the maximum height of all branches beneath a #GNode.
     * This is the maximum distance from the #GNode to all leaf nodes.
     *
     * If @root is null, 0 is returned. If @root has no children,
     * 1 is returned. If @root has children, 2 is returned. And so on.
     *
     * @return the maximum height of the tree beneath @root
     */
    public fun maxHeight(): UInt = g_node_max_height(glibNodePointer.reinterpret())

    /**
     * Gets the number of children of a #GNode.
     *
     * @return the number of children of @node
     */
    public fun nChildren(): UInt = g_node_n_children(glibNodePointer.reinterpret())

    /**
     * Gets the number of nodes in a tree.
     *
     * @param flags which types of children are to be counted, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @return the number of nodes in the tree
     */
    public fun nNodes(flags: TraverseFlags): UInt = g_node_n_nodes(glibNodePointer.reinterpret(), flags.mask)

    /**
     * Reverses the order of the children of a #GNode.
     * (It doesn't change the order of the grandchildren.)
     */
    public fun reverseChildren(): Unit = g_node_reverse_children(glibNodePointer.reinterpret())

    /**
     * Traverses a tree starting at the given root #GNode.
     * It calls the given function for each node visited.
     * The traversal can be halted at any point by returning true from @func.
     * @func must not do anything that would modify the structure of the tree.
     *
     * @param order the order in which nodes are visited - %G_IN_ORDER,
     *     %G_PRE_ORDER, %G_POST_ORDER, or %G_LEVEL_ORDER.
     * @param flags which types of children are to be visited, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param maxDepth the maximum depth of the traversal. Nodes below this
     *     depth will not be visited. If max_depth is -1 all nodes in
     *     the tree are visited. If depth is 1, only the root is visited.
     *     If depth is 2, the root and its children are visited. And so on.
     * @param func the function to call for each visited #GNode
     */
    public fun traverse(
        order: TraverseType,
        flags: TraverseFlags,
        maxDepth: Int,
        func: NodeTraverseFunc,
    ): Unit =
        g_node_traverse(
            glibNodePointer.reinterpret(),
            order.nativeValue,
            flags.mask,
            maxDepth,
            NodeTraverseFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Unlinks a #GNode from a tree, resulting in two separate trees.
     */
    public fun unlink(): Unit = g_node_unlink(glibNodePointer.reinterpret())

    public companion object : RecordCompanion<Node, GNode> {
        public fun popAllocator(): Unit = g_node_pop_allocator()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Node = Node(pointer.reinterpret())
    }
}
