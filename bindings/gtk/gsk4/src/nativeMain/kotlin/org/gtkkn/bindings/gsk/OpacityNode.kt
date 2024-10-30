// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskOpacityNode
import org.gtkkn.native.gsk.gsk_opacity_node_get_child
import org.gtkkn.native.gsk.gsk_opacity_node_get_opacity
import org.gtkkn.native.gsk.gsk_opacity_node_get_type
import org.gtkkn.native.gsk.gsk_opacity_node_new
import kotlin.Float

/**
 * A render node controlling the opacity of its single child node.
 */
public open class OpacityNode(
    pointer: CPointer<GskOpacityNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskOpacityNodePointer: CPointer<GskOpacityNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will drawn the @child with reduced
     * @opacity.
     *
     * @param child The node to draw
     * @param opacity The opacity to apply
     * @return A new `GskRenderNode`
     */
    public constructor(
        child: RenderNode,
        opacity: Float,
    ) : this(gsk_opacity_node_new(child.gPointer.reinterpret(), opacity)!!.reinterpret())

    /**
     * Gets the child node that is getting opacityed by the given @node.
     *
     * @return The child that is getting opacityed
     */
    public open fun getChild(): RenderNode =
        gsk_opacity_node_get_child(gskOpacityNodePointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Gets the transparency factor for an opacity node.
     *
     * @return the opacity factor
     */
    public open fun getOpacity(): Float = gsk_opacity_node_get_opacity(gskOpacityNodePointer.reinterpret())

    public companion object : TypeCompanion<OpacityNode> {
        override val type: GeneratedClassKGType<OpacityNode> =
            GeneratedClassKGType(gsk_opacity_node_get_type()) { OpacityNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
