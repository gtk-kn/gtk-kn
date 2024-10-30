// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskContainerNode
import org.gtkkn.native.gsk.gsk_container_node_get_child
import org.gtkkn.native.gsk.gsk_container_node_get_n_children
import org.gtkkn.native.gsk.gsk_container_node_get_type
import kotlin.UInt

/**
 * A render node that can contain other render nodes.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `children`: Array parameter of type RenderNode is not supported
 */
public open class ContainerNode(
    pointer: CPointer<GskContainerNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskContainerNodePointer: CPointer<GskContainerNode>
        get() = gPointer.reinterpret()

    /**
     * Gets one of the children of @container.
     *
     * @param idx the position of the child to get
     * @return the @idx'th child of @container
     */
    public open fun getChild(idx: UInt): RenderNode =
        gsk_container_node_get_child(gskContainerNodePointer.reinterpret(), idx)!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Retrieves the number of direct children of @node.
     *
     * @return the number of children of the `GskRenderNode`
     */
    public open fun getNChildren(): UInt = gsk_container_node_get_n_children(gskContainerNodePointer.reinterpret())

    public companion object : TypeCompanion<ContainerNode> {
        override val type: GeneratedClassKGType<ContainerNode> =
            GeneratedClassKGType(gsk_container_node_get_type()) { ContainerNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}