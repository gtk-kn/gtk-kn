// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTraverseType
import org.gtkkn.native.glib.GTraverseType.G_IN_ORDER
import org.gtkkn.native.glib.GTraverseType.G_LEVEL_ORDER
import org.gtkkn.native.glib.GTraverseType.G_POST_ORDER
import org.gtkkn.native.glib.GTraverseType.G_PRE_ORDER

/**
 * Specifies the type of traversal performed by g_tree_traverse(),
 * g_node_traverse() and g_node_find(). The different orders are
 * illustrated here:
 * - In order: A, B, C, D, E, F, G, H, I
 *   ![](Sorted_binary_tree_inorder.svg)
 * - Pre order: F, B, A, D, C, E, G, I, H
 *   ![](Sorted_binary_tree_preorder.svg)
 * - Post order: A, C, E, D, B, H, I, G, F
 *   ![](Sorted_binary_tree_postorder.svg)
 * - Level order: F, B, G, A, D, I, C, E, H
 *   ![](Sorted_binary_tree_breadth-first_traversal.svg)
 */
public enum class TraverseType(
    public val nativeValue: GTraverseType,
) {
    /**
     * vists a node's left child first, then the node itself,
     *              then its right child. This is the one to use if you
     *              want the output sorted according to the compare
     *              function.
     */
    IN_ORDER(G_IN_ORDER),

    /**
     * visits a node, then its children.
     */
    PRE_ORDER(G_PRE_ORDER),

    /**
     * visits the node's children, then the node itself.
     */
    POST_ORDER(G_POST_ORDER),

    /**
     * is not implemented for
     *              [balanced binary trees][glib-Balanced-Binary-Trees].
     *              For [n-ary trees][glib-N-ary-Trees], it
     *              vists the root node first, then its children, then
     *              its grandchildren, and so on. Note that this is less
     *              efficient than the other orders.
     */
    LEVEL_ORDER(G_LEVEL_ORDER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTraverseType): TraverseType =
            when (nativeValue) {
                G_IN_ORDER -> IN_ORDER
                G_PRE_ORDER -> PRE_ORDER
                G_POST_ORDER -> POST_ORDER
                G_LEVEL_ORDER -> LEVEL_ORDER
                else -> error("invalid nativeValue")
            }
    }
}
