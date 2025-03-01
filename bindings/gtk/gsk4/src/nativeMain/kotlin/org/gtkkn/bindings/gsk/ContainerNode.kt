// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskContainerNode
import org.gtkkn.native.gsk.gsk_container_node_get_child
import org.gtkkn.native.gsk.gsk_container_node_get_n_children
import org.gtkkn.native.gsk.gsk_container_node_get_type

/**
 * A render node that can contain other render nodes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `children`: Array parameter of type RenderNode is not supported
 */
public open class ContainerNode(public val gskContainerNodePointer: CPointer<GskContainerNode>) :
    RenderNode(gskContainerNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Gets one of the children of @container.
     *
     * @param idx the position of the child to get
     * @return the @idx'th child of @container
     */
    public open fun getChild(idx: guint): RenderNode =
        gsk_container_node_get_child(gskContainerNodePointer.reinterpret(), idx)!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    /**
     * Retrieves the number of direct children of @node.
     *
     * @return the number of children of the `GskRenderNode`
     */
    public open fun getNChildren(): guint = gsk_container_node_get_n_children(gskContainerNodePointer.reinterpret())

    public companion object : TypeCompanion<ContainerNode> {
        override val type: GeneratedClassKGType<ContainerNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { ContainerNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ContainerNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_container_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_container_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_container_node_get_type")
    }
}
