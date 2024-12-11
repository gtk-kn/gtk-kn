// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskClipNode
import org.gtkkn.native.gsk.gsk_clip_node_get_child
import org.gtkkn.native.gsk.gsk_clip_node_get_clip
import org.gtkkn.native.gsk.gsk_clip_node_get_type
import org.gtkkn.native.gsk.gsk_clip_node_new

/**
 * A render node applying a rectangular clip to its single child node.
 */
public open class ClipNode(pointer: CPointer<GskClipNode>) :
    RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskClipNodePointer: CPointer<GskClipNode>
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
        clip: Rect,
    ) : this(gsk_clip_node_new(child.gPointer.reinterpret(), clip.grapheneRectPointer.reinterpret())!!.reinterpret())

    /**
     * Gets the child node that is getting clipped by the given @node.
     *
     * @return The child that is getting clipped
     */
    public open fun getChild(): RenderNode = gsk_clip_node_get_child(gskClipNodePointer.reinterpret())!!.run {
        RenderNode(reinterpret())
    }

    /**
     * Retrieves the clip rectangle for @node.
     *
     * @return a clip rectangle
     */
    public open fun getClip(): Rect = gsk_clip_node_get_clip(gskClipNodePointer.reinterpret())!!.run {
        Rect(reinterpret())
    }

    public companion object : TypeCompanion<ClipNode> {
        override val type: GeneratedClassKGType<ClipNode> =
            GeneratedClassKGType(gsk_clip_node_get_type()) { ClipNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ClipNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_clip_node_get_type()
    }
}
