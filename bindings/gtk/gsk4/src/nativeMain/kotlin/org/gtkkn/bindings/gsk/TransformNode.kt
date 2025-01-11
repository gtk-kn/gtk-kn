// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskTransformNode
import org.gtkkn.native.gsk.gsk_transform_node_get_child
import org.gtkkn.native.gsk.gsk_transform_node_get_transform
import org.gtkkn.native.gsk.gsk_transform_node_get_type
import org.gtkkn.native.gsk.gsk_transform_node_new

/**
 * A render node applying a `GskTransform` to its single child node.
 */
public open class TransformNode(public val gskTransformNodePointer: CPointer<GskTransformNode>) :
    RenderNode(gskTransformNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a `GskRenderNode` that will transform the given @child
     * with the given @transform.
     *
     * @param child The node to transform
     * @param transform The transform to apply
     * @return A new `GskRenderNode`
     */
    public constructor(
        child: RenderNode,
        transform: Transform,
    ) : this(gsk_transform_node_new(child.gskRenderNodePointer, transform.gskTransformPointer)!!.reinterpret())

    /**
     * Gets the child node that is getting transformed by the given @node.
     *
     * @return The child that is getting transformed
     */
    public open fun getChild(): RenderNode = gsk_transform_node_get_child(gskTransformNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the `GskTransform` used by the @node.
     *
     * @return a `GskTransform`
     */
    public open fun getTransform(): Transform =
        gsk_transform_node_get_transform(gskTransformNodePointer.reinterpret())!!.run {
            Transform(this)
        }

    public companion object : TypeCompanion<TransformNode> {
        override val type: GeneratedClassKGType<TransformNode> =
            GeneratedClassKGType(gsk_transform_node_get_type()) { TransformNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of TransformNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_transform_node_get_type()
    }
}
