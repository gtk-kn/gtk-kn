// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GTraverseFlags
import org.gtkkn.native.glib.G_TRAVERSE_ALL
import org.gtkkn.native.glib.G_TRAVERSE_LEAFS
import org.gtkkn.native.glib.G_TRAVERSE_LEAVES
import org.gtkkn.native.glib.G_TRAVERSE_MASK
import org.gtkkn.native.glib.G_TRAVERSE_NON_LEAFS
import org.gtkkn.native.glib.G_TRAVERSE_NON_LEAVES

/**
 * Specifies which nodes are visited during several of the tree
 * functions, including g_node_traverse() and g_node_find().
 */
public class TraverseFlags(public val mask: GTraverseFlags) : Bitfield<TraverseFlags> {
    override infix fun or(other: TraverseFlags): TraverseFlags = TraverseFlags(mask or other.mask)

    public companion object {
        /**
         * only leaf nodes should be visited. This name has
         *                     been introduced in 2.6, for older version use
         *                     %G_TRAVERSE_LEAFS.
         */
        public val LEAVES: TraverseFlags = TraverseFlags(G_TRAVERSE_LEAVES)

        /**
         * only non-leaf nodes should be visited. This
         *                         name has been introduced in 2.6, for older
         *                         version use %G_TRAVERSE_NON_LEAFS.
         */
        public val NON_LEAVES: TraverseFlags = TraverseFlags(G_TRAVERSE_NON_LEAVES)

        /**
         * all nodes should be visited.
         */
        public val ALL: TraverseFlags = TraverseFlags(G_TRAVERSE_ALL)

        /**
         * a mask of all traverse flags.
         */
        public val MASK: TraverseFlags = TraverseFlags(G_TRAVERSE_MASK)

        /**
         * identical to %G_TRAVERSE_LEAVES.
         */
        public val LEAFS: TraverseFlags = TraverseFlags(G_TRAVERSE_LEAFS)

        /**
         * identical to %G_TRAVERSE_NON_LEAVES.
         */
        public val NON_LEAFS: TraverseFlags = TraverseFlags(G_TRAVERSE_NON_LEAFS)
    }
}
