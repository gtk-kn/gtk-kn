// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskRoundedClipNode
import org.gtkkn.native.gsk.gsk_rounded_clip_node_get_child
import org.gtkkn.native.gsk.gsk_rounded_clip_node_get_clip
import org.gtkkn.native.gsk.gsk_rounded_clip_node_get_type
import org.gtkkn.native.gsk.gsk_rounded_clip_node_new

/**
 * A render node applying a rounded rectangle clip to its single child.
 */
public open class RoundedClipNode(
    pointer: CPointer<GskRoundedClipNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskRoundedClipNodePointer: CPointer<GskRoundedClipNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will clip the @child to the area
     * given by @clip.
     *
     * @param child The node to draw
     * @param clip The clip to apply
     * @return A new `GskRenderNode`
     */
    public constructor(
        child: RenderNode,
        clip: RoundedRect,
    ) : this(gsk_rounded_clip_node_new(child.gPointer.reinterpret(), clip.gskRoundedRectPointer)!!.reinterpret())

    /**
     * Gets the child node that is getting clipped by the given @node.
     *
     * @return The child that is getting clipped
     */
    public open fun getChild(): RenderNode =
        gsk_rounded_clip_node_get_child(gskRoundedClipNodePointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Retrieves the rounded rectangle used to clip the contents of the @node.
     *
     * @return a rounded rectangle
     */
    public open fun getClip(): RoundedRect =
        gsk_rounded_clip_node_get_clip(gskRoundedClipNodePointer.reinterpret())!!.run {
            RoundedRect(reinterpret())
        }

    public companion object : TypeCompanion<RoundedClipNode> {
        override val type: GeneratedClassKGType<RoundedClipNode> =
            GeneratedClassKGType(gsk_rounded_clip_node_get_type()) { RoundedClipNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
