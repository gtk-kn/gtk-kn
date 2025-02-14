// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTraverseType

/**
 * Specifies the type of traversal performed by g_tree_traverse(),
 * g_node_traverse() and g_node_find().
 *
 * The different orders are illustrated here:
 *
 * - In order: A, B, C, D, E, F, G, H, I
 *   <picture>
 *     <source srcset="Sorted_binary_tree_inorder-dark.svg"
 *      media="(prefers-color-scheme: dark)">
 *     <img src="Sorted_binary_tree_inorder.svg"
 *      alt="Sorted binary tree, in-order traversal">
 *   </picture>
 * - Pre order: F, B, A, D, C, E, G, I, H
 *   <picture>
 *     <source srcset="Sorted_binary_tree_preorder-dark.svg"
 *      media="(prefers-color-scheme: dark)">
 *     <img src="Sorted_binary_tree_preorder.svg"
 *      alt="Sorted binary tree, pre-order traversal">
 *   </picture>
 * - Post order: A, C, E, D, B, H, I, G, F
 *   <picture>
 *     <source srcset="Sorted_binary_tree_postorder-dark.svg"
 *      media="(prefers-color-scheme: dark)">
 *     <img src="Sorted_binary_tree_postorder.svg"
 *      alt="Sorted binary tree, post-order traversal">
 *   </picture>
 * - Level order: F, B, G, A, D, I, C, E, H
 *   <picture>
 *     <source srcset="Sorted_binary_tree_breadth-first_traversal-dark.svg"
 *      media="(prefers-color-scheme: dark)">
 *     <img src="Sorted_binary_tree_breadth-first_traversal.svg"
 *      alt="Sorted binary tree, breadth-first level order traversal">
 *   </picture>
 */
public enum class TraverseType(public val nativeValue: GTraverseType) {
    /**
     * vists a node's left child first, then the node itself,
     *              then its right child. This is the one to use if you
     *              want the output sorted according to the compare
     *              function.
     */
    IN_ORDER(GTraverseType.G_IN_ORDER),

    /**
     * visits a node, then its children.
     */
    PRE_ORDER(GTraverseType.G_PRE_ORDER),

    /**
     * visits the node's children, then the node itself.
     */
    POST_ORDER(GTraverseType.G_POST_ORDER),

    /**
     * is not implemented for
     *              [balanced binary trees][glib-Balanced-Binary-Trees].
     *              For [n-ary trees][glib-N-ary-Trees], it
     *              vists the root node first, then its children, then
     *              its grandchildren, and so on. Note that this is less
     *              efficient than the other orders.
     */
    LEVEL_ORDER(GTraverseType.G_LEVEL_ORDER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTraverseType): TraverseType = when (nativeValue) {
            GTraverseType.G_IN_ORDER -> IN_ORDER
            GTraverseType.G_PRE_ORDER -> PRE_ORDER
            GTraverseType.G_POST_ORDER -> POST_ORDER
            GTraverseType.G_LEVEL_ORDER -> LEVEL_ORDER
            else -> error("invalid nativeValue")
        }
    }
}
