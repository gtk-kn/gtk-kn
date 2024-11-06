// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskSubsurfaceNode
import org.gtkkn.native.gsk.gsk_subsurface_node_get_child
import org.gtkkn.native.gsk.gsk_subsurface_node_get_type

/**
 * A render node that potentially diverts a part of the scene graph to a subsurface.
 * @since 4.14
 */
@GskVersion4_14
public open class SubsurfaceNode(
    pointer: CPointer<GskSubsurfaceNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskSubsurfaceNodePointer: CPointer<GskSubsurfaceNode>
        get() = gPointer.reinterpret()

    /**
     * Gets the child node that is getting drawn by the given @node.
     *
     * @return the child `GskRenderNode`
     * @since 4.14
     */
    @GskVersion4_14
    public open fun getChild(): RenderNode =
        gsk_subsurface_node_get_child(gskSubsurfaceNodePointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    public companion object : TypeCompanion<SubsurfaceNode> {
        override val type: GeneratedClassKGType<SubsurfaceNode> =
            GeneratedClassKGType(gsk_subsurface_node_get_type()) { SubsurfaceNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
