// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_4
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GNode
import org.gtkkn.native.glib.g_node_child_index
import org.gtkkn.native.glib.g_node_child_position
import org.gtkkn.native.glib.g_node_children_foreach
import org.gtkkn.native.glib.g_node_copy
import org.gtkkn.native.glib.g_node_copy_deep
import org.gtkkn.native.glib.g_node_depth
import org.gtkkn.native.glib.g_node_destroy
import org.gtkkn.native.glib.g_node_find
import org.gtkkn.native.glib.g_node_find_child
import org.gtkkn.native.glib.g_node_first_sibling
import org.gtkkn.native.glib.g_node_get_root
import org.gtkkn.native.glib.g_node_insert
import org.gtkkn.native.glib.g_node_insert_after
import org.gtkkn.native.glib.g_node_insert_before
import org.gtkkn.native.glib.g_node_is_ancestor
import org.gtkkn.native.glib.g_node_last_child
import org.gtkkn.native.glib.g_node_last_sibling
import org.gtkkn.native.glib.g_node_max_height
import org.gtkkn.native.glib.g_node_n_children
import org.gtkkn.native.glib.g_node_n_nodes
import org.gtkkn.native.glib.g_node_new
import org.gtkkn.native.glib.g_node_nth_child
import org.gtkkn.native.glib.g_node_pop_allocator
import org.gtkkn.native.glib.g_node_prepend
import org.gtkkn.native.glib.g_node_push_allocator
import org.gtkkn.native.glib.g_node_reverse_children
import org.gtkkn.native.glib.g_node_traverse
import org.gtkkn.native.glib.g_node_unlink
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The #GNode struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 */
public class Node(public val glibNodePointer: CPointer<GNode>) : ProxyInstance(glibNodePointer) {
    /**
     * contains the actual data of the node.
     */
    public var `data`: gpointer
        get() = glibNodePointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            glibNodePointer.pointed.data = value
        }

    /**
     * points to the node's next sibling (a sibling is another
     *        #GNode with the same parent).
     */
    public var next: Node?
        get() = glibNodePointer.pointed.next?.run {
            Node(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibNodePointer.pointed.next = value?.glibNodePointer
        }

    /**
     * points to the node's previous sibling.
     */
    public var prev: Node?
        get() = glibNodePointer.pointed.prev?.run {
            Node(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibNodePointer.pointed.prev = value?.glibNodePointer
        }

    /**
     * points to the parent of the #GNode, or is null if the
     *          #GNode is the root of the tree.
     */
    public var parent: Node?
        get() = glibNodePointer.pointed.parent?.run {
            Node(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibNodePointer.pointed.parent = value?.glibNodePointer
        }

    /**
     * points to the first child of the #GNode.  The other
     *            children are accessed by using the @next pointer of each
     *            child.
     */
    public var children: Node?
        get() = glibNodePointer.pointed.children?.run {
            Node(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibNodePointer.pointed.children = value?.glibNodePointer
        }

    /**
     * Allocate a new Node.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GNode>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Node using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GNode>().ptr)

    /**
     * Allocate a new Node.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data contains the actual data of the node.
     * @param next points to the node's next sibling (a sibling is another
     *        #GNode with the same parent).
     * @param prev points to the node's previous sibling.
     * @param parent points to the parent of the #GNode, or is null if the
     *          #GNode is the root of the tree.
     * @param children points to the first child of the #GNode.  The other
     *            children are accessed by using the @next pointer of each
     *            child.
     */
    public constructor(
        `data`: gpointer,
        next: Node?,
        prev: Node?,
        parent: Node?,
        children: Node?,
    ) : this() {
        this.data = data
        this.next = next
        this.prev = prev
        this.parent = parent
        this.children = children
    }

    /**
     * Allocate a new Node using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data contains the actual data of the node.
     * @param next points to the node's next sibling (a sibling is another
     *        #GNode with the same parent).
     * @param prev points to the node's previous sibling.
     * @param parent points to the parent of the #GNode, or is null if the
     *          #GNode is the root of the tree.
     * @param children points to the first child of the #GNode.  The other
     *            children are accessed by using the @next pointer of each
     *            child.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: gpointer,
        next: Node?,
        prev: Node?,
        parent: Node?,
        children: Node?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.next = next
        this.prev = prev
        this.parent = parent
        this.children = children
    }

    /**
     * Gets the position of the first child of a #GNode
     * which contains the given data.
     *
     * @param data the data to find
     * @return the index of the child of @node which contains
     *     @data, or -1 if the data is not found
     */
    public fun childIndex(`data`: gpointer? = null): gint = g_node_child_index(glibNodePointer, `data`)

    /**
     * Gets the position of a #GNode with respect to its siblings.
     * @child must be a child of @node. The first child is numbered 0,
     * the second 1, and so on.
     *
     * @param child a child of @node
     * @return the position of @child with respect to its siblings
     */
    public fun childPosition(child: Node): gint = g_node_child_position(glibNodePointer, child.glibNodePointer)

    /**
     * Calls a function for each of the children of a #GNode. Note that it
     * doesn't descend beneath the child nodes. @func must not do anything
     * that would modify the structure of the tree.
     *
     * @param flags which types of children are to be visited, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param func the function to call for each visited node
     */
    public fun childrenForeach(flags: TraverseFlags, func: NodeForeachFunc): Unit = g_node_children_foreach(
        glibNodePointer,
        flags.mask,
        NodeForeachFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Recursively copies a #GNode (but does not deep-copy the data inside the
     * nodes, see g_node_copy_deep() if you need that).
     *
     * @return a new #GNode containing the same data pointers
     */
    public fun copy(): Node = g_node_copy(glibNodePointer)!!.run {
        Node(this)
    }

    /**
     * Recursively copies a #GNode and its data.
     *
     * @param copyFunc the function which is called to copy the data
     *   inside each node, or null to use the original data.
     * @return a new #GNode containing copies of the data in @node.
     * @since 2.4
     */
    @GLibVersion2_4
    public fun copyDeep(copyFunc: CopyFunc): Node =
        g_node_copy_deep(glibNodePointer, CopyFuncFunc.reinterpret(), StableRef.create(copyFunc).asCPointer())!!.run {
            Node(this)
        }

    /**
     * Gets the depth of a #GNode.
     *
     * If @node is null the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     *
     * @return the depth of the #GNode
     */
    public fun depth(): guint = g_node_depth(glibNodePointer)

    /**
     * Removes @root and its children from the tree, freeing any memory
     * allocated.
     */
    public fun destroy(): Unit = g_node_destroy(glibNodePointer)

    /**
     * Finds a #GNode in a tree.
     *
     * @param order the order in which nodes are visited - %G_IN_ORDER,
     *     %G_PRE_ORDER, %G_POST_ORDER, or %G_LEVEL_ORDER
     * @param flags which types of children are to be searched, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param data the data to find
     * @return the found #GNode, or null if the data is not found
     */
    public fun find(order: TraverseType, flags: TraverseFlags, `data`: gpointer? = null): Node =
        g_node_find(glibNodePointer, order.nativeValue, flags.mask, `data`)!!.run {
            Node(this)
        }

    /**
     * Finds the first child of a #GNode with the given data.
     *
     * @param flags which types of children are to be searched, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param data the data to find
     * @return the found child #GNode, or null if the data is not found
     */
    public fun findChild(flags: TraverseFlags, `data`: gpointer? = null): Node =
        g_node_find_child(glibNodePointer, flags.mask, `data`)!!.run {
            Node(this)
        }

    /**
     * Gets the first sibling of a #GNode.
     * This could possibly be the node itself.
     *
     * @return the first sibling of @node
     */
    public fun firstSibling(): Node = g_node_first_sibling(glibNodePointer)!!.run {
        Node(this)
    }

    /**
     * Gets the root of a tree.
     *
     * @return the root of the tree
     */
    public fun getRoot(): Node = g_node_get_root(glibNodePointer)!!.run {
        Node(this)
    }

    /**
     * Inserts a #GNode beneath the parent at the given position.
     *
     * @param position the position to place @node at, with respect to its siblings
     *     If position is -1, @node is inserted as the last child of @parent
     * @param node the #GNode to insert
     * @return the inserted #GNode
     */
    public fun insert(position: gint, node: Node): Node =
        g_node_insert(glibNodePointer, position, node.glibNodePointer)!!.run {
            Node(this)
        }

    /**
     * Inserts a #GNode beneath the parent after the given sibling.
     *
     * @param sibling the sibling #GNode to place @node after.
     *     If sibling is null, the node is inserted as the first child of @parent.
     * @param node the #GNode to insert
     * @return the inserted #GNode
     */
    public fun insertAfter(sibling: Node, node: Node): Node =
        g_node_insert_after(glibNodePointer, sibling.glibNodePointer, node.glibNodePointer)!!.run {
            Node(this)
        }

    /**
     * Inserts a #GNode beneath the parent before the given sibling.
     *
     * @param sibling the sibling #GNode to place @node before.
     *     If sibling is null, the node is inserted as the last child of @parent.
     * @param node the #GNode to insert
     * @return the inserted #GNode
     */
    public fun insertBefore(sibling: Node, node: Node): Node =
        g_node_insert_before(glibNodePointer, sibling.glibNodePointer, node.glibNodePointer)!!.run {
            Node(this)
        }

    /**
     * Returns true if @node is an ancestor of @descendant.
     * This is true if node is the parent of @descendant,
     * or if node is the grandparent of @descendant etc.
     *
     * @param descendant a #GNode
     * @return true if @node is an ancestor of @descendant
     */
    public fun isAncestor(descendant: Node): Boolean =
        g_node_is_ancestor(glibNodePointer, descendant.glibNodePointer).asBoolean()

    /**
     * Gets the last child of a #GNode.
     *
     * @return the last child of @node, or null if @node has no children
     */
    public fun lastChild(): Node = g_node_last_child(glibNodePointer)!!.run {
        Node(this)
    }

    /**
     * Gets the last sibling of a #GNode.
     * This could possibly be the node itself.
     *
     * @return the last sibling of @node
     */
    public fun lastSibling(): Node = g_node_last_sibling(glibNodePointer)!!.run {
        Node(this)
    }

    /**
     * Gets the maximum height of all branches beneath a #GNode.
     * This is the maximum distance from the #GNode to all leaf nodes.
     *
     * If @root is null, 0 is returned. If @root has no children,
     * 1 is returned. If @root has children, 2 is returned. And so on.
     *
     * @return the maximum height of the tree beneath @root
     */
    public fun maxHeight(): guint = g_node_max_height(glibNodePointer)

    /**
     * Gets the number of children of a #GNode.
     *
     * @return the number of children of @node
     */
    public fun nChildren(): guint = g_node_n_children(glibNodePointer)

    /**
     * Gets the number of nodes in a tree.
     *
     * @param flags which types of children are to be counted, one of
     *     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @return the number of nodes in the tree
     */
    public fun nNodes(flags: TraverseFlags): guint = g_node_n_nodes(glibNodePointer, flags.mask)

    /**
     * Gets a child of a #GNode, using the given index.
     * The first child is at index 0. If the index is
     * too big, null is returned.
     *
     * @param n the index of the desired child
     * @return the child of @node at index @n
     */
    public fun nthChild(n: guint): Node = g_node_nth_child(glibNodePointer, n)!!.run {
        Node(this)
    }

    /**
     * Inserts a #GNode as the first child of the given parent.
     *
     * @param node the #GNode to insert
     * @return the inserted #GNode
     */
    public fun prepend(node: Node): Node = g_node_prepend(glibNodePointer, node.glibNodePointer)!!.run {
        Node(this)
    }

    /**
     * Reverses the order of the children of a #GNode.
     * (It doesn't change the order of the grandchildren.)
     */
    public fun reverseChildren(): Unit = g_node_reverse_children(glibNodePointer)

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
    public fun traverse(order: TraverseType, flags: TraverseFlags, maxDepth: gint, func: NodeTraverseFunc): Unit =
        g_node_traverse(
            glibNodePointer,
            order.nativeValue,
            flags.mask,
            maxDepth,
            NodeTraverseFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )

    /**
     * Unlinks a #GNode from a tree, resulting in two separate trees.
     */
    public fun unlink(): Unit = g_node_unlink(glibNodePointer)

    override fun toString(): String = "Node(data=$data, next=$next, prev=$prev, parent=$parent, children=$children)"

    public companion object {
        /**
         * Creates a new #GNode containing the given data.
         * Used to create the first node in a tree.
         *
         * @param data the data of the new node
         * @return a new #GNode
         */
        public fun new(`data`: gpointer? = null): Node = g_node_new(`data`)!!.run {
            Node(this)
        }

        public fun popAllocator(): Unit = g_node_pop_allocator()

        public fun pushAllocator(allocator: Allocator): Unit = g_node_push_allocator(allocator.glibAllocatorPointer)
    }
}
